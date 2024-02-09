package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vn  reason: default package */
/* loaded from: classes.dex */
public class vn extends un {
    public static boolean i;

    static {
        C0059ao.a(vn.class, 259);
    }

    @Override // defpackage.xn
    @SuppressLint({"NewApi"})
    public void g(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i2);
        } else if (i) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }
}
