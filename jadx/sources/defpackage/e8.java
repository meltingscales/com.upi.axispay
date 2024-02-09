package defpackage;

import android.app.ActivityManager;
import android.os.Build;

/* compiled from: AxisPay */
/* renamed from: e8  reason: default package */
/* loaded from: classes.dex */
public final class e8 {
    public static boolean a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}
