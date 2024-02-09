package defpackage;

import java.util.Collection;
import java.util.Collections;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: r40  reason: default package */
/* loaded from: classes.dex */
public final class r40 extends x40 {
    @Override // defpackage.u40
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + w40.b(str);
            } catch (z20 e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!w40.a(str)) {
                    throw new IllegalArgumentException(C0059ao.a(4234));
                }
            } catch (z20 unused) {
                throw new IllegalArgumentException(C0059ao.a(4235));
            }
        } else {
            throw new IllegalArgumentException(C0059ao.a(4236).concat(String.valueOf(length)));
        }
        u40.c(str);
        boolean[] zArr = new boolean[67];
        int b = u40.b(zArr, 0, w40.a, true) + 0;
        for (int i = 0; i <= 3; i++) {
            b += u40.b(zArr, b, w40.d[Character.digit(str.charAt(i), 10)], false);
        }
        int b2 = b + u40.b(zArr, b, w40.b, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            b2 += u40.b(zArr, b2, w40.d[Character.digit(str.charAt(i2), 10)], true);
        }
        u40.b(zArr, b2, w40.a, true);
        return zArr;
    }

    @Override // defpackage.u40
    public Collection<w20> f() {
        return Collections.singleton(w20.EAN_8);
    }
}
