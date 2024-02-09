package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import myunmn.C0059ao;
import okhttp3.internal.Util;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class TaskQueue {
    private Task activeTask;
    private boolean cancelActiveTask;
    private final List<Task> futureTasks;
    private final String name;
    private boolean shutdown;
    private final TaskRunner taskRunner;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class AwaitIdleTask extends Task {
        private final CountDownLatch latch;

        public AwaitIdleTask() {
            super(Util.okHttpName + C0059ao.a(10793), false);
            this.latch = new CountDownLatch(1);
        }

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.latch.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
        yl0.e(taskRunner, C0059ao.a(15288));
        yl0.e(str, C0059ao.a(15289));
        this.taskRunner = taskRunner;
        this.name = str;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String str, long j, boolean z, sk0 sk0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        yl0.e(str, C0059ao.a(15290));
        yl0.e(sk0Var, C0059ao.a(15291));
        taskQueue.schedule(new TaskQueue$execute$1(sk0Var, str, z2, str, z2), j);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        taskQueue.schedule(task, j);
    }

    public final void cancelAll() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(15294));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(15295));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(15296));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.taskRunner) {
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            pi0 pi0Var = pi0.a;
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null) {
            yl0.c(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z = false;
        for (int size = this.futureTasks.size() - 1; size >= 0; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                Task task2 = this.futureTasks.get(size);
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task2, this, C0059ao.a(15297));
                }
                this.futureTasks.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void execute(String str, long j, boolean z, sk0<pi0> sk0Var) {
        yl0.e(str, C0059ao.a(15298));
        yl0.e(sk0Var, C0059ao.a(15299));
        schedule(new TaskQueue$execute$1(sk0Var, str, z, str, z), j);
    }

    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    public final List<Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    public final String getName$okhttp() {
        return this.name;
    }

    public final List<Task> getScheduledTasks() {
        List<Task> I;
        synchronized (this.taskRunner) {
            I = ij0.I(this.futureTasks);
        }
        return I;
    }

    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (this.activeTask == null && this.futureTasks.isEmpty()) {
                return new CountDownLatch(0);
            }
            Task task = this.activeTask;
            if (task instanceof AwaitIdleTask) {
                return ((AwaitIdleTask) task).getLatch();
            }
            for (Task task2 : this.futureTasks) {
                if (task2 instanceof AwaitIdleTask) {
                    return ((AwaitIdleTask) task2).getLatch();
                }
            }
            AwaitIdleTask awaitIdleTask = new AwaitIdleTask();
            if (scheduleAndDecide$okhttp(awaitIdleTask, 0L, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            return awaitIdleTask.getLatch();
        }
    }

    public final void schedule(Task task, long j) {
        yl0.e(task, C0059ao.a(15302));
        synchronized (this.taskRunner) {
            if (this.shutdown) {
                if (task.getCancelable()) {
                    if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                        TaskLoggerKt.access$log(task, this, C0059ao.a(15303));
                    }
                    return;
                }
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task, this, C0059ao.a(15304));
                }
                throw new RejectedExecutionException();
            }
            if (scheduleAndDecide$okhttp(task, j, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            pi0 pi0Var = pi0.a;
        }
    }

    public final boolean scheduleAndDecide$okhttp(Task task, long j, boolean z) {
        String str;
        yl0.e(task, C0059ao.a(15305));
        task.initQueue$okhttp(this);
        long nanoTime = this.taskRunner.getBackend().nanoTime();
        long j2 = nanoTime + j;
        int indexOf = this.futureTasks.indexOf(task);
        if (indexOf != -1) {
            if (task.getNextExecuteNanoTime$okhttp() <= j2) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task, this, C0059ao.a(15306));
                }
                return false;
            }
            this.futureTasks.remove(indexOf);
        }
        task.setNextExecuteNanoTime$okhttp(j2);
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            if (z) {
                str = C0059ao.a(15307) + TaskLoggerKt.formatDuration(j2 - nanoTime);
            } else {
                str = C0059ao.a(15308) + TaskLoggerKt.formatDuration(j2 - nanoTime);
            }
            TaskLoggerKt.access$log(task, this, str);
        }
        Iterator<Task> it = this.futureTasks.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime$okhttp() - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.futureTasks.size();
        }
        this.futureTasks.add(i, task);
        return i == 0;
    }

    public final void setActiveTask$okhttp(Task task) {
        this.activeTask = task;
    }

    public final void setCancelActiveTask$okhttp(boolean z) {
        this.cancelActiveTask = z;
    }

    public final void setShutdown$okhttp(boolean z) {
        this.shutdown = z;
    }

    public final void shutdown() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0059ao.a(15309));
            Thread currentThread = Thread.currentThread();
            yl0.d(currentThread, C0059ao.a(15310));
            sb.append(currentThread.getName());
            sb.append(C0059ao.a(15311));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.taskRunner) {
            this.shutdown = true;
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            pi0 pi0Var = pi0.a;
        }
    }

    public String toString() {
        return this.name;
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String str, long j, sk0 sk0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        yl0.e(str, C0059ao.a(15292));
        yl0.e(sk0Var, C0059ao.a(15293));
        taskQueue.schedule(new TaskQueue$schedule$2(sk0Var, str, str), j);
    }

    public final void schedule(String str, long j, sk0<Long> sk0Var) {
        yl0.e(str, C0059ao.a(15300));
        yl0.e(sk0Var, C0059ao.a(15301));
        schedule(new TaskQueue$schedule$2(sk0Var, str, str), j);
    }
}
