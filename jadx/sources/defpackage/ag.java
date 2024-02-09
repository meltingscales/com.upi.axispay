package defpackage;

import android.os.Bundle;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ag  reason: default package */
/* loaded from: classes.dex */
public class ag {
    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        String a = C0059ao.a(1050);
        String a2 = C0059ao.a(1051);
        return bundle == null ? bundle2.getInt(a2, -1) == -1 && bundle2.getInt(a, -1) == -1 : bundle2 == null ? bundle.getInt(a2, -1) == -1 && bundle.getInt(a, -1) == -1 : bundle.getInt(a2, -1) == bundle2.getInt(a2, -1) && bundle.getInt(a, -1) == bundle2.getInt(a, -1);
    }
}
