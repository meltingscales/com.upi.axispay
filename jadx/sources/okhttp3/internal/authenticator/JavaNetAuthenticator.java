package okhttp3.internal.authenticator;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import java.util.Objects;
import myunmn.C0059ao;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class JavaNetAuthenticator implements Authenticator {
    private final Dns defaultDns;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        }
    }

    public JavaNetAuthenticator() {
        this(null, 1, null);
    }

    public JavaNetAuthenticator(Dns dns) {
        yl0.e(dns, C0059ao.a(15208));
        this.defaultDns = dns;
    }

    private final InetAddress connectToInetAddress(Proxy proxy, HttpUrl httpUrl, Dns dns) throws IOException {
        Proxy.Type type = proxy.type();
        if (type == null || WhenMappings.$EnumSwitchMapping$0[type.ordinal()] != 1) {
            SocketAddress address = proxy.address();
            Objects.requireNonNull(address, C0059ao.a(15209));
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            yl0.d(address2, C0059ao.a(15210));
            return address2;
        }
        return (InetAddress) ij0.v(dns.lookup(httpUrl.host()));
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) throws IOException {
        Proxy proxy;
        Dns dns;
        PasswordAuthentication requestPasswordAuthentication;
        Address address;
        yl0.e(response, C0059ao.a(15211));
        List<Challenge> challenges = response.challenges();
        Request request = response.request();
        HttpUrl url = request.url();
        boolean z = response.code() == 407;
        if (route == null || (proxy = route.proxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge challenge : challenges) {
            if (bo0.j(C0059ao.a(15212), challenge.scheme(), true)) {
                if (route == null || (address = route.address()) == null || (dns = address.dns()) == null) {
                    dns = this.defaultDns;
                }
                String a = C0059ao.a(15213);
                if (z) {
                    SocketAddress address2 = proxy.address();
                    Objects.requireNonNull(address2, C0059ao.a(15214));
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                    String hostName = inetSocketAddress.getHostName();
                    yl0.d(proxy, a);
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, connectToInetAddress(proxy, url, dns), inetSocketAddress.getPort(), url.scheme(), challenge.realm(), challenge.scheme(), url.url(), Authenticator.RequestorType.PROXY);
                } else {
                    String host = url.host();
                    yl0.d(proxy, a);
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(host, connectToInetAddress(proxy, url, dns), url.port(), url.scheme(), challenge.realm(), challenge.scheme(), url.url(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String a2 = z ? C0059ao.a(15215) : C0059ao.a(15216);
                    String userName = requestPasswordAuthentication.getUserName();
                    yl0.d(userName, C0059ao.a(15217));
                    char[] password = requestPasswordAuthentication.getPassword();
                    yl0.d(password, C0059ao.a(15218));
                    return request.newBuilder().header(a2, Credentials.basic(userName, new String(password), challenge.charset())).build();
                }
            }
        }
        return null;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i, vl0 vl0Var) {
        this((i & 1) != 0 ? Dns.SYSTEM : dns);
    }
}
