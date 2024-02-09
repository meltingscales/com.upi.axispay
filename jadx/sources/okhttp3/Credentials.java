package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import myunmn.C0059ao;
import okio.ByteString;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        return basic$default(str, str2, null, 4, null);
    }

    public static final String basic(String str, String str2, Charset charset) {
        yl0.e(str, C0059ao.a(8985));
        yl0.e(str2, C0059ao.a(8986));
        yl0.e(charset, C0059ao.a(8987));
        String base64 = ByteString.Companion.encodeString(str + ':' + str2, charset).base64();
        return C0059ao.a(8988) + base64;
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            yl0.d(charset, C0059ao.a(8989));
        }
        return basic(str, str2, charset);
    }
}
