package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FirebaseInstanceId {
    private static final long zzaq = TimeUnit.HOURS.toSeconds(8);
    private static zzax zzar;
    @VisibleForTesting
    @GuardedBy("FirebaseInstanceId.class")
    private static ScheduledThreadPoolExecutor zzas;
    private final Executor zzat;
    private final FirebaseApp zzau;
    private final zzam zzav;
    private MessagingChannel zzaw;
    private final zzar zzax;
    private final zzba zzay;
    @GuardedBy("this")
    private boolean zzaz;
    private final zza zzba;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class zza {
        private final boolean zzbg;
        private final Subscriber zzbh;
        @GuardedBy("this")
        private EventHandler<DataCollectionDefaultChange> zzbi;
        @GuardedBy("this")
        private Boolean zzbj;

        public zza(Subscriber subscriber) {
            this.zzbh = subscriber;
            boolean zzu = zzu();
            this.zzbg = zzu;
            Boolean zzt = zzt();
            this.zzbj = zzt;
            if (zzt == null && zzu) {
                EventHandler<DataCollectionDefaultChange> eventHandler = new EventHandler(this) { // from class: com.google.firebase.iid.zzq
                    private final FirebaseInstanceId.zza zzbo;

                    {
                        this.zzbo = this;
                    }

                    @Override // com.google.firebase.events.EventHandler
                    public final void handle(Event event) {
                        FirebaseInstanceId.zza zzaVar = this.zzbo;
                        synchronized (zzaVar) {
                            if (zzaVar.isEnabled()) {
                                FirebaseInstanceId.this.zzh();
                            }
                        }
                    }
                };
                this.zzbi = eventHandler;
                subscriber.subscribe(DataCollectionDefaultChange.class, eventHandler);
            }
        }

        private final Boolean zzt() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context applicationContext = FirebaseInstanceId.this.zzau.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), Barcode.ITF)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean zzu() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context applicationContext = FirebaseInstanceId.this.zzau.getApplicationContext();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(applicationContext.getPackageName());
                ResolveInfo resolveService = applicationContext.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }

        public final synchronized boolean isEnabled() {
            Boolean bool = this.zzbj;
            if (bool != null) {
                return bool.booleanValue();
            }
            return this.zzbg && FirebaseInstanceId.this.zzau.isDataCollectionDefaultEnabled();
        }

        public final synchronized void setEnabled(boolean z) {
            EventHandler<DataCollectionDefaultChange> eventHandler = this.zzbi;
            if (eventHandler != null) {
                this.zzbh.unsubscribe(DataCollectionDefaultChange.class, eventHandler);
                this.zzbi = null;
            }
            SharedPreferences.Editor edit = FirebaseInstanceId.this.zzau.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseInstanceId.this.zzh();
            }
            this.zzbj = Boolean.valueOf(z);
        }
    }

    public FirebaseInstanceId(FirebaseApp firebaseApp, Subscriber subscriber, UserAgentPublisher userAgentPublisher) {
        this(firebaseApp, new zzam(firebaseApp.getApplicationContext()), zzh.zze(), zzh.zze(), subscriber, userAgentPublisher);
    }

    public static FirebaseInstanceId getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    private final synchronized void startSync() {
        if (!this.zzaz) {
            zza(0L);
        }
    }

    @VisibleForTesting
    private static zzaw zzb(String str, String str2) {
        return zzar.zzb("", str, str2);
    }

    private static String zzd(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        zzaw zzk = zzk();
        if (zzr() || zza(zzk) || this.zzay.zzaq()) {
            startSync();
        }
    }

    private static String zzj() {
        return zzam.zza(zzar.zzi("").getKeyPair());
    }

    public static boolean zzm() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
    }

    public void deleteInstanceId() throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            zza(this.zzaw.deleteInstanceId(zzj()));
            zzn();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public void deleteToken(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String zzd = zzd(str2);
            zza(this.zzaw.deleteToken(zzj(), zzaw.zzb(zzb(str, zzd)), str, zzd));
            zzar.zzc("", str, zzd);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public long getCreationTime() {
        return zzar.zzi("").getCreationTime();
    }

    public String getId() {
        zzh();
        return zzj();
    }

    public Task<InstanceIdResult> getInstanceId() {
        return zza(zzam.zza(this.zzau), "*");
    }

    @Deprecated
    public String getToken() {
        zzaw zzk = zzk();
        if (this.zzaw.needsRefresh() || zza(zzk)) {
            startSync();
        }
        return zzaw.zzb(zzk);
    }

    public final synchronized void zza(boolean z) {
        this.zzaz = z;
    }

    public final void zzc(String str) throws IOException {
        zzaw zzk = zzk();
        if (!zza(zzk)) {
            zza(this.zzaw.unsubscribeFromTopic(zzj(), zzk.zzbx, str));
            return;
        }
        throw new IOException("token not available");
    }

    public final FirebaseApp zzi() {
        return this.zzau;
    }

    public final zzaw zzk() {
        return zzb(zzam.zza(this.zzau), "*");
    }

    public final String zzl() throws IOException {
        return getToken(zzam.zza(this.zzau), "*");
    }

    public final synchronized void zzn() {
        zzar.zzal();
        if (this.zzba.isEnabled()) {
            startSync();
        }
    }

    public final boolean zzo() {
        return this.zzaw.isAvailable();
    }

    public final void zzp() {
        zzar.zzj("");
        startSync();
    }

    @VisibleForTesting
    public final boolean zzq() {
        return this.zzba.isEnabled();
    }

    public final boolean zzr() {
        return this.zzaw.needsRefresh();
    }

    @Keep
    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        return (FirebaseInstanceId) firebaseApp.get(FirebaseInstanceId.class);
    }

    public final void zzb(String str) throws IOException {
        zzaw zzk = zzk();
        if (!zza(zzk)) {
            zza(this.zzaw.subscribeToTopic(zzj(), zzk.zzbx, str));
            return;
        }
        throw new IOException("token not available");
    }

    public final synchronized void zza(long j) {
        zza(new zzaz(this, this.zzav, this.zzay, Math.min(Math.max(30L, j << 1), zzaq)), j);
        this.zzaz = true;
    }

    public String getToken(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InstanceIdResult) zza(zza(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, zzam zzamVar, Executor executor, Executor executor2, Subscriber subscriber, UserAgentPublisher userAgentPublisher) {
        this.zzaz = false;
        if (zzam.zza(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (zzar == null) {
                    zzar = new zzax(firebaseApp.getApplicationContext());
                }
            }
            this.zzau = firebaseApp;
            this.zzav = zzamVar;
            if (this.zzaw == null) {
                MessagingChannel messagingChannel = (MessagingChannel) firebaseApp.get(MessagingChannel.class);
                if (messagingChannel != null && messagingChannel.isAvailable()) {
                    this.zzaw = messagingChannel;
                } else {
                    this.zzaw = new zzr(firebaseApp, zzamVar, executor, userAgentPublisher);
                }
            }
            this.zzaw = this.zzaw;
            this.zzat = executor2;
            this.zzay = new zzba(zzar);
            zza zzaVar = new zza(subscriber);
            this.zzba = zzaVar;
            this.zzax = new zzar(executor);
            if (zzaVar.isEnabled()) {
                zzh();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static void zza(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (zzas == null) {
                zzas = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            zzas.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    @VisibleForTesting
    public final void zzb(boolean z) {
        this.zzba.setEnabled(z);
    }

    public final /* synthetic */ Task zzb(String str, String str2, String str3, String str4) throws Exception {
        zzar.zza("", str, str2, str4, this.zzav.zzad());
        return Tasks.forResult(new zzy(str3, str4));
    }

    private final Task<InstanceIdResult> zza(final String str, String str2) {
        final String zzd = zzd(str2);
        return Tasks.forResult(null).continueWithTask(this.zzat, new Continuation(this, str, zzd) { // from class: com.google.firebase.iid.zzo
            private final FirebaseInstanceId zzbb;
            private final String zzbc;
            private final String zzbd;

            {
                this.zzbb = this;
                this.zzbc = str;
                this.zzbd = zzd;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.zzbb.zza(this.zzbc, this.zzbd, task);
            }
        });
    }

    private final <T> T zza(Task<T> task) throws IOException {
        try {
            return (T) Tasks.await(task, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    zzn();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        }
    }

    public final synchronized Task<Void> zza(String str) {
        Task<Void> zza2;
        zza2 = this.zzay.zza(str);
        startSync();
        return zza2;
    }

    public final boolean zza(zzaw zzawVar) {
        return zzawVar == null || zzawVar.zzg(this.zzav.zzad());
    }

    public final /* synthetic */ Task zza(final String str, final String str2, Task task) throws Exception {
        final String zzj = zzj();
        zzaw zzb = zzb(str, str2);
        if (!this.zzaw.needsRefresh() && !zza(zzb)) {
            return Tasks.forResult(new zzy(zzj, zzb.zzbx));
        }
        final String zzb2 = zzaw.zzb(zzb);
        return this.zzax.zza(str, str2, new zzat(this, zzj, zzb2, str, str2) { // from class: com.google.firebase.iid.zzn
            private final FirebaseInstanceId zzbb;
            private final String zzbc;
            private final String zzbd;
            private final String zzbe;
            private final String zzbf;

            {
                this.zzbb = this;
                this.zzbc = zzj;
                this.zzbd = zzb2;
                this.zzbe = str;
                this.zzbf = str2;
            }

            @Override // com.google.firebase.iid.zzat
            public final Task zzs() {
                return this.zzbb.zza(this.zzbc, this.zzbd, this.zzbe, this.zzbf);
            }
        });
    }

    public final /* synthetic */ Task zza(final String str, String str2, final String str3, final String str4) {
        return this.zzaw.getToken(str, str2, str3, str4).onSuccessTask(this.zzat, new SuccessContinuation(this, str3, str4, str) { // from class: com.google.firebase.iid.zzp
            private final FirebaseInstanceId zzbb;
            private final String zzbc;
            private final String zzbd;
            private final String zzbe;

            {
                this.zzbb = this;
                this.zzbc = str3;
                this.zzbd = str4;
                this.zzbe = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.zzbb.zzb(this.zzbc, this.zzbd, this.zzbe, (String) obj);
            }
        });
    }
}
