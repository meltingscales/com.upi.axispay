package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbc implements Runnable {
    private final String packageName;
    private final URL url;
    private final byte[] zzko;
    private final zzba zzkp;
    private final Map<String, String> zzkq;
    private final /* synthetic */ zzay zzkr;

    public zzbc(zzay zzayVar, String str, URL url, byte[] bArr, Map<String, String> map, zzba zzbaVar) {
        this.zzkr = zzayVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzbaVar);
        this.url = url;
        this.zzko = bArr;
        this.zzkp = zzbaVar;
        this.packageName = str;
        this.zzkq = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzbc.run():void");
    }
}
