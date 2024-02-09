package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.snackbar.Snackbar;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: hd0  reason: default package */
/* loaded from: classes.dex */
public class hd0 extends xc0 implements View.OnClickListener {

    /* compiled from: AxisPay */
    /* renamed from: hd0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            hd0.this.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void z(View view) {
        eg0.c();
        this.b.o(11, null);
    }

    public void A() {
        eg0.o(k(), getString(R.string.alert), getString(R.string.query_message), getString(R.string.okay), new View.OnClickListener() { // from class: lb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hd0.this.z(view);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.first_toll) {
            x(getString(R.string.cust_care1));
        } else if (view.getId() == R.id.second_toll) {
            x(getString(R.string.cust_care2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_contact_us, viewGroup, false);
        ((LinearLayout) inflate.findViewById(R.id.first_toll)).setOnClickListener(this);
        ((LinearLayout) inflate.findViewById(R.id.second_toll)).setOnClickListener(this);
        ((Button) inflate.findViewById(R.id.button_create)).setOnClickListener(new a());
        return inflate;
    }

    public final void x(String str) {
        try {
            Intent intent = new Intent(C0059ao.a(14744));
            intent.setData(Uri.parse(C0059ao.a(14745) + str));
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Snackbar.Y(getView(), getString(R.string.call_failed), -1).N();
        }
    }
}
