package com.upi.axispay.utils.authenticator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class AuthenticatorService extends Service {
    public bh0 b;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        bh0 bh0Var = this.b;
        if (bh0Var == null) {
            yl0.t(C0059ao.a(5483));
            throw null;
        }
        IBinder iBinder = bh0Var.getIBinder();
        yl0.d(iBinder, C0059ao.a(5482));
        return iBinder;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.b = new bh0(this);
    }
}
