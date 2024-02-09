package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.gtm.zzga;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfe implements zzfb {
    public final /* synthetic */ zzff zza;
    private final Handler zzb;

    public /* synthetic */ zzfe(zzff zzffVar, zzfd zzfdVar) {
        this.zza = zzffVar;
        this.zzb = new zzga(zzff.zzd(zzffVar).getMainLooper(), new zzfc(this));
    }

    private final Message zzd() {
        return this.zzb.obtainMessage(1, zzff.zzh());
    }

    @Override // com.google.android.gms.tagmanager.zzfb
    public final void zza() {
        this.zzb.removeMessages(1, zzff.zzh());
    }

    @Override // com.google.android.gms.tagmanager.zzfb
    public final void zzb() {
        this.zzb.removeMessages(1, zzff.zzh());
        this.zzb.sendMessage(zzd());
    }

    @Override // com.google.android.gms.tagmanager.zzfb
    public final void zzc(long j) {
        this.zzb.removeMessages(1, zzff.zzh());
        this.zzb.sendMessageDelayed(zzd(), 1800000L);
    }
}
