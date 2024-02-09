package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: AxisPay */
/* renamed from: vc  reason: default package */
/* loaded from: classes.dex */
public final class vc {
    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
