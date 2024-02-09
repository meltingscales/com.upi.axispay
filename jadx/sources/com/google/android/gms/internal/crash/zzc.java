package com.google.android.gms.internal.crash;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crash.FirebaseCrash;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzc implements Runnable {
    private final FirebaseCrash.zza zzac;
    private final TaskCompletionSource<Void> zzad = new TaskCompletionSource<>();
    private final Context zzf;

    public zzc(Context context, FirebaseCrash.zza zzaVar) {
        this.zzac = zzaVar;
        this.zzf = context.getApplicationContext();
    }

    public abstract String getErrorMessage();

    public Task<Void> getTask() {
        return this.zzad.getTask();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            zzm zzh = this.zzac.zzh();
            if (zzh != null) {
                if (!zzh.zzd() && zzk()) {
                    throw new IllegalStateException("Firebase Crash reporting is not enabled");
                }
                zzd(zzh);
                this.zzad.setResult(null);
                return;
            }
            throw new IllegalStateException("Firebase Crash api is not available");
        } catch (RemoteException | RuntimeException e) {
            CrashUtils.addDynamiteErrorToDropBox(this.zzf, e);
            Log.e("FirebaseCrash", getErrorMessage(), e);
            this.zzad.setException(e);
        }
    }

    public abstract void zzd(zzm zzmVar) throws RemoteException;

    public boolean zzk() {
        return false;
    }
}
