package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzab {
    @GuardedBy("MessengerIpcClient.class")
    private static zzab zzca;
    private final Context zzag;
    private final ScheduledExecutorService zzcb;
    @GuardedBy("this")
    private zzac zzcc = new zzac(this);
    @GuardedBy("this")
    private int zzcd = 1;

    private zzab(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzcb = scheduledExecutorService;
        this.zzag = context.getApplicationContext();
    }

    public static synchronized zzab zzc(Context context) {
        zzab zzabVar;
        synchronized (zzab.class) {
            if (zzca == null) {
                zzca = new zzab(context, com.google.android.gms.internal.firebase_messaging.zza.zza().zza(1, new NamedThreadFactory("MessengerIpcClient"), com.google.android.gms.internal.firebase_messaging.zzf.zze));
            }
            zzabVar = zzca;
        }
        return zzabVar;
    }

    private final synchronized int zzx() {
        int i;
        i = this.zzcd;
        this.zzcd = i + 1;
        return i;
    }

    public final Task<Void> zza(int i, Bundle bundle) {
        return zza(new zzai(zzx(), 2, bundle));
    }

    public final Task<Bundle> zzb(int i, Bundle bundle) {
        return zza(new zzan(zzx(), 1, bundle));
    }

    private final synchronized <T> Task<T> zza(zzal<T> zzalVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(zzalVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            sb.toString();
        }
        if (!this.zzcc.zzb(zzalVar)) {
            zzac zzacVar = new zzac(this);
            this.zzcc = zzacVar;
            zzacVar.zzb(zzalVar);
        }
        return zzalVar.zzcn.getTask();
    }
}
