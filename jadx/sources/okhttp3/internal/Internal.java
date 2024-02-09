package okhttp3.internal;

import javax.net.ssl.SSLSocket;
import myunmn.C0059ao;
import okhttp3.Cache;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        yl0.e(builder, C0059ao.a(8008));
        yl0.e(str, C0059ao.a(8009));
        return builder.addLenient$okhttp(str);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
        yl0.e(connectionSpec, C0059ao.a(8013));
        yl0.e(sSLSocket, C0059ao.a(8014));
        connectionSpec.apply$okhttp(sSLSocket, z);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        yl0.e(cache, C0059ao.a(8015));
        yl0.e(request, C0059ao.a(8016));
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z) {
        yl0.e(cookie, C0059ao.a(8017));
        return cookie.toString$okhttp(z);
    }

    public static final String[] effectiveCipherSuites(ConnectionSpec connectionSpec, String[] strArr) {
        yl0.e(connectionSpec, C0059ao.a(8018));
        yl0.e(strArr, C0059ao.a(8019));
        return connectionSpec.getCipherSuitesAsString$okhttp() != null ? Util.intersect(strArr, connectionSpec.getCipherSuitesAsString$okhttp(), CipherSuite.Companion.getORDER_BY_NAME$okhttp()) : strArr;
    }

    public static final Cookie parseCookie(long j, HttpUrl httpUrl, String str) {
        yl0.e(httpUrl, C0059ao.a(8020));
        yl0.e(str, C0059ao.a(8021));
        return Cookie.Companion.parse$okhttp(j, httpUrl, str);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        yl0.e(builder, C0059ao.a(8010));
        yl0.e(str, C0059ao.a(8011));
        yl0.e(str2, C0059ao.a(8012));
        return builder.addLenient$okhttp(str, str2);
    }
}
