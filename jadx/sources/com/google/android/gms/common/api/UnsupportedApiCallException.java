package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature zza;

    @KeepForSdk
    public UnsupportedApiCallException(Feature feature) {
        this.zza = feature;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String valueOf = String.valueOf(this.zza);
        String.valueOf(valueOf).length();
        return "Missing ".concat(String.valueOf(valueOf));
    }
}
