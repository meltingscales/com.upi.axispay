package androidx.percentlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import defpackage.ri;

/* compiled from: AxisPay */
@Deprecated
/* loaded from: classes.dex */
public class PercentRelativeLayout extends RelativeLayout {
    public final ri b;

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ri(this);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.e();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.b.a(i, i2);
        super.onMeasure(i, i2);
        if (this.b.d()) {
            super.onMeasure(i, i2);
        }
    }

    /* compiled from: AxisPay */
    @Deprecated
    /* loaded from: classes.dex */
    public static class a extends RelativeLayout.LayoutParams implements ri.b {
        public ri.a b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = ri.c(context, attributeSet);
        }

        @Override // defpackage.ri.b
        public ri.a a() {
            if (this.b == null) {
                this.b = new ri.a();
            }
            return this.b;
        }

        @Override // android.view.ViewGroup.LayoutParams
        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            ri.b(this, typedArray, i, i2);
        }

        public a(int i, int i2) {
            super(i, i2);
        }
    }
}
