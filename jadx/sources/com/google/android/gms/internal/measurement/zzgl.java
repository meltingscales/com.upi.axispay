package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.IMediaSession;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.vision.barcode.Barcode;
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
public final class zzgl<T> implements zzgy<T> {
    private static final int[] zzaiy = new int[0];
    private static final Unsafe zzaiz = zzhw.zzow();
    private final int[] zzaja;
    private final Object[] zzajb;
    private final int zzajc;
    private final int zzajd;
    private final zzgh zzaje;
    private final boolean zzajf;
    private final boolean zzajg;
    private final boolean zzajh;
    private final boolean zzaji;
    private final int[] zzajj;
    private final int zzajk;
    private final int zzajl;
    private final zzgp zzajm;
    private final zzfr zzajn;
    private final zzhq<?, ?> zzajo;
    private final zzen<?> zzajp;
    private final zzgc zzajq;

    private zzgl(int[] iArr, Object[] objArr, int i, int i2, zzgh zzghVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgp zzgpVar, zzfr zzfrVar, zzhq<?, ?> zzhqVar, zzen<?> zzenVar, zzgc zzgcVar) {
        this.zzaja = iArr;
        this.zzajb = objArr;
        this.zzajc = i;
        this.zzajd = i2;
        this.zzajg = zzghVar instanceof zzez;
        this.zzajh = z;
        this.zzajf = zzenVar != null && zzenVar.zze(zzghVar);
        this.zzaji = false;
        this.zzajj = iArr2;
        this.zzajk = i3;
        this.zzajl = i4;
        this.zzajm = zzgpVar;
        this.zzajn = zzfrVar;
        this.zzajo = zzhqVar;
        this.zzajp = zzenVar;
        this.zzaje = zzghVar;
        this.zzajq = zzgcVar;
    }

