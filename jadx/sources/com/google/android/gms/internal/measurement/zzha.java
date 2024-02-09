package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzha {
    private static final Class<?> zzajx = zzog();
    private static final zzhq<?, ?> zzajy = zzp(false);
    private static final zzhq<?, ?> zzajz = zzp(true);
    private static final zzhq<?, ?> zzaka = new zzhs();

    public static void zza(int i, List<Double> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzg(i, list, z);
    }

    public static int zzaa(List<?> list) {
        return list.size() << 2;
    }

    public static int zzab(List<?> list) {
        return list.size() << 3;
    }

    public static int zzac(List<?> list) {
        return list.size();
    }

    public static void zzb(int i, List<Float> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzf(i, list, z);
    }

    public static void zzc(int i, List<Long> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Long> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzn(i, list, z);
    }

    public static void zzf(int i, List<Long> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zze(i, list, z);
    }

    public static void zzg(Class<?> cls) {
        Class<?> cls2;
        if (!zzez.class.isAssignableFrom(cls) && (cls2 = zzajx) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzh(int i, List<Integer> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zza(i, list, z);
    }

    public static void zzi(int i, List<Integer> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzm(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzi(i, list, z);
    }

    public static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzt(list) + (list.size() * zzeg.zzaj(i));
    }

    public static zzhq<?, ?> zzod() {
        return zzajy;
    }

    public static zzhq<?, ?> zzoe() {
        return zzajz;
    }

    public static zzhq<?, ?> zzof() {
        return zzaka;
    }

    private static Class<?> zzog() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzoh() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzu(list) + (size * zzeg.zzaj(i));
    }

    public static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzeg.zzaj(i));
    }

    public static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzeg.zzaj(i));
    }

    public static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzeg.zzaj(i));
    }

    public static int zzt(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfv) {
            zzfv zzfvVar = (zzfv) list;
            i = 0;
            while (i2 < size) {
                i += zzeg.zzat(zzfvVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeg.zzat(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzu(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfv) {
            zzfv zzfvVar = (zzfv) list;
            i = 0;
            while (i2 < size) {
                i += zzeg.zzau(zzfvVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeg.zzau(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzv(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfv) {
            zzfv zzfvVar = (zzfv) list;
            i = 0;
            while (i2 < size) {
                i += zzeg.zzav(zzfvVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeg.zzav(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzw(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            i = 0;
            while (i2 < size) {
                i += zzeg.zzap(zzfaVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeg.zzap(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzx(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            i = 0;
            while (i2 < size) {
                i += zzeg.zzak(zzfaVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeg.zzak(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzy(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            i = 0;
            while (i2 < size) {
                i += zzeg.zzal(zzfaVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeg.zzal(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzz(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            i = 0;
            while (i2 < size) {
                i += zzeg.zzam(zzfaVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzeg.zzam(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void zza(int i, List<String> list, zzil zzilVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zza(i, list);
    }

    public static void zzb(int i, List<zzdp> list, zzil zzilVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzb(i, list);
    }

    public static int zzc(int i, List<?> list) {
        int zzcp;
        int zzcp2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzaj = zzeg.zzaj(i) * size;
        if (list instanceof zzfq) {
            zzfq zzfqVar = (zzfq) list;
            while (i2 < size) {
                Object zzaw = zzfqVar.zzaw(i2);
                if (zzaw instanceof zzdp) {
                    zzcp2 = zzeg.zzb((zzdp) zzaw);
                } else {
                    zzcp2 = zzeg.zzcp((String) zzaw);
                }
                zzaj += zzcp2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzdp) {
                    zzcp = zzeg.zzb((zzdp) obj);
                } else {
                    zzcp = zzeg.zzcp((String) obj);
                }
                zzaj += zzcp;
                i2++;
            }
        }
        return zzaj;
    }

    public static int zzd(int i, List<zzdp> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzaj = size * zzeg.zzaj(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzaj += zzeg.zzb(list.get(i2));
        }
        return zzaj;
    }

    public static void zzg(int i, List<Long> list, zzil zzilVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzl(i, list, z);
    }

    private static zzhq<?, ?> zzp(boolean z) {
        try {
            Class<?> zzoh = zzoh();
            if (zzoh == null) {
                return null;
            }
            return (zzhq) zzoh.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zza(int i, List<?> list, zzil zzilVar, zzgy zzgyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zza(i, list, zzgyVar);
    }

    public static void zzb(int i, List<?> list, zzil zzilVar, zzgy zzgyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzilVar.zzb(i, list, zzgyVar);
    }

    public static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzeg.zzaj(i));
    }

    public static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzz(list) + (size * zzeg.zzaj(i));
    }

    public static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzeg.zzj(i, 0);
    }

    public static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzeg.zzg(i, 0L);
    }

    public static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzeg.zzc(i, true);
    }

    public static <T> void zza(zzgc zzgcVar, T t, T t2, long j) {
        zzhw.zza(t, j, zzgcVar.zzb(zzhw.zzp(t, j), zzhw.zzp(t2, j)));
    }

    public static int zzd(int i, List<zzgh> list, zzgy zzgyVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzeg.zzc(i, list.get(i3), zzgyVar);
        }
        return i2;
    }

    public static boolean zzd(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T, FT extends zzes<FT>> void zza(zzen<FT> zzenVar, T t, T t2) {
        zzeq<FT> zzg = zzenVar.zzg(t2);
        if (zzg.isEmpty()) {
            return;
        }
        zzenVar.zzh(t).zza(zzg);
    }

    public static <T, UT, UB> void zza(zzhq<UT, UB> zzhqVar, T t, T t2) {
        zzhqVar.zze(t, zzhqVar.zzg(zzhqVar.zzw(t), zzhqVar.zzw(t2)));
    }

    public static int zzc(int i, Object obj, zzgy zzgyVar) {
        if (obj instanceof zzfo) {
            return zzeg.zza(i, (zzfo) obj);
        }
        return zzeg.zzb(i, (zzgh) obj, zzgyVar);
    }

    public static <UT, UB> UB zza(int i, List<Integer> list, zzfe zzfeVar, UB ub, zzhq<UT, UB> zzhqVar) {
        if (zzfeVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzfeVar.zzf(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, intValue, ub, zzhqVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzfeVar.zzf(intValue2)) {
                    ub = (UB) zza(i, intValue2, ub, zzhqVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static int zzc(int i, List<?> list, zzgy zzgyVar) {
        int zzb;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzaj = zzeg.zzaj(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzfo) {
                zzb = zzeg.zza((zzfo) obj);
            } else {
                zzb = zzeg.zzb((zzgh) obj, zzgyVar);
            }
            zzaj += zzb;
        }
        return zzaj;
    }

    public static <UT, UB> UB zza(int i, int i2, UB ub, zzhq<UT, UB> zzhqVar) {
        if (ub == null) {
            ub = zzhqVar.zzoq();
        }
        zzhqVar.zza((zzhq<UT, UB>) ub, i, i2);
        return ub;
    }
}
