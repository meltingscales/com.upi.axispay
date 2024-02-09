package okio;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: okio.-DeprecatedUtf8  reason: invalid class name */
/* loaded from: classes2.dex */
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    public final long size(String str) {
        yl0.e(str, C0059ao.a(6364));
        return Utf8.size$default(str, 0, 0, 3, null);
    }

    public final long size(String str, int i, int i2) {
        yl0.e(str, C0059ao.a(6365));
        return Utf8.size(str, i, i2);
    }
}
