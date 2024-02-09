package com.google.android.gms.internal.crash;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crash.FirebaseCrash;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzg extends zzc {
    private final Throwable zzag;
    private final zzq zzk;

    public zzg(Context context, FirebaseCrash.zza zzaVar, Throwable th, zzq zzqVar) {
        super(context, zzaVar);
        this.zzag = th;
        this.zzk = zzqVar;
    }

    @Override // com.google.android.gms.internal.crash.zzc
    public final String getErrorMessage() {
        return "Failed to report uncaught exception";
    }

    @Override // com.google.android.gms.internal.crash.zzc
    public final /* bridge */ /* synthetic */ Task getTask() {
        return super.getTask();
    }

    @Override // com.google.android.gms.internal.crash.zzc, java.lang.Runnable
    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    @Override // com.google.android.gms.internal.crash.zzc
    public final void zzd(zzm zzmVar) throws RemoteException {
        zzq zzqVar = this.zzk;
        if (zzqVar != null) {
            zzqVar.zza(true, System.currentTimeMillis());
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
                throw new IllegalStateException("Failed to wait for analytics event to be logged");
            }
        }
        zzmVar.zzb(ObjectWrapper.wrap(this.zzag));
    }

    @Override // com.google.android.gms.internal.crash.zzc
    public final boolean zzk() {
        return true;
    }
}
