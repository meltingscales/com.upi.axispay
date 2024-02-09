package myunmn;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class J extends Service {
    private final aN a = new K(this);

    public native int a();

    public native IBinder a(Intent intent);

    public native boolean b();

    public native int c();

    public native int d();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }
}
