package okhttp3.internal.ws;

import com.google.android.gms.vision.barcode.Barcode;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final Buffer controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final Buffer messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final BufferedSource source;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;

        void onReadMessage(ByteString byteString) throws IOException;

        void onReadPing(ByteString byteString);

        void onReadPong(ByteString byteString);
    }

    public WebSocketReader(boolean z, BufferedSource bufferedSource, FrameCallback frameCallback, boolean z2, boolean z3) {
        yl0.e(bufferedSource, C0059ao.a(846));
        yl0.e(frameCallback, C0059ao.a(847));
        this.isClient = z;
        this.source = bufferedSource;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.controlFrameBuffer = new Buffer();
        this.messageFrameBuffer = new Buffer();
        this.maskKey = z ? null : new byte[4];
        this.maskCursor = z ? null : new Buffer.UnsafeCursor();
    }

    private final void readControlFrame() throws IOException {
        String a;
        long j = this.frameLength;
        if (j > 0) {
            this.source.readFully(this.controlFrameBuffer, j);
            if (!this.isClient) {
                Buffer buffer = this.controlFrameBuffer;
                Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                yl0.c(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                this.maskCursor.seek(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                Buffer.UnsafeCursor unsafeCursor2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                yl0.c(bArr);
                webSocketProtocol.toggleMask(unsafeCursor2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long size = this.controlFrameBuffer.size();
                if (size != 1) {
                    if (size != 0) {
                        s = this.controlFrameBuffer.readShort();
                        a = this.controlFrameBuffer.readUtf8();
                        String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        a = C0059ao.a(849);
                    }
                    this.frameCallback.onReadClose(s, a);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException(C0059ao.a(850));
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.readByteString());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.readByteString());
                return;
            default:
                throw new ProtocolException(C0059ao.a(848) + Util.toHexString(this.opcode));
        }
    }

    private final void readHeader() throws IOException, ProtocolException {
        boolean z;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int and = Util.and(this.source.readByte(), 255);
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                int i = and & 15;
                this.opcode = i;
                boolean z2 = (and & Barcode.ITF) != 0;
                this.isFinalFrame = z2;
                boolean z3 = (and & 8) != 0;
                this.isControlFrame = z3;
                if (z3 && !z2) {
                    throw new ProtocolException(C0059ao.a(851));
                }
                boolean z4 = (and & 64) != 0;
                String a = C0059ao.a(852);
                if (i == 1 || i == 2) {
                    if (!z4) {
                        z = false;
                    } else if (!this.perMessageDeflate) {
                        throw new ProtocolException(a);
                    } else {
                        z = true;
                    }
                    this.readingCompressedMessage = z;
                } else if (z4) {
                    throw new ProtocolException(a);
                }
                if ((and & 32) != 0) {
                    throw new ProtocolException(C0059ao.a(859));
                }
                if (!((and & 16) != 0)) {
                    int and2 = Util.and(this.source.readByte(), 255);
                    boolean z5 = (and2 & Barcode.ITF) != 0;
                    if (z5 == this.isClient) {
                        throw new ProtocolException(this.isClient ? C0059ao.a(853) : C0059ao.a(854));
                    }
                    long j = and2 & 127;
                    this.frameLength = j;
                    if (j == 126) {
                        this.frameLength = Util.and(this.source.readShort(), 65535);
                    } else if (j == 127) {
                        long readLong = this.source.readLong();
                        this.frameLength = readLong;
                        if (readLong < 0) {
                            throw new ProtocolException(C0059ao.a(855) + Util.toHexString(this.frameLength) + C0059ao.a(856));
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException(C0059ao.a(857));
                    }
                    if (z5) {
                        BufferedSource bufferedSource = this.source;
                        byte[] bArr = this.maskKey;
                        yl0.c(bArr);
                        bufferedSource.readFully(bArr);
                        return;
                    }
                    return;
                }
                throw new ProtocolException(C0059ao.a(858));
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException(C0059ao.a(860));
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.readFully(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    Buffer buffer = this.messageFrameBuffer;
                    Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                    yl0.c(unsafeCursor);
                    buffer.readAndWriteUnsafe(unsafeCursor);
                    this.maskCursor.seek(this.messageFrameBuffer.size() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    Buffer.UnsafeCursor unsafeCursor2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    yl0.c(bArr);
                    webSocketProtocol.toggleMask(unsafeCursor2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException(C0059ao.a(861) + Util.toHexString(this.opcode));
            }
        }
        throw new IOException(C0059ao.a(862));
    }

    private final void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException(C0059ao.a(863) + Util.toHexString(i));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.readUtf8());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.readByteString());
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            }
            readControlFrame();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final BufferedSource getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
