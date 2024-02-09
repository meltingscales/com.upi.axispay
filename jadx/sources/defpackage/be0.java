package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.BeneVpa;
import com.upi.axispay.R;
import com.upi.axispay.custom.FloatingInputLayout;
import defpackage.ua0;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: be0  reason: default package */
/* loaded from: classes.dex */
public class be0 extends xc0 implements View.OnClickListener, ua0.e, ng0 {
    public View l;
    public String[] m;
    public Button n;
    public Button o;
    public LinearLayout p;
    public LinearLayout q;
    public LinearLayout r;
    public TextView s;
    public TextView t;
    public TextView u;
    public FloatingInputLayout v;
    public CheckBox w;
    public String x;

    /* compiled from: AxisPay */
    /* renamed from: be0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.toString().length() < 3) {
                be0.this.n.setBackgroundResource(R.drawable.background_button_grey_rounded);
                be0.this.n.setClickable(false);
            } else {
                be0.this.n.setBackgroundResource(R.drawable.background_button_dark_rounded);
                be0.this.n.setClickable(true);
            }
            be0.this.v.hideError();
        }
    }

    public static be0 y() {
        return new be0();
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.button_proceed) {
            if (id != R.id.button_verify) {
                return;
            }
            this.b.t(115, null);
            return;
        }
        if (this.w.isChecked()) {
            eg0.i(k());
            BeneVpa beneVpa = new BeneVpa();
            beneVpa.setVpa(this.v.getText().toString());
            beneVpa.setNickname(this.x);
            beneVpa.setName(this.x);
            beneVpa.setFavorite(C0059ao.a(718));
            ua0.d().q(new OliveRequest(114, 17, beneVpa));
        }
        this.b.t(115, null);
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mandate_bene_details, viewGroup, false);
        this.l = inflate;
        z(inflate);
        this.v.getInputField().addTextChangedListener(new a());
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (n(oliveRequest, result)) {
            return;
        }
        int requestType = oliveRequest.getRequestType();
        if (requestType == 17) {
            Toast.makeText(k(), getString(R.string.contacts_saved), 0).show();
            this.b.t(115, null);
        } else if (requestType != 79) {
        } else {
            this.v.showError(result.getResult());
        }
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(114, getString(R.string.request_mandate));
        super.onResume();
        ua0.e(k()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 17) {
            Toast.makeText(k(), getString(R.string.contacts_saved), 0).show();
        } else if (requestType != 79) {
            if (oliveRequest.getInitiator() == this.g) {
                eg0.B();
            }
        } else {
            this.x = (String) result.getData();
            this.q.setVisibility(8);
            this.r.setVisibility(0);
            this.n.setVisibility(8);
            this.s.setVisibility(0);
            this.t.setVisibility(0);
            this.p.setVisibility(0);
            this.o.setVisibility(0);
            this.u.setText(this.v.getText().toString());
            this.t.setText(this.x);
        }
        eg0.B();
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
    }

    public void z(View view) {
        this.m = getResources().getStringArray(R.array.mandate_state_list);
        ((StateProgressBar) view.findViewById(R.id.stepper_indicator)).setStateDescriptionData(this.m);
        this.p = (LinearLayout) view.findViewById(R.id.layout_vpa_view);
        this.v = (FloatingInputLayout) view.findViewById(R.id.edit_vpa);
        this.q = (LinearLayout) view.findViewById(R.id.edit_text_layout);
        this.r = (LinearLayout) view.findViewById(R.id.layout_contact);
        this.s = (TextView) view.findViewById(R.id.register_name);
        this.t = (TextView) view.findViewById(R.id.text_receiver_title);
        this.u = (TextView) view.findViewById(R.id.text_receiver_vpa);
        Button button = (Button) view.findViewById(R.id.button_verify);
        this.n = button;
        button.setBackgroundResource(R.drawable.background_button_grey_rounded);
        this.w = (CheckBox) view.findViewById(R.id.favourite_icon);
        Button button2 = (Button) view.findViewById(R.id.button_proceed);
        this.o = button2;
        button2.setOnClickListener(this);
        this.n.setOnClickListener(this);
    }
}
