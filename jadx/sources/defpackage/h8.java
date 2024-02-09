package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* compiled from: AxisPay */
/* renamed from: h8  reason: default package */
/* loaded from: classes.dex */
public final class h8 {
    public static int a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    public static String b(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}
