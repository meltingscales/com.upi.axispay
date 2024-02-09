package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Api;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zztf extends zztj {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;

    public /* synthetic */ zztf(byte[] bArr, int i, int i2, boolean z, zzte zzteVar) {
        super(null);
        this.zzh = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zzb(int i) throws zzvk {
        int i2 = this.zzh;
        this.zzh = 0;
        int i3 = this.zzf + this.zzg;
        this.zzf = i3;
        if (i3 > 0) {
            this.zzg = i3;
            this.zzf = 0;
        } else {
            this.zzg = 0;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final int zzc() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final zztd zzd() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final String zze() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final String zzf() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final void zzg(int i) throws zzvk {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final void zzh(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzi() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzj() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zztj
    public final boolean zzk(int i) throws IOException {
        throw null;
    }
}
