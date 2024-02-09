package com.google.android.gms.internal.vision;

import android.net.Uri;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzbj {
    private static final o4<String, Uri> zza = new o4<>();

    public static synchronized Uri zza(String str) {
        Uri uri;
        synchronized (zzbj.class) {
            o4<String, Uri> o4Var = zza;
            uri = o4Var.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                o4Var.put(str, uri);
            }
        }
        return uri;
    }
}
