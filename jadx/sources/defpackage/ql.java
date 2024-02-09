package defpackage;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ql  reason: default package */
/* loaded from: classes.dex */
public final class ql {
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    public final Set<d> d;

    /* compiled from: AxisPay */
    /* renamed from: ql$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        public final int g;

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            this.c = c(str2);
            this.f = str3;
            this.g = i2;
        }

        public static boolean a(String str) {
            if (str.length() == 0) {
                return false;
            }
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (i2 == 0 && charAt != '(') {
                    return false;
                }
                if (charAt == '(') {
                    i++;
                } else if (charAt == ')' && i - 1 == 0 && i2 != str.length() - 1) {
                    return false;
                }
            }
            return i == 0;
        }

        public static boolean b(String str, String str2) {
            if (str2 == null) {
                return false;
            }
            if (str.equals(str2)) {
                return true;
            }
            if (a(str)) {
                return str.substring(1, str.length() - 1).trim().equals(str2);
            }
            return false;
        }

        public static int c(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains(C0059ao.a(4324))) {
                return 3;
            }
            if (upperCase.contains(C0059ao.a(4325)) || upperCase.contains(C0059ao.a(4326)) || upperCase.contains(C0059ao.a(4327))) {
                return 2;
            }
            if (upperCase.contains(C0059ao.a(4328))) {
                return 5;
            }
            return (upperCase.contains(C0059ao.a(4329)) || upperCase.contains(C0059ao.a(4330)) || upperCase.contains(C0059ao.a(4331))) ? 4 : 1;
        }

        public boolean d() {
            return this.e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Build.VERSION.SDK_INT >= 20) {
                    if (this.e != aVar.e) {
                        return false;
                    }
                } else if (d() != aVar.d()) {
                    return false;
                }
                if (this.a.equals(aVar.a) && this.d == aVar.d) {
                    if (this.g != 1 || aVar.g != 2 || (str3 = this.f) == null || b(str3, aVar.f)) {
                        if (this.g != 2 || aVar.g != 1 || (str2 = aVar.f) == null || b(str2, this.f)) {
                            int i = this.g;
                            return (i == 0 || i != aVar.g || ((str = this.f) == null ? aVar.f == null : b(str, aVar.f))) && this.c == aVar.c;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public String toString() {
            return C0059ao.a(4332) + this.a + '\'' + C0059ao.a(4333) + this.b + '\'' + C0059ao.a(4334) + this.c + '\'' + C0059ao.a(4335) + this.d + C0059ao.a(4336) + this.e + C0059ao.a(4337) + this.f + "'}";
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ql$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                    return this.e.equals(bVar.e);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return C0059ao.a(4341) + this.a + '\'' + C0059ao.a(4342) + this.b + '\'' + C0059ao.a(4343) + this.c + '\'' + C0059ao.a(4344) + this.d + C0059ao.a(4345) + this.e + '}';
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ql$c */
    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {
        public final int b;
        public final int c;
        public final String d;
        public final String e;

        public c(int i, int i2, String str, String str2) {
            this.b = i;
            this.c = i2;
            this.d = str;
            this.e = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            int i = this.b - cVar.b;
            return i == 0 ? this.c - cVar.c : i;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ql$d */
    /* loaded from: classes.dex */
    public static final class d {
        public final String a;
        public final boolean b;
        public final List<String> c;
        public final List<String> d;

        public d(String str, boolean z, List<String> list, List<String> list2) {
            this.a = str;
            this.b = z;
            this.c = list;
            this.d = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), rk.ASC.name()) : list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.b == dVar.b && this.c.equals(dVar.c) && this.d.equals(dVar.d)) {
                    String str = this.a;
                    String a = C0059ao.a(4493);
                    if (str.startsWith(a)) {
                        return dVar.a.startsWith(a);
                    }
                    return this.a.equals(dVar.a);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.a.startsWith(C0059ao.a(4494)) ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return C0059ao.a(4495) + this.a + '\'' + C0059ao.a(4496) + this.b + C0059ao.a(4497) + this.c + C0059ao.a(4498) + this.d + '}';
        }
    }

