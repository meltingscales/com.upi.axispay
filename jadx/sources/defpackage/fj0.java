package defpackage;

import java.util.Collection;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: fj0  reason: default package */
/* loaded from: classes.dex */
public class fj0 extends ej0 {
    public static final <T> boolean q(Collection<? super T> collection, Iterable<? extends T> iterable) {
        yl0.e(collection, C0059ao.a(10089));
        yl0.e(iterable, C0059ao.a(10090));
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean r(Collection<? super T> collection, T[] tArr) {
        yl0.e(collection, C0059ao.a(10091));
        yl0.e(tArr, C0059ao.a(10092));
        return collection.addAll(wi0.b(tArr));
    }
}
