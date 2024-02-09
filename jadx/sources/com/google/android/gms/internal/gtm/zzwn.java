package com.google.android.gms.internal.gtm;

import android.support.v4.media.session.IMediaSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzwn<T> implements zzwx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzxy.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzwk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzvy zzn;
    private final zzxo<?, ?> zzo;
    private final zzuk<?> zzp;
    private final zzwq zzq;
    private final zzwf zzr;

    /* JADX WARN: Multi-variable type inference failed */
    private zzwn(int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, zzwk zzwkVar, boolean z, boolean z2, int[] iArr3, int i3, int i4, zzwq zzwqVar, zzvy zzvyVar, zzxo<?, ?> zzxoVar, zzuk<?> zzukVar, zzwf zzwfVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i;
        this.zzi = i2 instanceof zzuz;
        this.zzj = zzwkVar;
        boolean z3 = false;
        if (zzxoVar != 0 && zzxoVar.zzi(i2)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = z2;
        this.zzl = iArr3;
        this.zzm = i3;
        this.zzq = i4;
        this.zzn = zzwqVar;
        this.zzo = zzvyVar;
        this.zzp = zzxoVar;
        this.zzg = i2;
        this.zzr = zzukVar;
    }

    private final int zzA(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzB(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzC(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzD(T t, long j) {
        return ((Long) zzxy.zzf(t, j)).longValue();
    }

    private final zzvd zzE(int i) {
        int i2 = i / 3;
        return (zzvd) this.zzd[i2 + i2 + 1];
    }

    private final zzwx zzF(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzwx zzwxVar = (zzwx) this.zzd[i3];
        if (zzwxVar != null) {
            return zzwxVar;
        }
        zzwx<T> zzb2 = zzwt.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final <UT, UB> UB zzG(Object obj, int i, UB ub, zzxo<UT, UB> zzxoVar) {
        int i2 = this.zzc[i];
        Object zzf = zzxy.zzf(obj, zzC(i) & 1048575);
        if (zzf == null || zzE(i) == null) {
            return ub;
        }
        zzwe zzweVar = (zzwe) zzf;
        zzwd zzwdVar = (zzwd) zzH(i);
        throw null;
    }

    private final Object zzH(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzI(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void zzJ(T t, T t2, int i) {
        long zzC = zzC(i) & 1048575;
        if (zzQ(t2, i)) {
            Object zzf = zzxy.zzf(t, zzC);
            Object zzf2 = zzxy.zzf(t2, zzC);
            if (zzf != null && zzf2 != null) {
                zzxy.zzs(t, zzC, zzvi.zzg(zzf, zzf2));
                zzM(t, i);
            } else if (zzf2 != null) {
                zzxy.zzs(t, zzC, zzf2);
                zzM(t, i);
            }
        }
    }

    private final void zzK(T t, T t2, int i) {
        int zzC = zzC(i);
        int i2 = this.zzc[i];
        long j = zzC & 1048575;
        if (zzT(t2, i2, i)) {
            Object zzf = zzT(t, i2, i) ? zzxy.zzf(t, j) : null;
            Object zzf2 = zzxy.zzf(t2, j);
            if (zzf != null && zzf2 != null) {
                zzxy.zzs(t, j, zzvi.zzg(zzf, zzf2));
                zzN(t, i2, i);
            } else if (zzf2 != null) {
                zzxy.zzs(t, j, zzf2);
                zzN(t, i2, i);
            }
        }
    }

    private final void zzL(Object obj, int i, zzww zzwwVar) throws IOException {
        if (zzP(i)) {
            zzxy.zzs(obj, i & 1048575, zzwwVar.zzx());
        } else if (this.zzi) {
            zzxy.zzs(obj, i & 1048575, zzwwVar.zzv());
        } else {
            zzxy.zzs(obj, i & 1048575, zzwwVar.zzq());
        }
    }

    private final void zzM(T t, int i) {
        int zzz = zzz(i);
        long j = 1048575 & zzz;
        if (j == 1048575) {
            return;
        }
        zzxy.zzq(t, j, (1 << (zzz >>> 20)) | zzxy.zzc(t, j));
    }

    private final void zzN(T t, int i, int i2) {
        zzxy.zzq(t, zzz(i2) & 1048575, i);
    }

    private final boolean zzO(T t, T t2, int i) {
        return zzQ(t, i) == zzQ(t2, i);
    }

    private static boolean zzP(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzQ(T t, int i) {
        int zzz = zzz(i);
        long j = zzz & 1048575;
        if (j != 1048575) {
            return (zzxy.zzc(t, j) & (1 << (zzz >>> 20))) != 0;
        }
        int zzC = zzC(i);
        long j2 = zzC & 1048575;
        switch (zzB(zzC)) {
            case 0:
                return zzxy.zza(t, j2) != 0.0d;
            case 1:
                return zzxy.zzb(t, j2) != 0.0f;
            case 2:
                return zzxy.zzd(t, j2) != 0;
            case 3:
                return zzxy.zzd(t, j2) != 0;
            case 4:
                return zzxy.zzc(t, j2) != 0;
            case 5:
                return zzxy.zzd(t, j2) != 0;
            case 6:
                return zzxy.zzc(t, j2) != 0;
            case 7:
                return zzxy.zzw(t, j2);
            case 8:
                Object zzf = zzxy.zzf(t, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zztd) {
                    return !zztd.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzxy.zzf(t, j2) != null;
            case 10:
                return !zztd.zzb.equals(zzxy.zzf(t, j2));
            case 11:
                return zzxy.zzc(t, j2) != 0;
            case 12:
                return zzxy.zzc(t, j2) != 0;
            case 13:
                return zzxy.zzc(t, j2) != 0;
            case 14:
                return zzxy.zzd(t, j2) != 0;
            case 15:
                return zzxy.zzc(t, j2) != 0;
            case 16:
                return zzxy.zzd(t, j2) != 0;
            case 17:
                return zzxy.zzf(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzR(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzQ(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzS(Object obj, int i, zzwx zzwxVar) {
        return zzwxVar.zzk(zzxy.zzf(obj, i & 1048575));
    }

    private final boolean zzT(T t, int i, int i2) {
        return zzxy.zzc(t, (long) (zzz(i2) & 1048575)) == i;
    }

    private static <T> boolean zzU(T t, long j) {
        return ((Boolean) zzxy.zzf(t, j)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x048c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzV(T r18, com.google.android.gms.internal.gtm.zztp r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzV(java.lang.Object, com.google.android.gms.internal.gtm.zztp):void");
    }

    private final <K, V> void zzW(zztp zztpVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzwd zzwdVar = (zzwd) zzH(i2);
        throw null;
    }

    private static final void zzX(int i, Object obj, zztp zztpVar) throws IOException {
        if (obj instanceof String) {
            zztpVar.zzG(i, (String) obj);
        } else {
            zztpVar.zzd(i, (zztd) obj);
        }
    }

    public static zzxp zzd(Object obj) {
        zzuz zzuzVar = (zzuz) obj;
        zzxp zzxpVar = zzuzVar.zzc;
        if (zzxpVar == zzxp.zzc()) {
            zzxp zze = zzxp.zze();
            zzuzVar.zzc = zze;
            return zze;
        }
        return zzxpVar;
    }

    public static <T> zzwn<T> zzl(Class<T> cls, zzwh zzwhVar, zzwq zzwqVar, zzvy zzvyVar, zzxo<?, ?> zzxoVar, zzuk<?> zzukVar, zzwf zzwfVar) {
        if (zzwhVar instanceof zzwv) {
            return zzm((zzwv) zzwhVar, zzwqVar, zzvyVar, zzxoVar, zzukVar, zzwfVar);
        }
        zzxl zzxlVar = (zzxl) zzwhVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.gtm.zzwn<T> zzm(com.google.android.gms.internal.gtm.zzwv r34, com.google.android.gms.internal.gtm.zzwq r35, com.google.android.gms.internal.gtm.zzvy r36, com.google.android.gms.internal.gtm.zzxo<?, ?> r37, com.google.android.gms.internal.gtm.zzuk<?> r38, com.google.android.gms.internal.gtm.zzwf r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzm(com.google.android.gms.internal.gtm.zzwv, com.google.android.gms.internal.gtm.zzwq, com.google.android.gms.internal.gtm.zzvy, com.google.android.gms.internal.gtm.zzxo, com.google.android.gms.internal.gtm.zzuk, com.google.android.gms.internal.gtm.zzwf):com.google.android.gms.internal.gtm.zzwn");
    }

    private static <T> double zzo(T t, long j) {
        return ((Double) zzxy.zzf(t, j)).doubleValue();
    }

    private static <T> float zzp(T t, long j) {
        return ((Float) zzxy.zzf(t, j)).floatValue();
    }

    private final int zzq(T t) {
        int i;
        int zzD;
        int zzD2;
        int zzD3;
        int zzE;
        int zzD4;
        int zzx;
        int zzD5;
        int zzD6;
        int zzd;
        int zzD7;
        int zzo;
        int zzC;
        int zzD8;
        int i2;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzC2 = zzC(i6);
            int i7 = this.zzc[i6];
            int zzB = zzB(zzC2);
            if (zzB <= 17) {
                int i8 = this.zzc[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = unsafe.getInt(t, i9);
                    i3 = i9;
                }
            } else {
                i = 0;
            }
            long j = zzC2 & 1048575;
            switch (zzB) {
                case 0:
                    if ((i5 & i) != 0) {
                        zzD = zzto.zzD(i7 << 3);
                        zzo = zzD + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if ((i5 & i) != 0) {
                        zzD2 = zzto.zzD(i7 << 3);
                        zzo = zzD2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i5 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        zzD3 = zzto.zzD(i7 << 3);
                        zzE = zzto.zzE(j2);
                        zzo = zzD3 + zzE;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i5 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        zzD3 = zzto.zzD(i7 << 3);
                        zzE = zzto.zzE(j3);
                        zzo = zzD3 + zzE;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i5 & i) != 0) {
                        int i10 = unsafe.getInt(t, j);
                        zzD4 = zzto.zzD(i7 << 3);
                        zzx = zzto.zzx(i10);
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i5 & i) != 0) {
                        zzD = zzto.zzD(i7 << 3);
                        zzo = zzD + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i5 & i) != 0) {
                        zzD2 = zzto.zzD(i7 << 3);
                        zzo = zzD2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i5 & i) != 0) {
                        zzD5 = zzto.zzD(i7 << 3);
                        zzo = zzD5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i5 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zztd) {
                            zzD6 = zzto.zzD(i7 << 3);
                            zzd = ((zztd) object).zzd();
                            zzD7 = zzto.zzD(zzd);
                            i2 = zzD6 + zzD7 + zzd;
                            i4 += i2;
                        } else {
                            zzD4 = zzto.zzD(i7 << 3);
                            zzx = zzto.zzB((String) object);
                            i2 = zzD4 + zzx;
                            i4 += i2;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if ((i5 & i) != 0) {
                        zzo = zzwz.zzo(i7, unsafe.getObject(t, j), zzF(i6));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i5 & i) != 0) {
                        zzD6 = zzto.zzD(i7 << 3);
                        zzd = ((zztd) unsafe.getObject(t, j)).zzd();
                        zzD7 = zzto.zzD(zzd);
                        i2 = zzD6 + zzD7 + zzd;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i5 & i) != 0) {
                        int i11 = unsafe.getInt(t, j);
                        zzD4 = zzto.zzD(i7 << 3);
                        zzx = zzto.zzD(i11);
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i5 & i) != 0) {
                        int i12 = unsafe.getInt(t, j);
                        zzD4 = zzto.zzD(i7 << 3);
                        zzx = zzto.zzx(i12);
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i5 & i) != 0) {
                        zzD2 = zzto.zzD(i7 << 3);
                        zzo = zzD2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i5 & i) != 0) {
                        zzD = zzto.zzD(i7 << 3);
                        zzo = zzD + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i5 & i) != 0) {
                        int i13 = unsafe.getInt(t, j);
                        zzD4 = zzto.zzD(i7 << 3);
                        zzx = zzto.zzD((i13 >> 31) ^ (i13 + i13));
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i5 & i) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        zzD4 = zzto.zzD(i7 << 3);
                        zzx = zzto.zzE((j4 >> 63) ^ (j4 + j4));
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i5 & i) != 0) {
                        zzo = zzto.zzv(i7, (zzwk) unsafe.getObject(t, j), zzF(i6));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzo = zzwz.zzh(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 19:
                    zzo = zzwz.zzf(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 20:
                    zzo = zzwz.zzm(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 21:
                    zzo = zzwz.zzx(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 22:
                    zzo = zzwz.zzk(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 23:
                    zzo = zzwz.zzh(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 24:
                    zzo = zzwz.zzf(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    zzo = zzwz.zza(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    zzo = zzwz.zzu(i7, (List) unsafe.getObject(t, j));
                    break;
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    zzo = zzwz.zzp(i7, (List) unsafe.getObject(t, j), zzF(i6));
                    break;
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    zzo = zzwz.zzc(i7, (List) unsafe.getObject(t, j));
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    zzo = zzwz.zzv(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    zzo = zzwz.zzd(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    zzo = zzwz.zzf(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 32:
                    zzo = zzwz.zzh(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    zzo = zzwz.zzq(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    zzo = zzwz.zzs(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    zzx = zzwz.zzi((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    zzx = zzwz.zzg((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    zzx = zzwz.zzn((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    zzx = zzwz.zzy((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    zzx = zzwz.zzl((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    zzx = zzwz.zzi((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    zzx = zzwz.zzg((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    zzx = zzwz.zzb((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    zzx = zzwz.zzw((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    zzx = zzwz.zze((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    zzx = zzwz.zzg((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    zzx = zzwz.zzi((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    zzx = zzwz.zzr((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    zzx = zzwz.zzt((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i7);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                    zzo = zzwz.zzj(i7, (List) unsafe.getObject(t, j), zzF(i6));
                    break;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    zzwf.zza(i7, unsafe.getObject(t, j), zzH(i6));
                    continue;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    if (zzT(t, i7, i6)) {
                        zzD = zzto.zzD(i7 << 3);
                        zzo = zzD + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zzT(t, i7, i6)) {
                        zzD2 = zzto.zzD(i7 << 3);
                        zzo = zzD2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zzT(t, i7, i6)) {
                        long zzD9 = zzD(t, j);
                        zzD3 = zzto.zzD(i7 << 3);
                        zzE = zzto.zzE(zzD9);
                        zzo = zzD3 + zzE;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zzT(t, i7, i6)) {
                        long zzD10 = zzD(t, j);
                        zzD3 = zzto.zzD(i7 << 3);
                        zzE = zzto.zzE(zzD10);
                        zzo = zzD3 + zzE;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (zzT(t, i7, i6)) {
                        int zzs = zzs(t, j);
                        zzD4 = zzto.zzD(i7 << 3);
                        zzx = zzto.zzx(zzs);
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 56:
                    if (zzT(t, i7, i6)) {
                        zzD = zzto.zzD(i7 << 3);
                        zzo = zzD + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zzT(t, i7, i6)) {
                        zzD2 = zzto.zzD(i7 << 3);
                        zzo = zzD2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zzT(t, i7, i6)) {
                        zzD5 = zzto.zzD(i7 << 3);
                        zzo = zzD5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zzT(t, i7, i6)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zztd) {
                            zzD6 = zzto.zzD(i7 << 3);
                            zzd = ((zztd) object2).zzd();
                            zzD7 = zzto.zzD(zzd);
                            i2 = zzD6 + zzD7 + zzd;
                            i4 += i2;
                        } else {
                            zzD4 = zzto.zzD(i7 << 3);
                            zzx = zzto.zzB((String) object2);
                            i2 = zzD4 + zzx;
                            i4 += i2;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (zzT(t, i7, i6)) {
                        zzo = zzwz.zzo(i7, unsafe.getObject(t, j), zzF(i6));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zzT(t, i7, i6)) {
                        zzD6 = zzto.zzD(i7 << 3);
                        zzd = ((zztd) unsafe.getObject(t, j)).zzd();
                        zzD7 = zzto.zzD(zzd);
                        i2 = zzD6 + zzD7 + zzd;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 62:
                    if (zzT(t, i7, i6)) {
                        int zzs2 = zzs(t, j);
                        zzD4 = zzto.zzD(i7 << 3);
                        zzx = zzto.zzD(zzs2);
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 63:
                    if (zzT(t, i7, i6)) {
                        int zzs3 = zzs(t, j);
                        zzD4 = zzto.zzD(i7 << 3);
                        zzx = zzto.zzx(zzs3);
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 64:
                    if (zzT(t, i7, i6)) {
                        zzD2 = zzto.zzD(i7 << 3);
                        zzo = zzD2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zzT(t, i7, i6)) {
                        zzD = zzto.zzD(i7 << 3);
                        zzo = zzD + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zzT(t, i7, i6)) {
                        int zzs4 = zzs(t, j);
                        zzD4 = zzto.zzD(i7 << 3);
                        zzx = zzto.zzD((zzs4 >> 31) ^ (zzs4 + zzs4));
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 67:
                    if (zzT(t, i7, i6)) {
                        long zzD11 = zzD(t, j);
                        zzD4 = zzto.zzD(i7 << 3);
                        zzx = zzto.zzE((zzD11 >> 63) ^ (zzD11 + zzD11));
                        i2 = zzD4 + zzx;
                        i4 += i2;
                    } else {
                        continue;
                    }
                case 68:
                    if (zzT(t, i7, i6)) {
                        zzo = zzto.zzv(i7, (zzwk) unsafe.getObject(t, j), zzF(i6));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i4 += zzo;
        }
        zzxo<?, ?> zzxoVar = this.zzo;
        int zza2 = i4 + zzxoVar.zza(zzxoVar.zzd(t));
        if (this.zzh) {
            zzuo<?> zzb2 = this.zzp.zzb(t);
            int i14 = 0;
            for (int i15 = 0; i15 < zzb2.zza.zzb(); i15++) {
                Map.Entry<?, Object> zzg = zzb2.zza.zzg(i15);
                i14 += zzuo.zza((zzun) zzg.getKey(), zzg.getValue());
            }
            for (Map.Entry<?, Object> entry : zzb2.zza.zzc()) {
                i14 += zzuo.zza((zzun) entry.getKey(), entry.getValue());
            }
            return zza2 + i14;
        }
        return zza2;
    }

    private final int zzr(T t) {
        int zzD;
        int zzD2;
        int zzD3;
        int zzE;
        int zzD4;
        int zzx;
        int zzD5;
        int zzD6;
        int zzd;
        int zzD7;
        int zzo;
        int zzC;
        int zzD8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzC2 = zzC(i3);
            int zzB = zzB(zzC2);
            int i4 = this.zzc[i3];
            long j = zzC2 & 1048575;
            if (zzB >= zzup.zzJ.zza() && zzB <= zzup.zzW.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzB) {
                case 0:
                    if (zzQ(t, i3)) {
                        zzD = zzto.zzD(i4 << 3);
                        zzo = zzD + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(t, i3)) {
                        zzD2 = zzto.zzD(i4 << 3);
                        zzo = zzD2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(t, i3)) {
                        long zzd2 = zzxy.zzd(t, j);
                        zzD3 = zzto.zzD(i4 << 3);
                        zzE = zzto.zzE(zzd2);
                        i2 += zzD3 + zzE;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(t, i3)) {
                        long zzd3 = zzxy.zzd(t, j);
                        zzD3 = zzto.zzD(i4 << 3);
                        zzE = zzto.zzE(zzd3);
                        i2 += zzD3 + zzE;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(t, i3)) {
                        int zzc = zzxy.zzc(t, j);
                        zzD4 = zzto.zzD(i4 << 3);
                        zzx = zzto.zzx(zzc);
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(t, i3)) {
                        zzD = zzto.zzD(i4 << 3);
                        zzo = zzD + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(t, i3)) {
                        zzD2 = zzto.zzD(i4 << 3);
                        zzo = zzD2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(t, i3)) {
                        zzD5 = zzto.zzD(i4 << 3);
                        zzo = zzD5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzQ(t, i3)) {
                        break;
                    } else {
                        Object zzf = zzxy.zzf(t, j);
                        if (zzf instanceof zztd) {
                            zzD6 = zzto.zzD(i4 << 3);
                            zzd = ((zztd) zzf).zzd();
                            zzD7 = zzto.zzD(zzd);
                            i = zzD6 + zzD7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzD4 = zzto.zzD(i4 << 3);
                            zzx = zzto.zzB((String) zzf);
                            i = zzD4 + zzx;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzQ(t, i3)) {
                        zzo = zzwz.zzo(i4, zzxy.zzf(t, j), zzF(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzQ(t, i3)) {
                        zzD6 = zzto.zzD(i4 << 3);
                        zzd = ((zztd) zzxy.zzf(t, j)).zzd();
                        zzD7 = zzto.zzD(zzd);
                        i = zzD6 + zzD7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(t, i3)) {
                        int zzc2 = zzxy.zzc(t, j);
                        zzD4 = zzto.zzD(i4 << 3);
                        zzx = zzto.zzD(zzc2);
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(t, i3)) {
                        int zzc3 = zzxy.zzc(t, j);
                        zzD4 = zzto.zzD(i4 << 3);
                        zzx = zzto.zzx(zzc3);
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(t, i3)) {
                        zzD2 = zzto.zzD(i4 << 3);
                        zzo = zzD2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(t, i3)) {
                        zzD = zzto.zzD(i4 << 3);
                        zzo = zzD + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(t, i3)) {
                        int zzc4 = zzxy.zzc(t, j);
                        zzD4 = zzto.zzD(i4 << 3);
                        zzx = zzto.zzD((zzc4 >> 31) ^ (zzc4 + zzc4));
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(t, i3)) {
                        long zzd4 = zzxy.zzd(t, j);
                        zzD4 = zzto.zzD(i4 << 3);
                        zzx = zzto.zzE((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzQ(t, i3)) {
                        zzo = zzto.zzv(i4, (zzwk) zzxy.zzf(t, j), zzF(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzwz.zzh(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case 19:
                    zzo = zzwz.zzf(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case 20:
                    zzo = zzwz.zzm(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case 21:
                    zzo = zzwz.zzx(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case 22:
                    zzo = zzwz.zzk(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case 23:
                    zzo = zzwz.zzh(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case 24:
                    zzo = zzwz.zzf(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    zzo = zzwz.zza(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    zzo = zzwz.zzu(i4, (List) zzxy.zzf(t, j));
                    i2 += zzo;
                    break;
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    zzo = zzwz.zzp(i4, (List) zzxy.zzf(t, j), zzF(i3));
                    i2 += zzo;
                    break;
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    zzo = zzwz.zzc(i4, (List) zzxy.zzf(t, j));
                    i2 += zzo;
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    zzo = zzwz.zzv(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    zzo = zzwz.zzd(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    zzo = zzwz.zzf(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case 32:
                    zzo = zzwz.zzh(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    zzo = zzwz.zzq(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    zzo = zzwz.zzs(i4, (List) zzxy.zzf(t, j), false);
                    i2 += zzo;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    zzx = zzwz.zzi((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    zzx = zzwz.zzg((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    zzx = zzwz.zzn((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    zzx = zzwz.zzy((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    zzx = zzwz.zzl((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    zzx = zzwz.zzi((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    zzx = zzwz.zzg((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    zzx = zzwz.zzb((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    zzx = zzwz.zzw((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    zzx = zzwz.zze((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    zzx = zzwz.zzg((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    zzx = zzwz.zzi((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    zzx = zzwz.zzr((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    zzx = zzwz.zzt((List) unsafe.getObject(t, j));
                    if (zzx > 0) {
                        zzC = zzto.zzC(i4);
                        zzD8 = zzto.zzD(zzx);
                        zzD4 = zzC + zzD8;
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                    zzo = zzwz.zzj(i4, (List) zzxy.zzf(t, j), zzF(i3));
                    i2 += zzo;
                    break;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    zzwf.zza(i4, zzxy.zzf(t, j), zzH(i3));
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    if (zzT(t, i4, i3)) {
                        zzD = zzto.zzD(i4 << 3);
                        zzo = zzD + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(t, i4, i3)) {
                        zzD2 = zzto.zzD(i4 << 3);
                        zzo = zzD2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(t, i4, i3)) {
                        long zzD9 = zzD(t, j);
                        zzD3 = zzto.zzD(i4 << 3);
                        zzE = zzto.zzE(zzD9);
                        i2 += zzD3 + zzE;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(t, i4, i3)) {
                        long zzD10 = zzD(t, j);
                        zzD3 = zzto.zzD(i4 << 3);
                        zzE = zzto.zzE(zzD10);
                        i2 += zzD3 + zzE;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(t, i4, i3)) {
                        int zzs = zzs(t, j);
                        zzD4 = zzto.zzD(i4 << 3);
                        zzx = zzto.zzx(zzs);
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(t, i4, i3)) {
                        zzD = zzto.zzD(i4 << 3);
                        zzo = zzD + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(t, i4, i3)) {
                        zzD2 = zzto.zzD(i4 << 3);
                        zzo = zzD2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(t, i4, i3)) {
                        zzD5 = zzto.zzD(i4 << 3);
                        zzo = zzD5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzT(t, i4, i3)) {
                        break;
                    } else {
                        Object zzf2 = zzxy.zzf(t, j);
                        if (zzf2 instanceof zztd) {
                            zzD6 = zzto.zzD(i4 << 3);
                            zzd = ((zztd) zzf2).zzd();
                            zzD7 = zzto.zzD(zzd);
                            i = zzD6 + zzD7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzD4 = zzto.zzD(i4 << 3);
                            zzx = zzto.zzB((String) zzf2);
                            i = zzD4 + zzx;
                            i2 += i;
                        }
                    }
                case 60:
                    if (zzT(t, i4, i3)) {
                        zzo = zzwz.zzo(i4, zzxy.zzf(t, j), zzF(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(t, i4, i3)) {
                        zzD6 = zzto.zzD(i4 << 3);
                        zzd = ((zztd) zzxy.zzf(t, j)).zzd();
                        zzD7 = zzto.zzD(zzd);
                        i = zzD6 + zzD7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(t, i4, i3)) {
                        int zzs2 = zzs(t, j);
                        zzD4 = zzto.zzD(i4 << 3);
                        zzx = zzto.zzD(zzs2);
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(t, i4, i3)) {
                        int zzs3 = zzs(t, j);
                        zzD4 = zzto.zzD(i4 << 3);
                        zzx = zzto.zzx(zzs3);
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(t, i4, i3)) {
                        zzD2 = zzto.zzD(i4 << 3);
                        zzo = zzD2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(t, i4, i3)) {
                        zzD = zzto.zzD(i4 << 3);
                        zzo = zzD + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(t, i4, i3)) {
                        int zzs4 = zzs(t, j);
                        zzD4 = zzto.zzD(i4 << 3);
                        zzx = zzto.zzD((zzs4 >> 31) ^ (zzs4 + zzs4));
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(t, i4, i3)) {
                        long zzD11 = zzD(t, j);
                        zzD4 = zzto.zzD(i4 << 3);
                        zzx = zzto.zzE((zzD11 >> 63) ^ (zzD11 + zzD11));
                        i = zzD4 + zzx;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(t, i4, i3)) {
                        zzo = zzto.zzv(i4, (zzwk) zzxy.zzf(t, j), zzF(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzxo<?, ?> zzxoVar = this.zzo;
        return i2 + zzxoVar.zza(zzxoVar.zzd(t));
    }

    private static <T> int zzs(T t, long j) {
        return ((Integer) zzxy.zzf(t, j)).intValue();
    }

    private final <K, V> int zzt(T t, byte[] bArr, int i, int i2, int i3, long j, zzsl zzslVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i3);
        Object object = unsafe.getObject(t, j);
        if (zzwf.zzb(object)) {
            zzwe<K, V> zzb2 = zzwe.zza().zzb();
            zzwf.zzc(zzb2, object);
            unsafe.putObject(t, j, zzb2);
        }
        zzwd zzwdVar = (zzwd) zzH;
        throw null;
    }

    private final int zzu(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzsl zzslVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(zzsm.zzo(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(zzsm.zzb(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzsm.zzm(bArr, i, zzslVar);
                    unsafe.putObject(t, j, Long.valueOf(zzslVar.zzb));
                    unsafe.putInt(t, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzsm.zzj(bArr, i, zzslVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzslVar.zza));
                    unsafe.putInt(t, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzsm.zzo(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzsm.zzb(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzsm.zzm(bArr, i, zzslVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzslVar.zzb != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzsm.zzj(bArr, i, zzslVar);
                    int i9 = zzslVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzyd.zzf(bArr, zzj2, zzj2 + i9)) {
                        throw zzvk.zzd();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, zzj2, i9, zzvi.zza));
                        zzj2 += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int zzd = zzsm.zzd(zzF(i8), bArr, i, i2, zzslVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzslVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzvi.zzg(object, zzslVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzd;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzsm.zza(bArr, i, zzslVar);
                    unsafe.putObject(t, j, zzslVar.zzc);
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzsm.zzj(bArr, i, zzslVar);
                    int i10 = zzslVar.zza;
                    zzvd zzE = zzE(i8);
                    if (zzE != null && !zzE.zza(i10)) {
                        zzd(t).zzh(i3, Long.valueOf(i10));
                    } else {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        unsafe.putInt(t, j2, i4);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzsm.zzj(bArr, i, zzslVar);
                    unsafe.putObject(t, j, Integer.valueOf(zztj.zzs(zzslVar.zza)));
                    unsafe.putInt(t, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzsm.zzm(bArr, i, zzslVar);
                    unsafe.putObject(t, j, Long.valueOf(zztj.zzt(zzslVar.zzb)));
                    unsafe.putInt(t, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzc = zzsm.zzc(zzF(i8), bArr, i, i2, (i3 & (-8)) | 4, zzslVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzslVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzvi.zzg(object2, zzslVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a9, code lost:
        if (r0 != r15) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ab, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r10 = r18;
        r2 = r19;
        r1 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02c1, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f4, code lost:
        if (r0 != r15) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0317, code lost:
        if (r0 != r15) goto L154;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzv(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.gtm.zzsl r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzv(java.lang.Object, byte[], int, int, com.google.android.gms.internal.gtm.zzsl):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzw(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.gtm.zzsl r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzw(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.gtm.zzsl):int");
    }

    private final int zzx(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzA(i, 0);
    }

    private final int zzy(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzA(i, i2);
    }

    private final int zzz(int i) {
        return this.zzc[i + 2];
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final int zza(T t) {
        return this.zzj ? zzr(t) : zzq(t);
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final int zzb(T t) {
        int i;
        int zzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzC = zzC(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzC;
            int i5 = 37;
            switch (zzB(zzC)) {
                case 0:
                    i = i2 * 53;
                    zzc = zzvi.zzc(Double.doubleToLongBits(zzxy.zza(t, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(zzxy.zzb(t, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = zzxy.zzc(t, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = zzxy.zzc(t, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzvi.zza(zzxy.zzw(t, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) zzxy.zzf(t, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    Object zzf = zzxy.zzf(t, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = zzxy.zzf(t, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = zzxy.zzc(t, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = zzxy.zzc(t, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = zzxy.zzc(t, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = zzxy.zzc(t, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zzxy.zzf(t, j);
                    if (zzf2 != null) {
                        i5 = zzf2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                case 32:
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                    i = i2 * 53;
                    zzc = zzxy.zzf(t, j).hashCode();
                    i2 = i + zzc;
                    break;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    i = i2 * 53;
                    zzc = zzxy.zzf(t, j).hashCode();
                    i2 = i + zzc;
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzvi.zzc(Double.doubleToLongBits(zzo(t, j)));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = Float.floatToIntBits(zzp(t, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzvi.zzc(zzD(t, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzvi.zzc(zzD(t, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzs(t, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzvi.zzc(zzD(t, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzs(t, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzvi.zza(zzU(t, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) zzxy.zzf(t, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzxy.zzf(t, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzxy.zzf(t, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzs(t, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzs(t, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzs(t, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzvi.zzc(zzD(t, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzs(t, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzvi.zzc(zzD(t, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(t, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzxy.zzf(t, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzo.zzd(t).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzp.zzb(t).zza.hashCode() : hashCode;
    }

    public final int zzc(T t, byte[] bArr, int i, int i2, int i3, zzsl zzslVar) throws IOException {
        Unsafe unsafe;
        int i4;
        int i5;
        T t2;
        zzwn<T> zzwnVar;
        int i6;
        int i7;
        int i8;
        int i9;
        int zzx;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        int i15;
        T t3;
        byte[] bArr2;
        int i16;
        zzsl zzslVar2;
        int i17;
        int i18;
        Object valueOf;
        int ordinal;
        Object zze;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z2;
        char c;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        zzwn<T> zzwnVar2 = this;
        T t4 = t;
        byte[] bArr3 = bArr;
        int i29 = i2;
        int i30 = i3;
        zzsl zzslVar3 = zzslVar;
        Unsafe unsafe2 = zzb;
        int i31 = i;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = -1;
        int i36 = 1048575;
        while (true) {
            if (i31 < i29) {
                int i37 = i31 + 1;
                byte b = bArr3[i31];
                if (b < 0) {
                    i9 = zzsm.zzk(b, bArr3, i37, zzslVar3);
                    i8 = zzslVar3.zza;
                } else {
                    i8 = b;
                    i9 = i37;
                }
                int i38 = i8 >>> 3;
                int i39 = i8 & 7;
                if (i38 > i35) {
                    zzx = zzwnVar2.zzy(i38, i33 / 3);
                } else {
                    zzx = zzwnVar2.zzx(i38);
                }
                if (zzx == -1) {
                    i10 = i9;
                    i11 = i34;
                    i12 = i38;
                    unsafe = unsafe2;
                    i13 = i30;
                    i14 = 0;
                    z = true;
                    i15 = i8;
                } else {
                    int i40 = zzwnVar2.zzc[zzx + 1];
                    int zzB = zzB(i40);
                    long j = i40 & 1048575;
                    int i41 = i8;
                    if (zzB <= 17) {
                        int i42 = zzwnVar2.zzc[zzx + 2];
                        int i43 = 1 << (i42 >>> 20);
                        int i44 = i42 & 1048575;
                        if (i44 != i36) {
                            i19 = i39;
                            if (i36 != 1048575) {
                                unsafe2.putInt(t4, i36, i34);
                            }
                            i34 = unsafe2.getInt(t4, i44);
                            i20 = i44;
                        } else {
                            i19 = i39;
                            i20 = i36;
                        }
                        int i45 = i34;
                        switch (zzB) {
                            case 0:
                                i21 = i9;
                                i22 = zzx;
                                i23 = i41;
                                z2 = true;
                                c = 65535;
                                if (i19 == 1) {
                                    zzxy.zzo(t4, j, Double.longBitsToDouble(zzsm.zzo(bArr3, i21)));
                                    i31 = i21 + 8;
                                    i34 = i45 | i43;
                                    i29 = i2;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i35 = i38;
                                    i30 = i3;
                                    break;
                                } else {
                                    i25 = i21;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                            case 1:
                                i24 = i9;
                                i22 = zzx;
                                i23 = i41;
                                c = 65535;
                                if (i19 == 5) {
                                    zzxy.zzp(t4, j, Float.intBitsToFloat(zzsm.zzb(bArr3, i24)));
                                    i31 = i24 + 4;
                                    i34 = i45 | i43;
                                    i29 = i2;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i35 = i38;
                                    i30 = i3;
                                    break;
                                } else {
                                    i25 = i24;
                                    z2 = true;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                            case 2:
                            case 3:
                                i24 = i9;
                                i22 = zzx;
                                i23 = i41;
                                c = 65535;
                                if (i19 == 0) {
                                    int zzm = zzsm.zzm(bArr3, i24, zzslVar3);
                                    unsafe2.putLong(t, j, zzslVar3.zzb);
                                    i34 = i45 | i43;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i31 = zzm;
                                    i35 = i38;
                                    i29 = i2;
                                    i30 = i3;
                                    break;
                                } else {
                                    i25 = i24;
                                    z2 = true;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                            case 4:
                            case 11:
                                i24 = i9;
                                i22 = zzx;
                                i23 = i41;
                                c = 65535;
                                if (i19 == 0) {
                                    i31 = zzsm.zzj(bArr3, i24, zzslVar3);
                                    unsafe2.putInt(t4, j, zzslVar3.zza);
                                    i34 = i45 | i43;
                                    i29 = i2;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i35 = i38;
                                    i30 = i3;
                                    break;
                                } else {
                                    i25 = i24;
                                    z2 = true;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                            case 5:
                            case 14:
                                i22 = zzx;
                                i23 = i41;
                                z2 = true;
                                c = 65535;
                                if (i19 == 1) {
                                    i21 = i9;
                                    unsafe2.putLong(t, j, zzsm.zzo(bArr3, i9));
                                    i31 = i21 + 8;
                                    i34 = i45 | i43;
                                    i29 = i2;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i35 = i38;
                                    i30 = i3;
                                    break;
                                } else {
                                    i25 = i9;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                            case 6:
                            case 13:
                                i22 = zzx;
                                i23 = i41;
                                c = 65535;
                                if (i19 == 5) {
                                    unsafe2.putInt(t4, j, zzsm.zzb(bArr3, i9));
                                    i31 = i9 + 4;
                                    i34 = i45 | i43;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i35 = i38;
                                    i30 = i3;
                                    break;
                                } else {
                                    i25 = i9;
                                    z2 = true;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                            case 7:
                                i22 = zzx;
                                i23 = i41;
                                c = 65535;
                                if (i19 == 0) {
                                    i31 = zzsm.zzm(bArr3, i9, zzslVar3);
                                    zzxy.zzm(t4, j, zzslVar3.zzb != 0);
                                    i34 = i45 | i43;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i35 = i38;
                                    i30 = i3;
                                    break;
                                } else {
                                    i25 = i9;
                                    z2 = true;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                            case 8:
                                i22 = zzx;
                                i23 = i41;
                                c = 65535;
                                if (i19 == 2) {
                                    if ((i40 & 536870912) == 0) {
                                        i31 = zzsm.zzg(bArr3, i9, zzslVar3);
                                    } else {
                                        i31 = zzsm.zzh(bArr3, i9, zzslVar3);
                                    }
                                    unsafe2.putObject(t4, j, zzslVar3.zzc);
                                    i34 = i45 | i43;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i35 = i38;
                                    i30 = i3;
                                    break;
                                } else {
                                    i25 = i9;
                                    z2 = true;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                            case 9:
                                i22 = zzx;
                                i23 = i41;
                                c = 65535;
                                if (i19 == 2) {
                                    i31 = zzsm.zzd(zzwnVar2.zzF(i22), bArr3, i9, i29, zzslVar3);
                                    if ((i45 & i43) == 0) {
                                        unsafe2.putObject(t4, j, zzslVar3.zzc);
                                    } else {
                                        unsafe2.putObject(t4, j, zzvi.zzg(unsafe2.getObject(t4, j), zzslVar3.zzc));
                                    }
                                    i34 = i45 | i43;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i35 = i38;
                                    i30 = i3;
                                    break;
                                } else {
                                    i25 = i9;
                                    z2 = true;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                            case 10:
                                i22 = zzx;
                                i23 = i41;
                                c = 65535;
                                if (i19 == 2) {
                                    i31 = zzsm.zza(bArr3, i9, zzslVar3);
                                    unsafe2.putObject(t4, j, zzslVar3.zzc);
                                    i34 = i45 | i43;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i35 = i38;
                                    i30 = i3;
                                    break;
                                } else {
                                    i25 = i9;
                                    z2 = true;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                            case 12:
                                i22 = zzx;
                                i23 = i41;
                                c = 65535;
                                if (i19 == 0) {
                                    i31 = zzsm.zzj(bArr3, i9, zzslVar3);
                                    int i46 = zzslVar3.zza;
                                    zzvd zzE = zzwnVar2.zzE(i22);
                                    if (zzE != null && !zzE.zza(i46)) {
                                        zzd(t).zzh(i23, Long.valueOf(i46));
                                        i34 = i45;
                                        i36 = i20;
                                        i33 = i22;
                                        i32 = i23;
                                        i35 = i38;
                                        i30 = i3;
                                    } else {
                                        unsafe2.putInt(t4, j, i46);
                                        i34 = i45 | i43;
                                        i36 = i20;
                                        i33 = i22;
                                        i32 = i23;
                                        i35 = i38;
                                        i30 = i3;
                                        break;
                                    }
                                } else {
                                    i25 = i9;
                                    z2 = true;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                                break;
                            case 15:
                                i22 = zzx;
                                i23 = i41;
                                c = 65535;
                                if (i19 == 0) {
                                    i31 = zzsm.zzj(bArr3, i9, zzslVar3);
                                    unsafe2.putInt(t4, j, zztj.zzs(zzslVar3.zza));
                                    i34 = i45 | i43;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i35 = i38;
                                    i30 = i3;
                                    break;
                                } else {
                                    i25 = i9;
                                    z2 = true;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                            case 16:
                                if (i19 == 0) {
                                    int zzm2 = zzsm.zzm(bArr3, i9, zzslVar3);
                                    i23 = i41;
                                    i22 = zzx;
                                    unsafe2.putLong(t, j, zztj.zzt(zzslVar3.zzb));
                                    i34 = i45 | i43;
                                    i31 = zzm2;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i35 = i38;
                                    i30 = i3;
                                    break;
                                } else {
                                    i22 = zzx;
                                    i23 = i41;
                                    c = 65535;
                                    i25 = i9;
                                    z2 = true;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                            default:
                                i21 = i9;
                                i22 = zzx;
                                i23 = i41;
                                z2 = true;
                                c = 65535;
                                if (i19 == 3) {
                                    i31 = zzsm.zzc(zzwnVar2.zzF(i22), bArr, i21, i2, (i38 << 3) | 4, zzslVar);
                                    if ((i45 & i43) == 0) {
                                        unsafe2.putObject(t4, j, zzslVar3.zzc);
                                    } else {
                                        unsafe2.putObject(t4, j, zzvi.zzg(unsafe2.getObject(t4, j), zzslVar3.zzc));
                                    }
                                    i34 = i45 | i43;
                                    bArr3 = bArr;
                                    i29 = i2;
                                    i36 = i20;
                                    i33 = i22;
                                    i32 = i23;
                                    i35 = i38;
                                    i30 = i3;
                                    break;
                                } else {
                                    i25 = i21;
                                    i13 = i3;
                                    z = z2;
                                    i11 = i45;
                                    i36 = i20;
                                    unsafe = unsafe2;
                                    i15 = i23;
                                    i10 = i25;
                                    i12 = i38;
                                    i14 = i22;
                                    break;
                                }
                        }
                    } else {
                        int i47 = i9;
                        int i48 = zzx;
                        if (zzB != 27) {
                            i11 = i34;
                            i26 = i36;
                            if (zzB <= 49) {
                                z = true;
                                i27 = i41;
                                i12 = i38;
                                i14 = i48;
                                unsafe = unsafe2;
                                i31 = zzw(t, bArr, i47, i2, i41, i38, i39, i48, i40, zzB, j, zzslVar);
                                if (i31 != i47) {
                                    zzwnVar2 = this;
                                    t4 = t;
                                    bArr3 = bArr;
                                    i35 = i12;
                                    i29 = i2;
                                    i30 = i3;
                                    zzslVar3 = zzslVar;
                                    i33 = i14;
                                    i34 = i11;
                                    i36 = i26;
                                    i32 = i27;
                                    unsafe2 = unsafe;
                                } else {
                                    i10 = i31;
                                    i36 = i26;
                                    i15 = i27;
                                    i13 = i3;
                                }
                            } else {
                                z = true;
                                i27 = i41;
                                unsafe = unsafe2;
                                i28 = i47;
                                i12 = i38;
                                i14 = i48;
                                if (zzB != 50) {
                                    i31 = zzu(t, bArr, i28, i2, i27, i12, i39, i40, zzB, j, i14, zzslVar);
                                    if (i31 != i28) {
                                        zzwnVar2 = this;
                                        t4 = t;
                                        bArr3 = bArr;
                                        i35 = i12;
                                        i29 = i2;
                                        i30 = i3;
                                        zzslVar3 = zzslVar;
                                        i33 = i14;
                                        i34 = i11;
                                        i36 = i26;
                                        i32 = i27;
                                        unsafe2 = unsafe;
                                    } else {
                                        i10 = i31;
                                        i36 = i26;
                                        i15 = i27;
                                        i13 = i3;
                                    }
                                } else if (i39 == 2) {
                                    i31 = zzt(t, bArr, i28, i2, i14, j, zzslVar);
                                    if (i31 != i28) {
                                        zzwnVar2 = this;
                                        t4 = t;
                                        bArr3 = bArr;
                                        i35 = i12;
                                        i29 = i2;
                                        i30 = i3;
                                        zzslVar3 = zzslVar;
                                        i33 = i14;
                                        i34 = i11;
                                        i36 = i26;
                                        i32 = i27;
                                        unsafe2 = unsafe;
                                    } else {
                                        i10 = i31;
                                        i36 = i26;
                                        i15 = i27;
                                        i13 = i3;
                                    }
                                } else {
                                    i13 = i3;
                                    i10 = i28;
                                    i36 = i26;
                                    i15 = i27;
                                }
                            }
                        } else if (i39 == 2) {
                            zzvh zzvhVar = (zzvh) unsafe2.getObject(t4, j);
                            if (!zzvhVar.zzc()) {
                                int size = zzvhVar.size();
                                zzvhVar = zzvhVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(t4, j, zzvhVar);
                            }
                            i32 = i41;
                            i31 = zzsm.zze(zzwnVar2.zzF(i48), i32, bArr, i47, i2, zzvhVar, zzslVar);
                            bArr3 = bArr;
                            i29 = i2;
                            i30 = i3;
                            i33 = i48;
                            i34 = i34;
                            i36 = i36;
                            i35 = i38;
                        } else {
                            i11 = i34;
                            i26 = i36;
                            z = true;
                            i27 = i41;
                            unsafe = unsafe2;
                            i28 = i47;
                            i12 = i38;
                            i14 = i48;
                            i13 = i3;
                            i10 = i28;
                            i36 = i26;
                            i15 = i27;
                        }
                    }
                }
                if (i15 != i13 || i13 == 0) {
                    int i49 = i13;
                    if (this.zzh) {
                        zzslVar2 = zzslVar;
                        if (zzslVar2.zzd != zzuj.zza()) {
                            zzwk zzwkVar = this.zzg;
                            zzxo<?, ?> zzxoVar = this.zzo;
                            i16 = i12;
                            zzux zzc = zzslVar2.zzd.zzc(zzwkVar, i16);
                            if (zzc == null) {
                                i31 = zzsm.zzi(i15, bArr, i10, i2, zzd(t), zzslVar);
                                t3 = t;
                                bArr2 = bArr;
                            } else {
                                t3 = t;
                                zzuv zzuvVar = (zzuv) t3;
                                zzuvVar.zzU();
                                zzuo<zzuw> zzuoVar = zzuvVar.zza;
                                zzye zzyeVar = zzc.zzd.zzc;
                                if (zzyeVar == zzye.zzn) {
                                    bArr2 = bArr;
                                    i10 = zzsm.zzj(bArr2, i10, zzslVar2);
                                    zzvc<?> zzvcVar = zzc.zzd.zza;
                                    if (zzyl.zzc(zzslVar2.zza) == null) {
                                        zzxp zzxpVar = zzuvVar.zzc;
                                        if (zzxpVar == zzxp.zzc()) {
                                            zzxpVar = zzxp.zze();
                                            zzuvVar.zzc = zzxpVar;
                                        }
                                        zzwz.zzD(i16, zzslVar2.zza, zzxpVar, zzxoVar);
                                        i31 = i10;
                                    } else {
                                        valueOf = Integer.valueOf(zzslVar2.zza);
                                    }
                                } else {
                                    bArr2 = bArr;
                                    switch (zzyeVar.ordinal()) {
                                        case 0:
                                            i17 = i36;
                                            i18 = i2;
                                            valueOf = Double.valueOf(Double.longBitsToDouble(zzsm.zzo(bArr2, i10)));
                                            i10 += 8;
                                            break;
                                        case 1:
                                            i17 = i36;
                                            i18 = i2;
                                            valueOf = Float.valueOf(Float.intBitsToFloat(zzsm.zzb(bArr2, i10)));
                                            i10 += 4;
                                            break;
                                        case 2:
                                        case 3:
                                            i17 = i36;
                                            i18 = i2;
                                            i10 = zzsm.zzm(bArr2, i10, zzslVar2);
                                            valueOf = Long.valueOf(zzslVar2.zzb);
                                            break;
                                        case 4:
                                        case 12:
                                            i17 = i36;
                                            i18 = i2;
                                            i10 = zzsm.zzj(bArr2, i10, zzslVar2);
                                            valueOf = Integer.valueOf(zzslVar2.zza);
                                            break;
                                        case 5:
                                        case 15:
                                            i17 = i36;
                                            i18 = i2;
                                            valueOf = Long.valueOf(zzsm.zzo(bArr2, i10));
                                            i10 += 8;
                                            break;
                                        case 6:
                                        case 14:
                                            i17 = i36;
                                            i18 = i2;
                                            valueOf = Integer.valueOf(zzsm.zzb(bArr2, i10));
                                            i10 += 4;
                                            break;
                                        case 7:
                                            i17 = i36;
                                            i18 = i2;
                                            i10 = zzsm.zzm(bArr2, i10, zzslVar2);
                                            valueOf = Boolean.valueOf(zzslVar2.zzb != 0 ? z : false);
                                            break;
                                        case 8:
                                            i17 = i36;
                                            i18 = i2;
                                            i10 = zzsm.zzg(bArr2, i10, zzslVar2);
                                            valueOf = zzslVar2.zzc;
                                            break;
                                        case 9:
                                            i17 = i36;
                                            i18 = i2;
                                            i10 = zzsm.zzc(zzwt.zza().zzb(zzc.zzc.getClass()), bArr, i10, i2, (i16 << 3) | 4, zzslVar);
                                            valueOf = zzslVar2.zzc;
                                            break;
                                        case 10:
                                            i10 = zzsm.zzd(zzwt.zza().zzb(zzc.zzc.getClass()), bArr2, i10, i2, zzslVar2);
                                            valueOf = zzslVar2.zzc;
                                            i17 = i36;
                                            i18 = i2;
                                            break;
                                        case 11:
                                            i10 = zzsm.zza(bArr2, i10, zzslVar2);
                                            valueOf = zzslVar2.zzc;
                                            break;
                                        case 13:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case 16:
                                            i10 = zzsm.zzj(bArr2, i10, zzslVar2);
                                            valueOf = Integer.valueOf(zztj.zzs(zzslVar2.zza));
                                            break;
                                        case 17:
                                            i10 = zzsm.zzm(bArr2, i10, zzslVar2);
                                            valueOf = Long.valueOf(zztj.zzt(zzslVar2.zzb));
                                            break;
                                        default:
                                            i17 = i36;
                                            i18 = i2;
                                            valueOf = null;
                                            break;
                                    }
                                    zzc.zza();
                                    ordinal = zzc.zzd.zzc.ordinal();
                                    if ((ordinal != 9 || ordinal == 10) && (zze = zzuoVar.zze(zzc.zzd)) != null) {
                                        valueOf = zzvi.zzg(zze, valueOf);
                                    }
                                    zzuoVar.zzi(zzc.zzd, valueOf);
                                    i31 = i10;
                                    i32 = i15;
                                    i35 = i16;
                                    t4 = t3;
                                    bArr3 = bArr2;
                                    i33 = i14;
                                    i34 = i11;
                                    i29 = i18;
                                    zzwnVar2 = this;
                                    i30 = i49;
                                    zzslVar3 = zzslVar2;
                                    unsafe2 = unsafe;
                                    i36 = i17;
                                }
                                i17 = i36;
                                i18 = i2;
                                zzc.zza();
                                ordinal = zzc.zzd.zzc.ordinal();
                                if (ordinal != 9) {
                                }
                                valueOf = zzvi.zzg(zze, valueOf);
                                zzuoVar.zzi(zzc.zzd, valueOf);
                                i31 = i10;
                                i32 = i15;
                                i35 = i16;
                                t4 = t3;
                                bArr3 = bArr2;
                                i33 = i14;
                                i34 = i11;
                                i29 = i18;
                                zzwnVar2 = this;
                                i30 = i49;
                                zzslVar3 = zzslVar2;
                                unsafe2 = unsafe;
                                i36 = i17;
                            }
                            i17 = i36;
                            i18 = i2;
                            i32 = i15;
                            i35 = i16;
                            t4 = t3;
                            bArr3 = bArr2;
                            i33 = i14;
                            i34 = i11;
                            i29 = i18;
                            zzwnVar2 = this;
                            i30 = i49;
                            zzslVar3 = zzslVar2;
                            unsafe2 = unsafe;
                            i36 = i17;
                        } else {
                            t3 = t;
                            bArr2 = bArr;
                            i16 = i12;
                        }
                    } else {
                        t3 = t;
                        bArr2 = bArr;
                        i16 = i12;
                        zzslVar2 = zzslVar;
                    }
                    i17 = i36;
                    i18 = i2;
                    i31 = zzsm.zzi(i15, bArr, i10, i2, zzd(t), zzslVar);
                    i32 = i15;
                    i35 = i16;
                    t4 = t3;
                    bArr3 = bArr2;
                    i33 = i14;
                    i34 = i11;
                    i29 = i18;
                    zzwnVar2 = this;
                    i30 = i49;
                    zzslVar3 = zzslVar2;
                    unsafe2 = unsafe;
                    i36 = i17;
                } else {
                    zzwnVar = this;
                    t2 = t;
                    i4 = i13;
                    i31 = i10;
                    i6 = i36;
                    i32 = i15;
                    i34 = i11;
                    i7 = 1048575;
                    i5 = i2;
                }
            } else {
                int i50 = i36;
                unsafe = unsafe2;
                i4 = i30;
                i5 = i29;
                t2 = t4;
                zzwnVar = zzwnVar2;
                i6 = i50;
                i7 = 1048575;
            }
        }
        if (i6 != i7) {
            unsafe.putInt(t2, i6, i34);
        }
        for (int i51 = zzwnVar.zzl; i51 < zzwnVar.zzm; i51++) {
            zzwnVar.zzG(t2, zzwnVar.zzk[i51], null, zzwnVar.zzo);
        }
        if (i4 == 0) {
            if (i31 != i5) {
                throw zzvk.zzg();
            }
        } else if (i31 > i5 || i32 != i4) {
            throw zzvk.zzg();
        }
        return i31;
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final T zze() {
        return (T) ((zzuz) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzf(T t) {
        int i;
        int i2 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i2 >= i) {
                break;
            }
            long zzC = zzC(this.zzk[i2]) & 1048575;
            Object zzf = zzxy.zzf(t, zzC);
            if (zzf != null) {
                ((zzwe) zzf).zzc();
                zzxy.zzs(t, zzC, zzf);
            }
            i2++;
        }
        int length = this.zzk.length;
        while (i < length) {
            this.zzn.zzb(t, this.zzk[i]);
            i++;
        }
        this.zzo.zzm(t);
        if (this.zzh) {
            this.zzp.zzf(t);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzg(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzC = zzC(i);
            long j = 1048575 & zzC;
            int i2 = this.zzc[i];
            switch (zzB(zzC)) {
                case 0:
                    if (zzQ(t2, i)) {
                        zzxy.zzo(t, j, zzxy.zza(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(t2, i)) {
                        zzxy.zzp(t, j, zzxy.zzb(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(t2, i)) {
                        zzxy.zzr(t, j, zzxy.zzd(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(t2, i)) {
                        zzxy.zzr(t, j, zzxy.zzd(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(t2, i)) {
                        zzxy.zzq(t, j, zzxy.zzc(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(t2, i)) {
                        zzxy.zzr(t, j, zzxy.zzd(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(t2, i)) {
                        zzxy.zzq(t, j, zzxy.zzc(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(t2, i)) {
                        zzxy.zzm(t, j, zzxy.zzw(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(t2, i)) {
                        zzxy.zzs(t, j, zzxy.zzf(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(t, t2, i);
                    break;
                case 10:
                    if (zzQ(t2, i)) {
                        zzxy.zzs(t, j, zzxy.zzf(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(t2, i)) {
                        zzxy.zzq(t, j, zzxy.zzc(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(t2, i)) {
                        zzxy.zzq(t, j, zzxy.zzc(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(t2, i)) {
                        zzxy.zzq(t, j, zzxy.zzc(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(t2, i)) {
                        zzxy.zzr(t, j, zzxy.zzd(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(t2, i)) {
                        zzxy.zzq(t, j, zzxy.zzc(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(t2, i)) {
                        zzxy.zzr(t, j, zzxy.zzd(t2, j));
                        zzM(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                case 32:
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                    this.zzn.zzc(t, t2, j);
                    break;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    zzwz.zzI(this.zzr, t, t2, j);
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzT(t2, i2, i)) {
                        zzxy.zzs(t, j, zzxy.zzf(t2, j));
                        zzN(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzK(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(t2, i2, i)) {
                        zzxy.zzs(t, j, zzxy.zzf(t2, j));
                        zzN(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(t, t2, i);
                    break;
            }
        }
        zzwz.zzF(this.zzo, t, t2);
        if (this.zzh) {
            zzwz.zzE(this.zzp, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzh(T t, zzww zzwwVar, zzuj zzujVar) throws IOException {
        Objects.requireNonNull(zzujVar);
        zzxo zzxoVar = this.zzo;
        zzuk<?> zzukVar = this.zzp;
        zzuo<?> zzuoVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzc = zzwwVar.zzc();
                int zzx = zzx(zzc);
                if (zzx >= 0) {
                    int zzC = zzC(zzx);
                    try {
                        switch (zzB(zzC)) {
                            case 0:
                                zzxy.zzo(t, zzC & 1048575, zzwwVar.zza());
                                zzM(t, zzx);
                                break;
                            case 1:
                                zzxy.zzp(t, zzC & 1048575, zzwwVar.zzb());
                                zzM(t, zzx);
                                break;
                            case 2:
                                zzxy.zzr(t, zzC & 1048575, zzwwVar.zzl());
                                zzM(t, zzx);
                                break;
                            case 3:
                                zzxy.zzr(t, zzC & 1048575, zzwwVar.zzo());
                                zzM(t, zzx);
                                break;
                            case 4:
                                zzxy.zzq(t, zzC & 1048575, zzwwVar.zzg());
                                zzM(t, zzx);
                                break;
                            case 5:
                                zzxy.zzr(t, zzC & 1048575, zzwwVar.zzk());
                                zzM(t, zzx);
                                break;
                            case 6:
                                zzxy.zzq(t, zzC & 1048575, zzwwVar.zzf());
                                zzM(t, zzx);
                                break;
                            case 7:
                                zzxy.zzm(t, zzC & 1048575, zzwwVar.zzS());
                                zzM(t, zzx);
                                break;
                            case 8:
                                zzL(t, zzC, zzwwVar);
                                zzM(t, zzx);
                                break;
                            case 9:
                                if (zzQ(t, zzx)) {
                                    long j = zzC & 1048575;
                                    zzxy.zzs(t, j, zzvi.zzg(zzxy.zzf(t, j), zzwwVar.zzu(zzF(zzx), zzujVar)));
                                    break;
                                } else {
                                    zzxy.zzs(t, zzC & 1048575, zzwwVar.zzu(zzF(zzx), zzujVar));
                                    zzM(t, zzx);
                                    break;
                                }
                            case 10:
                                zzxy.zzs(t, zzC & 1048575, zzwwVar.zzq());
                                zzM(t, zzx);
                                break;
                            case 11:
                                zzxy.zzq(t, zzC & 1048575, zzwwVar.zzj());
                                zzM(t, zzx);
                                break;
                            case 12:
                                int zze = zzwwVar.zze();
                                zzvd zzE = zzE(zzx);
                                if (zzE != null && !zzE.zza(zze)) {
                                    obj = zzwz.zzD(zzc, zze, obj, zzxoVar);
                                    break;
                                }
                                zzxy.zzq(t, zzC & 1048575, zze);
                                zzM(t, zzx);
                                break;
                            case 13:
                                zzxy.zzq(t, zzC & 1048575, zzwwVar.zzh());
                                zzM(t, zzx);
                                break;
                            case 14:
                                zzxy.zzr(t, zzC & 1048575, zzwwVar.zzm());
                                zzM(t, zzx);
                                break;
                            case 15:
                                zzxy.zzq(t, zzC & 1048575, zzwwVar.zzi());
                                zzM(t, zzx);
                                break;
                            case 16:
                                zzxy.zzr(t, zzC & 1048575, zzwwVar.zzn());
                                zzM(t, zzx);
                                break;
                            case 17:
                                if (zzQ(t, zzx)) {
                                    long j2 = zzC & 1048575;
                                    zzxy.zzs(t, j2, zzvi.zzg(zzxy.zzf(t, j2), zzwwVar.zzs(zzF(zzx), zzujVar)));
                                    break;
                                } else {
                                    zzxy.zzs(t, zzC & 1048575, zzwwVar.zzs(zzF(zzx), zzujVar));
                                    zzM(t, zzx);
                                    break;
                                }
                            case 18:
                                zzwwVar.zzA(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case 19:
                                zzwwVar.zzE(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case 20:
                                zzwwVar.zzH(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case 21:
                                zzwwVar.zzR(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case 22:
                                zzwwVar.zzG(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case 23:
                                zzwwVar.zzD(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case 24:
                                zzwwVar.zzC(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                                zzwwVar.zzy(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                                if (zzP(zzC)) {
                                    zzwwVar.zzP(this.zzn.zza(t, zzC & 1048575));
                                    break;
                                } else {
                                    zzwwVar.zzN(this.zzn.zza(t, zzC & 1048575));
                                    break;
                                }
                            case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                                zzwwVar.zzI(this.zzn.zza(t, zzC & 1048575), zzF(zzx), zzujVar);
                                break;
                            case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                                zzwwVar.zzz(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                                zzwwVar.zzQ(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                                List<Integer> zza2 = this.zzn.zza(t, zzC & 1048575);
                                zzwwVar.zzB(zza2);
                                obj = zzwz.zzC(zzc, zza2, zzE(zzx), obj, zzxoVar);
                                break;
                            case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                                zzwwVar.zzJ(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case 32:
                                zzwwVar.zzK(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                                zzwwVar.zzL(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                                zzwwVar.zzM(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                                zzwwVar.zzA(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                                zzwwVar.zzE(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                                zzwwVar.zzH(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                                zzwwVar.zzR(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                                zzwwVar.zzG(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                                zzwwVar.zzD(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                                zzwwVar.zzC(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                                zzwwVar.zzy(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                                zzwwVar.zzQ(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                                List<Integer> zza3 = this.zzn.zza(t, zzC & 1048575);
                                zzwwVar.zzB(zza3);
                                obj = zzwz.zzC(zzc, zza3, zzE(zzx), obj, zzxoVar);
                                break;
                            case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                                zzwwVar.zzJ(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                                zzwwVar.zzK(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                                zzwwVar.zzL(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                                zzwwVar.zzM(this.zzn.zza(t, zzC & 1048575));
                                break;
                            case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                                zzwwVar.zzF(this.zzn.zza(t, zzC & 1048575), zzF(zzx), zzujVar);
                                break;
                            case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                                Object zzH = zzH(zzx);
                                long zzC2 = zzC(zzx) & 1048575;
                                Object zzf = zzxy.zzf(t, zzC2);
                                if (zzf != null) {
                                    if (zzwf.zzb(zzf)) {
                                        Object zzb2 = zzwe.zza().zzb();
                                        zzwf.zzc(zzb2, zzf);
                                        zzxy.zzs(t, zzC2, zzb2);
                                        zzf = zzb2;
                                    }
                                } else {
                                    zzf = zzwe.zza().zzb();
                                    zzxy.zzs(t, zzC2, zzf);
                                }
                                zzwe zzweVar = (zzwe) zzf;
                                zzwd zzwdVar = (zzwd) zzH;
                                throw null;
                                break;
                            case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                                zzxy.zzs(t, zzC & 1048575, Double.valueOf(zzwwVar.zza()));
                                zzN(t, zzc, zzx);
                                break;
                            case 52:
                                zzxy.zzs(t, zzC & 1048575, Float.valueOf(zzwwVar.zzb()));
                                zzN(t, zzc, zzx);
                                break;
                            case 53:
                                zzxy.zzs(t, zzC & 1048575, Long.valueOf(zzwwVar.zzl()));
                                zzN(t, zzc, zzx);
                                break;
                            case 54:
                                zzxy.zzs(t, zzC & 1048575, Long.valueOf(zzwwVar.zzo()));
                                zzN(t, zzc, zzx);
                                break;
                            case 55:
                                zzxy.zzs(t, zzC & 1048575, Integer.valueOf(zzwwVar.zzg()));
                                zzN(t, zzc, zzx);
                                break;
                            case 56:
                                zzxy.zzs(t, zzC & 1048575, Long.valueOf(zzwwVar.zzk()));
                                zzN(t, zzc, zzx);
                                break;
                            case 57:
                                zzxy.zzs(t, zzC & 1048575, Integer.valueOf(zzwwVar.zzf()));
                                zzN(t, zzc, zzx);
                                break;
                            case 58:
                                zzxy.zzs(t, zzC & 1048575, Boolean.valueOf(zzwwVar.zzS()));
                                zzN(t, zzc, zzx);
                                break;
                            case 59:
                                zzL(t, zzC, zzwwVar);
                                zzN(t, zzc, zzx);
                                break;
                            case 60:
                                if (zzT(t, zzc, zzx)) {
                                    long j3 = zzC & 1048575;
                                    zzxy.zzs(t, j3, zzvi.zzg(zzxy.zzf(t, j3), zzwwVar.zzu(zzF(zzx), zzujVar)));
                                } else {
                                    zzxy.zzs(t, zzC & 1048575, zzwwVar.zzu(zzF(zzx), zzujVar));
                                    zzM(t, zzx);
                                }
                                zzN(t, zzc, zzx);
                                break;
                            case 61:
                                zzxy.zzs(t, zzC & 1048575, zzwwVar.zzq());
                                zzN(t, zzc, zzx);
                                break;
                            case 62:
                                zzxy.zzs(t, zzC & 1048575, Integer.valueOf(zzwwVar.zzj()));
                                zzN(t, zzc, zzx);
                                break;
                            case 63:
                                int zze2 = zzwwVar.zze();
                                zzvd zzE2 = zzE(zzx);
                                if (zzE2 != null && !zzE2.zza(zze2)) {
                                    obj = zzwz.zzD(zzc, zze2, obj, zzxoVar);
                                    break;
                                }
                                zzxy.zzs(t, zzC & 1048575, Integer.valueOf(zze2));
                                zzN(t, zzc, zzx);
                                break;
                            case 64:
                                zzxy.zzs(t, zzC & 1048575, Integer.valueOf(zzwwVar.zzh()));
                                zzN(t, zzc, zzx);
                                break;
                            case 65:
                                zzxy.zzs(t, zzC & 1048575, Long.valueOf(zzwwVar.zzm()));
                                zzN(t, zzc, zzx);
                                break;
                            case 66:
                                zzxy.zzs(t, zzC & 1048575, Integer.valueOf(zzwwVar.zzi()));
                                zzN(t, zzc, zzx);
                                break;
                            case 67:
                                zzxy.zzs(t, zzC & 1048575, Long.valueOf(zzwwVar.zzn()));
                                zzN(t, zzc, zzx);
                                break;
                            case 68:
                                zzxy.zzs(t, zzC & 1048575, zzwwVar.zzs(zzF(zzx), zzujVar));
                                zzN(t, zzc, zzx);
                                break;
                            default:
                                if (obj == null) {
                                    obj = zzxoVar.zzf();
                                }
                                if (!zzxoVar.zzp(obj, zzwwVar)) {
                                    for (int i = this.zzl; i < this.zzm; i++) {
                                        zzG(t, this.zzk[i], obj, zzxoVar);
                                    }
                                    zzxoVar.zzn(t, obj);
                                    return;
                                }
                                break;
                        }
                    } catch (zzvj unused) {
                        zzxoVar.zzq(zzwwVar);
                        if (obj == null) {
                            obj = zzxoVar.zzc(t);
                        }
                        if (!zzxoVar.zzp(obj, zzwwVar)) {
                            for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                                zzG(t, this.zzk[i2], obj, zzxoVar);
                            }
                            if (obj != null) {
                                zzxoVar.zzn(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i3 = this.zzl; i3 < this.zzm; i3++) {
                        zzG(t, this.zzk[i3], obj, zzxoVar);
                    }
                    if (obj != null) {
                        zzxoVar.zzn(t, obj);
                        return;
                    }
                    return;
                } else {
                    Object zzd = !this.zzh ? null : zzukVar.zzd(zzujVar, this.zzg, zzc);
                    if (zzd != null) {
                        if (zzuoVar == null) {
                            zzuoVar = zzukVar.zzc(t);
                        }
                        zzuo<?> zzuoVar2 = zzuoVar;
                        obj = zzukVar.zze(zzwwVar, zzd, zzujVar, zzuoVar2, obj, zzxoVar);
                        zzuoVar = zzuoVar2;
                    } else {
                        zzxoVar.zzq(zzwwVar);
                        if (obj == null) {
                            obj = zzxoVar.zzc(t);
                        }
                        if (!zzxoVar.zzp(obj, zzwwVar)) {
                            for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                                zzG(t, this.zzk[i4], obj, zzxoVar);
                            }
                            if (obj != null) {
                                zzxoVar.zzn(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                    zzG(t, this.zzk[i5], obj, zzxoVar);
                }
                if (obj != null) {
                    zzxoVar.zzn(t, obj);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzi(T t, byte[] bArr, int i, int i2, zzsl zzslVar) throws IOException {
        if (this.zzj) {
            zzv(t, bArr, i, i2, zzslVar);
        } else {
            zzc(t, bArr, i, i2, 0, zzslVar);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final boolean zzj(T t, T t2) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzC = zzC(i);
            long j = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    if (zzO(t, t2, i) && Double.doubleToLongBits(zzxy.zza(t, j)) == Double.doubleToLongBits(zzxy.zza(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(t, t2, i) && Float.floatToIntBits(zzxy.zzb(t, j)) == Float.floatToIntBits(zzxy.zzb(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(t, t2, i) && zzxy.zzd(t, j) == zzxy.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(t, t2, i) && zzxy.zzd(t, j) == zzxy.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(t, t2, i) && zzxy.zzc(t, j) == zzxy.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(t, t2, i) && zzxy.zzd(t, j) == zzxy.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(t, t2, i) && zzxy.zzc(t, j) == zzxy.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(t, t2, i) && zzxy.zzw(t, j) == zzxy.zzw(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(t, t2, i) && zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(t, t2, i) && zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(t, t2, i) && zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(t, t2, i) && zzxy.zzc(t, j) == zzxy.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(t, t2, i) && zzxy.zzc(t, j) == zzxy.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(t, t2, i) && zzxy.zzc(t, j) == zzxy.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(t, t2, i) && zzxy.zzd(t, j) == zzxy.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(t, t2, i) && zzxy.zzc(t, j) == zzxy.zzc(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(t, t2, i) && zzxy.zzd(t, j) == zzxy.zzd(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(t, t2, i) && zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                case 32:
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                    zzH = zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j));
                    break;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    zzH = zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j));
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzz = zzz(i) & 1048575;
                    if (zzxy.zzc(t, zzz) == zzxy.zzc(t2, zzz) && zzwz.zzH(zzxy.zzf(t, j), zzxy.zzf(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (this.zzo.zzd(t).equals(this.zzo.zzd(t2))) {
            if (this.zzh) {
                return this.zzp.zzb(t).equals(this.zzp.zzb(t2));
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.gtm.zzwx
    public final boolean zzk(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int zzC = zzC(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzC) != 0 && !zzR(t, i6, i, i2, i10)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB == 60 || zzB == 68) {
                        if (zzT(t, i7, i6) && !zzS(t, zzC, zzF(i6))) {
                            return false;
                        }
                    } else if (zzB != 49) {
                        if (zzB == 50 && !((zzwe) zzxy.zzf(t, zzC & 1048575)).isEmpty()) {
                            zzwd zzwdVar = (zzwd) zzH(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzxy.zzf(t, zzC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzwx zzF = zzF(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzF.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzR(t, i6, i, i2, i10) && !zzS(t, zzC, zzF(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.zzh || this.zzp.zzb(t).zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0507  */
    @Override // com.google.android.gms.internal.gtm.zzwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzn(T r13, com.google.android.gms.internal.gtm.zztp r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzwn.zzn(java.lang.Object, com.google.android.gms.internal.gtm.zztp):void");
    }
}
