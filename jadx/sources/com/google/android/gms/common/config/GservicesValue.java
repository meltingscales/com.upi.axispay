package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: AxisPay */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class GservicesValue<T> {
    private static final Object zzc = new Object();
    public final String zza;
    public final T zzb;
    private T zzd = null;

    public GservicesValue(String str, T t) {
        this.zza = str;
        this.zzb = t;
    }

    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (zzc) {
        }
        return false;
    }

    @KeepForSdk
    public static GservicesValue<Float> value(String str, Float f) {
        return new zzd(str, f);
    }

    @KeepForSdk
    public static GservicesValue<Integer> value(String str, Integer num) {
        return new zzc(str, num);
    }

    @KeepForSdk
    public static GservicesValue<Long> value(String str, Long l) {
        return new zzb(str, l);
    }

    @KeepForSdk
    public static GservicesValue<String> value(String str, String str2) {
        return new zze(str, str2);
    }

    @KeepForSdk
    public static GservicesValue<Boolean> value(String str, boolean z) {
        return new zza(str, Boolean.valueOf(z));
    }

    @KeepForSdk
    public final T get() {
        T t = this.zzd;
        if (t != null) {
            return t;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = zzc;
        synchronized (obj) {
        }
        synchronized (obj) {
        }
        try {
            return zza(this.zza);
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            T zza = zza(this.zza);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @VisibleForTesting
    @KeepForSdk
    public void override(T t) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzd = t;
        Object obj = zzc;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    @VisibleForTesting
    @KeepForSdk
    public void resetOverride() {
        this.zzd = null;
    }

    public abstract T zza(String str);
}
