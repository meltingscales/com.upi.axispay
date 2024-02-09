package okio;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public final /* synthetic */ class Okio__OkioKt {
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    public static final BufferedSource buffer(Source source) {
        yl0.e(source, C0059ao.a(14477));
        return new RealBufferedSource(source);
    }

    public static final BufferedSink buffer(Sink sink) {
        yl0.e(sink, C0059ao.a(14476));
        return new RealBufferedSink(sink);
    }
}
