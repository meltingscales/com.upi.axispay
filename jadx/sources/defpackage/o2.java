package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: AxisPay */
/* renamed from: o2  reason: default package */
/* loaded from: classes.dex */
public class o2 extends j2 {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public o2(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    @Override // defpackage.j2
    public void c(AttributeSet attributeSet, int i) {
        super.c(attributeSet, i);
        Context context = this.d.getContext();
        int[] iArr = u.AppCompatSeekBar;
        o3 v = o3.v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.d;
        ac.o0(seekBar, seekBar.getContext(), iArr, attributeSet, v.r(), i, 0);
        Drawable h = v.h(u.AppCompatSeekBar_android_thumb);
        if (h != null) {
            this.d.setThumb(h);
        }
        j(v.g(u.AppCompatSeekBar_tickMark));
        int i2 = u.AppCompatSeekBar_tickMarkTintMode;
        if (v.s(i2)) {
            this.g = v2.e(v.k(i2, -1), this.g);
            this.i = true;
        }
        int i3 = u.AppCompatSeekBar_tickMarkTint;
        if (v.s(i3)) {
            this.f = v.c(i3);
            this.h = true;
        }
        v.w();
        f();
    }

    public final void f() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable r = o9.r(drawable.mutate());
                this.e = r;
                if (this.h) {
                    o9.o(r, this.f);
                }
                if (this.i) {
                    o9.p(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public void h() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            o9.m(drawable, ac.C(this.d));
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            f();
        }
        this.d.invalidate();
    }
}
