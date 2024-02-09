package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: AxisPay */
@ShowFirstParty
/* loaded from: classes.dex */
public final class zzbg {
    private int zza = 5;

    public final void zza(String str) {
        if (this.zza <= 3) {
        }
    }

    public final void zzb(String str) {
        if (this.zza <= 4) {
            Log.i("GoogleTagManager", str);
        }
    }

    public final void zzc(int i) {
        this.zza = i;
    }

    public final void zzd(String str) {
        if (this.zza <= 2) {
        }
    }
}
