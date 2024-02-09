package defpackage;

import java.util.Collection;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bj0  reason: default package */
/* loaded from: classes.dex */
public class bj0 extends aj0 {
    public static final <T> int o(Iterable<? extends T> iterable, int i) {
        yl0.e(iterable, C0059ao.a(7723));
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
