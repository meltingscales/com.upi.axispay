package myunmn;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class Q extends BroadcastReceiver {
    public final /* synthetic */ C0071b a;

    public Q(C0071b c0071b) {
        this.a = c0071b;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Activity activity;
        activity = this.a.l;
        activity.runOnUiThread(new V(this));
    }
}
