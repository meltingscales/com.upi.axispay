package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SettingsJsonParser {
    private final CurrentTimeProvider currentTimeProvider;

    public SettingsJsonParser(CurrentTimeProvider currentTimeProvider) {
        this.currentTimeProvider = currentTimeProvider;
    }

    private static SettingsJsonTransform getJsonTransformForVersion(int i) {
        if (i != 3) {
            return new DefaultSettingsJsonTransform();
        }
        return new SettingsV3JsonTransform();
    }

    public SettingsData parseSettingsJson(JSONObject jSONObject) throws JSONException {
        return getJsonTransformForVersion(jSONObject.getInt(SettingsJsonConstants.SETTINGS_VERSION)).buildFromJson(this.currentTimeProvider, jSONObject);
    }
}
