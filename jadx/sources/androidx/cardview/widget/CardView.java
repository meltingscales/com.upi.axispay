package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] i = {16842801};
    public static final l4 j;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public final Rect f;
    public final Rect g;
    public final k4 h;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements k4 {
        public Drawable a;

        public a() {
        }

        @Override // defpackage.k4
        public void a(int i, int i2, int i3, int i4) {
            CardView.this.g.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // defpackage.k4
        public View b() {
            return CardView.this;
        }

        @Override // defpackage.k4
        public void c(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.d) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.e) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        @Override // defpackage.k4
        public void d(Drawable drawable) {
            this.a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // defpackage.k4
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // defpackage.k4
        public boolean f() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // defpackage.k4
        public Drawable g() {
            return this.a;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            j = new i4();
        } else if (i2 >= 17) {
            j = new h4();
        } else {
            j = new j4();
        }
        j.f();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c4.cardViewStyle);
    }

    public ColorStateList getCardBackgroundColor() {
        return j.b(this.h);
    }

    public float getCardElevation() {
        return j.e(this.h);
    }

    public int getContentPaddingBottom() {
        return this.f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f.left;
    }

    public int getContentPaddingRight() {
        return this.f.right;
    }

    public int getContentPaddingTop() {
        return this.f.top;
    }

    public float getMaxCardElevation() {
        return j.a(this.h);
    }

    public boolean getPreventCornerOverlap() {
        return this.c;
    }

    public float getRadius() {
        return j.g(this.h);
    }

    public boolean getUseCompatPadding() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        l4 l4Var = j;
        if (!(l4Var instanceof i4)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(l4Var.i(this.h)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(l4Var.h(this.h)), View.MeasureSpec.getSize(i3)), mode2);
            }
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        j.m(this.h, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f) {
        j.k(this.h, f);
    }

    public void setMaxCardElevation(float f) {
        j.n(this.h, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.e = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.d = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.c) {
            this.c = z;
            j.l(this.h);
        }
    }

    public void setRadius(float f) {
        j.d(this.h, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.b != z) {
            this.b = z;
            j.j(this.h);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f = rect;
        this.g = new Rect();
        a aVar = new a();
        this.h = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g4.CardView, i2, f4.CardView);
        int i3 = g4.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(i);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(d4.cardview_light_background);
            } else {
                color = getResources().getColor(d4.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(g4.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(g4.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(g4.CardView_cardMaxElevation, 0.0f);
        this.b = obtainStyledAttributes.getBoolean(g4.CardView_cardUseCompatPadding, false);
        this.c = obtainStyledAttributes.getBoolean(g4.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(g4.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(g4.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(g4.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(g4.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(g4.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.d = obtainStyledAttributes.getDimensionPixelSize(g4.CardView_android_minWidth, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(g4.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        j.c(aVar, context, colorStateList, dimension, dimension2, f);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        j.m(this.h, colorStateList);
    }
}
