package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;
import java.util.concurrent.Executor;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: t8  reason: default package */
/* loaded from: classes.dex */
public class t8 {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static TypedValue c;

    /* compiled from: AxisPay */
    /* renamed from: t8$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: t8$b */
    /* loaded from: classes.dex */
    public static class b {
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: t8$c */
    /* loaded from: classes.dex */
    public static class c {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i) {
            return context.getDrawable(i);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: t8$d */
    /* loaded from: classes.dex */
    public static class d {
        public static int a(Context context, int i) {
            return context.getColor(i);
        }

        public static ColorStateList b(Context context, int i) {
            return context.getColorStateList(i);
        }

        public static <T> T c(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: t8$e */
    /* loaded from: classes.dex */
    public static class e {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: t8$f */
    /* loaded from: classes.dex */
    public static class f {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException(C0059ao.a(1301));
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }

    public static File c(File file) {
        synchronized (b) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                String a2 = C0059ao.a(1302);
                Log.w(a2, C0059ao.a(1303) + file.getPath());
            }
            return file;
        }
    }

    public static int d(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.a(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static ColorStateList e(Context context, int i) {
        return b9.d(context.getResources(), i, context.getTheme());
    }

    public static Drawable f(Context context, int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return c.b(context, i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (a) {
            if (c == null) {
                c = new TypedValue();
            }
            context.getResources().getValue(i, c, true);
            i2 = c.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    public static File[] g(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? b.a(context) : new File[]{context.getExternalCacheDir()};
    }

    public static File[] h(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? b.b(context, str) : new File[]{context.getExternalFilesDir(str)};
    }

    public static Executor i(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.a(context);
        }
        return ca.a(new Handler(context.getMainLooper()));
    }

    public static File j(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return c.c(context);
        }
        File file = new File(context.getApplicationInfo().dataDir, C0059ao.a(1304));
        c(file);
        return file;
    }

    public static boolean k(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            a.a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void l(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            a.b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }
}
