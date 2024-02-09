package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.util.concurrent.ScheduledExecutorService;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class EventsHandler<T> implements EventsStorageListener {
    public final Context context;
    public final ScheduledExecutorService executor;
    public EventsStrategy<T> strategy;

    public EventsHandler(Context context, EventsStrategy<T> eventsStrategy, EventsFilesManager eventsFilesManager, ScheduledExecutorService scheduledExecutorService) {
        this.context = context.getApplicationContext();
        this.executor = scheduledExecutorService;
        this.strategy = eventsStrategy;
        eventsFilesManager.registerRollOverListener(this);
    }

    public void disable() {
        executeAsync(new Runnable() { // from class: io.fabric.sdk.android.services.events.EventsHandler.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    EventsHandler eventsHandler = EventsHandler.this;
                    EventsStrategy<T> eventsStrategy = eventsHandler.strategy;
                    eventsHandler.strategy = eventsHandler.getDisabledEventsStrategy();
                    eventsStrategy.deleteAllEvents();
                } catch (Exception e) {
                    CommonUtils.logControlledError(EventsHandler.this.context, C0059ao.a(4752), e);
                }
            }
        });
    }

    public void executeAsync(Runnable runnable) {
        try {
            this.executor.submit(runnable);
        } catch (Exception e) {
            CommonUtils.logControlledError(this.context, C0059ao.a(9604), e);
        }
    }

    public void executeSync(Runnable runnable) {
        try {
            this.executor.submit(runnable).get();
        } catch (Exception e) {
            CommonUtils.logControlledError(this.context, C0059ao.a(9605), e);
        }
    }

    public abstract EventsStrategy<T> getDisabledEventsStrategy();

    @Override // io.fabric.sdk.android.services.events.EventsStorageListener
    public void onRollOver(String str) {
        executeAsync(new Runnable() { // from class: io.fabric.sdk.android.services.events.EventsHandler.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    EventsHandler.this.strategy.sendEvents();
                } catch (Exception e) {
                    CommonUtils.logControlledError(EventsHandler.this.context, C0059ao.a(4777), e);
                }
            }
        });
    }

    public void recordEventAsync(final T t, final boolean z) {
        executeAsync(new Runnable() { // from class: io.fabric.sdk.android.services.events.EventsHandler.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    EventsHandler.this.strategy.recordEvent(t);
                    if (z) {
                        EventsHandler.this.strategy.rollFileOver();
                    }
                } catch (Exception e) {
                    CommonUtils.logControlledError(EventsHandler.this.context, C0059ao.a(4627), e);
                }
            }
        });
    }

    public void recordEventSync(final T t) {
        executeSync(new Runnable() { // from class: io.fabric.sdk.android.services.events.EventsHandler.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    EventsHandler.this.strategy.recordEvent(t);
                } catch (Exception e) {
                    CommonUtils.logControlledError(EventsHandler.this.context, C0059ao.a(4585), e);
                }
            }
        });
    }
}
