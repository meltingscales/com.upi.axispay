package defpackage;

import com.google.android.gms.vision.barcode.Barcode;
import java.io.Writer;

/* compiled from: AxisPay */
/* renamed from: oe  reason: default package */
/* loaded from: classes.dex */
public final class oe extends Writer {
    public final String b;
    public StringBuilder c = new StringBuilder((int) Barcode.ITF);

    public oe(String str) {
        this.b = str;
    }

    public final void b() {
        if (this.c.length() > 0) {
            this.c.toString();
            StringBuilder sb = this.c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                b();
            } else {
                this.c.append(c);
            }
        }
    }
}
