package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ao0  reason: default package */
/* loaded from: classes.dex */
public class ao0 extends zn0 {
    public static final Integer f(String str) {
        yl0.e(str, C0059ao.a(15286));
        return g(str, 10);
    }

    public static final Integer g(String str, int i) {
        boolean z;
        int i2;
        yl0.e(str, C0059ao.a(15287));
        on0.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        int i5 = 1;
        if (yl0.g(charAt, 48) >= 0) {
            z = false;
            i5 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i4 = RecyclerView.UNDEFINED_DURATION;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i6 = -59652323;
        while (i5 < length) {
            int i7 = i5 + 1;
            int b = on0.b(str.charAt(i5), i);
            if (b < 0) {
                return null;
            }
            if ((i3 < i6 && (i6 != -59652323 || i3 < (i6 = i4 / i))) || (i2 = i3 * i) < i4 + b) {
                return null;
            }
            i3 = i2 - b;
            i5 = i7;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }
}
