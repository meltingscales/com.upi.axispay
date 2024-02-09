package defpackage;

import android.content.Context;
import android.graphics.Color;

/* compiled from: AxisPay */
/* renamed from: qx  reason: default package */
/* loaded from: classes.dex */
public class qx {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;

    public qx(Context context) {
        this.a = sy.b(context, iv.elevationOverlayEnabled, false);
        this.b = ww.a(context, iv.elevationOverlayColor, 0);
        this.c = ww.a(context, iv.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public float a(float f) {
        float f2 = this.d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f) {
        float a = a(f);
        return d9.m(ww.f(d9.m(i, 255), this.b, a), Color.alpha(i));
    }

    public int c(int i, float f) {
        return (this.a && e(i)) ? b(i, f) : i;
    }

    public boolean d() {
        return this.a;
    }

    public final boolean e(int i) {
        return d9.m(i, 255) == this.c;
    }
}
