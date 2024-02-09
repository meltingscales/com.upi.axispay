package io.fabric.sdk.android.services.settings;

import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DefaultSettingsSpiCall extends AbstractSpiCall implements SettingsSpiCall {
    public static final String BUILD_VERSION_PARAM = null;
    public static final String DISPLAY_VERSION_PARAM = null;
    public static final String HEADER_ADVERTISING_TOKEN = null;
    public static final String HEADER_ANDROID_ID = null;
    public static final String HEADER_DEVICE_MODEL = null;
    public static final String HEADER_INSTALLATION_ID = null;
    public static final String HEADER_OS_BUILD_VERSION = null;
    public static final String HEADER_OS_DISPLAY_VERSION = null;
    public static final String ICON_HASH = null;
    public static final String INSTANCE_PARAM = null;
    public static final String SOURCE_PARAM = null;

    static {
        C0059ao.a(DefaultSettingsSpiCall.class, 156);
    }

    public DefaultSettingsSpiCall(Kit kit, String str, String str2, HttpRequestFactory httpRequestFactory) {
        this(kit, str, str2, httpRequestFactory, HttpMethod.GET);
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, SettingsRequest settingsRequest) {
        applyNonNullHeader(httpRequest, C0059ao.a(3375), settingsRequest.apiKey);
        applyNonNullHeader(httpRequest, C0059ao.a(3376), C0059ao.a(3377));
        applyNonNullHeader(httpRequest, C0059ao.a(3378), this.kit.getVersion());
        applyNonNullHeader(httpRequest, C0059ao.a(3379), C0059ao.a(3380));
        applyNonNullHeader(httpRequest, C0059ao.a(3381), settingsRequest.deviceModel);
        applyNonNullHeader(httpRequest, C0059ao.a(3382), settingsRequest.osBuildVersion);
        applyNonNullHeader(httpRequest, C0059ao.a(3383), settingsRequest.osDisplayVersion);
        applyNonNullHeader(httpRequest, C0059ao.a(3384), settingsRequest.installationId);
        if (TextUtils.isEmpty(settingsRequest.advertisingId)) {
            applyNonNullHeader(httpRequest, C0059ao.a(3385), settingsRequest.androidId);
        } else {
            applyNonNullHeader(httpRequest, C0059ao.a(3386), settingsRequest.advertisingId);
        }
        return httpRequest;
    }

    private void applyNonNullHeader(HttpRequest httpRequest, String str, String str2) {
        if (str2 != null) {
            httpRequest.header(str, str2);
        }
    }

    private JSONObject getJsonObjectFrom(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            String a = C0059ao.a(3388);
            Fabric.getLogger().d(a, C0059ao.a(3387) + getUrl(), e);
            Fabric.getLogger().d(a, C0059ao.a(3389) + str);
            return null;
        }
    }

    private Map<String, String> getQueryParamsFor(SettingsRequest settingsRequest) {
        HashMap hashMap = new HashMap();
        hashMap.put(C0059ao.a(3390), settingsRequest.buildVersion);
        hashMap.put(C0059ao.a(3391), settingsRequest.displayVersion);
        hashMap.put(C0059ao.a(3392), Integer.toString(settingsRequest.source));
        String str = settingsRequest.iconHash;
        if (str != null) {
            hashMap.put(C0059ao.a(3393), str);
        }
        String str2 = settingsRequest.instanceId;
        if (!CommonUtils.isNullOrEmpty(str2)) {
            hashMap.put(C0059ao.a(3394), str2);
        }
        return hashMap;
    }

    public JSONObject handleResponse(HttpRequest httpRequest) {
        int code = httpRequest.code();
        String a = C0059ao.a(3396);
        Fabric.getLogger().d(a, C0059ao.a(3395) + code);
        if (requestWasSuccessful(code)) {
            return getJsonObjectFrom(httpRequest.body());
        }
        Fabric.getLogger().e(a, C0059ao.a(3397) + getUrl());
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00a3: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:19:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    @Override // io.fabric.sdk.android.services.settings.SettingsSpiCall
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject invoke(io.fabric.sdk.android.services.settings.SettingsRequest r10) {
        /*
            r9 = this;
            r0 = 3398(0xd46, float:4.762E-42)
            java.lang.String r1 = myunmn.C0059ao.a(r0)
            r0 = 3399(0xd47, float:4.763E-42)
            java.lang.String r2 = myunmn.C0059ao.a(r0)
            r0 = 3400(0xd48, float:4.764E-42)
            java.lang.String r3 = myunmn.C0059ao.a(r0)
            r4 = 0
            java.util.Map r5 = r9.getQueryParamsFor(r10)     // Catch: java.lang.Throwable -> L83 io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L85
            io.fabric.sdk.android.services.network.HttpRequest r6 = r9.getHttpRequest(r5)     // Catch: java.lang.Throwable -> L83 io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L85
            io.fabric.sdk.android.services.network.HttpRequest r6 = r9.applyHeadersTo(r6, r10)     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            io.fabric.sdk.android.Logger r10 = io.fabric.sdk.android.Fabric.getLogger()     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            r7.<init>()     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            r0 = 3401(0xd49, float:4.766E-42)
            java.lang.String r8 = myunmn.C0059ao.a(r0)     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            r7.append(r8)     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            java.lang.String r8 = r9.getUrl()     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            r7.append(r8)     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            java.lang.String r7 = r7.toString()     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            r10.d(r3, r7)     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            io.fabric.sdk.android.Logger r10 = io.fabric.sdk.android.Fabric.getLogger()     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            r7.<init>()     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            r0 = 3402(0xd4a, float:4.767E-42)
            java.lang.String r8 = myunmn.C0059ao.a(r0)     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            r7.append(r8)     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            r7.append(r5)     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            java.lang.String r5 = r7.toString()     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            r10.d(r3, r5)     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            org.json.JSONObject r4 = r9.handleResponse(r6)     // Catch: io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException -> L81 java.lang.Throwable -> La2
            if (r6 == 0) goto La1
            io.fabric.sdk.android.Logger r10 = io.fabric.sdk.android.Fabric.getLogger()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L6f:
            r5.append(r2)
            java.lang.String r1 = r6.header(r1)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r10.d(r3, r1)
            goto La1
        L81:
            r10 = move-exception
            goto L87
        L83:
            r10 = move-exception
            goto La4
        L85:
            r10 = move-exception
            r6 = r4
        L87:
            io.fabric.sdk.android.Logger r5 = io.fabric.sdk.android.Fabric.getLogger()     // Catch: java.lang.Throwable -> La2
            r0 = 3403(0xd4b, float:4.769E-42)
            java.lang.String r7 = myunmn.C0059ao.a(r0)     // Catch: java.lang.Throwable -> La2
            r5.e(r3, r7, r10)     // Catch: java.lang.Throwable -> La2
            if (r6 == 0) goto La1
            io.fabric.sdk.android.Logger r10 = io.fabric.sdk.android.Fabric.getLogger()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            goto L6f
        La1:
            return r4
        La2:
            r10 = move-exception
            r4 = r6
        La4:
            if (r4 == 0) goto Lc0
            io.fabric.sdk.android.Logger r5 = io.fabric.sdk.android.Fabric.getLogger()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r1 = r4.header(r1)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r5.d(r3, r1)
        Lc0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.settings.DefaultSettingsSpiCall.invoke(io.fabric.sdk.android.services.settings.SettingsRequest):org.json.JSONObject");
    }

    public boolean requestWasSuccessful(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public DefaultSettingsSpiCall(Kit kit, String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod) {
        super(kit, str, str2, httpRequestFactory, httpMethod);
    }
}
