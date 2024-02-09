package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: AxisPay */
/* renamed from: t0  reason: default package */
/* loaded from: classes.dex */
public class t0 {
    public Context a;

    public t0(Context context) {
        this.a = context;
    }

    public static t0 b(Context context) {
        return new t0(context);
    }

    public boolean a() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i <= 960 || i2 <= 720) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500) {
                    if (i <= 640 || i2 <= 480) {
                        if (i <= 480 || i2 <= 640) {
                            return i >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    public int e() {
        return this.a.getResources().getDimensionPixelSize(o.abc_action_bar_stacked_tab_max_width);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, u.ActionBar, l.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(u.ActionBar_height, 0);
        Resources resources = this.a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(o.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.a.getResources().getBoolean(m.abc_action_bar_embed_tabs);
    }

    public boolean h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.a).hasPermanentMenuKey();
    }
}
