package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: e30  reason: default package */
/* loaded from: classes.dex */
public final class e30 implements c30 {
    public static n30 b(String str, w20 w20Var, int i, int i2, Charset charset, int i3, int i4) {
        if (w20Var == w20.AZTEC) {
            return c(h30.d(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException(C0059ao.a(11445).concat(String.valueOf(w20Var)));
    }

    public static n30 c(f30 f30Var, int i, int i2) {
        n30 a = f30Var.a();
        if (a != null) {
            int f = a.f();
            int e = a.e();
            int max = Math.max(i, f);
            int max2 = Math.max(i2, e);
            int min = Math.min(max / f, max2 / e);
            int i3 = (max - (f * min)) / 2;
            int i4 = (max2 - (e * min)) / 2;
            n30 n30Var = new n30(max, max2);
            int i5 = 0;
            while (i5 < e) {
                int i6 = 0;
                int i7 = i3;
                while (i6 < f) {
                    if (a.d(i6, i5)) {
                        n30Var.h(i7, i4, min, min);
                    }
                    i6++;
                    i7 += min;
                }
                i5++;
                i4 += min;
            }
            return n30Var;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.c30
    public n30 a(String str, w20 w20Var, int i, int i2, Map<y20, ?> map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i3 = 0;
        if (map != null) {
            y20 y20Var = y20.CHARACTER_SET;
            if (map.containsKey(y20Var)) {
                charset = Charset.forName(map.get(y20Var).toString());
            }
            y20 y20Var2 = y20.ERROR_CORRECTION;
            r1 = map.containsKey(y20Var2) ? Integer.parseInt(map.get(y20Var2).toString()) : 33;
            y20 y20Var3 = y20.AZTEC_LAYERS;
            if (map.containsKey(y20Var3)) {
                i3 = Integer.parseInt(map.get(y20Var3).toString());
            }
        }
        return b(str, w20Var, i, i2, charset, r1, i3);
    }
}
