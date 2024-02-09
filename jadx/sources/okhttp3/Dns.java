package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface Dns {
    public static final Companion Companion = new Companion(null);
    public static final Dns SYSTEM = new Companion.DnsSystem();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public List<InetAddress> lookup(String str) {
                yl0.e(str, C0059ao.a(3515));
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    yl0.d(allByName, C0059ao.a(3516));
                    return xi0.t(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(C0059ao.a(3517) + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
