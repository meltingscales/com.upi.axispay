package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sn  reason: default package */
/* loaded from: classes.dex */
public class sn extends xn {
    public static boolean e;

    static {
        C0059ao.a(sn.class, 369);
    }

    @Override // defpackage.xn
    public void a(View view) {
    }

    @Override // defpackage.xn
    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // defpackage.xn
    public void d(View view) {
    }

    @Override // defpackage.xn
    @SuppressLint({"NewApi"})
    public void f(View view, float f) {
        if (e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        view.setAlpha(f);
    }
}
