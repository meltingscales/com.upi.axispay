package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzez;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzhr {
    private static final zzhr zzakp = new zzhr(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzabp;
    private int zzago;
    private Object[] zzajb;
    private int[] zzakq;

    private zzhr() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzhr zza(zzhr zzhrVar, zzhr zzhrVar2) {
        int i = zzhrVar.count + zzhrVar2.count;
        int[] copyOf = Arrays.copyOf(zzhrVar.zzakq, i);
        System.arraycopy(zzhrVar2.zzakq, 0, copyOf, zzhrVar.count, zzhrVar2.count);
        Object[] copyOf2 = Arrays.copyOf(zzhrVar.zzajb, i);
        System.arraycopy(zzhrVar2.zzajb, 0, copyOf2, zzhrVar.count, zzhrVar2.count);
        return new zzhr(i, copyOf, copyOf2, true);
    }

    public static zzhr zzor() {
        return zzakp;
    }

    public static zzhr zzos() {
        return new zzhr();
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzhr)) {
            zzhr zzhrVar = (zzhr) obj;
            int i = this.count;
            if (i == zzhrVar.count) {
                int[] iArr = this.zzakq;
                int[] iArr2 = zzhrVar.zzakq;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    } else if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    Object[] objArr = this.zzajb;
                    Object[] objArr2 = zzhrVar.zzajb;
                    int i3 = this.count;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        } else if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzakq;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzajb;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzb(zzil zzilVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (zzilVar.zzln() == zzez.zze.zzahf) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzakq[i], this.zzajb[i], zzilVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzakq[i2], this.zzajb[i2], zzilVar);
        }
    }

    public final void zzjz() {
        this.zzabp = false;
    }

    public final int zzly() {
        int zze;
        int i = this.zzago;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzakq[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zze = zzeg.zze(i5, ((Long) this.zzajb[i3]).longValue());
            } else if (i6 == 1) {
                zze = zzeg.zzg(i5, ((Long) this.zzajb[i3]).longValue());
            } else if (i6 == 2) {
                zze = zzeg.zzc(i5, (zzdp) this.zzajb[i3]);
            } else if (i6 == 3) {
                zze = (zzeg.zzaj(i5) << 1) + ((zzhr) this.zzajb[i3]).zzly();
            } else if (i6 == 5) {
                zze = zzeg.zzj(i5, ((Integer) this.zzajb[i3]).intValue());
            } else {
                throw new IllegalStateException(zzfh.zzmz());
            }
            i2 += zze;
        }
        this.zzago = i2;
        return i2;
    }

    public final int zzot() {
        int i = this.zzago;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzeg.zzd(this.zzakq[i3] >>> 3, (zzdp) this.zzajb[i3]);
        }
        this.zzago = i2;
        return i2;
    }

    private zzhr(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzago = -1;
        this.count = i;
        this.zzakq = iArr;
        this.zzajb = objArr;
        this.zzabp = z;
    }

    private static void zzb(int i, Object obj, zzil zzilVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzilVar.zzi(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzilVar.zzc(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzilVar.zza(i2, (zzdp) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzilVar.zzf(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzfh.zzmz());
        } else if (zzilVar.zzln() == zzez.zze.zzahf) {
            zzilVar.zzas(i2);
            ((zzhr) obj).zzb(zzilVar);
            zzilVar.zzat(i2);
        } else {
            zzilVar.zzat(i2);
            ((zzhr) obj).zzb(zzilVar);
            zzilVar.zzas(i2);
        }
    }

    public final void zza(zzil zzilVar) throws IOException {
        if (zzilVar.zzln() == zzez.zze.zzahg) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzilVar.zza(this.zzakq[i] >>> 3, this.zzajb[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzilVar.zza(this.zzakq[i2] >>> 3, this.zzajb[i2]);
        }
    }

    public final void zzb(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzgk.zzb(sb, i, String.valueOf(this.zzakq[i2] >>> 3), this.zzajb[i2]);
        }
    }

    public final void zzb(int i, Object obj) {
        if (this.zzabp) {
            int i2 = this.count;
            int[] iArr = this.zzakq;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.zzakq = Arrays.copyOf(iArr, i3);
                this.zzajb = Arrays.copyOf(this.zzajb, i3);
            }
            int[] iArr2 = this.zzakq;
            int i4 = this.count;
            iArr2[i4] = i;
            this.zzajb[i4] = obj;
            this.count = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
