package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzeq<FieldDescriptorType extends zzes<FieldDescriptorType>> {
    private static final zzeq zzadt = new zzeq(true);
    private boolean zzadr;
    private boolean zzads = false;
    private final zzhb<FieldDescriptorType, Object> zzadq = zzhb.zzbe(16);

    private zzeq() {
    }

    private final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zzadq.get(fielddescriptortype);
        return obj instanceof zzfk ? zzfk.zzne() : obj;
    }

    private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.zzmb() == zzik.MESSAGE) {
            if (key.zzmc()) {
                for (zzgh zzghVar : (List) entry.getValue()) {
                    if (!zzghVar.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzgh) {
                    if (!((zzgh) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzfk) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        zzgh zzmr;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzfk) {
            value = zzfk.zzne();
        }
        if (key.zzmc()) {
            Object zza = zza((zzeq<FieldDescriptorType>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zzj(obj));
            }
            this.zzadq.zza((zzhb<FieldDescriptorType, Object>) key, (FieldDescriptorType) zza);
        } else if (key.zzmb() == zzik.MESSAGE) {
            Object zza2 = zza((zzeq<FieldDescriptorType>) key);
            if (zza2 == null) {
                this.zzadq.zza((zzhb<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzj(value));
                return;
            }
            if (zza2 instanceof zzgo) {
                zzmr = key.zza((zzgo) zza2, (zzgo) value);
            } else {
                zzmr = key.zza(((zzgh) zza2).zzmk(), (zzgh) value).zzmr();
            }
            this.zzadq.zza((zzhb<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzmr);
        } else {
            this.zzadq.zza((zzhb<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzj(value));
        }
    }

    private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzmb() == zzik.MESSAGE && !key.zzmc() && !key.zzmd()) {
            if (value instanceof zzfk) {
                return zzeg.zzb(entry.getKey().zzgp(), (zzfk) value);
            }
            return zzeg.zzd(entry.getKey().zzgp(), (zzgh) value);
        }
        return zzb((zzes<?>) key, value);
    }

    private static Object zzj(Object obj) {
        if (obj instanceof zzgo) {
            return ((zzgo) obj).zznv();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static <T extends zzes<T>> zzeq<T> zzlx() {
        return zzadt;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzeq zzeqVar = new zzeq();
        for (int i = 0; i < this.zzadq.zzoi(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzbf = this.zzadq.zzbf(i);
            zzeqVar.zza((zzeq) zzbf.getKey(), zzbf.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzadq.zzoj()) {
            zzeqVar.zza((zzeq) entry.getKey(), entry.getValue());
        }
        zzeqVar.zzads = this.zzads;
        return zzeqVar;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        if (this.zzads) {
            return new zzfn(this.zzadq.zzok().iterator());
        }
        return this.zzadq.zzok().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeq) {
            return this.zzadq.equals(((zzeq) obj).zzadq);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzadq.hashCode();
    }

    public final boolean isEmpty() {
        return this.zzadq.isEmpty();
    }

    public final boolean isImmutable() {
        return this.zzadr;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzadq.zzoi(); i++) {
            if (!zzb(this.zzadq.zzbf(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzadq.zzoj()) {
            if (!zzb(entry)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        if (this.zzads) {
            return new zzfn(this.zzadq.entrySet().iterator());
        }
        return this.zzadq.entrySet().iterator();
    }

    public final void zzjz() {
        if (this.zzadr) {
            return;
        }
        this.zzadq.zzjz();
        this.zzadr = true;
    }

    public final int zzly() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzadq.zzoi(); i2++) {
            Map.Entry<FieldDescriptorType, Object> zzbf = this.zzadq.zzbf(i2);
            i += zzb((zzes<?>) zzbf.getKey(), zzbf.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzadq.zzoj()) {
            i += zzb((zzes<?>) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final int zzlz() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzadq.zzoi(); i2++) {
            i += zzd(this.zzadq.zzbf(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzadq.zzoj()) {
            i += zzd(entry);
        }
        return i;
    }

    private zzeq(boolean z) {
        zzjz();
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.zzmc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    zza(fielddescriptortype.zzma(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zza(fielddescriptortype.zzma(), obj);
        }
        if (obj instanceof zzfk) {
            this.zzads = true;
        }
        this.zzadq.zza((zzhb<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    private static int zzb(zzif zzifVar, Object obj) {
        switch (zzer.zzacu[zzifVar.ordinal()]) {
            case 1:
                return zzeg.zze(((Double) obj).doubleValue());
            case 2:
                return zzeg.zzb(((Float) obj).floatValue());
            case 3:
                return zzeg.zzat(((Long) obj).longValue());
            case 4:
                return zzeg.zzau(((Long) obj).longValue());
            case 5:
                return zzeg.zzak(((Integer) obj).intValue());
            case 6:
                return zzeg.zzaw(((Long) obj).longValue());
            case 7:
                return zzeg.zzan(((Integer) obj).intValue());
            case 8:
                return zzeg.zzn(((Boolean) obj).booleanValue());
            case 9:
                return zzeg.zzd((zzgh) obj);
            case 10:
                if (obj instanceof zzfk) {
                    return zzeg.zza((zzfk) obj);
                }
                return zzeg.zzc((zzgh) obj);
            case 11:
                if (obj instanceof zzdp) {
                    return zzeg.zzb((zzdp) obj);
                }
                return zzeg.zzcp((String) obj);
            case 12:
                if (obj instanceof zzdp) {
                    return zzeg.zzb((zzdp) obj);
                }
                return zzeg.zzi((byte[]) obj);
            case 13:
                return zzeg.zzal(((Integer) obj).intValue());
            case 14:
                return zzeg.zzao(((Integer) obj).intValue());
            case 15:
                return zzeg.zzax(((Long) obj).longValue());
            case 16:
                return zzeg.zzam(((Integer) obj).intValue());
            case 17:
                return zzeg.zzav(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzfc) {
                    return zzeg.zzap(((zzfc) obj).zzgp());
                }
                return zzeg.zzap(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzfc) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzfk) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.measurement.zzif r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzfb.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.measurement.zzer.zzadu
            com.google.android.gms.internal.measurement.zzik r2 = r2.zzpb()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzgh
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzfk
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = r1
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzfc
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzdp
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L43
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            r1 = r0
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzeq.zza(com.google.android.gms.internal.measurement.zzif, java.lang.Object):void");
    }

    public final void zza(zzeq<FieldDescriptorType> zzeqVar) {
        for (int i = 0; i < zzeqVar.zzadq.zzoi(); i++) {
            zzc(zzeqVar.zzadq.zzbf(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : zzeqVar.zzadq.zzoj()) {
            zzc(entry);
        }
    }

    public static void zza(zzeg zzegVar, zzif zzifVar, int i, Object obj) throws IOException {
        if (zzifVar == zzif.zzama) {
            zzgh zzghVar = (zzgh) obj;
            zzfb.zzf(zzghVar);
            zzegVar.zzb(i, 3);
            zzghVar.zzb(zzegVar);
            zzegVar.zzb(i, 4);
            return;
        }
        zzegVar.zzb(i, zzifVar.zzpc());
        switch (zzer.zzacu[zzifVar.ordinal()]) {
            case 1:
                zzegVar.zzd(((Double) obj).doubleValue());
                return;
            case 2:
                zzegVar.zza(((Float) obj).floatValue());
                return;
            case 3:
                zzegVar.zzaq(((Long) obj).longValue());
                return;
            case 4:
                zzegVar.zzaq(((Long) obj).longValue());
                return;
            case 5:
                zzegVar.zzaf(((Integer) obj).intValue());
                return;
            case 6:
                zzegVar.zzas(((Long) obj).longValue());
                return;
            case 7:
                zzegVar.zzai(((Integer) obj).intValue());
                return;
            case 8:
                zzegVar.zzm(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzgh) obj).zzb(zzegVar);
                return;
            case 10:
                zzegVar.zzb((zzgh) obj);
                return;
            case 11:
                if (obj instanceof zzdp) {
                    zzegVar.zza((zzdp) obj);
                    return;
                } else {
                    zzegVar.zzco((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzdp) {
                    zzegVar.zza((zzdp) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzegVar.zze(bArr, 0, bArr.length);
                return;
            case 13:
                zzegVar.zzag(((Integer) obj).intValue());
                return;
            case 14:
                zzegVar.zzai(((Integer) obj).intValue());
                return;
            case 15:
                zzegVar.zzas(((Long) obj).longValue());
                return;
            case 16:
                zzegVar.zzah(((Integer) obj).intValue());
                return;
            case 17:
                zzegVar.zzar(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzfc) {
                    zzegVar.zzaf(((zzfc) obj).zzgp());
                    return;
                } else {
                    zzegVar.zzaf(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private static int zzb(zzes<?> zzesVar, Object obj) {
        zzif zzma = zzesVar.zzma();
        int zzgp = zzesVar.zzgp();
        if (zzesVar.zzmc()) {
            int i = 0;
            if (zzesVar.zzmd()) {
                for (Object obj2 : (List) obj) {
                    i += zzb(zzma, obj2);
                }
                return zzeg.zzaj(zzgp) + i + zzeg.zzar(i);
            }
            for (Object obj3 : (List) obj) {
                i += zza(zzma, zzgp, obj3);
            }
            return i;
        }
        return zza(zzma, zzgp, obj);
    }

    public static int zza(zzif zzifVar, int i, Object obj) {
        int zzaj = zzeg.zzaj(i);
        if (zzifVar == zzif.zzama) {
            zzfb.zzf((zzgh) obj);
            zzaj <<= 1;
        }
        return zzaj + zzb(zzifVar, obj);
    }
}
