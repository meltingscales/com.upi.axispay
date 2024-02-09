package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzbo;
import com.google.android.gms.measurement.internal.zzbr;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends we implements zzbr {
    private zzbo zzo;

    @Override // com.google.android.gms.measurement.internal.zzbr
    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzbr
    public final void doStartService(Context context, Intent intent) {
        we.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.zzo == null) {
            this.zzo = new zzbo(this);
        }
        this.zzo.onReceive(context, intent);
    }
}
