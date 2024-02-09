package com.upi.axispay.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LanguageActivity extends c90 implements View.OnClickListener {
    public Button D;
    public Button E;

    public final void d0() {
        Intent intent = new Intent(this, TutorialActivity.class);
        intent.putExtra(C0059ao.a(3495), 1);
        startActivity(intent);
    }

    public final void e0() {
        this.D = (Button) findViewById(R.id.button_english);
        this.E = (Button) findViewById(R.id.button_hindi);
    }

    public final void f0() {
        this.D.setOnClickListener(this);
        this.E.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        String a = C0059ao.a(3496);
        if (id == R.id.button_english) {
            d70 e = d70.e(getApplicationContext());
            String a2 = C0059ao.a(3498);
            e.i(a2);
            n70.f.a().y(a, a2);
            d0();
        } else if (id != R.id.button_hindi) {
        } else {
            d70 e2 = d70.e(getApplicationContext());
            String a3 = C0059ao.a(3497);
            e2.i(a3);
            n70.f.a().y(a, a3);
            d0();
        }
    }

    @Override // defpackage.c90, defpackage.sd, androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xg0.b(this);
        setContentView(R.layout.activity_language);
        e0();
        f0();
        getIntent().getExtras();
    }
}
