package defpackage;

import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sj0  reason: default package */
/* loaded from: classes.dex */
public class sj0 extends rj0 {
    public static final <T> Set<T> b() {
        return mj0.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> c(Set<? extends T> set) {
        yl0.e(set, C0059ao.a(3931));
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : rj0.a(set.iterator().next());
        }
        return b();
    }

    public static final <T> Set<T> d(T... tArr) {
        yl0.e(tArr, C0059ao.a(3932));
        return tArr.length > 0 ? xi0.v(tArr) : b();
    }
}
