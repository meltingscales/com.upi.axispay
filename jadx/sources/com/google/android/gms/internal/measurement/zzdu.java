package com.google.android.gms.internal.measurement;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdu extends zzdz {
    private final int zzacd;
    private final int zzace;

    public zzdu(byte[] bArr, int i, int i2) {
        super(bArr);
        zzdp.zzb(i, i + i2, bArr.length);
        this.zzacd = i;
        this.zzace = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdz, com.google.android.gms.internal.measurement.zzdp
    public final int size() {
        return this.zzace;
    }

    @Override // com.google.android.gms.internal.measurement.zzdz
    public final int zzkg() {
        return this.zzacd;
    }

    @Override // com.google.android.gms.internal.measurement.zzdz, com.google.android.gms.internal.measurement.zzdp
    public final byte zzr(int i) {
        int size = size();
        if (((size - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(size);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.zzacg[this.zzacd + i];
    }

    @Override // com.google.android.gms.internal.measurement.zzdz, com.google.android.gms.internal.measurement.zzdp
    public final byte zzs(int i) {
        return this.zzacg[this.zzacd + i];
    }
}
