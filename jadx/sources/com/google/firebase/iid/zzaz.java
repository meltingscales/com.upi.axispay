package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzaz implements Runnable {
    private final zzba zzay;
    private final long zzdq;
    private final PowerManager.WakeLock zzdr;
    private final FirebaseInstanceId zzds;

    @VisibleForTesting
    public zzaz(FirebaseInstanceId firebaseInstanceId, zzam zzamVar, zzba zzbaVar, long j) {
        this.zzds = firebaseInstanceId;
        this.zzay = zzbaVar;
        this.zzdq = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.zzdr = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    @VisibleForTesting
    private final boolean zzan() {
        zzaw zzk = this.zzds.zzk();
        if (this.zzds.zzr() || this.zzds.zza(zzk)) {
            try {
                String zzl = this.zzds.zzl();
                if (zzl == null) {
                    Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                    return false;
                }
                Log.isLoggable("FirebaseInstanceId", 3);
                if (zzk == null || (zzk != null && !zzl.equals(zzk.zzbx))) {
                    Context context = getContext();
                    Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                    intent.putExtra("token", zzl);
                    zzau.zzc(context, intent);
                    zzau.zzb(context, new Intent("com.google.firebase.iid.TOKEN_REFRESH"));
                }
                return true;
            } catch (IOException | SecurityException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Token retrieval failed: ".concat(valueOf) : new String("Token retrieval failed: "));
                return false;
            }
        }
        return true;
    }

    public final Context getContext() {
        return this.zzds.zzi().getApplicationContext();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        try {
            if (zzau.zzai().zzd(getContext())) {
                this.zzdr.acquire();
            }
            this.zzds.zza(true);
            if (!this.zzds.zzo()) {
                this.zzds.zza(false);
            } else if (zzau.zzai().zze(getContext()) && !zzao()) {
                new zzay(this).zzam();
                if (zzau.zzai().zzd(getContext())) {
                    this.zzdr.release();
                }
            } else {
                if (zzan() && this.zzay.zzc(this.zzds)) {
                    this.zzds.zza(false);
                } else {
                    this.zzds.zza(this.zzdq);
                }
                if (zzau.zzai().zzd(getContext())) {
                    this.zzdr.release();
                }
            }
        } finally {
            if (zzau.zzai().zzd(getContext())) {
                this.zzdr.release();
            }
        }
    }

    public final boolean zzao() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
