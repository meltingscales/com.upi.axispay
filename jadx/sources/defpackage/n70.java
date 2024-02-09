package defpackage;

import android.content.Context;
import com.olive.upi.database.AppDatabase;
import com.olive.upi.transport.service.CryptLibOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import myunmn.C0059ao;
import myunmn.C0095z;

/* compiled from: AxisPay */
/* renamed from: n70  reason: default package */
/* loaded from: classes.dex */
public final class n70 {
    public static final a f;
    public static n70 g;
    public m70 a;
    public String b;
    public CryptLibOne c;
    public AppDatabase d;
    public d70 e;

    /* compiled from: AxisPay */
    /* renamed from: n70$a */
    /* loaded from: classes.dex */
    public static final class a {
        static {
            C0095z.a();
        }

        public a() {
        }

        public /* synthetic */ a(vl0 vl0Var) {
            this();
        }

        public final n70 a() {
            if (n70.g == null) {
                n70.g = new n70();
            }
            n70 n70Var = n70.g;
            char[] cArr = {(char) (cArr[14] ^ 'N'), (char) (cArr[15] ^ 22), (char) (cArr[13] ^ '\t'), (char) (cArr[10] ^ 24), (char) (cArr[28] ^ 'U'), (char) (cArr[23] ^ '\r'), (char) (cArr[52] ^ 0), (char) (cArr[25] ^ 0), (char) (cArr[43] ^ 7), (char) (cArr[28] ^ 26), (char) (cArr[58] ^ 17), (char) (cArr[13] ^ 'E'), (char) (cArr[38] ^ '\r'), (char) (cArr[63] ^ 4), (char) (cArr[16] ^ 'A'), (char) (cArr[40] ^ 'M'), (char) (cArr[36] ^ 'A'), (char) (cArr[47] ^ 6), (char) (cArr[38] ^ 27), (char) (cArr[43] ^ 'I'), (char) (cArr[19] ^ 'T'), (char) (cArr[29] ^ 3), (char) (cArr[50] ^ 14), (char) (cArr[27] ^ 0), (char) (cArr[14] ^ 'O'), (char) (cArr[19] ^ 'N'), (char) (cArr[25] ^ 'C'), (char) (cArr[70] ^ 0), (char) (cArr[19] ^ 'U'), (char) (cArr[19] ^ 'L'), (char) (cArr[16] ^ '\r'), (char) (cArr[19] ^ 0), (char) (cArr[39] ^ 25), (char) (cArr[56] ^ 24), (char) (cArr[41] ^ 31), (char) (cArr[57] ^ 22), (char) (cArr[43] ^ 'I'), (char) (cArr[2] ^ 15), (char) (cArr[49] ^ 6), (char) (cArr[0] ^ 3), (char) (cArr[58] ^ 'K'), (char) (cArr[67] ^ '\n'), (char) (cArr[7] ^ 2), (char) ((-26342) ^ (-26253)), (char) (cArr[65] ^ 23), (char) (cArr[13] ^ 0), (char) (cArr[51] ^ 'J'), (char) (cArr[71] ^ 20), (char) (cArr[57] ^ 3), (char) (cArr[63] ^ '\b'), (char) (cArr[11] ^ 14), (char) (cArr[6] ^ 5), (char) (cArr[14] ^ 'A'), (char) (cArr[48] ^ 4), (char) (cArr[20] ^ 21), (char) (cArr[15] ^ 1), (char) (cArr[36] ^ 'A'), (char) (cArr[58] ^ 22), (char) (cArr[43] ^ '\f'), (char) (cArr[41] ^ 'A'), (char) (cArr[43] ^ '-'), (char) (cArr[52] ^ 0), (char) (cArr[40] ^ 'Z'), (char) (cArr[43] ^ '\b'), (char) (cArr[0] ^ '\f'), (char) (cArr[23] ^ 15), (char) (cArr[21] ^ 28), (char) (cArr[18] ^ 17), (char) (cArr[29] ^ '!'), (char) (cArr[24] ^ 14), (char) (cArr[58] ^ 11), (char) (cArr[33] ^ 24), (char) (cArr[15] ^ 4), (char) (cArr[46] ^ 'K'), (char) (cArr[15] ^ 17)};
            Objects.requireNonNull(n70Var, new String(cArr).intern());
            return n70Var;
        }

