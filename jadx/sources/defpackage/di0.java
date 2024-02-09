package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: di0  reason: default package */
/* loaded from: classes.dex */
public class di0 {

    /* compiled from: AxisPay */
    /* renamed from: di0$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ei0.values().length];
            iArr[ei0.SYNCHRONIZED.ordinal()] = 1;
            iArr[ei0.PUBLICATION.ordinal()] = 2;
            iArr[ei0.NONE.ordinal()] = 3;
            a = iArr;
        }
    }

    public static final <T> ci0<T> a(ei0 ei0Var, sk0<? extends T> sk0Var) {
        yl0.e(ei0Var, C0059ao.a(14943));
        yl0.e(sk0Var, C0059ao.a(14944));
        int i = a.a[ei0Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new qi0(sk0Var);
                }
                throw new fi0();
            }
            return new ji0(sk0Var);
        }
        return new ki0(sk0Var, null, 2, null);
    }

    public static final <T> ci0<T> b(sk0<? extends T> sk0Var) {
        yl0.e(sk0Var, C0059ao.a(14945));
        return new ki0(sk0Var, null, 2, null);
    }
}
