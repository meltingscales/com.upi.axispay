package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import myunmn.C0059ao;
import okio.Buffer;
import okio.ByteString;
import okio.DeflaterSink;
import okio.Sink;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class MessageDeflater implements Closeable {
    private final Buffer deflatedBytes;
    private final Deflater deflater;
    private final DeflaterSink deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        Buffer buffer = new Buffer();
        this.deflatedBytes = buffer;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((Sink) buffer, deflater);
    }

    private final boolean endsWith(Buffer buffer, ByteString byteString) {
        return buffer.rangeEquals(buffer.size() - byteString.size(), byteString);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(Buffer buffer) throws IOException {
        ByteString byteString;
        yl0.e(buffer, C0059ao.a(14182));
        if (this.deflatedBytes.size() == 0) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(buffer, buffer.size());
            this.deflaterSink.flush();
            Buffer buffer2 = this.deflatedBytes;
            byteString = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            if (endsWith(buffer2, byteString)) {
                long size = this.deflatedBytes.size() - 4;
                Buffer.UnsafeCursor readAndWriteUnsafe$default = Buffer.readAndWriteUnsafe$default(this.deflatedBytes, null, 1, null);
                try {
                    readAndWriteUnsafe$default.resizeBuffer(size);
                    pk0.a(readAndWriteUnsafe$default, null);
                } finally {
                }
            } else {
                this.deflatedBytes.writeByte(0);
            }
            Buffer buffer3 = this.deflatedBytes;
            buffer.write(buffer3, buffer3.size());
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(14183).toString());
    }
}
