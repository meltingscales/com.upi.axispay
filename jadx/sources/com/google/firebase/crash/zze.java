package com.google.firebase.crash;

import com.google.android.gms.internal.crash.zzm;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zze implements zzj {
    private final FirebaseCrash zze;

    public zze(FirebaseCrash firebaseCrash) {
        this.zze = firebaseCrash;
    }

    @Override // com.google.firebase.crash.zzj
    public final void zzc(zzm zzmVar) {
        this.zze.zza(zzmVar);
    }

    @Override // com.google.firebase.crash.zzj
    public final void zzi() {
        this.zze.zza((zzm) null);
    }
}
