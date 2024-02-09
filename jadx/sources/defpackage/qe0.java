package defpackage;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.upi.axispay.R;
import com.upi.axispay.custom.FloatingInputLayout;
import com.upi.axispay.custom.LoginPopupFragment;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qe0  reason: default package */
/* loaded from: classes.dex */
public class qe0 extends xc0 implements LoginPopupFragment.OnLoginCompletionListener {
    public x90 l;
    public Spinner m;
    public Button n;
    public FloatingInputLayout o;
    public FloatingInputLayout p;
    public o70 q;
    public ScrollView r;
    public TextView s;
    public LinearLayout t;
    public ImageView u;
    public int v;
    public ArrayList<o70> w;
    public LinearLayout x;
    public LoginPopupFragment y;

    /* compiled from: AxisPay */
    /* renamed from: qe0$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            qe0 qe0Var = qe0.this;
            qe0Var.q = qe0Var.l.getItem(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qe0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qe0.this.A();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qe0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qe0.this.k().D().b1(null, 1);
            qe0.this.b.t(4, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qe0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qe0.this.m.performClick();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qe0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qe0.this.y.dismiss();
            qe0 qe0Var = qe0.this;
            qe0Var.y = null;
            if (qe0Var.k() != null) {
                qe0.this.k().onBackPressed();
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qe0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            qe0.this.b.t(58, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qe0$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qe0.this.v == 5) {
                eg0.c();
                qe0.this.k().onBackPressed();
                return;
            }
            eg0.c();
            qe0.this.k().D().b1(null, 1);
            qe0.this.b.t(4, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qe0$h */
    /* loaded from: classes.dex */
    public class h implements InputFilter {
        public h(qe0 qe0Var) {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            String a = C0059ao.a(6697);
            return (charSequence.equals(a) || charSequence.toString().matches(C0059ao.a(6698))) ? charSequence : a;
        }
    }

    public static qe0 z() {
        return new qe0();
    }

    public final void A() {
        Double valueOf;
        hg0 hg0Var = new hg0();
        try {
            valueOf = Double.valueOf(Double.parseDouble(this.o.getText().toString()));
        } catch (Exception unused) {
            valueOf = Double.valueOf(-1.0d);
        }
        if (this.w.size() > 0) {
            hg0Var.j(this.q.c());
            hg0Var.g(this.q.b());
            if (!TextUtils.isEmpty(this.o.getText().toString())) {
                hg0Var.f(this.o.getText().toString());
            }
            if (!TextUtils.isEmpty(this.p.getText().toString())) {
                hg0Var.h(this.p.getText().toString());
            }
            if (valueOf.doubleValue() > 100000.0d) {
                eg0.A(k(), getString(R.string.amount_max_validation_warning));
            } else if (valueOf.doubleValue() >= 0.0d && valueOf.doubleValue() < 1.0d) {
                eg0.A(k(), getString(R.string.amount_validation_text));
            } else {
                hg0Var.i(this.v);
                this.b.t(55, hg0Var);
            }
        }
    }

    public final void B() {
        ArrayList<o70> o = n70.f.a().o();
        this.w = o;
        if (o.size() > 0) {
            this.s.setVisibility(8);
            this.r.setVisibility(0);
            E(this.w);
            return;
        }
        this.r.setVisibility(8);
        this.s.setVisibility(0);
        eg0.r(k(), getString(R.string.confirmation), getString(R.string.qr_warning), getString(R.string.okay), new f(), getString(R.string.cancel), new g());
    }

    public void C(int i) {
        this.v = i;
    }

    public final void D() {
        if (this.y == null) {
            LoginPopupFragment newInstance = LoginPopupFragment.newInstance(65);
            this.y = newInstance;
            newInstance.setMessage(getString(R.string.please_login_continue));
            this.y.show(k().getFragmentManager(), this.y.getClass().getName());
            this.y.setCancelable(false);
            this.y.setLoginCompletionListener(this);
            this.y.setCancelListner(new e());
        }
    }

    public final void E(ArrayList<o70> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            x90 x90Var = this.l;
            if (x90Var == null) {
                this.l = new x90(k(), arrayList);
            } else {
                x90Var.b(arrayList);
            }
            this.m.setAdapter((SpinnerAdapter) this.l);
            return;
        }
        this.r.setVisibility(8);
        this.s.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_qr_code, viewGroup, false);
        this.m = (Spinner) inflate.findViewById(R.id.spinner_select_vpa);
        this.n = (Button) inflate.findViewById(R.id.btn_qr_create);
        FloatingInputLayout floatingInputLayout = (FloatingInputLayout) inflate.findViewById(R.id.qr_amount_layout);
        this.o = floatingInputLayout;
        floatingInputLayout.setLeftImageSize(getResources().getInteger(R.integer.rupee_height), getResources().getInteger(R.integer.rupee_height));
        this.o.setInputType(6);
        this.o.getInputField().setTextSize(22.0f);
        this.o.getInputField().setPadding(0, 5, 0, 0);
        FloatingInputLayout floatingInputLayout2 = (FloatingInputLayout) inflate.findViewById(R.id.qr_remarks_layout);
        this.p = floatingInputLayout2;
        floatingInputLayout2.setLeftImageSize(getResources().getInteger(R.integer.rupee_height), getResources().getInteger(R.integer.rupee_height));
        this.p.setMaxLength(20);
        this.p.getInputField().setPadding(0, 5, 0, 0);
        this.r = (ScrollView) inflate.findViewById(R.id.scrollViewQR);
        this.s = (TextView) inflate.findViewById(R.id.no_vpa_warning_text);
        this.t = (LinearLayout) inflate.findViewById(R.id.outer_layout);
        this.u = (ImageView) inflate.findViewById(R.id.back_arrow);
        this.x = (LinearLayout) inflate.findViewById(R.id.vpa_layout);
        if (this.v == 4) {
            D();
        } else {
            B();
        }
        if (this.v == 5) {
            this.t.setVisibility(8);
        } else {
            this.t.setVisibility(0);
        }
        this.m.setOnItemSelectedListener(new a());
        this.o.getInputField().addTextChangedListener(new bg0(this.o.getInputField(), 1));
        this.p.getInputField().setFilters(new InputFilter[]{new h(this), new InputFilter.LengthFilter(getResources().getInteger(R.integer.maxlength_remark))});
        this.n.setOnClickListener(new b());
        this.u.setOnClickListener(new c());
        this.x.setOnClickListener(new d());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.upi.axispay.custom.LoginPopupFragment.OnLoginCompletionListener
    public void onLoginComplete(boolean z) {
        if (z) {
            B();
        } else {
            B();
        }
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(65, getString(R.string.generate_qr_code));
        super.onResume();
        if (this.v == 5) {
            this.b.o(90, new tg0(getString(R.string.generate_qr_code), false, true, true, false));
        }
        this.o.getTextInputLayout().setHint(getString(R.string.enter_amount_optional));
        y();
    }

    public final void y() {
        LoginPopupFragment loginPopupFragment = this.y;
        if (loginPopupFragment == null || !loginPopupFragment.isVisible()) {
            return;
        }
        this.y.dismiss();
    }
}
