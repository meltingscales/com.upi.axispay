package okhttp3.internal.ws;

import myunmn.C0059ao;
import okio.Buffer;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = null;
    public static final int B0_FLAG_FIN = 0;
    public static final int B0_FLAG_RSV1 = 0;
    public static final int B0_FLAG_RSV2 = 0;
    public static final int B0_FLAG_RSV3 = 0;
    public static final int B0_MASK_OPCODE = 0;
    public static final int B1_FLAG_MASK = 0;
    public static final int B1_MASK_LENGTH = 0;
    public static final int CLOSE_CLIENT_GOING_AWAY = 0;
    public static final long CLOSE_MESSAGE_MAX = 0;
    public static final int CLOSE_NO_STATUS_CODE = 0;
    public static final WebSocketProtocol INSTANCE;
    public static final int OPCODE_BINARY = 0;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 0;
    public static final int OPCODE_CONTROL_PING = 0;
    public static final int OPCODE_CONTROL_PONG = 0;
    public static final int OPCODE_FLAG_CONTROL = 0;
    public static final int OPCODE_TEXT = 0;
    public static final long PAYLOAD_BYTE_MAX = 0;
    public static final int PAYLOAD_LONG = 0;
    public static final int PAYLOAD_SHORT = 0;
    public static final long PAYLOAD_SHORT_MAX = 0;

    static {
        C0059ao.a(WebSocketProtocol.class, 135);
        INSTANCE = new WebSocketProtocol();
    }

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String str) {
        yl0.e(str, C0059ao.a(6353));
        ByteString.Companion companion = ByteString.Companion;
        return companion.encodeUtf8(str + C0059ao.a(6354)).sha1().base64();
    }

    public final String closeCodeExceptionMessage(int i) {
        if (i < 1000 || i >= 5000) {
            return C0059ao.a(6357) + i;
        } else if ((1004 > i || 1006 < i) && (1015 > i || 2999 < i)) {
            return null;
        } else {
            return C0059ao.a(6355) + i + C0059ao.a(6356);
        }
    }

    public final void toggleMask(Buffer.UnsafeCursor unsafeCursor, byte[] bArr) {
        yl0.e(unsafeCursor, C0059ao.a(6358));
        yl0.e(bArr, C0059ao.a(6359));
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = unsafeCursor.data;
            int i2 = unsafeCursor.start;
            int i3 = unsafeCursor.end;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (unsafeCursor.next() != -1);
    }

    public final void validateCloseCode(int i) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (closeCodeExceptionMessage == null) {
            return;
        }
        yl0.c(closeCodeExceptionMessage);
        throw new IllegalArgumentException(closeCodeExceptionMessage.toString());
    }
}
