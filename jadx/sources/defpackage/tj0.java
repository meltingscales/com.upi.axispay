package defpackage;

import java.util.Comparator;

/* compiled from: AxisPay */
/* renamed from: tj0  reason: default package */
/* loaded from: classes.dex */
public class tj0 {
    public static final <T extends Comparable<?>> int a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static final <T extends Comparable<? super T>> Comparator<T> b() {
        return uj0.b;
    }
}
