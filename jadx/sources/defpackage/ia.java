package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* compiled from: AxisPay */
/* renamed from: ia  reason: default package */
/* loaded from: classes.dex */
public class ia {
    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
