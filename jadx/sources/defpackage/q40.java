package defpackage;

import java.util.Collection;
import java.util.Collections;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: q40  reason: default package */
/* loaded from: classes.dex */
public final class q40 extends x40 {
    @Override // defpackage.u40
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + w40.b(str);
            } catch (z20 e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!w40.a(str)) {
                    throw new IllegalArgumentException(C0059ao.a(9521));
                }
            } catch (z20 unused) {
                throw new IllegalArgumentException(C0059ao.a(9522));
            }
        } else {
            throw new IllegalArgumentException(C0059ao.a(9523).concat(String.valueOf(length)));
        }
        u40.c(str);
        int i = p40.f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b = u40.b(zArr, 0, w40.a, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            b += u40.b(zArr, b, w40.e[digit], false);
        }
        int b2 = b + u40.b(zArr, b, w40.b, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            b2 += u40.b(zArr, b2, w40.d[Character.digit(str.charAt(i3), 10)], true);
        }
        u40.b(zArr, b2, w40.a, true);
        return zArr;
    }

    @Override // defpackage.u40
    public Collection<w20> f() {
        return Collections.singleton(w20.EAN_13);
    }
}