    public ql(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static ql a(bm bmVar, String str) {
        return new ql(str, b(bmVar, str), d(bmVar, str), f(bmVar, str));
    }

    public static Map<String, a> b(bm bmVar, String str) {
        Cursor N = bmVar.N(C0059ao.a(270) + str + C0059ao.a(271));
        HashMap hashMap = new HashMap();
        try {
            if (N.getColumnCount() > 0) {
                int columnIndex = N.getColumnIndex(C0059ao.a(272));
                int columnIndex2 = N.getColumnIndex(C0059ao.a(273));
                int columnIndex3 = N.getColumnIndex(C0059ao.a(274));
                int columnIndex4 = N.getColumnIndex(C0059ao.a(275));
                int columnIndex5 = N.getColumnIndex(C0059ao.a(276));
                while (N.moveToNext()) {
                    String string = N.getString(columnIndex);
                    hashMap.put(string, new a(string, N.getString(columnIndex2), N.getInt(columnIndex3) != 0, N.getInt(columnIndex4), N.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            N.close();
        }
    }

    public static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(C0059ao.a(277));
        int columnIndex2 = cursor.getColumnIndex(C0059ao.a(278));
        int columnIndex3 = cursor.getColumnIndex(C0059ao.a(279));
        int columnIndex4 = cursor.getColumnIndex(C0059ao.a(280));
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Set<b> d(bm bmVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor N = bmVar.N(C0059ao.a(281) + str + C0059ao.a(282));
        try {
            int columnIndex = N.getColumnIndex(C0059ao.a(283));
            int columnIndex2 = N.getColumnIndex(C0059ao.a(284));
            int columnIndex3 = N.getColumnIndex(C0059ao.a(285));
            int columnIndex4 = N.getColumnIndex(C0059ao.a(286));
            int columnIndex5 = N.getColumnIndex(C0059ao.a(287));
            List<c> c2 = c(N);
            int count = N.getCount();
            for (int i = 0; i < count; i++) {
                N.moveToPosition(i);
                if (N.getInt(columnIndex2) == 0) {
                    int i2 = N.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c2) {
                        if (cVar.b == i2) {
                            arrayList.add(cVar.d);
                            arrayList2.add(cVar.e);
                        }
                    }
                    hashSet.add(new b(N.getString(columnIndex3), N.getString(columnIndex4), N.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            N.close();
        }
    }

    public static d e(bm bmVar, String str, boolean z) {
        Cursor N = bmVar.N(C0059ao.a(288) + str + C0059ao.a(289));
        try {
            int columnIndex = N.getColumnIndex(C0059ao.a(290));
            int columnIndex2 = N.getColumnIndex(C0059ao.a(291));
            int columnIndex3 = N.getColumnIndex(C0059ao.a(292));
            int columnIndex4 = N.getColumnIndex(C0059ao.a(293));
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (N.moveToNext()) {
                    if (N.getInt(columnIndex2) >= 0) {
                        int i = N.getInt(columnIndex);
                        String string = N.getString(columnIndex3);
                        String a2 = N.getInt(columnIndex4) > 0 ? C0059ao.a(294) : C0059ao.a(295);
                        treeMap.put(Integer.valueOf(i), string);
                        treeMap2.put(Integer.valueOf(i), a2);
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                ArrayList arrayList2 = new ArrayList(treeMap2.size());
                arrayList2.addAll(treeMap2.values());
                return new d(str, z, arrayList, arrayList2);
            }
            return null;
        } finally {
            N.close();
        }
    }

    public static Set<d> f(bm bmVar, String str) {
        Cursor N = bmVar.N(C0059ao.a(296) + str + C0059ao.a(297));
        try {
            int columnIndex = N.getColumnIndex(C0059ao.a(298));
            int columnIndex2 = N.getColumnIndex(C0059ao.a(299));
            int columnIndex3 = N.getColumnIndex(C0059ao.a(300));
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (N.moveToNext()) {
                    if (C0059ao.a(301).equals(N.getString(columnIndex2))) {
                        String string = N.getString(columnIndex);
                        boolean z = true;
                        if (N.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        d e = e(bmVar, string, z);
                        if (e == null) {
                            return null;
                        }
                        hashSet.add(e);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            N.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ql) {
            ql qlVar = (ql) obj;
            String str = this.a;
            if (str == null ? qlVar.a == null : str.equals(qlVar.a)) {
                Map<String, a> map = this.b;
                if (map == null ? qlVar.b == null : map.equals(qlVar.b)) {
                    Set<b> set2 = this.c;
                    if (set2 == null ? qlVar.c == null : set2.equals(qlVar.c)) {
                        Set<d> set3 = this.d;
                        if (set3 == null || (set = qlVar.d) == null) {
                            return true;
                        }
                        return set3.equals(set);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return C0059ao.a(302) + this.a + '\'' + C0059ao.a(303) + this.b + C0059ao.a(304) + this.c + C0059ao.a(305) + this.d + '}';
    }
}
