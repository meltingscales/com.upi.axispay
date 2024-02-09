package com.upi.axispay.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.upi.axispay.R;
import java.io.IOException;
import java.io.InputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TnCActivity extends c90 {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TnCActivity.this.finish();
        }
    }

    public String d0(String str) {
        try {
            InputStream open = getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return new String(bArr);
        } catch (IOException unused) {
            return C0059ao.a(10978);
        }
    }

    @Override // defpackage.c90, defpackage.sd, androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_tn_c);
        U((Toolbar) findViewById(R.id.toolbar));
        if (M() != null) {
            M().t(false);
        }
        ((TextView) findViewById(R.id.tnc_content)).setText(d0(C0059ao.a(10979)));
        ((ImageView) findViewById(R.id.action_close)).setOnClickListener(new a());
    }
}
