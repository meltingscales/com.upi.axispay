package defpackage;

import java.util.Collection;
import java.util.Collections;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: s40  reason: default package */
/* loaded from: classes.dex */
public final class s40 extends u40 {
    public static final int[] b = {1, 1, 1, 1};
    public static final int[] c = {3, 1, 1};
    public static final int[][] d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // defpackage.u40
    public boolean[] d(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                u40.c(str);
                boolean[] zArr = new boolean[(length * 9) + 9];
                int b2 = u40.b(zArr, 0, b, true);
                for (int i = 0; i < length; i += 2) {
                    int digit = Character.digit(str.charAt(i), 10);
                    int digit2 = Character.digit(str.charAt(i + 1), 10);
                    int[] iArr = new int[10];
                    for (int i2 = 0; i2 < 5; i2++) {
                        int i3 = i2 * 2;
                        int[][] iArr2 = d;
                        iArr[i3] = iArr2[digit][i2];
                        iArr[i3 + 1] = iArr2[digit2][i2];
                    }
                    b2 += u40.b(zArr, b2, iArr, true);
                }
                u40.b(zArr, b2, c, true);
                return zArr;
            }
            throw new IllegalArgumentException(C0059ao.a(3525).concat(String.valueOf(length)));
        }
        throw new IllegalArgumentException(C0059ao.a(3526));
    }

    @Override // defpackage.u40
    public Collection<w20> f() {
        return Collections.singleton(w20.ITF);
    }
}
