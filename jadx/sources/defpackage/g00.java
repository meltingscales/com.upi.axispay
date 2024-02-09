package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: g00  reason: default package */
/* loaded from: classes.dex */
public class g00 extends ConstraintLayout {
    public final Runnable v;
    public int w;
    public hz x;

    /* compiled from: AxisPay */
    /* renamed from: g00$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g00.this.F();
        }
    }

    public g00(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean E(View view) {
        return C0059ao.a(516).equals(view.getTag());
    }

    public final Drawable B() {
        hz hzVar = new hz();
        this.x = hzVar;
        hzVar.V(new jz(0.5f));
        this.x.X(ColorStateList.valueOf(-1));
        return this.x;
    }

    public int C() {
        return this.w;
    }

    public void D(int i) {
        this.w = i;
        F();
    }

    public void F() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (E(getChildAt(i2))) {
                i++;
            }
        }
        l7 l7Var = new l7();
        l7Var.g(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = mv.circle_center;
            if (id != i4 && !E(childAt)) {
                l7Var.i(childAt.getId(), i4, this.w, f);
                f += 360.0f / (childCount - i);
            }
        }
        l7Var.c(this);
    }

    public final void G() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.v);
            handler.post(this.v);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(ac.k());
        }
        G();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        F();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        G();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.x.X(ColorStateList.valueOf(i));
    }

    public g00(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(ov.material_radial_view_group, this);
        ac.u0(this, B());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sv.RadialViewGroup, i, 0);
        this.w = obtainStyledAttributes.getDimensionPixelSize(sv.RadialViewGroup_materialCircleRadius, 0);
        this.v = new a();
        obtainStyledAttributes.recycle();
    }
}
