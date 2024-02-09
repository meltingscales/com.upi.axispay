package defpackage;

import defpackage.cn0;

/* compiled from: AxisPay */
/* renamed from: em0  reason: default package */
/* loaded from: classes.dex */
public abstract class em0 extends gm0 implements cn0 {
    public em0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // defpackage.rl0
    public vm0 computeReflected() {
        km0.d(this);
        return this;
    }

    @Override // defpackage.cn0
    public cn0.a getGetter() {
        return ((cn0) getReflected()).getGetter();
    }

    @Override // defpackage.dl0
    public Object invoke(Object obj) {
        return get(obj);
    }
}
