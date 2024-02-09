package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzdc {
    public final Context zzno;
    public String zznp;
    public String zznq;
    public Boolean zzoj;
    public com.google.android.gms.internal.measurement.zzy zzpe;
    public long zzu;
    public boolean zzv;
    public String zzx;

    @VisibleForTesting
    public zzdc(Context context, com.google.android.gms.internal.measurement.zzy zzyVar) {
        this.zzv = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zzno = applicationContext;
        if (zzyVar != null) {
            this.zzpe = zzyVar;
            this.zzx = zzyVar.zzx;
            this.zznp = zzyVar.origin;
            this.zznq = zzyVar.zzw;
            this.zzv = zzyVar.zzv;
            this.zzu = zzyVar.zzu;
            Bundle bundle = zzyVar.zzy;
            if (bundle != null) {
                this.zzoj = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
