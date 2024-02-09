package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzh {
    private final zzk zza;
    private final Clock zzb;
    private boolean zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private final Map<Class<? extends zzj>, zzj> zzj;
    private final List<zzt> zzk;

    public zzh(zzh zzhVar) {
        this.zza = zzhVar.zza;
        this.zzb = zzhVar.zzb;
        this.zzd = zzhVar.zzd;
        this.zze = zzhVar.zze;
        this.zzf = zzhVar.zzf;
        this.zzg = zzhVar.zzg;
        this.zzh = zzhVar.zzh;
        this.zzk = new ArrayList(zzhVar.zzk);
        this.zzj = new HashMap(zzhVar.zzj.size());
        for (Map.Entry<Class<? extends zzj>, zzj> entry : zzhVar.zzj.entrySet()) {
            zzj zzn = zzn(entry.getKey());
            entry.getValue().zzc(zzn);
            this.zzj.put(entry.getKey(), zzn);
        }
    }

    @TargetApi(19)
    private static <T extends zzj> T zzn(Class<T> cls) {
        try {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (!(e instanceof InstantiationException)) {
                if (!(e instanceof IllegalAccessException)) {
                    if (Build.VERSION.SDK_INT >= 19 && (e instanceof ReflectiveOperationException)) {
                        throw new IllegalArgumentException("Linkage exception", e);
                    }
                    throw new RuntimeException(e);
                }
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            }
            throw new IllegalArgumentException("dataType doesn't have default constructor", e);
        }
    }

    @VisibleForTesting
    public final long zza() {
        return this.zzd;
    }

    @VisibleForTesting
    public final <T extends zzj> T zzb(Class<T> cls) {
        T t = (T) this.zzj.get(cls);
        if (t == null) {
            T t2 = (T) zzn(cls);
            this.zzj.put(cls, t2);
            return t2;
        }
        return t;
    }

    @VisibleForTesting
    public final <T extends zzj> T zzc(Class<T> cls) {
        return (T) this.zzj.get(cls);
    }

    public final zzk zzd() {
        return this.zza;
    }

    @VisibleForTesting
    public final Collection<zzj> zze() {
        return this.zzj.values();
    }

    public final List<zzt> zzf() {
        return this.zzk;
    }

    @VisibleForTesting
    public final void zzg(zzj zzjVar) {
        Preconditions.checkNotNull(zzjVar);
        Class<?> cls = zzjVar.getClass();
        if (cls.getSuperclass() == zzj.class) {
            zzjVar.zzc(zzb(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    @VisibleForTesting
    public final void zzh() {
        this.zzi = true;
    }

    @VisibleForTesting
    public final void zzi() {
        this.zzf = this.zzb.elapsedRealtime();
        long j = this.zze;
        if (j != 0) {
            this.zzd = j;
        } else {
            this.zzd = this.zzb.currentTimeMillis();
        }
        this.zzc = true;
    }

    @VisibleForTesting
    public final void zzj(long j) {
        this.zze = j;
    }

    @VisibleForTesting
    public final void zzk() {
        this.zza.zzm().zzk(this);
    }

    @VisibleForTesting
    public final boolean zzl() {
        return this.zzi;
    }

    @VisibleForTesting
    public final boolean zzm() {
        return this.zzc;
    }

    @VisibleForTesting
    public zzh(zzk zzkVar, Clock clock) {
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotNull(clock);
        this.zza = zzkVar;
        this.zzb = clock;
        this.zzg = 1800000L;
        this.zzh = 3024000000L;
        this.zzj = new HashMap();
        this.zzk = new ArrayList();
    }
}
