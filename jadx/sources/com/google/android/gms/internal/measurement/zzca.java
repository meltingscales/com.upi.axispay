package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzbl;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzca extends zzip<zzca> {
    public zzbl.zza.zzb zzwk = null;
    public Boolean zzwl = null;
    public String zzwm = null;
    public String zzwn = null;
    public String zzwo = null;

    public zzca() {
        this.zzand = null;
        this.zzanm = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzca) {
            zzca zzcaVar = (zzca) obj;
            zzbl.zza.zzb zzbVar = this.zzwk;
            if (zzbVar == null) {
                if (zzcaVar.zzwk != null) {
                    return false;
                }
            } else if (!zzbVar.equals(zzcaVar.zzwk)) {
                return false;
            }
            Boolean bool = this.zzwl;
            if (bool == null) {
                if (zzcaVar.zzwl != null) {
                    return false;
                }
            } else if (!bool.equals(zzcaVar.zzwl)) {
                return false;
            }
            String str = this.zzwm;
            if (str == null) {
                if (zzcaVar.zzwm != null) {
                    return false;
                }
            } else if (!str.equals(zzcaVar.zzwm)) {
                return false;
            }
            String str2 = this.zzwn;
            if (str2 == null) {
                if (zzcaVar.zzwn != null) {
                    return false;
                }
            } else if (!str2.equals(zzcaVar.zzwn)) {
                return false;
            }
            String str3 = this.zzwo;
            if (str3 == null) {
                if (zzcaVar.zzwo != null) {
                    return false;
                }
            } else if (!str3.equals(zzcaVar.zzwo)) {
                return false;
            }
            zzir zzirVar = this.zzand;
            if (zzirVar != null && !zzirVar.isEmpty()) {
                return this.zzand.equals(zzcaVar.zzand);
            }
            zzir zzirVar2 = zzcaVar.zzand;
            return zzirVar2 == null || zzirVar2.isEmpty();
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (zzca.class.getName().hashCode() + 527) * 31;
        zzbl.zza.zzb zzbVar = this.zzwk;
        int i = 0;
        int hashCode2 = (hashCode + (zzbVar == null ? 0 : zzbVar.hashCode())) * 31;
        Boolean bool = this.zzwl;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.zzwm;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zzwn;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zzwo;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        zzir zzirVar = this.zzand;
        if (zzirVar != null && !zzirVar.isEmpty()) {
            i = this.zzand.hashCode();
        }
        return hashCode6 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final void zza(zzin zzinVar) throws IOException {
        zzbl.zza.zzb zzbVar = this.zzwk;
        if (zzbVar != null && zzbVar != null) {
            zzinVar.zzc(1, zzbVar.zzgp());
        }
        Boolean bool = this.zzwl;
        if (bool != null) {
            zzinVar.zzb(2, bool.booleanValue());
        }
        String str = this.zzwm;
        if (str != null) {
            zzinVar.zzb(3, str);
        }
        String str2 = this.zzwn;
        if (str2 != null) {
            zzinVar.zzb(4, str2);
        }
        String str3 = this.zzwo;
        if (str3 != null) {
            zzinVar.zzb(5, str3);
        }
        super.zza(zzinVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final int zzja() {
        int zzja = super.zzja();
        zzbl.zza.zzb zzbVar = this.zzwk;
        if (zzbVar != null && zzbVar != null) {
            zzja += zzin.zzg(1, zzbVar.zzgp());
        }
        Boolean bool = this.zzwl;
        if (bool != null) {
            bool.booleanValue();
            zzja += zzin.zzaj(2) + 1;
        }
        String str = this.zzwm;
        if (str != null) {
            zzja += zzin.zzc(3, str);
        }
        String str2 = this.zzwn;
        if (str2 != null) {
            zzja += zzin.zzc(4, str2);
        }
        String str3 = this.zzwo;
        return str3 != null ? zzja + zzin.zzc(5, str3) : zzja;
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final /* synthetic */ zziv zza(zzim zzimVar) throws IOException {
        while (true) {
            int zzkj = zzimVar.zzkj();
            if (zzkj == 0) {
                return this;
            }
            if (zzkj == 8) {
                int position = zzimVar.getPosition();
                int zzlb = zzimVar.zzlb();
                if (zzlb != 0 && zzlb != 1 && zzlb != 2 && zzlb != 3 && zzlb != 4) {
                    zzimVar.zzbj(position);
                    zza(zzimVar, zzkj);
                } else {
                    this.zzwk = zzbl.zza.zzb.zze(zzlb);
                }
            } else if (zzkj == 16) {
                this.zzwl = Boolean.valueOf(zzimVar.zzkp());
            } else if (zzkj == 26) {
                this.zzwm = zzimVar.readString();
            } else if (zzkj == 34) {
                this.zzwn = zzimVar.readString();
            } else if (zzkj != 42) {
                if (!super.zza(zzimVar, zzkj)) {
                    return this;
                }
            } else {
                this.zzwo = zzimVar.readString();
            }
        }
    }
}
