package defpackage;

import defpackage.yj0;

/* compiled from: AxisPay */
/* renamed from: ek0  reason: default package */
/* loaded from: classes.dex */
public abstract class ek0 extends ck0 {
    private final yj0 _context;
    private transient wj0<Object> intercepted;

    public ek0(wj0<Object> wj0Var, yj0 yj0Var) {
        super(wj0Var);
        this._context = yj0Var;
    }

    @Override // defpackage.wj0
    public yj0 getContext() {
        yj0 yj0Var = this._context;
        yl0.c(yj0Var);
        return yj0Var;
    }

    public final wj0<Object> intercepted() {
        wj0<Object> wj0Var = this.intercepted;
        if (wj0Var == null) {
            xj0 xj0Var = (xj0) getContext().c(xj0.a);
            wj0Var = xj0Var == null ? this : xj0Var.b(this);
            this.intercepted = wj0Var;
        }
        return wj0Var;
    }

    @Override // defpackage.ck0
    public void releaseIntercepted() {
        wj0<?> wj0Var = this.intercepted;
        if (wj0Var != null && wj0Var != this) {
            yj0.a c = getContext().c(xj0.a);
            yl0.c(c);
            ((xj0) c).a(wj0Var);
        }
        this.intercepted = dk0.b;
    }

    public ek0(wj0<Object> wj0Var) {
        this(wj0Var, wj0Var == null ? null : wj0Var.getContext());
    }
}
