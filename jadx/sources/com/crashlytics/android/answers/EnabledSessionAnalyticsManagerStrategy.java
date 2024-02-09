package com.crashlytics.android.answers;

import android.content.Context;
import com.crashlytics.android.answers.SessionEvent;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.events.TimeBasedFileRollOverRunnable;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
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
public class EnabledSessionAnalyticsManagerStrategy implements SessionAnalyticsManagerStrategy {
    public static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = 0;
    private final Context context;
    private final ScheduledExecutorService executorService;
    private final SessionAnalyticsFilesManager filesManager;
    public FilesSender filesSender;
    private final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
    private final HttpRequestFactory httpRequestFactory;
    private final Kit kit;
    public final SessionEventMetadata metadata;
    private final AtomicReference<ScheduledFuture<?>> rolloverFutureRef = new AtomicReference<>();
    public ApiKey apiKey = new ApiKey();
    public EventFilter eventFilter = new KeepAllEventFilter();
    public boolean customEventsEnabled = true;
    public boolean predefinedEventsEnabled = true;
    public volatile int rolloverIntervalSeconds = -1;
    public boolean forwardToFirebaseAnalyticsEnabled = false;
    public boolean includePurchaseEventsInForwardedEvents = false;

    static {
        C0059ao.a(EnabledSessionAnalyticsManagerStrategy.class, 411);
    }

