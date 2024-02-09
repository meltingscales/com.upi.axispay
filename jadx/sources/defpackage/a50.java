package defpackage;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: a50  reason: default package */
/* loaded from: classes.dex */
public final class a50 implements c30 {
    public static n30 b(byte[][] bArr, int i) {
        int i2 = i * 2;
        n30 n30Var = new n30(bArr[0].length + i2, bArr.length + i2);
        n30Var.b();
        int e = (n30Var.e() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    n30Var.g(i4 + i, e);
                }
            }
            i3++;
            e--;
        }
        return n30Var;
    }

    public static n30 c(f50 f50Var, String str, int i, int i2, int i3, int i4) throws d30 {
        boolean z;
        f50Var.e(str, i);
        byte[][] b = f50Var.f().b(1, 4);
        if ((i3 > i2) != (b[0].length < b.length)) {
            b = d(b);
            z = true;
        } else {
            z = false;
        }
        int min = Math.min(i2 / b[0].length, i3 / b.length);
        if (min > 1) {
            byte[][] b2 = f50Var.f().b(min, min << 2);
            if (z) {
                b2 = d(b2);
            }
            return b(b2, i4);
        }
        return b(b, i4);
    }

    public static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // defpackage.c30
    public n30 a(String str, w20 w20Var, int i, int i2, Map<y20, ?> map) throws d30 {
        if (w20Var == w20.PDF_417) {
            f50 f50Var = new f50();
            if (map != null) {
                y20 y20Var = y20.PDF417_COMPACT;
                if (map.containsKey(y20Var)) {
                    f50Var.h(Boolean.parseBoolean(map.get(y20Var).toString()));
                }
                y20 y20Var2 = y20.PDF417_COMPACTION;
                if (map.containsKey(y20Var2)) {
                    f50Var.i(d50.valueOf(map.get(y20Var2).toString()));
                }
                y20 y20Var3 = y20.PDF417_DIMENSIONS;
                if (map.containsKey(y20Var3)) {
                    e50 e50Var = (e50) map.get(y20Var3);
                    f50Var.j(e50Var.a(), e50Var.c(), e50Var.b(), e50Var.d());
                }
                y20 y20Var4 = y20.MARGIN;
                r9 = map.containsKey(y20Var4) ? Integer.parseInt(map.get(y20Var4).toString()) : 30;
                y20 y20Var5 = y20.ERROR_CORRECTION;
                r0 = map.containsKey(y20Var5) ? Integer.parseInt(map.get(y20Var5).toString()) : 2;
                y20 y20Var6 = y20.CHARACTER_SET;
                if (map.containsKey(y20Var6)) {
                    f50Var.k(Charset.forName(map.get(y20Var6).toString()));
                }
            }
            return c(f50Var, str, r0, i, i2, r9);
        }
        throw new IllegalArgumentException(C0059ao.a(6484).concat(String.valueOf(w20Var)));
    }
}
