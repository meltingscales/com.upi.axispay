package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Barrier extends j7 {
    public int k;
    public int l;
    public n5 m;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.m.r1();
    }

    public int getMargin() {
        return this.m.t1();
    }

    public int getType() {
        return this.k;
    }

    @Override // defpackage.j7
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.m = new n5();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q7.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == q7.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == q7.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.m.w1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == q7.ConstraintLayout_Layout_barrierMargin) {
                    this.m.y1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.e = this.m;
        s();
    }

    @Override // defpackage.j7
    public void n(r5 r5Var, boolean z) {
        t(r5Var, this.k, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.m.w1(z);
    }

    public void setDpMargin(int i) {
        n5 n5Var = this.m;
        n5Var.y1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.m.y1(i);
    }

    public void setType(int i) {
        this.k = i;
    }

    public final void t(r5 r5Var, int i, boolean z) {
        this.l = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.k;
            if (i2 == 5) {
                this.l = 0;
            } else if (i2 == 6) {
                this.l = 1;
            }
        } else if (z) {
            int i3 = this.k;
            if (i3 == 5) {
                this.l = 1;
            } else if (i3 == 6) {
                this.l = 0;
            }
        } else {
            int i4 = this.k;
            if (i4 == 5) {
                this.l = 0;
            } else if (i4 == 6) {
                this.l = 1;
            }
        }
        if (r5Var instanceof n5) {
            ((n5) r5Var).x1(this.l);
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
