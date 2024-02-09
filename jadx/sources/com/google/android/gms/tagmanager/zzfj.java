package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.util.VisibleForTesting;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfj implements zzbk {
    private final String zza;
    private final Context zzb;
    private final zzfi zzc;
    private final zzfh zzd = new zzfh();

    @VisibleForTesting
    public zzfj(Context context, zzfi zzfiVar) {
        this.zzb = context.getApplicationContext();
        this.zzc = zzfiVar;
        String str = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String str2 = null;
        if (locale != null && locale.getLanguage() != null && locale.getLanguage().length() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (locale.getCountry() != null && locale.getCountry().length() != 0) {
                sb.append("-");
                sb.append(locale.getCountry().toLowerCase());
            }
            str2 = sb.toString();
        }
        this.zza = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleTagManager", "4.00", str, str2, Build.MODEL, Build.ID);
    }

    @VisibleForTesting
    public static final URL zzc(zzca zzcaVar) {
        try {
            return new URL(zzcaVar.zzc());
        } catch (MalformedURLException unused) {
            zzdh.zza("Error trying to parse the GTM url.");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.tagmanager.zzbk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.util.List<com.google.android.gms.tagmanager.zzca> r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzfj.zza(java.util.List):void");
    }

    @Override // com.google.android.gms.tagmanager.zzbk
    public final boolean zzb() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzb.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            zzdh.zzb.zzd("...no network connectivity");
            return false;
        }
        return true;
    }
}
