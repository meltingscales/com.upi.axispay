package okio;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: okio.-GzipSinkExtensions  reason: invalid class name */
/* loaded from: classes2.dex */
public final class GzipSinkExtensions {
    public static final GzipSink gzip(Sink sink) {
        yl0.e(sink, C0059ao.a(6699));
        return new GzipSink(sink);
    }
}
