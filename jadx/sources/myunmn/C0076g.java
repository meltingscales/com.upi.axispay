package myunmn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: myunmn.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0076g extends BroadcastReceiver {
    private native void a(Context context, Intent intent);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context, intent);
    }
}
