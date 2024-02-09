package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.olive.upi.transport.model.Account;
import com.upi.axispay.R;
import com.upi.axispay.custom.FloatingInputLayout;
import defpackage.qa0;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: jd0  reason: default package */
/* loaded from: classes.dex */
public class jd0 extends xc0 implements View.OnClickListener {
    public static jd0 r;
    public int l = 0;
    public RelativeLayout m;
    public TextView n;
    public FloatingInputLayout o;
    public ArrayList<Account> p;
    public Account q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void B(View view) {
        this.b.t(4, null);
        eg0.c();
    }

    public static jd0 C() {
        if (r == null) {
            r = new jd0();
        }
        return r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void z(View view) {
        this.b.t(4, null);
        eg0.c();
        this.o.setText(C0059ao.a(9049));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Account account;
        int id = view.getId();
        if (id != R.id.submit_btn) {
            if (id == R.id.text_login || id == R.id.text_remember) {
                this.b.t(4, null);
            }
        } else if (TextUtils.isEmpty(this.o.getText())) {
            eg0.A(k(), getString(R.string.enter_account_number));
        } else {
            this.l++;
            if (this.p.size() > 0 && (account = this.q) != null) {
                if (account.getAccRefNumber() == null) {
                    Toast.makeText(k(), C0059ao.a(9050), 0).show();
                    return;
                } else {
                    x(this.o.getText().toString(), this.q.getAccRefNumber(), this.l);
                    return;
                }
            }
            eg0.A(k(), getString(R.string.no_associated_account));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_forgot_password, viewGroup, false);
        FloatingInputLayout floatingInputLayout = (FloatingInputLayout) inflate.findViewById(R.id.edit_account);
        this.o = floatingInputLayout;
        floatingInputLayout.setInputType(1);
        this.o.setMaxLength(getResources().getInteger(R.integer.max_account_no_lenght));
        this.o.getTextInputLayout().setHint(getResources().getString(R.string.account_number_cap));
        this.n = (TextView) inflate.findViewById(R.id.text_acc_no);
        this.m = (RelativeLayout) inflate.findViewById(R.id.forgot_passcode);
        ((TextView) inflate.findViewById(R.id.text_remember)).setOnClickListener(this);
        ((TextView) inflate.findViewById(R.id.text_login)).setOnClickListener(this);
        ((Button) inflate.findViewById(R.id.submit_btn)).setOnClickListener(this);
        return inflate;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.l = 0;
        FloatingInputLayout floatingInputLayout = this.o;
        String a = C0059ao.a(9051);
        floatingInputLayout.setText(a);
        ArrayList<Account> h = qa0.v().h(qa0.c.ALL);
        this.p = h;
        if (h != null && h.size() > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= this.p.size()) {
                    break;
                }
                i2++;
                if (this.p.get(i).getStatus().equals(C0059ao.a(9052))) {
                    this.q = this.p.get(i);
                    break;
                }
                i++;
            }
            if (i2 == 0) {
                this.q = this.p.get(0);
            }
            Account account = this.q;
            if (account != null) {
                this.n.setText(account.getMaskedAccnumber());
            }
        } else {
            this.m.setVisibility(4);
            eg0.o(k(), getString(R.string.alert), getString(R.string.no_associated_account), getString(R.string.exit), new View.OnClickListener() { // from class: mb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jd0.this.B(view);
                }
            });
        }
        v(72, a);
    }

    public void x(String str, String str2, int i) {
        if (i < 3) {
            if (!TextUtils.isEmpty(str)) {
                if (str.length() == 0) {
                    eg0.A(k(), getString(R.string.enter_account_number));
                } else if (str.equals(str2)) {
                    this.b.t(74, null);
                    eg0.c();
                } else {
                    eg0.A(k(), getString(R.string.account_did_not_match));
                }
                this.o.setText(C0059ao.a(9053));
                return;
            }
            eg0.A(k(), getString(R.string.enter_account_number));
            return;
        }
        eg0.o(k(), getString(R.string.alert), getString(R.string.maximum_limit_exceeded), getString(R.string.exit), new View.OnClickListener() { // from class: nb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jd0.this.z(view);
            }
        });
    }
}
