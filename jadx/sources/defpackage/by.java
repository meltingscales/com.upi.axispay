package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* compiled from: AxisPay */
/* renamed from: by  reason: default package */
/* loaded from: classes.dex */
public class by extends z2 {
    public Drawable q;
    public final Rect r;
    public final Rect s;
    public int t;
    public boolean u;
    public boolean v;

    public by(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.q;
        if (drawable != null) {
            if (this.v) {
                this.v = false;
                Rect rect = this.r;
                Rect rect2 = this.s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // defpackage.z2, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.v = z | this.v;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.q);
            }
            this.q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.t = i;
            if (i == 119 && this.q != null) {
                this.q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    public by(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = new Rect();
        this.s = new Rect();
        this.t = 119;
        this.u = true;
        this.v = false;
        TypedArray h = ly.h(context, attributeSet, sv.ForegroundLinearLayout, i, 0, new int[0]);
        this.t = h.getInt(sv.ForegroundLinearLayout_android_foregroundGravity, this.t);
        Drawable drawable = h.getDrawable(sv.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.u = h.getBoolean(sv.ForegroundLinearLayout_foregroundInsidePadding, true);
        h.recycle();
    }
}
