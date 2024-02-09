package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: AxisPay */
/* renamed from: m7  reason: default package */
/* loaded from: classes.dex */
public class m7 extends ViewGroup {
    public l7 b;

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public l7 getConstraintSet() {
        if (this.b == null) {
            this.b = new l7();
        }
        this.b.h(this);
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* compiled from: AxisPay */
    /* renamed from: m7$a */
    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;
        public float v0;
        public boolean w0;
        public float x0;
        public float y0;
        public float z0;

        public a(int i, int i2) {
            super(i, i2);
            this.v0 = 1.0f;
            this.w0 = false;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 1.0f;
            this.C0 = 1.0f;
            this.D0 = 0.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.v0 = 1.0f;
            this.w0 = false;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 1.0f;
            this.C0 = 1.0f;
            this.D0 = 0.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q7.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == q7.ConstraintSet_android_alpha) {
                    this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == q7.ConstraintSet_android_elevation) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                        this.w0 = true;
                    }
                } else if (index == q7.ConstraintSet_android_rotationX) {
                    this.z0 = obtainStyledAttributes.getFloat(index, this.z0);
                } else if (index == q7.ConstraintSet_android_rotationY) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == q7.ConstraintSet_android_rotation) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                } else if (index == q7.ConstraintSet_android_scaleX) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == q7.ConstraintSet_android_scaleY) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == q7.ConstraintSet_android_transformPivotX) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == q7.ConstraintSet_android_transformPivotY) {
                    this.E0 = obtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == q7.ConstraintSet_android_translationX) {
                    this.F0 = obtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == q7.ConstraintSet_android_translationY) {
                    this.G0 = obtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == q7.ConstraintSet_android_translationZ && Build.VERSION.SDK_INT >= 21) {
                    this.H0 = obtainStyledAttributes.getFloat(index, this.H0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
