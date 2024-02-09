package com.crashlytics.android.core;

import java.io.InputStream;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CrashlyticsPinningInfoProvider implements io.fabric.sdk.android.services.network.PinningInfoProvider {
    private final PinningInfoProvider pinningInfo;

    public CrashlyticsPinningInfoProvider(PinningInfoProvider pinningInfoProvider) {
        this.pinningInfo = pinningInfoProvider;
    }

    @Override // io.fabric.sdk.android.services.network.PinningInfoProvider
    public String getKeyStorePassword() {
        return this.pinningInfo.getKeyStorePassword();
    }

    @Override // io.fabric.sdk.android.services.network.PinningInfoProvider
    public InputStream getKeyStoreStream() {
        return this.pinningInfo.getKeyStoreStream();
    }

    @Override // io.fabric.sdk.android.services.network.PinningInfoProvider
    public long getPinCreationTimeInMillis() {
        return -1L;
    }

    @Override // io.fabric.sdk.android.services.network.PinningInfoProvider
    public String[] getPins() {
        return this.pinningInfo.getPins();
    }
}
