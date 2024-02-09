package okhttp3.logging.internal;

import java.io.EOFException;
import myunmn.C0059ao;
import okio.Buffer;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(Buffer buffer) {
        yl0.e(buffer, C0059ao.a(12530));
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, tm0.d(buffer.size(), 64L));
            for (int i = 0; i < 16; i++) {
                if (buffer2.exhausted()) {
                    return true;
                }
                int readUtf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(readUtf8CodePoint) && !Character.isWhitespace(readUtf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
