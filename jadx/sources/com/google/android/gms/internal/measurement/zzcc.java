package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzbl;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcc extends zzip<zzcc> {
    public zzbl.zzb.EnumC0014zzb zzws = null;
    public String zzwt = null;
    public Boolean zzwu = null;
    public String[] zzwv = zziy.zzanv;

    public zzcc() {
        this.zzand = null;
        this.zzanm = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcc) {
            zzcc zzccVar = (zzcc) obj;
            zzbl.zzb.EnumC0014zzb enumC0014zzb = this.zzws;
            if (enumC0014zzb == null) {
                if (zzccVar.zzws != null) {
                    return false;
                }
            } else if (!enumC0014zzb.equals(zzccVar.zzws)) {
                return false;
            }
            String str = this.zzwt;
            if (str == null) {
                if (zzccVar.zzwt != null) {
                    return false;
                }
            } else if (!str.equals(zzccVar.zzwt)) {
                return false;
            }
            Boolean bool = this.zzwu;
            if (bool == null) {
                if (zzccVar.zzwu != null) {
                    return false;
                }
            } else if (!bool.equals(zzccVar.zzwu)) {
                return false;
            }
            if (zzit.equals(this.zzwv, zzccVar.zzwv)) {
                zzir zzirVar = this.zzand;
                if (zzirVar != null && !zzirVar.isEmpty()) {
                    return this.zzand.equals(zzccVar.zzand);
                }
                zzir zzirVar2 = zzccVar.zzand;
                return zzirVar2 == null || zzirVar2.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (zzcc.class.getName().hashCode() + 527) * 31;
        zzbl.zzb.EnumC0014zzb enumC0014zzb = this.zzws;
        int i = 0;
        int hashCode2 = (hashCode + (enumC0014zzb == null ? 0 : enumC0014zzb.hashCode())) * 31;
        String str = this.zzwt;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.zzwu;
        int hashCode4 = (((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + zzit.hashCode(this.zzwv)) * 31;
        zzir zzirVar = this.zzand;
        if (zzirVar != null && !zzirVar.isEmpty()) {
            i = this.zzand.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final void zza(zzin zzinVar) throws IOException {
        zzbl.zzb.EnumC0014zzb enumC0014zzb = this.zzws;
        if (enumC0014zzb != null && enumC0014zzb != null) {
            zzinVar.zzc(1, enumC0014zzb.zzgp());
        }
        String str = this.zzwt;
        if (str != null) {
            zzinVar.zzb(2, str);
        }
        Boolean bool = this.zzwu;
        if (bool != null) {
            zzinVar.zzb(3, bool.booleanValue());
        }
        String[] strArr = this.zzwv;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.zzwv;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    zzinVar.zzb(4, str2);
                }
                i++;
            }
        }
        super.zza(zzinVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final int zzja() {
        int zzja = super.zzja();
        zzbl.zzb.EnumC0014zzb enumC0014zzb = this.zzws;
        if (enumC0014zzb != null && enumC0014zzb != null) {
            zzja += zzin.zzg(1, enumC0014zzb.zzgp());
        }
        String str = this.zzwt;
        if (str != null) {
            zzja += zzin.zzc(2, str);
        }
        Boolean bool = this.zzwu;
        if (bool != null) {
            bool.booleanValue();
            zzja += zzin.zzaj(3) + 1;
        }
        String[] strArr = this.zzwv;
        if (strArr == null || strArr.length <= 0) {
            return zzja;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.zzwv;
            if (i >= strArr2.length) {
                return zzja + i2 + (i3 * 1);
            }
            String str2 = strArr2[i];
            if (str2 != null) {
                i3++;
                i2 += zzin.zzcp(str2);
            }
            i++;
        }
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
                switch (zzlb) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.zzws = zzbl.zzb.EnumC0014zzb.zzg(zzlb);
                        continue;
                    default:
                        zzimVar.zzbj(position);
                        zza(zzimVar, zzkj);
                        continue;
                }
            } else if (zzkj == 18) {
                this.zzwt = zzimVar.readString();
            } else if (zzkj == 24) {
                this.zzwu = Boolean.valueOf(zzimVar.zzkp());
            } else if (zzkj != 34) {
                if (!super.zza(zzimVar, zzkj)) {
                    return this;
                }
            } else {
                int zzb = zziy.zzb(zzimVar, 34);
                String[] strArr = this.zzwv;
                int length = strArr == null ? 0 : strArr.length;
                int i = zzb + length;
                String[] strArr2 = new String[i];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i - 1) {
                    strArr2[length] = zzimVar.readString();
                    zzimVar.zzkj();
                    length++;
                }
                strArr2[length] = zzimVar.readString();
                this.zzwv = strArr2;
            }
        }
    }
}
