package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.internal.measurement.zzin;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzea extends zzfs {
    public zzea(zzft zzftVar) {
        super(zzftVar);
    }

    private static String zzo(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final boolean zzak() {
        return false;
    }

    public final byte[] zzb(zzaj zzajVar, String str) {
        com.google.android.gms.internal.measurement.zzch zzchVar;
        com.google.android.gms.internal.measurement.zzcg zzcgVar;
        zzg zzgVar;
        Bundle bundle;
        long j;
        zzaf zzw;
        zzgc zzgcVar;
        zzq();
        this.zzl.zzn();
        Preconditions.checkNotNull(zzajVar);
        Preconditions.checkNotEmpty(str);
        if (!zzaf().zze(str, zzal.zzir)) {
            zzad().zzdh().zza("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        } else if (!"_iap".equals(zzajVar.name) && !"_iapx".equals(zzajVar.name)) {
            zzad().zzdh().zza("Generating a payload for this event is not available. package_name, event_name", str, zzajVar.name);
            return null;
        } else {
            com.google.android.gms.internal.measurement.zzcg zzcgVar2 = new com.google.android.gms.internal.measurement.zzcg();
            zzdo().beginTransaction();
            try {
                zzg zzae = zzdo().zzae(str);
                if (zzae == null) {
                    zzad().zzdh().zza("Log and bundle not available. package_name", str);
                    return new byte[0];
                } else if (!zzae.isMeasurementEnabled()) {
                    zzad().zzdh().zza("Log and bundle disabled. package_name", str);
                    return new byte[0];
                } else {
                    com.google.android.gms.internal.measurement.zzch zzchVar2 = new com.google.android.gms.internal.measurement.zzch();
                    zzcgVar2.zzxl = new com.google.android.gms.internal.measurement.zzch[]{zzchVar2};
                    zzchVar2.zzxn = 1;
                    zzchVar2.zzxv = DefaultSettingsSpiCall.ANDROID_CLIENT_TYPE;
                    zzchVar2.zzcf = zzae.zzan();
                    zzchVar2.zzcp = zzae.zzau();
                    zzchVar2.zzcn = zzae.zzas();
                    long zzat = zzae.zzat();
                    zzchVar2.zzyh = zzat == -2147483648L ? null : Integer.valueOf((int) zzat);
                    zzchVar2.zzxz = Long.valueOf(zzae.zzav());
                    zzchVar2.zzys = Long.valueOf(zzae.zzax());
                    String gmpAppId = zzae.getGmpAppId();
                    zzchVar2.zzch = gmpAppId;
                    if (TextUtils.isEmpty(gmpAppId)) {
                        zzchVar2.zzxf = zzae.zzao();
                    }
                    zzchVar2.zzyd = Long.valueOf(zzae.zzaw());
                    if (this.zzl.isEnabled() && zzt.zzbv() && zzaf().zzk(zzchVar2.zzcf)) {
                        zzchVar2.zzyn = null;
                    }
                    Pair<String, Boolean> zzar = zzae().zzar(zzae.zzan());
                    if (zzae.zzbl() && zzar != null && !TextUtils.isEmpty((CharSequence) zzar.first)) {
                        zzchVar2.zzyb = zzo((String) zzar.first, Long.toString(zzajVar.zzfp));
                        zzchVar2.zzyc = (Boolean) zzar.second;
                    }
                    zzy().zzah();
                    zzchVar2.zzxx = Build.MODEL;
                    zzy().zzah();
                    zzchVar2.zzxw = Build.VERSION.RELEASE;
                    zzchVar2.zzxy = Integer.valueOf((int) zzy().zzco());
                    zzchVar2.zzex = zzy().zzcp();
                    zzchVar2.zzcg = zzo(zzae.getAppInstanceId(), Long.toString(zzajVar.zzfp));
                    zzchVar2.zzcj = zzae.getFirebaseInstanceId();
                    String zzan = zzae.zzan();
                    List<zzgc> zzad = zzdo().zzad(zzan);
                    if (zzaf().zzm(zzan)) {
                        Iterator<zzgc> it = zzad.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                zzgcVar = null;
                                break;
                            }
                            zzgcVar = it.next();
                            if ("_lte".equals(zzgcVar.name)) {
                                break;
                            }
                        }
                        if (zzgcVar == null || zzgcVar.value == null) {
                            zzgc zzgcVar2 = new zzgc(zzan, "auto", "_lte", zzz().currentTimeMillis(), 0L);
                            zzad.add(zzgcVar2);
                            zzdo().zza(zzgcVar2);
                        }
                    }
                    if (zzaf().zze(zzan, zzal.zzin)) {
                        zzfz zzdm = zzdm();
                        zzdm.zzad().zzdi().zzaq("Checking account type status for ad personalization signals");
                        if (zzdm.zzy().zzcs()) {
                            String zzan2 = zzae.zzan();
                            if (zzae.zzbl() && zzdm.zzdp().zzbc(zzan2)) {
                                zzdm.zzad().zzdh().zzaq("Turning off ad personalization due to account type");
                                Iterator<zzgc> it2 = zzad.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(it2.next().name)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                zzad.add(new zzgc(zzan2, "auto", "_npa", zzdm.zzz().currentTimeMillis(), 1L));
                            }
                        }
                    }
                    zzbt.zzh[] zzhVarArr = new zzbt.zzh[zzad.size()];
                    for (int i = 0; i < zzad.size(); i++) {
                        zzbt.zzh.zza zzan3 = zzbt.zzh.zziu().zzby(zzad.get(i).name).zzan(zzad.get(i).zzsx);
                        zzdm().zza(zzan3, zzad.get(i).value);
                        zzhVarArr[i] = (zzbt.zzh) ((com.google.android.gms.internal.measurement.zzez) zzan3.zzmr());
                    }
                    zzchVar2.zzxp = zzhVarArr;
                    Bundle zzct = zzajVar.zzfd.zzct();
                    zzct.putLong("_c", 1L);
                    zzad().zzdh().zzaq("Marking in-app purchase as real-time");
                    zzct.putLong("_r", 1L);
                    zzct.putString(CrashlyticsAnalyticsListener.EVENT_ORIGIN_KEY, zzajVar.origin);
                    if (zzab().zzbt(zzchVar2.zzcf)) {
                        zzab().zza(zzct, "_dbg", (Object) 1L);
                        zzab().zza(zzct, "_r", (Object) 1L);
                    }
                    zzaf zzc = zzdo().zzc(str, zzajVar.name);
                    if (zzc == null) {
                        zzchVar = zzchVar2;
                        zzcgVar = zzcgVar2;
                        zzgVar = zzae;
                        bundle = zzct;
                        zzw = new zzaf(str, zzajVar.name, 0L, 0L, zzajVar.zzfp, 0L, null, null, null, null);
                        j = 0;
                    } else {
                        zzchVar = zzchVar2;
                        zzcgVar = zzcgVar2;
                        zzgVar = zzae;
                        bundle = zzct;
                        j = zzc.zzfg;
                        zzw = zzc.zzw(zzajVar.zzfp);
                    }
                    zzdo().zza(zzw);
                    zzae zzaeVar = new zzae(this.zzl, zzajVar.origin, str, zzajVar.name, zzajVar.zzfp, j, bundle);
                    com.google.android.gms.internal.measurement.zzcf zzcfVar = new com.google.android.gms.internal.measurement.zzcf();
                    com.google.android.gms.internal.measurement.zzch zzchVar3 = zzchVar;
                    zzchVar3.zzxo = new com.google.android.gms.internal.measurement.zzcf[]{zzcfVar};
                    zzcfVar.zzxj = Long.valueOf(zzaeVar.timestamp);
                    zzcfVar.name = zzaeVar.name;
                    zzcfVar.zzxk = Long.valueOf(zzaeVar.zzfc);
                    zzcfVar.zzxi = new zzbt.zzd[zzaeVar.zzfd.size()];
                    Iterator<String> it3 = zzaeVar.zzfd.iterator();
                    int i2 = 0;
                    while (it3.hasNext()) {
                        String next = it3.next();
                        zzbt.zzd.zza zzbw = zzbt.zzd.zzht().zzbw(next);
                        zzdm().zza(zzbw, zzaeVar.zzfd.get(next));
                        zzcfVar.zzxi[i2] = (zzbt.zzd) ((com.google.android.gms.internal.measurement.zzez) zzbw.zzmr());
                        i2++;
                    }
                    zzchVar3.zzyq = (zzbt.zze) ((com.google.android.gms.internal.measurement.zzez) zzbt.zze.zzhy().zzb(zzbt.zzc.zzhi().zzai(zzw.zzfe).zzbu(zzajVar.name)).zzmr());
                    zzchVar3.zzyg = zzdn().zza(zzgVar.zzan(), (com.google.android.gms.internal.measurement.zzcf[]) null, zzchVar3.zzxp);
                    Long l = zzcfVar.zzxj;
                    zzchVar3.zzxr = l;
                    zzchVar3.zzxs = l;
                    long zzar2 = zzgVar.zzar();
                    zzchVar3.zzxu = zzar2 != 0 ? Long.valueOf(zzar2) : null;
                    long zzaq = zzgVar.zzaq();
                    if (zzaq != 0) {
                        zzar2 = zzaq;
                    }
                    zzchVar3.zzxt = zzar2 != 0 ? Long.valueOf(zzar2) : null;
                    zzgVar.zzbb();
                    zzchVar3.zzye = Integer.valueOf((int) zzgVar.zzay());
                    zzchVar3.zzya = Long.valueOf(zzaf().zzav());
                    zzchVar3.zzxq = Long.valueOf(zzz().currentTimeMillis());
                    zzchVar3.zzyf = Boolean.TRUE;
                    zzg zzgVar2 = zzgVar;
                    zzgVar2.zze(zzchVar3.zzxr.longValue());
                    zzgVar2.zzf(zzchVar3.zzxs.longValue());
                    zzdo().zza(zzgVar2);
                    zzdo().setTransactionSuccessful();
                    try {
                        int zzly = zzcgVar.zzly();
                        byte[] bArr = new byte[zzly];
                        zzin zzk = zzin.zzk(bArr, 0, zzly);
                        zzcgVar.zza(zzk);
                        zzk.zzlk();
                        return zzdm().zzc(bArr);
                    } catch (IOException e) {
                        zzad().zzda().zza("Data loss. Failed to bundle and serialize. appId", zzau.zzao(str), e);
                        return null;
                    }
                }
            } catch (SecurityException e2) {
                zzad().zzdh().zza("app instance id encryption failed", e2.getMessage());
                return new byte[0];
            } catch (SecurityException e3) {
                zzad().zzdh().zza("Resettable device id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                zzdo().endTransaction();
            }
        }
    }
}
