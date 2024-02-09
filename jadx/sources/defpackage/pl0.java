package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pl0  reason: default package */
/* loaded from: classes.dex */
public final class pl0<T> implements Iterator<T>, om0 {
    public final T[] b;
    public int c;

    public pl0(T[] tArr) {
        yl0.e(tArr, C0059ao.a(14874));
        this.b = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c < this.b.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.b;
            int i = this.c;
            this.c = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(C0059ao.a(14875));
    }
}
