package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sm  reason: default package */
/* loaded from: classes.dex */
public class sm extends yn {

    /* compiled from: AxisPay */
    /* renamed from: sm$a */
    /* loaded from: classes.dex */
    public class a extends cn {
        public final /* synthetic */ View a;

        public a(sm smVar, View view) {
            this.a = view;
        }

        @Override // defpackage.bn.f
        public void e(bn bnVar) {
            rn.g(this.a, 1.0f);
            rn.a(this.a);
            bnVar.O(this);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: sm$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {
        public final View a;
        public boolean b = false;

        public b(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            rn.g(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (ac.R(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public sm(int i) {
        h0(i);
    }

    public static float j0(hn hnVar, float f) {
        Float f2;
        return (hnVar == null || (f2 = (Float) hnVar.a.get(C0059ao.a(2284))) == null) ? f : f2.floatValue();
    }

    @Override // defpackage.yn
    public Animator d0(ViewGroup viewGroup, View view, hn hnVar, hn hnVar2) {
        float j0 = j0(hnVar, 0.0f);
        return i0(view, j0 != 1.0f ? j0 : 0.0f, 1.0f);
    }

    @Override // defpackage.yn
    public Animator f0(ViewGroup viewGroup, View view, hn hnVar, hn hnVar2) {
        rn.e(view);
        return i0(view, j0(hnVar, 1.0f), 0.0f);
    }

    @Override // defpackage.yn, defpackage.bn
    public void i(hn hnVar) {
        super.i(hnVar);
        hnVar.a.put(C0059ao.a(2285), Float.valueOf(rn.c(hnVar.b)));
    }

    public final Animator i0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        rn.g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, rn.b, f2);
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    public sm() {
    }
}
