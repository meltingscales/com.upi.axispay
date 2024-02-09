package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzhv implements Iterator<String> {
    private final /* synthetic */ zzht zzaku;
    private Iterator<String> zzakv;

    public zzhv(zzht zzhtVar) {
        zzfq zzfqVar;
        this.zzaku = zzhtVar;
        zzfqVar = zzhtVar.zzakr;
        this.zzakv = zzfqVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzakv.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzakv.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
