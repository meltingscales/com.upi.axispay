package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import androidx.mediarouter.app.MediaRouteVolumeSlider;

/* compiled from: AxisPay */
/* renamed from: dh  reason: default package */
/* loaded from: classes.dex */
public final class dh {
    public static final int a = kg.mr_dynamic_dialog_icon_light;

    public static Context a(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, l(context));
        int p = p(contextThemeWrapper, ig.mediaRouteTheme);
        return p != 0 ? new ContextThemeWrapper(contextThemeWrapper, p) : contextThemeWrapper;
    }

    public static Context b(Context context, int i, boolean z) {
        int i2;
        if (i == 0) {
            if (!z) {
                i2 = l.dialogTheme;
            } else {
                i2 = l.alertDialogTheme;
            }
            i = p(context, i2);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return p(contextThemeWrapper, ig.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, l(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int c(Context context) {
        int p = p(context, ig.mediaRouteTheme);
        return p == 0 ? l(context) : p;
    }

    public static int d(Context context) {
        int o = o(context, 0, l.colorPrimary);
        return d9.c(o, o(context, 0, 16842801)) < 3.0d ? o(context, 0, l.colorAccent) : o;
    }

    public static Drawable e(Context context) {
        return j(context, mg.mr_cast_checkbox);
    }

    public static int f(Context context, int i) {
        return d9.c(-1, o(context, i, l.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static Drawable g(Context context) {
        return i(context, ig.mediaRouteDefaultIconDrawable);
    }

    public static float h(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable r = o9.r(obtainStyledAttributes.getDrawable(0));
        if (r(context)) {
            o9.n(r, t8.d(context, a));
        }
        obtainStyledAttributes.recycle();
        return r;
    }

    public static Drawable j(Context context, int i) {
        Drawable r = o9.r(t8.f(context, i));
        if (r(context)) {
            o9.n(r, t8.d(context, a));
        }
        return r;
    }

    public static Drawable k(Context context) {
        return j(context, mg.mr_cast_mute_button);
    }

    public static int l(Context context) {
        if (r(context)) {
            if (f(context, 0) == -570425344) {
                return sg.Theme_MediaRouter_Light;
            }
            return sg.Theme_MediaRouter_Light_DarkControlPanel;
        } else if (f(context, 0) == -570425344) {
            return sg.Theme_MediaRouter_LightControlPanel;
        } else {
            return sg.Theme_MediaRouter;
        }
    }

    public static Drawable m(Context context) {
        return i(context, ig.mediaRouteSpeakerIconDrawable);
    }

    public static Drawable n(Context context) {
        return i(context, ig.mediaRouteSpeakerGroupIconDrawable);
    }

    public static int o(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static int p(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static Drawable q(Context context) {
        return i(context, ig.mediaRouteTvIconDrawable);
    }

    public static boolean r(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(l.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static void s(Context context, Dialog dialog) {
        int i;
        View decorView = dialog.getWindow().getDecorView();
        if (r(context)) {
            i = kg.mr_dynamic_dialog_background_light;
        } else {
            i = kg.mr_dynamic_dialog_background_dark;
        }
        decorView.setBackgroundColor(t8.d(context, i));
    }

    public static void t(Context context, ProgressBar progressBar) {
        int i;
        if (progressBar.isIndeterminate()) {
            if (r(context)) {
                i = kg.mr_cast_progressbar_progress_and_thumb_light;
            } else {
                i = kg.mr_cast_progressbar_progress_and_thumb_dark;
            }
            progressBar.getIndeterminateDrawable().setColorFilter(t8.d(context, i), PorterDuff.Mode.SRC_IN);
        }
    }

    public static void u(Context context, View view, View view2, boolean z) {
        int o = o(context, 0, l.colorPrimary);
        int o2 = o(context, 0, l.colorPrimaryDark);
        if (z && f(context, 0) == -570425344) {
            o2 = o;
            o = -1;
        }
        view.setBackgroundColor(o);
        view2.setBackgroundColor(o2);
        view.setTag(Integer.valueOf(o));
        view2.setTag(Integer.valueOf(o2));
    }

    public static void v(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int d;
        int d2;
        if (r(context)) {
            d = t8.d(context, kg.mr_cast_progressbar_progress_and_thumb_light);
            d2 = t8.d(context, kg.mr_cast_progressbar_background_light);
        } else {
            d = t8.d(context, kg.mr_cast_progressbar_progress_and_thumb_dark);
            d2 = t8.d(context, kg.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.b(d, d2);
    }

    public static void w(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int f = f(context, 0);
        if (Color.alpha(f) != 255) {
            f = d9.i(f, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(f);
    }
}
