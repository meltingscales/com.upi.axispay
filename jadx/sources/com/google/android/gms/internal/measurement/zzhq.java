package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzhq<T, B> {
    public abstract void zza(B b, int i, long j);

    public abstract void zza(B b, int i, zzdp zzdpVar);

    public abstract void zza(B b, int i, T t);

    public abstract void zza(T t, zzil zzilVar) throws IOException;

    public abstract boolean zza(zzgx zzgxVar);

    public final boolean zza(B b, zzgx zzgxVar) throws IOException {
        int tag = zzgxVar.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            zza((zzhq<T, B>) b, i, zzgxVar.zzkl());
            return true;
        } else if (i2 == 1) {
            zzb(b, i, zzgxVar.zzkn());
            return true;
        } else if (i2 == 2) {
            zza((zzhq<T, B>) b, i, zzgxVar.zzkr());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzc(b, i, zzgxVar.zzko());
                    return true;
                }
                throw zzfh.zzmz();
            }
            return false;
        } else {
            B zzoq = zzoq();
            int i3 = 4 | (i << 3);
            while (zzgxVar.zzlh() != Integer.MAX_VALUE && zza((zzhq<T, B>) zzoq, zzgxVar)) {
            }
            if (i3 == zzgxVar.getTag()) {
                zza((zzhq<T, B>) b, i, (int) zzp(zzoq));
                return true;
            }
            throw zzfh.zzmy();
        }
    }

    public abstract void zzb(B b, int i, long j);

    public abstract void zzc(B b, int i, int i2);

    public abstract void zzc(T t, zzil zzilVar) throws IOException;

    public abstract void zze(Object obj, T t);

    public abstract void zzf(Object obj, B b);

    public abstract T zzg(T t, T t2);

    public abstract void zzi(Object obj);

    public abstract B zzoq();

    public abstract T zzp(B b);

    public abstract int zzs(T t);

    public abstract T zzw(Object obj);

    public abstract B zzx(Object obj);

    public abstract int zzy(T t);
}
