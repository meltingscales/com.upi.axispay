package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@Deprecated
/* renamed from: ri  reason: default package */
/* loaded from: classes.dex */
public class ri {
    public final ViewGroup a;

    /* compiled from: AxisPay */
    @Deprecated
    /* renamed from: ri$a */
    /* loaded from: classes.dex */
    public static class a {
        public float i;
        public float a = -1.0f;
        public float b = -1.0f;
        public float c = -1.0f;
        public float d = -1.0f;
        public float e = -1.0f;
        public float f = -1.0f;
        public float g = -1.0f;
        public float h = -1.0f;
        public final c j = new c(0, 0);

        public void a(ViewGroup.LayoutParams layoutParams, int i, int i2) {
            c cVar = this.j;
            int i3 = layoutParams.width;
            ((ViewGroup.MarginLayoutParams) cVar).width = i3;
            int i4 = layoutParams.height;
            ((ViewGroup.MarginLayoutParams) cVar).height = i4;
            boolean z = false;
            boolean z2 = (cVar.b || i3 == 0) && this.a < 0.0f;
            if ((cVar.a || i4 == 0) && this.b < 0.0f) {
                z = true;
            }
            float f = this.a;
            if (f >= 0.0f) {
                layoutParams.width = Math.round(i * f);
            }
            float f2 = this.b;
            if (f2 >= 0.0f) {
                layoutParams.height = Math.round(i2 * f2);
            }
            float f3 = this.i;
            if (f3 >= 0.0f) {
                if (z2) {
                    layoutParams.width = Math.round(layoutParams.height * f3);
                    this.j.b = true;
                }
                if (z) {
                    layoutParams.height = Math.round(layoutParams.width / this.i);
                    this.j.a = true;
                }
            }
        }

        public void b(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
            a(marginLayoutParams, i, i2);
            c cVar = this.j;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) cVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = marginLayoutParams.bottomMargin;
            lb.e(cVar, lb.b(marginLayoutParams));
            lb.d(this.j, lb.a(marginLayoutParams));
            float f = this.c;
            if (f >= 0.0f) {
                marginLayoutParams.leftMargin = Math.round(i * f);
            }
            float f2 = this.d;
            if (f2 >= 0.0f) {
                marginLayoutParams.topMargin = Math.round(i2 * f2);
            }
            float f3 = this.e;
            if (f3 >= 0.0f) {
                marginLayoutParams.rightMargin = Math.round(i * f3);
            }
            float f4 = this.f;
            if (f4 >= 0.0f) {
                marginLayoutParams.bottomMargin = Math.round(i2 * f4);
            }
            boolean z = false;
            float f5 = this.g;
            boolean z2 = true;
            if (f5 >= 0.0f) {
                lb.e(marginLayoutParams, Math.round(i * f5));
                z = true;
            }
            float f6 = this.h;
            if (f6 >= 0.0f) {
                lb.d(marginLayoutParams, Math.round(i * f6));
            } else {
                z2 = z;
            }
            if (!z2 || view == null) {
                return;
            }
            lb.c(marginLayoutParams, ac.C(view));
        }

        public void c(ViewGroup.LayoutParams layoutParams) {
            c cVar = this.j;
            if (!cVar.b) {
                layoutParams.width = ((ViewGroup.MarginLayoutParams) cVar).width;
            }
            if (!cVar.a) {
                layoutParams.height = ((ViewGroup.MarginLayoutParams) cVar).height;
            }
            cVar.b = false;
            cVar.a = false;
        }

