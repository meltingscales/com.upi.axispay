package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

/* compiled from: AxisPay */
@Deprecated
/* loaded from: classes.dex */
public class FirebaseInstanceIdService extends zzc {
    @Deprecated
    public void onTokenRefresh() {
    }

    @Override // com.google.firebase.iid.zzc
    public final Intent zzb(Intent intent) {
        return zzau.zzai().zzdh.poll();
    }

    @Override // com.google.firebase.iid.zzc
    public final void zzd(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            onTokenRefresh();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                sb.toString();
            }
            if (!"RST".equals(stringExtra) && !"RST_FULL".equals(stringExtra)) {
                if ("SYNC".equals(stringExtra)) {
                    FirebaseInstanceId.getInstance().zzp();
                    return;
                }
                return;
            }
            FirebaseInstanceId.getInstance().zzn();
        }
    }
}
