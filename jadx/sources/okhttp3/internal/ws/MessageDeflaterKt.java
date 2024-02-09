package okhttp3.internal.ws;

import myunmn.C0059ao;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class MessageDeflaterKt {
    private static final ByteString EMPTY_DEFLATE_BLOCK;
    private static final int LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION = 0;

    static {
        C0059ao.a(MessageDeflaterKt.class, 341);
        EMPTY_DEFLATE_BLOCK = ByteString.Companion.decodeHex(C0059ao.a(6321));
    }
}
