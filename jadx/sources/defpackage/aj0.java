package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: aj0  reason: default package */
/* loaded from: classes.dex */
public class aj0 extends zi0 {
    public static final <T> Collection<T> c(T[] tArr) {
        yl0.e(tArr, C0059ao.a(8597));
        return new ti0(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int d(List<? extends T> list, T t, int i, int i2) {
        yl0.e(list, C0059ao.a(8598));
        l(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int a = tj0.a(list.get(i4), t);
            if (a < 0) {
                i = i4 + 1;
            } else if (a <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int e(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return d(list, comparable, i, i2);
    }

    public static final <T> List<T> f() {
        return kj0.b;
    }

    public static final <T> int g(List<? extends T> list) {
        yl0.e(list, C0059ao.a(8599));
        return list.size() - 1;
    }

    public static final <T> List<T> h(T... tArr) {
        yl0.e(tArr, C0059ao.a(8600));
        return tArr.length > 0 ? wi0.b(tArr) : f();
    }

    public static final <T> List<T> i(T... tArr) {
        yl0.e(tArr, C0059ao.a(8601));
        return xi0.l(tArr);
    }

    public static final <T> List<T> j(T... tArr) {
        yl0.e(tArr, C0059ao.a(8602));
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new ti0(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> k(List<? extends T> list) {
        yl0.e(list, C0059ao.a(8603));
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : zi0.b(list.get(0));
        }
        return f();
    }

    public static final void l(int i, int i2, int i3) {
        String a = C0059ao.a(8604);
        String a2 = C0059ao.a(8605);
        if (i2 > i3) {
            throw new IllegalArgumentException(a2 + i2 + C0059ao.a(8609) + i3 + a);
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException(a2 + i2 + C0059ao.a(8608));
        } else if (i3 <= i) {
        } else {
            throw new IndexOutOfBoundsException(C0059ao.a(8606) + i3 + C0059ao.a(8607) + i + a);
        }
    }

    public static final void m() {
        throw new ArithmeticException(C0059ao.a(8610));
    }

    public static final void n() {
        throw new ArithmeticException(C0059ao.a(8611));
    }
}
