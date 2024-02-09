package okhttp3;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class CipherSuite {
    public static final Companion Companion;
    private static final Map<String, CipherSuite> INSTANCES;
    private static final Comparator<String> ORDER_BY_NAME;
    public static final CipherSuite TLS_AES_128_CCM_8_SHA256;
    public static final CipherSuite TLS_AES_128_CCM_SHA256;
    public static final CipherSuite TLS_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV;
    public static final CipherSuite TLS_FALLBACK_SCSV;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA;
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5;
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5;
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5;
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256;
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA;
    private final String javaName;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CipherSuite init(String str, int i) {
            CipherSuite cipherSuite = new CipherSuite(str, null);
            CipherSuite.INSTANCES.put(str, cipherSuite);
            return cipherSuite;
        }

        private final String secondaryName(String str) {
            String a = C0059ao.a(4628);
            boolean w = bo0.w(str, a, false, 2, null);
            String a2 = C0059ao.a(4629);
            String a3 = C0059ao.a(4630);
            String a4 = C0059ao.a(4631);
            if (w) {
                StringBuilder sb = new StringBuilder();
                sb.append(a4);
                Objects.requireNonNull(str, a3);
                String substring = str.substring(4);
                yl0.d(substring, a2);
                sb.append(substring);
                return sb.toString();
            } else if (bo0.w(str, a4, false, 2, null)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a);
                Objects.requireNonNull(str, a3);
                String substring2 = str.substring(4);
                yl0.d(substring2, a2);
                sb2.append(substring2);
                return sb2.toString();
            } else {
                return str;
            }
        }

        public final synchronized CipherSuite forJavaName(String str) {
            CipherSuite cipherSuite;
            yl0.e(str, C0059ao.a(4632));
            cipherSuite = (CipherSuite) CipherSuite.INSTANCES.get(str);
            if (cipherSuite == null) {
                cipherSuite = (CipherSuite) CipherSuite.INSTANCES.get(secondaryName(str));
                if (cipherSuite == null) {
                    cipherSuite = new CipherSuite(str, null);
                }
                CipherSuite.INSTANCES.put(str, cipherSuite);
            }
            return cipherSuite;
        }

        public final Comparator<String> getORDER_BY_NAME$okhttp() {
            return CipherSuite.ORDER_BY_NAME;
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        ORDER_BY_NAME = new Comparator<String>() { // from class: okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                yl0.e(str, C0059ao.a(11517));
                yl0.e(str2, C0059ao.a(11518));
                int min = Math.min(str.length(), str2.length());
                for (int i = 4; i < min; i++) {
                    char charAt = str.charAt(i);
                    char charAt2 = str2.charAt(i);
                    if (charAt != charAt2) {
                        return yl0.g(charAt, charAt2) < 0 ? -1 : 1;
                    }
                }
                int length = str.length();
                int length2 = str2.length();
                if (length != length2) {
                    return length < length2 ? -1 : 1;
                }
                return 0;
            }
        };
        INSTANCES = new LinkedHashMap();
        TLS_RSA_WITH_NULL_MD5 = companion.init(C0059ao.a(10165), 1);
        TLS_RSA_WITH_NULL_SHA = companion.init(C0059ao.a(10166), 2);
        TLS_RSA_EXPORT_WITH_RC4_40_MD5 = companion.init(C0059ao.a(10167), 3);
        TLS_RSA_WITH_RC4_128_MD5 = companion.init(C0059ao.a(10168), 4);
        TLS_RSA_WITH_RC4_128_SHA = companion.init(C0059ao.a(10169), 5);
        TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = companion.init(C0059ao.a(10170), 8);
        TLS_RSA_WITH_DES_CBC_SHA = companion.init(C0059ao.a(10171), 9);
        TLS_RSA_WITH_3DES_EDE_CBC_SHA = companion.init(C0059ao.a(10172), 10);
        TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = companion.init(C0059ao.a(10173), 17);
        TLS_DHE_DSS_WITH_DES_CBC_SHA = companion.init(C0059ao.a(10174), 18);
        TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = companion.init(C0059ao.a(10175), 19);
        TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = companion.init(C0059ao.a(10176), 20);
        TLS_DHE_RSA_WITH_DES_CBC_SHA = companion.init(C0059ao.a(10177), 21);
        TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = companion.init(C0059ao.a(10178), 22);
        TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = companion.init(C0059ao.a(10179), 23);
        TLS_DH_anon_WITH_RC4_128_MD5 = companion.init(C0059ao.a(10180), 24);
        TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = companion.init(C0059ao.a(10181), 25);
        TLS_DH_anon_WITH_DES_CBC_SHA = companion.init(C0059ao.a(10182), 26);
        TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = companion.init(C0059ao.a(10183), 27);
        TLS_KRB5_WITH_DES_CBC_SHA = companion.init(C0059ao.a(10184), 30);
        TLS_KRB5_WITH_3DES_EDE_CBC_SHA = companion.init(C0059ao.a(10185), 31);
        TLS_KRB5_WITH_RC4_128_SHA = companion.init(C0059ao.a(10186), 32);
        TLS_KRB5_WITH_DES_CBC_MD5 = companion.init(C0059ao.a(10187), 34);
        TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = companion.init(C0059ao.a(10188), 35);
        TLS_KRB5_WITH_RC4_128_MD5 = companion.init(C0059ao.a(10189), 36);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = companion.init(C0059ao.a(10190), 38);
        TLS_KRB5_EXPORT_WITH_RC4_40_SHA = companion.init(C0059ao.a(10191), 40);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = companion.init(C0059ao.a(10192), 41);
        TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = companion.init(C0059ao.a(10193), 43);
        TLS_RSA_WITH_AES_128_CBC_SHA = companion.init(C0059ao.a(10194), 47);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA = companion.init(C0059ao.a(10195), 50);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA = companion.init(C0059ao.a(10196), 51);
        TLS_DH_anon_WITH_AES_128_CBC_SHA = companion.init(C0059ao.a(10197), 52);
        TLS_RSA_WITH_AES_256_CBC_SHA = companion.init(C0059ao.a(10198), 53);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA = companion.init(C0059ao.a(10199), 56);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA = companion.init(C0059ao.a(10200), 57);
        TLS_DH_anon_WITH_AES_256_CBC_SHA = companion.init(C0059ao.a(10201), 58);
        TLS_RSA_WITH_NULL_SHA256 = companion.init(C0059ao.a(10202), 59);
        TLS_RSA_WITH_AES_128_CBC_SHA256 = companion.init(C0059ao.a(10203), 60);
        TLS_RSA_WITH_AES_256_CBC_SHA256 = companion.init(C0059ao.a(10204), 61);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = companion.init(C0059ao.a(10205), 64);
        TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = companion.init(C0059ao.a(10206), 65);
        TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = companion.init(C0059ao.a(10207), 68);
        TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = companion.init(C0059ao.a(10208), 69);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = companion.init(C0059ao.a(10209), 103);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = companion.init(C0059ao.a(10210), 106);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = companion.init(C0059ao.a(10211), 107);
        TLS_DH_anon_WITH_AES_128_CBC_SHA256 = companion.init(C0059ao.a(10212), 108);
        Companion companion2 = Companion;
        TLS_DH_anon_WITH_AES_256_CBC_SHA256 = companion2.init(C0059ao.a(10213), 109);
        TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = companion2.init(C0059ao.a(10214), 132);
        TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = companion2.init(C0059ao.a(10215), 135);
        TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = companion2.init(C0059ao.a(10216), 136);
        TLS_PSK_WITH_RC4_128_SHA = companion2.init(C0059ao.a(10217), 138);
        TLS_PSK_WITH_3DES_EDE_CBC_SHA = companion2.init(C0059ao.a(10218), 139);
        TLS_PSK_WITH_AES_128_CBC_SHA = companion2.init(C0059ao.a(10219), 140);
        TLS_PSK_WITH_AES_256_CBC_SHA = companion2.init(C0059ao.a(10220), 141);
        TLS_RSA_WITH_SEED_CBC_SHA = companion2.init(C0059ao.a(10221), 150);
        TLS_RSA_WITH_AES_128_GCM_SHA256 = companion2.init(C0059ao.a(10222), 156);
        TLS_RSA_WITH_AES_256_GCM_SHA384 = companion2.init(C0059ao.a(10223), 157);
        TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = companion2.init(C0059ao.a(10224), 158);
        TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = companion2.init(C0059ao.a(10225), 159);
        TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = companion2.init(C0059ao.a(10226), 162);
        TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = companion2.init(C0059ao.a(10227), 163);
        TLS_DH_anon_WITH_AES_128_GCM_SHA256 = companion2.init(C0059ao.a(10228), 166);
        TLS_DH_anon_WITH_AES_256_GCM_SHA384 = companion2.init(C0059ao.a(10229), 167);
        TLS_EMPTY_RENEGOTIATION_INFO_SCSV = companion2.init(C0059ao.a(10230), 255);
        TLS_FALLBACK_SCSV = companion2.init(C0059ao.a(10231), 22016);
        TLS_ECDH_ECDSA_WITH_NULL_SHA = companion2.init(C0059ao.a(10232), 49153);
        TLS_ECDH_ECDSA_WITH_RC4_128_SHA = companion2.init(C0059ao.a(10233), 49154);
        TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = companion2.init(C0059ao.a(10234), 49155);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = companion2.init(C0059ao.a(10235), 49156);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = companion2.init(C0059ao.a(10236), 49157);
        TLS_ECDHE_ECDSA_WITH_NULL_SHA = companion2.init(C0059ao.a(10237), 49158);
        TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = companion2.init(C0059ao.a(10238), 49159);
        TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = companion2.init(C0059ao.a(10239), 49160);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = companion2.init(C0059ao.a(10240), 49161);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = companion2.init(C0059ao.a(10241), 49162);
        TLS_ECDH_RSA_WITH_NULL_SHA = companion2.init(C0059ao.a(10242), 49163);
        TLS_ECDH_RSA_WITH_RC4_128_SHA = companion2.init(C0059ao.a(10243), 49164);
        TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = companion2.init(C0059ao.a(10244), 49165);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = companion2.init(C0059ao.a(10245), 49166);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = companion2.init(C0059ao.a(10246), 49167);
        TLS_ECDHE_RSA_WITH_NULL_SHA = companion2.init(C0059ao.a(10247), 49168);
        TLS_ECDHE_RSA_WITH_RC4_128_SHA = companion2.init(C0059ao.a(10248), 49169);
        TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = companion2.init(C0059ao.a(10249), 49170);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = companion2.init(C0059ao.a(10250), 49171);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = companion2.init(C0059ao.a(10251), 49172);
        TLS_ECDH_anon_WITH_NULL_SHA = companion2.init(C0059ao.a(10252), 49173);
        TLS_ECDH_anon_WITH_RC4_128_SHA = companion2.init(C0059ao.a(10253), 49174);
        TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = companion2.init(C0059ao.a(10254), 49175);
        TLS_ECDH_anon_WITH_AES_128_CBC_SHA = companion2.init(C0059ao.a(10255), 49176);
        TLS_ECDH_anon_WITH_AES_256_CBC_SHA = companion2.init(C0059ao.a(10256), 49177);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = companion2.init(C0059ao.a(10257), 49187);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = companion2.init(C0059ao.a(10258), 49188);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = companion2.init(C0059ao.a(10259), 49189);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = companion2.init(C0059ao.a(10260), 49190);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = companion2.init(C0059ao.a(10261), 49191);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = companion2.init(C0059ao.a(10262), 49192);
        Companion companion3 = Companion;
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = companion3.init(C0059ao.a(10263), 49193);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = companion3.init(C0059ao.a(10264), 49194);
        TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = companion3.init(C0059ao.a(10265), 49195);
        TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = companion3.init(C0059ao.a(10266), 49196);
        TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = companion3.init(C0059ao.a(10267), 49197);
        TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = companion3.init(C0059ao.a(10268), 49198);
        TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = companion3.init(C0059ao.a(10269), 49199);
        TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = companion3.init(C0059ao.a(10270), 49200);
        TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = companion3.init(C0059ao.a(10271), 49201);
        TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = companion3.init(C0059ao.a(10272), 49202);
        TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = companion3.init(C0059ao.a(10273), 49205);
        TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = companion3.init(C0059ao.a(10274), 49206);
        TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = companion3.init(C0059ao.a(10275), 52392);
        TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = companion3.init(C0059ao.a(10276), 52393);
        TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = companion3.init(C0059ao.a(10277), 52394);
        TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = companion3.init(C0059ao.a(10278), 52396);
        TLS_AES_128_GCM_SHA256 = companion3.init(C0059ao.a(10279), 4865);
        TLS_AES_256_GCM_SHA384 = companion3.init(C0059ao.a(10280), 4866);
        TLS_CHACHA20_POLY1305_SHA256 = companion3.init(C0059ao.a(10281), 4867);
        TLS_AES_128_CCM_SHA256 = companion3.init(C0059ao.a(10282), 4868);
        TLS_AES_128_CCM_8_SHA256 = companion3.init(C0059ao.a(10283), 4869);
    }

    private CipherSuite(String str) {
        this.javaName = str;
    }

    public static final synchronized CipherSuite forJavaName(String str) {
        CipherSuite forJavaName;
        synchronized (CipherSuite.class) {
            forJavaName = Companion.forJavaName(str);
        }
        return forJavaName;
    }

    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m267deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }

    public String toString() {
        return this.javaName;
    }

    public /* synthetic */ CipherSuite(String str, vl0 vl0Var) {
        this(str);
    }
}
