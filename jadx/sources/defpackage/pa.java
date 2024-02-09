package defpackage;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pa  reason: default package */
/* loaded from: classes.dex */
public class pa {

    /* compiled from: AxisPay */
    /* renamed from: pa$a */
    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public String a;
        public int b;

        /* compiled from: AxisPay */
        /* renamed from: pa$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0033a extends Thread {
            public final int b;

            public C0033a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.b = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.b);
                super.run();
            }
        }

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0033a(runnable, this.a, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: pa$b */
    /* loaded from: classes.dex */
    public static class b<T> implements Runnable {
        public Callable<T> b;
        public wa<T> c;
        public Handler d;

        /* compiled from: AxisPay */
        /* renamed from: pa$b$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ wa b;
            public final /* synthetic */ Object c;

            public a(b bVar, wa waVar, Object obj) {
                this.b = waVar;
                this.c = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.b.a(this.c);
            }
        }

        public b(Handler handler, Callable<T> callable, wa<T> waVar) {
            this.b = callable;
            this.c = waVar;
            this.d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.b.call();
            } catch (Exception unused) {
                t = null;
            }
            this.d.post(new a(this, this.c, t));
        }
    }

    public static ThreadPoolExecutor a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static <T> void b(Executor executor, Callable<T> callable, wa<T> waVar) {
        executor.execute(new b(ka.a(), callable, waVar));
    }

    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException(C0059ao.a(15049));
        }
    }
}
