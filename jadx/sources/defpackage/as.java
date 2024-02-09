package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: as  reason: default package */
/* loaded from: classes.dex */
public final class as implements hr<ws> {
    public final wh0<zu> a;

    public as(wh0<zu> wh0Var) {
        this.a = wh0Var;
    }

    public static ws a(zu zuVar) {
        ws a = zr.a(zuVar);
        jr.c(a, C0059ao.a(1277));
        return a;
    }

    public static as b(wh0<zu> wh0Var) {
        return new as(wh0Var);
    }

    @Override // defpackage.wh0
    /* renamed from: c */
    public ws get() {
        return a(this.a.get());
    }
}
