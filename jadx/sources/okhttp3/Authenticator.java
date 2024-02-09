package okhttp3;

import java.io.IOException;
import myunmn.C0059ao;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface Authenticator {
    public static final Companion Companion = new Companion(null);
    public static final Authenticator NONE = new Companion.AuthenticatorNone();
    public static final Authenticator JAVA_NET_AUTHENTICATOR = new JavaNetAuthenticator(null, 1, null);

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public Request authenticate(Route route, Response response) {
                yl0.e(response, C0059ao.a(10732));
                return null;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    Request authenticate(Route route, Response response) throws IOException;
}
