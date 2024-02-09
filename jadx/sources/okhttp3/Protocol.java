package okhttp3;

import java.io.IOException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final Companion Companion = new Companion(null);
    private final String protocol;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Protocol get(String str) throws IOException {
            yl0.e(str, C0059ao.a(5141));
            Protocol protocol = Protocol.HTTP_1_0;
            if (!yl0.a(str, protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!yl0.a(str, protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!yl0.a(str, protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!yl0.a(str, protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!yl0.a(str, protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!yl0.a(str, protocol.protocol)) {
                                    throw new IOException(C0059ao.a(5142) + str);
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) throws IOException {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
