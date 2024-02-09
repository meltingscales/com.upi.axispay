package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final /* synthetic */ class zzcq {
    public static <V> V zza(zzcr<V> zzcrVar) {
        try {
            return zzcrVar.zzjn();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzcrVar.zzjn();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
