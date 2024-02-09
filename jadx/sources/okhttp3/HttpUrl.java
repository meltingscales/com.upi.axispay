package okhttp3;

import com.google.android.gms.vision.barcode.Barcode;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import myunmn.C0059ao;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class HttpUrl {
    public static final Companion Companion;
    public static final String FORM_ENCODE_SET = null;
    public static final String FRAGMENT_ENCODE_SET = null;
    public static final String FRAGMENT_ENCODE_SET_URI = null;
    private static final char[] HEX_DIGITS;
    public static final String PASSWORD_ENCODE_SET = null;
    public static final String PATH_SEGMENT_ENCODE_SET = null;
    public static final String PATH_SEGMENT_ENCODE_SET_URI = null;
    public static final String QUERY_COMPONENT_ENCODE_SET = null;
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = null;
    public static final String QUERY_COMPONENT_REENCODE_SET = null;
    public static final String QUERY_ENCODE_SET = null;
    public static final String USERNAME_ENCODE_SET = null;
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Builder {
        public static final Companion Companion;
        public static final String INVALID_HOST = null;
        private String encodedFragment;
        private String encodedPassword;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String encodedUsername;
        private String host;
        private int port;
        private String scheme;

        /* compiled from: AxisPay */
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, C0059ao.a(11327), false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == ':') {
                        return i;
                    }
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    }
                    i++;
                }
                return i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((yl0.g(charAt, 97) < 0 || yl0.g(charAt, 122) > 0) && (yl0.g(charAt, 65) < 0 || yl0.g(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            public /* synthetic */ Companion(vl0 vl0Var) {
                this();
            }
        }

        static {
            C0059ao.a(Builder.class, 381);
            Companion = new Companion(null);
        }

        public Builder() {
            String a = C0059ao.a(13284);
            this.encodedUsername = a;
            this.encodedPassword = a;
            this.port = -1;
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add(a);
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            yl0.c(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return yl0.a(str, C0059ao.a(13286)) || bo0.j(str, C0059ao.a(13287), true);
        }

        private final boolean isDotDot(String str) {
            return yl0.a(str, C0059ao.a(13288)) || bo0.j(str, C0059ao.a(13289), true) || bo0.j(str, C0059ao.a(13290), true) || bo0.j(str, C0059ao.a(13291), true);
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            boolean z = list.remove(list.size() - 1).length() == 0;
            String a = C0059ao.a(13292);
            if (z && (!this.encodedPathSegments.isEmpty())) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, a);
                return;
            }
            this.encodedPathSegments.add(a);
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, C0059ao.a(13293), z2, false, false, false, null, 240, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (z) {
                this.encodedPathSegments.add(C0059ao.a(13294));
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            yl0.c(list);
            pm0 g = tm0.g(tm0.f(list.size() - 2, 0), 2);
            int a = g.a();
            int b = g.b();
            int c = g.c();
            if (c >= 0) {
                if (a > b) {
                    return;
                }
            } else if (a < b) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                yl0.c(list2);
                if (yl0.a(str, list2.get(a))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    yl0.c(list3);
                    list3.remove(a + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    yl0.c(list4);
                    list4.remove(a);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    yl0.c(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (a == b) {
                    return;
                }
                a += c;
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004b -> B:11:0x002e). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void resolvePath(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                r2 = 13295(0x33ef, float:1.863E-41)
                java.lang.String r2 = myunmn.C0059ao.a(r2)
                r3 = 1
                if (r0 == r1) goto L23
                r1 = 92
                if (r0 != r1) goto L18
                goto L23
            L18:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L2e
            L23:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.add(r2)
                goto L4b
            L2e:
                r6 = r12
                if (r6 >= r13) goto L4e
                r12 = 13296(0x33f0, float:1.8632E-41)
                java.lang.String r12 = myunmn.C0059ao.a(r12)
                int r12 = okhttp3.internal.Util.delimiterOffset(r11, r12, r6, r13)
                if (r12 >= r13) goto L40
                r0 = r3
                goto L41
            L40:
                r0 = 0
            L41:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.push(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L2e
            L4b:
                int r12 = r12 + 1
                goto L2e
            L4e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.resolvePath(java.lang.String, int, int):void");
        }

        public final Builder addEncodedPathSegment(String str) {
            yl0.e(str, C0059ao.a(13297));
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            yl0.e(str, C0059ao.a(13298));
            return addPathSegments(str, true);
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            yl0.e(str, C0059ao.a(13299));
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            yl0.c(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, C0059ao.a(13300), true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            yl0.c(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, C0059ao.a(13301), true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final Builder addPathSegment(String str) {
            yl0.e(str, C0059ao.a(13302));
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String str) {
            yl0.e(str, C0059ao.a(13303));
            return addPathSegments(str, false);
        }

        public final Builder addQueryParameter(String str, String str2) {
            yl0.e(str, C0059ao.a(13304));
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            yl0.c(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, C0059ao.a(13305), false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            yl0.c(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, C0059ao.a(13306), false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
                String str2 = this.host;
                if (str2 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    ArrayList arrayList2 = new ArrayList(bj0.o(list, 10));
                    for (String str3 : list) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    if (list2 != null) {
                        arrayList = new ArrayList(bj0.o(list2, 10));
                        for (String str4 : list2) {
                            arrayList.add(str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, true, 3, null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.encodedFragment;
                    return new HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, arrayList2, arrayList, str5 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str5, 0, 0, false, 7, null) : null, toString());
                }
                throw new IllegalStateException(C0059ao.a(13307));
            }
            throw new IllegalStateException(C0059ao.a(13308));
        }

        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, C0059ao.a(13309), true, false, false, true, null, 179, null) : null;
            return this;
        }

        public final Builder encodedPassword(String str) {
            yl0.e(str, C0059ao.a(13310));
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, C0059ao.a(13311), true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String str) {
            yl0.e(str, C0059ao.a(13312));
            if (bo0.w(str, C0059ao.a(13313), false, 2, null)) {
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException((C0059ao.a(13314) + str).toString());
        }

        public final Builder encodedQuery(String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, C0059ao.a(13315), true, false, true, false, null, 211, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder encodedUsername(String str) {
            yl0.e(str, C0059ao.a(13316));
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, C0059ao.a(13317), true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, C0059ao.a(13318), false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String str) {
            yl0.e(str, C0059ao.a(13319));
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(13320) + str);
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int delimiterOffset;
            int i;
            int i2;
            String str2;
            boolean z;
            int i3;
            String str3;
            int i4;
            boolean z2;
            boolean z3;
            String str4 = str;
            yl0.e(str4, C0059ao.a(13321));
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str4, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str4, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(str4, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            String a = C0059ao.a(13322);
            char c = 65535;
            boolean z4 = true;
            if (schemeDelimiterOffset != -1) {
                if (bo0.t(str4, C0059ao.a(13323), indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = C0059ao.a(13324);
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (bo0.t(str4, C0059ao.a(13325), indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = C0059ao.a(13326);
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C0059ao.a(13327));
                    String substring = str4.substring(0, schemeDelimiterOffset);
                    yl0.d(substring, a);
                    sb.append(substring);
                    sb.append(C0059ao.a(13328));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                if (str.length() > 6) {
                    str4 = eo0.q0(str4, 6) + C0059ao.a(13339);
                }
                throw new IllegalArgumentException(C0059ao.a(13340) + str4);
            }
            int slashCount = companion.slashCount(str4, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c2 = '?';
            char c3 = '#';
            if (slashCount < 2 && httpUrl != null && !(!yl0.a(httpUrl.scheme(), this.scheme))) {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str4.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = indexOfLastNonAsciiWhitespace$default;
            } else {
                int i5 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str4, C0059ao.a(13329), i5, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? str4.charAt(delimiterOffset) : c;
                    if (charAt == c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        break;
                    }
                    if (charAt != '@') {
                        z = z4;
                        str3 = a;
                        i3 = indexOfLastNonAsciiWhitespace$default;
                    } else {
                        String a2 = C0059ao.a(13330);
                        if (!z5) {
                            int delimiterOffset2 = Util.delimiterOffset(str4, ':', i5, delimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            z = z4;
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            String str5 = a;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str, i5, delimiterOffset2, C0059ao.a(13331), true, false, false, false, null, 240, null);
                            if (z6) {
                                canonicalize$okhttp$default = this.encodedUsername + a2 + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, delimiterOffset2 + 1, delimiterOffset, C0059ao.a(13332), true, false, false, false, null, 240, null);
                                z3 = z;
                            } else {
                                z3 = z5;
                            }
                            z5 = z3;
                            str3 = str5;
                            z2 = z;
                            i4 = delimiterOffset;
                        } else {
                            z = z4;
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append(a2);
                            str3 = a;
                            i4 = delimiterOffset;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i5, delimiterOffset, C0059ao.a(13333), true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                            z2 = z6;
                        }
                        i5 = i4 + 1;
                        z6 = z2;
                    }
                    a = str3;
                    z4 = z;
                    indexOfLastNonAsciiWhitespace$default = i3;
                    c3 = '#';
                    c2 = '?';
                    c = 65535;
                }
                boolean z7 = z4;
                String str6 = a;
                i = indexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int portColonOffset = companion3.portColonOffset(str4, i5, delimiterOffset);
                int i6 = portColonOffset + 1;
                if (i6 < delimiterOffset) {
                    i2 = i5;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i5, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(str4, i6, delimiterOffset);
                    this.port = parsePort;
                    if (!(parsePort != -1 ? z7 : false)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(C0059ao.a(13334));
                        String substring2 = str4.substring(i6, delimiterOffset);
                        yl0.d(substring2, str6);
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str2 = str6;
                } else {
                    i2 = i5;
                    str2 = str6;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i2, portColonOffset, false, 4, null));
                    String str7 = this.scheme;
                    yl0.c(str7);
                    this.port = companion4.defaultPort(str7);
                }
                if (!(this.host != null ? z7 : false)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(C0059ao.a(13338));
                    String substring3 = str4.substring(i2, portColonOffset);
                    yl0.d(substring3, str2);
                    sb4.append(substring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
            }
            int i7 = i;
            int delimiterOffset3 = Util.delimiterOffset(str4, C0059ao.a(13335), indexOfFirstNonAsciiWhitespace$default, i7);
            resolvePath(str4, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i7 && str4.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str4, '#', delimiterOffset3, i7);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, delimiterOffset3 + 1, delimiterOffset4, C0059ao.a(13336), true, false, true, false, null, 208, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i7 && str4.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, delimiterOffset3 + 1, i7, C0059ao.a(13337), true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String str) {
            yl0.e(str, C0059ao.a(13341));
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, C0059ao.a(13342), false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int i) {
            boolean z = true;
            if ((1 > i || 65535 < i) ? false : false) {
                this.port = i;
                return this;
            }
            throw new IllegalArgumentException((C0059ao.a(13343) + i).toString());
        }

        public final Builder query(String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, C0059ao.a(13344), false, false, true, false, null, 219, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new sn0(C0059ao.a(13345)).b(str, C0059ao.a(13346)) : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i), 0, 0, C0059ao.a(13347), true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = list2.get(i2);
                    list2.set(i2, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, C0059ao.a(13348), true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, C0059ao.a(13349), true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            yl0.e(str, C0059ao.a(13350));
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, C0059ao.a(13351), true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            yl0.e(str, C0059ao.a(13352));
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, C0059ao.a(13353), false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(C0059ao.a(13354));
            }
            return this;
        }

        public final Builder scheme(String str) {
            yl0.e(str, C0059ao.a(13355));
            String a = C0059ao.a(13356);
            if (bo0.j(str, a, true)) {
                this.scheme = a;
            } else {
                String a2 = C0059ao.a(13357);
                if (!bo0.j(str, a2, true)) {
                    throw new IllegalArgumentException(C0059ao.a(13358) + str);
                }
                this.scheme = a2;
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            yl0.e(str, C0059ao.a(13359));
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i, String str) {
            yl0.e(str, C0059ao.a(13360));
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, C0059ao.a(13361), true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i, canonicalize$okhttp$default);
            if ((isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException((C0059ao.a(13362) + str).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            yl0.e(str, C0059ao.a(13363));
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            yl0.e(str, C0059ao.a(13364));
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i, String str) {
            yl0.e(str, C0059ao.a(13365));
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, C0059ao.a(13366), false, false, false, false, null, 251, null);
            if ((isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) ? false : true) {
                this.encodedPathSegments.set(i, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException((C0059ao.a(13367) + str).toString());
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final Builder setQueryParameter(String str, String str2) {
            yl0.e(str, C0059ao.a(13368));
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
            if ((r6.encodedPassword.length() > 0) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
            if (r1 != r3.defaultPort(r2)) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L17
                r0.append(r1)
                r1 = 13369(0x3439, float:1.8734E-41)
                java.lang.String r1 = myunmn.C0059ao.a(r1)
                r0.append(r1)
                goto L21
            L17:
                r1 = 13370(0x343a, float:1.8735E-41)
                java.lang.String r1 = myunmn.C0059ao.a(r1)
                r0.append(r1)
            L21:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L2d
                r1 = r2
                goto L2e
            L2d:
                r1 = r3
            L2e:
                r4 = 58
                if (r1 != 0) goto L3f
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L3c
                r1 = r2
                goto L3d
            L3c:
                r1 = r3
            L3d:
                if (r1 == 0) goto L5d
            L3f:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L4d
                goto L4e
            L4d:
                r2 = r3
            L4e:
                if (r2 == 0) goto L58
                r0.append(r4)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L58:
                r1 = 64
                r0.append(r1)
            L5d:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L81
                defpackage.yl0.c(r1)
                r2 = 2
                r5 = 0
                boolean r1 = defpackage.co0.A(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L7c
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L81
            L7c:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L81:
                int r1 = r6.port
                r2 = -1
                if (r1 != r2) goto L8a
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto La3
            L8a:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.scheme
                if (r2 == 0) goto L9d
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                defpackage.yl0.c(r2)
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto La3
            L9d:
                r0.append(r4)
                r0.append(r1)
            La3:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto Lbb
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                defpackage.yl0.c(r2)
                r1.toQueryString$okhttp(r2, r0)
            Lbb:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lc9
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lc9:
                java.lang.String r0 = r0.toString()
                r1 = 13371(0x343b, float:1.8737E-41)
                java.lang.String r1 = myunmn.C0059ao.a(r1)
                defpackage.yl0.d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String str) {
            yl0.e(str, C0059ao.a(13372));
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, C0059ao.a(13373), false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z) {
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, C0059ao.a(13285), i, str.length());
                push(str, i, delimiterOffset, delimiterOffset < str.length(), z);
                i = delimiterOffset + 1;
            } while (i <= str.length());
            return this;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return companion.canonicalize$okhttp(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & Barcode.ITF) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
            if (isPercentEncoded(r16, r6, r18) == false) goto L43;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void writeCanonicalized(okio.Buffer r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r19
                r4 = r24
                r5 = 0
                r6 = r17
                r7 = r5
            Ld:
                if (r6 >= r2) goto Ld7
                r8 = 10995(0x2af3, float:1.5407E-41)
                java.lang.String r8 = myunmn.C0059ao.a(r8)
                java.util.Objects.requireNonNull(r1, r8)
                int r8 = r1.codePointAt(r6)
                if (r20 == 0) goto L33
                r9 = 9
                if (r8 == r9) goto L30
                r9 = 10
                if (r8 == r9) goto L30
                r9 = 12
                if (r8 == r9) goto L30
                r9 = 13
                if (r8 == r9) goto L30
                goto L33
            L30:
                r10 = r14
                goto Ld0
            L33:
                r9 = 10996(0x2af4, float:1.5409E-41)
                java.lang.String r9 = myunmn.C0059ao.a(r9)
                r10 = 32
                if (r8 != r10) goto L4b
                r11 = 10997(0x2af5, float:1.541E-41)
                java.lang.String r11 = myunmn.C0059ao.a(r11)
                if (r3 != r11) goto L4b
                r15.writeUtf8(r9)
                goto L30
            L4b:
                r11 = 43
                if (r8 != r11) goto L5f
                if (r22 == 0) goto L5f
                if (r20 == 0) goto L54
                goto L5b
            L54:
                r9 = 10998(0x2af6, float:1.5411E-41)
                java.lang.String r9 = myunmn.C0059ao.a(r9)
            L5b:
                r15.writeUtf8(r9)
                goto L30
            L5f:
                r9 = 37
                if (r8 < r10) goto L89
                r10 = 127(0x7f, float:1.78E-43)
                if (r8 == r10) goto L89
                r10 = 128(0x80, float:1.794E-43)
                if (r8 < r10) goto L6d
                if (r23 == 0) goto L89
            L6d:
                char r10 = (char) r8
                r11 = 0
                r12 = 2
                boolean r10 = defpackage.co0.A(r3, r10, r11, r12, r5)
                if (r10 != 0) goto L89
                if (r8 != r9) goto L84
                if (r20 == 0) goto L89
                if (r21 == 0) goto L84
                r10 = r14
                boolean r11 = r14.isPercentEncoded(r1, r6, r2)
                if (r11 != 0) goto L85
                goto L8a
            L84:
                r10 = r14
            L85:
                r15.writeUtf8CodePoint(r8)
                goto Ld0
            L89:
                r10 = r14
            L8a:
                if (r7 != 0) goto L91
                okio.Buffer r7 = new okio.Buffer
                r7.<init>()
            L91:
                if (r4 == 0) goto La5
                java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.UTF_8
                boolean r11 = defpackage.yl0.a(r4, r11)
                if (r11 == 0) goto L9c
                goto La5
            L9c:
                int r11 = java.lang.Character.charCount(r8)
                int r11 = r11 + r6
                r7.writeString(r1, r6, r11, r4)
                goto La8
            La5:
                r7.writeUtf8CodePoint(r8)
            La8:
                boolean r11 = r7.exhausted()
                if (r11 != 0) goto Ld0
                byte r11 = r7.readByte()
                r11 = r11 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r12 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r13 = r11 >> 4
                r13 = r13 & 15
                char r12 = r12[r13]
                r15.writeByte(r12)
                char[] r12 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r11 = r11 & 15
                char r11 = r12[r11]
                r15.writeByte(r11)
                goto La8
            Ld0:
                int r8 = java.lang.Character.charCount(r8)
                int r6 = r6 + r8
                goto Ld
            Ld7:
                r10 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(Buffer buffer, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                Objects.requireNonNull(str, C0059ao.a(10999));
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i3));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        buffer.writeByte((parseHexDigit << 4) + parseHexDigit2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z) {
                        buffer.writeByte(32);
                        i++;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m311deprecated_get(String str) {
            yl0.e(str, C0059ao.a(11000));
            return get(str);
        }

        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final HttpUrl m314deprecated_parse(String str) {
            yl0.e(str, C0059ao.a(11003));
            return parse(str);
        }

        public final String canonicalize$okhttp(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            yl0.e(str, C0059ao.a(11004));
            yl0.e(str2, C0059ao.a(11005));
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !co0.A(str2, (char) codePointAt, false, 2, null))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!isPercentEncoded(str, i3, i2)) {
                                    Buffer buffer = new Buffer();
                                    buffer.writeUtf8(str, i, i3);
                                    writeCanonicalized(buffer, str, i3, i2, str2, z, z2, z3, z4, charset);
                                    return buffer.readUtf8();
                                }
                                if (codePointAt == 43 || !z3) {
                                    i3 += Character.charCount(codePointAt);
                                } else {
                                    Buffer buffer2 = new Buffer();
                                    buffer2.writeUtf8(str, i, i3);
                                    writeCanonicalized(buffer2, str, i3, i2, str2, z, z2, z3, z4, charset);
                                    return buffer2.readUtf8();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i3 += Character.charCount(codePointAt);
                }
                Buffer buffer22 = new Buffer();
                buffer22.writeUtf8(str, i, i3);
                writeCanonicalized(buffer22, str, i3, i2, str2, z, z2, z3, z4, charset);
                return buffer22.readUtf8();
            }
            String substring = str.substring(i, i2);
            yl0.d(substring, C0059ao.a(11006));
            return substring;
        }

        public final int defaultPort(String str) {
            yl0.e(str, C0059ao.a(11007));
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals(C0059ao.a(11008))) {
                    return 443;
                }
            } else if (str.equals(C0059ao.a(11009))) {
                return 80;
            }
            return -1;
        }

        public final HttpUrl get(String str) {
            yl0.e(str, C0059ao.a(11010));
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            yl0.e(str, C0059ao.a(11015));
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i, int i2, boolean z) {
            yl0.e(str, C0059ao.a(11016));
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i, i3);
                    writePercentDecoded(buffer, str, i3, i2, z);
                    return buffer.readUtf8();
                }
            }
            String substring = str.substring(i, i2);
            yl0.d(substring, C0059ao.a(11017));
            return substring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            yl0.e(list, C0059ao.a(11018));
            yl0.e(sb, C0059ao.a(11019));
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            yl0.e(str, C0059ao.a(11020));
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int L = co0.L(str, '&', i, false, 4, null);
                if (L == -1) {
                    L = str.length();
                }
                int i2 = L;
                int L2 = co0.L(str, '=', i, false, 4, null);
                String a = C0059ao.a(11021);
                if (L2 != -1 && L2 <= i2) {
                    String substring = str.substring(i, L2);
                    yl0.d(substring, a);
                    arrayList.add(substring);
                    String substring2 = str.substring(L2 + 1, i2);
                    yl0.d(substring2, a);
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i, i2);
                    yl0.d(substring3, a);
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            yl0.e(list, C0059ao.a(11022));
            yl0.e(sb, C0059ao.a(11023));
            pm0 g = tm0.g(tm0.h(0, list.size()), 2);
            int a = g.a();
            int b = g.b();
            int c = g.c();
            if (c >= 0) {
                if (a > b) {
                    return;
                }
            } else if (a < b) {
                return;
            }
            while (true) {
                String str = list.get(a);
                String str2 = list.get(a + 1);
                if (a > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (a == b) {
                    return;
                }
                a += c;
            }
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m313deprecated_get(URL url) {
            yl0.e(url, C0059ao.a(11002));
            return get(url);
        }

        public final HttpUrl get(URL url) {
            yl0.e(url, C0059ao.a(11013));
            String url2 = url.toString();
            yl0.d(url2, C0059ao.a(11014));
            return parse(url2);
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m312deprecated_get(URI uri) {
            yl0.e(uri, C0059ao.a(11001));
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            yl0.e(uri, C0059ao.a(11011));
            String uri2 = uri.toString();
            yl0.d(uri2, C0059ao.a(11012));
            return parse(uri2);
        }
    }

    static {
        C0059ao.a(HttpUrl.class, 181);
        Companion = new Companion(null);
        HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        yl0.e(str, C0059ao.a(5498));
        yl0.e(str2, C0059ao.a(5499));
        yl0.e(str3, C0059ao.a(5500));
        yl0.e(str4, C0059ao.a(5501));
        yl0.e(list, C0059ao.a(5502));
        yl0.e(str6, C0059ao.a(5503));
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = yl0.a(str, C0059ao.a(5504));
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_encodedFragment  reason: not valid java name */
    public final String m292deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_encodedPassword  reason: not valid java name */
    public final String m293deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_encodedPath  reason: not valid java name */
    public final String m294deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments  reason: not valid java name */
    public final List<String> m295deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_encodedQuery  reason: not valid java name */
    public final String m296deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_encodedUsername  reason: not valid java name */
    public final String m297deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_fragment  reason: not valid java name */
    public final String m298deprecated_fragment() {
        return this.fragment;
    }

    /* renamed from: -deprecated_host  reason: not valid java name */
    public final String m299deprecated_host() {
        return this.host;
    }

    /* renamed from: -deprecated_password  reason: not valid java name */
    public final String m300deprecated_password() {
        return this.password;
    }

    /* renamed from: -deprecated_pathSegments  reason: not valid java name */
    public final List<String> m301deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize  reason: not valid java name */
    public final int m302deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port  reason: not valid java name */
    public final int m303deprecated_port() {
        return this.port;
    }

    /* renamed from: -deprecated_query  reason: not valid java name */
    public final String m304deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_queryParameterNames  reason: not valid java name */
    public final Set<String> m305deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize  reason: not valid java name */
    public final int m306deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m307deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_uri  reason: not valid java name */
    public final URI m308deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final URL m309deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_username  reason: not valid java name */
    public final String m310deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String str = this.url;
        Objects.requireNonNull(str, C0059ao.a(5505));
        String substring = str.substring(co0.L(this.url, '#', 0, false, 6, null) + 1);
        yl0.d(substring, C0059ao.a(5506));
        return substring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return C0059ao.a(5507);
        }
        int L = co0.L(this.url, '@', 0, false, 6, null);
        String str = this.url;
        Objects.requireNonNull(str, C0059ao.a(5508));
        String substring = str.substring(co0.L(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1, L);
        yl0.d(substring, C0059ao.a(5509));
        return substring;
    }

    public final String encodedPath() {
        int L = co0.L(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, C0059ao.a(5510), L, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, C0059ao.a(5511));
        String substring = str2.substring(L, delimiterOffset);
        yl0.d(substring, C0059ao.a(5512));
        return substring;
    }

    public final List<String> encodedPathSegments() {
        int L = co0.L(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, C0059ao.a(5513), L, str.length());
        ArrayList arrayList = new ArrayList();
        while (L < delimiterOffset) {
            int i = L + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            String str2 = this.url;
            Objects.requireNonNull(str2, C0059ao.a(5514));
            String substring = str2.substring(i, delimiterOffset2);
            yl0.d(substring, C0059ao.a(5515));
            arrayList.add(substring);
            L = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int L = co0.L(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, '#', L, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, C0059ao.a(5516));
        String substring = str2.substring(L, delimiterOffset);
        yl0.d(substring, C0059ao.a(5517));
        return substring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return C0059ao.a(5518);
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, C0059ao.a(5519), length, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, C0059ao.a(5520));
        String substring = str2.substring(length, delimiterOffset);
        yl0.d(substring, C0059ao.a(5521));
        return substring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && yl0.a(((HttpUrl) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String str) {
        yl0.e(str, C0059ao.a(5523));
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        pm0 g = tm0.g(tm0.h(0, list.size()), 2);
        int a = g.a();
        int b = g.b();
        int c = g.c();
        if (c < 0 ? a >= b : a <= b) {
            while (!yl0.a(str, this.queryNamesAndValues.get(a))) {
                if (a != b) {
                    a += c;
                }
            }
            return this.queryNamesAndValues.get(a + 1);
        }
        return null;
    }

    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i * 2);
            yl0.c(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return sj0.b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        pm0 g = tm0.g(tm0.h(0, this.queryNamesAndValues.size()), 2);
        int a = g.a();
        int b = g.b();
        int c = g.c();
        if (c < 0 ? a >= b : a <= b) {
            while (true) {
                String str = this.queryNamesAndValues.get(a);
                yl0.c(str);
                linkedHashSet.add(str);
                if (a == b) {
                    break;
                }
                a += c;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        yl0.d(unmodifiableSet, C0059ao.a(5524));
        return unmodifiableSet;
    }

    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String str) {
        yl0.e(str, C0059ao.a(5525));
        if (this.queryNamesAndValues == null) {
            return aj0.f();
        }
        ArrayList arrayList = new ArrayList();
        pm0 g = tm0.g(tm0.h(0, this.queryNamesAndValues.size()), 2);
        int a = g.a();
        int b = g.b();
        int c = g.c();
        if (c < 0 ? a >= b : a <= b) {
            while (true) {
                if (yl0.a(str, this.queryNamesAndValues.get(a))) {
                    arrayList.add(this.queryNamesAndValues.get(a + 1));
                }
                if (a == b) {
                    break;
                }
                a += c;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        yl0.d(unmodifiableList, C0059ao.a(5526));
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder(C0059ao.a(5527));
        yl0.c(newBuilder);
        String a = C0059ao.a(5528);
        return newBuilder.username(a).password(a).build().toString();
    }

    public final HttpUrl resolve(String str) {
        yl0.e(str, C0059ao.a(5529));
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new sn0(C0059ao.a(5530)).b(builder, C0059ao.a(5531)));
                yl0.d(create, C0059ao.a(5532));
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String username() {
        return this.username;
    }

    public final Builder newBuilder(String str) {
        yl0.e(str, C0059ao.a(5522));
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
