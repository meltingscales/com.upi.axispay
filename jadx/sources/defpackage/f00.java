package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: AxisPay */
/* renamed from: f00  reason: default package */
/* loaded from: classes.dex */
public class f00 {
    public static final int[] a = {16842752, iv.theme};
    public static final int[] b = {iv.materialThemeOverlay};

    public static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static int b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i, int i2) {
        int b2 = b(context, attributeSet, i, i2);
        boolean z = (context instanceof w0) && ((w0) context).c() == b2;
        if (b2 == 0 || z) {
            return context;
        }
        w0 w0Var = new w0(context, b2);
        int a2 = a(context, attributeSet);
        if (a2 != 0) {
            w0Var.getTheme().applyStyle(a2, true);
        }
        return w0Var;
    }
}
