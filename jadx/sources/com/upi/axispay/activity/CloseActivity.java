package com.upi.axispay.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CloseActivity extends z {
    public TextView q;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int intValue = ((Integer) view.getTag()).intValue();
            String a = C0059ao.a(10880);
            if (intValue == 1) {
                Intent intent = new Intent(CloseActivity.this, LoginActivity.class);
                if (!n70.f.a().e(C0059ao.a(10881))) {
                    intent.putExtra(a, 22);
                }
                intent.setFlags(67108864);
                CloseActivity.this.startActivity(intent);
                CloseActivity.this.finish();
                return;
            }
            n70.f.a().c(C0059ao.a(10882));
            qa0.d0(null);
            Intent intent2 = new Intent(CloseActivity.this, LoginActivity.class);
            intent2.putExtra(a, 22);
            intent2.setFlags(67108864);
            CloseActivity.this.startActivity(intent2);
            CloseActivity.this.finish();
        }
    }

    @Override // defpackage.sd, androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_close);
        this.q = (TextView) findViewById(R.id.exit_msg);
        Button button = (Button) findViewById(R.id.btn_exit);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.getInt(C0059ao.a(8142)) == 1) {
                this.q.setText(getString(R.string.no_sim_detect));
                button.setText(getString(R.string.try_again));
                button.setTag(1);
            } else {
                this.q.setText(getString(R.string.sim_change_detect));
                button.setText(getString(R.string.okay));
                button.setTag(2);
            }
        }
        button.setOnClickListener(new a());
    }
}
