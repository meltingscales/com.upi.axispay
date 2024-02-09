package defpackage;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: xl  reason: default package */
/* loaded from: classes.dex */
public final class xl {
    static {
        C0095z.a();
    }

    public static Uri a(Cursor cursor) {
        return cursor.getNotificationUri();
    }

    public static boolean b(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
