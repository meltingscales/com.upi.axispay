package myunmn;

import android.app.Application;
import android.content.Context;

/* renamed from: myunmn.as  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ApplicationC0063as extends Application {
    static {
        C0095z.a();
        C0095z.a();
    }

    void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C0095z.c(this);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        a();
    }
}
