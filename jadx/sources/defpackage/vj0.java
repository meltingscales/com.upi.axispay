package defpackage;

import java.util.Comparator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vj0  reason: default package */
/* loaded from: classes.dex */
public final class vj0 implements Comparator<Comparable<? super Object>> {
    public static final vj0 b = new vj0();

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        yl0.e(comparable, C0059ao.a(13888));
        yl0.e(comparable2, C0059ao.a(13889));
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return uj0.b;
    }
}
