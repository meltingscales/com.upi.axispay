package com.crashlytics.android.beta;

import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CheckForUpdatesRequest extends AbstractSpiCall {
    public static final String BETA_SOURCE = null;
    public static final String BUILD_VERSION = null;
    public static final String DISPLAY_VERSION = null;
    public static final String HEADER_BETA_TOKEN = null;
    public static final String INSTANCE = null;
    public static final String SDK_ANDROID_DIR_TOKEN_TYPE = null;
    public static final String SOURCE = null;
    private final CheckForUpdatesResponseTransform responseTransform;

    static {
        C0059ao.a(CheckForUpdatesRequest.class, 301);
    }

    public CheckForUpdatesRequest(Kit kit, String str, String str2, HttpRequestFactory httpRequestFactory, CheckForUpdatesResponseTransform checkForUpdatesResponseTransform) {
        super(kit, str, str2, httpRequestFactory, HttpMethod.GET);
        this.responseTransform = checkForUpdatesResponseTransform;
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, String str, String str2) {
        HttpRequest header = httpRequest.header(C0059ao.a(12691), C0059ao.a(12692));
        return header.header(C0059ao.a(12694), C0059ao.a(12693) + this.kit.getVersion()).header(C0059ao.a(12695), C0059ao.a(12696)).header(C0059ao.a(12697), C0059ao.a(12698)).header(C0059ao.a(12699), this.kit.getVersion()).header(C0059ao.a(12700), str).header(C0059ao.a(12701), createBetaTokenHeaderValueFor(str2));
    }

    public static String createBetaTokenHeaderValueFor(String str) {
        return C0059ao.a(12702) + str;
    }

    private Map<String, String> getQueryParamsFor(BuildProperties buildProperties) {
        HashMap hashMap = new HashMap();
        hashMap.put(C0059ao.a(12703), buildProperties.versionCode);
        hashMap.put(C0059ao.a(12704), buildProperties.versionName);
        hashMap.put(C0059ao.a(12705), buildProperties.buildId);
        hashMap.put(C0059ao.a(12706), C0059ao.a(12707));
        return hashMap;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x011d: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:25:0x011d */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.crashlytics.android.beta.CheckForUpdatesResponse invoke(java.lang.String r9, java.lang.String r10, com.crashlytics.android.beta.BuildProperties r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.beta.CheckForUpdatesRequest.invoke(java.lang.String, java.lang.String, com.crashlytics.android.beta.BuildProperties):com.crashlytics.android.beta.CheckForUpdatesResponse");
    }
}
