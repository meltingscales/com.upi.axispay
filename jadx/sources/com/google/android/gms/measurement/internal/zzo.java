package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzo extends zzfs {
    public zzo(zzft zzftVar) {
        super(zzftVar);
    }

    private static void zzb(Map<Integer, List<Long>> map, int i, long j) {
        List<Long> list = map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x059e  */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v111, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v114, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v120, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzbt.zza[] zza(java.lang.String r69, com.google.android.gms.internal.measurement.zzcf[] r70, com.google.android.gms.internal.measurement.zzbt.zzh[] r71) {
        /*
            Method dump skipped, instructions count: 3567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzo.zza(java.lang.String, com.google.android.gms.internal.measurement.zzcf[], com.google.android.gms.internal.measurement.zzbt$zzh[]):com.google.android.gms.internal.measurement.zzbt$zza[]");
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final boolean zzak() {
        return false;
    }

    private final Boolean zza(com.google.android.gms.internal.measurement.zzby zzbyVar, String str, List<zzbt.zzd> list, long j) {
        com.google.android.gms.internal.measurement.zzbz[] zzbzVarArr;
        com.google.android.gms.internal.measurement.zzbz[] zzbzVarArr2;
        Boolean zza;
        Boolean zza2;
        Boolean zza3;
        com.google.android.gms.internal.measurement.zzca zzcaVar = zzbyVar.zzwe;
        if (zzcaVar != null) {
            Boolean zza4 = zza(j, zzcaVar);
            if (zza4 == null) {
                return null;
            }
            if (!zza4.booleanValue()) {
                return Boolean.FALSE;
            }
        }
        HashSet hashSet = new HashSet();
        for (com.google.android.gms.internal.measurement.zzbz zzbzVar : zzbyVar.zzwc) {
            if (TextUtils.isEmpty(zzbzVar.zzwj)) {
                zzad().zzdd().zza("null or empty param name in filter. event", zzaa().zzal(str));
                return null;
            }
            hashSet.add(zzbzVar.zzwj);
        }
        o4 o4Var = new o4();
        for (zzbt.zzd zzdVar : list) {
            if (hashSet.contains(zzdVar.getName())) {
                if (zzdVar.zzhn()) {
                    o4Var.put(zzdVar.getName(), zzdVar.zzhn() ? Long.valueOf(zzdVar.zzho()) : null);
                } else if (zzdVar.zzhq()) {
                    o4Var.put(zzdVar.getName(), zzdVar.zzhq() ? Double.valueOf(zzdVar.zzhr()) : null);
                } else if (zzdVar.zzhk()) {
                    o4Var.put(zzdVar.getName(), zzdVar.zzhl());
                } else {
                    zzad().zzdd().zza("Unknown value for param. event, param", zzaa().zzal(str), zzaa().zzam(zzdVar.getName()));
                    return null;
                }
            }
        }
        for (com.google.android.gms.internal.measurement.zzbz zzbzVar2 : zzbyVar.zzwc) {
            boolean equals = Boolean.TRUE.equals(zzbzVar2.zzwi);
            String str2 = zzbzVar2.zzwj;
            if (TextUtils.isEmpty(str2)) {
                zzad().zzdd().zza("Event has empty param name. event", zzaa().zzal(str));
                return null;
            }
            V v = o4Var.get(str2);
            if (v instanceof Long) {
                if (zzbzVar2.zzwh == null) {
                    zzad().zzdd().zza("No number filter for long param. event, param", zzaa().zzal(str), zzaa().zzam(str2));
                    return null;
                }
                if (zza(((Long) v).longValue(), zzbzVar2.zzwh) == null) {
                    return null;
                }
                if ((!zza3.booleanValue()) ^ equals) {
                    return Boolean.FALSE;
                }
            } else if (v instanceof Double) {
                if (zzbzVar2.zzwh == null) {
                    zzad().zzdd().zza("No number filter for double param. event, param", zzaa().zzal(str), zzaa().zzam(str2));
                    return null;
                }
                if (zza(((Double) v).doubleValue(), zzbzVar2.zzwh) == null) {
                    return null;
                }
                if ((!zza2.booleanValue()) ^ equals) {
                    return Boolean.FALSE;
                }
            } else if (v instanceof String) {
                com.google.android.gms.internal.measurement.zzcc zzccVar = zzbzVar2.zzwg;
                if (zzccVar != null) {
                    zza = zza((String) v, zzccVar);
                } else if (zzbzVar2.zzwh != null) {
                    String str3 = (String) v;
                    if (zzfz.zzbl(str3)) {
                        zza = zza(str3, zzbzVar2.zzwh);
                    } else {
                        zzad().zzdd().zza("Invalid param value for number filter. event, param", zzaa().zzal(str), zzaa().zzam(str2));
                        return null;
                    }
                } else {
                    zzad().zzdd().zza("No filter for String param. event, param", zzaa().zzal(str), zzaa().zzam(str2));
                    return null;
                }
                if (zza == null) {
                    return null;
                }
                if ((!zza.booleanValue()) ^ equals) {
                    return Boolean.FALSE;
                }
            } else {
                if (v == 0) {
                    zzad().zzdi().zza("Missing param for filter. event, param", zzaa().zzal(str), zzaa().zzam(str2));
                    return Boolean.FALSE;
                }
                zzad().zzdd().zza("Unknown param type. event, param", zzaa().zzal(str), zzaa().zzam(str2));
                return null;
            }
        }
        return Boolean.TRUE;
    }

    private final Boolean zza(com.google.android.gms.internal.measurement.zzcb zzcbVar, zzbt.zzh zzhVar) {
        com.google.android.gms.internal.measurement.zzbz zzbzVar = zzcbVar.zzwr;
        if (zzbzVar == null) {
            zzad().zzdd().zza("Missing property filter. property", zzaa().zzan(zzhVar.getName()));
            return null;
        }
        boolean equals = Boolean.TRUE.equals(zzbzVar.zzwi);
        if (zzhVar.zzhn()) {
            if (zzbzVar.zzwh == null) {
                zzad().zzdd().zza("No number filter for long property. property", zzaa().zzan(zzhVar.getName()));
                return null;
            }
            return zza(zza(zzhVar.zzho(), zzbzVar.zzwh), equals);
        } else if (zzhVar.zzhq()) {
            if (zzbzVar.zzwh == null) {
                zzad().zzdd().zza("No number filter for double property. property", zzaa().zzan(zzhVar.getName()));
                return null;
            }
            return zza(zza(zzhVar.zzhr(), zzbzVar.zzwh), equals);
        } else if (zzhVar.zzhk()) {
            if (zzbzVar.zzwg == null) {
                if (zzbzVar.zzwh == null) {
                    zzad().zzdd().zza("No string or number filter defined. property", zzaa().zzan(zzhVar.getName()));
                } else if (zzfz.zzbl(zzhVar.zzhl())) {
                    return zza(zza(zzhVar.zzhl(), zzbzVar.zzwh), equals);
                } else {
                    zzad().zzdd().zza("Invalid user property value for Numeric number filter. property, value", zzaa().zzan(zzhVar.getName()), zzhVar.zzhl());
                }
                return null;
            }
            return zza(zza(zzhVar.zzhl(), zzbzVar.zzwg), equals);
        } else {
            zzad().zzdd().zza("User property has no value, property", zzaa().zzan(zzhVar.getName()));
            return null;
        }
    }

    @VisibleForTesting
    private static Boolean zza(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    @VisibleForTesting
    private final Boolean zza(String str, com.google.android.gms.internal.measurement.zzcc zzccVar) {
        zzbl.zzb.EnumC0014zzb enumC0014zzb;
        String str2;
        List<String> list;
        Preconditions.checkNotNull(zzccVar);
        if (str == null || (enumC0014zzb = zzccVar.zzws) == null || enumC0014zzb == zzbl.zzb.EnumC0014zzb.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzbl.zzb.EnumC0014zzb enumC0014zzb2 = zzbl.zzb.EnumC0014zzb.IN_LIST;
        if (enumC0014zzb == enumC0014zzb2) {
            String[] strArr = zzccVar.zzwv;
            if (strArr == null || strArr.length == 0) {
                return null;
            }
        } else if (zzccVar.zzwt == null) {
            return null;
        }
        Boolean bool = zzccVar.zzwu;
        boolean z = bool != null && bool.booleanValue();
        if (!z && enumC0014zzb != zzbl.zzb.EnumC0014zzb.REGEXP && enumC0014zzb != enumC0014zzb2) {
            str2 = zzccVar.zzwt.toUpperCase(Locale.ENGLISH);
        } else {
            str2 = zzccVar.zzwt;
        }
        String str3 = str2;
        String[] strArr2 = zzccVar.zzwv;
        if (strArr2 == null) {
            list = null;
        } else if (z) {
            list = Arrays.asList(strArr2);
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str4 : strArr2) {
                arrayList.add(str4.toUpperCase(Locale.ENGLISH));
            }
            list = arrayList;
        }
        return zza(str, enumC0014zzb, z, str3, list, enumC0014zzb == zzbl.zzb.EnumC0014zzb.REGEXP ? str3 : null);
    }

    private final Boolean zza(String str, zzbl.zzb.EnumC0014zzb enumC0014zzb, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (enumC0014zzb == zzbl.zzb.EnumC0014zzb.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && enumC0014zzb != zzbl.zzb.EnumC0014zzb.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (zzp.zzds[enumC0014zzb.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    zzad().zzdd().zza("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    private final Boolean zza(long j, com.google.android.gms.internal.measurement.zzca zzcaVar) {
        try {
            return zza(new BigDecimal(j), zzcaVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean zza(double d, com.google.android.gms.internal.measurement.zzca zzcaVar) {
        try {
            return zza(new BigDecimal(d), zzcaVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean zza(String str, com.google.android.gms.internal.measurement.zzca zzcaVar) {
        if (zzfz.zzbl(str)) {
            try {
                return zza(new BigDecimal(str), zzcaVar, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005d, code lost:
        if (r3 != null) goto L23;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Boolean zza(java.math.BigDecimal r9, com.google.android.gms.internal.measurement.zzca r10, double r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzo.zza(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzca, double):java.lang.Boolean");
    }

    private static List<zzbt.zzb> zza(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            arrayList.add((zzbt.zzb) ((com.google.android.gms.internal.measurement.zzez) zzbt.zzb.zzhg().zzj(intValue).zzag(map.get(Integer.valueOf(intValue)).longValue()).zzmr()));
        }
        return arrayList;
    }

    private static boolean zza(com.google.android.gms.internal.measurement.zzcb zzcbVar) {
        Boolean bool;
        return (zzcbVar == null || (bool = zzcbVar.zzvx) == null || !bool.booleanValue()) ? false : true;
    }

    private static void zza(Map<Integer, Long> map, int i, long j) {
        Long l = map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }
}
