package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.services.common.IdManager;
import java.util.Map;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface DeviceIdentifierProvider {
    Map<IdManager.DeviceIdentifierType, String> getDeviceIdentifiers();
}
