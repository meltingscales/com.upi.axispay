package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzck {
    private static volatile UserManager zzzg;
    private static volatile boolean zzzh = !zzji();

    private zzck() {
    }

    public static boolean isUserUnlocked(Context context) {
        return !zzji() || zzn(context);
    }

    public static boolean zzji() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @TargetApi(24)
    private static boolean zzn(Context context) {
        boolean z = zzzh;
        if (!z) {
            for (int i = 1; i <= 2; i++) {
                UserManager zzo = zzo(context);
                if (zzo == null) {
                    zzzh = true;
                    return true;
                }
                try {
                    if (!zzo.isUserUnlocked() && zzo.isUserRunning(Process.myUserHandle())) {
                        z = false;
                        zzzh = z;
                        break;
                    }
                    z = true;
                    zzzh = z;
                    break;
                    break;
                } catch (NullPointerException e) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked", e);
                    zzzg = null;
                }
            }
            if (z) {
                zzzg = null;
            }
        }
        return z;
    }

    @TargetApi(24)
    private static UserManager zzo(Context context) {
        UserManager userManager = zzzg;
        if (userManager == null) {
            synchronized (zzck.class) {
                userManager = zzzg;
                if (userManager == null) {
                    UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                    zzzg = userManager2;
                    userManager = userManager2;
                }
            }
        }
        return userManager;
    }
}
