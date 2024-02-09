package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AxisPay */
@TargetApi(24)
/* loaded from: classes.dex */
public final class zzh {
    private static final Method zzf = zza();
    private static final Method zzg = zzb();
    private static volatile zzj zzh = zzi.zzi;
    private final JobScheduler zze;

    private zzh(JobScheduler jobScheduler) {
        this.zze = jobScheduler;
    }

    private static Method zza() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    private static Method zzb() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    private static int zzc() {
        Method method = zzg;
        if (method != null) {
            try {
                return ((Integer) method.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }

    public static final /* synthetic */ boolean zzd() {
        return false;
    }

    private final int zza(JobInfo jobInfo, String str, int i, String str2) {
        Method method = zzf;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.zze, jobInfo, str, Integer.valueOf(i), str2)).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.zze.schedule(jobInfo);
    }

    public static int zza(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (zzf != null && zzh.zze() && context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
            return new zzh(jobScheduler).zza(jobInfo, str, zzc(), str2);
        }
        return jobScheduler.schedule(jobInfo);
    }
}