        public void d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            c(marginLayoutParams);
            c cVar = this.j;
            marginLayoutParams.leftMargin = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
            marginLayoutParams.topMargin = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
            marginLayoutParams.rightMargin = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
            marginLayoutParams.bottomMargin = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
            lb.e(marginLayoutParams, lb.b(cVar));
            lb.d(marginLayoutParams, lb.a(this.j));
        }

        public String toString() {
            return String.format(C0059ao.a(6751), Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g), Float.valueOf(this.h));
        }
    }

    /* compiled from: AxisPay */
    @Deprecated
    /* renamed from: ri$b */
    /* loaded from: classes.dex */
    public interface b {
        a a();
    }

    /* compiled from: AxisPay */
    /* renamed from: ri$c */
    /* loaded from: classes.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public boolean a;
        public boolean b;

        public c(int i, int i2) {
            super(i, i2);
        }
    }

    public ri(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.a = viewGroup;
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(1061));
    }

    public static void b(ViewGroup.LayoutParams layoutParams, TypedArray typedArray, int i, int i2) {
        layoutParams.width = typedArray.getLayoutDimension(i, 0);
        layoutParams.height = typedArray.getLayoutDimension(i2, 0);
    }

    public static a c(Context context, AttributeSet attributeSet) {
        a aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qi.PercentLayout_Layout);
        float fraction = obtainStyledAttributes.getFraction(qi.PercentLayout_Layout_layout_widthPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            aVar = new a();
            aVar.a = fraction;
        } else {
            aVar = null;
        }
        float fraction2 = obtainStyledAttributes.getFraction(qi.PercentLayout_Layout_layout_heightPercent, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.b = fraction2;
        }
        float fraction3 = obtainStyledAttributes.getFraction(qi.PercentLayout_Layout_layout_marginPercent, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.c = fraction3;
            aVar.d = fraction3;
            aVar.e = fraction3;
            aVar.f = fraction3;
        }
        float fraction4 = obtainStyledAttributes.getFraction(qi.PercentLayout_Layout_layout_marginLeftPercent, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.c = fraction4;
        }
        float fraction5 = obtainStyledAttributes.getFraction(qi.PercentLayout_Layout_layout_marginTopPercent, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.d = fraction5;
        }
        float fraction6 = obtainStyledAttributes.getFraction(qi.PercentLayout_Layout_layout_marginRightPercent, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.e = fraction6;
        }
        float fraction7 = obtainStyledAttributes.getFraction(qi.PercentLayout_Layout_layout_marginBottomPercent, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f = fraction7;
        }
        float fraction8 = obtainStyledAttributes.getFraction(qi.PercentLayout_Layout_layout_marginStartPercent, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.g = fraction8;
        }
        float fraction9 = obtainStyledAttributes.getFraction(qi.PercentLayout_Layout_layout_marginEndPercent, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.h = fraction9;
        }
        float fraction10 = obtainStyledAttributes.getFraction(qi.PercentLayout_Layout_layout_aspectRatio, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.i = fraction10;
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static boolean f(View view, a aVar) {
        return (view.getMeasuredHeightAndState() & (-16777216)) == 16777216 && aVar.b >= 0.0f && ((ViewGroup.MarginLayoutParams) aVar.j).height == -2;
    }

    public static boolean g(View view, a aVar) {
        return (view.getMeasuredWidthAndState() & (-16777216)) == 16777216 && aVar.a >= 0.0f && ((ViewGroup.MarginLayoutParams) aVar.j).width == -2;
    }

    public void a(int i, int i2) {
        a a2;
        int size = (View.MeasureSpec.getSize(i) - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - this.a.getPaddingTop()) - this.a.getPaddingBottom();
        int childCount = this.a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.a.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof b) && (a2 = ((b) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    a2.b(childAt, (ViewGroup.MarginLayoutParams) layoutParams, size, size2);
                } else {
                    a2.a(layoutParams, size, size2);
                }
            }
        }
    }

    public boolean d() {
        a a2;
        int childCount = this.a.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.a.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof b) && (a2 = ((b) layoutParams).a()) != null) {
                if (g(childAt, a2)) {
                    layoutParams.width = -2;
                    z = true;
                }
                if (f(childAt, a2)) {
                    layoutParams.height = -2;
                    z = true;
                }
            }
        }
        return z;
    }

    public void e() {
        a a2;
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = this.a.getChildAt(i).getLayoutParams();
            if ((layoutParams instanceof b) && (a2 = ((b) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    a2.d((ViewGroup.MarginLayoutParams) layoutParams);
                } else {
                    a2.c(layoutParams);
                }
            }
        }
    }
}
