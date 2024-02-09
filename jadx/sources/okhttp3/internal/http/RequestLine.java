package okhttp3.internal.http;

import java.net.Proxy;
import myunmn.C0059ao;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        return !request.isHttps() && type == Proxy.Type.HTTP;
    }

    public final String get(Request request, Proxy.Type type) {
        yl0.e(request, C0059ao.a(5361));
        yl0.e(type, C0059ao.a(5362));
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        RequestLine requestLine = INSTANCE;
        if (requestLine.includeAuthorityInRequestLine(request, type)) {
            sb.append(request.url());
        } else {
            sb.append(requestLine.requestPath(request.url()));
        }
        sb.append(C0059ao.a(5363));
        String sb2 = sb.toString();
        yl0.d(sb2, C0059ao.a(5364));
        return sb2;
    }

    public final String requestPath(HttpUrl httpUrl) {
        yl0.e(httpUrl, C0059ao.a(5365));
        String encodedPath = httpUrl.encodedPath();
        String encodedQuery = httpUrl.encodedQuery();
        if (encodedQuery != null) {
            return encodedPath + '?' + encodedQuery;
        }
        return encodedPath;
    }
}
