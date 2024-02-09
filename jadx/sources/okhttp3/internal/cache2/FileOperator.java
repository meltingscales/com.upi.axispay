package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import myunmn.C0059ao;
import okio.Buffer;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        yl0.e(fileChannel, C0059ao.a(13403));
        this.fileChannel = fileChannel;
    }

    public final void read(long j, Buffer buffer, long j2) {
        yl0.e(buffer, C0059ao.a(13404));
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferTo = this.fileChannel.transferTo(j, j2, buffer);
            j += transferTo;
            j2 -= transferTo;
        }
    }

    public final void write(long j, Buffer buffer, long j2) throws IOException {
        yl0.e(buffer, C0059ao.a(13405));
        if (j2 < 0 || j2 > buffer.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferFrom = this.fileChannel.transferFrom(buffer, j, j2);
            j += transferFrom;
            j2 -= transferFrom;
        }
    }
}
