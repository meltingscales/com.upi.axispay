package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hg  reason: default package */
/* loaded from: classes.dex */
public class hg extends BroadcastReceiver {
    public static ComponentName a(Context context) {
        Intent intent = new Intent(C0059ao.a(7918));
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.size() > 1) {
            Log.w(C0059ao.a(7919), C0059ao.a(7920));
            return null;
        } else {
            return null;
        }
    }
}
