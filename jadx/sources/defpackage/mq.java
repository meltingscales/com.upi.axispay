package defpackage;

import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: mq  reason: default package */
/* loaded from: classes.dex */
public final class mq implements ap {
    public final Set<vo> a;
    public final lq b;
    public final oq c;

    public mq(Set<vo> set, lq lqVar, oq oqVar) {
        this.a = set;
        this.b = lqVar;
        this.c = oqVar;
    }

    @Override // defpackage.ap
    public <T> zo<T> a(String str, Class<T> cls, vo voVar, yo<T, byte[]> yoVar) {
        if (this.a.contains(voVar)) {
            return new nq(this.b, str, voVar, yoVar, this.c);
        }
        throw new IllegalArgumentException(String.format(C0059ao.a(13090), voVar, this.a));
    }
}
