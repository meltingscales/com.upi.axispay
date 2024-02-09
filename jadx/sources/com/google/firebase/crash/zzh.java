package com.google.firebase.crash;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.crash.zzk;
import com.google.android.gms.internal.crash.zzm;
import com.google.android.gms.internal.crash.zzo;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzh implements Runnable {
    private final /* synthetic */ long zzaa = 10000;
    private final /* synthetic */ zzj zzab;
    private final /* synthetic */ zzf zzy;
    private final /* synthetic */ Future zzz;

    public zzh(zzf zzfVar, Future future, long j, zzj zzjVar) {
        this.zzy = zzfVar;
        this.zzz = future;
        this.zzab = zzjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzm zzmVar;
        Context context;
        FirebaseApp firebaseApp;
        Context context2;
        Context context3;
        boolean z = true;
        try {
            zzmVar = (zzm) this.zzz.get(this.zzaa, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("FirebaseCrash", "Failed to load crash reporting in time", e);
            this.zzz.cancel(true);
            zzmVar = null;
        }
        if (zzmVar != null) {
            try {
                firebaseApp = this.zzy.zzh;
                FirebaseOptions options = firebaseApp.getOptions();
                zzk zzkVar = new zzk(options.getApplicationId(), options.getApiKey());
                context2 = this.zzy.zzf;
                zzmVar.zza(ObjectWrapper.wrap(context2), zzkVar);
                zzmVar.zza(new ArrayList());
                context3 = this.zzy.zzf;
                BackgroundDetector.initialize((Application) context3.getApplicationContext());
                if (BackgroundDetector.getInstance().isInBackground()) {
                    z = false;
                }
                zzmVar.zza(z);
                BackgroundDetector.getInstance().addListener(new zzi(this));
                String valueOf = String.valueOf(zzo.zzl());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("FirebaseCrash reporting initialized ");
                sb.append(valueOf);
                Log.i("FirebaseCrash", sb.toString());
                this.zzab.zzc(zzmVar);
                return;
            } catch (Exception e2) {
                Log.e("FirebaseCrash", "Failed to initialize crash reporting", e2);
                context = this.zzy.zzf;
                CrashUtils.addDynamiteErrorToDropBox(context, e2);
                this.zzab.zzi();
                return;
            }
        }
        this.zzab.zzi();
    }
}
