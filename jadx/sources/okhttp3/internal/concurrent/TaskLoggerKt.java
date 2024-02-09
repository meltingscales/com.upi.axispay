package okhttp3.internal.concurrent;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class TaskLoggerKt {
    public static final /* synthetic */ void access$log(Task task, TaskQueue taskQueue, String str) {
        log(task, taskQueue, str);
    }

    public static final String formatDuration(long j) {
        String str;
        int i = (j > (-999500000) ? 1 : (j == (-999500000) ? 0 : -1));
        String a = C0059ao.a(6586);
        if (i <= 0) {
            str = ((j - 500000000) / 1000000000) + a;
        } else {
            int i2 = (j > (-999500) ? 1 : (j == (-999500) ? 0 : -1));
            String a2 = C0059ao.a(6587);
            if (i2 <= 0) {
                str = ((j - 500000) / 1000000) + a2;
            } else {
                int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                String a3 = C0059ao.a(6588);
                if (i3 <= 0) {
                    str = ((j - ((long) FirebaseCrashlytics.APP_EXCEPTION_CALLBACK_TIMEOUT_MS)) / 1000) + a3;
                } else if (j < 999500) {
                    str = ((j + ((long) FirebaseCrashlytics.APP_EXCEPTION_CALLBACK_TIMEOUT_MS)) / 1000) + a3;
                } else if (j < 999500000) {
                    str = ((j + 500000) / 1000000) + a2;
                } else {
                    str = ((j + 500000000) / 1000000000) + a;
                }
            }
        }
        mm0 mm0Var = mm0.a;
        String format = String.format(C0059ao.a(6589), Arrays.copyOf(new Object[]{str}, 1));
        yl0.d(format, C0059ao.a(6590));
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        mm0 mm0Var = mm0.a;
        String format = String.format(C0059ao.a(6591), Arrays.copyOf(new Object[]{str}, 1));
        yl0.d(format, C0059ao.a(6592));
        sb.append(format);
        sb.append(C0059ao.a(6593));
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, sk0<? extends T> sk0Var) {
        long j;
        yl0.e(task, C0059ao.a(6594));
        yl0.e(taskQueue, C0059ao.a(6595));
        yl0.e(sk0Var, C0059ao.a(6596));
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, C0059ao.a(6597));
        } else {
            j = -1;
        }
        try {
            T invoke = sk0Var.invoke();
            xl0.b(1);
            if (isLoggable) {
                long nanoTime = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j;
                log(task, taskQueue, C0059ao.a(6598) + formatDuration(nanoTime));
            }
            xl0.a(1);
            return invoke;
        } catch (Throwable th) {
            xl0.b(1);
            if (isLoggable) {
                long nanoTime2 = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j;
                log(task, taskQueue, C0059ao.a(6599) + formatDuration(nanoTime2));
            }
            xl0.a(1);
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, sk0<String> sk0Var) {
        yl0.e(task, C0059ao.a(6600));
        yl0.e(taskQueue, C0059ao.a(6601));
        yl0.e(sk0Var, C0059ao.a(6602));
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, sk0Var.invoke());
        }
    }
}
