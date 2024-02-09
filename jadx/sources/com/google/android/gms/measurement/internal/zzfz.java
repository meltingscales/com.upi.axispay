package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.internal.measurement.zzin;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfz extends zzfs {
    public zzfz(zzft zzftVar) {
        super(zzftVar);
    }

    public static Object zzb(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        zzbt.zzd zza = zza(zzcfVar, str);
        if (zza != null) {
            if (zza.zzhk()) {
                return zza.zzhl();
            }
            if (zza.zzhn()) {
                return Long.valueOf(zza.zzho());
            }
            if (zza.zzhq()) {
                return Double.valueOf(zza.zzhr());
            }
            return null;
        }
        return null;
    }

    public static boolean zzbl(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    @Override // com.google.android.gms.measurement.internal.zzct, com.google.android.gms.measurement.internal.zzcv
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final void zza(zzbt.zzh.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zziw().zzix().zziy();
        if (obj instanceof String) {
            zzaVar.zzbz((String) obj);
        } else if (obj instanceof Long) {
            zzaVar.zzao(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zzc(((Double) obj).doubleValue());
        } else {
            zzad().zzda().zza("Ignoring invalid (type) user attribute value", obj);
        }
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

    public final byte[] zzc(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            zzad().zzda().zza("Failed to gzip content", e);
            throw e;
        }
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

    public final boolean zze(zzaj zzajVar, zzm zzmVar) {
        Preconditions.checkNotNull(zzajVar);
        Preconditions.checkNotNull(zzmVar);
        if (TextUtils.isEmpty(zzmVar.zzch) && TextUtils.isEmpty(zzmVar.zzcv)) {
            zzag();
            return false;
        }
        return true;
    }

    public final int[] zzgj() {
        Map<String, String> zzk = zzal.zzk(this.zzkt.getContext());
        if (zzk == null || zzk.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = zzal.zzhp.get(null).intValue();
        for (Map.Entry<String, String> entry : zzk.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzad().zzdd().zza("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    zzad().zzdd().zza("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            iArr[i2] = ((Integer) obj).intValue();
            i2++;
        }
        return iArr;
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

    public final String zzb(com.google.android.gms.internal.measurement.zzcg zzcgVar) {
        com.google.android.gms.internal.measurement.zzch[] zzchVarArr;
        com.google.android.gms.internal.measurement.zzcf[] zzcfVarArr;
        String str;
        com.google.android.gms.internal.measurement.zzcf[] zzcfVarArr2;
        int i;
        int i2;
        int i3;
        String str2;
        com.google.android.gms.internal.measurement.zzch[] zzchVarArr2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        com.google.android.gms.internal.measurement.zzch[] zzchVarArr3 = zzcgVar.zzxl;
        if (zzchVarArr3 != null) {
            int length = zzchVarArr3.length;
            int i4 = 0;
            while (i4 < length) {
                com.google.android.gms.internal.measurement.zzch zzchVar = zzchVarArr3[i4];
                if (zzchVar == null || zzchVar == null) {
                    zzchVarArr = zzchVarArr3;
                } else {
                    zza(sb, 1);
                    sb.append("bundle {\n");
                    zza(sb, 1, "protocol_version", zzchVar.zzxn);
                    zza(sb, 1, "platform", zzchVar.zzxv);
                    zza(sb, 1, "gmp_version", zzchVar.zzxz);
                    zza(sb, 1, "uploading_gmp_version", zzchVar.zzya);
                    zza(sb, 1, "dynamite_version", zzchVar.zzys);
                    zza(sb, 1, "config_version", zzchVar.zzyl);
                    zza(sb, 1, "gmp_app_id", zzchVar.zzch);
                    zza(sb, 1, "admob_app_id", zzchVar.zzxf);
                    zza(sb, 1, "app_id", zzchVar.zzcf);
                    zza(sb, 1, "app_version", zzchVar.zzcn);
                    zza(sb, 1, "app_version_major", zzchVar.zzyh);
                    zza(sb, 1, "firebase_instance_id", zzchVar.zzcj);
                    zza(sb, 1, "dev_cert_hash", zzchVar.zzyd);
                    zza(sb, 1, "app_store", zzchVar.zzcp);
                    zza(sb, 1, "upload_timestamp_millis", zzchVar.zzxq);
                    zza(sb, 1, "start_timestamp_millis", zzchVar.zzxr);
                    zza(sb, 1, "end_timestamp_millis", zzchVar.zzxs);
                    zza(sb, 1, "previous_bundle_start_timestamp_millis", zzchVar.zzxt);
                    zza(sb, 1, "previous_bundle_end_timestamp_millis", zzchVar.zzxu);
                    zza(sb, 1, "app_instance_id", zzchVar.zzcg);
                    zza(sb, 1, "resettable_device_id", zzchVar.zzyb);
                    zza(sb, 1, "device_id", zzchVar.zzyk);
                    zza(sb, 1, "ds_id", zzchVar.zzyn);
                    zza(sb, 1, "limited_ad_tracking", zzchVar.zzyc);
                    zza(sb, 1, "os_version", zzchVar.zzxw);
                    zza(sb, 1, "device_model", zzchVar.zzxx);
                    zza(sb, 1, "user_default_language", zzchVar.zzex);
                    zza(sb, 1, "time_zone_offset_minutes", zzchVar.zzxy);
                    zza(sb, 1, "bundle_sequential_index", zzchVar.zzye);
                    zza(sb, 1, "service_upload", zzchVar.zzyf);
                    zza(sb, 1, "health_monitor", zzchVar.zzdn);
                    Long l = zzchVar.zzym;
                    if (l != null && l.longValue() != 0) {
                        zza(sb, 1, "android_id", zzchVar.zzym);
                    }
                    Integer num = zzchVar.zzyp;
                    if (num != null) {
                        zza(sb, 1, "retry_counter", num);
                    }
                    zzbt.zzh[] zzhVarArr = zzchVar.zzxp;
                    String str4 = "string_value";
                    String str5 = "name";
                    int i5 = 2;
                    if (zzhVarArr != null) {
                        for (zzbt.zzh zzhVar : zzhVarArr) {
                            if (zzhVar != null) {
                                zza(sb, 2);
                                sb.append("user_property {\n");
                                zza(sb, 2, "set_timestamp_millis", zzhVar.zzis() ? Long.valueOf(zzhVar.zzit()) : null);
                                zza(sb, 2, "name", zzaa().zzan(zzhVar.getName()));
                                zza(sb, 2, "string_value", zzhVar.zzhl());
                                zza(sb, 2, "int_value", zzhVar.zzhn() ? Long.valueOf(zzhVar.zzho()) : null);
                                zza(sb, 2, "double_value", zzhVar.zzhq() ? Double.valueOf(zzhVar.zzhr()) : null);
                                zza(sb, 2);
                                sb.append("}\n");
                            }
                        }
                    }
                    zzbt.zza[] zzaVarArr = zzchVar.zzyg;
                    String str6 = zzchVar.zzcf;
                    if (zzaVarArr != null) {
                        int length2 = zzaVarArr.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            zzbt.zza zzaVar = zzaVarArr[i6];
                            if (zzaVar != null) {
                                zza(sb, i5);
                                sb.append("audience_membership {\n");
                                if (zzaVar.zzgu()) {
                                    i = i6;
                                    zza(sb, i5, "audience_id", Integer.valueOf(zzaVar.zzgv()));
                                } else {
                                    i = i6;
                                }
                                if (zzaVar.zzgz()) {
                                    zza(sb, i5, "new_audience", Boolean.valueOf(zzaVar.zzha()));
                                }
                                i2 = length2;
                                str2 = str5;
                                zzchVarArr2 = zzchVarArr3;
                                str3 = str4;
                                zza(sb, 2, "current_data", zzaVar.zzgw(), str6);
                                zza(sb, 2, "previous_data", zzaVar.zzgy(), str6);
                                i3 = 2;
                                zza(sb, 2);
                                sb.append("}\n");
                            } else {
                                i = i6;
                                i2 = length2;
                                i3 = i5;
                                str2 = str5;
                                zzchVarArr2 = zzchVarArr3;
                                str3 = str4;
                            }
                            i6 = i + 1;
                            i5 = i3;
                            str4 = str3;
                            zzchVarArr3 = zzchVarArr2;
                            length2 = i2;
                            str5 = str2;
                        }
                    }
                    int i7 = i5;
                    String str7 = str5;
                    zzchVarArr = zzchVarArr3;
                    String str8 = str4;
                    com.google.android.gms.internal.measurement.zzcf[] zzcfVarArr3 = zzchVar.zzxo;
                    if (zzcfVarArr3 != null) {
                        int length3 = zzcfVarArr3.length;
                        int i8 = 0;
                        while (i8 < length3) {
                            com.google.android.gms.internal.measurement.zzcf zzcfVar = zzcfVarArr3[i8];
                            if (zzcfVar != null) {
                                zza(sb, i7);
                                sb.append("event {\n");
                                str = str7;
                                zza(sb, i7, str, zzaa().zzal(zzcfVar.name));
                                zza(sb, i7, "timestamp_millis", zzcfVar.zzxj);
                                zza(sb, i7, "previous_timestamp_millis", zzcfVar.zzxk);
                                zza(sb, i7, "count", zzcfVar.count);
                                zzbt.zzd[] zzdVarArr = zzcfVar.zzxi;
                                if (zzdVarArr != null) {
                                    int length4 = zzdVarArr.length;
                                    int i9 = 0;
                                    while (i9 < length4) {
                                        zzbt.zzd zzdVar = zzdVarArr[i9];
                                        if (zzdVar != null) {
                                            zza(sb, 3);
                                            sb.append("param {\n");
                                            zzcfVarArr2 = zzcfVarArr3;
                                            zza(sb, 3, str, zzaa().zzam(zzdVar.getName()));
                                            zza(sb, 3, str8, zzdVar.zzhl());
                                            zza(sb, 3, "int_value", zzdVar.zzhn() ? Long.valueOf(zzdVar.zzho()) : null);
                                            zza(sb, 3, "double_value", zzdVar.zzhq() ? Double.valueOf(zzdVar.zzhr()) : null);
                                            zza(sb, 3);
                                            sb.append("}\n");
                                        } else {
                                            zzcfVarArr2 = zzcfVarArr3;
                                        }
                                        i9++;
                                        zzcfVarArr3 = zzcfVarArr2;
                                        i7 = 2;
                                    }
                                }
                                zzcfVarArr = zzcfVarArr3;
                                zza(sb, i7);
                                sb.append("}\n");
                            } else {
                                zzcfVarArr = zzcfVarArr3;
                                str = str7;
                            }
                            i8++;
                            str7 = str;
                            zzcfVarArr3 = zzcfVarArr;
                        }
                    }
                    zza(sb, 1);
                    sb.append("}\n");
                }
                i4++;
                zzchVarArr3 = zzchVarArr;
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    public final void zza(zzbt.zzd.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zzhv().zzhw().zzhx();
        if (obj instanceof String) {
            zzaVar.zzbx((String) obj);
        } else if (obj instanceof Long) {
            zzaVar.zzaj(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zzb(((Double) obj).doubleValue());
        } else {
            zzad().zzda().zza("Ignoring invalid (type) event param value", obj);
        }
    }

    public final byte[] zza(com.google.android.gms.internal.measurement.zzcg zzcgVar) {
        try {
            int zzly = zzcgVar.zzly();
            byte[] bArr = new byte[zzly];
            zzin zzk = zzin.zzk(bArr, 0, zzly);
            zzcgVar.zza(zzk);
            zzk.zzlk();
            return bArr;
        } catch (IOException e) {
            zzad().zzda().zza("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    public static zzbt.zzd zza(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        zzbt.zzd[] zzdVarArr;
        for (zzbt.zzd zzdVar : zzcfVar.zzxi) {
            if (zzdVar.getName().equals(str)) {
                return zzdVar;
            }
        }
        return null;
    }

    public static zzbt.zzd[] zza(zzbt.zzd[] zzdVarArr, String str, Object obj) {
        for (int i = 0; i < zzdVarArr.length; i++) {
            zzbt.zzd.zza zzmh = zzdVarArr[i].zzmh();
            if (str.equals(zzmh.getName())) {
                zzmh.zzhw().zzhv().zzhx();
                if (obj instanceof Long) {
                    zzmh.zzaj(((Long) obj).longValue());
                } else if (obj instanceof String) {
                    zzmh.zzbx((String) obj);
                } else if (obj instanceof Double) {
                    zzmh.zzb(((Double) obj).doubleValue());
                }
                zzdVarArr[i] = (zzbt.zzd) ((com.google.android.gms.internal.measurement.zzez) zzmh.zzmr());
                return zzdVarArr;
            }
        }
        zzbt.zzd[] zzdVarArr2 = new zzbt.zzd[zzdVarArr.length + 1];
        System.arraycopy(zzdVarArr, 0, zzdVarArr2, 0, zzdVarArr.length);
        zzbt.zzd.zza zzbw = zzbt.zzd.zzht().zzbw(str);
        if (obj instanceof Long) {
            zzbw.zzaj(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zzbw.zzbx((String) obj);
        } else if (obj instanceof Double) {
            zzbw.zzb(((Double) obj).doubleValue());
        }
        zzdVarArr2[zzdVarArr.length] = (zzbt.zzd) ((com.google.android.gms.internal.measurement.zzez) zzbw.zzmr());
        return zzdVarArr2;
    }

    public final String zza(com.google.android.gms.internal.measurement.zzby zzbyVar) {
        if (zzbyVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        zza(sb, 0, "filter_id", zzbyVar.zzwa);
        zza(sb, 0, "event_name", zzaa().zzal(zzbyVar.zzwb));
        zza(sb, 1, "event_count_filter", zzbyVar.zzwe);
        sb.append("  filters {\n");
        for (com.google.android.gms.internal.measurement.zzbz zzbzVar : zzbyVar.zzwc) {
            zza(sb, 2, zzbzVar);
        }
        zza(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    private final void zza(StringBuilder sb, int i, String str, zzbt.zzf zzfVar, String str2) {
        if (zzfVar == null) {
            return;
        }
        zza(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzfVar.zzid() != 0) {
            zza(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : zzfVar.zzic()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zzfVar.zzib() != 0) {
            zza(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : zzfVar.zzia()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zzaf().zzt(str2)) {
            if (zzfVar.zzif() != 0) {
                zza(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (zzbt.zzb zzbVar : zzfVar.zzie()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(zzbVar.zzhd() ? Integer.valueOf(zzbVar.getIndex()) : null);
                    sb.append(":");
                    sb.append(zzbVar.zzhe() ? Long.valueOf(zzbVar.zzhf()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (zzfVar.zzih() != 0) {
                zza(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (zzbt.zzg zzgVar : zzfVar.zzig()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(zzgVar.zzhd() ? Integer.valueOf(zzgVar.getIndex()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long l3 : zzgVar.zzil()) {
                        long longValue = l3.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
        }
        zza(sb, 3);
        sb.append("}\n");
    }

    public final String zzb(com.google.android.gms.internal.measurement.zzcb zzcbVar) {
        if (zzcbVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        zza(sb, 0, "filter_id", zzcbVar.zzwa);
        zza(sb, 0, "property_name", zzaa().zzan(zzcbVar.zzwq));
        zza(sb, 1, zzcbVar.zzwr);
        sb.append("}\n");
        return sb.toString();
    }

    private final void zza(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.zzca zzcaVar) {
        if (zzcaVar == null) {
            return;
        }
        zza(sb, i);
        sb.append(str);
        sb.append(" {\n");
        zzbl.zza.zzb zzbVar = zzcaVar.zzwk;
        if (zzbVar != null) {
            zza(sb, i, "comparison_type", zzbVar.name());
        }
        zza(sb, i, "match_as_float", zzcaVar.zzwl);
        zza(sb, i, "comparison_value", zzcaVar.zzwm);
        zza(sb, i, "min_comparison_value", zzcaVar.zzwn);
        zza(sb, i, "max_comparison_value", zzcaVar.zzwo);
        zza(sb, i);
        sb.append("}\n");
    }

    public final boolean zzb(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(zzz().currentTimeMillis() - j) > j2;
    }

    public final byte[] zzb(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            zzad().zzda().zza("Failed to ungzip content", e);
            throw e;
        }
    }

    private final void zza(StringBuilder sb, int i, com.google.android.gms.internal.measurement.zzbz zzbzVar) {
        String[] strArr;
        if (zzbzVar == null) {
            return;
        }
        zza(sb, i);
        sb.append("filter {\n");
        zza(sb, i, "complement", zzbzVar.zzwi);
        zza(sb, i, "param_name", zzaa().zzam(zzbzVar.zzwj));
        int i2 = i + 1;
        com.google.android.gms.internal.measurement.zzcc zzccVar = zzbzVar.zzwg;
        if (zzccVar != null) {
            zza(sb, i2);
            sb.append("string_filter");
            sb.append(" {\n");
            zzbl.zzb.EnumC0014zzb enumC0014zzb = zzccVar.zzws;
            if (enumC0014zzb != null) {
                zza(sb, i2, "match_type", enumC0014zzb.name());
            }
            zza(sb, i2, "expression", zzccVar.zzwt);
            zza(sb, i2, "case_sensitive", zzccVar.zzwu);
            if (zzccVar.zzwv.length > 0) {
                zza(sb, i2 + 1);
                sb.append("expression_list {\n");
                for (String str : zzccVar.zzwv) {
                    zza(sb, i2 + 2);
                    sb.append(str);
                    sb.append("\n");
                }
                sb.append("}\n");
            }
            zza(sb, i2);
            sb.append("}\n");
        }
        zza(sb, i2, "number_filter", zzbzVar.zzwh);
        zza(sb, i);
        sb.append("}\n");
    }

    private static void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zza(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public final <T extends Parcelable> T zza(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzad().zzda().zzaq("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public static boolean zza(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    public static List<Long> zza(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public final long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzab().zzq();
        MessageDigest messageDigest = zzgd.getMessageDigest();
        if (messageDigest == null) {
            zzad().zzda().zzaq("Failed to get MD5");
            return 0L;
        }
        return zzgd.zzd(messageDigest.digest(bArr));
    }
}
