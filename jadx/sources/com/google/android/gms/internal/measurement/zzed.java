package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzed extends zzeb {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzacm;
    private int zzacn;
    private int zzaco;
    private int zzacp;
    private int zzacq;

    private zzed(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzacq = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzaco = i;
        this.zzacm = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzlb() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.limit
            if (r1 == r0) goto L6b
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.pos = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.pos = r1
            return r0
        L6b:
            long r0 = r5.zzky()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzed.zzlb():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
        if (r2[r0] >= 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzlc() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzed.zzlc():long");
    }

    private final int zzld() throws IOException {
        int i = this.pos;
        if (this.limit - i >= 4) {
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzfh.zzmu();
    }

    private final long zzle() throws IOException {
        int i = this.pos;
        if (this.limit - i >= 8) {
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw zzfh.zzmu();
    }

    private final void zzlf() {
        int i = this.limit + this.zzacn;
        this.limit = i;
        int i2 = i - this.zzaco;
        int i3 = this.zzacq;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzacn = i4;
            this.limit = i - i4;
            return;
        }
        this.zzacn = 0;
    }

    private final byte zzlg() throws IOException {
        int i = this.pos;
        if (i != this.limit) {
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }
        throw zzfh.zzmu();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzle());
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzld());
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final String readString() throws IOException {
        int zzlb = zzlb();
        if (zzlb > 0 && zzlb <= this.limit - this.pos) {
            String str = new String(this.buffer, this.pos, zzlb, zzfb.UTF_8);
            this.pos += zzlb;
            return str;
        } else if (zzlb == 0) {
            return "";
        } else {
            if (zzlb < 0) {
                throw zzfh.zzmv();
            }
            throw zzfh.zzmu();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final <T extends zzgh> T zza(zzgs<T> zzgsVar, zzem zzemVar) throws IOException {
        int zzlb = zzlb();
        if (this.zzach < this.zzaci) {
            int zzx = zzx(zzlb);
            this.zzach++;
            T zza = zzgsVar.zza(this, zzemVar);
            zzu(0);
            this.zzach--;
            zzy(zzx);
            return zza;
        }
        throw zzfh.zzna();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzkj() throws IOException {
        if (zzkz()) {
            this.zzacp = 0;
            return 0;
        }
        int zzlb = zzlb();
        this.zzacp = zzlb;
        if ((zzlb >>> 3) != 0) {
            return zzlb;
        }
        throw zzfh.zzmx();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final long zzkk() throws IOException {
        return zzlc();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final long zzkl() throws IOException {
        return zzlc();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzkm() throws IOException {
        return zzlb();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final long zzkn() throws IOException {
        return zzle();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzko() throws IOException {
        return zzld();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final boolean zzkp() throws IOException {
        return zzlc() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final String zzkq() throws IOException {
        int zzlb = zzlb();
        if (zzlb > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzlb <= i - i2) {
                String zzh = zzhy.zzh(this.buffer, i2, zzlb);
                this.pos += zzlb;
                return zzh;
            }
        }
        if (zzlb == 0) {
            return "";
        }
        if (zzlb <= 0) {
            throw zzfh.zzmv();
        }
        throw zzfh.zzmu();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final zzdp zzkr() throws IOException {
        byte[] bArr;
        int zzlb = zzlb();
        if (zzlb > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzlb <= i - i2) {
                zzdp zzb = zzdp.zzb(this.buffer, i2, zzlb);
                this.pos += zzlb;
                return zzb;
            }
        }
        if (zzlb == 0) {
            return zzdp.zzaby;
        }
        if (zzlb > 0) {
            int i3 = this.limit;
            int i4 = this.pos;
            if (zzlb <= i3 - i4) {
                int i5 = zzlb + i4;
                this.pos = i5;
                bArr = Arrays.copyOfRange(this.buffer, i4, i5);
                return zzdp.zzg(bArr);
            }
        }
        if (zzlb <= 0) {
            if (zzlb == 0) {
                bArr = zzfb.zzahk;
                return zzdp.zzg(bArr);
            }
            throw zzfh.zzmv();
        }
        throw zzfh.zzmu();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzks() throws IOException {
        return zzlb();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzkt() throws IOException {
        return zzlb();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzku() throws IOException {
        return zzld();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final long zzkv() throws IOException {
        return zzle();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzkw() throws IOException {
        return zzeb.zzaa(zzlb());
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final long zzkx() throws IOException {
        return zzeb.zzap(zzlc());
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final long zzky() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzlg = zzlg();
            j |= (zzlg & Byte.MAX_VALUE) << i;
            if ((zzlg & 128) == 0) {
                return j;
            }
        }
        throw zzfh.zzmw();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final boolean zzkz() throws IOException {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzla() {
        return this.pos - this.zzaco;
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final void zzu(int i) throws zzfh {
        if (this.zzacp != i) {
            throw zzfh.zzmy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final boolean zzv(int i) throws IOException {
        int zzkj;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.limit - this.pos >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzfh.zzmw();
            }
            while (i3 < 10) {
                if (zzlg() < 0) {
                    i3++;
                }
            }
            throw zzfh.zzmw();
            return true;
        } else if (i2 == 1) {
            zzz(8);
            return true;
        } else if (i2 == 2) {
            zzz(zzlb());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzz(4);
                    return true;
                }
                throw zzfh.zzmz();
            }
            return false;
        } else {
            do {
                zzkj = zzkj();
                if (zzkj == 0) {
                    break;
                }
            } while (zzv(zzkj));
            zzu(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final int zzx(int i) throws zzfh {
        if (i >= 0) {
            int zzla = i + zzla();
            int i2 = this.zzacq;
            if (zzla <= i2) {
                this.zzacq = zzla;
                zzlf();
                return i2;
            }
            throw zzfh.zzmu();
        }
        throw zzfh.zzmv();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final void zzy(int i) {
        this.zzacq = i;
        zzlf();
    }

    @Override // com.google.android.gms.internal.measurement.zzeb
    public final void zzz(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzfh.zzmv();
        }
        throw zzfh.zzmu();
    }
}
