package okhttp3.internal;

import java.io.File;
import myunmn.C0059ao;
import okhttp3.Cache;
import okhttp3.Dispatcher;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.io.FileSystem;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class NativeImageTestsAccessorsKt {
    public static final Cache buildCache(File file, long j, FileSystem fileSystem) {
        yl0.e(file, C0059ao.a(5753));
        yl0.e(fileSystem, C0059ao.a(5754));
        return new Cache(file, j, fileSystem);
    }

    public static final void finished(Dispatcher dispatcher, RealCall.AsyncCall asyncCall) {
        yl0.e(dispatcher, C0059ao.a(5755));
        yl0.e(asyncCall, C0059ao.a(5756));
        dispatcher.finished$okhttp(asyncCall);
    }

    public static final RealConnection getConnection(Exchange exchange) {
        yl0.e(exchange, C0059ao.a(5757));
        return exchange.getConnection$okhttp();
    }

    public static final Exchange getExchange(Response response) {
        yl0.e(response, C0059ao.a(5758));
        return response.exchange();
    }

    public static final long getIdleAtNsAccessor(RealConnection realConnection) {
        yl0.e(realConnection, C0059ao.a(5759));
        return realConnection.getIdleAtNs();
    }

    public static final void setIdleAtNsAccessor(RealConnection realConnection, long j) {
        yl0.e(realConnection, C0059ao.a(5760));
        realConnection.setIdleAtNs(j);
    }
}
