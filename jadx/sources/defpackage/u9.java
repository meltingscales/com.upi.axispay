package defpackage;

import android.content.Context;
import java.util.WeakHashMap;

/* compiled from: AxisPay */
/* renamed from: u9  reason: default package */
/* loaded from: classes.dex */
public final class u9 {
    public static final WeakHashMap<Context, u9> a = new WeakHashMap<>();

    public u9(Context context) {
    }

    public static u9 a(Context context) {
        u9 u9Var;
        WeakHashMap<Context, u9> weakHashMap = a;
        synchronized (weakHashMap) {
            u9Var = weakHashMap.get(context);
            if (u9Var == null) {
                u9Var = new u9(context);
                weakHashMap.put(context, u9Var);
            }
        }
        return u9Var;
    }
}
