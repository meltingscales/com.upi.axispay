package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzgn<T> implements zzgy<T> {
    private final zzgh zzaje;
    private final boolean zzajf;
    private final zzhq<?, ?> zzajo;
    private final zzen<?> zzajp;

    private zzgn(zzhq<?, ?> zzhqVar, zzen<?> zzenVar, zzgh zzghVar) {
        this.zzajo = zzhqVar;
        this.zzajf = zzenVar.zze(zzghVar);
        this.zzajp = zzenVar;
        this.zzaje = zzghVar;
    }

    public static <T> zzgn<T> zza(zzhq<?, ?> zzhqVar, zzen<?> zzenVar, zzgh zzghVar) {
        return new zzgn<>(zzhqVar, zzenVar, zzghVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final boolean equals(T t, T t2) {
        if (this.zzajo.zzw(t).equals(this.zzajo.zzw(t2))) {
            if (this.zzajf) {
                return this.zzajp.zzg(t).equals(this.zzajp.zzg(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int hashCode(T t) {
        int hashCode = this.zzajo.zzw(t).hashCode();
        return this.zzajf ? (hashCode * 53) + this.zzajp.zzg(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final T newInstance() {
        return (T) this.zzaje.zzml().zzmq();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzc(T t, T t2) {
        zzha.zza(this.zzajo, t, t2);
        if (this.zzajf) {
            zzha.zza(this.zzajp, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzi(T t) {
        this.zzajo.zzi(t);
        this.zzajp.zzi(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzs(T t) {
        zzhq<?, ?> zzhqVar = this.zzajo;
        int zzy = zzhqVar.zzy(zzhqVar.zzw(t)) + 0;
        return this.zzajf ? zzy + this.zzajp.zzg(t).zzlz() : zzy;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final boolean zzu(T t) {
        return this.zzajp.zzg(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zza(T t, zzil zzilVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzajp.zzg(t).iterator();
        while (it.hasNext()) {
            Map.Entry<?, Object> next = it.next();
            zzes zzesVar = (zzes) next.getKey();
            if (zzesVar.zzmb() == zzik.MESSAGE && !zzesVar.zzmc() && !zzesVar.zzmd()) {
                if (next instanceof zzfm) {
                    zzilVar.zza(zzesVar.zzgp(), (Object) ((zzfm) next).zznf().zzjv());
                } else {
                    zzilVar.zza(zzesVar.zzgp(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzhq<?, ?> zzhqVar = this.zzajo;
        zzhqVar.zzc(zzhqVar.zzw(t), zzilVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099 A[EDGE_INSN: B:57:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzgy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.zzdm r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzez r0 = (com.google.android.gms.internal.measurement.zzez) r0
            com.google.android.gms.internal.measurement.zzhr r1 = r0.zzagn
            com.google.android.gms.internal.measurement.zzhr r2 = com.google.android.gms.internal.measurement.zzhr.zzor()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.zzhr r1 = com.google.android.gms.internal.measurement.zzhr.zzos()
            r0.zzagn = r1
        L11:
            com.google.android.gms.internal.measurement.zzez$zzc r10 = (com.google.android.gms.internal.measurement.zzez.zzc) r10
            r10.zzms()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.zzdl.zza(r11, r12, r14)
            int r2 = r14.zzabs
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.zzen<?> r12 = r9.zzajp
            com.google.android.gms.internal.measurement.zzem r0 = r14.zzabv
            com.google.android.gms.internal.measurement.zzgh r3 = r9.zzaje
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzez$zzd r0 = (com.google.android.gms.internal.measurement.zzez.zzd) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.zzdl.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.zzgu.zznz()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.zzdl.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzdl.zza(r11, r4, r14)
            int r5 = r14.zzabs
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzdl.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zzabu
            com.google.android.gms.internal.measurement.zzdp r2 = (com.google.android.gms.internal.measurement.zzdp) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.zzgu.zznz()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzdl.zza(r11, r4, r14)
            int r12 = r14.zzabs
            com.google.android.gms.internal.measurement.zzen<?> r0 = r9.zzajp
            com.google.android.gms.internal.measurement.zzem r5 = r14.zzabv
            com.google.android.gms.internal.measurement.zzgh r6 = r9.zzaje
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzez$zzd r0 = (com.google.android.gms.internal.measurement.zzez.zzd) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzdl.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zzb(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.zzfh r10 = com.google.android.gms.internal.measurement.zzfh.zznb()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgn.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzdm):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zza(T t, zzgx zzgxVar, zzem zzemVar) throws IOException {
        boolean z;
        zzhq<?, ?> zzhqVar = this.zzajo;
        zzen<?> zzenVar = this.zzajp;
        Object zzx = zzhqVar.zzx(t);
        zzeq<?> zzh = zzenVar.zzh(t);
        do {
            try {
                if (zzgxVar.zzlh() == Integer.MAX_VALUE) {
                    return;
                }
                int tag = zzgxVar.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    zzdp zzdpVar = null;
                    while (zzgxVar.zzlh() != Integer.MAX_VALUE) {
                        int tag2 = zzgxVar.getTag();
                        if (tag2 == 16) {
                            i = zzgxVar.zzks();
                            obj = zzenVar.zza(zzemVar, this.zzaje, i);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                zzenVar.zza(zzgxVar, obj, zzemVar, zzh);
                            } else {
                                zzdpVar = zzgxVar.zzkr();
                            }
                        } else if (!zzgxVar.zzli()) {
                            break;
                        }
                    }
                    if (zzgxVar.getTag() != 12) {
                        throw zzfh.zzmy();
                    } else if (zzdpVar != null) {
                        if (obj != null) {
                            zzenVar.zza(zzdpVar, obj, zzemVar, zzh);
                        } else {
                            zzhqVar.zza((zzhq<?, ?>) zzx, i, zzdpVar);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object zza = zzenVar.zza(zzemVar, this.zzaje, tag >>> 3);
                    if (zza != null) {
                        zzenVar.zza(zzgxVar, zza, zzemVar, zzh);
                    } else {
                        z = zzhqVar.zza((zzhq<?, ?>) zzx, zzgxVar);
                        continue;
                    }
                } else {
                    z = zzgxVar.zzli();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzhqVar.zzf(t, zzx);
            }
        } while (z);
    }
}
