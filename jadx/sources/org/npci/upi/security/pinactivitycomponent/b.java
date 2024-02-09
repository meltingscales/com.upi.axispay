package org.npci.upi.security.pinactivitycomponent;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes2.dex */
public class b extends Exception {
    public String b;
    public String c;

    public b(Context context, String str, String str2) {
        this.b = C0059ao.a(1814);
        this.c = str2;
        b(context, str2);
    }

    public b(Context context, String str, String str2, Throwable th) {
        super(th);
        this.b = C0059ao.a(1815);
        this.c = str2;
        b(context, str2);
    }

    public String a() {
        return this.c;
    }

    public void b(Context context, String str) {
        InputStream inputStream;
        Properties properties = new Properties();
        try {
            inputStream = context.getAssets().open(C0059ao.a(1816));
        } catch (IOException e) {
            Log.e(this.b, e.getLocalizedMessage());
            inputStream = null;
        }
        try {
            properties.load(inputStream);
        } catch (IOException e2) {
            Log.e(this.b, e2.getLocalizedMessage());
        }
        String property = properties.getProperty(str);
        String str2 = this.b;
        Log.e(str2, C0059ao.a(1817) + property);
        String string = context.getResources().getString(R.string.error_msg);
        Activity activity = (Activity) context;
        ((RelativeLayout) activity.findViewById(R.id.error_layout)).setVisibility(0);
        ((TextView) activity.findViewById(R.id.error_message)).setText(string);
    }
}
