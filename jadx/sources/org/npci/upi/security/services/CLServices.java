package org.npci.upi.security.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import myunmn.C0059ao;
import org.npci.upi.security.services.CLRemoteService;
import org.npci.upi.security.services.CLResultReceiver;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class CLServices {
    public static CLServices e;
    public Context a;
    public ServiceConnectionStatusNotifier c;
    public CLRemoteService b = null;
    public ServiceConnection d = new ServiceConnection() { // from class: org.npci.upi.security.services.CLServices.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            CLServices.this.b = CLRemoteService.Stub.j(iBinder);
            CLServices.this.c.serviceConnected(CLServices.e);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            CLServices.this.b = null;
            CLServices.this.c.serviceDisconnected();
        }
    };

    static {
        Uri.parse(C0059ao.a(10615));
        Uri.parse(C0059ao.a(10616));
        Uri.parse(C0059ao.a(10617));
        e = null;
    }

    public CLServices(Context context, ServiceConnectionStatusNotifier serviceConnectionStatusNotifier) {
        this.a = context;
        this.c = serviceConnectionStatusNotifier;
        Intent intent = new Intent();
        intent.setAction(C0059ao.a(10618));
        intent.setPackage(this.a.getPackageName());
        this.a.bindService(intent, this.d, 1);
    }

    public static void f(Context context, ServiceConnectionStatusNotifier serviceConnectionStatusNotifier) {
        if (e != null) {
            throw new RuntimeException(C0059ao.a(10619));
        }
        e = new CLServices(context, serviceConnectionStatusNotifier);
    }

    public String d(String str, String str2) {
        if (str == null || str.trim().isEmpty() || str2 == null || str2.trim().isEmpty()) {
            return null;
        }
        try {
            return this.b.d(str, str2);
        } catch (RemoteException unused) {
            Log.e(C0059ao.a(10620), C0059ao.a(10621));
            return null;
        }
    }

    public void e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CLRemoteResultReceiver cLRemoteResultReceiver) {
        try {
            this.b.c(str, str2, str3, str4, str5, str6, str7, str8, CLResultReceiver.Stub.j(cLRemoteResultReceiver.b()));
        } catch (RemoteException unused) {
            Log.e(C0059ao.a(10622), C0059ao.a(10623));
        }
    }

    public boolean g(String str, String str2, String str3, String str4) {
        if (str == null || str.trim().isEmpty() || str2 == null || str2.trim().isEmpty() || str3 == null || str3.trim().isEmpty() || str4 == null || str4.trim().isEmpty()) {
            return false;
        }
        try {
            return this.b.h(str, str2, str3, str4);
        } catch (RemoteException unused) {
            Log.e(C0059ao.a(10624), C0059ao.a(10625));
            return false;
        }
    }
}
