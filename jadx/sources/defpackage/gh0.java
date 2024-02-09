package defpackage;

import myunmn.C0059ao;
import myunmn.C0068ax;
import myunmn.C0082m;
import myunmn.EnumC0050af;
import myunmn.I;
import myunmn.InterfaceC0075f;
import myunmn.L;
import myunmn.aQ;
import myunmn.aV;

/* compiled from: AxisPay */
/* renamed from: gh0  reason: default package */
/* loaded from: classes.dex */
public final class gh0 implements InterfaceC0075f {
    public final fh0 a;

    /* compiled from: AxisPay */
    /* renamed from: gh0$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0050af.values().length];
            iArr[EnumC0050af.a.ordinal()] = 1;
            iArr[EnumC0050af.i.ordinal()] = 2;
            iArr[EnumC0050af.b.ordinal()] = 3;
            iArr[EnumC0050af.c.ordinal()] = 4;
            iArr[EnumC0050af.r.ordinal()] = 5;
            a = iArr;
        }
    }

    public gh0(fh0 fh0Var) {
        yl0.e(fh0Var, C0059ao.a(6765));
        this.a = fh0Var;
    }

    @Override // myunmn.InterfaceC0075f
    public void a(aQ aQVar) {
        yl0.e(aQVar, C0059ao.a(6766));
        EnumC0050af b = aQVar.b();
        int i = b == null ? -1 : a.a[b.ordinal()];
        boolean z = true;
        if (i == 1) {
            this.a.h(((L) aQVar).c());
        } else if (i == 2) {
            this.a.v(((C0082m) aQVar).a());
        } else if (i != 3) {
            if (i == 4) {
                this.a.k(((I) aQVar).a());
            } else if (i != 5) {
            } else {
                this.a.d(((C0068ax) aQVar).a());
            }
        } else {
            fh0 fh0Var = this.a;
            aV aVVar = (aV) aQVar;
            if (!aVVar.c() && !aVVar.d() && !aVVar.a()) {
                z = false;
            }
            fh0Var.q(z);
        }
    }
}
