package okhttp3.internal.ws;

import com.google.android.gms.vision.barcode.Barcode;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import myunmn.C0059ao;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final Buffer messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final BufferedSink sink;
    private final Buffer sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, BufferedSink bufferedSink, Random random, boolean z2, boolean z3, long j) {
        yl0.e(bufferedSink, C0059ao.a(6169));
        yl0.e(random, C0059ao.a(6170));
        this.isClient = z;
        this.sink = bufferedSink;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.messageBuffer = new Buffer();
        this.sinkBuffer = bufferedSink.getBuffer();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new Buffer.UnsafeCursor() : null;
    }

    private final void writeControlFrame(int i, ByteString byteString) throws IOException {
        if (!this.writerClosed) {
            int size = byteString.size();
            if (((long) size) <= 125) {
                this.sinkBuffer.writeByte(i | Barcode.ITF);
                if (this.isClient) {
                    this.sinkBuffer.writeByte(size | Barcode.ITF);
                    Random random = this.random;
                    byte[] bArr = this.maskKey;
                    yl0.c(bArr);
                    random.nextBytes(bArr);
                    this.sinkBuffer.write(this.maskKey);
                    if (size > 0) {
                        long size2 = this.sinkBuffer.size();
                        this.sinkBuffer.write(byteString);
                        Buffer buffer = this.sinkBuffer;
                        Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                        yl0.c(unsafeCursor);
                        buffer.readAndWriteUnsafe(unsafeCursor);
                        this.maskCursor.seek(size2);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.writeByte(size);
                    this.sinkBuffer.write(byteString);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException(C0059ao.a(6171).toString());
        }
        throw new IOException(C0059ao.a(6172));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final BufferedSink getSink() {
        return this.sink;
    }

    public final void writeClose(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            writeControlFrame(8, byteString2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, ByteString byteString) throws IOException {
        yl0.e(byteString, C0059ao.a(6173));
        if (!this.writerClosed) {
            this.messageBuffer.write(byteString);
            int i2 = Barcode.ITF;
            int i3 = i | Barcode.ITF;
            if (this.perMessageDeflate && byteString.size() >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater = this.messageDeflater;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater;
                }
                messageDeflater.deflate(this.messageBuffer);
                i3 |= 64;
            }
            long size = this.messageBuffer.size();
            this.sinkBuffer.writeByte(i3);
            if (!this.isClient) {
                i2 = 0;
            }
            if (size <= 125) {
                this.sinkBuffer.writeByte(((int) size) | i2);
            } else if (size <= 65535) {
                this.sinkBuffer.writeByte(i2 | 126);
                this.sinkBuffer.writeShort((int) size);
            } else {
                this.sinkBuffer.writeByte(i2 | 127);
                this.sinkBuffer.writeLong(size);
            }
            if (this.isClient) {
                Random random = this.random;
                byte[] bArr = this.maskKey;
                yl0.c(bArr);
                random.nextBytes(bArr);
                this.sinkBuffer.write(this.maskKey);
                if (size > 0) {
                    Buffer buffer = this.messageBuffer;
                    Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                    yl0.c(unsafeCursor);
                    buffer.readAndWriteUnsafe(unsafeCursor);
                    this.maskCursor.seek(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, size);
            this.sink.emit();
            return;
        }
        throw new IOException(C0059ao.a(6174));
    }

    public final void writePing(ByteString byteString) throws IOException {
        yl0.e(byteString, C0059ao.a(6175));
        writeControlFrame(9, byteString);
    }

    public final void writePong(ByteString byteString) throws IOException {
        yl0.e(byteString, C0059ao.a(6176));
        writeControlFrame(10, byteString);
    }
}
