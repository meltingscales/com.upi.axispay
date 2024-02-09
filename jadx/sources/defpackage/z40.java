package defpackage;

import java.util.Collection;
import java.util.Collections;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: z40  reason: default package */
/* loaded from: classes.dex */
public final class z40 extends x40 {
    @Override // defpackage.u40
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + w40.b(y40.c(str));
            } catch (z20 e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!w40.a(y40.c(str))) {
                    throw new IllegalArgumentException(C0059ao.a(15045));
                }
            } catch (z20 unused) {
                throw new IllegalArgumentException(C0059ao.a(15046));
            }
        } else {
            throw new IllegalArgumentException(C0059ao.a(15047).concat(String.valueOf(length)));
        }
        u40.c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException(C0059ao.a(15048));
        }
        int i = y40.f[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int b = u40.b(zArr, 0, w40.a, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit2 = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit2 += 10;
            }
            b += u40.b(zArr, b, w40.e[digit2], false);
        }
        u40.b(zArr, b, w40.c, false);
        return zArr;
    }

    @Override // defpackage.u40
    public Collection<w20> f() {
        return Collections.singleton(w20.UPC_E);
    }
}
