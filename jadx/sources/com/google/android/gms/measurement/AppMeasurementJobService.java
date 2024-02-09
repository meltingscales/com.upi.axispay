package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfe;
import com.google.android.gms.measurement.internal.zzfi;

/* compiled from: AxisPay */
@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements zzfi {
    private zzfe<AppMeasurementJobService> zzp;

    private final zzfe<AppMeasurementJobService> zzg() {
        if (this.zzp == null) {
            this.zzp = new zzfe<>(this);
        }
        return this.zzp;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zzg().onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zzg().onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        zzg().onRebind(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return zzg().onStartJob(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return zzg().onUnbind(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzfi
    public final void zza(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzfi
    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzfi
    @TargetApi(24)
    public final void zza(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
