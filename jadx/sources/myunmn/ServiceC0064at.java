package myunmn;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: myunmn.at  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceC0064at extends Service {
    private final aN a = new aJ(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native int a();

    public native IBinder a(Intent intent);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native int b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public native int c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public native boolean d();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }
}
