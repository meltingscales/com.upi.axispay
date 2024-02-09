package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.zzau;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends com.google.firebase.iid.zzc {
    private static final Queue<String> zzeb = new ArrayDeque(10);

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    @Override // com.google.firebase.iid.zzc
    public final Intent zzb(Intent intent) {
        return zzau.zzai().zzaj();
    }

    @Override // com.google.firebase.iid.zzc
    public final boolean zzc(Intent intent) {
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException unused) {
                    Log.e("FirebaseMessaging", "Notification pending intent canceled");
                }
            }
            if (MessagingAnalytics.shouldUploadMetrics(intent)) {
                MessagingAnalytics.logNotificationOpen(intent);
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
        if (r1.equals("send_error") == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    @Override // com.google.firebase.iid.zzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.zzd(android.content.Intent):void");
    }
}
