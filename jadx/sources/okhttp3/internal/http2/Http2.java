package okhttp3.internal.http2;

import com.google.android.gms.vision.barcode.Barcode;
import myunmn.C0059ao;
import okhttp3.internal.Util;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final ByteString CONNECTION_PREFACE;
    private static final String[] FLAGS;
    public static final int FLAG_ACK = 0;
    public static final int FLAG_COMPRESSED = 0;
    public static final int FLAG_END_HEADERS = 0;
    public static final int FLAG_END_PUSH_PROMISE = 0;
    public static final int FLAG_END_STREAM = 0;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 0;
    public static final int FLAG_PRIORITY = 0;
    private static final String[] FRAME_NAMES;
    public static final int INITIAL_MAX_FRAME_SIZE = 0;
    public static final Http2 INSTANCE;
    public static final int TYPE_CONTINUATION = 0;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 0;
    public static final int TYPE_HEADERS = 0;
    public static final int TYPE_PING = 0;
    public static final int TYPE_PRIORITY = 0;
    public static final int TYPE_PUSH_PROMISE = 0;
    public static final int TYPE_RST_STREAM = 0;
    public static final int TYPE_SETTINGS = 0;
    public static final int TYPE_WINDOW_UPDATE = 0;

    static {
        String a;
        C0059ao.a(Http2.class, 107);
        INSTANCE = new Http2();
        CONNECTION_PREFACE = ByteString.Companion.encodeUtf8(C0059ao.a(15815));
        FRAME_NAMES = new String[]{C0059ao.a(15816), C0059ao.a(15817), C0059ao.a(15818), C0059ao.a(15819), C0059ao.a(15820), C0059ao.a(15821), C0059ao.a(15822), C0059ao.a(15823), C0059ao.a(15824), C0059ao.a(15825)};
        FLAGS = new String[64];
        String[] strArr = new String[Barcode.QR_CODE];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            yl0.d(binaryString, C0059ao.a(15826));
            strArr[i] = bo0.r(Util.format(C0059ao.a(15827), binaryString), ' ', '0', false, 4, null);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = C0059ao.a(15828);
        strArr2[1] = C0059ao.a(15829);
        int[] iArr = {1};
        strArr2[8] = C0059ao.a(15830);
        int i2 = 0;
        while (true) {
            a = C0059ao.a(15831);
            if (i2 >= 1) {
                break;
            }
            int i3 = iArr[i2];
            String[] strArr3 = FLAGS;
            strArr3[i3 | 8] = yl0.l(strArr3[i3], a);
            i2++;
        }
        String[] strArr4 = FLAGS;
        strArr4[4] = C0059ao.a(15832);
        strArr4[32] = C0059ao.a(15833);
        strArr4[36] = C0059ao.a(15834);
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = FLAGS;
                int i8 = i7 | i5;
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i7]);
                String a2 = C0059ao.a(15835);
                sb.append(a2);
                sb.append(strArr5[i5]);
                strArr5[i8] = sb.toString();
                strArr5[i8 | 8] = strArr5[i7] + a2 + strArr5[i5] + a;
            }
        }
        int length = FLAGS.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = FLAGS;
            if (strArr6[i9] == null) {
                strArr6[i9] = BINARY[i9];
            }
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i, int i2) {
        String str;
        if (i2 == 0) {
            return C0059ao.a(15836);
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? C0059ao.a(15841) : BINARY[i2];
            } else if (i != 7 && i != 8) {
                String[] strArr = FLAGS;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    yl0.c(str);
                } else {
                    str = BINARY[i2];
                }
                String str2 = str;
                if (i != 5 || (i2 & 4) == 0) {
                    return (i != 0 || (i2 & 32) == 0) ? str2 : bo0.s(str2, C0059ao.a(15839), C0059ao.a(15840), false, 4, null);
                }
                return bo0.s(str2, C0059ao.a(15837), C0059ao.a(15838), false, 4, null);
            }
        }
        return BINARY[i2];
    }

    public final String formattedType$okhttp(int i) {
        String[] strArr = FRAME_NAMES;
        return i < strArr.length ? strArr[i] : Util.format(C0059ao.a(15842), Integer.valueOf(i));
    }

    public final String frameLog(boolean z, int i, int i2, int i3, int i4) {
        return Util.format(C0059ao.a(15845), z ? C0059ao.a(15843) : C0059ao.a(15844), Integer.valueOf(i), Integer.valueOf(i2), formattedType$okhttp(i3), formatFlags(i3, i4));
    }
}
