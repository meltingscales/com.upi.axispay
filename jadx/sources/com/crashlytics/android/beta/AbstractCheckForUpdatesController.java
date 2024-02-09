package com.crashlytics.android.beta;

import android.annotation.SuppressLint;
import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.settings.BetaSettingsData;
import java.util.concurrent.atomic.AtomicBoolean;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class AbstractCheckForUpdatesController implements UpdatesController {
    public static final long LAST_UPDATE_CHECK_DEFAULT = 0;
    public static final String LAST_UPDATE_CHECK_KEY = null;
    private static final long MILLIS_PER_SECOND = 0;
    private Beta beta;
    private BetaSettingsData betaSettings;
    private BuildProperties buildProps;
    private Context context;
    private CurrentTimeProvider currentTimeProvider;
    private final AtomicBoolean externallyReady;
    private HttpRequestFactory httpRequestFactory;
    private IdManager idManager;
    private final AtomicBoolean initialized;
    private long lastCheckTimeMillis;
    private PreferenceStore preferenceStore;

    static {
        C0059ao.a(AbstractCheckForUpdatesController.class, 315);
    }

    public AbstractCheckForUpdatesController() {
        this(false);
    }

    private void performUpdateCheck() {
        Fabric.getLogger().d(C0059ao.a(13160), C0059ao.a(13161));
        Beta beta = this.beta;
        new CheckForUpdatesRequest(beta, beta.getOverridenSpiEndpoint(), this.betaSettings.updateUrl, this.httpRequestFactory, new CheckForUpdatesResponseTransform()).invoke(new ApiKey().getValue(this.context), this.idManager.getDeviceIdentifiers().get(IdManager.DeviceIdentifierType.FONT_TOKEN), this.buildProps);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void checkForUpdates() {
        synchronized (this.preferenceStore) {
            if (this.preferenceStore.get().contains(C0059ao.a(13162))) {
                PreferenceStore preferenceStore = this.preferenceStore;
                preferenceStore.save(preferenceStore.edit().remove(C0059ao.a(13163)));
            }
        }
        long currentTimeMillis = this.currentTimeProvider.getCurrentTimeMillis();
        long j = this.betaSettings.updateSuspendDurationSeconds * 1000;
        Logger logger = Fabric.getLogger();
        String a = C0059ao.a(13164);
        logger.d(a, C0059ao.a(13165) + j);
        Logger logger2 = Fabric.getLogger();
        String a2 = C0059ao.a(13166);
        logger2.d(a2, C0059ao.a(13167) + getLastCheckTimeMillis());
        long lastCheckTimeMillis = getLastCheckTimeMillis() + j;
        Logger logger3 = Fabric.getLogger();
        String a3 = C0059ao.a(13168);
        logger3.d(a3, C0059ao.a(13169) + currentTimeMillis + C0059ao.a(13170) + lastCheckTimeMillis);
        if (currentTimeMillis >= lastCheckTimeMillis) {
            try {
                performUpdateCheck();
                return;
            } finally {
                setLastCheckTimeMillis(currentTimeMillis);
            }
        }
        Fabric.getLogger().d(C0059ao.a(13171), C0059ao.a(13172));
    }

    public long getLastCheckTimeMillis() {
        return this.lastCheckTimeMillis;
    }

    @Override // com.crashlytics.android.beta.UpdatesController
    public void initialize(Context context, Beta beta, IdManager idManager, BetaSettingsData betaSettingsData, BuildProperties buildProperties, PreferenceStore preferenceStore, CurrentTimeProvider currentTimeProvider, HttpRequestFactory httpRequestFactory) {
        this.context = context;
        this.beta = beta;
        this.idManager = idManager;
        this.betaSettings = betaSettingsData;
        this.buildProps = buildProperties;
        this.preferenceStore = preferenceStore;
        this.currentTimeProvider = currentTimeProvider;
        this.httpRequestFactory = httpRequestFactory;
        if (signalInitialized()) {
            checkForUpdates();
        }
    }

    public void setLastCheckTimeMillis(long j) {
        this.lastCheckTimeMillis = j;
    }

    public boolean signalExternallyReady() {
        this.externallyReady.set(true);
        return this.initialized.get();
    }

    public boolean signalInitialized() {
        this.initialized.set(true);
        return this.externallyReady.get();
    }

    public AbstractCheckForUpdatesController(boolean z) {
        this.initialized = new AtomicBoolean();
        this.lastCheckTimeMillis = 0L;
        this.externallyReady = new AtomicBoolean(z);
    }
}
