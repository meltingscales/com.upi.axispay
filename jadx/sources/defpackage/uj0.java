package defpackage;

import java.util.Comparator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: uj0  reason: default package */
/* loaded from: classes.dex */
public final class uj0 implements Comparator<Comparable<? super Object>> {
    public static final uj0 b = new uj0();

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        yl0.e(comparable, C0059ao.a(14718));
        yl0.e(comparable2, C0059ao.a(14719));
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return vj0.b;
    }
}
