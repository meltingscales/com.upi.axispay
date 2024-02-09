package defpackage;

import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: nj0  reason: default package */
/* loaded from: classes.dex */
public abstract class nj0 implements Iterator<Integer>, om0 {
    public abstract int a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(C0059ao.a(2773));
    }
}
