package defpackage;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: x3  reason: default package */
/* loaded from: classes.dex */
public class x3 extends y3 {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new a(this));

    /* compiled from: AxisPay */
    /* renamed from: x3$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(0);

        public a(x3 x3Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(C0059ao.a(7574), Integer.valueOf(this.a.getAndIncrement())));
            return thread;
        }
    }

    @Override // defpackage.y3
    public void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // defpackage.y3
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
