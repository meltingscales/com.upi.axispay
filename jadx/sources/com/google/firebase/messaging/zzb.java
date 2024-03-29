package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import defpackage.m8;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzb {
    private final Context zzag;
    private final Bundle zzco;
    private final Executor zzdy;
    private final zza zzdz;

    public zzb(Context context, Bundle bundle, Executor executor) {
        this.zzdy = executor;
        this.zzag = context;
        this.zzco = bundle;
        this.zzdz = new zza(context, context.getPackageName());
    }

    public final boolean zzas() {
        boolean z;
        if ("1".equals(zza.zza(this.zzco, "gcm.n.noui"))) {
            return true;
        }
        if (!((KeyguardManager) this.zzag.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10L);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.zzag.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            z = true;
                        }
                    }
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        zze zzo = zze.zzo(zza.zza(this.zzco, "gcm.n.image"));
        if (zzo != null) {
            zzo.zza(this.zzdy);
        }
        zzc zzf = this.zzdz.zzf(this.zzco);
        m8.e eVar = zzf.zzea;
        if (zzo != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await(zzo.getTask(), 5L, TimeUnit.SECONDS);
                eVar.n(bitmap);
                m8.b bVar = new m8.b();
                bVar.i(bitmap);
                bVar.h(null);
                eVar.s(bVar);
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                zzo.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException unused2) {
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                zzo.close();
            }
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.zzag.getSystemService("notification")).notify(zzf.tag, 0, zzf.zzea.b());
        return true;
    }
}
