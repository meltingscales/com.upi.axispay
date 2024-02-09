package com.google.android.gms.internal.measurement;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzdk {
    private static final Class<?> zzabq = zzcm("libcore.io.Memory");
    private static final boolean zzabr;

    static {
        zzabr = zzcm("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> zzcm(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzkb() {
        return (zzabq == null || zzabr) ? false : true;
    }

    public static Class<?> zzkc() {
        return zzabq;
    }
}
