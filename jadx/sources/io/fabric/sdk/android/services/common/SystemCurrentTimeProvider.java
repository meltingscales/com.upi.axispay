package io.fabric.sdk.android.services.common;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SystemCurrentTimeProvider implements CurrentTimeProvider {
    @Override // io.fabric.sdk.android.services.common.CurrentTimeProvider
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
