package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: mn  reason: default package */
/* loaded from: classes.dex */
public class mn {
    public static boolean a;

    static {
        C0059ao.a(mn.class, 244);
    }

    public static ln a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new kn(viewGroup);
        }
        return jn.g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    public static void b(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    public static void c(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            b(viewGroup, z);
        } else {
            nn.b(viewGroup, z);
        }
    }
}
