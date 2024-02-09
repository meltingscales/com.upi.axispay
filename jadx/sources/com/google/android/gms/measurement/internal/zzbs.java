package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzim;
import com.google.android.gms.internal.measurement.zzin;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbs extends zzfs implements zzv {
    @VisibleForTesting
    private static int zzmp = 65535;
    @VisibleForTesting
    private static int zzmq = 2;
    private final Map<String, Map<String, String>> zzmr;
    private final Map<String, Map<String, Boolean>> zzms;
    private final Map<String, Map<String, Boolean>> zzmt;
    private final Map<String, com.google.android.gms.internal.measurement.zzce> zzmu;
    private final Map<String, Map<String, Integer>> zzmv;
    private final Map<String, String> zzmw;

    public zzbs(zzft zzftVar) {
        super(zzftVar);
        this.zzmr = new o4();
        this.zzms = new o4();
        this.zzmt = new o4();
        this.zzmu = new o4();
        this.zzmw = new o4();
        this.zzmv = new o4();
    }

    private static Map<String, String> zza(com.google.android.gms.internal.measurement.zzce zzceVar) {
        zzbr.zza[] zzaVarArr;
        o4 o4Var = new o4();
        if (zzceVar != null && (zzaVarArr = zzceVar.zzxc) != null) {
            for (zzbr.zza zzaVar : zzaVarArr) {
                if (zzaVar != null) {
                    o4Var.put(zzaVar.getKey(), zzaVar.getValue());
                }
            }
        }
        return o4Var;
    }

    private final void zzax(String str) {
        zzah();
        zzq();
        Preconditions.checkNotEmpty(str);
        if (this.zzmu.get(str) == null) {
            byte[] zzag = zzdo().zzag(str);
            if (zzag == null) {
                this.zzmr.put(str, null);
                this.zzms.put(str, null);
                this.zzmt.put(str, null);
                this.zzmu.put(str, null);
                this.zzmw.put(str, null);
                this.zzmv.put(str, null);
                return;
            }
            com.google.android.gms.internal.measurement.zzce zza = zza(str, zzag);
            this.zzmr.put(str, zza(zza));
            zza(str, zza);
            this.zzmu.put(str, zza);
            this.zzmw.put(str, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzas zzaa() {
        return super.zzaa();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzgd zzab() {
        return super.zzab();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzbt zzac() {
        return super.zzac();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzau zzad() {
        return super.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzbf zzae() {
        return super.zzae();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzt zzaf() {
        return super.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ zzq zzag() {
        return super.zzag();
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final boolean zzak() {
        return false;
    }

    public final com.google.android.gms.internal.measurement.zzce zzay(String str) {
        zzah();
        zzq();
        Preconditions.checkNotEmpty(str);
        zzax(str);
        return this.zzmu.get(str);
    }

    public final String zzaz(String str) {
        zzq();
        return this.zzmw.get(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzv
    public final String zzb(String str, String str2) {
        zzq();
        zzax(str);
        Map<String, String> map = this.zzmr.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    public final void zzba(String str) {
        zzq();
        this.zzmw.put(str, null);
    }

    public final void zzbb(String str) {
        zzq();
        this.zzmu.remove(str);
    }

    public final boolean zzbc(String str) {
        zzq();
        Boolean bool = zzay(str).zzxg;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final long zzbd(String str) {
        String zzb = zzb(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(zzb)) {
            return 0L;
        }
        try {
            return Long.parseLong(zzb);
        } catch (NumberFormatException e) {
            zzad().zzdd().zza("Unable to parse timezone offset. appId", zzau.zzao(str), e);
            return 0L;
        }
    }

    public final boolean zzbe(String str) {
        return "1".equals(zzb(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzbf(String str) {
        return "1".equals(zzb(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.zzfr
    public final /* bridge */ /* synthetic */ zzfz zzdm() {
        return super.zzdm();
    }

    @Override // com.google.android.gms.measurement.internal.zzfr
    public final /* bridge */ /* synthetic */ zzo zzdn() {
        return super.zzdn();
    }

    @Override // com.google.android.gms.measurement.internal.zzfr
    public final /* bridge */ /* synthetic */ zzw zzdo() {
        return super.zzdo();
    }

    @Override // com.google.android.gms.measurement.internal.zzfr
    public final /* bridge */ /* synthetic */ zzbs zzdp() {
        return super.zzdp();
    }

    public final boolean zzk(String str, String str2) {
        Boolean bool;
        zzq();
        zzax(str);
        if (zzbe(str) && zzgd.zzbs(str2)) {
            return true;
        }
        if (zzbf(str) && zzgd.zzbm(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzms.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzl(String str, String str2) {
        Boolean bool;
        zzq();
        zzax(str);
        if (FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzmt.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int zzm(String str, String str2) {
        Integer num;
        zzq();
        zzax(str);
        Map<String, Integer> map = this.zzmv.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzp() {
        super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ void zzq() {
        super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzad zzy() {
        return super.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Clock zzz() {
        return super.zzz();
    }

    private final void zza(String str, com.google.android.gms.internal.measurement.zzce zzceVar) {
        com.google.android.gms.internal.measurement.zzcd[] zzcdVarArr;
        o4 o4Var = new o4();
        o4 o4Var2 = new o4();
        o4 o4Var3 = new o4();
        if (zzceVar != null && (zzcdVarArr = zzceVar.zzxd) != null) {
            for (com.google.android.gms.internal.measurement.zzcd zzcdVar : zzcdVarArr) {
                if (TextUtils.isEmpty(zzcdVar.name)) {
                    zzad().zzdd().zzaq("EventConfig contained null event name");
                } else {
                    String zzbh = zzcx.zzbh(zzcdVar.name);
                    if (!TextUtils.isEmpty(zzbh)) {
                        zzcdVar.name = zzbh;
                    }
                    o4Var.put(zzcdVar.name, zzcdVar.zzwx);
                    o4Var2.put(zzcdVar.name, zzcdVar.zzwy);
                    Integer num = zzcdVar.zzwz;
                    if (num != null) {
                        if (num.intValue() >= zzmq && zzcdVar.zzwz.intValue() <= zzmp) {
                            o4Var3.put(zzcdVar.name, zzcdVar.zzwz);
                        } else {
                            zzad().zzdd().zza("Invalid sampling rate. Event name, sample rate", zzcdVar.name, zzcdVar.zzwz);
                        }
                    }
                }
            }
        }
        this.zzms.put(str, o4Var);
        this.zzmt.put(str, o4Var2);
        this.zzmv.put(str, o4Var3);
    }

    public final boolean zza(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        ContentValues contentValues;
        com.google.android.gms.internal.measurement.zzcb[] zzcbVarArr;
        zzah();
        zzq();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzce zza = zza(str, bArr);
        int i = 0;
        if (zza == null) {
            return false;
        }
        zza(str, zza);
        this.zzmu.put(str, zza);
        this.zzmw.put(str, str2);
        this.zzmr.put(str, zza(zza));
        zzo zzdn = zzdn();
        com.google.android.gms.internal.measurement.zzbx[] zzbxVarArr = zza.zzxe;
        Preconditions.checkNotNull(zzbxVarArr);
        int length = zzbxVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            com.google.android.gms.internal.measurement.zzbx zzbxVar = zzbxVarArr[i2];
            com.google.android.gms.internal.measurement.zzby[] zzbyVarArr = zzbxVar.zzvw;
            int length2 = zzbyVarArr.length;
            int i3 = i;
            while (i3 < length2) {
                com.google.android.gms.internal.measurement.zzby zzbyVar = zzbyVarArr[i3];
                String zzbh = zzcx.zzbh(zzbyVar.zzwb);
                if (zzbh != null) {
                    zzbyVar.zzwb = zzbh;
                }
                com.google.android.gms.internal.measurement.zzbz[] zzbzVarArr = zzbyVar.zzwc;
                int length3 = zzbzVarArr.length;
                for (int i4 = i; i4 < length3; i4++) {
                    com.google.android.gms.internal.measurement.zzbz zzbzVar = zzbzVarArr[i4];
                    String zzbh2 = zzcy.zzbh(zzbzVar.zzwj);
                    if (zzbh2 != null) {
                        zzbzVar.zzwj = zzbh2;
                    }
                }
                i3++;
                i = 0;
            }
            for (com.google.android.gms.internal.measurement.zzcb zzcbVar : zzbxVar.zzvv) {
                String zzbh3 = zzcz.zzbh(zzcbVar.zzwq);
                if (zzbh3 != null) {
                    zzcbVar.zzwq = zzbh3;
                }
            }
            i2++;
            i = 0;
        }
        zzdn.zzdo().zza(str, zzbxVarArr);
        try {
            zza.zzxe = null;
            int zzly = zza.zzly();
            bArr2 = new byte[zzly];
            zza.zza(zzin.zzk(bArr2, 0, zzly));
        } catch (IOException e) {
            zzad().zzdd().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzau.zzao(str), e);
            bArr2 = bArr;
        }
        zzw zzdo = zzdo();
        Preconditions.checkNotEmpty(str);
        zzdo.zzq();
        zzdo.zzah();
        new ContentValues().put("remote_config", bArr2);
        try {
            if (zzdo.getWritableDatabase().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzdo.zzad().zzda().zza("Failed to update remote config (got 0). appId", zzau.zzao(str));
            }
        } catch (SQLiteException e2) {
            zzdo.zzad().zzda().zza("Error storing remote config. appId", zzau.zzao(str), e2);
        }
        return true;
    }

    private final com.google.android.gms.internal.measurement.zzce zza(String str, byte[] bArr) {
        if (bArr == null) {
            return new com.google.android.gms.internal.measurement.zzce();
        }
        zzim zzj = zzim.zzj(bArr, 0, bArr.length);
        com.google.android.gms.internal.measurement.zzce zzceVar = new com.google.android.gms.internal.measurement.zzce();
        try {
            zzceVar.zza(zzj);
            zzad().zzdi().zza("Parsed config. version, gmp_app_id", zzceVar.zzxa, zzceVar.zzch);
            return zzceVar;
        } catch (IOException e) {
            zzad().zzdd().zza("Unable to merge remote config. appId", zzau.zzao(str), e);
            return new com.google.android.gms.internal.measurement.zzce();
        }
    }
}
