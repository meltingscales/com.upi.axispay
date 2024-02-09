package io.fabric.sdk.android.services.concurrency;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.vision.barcode.Barcode;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class AsyncTask<Params, Progress, Result> {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE = 0;
    private static final String LOG_TAG = null;
    private static final int MAXIMUM_POOL_SIZE;
    private static final int MESSAGE_POST_PROGRESS = 0;
    private static final int MESSAGE_POST_RESULT = 0;
    public static final Executor SERIAL_EXECUTOR;
    public static final Executor THREAD_POOL_EXECUTOR;
    private static volatile Executor defaultExecutor;
    private static final InternalHandler handler;
    private static final BlockingQueue<Runnable> poolWorkQueue;
    private static final ThreadFactory threadFactory;
    private final FutureTask<Result> future;
    private final WorkerRunnable<Params, Result> worker;
    private volatile Status status = Status.PENDING;
    private final AtomicBoolean cancelled = new AtomicBoolean();
    private final AtomicBoolean taskInvoked = new AtomicBoolean();

    /* compiled from: AxisPay */
    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status;

        static {
            int[] iArr = new int[Status.values().length];
            $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class AsyncTaskResult<Data> {
        public final Data[] data;
        public final AsyncTask task;

        public AsyncTaskResult(AsyncTask asyncTask, Data... dataArr) {
            this.task = asyncTask;
            this.data = dataArr;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class InternalHandler extends Handler {
        public InternalHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AsyncTaskResult asyncTaskResult = (AsyncTaskResult) message.obj;
            int i = message.what;
            if (i == 1) {
                asyncTaskResult.task.finish(asyncTaskResult.data[0]);
            } else if (i != 2) {
            } else {
                asyncTaskResult.task.onProgressUpdate(asyncTaskResult.data);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class SerialExecutor implements Executor {
        public Runnable active;
        public final LinkedList<Runnable> tasks;

        private SerialExecutor() {
            this.tasks = new LinkedList<>();
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.tasks.offer(new Runnable() { // from class: io.fabric.sdk.android.services.concurrency.AsyncTask.SerialExecutor.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        SerialExecutor.this.scheduleNext();
                    }
                }
            });
            if (this.active == null) {
                scheduleNext();
            }
        }

        public synchronized void scheduleNext() {
            Runnable poll = this.tasks.poll();
            this.active = poll;
            if (poll != null) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(poll);
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static abstract class WorkerRunnable<Params, Result> implements Callable<Result> {
        public Params[] params;

        private WorkerRunnable() {
        }
    }

    static {
        C0059ao.a(AsyncTask.class, 184);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        int i = availableProcessors + 1;
        CORE_POOL_SIZE = i;
        int i2 = (availableProcessors * 2) + 1;
        MAXIMUM_POOL_SIZE = i2;
        ThreadFactory threadFactory2 = new ThreadFactory() { // from class: io.fabric.sdk.android.services.concurrency.AsyncTask.1
            private final AtomicInteger count = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, C0059ao.a(2602) + this.count.getAndIncrement());
            }
        };
        threadFactory = threadFactory2;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue((int) Barcode.ITF);
        poolWorkQueue = linkedBlockingQueue;
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(i, i2, 1L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory2);
        SerialExecutor serialExecutor = new SerialExecutor();
        SERIAL_EXECUTOR = serialExecutor;
        handler = new InternalHandler();
        defaultExecutor = serialExecutor;
    }

    public AsyncTask() {
        WorkerRunnable<Params, Result> workerRunnable = new WorkerRunnable<Params, Result>() { // from class: io.fabric.sdk.android.services.concurrency.AsyncTask.2
            @Override // java.util.concurrent.Callable
            public Result call() throws Exception {
                AsyncTask.this.taskInvoked.set(true);
                Process.setThreadPriority(10);
                AsyncTask asyncTask = AsyncTask.this;
                return (Result) asyncTask.postResult(asyncTask.doInBackground(this.params));
            }
        };
        this.worker = workerRunnable;
        this.future = new FutureTask<Result>(workerRunnable) { // from class: io.fabric.sdk.android.services.concurrency.AsyncTask.3
            @Override // java.util.concurrent.FutureTask
            public void done() {
                try {
                    AsyncTask.this.postResultIfNotInvoked(get());
                } catch (InterruptedException e) {
                    Log.w(C0059ao.a(2671), e);
                } catch (CancellationException unused) {
                    AsyncTask.this.postResultIfNotInvoked(null);
                } catch (ExecutionException e2) {
                    throw new RuntimeException(C0059ao.a(2670), e2.getCause());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finish(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.status = Status.FINISHED;
    }

    public static void init() {
        handler.getLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Result postResult(Result result) {
        handler.obtainMessage(1, new AsyncTaskResult(this, result)).sendToTarget();
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postResultIfNotInvoked(Result result) {
        if (this.taskInvoked.get()) {
            return;
        }
        postResult(result);
    }

    public static void setDefaultExecutor(Executor executor) {
        defaultExecutor = executor;
    }

    public final boolean cancel(boolean z) {
        this.cancelled.set(true);
        return this.future.cancel(z);
    }

    public abstract Result doInBackground(Params... paramsArr);

    public final AsyncTask<Params, Progress, Result> execute(Params... paramsArr) {
        return executeOnExecutor(defaultExecutor, paramsArr);
    }

    public final AsyncTask<Params, Progress, Result> executeOnExecutor(Executor executor, Params... paramsArr) {
        if (this.status != Status.PENDING) {
            int i = AnonymousClass4.$SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[this.status.ordinal()];
            if (i == 1) {
                throw new IllegalStateException(C0059ao.a(14911));
            }
            if (i == 2) {
                throw new IllegalStateException(C0059ao.a(14910));
            }
        }
        this.status = Status.RUNNING;
        onPreExecute();
        this.worker.params = paramsArr;
        executor.execute(this.future);
        return this;
    }

    public final Result get() throws InterruptedException, ExecutionException {
        return this.future.get();
    }

    public final Status getStatus() {
        return this.status;
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public void onCancelled() {
    }

    public void onCancelled(Result result) {
        onCancelled();
    }

    public void onPostExecute(Result result) {
    }

    public void onPreExecute() {
    }

    public void onProgressUpdate(Progress... progressArr) {
    }

    public final void publishProgress(Progress... progressArr) {
        if (isCancelled()) {
            return;
        }
        handler.obtainMessage(2, new AsyncTaskResult(this, progressArr)).sendToTarget();
    }

    public static void execute(Runnable runnable) {
        defaultExecutor.execute(runnable);
    }

    public final Result get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.future.get(j, timeUnit);
    }
}
