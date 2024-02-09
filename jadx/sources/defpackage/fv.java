package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: fv  reason: default package */
/* loaded from: classes.dex */
public final class fv {
    public static SparseArray<xo> a = new SparseArray<>();
    public static HashMap<xo, Integer> b;

    static {
        HashMap<xo, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(xo.DEFAULT, 0);
        b.put(xo.VERY_LOW, 1);
        b.put(xo.HIGHEST, 2);
        for (xo xoVar : b.keySet()) {
            a.append(b.get(xoVar).intValue(), xoVar);
        }
    }

    public static int a(xo xoVar) {
        Integer num = b.get(xoVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(C0059ao.a(6250) + xoVar);
    }

    public static xo b(int i) {
        xo xoVar = a.get(i);
        if (xoVar != null) {
            return xoVar;
        }
        throw new IllegalArgumentException(C0059ao.a(6251) + i);
    }
}
