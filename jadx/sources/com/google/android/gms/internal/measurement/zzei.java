package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzez;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzei implements zzil {
    private final zzeg zzacf;

    private zzei(zzeg zzegVar) {
        zzeg zzegVar2 = (zzeg) zzfb.zza(zzegVar, "output");
        this.zzacf = zzegVar2;
        zzegVar2.zzacw = this;
    }

    public static zzei zza(zzeg zzegVar) {
        zzei zzeiVar = zzegVar.zzacw;
        return zzeiVar != null ? zzeiVar : new zzei(zzegVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzas(int i) throws IOException {
        this.zzacf.zzb(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzat(int i) throws IOException {
        this.zzacf.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzb(int i, boolean z) throws IOException {
        this.zzacf.zzb(i, z);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzc(int i, int i2) throws IOException {
        this.zzacf.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzd(int i, int i2) throws IOException {
        this.zzacf.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zze(int i, int i2) throws IOException {
        this.zzacf.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzf(int i, int i2) throws IOException {
        this.zzacf.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zze(list.get(i4).doubleValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzd(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zza(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzap(list.get(i4).intValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzaf(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zzc(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzi(int i, long j) throws IOException {
        this.zzacf.zza(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzj(int i, long j) throws IOException {
        this.zzacf.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzao(list.get(i4).intValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzai(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zzf(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzax(list.get(i4).longValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzas(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final int zzln() {
        return zzez.zze.zzahf;
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzm(int i, int i2) throws IOException {
        this.zzacf.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzn(int i, int i2) throws IOException {
        this.zzacf.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzb(int i, String str) throws IOException {
        this.zzacf.zzb(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzc(int i, long j) throws IOException {
        this.zzacf.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzau(list.get(i4).longValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzaq(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzaw(list.get(i4).longValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzas(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzb(list.get(i4).floatValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zza(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zza(int i, float f) throws IOException {
        this.zzacf.zza(i, f);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzb(int i, long j) throws IOException {
        this.zzacf.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzat(list.get(i4).longValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzaq(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzn(list.get(i4).booleanValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzm(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zzb(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzal(list.get(i4).intValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzag(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zzd(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzam(list.get(i4).intValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzah(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zze(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzav(list.get(i4).longValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzar(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zzb(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zza(int i, double d) throws IOException {
        this.zzacf.zza(i, d);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzb(int i, Object obj, zzgy zzgyVar) throws IOException {
        zzeg zzegVar = this.zzacf;
        zzegVar.zzb(i, 3);
        zzgyVar.zza((zzgh) obj, zzegVar.zzacw);
        zzegVar.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zza(int i, long j) throws IOException {
        this.zzacf.zza(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zza(int i, zzdp zzdpVar) throws IOException {
        this.zzacf.zza(i, zzdpVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zza(int i, Object obj, zzgy zzgyVar) throws IOException {
        this.zzacf.zza(i, (zzgh) obj, zzgyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzdp) {
            this.zzacf.zzb(i, (zzdp) obj);
        } else {
            this.zzacf.zzb(i, (zzgh) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzan(list.get(i4).intValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzai(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zzf(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzacf.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeg.zzak(list.get(i4).intValue());
            }
            this.zzacf.zzag(i3);
            while (i2 < list.size()) {
                this.zzacf.zzaf(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zzc(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzb(int i, List<zzdp> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzacf.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zzb(int i, List<?> list, zzgy zzgyVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzgyVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzfq) {
            zzfq zzfqVar = (zzfq) list;
            while (i2 < list.size()) {
                Object zzaw = zzfqVar.zzaw(i2);
                if (zzaw instanceof String) {
                    this.zzacf.zzb(i, (String) zzaw);
                } else {
                    this.zzacf.zza(i, (zzdp) zzaw);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzacf.zzb(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final void zza(int i, List<?> list, zzgy zzgyVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzgyVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzil
    public final <K, V> void zza(int i, zzga<K, V> zzgaVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zzacf.zzb(i, 2);
            this.zzacf.zzag(zzfz.zza(zzgaVar, entry.getKey(), entry.getValue()));
            zzfz.zza(this.zzacf, zzgaVar, entry.getKey(), entry.getValue());
        }
    }
}
