package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: t3  reason: default package */
/* loaded from: classes.dex */
public class t3 extends Resources {
    public static boolean b;
    public final WeakReference<Context> a;

    static {
        C0059ao.a(t3.class, 211);
    }

    public t3(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = new WeakReference<>(context);
    }

    public static boolean a() {
        return b;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    public final Drawable c(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.a.get();
        if (context != null) {
            return e3.h().t(context, this, i);
        }
        return super.getDrawable(i);
    }
}
