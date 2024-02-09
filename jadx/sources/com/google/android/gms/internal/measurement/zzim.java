package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzim {
    private final byte[] buffer;
    private int zzach;
    private int zzacn;
    private int zzacp;
    private final int zzamw;
    private final int zzamx;
    private int zzamy;
    private int zzamz;
    private zzeb zzana;
    private int zzacq = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int zzaci = 64;
    private int zzacj = 67108864;

    private zzim(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzamw = i;
        int i3 = i2 + i;
        this.zzamy = i3;
        this.zzamx = i3;
        this.zzamz = i;
    }

    public static zzim zzj(byte[] bArr, int i, int i2) {
        return new zzim(bArr, 0, i2);
    }

    private final void zzlf() {
        int i = this.zzamy + this.zzacn;
        this.zzamy = i;
        int i2 = this.zzacq;
        if (i > i2) {
            int i3 = i - i2;
            this.zzacn = i3;
            this.zzamy = i - i3;
            return;
        }
        this.zzacn = 0;
    }

    private final byte zzlg() throws IOException {
        int i = this.zzamz;
        if (i != this.zzamy) {
            byte[] bArr = this.buffer;
            this.zzamz = i + 1;
            return bArr[i];
        }
        throw zziu.zzpg();
    }

    private final void zzz(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zzamz;
            int i3 = i2 + i;
            int i4 = this.zzacq;
            if (i3 <= i4) {
                if (i <= this.zzamy - i2) {
                    this.zzamz = i2 + i;
                    return;
                }
                throw zziu.zzpg();
            }
            zzz(i4 - i2);
            throw zziu.zzpg();
        }
        throw zziu.zzph();
    }

    public final int getPosition() {
        return this.zzamz - this.zzamw;
    }

    public final String readString() throws IOException {
        int zzlb = zzlb();
        if (zzlb >= 0) {
            if (zzlb <= this.zzamy - this.zzamz) {
                String str = new String(this.buffer, this.zzamz, zzlb, zzit.UTF_8);
                this.zzamz += zzlb;
                return str;
            }
            throw zziu.zzpg();
        }
        throw zziu.zzph();
    }

    public final void zza(zziv zzivVar) throws IOException {
        int zzlb = zzlb();
        if (this.zzach < this.zzaci) {
            int zzx = zzx(zzlb);
            this.zzach++;
            zzivVar.zza(this);
            zzu(0);
            this.zzach--;
            zzy(zzx);
            return;
        }
        throw new zziu("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void zzbj(int i) {
        zzu(i, this.zzacp);
    }

    public final int zzkj() throws IOException {
        if (this.zzamz == this.zzamy) {
            this.zzacp = 0;
            return 0;
        }
        int zzlb = zzlb();
        this.zzacp = zzlb;
        if (zzlb != 0) {
            return zzlb;
        }
        throw new zziu("Protocol message contained an invalid tag (zero).");
    }

    public final boolean zzkp() throws IOException {
        return zzlb() != 0;
    }

    public final int zzlb() throws IOException {
        int i;
        byte zzlg = zzlg();
        if (zzlg >= 0) {
            return zzlg;
        }
        int i2 = zzlg & Byte.MAX_VALUE;
        byte zzlg2 = zzlg();
        if (zzlg2 >= 0) {
            i = zzlg2 << 7;
        } else {
            i2 |= (zzlg2 & Byte.MAX_VALUE) << 7;
            byte zzlg3 = zzlg();
            if (zzlg3 >= 0) {
                i = zzlg3 << 14;
            } else {
                i2 |= (zzlg3 & Byte.MAX_VALUE) << 14;
                byte zzlg4 = zzlg();
                if (zzlg4 < 0) {
                    int i3 = i2 | ((zzlg4 & Byte.MAX_VALUE) << 21);
                    byte zzlg5 = zzlg();
                    int i4 = i3 | (zzlg5 << 28);
                    if (zzlg5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (zzlg() >= 0) {
                                return i4;
                            }
                        }
                        throw zziu.zzpi();
                    }
                    return i4;
                }
                i = zzlg4 << 21;
            }
        }
        return i2 | i;
    }

    public final long zzlc() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzlg = zzlg();
            j |= (zzlg & Byte.MAX_VALUE) << i;
            if ((zzlg & 128) == 0) {
                return j;
            }
        }
        throw zziu.zzpi();
    }

    public final int zzpd() {
        int i = this.zzacq;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.zzamz;
    }

    public final byte[] zzt(int i, int i2) {
        if (i2 == 0) {
            return zziy.zzanx;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzamw + i, bArr, 0, i2);
        return bArr;
    }

    public final void zzu(int i) throws zziu {
        if (this.zzacp != i) {
            throw new zziu("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzv(int i) throws IOException {
        int zzkj;
        int i2 = i & 7;
        if (i2 == 0) {
            zzlb();
            return true;
        } else if (i2 == 1) {
            zzlg();
            zzlg();
            zzlg();
            zzlg();
            zzlg();
            zzlg();
            zzlg();
            zzlg();
            return true;
        } else if (i2 == 2) {
            zzz(zzlb());
            return true;
        } else if (i2 == 3) {
            do {
                zzkj = zzkj();
                if (zzkj == 0) {
                    break;
                }
            } while (zzv(zzkj));
            zzu(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 != 4) {
            if (i2 == 5) {
                zzlg();
                zzlg();
                zzlg();
                zzlg();
                return true;
            }
            throw new zziu("Protocol message tag had invalid wire type.");
        } else {
            return false;
        }
    }

    public final int zzx(int i) throws zziu {
        if (i >= 0) {
            int i2 = i + this.zzamz;
            int i3 = this.zzacq;
            if (i2 <= i3) {
                this.zzacq = i2;
                zzlf();
                return i3;
            }
            throw zziu.zzpg();
        }
        throw zziu.zzph();
    }

    public final void zzy(int i) {
        this.zzacq = i;
        zzlf();
    }

    public final void zzu(int i, int i2) {
        int i3 = this.zzamz;
        int i4 = this.zzamw;
        if (i > i3 - i4) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(this.zzamz - this.zzamw);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.zzamz = i4 + i;
            this.zzacp = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final <T extends zzez<T, ?>> T zza(zzgs<T> zzgsVar) throws IOException {
        try {
            if (this.zzana == null) {
                this.zzana = zzeb.zzd(this.buffer, this.zzamw, this.zzamx);
            }
            int zzla = this.zzana.zzla();
            int i = this.zzamz - this.zzamw;
            if (zzla <= i) {
                this.zzana.zzz(i - zzla);
                this.zzana.zzw(this.zzaci - this.zzach);
                T t = (T) this.zzana.zza(zzgsVar, zzem.zzlt());
                zzv(this.zzacp);
                return t;
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", Integer.valueOf(zzla), Integer.valueOf(i)));
        } catch (zzfh e) {
            throw new zziu("", e);
        }
    }
}
