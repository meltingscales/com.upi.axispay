package okhttp3.internal.concurrent;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import myunmn.C0059ao;
import okhttp3.internal.Util;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class TaskRunner {
    public static final Companion Companion = new Companion(null);
    public static final TaskRunner INSTANCE = new TaskRunner(new RealBackend(Util.threadFactory(Util.okHttpName + C0059ao.a(8071), true)));
    private static final Logger logger;
    private final Backend backend;
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;
    private final List<TaskQueue> readyQueues;
    private final Runnable runnable;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface Backend {
        void beforeTask(TaskRunner taskRunner);

        void coordinatorNotify(TaskRunner taskRunner);

        void coordinatorWait(TaskRunner taskRunner, long j);

        void execute(Runnable runnable);

        long nanoTime();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Logger getLogger() {
            return TaskRunner.logger;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class RealBackend implements Backend {
        private final ThreadPoolExecutor executor;

        public RealBackend(ThreadFactory threadFactory) {
            yl0.e(threadFactory, C0059ao.a(7765));
            this.executor = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void beforeTask(TaskRunner taskRunner) {
            yl0.e(taskRunner, C0059ao.a(7766));
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(TaskRunner taskRunner) {
            yl0.e(taskRunner, C0059ao.a(7767));
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(TaskRunner taskRunner, long j) throws InterruptedException {
            yl0.e(taskRunner, C0059ao.a(7768));
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(Runnable runnable) {
            yl0.e(runnable, C0059ao.a(7769));
            this.executor.execute(runnable);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.executor.shutdown();
        }
    }

    static {
        Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
        yl0.d(logger2, C0059ao.a(8072));
        logger = logger2;
    }

    public TaskRunner(Backend backend) {
        yl0.e(backend, C0059ao.a(8073));
        this.backend = backend;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Task awaitTaskToRun;
                while (true) {
                    synchronized (TaskRunner.this) {
                        awaitTaskToRun = TaskRunner.this.awaitTaskToRun();
                    }
                    if (awaitTaskToRun == null) {
                        return;
                    }
                    TaskQueue queue$okhttp = awaitTaskToRun.getQueue$okhttp();
                    yl0.c(queue$okhttp);
                    long j = -1;
                    boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                        TaskLoggerKt.access$log(awaitTaskToRun, queue$okhttp, C0059ao.a(1437));
                    }
                    try {
                        TaskRunner.this.runTask(awaitTaskToRun);
                        pi0 pi0Var = pi0.a;
                        if (isLoggable) {
                            long nanoTime = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - j;
                            TaskLoggerKt.access$log(awaitTaskToRun, queue$okhttp, C0059ao.a(1438) + TaskLoggerKt.formatDuration(nanoTime));
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            long nanoTime2 = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - j;
                            TaskLoggerKt.access$log(awaitTaskToRun, queue$okhttp, C0059ao.a(1439) + TaskLoggerKt.formatDuration(nanoTime2));
                        }
                        throw th;
                    }
                }
            }
        };
    }

    private final void afterRun(Task task, long j) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(8074));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(8075));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(8076));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        TaskQueue queue$okhttp = task.getQueue$okhttp();
        yl0.c(queue$okhttp);
        if (queue$okhttp.getActiveTask$okhttp() == task) {
            boolean cancelActiveTask$okhttp = queue$okhttp.getCancelActiveTask$okhttp();
            queue$okhttp.setCancelActiveTask$okhttp(false);
            queue$okhttp.setActiveTask$okhttp(null);
            this.busyQueues.remove(queue$okhttp);
            if (j != -1 && !cancelActiveTask$okhttp && !queue$okhttp.getShutdown$okhttp()) {
                queue$okhttp.scheduleAndDecide$okhttp(task, j, true);
            }
            if (!queue$okhttp.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.add(queue$okhttp);
                return;
            }
            return;
        }
        throw new IllegalStateException(C0059ao.a(8077).toString());
    }

    private final void beforeRun(Task task) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(8078));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(8079));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(8080));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        task.setNextExecuteNanoTime$okhttp(-1L);
        TaskQueue queue$okhttp = task.getQueue$okhttp();
        yl0.c(queue$okhttp);
        queue$okhttp.getFutureTasks$okhttp().remove(task);
        this.readyQueues.remove(queue$okhttp);
        queue$okhttp.setActiveTask$okhttp(task);
        this.busyQueues.add(queue$okhttp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runTask(Task task) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(8081));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(8082));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(8083));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        Thread currentThread2 = Thread.currentThread();
        yl0.d(currentThread2, C0059ao.a(8084));
        String name = currentThread2.getName();
        currentThread2.setName(task.getName());
        try {
            long runOnce = task.runOnce();
            synchronized (this) {
                afterRun(task, runOnce);
                pi0 pi0Var = pi0.a;
            }
            currentThread2.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                afterRun(task, -1L);
                pi0 pi0Var2 = pi0.a;
                currentThread2.setName(name);
                throw th;
            }
        }
    }

    public final List<TaskQueue> activeQueues() {
        List<TaskQueue> C;
        synchronized (this) {
            C = ij0.C(this.busyQueues, this.readyQueues);
        }
        return C;
    }

    public final Task awaitTaskToRun() {
        boolean z;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(8085));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(8086));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(8087));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        while (!this.readyQueues.isEmpty()) {
            long nanoTime = this.backend.nanoTime();
            long j = RecyclerView.FOREVER_NS;
            Iterator<TaskQueue> it = this.readyQueues.iterator();
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Task task2 = it.next().getFutureTasks$okhttp().get(0);
                long max = Math.max(0L, task2.getNextExecuteNanoTime$okhttp() - nanoTime);
                if (max > 0) {
                    j = Math.min(max, j);
                } else if (task != null) {
                    z = true;
                    break;
                } else {
                    task = task2;
                }
            }
            if (task != null) {
                beforeRun(task);
                if (z || (!this.coordinatorWaiting && (!this.readyQueues.isEmpty()))) {
                    this.backend.execute(this.runnable);
                }
                return task;
            } else if (this.coordinatorWaiting) {
                if (j < this.coordinatorWakeUpAt - nanoTime) {
                    this.backend.coordinatorNotify(this);
                }
                return null;
            } else {
                this.coordinatorWaiting = true;
                this.coordinatorWakeUpAt = nanoTime + j;
                try {
                    try {
                        this.backend.coordinatorWait(this, j);
                    } catch (InterruptedException unused) {
                        cancelAll();
                    }
                } finally {
                    this.coordinatorWaiting = false;
                }
            }
        }
        return null;
    }

    public final void cancelAll() {
        for (int size = this.busyQueues.size() - 1; size >= 0; size--) {
            this.busyQueues.get(size).cancelAllAndDecide$okhttp();
        }
        for (int size2 = this.readyQueues.size() - 1; size2 >= 0; size2--) {
            TaskQueue taskQueue = this.readyQueues.get(size2);
            taskQueue.cancelAllAndDecide$okhttp();
            if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    public final Backend getBackend() {
        return this.backend;
    }

    public final void kickCoordinator$okhttp(TaskQueue taskQueue) {
        yl0.e(taskQueue, C0059ao.a(8088));
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(8089));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(8090));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(8091));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (taskQueue.getActiveTask$okhttp() == null) {
            if (!taskQueue.getFutureTasks$okhttp().isEmpty()) {
                Util.addIfAbsent(this.readyQueues, taskQueue);
            } else {
                this.readyQueues.remove(taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.coordinatorNotify(this);
        } else {
            this.backend.execute(this.runnable);
        }
    }

    public final TaskQueue newQueue() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new TaskQueue(this, sb.toString());
    }
}
