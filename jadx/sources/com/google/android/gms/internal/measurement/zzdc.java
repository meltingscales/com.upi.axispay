package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdc {
    private final Uri zzaaa;
    private final String zzaab;
    private final String zzaac;
    private final boolean zzaad;
    private final boolean zzaae;
    private final boolean zzaaf;
    private final boolean zzaag;
    @Nullable
    private final zzdf<Context, Boolean> zzaah;
    private final String zzzz;

    public zzdc(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzcw<Integer> zza(String str, int i) {
        return zzcw.zzb(this, str, i);
    }

    public final zzcw<Boolean> zzb(String str, boolean z) {
        return zzcw.zzb(this, str, z);
    }

    public final zzcw<Long> zze(String str, long j) {
        return zzcw.zzb(this, str, j);
    }

    public final zzcw<String> zzt(String str, String str2) {
        return zzcw.zzb(this, str, str2);
    }

    private zzdc(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable zzdf<Context, Boolean> zzdfVar) {
        this.zzzz = null;
        this.zzaaa = uri;
        this.zzaab = str2;
        this.zzaac = str3;
        this.zzaad = false;
        this.zzaae = false;
        this.zzaaf = false;
        this.zzaag = false;
        this.zzaah = null;
    }

    public final zzcw<Double> zza(String str, double d) {
        return zzcw.zzb(this, str, d);
    }
}
