package com.google.firebase.crash;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.crash.zzm;
import com.google.android.gms.internal.crash.zzq;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.FirebaseInstanceId;
import java.lang.Thread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AxisPay */
@UsedByReflection("FirebaseApp")
@Deprecated
/* loaded from: classes.dex */
public class FirebaseCrash {
    private static volatile FirebaseCrash zze;
    private final AtomicReference<zzd> zzd;
    private final Context zzf;
    private final ExecutorService zzg;
    private final FirebaseApp zzh;
    private final zzb zzi;
    private final CountDownLatch zzj;
    private zzq zzk;
    private String zzl;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface zza {
        zzm zzh();
    }

    /* compiled from: AxisPay */
    @VisibleForTesting
    /* loaded from: classes.dex */
    public class zzc implements Thread.UncaughtExceptionHandler {
        private final Thread.UncaughtExceptionHandler zzt;

        public zzc(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.zzt = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            Log.e("UncaughtException", "", th);
            if (!FirebaseCrash.this.zzc()) {
                try {
                    FirebaseCrash.this.zzg();
                    Future<?> zza = FirebaseCrash.this.zza(th);
                    if (zza != null) {
                        zza.get(10000L, TimeUnit.MILLISECONDS);
                    }
                } catch (Exception e) {
                    Log.e("UncaughtException", "Ouch! My own exception handler threw an exception.", e);
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zzt;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum zzd {
        UNSPECIFIED,
        ENABLED,
        DISABLED
    }

    @Keep
    public FirebaseCrash(FirebaseApp firebaseApp) {
        this.zzd = new AtomicReference<>(zzd.UNSPECIFIED);
        this.zzi = new zzb(null);
        this.zzj = new CountDownLatch(1);
        throw new IllegalStateException("This method shouldn't be invoked");
    }

    @UsedByReflection("FirebaseApp")
    @Keep
    public static FirebaseCrash getInstance(FirebaseApp firebaseApp) {
        return (FirebaseCrash) firebaseApp.get(FirebaseCrash.class);
    }

    public static boolean isCrashCollectionEnabled() {
        return zza().zzd();
    }

    public static void log(String str) {
        zza().zza(str);
    }

    public static void logcat(int i, String str, String str2) {
        FirebaseCrash zza2 = zza();
        if (str2 != null) {
            if (str == null) {
                str = "";
            }
            Log.println(i, str, str2);
            zza2.zza(str2);
        }
    }

    public static void report(Throwable th) {
        FirebaseCrash zza2 = zza();
        if (th == null || zza2.zzc()) {
            return;
        }
        zza2.zzg();
        zza2.zzg.submit(new com.google.android.gms.internal.crash.zze(zza2.zzf, zza2.zzi, th, zza2.zzk));
    }

    public static void setCrashCollectionEnabled(boolean z) {
        zza().zza(z, true);
    }

    public static FirebaseCrash zza() {
        if (zze == null) {
            zze = getInstance(FirebaseApp.getInstance());
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb() {
        try {
            this.zzj.await(20000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrash", "Failed waiting for crash api to load.", e);
        }
    }

    @VisibleForTesting
    private final boolean zzd() {
        if (zzc()) {
            return false;
        }
        zzb();
        zzd zzdVar = this.zzd.get();
        if (this.zzi.zzh() != null) {
            if (zzdVar != zzd.UNSPECIFIED) {
                if (zzdVar == zzd.ENABLED) {
                    return true;
                }
            } else if (FirebaseApp.getInstance().isDataCollectionDefaultEnabled()) {
                return true;
            }
        }
        return false;
    }

    private final zzd zze() {
        SharedPreferences sharedPreferences = this.zzf.getSharedPreferences("FirebaseCrashSharedPrefs", 0);
        try {
            if (sharedPreferences.contains("firebase_crash_collection_enabled")) {
                if (sharedPreferences.getBoolean("firebase_crash_collection_enabled", false)) {
                    return zzd.ENABLED;
                }
                return zzd.DISABLED;
            }
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Unable to access enable value: ".concat(valueOf);
            } else {
                new String("Unable to access enable value: ");
            }
        }
        Boolean zzf = zzf();
        if (zzf == null) {
            return zzd.UNSPECIFIED;
        }
        return zzf.booleanValue() ? zzd.ENABLED : zzd.DISABLED;
    }

    private final Boolean zzf() {
        try {
            Bundle bundle = this.zzf.getPackageManager().getApplicationInfo(this.zzf.getPackageName(), Barcode.ITF).metaData;
            if (bundle.containsKey("firebase_crash_collection_enabled")) {
                return Boolean.valueOf(bundle.getBoolean("firebase_crash_collection_enabled", false));
            }
            return null;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseCrash", valueOf.length() != 0 ? "No crash enable meta data found: ".concat(valueOf) : new String("No crash enable meta data found: "));
            return null;
        }
    }

    @VisibleForTesting
    public final boolean zzc() {
        return this.zzg.isShutdown();
    }

    public final void zzg() {
        if (this.zzl == null && !zzc() && zzd()) {
            String id = FirebaseInstanceId.getInstance().getId();
            this.zzl = id;
            this.zzg.execute(new com.google.android.gms.internal.crash.zzj(this.zzf, this.zzi, id));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class zzb implements zza {
        private final Object zzr;
        private zzm zzs;

        private zzb() {
            this.zzr = new Object();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzm zzmVar) {
            synchronized (this.zzr) {
                this.zzs = zzmVar;
            }
        }

        @Override // com.google.firebase.crash.FirebaseCrash.zza
        public final zzm zzh() {
            zzm zzmVar;
            synchronized (this.zzr) {
                zzmVar = this.zzs;
            }
            return zzmVar;
        }

        public /* synthetic */ zzb(com.google.firebase.crash.zzd zzdVar) {
            this();
        }
    }

    public final void zza(zzm zzmVar) {
        zzq zzqVar;
        if (zzmVar == null) {
            this.zzg.shutdownNow();
        } else {
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.zzh.get(AnalyticsConnector.class);
            if (analyticsConnector == null) {
                Log.w("FirebaseCrashAnalytics", "Unable to log event, missing Google Analytics for Firebase library");
                zzqVar = null;
            } else {
                zzqVar = new zzq(analyticsConnector);
            }
            this.zzk = zzqVar;
            this.zzi.zzb(zzmVar);
            if (this.zzk != null && !zzc()) {
                this.zzk.zza(this.zzf, this.zzg, this.zzi);
            }
        }
        this.zzj.countDown();
        if (FirebaseApp.getInstance().isDataCollectionDefaultEnabled()) {
            return;
        }
        zza(false, false);
    }

    public FirebaseCrash(FirebaseApp firebaseApp, Subscriber subscriber) {
        this(firebaseApp, subscriber, null);
        zzf zzfVar = new zzf(firebaseApp);
        Thread.setDefaultUncaughtExceptionHandler(new zzc(Thread.getDefaultUncaughtExceptionHandler()));
        zze zzeVar = new zze(this);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        newFixedThreadPool.submit(new zzh(zzfVar, newFixedThreadPool.submit(new zzg(zzfVar)), 10000L, zzeVar));
        newFixedThreadPool.shutdown();
        this.zzg.execute(new com.google.firebase.crash.zzd(this));
    }

    private final synchronized void zza(final boolean z, final boolean z2) {
        if (zzc()) {
            return;
        }
        if (z2 || this.zzd.get() == zzd.UNSPECIFIED) {
            com.google.android.gms.internal.crash.zzi zziVar = new com.google.android.gms.internal.crash.zzi(this.zzf, this.zzi, z);
            zziVar.getTask().addOnSuccessListener(new OnSuccessListener(this, z2, z) { // from class: com.google.firebase.crash.zzc
                private final FirebaseCrash zzn;
                private final boolean zzo;
                private final boolean zzp;

                {
                    this.zzn = this;
                    this.zzo = z2;
                    this.zzp = z;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.zzn.zza(this.zzo, this.zzp, (Void) obj);
                }
            });
            this.zzg.execute(zziVar);
        }
    }

    @VisibleForTesting
    private FirebaseCrash(FirebaseApp firebaseApp, Subscriber subscriber, ExecutorService executorService) {
        AtomicReference<zzd> atomicReference = new AtomicReference<>(zzd.UNSPECIFIED);
        this.zzd = atomicReference;
        this.zzi = new zzb(null);
        this.zzj = new CountDownLatch(1);
        this.zzh = firebaseApp;
        this.zzf = firebaseApp.getApplicationContext();
        atomicReference.set(zze());
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzg = threadPoolExecutor;
        subscriber.subscribe(DataCollectionDefaultChange.class, com.google.firebase.crash.zza.zzm, new EventHandler(this) { // from class: com.google.firebase.crash.zzb
            private final FirebaseCrash zzn;

            {
                this.zzn = this;
            }

            @Override // com.google.firebase.events.EventHandler
            public final void handle(Event event) {
                this.zzn.zza(event);
            }
        });
    }

    private final void zza(String str) {
        if (str == null || zzc()) {
            return;
        }
        this.zzg.submit(new com.google.android.gms.internal.crash.zzf(this.zzf, this.zzi, str));
    }

    public final Future<?> zza(Throwable th) {
        if (th == null || zzc()) {
            return null;
        }
        return this.zzg.submit(new com.google.android.gms.internal.crash.zzg(this.zzf, this.zzi, th, this.zzk));
    }

    public final void zza(boolean z) {
        if (zzc()) {
            return;
        }
        this.zzg.submit(new com.google.android.gms.internal.crash.zzh(this.zzf, this.zzi, z));
    }

    public final /* synthetic */ void zza(boolean z, boolean z2, Void r4) {
        if (z) {
            this.zzd.set(z2 ? zzd.ENABLED : zzd.DISABLED);
            this.zzf.getSharedPreferences("FirebaseCrashSharedPrefs", 0).edit().putBoolean("firebase_crash_collection_enabled", z2).apply();
        }
    }

    public final /* synthetic */ void zza(Event event) {
        zza(((DataCollectionDefaultChange) event.getPayload()).enabled, false);
    }
}
