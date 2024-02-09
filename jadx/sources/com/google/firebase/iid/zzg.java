package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzg extends Binder {
    private final zzc zzae;

    public zzg(zzc zzcVar) {
        this.zzae = zzcVar;
    }

    public final void zza(zze zzeVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.zzae.zzc(zzeVar.intent)) {
                zzeVar.finish();
                return;
            }
            Log.isLoggable("EnhancedIntentService", 3);
            this.zzae.zzt.execute(new zzf(this, zzeVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
