package okhttp3;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import myunmn.C0059ao;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile(C0059ao.a(14999));
    private static final Pattern MONTH_PATTERN = Pattern.compile(C0059ao.a(15000));
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile(C0059ao.a(15001));
    private static final Pattern TIME_PATTERN = Pattern.compile(C0059ao.a(15002));

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = 253402300799999L;
        private String path = C0059ao.a(1750);

        public final Cookie build() {
            String str = this.name;
            Objects.requireNonNull(str, C0059ao.a(1752));
            String str2 = this.value;
            Objects.requireNonNull(str2, C0059ao.a(1753));
            long j = this.expiresAt;
            String str3 = this.domain;
            Objects.requireNonNull(str3, C0059ao.a(1754));
            return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
        }

        public final Builder domain(String str) {
            yl0.e(str, C0059ao.a(1755));
            return domain(str, false);
        }

        public final Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > 253402300799999L) {
                j = 253402300799999L;
            }
            this.expiresAt = j;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String str) {
            yl0.e(str, C0059ao.a(1756));
            return domain(str, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String str) {
            yl0.e(str, C0059ao.a(1757));
            if (yl0.a(co0.p0(str).toString(), str)) {
                this.name = str;
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(1758).toString());
        }

        public final Builder path(String str) {
            yl0.e(str, C0059ao.a(1759));
            if (bo0.w(str, C0059ao.a(1760), false, 2, null)) {
                this.path = str;
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(1761).toString());
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String str) {
            yl0.e(str, C0059ao.a(1762));
            if (yl0.a(co0.p0(str).toString(), str)) {
                this.value = str;
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(1763).toString());
        }

        private final Builder domain(String str, boolean z) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = z;
                return this;
            }
            throw new IllegalArgumentException(C0059ao.a(1751) + str);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        private final int dateCharacterOffset(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (yl0.a(str, str2)) {
                return true;
            }
            return bo0.i(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str);
        }

        private final String parseDomain(String str) {
            String a = C0059ao.a(11341);
            if (!bo0.i(str, a, false, 2, null)) {
                String canonicalHost = HostnamesKt.toCanonicalHost(co0.a0(str, a));
                if (canonicalHost != null) {
                    return canonicalHost;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException(C0059ao.a(11342).toString());
        }

        private final long parseExpires(String str, int i, int i2) {
            int dateCharacterOffset = dateCharacterOffset(str, i, i2, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (dateCharacterOffset < i2) {
                int dateCharacterOffset2 = dateCharacterOffset(str, dateCharacterOffset + 1, i2, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                String a = C0059ao.a(11343);
                if (i4 != -1 || !matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    if (i5 != -1 || !matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                        if (i6 != -1 || !matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                            if (i3 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                                String group = matcher.group(1);
                                yl0.d(group, a);
                                i3 = Integer.parseInt(group);
                            }
                        } else {
                            String group2 = matcher.group(1);
                            yl0.d(group2, a);
                            Locale locale = Locale.US;
                            yl0.d(locale, C0059ao.a(11346));
                            Objects.requireNonNull(group2, C0059ao.a(11347));
                            String lowerCase = group2.toLowerCase(locale);
                            yl0.d(lowerCase, C0059ao.a(11348));
                            String pattern = Cookie.MONTH_PATTERN.pattern();
                            yl0.d(pattern, C0059ao.a(11349));
                            i6 = co0.M(pattern, lowerCase, 0, false, 6, null) / 4;
                        }
                    } else {
                        String group3 = matcher.group(1);
                        yl0.d(group3, a);
                        i5 = Integer.parseInt(group3);
                    }
                } else {
                    String group4 = matcher.group(1);
                    yl0.d(group4, a);
                    i4 = Integer.parseInt(group4);
                    String group5 = matcher.group(2);
                    yl0.d(group5, C0059ao.a(11344));
                    i7 = Integer.parseInt(group5);
                    String group6 = matcher.group(3);
                    yl0.d(group6, C0059ao.a(11345));
                    i8 = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(str, dateCharacterOffset2 + 1, i2, false);
            }
            if (70 <= i3 && 99 >= i3) {
                i3 += 1900;
            }
            if (i3 >= 0 && 69 >= i3) {
                i3 += RecyclerView.MAX_SCROLL_DURATION;
            }
            boolean z = i3 >= 1601;
            String a2 = C0059ao.a(11350);
            if (z) {
                if (i6 != -1) {
                    if (1 <= i5 && 31 >= i5) {
                        if (i4 >= 0 && 23 >= i4) {
                            if (i7 >= 0 && 59 >= i7) {
                                if (i8 >= 0 && 59 >= i8) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i3);
                                    gregorianCalendar.set(2, i6 - 1);
                                    gregorianCalendar.set(5, i5);
                                    gregorianCalendar.set(11, i4);
                                    gregorianCalendar.set(12, i7);
                                    gregorianCalendar.set(13, i8);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException(a2.toString());
                            }
                            throw new IllegalArgumentException(a2.toString());
                        }
                        throw new IllegalArgumentException(a2.toString());
                    }
                    throw new IllegalArgumentException(a2.toString());
                }
                throw new IllegalArgumentException(a2.toString());
            }
            throw new IllegalArgumentException(a2.toString());
        }

        private final long parseMaxAge(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (new sn0(C0059ao.a(11351)).a(str)) {
                    if (bo0.w(str, C0059ao.a(11352), false, 2, null)) {
                        return Long.MIN_VALUE;
                    }
                    return RecyclerView.FOREVER_NS;
                }
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String encodedPath = httpUrl.encodedPath();
            if (yl0.a(encodedPath, str)) {
                return true;
            }
            return bo0.w(encodedPath, str, false, 2, null) && (bo0.i(str, C0059ao.a(11353), false, 2, null) || encodedPath.charAt(str.length()) == '/');
        }

        public final Cookie parse(HttpUrl httpUrl, String str) {
            yl0.e(httpUrl, C0059ao.a(11354));
            yl0.e(str, C0059ao.a(11355));
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0130, code lost:
            if (r1 > 253402300799999L) goto L86;
         */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x018d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.Cookie parse$okhttp(long r27, okhttp3.HttpUrl r29, java.lang.String r30) {
            /*
                Method dump skipped, instructions count: 434
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.parse$okhttp(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        public final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
            yl0.e(httpUrl, C0059ao.a(11368));
            yl0.e(headers, C0059ao.a(11369));
            List<String> values = headers.values(C0059ao.a(11370));
            int size = values.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                Cookie parse = parse(httpUrl, values.get(i));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList != null) {
                List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
                yl0.d(unmodifiableList, C0059ao.a(11371));
                return unmodifiableList;
            }
            return aj0.f();
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    /* renamed from: -deprecated_domain  reason: not valid java name */
    public final String m271deprecated_domain() {
        return this.domain;
    }

    /* renamed from: -deprecated_expiresAt  reason: not valid java name */
    public final long m272deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* renamed from: -deprecated_hostOnly  reason: not valid java name */
    public final boolean m273deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* renamed from: -deprecated_httpOnly  reason: not valid java name */
    public final boolean m274deprecated_httpOnly() {
        return this.httpOnly;
    }

    /* renamed from: -deprecated_name  reason: not valid java name */
    public final String m275deprecated_name() {
        return this.name;
    }

    /* renamed from: -deprecated_path  reason: not valid java name */
    public final String m276deprecated_path() {
        return this.path;
    }

    /* renamed from: -deprecated_persistent  reason: not valid java name */
    public final boolean m277deprecated_persistent() {
        return this.persistent;
    }

    /* renamed from: -deprecated_secure  reason: not valid java name */
    public final boolean m278deprecated_secure() {
        return this.secure;
    }

    /* renamed from: -deprecated_value  reason: not valid java name */
    public final String m279deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (yl0.a(cookie.name, this.name) && yl0.a(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && yl0.a(cookie.domain, this.domain) && yl0.a(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl httpUrl) {
        boolean domainMatch;
        yl0.e(httpUrl, C0059ao.a(15003));
        if (!this.hostOnly) {
            domainMatch = Companion.domainMatch(httpUrl.host(), this.domain);
        } else {
            domainMatch = yl0.a(httpUrl.host(), this.domain);
        }
        if (domainMatch && Companion.pathMatch(httpUrl, this.path)) {
            return !this.secure || httpUrl.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append(C0059ao.a(15004));
            } else {
                sb.append(C0059ao.a(15005));
                sb.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append(C0059ao.a(15006));
            if (z) {
                sb.append(C0059ao.a(15007));
            }
            sb.append(this.domain);
        }
        sb.append(C0059ao.a(15008));
        sb.append(this.path);
        if (this.secure) {
            sb.append(C0059ao.a(15009));
        }
        if (this.httpOnly) {
            sb.append(C0059ao.a(15010));
        }
        String sb2 = sb.toString();
        yl0.d(sb2, C0059ao.a(15011));
        return sb2;
    }

    public final String value() {
        return this.value;
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, vl0 vl0Var) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }
}
