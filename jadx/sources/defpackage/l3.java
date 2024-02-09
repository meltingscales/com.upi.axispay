package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: l3  reason: default package */
/* loaded from: classes.dex */
public class l3 extends ContextWrapper {
    public static final Object c = new Object();
    public static ArrayList<WeakReference<l3>> d;
    public final Resources a;
    public final Resources.Theme b;

    public l3(Context context) {
        super(context);
        if (t3.b()) {
            t3 t3Var = new t3(this, context.getResources());
            this.a = t3Var;
            Resources.Theme newTheme = t3Var.newTheme();
            this.b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.a = new n3(this, context.getResources());
        this.b = null;
    }

    public static boolean a(Context context) {
        if ((context instanceof l3) || (context.getResources() instanceof n3) || (context.getResources() instanceof t3)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || t3.b();
    }

    public static Context b(Context context) {
        if (a(context)) {
            synchronized (c) {
                ArrayList<WeakReference<l3>> arrayList = d;
                if (arrayList == null) {
                    d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<l3> weakReference = d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            d.remove(size);
                        }
                    }
                    for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<l3> weakReference2 = d.get(size2);
                        l3 l3Var = weakReference2 != null ? weakReference2.get() : null;
                        if (l3Var != null && l3Var.getBaseContext() == context) {
                            return l3Var;
                        }
                    }
                }
                l3 l3Var2 = new l3(context);
                d.add(new WeakReference<>(l3Var2));
                return l3Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
