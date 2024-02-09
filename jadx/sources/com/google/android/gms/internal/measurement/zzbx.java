package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbx extends zzip<zzbx> {
    private static volatile zzbx[] zzvt;
    public Integer zzvu = null;
    public zzcb[] zzvv = zzcb.zzjd();
    public zzby[] zzvw = zzby.zzjb();
    private Boolean zzvx = null;
    private Boolean zzvy = null;

    public zzbx() {
        this.zzand = null;
        this.zzanm = -1;
    }

    public static zzbx[] zziz() {
        if (zzvt == null) {
            synchronized (zzit.zzanl) {
                if (zzvt == null) {
                    zzvt = new zzbx[0];
                }
            }
        }
        return zzvt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbx) {
            zzbx zzbxVar = (zzbx) obj;
            Integer num = this.zzvu;
            if (num == null) {
                if (zzbxVar.zzvu != null) {
                    return false;
                }
            } else if (!num.equals(zzbxVar.zzvu)) {
                return false;
            }
            if (zzit.equals(this.zzvv, zzbxVar.zzvv) && zzit.equals(this.zzvw, zzbxVar.zzvw)) {
                Boolean bool = this.zzvx;
                if (bool == null) {
                    if (zzbxVar.zzvx != null) {
                        return false;
                    }
                } else if (!bool.equals(zzbxVar.zzvx)) {
                    return false;
                }
                Boolean bool2 = this.zzvy;
                if (bool2 == null) {
                    if (zzbxVar.zzvy != null) {
                        return false;
                    }
                } else if (!bool2.equals(zzbxVar.zzvy)) {
                    return false;
                }
                zzir zzirVar = this.zzand;
                if (zzirVar != null && !zzirVar.isEmpty()) {
                    return this.zzand.equals(zzbxVar.zzand);
                }
                zzir zzirVar2 = zzbxVar.zzand;
                return zzirVar2 == null || zzirVar2.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (zzbx.class.getName().hashCode() + 527) * 31;
        Integer num = this.zzvu;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + zzit.hashCode(this.zzvv)) * 31) + zzit.hashCode(this.zzvw)) * 31;
        Boolean bool = this.zzvx;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.zzvy;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        zzir zzirVar = this.zzand;
        if (zzirVar != null && !zzirVar.isEmpty()) {
            i = this.zzand.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final void zza(zzin zzinVar) throws IOException {
        Integer num = this.zzvu;
        if (num != null) {
            zzinVar.zzc(1, num.intValue());
        }
        zzcb[] zzcbVarArr = this.zzvv;
        int i = 0;
        if (zzcbVarArr != null && zzcbVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzcb[] zzcbVarArr2 = this.zzvv;
                if (i2 >= zzcbVarArr2.length) {
                    break;
                }
                zzcb zzcbVar = zzcbVarArr2[i2];
                if (zzcbVar != null) {
                    zzinVar.zza(2, zzcbVar);
                }
                i2++;
            }
        }
        zzby[] zzbyVarArr = this.zzvw;
        if (zzbyVarArr != null && zzbyVarArr.length > 0) {
            while (true) {
                zzby[] zzbyVarArr2 = this.zzvw;
                if (i >= zzbyVarArr2.length) {
                    break;
                }
                zzby zzbyVar = zzbyVarArr2[i];
                if (zzbyVar != null) {
                    zzinVar.zza(3, zzbyVar);
                }
                i++;
            }
        }
        Boolean bool = this.zzvx;
        if (bool != null) {
            zzinVar.zzb(4, bool.booleanValue());
        }
        Boolean bool2 = this.zzvy;
        if (bool2 != null) {
            zzinVar.zzb(5, bool2.booleanValue());
        }
        super.zza(zzinVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final int zzja() {
        int zzja = super.zzja();
        Integer num = this.zzvu;
        if (num != null) {
            zzja += zzin.zzg(1, num.intValue());
        }
        zzcb[] zzcbVarArr = this.zzvv;
        int i = 0;
        if (zzcbVarArr != null && zzcbVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzcb[] zzcbVarArr2 = this.zzvv;
                if (i2 >= zzcbVarArr2.length) {
                    break;
                }
                zzcb zzcbVar = zzcbVarArr2[i2];
                if (zzcbVar != null) {
                    zzja += zzin.zzb(2, zzcbVar);
                }
                i2++;
            }
        }
        zzby[] zzbyVarArr = this.zzvw;
        if (zzbyVarArr != null && zzbyVarArr.length > 0) {
            while (true) {
                zzby[] zzbyVarArr2 = this.zzvw;
                if (i >= zzbyVarArr2.length) {
                    break;
                }
                zzby zzbyVar = zzbyVarArr2[i];
                if (zzbyVar != null) {
                    zzja += zzin.zzb(3, zzbyVar);
                }
                i++;
            }
        }
        Boolean bool = this.zzvx;
        if (bool != null) {
            bool.booleanValue();
            zzja += zzin.zzaj(4) + 1;
        }
        Boolean bool2 = this.zzvy;
        if (bool2 != null) {
            bool2.booleanValue();
            return zzja + zzin.zzaj(5) + 1;
        }
        return zzja;
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final /* synthetic */ zziv zza(zzim zzimVar) throws IOException {
        while (true) {
            int zzkj = zzimVar.zzkj();
            if (zzkj == 0) {
                return this;
            }
            if (zzkj == 8) {
                this.zzvu = Integer.valueOf(zzimVar.zzlb());
            } else if (zzkj == 18) {
                int zzb = zziy.zzb(zzimVar, 18);
                zzcb[] zzcbVarArr = this.zzvv;
                int length = zzcbVarArr == null ? 0 : zzcbVarArr.length;
                int i = zzb + length;
                zzcb[] zzcbVarArr2 = new zzcb[i];
                if (length != 0) {
                    System.arraycopy(zzcbVarArr, 0, zzcbVarArr2, 0, length);
                }
                while (length < i - 1) {
                    zzcbVarArr2[length] = new zzcb();
                    zzimVar.zza(zzcbVarArr2[length]);
                    zzimVar.zzkj();
                    length++;
                }
                zzcbVarArr2[length] = new zzcb();
                zzimVar.zza(zzcbVarArr2[length]);
                this.zzvv = zzcbVarArr2;
            } else if (zzkj == 26) {
                int zzb2 = zziy.zzb(zzimVar, 26);
                zzby[] zzbyVarArr = this.zzvw;
                int length2 = zzbyVarArr == null ? 0 : zzbyVarArr.length;
                int i2 = zzb2 + length2;
                zzby[] zzbyVarArr2 = new zzby[i2];
                if (length2 != 0) {
                    System.arraycopy(zzbyVarArr, 0, zzbyVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    zzbyVarArr2[length2] = new zzby();
                    zzimVar.zza(zzbyVarArr2[length2]);
                    zzimVar.zzkj();
                    length2++;
                }
                zzbyVarArr2[length2] = new zzby();
                zzimVar.zza(zzbyVarArr2[length2]);
                this.zzvw = zzbyVarArr2;
            } else if (zzkj == 32) {
                this.zzvx = Boolean.valueOf(zzimVar.zzkp());
            } else if (zzkj != 40) {
                if (!super.zza(zzimVar, zzkj)) {
                    return this;
                }
            } else {
                this.zzvy = Boolean.valueOf(zzimVar.zzkp());
            }
        }
    }
}
