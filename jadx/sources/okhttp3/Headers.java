package okhttp3;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import myunmn.C0059ao;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class Headers implements Iterable<gi0<? extends String, ? extends String>>, om0 {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            yl0.e(str, C0059ao.a(6624));
            int L = co0.L(str, ':', 0, false, 6, null);
            if (L != -1) {
                String substring = str.substring(0, L);
                yl0.d(substring, C0059ao.a(6625));
                Objects.requireNonNull(substring, C0059ao.a(6626));
                String obj = co0.p0(substring).toString();
                String substring2 = str.substring(L + 1);
                yl0.d(substring2, C0059ao.a(6627));
                add(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException((C0059ao.a(6628) + str).toString());
        }

        public final Builder addAll(Headers headers) {
            yl0.e(headers, C0059ao.a(6635));
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str) {
            yl0.e(str, C0059ao.a(6636));
            int L = co0.L(str, ':', 1, false, 4, null);
            String a = C0059ao.a(6637);
            if (L != -1) {
                String substring = str.substring(0, L);
                yl0.d(substring, C0059ao.a(6638));
                String substring2 = str.substring(L + 1);
                yl0.d(substring2, a);
                addLenient$okhttp(substring, substring2);
            } else {
                char charAt = str.charAt(0);
                String a2 = C0059ao.a(6639);
                if (charAt == ':') {
                    String substring3 = str.substring(1);
                    yl0.d(substring3, a);
                    addLenient$okhttp(a2, substring3);
                } else {
                    addLenient$okhttp(a2, str);
                }
            }
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            yl0.e(str, C0059ao.a(6642));
            yl0.e(str2, C0059ao.a(6643));
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            Objects.requireNonNull(array, C0059ao.a(6644));
            return new Headers((String[]) array, null);
        }

        public final String get(String str) {
            yl0.e(str, C0059ao.a(6645));
            pm0 g = tm0.g(tm0.f(this.namesAndValues.size() - 2, 0), 2);
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
            while (!bo0.j(str, this.namesAndValues.get(a), true)) {
                if (a == b) {
                    return null;
                }
                a += c;
            }
            return this.namesAndValues.get(a + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            yl0.e(str, C0059ao.a(6646));
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (bo0.j(str, this.namesAndValues.get(i), true)) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder set(String str, Date date) {
            yl0.e(str, C0059ao.a(6651));
            yl0.e(date, C0059ao.a(6652));
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String str, Instant instant) {
            yl0.e(str, C0059ao.a(6649));
            yl0.e(instant, C0059ao.a(6650));
            return set(str, new Date(instant.toEpochMilli()));
        }

        public final Builder set(String str, String str2) {
            yl0.e(str, C0059ao.a(6647));
            yl0.e(str2, C0059ao.a(6648));
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, String str2) {
            yl0.e(str, C0059ao.a(6629));
            yl0.e(str2, C0059ao.a(6630));
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            yl0.e(str, C0059ao.a(6640));
            yl0.e(str2, C0059ao.a(6641));
            this.namesAndValues.add(str);
            this.namesAndValues.add(co0.p0(str2).toString());
            return this;
        }

        public final Builder add(String str, Date date) {
            yl0.e(str, C0059ao.a(6633));
            yl0.e(date, C0059ao.a(6634));
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String str, Instant instant) {
            yl0.e(str, C0059ao.a(6631));
            yl0.e(instant, C0059ao.a(6632));
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() > 0) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (!('!' <= charAt && '~' >= charAt)) {
                        throw new IllegalArgumentException(Util.format(C0059ao.a(3900), Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException(C0059ao.a(3901).toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    throw new IllegalArgumentException(Util.format(C0059ao.a(3902), Integer.valueOf(charAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            pm0 g = tm0.g(tm0.f(strArr.length - 2, 0), 2);
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
            while (!bo0.j(str, strArr[a], true)) {
                if (a == b) {
                    return null;
                }
                a += c;
            }
            return strArr[a + 1];
        }

        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m291deprecated_of(String... strArr) {
            yl0.e(strArr, C0059ao.a(3904));
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Headers of(String... strArr) {
            yl0.e(strArr, C0059ao.a(3907));
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, C0059ao.a(3908));
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                for (int i = 0; i < length; i++) {
                    if (strArr2[i] != null) {
                        String str = strArr2[i];
                        Objects.requireNonNull(str, C0059ao.a(3909));
                        strArr2[i] = co0.p0(str).toString();
                    } else {
                        throw new IllegalArgumentException(C0059ao.a(3910).toString());
                    }
                }
                pm0 g = tm0.g(tm0.h(0, strArr2.length), 2);
                int a = g.a();
                int b = g.b();
                int c = g.c();
                if (c < 0 ? a >= b : a <= b) {
                    while (true) {
                        String str2 = strArr2[a];
                        String str3 = strArr2[a + 1];
                        checkName(str2);
                        checkValue(str3, str2);
                        if (a == b) {
                            break;
                        }
                        a += c;
                    }
                }
                return new Headers(strArr2, null);
            }
            throw new IllegalArgumentException(C0059ao.a(3911).toString());
        }

        public /* synthetic */ Companion(vl0 vl0Var) {
            this();
        }

        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m290deprecated_of(Map<String, String> map) {
            yl0.e(map, C0059ao.a(3903));
            return of(map);
        }

        public final Headers of(Map<String, String> map) {
            yl0.e(map, C0059ao.a(3905));
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String a = C0059ao.a(3906);
                Objects.requireNonNull(key, a);
                String obj = co0.p0(key).toString();
                Objects.requireNonNull(value, a);
                String obj2 = co0.p0(value).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i] = obj;
                strArr[i + 1] = obj2;
                i += 2;
            }
            return new Headers(strArr, null);
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m289deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String str) {
        yl0.e(str, C0059ao.a(14788));
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        yl0.e(str, C0059ao.a(14789));
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String str) {
        yl0.e(str, C0059ao.a(14790));
        Date date = getDate(str);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<gi0<? extends String, ? extends String>> iterator() {
        int size = size();
        gi0[] gi0VarArr = new gi0[size];
        for (int i = 0; i < size; i++) {
            gi0VarArr[i] = li0.a(name(i), value(i));
        }
        return ql0.a(gi0VarArr);
    }

    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(bo0.k(mm0.a));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        yl0.d(unmodifiableSet, C0059ao.a(14791));
        return unmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        fj0.r(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(bo0.k(mm0.a));
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            Locale locale = Locale.US;
            yl0.d(locale, C0059ao.a(14792));
            Objects.requireNonNull(name, C0059ao.a(14793));
            String lowerCase = name.toLowerCase(locale);
            yl0.d(lowerCase, C0059ao.a(14794));
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(name(i));
            sb.append(C0059ao.a(14795));
            sb.append(value(i));
            sb.append(C0059ao.a(14796));
        }
        String sb2 = sb.toString();
        yl0.d(sb2, C0059ao.a(14797));
        return sb2;
    }

    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    public final List<String> values(String str) {
        yl0.e(str, C0059ao.a(14798));
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (bo0.j(str, name(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            yl0.d(unmodifiableList, C0059ao.a(14799));
            return unmodifiableList;
        }
        return aj0.f();
    }

    public /* synthetic */ Headers(String[] strArr, vl0 vl0Var) {
        this(strArr);
    }
}
