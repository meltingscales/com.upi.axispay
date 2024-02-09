package defpackage;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: AxisPay */
/* renamed from: t7  reason: default package */
/* loaded from: classes.dex */
public abstract class t7 extends j7 {
    public boolean k;
    public boolean l;

    @Override // defpackage.j7
    public void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    @Override // defpackage.j7
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q7.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == q7.ConstraintLayout_Layout_android_visibility) {
                    this.k = true;
                } else if (index == q7.ConstraintLayout_Layout_android_elevation) {
                    this.l = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.j7, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k || this.l) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
                for (int i = 0; i < this.c; i++) {
                    View l = constraintLayout.l(this.b[i]);
                    if (l != null) {
                        if (this.k) {
                            l.setVisibility(visibility);
                        }
                        if (this.l && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                            l.setTranslationZ(l.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        g();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        g();
    }

    public void t(x5 x5Var, int i, int i2) {
    }
}
