package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzi implements ServiceConnection {
    private final Context zzag;
    private final Intent zzah;
    private final ScheduledExecutorService zzai;
    private final Queue<zze> zzaj;
    private zzg zzak;
    private boolean zzal;

    public zzi(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private final synchronized void zzf() {
        Log.isLoggable("EnhancedIntentService", 3);
        while (!this.zzaj.isEmpty()) {
            Log.isLoggable("EnhancedIntentService", 3);
            zzg zzgVar = this.zzak;
            if (zzgVar != null && zzgVar.isBinderAlive()) {
                Log.isLoggable("EnhancedIntentService", 3);
                this.zzak.zza(this.zzaj.poll());
            } else {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    boolean z = !this.zzal;
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("binder is dead. start connection? ");
                    sb.append(z);
                    sb.toString();
                }
                if (!this.zzal) {
                    this.zzal = true;
                    try {
                    } catch (SecurityException e) {
                        Log.e("EnhancedIntentService", "Exception while binding the service", e);
                    }
                    if (ConnectionTracker.getInstance().bindService(this.zzag, this.zzah, this, 65)) {
                        return;
                    }
                    Log.e("EnhancedIntentService", "binding to the service failed");
                    this.zzal = false;
                    zzg();
                }
                return;
            }
        }
    }

    private final void zzg() {
        while (!this.zzaj.isEmpty()) {
            this.zzaj.poll().finish();
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            sb.toString();
        }
        this.zzal = false;
        if (!(iBinder instanceof zzg)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            Log.e("EnhancedIntentService", sb2.toString());
            zzg();
            return;
        }
        this.zzak = (zzg) iBinder;
        zzf();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            sb.toString();
        }
        zzf();
    }

    public final synchronized void zza(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        Log.isLoggable("EnhancedIntentService", 3);
        this.zzaj.add(new zze(intent, pendingResult, this.zzai));
        zzf();
    }

    private zzi(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zzaj = new ArrayDeque();
        this.zzal = false;
        Context applicationContext = context.getApplicationContext();
        this.zzag = applicationContext;
        this.zzah = new Intent(str).setPackage(applicationContext.getPackageName());
        this.zzai = scheduledExecutorService;
    }
}
