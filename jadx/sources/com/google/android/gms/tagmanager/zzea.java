package com.google.android.gms.tagmanager;

import android.net.Uri;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* compiled from: AxisPay */
@ShowFirstParty
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzea {
    private static zzea zza;
    private volatile int zze = 1;
    private volatile String zzc = null;
    private volatile String zzb = null;
    private volatile String zzd = null;

    @ShowFirstParty
    public static zzea zza() {
        zzea zzeaVar;
        synchronized (zzea.class) {
            if (zza == null) {
                zza = new zzea();
            }
            zzeaVar = zza;
        }
        return zzeaVar;
    }

    private static final String zzf(String str) {
        return str.split("&")[0].split("=")[1];
    }

    public final String zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final synchronized boolean zzd(Uri uri) {
        try {
            String decode = URLDecoder.decode(uri.toString(), "UTF-8");
            if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                String valueOf = String.valueOf(decode);
                zzdh.zzb.zzd(valueOf.length() != 0 ? "Container preview url: ".concat(valueOf) : new String("Container preview url: "));
                if (decode.matches(".*?&gtm_debug=x$")) {
                    this.zze = 3;
                } else {
                    this.zze = 2;
                }
                this.zzd = uri.getQuery().replace("&gtm_debug=x", "");
                if (this.zze == 2 || this.zze == 3) {
                    String valueOf2 = String.valueOf(this.zzd);
                    this.zzc = valueOf2.length() != 0 ? "/r?".concat(valueOf2) : new String("/r?");
                }
                this.zzb = zzf(this.zzd);
                return true;
            } else if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                if (zzf(uri.getQuery()).equals(this.zzb)) {
                    String valueOf3 = String.valueOf(this.zzb);
                    zzdh.zzb.zzd(valueOf3.length() != 0 ? "Exit preview mode for container: ".concat(valueOf3) : new String("Exit preview mode for container: "));
                    this.zze = 1;
                    this.zzc = null;
                    return true;
                }
                return false;
            } else {
                String valueOf4 = String.valueOf(decode);
                zzdh.zzc(valueOf4.length() != 0 ? "Invalid preview uri: ".concat(valueOf4) : new String("Invalid preview uri: "));
                return false;
            }
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public final int zze() {
        return this.zze;
    }
}
