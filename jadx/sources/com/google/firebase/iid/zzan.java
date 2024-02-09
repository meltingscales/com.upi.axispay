package com.google.firebase.iid;

import android.os.Bundle;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzan extends zzal<Bundle> {
    public zzan(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.google.firebase.iid.zzal
    public final boolean zzab() {
        return false;
    }

    @Override // com.google.firebase.iid.zzal
    public final void zzb(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        finish(bundle2);
    }
}
