package com.google.android.gms.measurement.internal;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzf extends zze {
    private boolean zzce;

    public zzf(zzby zzbyVar) {
        super(zzbyVar);
        this.zzl.zzb(this);
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
            if (zzak()) {
                return;
            }
            this.zzl.zzes();
            this.zzce = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void zzaj() {
        if (!this.zzce) {
            zzal();
            this.zzl.zzes();
            this.zzce = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean zzak();

    public void zzal() {
    }
}
