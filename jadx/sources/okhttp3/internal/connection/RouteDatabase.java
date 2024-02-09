package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import myunmn.C0059ao;
import okhttp3.Route;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        yl0.e(route, C0059ao.a(10005));
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route route) {
        yl0.e(route, C0059ao.a(10006));
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        yl0.e(route, C0059ao.a(10007));
        return this.failedRoutes.contains(route);
    }
}
