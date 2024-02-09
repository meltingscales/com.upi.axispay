package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: c5  reason: default package */
/* loaded from: classes.dex */
public class c5<T> implements b5<T> {
    public final Object[] a;
    public int b;

    public c5(int i) {
        if (i > 0) {
            this.a = new Object[i];
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(1278));
    }

    @Override // defpackage.b5
    public boolean a(T t) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.b = i + 1;
            return true;
        }
        return false;
    }

    @Override // defpackage.b5
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

    @Override // defpackage.b5
    public void c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.b;
            Object[] objArr = this.a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.b = i3 + 1;
            }
        }
    }
}
