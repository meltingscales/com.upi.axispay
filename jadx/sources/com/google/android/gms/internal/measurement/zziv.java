package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zziv {
    public volatile int zzanm = -1;

    public static final <T extends zziv> T zza(T t, byte[] bArr) throws zziu {
        return (T) zza(t, bArr, 0, bArr.length);
    }

    public static final byte[] zzb(zziv zzivVar) {
        int zzly = zzivVar.zzly();
        byte[] bArr = new byte[zzly];
        try {
            zzin zzk = zzin.zzk(bArr, 0, zzly);
            zzivVar.zza(zzk);
            zzk.zzlk();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public String toString() {
        return zziw.zzc(this);
    }

    public abstract zziv zza(zzim zzimVar) throws IOException;

    public void zza(zzin zzinVar) throws IOException {
    }

    public int zzja() {
        return 0;
    }

    public final int zzly() {
        int zzja = zzja();
        this.zzanm = zzja;
        return zzja;
    }

    @Override // 
    /* renamed from: zzpe */
    public zziv clone() throws CloneNotSupportedException {
        return (zziv) super.clone();
    }

    private static final <T extends zziv> T zza(T t, byte[] bArr, int i, int i2) throws zziu {
        try {
            zzim zzj = zzim.zzj(bArr, 0, i2);
            t.zza(zzj);
            zzj.zzu(0);
            return t;
        } catch (zziu e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }
}
