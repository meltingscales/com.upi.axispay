package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcs implements zzcp {
    public static zzcs zzzq;
    private final Context zzno;

    private zzcs(Context context) {
        this.zzno = context;
        context.getContentResolver().registerContentObserver(zzci.CONTENT_URI, true, new zzcu(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzcp
    /* renamed from: zzcb */
    public final String zzca(final String str) {
        if (this.zzno == null) {
            return null;
        }
        try {
            return (String) zzcq.zza(new zzcr(this, str) { // from class: com.google.android.gms.internal.measurement.zzct
                private final zzcs zzzr;
                private final String zzzs;

                {
                    this.zzzr = this;
                    this.zzzs = str;
                }

                @Override // com.google.android.gms.internal.measurement.zzcr
                public final Object zzjn() {
                    return this.zzzr.zzcc(this.zzzs);
                }
            });
        } catch (SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    public static zzcs zzp(Context context) {
        zzcs zzcsVar;
        synchronized (zzcs.class) {
            if (zzzq == null) {
                zzzq = v8.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzcs(context) : new zzcs();
            }
            zzcsVar = zzzq;
        }
        return zzcsVar;
    }

    public final /* synthetic */ String zzcc(String str) {
        return zzci.zza(this.zzno.getContentResolver(), str, (String) null);
    }

    private zzcs() {
        this.zzno = null;
    }
}
