package defpackage;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Bank;
import com.olive.upi.transport.model.BeneVpa;
import com.upi.axispay.R;
import defpackage.ua0;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: rc0  reason: default package */
/* loaded from: classes.dex */
public class rc0 extends xc0 implements ua0.e {
    public Button l;
    public EditText m;
    public EditText n;
    public EditText o;
    public EditText p;
    public EditText q;
    public TextView r;
    public CheckBox s;
    public LinearLayout t;
    public ImageView u;

    /* compiled from: AxisPay */
    /* renamed from: rc0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            rc0.this.k().onBackPressed();
        }
    }

    public static rc0 B() {
        return new rc0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void y(View view) {
        this.b.t(104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void A(View view) {
        jg0.C(view, k());
        String obj = this.p.getText().toString();
        String obj2 = this.q.getText().toString();
        String lowerCase = this.r.getText().toString().toLowerCase();
        String obj3 = this.o.getText().toString();
        String str = lowerCase + obj3;
        String obj4 = this.m.getText().toString();
        String a2 = this.s.isChecked() ? C0059ao.a(435) : C0059ao.a(436);
        if (TextUtils.isEmpty(obj2)) {
            eg0.m(k(), getString(R.string.enter_nick_name));
        } else if (obj2.trim().length() < 3) {
            eg0.m(k(), getString(R.string.valid_nick_name));
        } else if (TextUtils.isEmpty(obj4)) {
            eg0.m(k(), getString(R.string.select_bank_name));
        } else if (TextUtils.isEmpty(obj)) {
            eg0.m(k(), getString(R.string.enter_account_num));
        } else if (!jg0.G(getContext(), obj)) {
            eg0.m(k(), getString(R.string.enter_valid_account));
        } else if (TextUtils.isEmpty(obj3)) {
            eg0.m(k(), getString(R.string.enter_empty_ifsc));
        } else if (!jg0.I(str)) {
            eg0.m(k(), getString(R.string.enter_ifsc));
        } else {
            String str2 = obj + C0059ao.a(437) + str + C0059ao.a(438);
            if (qa0.v().g(str2) != null) {
                eg0.m(k(), getString(R.string.ifsc_already_exist));
                return;
            }
            eg0.i(k());
            BeneVpa beneVpa = new BeneVpa();
            beneVpa.setVpa(str2.toLowerCase());
            beneVpa.setName(obj2);
            beneVpa.setNickname(obj2);
            beneVpa.setFavorite(a2);
            ua0.d().q(new OliveRequest(12, 17, beneVpa));
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_ifsc_connection, viewGroup, false);
        this.s = (CheckBox) inflate.findViewById(R.id.favourite_icon);
        this.p = (EditText) inflate.findViewById(R.id.editaccount_no);
        this.t = (LinearLayout) inflate.findViewById(R.id.ifsc_layout);
        this.n = (EditText) inflate.findViewById(R.id.edit_ifsc);
        this.o = (EditText) inflate.findViewById(R.id.edit_ifsc1);
        this.u = (ImageView) inflate.findViewById(R.id.bank_logo);
        this.n.setTypeface(null, 1);
        TextView textView = (TextView) inflate.findViewById(R.id.ifsc_prefix);
        this.r = textView;
        textView.setTypeface(null, 1);
        this.l = (Button) inflate.findViewById(R.id.button_confirm);
        EditText editText = (EditText) inflate.findViewById(R.id.spinner_select_bank);
        this.m = editText;
        editText.setFocusable(false);
        this.m.setClickable(true);
        EditText editText2 = (EditText) inflate.findViewById(R.id.edit_name);
        this.q = editText2;
        editText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.max_account_no_lenght))});
        this.p.setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.max_account_no_lenght))});
        this.m.setOnClickListener(new View.OnClickListener() { // from class: bb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rc0.this.y(view);
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() { // from class: ab0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rc0.this.A(view);
            }
        });
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            eg0.m(k(), result.getResult());
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        v(12, getString(R.string.axis_pay_contact));
        ua0.e(k()).u(this);
        Bank J = qa0.v().J();
        if (J != null) {
            this.m.setText(J.getName());
            String ifsc = J.getIfsc();
            if (ifsc.length() > 0) {
                this.o.setFilters(new InputFilter[]{new InputFilter.LengthFilter(7)});
            } else {
                this.o.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
            }
            if (!TextUtils.isEmpty(ifsc)) {
                this.t.setVisibility(0);
                this.o.setText(C0059ao.a(439));
                if (ifsc.length() > 4) {
                    this.r.setText(ifsc.toUpperCase());
                    jg0.K(this.u, qa0.v().J().getLogo(), 2131230832);
                    this.o.setVisibility(0);
                } else {
                    this.r.setText(ifsc.toUpperCase());
                }
                jg0.K(this.u, qa0.v().J().getLogo(), 2131230832);
            }
            qa0.v().s0(null);
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 17) {
            if (oliveRequest.getInitiator() == this.g) {
                eg0.B();
                return;
            }
            return;
        }
        ah0.c(k(), C0059ao.a(440), new HashMap());
        ua0.d().j(true, new OliveRequest(12, 18, null, true));
        eg0.n(k(), getString(R.string.contacts_saved), new a());
    }
}
