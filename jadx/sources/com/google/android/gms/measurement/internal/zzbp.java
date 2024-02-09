package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbp implements Runnable {
    private final /* synthetic */ zzby zzmk;
    private final /* synthetic */ zzau zzml;

    public zzbp(zzbo zzboVar, zzby zzbyVar, zzau zzauVar) {
        this.zzmk = zzbyVar;
        this.zzml = zzauVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzmk.zzej() == null) {
            this.zzml.zzda().zzaq("Install Referrer Reporter is null");
            return;
        }
        zzbl zzej = this.zzmk.zzej();
        zzej.zzl.zzo();
        zzej.zzaw(zzej.zzl.getContext().getPackageName());
    }
}
