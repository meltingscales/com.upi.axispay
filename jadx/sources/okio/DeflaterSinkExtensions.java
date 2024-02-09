package okio;

import java.util.zip.Deflater;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: okio.-DeflaterSinkExtensions  reason: invalid class name */
/* loaded from: classes2.dex */
public final class DeflaterSinkExtensions {
    public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
        yl0.e(sink, C0059ao.a(12962));
        yl0.e(deflater, C0059ao.a(12963));
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        yl0.e(sink, C0059ao.a(12964));
        yl0.e(deflater, C0059ao.a(12965));
        return new DeflaterSink(sink, deflater);
    }
}
