package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: g30  reason: default package */
/* loaded from: classes.dex */
public final class g30 extends l30 {
    public final short c;
    public final short d;

    public g30(l30 l30Var, int i, int i2) {
        super(l30Var);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.l30
    public void c(m30 m30Var, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                m30Var.c(31, 5);
                short s2 = this.d;
                if (s2 > 62) {
                    m30Var.c(s2 - 31, 16);
                } else if (i == 0) {
                    m30Var.c(Math.min((int) s2, 31), 5);
                } else {
                    m30Var.c(s2 - 31, 5);
                }
            }
            m30Var.c(bArr[this.c + i], 8);
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(C0059ao.a(5358));
        sb.append((int) this.c);
        sb.append(C0059ao.a(5359));
        sb.append((this.c + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
