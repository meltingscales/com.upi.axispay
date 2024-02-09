package com.google.firebase.crash;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.internal.crash.zzm;
import com.google.android.gms.internal.crash.zzo;
import com.google.android.gms.internal.crash.zzp;
import com.google.android.gms.internal.crash.zzs;
import com.google.firebase.FirebaseApp;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzf {
    private final Context zzf;
    private final FirebaseApp zzh;

    public zzf(FirebaseApp firebaseApp) {
        this.zzf = firebaseApp.getApplicationContext();
        this.zzh = firebaseApp;
    }

    public final zzm zzj() {
        zzs.initialize(this.zzf);
        zzm zzmVar = null;
        if (zzs.zzap.get().booleanValue()) {
            try {
                zzo.zzl().init(this.zzf);
                zzmVar = zzo.zzl().zzm();
                String valueOf = String.valueOf(zzo.zzl());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append("FirebaseCrash reporting loaded - ");
                sb.append(valueOf);
                Log.i("FirebaseCrash", sb.toString());
                return zzmVar;
            } catch (zzp e) {
                Log.e("FirebaseCrash", "Failed to load crash reporting", e);
                CrashUtils.addDynamiteErrorToDropBox(this.zzf, e);
                return zzmVar;
            }
        }
        Log.w("FirebaseCrash", "Crash reporting is disabled");
        return null;
    }
}
