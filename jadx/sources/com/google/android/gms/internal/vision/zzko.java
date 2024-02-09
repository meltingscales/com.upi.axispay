package com.google.android.gms.internal.vision;

import android.support.v4.media.session.IMediaSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzko<T> implements zzlc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzma.zzc();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzkk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzks zzo;
    private final zzju zzp;
    private final zzlu<?, ?> zzq;
    private final zziq<?> zzr;
    private final zzkh zzs;

    private zzko(int[] iArr, Object[] objArr, int i, int i2, zzkk zzkkVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzks zzksVar, zzju zzjuVar, zzlu<?, ?> zzluVar, zziq<?> zziqVar, zzkh zzkhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzkkVar instanceof zzjb;
        this.zzj = z;
        this.zzh = zziqVar != null && zziqVar.zza(zzkkVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzksVar;
        this.zzp = zzjuVar;
        this.zzq = zzluVar;
        this.zzr = zziqVar;
        this.zzg = zzkkVar;
        this.zzs = zzkhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0397  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.vision.zzko<T> zza(java.lang.Class<T> r33, com.google.android.gms.internal.vision.zzki r34, com.google.android.gms.internal.vision.zzks r35, com.google.android.gms.internal.vision.zzju r36, com.google.android.gms.internal.vision.zzlu<?, ?> r37, com.google.android.gms.internal.vision.zziq<?> r38, com.google.android.gms.internal.vision.zzkh r39) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Class, com.google.android.gms.internal.vision.zzki, com.google.android.gms.internal.vision.zzks, com.google.android.gms.internal.vision.zzju, com.google.android.gms.internal.vision.zzlu, com.google.android.gms.internal.vision.zziq, com.google.android.gms.internal.vision.zzkh):com.google.android.gms.internal.vision.zzko");
    }

    private final zzjg zzc(int i) {
        return (zzjg) this.zzd[((i / 3) << 1) + 1];
    }

    private static zzlx zze(Object obj) {
        zzjb zzjbVar = (zzjb) obj;
        zzlx zzlxVar = zzjbVar.zzb;
        if (zzlxVar == zzlx.zza()) {
            zzlx zzb2 = zzlx.zzb();
            zzjbVar.zzb = zzb2;
            return zzb2;
        }
        return zzlxVar;
    }

    private static boolean zzf(int i) {
        return (i & 536870912) != 0;
    }

    private static <T> boolean zzf(T t, long j) {
        return ((Boolean) zzma.zzf(t, j)).booleanValue();
    }

    private final int zzg(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, 0);
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zzb(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzd = zzd(i);
            long j = 1048575 & zzd;
            int i2 = this.zzc[i];
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza(t, j, zzma.zze(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zzd(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zzb(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zzb(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zza(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zzb(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zza(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza(t, j, zzma.zzc(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza(t, j, zzma.zzf(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza(t, j, zzma.zzf(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zza(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zza(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zza(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zzb(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zza(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zzb(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
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
                    this.zzp.zza(t, t2, j);
                    break;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    zzle.zza(this.zzs, t, t2, j);
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
                    if (zza((zzko<T>) t2, i2, i)) {
                        zzma.zza(t, j, zzma.zzf(t2, j));
                        zzb((zzko<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza((zzko<T>) t2, i2, i)) {
                        zzma.zza(t, j, zzma.zzf(t2, j));
                        zzb((zzko<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzle.zza(this.zzq, t, t2);
        if (this.zzh) {
            zzle.zza(this.zzr, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.vision.zzlc] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.vision.zzlc] */
    @Override // com.google.android.gms.internal.vision.zzlc
    public final boolean zzd(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i5 >= this.zzm) {
                return !this.zzh || this.zzr.zza(t).zzf();
            }
            int i6 = this.zzl[i5];
            int i7 = this.zzc[i6];
            int zzd = zzd(i6);
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
            if (((268435456 & zzd) != 0) && !zza((zzko<T>) t, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & zzd) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zza((zzko<T>) t, i7, i6) && !zza(t, zzd, zza(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzc = this.zzs.zzc(zzma.zzf(t, zzd & 1048575));
                            if (!zzc.isEmpty()) {
                                if (this.zzs.zzb(zzb(i6)).zzc.zza() == zzmo.MESSAGE) {
                                    zzlc<T> zzlcVar = 0;
                                    Iterator<?> it = zzc.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzlcVar == null) {
                                            zzlcVar = zzky.zza().zza((Class) next.getClass());
                                        }
                                        boolean zzd2 = zzlcVar.zzd(next);
                                        zzlcVar = zzlcVar;
                                        if (!zzd2) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzma.zzf(t, zzd & 1048575);
                if (!list.isEmpty()) {
                    ?? zza2 = zza(i6);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        } else if (!zza2.zzd(list.get(i12))) {
                            z = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (zza((zzko<T>) t, i6, i, i2, i10) && !zza(t, zzd, zza(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zzc(T t) {
        int i;
        int i2 = this.zzm;
        while (true) {
            i = this.zzn;
            if (i2 >= i) {
                break;
            }
            long zzd = zzd(this.zzl[i2]) & 1048575;
            Object zzf = zzma.zzf(t, zzd);
            if (zzf != null) {
                zzma.zza(t, zzd, this.zzs.zze(zzf));
            }
            i2++;
        }
        int length = this.zzl.length;
        while (i < length) {
            this.zzp.zzb(t, this.zzl[i]);
            i++;
        }
        this.zzq.zzd(t);
        if (this.zzh) {
            this.zzr.zzc(t);
        }
    }

    private final int zze(int i) {
        return this.zzc[i + 2];
    }

    private static <T> long zze(T t, long j) {
        return ((Long) zzma.zzf(t, j)).longValue();
    }

    private static <T> float zzc(T t, long j) {
        return ((Float) zzma.zzf(t, j)).floatValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzko<T>) t, i) == zza((zzko<T>) t2, i);
    }

    private final int zzd(int i) {
        return this.zzc[i + 1];
    }

    private static <T> int zzd(T t, long j) {
        return ((Integer) zzma.zzf(t, j)).intValue();
    }

    private final void zzb(T t, T t2, int i) {
        int zzd = zzd(i);
        int i2 = this.zzc[i];
        long j = zzd & 1048575;
        if (zza((zzko<T>) t2, i2, i)) {
            Object zzf = zza((zzko<T>) t, i2, i) ? zzma.zzf(t, j) : null;
            Object zzf2 = zzma.zzf(t2, j);
            if (zzf != null && zzf2 != null) {
                zzma.zza(t, j, zzjf.zza(zzf, zzf2));
                zzb((zzko<T>) t, i2, i);
            } else if (zzf2 != null) {
                zzma.zza(t, j, zzf2);
                zzb((zzko<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.vision.zzlc
    public final int zzb(T t) {
        int i;
        int i2;
        int i3;
        long j;
        int zzd;
        int zzb2;
        int zzj;
        int zzh;
        int zzi;
        int zze;
        int zzg;
        int zzb3;
        int zzi2;
        int zze2;
        int zzg2;
        int i4 = 267386880;
        int i5 = 1048575;
        int i6 = 1;
        int i7 = 0;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i8 = 0;
            int i9 = 0;
            while (i8 < this.zzc.length) {
                int zzd2 = zzd(i8);
                int i10 = (zzd2 & i4) >>> 20;
                int i11 = this.zzc[i8];
                long j2 = zzd2 & 1048575;
                if (i10 >= zziv.zza.zza() && i10 <= zziv.zzb.zza()) {
                    int i12 = this.zzc[i8 + 2];
                }
                switch (i10) {
                    case 0:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzb(i11, 0.0d);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 1:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzb(i11, 0.0f);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 2:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzd(i11, zzma.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 3:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zze(i11, zzma.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 4:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzf(i11, zzma.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 5:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzg(i11, 0L);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 6:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzi(i11, 0);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 7:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzb(i11, true);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 8:
                        if (zza((zzko<T>) t, i8)) {
                            Object zzf = zzma.zzf(t, j2);
                            if (zzf instanceof zzht) {
                                zzb3 = zzii.zzc(i11, (zzht) zzf);
                                break;
                            } else {
                                zzb3 = zzii.zzb(i11, (String) zzf);
                                break;
                            }
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 9:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzle.zza(i11, zzma.zzf(t, j2), zza(i8));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 10:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzc(i11, (zzht) zzma.zzf(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 11:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzg(i11, zzma.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 12:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzk(i11, zzma.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 13:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzj(i11, 0);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 14:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzh(i11, 0L);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 15:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzh(i11, zzma.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 16:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzf(i11, zzma.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 17:
                        if (zza((zzko<T>) t, i8)) {
                            zzb3 = zzii.zzc(i11, (zzkk) zzma.zzf(t, j2), zza(i8));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 18:
                        zzb3 = zzle.zzi(i11, zza(t, j2), false);
                        break;
                    case 19:
                        zzb3 = zzle.zzh(i11, zza(t, j2), false);
                        break;
                    case 20:
                        zzb3 = zzle.zza(i11, (List<Long>) zza(t, j2), false);
                        break;
                    case 21:
                        zzb3 = zzle.zzb(i11, (List<Long>) zza(t, j2), false);
                        break;
                    case 22:
                        zzb3 = zzle.zze(i11, zza(t, j2), false);
                        break;
                    case 23:
                        zzb3 = zzle.zzi(i11, zza(t, j2), false);
                        break;
                    case 24:
                        zzb3 = zzle.zzh(i11, zza(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                        zzb3 = zzle.zzj(i11, zza(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                        zzb3 = zzle.zza(i11, zza(t, j2));
                        break;
                    case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                        zzb3 = zzle.zza(i11, zza(t, j2), zza(i8));
                        break;
                    case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                        zzb3 = zzle.zzb(i11, zza(t, j2));
                        break;
                    case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                        zzb3 = zzle.zzf(i11, zza(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                        zzb3 = zzle.zzd(i11, zza(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                        zzb3 = zzle.zzh(i11, zza(t, j2), false);
                        break;
                    case 32:
                        zzb3 = zzle.zzi(i11, zza(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                        zzb3 = zzle.zzg(i11, zza(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                        zzb3 = zzle.zzc(i11, zza(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                        zzi2 = zzle.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                        zzi2 = zzle.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                        zzi2 = zzle.zza((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                        zzi2 = zzle.zzb((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                        zzi2 = zzle.zze((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                        zzi2 = zzle.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                        zzi2 = zzle.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                        zzi2 = zzle.zzj((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                        zzi2 = zzle.zzf((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                        zzi2 = zzle.zzd((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                        zzi2 = zzle.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                        zzi2 = zzle.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                        zzi2 = zzle.zzg((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                        zzi2 = zzle.zzc((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            zze2 = zzii.zze(i11);
                            zzg2 = zzii.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                        zzb3 = zzle.zzb(i11, (List<zzkk>) zza(t, j2), zza(i8));
                        break;
                    case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                        zzb3 = this.zzs.zza(i11, zzma.zzf(t, j2), zzb(i8));
                        break;
                    case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzb(i11, 0.0d);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 52:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzb(i11, 0.0f);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 53:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzd(i11, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 54:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zze(i11, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 55:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzf(i11, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 56:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzg(i11, 0L);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 57:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzi(i11, 0);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 58:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzb(i11, true);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 59:
                        if (zza((zzko<T>) t, i11, i8)) {
                            Object zzf2 = zzma.zzf(t, j2);
                            if (zzf2 instanceof zzht) {
                                zzb3 = zzii.zzc(i11, (zzht) zzf2);
                                break;
                            } else {
                                zzb3 = zzii.zzb(i11, (String) zzf2);
                                break;
                            }
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 60:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzle.zza(i11, zzma.zzf(t, j2), zza(i8));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 61:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzc(i11, (zzht) zzma.zzf(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 62:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzg(i11, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 63:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzk(i11, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 64:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzj(i11, 0);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 65:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzh(i11, 0L);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 66:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzh(i11, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 67:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzf(i11, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 68:
                        if (zza((zzko<T>) t, i11, i8)) {
                            zzb3 = zzii.zzc(i11, (zzkk) zzma.zzf(t, j2), zza(i8));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    default:
                        i8 += 3;
                        i4 = 267386880;
                }
                i9 += zzb3;
                i8 += 3;
                i4 = 267386880;
            }
            return i9 + zza((zzlu) this.zzq, (Object) t);
        }
        Unsafe unsafe2 = zzb;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < this.zzc.length) {
            int zzd3 = zzd(i14);
            int[] iArr = this.zzc;
            int i17 = iArr[i14];
            int i18 = (zzd3 & 267386880) >>> 20;
            if (i18 <= 17) {
                int i19 = iArr[i14 + 2];
                int i20 = i19 & i5;
                i = i6 << (i19 >>> 20);
                if (i20 != i13) {
                    i16 = unsafe2.getInt(t, i20);
                    i13 = i20;
                }
            } else {
                i = 0;
            }
            long j3 = zzd3 & i5;
            switch (i18) {
                case 0:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    if ((i16 & i) != 0) {
                        i15 += zzii.zzb(i17, 0.0d);
                        continue;
                        i14 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    break;
                case 1:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    if ((i16 & i) != 0) {
                        i15 += zzii.zzb(i17, 0.0f);
                        break;
                    }
                    break;
                case 2:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    if ((i & i16) != 0) {
                        zzd = zzii.zzd(i17, unsafe2.getLong(t, j3));
                        i15 += zzd;
                        break;
                    }
                    break;
                case 3:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    if ((i & i16) != 0) {
                        zzd = zzii.zze(i17, unsafe2.getLong(t, j3));
                        i15 += zzd;
                        break;
                    }
                    break;
                case 4:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    if ((i & i16) != 0) {
                        zzd = zzii.zzf(i17, unsafe2.getInt(t, j3));
                        i15 += zzd;
                        break;
                    }
                    break;
                case 5:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    if ((i16 & i) != 0) {
                        zzd = zzii.zzg(i17, 0L);
                        i15 += zzd;
                        break;
                    }
                    break;
                case 6:
                    i2 = 1;
                    i3 = 0;
                    if ((i16 & i) != 0) {
                        i15 += zzii.zzi(i17, 0);
                    }
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 7:
                    if ((i16 & i) != 0) {
                        i2 = 1;
                        i15 += zzii.zzb(i17, true);
                        i3 = 0;
                        j = 0;
                        i14 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 8:
                    if ((i16 & i) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzht) {
                            zzb2 = zzii.zzc(i17, (zzht) object);
                        } else {
                            zzb2 = zzii.zzb(i17, (String) object);
                        }
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 9:
                    if ((i16 & i) != 0) {
                        zzb2 = zzle.zza(i17, unsafe2.getObject(t, j3), zza(i14));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 10:
                    if ((i16 & i) != 0) {
                        zzb2 = zzii.zzc(i17, (zzht) unsafe2.getObject(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 11:
                    if ((i16 & i) != 0) {
                        zzb2 = zzii.zzg(i17, unsafe2.getInt(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 12:
                    if ((i16 & i) != 0) {
                        zzb2 = zzii.zzk(i17, unsafe2.getInt(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 13:
                    if ((i16 & i) != 0) {
                        zzj = zzii.zzj(i17, 0);
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 14:
                    if ((i16 & i) != 0) {
                        zzb2 = zzii.zzh(i17, 0L);
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 15:
                    if ((i16 & i) != 0) {
                        zzb2 = zzii.zzh(i17, unsafe2.getInt(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 16:
                    if ((i16 & i) != 0) {
                        zzb2 = zzii.zzf(i17, unsafe2.getLong(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 17:
                    if ((i16 & i) != 0) {
                        zzb2 = zzii.zzc(i17, (zzkk) unsafe2.getObject(t, j3), zza(i14));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 18:
                    zzb2 = zzle.zzi(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += zzb2;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 19:
                    i3 = 0;
                    zzh = zzle.zzh(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += zzh;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 20:
                    i3 = 0;
                    zzh = zzle.zza(i17, (List<Long>) unsafe2.getObject(t, j3), false);
                    i15 += zzh;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 21:
                    i3 = 0;
                    zzh = zzle.zzb(i17, (List<Long>) unsafe2.getObject(t, j3), false);
                    i15 += zzh;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 22:
                    i3 = 0;
                    zzh = zzle.zze(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += zzh;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 23:
                    i3 = 0;
                    zzh = zzle.zzi(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += zzh;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 24:
                    i3 = 0;
                    zzh = zzle.zzh(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += zzh;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    i3 = 0;
                    zzh = zzle.zzj(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += zzh;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    zzb2 = zzle.zza(i17, (List) unsafe2.getObject(t, j3));
                    i15 += zzb2;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    zzb2 = zzle.zza(i17, (List<?>) unsafe2.getObject(t, j3), zza(i14));
                    i15 += zzb2;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    zzb2 = zzle.zzb(i17, (List) unsafe2.getObject(t, j3));
                    i15 += zzb2;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    zzb2 = zzle.zzf(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += zzb2;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    i3 = 0;
                    zzh = zzle.zzd(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += zzh;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    i3 = 0;
                    zzh = zzle.zzh(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += zzh;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 32:
                    i3 = 0;
                    zzh = zzle.zzi(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += zzh;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    i3 = 0;
                    zzh = zzle.zzg(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += zzh;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    i3 = 0;
                    zzh = zzle.zzc(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += zzh;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    zzi = zzle.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    zzi = zzle.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    zzi = zzle.zza((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    zzi = zzle.zzb((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    zzi = zzle.zze((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    zzi = zzle.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    zzi = zzle.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    zzi = zzle.zzj((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    zzi = zzle.zzf((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    zzi = zzle.zzd((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    zzi = zzle.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    zzi = zzle.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    zzi = zzle.zzg((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    zzi = zzle.zzc((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        zze = zzii.zze(i17);
                        zzg = zzii.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                    zzb2 = zzle.zzb(i17, (List) unsafe2.getObject(t, j3), zza(i14));
                    i15 += zzb2;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    zzb2 = this.zzs.zza(i17, unsafe2.getObject(t, j3), zzb(i14));
                    i15 += zzb2;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzii.zzb(i17, 0.0d);
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 52:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzj = zzii.zzb(i17, 0.0f);
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 53:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzii.zzd(i17, zze(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 54:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzii.zze(i17, zze(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 55:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzii.zzf(i17, zzd(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 56:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzii.zzg(i17, 0L);
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 57:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzj = zzii.zzi(i17, 0);
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 58:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzj = zzii.zzb(i17, true);
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 59:
                    if (zza((zzko<T>) t, i17, i14)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzht) {
                            zzb2 = zzii.zzc(i17, (zzht) object2);
                        } else {
                            zzb2 = zzii.zzb(i17, (String) object2);
                        }
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 60:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzle.zza(i17, unsafe2.getObject(t, j3), zza(i14));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 61:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzii.zzc(i17, (zzht) unsafe2.getObject(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 62:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzii.zzg(i17, zzd(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 63:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzii.zzk(i17, zzd(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 64:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzj = zzii.zzj(i17, 0);
                        i15 += zzj;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 65:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzii.zzh(i17, 0L);
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 66:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzii.zzh(i17, zzd(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 67:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzii.zzf(i17, zze(t, j3));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 68:
                    if (zza((zzko<T>) t, i17, i14)) {
                        zzb2 = zzii.zzc(i17, (zzkk) unsafe2.getObject(t, j3), zza(i14));
                        i15 += zzb2;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                default:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
            }
            i14 += 3;
            i6 = i2;
            i7 = i3;
            i5 = 1048575;
        }
        int i21 = i7;
        int zza2 = i15 + zza((zzlu) this.zzq, (Object) t);
        if (this.zzh) {
            zziu<?> zza3 = this.zzr.zza(t);
            for (int i22 = i21; i22 < zza3.zza.zzc(); i22++) {
                Map.Entry<?, Object> zzb4 = zza3.zza.zzb(i22);
                i21 += zziu.zzc((zziw) zzb4.getKey(), zzb4.getValue());
            }
            for (Map.Entry<?, Object> entry : zza3.zza.zzd()) {
                i21 += zziu.zzc((zziw) entry.getKey(), entry.getValue());
            }
            return zza2 + i21;
        }
        return zza2;
    }

    private static Field zza(Class<?> cls, String str) {
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

    @Override // com.google.android.gms.internal.vision.zzlc
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zzma.zze(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zzma.zze(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.vision.zzle.zza(com.google.android.gms.internal.vision.zzma.zzf(r10, r6), com.google.android.gms.internal.vision.zzma.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (com.google.android.gms.internal.vision.zzle.zza(com.google.android.gms.internal.vision.zzma.zzf(r10, r6), com.google.android.gms.internal.vision.zzma.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (com.google.android.gms.internal.vision.zzma.zzb(r10, r6) == com.google.android.gms.internal.vision.zzma.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (com.google.android.gms.internal.vision.zzma.zza(r10, r6) == com.google.android.gms.internal.vision.zzma.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (com.google.android.gms.internal.vision.zzma.zzb(r10, r6) == com.google.android.gms.internal.vision.zzma.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (com.google.android.gms.internal.vision.zzma.zza(r10, r6) == com.google.android.gms.internal.vision.zzma.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (com.google.android.gms.internal.vision.zzma.zza(r10, r6) == com.google.android.gms.internal.vision.zzma.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (com.google.android.gms.internal.vision.zzma.zza(r10, r6) == com.google.android.gms.internal.vision.zzma.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (com.google.android.gms.internal.vision.zzle.zza(com.google.android.gms.internal.vision.zzma.zzf(r10, r6), com.google.android.gms.internal.vision.zzma.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (com.google.android.gms.internal.vision.zzle.zza(com.google.android.gms.internal.vision.zzma.zzf(r10, r6), com.google.android.gms.internal.vision.zzma.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (com.google.android.gms.internal.vision.zzle.zza(com.google.android.gms.internal.vision.zzma.zzf(r10, r6), com.google.android.gms.internal.vision.zzma.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (com.google.android.gms.internal.vision.zzma.zzc(r10, r6) == com.google.android.gms.internal.vision.zzma.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (com.google.android.gms.internal.vision.zzma.zza(r10, r6) == com.google.android.gms.internal.vision.zzma.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (com.google.android.gms.internal.vision.zzma.zzb(r10, r6) == com.google.android.gms.internal.vision.zzma.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (com.google.android.gms.internal.vision.zzma.zza(r10, r6) == com.google.android.gms.internal.vision.zzma.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (com.google.android.gms.internal.vision.zzma.zzb(r10, r6) == com.google.android.gms.internal.vision.zzma.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
        if (com.google.android.gms.internal.vision.zzma.zzb(r10, r6) == com.google.android.gms.internal.vision.zzma.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zzma.zzd(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zzma.zzd(r11, r6))) goto L85;
     */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final int zza(T t) {
        int i;
        int zza2;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzd = zzd(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzd;
            int i5 = 37;
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza2 = zzjf.zza(Double.doubleToLongBits(zzma.zze(t, j)));
                    i2 = i + zza2;
                    break;
                case 1:
                    i = i2 * 53;
                    zza2 = Float.floatToIntBits(zzma.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 2:
                    i = i2 * 53;
                    zza2 = zzjf.zza(zzma.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 3:
                    i = i2 * 53;
                    zza2 = zzjf.zza(zzma.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 4:
                    i = i2 * 53;
                    zza2 = zzma.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 5:
                    i = i2 * 53;
                    zza2 = zzjf.zza(zzma.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 6:
                    i = i2 * 53;
                    zza2 = zzma.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 7:
                    i = i2 * 53;
                    zza2 = zzjf.zza(zzma.zzc(t, j));
                    i2 = i + zza2;
                    break;
                case 8:
                    i = i2 * 53;
                    zza2 = ((String) zzma.zzf(t, j)).hashCode();
                    i2 = i + zza2;
                    break;
                case 9:
                    Object zzf = zzma.zzf(t, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zza2 = zzma.zzf(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 11:
                    i = i2 * 53;
                    zza2 = zzma.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 12:
                    i = i2 * 53;
                    zza2 = zzma.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 13:
                    i = i2 * 53;
                    zza2 = zzma.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 14:
                    i = i2 * 53;
                    zza2 = zzjf.zza(zzma.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 15:
                    i = i2 * 53;
                    zza2 = zzma.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 16:
                    i = i2 * 53;
                    zza2 = zzjf.zza(zzma.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 17:
                    Object zzf2 = zzma.zzf(t, j);
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
                    zza2 = zzma.zzf(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    i = i2 * 53;
                    zza2 = zzma.zzf(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(Double.doubleToLongBits(zzb(t, j)));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = Float.floatToIntBits(zzc(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(zzf(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = ((String) zzma.zzf(t, j)).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzma.zzf(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzma.zzf(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjf.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzko<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzma.zzf(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzq.zzb(t).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzr.zza(t).hashCode() : hashCode;
    }

    private final void zza(T t, T t2, int i) {
        long zzd = zzd(i) & 1048575;
        if (zza((zzko<T>) t2, i)) {
            Object zzf = zzma.zzf(t, zzd);
            Object zzf2 = zzma.zzf(t2, zzd);
            if (zzf != null && zzf2 != null) {
                zzma.zza(t, zzd, zzjf.zza(zzf, zzf2));
                zzb((zzko<T>) t, i);
            } else if (zzf2 != null) {
                zzma.zza(t, zzd, zzf2);
                zzb((zzko<T>) t, i);
            }
        }
    }

    private static <UT, UB> int zza(zzlu<UT, UB> zzluVar, T t) {
        return zzluVar.zzf(zzluVar.zzb(t));
    }

    private static List<?> zza(Object obj, long j) {
        return (List) zzma.zzf(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r14, com.google.android.gms.internal.vision.zzmr r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Object, com.google.android.gms.internal.vision.zzmr):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x048b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(T r18, com.google.android.gms.internal.vision.zzmr r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zzb(java.lang.Object, com.google.android.gms.internal.vision.zzmr):void");
    }

    private final Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private static <T> double zzb(T t, long j) {
        return ((Double) zzma.zzf(t, j)).doubleValue();
    }

    private final void zzb(T t, int i) {
        int zze = zze(i);
        long j = 1048575 & zze;
        if (j == 1048575) {
            return;
        }
        zzma.zza((Object) t, j, (1 << (zze >>> 20)) | zzma.zza(t, j));
    }

    private final void zzb(T t, int i, int i2) {
        zzma.zza((Object) t, zze(i2) & 1048575, i);
    }

    private final int zzb(int i, int i2) {
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

    private final <K, V> void zza(zzmr zzmrVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzmrVar.zza(i, this.zzs.zzb(zzb(i2)), this.zzs.zzc(obj));
        }
    }

    private static <UT, UB> void zza(zzlu<UT, UB> zzluVar, T t, zzmr zzmrVar) throws IOException {
        zzluVar.zza((zzlu<UT, UB>) zzluVar.zzb(t), zzmrVar);
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zza(T t, zzld zzldVar, zzio zzioVar) throws IOException {
        Objects.requireNonNull(zzioVar);
        zzlu zzluVar = this.zzq;
        zziq<?> zziqVar = this.zzr;
        zziu<?> zziuVar = null;
        Object obj = null;
        while (true) {
            try {
                int zza2 = zzldVar.zza();
                int zzg = zzg(zza2);
                if (zzg >= 0) {
                    int zzd = zzd(zzg);
                    switch ((267386880 & zzd) >>> 20) {
                        case 0:
                            zzma.zza(t, zzd & 1048575, zzldVar.zzd());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 1:
                            zzma.zza((Object) t, zzd & 1048575, zzldVar.zze());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 2:
                            zzma.zza((Object) t, zzd & 1048575, zzldVar.zzg());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 3:
                            zzma.zza((Object) t, zzd & 1048575, zzldVar.zzf());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 4:
                            zzma.zza((Object) t, zzd & 1048575, zzldVar.zzh());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 5:
                            zzma.zza((Object) t, zzd & 1048575, zzldVar.zzi());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 6:
                            zzma.zza((Object) t, zzd & 1048575, zzldVar.zzj());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 7:
                            zzma.zza(t, zzd & 1048575, zzldVar.zzk());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 8:
                            zza(t, zzd, zzldVar);
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 9:
                            if (zza((zzko<T>) t, zzg)) {
                                long j = zzd & 1048575;
                                zzma.zza(t, j, zzjf.zza(zzma.zzf(t, j), zzldVar.zza(zza(zzg), zzioVar)));
                                break;
                            } else {
                                zzma.zza(t, zzd & 1048575, zzldVar.zza(zza(zzg), zzioVar));
                                zzb((zzko<T>) t, zzg);
                                continue;
                            }
                        case 10:
                            zzma.zza(t, zzd & 1048575, zzldVar.zzn());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 11:
                            zzma.zza((Object) t, zzd & 1048575, zzldVar.zzo());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 12:
                            int zzp = zzldVar.zzp();
                            zzjg zzc = zzc(zzg);
                            if (zzc != null && !zzc.zza(zzp)) {
                                obj = zzle.zza(zza2, zzp, obj, zzluVar);
                                break;
                            }
                            zzma.zza((Object) t, zzd & 1048575, zzp);
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 13:
                            zzma.zza((Object) t, zzd & 1048575, zzldVar.zzq());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 14:
                            zzma.zza((Object) t, zzd & 1048575, zzldVar.zzr());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 15:
                            zzma.zza((Object) t, zzd & 1048575, zzldVar.zzs());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 16:
                            zzma.zza((Object) t, zzd & 1048575, zzldVar.zzt());
                            zzb((zzko<T>) t, zzg);
                            continue;
                        case 17:
                            if (zza((zzko<T>) t, zzg)) {
                                long j2 = zzd & 1048575;
                                zzma.zza(t, j2, zzjf.zza(zzma.zzf(t, j2), zzldVar.zzb(zza(zzg), zzioVar)));
                                break;
                            } else {
                                zzma.zza(t, zzd & 1048575, zzldVar.zzb(zza(zzg), zzioVar));
                                zzb((zzko<T>) t, zzg);
                                continue;
                            }
                        case 18:
                            zzldVar.zza(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 19:
                            zzldVar.zzb(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 20:
                            zzldVar.zzd(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 21:
                            zzldVar.zzc(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 22:
                            zzldVar.zze(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 23:
                            zzldVar.zzf(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 24:
                            zzldVar.zzg(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                            zzldVar.zzh(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                            if (zzf(zzd)) {
                                zzldVar.zzj(this.zzp.zza(t, zzd & 1048575));
                                break;
                            } else {
                                zzldVar.zzi(this.zzp.zza(t, zzd & 1048575));
                                continue;
                            }
                        case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                            zzldVar.zza(this.zzp.zza(t, zzd & 1048575), zza(zzg), zzioVar);
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                            zzldVar.zzk(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                            zzldVar.zzl(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                            List<Integer> zza3 = this.zzp.zza(t, zzd & 1048575);
                            zzldVar.zzm(zza3);
                            obj = zzle.zza(zza2, zza3, zzc(zzg), obj, zzluVar);
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                            zzldVar.zzn(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 32:
                            zzldVar.zzo(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                            zzldVar.zzp(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                            zzldVar.zzq(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                            zzldVar.zza(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                            zzldVar.zzb(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                            zzldVar.zzd(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                            zzldVar.zzc(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                            zzldVar.zze(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                            zzldVar.zzf(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                            zzldVar.zzg(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                            zzldVar.zzh(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                            zzldVar.zzl(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                            List<Integer> zza4 = this.zzp.zza(t, zzd & 1048575);
                            zzldVar.zzm(zza4);
                            obj = zzle.zza(zza2, zza4, zzc(zzg), obj, zzluVar);
                            continue;
                        case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                            zzldVar.zzn(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                            zzldVar.zzo(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                            zzldVar.zzp(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                            zzldVar.zzq(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                            zzldVar.zzb(this.zzp.zza(t, zzd & 1048575), zza(zzg), zzioVar);
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                            Object zzb2 = zzb(zzg);
                            long zzd2 = zzd(zzg) & 1048575;
                            Object zzf = zzma.zzf(t, zzd2);
                            if (zzf == null) {
                                zzf = this.zzs.zzf(zzb2);
                                zzma.zza(t, zzd2, zzf);
                            } else if (this.zzs.zzd(zzf)) {
                                Object zzf2 = this.zzs.zzf(zzb2);
                                this.zzs.zza(zzf2, zzf);
                                zzma.zza(t, zzd2, zzf2);
                                zzf = zzf2;
                            }
                            zzldVar.zza(this.zzs.zza(zzf), this.zzs.zzb(zzb2), zzioVar);
                            continue;
                        case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                            zzma.zza(t, zzd & 1048575, Double.valueOf(zzldVar.zzd()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 52:
                            zzma.zza(t, zzd & 1048575, Float.valueOf(zzldVar.zze()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 53:
                            zzma.zza(t, zzd & 1048575, Long.valueOf(zzldVar.zzg()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 54:
                            zzma.zza(t, zzd & 1048575, Long.valueOf(zzldVar.zzf()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 55:
                            zzma.zza(t, zzd & 1048575, Integer.valueOf(zzldVar.zzh()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 56:
                            zzma.zza(t, zzd & 1048575, Long.valueOf(zzldVar.zzi()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 57:
                            zzma.zza(t, zzd & 1048575, Integer.valueOf(zzldVar.zzj()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 58:
                            zzma.zza(t, zzd & 1048575, Boolean.valueOf(zzldVar.zzk()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 59:
                            zza(t, zzd, zzldVar);
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 60:
                            if (zza((zzko<T>) t, zza2, zzg)) {
                                long j3 = zzd & 1048575;
                                zzma.zza(t, j3, zzjf.zza(zzma.zzf(t, j3), zzldVar.zza(zza(zzg), zzioVar)));
                            } else {
                                zzma.zza(t, zzd & 1048575, zzldVar.zza(zza(zzg), zzioVar));
                                zzb((zzko<T>) t, zzg);
                            }
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 61:
                            zzma.zza(t, zzd & 1048575, zzldVar.zzn());
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 62:
                            zzma.zza(t, zzd & 1048575, Integer.valueOf(zzldVar.zzo()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 63:
                            int zzp2 = zzldVar.zzp();
                            zzjg zzc2 = zzc(zzg);
                            if (zzc2 != null && !zzc2.zza(zzp2)) {
                                obj = zzle.zza(zza2, zzp2, obj, zzluVar);
                                break;
                            }
                            zzma.zza(t, zzd & 1048575, Integer.valueOf(zzp2));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 64:
                            zzma.zza(t, zzd & 1048575, Integer.valueOf(zzldVar.zzq()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 65:
                            zzma.zza(t, zzd & 1048575, Long.valueOf(zzldVar.zzr()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 66:
                            zzma.zza(t, zzd & 1048575, Integer.valueOf(zzldVar.zzs()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 67:
                            zzma.zza(t, zzd & 1048575, Long.valueOf(zzldVar.zzt()));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        case 68:
                            zzma.zza(t, zzd & 1048575, zzldVar.zzb(zza(zzg), zzioVar));
                            zzb((zzko<T>) t, zza2, zzg);
                            continue;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzluVar.zza();
                                } catch (zzjn unused) {
                                    zzluVar.zza(zzldVar);
                                    if (obj == null) {
                                        obj = zzluVar.zzc(t);
                                    }
                                    if (!zzluVar.zza((zzlu) obj, zzldVar)) {
                                        for (int i = this.zzm; i < this.zzn; i++) {
                                            obj = zza((Object) t, this.zzl[i], (int) obj, (zzlu<UT, int>) zzluVar);
                                        }
                                        if (obj != null) {
                                            zzluVar.zzb((Object) t, (T) obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzluVar.zza((zzlu) obj, zzldVar)) {
                                for (int i2 = this.zzm; i2 < this.zzn; i2++) {
                                    obj = zza((Object) t, this.zzl[i2], (int) obj, (zzlu<UT, int>) zzluVar);
                                }
                                if (obj != null) {
                                    zzluVar.zzb((Object) t, (T) obj);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                } else if (zza2 == Integer.MAX_VALUE) {
                    for (int i3 = this.zzm; i3 < this.zzn; i3++) {
                        obj = zza((Object) t, this.zzl[i3], (int) obj, (zzlu<UT, int>) zzluVar);
                    }
                    if (obj != null) {
                        zzluVar.zzb((Object) t, (T) obj);
                        return;
                    }
                    return;
                } else {
                    Object zza5 = !this.zzh ? null : zziqVar.zza(zzioVar, this.zzg, zza2);
                    if (zza5 != null) {
                        if (zziuVar == null) {
                            zziuVar = zziqVar.zzb(t);
                        }
                        zziu<?> zziuVar2 = zziuVar;
                        obj = zziqVar.zza(zzldVar, zza5, zzioVar, zziuVar2, obj, zzluVar);
                        zziuVar = zziuVar2;
                    } else {
                        zzluVar.zza(zzldVar);
                        if (obj == null) {
                            obj = zzluVar.zzc(t);
                        }
                        if (!zzluVar.zza((zzlu) obj, zzldVar)) {
                            for (int i4 = this.zzm; i4 < this.zzn; i4++) {
                                obj = zza((Object) t, this.zzl[i4], (int) obj, (zzlu<UT, int>) zzluVar);
                            }
                            if (obj != null) {
                                zzluVar.zzb((Object) t, (T) obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzm; i5 < this.zzn; i5++) {
                    obj = zza((Object) t, this.zzl[i5], (int) obj, (zzlu<UT, int>) zzluVar);
                }
                if (obj != null) {
                    zzluVar.zzb((Object) t, (T) obj);
                }
                throw th;
            }
        }
    }

    private static int zza(byte[] bArr, int i, int i2, zzml zzmlVar, Class<?> cls, zzhn zzhnVar) throws IOException {
        switch (zzkr.zza[zzmlVar.ordinal()]) {
            case 1:
                int zzb2 = zzhl.zzb(bArr, i, zzhnVar);
                zzhnVar.zzc = Boolean.valueOf(zzhnVar.zzb != 0);
                return zzb2;
            case 2:
                return zzhl.zze(bArr, i, zzhnVar);
            case 3:
                zzhnVar.zzc = Double.valueOf(zzhl.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzhnVar.zzc = Integer.valueOf(zzhl.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzhnVar.zzc = Long.valueOf(zzhl.zzb(bArr, i));
                return i + 8;
            case 8:
                zzhnVar.zzc = Float.valueOf(zzhl.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza2 = zzhl.zza(bArr, i, zzhnVar);
                zzhnVar.zzc = Integer.valueOf(zzhnVar.zza);
                return zza2;
            case 12:
            case 13:
                int zzb3 = zzhl.zzb(bArr, i, zzhnVar);
                zzhnVar.zzc = Long.valueOf(zzhnVar.zzb);
                return zzb3;
            case 14:
                return zzhl.zza(zzky.zza().zza((Class) cls), bArr, i, i2, zzhnVar);
            case 15:
                int zza3 = zzhl.zza(bArr, i, zzhnVar);
                zzhnVar.zzc = Integer.valueOf(zzif.zze(zzhnVar.zza));
                return zza3;
            case 16:
                int zzb4 = zzhl.zzb(bArr, i, zzhnVar);
                zzhnVar.zzc = Long.valueOf(zzif.zza(zzhnVar.zzb));
                return zzb4;
            case 17:
                return zzhl.zzd(bArr, i, zzhnVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0233 -> B:116:0x0234). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016b -> B:67:0x016c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01e5 -> B:96:0x01e6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.vision.zzhn r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.vision.zzhn):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzhn zzhnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzb2 = zzb(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzs.zzd(object)) {
            Object zzf = this.zzs.zzf(zzb2);
            this.zzs.zza(zzf, object);
            unsafe.putObject(t, j, zzf);
            object = zzf;
        }
        zzkf<?, ?> zzb3 = this.zzs.zzb(zzb2);
        Map<?, ?> zza2 = this.zzs.zza(object);
        int zza3 = zzhl.zza(bArr, i, zzhnVar);
        int i4 = zzhnVar.zza;
        if (i4 >= 0 && i4 <= i2 - zza3) {
            int i5 = i4 + zza3;
            Object obj = (K) zzb3.zzb;
            Object obj2 = (V) zzb3.zzd;
            while (zza3 < i5) {
                int i6 = zza3 + 1;
                int i7 = bArr[zza3];
                if (i7 < 0) {
                    i6 = zzhl.zza(i7, bArr, i6, zzhnVar);
                    i7 = zzhnVar.zza;
                }
                int i8 = i6;
                int i9 = i7 >>> 3;
                int i10 = i7 & 7;
                if (i9 != 1) {
                    if (i9 == 2 && i10 == zzb3.zzc.zzb()) {
                        zza3 = zza(bArr, i8, i2, zzb3.zzc, zzb3.zzd.getClass(), zzhnVar);
                        obj2 = zzhnVar.zzc;
                    }
                    zza3 = zzhl.zza(i7, bArr, i8, i2, zzhnVar);
                } else if (i10 == zzb3.zza.zzb()) {
                    zza3 = zza(bArr, i8, i2, zzb3.zza, (Class<?>) null, zzhnVar);
                    obj = (K) zzhnVar.zzc;
                } else {
                    zza3 = zzhl.zza(i7, bArr, i8, i2, zzhnVar);
                }
            }
            if (zza3 == i5) {
                zza2.put(obj, obj2);
                return i5;
            }
            throw zzjk.zzg();
        }
        throw zzjk.zza();
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzhn zzhnVar) throws IOException {
        int zzb2;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zzhl.zzc(bArr, i)));
                    zzb2 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zzhl.zzd(bArr, i)));
                    zzb2 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb2 = zzhl.zzb(bArr, i, zzhnVar);
                    unsafe.putObject(t, j, Long.valueOf(zzhnVar.zzb));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb2 = zzhl.zza(bArr, i, zzhnVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzhnVar.zza));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzhl.zzb(bArr, i)));
                    zzb2 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzhl.zza(bArr, i)));
                    zzb2 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb2 = zzhl.zzb(bArr, i, zzhnVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzhnVar.zzb != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza2 = zzhl.zza(bArr, i, zzhnVar);
                    int i9 = zzhnVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzmd.zza(bArr, zza2, zza2 + i9)) {
                        throw zzjk.zzh();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, zza2, i9, zzjf.zza));
                        zza2 += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza3 = zzhl.zza(zza(i8), bArr, i, i2, zzhnVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzhnVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzjf.zza(object, zzhnVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza3;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb2 = zzhl.zze(bArr, i, zzhnVar);
                    unsafe.putObject(t, j, zzhnVar.zzc);
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza4 = zzhl.zza(bArr, i, zzhnVar);
                    int i10 = zzhnVar.zza;
                    zzjg zzc = zzc(i8);
                    if (zzc != null && !zzc.zza(i10)) {
                        zze(t).zza(i3, Long.valueOf(i10));
                        return zza4;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i10));
                    zzb2 = zza4;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb2 = zzhl.zza(bArr, i, zzhnVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzif.zze(zzhnVar.zza)));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb2 = zzhl.zzb(bArr, i, zzhnVar);
                    unsafe.putObject(t, j, Long.valueOf(zzif.zza(zzhnVar.zzb)));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb2 = zzhl.zza(zza(i8), bArr, i, i2, (i3 & (-8)) | 4, zzhnVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzhnVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzjf.zza(object2, zzhnVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            default:
                return i;
        }
    }

    private final zzlc zza(int i) {
        int i2 = (i / 3) << 1;
        zzlc zzlcVar = (zzlc) this.zzd[i2];
        if (zzlcVar != null) {
            return zzlcVar;
        }
        zzlc<T> zza2 = zzky.zza().zza((Class) ((Class) this.zzd[i2 + 1]));
        this.zzd[i2] = zza2;
        return zza2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x065e, code lost:
        if (r1 == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0660, code lost:
        r31.putInt(r13, r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0666, code lost:
        r1 = r8.zzm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x066a, code lost:
        if (r1 >= r8.zzn) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x066c, code lost:
        r4 = (com.google.android.gms.internal.vision.zzlx) r8.zza((java.lang.Object) r13, r8.zzl[r1], (int) r4, (com.google.android.gms.internal.vision.zzlu<UT, int>) r8.zzq);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x067c, code lost:
        if (r4 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x067e, code lost:
        r8.zzq.zzb((java.lang.Object) r13, (T) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0683, code lost:
        if (r9 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0685, code lost:
        if (r0 != r6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x068c, code lost:
        throw com.google.android.gms.internal.vision.zzjk.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x068d, code lost:
        if (r0 > r6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x068f, code lost:
        if (r3 != r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0691, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0696, code lost:
        throw com.google.android.gms.internal.vision.zzjk.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.vision.zzhn r40) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.vision.zzhn):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d1, code lost:
        if (r0 == r5) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d5, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r10 = r20;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x031a, code lost:
        if (r0 == r15) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x033d, code lost:
        if (r0 == r15) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x033f, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.vision.zzhn r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.zzhn):void");
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzlu<UT, UB> zzluVar) {
        zzjg zzc;
        int i2 = this.zzc[i];
        Object zzf = zzma.zzf(obj, zzd(i) & 1048575);
        return (zzf == null || (zzc = zzc(i)) == null) ? ub : (UB) zza(i, i2, this.zzs.zza(zzf), zzc, (zzjg) ub, (zzlu<UT, zzjg>) zzluVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzjg zzjgVar, UB ub, zzlu<UT, UB> zzluVar) {
        zzkf<?, ?> zzb2 = this.zzs.zzb(zzb(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjgVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzluVar.zza();
                }
                zzib zzc = zzht.zzc(zzkc.zza(zzb2, next.getKey(), next.getValue()));
                try {
                    zzkc.zza(zzc.zzb(), zzb2, next.getKey(), next.getValue());
                    zzluVar.zza((zzlu<UT, UB>) ub, i2, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzlc zzlcVar) {
        return zzlcVar.zzd(zzma.zzf(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzmr zzmrVar) throws IOException {
        if (obj instanceof String) {
            zzmrVar.zza(i, (String) obj);
        } else {
            zzmrVar.zza(i, (zzht) obj);
        }
    }

    private final void zza(Object obj, int i, zzld zzldVar) throws IOException {
        if (zzf(i)) {
            zzma.zza(obj, i & 1048575, zzldVar.zzm());
        } else if (this.zzi) {
            zzma.zza(obj, i & 1048575, zzldVar.zzl());
        } else {
            zzma.zza(obj, i & 1048575, zzldVar.zzn());
        }
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zza((zzko<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zza(T t, int i) {
        int zze = zze(i);
        long j = zze & 1048575;
        if (j != 1048575) {
            return (zzma.zza(t, j) & (1 << (zze >>> 20))) != 0;
        }
        int zzd = zzd(i);
        long j2 = zzd & 1048575;
        switch ((zzd & 267386880) >>> 20) {
            case 0:
                return zzma.zze(t, j2) != 0.0d;
            case 1:
                return zzma.zzd(t, j2) != 0.0f;
            case 2:
                return zzma.zzb(t, j2) != 0;
            case 3:
                return zzma.zzb(t, j2) != 0;
            case 4:
                return zzma.zza(t, j2) != 0;
            case 5:
                return zzma.zzb(t, j2) != 0;
            case 6:
                return zzma.zza(t, j2) != 0;
            case 7:
                return zzma.zzc(t, j2);
            case 8:
                Object zzf = zzma.zzf(t, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzht) {
                    return !zzht.zza.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzma.zzf(t, j2) != null;
            case 10:
                return !zzht.zza.equals(zzma.zzf(t, j2));
            case 11:
                return zzma.zza(t, j2) != 0;
            case 12:
                return zzma.zza(t, j2) != 0;
            case 13:
                return zzma.zza(t, j2) != 0;
            case 14:
                return zzma.zzb(t, j2) != 0;
            case 15:
                return zzma.zza(t, j2) != 0;
            case 16:
                return zzma.zzb(t, j2) != 0;
            case 17:
                return zzma.zzf(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zzma.zza(t, (long) (zze(i2) & 1048575)) == i;
    }

    private final int zza(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, i2);
    }
}
