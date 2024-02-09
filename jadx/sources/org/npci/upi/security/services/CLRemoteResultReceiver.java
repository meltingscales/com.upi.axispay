package org.npci.upi.security.services;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import org.npci.upi.security.services.CLResultReceiver;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class CLRemoteResultReceiver extends Service {
    public ResultReceiver b;
    public IBinder c = new CLResultReceiver.Stub() { // from class: org.npci.upi.security.services.CLRemoteResultReceiver.1
        @Override // org.npci.upi.security.services.CLResultReceiver
        public void a(Bundle bundle) {
            CLRemoteResultReceiver.this.b.send(1, bundle);
        }
    };

    public CLRemoteResultReceiver(ResultReceiver resultReceiver) {
        this.b = resultReceiver;
    }

    public IBinder b() {
        return this.c;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.c;
    }
}
