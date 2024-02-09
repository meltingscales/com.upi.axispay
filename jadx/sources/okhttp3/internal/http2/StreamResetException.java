package okhttp3.internal.http2;

import java.io.IOException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super(C0059ao.a(15776) + errorCode);
        yl0.e(errorCode, C0059ao.a(15775));
        this.errorCode = errorCode;
    }
}
