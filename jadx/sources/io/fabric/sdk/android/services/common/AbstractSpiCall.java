package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public abstract class AbstractSpiCall {
    public static final String ACCEPT_JSON_VALUE = null;
    public static final String ANDROID_CLIENT_TYPE = null;
    public static final String CLS_ANDROID_SDK_DEVELOPER_TOKEN = null;
    public static final String CRASHLYTICS_USER_AGENT = null;
    public static final int DEFAULT_TIMEOUT = 0;
    public static final String HEADER_ACCEPT = null;
    public static final String HEADER_API_KEY = null;
    public static final String HEADER_CLIENT_TYPE = null;
    public static final String HEADER_CLIENT_VERSION = null;
    public static final String HEADER_DEVELOPER_TOKEN = null;
    public static final String HEADER_REQUEST_ID = null;
    public static final String HEADER_USER_AGENT = null;
    private static final Pattern PROTOCOL_AND_HOST_PATTERN;
    public final Kit kit;
    private final HttpMethod method;
    private final String protocolAndHostOverride;
    private final HttpRequestFactory requestFactory;
    private final String url;

    static {
        C0059ao.a(AbstractSpiCall.class, 162);
        PROTOCOL_AND_HOST_PATTERN = Pattern.compile(C0059ao.a(9126), 2);
    }

    public AbstractSpiCall(Kit kit, String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod) {
        if (str2 == null) {
            throw new IllegalArgumentException(C0059ao.a(9128));
        }
        if (httpRequestFactory != null) {
            this.kit = kit;
            this.protocolAndHostOverride = str;
            this.url = overrideProtocolAndHost(str2);
            this.requestFactory = httpRequestFactory;
            this.method = httpMethod;
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(9127));
    }

    private String overrideProtocolAndHost(String str) {
        return !CommonUtils.isNullOrEmpty(this.protocolAndHostOverride) ? PROTOCOL_AND_HOST_PATTERN.matcher(str).replaceFirst(this.protocolAndHostOverride) : str;
    }

    public HttpRequest getHttpRequest() {
        return getHttpRequest(Collections.emptyMap());
    }

    public String getUrl() {
        return this.url;
    }

    public HttpRequest getHttpRequest(Map<String, String> map) {
        HttpRequest connectTimeout = this.requestFactory.buildHttpRequest(this.method, getUrl(), map).useCaches(false).connectTimeout(10000);
        return connectTimeout.header(C0059ao.a(9130), C0059ao.a(9129) + this.kit.getVersion()).header(C0059ao.a(9131), C0059ao.a(9132));
    }
}
