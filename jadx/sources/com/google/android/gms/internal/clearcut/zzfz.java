package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzfz {
    public volatile int zzrs = -1;

    public static final void zza(zzfz zzfzVar, byte[] bArr, int i, int i2) {
        try {
            zzfs zzh = zzfs.zzh(bArr, 0, i2);
            zzfzVar.zza(zzh);
            zzh.zzem();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public String toString() {
        return zzga.zza(this);
    }

    public void zza(zzfs zzfsVar) throws IOException {
    }

    public final int zzas() {
        int zzen = zzen();
        this.zzrs = zzen;
        return zzen;
    }

    public int zzen() {
        return 0;
    }

    @Override // 
    /* renamed from: zzep */
    public zzfz clone() throws CloneNotSupportedException {
        return (zzfz) super.clone();
    }
}
