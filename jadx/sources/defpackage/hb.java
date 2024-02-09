package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hb  reason: default package */
/* loaded from: classes.dex */
public final class hb {
    public final Object a;

    public hb(Object obj) {
        this.a = obj;
    }

    public static hb e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new hb(obj);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetBottom();
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetLeft();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetRight();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hb.class != obj.getClass()) {
            return false;
        }
        return ya.a(this.a, ((hb) obj).a);
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return C0059ao.a(7680) + this.a + C0059ao.a(7681);
    }
}
