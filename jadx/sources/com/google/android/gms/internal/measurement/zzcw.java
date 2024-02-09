package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzcw<T> {
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzno;
    private static boolean zzzu;
    private final String name;
    private volatile T zzje;
    private final zzdc zzzv;
    private final T zzzw;
    private volatile int zzzy;
    private static final Object zzzt = new Object();
    private static final AtomicInteger zzzx = new AtomicInteger();

    private zzcw(zzdc zzdcVar, String str, T t) {
        Uri uri;
        this.zzzy = -1;
        uri = zzdcVar.zzaaa;
        if (uri != null) {
            this.zzzv = zzdcVar;
            this.name = str;
            this.zzzw = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static zzcw<Long> zza(zzdc zzdcVar, String str, long j) {
        return new zzcx(zzdcVar, str, Long.valueOf(j));
    }

    private final String zzce(String str) {
        if (str == null || !str.isEmpty()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(this.name);
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return this.name;
    }

    public static void zzjp() {
        zzzx.incrementAndGet();
    }

    @Nullable
    private final T zzjr() {
        Uri uri;
        zzcp zze;
        Object zzca;
        Uri uri2;
        String str = (String) zzcs.zzp(zzno).zzca("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
        if (!(str != null && zzci.zzyv.matcher(str).matches())) {
            uri = this.zzzv.zzaaa;
            if (uri != null) {
                ContentResolver contentResolver = zzno.getContentResolver();
                uri2 = this.zzzv.zzaaa;
                zze = zzcl.zza(contentResolver, uri2);
            } else {
                zze = zzdd.zze(zzno, null);
            }
            if (zze != null && (zzca = zze.zzca(zzjq())) != null) {
                return zzc(zzca);
            }
        } else {
            String valueOf = String.valueOf(zzjq());
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
        }
        return null;
    }

    @Nullable
    private final T zzjs() {
        String str;
        zzcs zzp = zzcs.zzp(zzno);
        str = this.zzzv.zzaab;
        Object zzca = zzp.zzca(zzce(str));
        if (zzca != null) {
            return zzc(zzca);
        }
        return null;
    }

    public static void zzq(Context context) {
        synchronized (zzzt) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (zzno != context) {
                synchronized (zzcl.class) {
                    zzcl.zzzi.clear();
                }
                synchronized (zzdd.class) {
                    zzdd.zzaai.clear();
                }
                synchronized (zzcs.class) {
                    zzcs.zzzq = null;
                }
                zzzx.incrementAndGet();
                zzno = context;
            }
        }
    }

    public final T get() {
        int i = zzzx.get();
        if (this.zzzy < i) {
            synchronized (this) {
                if (this.zzzy < i) {
                    if (zzno != null) {
                        T zzjr = zzjr();
                        if (zzjr == null && (zzjr = zzjs()) == null) {
                            zzjr = this.zzzw;
                        }
                        this.zzje = zzjr;
                        this.zzzy = i;
                    } else {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                }
            }
        }
        return this.zzje;
    }

    public final T getDefaultValue() {
        return this.zzzw;
    }

    public abstract T zzc(Object obj);

    public final String zzjq() {
        String str;
        str = this.zzzv.zzaac;
        return zzce(str);
    }

    public static zzcw<Integer> zza(zzdc zzdcVar, String str, int i) {
        return new zzcy(zzdcVar, str, Integer.valueOf(i));
    }

    public static zzcw<Boolean> zza(zzdc zzdcVar, String str, boolean z) {
        return new zzcz(zzdcVar, str, Boolean.valueOf(z));
    }

    public static zzcw<Double> zza(zzdc zzdcVar, String str, double d) {
        return new zzda(zzdcVar, str, Double.valueOf(d));
    }

    public static zzcw<String> zza(zzdc zzdcVar, String str, String str2) {
        return new zzdb(zzdcVar, str, str2);
    }

    public /* synthetic */ zzcw(zzdc zzdcVar, String str, Object obj, zzcx zzcxVar) {
        this(zzdcVar, str, obj);
    }
}
