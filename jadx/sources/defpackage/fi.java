package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: AxisPay */
/* renamed from: fi  reason: default package */
/* loaded from: classes.dex */
public final class fi extends BroadcastReceiver {
    public static boolean a(Context context) {
        Intent intent = new Intent(context, fi.class);
        intent.setPackage(context.getPackageName());
        return context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
    }
}
