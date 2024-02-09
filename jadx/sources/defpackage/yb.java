package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* compiled from: AxisPay */
/* renamed from: yb  reason: default package */
/* loaded from: classes.dex */
public final class yb {
    public Object a;

    public yb(Object obj) {
        this.a = obj;
    }

    public static yb b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new yb(PointerIcon.getSystemIcon(context, i));
        }
        return new yb(null);
    }

    public Object a() {
        return this.a;
    }
}
