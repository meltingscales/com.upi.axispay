package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzcg extends zzip<zzcg> {
    public zzch[] zzxl = zzch.zzjg();

    public zzcg() {
        this.zzand = null;
        this.zzanm = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcg) {
            zzcg zzcgVar = (zzcg) obj;
            if (zzit.equals(this.zzxl, zzcgVar.zzxl)) {
                zzir zzirVar = this.zzand;
                if (zzirVar != null && !zzirVar.isEmpty()) {
                    return this.zzand.equals(zzcgVar.zzand);
                }
                zzir zzirVar2 = zzcgVar.zzand;
                return zzirVar2 == null || zzirVar2.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((zzcg.class.getName().hashCode() + 527) * 31) + zzit.hashCode(this.zzxl)) * 31;
        zzir zzirVar = this.zzand;
        return hashCode + ((zzirVar == null || zzirVar.isEmpty()) ? 0 : this.zzand.hashCode());
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final void zza(zzin zzinVar) throws IOException {
        zzch[] zzchVarArr = this.zzxl;
        if (zzchVarArr != null && zzchVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzch[] zzchVarArr2 = this.zzxl;
                if (i >= zzchVarArr2.length) {
                    break;
                }
                zzch zzchVar = zzchVarArr2[i];
                if (zzchVar != null) {
                    zzinVar.zza(1, zzchVar);
                }
                i++;
            }
        }
        super.zza(zzinVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzip, com.google.android.gms.internal.measurement.zziv
    public final int zzja() {
        int zzja = super.zzja();
        zzch[] zzchVarArr = this.zzxl;
        if (zzchVarArr != null && zzchVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzch[] zzchVarArr2 = this.zzxl;
                if (i >= zzchVarArr2.length) {
                    break;
                }
                zzch zzchVar = zzchVarArr2[i];
                if (zzchVar != null) {
                    zzja += zzin.zzb(1, zzchVar);
                }
                i++;
            }
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
            if (zzkj != 10) {
                if (!super.zza(zzimVar, zzkj)) {
                    return this;
                }
            } else {
                int zzb = zziy.zzb(zzimVar, 10);
                zzch[] zzchVarArr = this.zzxl;
                int length = zzchVarArr == null ? 0 : zzchVarArr.length;
                int i = zzb + length;
                zzch[] zzchVarArr2 = new zzch[i];
                if (length != 0) {
                    System.arraycopy(zzchVarArr, 0, zzchVarArr2, 0, length);
                }
                while (length < i - 1) {
                    zzchVarArr2[length] = new zzch();
                    zzimVar.zza(zzchVarArr2[length]);
                    zzimVar.zzkj();
                    length++;
                }
                zzchVarArr2[length] = new zzch();
                zzimVar.zza(zzchVarArr2[length]);
                this.zzxl = zzchVarArr2;
            }
        }
    }
}
