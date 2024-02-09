package com.upi.axispay.activity;

import android.content.Intent;
import android.os.Bundle;
import com.google.gson.Gson;
import com.olive.upi.transport.model.GCMMessage;
import defpackage.n70;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class UPINotificationHandler extends z {
    @Override // defpackage.sd, androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null) {
            finish();
        }
        String string = intent.getExtras().getString(C0059ao.a(3617));
        try {
            qa0.v().Y((GCMMessage) new Gson().fromJson(string, (Class<Object>) GCMMessage.class));
            new d70(this);
            n70.a aVar = n70.f;
            long k = aVar.a().k(C0059ao.a(3618));
            int i = (k > 0L ? 1 : (k == 0L ? 0 : -1));
            String a = C0059ao.a(3619);
            if (i != 0 && aVar.a().e(C0059ao.a(3620)) && System.currentTimeMillis() - k < 120000) {
                Intent intent2 = new Intent(this, MainActivity.class);
                intent2.setFlags(335544320);
                intent2.putExtra(a, 31);
                startActivity(intent2);
                finish();
            } else {
                Intent intent3 = new Intent(this, LoginActivity.class);
                intent3.setFlags(335544320);
                intent3.putExtra(a, 31);
                startActivity(intent3);
                finish();
            }
        } catch (Exception unused) {
            finish();
        }
    }
}
