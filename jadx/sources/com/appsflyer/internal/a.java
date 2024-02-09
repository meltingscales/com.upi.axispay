package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: ɩ  reason: contains not printable characters */
    private IntentFilter f171 = new IntentFilter(C0059ao.a(11415));

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: ı  reason: contains not printable characters */
        public static final a f172 = new a();
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: ı  reason: contains not printable characters */
        public final float f173;

        /* renamed from: Ι  reason: contains not printable characters */
        public final String f174;

        public e(float f, String str) {
            this.f173 = f;
            this.f174 = str;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final e m134(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.f171);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra(C0059ao.a(11416), -1)) {
                    int intExtra = registerReceiver.getIntExtra(C0059ao.a(11417), -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? C0059ao.a(11418) : C0059ao.a(11419) : C0059ao.a(11420) : C0059ao.a(11421);
                } else {
                    str = C0059ao.a(11422);
                }
                int intExtra2 = registerReceiver.getIntExtra(C0059ao.a(11423), -1);
                int intExtra3 = registerReceiver.getIntExtra(C0059ao.a(11424), -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable unused) {
        }
        return new e(f, str);
    }
}
