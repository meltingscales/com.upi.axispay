package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzal<T> {
    public final int what;
    public final int zzcm;
    public final TaskCompletionSource<T> zzcn = new TaskCompletionSource<>();
    public final Bundle zzco;

    public zzal(int i, int i2, Bundle bundle) {
        this.zzcm = i;
        this.what = i2;
        this.zzco = bundle;
    }

    public final void finish(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            sb.toString();
        }
        this.zzcn.setResult(t);
    }

    public String toString() {
        int i = this.what;
        int i2 = this.zzcm;
        boolean zzab = zzab();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(zzab);
        sb.append("}");
        return sb.toString();
    }

    public final void zza(zzak zzakVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzakVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            sb.toString();
        }
        this.zzcn.setException(zzakVar);
    }

    public abstract boolean zzab();

    public abstract void zzb(Bundle bundle);
}
