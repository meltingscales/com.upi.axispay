package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: u40  reason: default package */
/* loaded from: classes.dex */
public abstract class u40 implements c30 {
    public static final Pattern a = Pattern.compile(C0059ao.a(13993));

    public static int b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    public static void c(String str) {
        if (!a.matcher(str).matches()) {
            throw new IllegalArgumentException(C0059ao.a(13994));
        }
    }

    public static n30 g(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        n30 n30Var = new n30(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                n30Var.h(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return n30Var;
    }

    @Override // defpackage.c30
    public n30 a(String str, w20 w20Var, int i, int i2, Map<y20, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException(C0059ao.a(13998));
        }
        if (i >= 0 && i2 >= 0) {
            Collection<w20> f = f();
            if (f != null && !f.contains(w20Var)) {
                throw new IllegalArgumentException(C0059ao.a(13995) + f + C0059ao.a(13996) + w20Var);
            }
            int e = e();
            if (map != null) {
                y20 y20Var = y20.MARGIN;
                if (map.containsKey(y20Var)) {
                    e = Integer.parseInt(map.get(y20Var).toString());
                }
            }
            return g(d(str), i, i2, e);
        }
        throw new IllegalArgumentException(C0059ao.a(13997) + i + 'x' + i2);
    }

    public abstract boolean[] d(String str);

    public int e() {
        return 10;
    }

    public abstract Collection<w20> f();
}
