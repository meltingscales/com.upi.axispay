package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: AxisPay */
/* renamed from: ka  reason: default package */
/* loaded from: classes.dex */
public class ka {
    public static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
