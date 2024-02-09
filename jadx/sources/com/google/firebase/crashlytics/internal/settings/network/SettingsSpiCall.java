package com.google.firebase.crashlytics.internal.settings.network;

import com.google.firebase.crashlytics.internal.settings.model.SettingsRequest;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface SettingsSpiCall {
    JSONObject invoke(SettingsRequest settingsRequest, boolean z);
}
