package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzv extends zzw {
    private final Callable<String> zzd;

    public /* synthetic */ zzv(Callable callable, zzu zzuVar) {
        super(false, null, null);
        this.zzd = callable;
    }

    @Override // com.google.android.gms.common.zzw
    public final String zza() {
        try {
            return this.zzd.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
