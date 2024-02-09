package okio;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: okio.-GzipSourceExtensions  reason: invalid class name */
/* loaded from: classes2.dex */
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 0;
    private static final int FEXTRA = 0;
    private static final int FHCRC = 0;
    private static final int FNAME = 0;
    private static final byte SECTION_BODY = 0;
    private static final byte SECTION_DONE = 0;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 0;

    static {
        C0059ao.a(GzipSourceExtensions.class, 141);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getBit(int i, int i2) {
        return ((i >> i2) & 1) == 1;
    }

    public static final GzipSource gzip(Source source) {
        yl0.e(source, C0059ao.a(10566));
        return new GzipSource(source);
    }
}
