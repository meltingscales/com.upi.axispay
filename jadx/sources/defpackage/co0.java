package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: co0 */
/* loaded from: classes.dex */
public class co0 extends bo0 {

    /* compiled from: AxisPay */
    /* renamed from: co0$a */
    /* loaded from: classes.dex */
    public static final class a extends zl0 implements hl0<CharSequence, Integer, gi0<? extends Integer, ? extends Integer>> {
        public final /* synthetic */ char[] b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(char[] cArr, boolean z) {
            super(2);
            this.b = cArr;
            this.c = z;
        }

        @Override // defpackage.hl0
        public /* bridge */ /* synthetic */ gi0<? extends Integer, ? extends Integer> a(CharSequence charSequence, Integer num) {
            return b(charSequence, num.intValue());
        }

        public final gi0<Integer, Integer> b(CharSequence charSequence, int i) {
            yl0.e(charSequence, C0059ao.a(4265));
            int N = co0.N(charSequence, this.b, i, this.c);
            if (N < 0) {
                return null;
            }
            return li0.a(Integer.valueOf(N), 1);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: co0$b */
    /* loaded from: classes.dex */
    public static final class b extends zl0 implements hl0<CharSequence, Integer, gi0<? extends Integer, ? extends Integer>> {
        public final /* synthetic */ List<String> b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> list, boolean z) {
            super(2);
            this.b = list;
            this.c = z;
        }

        @Override // defpackage.hl0
        public /* bridge */ /* synthetic */ gi0<? extends Integer, ? extends Integer> a(CharSequence charSequence, Integer num) {
            return b(charSequence, num.intValue());
        }

        public final gi0<Integer, Integer> b(CharSequence charSequence, int i) {
            yl0.e(charSequence, C0059ao.a(4240));
            gi0 E = co0.E(charSequence, this.b, i, this.c, false);
            if (E == null) {
                return null;
            }
            return li0.a(E.c(), Integer.valueOf(((String) E.d()).length()));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: co0$c */
    /* loaded from: classes.dex */
    public static final class c extends zl0 implements dl0<rm0, String> {
        public final /* synthetic */ CharSequence b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence) {
            super(1);
            this.b = charSequence;
        }

        @Override // defpackage.dl0
        /* renamed from: b */
        public final String invoke(rm0 rm0Var) {
            yl0.e(rm0Var, C0059ao.a(4211));
            return co0.m0(this.b, rm0Var);
        }
    }

    public static /* synthetic */ boolean A(CharSequence charSequence, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return y(charSequence, c2, z);
    }

    public static /* synthetic */ boolean B(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return z(charSequence, charSequence2, z);
    }

    public static final boolean C(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        yl0.e(charSequence, C0059ao.a(9631));
        yl0.e(charSequence2, C0059ao.a(9632));
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return bo0.i((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return Z(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean D(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C(charSequence, charSequence2, z);
    }

    public static final gi0<Integer, String> E(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        if (!z && collection.size() == 1) {
            String str = (String) ij0.E(collection);
            int M = !z2 ? M(charSequence, str, i, false, 4, null) : R(charSequence, str, i, false, 4, null);
            if (M < 0) {
                return null;
            }
            return li0.a(Integer.valueOf(M), str);
        }
        pm0 rm0Var = !z2 ? new rm0(tm0.b(i, 0), charSequence.length()) : tm0.f(tm0.c(i, G(charSequence)), 0);
        if (charSequence instanceof String) {
            int a2 = rm0Var.a();
            int b2 = rm0Var.b();
            int c2 = rm0Var.c();
            if ((c2 > 0 && a2 <= b2) || (c2 < 0 && b2 <= a2)) {
                while (true) {
                    int i2 = a2 + c2;
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (bo0.m(str2, 0, (String) charSequence, a2, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        return li0.a(Integer.valueOf(a2), str3);
                    }
                    if (a2 == b2) {
                        break;
                    }
                    a2 = i2;
                }
            }
        } else {
            int a3 = rm0Var.a();
            int b3 = rm0Var.b();
            int c3 = rm0Var.c();
            if ((c3 > 0 && a3 <= b3) || (c3 < 0 && b3 <= a3)) {
                while (true) {
                    int i3 = a3 + c3;
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (Z(str4, 0, charSequence, a3, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return li0.a(Integer.valueOf(a3), str5);
                    }
                    if (a3 == b3) {
                        break;
                    }
                    a3 = i3;
                }
            }
        }
        return null;
    }

    public static final rm0 F(CharSequence charSequence) {
        yl0.e(charSequence, C0059ao.a(9633));
        return new rm0(0, charSequence.length() - 1);
    }

    public static final int G(CharSequence charSequence) {
        yl0.e(charSequence, C0059ao.a(9634));
        return charSequence.length() - 1;
    }

    public static final int H(CharSequence charSequence, char c2, int i, boolean z) {
        yl0.e(charSequence, C0059ao.a(9635));
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c2, i);
        }
        return N(charSequence, new char[]{c2}, i, z);
    }

    public static final int I(CharSequence charSequence, String str, int i, boolean z) {
        yl0.e(charSequence, C0059ao.a(9636));
        yl0.e(str, C0059ao.a(9637));
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return K(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    public static final int J(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        pm0 f;
        if (!z2) {
            f = new rm0(tm0.b(i, 0), tm0.c(i2, charSequence.length()));
        } else {
            f = tm0.f(tm0.c(i, G(charSequence)), tm0.b(i2, 0));
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int a2 = f.a();
            int b2 = f.b();
            int c2 = f.c();
            if ((c2 <= 0 || a2 > b2) && (c2 >= 0 || b2 > a2)) {
                return -1;
            }
            while (true) {
                int i3 = a2 + c2;
                if (bo0.m((String) charSequence2, 0, (String) charSequence, a2, charSequence2.length(), z)) {
                    return a2;
                }
                if (a2 == b2) {
                    return -1;
                }
                a2 = i3;
            }
        } else {
            int a3 = f.a();
            int b3 = f.b();
            int c3 = f.c();
            if ((c3 <= 0 || a3 > b3) && (c3 >= 0 || b3 > a3)) {
                return -1;
            }
            while (true) {
                int i4 = a3 + c3;
                if (Z(charSequence2, 0, charSequence, a3, charSequence2.length(), z)) {
                    return a3;
                }
                if (a3 == b3) {
                    return -1;
                }
                a3 = i4;
            }
        }
    }

    public static /* synthetic */ int K(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return J(charSequence, charSequence2, i, i2, z, z2);
    }

    public static /* synthetic */ int L(CharSequence charSequence, char c2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return H(charSequence, c2, i, z);
    }

    public static /* synthetic */ int M(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return I(charSequence, str, i, z);
    }

    public static final int N(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        yl0.e(charSequence, C0059ao.a(9638));
        yl0.e(cArr, C0059ao.a(9639));
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(xi0.q(cArr), i);
        }
        int b2 = tm0.b(i, 0);
        int G = G(charSequence);
        if (b2 > G) {
            return -1;
        }
        while (true) {
            int i2 = b2 + 1;
            char charAt = charSequence.charAt(b2);
            int length = cArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z2 = false;
                    break;
                }
                char c2 = cArr[i3];
                i3++;
                if (pn0.d(c2, charAt, z)) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                return b2;
            }
            if (b2 == G) {
                return -1;
            }
            b2 = i2;
        }
    }

    public static final int O(CharSequence charSequence, char c2, int i, boolean z) {
        yl0.e(charSequence, C0059ao.a(9640));
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i);
        }
        return S(charSequence, new char[]{c2}, i, z);
    }

    public static final int P(CharSequence charSequence, String str, int i, boolean z) {
        yl0.e(charSequence, C0059ao.a(9641));
        yl0.e(str, C0059ao.a(9642));
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return J(charSequence, str, i, 0, z, true);
    }

    public static /* synthetic */ int Q(CharSequence charSequence, char c2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = G(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return O(charSequence, c2, i, z);
    }

    public static /* synthetic */ int R(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = G(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return P(charSequence, str, i, z);
    }

    public static final int S(CharSequence charSequence, char[] cArr, int i, boolean z) {
        yl0.e(charSequence, C0059ao.a(9643));
        yl0.e(cArr, C0059ao.a(9644));
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(xi0.q(cArr), i);
        }
        int c2 = tm0.c(i, G(charSequence));
        if (c2 < 0) {
            return -1;
        }
        while (true) {
            int i2 = c2 - 1;
            char charAt = charSequence.charAt(c2);
            int length = cArr.length;
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                char c3 = cArr[i3];
                i3++;
                if (pn0.d(c3, charAt, z)) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                return c2;
            }
            if (i2 < 0) {
                return -1;
            }
            c2 = i2;
        }
    }

    public static final hn0<String> T(CharSequence charSequence) {
        yl0.e(charSequence, C0059ao.a(9645));
        return j0(charSequence, new String[]{C0059ao.a(9646), C0059ao.a(9647), C0059ao.a(9648)}, false, 0, 6, null);
    }

    public static final List<String> U(CharSequence charSequence) {
        yl0.e(charSequence, C0059ao.a(9649));
        return mn0.h(T(charSequence));
    }

    public static final hn0<rm0> V(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        e0(i2);
        return new rn0(charSequence, i, i2, new a(cArr, z));
    }

    public static final hn0<rm0> W(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        e0(i2);
        return new rn0(charSequence, i, i2, new b(wi0.b(strArr), z));
    }

    public static /* synthetic */ hn0 X(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return V(charSequence, cArr, i, z, i2);
    }

    public static /* synthetic */ hn0 Y(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return W(charSequence, strArr, i, z, i2);
    }

    public static final boolean Z(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        yl0.e(charSequence, C0059ao.a(9650));
        yl0.e(charSequence2, C0059ao.a(9651));
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 + 1;
            if (!pn0.d(charSequence.charAt(i + i4), charSequence2.charAt(i4 + i2), z)) {
                return false;
            }
            i4 = i5;
        }
        return true;
    }

    public static final String a0(String str, CharSequence charSequence) {
        yl0.e(str, C0059ao.a(9652));
        yl0.e(charSequence, C0059ao.a(9653));
        if (l0(str, charSequence, false, 2, null)) {
            String substring = str.substring(charSequence.length());
            yl0.d(substring, C0059ao.a(9654));
            return substring;
        }
        return str;
    }

    public static final String b0(String str, CharSequence charSequence) {
        yl0.e(str, C0059ao.a(9655));
        yl0.e(charSequence, C0059ao.a(9656));
        if (D(str, charSequence, false, 2, null)) {
            String substring = str.substring(0, str.length() - charSequence.length());
            yl0.d(substring, C0059ao.a(9657));
            return substring;
        }
        return str;
    }

    public static final String c0(String str, CharSequence charSequence) {
        yl0.e(str, C0059ao.a(9658));
        yl0.e(charSequence, C0059ao.a(9659));
        return d0(str, charSequence, charSequence);
    }

    public static final String d0(String str, CharSequence charSequence, CharSequence charSequence2) {
        yl0.e(str, C0059ao.a(9660));
        yl0.e(charSequence, C0059ao.a(9661));
        yl0.e(charSequence2, C0059ao.a(9662));
        if (str.length() >= charSequence.length() + charSequence2.length() && l0(str, charSequence, false, 2, null) && D(str, charSequence2, false, 2, null)) {
            String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
            yl0.d(substring, C0059ao.a(9663));
            return substring;
        }
        return str;
    }

    public static final void e0(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(yl0.l(C0059ao.a(9664), Integer.valueOf(i)).toString());
    }

    public static final List<String> f0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        yl0.e(charSequence, C0059ao.a(9665));
        yl0.e(cArr, C0059ao.a(9666));
        if (cArr.length == 1) {
            return g0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<rm0> a2 = mn0.a(X(charSequence, cArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(bj0.o(a2, 10));
        for (rm0 rm0Var : a2) {
            arrayList.add(m0(charSequence, rm0Var));
        }
        return arrayList;
    }

    public static final List<String> g0(CharSequence charSequence, String str, boolean z, int i) {
        e0(i);
        int i2 = 0;
        int I = I(charSequence, str, 0, z);
        if (I != -1 && i != 1) {
            boolean z2 = i > 0;
            ArrayList arrayList = new ArrayList(z2 ? tm0.c(i, 10) : 10);
            do {
                arrayList.add(charSequence.subSequence(i2, I).toString());
                i2 = str.length() + I;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                I = I(charSequence, str, i2, z);
            } while (I != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        return zi0.b(charSequence.toString());
    }

    public static /* synthetic */ List h0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return f0(charSequence, cArr, z, i);
    }

    public static final hn0<String> i0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        yl0.e(charSequence, C0059ao.a(9667));
        yl0.e(strArr, C0059ao.a(9668));
        return mn0.f(Y(charSequence, strArr, 0, z, i, 2, null), new c(charSequence));
    }

    public static /* synthetic */ hn0 j0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return i0(charSequence, strArr, z, i);
    }

    public static final boolean k0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        yl0.e(charSequence, C0059ao.a(9669));
        yl0.e(charSequence2, C0059ao.a(9670));
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return bo0.w((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return Z(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean l0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return k0(charSequence, charSequence2, z);
    }

    public static final String m0(CharSequence charSequence, rm0 rm0Var) {
        yl0.e(charSequence, C0059ao.a(9671));
        yl0.e(rm0Var, C0059ao.a(9672));
        return charSequence.subSequence(rm0Var.g().intValue(), rm0Var.f().intValue() + 1).toString();
    }

    public static final String n0(String str, char c2, String str2) {
        yl0.e(str, C0059ao.a(9673));
        yl0.e(str2, C0059ao.a(9674));
        int Q = Q(str, c2, 0, false, 6, null);
        if (Q == -1) {
            return str2;
        }
        String substring = str.substring(Q + 1, str.length());
        yl0.d(substring, C0059ao.a(9675));
        return substring;
    }

    public static /* synthetic */ String o0(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return n0(str, c2, str2);
    }

    public static final CharSequence p0(CharSequence charSequence) {
        yl0.e(charSequence, C0059ao.a(9676));
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c2 = on0.c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!c2) {
                    break;
                }
                length--;
            } else if (c2) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final boolean y(CharSequence charSequence, char c2, boolean z) {
        yl0.e(charSequence, C0059ao.a(9677));
        return L(charSequence, c2, 0, z, 2, null) >= 0;
    }

    public static final boolean z(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        yl0.e(charSequence, C0059ao.a(9678));
        yl0.e(charSequence2, C0059ao.a(9679));
        if (charSequence2 instanceof String) {
            if (M(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (K(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }
}
