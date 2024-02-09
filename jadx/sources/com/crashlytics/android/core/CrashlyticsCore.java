package com.crashlytics.android.core;

import android.content.Context;
import android.util.Log;
import com.crashlytics.android.answers.AppMeasurementEventLogger;
import com.crashlytics.android.answers.EventLogger;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.ExecutorUtils;
import io.fabric.sdk.android.services.common.FirebaseInfo;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.PriorityCallable;
import io.fabric.sdk.android.services.concurrency.Task;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@DependsOn({CrashlyticsNdkDataProvider.class})
/* loaded from: classes.dex */
public class CrashlyticsCore extends Kit<Void> {
    public static final float CLS_DEFAULT_PROCESS_DELAY = 0.0f;
    public static final String CRASHLYTICS_REQUIRE_BUILD_ID = null;
    public static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = false;
    public static final String CRASH_MARKER_FILE_NAME = null;
    public static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 0;
    private static final String INITIALIZATION_MARKER_FILE_NAME = null;
    public static final int MAX_ATTRIBUTES = 0;
    public static final int MAX_ATTRIBUTE_SIZE = 0;
    private static final String MISSING_BUILD_ID_MSG = null;
    private static final String PREFERENCE_STORE_NAME = null;
    public static final String TAG = null;
    private final ConcurrentHashMap<String, String> attributes;
    private CrashlyticsBackgroundWorker backgroundWorker;
    private CrashlyticsController controller;
    private CrashlyticsFileMarker crashMarker;
    private CrashlyticsNdkDataProvider crashlyticsNdkDataProvider;
    private float delay;
    private boolean disabled;
    private HttpRequestFactory httpRequestFactory;
    private CrashlyticsFileMarker initializationMarker;
    private CrashlyticsListener listener;
    private final PinningInfoProvider pinningInfo;
    private final long startTime;
    private String userEmail;
    private String userId;
    private String userName;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Builder {
        private float delay = -1.0f;
        private boolean disabled = false;
        private CrashlyticsListener listener;
        private PinningInfoProvider pinningInfoProvider;

        public CrashlyticsCore build() {
            if (this.delay < 0.0f) {
                this.delay = 1.0f;
            }
            return new CrashlyticsCore(this.delay, this.listener, this.pinningInfoProvider, this.disabled);
        }

        public Builder delay(float f) {
            if (f > 0.0f) {
                if (this.delay <= 0.0f) {
                    this.delay = f;
                    return this;
                }
                throw new IllegalStateException(C0059ao.a(14712));
            }
            throw new IllegalArgumentException(C0059ao.a(14713));
        }

        public Builder disabled(boolean z) {
            this.disabled = z;
            return this;
        }

        public Builder listener(CrashlyticsListener crashlyticsListener) {
            if (crashlyticsListener != null) {
                if (this.listener == null) {
                    this.listener = crashlyticsListener;
                    return this;
                }
                throw new IllegalStateException(C0059ao.a(14714));
            }
            throw new IllegalArgumentException(C0059ao.a(14715));
        }

        @Deprecated
        public Builder pinningInfo(PinningInfoProvider pinningInfoProvider) {
            if (pinningInfoProvider != null) {
                if (this.pinningInfoProvider == null) {
                    this.pinningInfoProvider = pinningInfoProvider;
                    return this;
                }
                throw new IllegalStateException(C0059ao.a(14716));
            }
            throw new IllegalArgumentException(C0059ao.a(14717));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class CrashMarkerCheck implements Callable<Boolean> {
        private final CrashlyticsFileMarker crashMarker;

        public CrashMarkerCheck(CrashlyticsFileMarker crashlyticsFileMarker) {
            this.crashMarker = crashlyticsFileMarker;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            if (!this.crashMarker.isPresent()) {
                return Boolean.FALSE;
            }
            Fabric.getLogger().d(C0059ao.a(15687), C0059ao.a(15688));
            this.crashMarker.remove();
            return Boolean.TRUE;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class NoOpListener implements CrashlyticsListener {
        private NoOpListener() {
        }

        @Override // com.crashlytics.android.core.CrashlyticsListener
        public void crashlyticsDidDetectCrashDuringPreviousExecution() {
        }
    }

    static {
        C0059ao.a(CrashlyticsCore.class, 103);
    }

    public CrashlyticsCore() {
        this(1.0f, null, null, false);
    }

    private void checkForPreviousCrash() {
        if (Boolean.TRUE.equals((Boolean) this.backgroundWorker.submitAndWait(new CrashMarkerCheck(this.crashMarker)))) {
            try {
                this.listener.crashlyticsDidDetectCrashDuringPreviousExecution();
            } catch (Exception e) {
                Fabric.getLogger().e(C0059ao.a(12300), C0059ao.a(12301), e);
            }
        }
    }

    private void doLog(int i, String str, String str2) {
        if (!this.disabled && ensureFabricWithCalled(C0059ao.a(12302))) {
            this.controller.writeToLog(System.currentTimeMillis() - this.startTime, formatLogMessage(i, str, str2));
        }
    }

    private static boolean ensureFabricWithCalled(String str) {
        CrashlyticsCore crashlyticsCore = getInstance();
        if (crashlyticsCore == null || crashlyticsCore.controller == null) {
            Logger logger = Fabric.getLogger();
            logger.e(C0059ao.a(12304), C0059ao.a(12303) + str, null);
            return false;
        }
        return true;
    }

    private void finishInitSynchronously() {
        PriorityCallable<Void> priorityCallable = new PriorityCallable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsCore.1
            @Override // io.fabric.sdk.android.services.concurrency.PriorityTask, io.fabric.sdk.android.services.concurrency.PriorityProvider
            public Priority getPriority() {
                return Priority.IMMEDIATE;
            }

            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                return CrashlyticsCore.this.doInBackground();
            }
        };
        for (Task task : getDependencies()) {
            priorityCallable.addDependency(task);
        }
        Future submit = getFabric().getExecutorService().submit(priorityCallable);
        Logger logger = Fabric.getLogger();
        String a = C0059ao.a(12305);
        logger.d(a, C0059ao.a(12306));
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Fabric.getLogger().e(a, C0059ao.a(12309), e);
        } catch (ExecutionException e2) {
            Fabric.getLogger().e(a, C0059ao.a(12308), e2);
        } catch (TimeoutException e3) {
            Fabric.getLogger().e(a, C0059ao.a(12307), e3);
        }
    }

    private static String formatLogMessage(int i, String str, String str2) {
        return CommonUtils.logPriorityToString(i) + C0059ao.a(12310) + str + C0059ao.a(12311) + str2;
    }

    public static CrashlyticsCore getInstance() {
        return (CrashlyticsCore) Fabric.getKit(CrashlyticsCore.class);
    }

    public static boolean isBuildIdValid(String str, boolean z) {
        String a = C0059ao.a(12312);
        if (!z) {
            Fabric.getLogger().d(a, C0059ao.a(12313));
            return true;
        } else if (CommonUtils.isNullOrEmpty(str)) {
            String a2 = C0059ao.a(12314);
            Log.e(a, a2);
            Log.e(a, C0059ao.a(12315));
            String a3 = C0059ao.a(12316);
            Log.e(a, a3);
            Log.e(a, a3);
            Log.e(a, C0059ao.a(12317));
            Log.e(a, C0059ao.a(12318));
            Log.e(a, C0059ao.a(12319));
            Log.e(a, C0059ao.a(12320));
            Log.e(a, a2);
            Log.e(a, C0059ao.a(12321));
            Log.e(a, a2);
            Log.e(a, C0059ao.a(12322));
            Log.e(a, C0059ao.a(12323));
            Log.e(a, C0059ao.a(12324));
            Log.e(a, C0059ao.a(12325));
            Log.e(a, a3);
            Log.e(a, a3);
            Log.e(a, a3);
            Log.e(a, a2);
            return false;
        } else {
            return true;
        }
    }

    private static String sanitizeAttribute(String str) {
        if (str != null) {
            String trim = str.trim();
            return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
        }
        return str;
    }

    public void crash() {
        new CrashTest().indexOutOfBounds();
    }

    public void createCrashMarker() {
        this.crashMarker.create();
    }

    public boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    public Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(this.attributes);
    }

