package defpackage;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import com.crashlytics.android.Crashlytics;
import com.upi.axispay.activity.LoginActivity;
import defpackage.n70;
import java.lang.Thread;
import java.util.Date;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: wg0  reason: default package */
/* loaded from: classes.dex */
public class wg0 implements Thread.UncaughtExceptionHandler {
    public Activity a;
    public Thread.UncaughtExceptionHandler b = Thread.getDefaultUncaughtExceptionHandler();

    public wg0(Activity activity) {
        this.a = activity;
    }

    public void a(Activity activity) {
        this.a = activity;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Crashlytics.logException(th);
        long time = new Date().getTime();
        n70.a aVar = n70.f;
        n70 a = aVar.a();
        String a2 = C0059ao.a(7872);
        if ((time - a.k(a2)) / 1000 < 20) {
            aVar.a().x(a2, new Date().getTime());
            this.a.finish();
            System.exit(2);
            this.b.uncaughtException(thread, th);
            return;
        }
        aVar.a().x(a2, new Date().getTime());
        String c = jg0.c(this.a, true, false);
        Intent intent = new Intent(this.a, LoginActivity.class);
        intent.putExtra(C0059ao.a(7873), c);
        intent.addFlags(335577088);
        PendingIntent activity = PendingIntent.getActivity(this.a, 0, intent, Build.VERSION.SDK_INT >= 31 ? 67108864 : 0);
        AlarmManager alarmManager = (AlarmManager) this.a.getSystemService(C0059ao.a(7874));
        if (alarmManager != null) {
            alarmManager.set(1, System.currentTimeMillis() + 200, activity);
        }
        this.a.finish();
        System.exit(2);
        this.b.uncaughtException(thread, th);
    }
}
