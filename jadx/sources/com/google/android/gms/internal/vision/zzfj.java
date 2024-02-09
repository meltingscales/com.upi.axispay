package com.google.android.gms.internal.vision;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfj extends zzfd {
    @Override // com.google.android.gms.internal.vision.zzfd
    public final void zza(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    @Override // com.google.android.gms.internal.vision.zzfd
    public final void zza(Throwable th) {
        th.printStackTrace();
    }
}
