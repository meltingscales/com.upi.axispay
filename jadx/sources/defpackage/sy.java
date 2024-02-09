package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sy  reason: default package */
/* loaded from: classes.dex */
public class sy {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i, boolean z) {
        TypedValue a = a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }

    public static int c(Context context, int i, String str) {
        TypedValue a = a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format(C0059ao.a(2669), str, context.getResources().getResourceName(i)));
    }

    public static int d(View view, int i) {
        return c(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
