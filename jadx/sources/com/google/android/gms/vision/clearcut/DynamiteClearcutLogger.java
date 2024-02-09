package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.zze;
import com.google.android.gms.internal.vision.zzfi;
import com.google.android.gms.internal.vision.zzi;
import com.google.android.gms.vision.L;
import java.util.concurrent.ExecutorService;

/* compiled from: AxisPay */
@Keep
/* loaded from: classes.dex */
public class DynamiteClearcutLogger {
    private static final ExecutorService zza = zze.zza().zza(2, zzi.zza);
    private zzb zzb = new zzb(0.03333333333333333d);
    private VisionClearcutLogger zzc;

    public DynamiteClearcutLogger(@RecentlyNonNull Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i, zzfi.zzo zzoVar) {
        if (i == 3 && !this.zzb.zza()) {
            L.v("Skipping image analysis log due to rate limiting", new Object[0]);
        } else {
            zza.execute(new zza(this, i, zzoVar));
        }
    }
}
