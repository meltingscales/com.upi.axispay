package okhttp3;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import myunmn.C0059ao;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = C0059ao.a(15689);
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    requestBody = Util.EMPTY_REQUEST;
                }
                return builder.delete(requestBody);
            }
            throw new UnsupportedOperationException(C0059ao.a(15691));
        }

        public Builder addHeader(String str, String str2) {
            yl0.e(str, C0059ao.a(15692));
            yl0.e(str2, C0059ao.a(15693));
            this.headers.add(str, str2);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException(C0059ao.a(15694).toString());
        }

        public Builder cacheControl(CacheControl cacheControl) {
            yl0.e(cacheControl, C0059ao.a(15695));
            String cacheControl2 = cacheControl.toString();
            boolean z = cacheControl2.length() == 0;
            String a = C0059ao.a(15696);
            return z ? removeHeader(a) : header(a, cacheControl2);
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder delete(RequestBody requestBody) {
            return method(C0059ao.a(15697), requestBody);
        }

        public Builder get() {
            return method(C0059ao.a(15698), null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public Builder head() {
            return method(C0059ao.a(15699), null);
        }

        public Builder header(String str, String str2) {
            yl0.e(str, C0059ao.a(15700));
            yl0.e(str2, C0059ao.a(15701));
            this.headers.set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            yl0.e(headers, C0059ao.a(15702));
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder method(String str, RequestBody requestBody) {
            yl0.e(str, C0059ao.a(15703));
            if (str.length() > 0) {
                String a = C0059ao.a(15704);
                if (requestBody == null) {
                    if (!(true ^ HttpMethod.requiresRequestBody(str))) {
                        throw new IllegalArgumentException((a + str + C0059ao.a(15705)).toString());
                    }
                } else if (!HttpMethod.permitsRequestBody(str)) {
                    throw new IllegalArgumentException((a + str + C0059ao.a(15706)).toString());
                }
                this.method = str;
                this.body = requestBody;
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(15707).toString());
        }

        public Builder patch(RequestBody requestBody) {
            yl0.e(requestBody, C0059ao.a(15708));
            return method(C0059ao.a(15709), requestBody);
        }

        public Builder post(RequestBody requestBody) {
            yl0.e(requestBody, C0059ao.a(15710));
            return method(C0059ao.a(15711), requestBody);
        }

        public Builder put(RequestBody requestBody) {
            yl0.e(requestBody, C0059ao.a(15712));
            return method(C0059ao.a(15713), requestBody);
        }

        public Builder removeHeader(String str) {
            yl0.e(str, C0059ao.a(15714));
            this.headers.removeAll(str);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            yl0.e(builder, C0059ao.a(15715));
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            yl0.e(str, C0059ao.a(15716));
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            yl0.e(map, C0059ao.a(15717));
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl httpUrl) {
            yl0.e(httpUrl, C0059ao.a(15727));
            this.url = httpUrl;
            return this;
        }

        public <T> Builder tag(Class<? super T> cls, T t) {
            yl0.e(cls, C0059ao.a(15718));
            if (t == null) {
                this.tags.remove(cls);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                T cast = cls.cast(t);
                yl0.c(cast);
                map.put(cls, cast);
            }
            return this;
        }

        public Builder url(String str) {
            yl0.e(str, C0059ao.a(15719));
            boolean u = bo0.u(str, C0059ao.a(15720), true);
            String a = C0059ao.a(15721);
            if (u) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0059ao.a(15722));
                String substring = str.substring(3);
                yl0.d(substring, a);
                sb.append(substring);
                str = sb.toString();
            } else if (bo0.u(str, C0059ao.a(15723), true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C0059ao.a(15724));
                String substring2 = str.substring(4);
                yl0.d(substring2, a);
                sb2.append(substring2);
                str = sb2.toString();
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder(Request request) {
            Map<Class<?>, Object> j;
            yl0.e(request, C0059ao.a(15690));
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                j = new LinkedHashMap<>();
            } else {
                j = qj0.j(request.getTags$okhttp());
            }
            this.tags = j;
            this.headers = request.headers().newBuilder();
        }

        public Builder url(URL url) {
            yl0.e(url, C0059ao.a(15725));
            HttpUrl.Companion companion = HttpUrl.Companion;
            String url2 = url.toString();
            yl0.d(url2, C0059ao.a(15726));
            return url(companion.get(url2));
        }
    }

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        yl0.e(httpUrl, C0059ao.a(9451));
        yl0.e(str, C0059ao.a(9452));
        yl0.e(headers, C0059ao.a(9453));
        yl0.e(map, C0059ao.a(9454));
        this.url = httpUrl;
        this.method = str;
        this.headers = headers;
        this.body = requestBody;
        this.tags = map;
    }

    /* renamed from: -deprecated_body  reason: not valid java name */
    public final RequestBody m353deprecated_body() {
        return this.body;
    }

    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m354deprecated_cacheControl() {
        return cacheControl();
    }

    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m355deprecated_headers() {
        return this.headers;
    }

    /* renamed from: -deprecated_method  reason: not valid java name */
    public final String m356deprecated_method() {
        return this.method;
    }

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m357deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.Companion.parse(this.headers);
            this.lazyCacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String str) {
        yl0.e(str, C0059ao.a(9455));
        return this.headers.get(str);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0059ao.a(9458));
        sb.append(this.method);
        sb.append(C0059ao.a(9459));
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(C0059ao.a(9460));
            int i = 0;
            for (gi0<? extends String, ? extends String> gi0Var : this.headers) {
                int i2 = i + 1;
                if (i >= 0) {
                    gi0<? extends String, ? extends String> gi0Var2 = gi0Var;
                    String a = gi0Var2.a();
                    String b = gi0Var2.b();
                    if (i > 0) {
                        sb.append(C0059ao.a(9461));
                    }
                    sb.append(a);
                    sb.append(':');
                    sb.append(b);
                    i = i2;
                } else {
                    aj0.n();
                    throw null;
                }
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(C0059ao.a(9462));
            sb.append(this.tags);
        }
        sb.append('}');
        String sb2 = sb.toString();
        yl0.d(sb2, C0059ao.a(9463));
        return sb2;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final List<String> headers(String str) {
        yl0.e(str, C0059ao.a(9456));
        return this.headers.values(str);
    }

    public final <T> T tag(Class<? extends T> cls) {
        yl0.e(cls, C0059ao.a(9457));
        return cls.cast(this.tags.get(cls));
    }
}
