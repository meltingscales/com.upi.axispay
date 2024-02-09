package okhttp3;

import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface CookieJar {
    public static final Companion Companion = new Companion(null);
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public List<Cookie> loadForRequest(HttpUrl httpUrl) {
                yl0.e(httpUrl, C0059ao.a(3123));
                return aj0.f();
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
                yl0.e(httpUrl, C0059ao.a(3124));
                yl0.e(list, C0059ao.a(3125));
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
