package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: jw  reason: default package */
/* loaded from: classes.dex */
public class jw {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT < 18;
    }

    public static void a(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        c(badgeDrawable, view, frameLayout);
        if (badgeDrawable.h() != null) {
            badgeDrawable.h().setForeground(badgeDrawable);
        } else if (!a) {
            view.getOverlay().add(badgeDrawable);
        } else {
            throw new IllegalArgumentException(C0059ao.a(10728));
        }
    }

    public static void b(BadgeDrawable badgeDrawable, View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (!a && badgeDrawable.h() == null) {
            view.getOverlay().remove(badgeDrawable);
        } else {
            badgeDrawable.h().setForeground(null);
        }
    }

    public static void c(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.y(view, frameLayout);
    }

    public static void d(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