        public final n70 b(Context context) {
            char[] cArr = {(char) (cArr[1] ^ 23), (char) (28218 ^ 28238), (char) (cArr[1] ^ '\f')};
            yl0.e(context, new String(cArr).intern());
            if (n70.g == null) {
                n70.g = new n70(context);
            }
            n70 n70Var = n70.g;
            char[] cArr2 = {(char) (cArr2[43] ^ 7), (char) (cArr2[37] ^ 22), (char) (cArr2[67] ^ '\t'), (char) (cArr2[67] ^ '\t'), (char) (cArr2[1] ^ 'U'), (char) (cArr2[4] ^ 'C'), (char) (cArr2[24] ^ 14), (char) (cArr2[11] ^ 'N'), (char) (25248 ^ 25294), (char) (cArr2[2] ^ 3), (char) (cArr2[50] ^ 'Z'), (char) (cArr2[36] ^ 0), (char) (cArr2[52] ^ 3), (char) (cArr2[59] ^ 'K'), (char) (cArr2[29] ^ 'L'), (char) (cArr2[67] ^ 6), (char) (cArr2[4] ^ 'A'), (char) (cArr2[18] ^ 7), (char) (cArr2[1] ^ 1), (char) (cArr2[22] ^ 0), (char) (cArr2[8] ^ 26), (char) (cArr2[34] ^ 31), (char) (cArr2[13] ^ 'E'), (char) (cArr2[1] ^ 27), (char) (cArr2[39] ^ 2), (char) (cArr2[37] ^ '\r'), (char) (cArr2[4] ^ '\r'), (char) (cArr2[40] ^ '@'), (char) (cArr2[37] ^ 22), (char) (cArr2[52] ^ '\r'), (char) (cArr2[71] ^ '\r'), (char) (cArr2[12] ^ 'B'), (char) (cArr2[63] ^ 21), (char) (cArr2[0] ^ 23), (char) (cArr2[69] ^ 17), (char) (cArr2[49] ^ '\f'), (char) (cArr2[37] ^ 'C'), (char) (cArr2[59] ^ 'M'), (char) (cArr2[21] ^ 0), (char) (cArr2[50] ^ 'C'), (char) (cArr2[1] ^ '['), (char) (cArr2[53] ^ 27), (char) (cArr2[59] ^ 'B'), (char) (cArr2[18] ^ 29), (char) (cArr2[52] ^ 23), (char) (cArr2[37] ^ 6), (char) (cArr2[8] ^ '@'), (char) (cArr2[12] ^ 23), (char) (cArr2[18] ^ 4), (char) (cArr2[25] ^ 7), (char) (cArr2[13] ^ 'K'), (char) (cArr2[70] ^ '\n'), (char) (cArr2[49] ^ '\b'), (char) (cArr2[36] ^ 'T'), (char) (cArr2[71] ^ 0), (char) (cArr2[50] ^ 'L'), (char) (cArr2[61] ^ 0), (char) (cArr2[50] ^ ']'), (char) (cArr2[59] ^ 'K'), (char) (cArr2[8] ^ '@'), (char) (cArr2[36] ^ 'd'), (char) (cArr2[63] ^ 0), (char) (cArr2[19] ^ 'T'), (char) (cArr2[37] ^ 2), (char) (cArr2[18] ^ 22), (char) (cArr2[45] ^ 4), (char) (cArr2[64] ^ 17), (char) (cArr2[63] ^ 4), (char) (cArr2[12] ^ '/'), (char) (cArr2[18] ^ 21), (char) (cArr2[61] ^ 15), (char) (cArr2[49] ^ '\b'), (char) (cArr2[47] ^ 18), (char) (cArr2[43] ^ '\f'), (char) (cArr2[7] ^ 28)};
            Objects.requireNonNull(n70Var, new String(cArr2).intern());
            return n70Var;
        }
    }

    static {
        C0095z.a();
        f = new a(null);
    }

    public n70() {
        this.b = new String(new char[0]).intern();
        g = this;
    }

    public static final void q(n70 n70Var, Context context) {
        yl0.e(n70Var, C0059ao.a(2825));
        yl0.e(context, C0059ao.a(2826));
        d70 e = d70.e(context);
        yl0.d(e, C0059ao.a(2827));
        n70Var.u(e);
        Map<String, ?> b = n70Var.l().b();
        try {
            yl0.d(b, C0059ao.a(2828));
            for (Map.Entry<String, ?> entry : b.entrySet()) {
                String valueOf = String.valueOf(entry.getValue());
                k70 F = n70Var.g().F();
                String key = entry.getKey();
                yl0.d(key, C0059ao.a(2829));
                F.b(new j70(key, valueOf, false));
                n70Var.l().g(entry.getKey());
            }
            m70 m70Var = n70Var.a;
            if (m70Var == null) {
                return;
            }
            m70Var.n(1);
        } catch (Exception unused) {
            m70 m70Var2 = n70Var.a;
            if (m70Var2 == null) {
                return;
            }
            m70Var2.n(0);
        }
    }

    public final void A(String str, boolean z) {
        yl0.e(str, C0059ao.a(2830));
        z(str, String.valueOf(z), false);
    }

