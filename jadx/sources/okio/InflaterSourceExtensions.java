package okio;

import java.util.zip.Inflater;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: okio.-InflaterSourceExtensions  reason: invalid class name */
/* loaded from: classes2.dex */
public final class InflaterSourceExtensions {
    public static final InflaterSource inflate(Source source, Inflater inflater) {
        yl0.e(source, C0059ao.a(6845));
        yl0.e(inflater, C0059ao.a(6846));
        return new InflaterSource(source, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i, Object obj) {
        if ((i & 1) != 0) {
            inflater = new Inflater();
        }
        yl0.e(source, C0059ao.a(6847));
        yl0.e(inflater, C0059ao.a(6848));
        return new InflaterSource(source, inflater);
    }
}
