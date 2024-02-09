package defpackage;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: h60  reason: default package */
/* loaded from: classes.dex */
public class h60 {

    /* compiled from: AxisPay */
    /* renamed from: h60$a */
    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public static final AtomicInteger e = new AtomicInteger(1);
        public final String c;
        public final int d;
        public final AtomicInteger b = new AtomicInteger(1);
        public final ThreadGroup a = Thread.currentThread().getThreadGroup();

        public a(int i, String str) {
            this.d = i;
            this.c = str + e.getAndIncrement() + C0059ao.a(6433);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.a;
            Thread thread = new Thread(threadGroup, runnable, this.c + this.b.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            thread.setPriority(this.d);
            return thread;
        }
    }

    public static s60 a() {
        return new u60();
    }

    public static t50 b(Context context, a60 a60Var, long j, int i) {
        File h = h(context);
        if (j > 0 || i > 0) {
            try {
                return new x50(a70.d(context), h, a60Var, j, i);
            } catch (IOException e) {
                y60.b(e);
            }
        }
        return new v50(a70.a(context), h, a60Var);
    }

    public static Executor c(int i, int i2, n60 n60Var) {
        return new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, n60Var == n60.LIFO ? new o60() : new LinkedBlockingQueue(), j(i2, C0059ao.a(5323)));
    }

    public static a60 d() {
        return new b60();
    }

    public static r60 e(boolean z) {
        return new q60(z);
    }

    public static w60 f(Context context) {
        return new v60(context);
    }

    public static d60 g(Context context, int i) {
        if (i == 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(C0059ao.a(5324));
            int memoryClass = activityManager.getMemoryClass();
            if (l() && m(context)) {
                memoryClass = k(activityManager);
            }
            i = (memoryClass * CommonUtils.BYTES_IN_A_MEGABYTE) / 8;
        }
        return new f60(i);
    }

    public static File h(Context context) {
        File b = a70.b(context, false);
        File file = new File(b, C0059ao.a(5325));
        return (file.exists() || file.mkdir()) ? file : b;
    }

    public static Executor i() {
        return Executors.newCachedThreadPool(j(5, C0059ao.a(5326)));
    }

    public static ThreadFactory j(int i, String str) {
        return new a(i, str);
    }

    @TargetApi(11)
    public static int k(ActivityManager activityManager) {
        return activityManager.getLargeMemoryClass();
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 11;
    }

    @TargetApi(11)
    public static boolean m(Context context) {
        return (context.getApplicationInfo().flags & CommonUtils.BYTES_IN_A_MEGABYTE) != 0;
    }
}
