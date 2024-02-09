package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzft extends zzfr {
    private static final Class<?> zzaim = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzft() {
        super();
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzhw.zzp(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzfr
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzfr
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzhw.zzp(obj, j);
        if (list instanceof zzfq) {
            unmodifiableList = ((zzfq) list).zznh();
        } else if (zzaim.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzgt) && (list instanceof zzfg)) {
                zzfg zzfgVar = (zzfg) list;
                if (zzfgVar.zzjy()) {
                    zzfgVar.zzjz();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzhw.zza(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzfp zzfpVar;
        List<L> arrayList;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzfq) {
                arrayList = new zzfp(i);
            } else if ((zzc instanceof zzgt) && (zzc instanceof zzfg)) {
                arrayList = ((zzfg) zzc).zzq(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zzhw.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zzaim.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzc.size() + i);
            arrayList2.addAll(zzc);
            zzhw.zza(obj, j, arrayList2);
            zzfpVar = arrayList2;
        } else if (zzc instanceof zzht) {
            zzfp zzfpVar2 = new zzfp(zzc.size() + i);
            zzfpVar2.addAll((zzht) zzc);
            zzhw.zza(obj, j, zzfpVar2);
            zzfpVar = zzfpVar2;
        } else if ((zzc instanceof zzgt) && (zzc instanceof zzfg)) {
            zzfg zzfgVar = (zzfg) zzc;
            if (zzfgVar.zzjy()) {
                return zzc;
            }
            zzfg zzq = zzfgVar.zzq(zzc.size() + i);
            zzhw.zza(obj, j, zzq);
            return zzq;
        } else {
            return zzc;
        }
        return zzfpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzfr
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza = zza(obj, j, zzc.size());
        int size = zza.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza;
        }
        zzhw.zza(obj, j, zzc);
    }
}
