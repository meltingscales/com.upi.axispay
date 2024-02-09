package defpackage;

import android.content.Context;
import android.content.Intent;
import defpackage.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: j  reason: default package */
/* loaded from: classes.dex */
public final class j extends i<String[], Map<String, Boolean>> {
    public static Intent e(String[] strArr) {
        return new Intent(C0059ao.a(10912)).putExtra(C0059ao.a(10913), strArr);
    }

    @Override // defpackage.i
    /* renamed from: d */
    public Intent a(Context context, String[] strArr) {
        return e(strArr);
    }

    @Override // defpackage.i
    /* renamed from: f */
    public i.a<Map<String, Boolean>> b(Context context, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            o4 o4Var = new o4();
            boolean z = true;
            for (String str : strArr) {
                boolean z2 = t8.a(context, str) == 0;
                o4Var.put(str, Boolean.valueOf(z2));
                if (!z2) {
                    z = false;
                }
            }
            if (z) {
                return new i.a<>(o4Var);
            }
            return null;
        }
        return new i.a<>(Collections.emptyMap());
    }

    @Override // defpackage.i
    /* renamed from: g */
    public Map<String, Boolean> c(int i, Intent intent) {
        if (i != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra(C0059ao.a(10914));
        int[] intArrayExtra = intent.getIntArrayExtra(C0059ao.a(10915));
        if (intArrayExtra != null && stringArrayExtra != null) {
            HashMap hashMap = new HashMap();
            int length = stringArrayExtra.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
