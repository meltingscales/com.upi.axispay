package com.appsflyer.internal.instant;

import android.content.Context;
import android.os.Build;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AFInstantApps {
    public static boolean isInstantApp(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().isInstantApp();
        }
        try {
            context.getClassLoader().loadClass(C0059ao.a(6744));
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
