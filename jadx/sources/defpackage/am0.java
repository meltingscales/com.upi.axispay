package defpackage;

import defpackage.bn0;
import defpackage.zm0;

/* compiled from: AxisPay */
/* renamed from: am0  reason: default package */
/* loaded from: classes.dex */
public abstract class am0 extends cm0 implements zm0 {
    public am0() {
    }

    @Override // defpackage.rl0
    public vm0 computeReflected() {
        km0.c(this);
        return this;
    }

    @Override // defpackage.bn0
    public Object getDelegate() {
        return ((zm0) getReflected()).getDelegate();
    }

    @Override // defpackage.sk0
    public Object invoke() {
        return get();
    }

    public am0(Object obj) {
        super(obj);
    }

    @Override // defpackage.bn0
    public bn0.a getGetter() {
        return ((zm0) getReflected()).mo0getGetter();
    }

    @Override // defpackage.zm0
    public zm0.a getSetter() {
        return ((zm0) getReflected()).mo1getSetter();
    }

    public am0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
