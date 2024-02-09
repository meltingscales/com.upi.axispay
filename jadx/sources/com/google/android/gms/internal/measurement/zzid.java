package com.google.android.gms.internal.measurement;

import com.google.android.gms.vision.barcode.Barcode;
import java.nio.ByteBuffer;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzid extends zzia {
    private static int zza(byte[] bArr, int i, long j, int i2) {
        int zzbh;
        int zzr;
        int zzc;
        if (i2 == 0) {
            zzbh = zzhy.zzbh(i);
            return zzbh;
        } else if (i2 == 1) {
            zzr = zzhy.zzr(i, zzhw.zza(bArr, j));
            return zzr;
        } else if (i2 == 2) {
            zzc = zzhy.zzc(i, zzhw.zza(bArr, j), zzhw.zza(bArr, j + 1));
            return zzc;
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.measurement.zzia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(int r18, byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzid.zzb(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final String zzh(byte[] bArr, int i, int i2) throws zzfh {
        boolean zzd;
        boolean zzd2;
        boolean zze;
        boolean zzf;
        boolean zzd3;
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte zza = zzhw.zza(bArr, i);
                zzd3 = zzhz.zzd(zza);
                if (!zzd3) {
                    break;
                }
                i++;
                zzhz.zza(zza, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte zza2 = zzhw.zza(bArr, i);
                zzd = zzhz.zzd(zza2);
                if (zzd) {
                    int i7 = i5 + 1;
                    zzhz.zza(zza2, cArr, i5);
                    while (i6 < i3) {
                        byte zza3 = zzhw.zza(bArr, i6);
                        zzd2 = zzhz.zzd(zza3);
                        if (!zzd2) {
                            break;
                        }
                        i6++;
                        zzhz.zza(zza3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else {
                    zze = zzhz.zze(zza2);
                    if (!zze) {
                        zzf = zzhz.zzf(zza2);
                        if (zzf) {
                            if (i6 < i3 - 1) {
                                int i8 = i6 + 1;
                                zzhz.zza(zza2, zzhw.zza(bArr, i6), zzhw.zza(bArr, i8), cArr, i5);
                                i = i8 + 1;
                                i5++;
                            } else {
                                throw zzfh.zznc();
                            }
                        } else if (i6 < i3 - 2) {
                            int i9 = i6 + 1;
                            int i10 = i9 + 1;
                            zzhz.zza(zza2, zzhw.zza(bArr, i6), zzhw.zza(bArr, i9), zzhw.zza(bArr, i10), cArr, i5);
                            i = i10 + 1;
                            i5 = i5 + 1 + 1;
                        } else {
                            throw zzfh.zznc();
                        }
                    } else if (i6 < i3) {
                        zzhz.zza(zza2, zzhw.zza(bArr, i6), cArr, i5);
                        i = i6 + 1;
                        i5++;
                    } else {
                        throw zzfh.zznc();
                    }
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int i3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            zzhw.zza(bArr, j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 < c && j4 < j5) {
                long j6 = j4 + j;
                zzhw.zza(bArr, j4, (byte) charAt3);
                j3 = j;
                j2 = j6;
                c2 = c;
            } else if (charAt3 < 2048 && j4 <= j5 - 2) {
                long j7 = j4 + j;
                zzhw.zza(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                long j8 = j7 + j;
                zzhw.zza(bArr, j7, (byte) ((charAt3 & '?') | Barcode.ITF));
                long j9 = j;
                c2 = 128;
                j2 = j8;
                j3 = j9;
            } else if ((charAt3 >= 55296 && 57343 >= charAt3) || j4 > j5 - 3) {
                if (j4 <= j5 - 4) {
                    int i5 = i4 + 1;
                    if (i5 != length) {
                        char charAt4 = charSequence.charAt(i5);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            long j10 = j4 + 1;
                            zzhw.zza(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                            long j11 = j10 + 1;
                            c2 = 128;
                            zzhw.zza(bArr, j10, (byte) (((codePoint >>> 12) & 63) | Barcode.ITF));
                            long j12 = j11 + 1;
                            zzhw.zza(bArr, j11, (byte) (((codePoint >>> 6) & 63) | Barcode.ITF));
                            j3 = 1;
                            j2 = j12 + 1;
                            zzhw.zza(bArr, j12, (byte) ((codePoint & 63) | Barcode.ITF));
                            i4 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                    throw new zzic(i4 - 1, length);
                } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                    throw new zzic(i4, length);
                } else {
                    StringBuilder sb2 = new StringBuilder(46);
                    sb2.append("Failed writing ");
                    sb2.append(charAt3);
                    sb2.append(" at index ");
                    sb2.append(j4);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            } else {
                long j13 = j4 + j;
                zzhw.zza(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                long j14 = j13 + j;
                zzhw.zza(bArr, j13, (byte) (((charAt3 >>> 6) & 63) | Barcode.ITF));
                zzhw.zza(bArr, j14, (byte) ((charAt3 & '?') | Barcode.ITF));
                j2 = j14 + 1;
                j3 = 1;
                c2 = 128;
            }
            i4++;
            c = c2;
            long j15 = j3;
            j4 = j2;
            j = j15;
        }
        return (int) j4;
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c;
        long j;
        int i;
        int i2;
        long j2;
        char c2;
        char charAt;
        long zzb = zzhw.zzb(byteBuffer);
        long position = byteBuffer.position() + zzb;
        long limit = byteBuffer.limit() + zzb;
        int length = charSequence.length();
        if (length > limit - position) {
            char charAt2 = charSequence.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i3 = 0;
        while (true) {
            c = 128;
            if (i3 >= length || (charAt = charSequence.charAt(i3)) >= 128) {
                break;
            }
            zzhw.zza(position, (byte) charAt);
            i3++;
            position++;
        }
        if (i3 == length) {
            byteBuffer.position((int) (position - zzb));
            return;
        }
        while (i3 < length) {
            char charAt3 = charSequence.charAt(i3);
            if (charAt3 >= c || position >= limit) {
                if (charAt3 >= 2048 || position > limit - 2) {
                    j = zzb;
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || position > limit - 3) {
                        if (position <= limit - 4) {
                            i2 = i3 + 1;
                            if (i2 != length) {
                                char charAt4 = charSequence.charAt(i2);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    j2 = limit;
                                    long j3 = position + 1;
                                    zzhw.zza(position, (byte) ((codePoint >>> 18) | 240));
                                    long j4 = j3 + 1;
                                    c2 = 128;
                                    zzhw.zza(j3, (byte) (((codePoint >>> 12) & 63) | Barcode.ITF));
                                    long j5 = j4 + 1;
                                    zzhw.zza(j4, (byte) (((codePoint >>> 6) & 63) | Barcode.ITF));
                                    zzhw.zza(j5, (byte) ((codePoint & 63) | Barcode.ITF));
                                    position = j5 + 1;
                                } else {
                                    i3 = i2;
                                }
                            }
                            throw new zzic(i3 - 1, length);
                        } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i = i3 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i)))) {
                            throw new zzic(i3, length);
                        } else {
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Failed writing ");
                            sb2.append(charAt3);
                            sb2.append(" at index ");
                            sb2.append(position);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                    }
                    long j6 = position + 1;
                    zzhw.zza(position, (byte) ((charAt3 >>> '\f') | 480));
                    long j7 = j6 + 1;
                    zzhw.zza(j6, (byte) (((charAt3 >>> 6) & 63) | Barcode.ITF));
                    zzhw.zza(j7, (byte) ((charAt3 & '?') | Barcode.ITF));
                    position = j7 + 1;
                } else {
                    j = zzb;
                    long j8 = position + 1;
                    zzhw.zza(position, (byte) ((charAt3 >>> 6) | 960));
                    zzhw.zza(j8, (byte) ((charAt3 & '?') | Barcode.ITF));
                    position = j8 + 1;
                }
                j2 = limit;
                i2 = i3;
                c2 = 128;
            } else {
                zzhw.zza(position, (byte) charAt3);
                j2 = limit;
                i2 = i3;
                c2 = c;
                position++;
                j = zzb;
            }
            c = c2;
            zzb = j;
            limit = j2;
            i3 = i2 + 1;
        }
        byteBuffer.position((int) (position - zzb));
    }
}
