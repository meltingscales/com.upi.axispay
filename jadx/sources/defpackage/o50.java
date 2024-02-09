package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: o50  reason: default package */
/* loaded from: classes.dex */
public final class o50 {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* compiled from: AxisPay */
    /* renamed from: o50$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k50.values().length];
            a = iArr;
            try {
                iArr[k50.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k50.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[k50.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[k50.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(String str, m30 m30Var, String str2) throws d30 {
        try {
            for (byte b : str.getBytes(str2)) {
                m30Var.c(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new d30(e);
        }
    }

    public static void b(CharSequence charSequence, m30 m30Var) throws d30 {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int p = p(charSequence.charAt(i));
            if (p == -1) {
                throw new d30();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int p2 = p(charSequence.charAt(i2));
                if (p2 != -1) {
                    m30Var.c((p * 45) + p2, 11);
                    i += 2;
                } else {
                    throw new d30();
                }
            } else {
                m30Var.c(p, 6);
                i = i2;
            }
        }
    }

    public static void c(String str, k50 k50Var, m30 m30Var, String str2) throws d30 {
        int i = a.a[k50Var.ordinal()];
        if (i == 1) {
            h(str, m30Var);
        } else if (i == 2) {
            b(str, m30Var);
        } else if (i == 3) {
            a(str, m30Var, str2);
        } else if (i == 4) {
            e(str, m30Var);
        } else {
            throw new d30(C0059ao.a(14305).concat(String.valueOf(k50Var)));
        }
    }

    public static void d(o30 o30Var, m30 m30Var) {
        m30Var.c(k50.ECI.a(), 4);
        m30Var.c(o30Var.b(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[LOOP:0: B:6:0x0014->B:19:0x0041, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r7, defpackage.m30 r8) throws defpackage.d30 {
        /*
            r0 = 14306(0x37e2, float:2.0047E-41)
            java.lang.String r1 = myunmn.C0059ao.a(r0)     // Catch: java.io.UnsupportedEncodingException -> L6b
            byte[] r7 = r7.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L6b
            int r1 = r7.length
            int r1 = r1 % 2
            if (r1 != 0) goto L5e
            int r1 = r7.length
            int r1 = r1 + (-1)
            r2 = 0
        L14:
            if (r2 >= r1) goto L5d
            r3 = r7[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r2 + 1
            r4 = r7[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r3 = r3 | r4
            r4 = 33088(0x8140, float:4.6366E-41)
            r5 = -1
            if (r3 < r4) goto L30
            r6 = 40956(0x9ffc, float:5.7392E-41)
            if (r3 > r6) goto L30
        L2e:
            int r3 = r3 - r4
            goto L3f
        L30:
            r4 = 57408(0xe040, float:8.0446E-41)
            if (r3 < r4) goto L3e
            r4 = 60351(0xebbf, float:8.457E-41)
            if (r3 > r4) goto L3e
            r4 = 49472(0xc140, float:6.9325E-41)
            goto L2e
        L3e:
            r3 = r5
        L3f:
            if (r3 == r5) goto L50
            int r4 = r3 >> 8
            int r4 = r4 * 192
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r3
            r3 = 13
            r8.c(r4, r3)
            int r2 = r2 + 2
            goto L14
        L50:
            d30 r7 = new d30
            r0 = 14307(0x37e3, float:2.0048E-41)
            java.lang.String r8 = myunmn.C0059ao.a(r0)
            r7.<init>(r8)
            throw r7
        L5d:
            return
        L5e:
            d30 r7 = new d30
            r0 = 14308(0x37e4, float:2.005E-41)
            java.lang.String r8 = myunmn.C0059ao.a(r0)
            r7.<init>(r8)
            throw r7
        L6b:
            r7 = move-exception
            d30 r8 = new d30
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o50.e(java.lang.String, m30):void");
    }

    public static void f(int i, l50 l50Var, k50 k50Var, m30 m30Var) throws d30 {
        int b = k50Var.b(l50Var);
        int i2 = 1 << b;
        if (i < i2) {
            m30Var.c(i, b);
            return;
        }
        throw new d30(i + C0059ao.a(14309) + (i2 - 1));
    }

    public static void g(k50 k50Var, m30 m30Var) {
        m30Var.c(k50Var.a(), 4);
    }

    public static void h(CharSequence charSequence, m30 m30Var) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                m30Var.c((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    m30Var.c((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    m30Var.c(charAt, 4);
                }
            }
        }
    }

    public static int i(k50 k50Var, m30 m30Var, m30 m30Var2, l50 l50Var) {
        return m30Var.g() + k50Var.b(l50Var) + m30Var2.g();
    }

    public static int j(n50 n50Var) {
        return p50.a(n50Var) + p50.c(n50Var) + p50.d(n50Var) + p50.e(n50Var);
    }

    public static int k(m30 m30Var, j50 j50Var, l50 l50Var, n50 n50Var) throws d30 {
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            q50.a(m30Var, j50Var, l50Var, i3, n50Var);
            int j = j(n50Var);
            if (j < i) {
                i2 = i3;
                i = j;
            }
        }
        return i2;
    }

    public static k50 l(String str, String str2) {
        if (C0059ao.a(14310).equals(str2) && s(str)) {
            return k50.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (p(charAt) == -1) {
                return k50.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return k50.ALPHANUMERIC;
        }
        if (z2) {
            return k50.NUMERIC;
        }
        return k50.BYTE;
    }

    public static l50 m(int i, j50 j50Var) throws d30 {
        for (int i2 = 1; i2 <= 40; i2++) {
            l50 e = l50.e(i2);
            if (v(i, e, j50Var)) {
                return e;
            }
        }
        throw new d30(C0059ao.a(14311));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:
        if (defpackage.r50.b(r9) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.r50 n(java.lang.String r7, defpackage.j50 r8, java.util.Map<defpackage.y20, ?> r9) throws defpackage.d30 {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o50.n(java.lang.String, j50, java.util.Map):r50");
    }

    public static byte[] o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new r30(p30.k).b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    public static int p(int i) {
        int[] iArr = a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    public static void q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws d30 {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new d30(C0059ao.a(14316));
            }
            if (i3 != i6 + i5) {
                throw new d30(C0059ao.a(14315));
            }
            if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new d30(C0059ao.a(14314));
            }
            if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
                return;
            }
            iArr[0] = i10;
            iArr2[0] = i12;
            return;
        }
        throw new d30(C0059ao.a(14317));
    }

    public static m30 r(m30 m30Var, int i, int i2, int i3) throws d30 {
        if (m30Var.h() == i2) {
            ArrayList<m50> arrayList = new ArrayList(i3);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                q(i, i2, i3, i7, iArr, iArr2);
                int i8 = iArr[0];
                byte[] bArr = new byte[i8];
                m30Var.j(i4 << 3, bArr, 0, i8);
                byte[] o = o(bArr, iArr2[0]);
                arrayList.add(new m50(bArr, o));
                i5 = Math.max(i5, i8);
                i6 = Math.max(i6, o.length);
                i4 += iArr[0];
            }
            if (i2 == i4) {
                m30 m30Var2 = new m30();
                for (int i9 = 0; i9 < i5; i9++) {
                    for (m50 m50Var : arrayList) {
                        byte[] a2 = m50Var.a();
                        if (i9 < a2.length) {
                            m30Var2.c(a2[i9], 8);
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (m50 m50Var2 : arrayList) {
                        byte[] b = m50Var2.b();
                        if (i10 < b.length) {
                            m30Var2.c(b[i10], 8);
                        }
                    }
                }
                if (i == m30Var2.h()) {
                    return m30Var2;
                }
                throw new d30(C0059ao.a(14318) + i + C0059ao.a(14319) + m30Var2.h() + C0059ao.a(14320));
            }
            throw new d30(C0059ao.a(14321));
        }
        throw new d30(C0059ao.a(14322));
    }

    public static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes(C0059ao.a(14323));
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static l50 t(j50 j50Var, k50 k50Var, m30 m30Var, m30 m30Var2) throws d30 {
        return m(i(k50Var, m30Var, m30Var2, m(i(k50Var, m30Var, m30Var2, l50.e(1)), j50Var)), j50Var);
    }

    public static void u(int i, m30 m30Var) throws d30 {
        int i2 = i << 3;
        if (m30Var.g() <= i2) {
            for (int i3 = 0; i3 < 4 && m30Var.g() < i2; i3++) {
                m30Var.a(false);
            }
            int g = m30Var.g() & 7;
            if (g > 0) {
                while (g < 8) {
                    m30Var.a(false);
                    g++;
                }
            }
            int h = i - m30Var.h();
            for (int i4 = 0; i4 < h; i4++) {
                m30Var.c((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (m30Var.g() != i2) {
                throw new d30(C0059ao.a(14324));
            }
            return;
        }
        throw new d30(C0059ao.a(14325) + m30Var.g() + C0059ao.a(14326) + i2);
    }

    public static boolean v(int i, l50 l50Var, j50 j50Var) {
        return l50Var.d() - l50Var.c(j50Var).d() >= (i + 7) / 8;
    }
}
