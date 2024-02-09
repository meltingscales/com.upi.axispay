package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import myunmn.C0059ao;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.GzipSource;
import okio.Okio;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class BridgeInterceptor implements Interceptor {
    private final CookieJar cookieJar;

    public BridgeInterceptor(CookieJar cookieJar) {
        yl0.e(cookieJar, C0059ao.a(1559));
        this.cookieJar = cookieJar;
    }

    private final String cookieHeader(List<Cookie> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                Cookie cookie = (Cookie) obj;
                if (i > 0) {
                    sb.append(C0059ao.a(1560));
                }
                sb.append(cookie.name());
                sb.append('=');
                sb.append(cookie.value());
                i = i2;
            } else {
                aj0.n();
                throw null;
            }
        }
        String sb2 = sb.toString();
        yl0.d(sb2, C0059ao.a(1561));
        return sb2;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        ResponseBody body;
        yl0.e(chain, C0059ao.a(1562));
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        RequestBody body2 = request.body();
        String a = C0059ao.a(1563);
        String a2 = C0059ao.a(1564);
        if (body2 != null) {
            MediaType contentType = body2.contentType();
            if (contentType != null) {
                newBuilder.header(a, contentType.toString());
            }
            long contentLength = body2.contentLength();
            int i = (contentLength > (-1L) ? 1 : (contentLength == (-1L) ? 0 : -1));
            String a3 = C0059ao.a(1565);
            if (i != 0) {
                newBuilder.header(a2, String.valueOf(contentLength));
                newBuilder.removeHeader(a3);
            } else {
                newBuilder.header(a3, C0059ao.a(1566));
                newBuilder.removeHeader(a2);
            }
        }
        String a4 = C0059ao.a(1567);
        boolean z = false;
        if (request.header(a4) == null) {
            newBuilder.header(a4, Util.toHostHeader$default(request.url(), false, 1, null));
        }
        String a5 = C0059ao.a(1568);
        if (request.header(a5) == null) {
            newBuilder.header(a5, C0059ao.a(1569));
        }
        String a6 = C0059ao.a(1570);
        String header = request.header(a6);
        String a7 = C0059ao.a(1571);
        if (header == null && request.header(C0059ao.a(1572)) == null) {
            newBuilder.header(a6, a7);
            z = true;
        }
        List<Cookie> loadForRequest = this.cookieJar.loadForRequest(request.url());
        if (!loadForRequest.isEmpty()) {
            newBuilder.header(C0059ao.a(1573), cookieHeader(loadForRequest));
        }
        String a8 = C0059ao.a(1574);
        if (request.header(a8) == null) {
            newBuilder.header(a8, C0059ao.a(1575));
        }
        Response proceed = chain.proceed(newBuilder.build());
        HttpHeaders.receiveHeaders(this.cookieJar, request.url(), proceed.headers());
        Response.Builder request2 = proceed.newBuilder().request(request);
        if (z) {
            String a9 = C0059ao.a(1576);
            if (bo0.j(a7, Response.header$default(proceed, a9, null, 2, null), true) && HttpHeaders.promisesBody(proceed) && (body = proceed.body()) != null) {
                GzipSource gzipSource = new GzipSource(body.source());
                request2.headers(proceed.headers().newBuilder().removeAll(a9).removeAll(a2).build());
                request2.body(new RealResponseBody(Response.header$default(proceed, a, null, 2, null), -1L, Okio.buffer(gzipSource)));
            }
        }
        return request2.build();
    }
}
