package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.olive.upi.transport.model.Account;
import com.upi.axispay.R;
import defpackage.qa0;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: if0  reason: default package */
/* loaded from: classes.dex */
public class if0 extends xc0 {
    public LinearLayout l;
    public View m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public ImageView r;
    public String s;

    /* compiled from: AxisPay */
    /* renamed from: if0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            na0 na0Var = new na0();
            na0Var.e(C0059ao.a(8039));
            if0.this.b.t(69, na0Var);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: if0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArrayList<Account> h = qa0.v().h(qa0.c.WITH_VPA);
            if (h != null && h.size() > 0) {
                if0.this.y();
            } else {
                eg0.m(if0.this.k(), if0.this.getString(R.string.Please_Add_Account_For_Referral));
            }
        }
    }

    public static if0 x() {
        return new if0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.referral_screens, viewGroup, false);
        this.m = inflate;
        this.r = (ImageView) inflate.findViewById(R.id.share_referral_link);
        this.p = (TextView) this.m.findViewById(R.id.link);
        this.l = (LinearLayout) this.m.findViewById(R.id.share_data);
        this.n = (TextView) this.m.findViewById(R.id.no_account);
        this.o = (TextView) this.m.findViewById(R.id.tc);
        ArrayList<Account> h = qa0.v().h(qa0.c.WITH_VPA);
        if (h != null && h.size() > 0) {
            String vpa = h.get(0).getVpa();
            this.s = vpa;
            this.p.setText(vpa);
            this.n.setVisibility(8);
            this.l.setVisibility(0);
        } else {
            this.n.setVisibility(0);
            this.l.setVisibility(8);
        }
        this.q = (TextView) this.m.findViewById(R.id.sharetv);
        this.p.setTypeface(null, 1);
        this.q.setTypeface(null, 1);
        this.o.setOnClickListener(new a());
        this.r.setOnClickListener(new b());
        return this.m;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(123, getString(R.string.set_refer_friends));
        super.onResume();
    }

    public void y() {
        Intent intent = new Intent();
        intent.setAction(C0059ao.a(15456));
        intent.setType(C0059ao.a(15457));
        intent.putExtra(C0059ao.a(15459), String.format(getString(R.string.referal_text), this.s, C0059ao.a(15458)));
        startActivityForResult(Intent.createChooser(intent, getString(R.string.Share_Referral_Link)), 9);
    }
}
