package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {
    public g A;
    public e B;
    public final Chip v;
    public final Chip w;
    public final MaterialButtonToggleGroup x;
    public final View.OnClickListener y;
    public f z;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.A != null) {
                TimePickerView.this.A.a(((Integer) view.getTag(mv.selection_type)).intValue());
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements MaterialButtonToggleGroup.e {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2 = i == mv.material_clock_period_pm_button ? 1 : 0;
            if (TimePickerView.this.z == null || !z) {
                return;
            }
            TimePickerView.this.z.a(i2);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.B != null) {
                TimePickerView.this.B.a();
            }
            return onDoubleTap;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        public final /* synthetic */ GestureDetector b;

        public d(TimePickerView timePickerView, GestureDetector gestureDetector) {
            this.b = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.b.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface f {
        void a(int i);
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface g {
        void a(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void E() {
        Chip chip = this.v;
        int i = mv.selection_type;
        chip.setTag(i, 12);
        this.w.setTag(i, 10);
        this.v.setOnClickListener(this.y);
        this.w.setOnClickListener(this.y);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void F() {
        d dVar = new d(this, new GestureDetector(getContext(), new c()));
        this.v.setOnTouchListener(dVar);
        this.w.setOnTouchListener(dVar);
    }

    public final void G() {
        if (this.x.getVisibility() == 0) {
            l7 l7Var = new l7();
            l7Var.g(this);
            l7Var.e(mv.material_clock_display, ac.C(this) == 0 ? 2 : 1);
            l7Var.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        G();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            G();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = new a();
        LayoutInflater.from(context).inflate(ov.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(mv.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(mv.material_clock_period_toggle);
        this.x = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new b());
        this.v = (Chip) findViewById(mv.material_minute_tv);
        this.w = (Chip) findViewById(mv.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(mv.material_clock_hand);
        F();
        E();
    }
}
