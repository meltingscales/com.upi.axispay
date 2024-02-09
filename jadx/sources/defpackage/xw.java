package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xw  reason: default package */
/* loaded from: classes.dex */
public final class xw {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final lz f;

    public xw(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, lz lzVar, Rect rect) {
        db.c(rect.left);
        db.c(rect.top);
        db.c(rect.right);
        db.c(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = lzVar;
    }

    public static xw a(Context context, int i) {
        db.a(i != 0, C0059ao.a(6911));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, sv.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(sv.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(sv.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(sv.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(sv.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = ty.a(context, obtainStyledAttributes, sv.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = ty.a(context, obtainStyledAttributes, sv.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = ty.a(context, obtainStyledAttributes, sv.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(sv.MaterialCalendarItem_itemStrokeWidth, 0);
        lz m = lz.b(context, obtainStyledAttributes.getResourceId(sv.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(sv.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m();
        obtainStyledAttributes.recycle();
        return new xw(a, a2, a3, dimensionPixelSize, m, rect);
    }

    public int b() {
        return this.a.bottom;
    }

    public int c() {
        return this.a.top;
    }

    public void d(TextView textView) {
        hz hzVar = new hz();
        hz hzVar2 = new hz();
        hzVar.setShapeAppearanceModel(this.f);
        hzVar2.setShapeAppearanceModel(this.f);
        hzVar.X(this.c);
        hzVar.e0(this.e, this.d);
        textView.setTextColor(this.b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.b.withAlpha(30), hzVar, hzVar2) : hzVar;
        Rect rect = this.a;
        ac.u0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
