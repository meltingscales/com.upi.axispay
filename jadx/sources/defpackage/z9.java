package defpackage;

import android.os.Build;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: z9  reason: default package */
/* loaded from: classes.dex */
public class z9 {
    public static boolean a(String str, String str2) {
        return !C0059ao.a(6909).equals(str2) && str2.compareTo(str) >= 0;
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Deprecated
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT < 31) {
            if (!a(C0059ao.a(6910), Build.VERSION.CODENAME)) {
                return false;
            }
        }
        return true;
    }
}
