package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzv implements Continuation<Bundle, String> {
    private final /* synthetic */ zzr zzbu;

    public zzv(zzr zzrVar) {
        this.zzbu = zzrVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ String then(Task<Bundle> task) throws Exception {
        String zza;
        zzr zzrVar = this.zzbu;
        zza = zzr.zza(task.getResult(IOException.class));
        return zza;
    }
}
