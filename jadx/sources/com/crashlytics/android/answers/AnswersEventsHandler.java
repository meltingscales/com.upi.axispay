package com.crashlytics.android.answers;

import android.content.Context;
import com.crashlytics.android.answers.SessionEvent;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.events.EventsStorageListener;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.concurrent.ScheduledExecutorService;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AnswersEventsHandler implements EventsStorageListener {
    private final Context context;
    public final ScheduledExecutorService executor;
    private final AnswersFilesManagerProvider filesManagerProvider;
    private final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
    private final Kit kit;
    private final SessionMetadataCollector metadataCollector;
    private final HttpRequestFactory requestFactory;
    public SessionAnalyticsManagerStrategy strategy = new DisabledSessionAnalyticsManagerStrategy();

    public AnswersEventsHandler(Kit kit, Context context, AnswersFilesManagerProvider answersFilesManagerProvider, SessionMetadataCollector sessionMetadataCollector, HttpRequestFactory httpRequestFactory, ScheduledExecutorService scheduledExecutorService, FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter) {
        this.kit = kit;
        this.context = context;
        this.filesManagerProvider = answersFilesManagerProvider;
        this.metadataCollector = sessionMetadataCollector;
        this.requestFactory = httpRequestFactory;
        this.executor = scheduledExecutorService;
        this.firebaseAnalyticsApiAdapter = firebaseAnalyticsApiAdapter;
    }

    private void executeAsync(Runnable runnable) {
        try {
            this.executor.submit(runnable);
        } catch (Exception e) {
            Fabric.getLogger().e(C0059ao.a(2603), C0059ao.a(2604), e);
        }
    }

    private void executeSync(Runnable runnable) {
        try {
            this.executor.submit(runnable).get();
        } catch (Exception e) {
            Fabric.getLogger().e(C0059ao.a(2605), C0059ao.a(2606), e);
        }
    }

    public void disable() {
        executeAsync(new Runnable() { // from class: com.crashlytics.android.answers.AnswersEventsHandler.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AnswersEventsHandler answersEventsHandler = AnswersEventsHandler.this;
                    SessionAnalyticsManagerStrategy sessionAnalyticsManagerStrategy = answersEventsHandler.strategy;
                    answersEventsHandler.strategy = new DisabledSessionAnalyticsManagerStrategy();
                    sessionAnalyticsManagerStrategy.deleteAllEvents();
                } catch (Exception e) {
                    Fabric.getLogger().e(C0059ao.a(3036), C0059ao.a(3037), e);
                }
            }
        });
    }

    public void enable() {
        executeAsync(new Runnable() { // from class: com.crashlytics.android.answers.AnswersEventsHandler.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SessionEventMetadata metadata = AnswersEventsHandler.this.metadataCollector.getMetadata();
                    SessionAnalyticsFilesManager analyticsFilesManager = AnswersEventsHandler.this.filesManagerProvider.getAnalyticsFilesManager();
                    analyticsFilesManager.registerRollOverListener(AnswersEventsHandler.this);
                    AnswersEventsHandler answersEventsHandler = AnswersEventsHandler.this;
                    Kit kit = answersEventsHandler.kit;
                    Context context = AnswersEventsHandler.this.context;
                    AnswersEventsHandler answersEventsHandler2 = AnswersEventsHandler.this;
                    answersEventsHandler.strategy = new EnabledSessionAnalyticsManagerStrategy(kit, context, answersEventsHandler2.executor, analyticsFilesManager, answersEventsHandler2.requestFactory, metadata, AnswersEventsHandler.this.firebaseAnalyticsApiAdapter);
                } catch (Exception e) {
                    Fabric.getLogger().e(C0059ao.a(3233), C0059ao.a(3234), e);
                }
            }
        });
    }

    public void flushEvents() {
        executeAsync(new Runnable() { // from class: com.crashlytics.android.answers.AnswersEventsHandler.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AnswersEventsHandler.this.strategy.rollFileOver();
                } catch (Exception e) {
                    Fabric.getLogger().e(C0059ao.a(3221), C0059ao.a(3222), e);
                }
            }
        });
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorageListener
    public void onRollOver(String str) {
        executeAsync(new Runnable() { // from class: com.crashlytics.android.answers.AnswersEventsHandler.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AnswersEventsHandler.this.strategy.sendEvents();
                } catch (Exception e) {
                    Fabric.getLogger().e(C0059ao.a(2977), C0059ao.a(2978), e);
                }
            }
        });
    }

    public void processEvent(final SessionEvent.Builder builder, boolean z, final boolean z2) {
        Runnable runnable = new Runnable() { // from class: com.crashlytics.android.answers.AnswersEventsHandler.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AnswersEventsHandler.this.strategy.processEvent(builder);
                    if (z2) {
                        AnswersEventsHandler.this.strategy.rollFileOver();
                    }
                } catch (Exception e) {
                    Fabric.getLogger().e(C0059ao.a(3339), C0059ao.a(3340), e);
                }
            }
        };
        if (z) {
            executeSync(runnable);
        } else {
            executeAsync(runnable);
        }
    }

    public void processEventAsync(SessionEvent.Builder builder) {
        processEvent(builder, false, false);
    }

    public void processEventAsyncAndFlush(SessionEvent.Builder builder) {
        processEvent(builder, false, true);
    }

    public void processEventSync(SessionEvent.Builder builder) {
        processEvent(builder, true, false);
    }

    public void setAnalyticsSettingsData(final AnalyticsSettingsData analyticsSettingsData, final String str) {
        executeAsync(new Runnable() { // from class: com.crashlytics.android.answers.AnswersEventsHandler.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AnswersEventsHandler.this.strategy.setAnalyticsSettingsData(analyticsSettingsData, str);
                } catch (Exception e) {
                    Fabric.getLogger().e(C0059ao.a(2953), C0059ao.a(2954), e);
                }
            }
        });
    }
}
