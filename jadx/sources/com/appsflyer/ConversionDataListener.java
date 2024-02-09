package com.appsflyer;

import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface ConversionDataListener {
    void onConversionDataLoaded(Map<String, Object> map);

    void onConversionFailure(String str);
}
