package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzau {
    private static zzau zzdd;
    @GuardedBy("serviceClassNames")
    private final u4<String, String> zzde = new u4<>();
    private Boolean zzdf = null;
    private Boolean zzdg = null;
    public final Queue<Intent> zzdh = new ArrayDeque();
    private final Queue<Intent> zzdi = new ArrayDeque();

    private zzau() {
    }

    private static Intent zza(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    public static synchronized zzau zzai() {
        zzau zzauVar;
        synchronized (zzau.class) {
            if (zzdd == null) {
                zzdd = new zzau();
            }
            zzauVar = zzdd;
        }
        return zzauVar;
    }

    public static void zzb(Context context, Intent intent) {
        context.sendBroadcast(zza(context, "com.google.firebase.INSTANCE_ID_EVENT", intent));
    }

    public static void zzc(Context context, Intent intent) {
        context.sendBroadcast(zza(context, "com.google.firebase.MESSAGING_EVENT", intent));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3 A[Catch: IllegalStateException -> 0x00ea, SecurityException -> 0x0112, TryCatch #4 {IllegalStateException -> 0x00ea, SecurityException -> 0x0112, blocks: (B:40:0x00cd, B:42:0x00d3, B:45:0x00de, B:43:0x00d8), top: B:63:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8 A[Catch: IllegalStateException -> 0x00ea, SecurityException -> 0x0112, TryCatch #4 {IllegalStateException -> 0x00ea, SecurityException -> 0x0112, blocks: (B:40:0x00cd, B:42:0x00d3, B:45:0x00de, B:43:0x00d8), top: B:63:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de A[Catch: IllegalStateException -> 0x00ea, SecurityException -> 0x0112, TRY_LEAVE, TryCatch #4 {IllegalStateException -> 0x00ea, SecurityException -> 0x0112, blocks: (B:40:0x00cd, B:42:0x00d3, B:45:0x00de, B:43:0x00d8), top: B:63:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzd(android.content.Context r6, android.content.Intent r7) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzau.zzd(android.content.Context, android.content.Intent):int");
    }

    public final Intent zzaj() {
        return this.zzdi.poll();
    }

    public final boolean zze(Context context) {
        if (this.zzdg == null) {
            this.zzdg = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.zzdf.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.zzdg.booleanValue();
    }

    public final int zzb(Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Starting service: ".concat(valueOf);
            } else {
                new String("Starting service: ");
            }
        }
        str.hashCode();
        if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            this.zzdh.offer(intent);
        } else if (!str.equals("com.google.firebase.MESSAGING_EVENT")) {
            String valueOf2 = String.valueOf(str);
            Log.w("FirebaseInstanceId", valueOf2.length() != 0 ? "Unknown service action: ".concat(valueOf2) : new String("Unknown service action: "));
            return FirebaseCrashlytics.APP_EXCEPTION_CALLBACK_TIMEOUT_MS;
        } else {
            this.zzdi.offer(intent);
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return zzd(context, intent2);
    }

    public final boolean zzd(Context context) {
        if (this.zzdf == null) {
            this.zzdf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.zzdf.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.zzdf.booleanValue();
    }
}
