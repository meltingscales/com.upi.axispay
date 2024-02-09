package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bb  reason: default package */
/* loaded from: classes.dex */
public class bb<T> implements ab<T> {
    public final Object[] a;
    public int b;

    public bb(int i) {
        if (i > 0) {
            this.a = new Object[i];
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(1715));
    }

    @Override // defpackage.ab
    public boolean a(T t) {
        if (!c(t)) {
            int i = this.b;
            Object[] objArr = this.a;
            if (i < objArr.length) {
                objArr[i] = t;
                this.b = i + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException(C0059ao.a(1716));
    }

    @Override // defpackage.ab
    public T b() {
        int i = this.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.b = i - 1;
            return t;
        }
        return null;
    }

    public final boolean c(T t) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i] == t) {
                return true;
            }
        }
        return false;
    }
}
