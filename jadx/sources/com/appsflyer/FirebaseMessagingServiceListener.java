package com.appsflyer;

import com.appsflyer.internal.af;
import com.appsflyer.internal.b;
import com.google.firebase.messaging.FirebaseMessagingService;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null) {
            AFLogger.afInfoLog(C0059ao.a(3121).concat(String.valueOf(str)));
            b.a.C0005a m195 = b.a.C0005a.m195(AppsFlyerProperties.getInstance().getString(C0059ao.a(3122)));
            b.a.C0005a c0005a = new b.a.C0005a(currentTimeMillis, str);
            if (m195.m199(c0005a)) {
                af.m165(getApplicationContext(), c0005a.f244);
            }
        }
    }
}