    public static <T> zzgl<T> zza(Class<T> cls, zzgf zzgfVar, zzgp zzgpVar, zzfr zzfrVar, zzhq<?, ?> zzhqVar, zzen<?> zzenVar, zzgc zzgcVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        boolean z;
        int i17;
        zzgw zzgwVar;
        int i18;
        int objectFieldOffset;
        int i19;
        int i20;
        Class<?> cls2;
        String str;
        int i21;
        int i22;
        Field zza;
        int i23;
        char charAt11;
        int i24;
        Field zza2;
        Field zza3;
        int i25;
        char charAt12;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        char charAt16;
        if (zzgfVar instanceof zzgw) {
            zzgw zzgwVar2 = (zzgw) zzgfVar;
            int i29 = 0;
            boolean z2 = zzgwVar2.zzns() == zzez.zze.zzahd;
            String zzob = zzgwVar2.zzob();
            int length = zzob.length();
            int charAt17 = zzob.charAt(0);
            if (charAt17 >= 55296) {
                int i30 = charAt17 & 8191;
                int i31 = 1;
                int i32 = 13;
                while (true) {
                    i = i31 + 1;
                    charAt16 = zzob.charAt(i31);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i30 |= (charAt16 & 8191) << i32;
                    i32 += 13;
                    i31 = i;
                }
                charAt17 = i30 | (charAt16 << i32);
            } else {
                i = 1;
            }
            int i33 = i + 1;
            int charAt18 = zzob.charAt(i);
            if (charAt18 >= 55296) {
                int i34 = charAt18 & 8191;
                int i35 = 13;
                while (true) {
                    i28 = i33 + 1;
                    charAt15 = zzob.charAt(i33);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i34 |= (charAt15 & 8191) << i35;
                    i35 += 13;
                    i33 = i28;
                }
                charAt18 = i34 | (charAt15 << i35);
                i33 = i28;
            }
            if (charAt18 == 0) {
                i6 = 0;
                charAt = 0;
                i4 = 0;
                charAt2 = 0;
                i5 = 0;
                iArr = zzaiy;
                i3 = 0;
            } else {
                int i36 = i33 + 1;
                int charAt19 = zzob.charAt(i33);
                if (charAt19 >= 55296) {
                    int i37 = charAt19 & 8191;
                    int i38 = 13;
                    while (true) {
                        i14 = i36 + 1;
                        charAt10 = zzob.charAt(i36);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i37 |= (charAt10 & 8191) << i38;
                        i38 += 13;
                        i36 = i14;
                    }
                    charAt19 = i37 | (charAt10 << i38);
                    i36 = i14;
                }
                int i39 = i36 + 1;
                int charAt20 = zzob.charAt(i36);
                if (charAt20 >= 55296) {
                    int i40 = charAt20 & 8191;
                    int i41 = 13;
                    while (true) {
                        i13 = i39 + 1;
                        charAt9 = zzob.charAt(i39);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i40 |= (charAt9 & 8191) << i41;
                        i41 += 13;
                        i39 = i13;
                    }
                    charAt20 = i40 | (charAt9 << i41);
                    i39 = i13;
                }
                int i42 = i39 + 1;
                charAt = zzob.charAt(i39);
                if (charAt >= 55296) {
                    int i43 = charAt & 8191;
                    int i44 = 13;
                    while (true) {
                        i12 = i42 + 1;
                        charAt8 = zzob.charAt(i42);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i43 |= (charAt8 & 8191) << i44;
                        i44 += 13;
                        i42 = i12;
                    }
                    charAt = i43 | (charAt8 << i44);
                    i42 = i12;
                }
                int i45 = i42 + 1;
                int charAt21 = zzob.charAt(i42);
                if (charAt21 >= 55296) {
                    int i46 = charAt21 & 8191;
                    int i47 = 13;
                    while (true) {
                        i11 = i45 + 1;
                        charAt7 = zzob.charAt(i45);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i46 |= (charAt7 & 8191) << i47;
                        i47 += 13;
                        i45 = i11;
                    }
                    charAt21 = i46 | (charAt7 << i47);
                    i45 = i11;
                }
                int i48 = i45 + 1;
                charAt2 = zzob.charAt(i45);
                if (charAt2 >= 55296) {
                    int i49 = charAt2 & 8191;
                    int i50 = 13;
                    while (true) {
                        i10 = i48 + 1;
                        charAt6 = zzob.charAt(i48);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i49 |= (charAt6 & 8191) << i50;
                        i50 += 13;
                        i48 = i10;
                    }
                    charAt2 = i49 | (charAt6 << i50);
                    i48 = i10;
                }
                int i51 = i48 + 1;
                int charAt22 = zzob.charAt(i48);
                if (charAt22 >= 55296) {
                    int i52 = charAt22 & 8191;
                    int i53 = 13;
                    while (true) {
                        i9 = i51 + 1;
                        charAt5 = zzob.charAt(i51);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i52 |= (charAt5 & 8191) << i53;
                        i53 += 13;
                        i51 = i9;
                    }
                    charAt22 = i52 | (charAt5 << i53);
                    i51 = i9;
                }
                int i54 = i51 + 1;
                int charAt23 = zzob.charAt(i51);
                if (charAt23 >= 55296) {
                    int i55 = charAt23 & 8191;
                    int i56 = i54;
                    int i57 = 13;
                    while (true) {
                        i8 = i56 + 1;
                        charAt4 = zzob.charAt(i56);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i55 |= (charAt4 & 8191) << i57;
                        i57 += 13;
                        i56 = i8;
                    }
                    charAt23 = i55 | (charAt4 << i57);
                    i2 = i8;
                } else {
                    i2 = i54;
                }
                int i58 = i2 + 1;
                int charAt24 = zzob.charAt(i2);
                if (charAt24 >= 55296) {
                    int i59 = charAt24 & 8191;
                    int i60 = i58;
                    int i61 = 13;
                    while (true) {
                        i7 = i60 + 1;
                        charAt3 = zzob.charAt(i60);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i59 |= (charAt3 & 8191) << i61;
                        i61 += 13;
                        i60 = i7;
                    }
                    charAt24 = i59 | (charAt3 << i61);
                    i58 = i7;
                }
                int i62 = (charAt19 << 1) + charAt20;
                i3 = charAt21;
                i4 = i62;
                i5 = charAt24;
                i29 = charAt19;
                i33 = i58;
                int i63 = charAt22;
                iArr = new int[charAt24 + charAt22 + charAt23];
                i6 = i63;
            }
            Unsafe unsafe = zzaiz;
            Object[] zzoc = zzgwVar2.zzoc();
            Class<?> cls3 = zzgwVar2.zznu().getClass();
            int i64 = i33;
            int[] iArr2 = new int[charAt2 * 3];
            Object[] objArr = new Object[charAt2 << 1];
            int i65 = i5 + i6;
            int i66 = i5;
            int i67 = i64;
            int i68 = i65;
            int i69 = 0;
            int i70 = 0;
            while (i67 < length) {
                int i71 = i67 + 1;
                int charAt25 = zzob.charAt(i67);
                int i72 = length;
                if (charAt25 >= 55296) {
                    int i73 = charAt25 & 8191;
                    int i74 = i71;
                    int i75 = 13;
                    while (true) {
                        i27 = i74 + 1;
                        charAt14 = zzob.charAt(i74);
                        i15 = i5;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i73 |= (charAt14 & 8191) << i75;
                        i75 += 13;
                        i74 = i27;
                        i5 = i15;
                    }
                    charAt25 = i73 | (charAt14 << i75);
                    i16 = i27;
                } else {
                    i15 = i5;
                    i16 = i71;
                }
                int i76 = i16 + 1;
                int charAt26 = zzob.charAt(i16);
                if (charAt26 >= 55296) {
                    int i77 = charAt26 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i26 = i78 + 1;
                        charAt13 = zzob.charAt(i78);
                        z = z2;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i77 |= (charAt13 & 8191) << i79;
                        i79 += 13;
                        i78 = i26;
                        z2 = z;
                    }
                    charAt26 = i77 | (charAt13 << i79);
                    i17 = i26;
                } else {
                    z = z2;
                    i17 = i76;
                }
                int i80 = charAt26 & 255;
                int i81 = i3;
                if ((charAt26 & 1024) != 0) {
                    iArr[i69] = i70;
                    i69++;
                }
                int i82 = charAt;
                if (i80 >= 51) {
                    int i83 = i17 + 1;
                    int charAt27 = zzob.charAt(i17);
                    char c = 55296;
                    if (charAt27 >= 55296) {
                        int i84 = charAt27 & 8191;
                        int i85 = 13;
                        while (true) {
                            i25 = i83 + 1;
                            charAt12 = zzob.charAt(i83);
                            if (charAt12 < c) {
                                break;
                            }
                            i84 |= (charAt12 & 8191) << i85;
                            i85 += 13;
                            i83 = i25;
                            c = 55296;
                        }
                        charAt27 = i84 | (charAt12 << i85);
                        i83 = i25;
                    }
                    int i86 = i80 - 51;
                    int i87 = i83;
                    if (i86 == 9 || i86 == 17) {
                        objArr[((i70 / 3) << 1) + 1] = zzoc[i4];
                        i4++;
                    } else if (i86 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i70 / 3) << 1) + 1] = zzoc[i4];
                        i4++;
                    }
                    int i88 = charAt27 << 1;
                    Object obj = zzoc[i88];
                    if (obj instanceof Field) {
                        zza2 = (Field) obj;
                    } else {
                        zza2 = zza(cls3, (String) obj);
                        zzoc[i88] = zza2;
                    }
                    zzgwVar = zzgwVar2;
                    String str2 = zzob;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza2);
                    int i89 = i88 + 1;
                    Object obj2 = zzoc[i89];
                    if (obj2 instanceof Field) {
                        zza3 = (Field) obj2;
                    } else {
                        zza3 = zza(cls3, (String) obj2);
                        zzoc[i89] = zza3;
                    }
                    cls2 = cls3;
                    i19 = i4;
                    i17 = i87;
                    str = str2;
                    i22 = 0;
                    i21 = (int) unsafe.objectFieldOffset(zza3);
                    objectFieldOffset = objectFieldOffset2;
                    i20 = i29;
                } else {
                    zzgwVar = zzgwVar2;
                    String str3 = zzob;
                    int i90 = i4 + 1;
                    Field zza4 = zza(cls3, (String) zzoc[i4]);
                    if (i80 == 9 || i80 == 17) {
                        i18 = 1;
                        objArr[((i70 / 3) << 1) + 1] = zza4.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            i18 = 1;
                            i24 = i90 + 1;
                            objArr[((i70 / 3) << 1) + 1] = zzoc[i90];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            i18 = 1;
                            if ((charAt17 & 1) == 1) {
                                i24 = i90 + 1;
                                objArr[((i70 / 3) << 1) + 1] = zzoc[i90];
                            }
                        } else {
                            if (i80 == 50) {
                                int i91 = i66 + 1;
                                iArr[i66] = i70;
                                int i92 = (i70 / 3) << 1;
                                int i93 = i90 + 1;
                                objArr[i92] = zzoc[i90];
                                if ((charAt26 & Barcode.PDF417) != 0) {
                                    i90 = i93 + 1;
                                    objArr[i92 + 1] = zzoc[i93];
                                    i66 = i91;
                                } else {
                                    i90 = i93;
                                    i18 = 1;
                                    i66 = i91;
                                }
                            }
                            i18 = 1;
                        }
                        i90 = i24;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza4);
                    if ((charAt17 & 1) != i18) {
                        i19 = i90;
                        i20 = i29;
                        cls2 = cls3;
                        str = str3;
                    } else if (i80 <= 17) {
                        int i94 = i17 + 1;
                        str = str3;
                        int charAt28 = str.charAt(i17);
                        if (charAt28 >= 55296) {
                            int i95 = charAt28 & 8191;
                            int i96 = 13;
                            while (true) {
                                i23 = i94 + 1;
                                charAt11 = str.charAt(i94);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i95 |= (charAt11 & 8191) << i96;
                                i96 += 13;
                                i94 = i23;
                            }
                            charAt28 = i95 | (charAt11 << i96);
                            i94 = i23;
                        }
                        int i97 = (i29 << 1) + (charAt28 / 32);
                        Object obj3 = zzoc[i97];
                        i19 = i90;
                        if (obj3 instanceof Field) {
                            zza = (Field) obj3;
                        } else {
                            zza = zza(cls3, (String) obj3);
                            zzoc[i97] = zza;
                        }
                        i20 = i29;
                        cls2 = cls3;
                        i22 = charAt28 % 32;
                        i21 = (int) unsafe.objectFieldOffset(zza);
                        i17 = i94;
                        if (i80 >= 18 && i80 <= 49) {
                            iArr[i68] = objectFieldOffset;
                            i68++;
                        }
                    } else {
                        i19 = i90;
                        i20 = i29;
                        cls2 = cls3;
                        str = str3;
                    }
                    i21 = 0;
                    i22 = 0;
                    if (i80 >= 18) {
                        iArr[i68] = objectFieldOffset;
                        i68++;
                    }
                }
                int i98 = i70 + 1;
                iArr2[i70] = charAt25;
                int i99 = i98 + 1;
                iArr2[i98] = objectFieldOffset | ((charAt26 & Barcode.QR_CODE) != 0 ? 268435456 : 0) | ((charAt26 & Barcode.UPC_A) != 0 ? 536870912 : 0) | (i80 << 20);
                i70 = i99 + 1;
                iArr2[i99] = (i22 << 20) | i21;
                i29 = i20;
                zzob = str;
                i67 = i17;
                cls3 = cls2;
                i3 = i81;
                length = i72;
                i5 = i15;
                z2 = z;
                charAt = i82;
                i4 = i19;
                zzgwVar2 = zzgwVar;
            }
            return new zzgl<>(iArr2, objArr, charAt, i3, zzgwVar2.zznu(), z2, false, iArr, i5, i65, zzgpVar, zzfrVar, zzhqVar, zzenVar, zzgcVar);
        }
        ((zzhl) zzgfVar).zzns();
        int i100 = zzez.zze.zzahd;
        throw new NoSuchMethodError();
    }

    private final zzgy zzax(int i) {
        int i2 = (i / 3) << 1;
        zzgy zzgyVar = (zzgy) this.zzajb[i2];
        if (zzgyVar != null) {
            return zzgyVar;
        }
        zzgy<T> zzf = zzgu.zznz().zzf((Class) this.zzajb[i2 + 1]);
        this.zzajb[i2] = zzf;
        return zzf;
    }

    private final Object zzay(int i) {
        return this.zzajb[(i / 3) << 1];
    }

    private final zzfe zzaz(int i) {
        return (zzfe) this.zzajb[((i / 3) << 1) + 1];
    }

    private final void zzb(T t, T t2, int i) {
        int zzba = zzba(i);
        int i2 = this.zzaja[i];
        long j = zzba & 1048575;
        if (zza((zzgl<T>) t2, i2, i)) {
            Object zzp = zzhw.zzp(t, j);
            Object zzp2 = zzhw.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzhw.zza(t, j, zzfb.zza(zzp, zzp2));
                zzb((zzgl<T>) t, i2, i);
            } else if (zzp2 != null) {
                zzhw.zza(t, j, zzp2);
                zzb((zzgl<T>) t, i2, i);
            }
        }
    }

    private final int zzba(int i) {
        return this.zzaja[i + 1];
    }

    private final int zzbb(int i) {
        return this.zzaja[i + 2];
    }

    private static boolean zzbc(int i) {
        return (i & 536870912) != 0;
    }

    private final int zzbd(int i) {
        if (i < this.zzajc || i > this.zzajd) {
            return -1;
        }
        return zzq(i, 0);
    }

    private static <E> List<E> zze(Object obj, long j) {
        return (List) zzhw.zzp(obj, j);
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzhw.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzhw.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzhw.zzp(t, j)).intValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzhw.zzp(t, j)).booleanValue();
    }

    private final int zzp(int i, int i2) {
        if (i < this.zzajc || i > this.zzajd) {
            return -1;
        }
        return zzq(i, i2);
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzaja.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzaja[i4];
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

    private static zzhr zzt(Object obj) {
        zzez zzezVar = (zzez) obj;
        zzhr zzhrVar = zzezVar.zzagn;
        if (zzhrVar == zzhr.zzor()) {
            zzhr zzos = zzhr.zzos();
            zzezVar.zzagn = zzos;
            return zzos;
        }
        return zzhrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzhw.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzhw.zzo(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.zzha.zzd(com.google.android.gms.internal.measurement.zzhw.zzp(r10, r6), com.google.android.gms.internal.measurement.zzhw.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.zzha.zzd(com.google.android.gms.internal.measurement.zzhw.zzp(r10, r6), com.google.android.gms.internal.measurement.zzhw.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.zzhw.zzl(r10, r6) == com.google.android.gms.internal.measurement.zzhw.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.zzhw.zzk(r10, r6) == com.google.android.gms.internal.measurement.zzhw.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.zzhw.zzl(r10, r6) == com.google.android.gms.internal.measurement.zzhw.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.zzhw.zzk(r10, r6) == com.google.android.gms.internal.measurement.zzhw.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.zzhw.zzk(r10, r6) == com.google.android.gms.internal.measurement.zzhw.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.zzhw.zzk(r10, r6) == com.google.android.gms.internal.measurement.zzhw.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.zzha.zzd(com.google.android.gms.internal.measurement.zzhw.zzp(r10, r6), com.google.android.gms.internal.measurement.zzhw.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.zzha.zzd(com.google.android.gms.internal.measurement.zzhw.zzp(r10, r6), com.google.android.gms.internal.measurement.zzhw.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.zzha.zzd(com.google.android.gms.internal.measurement.zzhw.zzp(r10, r6), com.google.android.gms.internal.measurement.zzhw.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.zzhw.zzm(r10, r6) == com.google.android.gms.internal.measurement.zzhw.zzm(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.zzhw.zzk(r10, r6) == com.google.android.gms.internal.measurement.zzhw.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.zzhw.zzl(r10, r6) == com.google.android.gms.internal.measurement.zzhw.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.zzhw.zzk(r10, r6) == com.google.android.gms.internal.measurement.zzhw.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.zzhw.zzl(r10, r6) == com.google.android.gms.internal.measurement.zzhw.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.zzhw.zzl(r10, r6) == com.google.android.gms.internal.measurement.zzhw.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzhw.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzhw.zzn(r11, r6))) goto L85;
     */
    @Override // com.google.android.gms.internal.measurement.zzgy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgl.equals(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int hashCode(T t) {
        int i;
        int zzba;
        int length = this.zzaja.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzba2 = zzba(i3);
            int i4 = this.zzaja[i3];
            long j = 1048575 & zzba2;
            int i5 = 37;
            switch ((zzba2 & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzba = zzfb.zzba(Double.doubleToLongBits(zzhw.zzo(t, j)));
                    i2 = i + zzba;
                    break;
                case 1:
                    i = i2 * 53;
                    zzba = Float.floatToIntBits(zzhw.zzn(t, j));
                    i2 = i + zzba;
                    break;
                case 2:
                    i = i2 * 53;
                    zzba = zzfb.zzba(zzhw.zzl(t, j));
                    i2 = i + zzba;
                    break;
                case 3:
                    i = i2 * 53;
                    zzba = zzfb.zzba(zzhw.zzl(t, j));
                    i2 = i + zzba;
                    break;
                case 4:
                    i = i2 * 53;
                    zzba = zzhw.zzk(t, j);
                    i2 = i + zzba;
                    break;
                case 5:
                    i = i2 * 53;
                    zzba = zzfb.zzba(zzhw.zzl(t, j));
                    i2 = i + zzba;
                    break;
                case 6:
                    i = i2 * 53;
                    zzba = zzhw.zzk(t, j);
                    i2 = i + zzba;
                    break;
                case 7:
                    i = i2 * 53;
                    zzba = zzfb.zzo(zzhw.zzm(t, j));
                    i2 = i + zzba;
                    break;
                case 8:
                    i = i2 * 53;
                    zzba = ((String) zzhw.zzp(t, j)).hashCode();
                    i2 = i + zzba;
                    break;
                case 9:
                    Object zzp = zzhw.zzp(t, j);
                    if (zzp != null) {
                        i5 = zzp.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzba = zzhw.zzp(t, j).hashCode();
                    i2 = i + zzba;
                    break;
                case 11:
                    i = i2 * 53;
                    zzba = zzhw.zzk(t, j);
                    i2 = i + zzba;
                    break;
                case 12:
                    i = i2 * 53;
                    zzba = zzhw.zzk(t, j);
                    i2 = i + zzba;
                    break;
                case 13:
                    i = i2 * 53;
                    zzba = zzhw.zzk(t, j);
                    i2 = i + zzba;
                    break;
                case 14:
                    i = i2 * 53;
                    zzba = zzfb.zzba(zzhw.zzl(t, j));
                    i2 = i + zzba;
                    break;
                case 15:
                    i = i2 * 53;
                    zzba = zzhw.zzk(t, j);
                    i2 = i + zzba;
                    break;
                case 16:
                    i = i2 * 53;
                    zzba = zzfb.zzba(zzhw.zzl(t, j));
                    i2 = i + zzba;
                    break;
                case 17:
                    Object zzp2 = zzhw.zzp(t, j);
                    if (zzp2 != null) {
                        i5 = zzp2.hashCode();
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
                    zzba = zzhw.zzp(t, j).hashCode();
                    i2 = i + zzba;
                    break;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    i = i2 * 53;
                    zzba = zzhw.zzp(t, j).hashCode();
                    i2 = i + zzba;
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzfb.zzba(Double.doubleToLongBits(zzf(t, j)));
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = Float.floatToIntBits(zzg(t, j));
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzfb.zzba(zzi(t, j));
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzfb.zzba(zzi(t, j));
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzh(t, j);
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzfb.zzba(zzi(t, j));
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzh(t, j);
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzfb.zzo(zzj(t, j));
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = ((String) zzhw.zzp(t, j)).hashCode();
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzhw.zzp(t, j).hashCode();
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzhw.zzp(t, j).hashCode();
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzh(t, j);
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzh(t, j);
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzh(t, j);
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzfb.zzba(zzi(t, j));
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzh(t, j);
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzfb.zzba(zzi(t, j));
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzgl<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzba = zzhw.zzp(t, j).hashCode();
                        i2 = i + zzba;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzajo.zzw(t).hashCode();
        return this.zzajf ? (hashCode * 53) + this.zzajp.zzg(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final T newInstance() {
        return (T) this.zzajm.newInstance(this.zzaje);
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzc(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.zzaja.length; i += 3) {
            int zzba = zzba(i);
            long j = 1048575 & zzba;
            int i2 = this.zzaja[i];
            switch ((zzba & 267386880) >>> 20) {
                case 0:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zza(t, j, zzhw.zzo(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zza((Object) t, j, zzhw.zzn(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zza((Object) t, j, zzhw.zzl(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zza((Object) t, j, zzhw.zzl(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zzb(t, j, zzhw.zzk(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zza((Object) t, j, zzhw.zzl(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zzb(t, j, zzhw.zzk(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zza(t, j, zzhw.zzm(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zza(t, j, zzhw.zzp(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zza(t, j, zzhw.zzp(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zzb(t, j, zzhw.zzk(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zzb(t, j, zzhw.zzk(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zzb(t, j, zzhw.zzk(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zza((Object) t, j, zzhw.zzl(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zzb(t, j, zzhw.zzk(t2, j));
                        zzb((zzgl<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((zzgl<T>) t2, i)) {
                        zzhw.zza((Object) t, j, zzhw.zzl(t2, j));
                        zzb((zzgl<T>) t, i);
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
                    this.zzajn.zza(t, t2, j);
                    break;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    zzha.zza(this.zzajq, t, t2, j);
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
                    if (zza((zzgl<T>) t2, i2, i)) {
                        zzhw.zza(t, j, zzhw.zzp(t2, j));
                        zzb((zzgl<T>) t, i2, i);
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
                    if (zza((zzgl<T>) t2, i2, i)) {
                        zzhw.zza(t, j, zzhw.zzp(t2, j));
                        zzb((zzgl<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        if (this.zzajh) {
            return;
        }
        zzha.zza(this.zzajo, t, t2);
        if (this.zzajf) {
            zzha.zza(this.zzajp, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzi(T t) {
        int i;
        int i2 = this.zzajk;
        while (true) {
            i = this.zzajl;
            if (i2 >= i) {
                break;
            }
            long zzba = zzba(this.zzajj[i2]) & 1048575;
            Object zzp = zzhw.zzp(t, zzba);
            if (zzp != null) {
                zzhw.zza(t, zzba, this.zzajq.zzp(zzp));
            }
            i2++;
        }
        int length = this.zzajj.length;
        while (i < length) {
            this.zzajn.zzb(t, this.zzajj[i]);
            i++;
        }
        this.zzajo.zzi(t);
        if (this.zzajf) {
            this.zzajp.zzi(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzs(T t) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j;
        int zzd;
        int zzc;
        int zzk;
        boolean z3;
        int zzv;
        int zzab;
        int zzaj;
        int zzal;
        int zzb;
        int zzab2;
        int zzaj2;
        int zzal2;
        int i3 = 267386880;
        if (this.zzajh) {
            Unsafe unsafe = zzaiz;
            int i4 = 0;
            int i5 = 0;
            while (i4 < this.zzaja.length) {
                int zzba = zzba(i4);
                int i6 = (zzba & i3) >>> 20;
                int i7 = this.zzaja[i4];
                long j2 = zzba & 1048575;
                int i8 = (i6 < zzet.zzafe.id() || i6 > zzet.zzafr.id()) ? 0 : this.zzaja[i4 + 2] & 1048575;
                switch (i6) {
                    case 0:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzb(i7, 0.0d);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 1:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzb(i7, 0.0f);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 2:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzd(i7, zzhw.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 3:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zze(i7, zzhw.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 4:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzg(i7, zzhw.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 5:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzg(i7, 0L);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 6:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzj(i7, 0);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 7:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzc(i7, true);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 8:
                        if (zza((zzgl<T>) t, i4)) {
                            Object zzp = zzhw.zzp(t, j2);
                            if (zzp instanceof zzdp) {
                                zzb = zzeg.zzc(i7, (zzdp) zzp);
                                break;
                            } else {
                                zzb = zzeg.zzc(i7, (String) zzp);
                                break;
                            }
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 9:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzha.zzc(i7, zzhw.zzp(t, j2), zzax(i4));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 10:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzc(i7, (zzdp) zzhw.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 11:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzh(i7, zzhw.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 12:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzl(i7, zzhw.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 13:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzk(i7, 0);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 14:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzh(i7, 0L);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 15:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzi(i7, zzhw.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 16:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzf(i7, zzhw.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 17:
                        if (zza((zzgl<T>) t, i4)) {
                            zzb = zzeg.zzc(i7, (zzgh) zzhw.zzp(t, j2), zzax(i4));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 18:
                        zzb = zzha.zzw(i7, zze(t, j2), false);
                        break;
                    case 19:
                        zzb = zzha.zzv(i7, zze(t, j2), false);
                        break;
                    case 20:
                        zzb = zzha.zzo(i7, zze(t, j2), false);
                        break;
                    case 21:
                        zzb = zzha.zzp(i7, zze(t, j2), false);
                        break;
                    case 22:
                        zzb = zzha.zzs(i7, zze(t, j2), false);
                        break;
                    case 23:
                        zzb = zzha.zzw(i7, zze(t, j2), false);
                        break;
                    case 24:
                        zzb = zzha.zzv(i7, zze(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                        zzb = zzha.zzx(i7, zze(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                        zzb = zzha.zzc(i7, zze(t, j2));
                        break;
                    case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                        zzb = zzha.zzc(i7, (List<?>) zze(t, j2), zzax(i4));
                        break;
                    case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                        zzb = zzha.zzd(i7, zze(t, j2));
                        break;
                    case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                        zzb = zzha.zzt(i7, zze(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                        zzb = zzha.zzr(i7, zze(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                        zzb = zzha.zzv(i7, zze(t, j2), false);
                        break;
                    case 32:
                        zzb = zzha.zzw(i7, zze(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                        zzb = zzha.zzu(i7, zze(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                        zzb = zzha.zzq(i7, zze(t, j2), false);
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                        zzab2 = zzha.zzab((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                        zzab2 = zzha.zzaa((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                        zzab2 = zzha.zzt((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                        zzab2 = zzha.zzu((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                        zzab2 = zzha.zzx((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                        zzab2 = zzha.zzab((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                        zzab2 = zzha.zzaa((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                        zzab2 = zzha.zzac((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                        zzab2 = zzha.zzy((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                        zzab2 = zzha.zzw((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                        zzab2 = zzha.zzaa((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                        zzab2 = zzha.zzab((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                        zzab2 = zzha.zzz((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                        zzab2 = zzha.zzv((List) unsafe.getObject(t, j2));
                        if (zzab2 > 0) {
                            if (this.zzaji) {
                                unsafe.putInt(t, i8, zzab2);
                            }
                            zzaj2 = zzeg.zzaj(i7);
                            zzal2 = zzeg.zzal(zzab2);
                            zzb = zzaj2 + zzal2 + zzab2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                        zzb = zzha.zzd(i7, zze(t, j2), zzax(i4));
                        break;
                    case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                        zzb = this.zzajq.zzb(i7, zzhw.zzp(t, j2), zzay(i4));
                        break;
                    case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzb(i7, 0.0d);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 52:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzb(i7, 0.0f);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 53:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzd(i7, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 54:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zze(i7, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 55:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzg(i7, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 56:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzg(i7, 0L);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 57:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzj(i7, 0);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 58:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzc(i7, true);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 59:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            Object zzp2 = zzhw.zzp(t, j2);
                            if (zzp2 instanceof zzdp) {
                                zzb = zzeg.zzc(i7, (zzdp) zzp2);
                                break;
                            } else {
                                zzb = zzeg.zzc(i7, (String) zzp2);
                                break;
                            }
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 60:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzha.zzc(i7, zzhw.zzp(t, j2), zzax(i4));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 61:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzc(i7, (zzdp) zzhw.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 62:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzh(i7, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 63:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzl(i7, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 64:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzk(i7, 0);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 65:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzh(i7, 0L);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 66:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzi(i7, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 67:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzf(i7, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 68:
                        if (zza((zzgl<T>) t, i7, i4)) {
                            zzb = zzeg.zzc(i7, (zzgh) zzhw.zzp(t, j2), zzax(i4));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    default:
                        i4 += 3;
                        i3 = 267386880;
                }
                i5 += zzb;
                i4 += 3;
                i3 = 267386880;
            }
            return i5 + zza(this.zzajo, t);
        }
        Unsafe unsafe2 = zzaiz;
        int i9 = -1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzaja.length; i12 += 3) {
            int zzba2 = zzba(i12);
            int[] iArr = this.zzaja;
            int i13 = iArr[i12];
            int i14 = (zzba2 & 267386880) >>> 20;
            if (i14 <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & 1048575;
                i2 = 1 << (i15 >>> 20);
                if (i16 != i9) {
                    i11 = unsafe2.getInt(t, i16);
                    i9 = i16;
                }
                i = i15;
            } else {
                i = (!this.zzaji || i14 < zzet.zzafe.id() || i14 > zzet.zzafr.id()) ? 0 : this.zzaja[i12 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = zzba2 & 1048575;
            switch (i14) {
                case 0:
                    z = false;
                    z2 = false;
                    j = 0;
                    if ((i11 & i2) != 0) {
                        i10 += zzeg.zzb(i13, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    z = false;
                    j = 0;
                    if ((i11 & i2) != 0) {
                        z2 = false;
                        i10 += zzeg.zzb(i13, 0.0f);
                        break;
                    }
                    z2 = false;
                case 2:
                    z = false;
                    j = 0;
                    if ((i11 & i2) != 0) {
                        zzd = zzeg.zzd(i13, unsafe2.getLong(t, j3));
                        i10 += zzd;
                    }
                    z2 = false;
                    break;
                case 3:
                    z = false;
                    j = 0;
                    if ((i11 & i2) != 0) {
                        zzd = zzeg.zze(i13, unsafe2.getLong(t, j3));
                        i10 += zzd;
                    }
                    z2 = false;
                    break;
                case 4:
                    z = false;
                    j = 0;
                    if ((i11 & i2) != 0) {
                        zzd = zzeg.zzg(i13, unsafe2.getInt(t, j3));
                        i10 += zzd;
                    }
                    z2 = false;
                    break;
                case 5:
                    z = false;
                    j = 0;
                    if ((i11 & i2) != 0) {
                        zzd = zzeg.zzg(i13, 0L);
                        i10 += zzd;
                    }
                    z2 = false;
                    break;
                case 6:
                    if ((i11 & i2) != 0) {
                        z = false;
                        i10 += zzeg.zzj(i13, 0);
                        z2 = false;
                        j = 0;
                        break;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                case 7:
                    if ((i11 & i2) != 0) {
                        zzc = zzeg.zzc(i13, true);
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 8:
                    if ((i11 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzdp) {
                            zzc = zzeg.zzc(i13, (zzdp) object);
                        } else {
                            zzc = zzeg.zzc(i13, (String) object);
                        }
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 9:
                    if ((i11 & i2) != 0) {
                        zzc = zzha.zzc(i13, unsafe2.getObject(t, j3), zzax(i12));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 10:
                    if ((i11 & i2) != 0) {
                        zzc = zzeg.zzc(i13, (zzdp) unsafe2.getObject(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 11:
                    if ((i11 & i2) != 0) {
                        zzc = zzeg.zzh(i13, unsafe2.getInt(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 12:
                    if ((i11 & i2) != 0) {
                        zzc = zzeg.zzl(i13, unsafe2.getInt(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 13:
                    if ((i11 & i2) != 0) {
                        zzk = zzeg.zzk(i13, 0);
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 14:
                    if ((i11 & i2) != 0) {
                        zzc = zzeg.zzh(i13, 0L);
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 15:
                    if ((i11 & i2) != 0) {
                        zzc = zzeg.zzi(i13, unsafe2.getInt(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 16:
                    if ((i11 & i2) != 0) {
                        zzc = zzeg.zzf(i13, unsafe2.getLong(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 17:
                    if ((i11 & i2) != 0) {
                        zzc = zzeg.zzc(i13, (zzgh) unsafe2.getObject(t, j3), zzax(i12));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 18:
                    zzc = zzha.zzw(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzc;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 19:
                    z3 = false;
                    zzv = zzha.zzv(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzv;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 20:
                    z3 = false;
                    zzv = zzha.zzo(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzv;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 21:
                    z3 = false;
                    zzv = zzha.zzp(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzv;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 22:
                    z3 = false;
                    zzv = zzha.zzs(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzv;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 23:
                    z3 = false;
                    zzv = zzha.zzw(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzv;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 24:
                    z3 = false;
                    zzv = zzha.zzv(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzv;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    z3 = false;
                    zzv = zzha.zzx(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzv;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    zzc = zzha.zzc(i13, (List) unsafe2.getObject(t, j3));
                    i10 += zzc;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    zzc = zzha.zzc(i13, (List<?>) unsafe2.getObject(t, j3), zzax(i12));
                    i10 += zzc;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    zzc = zzha.zzd(i13, (List) unsafe2.getObject(t, j3));
                    i10 += zzc;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    zzc = zzha.zzt(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzc;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    z3 = false;
                    zzv = zzha.zzr(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzv;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    z3 = false;
                    zzv = zzha.zzv(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzv;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case 32:
                    z3 = false;
                    zzv = zzha.zzw(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzv;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    z3 = false;
                    zzv = zzha.zzu(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzv;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    z3 = false;
                    zzv = zzha.zzq(i13, (List) unsafe2.getObject(t, j3), false);
                    i10 += zzv;
                    z = z3;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    zzab = zzha.zzab((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    zzab = zzha.zzaa((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    zzab = zzha.zzt((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    zzab = zzha.zzu((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    zzab = zzha.zzx((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    zzab = zzha.zzab((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    zzab = zzha.zzaa((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    zzab = zzha.zzac((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    zzab = zzha.zzy((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    zzab = zzha.zzw((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    zzab = zzha.zzaa((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    zzab = zzha.zzab((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    zzab = zzha.zzz((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    zzab = zzha.zzv((List) unsafe2.getObject(t, j3));
                    if (zzab > 0) {
                        if (this.zzaji) {
                            unsafe2.putInt(t, i, zzab);
                        }
                        zzaj = zzeg.zzaj(i13);
                        zzal = zzeg.zzal(zzab);
                        zzk = zzaj + zzal + zzab;
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                    zzc = zzha.zzd(i13, (List) unsafe2.getObject(t, j3), zzax(i12));
                    i10 += zzc;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    zzc = this.zzajq.zzb(i13, unsafe2.getObject(t, j3), zzay(i12));
                    i10 += zzc;
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zzb(i13, 0.0d);
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 52:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzk = zzeg.zzb(i13, 0.0f);
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 53:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zzd(i13, zzi(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 54:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zze(i13, zzi(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 55:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zzg(i13, zzh(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 56:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zzg(i13, 0L);
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 57:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzk = zzeg.zzj(i13, 0);
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 58:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zzc(i13, true);
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 59:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzdp) {
                            zzc = zzeg.zzc(i13, (zzdp) object2);
                        } else {
                            zzc = zzeg.zzc(i13, (String) object2);
                        }
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 60:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzha.zzc(i13, unsafe2.getObject(t, j3), zzax(i12));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 61:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zzc(i13, (zzdp) unsafe2.getObject(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 62:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zzh(i13, zzh(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 63:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zzl(i13, zzh(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 64:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzk = zzeg.zzk(i13, 0);
                        i10 += zzk;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 65:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zzh(i13, 0L);
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 66:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zzi(i13, zzh(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 67:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zzf(i13, zzi(t, j3));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                case 68:
                    if (zza((zzgl<T>) t, i13, i12)) {
                        zzc = zzeg.zzc(i13, (zzgh) unsafe2.getObject(t, j3), zzax(i12));
                        i10 += zzc;
                    }
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
                default:
                    z = false;
                    z2 = false;
                    j = 0;
                    break;
            }
        }
        int zza = i10 + zza(this.zzajo, t);
        return this.zzajf ? zza + this.zzajp.zzg(t).zzly() : zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.measurement.zzgy] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.measurement.zzgy] */
    @Override // com.google.android.gms.internal.measurement.zzgy
    public final boolean zzu(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.zzajk) {
                return !this.zzajf || this.zzajp.zzg(t).isInitialized();
            }
            int i5 = this.zzajj[i3];
            int i6 = this.zzaja[i5];
            int zzba = zzba(i5);
            if (this.zzajh) {
                i = 0;
            } else {
                int i7 = this.zzaja[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = zzaiz.getInt(t, i8);
                    i2 = i8;
                }
            }
            if (((268435456 & zzba) != 0) && !zza((zzgl<T>) t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & zzba) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (zza((zzgl<T>) t, i6, i5) && !zza(t, zzba, zzax(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzn = this.zzajq.zzn(zzhw.zzp(t, zzba & 1048575));
                            if (!zzn.isEmpty()) {
                                if (this.zzajq.zzr(zzay(i5)).zzaiu.zzpb() == zzik.MESSAGE) {
                                    zzgy<T> zzgyVar = 0;
                                    Iterator<?> it = zzn.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzgyVar == null) {
                                            zzgyVar = zzgu.zznz().zzf(next.getClass());
                                        }
                                        boolean zzu = zzgyVar.zzu(next);
                                        zzgyVar = zzgyVar;
                                        if (!zzu) {
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
                List list = (List) zzhw.zzp(t, zzba & 1048575);
                if (!list.isEmpty()) {
                    ?? zzax = zzax(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!zzax.zzu(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (zza((zzgl<T>) t, i5, i4, i) && !zza(t, zzba, zzax(i5))) {
                return false;
            }
            i3++;
        }
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzhw.zzp(t, j)).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0494  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(T r19, com.google.android.gms.internal.measurement.zzil r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgl.zzb(java.lang.Object, com.google.android.gms.internal.measurement.zzil):void");
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzgl<T>) t, i) == zza((zzgl<T>) t2, i);
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

    private final void zza(T t, T t2, int i) {
        long zzba = zzba(i) & 1048575;
        if (zza((zzgl<T>) t2, i)) {
            Object zzp = zzhw.zzp(t, zzba);
            Object zzp2 = zzhw.zzp(t2, zzba);
            if (zzp != null && zzp2 != null) {
                zzhw.zza(t, zzba, zzfb.zza(zzp, zzp2));
                zzb((zzgl<T>) t, i);
            } else if (zzp2 != null) {
                zzhw.zza(t, zzba, zzp2);
                zzb((zzgl<T>) t, i);
            }
        }
    }

    private static <UT, UB> int zza(zzhq<UT, UB> zzhqVar, T t) {
        return zzhqVar.zzs(zzhqVar.zzw(t));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a26  */
    @Override // com.google.android.gms.internal.measurement.zzgy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r14, com.google.android.gms.internal.measurement.zzil r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgl.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzil):void");
    }

    private final void zzb(T t, int i) {
        if (this.zzajh) {
            return;
        }
        int zzbb = zzbb(i);
        long j = zzbb & 1048575;
        zzhw.zzb(t, j, zzhw.zzk(t, j) | (1 << (zzbb >>> 20)));
    }

    private final void zzb(T t, int i, int i2) {
        zzhw.zzb(t, zzbb(i2) & 1048575, i);
    }

    private final <K, V> void zza(zzil zzilVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzilVar.zza(i, this.zzajq.zzr(zzay(i2)), this.zzajq.zzn(obj));
        }
    }

    private static <UT, UB> void zza(zzhq<UT, UB> zzhqVar, T t, zzil zzilVar) throws IOException {
        zzhqVar.zza((zzhq<UT, UB>) zzhqVar.zzw(t), zzilVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zza(T t, zzgx zzgxVar, zzem zzemVar) throws IOException {
        Objects.requireNonNull(zzemVar);
        zzhq zzhqVar = this.zzajo;
        zzen<?> zzenVar = this.zzajp;
        zzeq<?> zzeqVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzlh = zzgxVar.zzlh();
                int zzbd = zzbd(zzlh);
                if (zzbd >= 0) {
                    int zzba = zzba(zzbd);
                    switch ((267386880 & zzba) >>> 20) {
                        case 0:
                            zzhw.zza(t, zzba & 1048575, zzgxVar.readDouble());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 1:
                            zzhw.zza((Object) t, zzba & 1048575, zzgxVar.readFloat());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 2:
                            zzhw.zza((Object) t, zzba & 1048575, zzgxVar.zzkl());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 3:
                            zzhw.zza((Object) t, zzba & 1048575, zzgxVar.zzkk());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 4:
                            zzhw.zzb(t, zzba & 1048575, zzgxVar.zzkm());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 5:
                            zzhw.zza((Object) t, zzba & 1048575, zzgxVar.zzkn());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 6:
                            zzhw.zzb(t, zzba & 1048575, zzgxVar.zzko());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 7:
                            zzhw.zza(t, zzba & 1048575, zzgxVar.zzkp());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 8:
                            zza(t, zzba, zzgxVar);
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 9:
                            if (zza((zzgl<T>) t, zzbd)) {
                                long j = zzba & 1048575;
                                zzhw.zza(t, j, zzfb.zza(zzhw.zzp(t, j), zzgxVar.zza(zzax(zzbd), zzemVar)));
                                break;
                            } else {
                                zzhw.zza(t, zzba & 1048575, zzgxVar.zza(zzax(zzbd), zzemVar));
                                zzb((zzgl<T>) t, zzbd);
                                continue;
                            }
                        case 10:
                            zzhw.zza(t, zzba & 1048575, zzgxVar.zzkr());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 11:
                            zzhw.zzb(t, zzba & 1048575, zzgxVar.zzks());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 12:
                            int zzkt = zzgxVar.zzkt();
                            zzfe zzaz = zzaz(zzbd);
                            if (zzaz != null && !zzaz.zzf(zzkt)) {
                                obj = zzha.zza(zzlh, zzkt, obj, zzhqVar);
                                break;
                            }
                            zzhw.zzb(t, zzba & 1048575, zzkt);
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 13:
                            zzhw.zzb(t, zzba & 1048575, zzgxVar.zzku());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 14:
                            zzhw.zza((Object) t, zzba & 1048575, zzgxVar.zzkv());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 15:
                            zzhw.zzb(t, zzba & 1048575, zzgxVar.zzkw());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 16:
                            zzhw.zza((Object) t, zzba & 1048575, zzgxVar.zzkx());
                            zzb((zzgl<T>) t, zzbd);
                            continue;
                        case 17:
                            if (zza((zzgl<T>) t, zzbd)) {
                                long j2 = zzba & 1048575;
                                zzhw.zza(t, j2, zzfb.zza(zzhw.zzp(t, j2), zzgxVar.zzb(zzax(zzbd), zzemVar)));
                                break;
                            } else {
                                zzhw.zza(t, zzba & 1048575, zzgxVar.zzb(zzax(zzbd), zzemVar));
                                zzb((zzgl<T>) t, zzbd);
                                continue;
                            }
                        case 18:
                            zzgxVar.zzd(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case 19:
                            zzgxVar.zze(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case 20:
                            zzgxVar.zzg(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case 21:
                            zzgxVar.zzf(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case 22:
                            zzgxVar.zzh(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case 23:
                            zzgxVar.zzi(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case 24:
                            zzgxVar.zzj(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                            zzgxVar.zzk(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                            if (zzbc(zzba)) {
                                zzgxVar.zzl(this.zzajn.zza(t, zzba & 1048575));
                                break;
                            } else {
                                zzgxVar.readStringList(this.zzajn.zza(t, zzba & 1048575));
                                continue;
                            }
                        case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                            zzgxVar.zza(this.zzajn.zza(t, zzba & 1048575), zzax(zzbd), zzemVar);
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                            zzgxVar.zzm(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                            zzgxVar.zzn(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                            List<Integer> zza = this.zzajn.zza(t, zzba & 1048575);
                            zzgxVar.zzo(zza);
                            obj = zzha.zza(zzlh, zza, zzaz(zzbd), obj, zzhqVar);
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                            zzgxVar.zzp(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case 32:
                            zzgxVar.zzq(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                            zzgxVar.zzr(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                            zzgxVar.zzs(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                            zzgxVar.zzd(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                            zzgxVar.zze(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                            zzgxVar.zzg(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                            zzgxVar.zzf(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                            zzgxVar.zzh(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                            zzgxVar.zzi(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                            zzgxVar.zzj(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                            zzgxVar.zzk(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                            zzgxVar.zzn(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                            List<Integer> zza2 = this.zzajn.zza(t, zzba & 1048575);
                            zzgxVar.zzo(zza2);
                            obj = zzha.zza(zzlh, zza2, zzaz(zzbd), obj, zzhqVar);
                            continue;
                        case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                            zzgxVar.zzp(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                            zzgxVar.zzq(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                            zzgxVar.zzr(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                            zzgxVar.zzs(this.zzajn.zza(t, zzba & 1048575));
                            continue;
                        case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                            zzgxVar.zzb(this.zzajn.zza(t, zzba & 1048575), zzax(zzbd), zzemVar);
                            continue;
                        case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                            Object zzay = zzay(zzbd);
                            long zzba2 = zzba(zzbd) & 1048575;
                            Object zzp = zzhw.zzp(t, zzba2);
                            if (zzp == null) {
                                zzp = this.zzajq.zzq(zzay);
                                zzhw.zza(t, zzba2, zzp);
                            } else if (this.zzajq.zzo(zzp)) {
                                Object zzq = this.zzajq.zzq(zzay);
                                this.zzajq.zzb(zzq, zzp);
                                zzhw.zza(t, zzba2, zzq);
                                zzp = zzq;
                            }
                            zzgxVar.zza(this.zzajq.zzm(zzp), this.zzajq.zzr(zzay), zzemVar);
                            continue;
                        case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                            zzhw.zza(t, zzba & 1048575, Double.valueOf(zzgxVar.readDouble()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 52:
                            zzhw.zza(t, zzba & 1048575, Float.valueOf(zzgxVar.readFloat()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 53:
                            zzhw.zza(t, zzba & 1048575, Long.valueOf(zzgxVar.zzkl()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 54:
                            zzhw.zza(t, zzba & 1048575, Long.valueOf(zzgxVar.zzkk()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 55:
                            zzhw.zza(t, zzba & 1048575, Integer.valueOf(zzgxVar.zzkm()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 56:
                            zzhw.zza(t, zzba & 1048575, Long.valueOf(zzgxVar.zzkn()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 57:
                            zzhw.zza(t, zzba & 1048575, Integer.valueOf(zzgxVar.zzko()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 58:
                            zzhw.zza(t, zzba & 1048575, Boolean.valueOf(zzgxVar.zzkp()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 59:
                            zza(t, zzba, zzgxVar);
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 60:
                            if (zza((zzgl<T>) t, zzlh, zzbd)) {
                                long j3 = zzba & 1048575;
                                zzhw.zza(t, j3, zzfb.zza(zzhw.zzp(t, j3), zzgxVar.zza(zzax(zzbd), zzemVar)));
                            } else {
                                zzhw.zza(t, zzba & 1048575, zzgxVar.zza(zzax(zzbd), zzemVar));
                                zzb((zzgl<T>) t, zzbd);
                            }
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 61:
                            zzhw.zza(t, zzba & 1048575, zzgxVar.zzkr());
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 62:
                            zzhw.zza(t, zzba & 1048575, Integer.valueOf(zzgxVar.zzks()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 63:
                            int zzkt2 = zzgxVar.zzkt();
                            zzfe zzaz2 = zzaz(zzbd);
                            if (zzaz2 != null && !zzaz2.zzf(zzkt2)) {
                                obj = zzha.zza(zzlh, zzkt2, obj, zzhqVar);
                                break;
                            }
                            zzhw.zza(t, zzba & 1048575, Integer.valueOf(zzkt2));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 64:
                            zzhw.zza(t, zzba & 1048575, Integer.valueOf(zzgxVar.zzku()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 65:
                            zzhw.zza(t, zzba & 1048575, Long.valueOf(zzgxVar.zzkv()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 66:
                            zzhw.zza(t, zzba & 1048575, Integer.valueOf(zzgxVar.zzkw()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 67:
                            zzhw.zza(t, zzba & 1048575, Long.valueOf(zzgxVar.zzkx()));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        case 68:
                            zzhw.zza(t, zzba & 1048575, zzgxVar.zzb(zzax(zzbd), zzemVar));
                            zzb((zzgl<T>) t, zzlh, zzbd);
                            continue;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzhqVar.zzoq();
                                } catch (zzfi unused) {
                                    zzhqVar.zza(zzgxVar);
                                    if (obj == null) {
                                        obj = zzhqVar.zzx(t);
                                    }
                                    if (!zzhqVar.zza((zzhq) obj, zzgxVar)) {
                                        for (int i = this.zzajk; i < this.zzajl; i++) {
                                            obj = zza((Object) t, this.zzajj[i], (int) obj, (zzhq<UT, int>) zzhqVar);
                                        }
                                        if (obj != null) {
                                            zzhqVar.zzf(t, obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzhqVar.zza((zzhq) obj, zzgxVar)) {
                                for (int i2 = this.zzajk; i2 < this.zzajl; i2++) {
                                    obj = zza((Object) t, this.zzajj[i2], (int) obj, (zzhq<UT, int>) zzhqVar);
                                }
                                if (obj != null) {
                                    zzhqVar.zzf(t, obj);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                } else if (zzlh == Integer.MAX_VALUE) {
                    for (int i3 = this.zzajk; i3 < this.zzajl; i3++) {
                        obj = zza((Object) t, this.zzajj[i3], (int) obj, (zzhq<UT, int>) zzhqVar);
                    }
                    if (obj != null) {
                        zzhqVar.zzf(t, obj);
                        return;
                    }
                    return;
                } else {
                    Object zza3 = !this.zzajf ? null : zzenVar.zza(zzemVar, this.zzaje, zzlh);
                    if (zza3 != null) {
                        if (zzeqVar == null) {
                            zzeqVar = zzenVar.zzh(t);
                        }
                        zzeq<?> zzeqVar2 = zzeqVar;
                        obj = zzenVar.zza(zzgxVar, zza3, zzemVar, zzeqVar2, obj, zzhqVar);
                        zzeqVar = zzeqVar2;
                    } else {
                        zzhqVar.zza(zzgxVar);
                        if (obj == null) {
                            obj = zzhqVar.zzx(t);
                        }
                        if (!zzhqVar.zza((zzhq) obj, zzgxVar)) {
                            for (int i4 = this.zzajk; i4 < this.zzajl; i4++) {
                                obj = zza((Object) t, this.zzajj[i4], (int) obj, (zzhq<UT, int>) zzhqVar);
                            }
                            if (obj != null) {
                                zzhqVar.zzf(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzajk; i5 < this.zzajl; i5++) {
                    obj = zza((Object) t, this.zzajj[i5], (int) obj, (zzhq<UT, int>) zzhqVar);
                }
                if (obj != null) {
                    zzhqVar.zzf(t, obj);
                }
                throw th;
            }
        }
    }

    private static int zza(byte[] bArr, int i, int i2, zzif zzifVar, Class<?> cls, zzdm zzdmVar) throws IOException {
        switch (zzgm.zzacu[zzifVar.ordinal()]) {
            case 1:
                int zzb = zzdl.zzb(bArr, i, zzdmVar);
                zzdmVar.zzabu = Boolean.valueOf(zzdmVar.zzabt != 0);
                return zzb;
            case 2:
                return zzdl.zze(bArr, i, zzdmVar);
            case 3:
                zzdmVar.zzabu = Double.valueOf(zzdl.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzdmVar.zzabu = Integer.valueOf(zzdl.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzdmVar.zzabu = Long.valueOf(zzdl.zzb(bArr, i));
                return i + 8;
            case 8:
                zzdmVar.zzabu = Float.valueOf(zzdl.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = zzdl.zza(bArr, i, zzdmVar);
                zzdmVar.zzabu = Integer.valueOf(zzdmVar.zzabs);
                return zza;
            case 12:
            case 13:
                int zzb2 = zzdl.zzb(bArr, i, zzdmVar);
                zzdmVar.zzabu = Long.valueOf(zzdmVar.zzabt);
                return zzb2;
            case 14:
                return zzdl.zza(zzgu.zznz().zzf(cls), bArr, i, i2, zzdmVar);
            case 15:
                int zza2 = zzdl.zza(bArr, i, zzdmVar);
                zzdmVar.zzabu = Integer.valueOf(zzeb.zzaa(zzdmVar.zzabs));
                return zza2;
            case 16:
                int zzb3 = zzdl.zzb(bArr, i, zzdmVar);
                zzdmVar.zzabu = Long.valueOf(zzeb.zzap(zzdmVar.zzabt));
                return zzb3;
            case 17:
                return zzdl.zzd(bArr, i, zzdmVar);
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
    private final int zza(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zzdm r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgl.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzdm):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzdm zzdmVar) throws IOException {
        Unsafe unsafe = zzaiz;
        Object zzay = zzay(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzajq.zzo(object)) {
            Object zzq = this.zzajq.zzq(zzay);
            this.zzajq.zzb(zzq, object);
            unsafe.putObject(t, j, zzq);
            object = zzq;
        }
        zzga<?, ?> zzr = this.zzajq.zzr(zzay);
        Map<?, ?> zzm = this.zzajq.zzm(object);
        int zza = zzdl.zza(bArr, i, zzdmVar);
        int i4 = zzdmVar.zzabs;
        if (i4 >= 0 && i4 <= i2 - zza) {
            int i5 = i4 + zza;
            Object obj = (K) zzr.zzait;
            Object obj2 = (V) zzr.zzzw;
            while (zza < i5) {
                int i6 = zza + 1;
                int i7 = bArr[zza];
                if (i7 < 0) {
                    i6 = zzdl.zza(i7, bArr, i6, zzdmVar);
                    i7 = zzdmVar.zzabs;
                }
                int i8 = i6;
                int i9 = i7 >>> 3;
                int i10 = i7 & 7;
                if (i9 != 1) {
                    if (i9 == 2 && i10 == zzr.zzaiu.zzpc()) {
                        zza = zza(bArr, i8, i2, zzr.zzaiu, zzr.zzzw.getClass(), zzdmVar);
                        obj2 = zzdmVar.zzabu;
                    }
                    zza = zzdl.zza(i7, bArr, i8, i2, zzdmVar);
                } else if (i10 == zzr.zzais.zzpc()) {
                    zza = zza(bArr, i8, i2, zzr.zzais, (Class<?>) null, zzdmVar);
                    obj = (K) zzdmVar.zzabu;
                } else {
                    zza = zzdl.zza(i7, bArr, i8, i2, zzdmVar);
                }
            }
            if (zza == i5) {
                zzm.put(obj, obj2);
                return i5;
            }
            throw zzfh.zznb();
        }
        throw zzfh.zzmu();
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzdm zzdmVar) throws IOException {
        int zzb;
        Unsafe unsafe = zzaiz;
        long j2 = this.zzaja[i8 + 2] & 1048575;
        switch (i7) {
            case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zzdl.zzc(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zzdl.zzd(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb = zzdl.zzb(bArr, i, zzdmVar);
                    unsafe.putObject(t, j, Long.valueOf(zzdmVar.zzabt));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb = zzdl.zza(bArr, i, zzdmVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzdmVar.zzabs));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzdl.zzb(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzdl.zza(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb = zzdl.zzb(bArr, i, zzdmVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzdmVar.zzabt != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza = zzdl.zza(bArr, i, zzdmVar);
                    int i9 = zzdmVar.zzabs;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzhy.zzf(bArr, zza, zza + i9)) {
                        throw zzfh.zznc();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, zza, i9, zzfb.UTF_8));
                        zza += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza2 = zzdl.zza(zzax(i8), bArr, i, i2, zzdmVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzdmVar.zzabu);
                    } else {
                        unsafe.putObject(t, j, zzfb.zza(object, zzdmVar.zzabu));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb = zzdl.zze(bArr, i, zzdmVar);
                    unsafe.putObject(t, j, zzdmVar.zzabu);
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza3 = zzdl.zza(bArr, i, zzdmVar);
                    int i10 = zzdmVar.zzabs;
                    zzfe zzaz = zzaz(i8);
                    if (zzaz != null && !zzaz.zzf(i10)) {
                        zzt(t).zzb(i3, Long.valueOf(i10));
                        return zza3;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i10));
                    zzb = zza3;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb = zzdl.zza(bArr, i, zzdmVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzeb.zzaa(zzdmVar.zzabs)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb = zzdl.zzb(bArr, i, zzdmVar);
                    unsafe.putObject(t, j, Long.valueOf(zzeb.zzap(zzdmVar.zzabt)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb = zzdl.zza(zzax(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdmVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzdmVar.zzabu);
                    } else {
                        unsafe.putObject(t, j, zzfb.zza(object2, zzdmVar.zzabu));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            default:
                return i;
        }
    }

    public final int zza(T t, byte[] bArr, int i, int i2, int i3, zzdm zzdmVar) throws IOException {
        Unsafe unsafe;
        int i4;
        T t2;
        zzgl<T> zzglVar;
        byte b;
        int i5;
        int zzbd;
        int i6;
        int i7;
        int i8;
        int i9;
        T t3;
        zzdm zzdmVar2;
        int i10;
        int i11;
        int i12;
        zzdm zzdmVar3;
        int i13;
        zzdm zzdmVar4;
        int i14;
        int i15;
        zzdm zzdmVar5;
        int i16;
        int i17;
        int i18;
        zzgl<T> zzglVar2 = this;
        T t4 = t;
        byte[] bArr2 = bArr;
        int i19 = i2;
        int i20 = i3;
        zzdm zzdmVar6 = zzdmVar;
        Unsafe unsafe2 = zzaiz;
        int i21 = i;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = -1;
        int i26 = -1;
        while (true) {
            if (i21 < i19) {
                int i27 = i21 + 1;
                byte b2 = bArr2[i21];
                if (b2 < 0) {
                    i5 = zzdl.zza(b2, bArr2, i27, zzdmVar6);
                    b = zzdmVar6.zzabs;
                } else {
                    b = b2;
                    i5 = i27;
                }
                int i28 = b >>> 3;
                int i29 = b & 7;
                if (i28 > i25) {
                    zzbd = zzglVar2.zzp(i28, i22 / 3);
                } else {
                    zzbd = zzglVar2.zzbd(i28);
                }
                int i30 = zzbd;
                if (i30 == -1) {
                    i6 = i28;
                    i7 = i5;
                    i8 = b;
                    unsafe = unsafe2;
                    i4 = i20;
                    i9 = 0;
                } else {
                    int[] iArr = zzglVar2.zzaja;
                    int i31 = iArr[i30 + 1];
                    int i32 = (i31 & 267386880) >>> 20;
                    int i33 = b;
                    long j = i31 & 1048575;
                    if (i32 <= 17) {
                        int i34 = iArr[i30 + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = i34 & 1048575;
                        if (i36 != i26) {
                            if (i26 != -1) {
                                unsafe2.putInt(t4, i26, i24);
                            }
                            i24 = unsafe2.getInt(t4, i36);
                            i26 = i36;
                        }
                        switch (i32) {
                            case 0:
                                i10 = i30;
                                i11 = i28;
                                i13 = i26;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdmVar4 = zzdmVar;
                                i14 = i5;
                                if (i29 == 1) {
                                    zzhw.zza(t4, j, zzdl.zzc(bArr2, i14));
                                    i21 = i14 + 8;
                                    i24 |= i35;
                                    i26 = i13;
                                    i23 = i12;
                                    i22 = i10;
                                    i25 = i11;
                                    zzdmVar6 = zzdmVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 1:
                                i10 = i30;
                                i11 = i28;
                                i13 = i26;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdmVar4 = zzdmVar;
                                i14 = i5;
                                if (i29 == 5) {
                                    zzhw.zza((Object) t4, j, zzdl.zzd(bArr2, i14));
                                    i21 = i14 + 4;
                                    i24 |= i35;
                                    i26 = i13;
                                    i23 = i12;
                                    i22 = i10;
                                    i25 = i11;
                                    zzdmVar6 = zzdmVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                i10 = i30;
                                i11 = i28;
                                i13 = i26;
                                i12 = i33;
                                bArr2 = bArr;
                                i14 = i5;
                                if (i29 == 0) {
                                    int zzb = zzdl.zzb(bArr2, i14, zzdmVar);
                                    unsafe2.putLong(t, j, zzdmVar.zzabt);
                                    i24 |= i35;
                                    i21 = zzb;
                                    i23 = i12;
                                    i22 = i10;
                                    i25 = i11;
                                    zzdmVar6 = zzdmVar;
                                    i26 = i13;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i10 = i30;
                                i11 = i28;
                                i13 = i26;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdmVar4 = zzdmVar;
                                i14 = i5;
                                if (i29 == 0) {
                                    i21 = zzdl.zza(bArr2, i14, zzdmVar4);
                                    unsafe2.putInt(t4, j, zzdmVar4.zzabs);
                                    i24 |= i35;
                                    i26 = i13;
                                    i23 = i12;
                                    i22 = i10;
                                    i25 = i11;
                                    zzdmVar6 = zzdmVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdmVar4 = zzdmVar;
                                if (i29 == 1) {
                                    i13 = i26;
                                    i14 = i5;
                                    unsafe2.putLong(t, j, zzdl.zzb(bArr2, i5));
                                    i21 = i14 + 8;
                                    i24 |= i35;
                                    i26 = i13;
                                    i23 = i12;
                                    i22 = i10;
                                    i25 = i11;
                                    zzdmVar6 = zzdmVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                i15 = i2;
                                zzdmVar5 = zzdmVar;
                                if (i29 == 5) {
                                    unsafe2.putInt(t4, j, zzdl.zza(bArr2, i5));
                                    i21 = i5 + 4;
                                    i24 |= i35;
                                    i23 = i12;
                                    i22 = i10;
                                    i25 = i11;
                                    zzdmVar6 = zzdmVar5;
                                    i20 = i3;
                                    i19 = i15;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 7:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                i15 = i2;
                                zzdmVar5 = zzdmVar;
                                if (i29 == 0) {
                                    int zzb2 = zzdl.zzb(bArr2, i5, zzdmVar5);
                                    zzhw.zza(t4, j, zzdmVar5.zzabt != 0);
                                    i24 |= i35;
                                    i21 = zzb2;
                                    i23 = i12;
                                    i22 = i10;
                                    i25 = i11;
                                    zzdmVar6 = zzdmVar5;
                                    i20 = i3;
                                    i19 = i15;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 8:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                i15 = i2;
                                zzdmVar5 = zzdmVar;
                                if (i29 == 2) {
                                    if ((i31 & 536870912) == 0) {
                                        i21 = zzdl.zzc(bArr2, i5, zzdmVar5);
                                    } else {
                                        i21 = zzdl.zzd(bArr2, i5, zzdmVar5);
                                    }
                                    unsafe2.putObject(t4, j, zzdmVar5.zzabu);
                                    i24 |= i35;
                                    i23 = i12;
                                    i22 = i10;
                                    i25 = i11;
                                    zzdmVar6 = zzdmVar5;
                                    i20 = i3;
                                    i19 = i15;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 9:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdmVar5 = zzdmVar;
                                if (i29 == 2) {
                                    i15 = i2;
                                    i21 = zzdl.zza(zzglVar2.zzax(i10), bArr2, i5, i15, zzdmVar5);
                                    if ((i24 & i35) == 0) {
                                        unsafe2.putObject(t4, j, zzdmVar5.zzabu);
                                    } else {
                                        unsafe2.putObject(t4, j, zzfb.zza(unsafe2.getObject(t4, j), zzdmVar5.zzabu));
                                    }
                                    i24 |= i35;
                                    i23 = i12;
                                    i22 = i10;
                                    i25 = i11;
                                    zzdmVar6 = zzdmVar5;
                                    i20 = i3;
                                    i19 = i15;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 10:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdmVar4 = zzdmVar;
                                if (i29 == 2) {
                                    i21 = zzdl.zze(bArr2, i5, zzdmVar4);
                                    unsafe2.putObject(t4, j, zzdmVar4.zzabu);
                                    i24 |= i35;
                                    i23 = i12;
                                    i22 = i10;
                                    i25 = i11;
                                    zzdmVar6 = zzdmVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 12:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdmVar4 = zzdmVar;
                                if (i29 == 0) {
                                    i21 = zzdl.zza(bArr2, i5, zzdmVar4);
                                    int i37 = zzdmVar4.zzabs;
                                    zzfe zzaz = zzglVar2.zzaz(i10);
                                    if (zzaz != null && !zzaz.zzf(i37)) {
                                        zzt(t).zzb(i12, Long.valueOf(i37));
                                        i23 = i12;
                                        i22 = i10;
                                        i25 = i11;
                                        zzdmVar6 = zzdmVar4;
                                        i19 = i2;
                                        i20 = i3;
                                    } else {
                                        unsafe2.putInt(t4, j, i37);
                                        i24 |= i35;
                                        i23 = i12;
                                        i22 = i10;
                                        i25 = i11;
                                        zzdmVar6 = zzdmVar4;
                                        i19 = i2;
                                        i20 = i3;
                                        break;
                                    }
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                                break;
                            case 15:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                bArr2 = bArr;
                                zzdmVar4 = zzdmVar;
                                if (i29 == 0) {
                                    i21 = zzdl.zza(bArr2, i5, zzdmVar4);
                                    unsafe2.putInt(t4, j, zzeb.zzaa(zzdmVar4.zzabs));
                                    i24 |= i35;
                                    i23 = i12;
                                    i22 = i10;
                                    i25 = i11;
                                    zzdmVar6 = zzdmVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 16:
                                i10 = i30;
                                i11 = i28;
                                i12 = i33;
                                if (i29 == 0) {
                                    bArr2 = bArr;
                                    int zzb3 = zzdl.zzb(bArr2, i5, zzdmVar);
                                    zzdmVar4 = zzdmVar;
                                    unsafe2.putLong(t, j, zzeb.zzap(zzdmVar.zzabt));
                                    i24 |= i35;
                                    i21 = zzb3;
                                    i23 = i12;
                                    i22 = i10;
                                    i25 = i11;
                                    zzdmVar6 = zzdmVar4;
                                    i19 = i2;
                                    i20 = i3;
                                    break;
                                } else {
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            case 17:
                                if (i29 == 3) {
                                    i21 = zzdl.zza(zzglVar2.zzax(i30), bArr, i5, i2, (i28 << 3) | 4, zzdmVar);
                                    if ((i24 & i35) == 0) {
                                        zzdmVar3 = zzdmVar;
                                        unsafe2.putObject(t4, j, zzdmVar3.zzabu);
                                    } else {
                                        zzdmVar3 = zzdmVar;
                                        unsafe2.putObject(t4, j, zzfb.zza(unsafe2.getObject(t4, j), zzdmVar3.zzabu));
                                    }
                                    i24 |= i35;
                                    bArr2 = bArr;
                                    i19 = i2;
                                    i23 = i33;
                                    i22 = i30;
                                    i25 = i28;
                                    i20 = i3;
                                    zzdmVar6 = zzdmVar3;
                                    break;
                                } else {
                                    i10 = i30;
                                    i11 = i28;
                                    i12 = i33;
                                    i13 = i26;
                                    i14 = i5;
                                    i7 = i14;
                                    i9 = i10;
                                    unsafe = unsafe2;
                                    i6 = i11;
                                    i26 = i13;
                                    i8 = i12;
                                    i4 = i3;
                                    break;
                                }
                            default:
                                i10 = i30;
                                i11 = i28;
                                i13 = i26;
                                i12 = i33;
                                i14 = i5;
                                i7 = i14;
                                i9 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                                i26 = i13;
                                i8 = i12;
                                i4 = i3;
                                break;
                        }
                    } else {
                        int i38 = i26;
                        int i39 = i5;
                        bArr2 = bArr;
                        zzdm zzdmVar7 = zzdmVar6;
                        if (i32 != 27) {
                            i16 = i24;
                            if (i32 <= 49) {
                                i6 = i28;
                                i18 = i33;
                                i9 = i30;
                                unsafe = unsafe2;
                                i21 = zza((zzgl<T>) t, bArr, i39, i2, i33, i28, i29, i30, i31, i32, j, zzdmVar);
                                if (i21 == i39) {
                                    i4 = i3;
                                    i7 = i21;
                                } else {
                                    zzglVar2 = this;
                                    t4 = t;
                                    bArr2 = bArr;
                                    i19 = i2;
                                    i20 = i3;
                                    zzdmVar6 = zzdmVar;
                                    i26 = i38;
                                    i22 = i9;
                                    i24 = i16;
                                    i25 = i6;
                                    i23 = i18;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i6 = i28;
                                i17 = i39;
                                i18 = i33;
                                i9 = i30;
                                unsafe = unsafe2;
                                if (i32 != 50) {
                                    i21 = zza((zzgl<T>) t, bArr, i17, i2, i18, i6, i29, i31, i32, j, i9, zzdmVar);
                                    if (i21 != i17) {
                                        zzglVar2 = this;
                                        t4 = t;
                                        i19 = i2;
                                        i20 = i3;
                                        i23 = i18;
                                        i25 = i6;
                                        i26 = i38;
                                        i22 = i9;
                                        i24 = i16;
                                        unsafe2 = unsafe;
                                        bArr2 = bArr;
                                        zzdmVar6 = zzdmVar;
                                    }
                                } else if (i29 == 2) {
                                    i21 = zza((zzgl<T>) t, bArr, i17, i2, i9, j, zzdmVar);
                                    if (i21 != i17) {
                                        zzglVar2 = this;
                                        t4 = t;
                                        bArr2 = bArr;
                                        i19 = i2;
                                        i20 = i3;
                                        zzdmVar6 = zzdmVar;
                                        i26 = i38;
                                        i22 = i9;
                                        i24 = i16;
                                        i25 = i6;
                                        i23 = i18;
                                        unsafe2 = unsafe;
                                    }
                                } else {
                                    i4 = i3;
                                    i7 = i17;
                                }
                                i4 = i3;
                                i7 = i21;
                            }
                        } else if (i29 == 2) {
                            zzfg zzfgVar = (zzfg) unsafe2.getObject(t4, j);
                            if (!zzfgVar.zzjy()) {
                                int size = zzfgVar.size();
                                zzfgVar = zzfgVar.zzq(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t4, j, zzfgVar);
                            }
                            i21 = zzdl.zza(zzglVar2.zzax(i30), i33, bArr, i39, i2, zzfgVar, zzdmVar);
                            i20 = i3;
                            i25 = i28;
                            i23 = i33;
                            i22 = i30;
                            zzdmVar6 = zzdmVar7;
                            i26 = i38;
                            i24 = i24;
                            i19 = i2;
                        } else {
                            i16 = i24;
                            i6 = i28;
                            i17 = i39;
                            i18 = i33;
                            i9 = i30;
                            unsafe = unsafe2;
                            i4 = i3;
                            i7 = i17;
                        }
                        i26 = i38;
                        i24 = i16;
                        i8 = i18;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (this.zzajf) {
                        zzdmVar2 = zzdmVar;
                        if (zzdmVar2.zzabv != zzem.zzls()) {
                            int i40 = i6;
                            if (zzdmVar2.zzabv.zza(this.zzaje, i40) == null) {
                                i21 = zzdl.zza(i8, bArr, i7, i2, zzt(t), zzdmVar);
                                t4 = t;
                                i19 = i2;
                                i23 = i8;
                                zzglVar2 = this;
                                zzdmVar6 = zzdmVar2;
                                i25 = i40;
                                i22 = i9;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i20 = i4;
                            } else {
                                zzez.zzc zzcVar = (zzez.zzc) t;
                                zzcVar.zzms();
                                zzeq<Object> zzeqVar = zzcVar.zzagt;
                                throw new NoSuchMethodError();
                            }
                        } else {
                            t3 = t;
                        }
                    } else {
                        t3 = t;
                        zzdmVar2 = zzdmVar;
                    }
                    i21 = zzdl.zza(i8, bArr, i7, i2, zzt(t), zzdmVar);
                    i23 = i8;
                    zzglVar2 = this;
                    zzdmVar6 = zzdmVar2;
                    i25 = i6;
                    t4 = t3;
                    i22 = i9;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i19 = i2;
                    i20 = i4;
                } else {
                    zzglVar = this;
                    t2 = t;
                    i21 = i7;
                    i23 = i8;
                }
            } else {
                unsafe = unsafe2;
                i4 = i20;
                t2 = t4;
                zzglVar = zzglVar2;
            }
        }
        if (i26 != -1) {
            unsafe.putInt(t2, i26, i24);
        }
        zzhr zzhrVar = null;
        for (int i41 = zzglVar.zzajk; i41 < zzglVar.zzajl; i41++) {
            zzhrVar = (zzhr) zzglVar.zza((Object) t2, zzglVar.zzajj[i41], (int) zzhrVar, (zzhq<UT, int>) zzglVar.zzajo);
        }
        if (zzhrVar != null) {
            zzglVar.zzajo.zzf(t2, zzhrVar);
        }
        if (i4 == 0) {
            if (i21 != i2) {
                throw zzfh.zznb();
            }
        } else if (i21 > i2 || i23 != i4) {
            throw zzfh.zznb();
        }
        return i21;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0211, code lost:
        if (r0 == r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
        if (r0 == r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0232, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e4, code lost:
        if (r0 == r15) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzgy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.measurement.zzdm r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgl.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzdm):void");
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzhq<UT, UB> zzhqVar) {
        zzfe zzaz;
        int i2 = this.zzaja[i];
        Object zzp = zzhw.zzp(obj, zzba(i) & 1048575);
        return (zzp == null || (zzaz = zzaz(i)) == null) ? ub : (UB) zza(i, i2, this.zzajq.zzm(zzp), zzaz, (zzfe) ub, (zzhq<UT, zzfe>) zzhqVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzfe zzfeVar, UB ub, zzhq<UT, UB> zzhqVar) {
        zzga<?, ?> zzr = this.zzajq.zzr(zzay(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzfeVar.zzf(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzhqVar.zzoq();
                }
                zzdx zzt = zzdp.zzt(zzfz.zza(zzr, next.getKey(), next.getValue()));
                try {
                    zzfz.zza(zzt.zzki(), zzr, next.getKey(), next.getValue());
                    zzhqVar.zza((zzhq<UT, UB>) ub, i2, zzt.zzkh());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzgy zzgyVar) {
        return zzgyVar.zzu(zzhw.zzp(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzil zzilVar) throws IOException {
        if (obj instanceof String) {
            zzilVar.zzb(i, (String) obj);
        } else {
            zzilVar.zza(i, (zzdp) obj);
        }
    }

    private final void zza(Object obj, int i, zzgx zzgxVar) throws IOException {
        if (zzbc(i)) {
            zzhw.zza(obj, i & 1048575, zzgxVar.zzkq());
        } else if (this.zzajg) {
            zzhw.zza(obj, i & 1048575, zzgxVar.readString());
        } else {
            zzhw.zza(obj, i & 1048575, zzgxVar.zzkr());
        }
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzajh) {
            return zza((zzgl<T>) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzajh) {
            int zzba = zzba(i);
            long j = zzba & 1048575;
            switch ((zzba & 267386880) >>> 20) {
                case 0:
                    return zzhw.zzo(t, j) != 0.0d;
                case 1:
                    return zzhw.zzn(t, j) != 0.0f;
                case 2:
                    return zzhw.zzl(t, j) != 0;
                case 3:
                    return zzhw.zzl(t, j) != 0;
                case 4:
                    return zzhw.zzk(t, j) != 0;
                case 5:
                    return zzhw.zzl(t, j) != 0;
                case 6:
                    return zzhw.zzk(t, j) != 0;
                case 7:
                    return zzhw.zzm(t, j);
                case 8:
                    Object zzp = zzhw.zzp(t, j);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    } else if (zzp instanceof zzdp) {
                        return !zzdp.zzaby.equals(zzp);
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    return zzhw.zzp(t, j) != null;
                case 10:
                    return !zzdp.zzaby.equals(zzhw.zzp(t, j));
                case 11:
                    return zzhw.zzk(t, j) != 0;
                case 12:
                    return zzhw.zzk(t, j) != 0;
                case 13:
                    return zzhw.zzk(t, j) != 0;
                case 14:
                    return zzhw.zzl(t, j) != 0;
                case 15:
                    return zzhw.zzk(t, j) != 0;
                case 16:
                    return zzhw.zzl(t, j) != 0;
                case 17:
                    return zzhw.zzp(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int zzbb = zzbb(i);
        return (zzhw.zzk(t, (long) (zzbb & 1048575)) & (1 << (zzbb >>> 20))) != 0;
    }

    private final boolean zza(T t, int i, int i2) {
        return zzhw.zzk(t, (long) (zzbb(i2) & 1048575)) == i;
    }
}
