package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import defpackage.uw;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: rw  reason: default package */
/* loaded from: classes.dex */
public final class rw {

    /* compiled from: AxisPay */
    /* renamed from: rw$a */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter {
        public final /* synthetic */ uw a;

        public a(uw uwVar) {
            this.a = uwVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.b();
        }
    }

    public static Animator a(uw uwVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(uwVar, (Property<uw, V>) uw.c.a, (TypeEvaluator) uw.b.b, (Object[]) new uw.e[]{new uw.e(f, f2, f3)});
        if (Build.VERSION.SDK_INT >= 21) {
            uw.e revealInfo = uwVar.getRevealInfo();
            if (revealInfo != null) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) uwVar, (int) f, (int) f2, revealInfo.c, f3);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofObject, createCircularReveal);
                return animatorSet;
            }
            throw new IllegalStateException(C0059ao.a(1435));
        }
        return ofObject;
    }

    public static Animator.AnimatorListener b(uw uwVar) {
        return new a(uwVar);
    }
}
