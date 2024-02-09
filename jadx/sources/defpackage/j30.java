package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: j30  reason: default package */
/* loaded from: classes.dex */
public final class j30 extends l30 {
    public final short c;
    public final short d;

    public j30(l30 l30Var, int i, int i2) {
        super(l30Var);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.l30
    public void c(m30 m30Var, byte[] bArr) {
        m30Var.c(this.c, this.d);
    }

    public String toString() {
        short s = this.c;
        short s2 = this.d;
        int i = (s & ((1 << s2) - 1)) | (1 << s2);
        return C0059ao.a(11290) + Integer.toBinaryString(i | (1 << this.d)).substring(1) + '>';
    }
}
