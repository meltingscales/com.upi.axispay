package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzct implements zzcv {
    public final zzby zzl;

    public zzct(zzby zzbyVar) {
        Preconditions.checkNotNull(zzbyVar);
        this.zzl = zzbyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public Context getContext() {
        return this.zzl.getContext();
    }

    public zzas zzaa() {
        return this.zzl.zzaa();
    }

    public zzgd zzab() {
        return this.zzl.zzab();
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public zzbt zzac() {
        return this.zzl.zzac();
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public zzau zzad() {
        return this.zzl.zzad();
    }

    public zzbf zzae() {
        return this.zzl.zzae();
    }

    public zzt zzaf() {
        return this.zzl.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public zzq zzag() {
        return this.zzl.zzag();
    }

    public void zzn() {
        this.zzl.zzn();
    }

    public void zzo() {
        this.zzl.zzo();
    }

    public void zzp() {
        this.zzl.zzac().zzp();
    }

    public void zzq() {
        this.zzl.zzac().zzq();
    }

    public zzad zzy() {
        return this.zzl.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzcv
    public Clock zzz() {
        return this.zzl.zzz();
    }
}
