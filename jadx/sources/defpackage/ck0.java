package defpackage;

import defpackage.hi0;
import java.io.Serializable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ck0  reason: default package */
/* loaded from: classes.dex */
public abstract class ck0 implements wj0<Object>, fk0, Serializable {
    private final wj0<Object> completion;

    public ck0(wj0<Object> wj0Var) {
        this.completion = wj0Var;
    }

    public wj0<pi0> create(wj0<?> wj0Var) {
        yl0.e(wj0Var, C0059ao.a(5425));
        throw new UnsupportedOperationException(C0059ao.a(5426));
    }

    public fk0 getCallerFrame() {
        wj0<Object> wj0Var = this.completion;
        if (wj0Var instanceof fk0) {
            return (fk0) wj0Var;
        }
        return null;
    }

    public final wj0<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return hk0.d(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // defpackage.wj0
    public final void resumeWith(Object obj) {
        ck0 ck0Var = this;
        while (true) {
            ik0.a(ck0Var);
            ck0 ck0Var2 = ck0Var;
            wj0<Object> completion = ck0Var2.getCompletion();
            yl0.c(completion);
            try {
                obj = ck0Var2.invokeSuspend(obj);
            } catch (Throwable th) {
                hi0.a aVar = hi0.b;
                obj = ii0.a(th);
                hi0.a(obj);
            }
            if (obj == bk0.b()) {
                return;
            }
            hi0.a aVar2 = hi0.b;
            hi0.a(obj);
            ck0Var2.releaseIntercepted();
            if (!(completion instanceof ck0)) {
                completion.resumeWith(obj);
                return;
            }
            ck0Var = completion;
        }
    }

    public String toString() {
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        return yl0.l(C0059ao.a(5427), stackTraceElement);
    }

    public wj0<pi0> create(Object obj, wj0<?> wj0Var) {
        yl0.e(wj0Var, C0059ao.a(5423));
        throw new UnsupportedOperationException(C0059ao.a(5424));
    }
}
