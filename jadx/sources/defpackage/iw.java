package defpackage;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: iw  reason: default package */
/* loaded from: classes.dex */
public class iw {
    public static final int[] a = {16843848};

    public static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void b(View view, float f) {
        int integer = view.getResources().getInteger(nv.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        String a2 = C0059ao.a(9534);
        long j = integer;
        stateListAnimator.addState(new int[]{16842766, iv.state_liftable, -iv.state_lifted}, ObjectAnimator.ofFloat(view, a2, 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, a2, f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, a2, 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray h = ly.h(context, attributeSet, a, i, i2, new int[0]);
        try {
            if (h.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, h.getResourceId(0, 0)));
            }
        } finally {
            h.recycle();
        }
    }
}
