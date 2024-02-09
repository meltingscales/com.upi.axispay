package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public final class InstallReferrerReceiver extends CampaignTrackingReceiver {
    @Override // com.google.android.gms.analytics.CampaignTrackingReceiver
    public final void zza(Context context, String str) {
        zzcx.zzd(str);
        zzcx.zze(context, str);
    }
}
