package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzr extends GmsClientSupervisor {
    @GuardedBy("connectionStatus")
    private final HashMap<zzn, zzo> zzb = new HashMap<>();
    private final Context zzc;
    private volatile Handler zzd;
    private final zzq zze;
    private final ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;

    public zzr(Context context, Looper looper) {
        zzq zzqVar = new zzq(this, null);
        this.zze = zzqVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzi(looper, zzqVar);
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = 5000L;
        this.zzh = 300000L;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void zza(zzn zznVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            zzo zzoVar = this.zzb.get(zznVar);
            if (zzoVar != null) {
                if (zzoVar.zzh(serviceConnection)) {
                    zzoVar.zzf(serviceConnection, str);
                    if (zzoVar.zzi()) {
                        this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zznVar), this.zzg);
                    }
                } else {
                    String obj = zznVar.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 76);
                    sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                String obj2 = zznVar.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(obj2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean zzc(zzn zznVar, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zzj;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            zzo zzoVar = this.zzb.get(zznVar);
            if (zzoVar == null) {
                zzoVar = new zzo(this, zznVar);
                zzoVar.zzd(serviceConnection, serviceConnection, str);
                zzoVar.zze(str, executor);
                this.zzb.put(zznVar, zzoVar);
            } else {
                this.zzd.removeMessages(0, zznVar);
                if (!zzoVar.zzh(serviceConnection)) {
                    zzoVar.zzd(serviceConnection, serviceConnection, str);
                    int zza = zzoVar.zza();
                    if (zza == 1) {
                        serviceConnection.onServiceConnected(zzoVar.zzb(), zzoVar.zzc());
                    } else if (zza == 2) {
                        zzoVar.zze(str, executor);
                    }
                } else {
                    String obj = zznVar.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            }
            zzj = zzoVar.zzj();
        }
        return zzj;
    }

    public final void zzi(Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.google.android.gms.internal.common.zzi(looper, this.zze);
        }
    }
}
