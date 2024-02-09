package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ai0  reason: default package */
/* loaded from: classes.dex */
public final class ai0 implements Comparable<ai0> {
    public static final ai0 f = bi0.a();
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public ai0(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = b(i, i2, i3);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ai0 ai0Var) {
        yl0.e(ai0Var, C0059ao.a(9722));
        return this.e - ai0Var.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
        if ((r7 >= 0 && r7 < 256) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1 = 1
            r2 = 0
            if (r5 < 0) goto La
            if (r5 >= r0) goto La
            r3 = r1
            goto Lb
        La:
            r3 = r2
        Lb:
            if (r3 == 0) goto L20
            if (r6 < 0) goto L13
            if (r6 >= r0) goto L13
            r3 = r1
            goto L14
        L13:
            r3 = r2
        L14:
            if (r3 == 0) goto L20
            if (r7 < 0) goto L1c
            if (r7 >= r0) goto L1c
            r0 = r1
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 == 0) goto L2a
            int r5 = r5 << 16
            int r6 = r6 << 8
            int r5 = r5 + r6
            int r5 = r5 + r7
            return r5
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 9723(0x25fb, float:1.3625E-41)
            java.lang.String r1 = myunmn.C0059ao.a(r1)
            r0.append(r1)
            r0.append(r5)
            r5 = 46
            r0.append(r5)
            r0.append(r6)
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai0.b(int, int, int):int");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ai0 ai0Var = obj instanceof ai0 ? (ai0) obj : null;
        return ai0Var != null && this.e == ai0Var.e;
    }

    public int hashCode() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        sb.append('.');
        sb.append(this.d);
        return sb.toString();
    }
}
