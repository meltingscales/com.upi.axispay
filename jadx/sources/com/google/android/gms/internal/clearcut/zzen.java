package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzen implements Iterator<Object> {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
