package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.Nullable;

/* compiled from: AxisPay */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzay extends BroadcastReceiver {
    @Nullable
    private zzaz zzdp;

    public zzay(zzaz zzazVar) {
        this.zzdp = zzazVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzaz zzazVar = this.zzdp;
        if (zzazVar != null && zzazVar.zzao()) {
            FirebaseInstanceId.zzm();
            FirebaseInstanceId.zza(this.zzdp, 0L);
            this.zzdp.getContext().unregisterReceiver(this);
            this.zzdp = null;
        }
    }

    public final void zzam() {
        FirebaseInstanceId.zzm();
        this.zzdp.getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
}
