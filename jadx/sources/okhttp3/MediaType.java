package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class MediaType {
    public static final Companion Companion;
    private static final Pattern PARAMETER;
    private static final String QUOTED = null;
    private static final String TOKEN = null;
    private static final Pattern TYPE_SUBTYPE;
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final MediaType m317deprecated_get(String str) {
            yl0.e(str, C0059ao.a(12913));
            return get(str);
        }

        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final MediaType m318deprecated_parse(String str) {
            yl0.e(str, C0059ao.a(12914));
            return parse(str);
        }

        public final MediaType get(String str) {
            yl0.e(str, C0059ao.a(12915));
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                yl0.d(group, C0059ao.a(12916));
                Locale locale = Locale.US;
                String a = C0059ao.a(12917);
                yl0.d(locale, a);
                String a2 = C0059ao.a(12918);
                Objects.requireNonNull(group, a2);
                String lowerCase = group.toLowerCase(locale);
                String a3 = C0059ao.a(12919);
                yl0.d(lowerCase, a3);
                String group2 = matcher.group(2);
                yl0.d(group2, C0059ao.a(12920));
                yl0.d(locale, a);
                Objects.requireNonNull(group2, a2);
                String lowerCase2 = group2.toLowerCase(locale);
                yl0.d(lowerCase2, a3);
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = MediaType.PARAMETER.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else {
                                String a4 = C0059ao.a(12921);
                                if (bo0.w(group4, a4, false, 2, null) && bo0.i(group4, a4, false, 2, null) && group4.length() > 2) {
                                    group4 = group4.substring(1, group4.length() - 1);
                                    yl0.d(group4, C0059ao.a(12922));
                                }
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C0059ao.a(12923));
                        String substring = str.substring(end);
                        yl0.d(substring, C0059ao.a(12924));
                        sb.append(substring);
                        sb.append(C0059ao.a(12925));
                        sb.append(str);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, C0059ao.a(12926));
                return new MediaType(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new IllegalArgumentException((C0059ao.a(12927) + str + '\"').toString());
        }

        public final MediaType parse(String str) {
            yl0.e(str, C0059ao.a(12928));
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }
    }

    static {
        C0059ao.a(MediaType.class, 246);
        Companion = new Companion(null);
        TYPE_SUBTYPE = Pattern.compile(C0059ao.a(10508));
        PARAMETER = Pattern.compile(C0059ao.a(10509));
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_subtype  reason: not valid java name */
    public final String m315deprecated_subtype() {
        return this.subtype;
    }

    /* renamed from: -deprecated_type  reason: not valid java name */
    public final String m316deprecated_type() {
        return this.type;
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public final Charset charset(Charset charset) {
        String parameter = parameter(C0059ao.a(10510));
        if (parameter != null) {
            try {
                return Charset.forName(parameter);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        return charset;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && yl0.a(((MediaType) obj).mediaType, this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String str) {
        yl0.e(str, C0059ao.a(10511));
        pm0 g = tm0.g(xi0.n(this.parameterNamesAndValues), 2);
        int a = g.a();
        int b = g.b();
        int c = g.c();
        if (c >= 0) {
            if (a > b) {
                return null;
            }
        } else if (a < b) {
            return null;
        }
        while (!bo0.j(this.parameterNamesAndValues[a], str, true)) {
            if (a == b) {
                return null;
            }
            a += c;
        }
        return this.parameterNamesAndValues[a + 1];
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, vl0 vl0Var) {
        this(str, str2, str3, strArr);
    }
}
