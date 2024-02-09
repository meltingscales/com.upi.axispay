package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: un  reason: default package */
/* loaded from: classes.dex */
public class un extends tn {
    public static boolean h;

    static {
        C0059ao.a(un.class, 294);
    }

    @Override // defpackage.xn
    @SuppressLint({"NewApi"})
    public void e(View view, int i, int i2, int i3, int i4) {
        if (h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
