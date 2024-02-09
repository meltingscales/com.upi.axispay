package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class ActivityCompat {
    public static Uri getReferrer(Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra(C0059ao.a(14726));
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra(C0059ao.a(14727));
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }
}
