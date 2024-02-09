package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzo extends WeakReference<Throwable> {
    private final int zzm;

    public zzo(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.zzm = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzo.class) {
            if (this == obj) {
                return true;
            }
            zzo zzoVar = (zzo) obj;
            if (this.zzm == zzoVar.zzm && get() == zzoVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzm;
    }
}
