package com.crashlytics.android.answers;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.crashlytics.android.answers.BackgroundManager;
import com.crashlytics.android.answers.SessionEvent;
import io.fabric.sdk.android.ActivityLifecycleManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ExecutorUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.concurrent.ScheduledExecutorService;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SessionAnalyticsManager implements BackgroundManager.Listener {
    public static final String EXECUTOR_SERVICE = null;
    public static final String ON_CRASH_ERROR_MSG = null;
    public final BackgroundManager backgroundManager;
    public final AnswersEventsHandler eventsHandler;
    private final long installedAt;
    public final ActivityLifecycleManager lifecycleManager;
    public final AnswersPreferenceManager preferenceManager;

    static {
        C0059ao.a(SessionAnalyticsManager.class, 326);
    }

    public SessionAnalyticsManager(AnswersEventsHandler answersEventsHandler, ActivityLifecycleManager activityLifecycleManager, BackgroundManager backgroundManager, AnswersPreferenceManager answersPreferenceManager, long j) {
        this.eventsHandler = answersEventsHandler;
        this.lifecycleManager = activityLifecycleManager;
        this.backgroundManager = backgroundManager;
        this.preferenceManager = answersPreferenceManager;
        this.installedAt = j;
    }

    public static SessionAnalyticsManager build(Kit kit, Context context, IdManager idManager, String str, String str2, long j) {
        SessionMetadataCollector sessionMetadataCollector = new SessionMetadataCollector(context, idManager, str, str2);
        AnswersFilesManagerProvider answersFilesManagerProvider = new AnswersFilesManagerProvider(context, new FileStoreImpl(kit));
        DefaultHttpRequestFactory defaultHttpRequestFactory = new DefaultHttpRequestFactory(Fabric.getLogger());
        ActivityLifecycleManager activityLifecycleManager = new ActivityLifecycleManager(context);
        ScheduledExecutorService buildSingleThreadScheduledExecutorService = ExecutorUtils.buildSingleThreadScheduledExecutorService(C0059ao.a(14425));
        return new SessionAnalyticsManager(new AnswersEventsHandler(kit, context, answersFilesManagerProvider, sessionMetadataCollector, defaultHttpRequestFactory, buildSingleThreadScheduledExecutorService, new FirebaseAnalyticsApiAdapter(context)), activityLifecycleManager, new BackgroundManager(buildSingleThreadScheduledExecutorService), AnswersPreferenceManager.build(context), j);
    }

    public void disable() {
        this.lifecycleManager.resetCallbacks();
        this.eventsHandler.disable();
    }

    public void enable() {
        this.eventsHandler.enable();
        this.lifecycleManager.registerCallbacks(new AnswersLifecycleCallbacks(this, this.backgroundManager));
        this.backgroundManager.registerListener(this);
        if (isFirstLaunch()) {
            onInstall(this.installedAt);
            this.preferenceManager.setAnalyticsLaunched();
        }
    }

    public boolean isFirstLaunch() {
        return !this.preferenceManager.hasAnalyticsLaunched();
    }

    @Override // com.crashlytics.android.answers.BackgroundManager.Listener
    public void onBackground() {
        Fabric.getLogger().d(C0059ao.a(14426), C0059ao.a(14427));
        this.eventsHandler.flushEvents();
    }

    public void onCrash(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Fabric.getLogger().d(C0059ao.a(14428), C0059ao.a(14429));
            this.eventsHandler.processEventSync(SessionEvent.crashEventBuilder(str, str2));
            return;
        }
        throw new IllegalStateException(C0059ao.a(14430));
    }

    public void onCustom(CustomEvent customEvent) {
        Logger logger = Fabric.getLogger();
        logger.d(C0059ao.a(14432), C0059ao.a(14431) + customEvent);
        this.eventsHandler.processEventAsync(SessionEvent.customEventBuilder(customEvent));
    }

    public void onError(String str) {
    }

    public void onInstall(long j) {
        Fabric.getLogger().d(C0059ao.a(14433), C0059ao.a(14434));
        this.eventsHandler.processEventAsyncAndFlush(SessionEvent.installEventBuilder(j));
    }

    public void onLifecycle(Activity activity, SessionEvent.Type type) {
        Logger logger = Fabric.getLogger();
        logger.d(C0059ao.a(14436), C0059ao.a(14435) + type.name());
        this.eventsHandler.processEventAsync(SessionEvent.lifecycleEventBuilder(type, activity));
    }

    public void onPredefined(PredefinedEvent predefinedEvent) {
        Logger logger = Fabric.getLogger();
        logger.d(C0059ao.a(14438), C0059ao.a(14437) + predefinedEvent);
        this.eventsHandler.processEventAsync(SessionEvent.predefinedEventBuilder(predefinedEvent));
    }

    public void setAnalyticsSettingsData(AnalyticsSettingsData analyticsSettingsData, String str) {
        this.backgroundManager.setFlushOnBackground(analyticsSettingsData.flushOnBackground);
        this.eventsHandler.setAnalyticsSettingsData(analyticsSettingsData, str);
    }
}
