package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzbd extends BroadcastReceiver {
    @VisibleForTesting
    private static final String zzks = zzbd.class.getName();
    private final zzft zzkt;
    private boolean zzku;
    private boolean zzkv;

    public zzbd(zzft zzftVar) {
        Preconditions.checkNotNull(zzftVar);
        this.zzkt = zzftVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.zzkt.zzfy();
        String action = intent.getAction();
        this.zzkt.zzad().zzdi().zza("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zzdl = this.zzkt.zzfu().zzdl();
            if (this.zzkv != zzdl) {
                this.zzkv = zzdl;
                this.zzkt.zzac().zza(new zzbe(this, zzdl));
                return;
            }
            return;
        }
        this.zzkt.zzad().zzdd().zza("NetworkBroadcastReceiver received unknown action", action);
    }

    public final void unregister() {
        this.zzkt.zzfy();
        this.zzkt.zzac().zzq();
        this.zzkt.zzac().zzq();
        if (this.zzku) {
            this.zzkt.zzad().zzdi().zzaq("Unregistering connectivity change receiver");
            this.zzku = false;
            this.zzkv = false;
            try {
                this.zzkt.getContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.zzkt.zzad().zzda().zza("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void zzdq() {
        this.zzkt.zzfy();
        this.zzkt.zzac().zzq();
        if (this.zzku) {
            return;
        }
        this.zzkt.getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzkv = this.zzkt.zzfu().zzdl();
        this.zzkt.zzad().zzdi().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzkv));
        this.zzku = true;
    }
}
