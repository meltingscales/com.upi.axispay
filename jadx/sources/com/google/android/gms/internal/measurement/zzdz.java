package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class zzdz extends zzdy {
    public final byte[] zzacg;

    public zzdz(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zzacg = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdp) && size() == ((zzdp) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (obj instanceof zzdz) {
                zzdz zzdzVar = (zzdz) obj;
                int zzkf = zzkf();
                int zzkf2 = zzdzVar.zzkf();
                if (zzkf == 0 || zzkf2 == 0 || zzkf == zzkf2) {
                    return zza(zzdzVar, 0, size());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public int size() {
        return this.zzacg.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public final zzdp zza(int i, int i2) {
        int zzb = zzdp.zzb(0, i2, size());
        if (zzb == 0) {
            return zzdp.zzaby;
        }
        return new zzdu(this.zzacg, zzkg(), zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public final boolean zzke() {
        int zzkg = zzkg();
        return zzhy.zzf(this.zzacg, zzkg, size() + zzkg);
    }

    public int zzkg() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public byte zzr(int i) {
        return this.zzacg[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public byte zzs(int i) {
        return this.zzacg[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public final void zza(zzdo zzdoVar) throws IOException {
        zzdoVar.zza(this.zzacg, zzkg(), size());
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public final String zza(Charset charset) {
        return new String(this.zzacg, zzkg(), size(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final boolean zza(zzdp zzdpVar, int i, int i2) {
        if (i2 <= zzdpVar.size()) {
            if (i2 <= zzdpVar.size()) {
                if (zzdpVar instanceof zzdz) {
                    zzdz zzdzVar = (zzdz) zzdpVar;
                    byte[] bArr = this.zzacg;
                    byte[] bArr2 = zzdzVar.zzacg;
                    int zzkg = zzkg() + i2;
                    int zzkg2 = zzkg();
                    int zzkg3 = zzdzVar.zzkg();
                    while (zzkg2 < zzkg) {
                        if (bArr[zzkg2] != bArr2[zzkg3]) {
                            return false;
                        }
                        zzkg2++;
                        zzkg3++;
                    }
                    return true;
                }
                return zzdpVar.zza(0, i2).equals(zza(0, i2));
            }
            int size = zzdpVar.size();
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: 0, ");
            sb.append(i2);
            sb.append(", ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int size2 = size();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i2);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzdp
    public final int zza(int i, int i2, int i3) {
        return zzfb.zza(i, this.zzacg, zzkg(), i3);
    }
}
