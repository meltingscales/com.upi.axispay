package com.google.android.gms.internal.vision;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzff extends WeakReference<Throwable> {
    private final int zza;

    public zzff(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.zza = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzff.class) {
            if (this == obj) {
                return true;
            }
            zzff zzffVar = (zzff) obj;
            if (this.zza == zzffVar.zza && get() == zzffVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }
}
