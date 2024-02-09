package org.npci.upi.security.pinactivitycomponent;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import myunmn.C0059ao;
import org.npci.upi.security.services.CLRemoteService;
import org.npci.upi.security.services.CLResultReceiver;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class CLRemoteServiceImpl extends Service {
    public CLRemoteService.Stub b = null;
    public c c = null;

    /* compiled from: AxisPay */
    /* loaded from: classes2.dex */
    public class a extends CLRemoteService.Stub {
        public Context a;

        public a(Context context) {
            this.a = null;
            this.a = context;
        }

        @Override // org.npci.upi.security.services.CLRemoteService
        public void c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CLResultReceiver cLResultReceiver) {
            Bundle a = CLRemoteServiceImpl.this.a(str, str2, str3, str4, str5, str6, str7, str8, cLResultReceiver);
            Intent intent = new Intent(this.a, GetCredential.class);
            intent.setFlags(268435456);
            intent.putExtras(a);
            this.a.startActivity(intent);
        }

        @Override // org.npci.upi.security.services.CLRemoteService
        public String d(String str, String str2) {
            return CLRemoteServiceImpl.this.c.b(str, str2);
        }

        @Override // org.npci.upi.security.services.CLRemoteService
        public boolean h(String str, String str2, String str3, String str4) {
            return CLRemoteServiceImpl.this.c.c(str, str2, str3, str4);
        }
    }

    public final Bundle a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CLResultReceiver cLResultReceiver) {
        Bundle bundle = new Bundle();
        bundle.putString(C0059ao.a(2958), str);
        bundle.putString(C0059ao.a(2959), str2);
        bundle.putString(C0059ao.a(2960), str3);
        bundle.putString(C0059ao.a(2961), str4);
        bundle.putString(C0059ao.a(2962), str5);
        bundle.putString(C0059ao.a(2963), str6);
        bundle.putString(C0059ao.a(2964), str7);
        bundle.putString(C0059ao.a(2965), str8);
        i.d(new CLServerResultReceiver(cLResultReceiver));
        return bundle;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.b == null) {
            this.b = new a(getBaseContext());
        }
        try {
            this.c = new c(getBaseContext());
            return this.b;
        } catch (Exception unused) {
            throw new RuntimeException(C0059ao.a(2966));
        }
    }
}
