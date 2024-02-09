package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pj0  reason: default package */
/* loaded from: classes.dex */
public class pj0 extends oj0 {
    public static final int a(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static final <K, V> Map<K, V> b(gi0<? extends K, ? extends V> gi0Var) {
        yl0.e(gi0Var, C0059ao.a(13101));
        Map<K, V> singletonMap = Collections.singletonMap(gi0Var.c(), gi0Var.d());
        yl0.d(singletonMap, C0059ao.a(13102));
        return singletonMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        yl0.e(map, C0059ao.a(13103));
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        yl0.d(singletonMap, C0059ao.a(13104));
        return singletonMap;
    }
}
