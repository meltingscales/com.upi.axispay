package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzip extends zziq<zzjb.zzf> {
    @Override // com.google.android.gms.internal.vision.zziq
    public final boolean zza(zzkk zzkkVar) {
        return zzkkVar instanceof zzjb.zzc;
    }

    @Override // com.google.android.gms.internal.vision.zziq
    public final zziu<zzjb.zzf> zzb(Object obj) {
        return ((zzjb.zzc) obj).zza();
    }

    @Override // com.google.android.gms.internal.vision.zziq
    public final void zzc(Object obj) {
        zza(obj).zzb();
    }

    @Override // com.google.android.gms.internal.vision.zziq
    public final zziu<zzjb.zzf> zza(Object obj) {
        return ((zzjb.zzc) obj).zzc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ec, code lost:
        if (r5 != 18) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.vision.zzjh] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    @Override // com.google.android.gms.internal.vision.zziq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <UT, UB> UB zza(com.google.android.gms.internal.vision.zzld r5, java.lang.Object r6, com.google.android.gms.internal.vision.zzio r7, com.google.android.gms.internal.vision.zziu<com.google.android.gms.internal.vision.zzjb.zzf> r8, UB r9, com.google.android.gms.internal.vision.zzlu<UT, UB> r10) throws java.io.IOException {
        /*
            r4 = this;
            com.google.android.gms.internal.vision.zzjb$zze r6 = (com.google.android.gms.internal.vision.zzjb.zze) r6
            com.google.android.gms.internal.vision.zzjb$zzf r0 = r6.zzd
            int r1 = r0.zzb
            boolean r2 = r0.zzd
            com.google.android.gms.internal.vision.zzml r0 = r0.zzc
            com.google.android.gms.internal.vision.zzml r2 = com.google.android.gms.internal.vision.zzml.zzn
            r3 = 0
            if (r0 != r2) goto L24
            int r5 = r5.zzh()
            com.google.android.gms.internal.vision.zzje r7 = r3.zza(r5)
            if (r7 != 0) goto L1e
            java.lang.Object r5 = com.google.android.gms.internal.vision.zzle.zza(r1, r5, r9, r10)
            return r5
        L1e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            goto Ld2
        L24:
            int[] r10 = com.google.android.gms.internal.vision.zzis.zza
            int r0 = r0.ordinal()
            r10 = r10[r0]
            switch(r10) {
                case 1: goto Lca;
                case 2: goto Lc1;
                case 3: goto Lb8;
                case 4: goto Laf;
                case 5: goto La6;
                case 6: goto L9d;
                case 7: goto L94;
                case 8: goto L8b;
                case 9: goto L82;
                case 10: goto L79;
                case 11: goto L70;
                case 12: goto L67;
                case 13: goto L5d;
                case 14: goto L55;
                case 15: goto L4f;
                case 16: goto L49;
                case 17: goto L3d;
                case 18: goto L31;
                default: goto L2f;
            }
        L2f:
            goto Ld2
        L31:
            com.google.android.gms.internal.vision.zzkk r10 = r6.zzc
            java.lang.Class r10 = r10.getClass()
            java.lang.Object r3 = r5.zza(r10, r7)
            goto Ld2
        L3d:
            com.google.android.gms.internal.vision.zzkk r10 = r6.zzc
            java.lang.Class r10 = r10.getClass()
            java.lang.Object r3 = r5.zzb(r10, r7)
            goto Ld2
        L49:
            java.lang.String r3 = r5.zzl()
            goto Ld2
        L4f:
            com.google.android.gms.internal.vision.zzht r3 = r5.zzn()
            goto Ld2
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Shouldn't reach here."
            r5.<init>(r6)
            throw r5
        L5d:
            long r0 = r5.zzt()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            goto Ld2
        L67:
            int r5 = r5.zzs()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            goto Ld2
        L70:
            long r0 = r5.zzr()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            goto Ld2
        L79:
            int r5 = r5.zzq()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            goto Ld2
        L82:
            int r5 = r5.zzo()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            goto Ld2
        L8b:
            boolean r5 = r5.zzk()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            goto Ld2
        L94:
            int r5 = r5.zzj()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            goto Ld2
        L9d:
            long r0 = r5.zzi()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            goto Ld2
        La6:
            int r5 = r5.zzh()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            goto Ld2
        Laf:
            long r0 = r5.zzf()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            goto Ld2
        Lb8:
            long r0 = r5.zzg()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            goto Ld2
        Lc1:
            float r5 = r5.zze()
            java.lang.Float r3 = java.lang.Float.valueOf(r5)
            goto Ld2
        Lca:
            double r0 = r5.zzd()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
        Ld2:
            com.google.android.gms.internal.vision.zzjb$zzf r5 = r6.zzd
            boolean r7 = r5.zzd
            if (r7 == 0) goto Ldc
            r8.zzb(r5, r3)
            goto L100
        Ldc:
            int[] r7 = com.google.android.gms.internal.vision.zzis.zza
            com.google.android.gms.internal.vision.zzml r5 = r5.zzc
            int r5 = r5.ordinal()
            r5 = r7[r5]
            r7 = 17
            if (r5 == r7) goto Lef
            r7 = 18
            if (r5 == r7) goto Lef
            goto Lfb
        Lef:
            com.google.android.gms.internal.vision.zzjb$zzf r5 = r6.zzd
            java.lang.Object r5 = r8.zza(r5)
            if (r5 == 0) goto Lfb
            java.lang.Object r3 = com.google.android.gms.internal.vision.zzjf.zza(r5, r3)
        Lfb:
            com.google.android.gms.internal.vision.zzjb$zzf r5 = r6.zzd
            r8.zza(r5, r3)
        L100:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzip.zza(com.google.android.gms.internal.vision.zzld, java.lang.Object, com.google.android.gms.internal.vision.zzio, com.google.android.gms.internal.vision.zziu, java.lang.Object, com.google.android.gms.internal.vision.zzlu):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.vision.zziq
    public final int zza(Map.Entry<?, ?> entry) {
        return ((zzjb.zzf) entry.getKey()).zzb;
    }

    @Override // com.google.android.gms.internal.vision.zziq
    public final void zza(zzmr zzmrVar, Map.Entry<?, ?> entry) throws IOException {
        zzjb.zzf zzfVar = (zzjb.zzf) entry.getKey();
        if (zzfVar.zzd) {
            switch (zzis.zza[zzfVar.zzc.ordinal()]) {
                case 1:
                    zzle.zza(zzfVar.zzb, (List<Double>) entry.getValue(), zzmrVar, false);
                    return;
                case 2:
                    zzle.zzb(zzfVar.zzb, (List<Float>) entry.getValue(), zzmrVar, false);
                    return;
                case 3:
                    zzle.zzc(zzfVar.zzb, (List) entry.getValue(), zzmrVar, false);
                    return;
                case 4:
                    zzle.zzd(zzfVar.zzb, (List) entry.getValue(), zzmrVar, false);
                    return;
                case 5:
                    zzle.zzh(zzfVar.zzb, (List) entry.getValue(), zzmrVar, false);
                    return;
                case 6:
                    zzle.zzf(zzfVar.zzb, (List) entry.getValue(), zzmrVar, false);
                    return;
                case 7:
                    zzle.zzk(zzfVar.zzb, (List) entry.getValue(), zzmrVar, false);
                    return;
                case 8:
                    zzle.zzn(zzfVar.zzb, (List) entry.getValue(), zzmrVar, false);
                    return;
                case 9:
                    zzle.zzi(zzfVar.zzb, (List) entry.getValue(), zzmrVar, false);
                    return;
                case 10:
                    zzle.zzl(zzfVar.zzb, (List) entry.getValue(), zzmrVar, false);
                    return;
                case 11:
                    zzle.zzg(zzfVar.zzb, (List) entry.getValue(), zzmrVar, false);
                    return;
                case 12:
                    zzle.zzj(zzfVar.zzb, (List) entry.getValue(), zzmrVar, false);
                    return;
                case 13:
                    zzle.zze(zzfVar.zzb, (List) entry.getValue(), zzmrVar, false);
                    return;
                case 14:
                    zzle.zzh(zzfVar.zzb, (List) entry.getValue(), zzmrVar, false);
                    return;
                case 15:
                    zzle.zzb(zzfVar.zzb, (List) entry.getValue(), zzmrVar);
                    return;
                case 16:
                    zzle.zza(zzfVar.zzb, (List) entry.getValue(), zzmrVar);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    zzle.zzb(zzfVar.zzb, (List) entry.getValue(), zzmrVar, zzky.zza().zza((Class) list.get(0).getClass()));
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    zzle.zza(zzfVar.zzb, (List) entry.getValue(), zzmrVar, zzky.zza().zza((Class) list2.get(0).getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (zzis.zza[zzfVar.zzc.ordinal()]) {
            case 1:
                zzmrVar.zza(zzfVar.zzb, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                zzmrVar.zza(zzfVar.zzb, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                zzmrVar.zza(zzfVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzmrVar.zzc(zzfVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                zzmrVar.zzc(zzfVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                zzmrVar.zzd(zzfVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                zzmrVar.zzd(zzfVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                zzmrVar.zza(zzfVar.zzb, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                zzmrVar.zze(zzfVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                zzmrVar.zza(zzfVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                zzmrVar.zzb(zzfVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                zzmrVar.zzf(zzfVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzmrVar.zze(zzfVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                zzmrVar.zzc(zzfVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzmrVar.zza(zzfVar.zzb, (zzht) entry.getValue());
                return;
            case 16:
                zzmrVar.zza(zzfVar.zzb, (String) entry.getValue());
                return;
            case 17:
                zzmrVar.zzb(zzfVar.zzb, entry.getValue(), zzky.zza().zza((Class) entry.getValue().getClass()));
                return;
            case 18:
                zzmrVar.zza(zzfVar.zzb, entry.getValue(), zzky.zza().zza((Class) entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.vision.zziq
    public final Object zza(zzio zzioVar, zzkk zzkkVar, int i) {
        return zzioVar.zza(zzkkVar, i);
    }

    @Override // com.google.android.gms.internal.vision.zziq
    public final void zza(zzld zzldVar, Object obj, zzio zzioVar, zziu<zzjb.zzf> zziuVar) throws IOException {
        zzjb.zze zzeVar = (zzjb.zze) obj;
        zziuVar.zza((zziu<zzjb.zzf>) zzeVar.zzd, zzldVar.zza(zzeVar.zzc.getClass(), zzioVar));
    }

    @Override // com.google.android.gms.internal.vision.zziq
    public final void zza(zzht zzhtVar, Object obj, zzio zzioVar, zziu<zzjb.zzf> zziuVar) throws IOException {
        byte[] bArr;
        zzjb.zze zzeVar = (zzjb.zze) obj;
        zzkk zze = zzeVar.zzc.zzq().zze();
        int zza = zzhtVar.zza();
        if (zza == 0) {
            bArr = zzjf.zzb;
        } else {
            byte[] bArr2 = new byte[zza];
            zzhtVar.zza(bArr2, 0, 0, zza);
            bArr = bArr2;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray()) {
            zzho zzhoVar = new zzho(wrap, true);
            zzky.zza().zza((zzky) zze).zza(zze, zzhoVar, zzioVar);
            zziuVar.zza((zziu<zzjb.zzf>) zzeVar.zzd, zze);
            if (zzhoVar.zza() != Integer.MAX_VALUE) {
                throw zzjk.zze();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
