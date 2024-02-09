package com.google.android.gms.internal.measurement;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzel {
    private static final Class<?> zzadi = zzlo();

    private static final zzem zzcr(String str) throws Exception {
        return (zzem) zzadi.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    private static Class<?> zzlo() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzem zzlp() {
        if (zzadi != null) {
            try {
                return zzcr("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzem.zzadm;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.zzem zzlq() {
        /*
            java.lang.Class<?> r0 = com.google.android.gms.internal.measurement.zzel.zzadi
            if (r0 == 0) goto Lb
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.measurement.zzem r0 = zzcr(r0)     // Catch: java.lang.Exception -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L12
            com.google.android.gms.internal.measurement.zzem r0 = com.google.android.gms.internal.measurement.zzem.zzlq()
        L12:
            if (r0 != 0) goto L18
            com.google.android.gms.internal.measurement.zzem r0 = zzlp()
        L18:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzel.zzlq():com.google.android.gms.internal.measurement.zzem");
    }
}
