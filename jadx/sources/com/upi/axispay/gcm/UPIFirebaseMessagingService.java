package com.upi.axispay.gcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.upi.axispay.R;
import defpackage.n70;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class UPIFirebaseMessagingService extends FirebaseMessagingService {
    public int b;
    public String c;

    public final int a() {
        return R.drawable.system_notification_new;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upi.axispay.gcm.UPIFirebaseMessagingService.b(java.lang.String):void");
    }

    public final void c(String str) {
        n70.a aVar = n70.f;
        aVar.a().y(C0059ao.a(5410), str);
        aVar.a().y(C0059ao.a(5411), C0059ao.a(5412));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String str = C0059ao.a(5413) + remoteMessage;
        if (remoteMessage.getData().size() > 0) {
            b(remoteMessage.getData().get(C0059ao.a(5414)));
        } else if (remoteMessage.getNotification() != null) {
            b(remoteMessage.getNotification().getBody());
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        c(str);
    }
}
