package com.google.android.gms.internal.crash;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crash.FirebaseCrash;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzj extends zzc {
    private final String zzl;

    public zzj(Context context, FirebaseCrash.zza zzaVar, String str) {
        super(context, zzaVar);
        this.zzl = str;
    }

    @Override // com.google.android.gms.internal.crash.zzc
    public final String getErrorMessage() {
        String valueOf = String.valueOf(this.zzl);
        return valueOf.length() != 0 ? "Failed to set InstanceId to ".concat(valueOf) : new String("Failed to set InstanceId to ");
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
        zzmVar.zzb(this.zzl);
    }
}
