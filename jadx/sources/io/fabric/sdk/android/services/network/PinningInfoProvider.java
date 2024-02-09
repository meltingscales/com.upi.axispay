package io.fabric.sdk.android.services.network;

import java.io.InputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface PinningInfoProvider {
    public static final long PIN_CREATION_TIME_UNDEFINED = 0;

    static {
        C0059ao.a(PinningInfoProvider.class, 384);
    }

    String getKeyStorePassword();

    InputStream getKeyStoreStream();

    long getPinCreationTimeInMillis();

    String[] getPins();
}
