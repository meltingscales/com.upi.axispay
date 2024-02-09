package org.npci.upi.security.pinactivitycomponent;

import android.content.Context;
import android.content.SharedPreferences;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class k {
    public final SharedPreferences a;

    public k(Context context) {
        this.a = context.getSharedPreferences(C0059ao.a(2286), 0);
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public String b(String str, String str2) {
        return this.a.getString(str, str2);
    }
}
