package com.crashlytics.android.beta;

import java.io.IOException;
import myunmn.C0059ao;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CheckForUpdatesResponseTransform {
    public static final String BUILD_VERSION = null;
    public static final String DISPLAY_VERSION = null;
    public static final String IDENTIFIER = null;
    public static final String INSTANCE_IDENTIFIER = null;
    public static final String URL = null;
    public static final String VERSION_STRING = null;

    static {
        C0059ao.a(CheckForUpdatesResponseTransform.class, 189);
    }

    public CheckForUpdatesResponse fromJson(JSONObject jSONObject) throws IOException {
        if (jSONObject == null) {
            return null;
        }
        return new CheckForUpdatesResponse(jSONObject.optString(C0059ao.a(8944), null), jSONObject.optString(C0059ao.a(8945), null), jSONObject.optString(C0059ao.a(8947), null), jSONObject.optString(C0059ao.a(8946), null), jSONObject.optString(C0059ao.a(8948), null), jSONObject.optString(C0059ao.a(8949), null));
    }
}
