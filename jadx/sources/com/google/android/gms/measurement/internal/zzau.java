package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzau extends zzcu {
    private char zzjp;
    private String zzjq;
    private final zzaw zzjr;
    private final zzaw zzjs;
    private final zzaw zzjt;
    private final zzaw zzju;
    private final zzaw zzjv;
    private final zzaw zzjw;
    private final zzaw zzjx;
    private final zzaw zzjy;
    private final zzaw zzjz;
    private long zzt;

    public zzau(zzby zzbyVar) {
        super(zzbyVar);
        this.zzjp = (char) 0;
        this.zzt = -1L;
        this.zzjr = new zzaw(this, 6, false, false);
        this.zzjs = new zzaw(this, 6, true, false);
        this.zzjt = new zzaw(this, 6, false, true);
        this.zzju = new zzaw(this, 5, false, false);
        this.zzjv = new zzaw(this, 5, true, false);
        this.zzjw = new zzaw(this, 5, false, true);
        this.zzjx = new zzaw(this, 4, false, false);
        this.zzjy = new zzaw(this, 3, false, false);
        this.zzjz = new zzaw(this, 2, false, false);
    }

    public static Object zzao(String str) {
        if (str == null) {
            return null;
        }
        return new zzax(str);
    }

    private static String zzap(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    @VisibleForTesting
    private final String zzdj() {
        String str;
        synchronized (this) {
            if (this.zzjq == null) {
                if (this.zzl.zzeo() != null) {
                    this.zzjq = this.zzl.zzeo();
                } else {
                    this.zzjq = zzt.zzbo();
                }
            }
            str = this.zzjq;
        }
        return str;
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @VisibleForTesting
    public final boolean isLoggable(int i) {
        return Log.isLoggable(zzdj(), i);
    }

    public final void zza(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && isLoggable(i)) {
            zza(i, zza(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzbt zzek = this.zzl.zzek();
        if (zzek == null) {
            zza(6, "Scheduler not set. Not logging error/warn");
        } else if (!zzek.isInitialized()) {
            zza(6, "Scheduler not initialized. Not logging error/warn");
        } else {
            if (i < 0) {
                i = 0;
            }
            if (i >= 9) {
                i = 8;
            }
            zzek.zza(new zzav(this, i, str, obj, obj2, obj3));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzas zzaa() {
        return super.zzaa();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzgd zzab() {
        return super.zzab();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzbt zzac() {
        return super.zzac();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzau zzad() {
        return super.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzbf zzae() {
        return super.zzae();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzt zzaf() {
        return super.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzq zzag() {
        return super.zzag();
    }

    @Override // com.google.android.gms.measurement.internal.zzcu
    public final boolean zzak() {
        return false;
    }

    public final zzaw zzda() {
        return this.zzjr;
    }

    public final zzaw zzdb() {
        return this.zzjs;
    }

    public final zzaw zzdc() {
        return this.zzjt;
    }

    public final zzaw zzdd() {
        return this.zzju;
    }

    public final zzaw zzde() {
        return this.zzjv;
    }

    public final zzaw zzdf() {
        return this.zzjw;
    }

    public final zzaw zzdg() {
        return this.zzjx;
    }

    public final zzaw zzdh() {
        return this.zzjy;
    }

    public final zzaw zzdi() {
        return this.zzjz;
    }

    public final String zzdk() {
        Pair<String, Long> zzeb = zzae().zzla.zzeb();
        if (zzeb == null || zzeb == zzbf.zzky) {
            return null;
        }
        String valueOf = String.valueOf(zzeb.second);
        String str = (String) zzeb.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzp() {
        super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzq() {
        super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzad zzy() {
        return super.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Clock zzz() {
        return super.zzz();
    }

    @VisibleForTesting
    public final void zza(int i, String str) {
        Log.println(i, zzdj(), str);
    }

    public static String zza(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String zza = zza(z, obj);
        String zza2 = zza(z, obj2);
        String zza3 = zza(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zza)) {
            sb.append(str2);
            sb.append(zza);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zza2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(zza2);
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb.append(str3);
            sb.append(zza3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    private static String zza(boolean z, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str2 = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str2.length() + 43 + str2.length());
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String zzap = zzap(zzby.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzap(className).equals(zzap)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (!(obj instanceof zzax)) {
                return z ? "-" : String.valueOf(obj);
            } else {
                str = ((zzax) obj).zzki;
                return str;
            }
        }
    }
}
