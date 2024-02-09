package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzah implements Iterator<String> {
    private Iterator<String> zzfn;
    private final /* synthetic */ zzag zzfo;

    public zzah(zzag zzagVar) {
        Bundle bundle;
        this.zzfo = zzagVar;
        bundle = zzagVar.zzfm;
        this.zzfn = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzfn.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzfn.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
