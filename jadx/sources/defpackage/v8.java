package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Process;

/* compiled from: AxisPay */
/* renamed from: v8  reason: default package */
/* loaded from: classes.dex */
public final class v8 {
    public static int a(Context context, String str) {
        return b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String b = h8.b(str);
        if (b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return h8.a(context, b, str2) != 0 ? -2 : 0;
    }

    public static int c(Context context, String str) {
        return b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