    public EnabledSessionAnalyticsManagerStrategy(Kit kit, Context context, ScheduledExecutorService scheduledExecutorService, SessionAnalyticsFilesManager sessionAnalyticsFilesManager, HttpRequestFactory httpRequestFactory, SessionEventMetadata sessionEventMetadata, FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter) {
        this.kit = kit;
        this.context = context;
        this.executorService = scheduledExecutorService;
        this.filesManager = sessionAnalyticsFilesManager;
        this.httpRequestFactory = httpRequestFactory;
        this.metadata = sessionEventMetadata;
        this.firebaseAnalyticsApiAdapter = firebaseAnalyticsApiAdapter;
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public void cancelTimeBasedFileRollOver() {
        if (this.rolloverFutureRef.get() != null) {
            CommonUtils.logControlled(this.context, C0059ao.a(2339));
            this.rolloverFutureRef.get().cancel(false);
            this.rolloverFutureRef.set(null);
        }
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void deleteAllEvents() {
        this.filesManager.deleteAllEventsFiles();
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void processEvent(SessionEvent.Builder builder) {
        SessionEvent build = builder.build(this.metadata);
        boolean z = this.customEventsEnabled;
        String a = C0059ao.a(2340);
        if (!z && SessionEvent.Type.CUSTOM.equals(build.type)) {
            Logger logger = Fabric.getLogger();
            logger.d(a, C0059ao.a(2341) + build);
        } else if (!this.predefinedEventsEnabled && SessionEvent.Type.PREDEFINED.equals(build.type)) {
            Logger logger2 = Fabric.getLogger();
            logger2.d(a, C0059ao.a(2342) + build);
        } else if (this.eventFilter.skipEvent(build)) {
            Logger logger3 = Fabric.getLogger();
            logger3.d(a, C0059ao.a(2343) + build);
        } else {
            try {
                this.filesManager.writeEvent(build);
            } catch (IOException e) {
                Logger logger4 = Fabric.getLogger();
                logger4.e(a, C0059ao.a(2344) + build, e);
            }
            scheduleTimeBasedRollOverIfNeeded();
            boolean z2 = SessionEvent.Type.CUSTOM.equals(build.type) || SessionEvent.Type.PREDEFINED.equals(build.type);
            boolean equals = C0059ao.a(2345).equals(build.predefinedType);
            if (this.forwardToFirebaseAnalyticsEnabled && z2) {
                if (!equals || this.includePurchaseEventsInForwardedEvents) {
                    try {
                        this.firebaseAnalyticsApiAdapter.processEvent(build);
                    } catch (Exception e2) {
                        Logger logger5 = Fabric.getLogger();
                        logger5.e(a, C0059ao.a(2346) + build, e2);
                    }
                }
            }
        }
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public boolean rollFileOver() {
        try {
            return this.filesManager.rollFileOver();
        } catch (IOException e) {
            CommonUtils.logControlledError(this.context, C0059ao.a(2347), e);
            return false;
        }
    }

    public void scheduleTimeBasedFileRollOver(long j, long j2) {
        if (this.rolloverFutureRef.get() == null) {
            TimeBasedFileRollOverRunnable timeBasedFileRollOverRunnable = new TimeBasedFileRollOverRunnable(this.context, this);
            Context context = this.context;
            CommonUtils.logControlled(context, C0059ao.a(2348) + j2 + C0059ao.a(2349));
            try {
                this.rolloverFutureRef.set(this.executorService.scheduleAtFixedRate(timeBasedFileRollOverRunnable, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e) {
                CommonUtils.logControlledError(this.context, C0059ao.a(2350), e);
            }
        }
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public void scheduleTimeBasedRollOverIfNeeded() {
        if (this.rolloverIntervalSeconds != -1) {
            scheduleTimeBasedFileRollOver(this.rolloverIntervalSeconds, this.rolloverIntervalSeconds);
        }
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void sendEvents() {
        if (this.filesSender == null) {
            CommonUtils.logControlled(this.context, C0059ao.a(2351));
            return;
        }
        CommonUtils.logControlled(this.context, C0059ao.a(2352));
        List<File> batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
        int i = 0;
        while (batchOfFilesToSend.size() > 0) {
            try {
                CommonUtils.logControlled(this.context, String.format(Locale.US, C0059ao.a(2353), Integer.valueOf(batchOfFilesToSend.size())));
                boolean send = this.filesSender.send(batchOfFilesToSend);
                if (send) {
                    i += batchOfFilesToSend.size();
                    this.filesManager.deleteSentFiles(batchOfFilesToSend);
                }
                if (!send) {
                    break;
                }
                batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
            } catch (Exception e) {
                CommonUtils.logControlledError(this.context, C0059ao.a(2354) + e.getMessage(), e);
            }
        }
        if (i == 0) {
            this.filesManager.deleteOldestInRollOverIfOverMax();
        }
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void setAnalyticsSettingsData(AnalyticsSettingsData analyticsSettingsData, String str) {
        this.filesSender = AnswersRetryFilesSender.build(new SessionAnalyticsFilesSender(this.kit, str, analyticsSettingsData.analyticsURL, this.httpRequestFactory, this.apiKey.getValue(this.context)));
        this.filesManager.setAnalyticsSettingsData(analyticsSettingsData);
        this.forwardToFirebaseAnalyticsEnabled = analyticsSettingsData.forwardToFirebaseAnalytics;
        this.includePurchaseEventsInForwardedEvents = analyticsSettingsData.includePurchaseEventsInForwardedEvents;
        Logger logger = Fabric.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(2355));
        boolean z = this.forwardToFirebaseAnalyticsEnabled;
        String a = C0059ao.a(2356);
        String a2 = C0059ao.a(2357);
        sb.append(z ? a : a2);
        String sb2 = sb.toString();
        String a3 = C0059ao.a(2358);
        logger.d(a3, sb2);
        Logger logger2 = Fabric.getLogger();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C0059ao.a(2359));
        sb3.append(this.includePurchaseEventsInForwardedEvents ? a : a2);
        logger2.d(a3, sb3.toString());
        this.customEventsEnabled = analyticsSettingsData.trackCustomEvents;
        Logger logger3 = Fabric.getLogger();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C0059ao.a(2360));
        sb4.append(this.customEventsEnabled ? a : a2);
        logger3.d(a3, sb4.toString());
        this.predefinedEventsEnabled = analyticsSettingsData.trackPredefinedEvents;
        Logger logger4 = Fabric.getLogger();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C0059ao.a(2361));
        if (!this.predefinedEventsEnabled) {
            a = a2;
        }
        sb5.append(a);
        logger4.d(a3, sb5.toString());
        if (analyticsSettingsData.samplingRate > 1) {
            Fabric.getLogger().d(a3, C0059ao.a(2362));
            this.eventFilter = new SamplingEventFilter(analyticsSettingsData.samplingRate);
        }
        this.rolloverIntervalSeconds = analyticsSettingsData.flushIntervalSeconds;
        scheduleTimeBasedFileRollOver(0L, this.rolloverIntervalSeconds);
    }
}
