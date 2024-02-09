package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzby extends zzip<zzby> {
    private static volatile zzby[] zzvz;
    public Integer zzwa = null;
    public String zzwb = null;
    public zzbz[] zzwc = zzbz.zzjc();
    private Boolean zzwd = null;
    public zzca zzwe = null;
    public Boolean zzvx = null;
    public Boolean zzvy = null;

    public zzby() {
        this.zzand = null;
        this.zzanm = -1;
    }

    public static zzby[] zzjb() {
        if (zzvz == null) {
            synchronized (zzit.zzanl) {
                if (zzvz == null) {
                    zzvz = new zzby[0];
                }
            }
        }
        return zzvz;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzby) {
            zzby zzbyVar = (zzby) obj;
            Integer num = this.zzwa;
            if (num == null) {
                if (zzbyVar.zzwa != null) {
                    return false;
                }
            } else if (!num.equals(zzbyVar.zzwa)) {
                return false;
            }
            String str = this.zzwb;
            if (str == null) {
                if (zzbyVar.zzwb != null) {
                    return false;
                }
            } else if (!str.equals(zzbyVar.zzwb)) {
                return false;
            }
            if (zzit.equals(this.zzwc, zzbyVar.zzwc)) {
                Boolean bool = this.zzwd;
                if (bool == null) {
                    if (zzbyVar.zzwd != null) {
                        return false;
                    }
                } else if (!bool.equals(zzbyVar.zzwd)) {
                    return false;
                }
                zzca zzcaVar = this.zzwe;
                if (zzcaVar == null) {
                    if (zzbyVar.zzwe != null) {
                        return false;
                    }
                } else if (!zzcaVar.equals(zzbyVar.zzwe)) {
                    return false;
                }
                Boolean bool2 = this.zzvx;
                if (bool2 == null) {
                    if (zzbyVar.zzvx != null) {
                        return false;
                    }
                } else if (!bool2.equals(zzbyVar.zzvx)) {
                    return false;
                }
                Boolean bool3 = this.zzvy;
                if (bool3 == null) {
                    if (zzbyVar.zzvy != null) {
                        return false;
                    }
                } else if (!bool3.equals(zzbyVar.zzvy)) {
                    return false;
                }
                zzir zzirVar = this.zzand;
                if (zzirVar != null && !zzirVar.isEmpty()) {
                    return this.zzand.equals(zzbyVar.zzand);
                }
                zzir zzirVar2 = zzbyVar.zzand;
                return zzirVar2 == null || zzirVar2.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (zzby.class.getName().hashCode() + 527) * 31;
        Integer num = this.zzwa;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.zzwb;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + zzit.hashCode(this.zzwc)) * 31;
        Boolean bool = this.zzwd;
        int hashCode4 = hashCode3 + (bool == null ? 0 : bool.hashCode());
        zzca zzcaVar = this.zzwe;
        int hashCode5 = ((hashCode4 * 31) + (zzcaVar == null ? 0 : zzcaVar.hashCode())) * 31;
        Boolean bool2 = this.zzvx;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.zzvy;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        zzir zzirVar = this.zzand;
        if (zzirVar != null && !zzirVar.isEmpty()) {
            i = this.zzand.hashCode();
        }
        return hashCode7 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final void zza(zzin zzinVar) throws IOException {
        Integer num = this.zzwa;
        if (num != null) {
            zzinVar.zzc(1, num.intValue());
        }
        String str = this.zzwb;
        if (str != null) {
            zzinVar.zzb(2, str);
        }
        zzbz[] zzbzVarArr = this.zzwc;
        if (zzbzVarArr != null && zzbzVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzbz[] zzbzVarArr2 = this.zzwc;
                if (i >= zzbzVarArr2.length) {
                    break;
                }
                zzbz zzbzVar = zzbzVarArr2[i];
                if (zzbzVar != null) {
                    zzinVar.zza(3, zzbzVar);
                }
                i++;
            }
        }
        Boolean bool = this.zzwd;
        if (bool != null) {
            zzinVar.zzb(4, bool.booleanValue());
        }
        zzca zzcaVar = this.zzwe;
        if (zzcaVar != null) {
            zzinVar.zza(5, zzcaVar);
        }
        Boolean bool2 = this.zzvx;
        if (bool2 != null) {
            zzinVar.zzb(6, bool2.booleanValue());
        }
        Boolean bool3 = this.zzvy;
        if (bool3 != null) {
            zzinVar.zzb(7, bool3.booleanValue());
        }
        super.zza(zzinVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final int zzja() {
        int zzja = super.zzja();
        Integer num = this.zzwa;
        if (num != null) {
            zzja += zzin.zzg(1, num.intValue());
        }
        String str = this.zzwb;
        if (str != null) {
            zzja += zzin.zzc(2, str);
        }
        zzbz[] zzbzVarArr = this.zzwc;
        if (zzbzVarArr != null && zzbzVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzbz[] zzbzVarArr2 = this.zzwc;
                if (i >= zzbzVarArr2.length) {
                    break;
                }
                zzbz zzbzVar = zzbzVarArr2[i];
                if (zzbzVar != null) {
                    zzja += zzin.zzb(3, zzbzVar);
                }
                i++;
            }
        }
        Boolean bool = this.zzwd;
        if (bool != null) {
            bool.booleanValue();
            zzja += zzin.zzaj(4) + 1;
        }
        zzca zzcaVar = this.zzwe;
        if (zzcaVar != null) {
            zzja += zzin.zzb(5, zzcaVar);
        }
        Boolean bool2 = this.zzvx;
        if (bool2 != null) {
            bool2.booleanValue();
            zzja += zzin.zzaj(6) + 1;
        }
        Boolean bool3 = this.zzvy;
        if (bool3 != null) {
            bool3.booleanValue();
            return zzja + zzin.zzaj(7) + 1;
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
                this.zzwa = Integer.valueOf(zzimVar.zzlb());
            } else if (zzkj == 18) {
                this.zzwb = zzimVar.readString();
            } else if (zzkj == 26) {
                int zzb = zziy.zzb(zzimVar, 26);
                zzbz[] zzbzVarArr = this.zzwc;
                int length = zzbzVarArr == null ? 0 : zzbzVarArr.length;
                int i = zzb + length;
                zzbz[] zzbzVarArr2 = new zzbz[i];
                if (length != 0) {
                    System.arraycopy(zzbzVarArr, 0, zzbzVarArr2, 0, length);
                }
                while (length < i - 1) {
                    zzbzVarArr2[length] = new zzbz();
                    zzimVar.zza(zzbzVarArr2[length]);
                    zzimVar.zzkj();
                    length++;
                }
                zzbzVarArr2[length] = new zzbz();
                zzimVar.zza(zzbzVarArr2[length]);
                this.zzwc = zzbzVarArr2;
            } else if (zzkj == 32) {
                this.zzwd = Boolean.valueOf(zzimVar.zzkp());
            } else if (zzkj == 42) {
                if (this.zzwe == null) {
                    this.zzwe = new zzca();
                }
                zzimVar.zza(this.zzwe);
            } else if (zzkj == 48) {
                this.zzvx = Boolean.valueOf(zzimVar.zzkp());
            } else if (zzkj != 56) {
                if (!super.zza(zzimVar, zzkj)) {
                    return this;
                }
            } else {
                this.zzvy = Boolean.valueOf(zzimVar.zzkp());
            }
        }
    }
}
