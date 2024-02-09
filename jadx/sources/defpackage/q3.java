package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: AxisPay */
/* renamed from: q3  reason: default package */
/* loaded from: classes.dex */
public class q3 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            r3.f(view, charSequence);
        }
    }
}
