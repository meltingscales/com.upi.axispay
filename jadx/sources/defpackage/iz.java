package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: AxisPay */
/* renamed from: iz  reason: default package */
/* loaded from: classes.dex */
public class iz {
    public static ez a(int i) {
        if (i != 0) {
            if (i != 1) {
                return b();
            }
            return new fz();
        }
        return new kz();
    }

    public static ez b() {
        return new kz();
    }

    public static gz c() {
        return new gz();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof hz) {
            ((hz) background).W(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof hz) {
            f(view, (hz) background);
        }
    }

    public static void f(View view, hz hzVar) {
        if (hzVar.O()) {
            hzVar.a0(ny.c(view));
        }
    }
}
