package com.google.android.gms.internal.vision;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzeq {
    public static Object zza(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
