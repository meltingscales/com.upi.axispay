package defpackage;

/* compiled from: AxisPay */
/* renamed from: c50  reason: default package */
/* loaded from: classes.dex */
public final class c50 {
    public final byte[] a;
    public int b = 0;

    public c50(int i) {
        this.a = new byte[i];
    }

    public void a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.b;
            this.b = i3 + 1;
            c(i3, z);
        }
    }

    public byte[] b(int i) {
        int length = this.a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.a[i2 / i];
        }
        return bArr;
    }

    public final void c(int i, boolean z) {
        this.a[i] = z ? (byte) 1 : (byte) 0;
    }
}
