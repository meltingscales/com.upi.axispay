package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: d8  reason: default package */
/* loaded from: classes.dex */
public class d8 extends t8 {
    public static d d;

    /* compiled from: AxisPay */
    /* renamed from: d8$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ String[] b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ int d;

        public a(String[] strArr, Activity activity, int i) {
            this.b = strArr;
            this.c = activity;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.b.length];
            PackageManager packageManager = this.c.getPackageManager();
            String packageName = this.c.getPackageName();
            int length = this.b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.b[i], packageName);
            }
            ((c) this.c).onRequestPermissionsResult(this.d, this.b, iArr);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: d8$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ Activity b;

        public b(Activity activity) {
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.isFinishing() || g8.i(this.b)) {
                return;
            }
            this.b.recreate();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: d8$c */
    /* loaded from: classes.dex */
    public interface c {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* compiled from: AxisPay */
    /* renamed from: d8$d */
    /* loaded from: classes.dex */
    public interface d {
        boolean a(Activity activity, String[] strArr, int i);
    }

    /* compiled from: AxisPay */
    /* renamed from: d8$e */
    /* loaded from: classes.dex */
    public interface e {
        void b(int i);
    }

    public static void m(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void n(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            activity.recreate();
        } else if (i <= 23) {
            new Handler(activity.getMainLooper()).post(new b(activity));
        } else if (g8.i(activity)) {
        } else {
            activity.recreate();
        }
    }

    public static void o(Activity activity, String[] strArr, int i) {
        d dVar = d;
        if (dVar == null || !dVar.a(activity, strArr, i)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException(C0059ao.a(2649) + Arrays.toString(strArr) + C0059ao.a(2650));
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).b(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i));
            }
        }
    }

    public static boolean p(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void q(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void r(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }
}