    public CrashlyticsController getController() {
        return this.controller;
    }

    @Override // io.fabric.sdk.android.Kit
    public String getIdentifier() {
        return C0059ao.a(12332);
    }

    public CrashlyticsNdkData getNativeCrashData() {
        CrashlyticsNdkDataProvider crashlyticsNdkDataProvider = this.crashlyticsNdkDataProvider;
        if (crashlyticsNdkDataProvider != null) {
            return crashlyticsNdkDataProvider.getCrashlyticsNdkData();
        }
        return null;
    }

    public PinningInfoProvider getPinningInfoProvider() {
        if (this.disabled) {
            return null;
        }
        return this.pinningInfo;
    }

    public String getUserEmail() {
        if (getIdManager().canCollectUserIds()) {
            return this.userEmail;
        }
        return null;
    }

    public String getUserIdentifier() {
        if (getIdManager().canCollectUserIds()) {
            return this.userId;
        }
        return null;
    }

    public String getUserName() {
        if (getIdManager().canCollectUserIds()) {
            return this.userName;
        }
        return null;
    }

    @Override // io.fabric.sdk.android.Kit
    public String getVersion() {
        return C0059ao.a(12333);
    }

    public boolean internalVerifyPinning(URL url) {
        if (getPinningInfoProvider() != null) {
            HttpRequest buildHttpRequest = this.httpRequestFactory.buildHttpRequest(HttpMethod.GET, url.toString());
            ((HttpsURLConnection) buildHttpRequest.getConnection()).setInstanceFollowRedirects(false);
            buildHttpRequest.code();
            return true;
        }
        return false;
    }

