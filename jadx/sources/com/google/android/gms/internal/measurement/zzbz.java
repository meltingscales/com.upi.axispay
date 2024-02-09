package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbz extends zzip<zzbz> {
    private static volatile zzbz[] zzwf;
    public zzcc zzwg = null;
    public zzca zzwh = null;
    public Boolean zzwi = null;
    public String zzwj = null;

    public zzbz() {
        this.zzand = null;
        this.zzanm = -1;
    }

    public static zzbz[] zzjc() {
        if (zzwf == null) {
            synchronized (zzit.zzanl) {
                if (zzwf == null) {
                    zzwf = new zzbz[0];
                }
            }
        }
        return zzwf;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbz) {
            zzbz zzbzVar = (zzbz) obj;
            zzcc zzccVar = this.zzwg;
            if (zzccVar == null) {
                if (zzbzVar.zzwg != null) {
                    return false;
                }
            } else if (!zzccVar.equals(zzbzVar.zzwg)) {
                return false;
            }
            zzca zzcaVar = this.zzwh;
            if (zzcaVar == null) {
                if (zzbzVar.zzwh != null) {
                    return false;
                }
            } else if (!zzcaVar.equals(zzbzVar.zzwh)) {
                return false;
            }
            Boolean bool = this.zzwi;
            if (bool == null) {
                if (zzbzVar.zzwi != null) {
                    return false;
                }
            } else if (!bool.equals(zzbzVar.zzwi)) {
                return false;
            }
            String str = this.zzwj;
            if (str == null) {
                if (zzbzVar.zzwj != null) {
                    return false;
                }
            } else if (!str.equals(zzbzVar.zzwj)) {
                return false;
            }
            zzir zzirVar = this.zzand;
            if (zzirVar != null && !zzirVar.isEmpty()) {
                return this.zzand.equals(zzbzVar.zzand);
            }
            zzir zzirVar2 = zzbzVar.zzand;
            return zzirVar2 == null || zzirVar2.isEmpty();
        }
        return false;
    }

    public final int hashCode() {
        zzcc zzccVar = this.zzwg;
        int i = 0;
        int hashCode = ((zzbz.class.getName().hashCode() + 527) * 31) + (zzccVar == null ? 0 : zzccVar.hashCode());
        zzca zzcaVar = this.zzwh;
        int hashCode2 = ((hashCode * 31) + (zzcaVar == null ? 0 : zzcaVar.hashCode())) * 31;
        Boolean bool = this.zzwi;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.zzwj;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        zzir zzirVar = this.zzand;
        if (zzirVar != null && !zzirVar.isEmpty()) {
            i = this.zzand.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final void zza(zzin zzinVar) throws IOException {
        zzcc zzccVar = this.zzwg;
        if (zzccVar != null) {
            zzinVar.zza(1, zzccVar);
        }
        zzca zzcaVar = this.zzwh;
        if (zzcaVar != null) {
            zzinVar.zza(2, zzcaVar);
        }
        Boolean bool = this.zzwi;
        if (bool != null) {
            zzinVar.zzb(3, bool.booleanValue());
        }
        String str = this.zzwj;
        if (str != null) {
            zzinVar.zzb(4, str);
        }
        super.zza(zzinVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final int zzja() {
        int zzja = super.zzja();
        zzcc zzccVar = this.zzwg;
        if (zzccVar != null) {
            zzja += zzin.zzb(1, zzccVar);
        }
        zzca zzcaVar = this.zzwh;
        if (zzcaVar != null) {
            zzja += zzin.zzb(2, zzcaVar);
        }
        Boolean bool = this.zzwi;
        if (bool != null) {
            bool.booleanValue();
            zzja += zzin.zzaj(3) + 1;
        }
        String str = this.zzwj;
        return str != null ? zzja + zzin.zzc(4, str) : zzja;
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final /* synthetic */ zziv zza(zzim zzimVar) throws IOException {
        while (true) {
            int zzkj = zzimVar.zzkj();
            if (zzkj == 0) {
                return this;
            }
            if (zzkj == 10) {
                if (this.zzwg == null) {
                    this.zzwg = new zzcc();
                }
                zzimVar.zza(this.zzwg);
            } else if (zzkj == 18) {
                if (this.zzwh == null) {
                    this.zzwh = new zzca();
                }
                zzimVar.zza(this.zzwh);
            } else if (zzkj == 24) {
                this.zzwi = Boolean.valueOf(zzimVar.zzkp());
            } else if (zzkj != 34) {
                if (!super.zza(zzimVar, zzkj)) {
                    return this;
                }
            } else {
                this.zzwj = zzimVar.readString();
            }
        }
    }
}
