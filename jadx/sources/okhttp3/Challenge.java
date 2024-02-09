package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String str, Map<String, String> map) {
        String str2;
        yl0.e(str, C0059ao.a(1072));
        yl0.e(map, C0059ao.a(1073));
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                yl0.d(locale, C0059ao.a(1074));
                Objects.requireNonNull(key, C0059ao.a(1075));
                str2 = key.toLowerCase(locale);
                yl0.d(str2, C0059ao.a(1076));
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        yl0.d(unmodifiableMap, C0059ao.a(1077));
        this.authParams = unmodifiableMap;
    }

    /* renamed from: -deprecated_authParams  reason: not valid java name */
    public final Map<String, String> m263deprecated_authParams() {
        return this.authParams;
    }

    /* renamed from: -deprecated_charset  reason: not valid java name */
    public final Charset m264deprecated_charset() {
        return charset();
    }

    /* renamed from: -deprecated_realm  reason: not valid java name */
    public final String m265deprecated_realm() {
        return realm();
    }

    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m266deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final Charset charset() {
        String str = this.authParams.get(C0059ao.a(1078));
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                yl0.d(forName, C0059ao.a(1079));
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        yl0.d(charset, C0059ao.a(1080));
        return charset;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (yl0.a(challenge.scheme, this.scheme) && yl0.a(challenge.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    public final String realm() {
        return this.authParams.get(C0059ao.a(1081));
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + C0059ao.a(1082) + this.authParams;
    }

    public final Challenge withCharset(Charset charset) {
        String a = C0059ao.a(1083);
        yl0.e(charset, a);
        Map j = qj0.j(this.authParams);
        String name = charset.name();
        yl0.d(name, C0059ao.a(1084));
        j.put(a, name);
        return new Challenge(this.scheme, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Challenge(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 1069(0x42d, float:1.498E-42)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r2, r0)
            r0 = 1070(0x42e, float:1.5E-42)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r3, r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r0 = 1071(0x42f, float:1.501E-42)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            defpackage.yl0.d(r3, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Challenge.<init>(java.lang.String, java.lang.String):void");
    }
}