    public final void B(ArrayList<o70> arrayList) {
        yl0.e(arrayList, C0059ao.a(2831));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            o70 o70Var = arrayList.get(i);
            yl0.d(o70Var, C0059ao.a(2832));
            o70 o70Var2 = o70Var;
            String c = o70Var2.c();
            String a2 = o70Var2.a();
            if (a2 == null) {
                a2 = null;
            }
            g().G().a(new o70(c, a2, o70Var2.b()));
            i = i2;
        }
    }

    public final void C(m70 m70Var) {
        yl0.e(m70Var, C0059ao.a(2833));
        this.a = m70Var;
    }

    public final void c(String str) {
        yl0.e(str, C0059ao.a(2834));
        g().F().a(str);
    }

    public final void d() {
        g().G().c();
    }

    public final boolean e(String str) {
        yl0.e(str, C0059ao.a(2835));
        String m = m(str);
        if (m.length() == 0) {
            return false;
        }
        return Boolean.parseBoolean(m);
    }

    public final CryptLibOne f() {
        CryptLibOne cryptLibOne = this.c;
        if (cryptLibOne != null) {
            return cryptLibOne;
        }
        char[] cArr = {(char) (cArr[4] ^ 23), (char) (cArr[4] ^ 6), (char) (cArr[4] ^ '\r'), (char) (cArr[0] ^ 19), (char) ((-28265) ^ (-28189)), (char) (cArr[4] ^ 27)};
        yl0.t(new String(cArr).intern());
        throw null;
    }

    public final AppDatabase g() {
        AppDatabase appDatabase = this.d;
        if (appDatabase != null) {
            return appDatabase;
        }
        char[] cArr = {(char) (cArr[15] ^ 1), (char) (cArr[6] ^ 18), (char) (cArr[3] ^ 21), (char) (cArr[11] ^ 21), (char) (cArr[13] ^ '\f'), (char) (cArr[6] ^ 18), (char) (cArr[11] ^ 7), (char) (cArr[3] ^ 4), (char) (cArr[10] ^ ':'), (char) (cArr[2] ^ 26), (char) (cArr[11] ^ 7), (char) (17684 ^ 17760), (char) (cArr[4] ^ 3), (char) (cArr[2] ^ 26), (char) (cArr[11] ^ 23), (char) (cArr[4] ^ 7)};
        yl0.t(new String(cArr).intern());
        throw null;
    }

    public final String h(String str) {
        if (this.b.length() == 0) {
            return str;
        }
        if (f() == null) {
            s(new CryptLibOne());
        }
        byte[] decrypt = f().decrypt(f().hexStringToByteArray(str), f().hexStringToByteArray(this.b));
        char[] cArr = {(char) (cArr[46] ^ 6), (char) (cArr[44] ^ 26), (char) (cArr[26] ^ 16), (char) (cArr[41] ^ 17), (char) (cArr[44] ^ 28), (char) (cArr[0] ^ '\f'), (char) (cArr[12] ^ '^'), (char) (cArr[10] ^ 22), (char) (cArr[3] ^ 21), (char) (cArr[37] ^ 17), (char) (cArr[13] ^ 6), (char) (cArr[46] ^ 28), (char) (cArr[38] ^ 17), (char) (cArr[28] ^ 19), (char) (cArr[35] ^ 'i'), (char) (cArr[13] ^ 23), (char) (cArr[25] ^ 0), (char) (cArr[19] ^ '\r'), (char) (cArr[2] ^ '\t'), (char) (cArr[10] ^ 6), (char) (cArr[25] ^ 29), (char) (cArr[11] ^ 'W'), (char) (cArr[1] ^ 26), (char) (cArr[28] ^ 2), (char) (cArr[29] ^ 8306), (char) (cArr[12] ^ 2), (char) (cArr[25] ^ 27), (char) (cArr[19] ^ 26), (char) (cArr[25] ^ 21), (char) (cArr[23] ^ '1'), (char) (cArr[37] ^ 29), (char) (cArr[32] ^ ';'), (char) (cArr[25] ^ 11), (char) (cArr[6] ^ 'Z'), (char) (cArr[48] ^ 'L'), (char) (cArr[31] ^ 3), (char) (cArr[35] ^ '3'), (char) (cArr[40] ^ 'Z'), (char) ((-25297) ^ (-25266)), (char) (cArr[25] ^ 11), (char) (cArr[46] ^ 'M'), (char) (cArr[38] ^ 0), (char) (cArr[29] ^ '!'), (char) (cArr[2] ^ '\r'), (char) (cArr[39] ^ 17), (char) (cArr[30] ^ '$'), (char) (cArr[12] ^ 21), (char) (cArr[17] ^ 0), (char) (cArr[13] ^ ']'), (char) (cArr[15] ^ 'J')};
        yl0.d(decrypt, new String(cArr).intern());
        return new String(decrypt, qn0.b);
    }

    public final String i(String str) {
        if (this.b.length() == 0) {
            return str;
        }
        if (f() == null) {
            s(new CryptLibOne());
        }
        CryptLibOne f2 = f();
        byte[] bytes = str.getBytes(qn0.b);
        yl0.d(bytes, C0059ao.a(2836));
        String bytesToHex = CryptLibOne.bytesToHex(f2.encrypt(bytes, f().hexStringToByteArray(this.b)));
        yl0.d(bytesToHex, C0059ao.a(2837));
        return bytesToHex;
    }

    public final int j(String str) {
        yl0.e(str, C0059ao.a(2838));
        String m = m(str);
        if (m.length() == 0) {
            return 0;
        }
        return Integer.parseInt(m);
    }

    public final long k(String str) {
        yl0.e(str, C0059ao.a(2839));
        String m = m(str);
        if (m.length() == 0) {
            return 0L;
        }
        return Long.parseLong(m);
    }

    public final d70 l() {
        d70 d70Var = this.e;
        if (d70Var != null) {
            return d70Var;
        }
        yl0.t(C0059ao.a(2840));
        throw null;
    }

    public final String m(String str) {
        char[] cArr = {(char) (9588 ^ 9503), (char) (cArr[0] ^ 14), (char) (cArr[1] ^ 28)};
        yl0.e(str, new String(cArr).intern());
        j70 d = g().F().d(str);
        if (g().F().c(str) > 0) {
            if (d.c()) {
                return h(d.b());
            }
            return d.b();
        }
        return new String(new char[0]).intern();
    }

    public final ArrayList<o70> o() {
        ArrayList<o70> arrayList = new ArrayList<>();
        List<o70> b = g().G().b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            o70 o70Var = b.get(i);
            String c = o70Var.c();
            String a2 = o70Var.a();
            if (a2 == null) {
                a2 = null;
            }
            arrayList.add(new o70(c, a2, o70Var.b()));
            i = i2;
        }
        return arrayList;
    }

    public final void p(final Context context) {
        yl0.e(context, C0059ao.a(2841));
        new Thread(new Runnable() { // from class: i70
            @Override // java.lang.Runnable
            public final void run() {
                n70.q(n70.this, context);
            }
        }).start();
    }

    public final void r(String str) {
        yl0.e(str, C0059ao.a(2842));
        this.b = str;
    }

    public final void s(CryptLibOne cryptLibOne) {
        char[] cArr = {(char) (cArr[3] ^ 'H'), (char) (cArr[5] ^ 'L'), (char) (cArr[5] ^ 'Z'), (char) ((-21474) ^ (-21398)), (char) (cArr[0] ^ 17), (char) (cArr[4] ^ 18), (char) (cArr[3] ^ 'J')};
        yl0.e(cryptLibOne, new String(cArr).intern());
        this.c = cryptLibOne;
    }

    public final void t(AppDatabase appDatabase) {
        char[] cArr = {(char) (cArr[6] ^ 2), (char) (cArr[3] ^ 7), (char) (cArr[1] ^ 22), (char) (cArr[6] ^ 'J'), (char) (cArr[2] ^ 'H'), (char) (cArr[3] ^ 'K'), (char) ((-23486) ^ (-23428))};
        yl0.e(appDatabase, new String(cArr).intern());
        this.d = appDatabase;
    }

    public final void u(d70 d70Var) {
        yl0.e(d70Var, C0059ao.a(2843));
        this.e = d70Var;
    }

    public final void v(String str, int i) {
        yl0.e(str, C0059ao.a(2844));
        w(str, i, false);
    }

    public final void w(String str, int i, boolean z) {
        yl0.e(str, C0059ao.a(2845));
        z(str, String.valueOf(i), z);
    }

    public final void x(String str, long j) {
        yl0.e(str, C0059ao.a(2846));
        z(str, String.valueOf(j), false);
    }

    public final void y(String str, String str2) {
        yl0.e(str, C0059ao.a(2847));
        yl0.e(str2, C0059ao.a(2848));
        z(str, str2, false);
    }

    public final void z(String str, String str2, boolean z) {
        j70 j70Var;
        yl0.e(str, C0059ao.a(2849));
        yl0.e(str2, C0059ao.a(2850));
        if (z) {
            j70Var = new j70(str, i(str2), z);
        } else {
            j70Var = new j70(str, str2, z);
        }
        g().F().b(j70Var);
    }

    public n70(Context context) {
        char[] cArr = {(char) (cArr[2] ^ 27), (char) ((-13267) ^ (-13223)), (char) (cArr[1] ^ '\f')};
        yl0.e(context, new String(cArr).intern());
        this.b = new String(new char[0]).intern();
        if (context instanceof m70) {
            this.a = (m70) context;
        }
        g = this;
        t(AppDatabase.l.b(context));
    }
}
