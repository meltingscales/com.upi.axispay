package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzgc {
    public final String name;
    public final String origin;
    public final Object value;
    public final String zzcf;
    public final long zzsx;

    public zzgc(String str, String str2, String str3, long j, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(obj);
        this.zzcf = str;
        this.origin = str2;
        this.name = str3;
        this.zzsx = j;
        this.value = obj;
    }
}
