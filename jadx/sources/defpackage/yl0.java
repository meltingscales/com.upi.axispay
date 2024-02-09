package defpackage;

import java.util.Arrays;
import myunmn.C0059ao;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: yl0  reason: default package */
/* loaded from: classes.dex */
public class yl0 {
    static {
        C0095z.a();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str + C0059ao.a(4515));
        j(illegalStateException);
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        m();
        throw null;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        char[] cArr = {(char) (cArr[14] ^ 'U'), (char) (cArr[5] ^ 'M'), (char) (cArr[10] ^ 23), (char) (cArr[8] ^ 7), (char) (cArr[14] ^ 1), (char) (cArr[8] ^ 'T'), (char) (cArr[12] ^ 'N'), (char) (cArr[2] ^ 26), (char) (cArr[0] ^ 'T'), (char) (cArr[10] ^ 'B'), (char) (cArr[14] ^ 23), (char) (cArr[9] ^ 'E'), (char) (cArr[8] ^ 'T'), (char) (cArr[15] ^ 2), (char) ((-13710) ^ (-13817)), (char) (cArr[8] ^ 24), (char) (cArr[12] ^ 'L')};
        sb.append(new String(cArr).intern());
        NullPointerException nullPointerException = new NullPointerException(sb.toString());
        j(nullPointerException);
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        p(str);
        throw null;
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        o(str);
        throw null;
    }

    public static int g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static String h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {(char) (cArr[32] ^ '9'), (char) (cArr[41] ^ '\f'), (char) (cArr[24] ^ 29), (char) (cArr[15] ^ 7), (char) (cArr[47] ^ 'M'), (char) (cArr[43] ^ 17), (char) (cArr[31] ^ 'T'), (char) (cArr[19] ^ 'E'), (char) (cArr[46] ^ 22), (char) (cArr[7] ^ 'E'), (char) (cArr[29] ^ 31), (char) (cArr[21] ^ 3), (char) (cArr[47] ^ 'E'), (char) (cArr[3] ^ 2), (char) (cArr[26] ^ 'D'), (char) (cArr[12] ^ 3), (char) (cArr[21] ^ 26), (char) (cArr[33] ^ 22), (char) (cArr[24] ^ 11), (char) (cArr[41] ^ 'M'), (char) (cArr[17] ^ 4), (char) (cArr[26] ^ '^'), (char) (cArr[31] ^ 0), (char) (cArr[31] ^ 'N'), (char) (cArr[21] ^ 28), (char) (cArr[39] ^ 'T'), (char) (cArr[33] ^ '^'), (char) (cArr[25] ^ 0), (char) (cArr[11] ^ 5), (char) (cArr[17] ^ '\t'), (char) (cArr[19] ^ 'L'), (char) (cArr[24] ^ 'O'), (char) (cArr[1] ^ '\b'), (char) ((-21100) ^ (-21017)), (char) (cArr[10] ^ 'S'), (char) (cArr[31] ^ 'N'), (char) (cArr[12] ^ 16), (char) (cArr[33] ^ 31), (char) (cArr[45] ^ 3), (char) (cArr[45] ^ 'U'), (char) (cArr[25] ^ 'N'), (char) (cArr[33] ^ 30), (char) (cArr[30] ^ '\t'), (char) (cArr[12] ^ 17), (char) (cArr[3] ^ '\t'), (char) (cArr[19] ^ 'O'), (char) (cArr[33] ^ 23), (char) (cArr[41] ^ 'M')};
        sb.append(new String(cArr).intern());
        sb.append(className);
        sb.append(new String(new char[]{(char) ((-21381) ^ (-21419))}).intern());
        sb.append(methodName);
        char[] cArr2 = {(char) (cArr2[3] ^ 'M'), (char) (cArr2[10] ^ 'R'), (char) (cArr2[5] ^ 17), (char) (cArr2[5] ^ 0), (char) (cArr2[6] ^ 31), (char) (cArr2[6] ^ '\f'), (char) (cArr2[7] ^ '\b'), (char) ((-5383) ^ (-5476)), (char) (cArr2[1] ^ 'T'), (char) (cArr2[2] ^ 21), (char) (cArr2[6] ^ 31), (char) (cArr2[8] ^ 'T')};
        sb.append(new String(cArr2).intern());
        sb.append(str);
        return sb.toString();
    }

    public static void i(int i, String str) {
        q();
        throw null;
    }

    public static <T extends Throwable> T j(T t) {
        k(t, yl0.class.getName());
        return t;
    }

    public static <T extends Throwable> T k(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static String l(String str, Object obj) {
        return str + obj;
    }

    public static void m() {
        NullPointerException nullPointerException = new NullPointerException();
        j(nullPointerException);
        throw nullPointerException;
    }

    public static void n() {
        zh0 zh0Var = new zh0();
        j(zh0Var);
        throw zh0Var;
    }

    public static void o(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(h(str));
        j(illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void p(String str) {
        NullPointerException nullPointerException = new NullPointerException(h(str));
        j(nullPointerException);
        throw nullPointerException;
    }

    public static void q() {
        r(C0059ao.a(4516));
        throw null;
    }

    public static void r(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void s(String str) {
        oi0 oi0Var = new oi0(str);
        j(oi0Var);
        throw oi0Var;
    }

    public static void t(String str) {
        StringBuilder sb = new StringBuilder();
        char[] cArr = {(char) (cArr[15] ^ 24), (char) (cArr[7] ^ 21), (char) (cArr[0] ^ 24), (char) (cArr[0] ^ '\t'), (char) (cArr[14] ^ 27), (char) (cArr[3] ^ 11), (char) (cArr[2] ^ 29), (char) (cArr[3] ^ 17), (char) (cArr[15] ^ 'T'), (char) (cArr[11] ^ 31), (char) (cArr[16] ^ 11), (char) (cArr[13] ^ '\n'), (char) (cArr[15] ^ 4), (char) (cArr[7] ^ 17), (char) (cArr[8] ^ 'R'), (char) ((-32690) ^ (-32710)), (char) (cArr[0] ^ 21), (char) (cArr[13] ^ 'E')};
        sb.append(new String(cArr).intern());
        sb.append(str);
        char[] cArr2 = {(char) (cArr2[5] ^ 'N'), (char) (cArr2[0] ^ 'H'), (char) (cArr2[10] ^ 4), (char) (cArr2[6] ^ 28), (char) (cArr2[3] ^ 'S'), (char) (1536 ^ 1646), (char) (cArr2[5] ^ 1), (char) (cArr2[24] ^ 16), (char) (cArr2[10] ^ 'E'), (char) (cArr2[3] ^ 17), (char) (cArr2[24] ^ 1), (char) (cArr2[20] ^ '\t'), (char) (cArr2[6] ^ 1), (char) (cArr2[12] ^ 'N'), (char) (cArr2[4] ^ 'I'), (char) (cArr2[23] ^ 11), (char) (cArr2[23] ^ '\f'), (char) (cArr2[20] ^ 24), (char) (cArr2[16] ^ 0), (char) (cArr2[8] ^ 'A'), (char) (cArr2[3] ^ 31), (char) (cArr2[20] ^ 5), (char) (cArr2[21] ^ 19), (char) (cArr2[5] ^ 11), (char) (cArr2[3] ^ 23)};
        sb.append(new String(cArr2).intern());
        s(sb.toString());
        throw null;
    }
}
