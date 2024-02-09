package retrofit2;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AxisPay */
@gk0(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
/* loaded from: classes2.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends ek0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public KotlinExtensions$suspendAndThrow$1(wj0 wj0Var) {
        super(wj0Var);
    }

    @Override // defpackage.ck0
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return KotlinExtensions.suspendAndThrow(null, this);
    }
}
