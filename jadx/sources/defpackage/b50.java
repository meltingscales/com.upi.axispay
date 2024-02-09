package defpackage;

import java.lang.reflect.Array;

/* compiled from: AxisPay */
/* renamed from: b50  reason: default package */
/* loaded from: classes.dex */
public final class b50 {
    public final c50[] a;
    public int b;
    public final int c;
    public final int d;

    public b50(int i, int i2) {
        c50[] c50VarArr = new c50[i];
        this.a = c50VarArr;
        int length = c50VarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.a[i3] = new c50(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    public c50 a() {
        return this.a[this.b];
    }

    public byte[][] b(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, this.c * i2, this.d * i);
        int i3 = this.c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.a[i4 / i2].b(i);
        }
        return bArr;
    }

    public void c() {
        this.b++;
    }
}
