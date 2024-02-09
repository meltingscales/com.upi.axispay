package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.vision.barcode.Barcode;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbl {
    public final zzby zzl;

    public zzbl(zzby zzbyVar) {
        this.zzl = zzbyVar;
    }

    @VisibleForTesting
    private final boolean zzee() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.zzl.getContext());
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", Barcode.ITF).versionCode >= 80837300;
            }
            this.zzl.zzad().zzdg().zzaq("Failed to retrieve Package Manager to check Play Store compatibility");
            return false;
        } catch (Exception e) {
            this.zzl.zzad().zzdg().zza("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    @VisibleForTesting
    public final Bundle zza(String str, com.google.android.gms.internal.measurement.zze zzeVar) {
        this.zzl.zzac().zzq();
        if (zzeVar == null) {
            this.zzl.zzad().zzdd().zzaq("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle zza = zzeVar.zza(bundle);
            if (zza == null) {
                this.zzl.zzad().zzda().zzaq("Install Referrer Service returned a null response");
                return null;
            }
            return zza;
        } catch (Exception e) {
            this.zzl.zzad().zzda().zza("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    public final void zzaw(String str) {
        if (str != null && !str.isEmpty()) {
            this.zzl.zzac().zzq();
            if (!zzee()) {
                this.zzl.zzad().zzdg().zzaq("Install Referrer Reporter is not available");
                return;
            }
            this.zzl.zzad().zzdg().zzaq("Install Referrer Reporter is initializing");
            zzbm zzbmVar = new zzbm(this, str);
            this.zzl.zzac().zzq();
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            PackageManager packageManager = this.zzl.getContext().getPackageManager();
            if (packageManager == null) {
                this.zzl.zzad().zzdd().zzaq("Failed to obtain Package Manager to verify binding conditions");
                return;
            }
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str2 = serviceInfo.packageName;
                    if (serviceInfo.name != null && "com.android.vending".equals(str2) && zzee()) {
                        try {
                            this.zzl.zzad().zzdg().zza("Install Referrer Service is", ConnectionTracker.getInstance().bindService(this.zzl.getContext(), new Intent(intent), zzbmVar, 1) ? "available" : "not available");
                            return;
                        } catch (Exception e) {
                            this.zzl.zzad().zzda().zza("Exception occurred while binding to Install Referrer Service", e.getMessage());
                            return;
                        }
                    }
                    this.zzl.zzad().zzdg().zzaq("Play Store missing or incompatible. Version 8.3.73 or later required");
                    return;
                }
                return;
            }
            this.zzl.zzad().zzdg().zzaq("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        this.zzl.zzad().zzdg().zzaq("Install Referrer Reporter was called with invalid app package name");
    }
}
