package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfv implements zzba {
    private final /* synthetic */ zzft zzsr;
    private final /* synthetic */ String zzss;

    public zzfv(zzft zzftVar, String str) {
        this.zzsr = zzftVar;
        this.zzss = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzba
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.zzsr.zza(i, th, bArr, this.zzss);
    }
}
