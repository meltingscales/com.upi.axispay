package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbi extends zzbu {
    private static final String zza = com.google.android.gms.internal.gtm.zza.DEVICE_ID.toString();
    private final Context zzb;

    public zzbi(Context context) {
        super(zza, new String[0]);
        this.zzb = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbu
    public final com.google.android.gms.internal.gtm.zzak zza(Map<String, com.google.android.gms.internal.gtm.zzak> map) {
        String string = Settings.Secure.getString(this.zzb.getContentResolver(), "android_id");
        return string == null ? zzfv.zzb() : zzfv.zzc(string);
    }

    @Override // com.google.android.gms.tagmanager.zzbu
    public final boolean zzb() {
        return true;
    }
}
