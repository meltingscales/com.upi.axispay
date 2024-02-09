package com.google.android.gms.internal.vision;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzas {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();
    private static boolean zzc = false;

    private zzas() {
    }

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @TargetApi(24)
    private static boolean zzb(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (zza == null) {
                zza = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                } else if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                zza = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            zza = null;
        }
        return z;
    }

    @TargetApi(24)
    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzas.class) {
            if (zzb) {
                return true;
            }
            boolean zzb2 = zzb(context);
            if (zzb2) {
                zzb = zzb2;
            }
            return zzb2;
        }
    }

    public static boolean zza(Context context) {
        return !zza() || zzc(context);
    }
}
