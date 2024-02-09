package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sn0  reason: default package */
/* loaded from: classes.dex */
public final class sn0 implements Serializable {
    public final Pattern b;

    public sn0(Pattern pattern) {
        yl0.e(pattern, C0059ao.a(9978));
        this.b = pattern;
    }

    public final boolean a(CharSequence charSequence) {
        yl0.e(charSequence, C0059ao.a(9979));
        return this.b.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        yl0.e(charSequence, C0059ao.a(9980));
        yl0.e(str, C0059ao.a(9981));
        String replaceAll = this.b.matcher(charSequence).replaceAll(str);
        yl0.d(replaceAll, C0059ao.a(9982));
        return replaceAll;
    }

    public String toString() {
        String pattern = this.b.toString();
        yl0.d(pattern, C0059ao.a(9983));
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sn0(java.lang.String r2) {
        /*
            r1 = this;
            r0 = 9976(0x26f8, float:1.398E-41)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            defpackage.yl0.e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r0 = 9977(0x26f9, float:1.3981E-41)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            defpackage.yl0.d(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn0.<init>(java.lang.String):void");
    }
}
