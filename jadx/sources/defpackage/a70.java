package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: a70  reason: default package */
/* loaded from: classes.dex */
public final class a70 {
    public static File a(Context context) {
        return b(context, true);
    }

    public static File b(Context context, boolean z) {
        String a = C0059ao.a(8909);
        try {
            a = Environment.getExternalStorageState();
        } catch (IncompatibleClassChangeError | NullPointerException unused) {
        }
        File c = (z && C0059ao.a(8910).equals(a) && f(context)) ? c(context) : null;
        if (c == null) {
            c = context.getCacheDir();
        }
        if (c == null) {
            String str = C0059ao.a(8911) + context.getPackageName() + C0059ao.a(8912);
            y60.e(C0059ao.a(8913), str);
            return new File(str);
        }
        return c;
    }

    public static File c(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), C0059ao.a(8914)), C0059ao.a(8915)), context.getPackageName()), C0059ao.a(8916));
        if (!file.exists()) {
            if (!file.mkdirs()) {
                y60.e(C0059ao.a(8917), new Object[0]);
                return null;
            }
            try {
                new File(file, C0059ao.a(8918)).createNewFile();
            } catch (IOException unused) {
                y60.c(C0059ao.a(8919), new Object[0]);
            }
        }
        return file;
    }

    public static File d(Context context) {
        return e(context, C0059ao.a(8920));
    }

    public static File e(Context context, String str) {
        File a = a(context);
        File file = new File(a, str);
        return (file.exists() || file.mkdir()) ? file : a;
    }

    public static boolean f(Context context) {
        return context.checkCallingOrSelfPermission(C0059ao.a(8921)) == 0;
    }
}
