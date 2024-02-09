package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdl {
    public static int zza(byte[] bArr, int i, zzdm zzdmVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzdmVar.zzabs = b;
            return i2;
        }
        return zza(b, bArr, i2, zzdmVar);
    }

    public static int zzb(byte[] bArr, int i, zzdm zzdmVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzdmVar.zzabt = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzdmVar.zzabt = j2;
        return i3;
    }

    public static double zzc(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzb(bArr, i));
    }

    public static float zzd(byte[] bArr, int i) {
        return Float.intBitsToFloat(zza(bArr, i));
    }

    public static int zze(byte[] bArr, int i, zzdm zzdmVar) throws zzfh {
        int zza = zza(bArr, i, zzdmVar);
        int i2 = zzdmVar.zzabs;
        if (i2 >= 0) {
            if (i2 <= bArr.length - zza) {
                if (i2 == 0) {
                    zzdmVar.zzabu = zzdp.zzaby;
                    return zza;
                }
                zzdmVar.zzabu = zzdp.zzb(bArr, zza, i2);
                return zza + i2;
            }
            throw zzfh.zzmu();
        }
        throw zzfh.zzmv();
    }

    public static int zzc(byte[] bArr, int i, zzdm zzdmVar) throws zzfh {
        int zza = zza(bArr, i, zzdmVar);
        int i2 = zzdmVar.zzabs;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzdmVar.zzabu = "";
                return zza;
            }
            zzdmVar.zzabu = new String(bArr, zza, i2, zzfb.UTF_8);
            return zza + i2;
        }
        throw zzfh.zzmv();
    }

    public static int zzd(byte[] bArr, int i, zzdm zzdmVar) throws zzfh {
        int zza = zza(bArr, i, zzdmVar);
        int i2 = zzdmVar.zzabs;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzdmVar.zzabu = "";
                return zza;
            }
            zzdmVar.zzabu = zzhy.zzh(bArr, zza, i2);
            return zza + i2;
        }
        throw zzfh.zzmv();
    }

    public static int zza(int i, byte[] bArr, int i2, zzdm zzdmVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzdmVar.zzabs = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzdmVar.zzabs = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzdmVar.zzabs = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzdmVar.zzabs = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzdmVar.zzabs = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static long zzb(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zza(zzgy zzgyVar, byte[] bArr, int i, int i2, zzdm zzdmVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zza(i4, bArr, i3, zzdmVar);
            i4 = zzdmVar.zzabs;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object newInstance = zzgyVar.newInstance();
            int i6 = i4 + i5;
            zzgyVar.zza(newInstance, bArr, i5, i6, zzdmVar);
            zzgyVar.zzi(newInstance);
            zzdmVar.zzabu = newInstance;
            return i6;
        }
        throw zzfh.zzmu();
    }

    public static int zza(zzgy zzgyVar, byte[] bArr, int i, int i2, int i3, zzdm zzdmVar) throws IOException {
        zzgl zzglVar = (zzgl) zzgyVar;
        Object newInstance = zzglVar.newInstance();
        int zza = zzglVar.zza((zzgl) newInstance, bArr, i, i2, i3, zzdmVar);
        zzglVar.zzi(newInstance);
        zzdmVar.zzabu = newInstance;
        return zza;
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, zzfg<?> zzfgVar, zzdm zzdmVar) {
        zzfa zzfaVar = (zzfa) zzfgVar;
        int zza = zza(bArr, i2, zzdmVar);
        zzfaVar.zzau(zzdmVar.zzabs);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzdmVar);
            if (i != zzdmVar.zzabs) {
                break;
            }
            zza = zza(bArr, zza2, zzdmVar);
            zzfaVar.zzau(zzdmVar.zzabs);
        }
        return zza;
    }

    public static int zza(byte[] bArr, int i, zzfg<?> zzfgVar, zzdm zzdmVar) throws IOException {
        zzfa zzfaVar = (zzfa) zzfgVar;
        int zza = zza(bArr, i, zzdmVar);
        int i2 = zzdmVar.zzabs + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzdmVar);
            zzfaVar.zzau(zzdmVar.zzabs);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzfh.zzmu();
    }

    public static int zza(zzgy<?> zzgyVar, int i, byte[] bArr, int i2, int i3, zzfg<?> zzfgVar, zzdm zzdmVar) throws IOException {
        int zza = zza(zzgyVar, bArr, i2, i3, zzdmVar);
        zzfgVar.add(zzdmVar.zzabu);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzdmVar);
            if (i != zzdmVar.zzabs) {
                break;
            }
            zza = zza(zzgyVar, bArr, zza2, i3, zzdmVar);
            zzfgVar.add(zzdmVar.zzabu);
        }
        return zza;
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, zzhr zzhrVar, zzdm zzdmVar) throws zzfh {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzdmVar);
                zzhrVar.zzb(i, Long.valueOf(zzdmVar.zzabt));
                return zzb;
            } else if (i4 == 1) {
                zzhrVar.zzb(i, Long.valueOf(zzb(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzdmVar);
                int i5 = zzdmVar.zzabs;
                if (i5 >= 0) {
                    if (i5 <= bArr.length - zza) {
                        if (i5 == 0) {
                            zzhrVar.zzb(i, zzdp.zzaby);
                        } else {
                            zzhrVar.zzb(i, zzdp.zzb(bArr, zza, i5));
                        }
                        return zza + i5;
                    }
                    throw zzfh.zzmu();
                }
                throw zzfh.zzmv();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzhrVar.zzb(i, Integer.valueOf(zza(bArr, i2)));
                    return i2 + 4;
                }
                throw zzfh.zzmx();
            } else {
                zzhr zzos = zzhr.zzos();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzdmVar);
                    int i8 = zzdmVar.zzabs;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zza2;
                        break;
                    }
                    int zza3 = zza(i7, bArr, zza2, i3, zzos, zzdmVar);
                    i7 = i8;
                    i2 = zza3;
                }
                if (i2 <= i3 && i7 == i6) {
                    zzhrVar.zzb(i, zzos);
                    return i2;
                }
                throw zzfh.zznb();
            }
        }
        throw zzfh.zzmx();
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, zzdm zzdmVar) throws zzfh {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzfh.zzmx();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = zza(bArr, i2, zzdmVar);
                            i6 = zzdmVar.zzabs;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = zza(i6, bArr, i2, i3, zzdmVar);
                        }
                        if (i2 > i3 || i6 != i5) {
                            throw zzfh.zznb();
                        }
                        return i2;
                    }
                    return zza(bArr, i2, zzdmVar) + zzdmVar.zzabs;
                }
                return i2 + 8;
            }
            return zzb(bArr, i2, zzdmVar);
        }
        throw zzfh.zzmx();
    }
}
