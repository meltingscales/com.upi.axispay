package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.Interceptor;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i, TimeUnit timeUnit);

        Chain withReadTimeout(int i, TimeUnit timeUnit);

        Chain withWriteTimeout(int i, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(final dl0<? super Chain, Response> dl0Var) {
            yl0.e(dl0Var, C0059ao.a(11461));
            return new Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    yl0.e(chain, C0059ao.a(9014));
                    return (Response) dl0.this.invoke(chain);
                }
            };
        }
    }

    Response intercept(Chain chain) throws IOException;
}
