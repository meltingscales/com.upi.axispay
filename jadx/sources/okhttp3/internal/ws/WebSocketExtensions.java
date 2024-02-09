package okhttp3.internal.ws;

import java.io.IOException;
import myunmn.C0059ao;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class WebSocketExtensions {
    public static final Companion Companion;
    private static final String HEADER_WEB_SOCKET_EXTENSION = null;
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final WebSocketExtensions parse(Headers headers) throws IOException {
            yl0.e(headers, C0059ao.a(8572));
            int size = headers.size();
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < size; i++) {
                if (bo0.j(headers.name(i), C0059ao.a(8573), true)) {
                    String value = headers.value(i);
                    int i2 = 0;
                    while (i2 < value.length()) {
                        int delimiterOffset$default = Util.delimiterOffset$default(value, ',', i2, 0, 4, (Object) null);
                        int delimiterOffset = Util.delimiterOffset(value, ';', i2, delimiterOffset$default);
                        String trimSubstring = Util.trimSubstring(value, i2, delimiterOffset);
                        int i3 = delimiterOffset + 1;
                        if (bo0.j(trimSubstring, C0059ao.a(8574), true)) {
                            if (z) {
                                z4 = true;
                            }
                            while (i3 < delimiterOffset$default) {
                                int delimiterOffset2 = Util.delimiterOffset(value, ';', i3, delimiterOffset$default);
                                int delimiterOffset3 = Util.delimiterOffset(value, '=', i3, delimiterOffset2);
                                String trimSubstring2 = Util.trimSubstring(value, i3, delimiterOffset3);
                                String c0 = delimiterOffset3 < delimiterOffset2 ? co0.c0(Util.trimSubstring(value, delimiterOffset3 + 1, delimiterOffset2), C0059ao.a(8575)) : null;
                                int i4 = delimiterOffset2 + 1;
                                if (bo0.j(trimSubstring2, C0059ao.a(8576), true)) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    num = c0 != null ? ao0.f(c0) : null;
                                    if (num != null) {
                                        i3 = i4;
                                    }
                                    z4 = true;
                                    i3 = i4;
                                } else {
                                    if (bo0.j(trimSubstring2, C0059ao.a(8577), true)) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (c0 != null) {
                                            z4 = true;
                                        }
                                        z2 = true;
                                    } else if (bo0.j(trimSubstring2, C0059ao.a(8578), true)) {
                                        if (num2 != null) {
                                            z4 = true;
                                        }
                                        num2 = c0 != null ? ao0.f(c0) : null;
                                        if (num2 != null) {
                                        }
                                        z4 = true;
                                    } else {
                                        if (bo0.j(trimSubstring2, C0059ao.a(8579), true)) {
                                            if (z3) {
                                                z4 = true;
                                            }
                                            if (c0 != null) {
                                                z4 = true;
                                            }
                                            z3 = true;
                                        }
                                        z4 = true;
                                    }
                                    i3 = i4;
                                }
                            }
                            i2 = i3;
                            z = true;
                        } else {
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z, num, z2, num2, z3, z4);
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    static {
        C0059ao.a(WebSocketExtensions.class, 110);
        Companion = new Companion(null);
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.perMessageDeflate = z;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z2;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z3;
        this.unknownValues = z4;
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = webSocketExtensions.perMessageDeflate;
        }
        if ((i & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            z2 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            z3 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            z4 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z, num3, z5, num4, z6, z4);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        return new WebSocketExtensions(z, num, z2, num2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WebSocketExtensions) {
                WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
                return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && yl0.a(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && yl0.a(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z = this.perMessageDeflate;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.clientMaxWindowBits;
        int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        ?? r2 = this.clientNoContextTakeover;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int hashCode2 = (i3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r22 = this.serverNoContextTakeover;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        boolean z2 = this.unknownValues;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean noContextTakeover(boolean z) {
        if (z) {
            return this.clientNoContextTakeover;
        }
        return this.serverNoContextTakeover;
    }

    public String toString() {
        return C0059ao.a(5389) + this.perMessageDeflate + C0059ao.a(5390) + this.clientMaxWindowBits + C0059ao.a(5391) + this.clientNoContextTakeover + C0059ao.a(5392) + this.serverMaxWindowBits + C0059ao.a(5393) + this.serverNoContextTakeover + C0059ao.a(5394) + this.unknownValues + C0059ao.a(5395);
    }

    public /* synthetic */ WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, vl0 vl0Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }
}
