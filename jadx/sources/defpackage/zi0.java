package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: zi0  reason: default package */
/* loaded from: classes.dex */
public class zi0 {
    public static final <T> Object[] a(T[] tArr, boolean z) {
        yl0.e(tArr, C0059ao.a(14912));
        if (z && yl0.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        yl0.d(copyOf, C0059ao.a(14913));
        return copyOf;
    }

    public static final <T> List<T> b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        yl0.d(singletonList, C0059ao.a(14914));
        return singletonList;
    }
}
