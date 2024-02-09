package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class EnabledEventsStrategy<T> implements EventsStrategy<T> {
    public static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = 0;
    public final Context context;
    public final ScheduledExecutorService executorService;
    public final EventsFilesManager<T> filesManager;
    public volatile int rolloverIntervalSeconds = -1;
    public final AtomicReference<ScheduledFuture<?>> scheduledRolloverFutureRef = new AtomicReference<>();

    static {
        C0059ao.a(EnabledEventsStrategy.class, 262);
    }

    public EnabledEventsStrategy(Context context, ScheduledExecutorService scheduledExecutorService, EventsFilesManager<T> eventsFilesManager) {
        this.context = context;
        this.executorService = scheduledExecutorService;
        this.filesManager = eventsFilesManager;
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public void cancelTimeBasedFileRollOver() {
        if (this.scheduledRolloverFutureRef.get() != null) {
            CommonUtils.logControlled(this.context, C0059ao.a(15321));
            this.scheduledRolloverFutureRef.get().cancel(false);
            this.scheduledRolloverFutureRef.set(null);
        }
    }

    public void configureRollover(int i) {
        this.rolloverIntervalSeconds = i;
        scheduleTimeBasedFileRollOver(0L, this.rolloverIntervalSeconds);
    }

    @Override // io.fabric.sdk.android.services.events.EventsManager
    public void deleteAllEvents() {
        this.filesManager.deleteAllEventsFiles();
    }

    public int getRollover() {
        return this.rolloverIntervalSeconds;
    }

    @Override // io.fabric.sdk.android.services.events.EventsManager
    public void recordEvent(T t) {
        CommonUtils.logControlled(this.context, t.toString());
        try {
            this.filesManager.writeEvent(t);
        } catch (IOException e) {
            CommonUtils.logControlledError(this.context, C0059ao.a(15322), e);
        }
        scheduleTimeBasedRollOverIfNeeded();
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public boolean rollFileOver() {
        try {
            return this.filesManager.rollFileOver();
        } catch (IOException e) {
            CommonUtils.logControlledError(this.context, C0059ao.a(15323), e);
            return false;
        }
    }

    public void scheduleTimeBasedFileRollOver(long j, long j2) {
        if (this.scheduledRolloverFutureRef.get() == null) {
            TimeBasedFileRollOverRunnable timeBasedFileRollOverRunnable = new TimeBasedFileRollOverRunnable(this.context, this);
            Context context = this.context;
            CommonUtils.logControlled(context, C0059ao.a(15324) + j2 + C0059ao.a(15325));
            try {
                this.scheduledRolloverFutureRef.set(this.executorService.scheduleAtFixedRate(timeBasedFileRollOverRunnable, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e) {
                CommonUtils.logControlledError(this.context, C0059ao.a(15326), e);
            }
        }
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public void scheduleTimeBasedRollOverIfNeeded() {
        if (this.rolloverIntervalSeconds != -1) {
            scheduleTimeBasedFileRollOver(this.rolloverIntervalSeconds, this.rolloverIntervalSeconds);
        }
    }

    public void sendAndCleanUpIfSuccess() {
        FilesSender filesSender = getFilesSender();
        if (filesSender == null) {
            CommonUtils.logControlled(this.context, C0059ao.a(15327));
            return;
        }
        CommonUtils.logControlled(this.context, C0059ao.a(15328));
        List<File> batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
        int i = 0;
        while (batchOfFilesToSend.size() > 0) {
            try {
                CommonUtils.logControlled(this.context, String.format(Locale.US, C0059ao.a(15329), Integer.valueOf(batchOfFilesToSend.size())));
                boolean send = filesSender.send(batchOfFilesToSend);
                if (send) {
                    i += batchOfFilesToSend.size();
                    this.filesManager.deleteSentFiles(batchOfFilesToSend);
                }
                if (!send) {
                    break;
                }
                batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
            } catch (Exception e) {
                CommonUtils.logControlledError(this.context, C0059ao.a(15330) + e.getMessage(), e);
            }
        }
        if (i == 0) {
            this.filesManager.deleteOldestInRollOverIfOverMax();
        }
    }

    @Override // io.fabric.sdk.android.services.events.EventsManager
    public void sendEvents() {
        sendAndCleanUpIfSuccess();
    }
}
