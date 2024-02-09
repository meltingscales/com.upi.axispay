package io.fabric.sdk.android.services.network;

import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface HttpRequestFactory {
    HttpRequest buildHttpRequest(HttpMethod httpMethod, String str);

    HttpRequest buildHttpRequest(HttpMethod httpMethod, String str, Map<String, String> map);

    PinningInfoProvider getPinningInfoProvider();

    void setPinningInfoProvider(PinningInfoProvider pinningInfoProvider);
}
