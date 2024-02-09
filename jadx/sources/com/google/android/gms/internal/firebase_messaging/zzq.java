package com.google.android.gms.internal.firebase_messaging;

import java.util.Objects;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzq extends zzm {
    private final zzp zzp = new zzp();

    @Override // com.google.android.gms.internal.firebase_messaging.zzm
    public final void zza(Throwable th, Throwable th2) {
        if (th2 != th) {
            Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
            this.zzp.zza(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
