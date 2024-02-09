package myunmn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: myunmn.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0086q extends BroadcastReceiver {
    private native void a(Context context, Intent intent);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context, intent);
    }
}
