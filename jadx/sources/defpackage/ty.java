package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;

/* compiled from: AxisPay */
/* renamed from: ty  reason: default package */
/* loaded from: classes.dex */
public class ty {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList c;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c = k0.c(context, resourceId)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (color = typedArray.getColor(i, -1)) != -1) {
                return ColorStateList.valueOf(color);
            }
            return typedArray.getColorStateList(i);
        }
        return c;
    }

    public static ColorStateList b(Context context, o3 o3Var, int i) {
        int b;
        int n;
        ColorStateList c;
        if (!o3Var.s(i) || (n = o3Var.n(i, 0)) == 0 || (c = k0.c(context, n)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (b = o3Var.b(i, -1)) != -1) {
                return ColorStateList.valueOf(b);
            }
            return o3Var.c(i);
        }
        return c;
    }

    public static int c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    public static Drawable d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable d;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (d = k0.d(context, resourceId)) == null) ? typedArray.getDrawable(i) : d;
    }

    public static int e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    public static uy f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new uy(context, resourceId);
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
