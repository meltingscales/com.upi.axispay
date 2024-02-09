package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import myunmn.C0059ao;
import okhttp3.Protocol;
import okhttp3.Response;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class StatusLine {
    public static final Companion Companion;
    public static final int HTTP_CONTINUE = 0;
    public static final int HTTP_MISDIRECTED_REQUEST = 0;
    public static final int HTTP_PERM_REDIRECT = 0;
    public static final int HTTP_TEMP_REDIRECT = 0;
    public final int code;
    public final String message;
    public final Protocol protocol;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final StatusLine get(Response response) {
            yl0.e(response, C0059ao.a(14820));
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String str) throws IOException {
            Protocol protocol;
            String a;
            yl0.e(str, C0059ao.a(14821));
            boolean w = bo0.w(str, C0059ao.a(14822), false, 2, null);
            int i = 9;
            String a2 = C0059ao.a(14823);
            if (w) {
                if (str.length() >= 9 && str.charAt(8) == ' ') {
                    int charAt = str.charAt(7) - '0';
                    if (charAt == 0) {
                        protocol = Protocol.HTTP_1_0;
                    } else if (charAt == 1) {
                        protocol = Protocol.HTTP_1_1;
                    } else {
                        throw new ProtocolException(a2 + str);
                    }
                } else {
                    throw new ProtocolException(a2 + str);
                }
            } else if (bo0.w(str, C0059ao.a(14824), false, 2, null)) {
                protocol = Protocol.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException(a2 + str);
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    yl0.d(substring, C0059ao.a(14825));
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        a = C0059ao.a(14827);
                    } else if (str.charAt(i2) == ' ') {
                        a = str.substring(i + 4);
                        yl0.d(a, C0059ao.a(14826));
                    } else {
                        throw new ProtocolException(a2 + str);
                    }
                    return new StatusLine(protocol, parseInt, a);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(a2 + str);
                }
            }
            throw new ProtocolException(a2 + str);
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    static {
        C0059ao.a(StatusLine.class, 223);
        Companion = new Companion(null);
    }

    public StatusLine(Protocol protocol, int i, String str) {
        yl0.e(protocol, C0059ao.a(10733));
        yl0.e(str, C0059ao.a(10734));
        this.protocol = protocol;
        this.code = i;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append(C0059ao.a(10735));
        } else {
            sb.append(C0059ao.a(10736));
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String sb2 = sb.toString();
        yl0.d(sb2, C0059ao.a(10737));
        return sb2;
    }
}
