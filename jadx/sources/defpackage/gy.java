package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: AxisPay */
/* renamed from: gy  reason: default package */
/* loaded from: classes.dex */
public class gy extends FrameLayout {
    public Drawable b;
    public Rect c;
    public Rect d;
    public boolean e;
    public boolean f;

    /* compiled from: AxisPay */
    /* renamed from: gy$a */
    /* loaded from: classes.dex */
    public class a implements ub {
        public a() {
        }

        @Override // defpackage.ub
        public ic a(View view, ic icVar) {
            gy gyVar = gy.this;
            if (gyVar.c == null) {
                gyVar.c = new Rect();
            }
            gy.this.c.set(icVar.j(), icVar.l(), icVar.k(), icVar.i());
            gy.this.a(icVar);
            gy.this.setWillNotDraw(!icVar.m() || gy.this.b == null);
            ac.h0(gy.this);
            return icVar.c();
        }
    }

    public gy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(ic icVar) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.c == null || this.b == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.e) {
            this.d.set(0, 0, width, this.c.top);
            this.b.setBounds(this.d);
            this.b.draw(canvas);
        }
        if (this.f) {
            this.d.set(0, height - this.c.bottom, width, height);
            this.b.setBounds(this.d);
            this.b.draw(canvas);
        }
        Rect rect = this.d;
        Rect rect2 = this.c;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.b.setBounds(this.d);
        this.b.draw(canvas);
        Rect rect3 = this.d;
        Rect rect4 = this.c;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.b.setBounds(this.d);
        this.b.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.e = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.b = drawable;
    }

    public gy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Rect();
        this.e = true;
        this.f = true;
        TypedArray h = ly.h(context, attributeSet, sv.ScrimInsetsFrameLayout, i, rv.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.b = h.getDrawable(sv.ScrimInsetsFrameLayout_insetForeground);
        h.recycle();
        setWillNotDraw(true);
        ac.D0(this, new a());
    }
}