    public void log(String str) {
        doLog(3, C0059ao.a(12335), str);
    }

    public void logException(Throwable th) {
        if (!this.disabled && ensureFabricWithCalled(C0059ao.a(12336))) {
            if (th == null) {
                Fabric.getLogger().log(5, C0059ao.a(12337), C0059ao.a(12338));
            } else {
                this.controller.writeNonFatalException(Thread.currentThread(), th);
            }
        }
    }

    public void markInitializationComplete() {
        this.backgroundWorker.submit(new Callable<Boolean>() { // from class: com.crashlytics.android.core.CrashlyticsCore.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                String a = C0059ao.a(7846);
                try {
                    boolean remove = CrashlyticsCore.this.initializationMarker.remove();
                    Logger logger = Fabric.getLogger();
                    logger.d(a, C0059ao.a(7847) + remove);
                    return Boolean.valueOf(remove);
                } catch (Exception e) {
                    Fabric.getLogger().e(a, C0059ao.a(7848), e);
                    return Boolean.FALSE;
                }
            }
        });
    }

    public void markInitializationStarted() {
        this.backgroundWorker.submitAndWait(new Callable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsCore.2
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                CrashlyticsCore.this.initializationMarker.create();
                Fabric.getLogger().d(C0059ao.a(7922), C0059ao.a(7923));
                return null;
            }
        });
    }

    @Override // io.fabric.sdk.android.Kit
    public boolean onPreExecute() {
        return onPreExecute(super.getContext());
    }

    public void setBool(String str, boolean z) {
        setString(str, Boolean.toString(z));
    }

    public void setCrashlyticsNdkDataProvider(CrashlyticsNdkDataProvider crashlyticsNdkDataProvider) {
        this.crashlyticsNdkDataProvider = crashlyticsNdkDataProvider;
    }

    public void setDouble(String str, double d) {
        setString(str, Double.toString(d));
    }

    public void setFloat(String str, float f) {
        setString(str, Float.toString(f));
    }

    public void setInt(String str, int i) {
        setString(str, Integer.toString(i));
    }

    @Deprecated
    public synchronized void setListener(CrashlyticsListener crashlyticsListener) {
        Fabric.getLogger().w(C0059ao.a(12350), C0059ao.a(12351));
        if (crashlyticsListener != null) {
            this.listener = crashlyticsListener;
        } else {
            throw new IllegalArgumentException(C0059ao.a(12352));
        }
    }

    public void setLong(String str, long j) {
        setString(str, Long.toString(j));
    }

    public void setString(String str, String str2) {
        if (!this.disabled && ensureFabricWithCalled(C0059ao.a(12353))) {
            String a = C0059ao.a(12354);
            if (str == null) {
                Context context = getContext();
                if (context != null && CommonUtils.isAppDebuggable(context)) {
                    throw new IllegalArgumentException(C0059ao.a(12355));
                }
                Fabric.getLogger().e(a, C0059ao.a(12356), null);
                return;
            }
            String sanitizeAttribute = sanitizeAttribute(str);
            if (this.attributes.size() >= 64 && !this.attributes.containsKey(sanitizeAttribute)) {
                Fabric.getLogger().d(a, C0059ao.a(12357));
                return;
            }
            this.attributes.put(sanitizeAttribute, str2 == null ? C0059ao.a(12358) : sanitizeAttribute(str2));
            this.controller.cacheKeyData(this.attributes);
        }
    }

    public void setUserEmail(String str) {
        if (!this.disabled && ensureFabricWithCalled(C0059ao.a(12359))) {
            String sanitizeAttribute = sanitizeAttribute(str);
            this.userEmail = sanitizeAttribute;
            this.controller.cacheUserData(this.userId, this.userName, sanitizeAttribute);
        }
    }

    public void setUserIdentifier(String str) {
        if (!this.disabled && ensureFabricWithCalled(C0059ao.a(12360))) {
            String sanitizeAttribute = sanitizeAttribute(str);
            this.userId = sanitizeAttribute;
            this.controller.cacheUserData(sanitizeAttribute, this.userName, this.userEmail);
        }
    }

    public void setUserName(String str) {
        if (!this.disabled && ensureFabricWithCalled(C0059ao.a(12361))) {
            String sanitizeAttribute = sanitizeAttribute(str);
            this.userName = sanitizeAttribute;
            this.controller.cacheUserData(this.userId, sanitizeAttribute, this.userEmail);
        }
    }

    public boolean verifyPinning(URL url) {
        try {
            return internalVerifyPinning(url);
        } catch (Exception e) {
            Fabric.getLogger().e(C0059ao.a(12362), C0059ao.a(12363), e);
            return false;
        }
    }

    public CrashlyticsCore(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z) {
        this(f, crashlyticsListener, pinningInfoProvider, z, ExecutorUtils.buildSingleThreadExecutorService(C0059ao.a(12299)));
    }

    @Override // io.fabric.sdk.android.Kit
    public Void doInBackground() {
        SettingsData awaitSettingsData;
        String a = C0059ao.a(12326);
        markInitializationStarted();
        this.controller.cleanInvalidTempFiles();
        try {
            try {
                this.controller.registerDevicePowerStateListener();
                awaitSettingsData = Settings.getInstance().awaitSettingsData();
            } catch (Exception e) {
                Fabric.getLogger().e(a, C0059ao.a(12331), e);
            }
            if (awaitSettingsData == null) {
                Fabric.getLogger().w(a, C0059ao.a(12327));
                return null;
            }
            this.controller.registerAnalyticsEventListener(awaitSettingsData);
            if (!awaitSettingsData.featuresData.collectReports) {
                Fabric.getLogger().d(a, C0059ao.a(12328));
                return null;
            }
            CrashlyticsNdkData nativeCrashData = getNativeCrashData();
            if (nativeCrashData != null && !this.controller.finalizeNativeReport(nativeCrashData)) {
                Fabric.getLogger().d(a, C0059ao.a(12329));
            }
            if (!this.controller.finalizeSessions(awaitSettingsData.sessionData)) {
                Fabric.getLogger().d(a, C0059ao.a(12330));
            }
            this.controller.submitAllReports(this.delay, awaitSettingsData);
            return null;
        } finally {
            markInitializationComplete();
        }
    }

    public void log(int i, String str, String str2) {
        doLog(i, str, str2);
        Logger logger = Fabric.getLogger();
        StringBuilder sb = new StringBuilder();
        String a = C0059ao.a(12334);
        sb.append(a);
        sb.append(str);
        String sb2 = sb.toString();
        logger.log(i, sb2, a + str2, true);
    }

    public boolean onPreExecute(Context context) {
        String value;
        String a = C0059ao.a(12339);
        if (this.disabled || (value = new ApiKey().getValue(context)) == null) {
            return false;
        }
        String resolveBuildId = CommonUtils.resolveBuildId(context);
        if (isBuildIdValid(resolveBuildId, CommonUtils.getBooleanResourceValue(context, C0059ao.a(12340), true))) {
            try {
                Logger logger = Fabric.getLogger();
                logger.i(a, C0059ao.a(12341) + getVersion());
                FileStoreImpl fileStoreImpl = new FileStoreImpl(this);
                this.crashMarker = new CrashlyticsFileMarker(C0059ao.a(12342), fileStoreImpl);
                this.initializationMarker = new CrashlyticsFileMarker(C0059ao.a(12343), fileStoreImpl);
                PreferenceManager create = PreferenceManager.create(new PreferenceStoreImpl(getContext(), C0059ao.a(12344)), this);
                PinningInfoProvider pinningInfoProvider = this.pinningInfo;
                CrashlyticsPinningInfoProvider crashlyticsPinningInfoProvider = pinningInfoProvider != null ? new CrashlyticsPinningInfoProvider(pinningInfoProvider) : null;
                DefaultHttpRequestFactory defaultHttpRequestFactory = new DefaultHttpRequestFactory(Fabric.getLogger());
                this.httpRequestFactory = defaultHttpRequestFactory;
                defaultHttpRequestFactory.setPinningInfoProvider(crashlyticsPinningInfoProvider);
                IdManager idManager = getIdManager();
                AppData create2 = AppData.create(context, idManager, value, resolveBuildId);
                ManifestUnityVersionProvider manifestUnityVersionProvider = new ManifestUnityVersionProvider(context, create2.packageName);
                AppMeasurementEventListenerRegistrar instanceFrom = DefaultAppMeasurementEventListenerRegistrar.instanceFrom(this);
                EventLogger eventLogger = AppMeasurementEventLogger.getEventLogger(context);
                Logger logger2 = Fabric.getLogger();
                logger2.d(a, C0059ao.a(12345) + create2.installerPackageName);
                this.controller = new CrashlyticsController(this, this.backgroundWorker, this.httpRequestFactory, idManager, create, fileStoreImpl, create2, manifestUnityVersionProvider, instanceFrom, eventLogger);
                boolean didPreviousInitializationFail = didPreviousInitializationFail();
                checkForPreviousCrash();
                this.controller.enableExceptionHandling(Thread.getDefaultUncaughtExceptionHandler(), new FirebaseInfo().isFirebaseCrashlyticsEnabled(context));
                if (didPreviousInitializationFail && CommonUtils.canTryConnection(context)) {
                    Fabric.getLogger().d(a, C0059ao.a(12346));
                    finishInitSynchronously();
                    return false;
                }
                Fabric.getLogger().d(a, C0059ao.a(12347));
                return true;
            } catch (Exception e) {
                Fabric.getLogger().e(a, C0059ao.a(12348), e);
                this.controller = null;
                return false;
            }
        }
        throw new UnmetDependencyException(C0059ao.a(12349));
    }

    public CrashlyticsCore(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z, ExecutorService executorService) {
        this.userId = null;
        this.userEmail = null;
        this.userName = null;
        this.delay = f;
        this.listener = crashlyticsListener == null ? new NoOpListener() : crashlyticsListener;
        this.pinningInfo = pinningInfoProvider;
        this.disabled = z;
        this.backgroundWorker = new CrashlyticsBackgroundWorker(executorService);
        this.attributes = new ConcurrentHashMap<>();
        this.startTime = System.currentTimeMillis();
    }
}
