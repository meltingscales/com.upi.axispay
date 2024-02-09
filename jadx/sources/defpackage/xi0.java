package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xi0  reason: default package */
/* loaded from: classes.dex */
public class xi0 extends wi0 {
    public static final <T> boolean k(T[] tArr, T t) {
        yl0.e(tArr, C0059ao.a(4659));
        return p(tArr, t) >= 0;
    }

    public static final <T> List<T> l(T[] tArr) {
        yl0.e(tArr, C0059ao.a(4660));
        ArrayList arrayList = new ArrayList();
        m(tArr, arrayList);
        return arrayList;
    }

    public static final <C extends Collection<? super T>, T> C m(T[] tArr, C c) {
        yl0.e(tArr, C0059ao.a(4661));
        yl0.e(c, C0059ao.a(4662));
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            T t = tArr[i];
            i++;
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static final <T> rm0 n(T[] tArr) {
        yl0.e(tArr, C0059ao.a(4663));
        return new rm0(0, o(tArr));
    }

    public static final <T> int o(T[] tArr) {
        yl0.e(tArr, C0059ao.a(4664));
        return tArr.length - 1;
    }

    public static final <T> int p(T[] tArr, T t) {
        yl0.e(tArr, C0059ao.a(4665));
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                int i2 = i + 1;
                if (tArr[i] == null) {
                    return i;
                }
                i = i2;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            int i3 = i + 1;
            if (yl0.a(t, tArr[i])) {
                return i;
            }
            i = i3;
        }
        return -1;
    }

    public static final char q(char[] cArr) {
        yl0.e(cArr, C0059ao.a(4666));
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException(C0059ao.a(4667));
        }
        throw new NoSuchElementException(C0059ao.a(4668));
    }

    public static final <T> T r(T[] tArr) {
        yl0.e(tArr, C0059ao.a(4669));
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T, C extends Collection<? super T>> C s(T[] tArr, C c) {
        yl0.e(tArr, C0059ao.a(4670));
        yl0.e(c, C0059ao.a(4671));
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            T t = tArr[i];
            i++;
            c.add(t);
        }
        return c;
    }

    public static final <T> List<T> t(T[] tArr) {
        yl0.e(tArr, C0059ao.a(4672));
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return u(tArr);
            }
            return zi0.b(tArr[0]);
        }
        return aj0.f();
    }

    public static final <T> List<T> u(T[] tArr) {
        yl0.e(tArr, C0059ao.a(4673));
        return new ArrayList(aj0.c(tArr));
    }

    public static final <T> Set<T> v(T[] tArr) {
        yl0.e(tArr, C0059ao.a(4674));
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(pj0.a(tArr.length));
                s(tArr, linkedHashSet);
                return linkedHashSet;
            }
            return rj0.a(tArr[0]);
        }
        return sj0.b();
    }
}
