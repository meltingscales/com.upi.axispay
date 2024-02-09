package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: AxisPay */
/* renamed from: tz  reason: default package */
/* loaded from: classes.dex */
public class tz extends uz {
    public static float e(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    public static float f(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.uz
    public void c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        float e;
        RectF a = uz.a(tabLayout, view);
        RectF a2 = uz.a(tabLayout, view2);
        if (a.left < a2.left) {
            f2 = e(f);
            e = f(f);
        } else {
            f2 = f(f);
            e = e(f);
        }
        drawable.setBounds(tv.c((int) a.left, (int) a2.left, f2), drawable.getBounds().top, tv.c((int) a.right, (int) a2.right, e), drawable.getBounds().bottom);
    }
}
