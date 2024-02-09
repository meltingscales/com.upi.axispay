package org.npci.upi.security.pinactivitycomponent;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import myunmn.C0059ao;
import org.npci.upi.security.services.CLResultReceiver;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class CLServerResultReceiver extends ResultReceiver {
    public CLResultReceiver b;

    public CLServerResultReceiver(CLResultReceiver cLResultReceiver) {
        super(new Handler());
        this.b = cLResultReceiver;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        try {
            this.b.a(bundle);
        } catch (RemoteException e) {
            l.b(C0059ao.a(7925), C0059ao.a(7924) + e.getLocalizedMessage());
        }
    }
}
