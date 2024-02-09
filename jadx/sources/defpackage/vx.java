package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vx  reason: default package */
/* loaded from: classes.dex */
public class vx extends ux {

    /* compiled from: AxisPay */
    /* renamed from: vx$a */
    /* loaded from: classes.dex */
    public static class a extends hz {
        public a(lz lzVar) {
            super(lzVar);
        }

        @Override // defpackage.hz, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public vx(FloatingActionButton floatingActionButton, az azVar) {
        super(floatingActionButton, azVar);
    }

    @Override // defpackage.ux
    public void A() {
    }

    @Override // defpackage.ux
    public void C() {
        f0();
    }

    @Override // defpackage.ux
    public void E(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.y.isEnabled()) {
                this.y.setElevation(this.h);
                if (this.y.isPressed()) {
                    this.y.setTranslationZ(this.j);
                    return;
                } else if (!this.y.isFocused() && !this.y.isHovered()) {
                    this.y.setTranslationZ(0.0f);
                    return;
                } else {
                    this.y.setTranslationZ(this.i);
                    return;
                }
            }
            this.y.setElevation(0.0f);
            this.y.setTranslationZ(0.0f);
        }
    }

    @Override // defpackage.ux
    public void F(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(ux.G, j0(f, f3));
            stateListAnimator.addState(ux.H, j0(f, f2));
            stateListAnimator.addState(ux.I, j0(f, f2));
            stateListAnimator.addState(ux.J, j0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.y, C0059ao.a(5289), f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(ux.F);
            stateListAnimator.addState(ux.K, animatorSet);
            stateListAnimator.addState(ux.L, j0(0.0f, 0.0f));
            this.y.setStateListAnimator(stateListAnimator);
        }
        if (Z()) {
            f0();
        }
    }

    @Override // defpackage.ux
    public boolean K() {
        return false;
    }

    @Override // defpackage.ux
    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(yy.d(colorStateList));
        } else {
            super.V(colorStateList);
        }
    }

    @Override // defpackage.ux
    public boolean Z() {
        return this.z.c() || !b0();
    }

    @Override // defpackage.ux
    public void d0() {
    }

    public tx i0(int i, ColorStateList colorStateList) {
        Context context = this.y.getContext();
        lz lzVar = this.a;
        db.e(lzVar);
        tx txVar = new tx(lzVar);
        txVar.e(t8.d(context, jv.design_fab_stroke_top_outer_color), t8.d(context, jv.design_fab_stroke_top_inner_color), t8.d(context, jv.design_fab_stroke_end_inner_color), t8.d(context, jv.design_fab_stroke_end_outer_color));
        txVar.d(i);
        txVar.c(colorStateList);
        return txVar;
    }

    @Override // defpackage.ux
    public hz j() {
        lz lzVar = this.a;
        db.e(lzVar);
        return new a(lzVar);
    }

    public final Animator j0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.y, C0059ao.a(5290), f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(ux.F);
        return animatorSet;
    }

    @Override // defpackage.ux
    public float n() {
        return this.y.getElevation();
    }

    @Override // defpackage.ux
    public void s(Rect rect) {
        if (this.z.c()) {
            super.s(rect);
        } else if (!b0()) {
            int sizeDimension = (this.k - this.y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // defpackage.ux
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        hz j = j();
        this.b = j;
        j.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.M(this.y.getContext());
        if (i > 0) {
            this.d = i0(i, colorStateList);
            tx txVar = this.d;
            db.e(txVar);
            hz hzVar = this.b;
            db.e(hzVar);
            drawable = new LayerDrawable(new Drawable[]{txVar, hzVar});
        } else {
            this.d = null;
            drawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(yy.d(colorStateList2), drawable, null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }
}
