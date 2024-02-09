package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzfs extends zzfr {
    private boolean zzce;

    public zzfs(zzft zzftVar) {
        super(zzftVar);
        this.zzkt.zzb(this);
    }

    public final boolean isInitialized() {
        return this.zzce;
    }

    public final void zzah() {
        if (!isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzai() {
        if (!this.zzce) {
            zzak();
            this.zzkt.zzgh();
            this.zzce = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean zzak();
}
