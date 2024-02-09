package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bo0 */
/* loaded from: classes.dex */
public class bo0 extends ao0 {
    public static final boolean h(String str, String str2, boolean z) {
        yl0.e(str, C0059ao.a(10794));
        yl0.e(str2, C0059ao.a(10795));
        if (!z) {
            return str.endsWith(str2);
        }
        return m(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean i(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return h(str, str2, z);
    }

    public static final boolean j(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static final Comparator<String> k(mm0 mm0Var) {
        yl0.e(mm0Var, C0059ao.a(10796));
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        yl0.d(comparator, C0059ao.a(10797));
        return comparator;
    }

    public static final boolean l(CharSequence charSequence) {
        boolean z;
        yl0.e(charSequence, C0059ao.a(10798));
        if (charSequence.length() != 0) {
            rm0 F = co0.F(charSequence);
            if (!(F instanceof Collection) || !((Collection) F).isEmpty()) {
                Iterator<Integer> it = F.iterator();
                while (it.hasNext()) {
                    if (!on0.c(charSequence.charAt(((nj0) it).a()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m(String str, int i, String str2, int i2, int i3, boolean z) {
        yl0.e(str, C0059ao.a(10799));
        yl0.e(str2, C0059ao.a(10800));
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static /* synthetic */ boolean n(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return m(str, i, str2, i2, i3, z);
    }

    public static final String o(CharSequence charSequence, int i) {
        yl0.e(charSequence, C0059ao.a(10801));
        int i2 = 1;
        if (!(i >= 0)) {
            throw new IllegalArgumentException((C0059ao.a(10804) + i + '.').toString());
        }
        String a = C0059ao.a(10802);
        if (i != 0) {
            if (i != 1) {
                int length = charSequence.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb = new StringBuilder(charSequence.length() * i);
                        if (1 <= i) {
                            while (true) {
                                int i3 = i2 + 1;
                                sb.append(charSequence);
                                if (i2 == i) {
                                    break;
                                }
                                i2 = i3;
                            }
                        }
                        String sb2 = sb.toString();
                        yl0.d(sb2, C0059ao.a(10803));
                        return sb2;
                    }
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i];
                    for (int i4 = 0; i4 < i; i4++) {
                        cArr[i4] = charAt;
                    }
                    return new String(cArr);
                }
                return a;
            }
            return charSequence.toString();
        }
        return a;
    }

    public static final String p(String str, char c, char c2, boolean z) {
        yl0.e(str, C0059ao.a(10805));
        if (!z) {
            String replace = str.replace(c, c2);
            yl0.d(replace, C0059ao.a(10806));
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            i++;
            if (pn0.d(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        yl0.d(sb2, C0059ao.a(10807));
        return sb2;
    }

    public static final String q(String str, String str2, String str3, boolean z) {
        yl0.e(str, C0059ao.a(10808));
        yl0.e(str2, C0059ao.a(10809));
        yl0.e(str3, C0059ao.a(10810));
        int i = 0;
        int I = co0.I(str, str2, 0, z);
        if (I < 0) {
            return str;
        }
        int length = str2.length();
        int b = tm0.b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, I);
                sb.append(str3);
                i = I + length;
                if (I >= str.length()) {
                    break;
                }
                I = co0.I(str, str2, I + b, z);
            } while (I > 0);
            sb.append((CharSequence) str, i, str.length());
            String sb2 = sb.toString();
            yl0.d(sb2, C0059ao.a(10811));
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String r(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return p(str, c, c2, z);
    }

    public static /* synthetic */ String s(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return q(str, str2, str3, z);
    }

    public static final boolean t(String str, String str2, int i, boolean z) {
        yl0.e(str, C0059ao.a(10812));
        yl0.e(str2, C0059ao.a(10813));
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m(str, i, str2, 0, str2.length(), z);
    }

    public static final boolean u(String str, String str2, boolean z) {
        yl0.e(str, C0059ao.a(10814));
        yl0.e(str2, C0059ao.a(10815));
        if (!z) {
            return str.startsWith(str2);
        }
        return m(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean v(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return t(str, str2, i, z);
    }

    public static /* synthetic */ boolean w(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return u(str, str2, z);
    }
}
