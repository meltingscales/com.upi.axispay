package com.google.android.gms.internal.vision;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzlu<T, B> {
    public abstract B zza();

    public abstract T zza(B b);

    public abstract void zza(B b, int i, int i2);

    public abstract void zza(B b, int i, long j);

    public abstract void zza(B b, int i, zzht zzhtVar);

    public abstract void zza(B b, int i, T t);

    public abstract void zza(T t, zzmr zzmrVar) throws IOException;

    public abstract void zza(Object obj, T t);

    public abstract boolean zza(zzld zzldVar);

    public final boolean zza(B b, zzld zzldVar) throws IOException {
        int zzb = zzldVar.zzb();
        int i = zzb >>> 3;
        int i2 = zzb & 7;
        if (i2 == 0) {
            zza((zzlu<T, B>) b, i, zzldVar.zzg());
            return true;
        } else if (i2 == 1) {
            zzb(b, i, zzldVar.zzi());
            return true;
        } else if (i2 == 2) {
            zza((zzlu<T, B>) b, i, zzldVar.zzn());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zza((zzlu<T, B>) b, i, zzldVar.zzj());
                    return true;
                }
                throw zzjk.zzf();
            }
            return false;
        } else {
            B zza = zza();
            int i3 = 4 | (i << 3);
            while (zzldVar.zza() != Integer.MAX_VALUE && zza((zzlu<T, B>) zza, zzldVar)) {
            }
            if (i3 == zzldVar.zzb()) {
                zza((zzlu<T, B>) b, i, (int) zza((zzlu<T, B>) zza));
                return true;
            }
            throw zzjk.zze();
        }
    }

    public abstract T zzb(Object obj);

    public abstract void zzb(B b, int i, long j);

    public abstract void zzb(T t, zzmr zzmrVar) throws IOException;

    public abstract void zzb(Object obj, B b);

    public abstract B zzc(Object obj);

    public abstract T zzc(T t, T t2);

    public abstract void zzd(Object obj);

    public abstract int zze(T t);

    public abstract int zzf(T t);
}
