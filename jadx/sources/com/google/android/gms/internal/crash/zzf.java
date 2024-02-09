package com.google.android.gms.internal.crash;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crash.FirebaseCrash;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzf extends zzc {
    private final String zzae;

    public zzf(Context context, FirebaseCrash.zza zzaVar, String str) {
        super(context, zzaVar);
        this.zzae = str;
    }

    @Override // com.google.android.gms.internal.crash.zzc
    public final String getErrorMessage() {
        return "Failed to log message";
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
        zzmVar.log(this.zzae);
    }

    @Override // com.google.android.gms.internal.crash.zzc
    public final boolean zzk() {
        return true;
    }
}
