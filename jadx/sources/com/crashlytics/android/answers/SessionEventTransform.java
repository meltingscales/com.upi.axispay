package com.crashlytics.android.answers;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.TextUtils;
import io.fabric.sdk.android.services.events.EventTransform;
import java.io.IOException;
import myunmn.C0059ao;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SessionEventTransform implements EventTransform<SessionEvent> {
    public static final String ADVERTISING_ID_KEY = null;
    public static final String ANDROID_ID_KEY = null;
    public static final String APP_BUNDLE_ID_KEY = null;
    public static final String APP_VERSION_CODE_KEY = null;
    public static final String APP_VERSION_NAME_KEY = null;
    public static final String BETA_DEVICE_TOKEN_KEY = null;
    public static final String BUILD_ID_KEY = null;
    public static final String CUSTOM_ATTRIBUTES = null;
    public static final String CUSTOM_TYPE = null;
    public static final String DETAILS_KEY = null;
    public static final String DEVICE_MODEL_KEY = null;
    public static final String EXECUTION_ID_KEY = null;
    public static final String INSTALLATION_ID_KEY = null;
    public static final String LIMIT_AD_TRACKING_ENABLED_KEY = null;
    public static final String OS_VERSION_KEY = null;
    public static final String PREDEFINED_ATTRIBUTES = null;
    public static final String PREDEFINED_TYPE = null;
    public static final String TIMESTAMP_KEY = null;
    public static final String TYPE_KEY = null;

    static {
        C0059ao.a(SessionEventTransform.class, 85);
    }

    @TargetApi(9)
    public JSONObject buildJsonForEvent(SessionEvent sessionEvent) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            SessionEventMetadata sessionEventMetadata = sessionEvent.sessionEventMetadata;
            jSONObject.put(C0059ao.a(12886), sessionEventMetadata.appBundleId);
            jSONObject.put(C0059ao.a(12887), sessionEventMetadata.executionId);
            jSONObject.put(C0059ao.a(12888), sessionEventMetadata.installationId);
            if (TextUtils.isEmpty(sessionEventMetadata.advertisingId)) {
                jSONObject.put(C0059ao.a(12889), sessionEventMetadata.androidId);
            } else {
                jSONObject.put(C0059ao.a(12890), sessionEventMetadata.advertisingId);
            }
            jSONObject.put(C0059ao.a(12891), sessionEventMetadata.limitAdTrackingEnabled);
            jSONObject.put(C0059ao.a(12892), sessionEventMetadata.betaDeviceToken);
            jSONObject.put(C0059ao.a(12893), sessionEventMetadata.buildId);
            jSONObject.put(C0059ao.a(12894), sessionEventMetadata.osVersion);
            jSONObject.put(C0059ao.a(12895), sessionEventMetadata.deviceModel);
            jSONObject.put(C0059ao.a(12896), sessionEventMetadata.appVersionCode);
            jSONObject.put(C0059ao.a(12897), sessionEventMetadata.appVersionName);
            jSONObject.put(C0059ao.a(12898), sessionEvent.timestamp);
            jSONObject.put(C0059ao.a(12899), sessionEvent.type.toString());
            if (sessionEvent.details != null) {
                jSONObject.put(C0059ao.a(12900), new JSONObject(sessionEvent.details));
            }
            jSONObject.put(C0059ao.a(12901), sessionEvent.customType);
            if (sessionEvent.customAttributes != null) {
                jSONObject.put(C0059ao.a(12902), new JSONObject(sessionEvent.customAttributes));
            }
            jSONObject.put(C0059ao.a(12903), sessionEvent.predefinedType);
            if (sessionEvent.predefinedAttributes != null) {
                jSONObject.put(C0059ao.a(12904), new JSONObject(sessionEvent.predefinedAttributes));
            }
            return jSONObject;
        } catch (JSONException e) {
            if (Build.VERSION.SDK_INT >= 9) {
                throw new IOException(e.getMessage(), e);
            }
            throw new IOException(e.getMessage());
        }
    }

    @Override // io.fabric.sdk.android.services.events.EventTransform
    public byte[] toBytes(SessionEvent sessionEvent) throws IOException {
        return buildJsonForEvent(sessionEvent).toString().getBytes(C0059ao.a(12905));
    }
}
