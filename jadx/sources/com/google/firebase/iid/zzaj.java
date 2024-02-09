package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzaj {
    private final Messenger zzao;
    private final zzm zzcl;

    public zzaj(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.zzao = new Messenger(iBinder);
            this.zzcl = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.zzcl = new zzm(iBinder);
            this.zzao = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public final void send(Message message) throws RemoteException {
        Messenger messenger = this.zzao;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzm zzmVar = this.zzcl;
        if (zzmVar != null) {
            zzmVar.send(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
