package com.google.firebase.crash;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzi implements BackgroundDetector.BackgroundStateChangeListener {
    public zzi(zzh zzhVar) {
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        FirebaseCrash.zza().zza(!z);
    }
}
