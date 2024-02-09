package com.google.android.gms.internal.measurement;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdx {
    private final byte[] buffer;
    private final zzeg zzacf;

    private zzdx(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzacf = zzeg.zzh(bArr);
    }

    public final zzdp zzkh() {
        this.zzacf.zzlk();
        return new zzdz(this.buffer);
    }

    public final zzeg zzki() {
        return this.zzacf;
    }

    public /* synthetic */ zzdx(int i, zzdq zzdqVar) {
        this(i);
    }
}
