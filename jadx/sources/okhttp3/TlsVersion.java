package okhttp3;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public static final Companion Companion = new Companion(null);
    private final String javaName;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final TlsVersion forJavaName(String str) {
            yl0.e(str, C0059ao.a(4571));
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals(C0059ao.a(4574))) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals(C0059ao.a(4573))) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals(C0059ao.a(4572))) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals(C0059ao.a(4575))) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (str.equals(C0059ao.a(4576))) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException(C0059ao.a(4577) + str);
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    TlsVersion(String str) {
        this.javaName = str;
    }

    public static final TlsVersion forJavaName(String str) {
        return Companion.forJavaName(str);
    }

    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m374deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
