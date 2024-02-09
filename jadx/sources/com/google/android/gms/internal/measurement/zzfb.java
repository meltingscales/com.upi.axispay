package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzfb {
    public static final byte[] zzahk;
    private static final ByteBuffer zzahl;
    private static final zzeb zzahm;
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        zzahk = bArr;
        zzahl = ByteBuffer.wrap(bArr);
        zzahm = zzeb.zza(bArr, 0, bArr.length, false);
    }

    public static <T> T checkNotNull(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int zza = zza(length, bArr, 0, length);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public static <T> T zza(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static int zzba(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean zzf(zzgh zzghVar) {
        return false;
    }

    public static boolean zzj(byte[] bArr) {
        return zzhy.zzj(bArr);
    }

    public static String zzk(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static int zzo(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object zza(Object obj, Object obj2) {
        return ((zzgh) obj).zzmk().zza((zzgh) obj2).zzmq();
    }
}
