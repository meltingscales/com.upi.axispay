package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ClockHandView extends View {
    public ValueAnimator b;
    public boolean c;
    public float d;
    public float e;
    public boolean f;
    public int g;
    public final List<d> h;
    public final int i;
    public final float j;
    public final Paint k;
    public final RectF l;
    public final int m;
    public float n;
    public boolean o;
    public c p;
    public double q;
    public int r;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public b(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface c {
        void a(float f, boolean z);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface d {
        void a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.materialClockStyle);
    }

    public void b(d dVar) {
        this.h.add(dVar);
    }

    public final void c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.k.setStrokeWidth(0.0f);
        canvas.drawCircle((this.r * ((float) Math.cos(this.q))) + width2, (this.r * ((float) Math.sin(this.q))) + f, this.i, this.k);
        double sin = Math.sin(this.q);
        double cos = Math.cos(this.q);
        this.k.setStrokeWidth(this.m);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.k);
        canvas.drawCircle(width2, f, this.j, this.k);
    }

    public RectF d() {
        return this.l;
    }

    public final int e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public float f() {
        return this.n;
    }

    public int g() {
        return this.i;
    }

    public final Pair<Float, Float> h(float f) {
        float f2 = f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    public final boolean i(float f, float f2, boolean z, boolean z2, boolean z3) {
        float e = e(f, f2);
        boolean z4 = false;
        boolean z5 = f() != e;
        if (z2 && z5) {
            return true;
        }
        if (z5 || z) {
            if (z3 && this.c) {
                z4 = true;
            }
            l(e, z4);
            return true;
        }
        return false;
    }

    public void j(int i) {
        this.r = i;
        invalidate();
    }

    public void k(float f) {
        l(f, false);
    }

    public void l(float f, boolean z) {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m(f, false);
            return;
        }
        Pair<Float, Float> h = h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h.first).floatValue(), ((Float) h.second).floatValue());
        this.b = ofFloat;
        ofFloat.setDuration(200L);
        this.b.addUpdateListener(new a());
        this.b.addListener(new b(this));
        this.b.start();
    }

    public final void m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.n = f2;
        this.q = Math.toRadians(f2 - 90.0f);
        float width = (getWidth() / 2) + (this.r * ((float) Math.cos(this.q)));
        float height = (getHeight() / 2) + (this.r * ((float) Math.sin(this.q)));
        RectF rectF = this.l;
        int i = this.i;
        rectF.set(width - i, height - i, width + i, height + i);
        for (d dVar : this.h) {
            dVar.a(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.d = x;
            this.e = y;
            this.f = true;
            this.o = false;
            z = false;
            z2 = false;
            z3 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.d);
            int i2 = (int) (y - this.e);
            this.f = (i * i) + (i2 * i2) > this.g;
            boolean z4 = this.o;
            z = actionMasked == 1;
            z3 = false;
            z2 = z4;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean i3 = i(x, y, z2, z3, z) | this.o;
        this.o = i3;
        if (i3 && z && (cVar = this.p) != null) {
            cVar.a(e(x, y), this.f);
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.k = paint;
        this.l = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sv.ClockHandView, i, rv.Widget_MaterialComponents_TimePicker_Clock);
        this.r = obtainStyledAttributes.getDimensionPixelSize(sv.ClockHandView_materialCircleRadius, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(sv.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.m = resources.getDimensionPixelSize(kv.material_clock_hand_stroke_width);
        this.j = resources.getDimensionPixelSize(kv.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(sv.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        ac.B0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
