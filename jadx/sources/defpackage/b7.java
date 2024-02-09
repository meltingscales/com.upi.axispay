package defpackage;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.d7;

/* compiled from: AxisPay */
/* renamed from: b7  reason: default package */
/* loaded from: classes.dex */
public class b7 extends j7 implements d7.f {
    public boolean k;
    public boolean l;
    public float m;
    public View[] n;

    @Override // defpackage.d7.f
    public void a(d7 d7Var, int i, int i2, float f) {
    }

    @Override // defpackage.d7.f
    public void b(d7 d7Var, int i, int i2) {
    }

    @Override // defpackage.d7.f
    public void c(d7 d7Var, int i) {
    }

    public float getProgress() {
        return this.m;
    }

    @Override // defpackage.j7
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q7.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == q7.MotionHelper_onShow) {
                    this.k = obtainStyledAttributes.getBoolean(index, this.k);
                } else if (index == q7.MotionHelper_onHide) {
                    this.l = obtainStyledAttributes.getBoolean(index, this.l);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.m = f;
        int i = 0;
        if (this.c > 0) {
            this.n = l((ConstraintLayout) getParent());
            while (i < this.c) {
                y(this.n[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof b7)) {
                y(childAt, f);
            }
            i++;
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.l;
    }

    public boolean v() {
        return this.k;
    }

    public void w(Canvas canvas) {
    }

    public void x(Canvas canvas) {
    }

    public void y(View view, float f) {
    }
}
