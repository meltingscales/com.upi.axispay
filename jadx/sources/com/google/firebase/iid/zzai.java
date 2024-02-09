package com.google.firebase.iid;

import android.os.Bundle;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzai extends zzal<Void> {
    public zzai(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // com.google.firebase.iid.zzal
    public final boolean zzab() {
        return true;
    }

    @Override // com.google.firebase.iid.zzal
    public final void zzb(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            finish(null);
        } else {
            zza(new zzak(4, "Invalid response to one way request"));
        }
    }
}
