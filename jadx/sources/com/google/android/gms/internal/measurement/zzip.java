package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzip;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class zzip<M extends zzip<M>> extends zziv {
    public zzir zzand;

    @Override // com.google.android.gms.internal.measurement.zziv
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzip zzipVar = (zzip) super.clone();
        zzit.zza(this, zzipVar);
        return zzipVar;
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public void zza(zzin zzinVar) throws IOException {
        if (this.zzand == null) {
            return;
        }
        for (int i = 0; i < this.zzand.size(); i++) {
            this.zzand.zzbn(i).zza(zzinVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public int zzja() {
        if (this.zzand != null) {
            int i = 0;
            for (int i2 = 0; i2 < this.zzand.size(); i2++) {
                i += this.zzand.zzbn(i2).zzja();
            }
            return i;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final /* synthetic */ zziv zzpe() throws CloneNotSupportedException {
        return (zzip) clone();
    }

    public final boolean zza(zzim zzimVar, int i) throws IOException {
        int position = zzimVar.getPosition();
        if (zzimVar.zzv(i)) {
            int i2 = i >>> 3;
            zzix zzixVar = new zzix(i, zzimVar.zzt(position, zzimVar.getPosition() - position));
            zzis zzisVar = null;
            zzir zzirVar = this.zzand;
            if (zzirVar == null) {
                this.zzand = new zzir();
            } else {
                zzisVar = zzirVar.zzbm(i2);
            }
            if (zzisVar == null) {
                zzisVar = new zzis();
                this.zzand.zza(i2, zzisVar);
            }
            zzisVar.zza(zzixVar);
            return true;
        }
        return false;
    }
}
