package okhttp3.internal.connection;

import java.net.Proxy;
import java.net.URI;
import java.util.List;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class RouteSelector$resetNextProxy$1 extends zl0 implements sk0<List<? extends Proxy>> {
    public final /* synthetic */ Proxy $proxy;
    public final /* synthetic */ HttpUrl $url;
    public final /* synthetic */ RouteSelector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelector$resetNextProxy$1(RouteSelector routeSelector, Proxy proxy, HttpUrl httpUrl) {
        super(0);
        this.this$0 = routeSelector;
        this.$proxy = proxy;
        this.$url = httpUrl;
    }

    @Override // defpackage.sk0
    public final List<? extends Proxy> invoke() {
        Address address;
        Proxy proxy = this.$proxy;
        if (proxy != null) {
            return zi0.b(proxy);
        }
        URI uri = this.$url.uri();
        if (uri.getHost() == null) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        address = this.this$0.address;
        List<Proxy> select = address.proxySelector().select(uri);
        return select == null || select.isEmpty() ? Util.immutableListOf(Proxy.NO_PROXY) : Util.toImmutableList(select);
    }
}
