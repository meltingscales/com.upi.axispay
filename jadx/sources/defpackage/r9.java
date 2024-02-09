package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: AxisPay */
/* renamed from: r9  reason: default package */
/* loaded from: classes.dex */
public class r9 extends Drawable implements Drawable.Callback, q9, p9 {
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public int b;
    public PorterDuff.Mode c;
    public boolean d;
    public t9 e;
    public boolean f;
    public Drawable g;

    public r9(t9 t9Var, Resources resources) {
        this.e = t9Var;
        e(resources);
    }

    @Override // defpackage.q9
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            t9 t9Var = this.e;
            if (t9Var != null) {
                t9Var.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // defpackage.q9
    public final Drawable b() {
        return this.g;
    }

    public boolean c() {
        return true;
    }

    public final t9 d() {
        return new t9(this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.g.draw(canvas);
    }

    public final void e(Resources resources) {
        Drawable.ConstantState constantState;
        t9 t9Var = this.e;
        if (t9Var == null || (constantState = t9Var.b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    public final boolean f(int[] iArr) {
        if (c()) {
            t9 t9Var = this.e;
            ColorStateList colorStateList = t9Var.c;
            PorterDuff.Mode mode = t9Var.d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.d || colorForState != this.b || mode != this.c) {
                    setColorFilter(colorForState, mode);
                    this.b = colorForState;
                    this.c = mode;
                    this.d = true;
                    return true;
                }
            } else {
                this.d = false;
                clearColorFilter();
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        t9 t9Var = this.e;
        return changingConfigurations | (t9Var != null ? t9Var.getChangingConfigurations() : 0) | this.g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        t9 t9Var = this.e;
        if (t9Var == null || !t9Var.a()) {
            return null;
        }
        this.e.a = getChangingConfigurations();
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return o9.f(this.g);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return o9.h(this.g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        t9 t9Var;
        ColorStateList colorStateList = (!c() || (t9Var = this.e) == null) ? null : t9Var.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            this.e = d();
            Drawable drawable = this.g;
            if (drawable != null) {
                drawable.mutate();
            }
            t9 t9Var = this.e;
            if (t9Var != null) {
                Drawable drawable2 = this.g;
                t9Var.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return o9.m(this.g, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.g.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        o9.j(this.g, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.g.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.g.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.g.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.p9
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, defpackage.p9
    public void setTintList(ColorStateList colorStateList) {
        this.e.c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, defpackage.p9
    public void setTintMode(PorterDuff.Mode mode) {
        this.e.d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.g.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public r9(Drawable drawable) {
        this.e = d();
        a(drawable);
    }
}
