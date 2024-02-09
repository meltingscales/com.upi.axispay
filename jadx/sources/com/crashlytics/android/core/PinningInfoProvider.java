package com.crashlytics.android.core;

import java.io.InputStream;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface PinningInfoProvider {
    String getKeyStorePassword();

    InputStream getKeyStoreStream();

    String[] getPins();
}
