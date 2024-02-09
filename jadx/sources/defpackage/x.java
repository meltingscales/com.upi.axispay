package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: x  reason: default package */
/* loaded from: classes.dex */
public class x {
    public static final int[] a = {16843531};

    /* compiled from: AxisPay */
    /* renamed from: x$a */
    /* loaded from: classes.dex */
    public static class a {
        public Method a;
        public Method b;
        public ImageView c;

        public a(Activity activity) {
            try {
                this.a = ActionBar.class.getDeclaredMethod(C0059ao.a(7566), Drawable.class);
                this.b = ActionBar.class.getDeclaredMethod(C0059ao.a(7567), Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.c = (ImageView) childAt;
                }
            }
        }
    }

    public static Drawable a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static a b(a aVar, Activity activity, int i) {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.b.invoke(actionBar, Integer.valueOf(i));
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w(C0059ao.a(11336), C0059ao.a(11337), e);
            }
        }
        return aVar;
    }

    public static a c(Activity activity, Drawable drawable, int i) {
        a aVar = new a(activity);
        Method method = aVar.a;
        String a2 = C0059ao.a(11338);
        if (method != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.a.invoke(actionBar, drawable);
                aVar.b.invoke(actionBar, Integer.valueOf(i));
            } catch (Exception e) {
                Log.w(a2, C0059ao.a(11339), e);
            }
        } else {
            ImageView imageView = aVar.c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w(a2, C0059ao.a(11340));
            }
        }
        return aVar;
    }
}
