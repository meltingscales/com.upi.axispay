package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.lc;
import java.util.Arrays;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ClockFaceView extends g00 implements ClockHandView.d {
    public final RectF A;
    public final SparseArray<TextView> B;
    public final eb C;
    public final int[] D;
    public final float[] E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public String[] J;
    public float K;
    public final ColorStateList L;
    public final ClockHandView y;
    public final Rect z;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (ClockFaceView.this.isShown()) {
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.D(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.y.g()) - ClockFaceView.this.F);
                return true;
            }
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b extends eb {
        public b() {
        }

        @Override // defpackage.eb
        public void g(View view, lc lcVar) {
            super.g(view, lcVar);
            int intValue = ((Integer) view.getTag(mv.material_value_index)).intValue();
            if (intValue > 0) {
                lcVar.B0((View) ClockFaceView.this.B.get(intValue - 1));
            }
            lcVar.d0(lc.c.a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, iv.materialClockStyle);
    }

    public static float M(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    @Override // defpackage.g00
    public void D(int i) {
        if (i != C()) {
            super.D(i);
            this.y.j(C());
        }
    }

    public final void K() {
        RectF d = this.y.d();
        for (int i = 0; i < this.B.size(); i++) {
            TextView textView = this.B.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.z);
                this.z.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.z);
                this.A.set(this.z);
                textView.getPaint().setShader(L(d, this.A));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient L(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.A.left, rectF.centerY() - this.A.top, rectF.width() * 0.5f, this.D, this.E, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public void N(String[] strArr, int i) {
        this.J = strArr;
        O(i);
    }

    public final void O(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.B.size();
        for (int i2 = 0; i2 < Math.max(this.J.length, size); i2++) {
            TextView textView = this.B.get(i2);
            if (i2 >= this.J.length) {
                removeView(textView);
                this.B.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(ov.material_clockface_textview, (ViewGroup) this, false);
                    this.B.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.J[i2]);
                textView.setTag(mv.material_value_index, Integer.valueOf(i2));
                ac.q0(textView, this.C);
                textView.setTextColor(this.L);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.J[i2]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void a(float f, boolean z) {
        if (Math.abs(this.K - f) > 0.001f) {
            this.K = f;
            K();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        lc.E0(accessibilityNodeInfo).c0(lc.b.b(1, this.J.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        K();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int M = (int) (this.I / M(this.G / displayMetrics.heightPixels, this.H / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(M, CommonUtils.BYTES_IN_A_GIGABYTE);
        setMeasuredDimension(M, M);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z = new Rect();
        this.A = new RectF();
        this.B = new SparseArray<>();
        this.E = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sv.ClockFaceView, i, rv.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a2 = ty.a(context, obtainStyledAttributes, sv.ClockFaceView_clockNumberTextColor);
        this.L = a2;
        LayoutInflater.from(context).inflate(ov.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(mv.material_clock_hand);
        this.y = clockHandView;
        this.F = resources.getDimensionPixelSize(kv.material_clock_hand_padding);
        int colorForState = a2.getColorForState(new int[]{16842913}, a2.getDefaultColor());
        this.D = new int[]{colorForState, colorForState, a2.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = k0.c(context, jv.material_timepicker_clockface).getDefaultColor();
        ColorStateList a3 = ty.a(context, obtainStyledAttributes, sv.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(a3 != null ? a3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.C = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        N(strArr, 0);
        this.G = resources.getDimensionPixelSize(kv.material_time_picker_minimum_screen_height);
        this.H = resources.getDimensionPixelSize(kv.material_time_picker_minimum_screen_width);
        this.I = resources.getDimensionPixelSize(kv.material_clock_size);
    }
}
