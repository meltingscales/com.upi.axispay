package defpackage;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Product;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.CollectRequest;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import com.upi.axispay.custom.FloatingInputLayout;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: kf0  reason: default package */
/* loaded from: classes.dex */
public class kf0 extends xc0 implements View.OnClickListener, ua0.e {
    public Button l;
    public FloatingInputLayout m;
    public FloatingInputLayout n;
    public LinearLayout o;
    public CheckBox p;
    public ImageView q;
    public TransactionData r;
    public View s;
    public EditText t;
    public LinearLayout u;
    public Spinner v;
    public la0 w;
    public Account x = new Account();

    /* compiled from: AxisPay */
    /* renamed from: kf0$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            kf0 kf0Var = kf0.this;
            kf0Var.x = kf0Var.w.getItem(i);
            kf0.this.r.setAccount(qa0.v().d(kf0.this.x.getVpa()));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: kf0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                jg0.C(kf0.this.getView(), kf0.this.getContext());
                kf0.this.C();
                kf0.this.n.getInputField().setFocusable(true);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: kf0$c */
    /* loaded from: classes.dex */
    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (kf0.this.m.getText().isEmpty()) {
                kf0.this.m.getInputField().setTypeface(null, 1);
                kf0.this.l.setBackgroundResource(R.drawable.background_button_grey_rounded);
                kf0.this.l.setClickable(false);
                kf0.this.l.setEnabled(false);
                return;
            }
            kf0.this.l.setBackgroundResource(R.drawable.background_button_dark_rounded);
            kf0.this.l.setClickable(true);
            kf0.this.l.setEnabled(true);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: kf0$d */
    /* loaded from: classes.dex */
    public class d implements DatePickerDialog.OnDateSetListener {
        public d() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(i, i2, i3);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(5, 1);
            Calendar calendar3 = Calendar.getInstance();
            calendar3.add(5, 45);
            int compareTo = calendar2.compareTo(calendar);
            String a = C0059ao.a(4955);
            if (compareTo >= 0 || calendar3.compareTo(calendar) <= 0) {
                kf0.this.t.setText(jg0.x(calendar.getTime(), a));
                return;
            }
            kf0.this.t.setText(jg0.x(calendar.getTime(), a));
            kf0.this.t.setVisibility(0);
        }
    }

    public static kf0 z(Account account) {
        return new kf0();
    }

    public final String A() {
        return this.t.getText().toString();
    }

    public final void B() {
        TextView textView = (TextView) this.s.findViewById(R.id.err_view);
        FloatingInputLayout floatingInputLayout = (FloatingInputLayout) this.s.findViewById(R.id.edit_amount_input);
        this.m = floatingInputLayout;
        floatingInputLayout.setInputType(6);
        this.m.setLeftImageSize(getResources().getInteger(R.integer.rupee_height), getResources().getInteger(R.integer.rupee_height));
        this.m.getInputField().setTextSize(22.0f);
        FloatingInputLayout floatingInputLayout2 = (FloatingInputLayout) this.s.findViewById(R.id.edit_remark_input);
        this.n = floatingInputLayout2;
        floatingInputLayout2.setMaxLength(20);
        this.n.setInputType(7);
        EditText editText = (EditText) this.s.findViewById(R.id.edit_calender);
        this.t = editText;
        editText.setFocusable(false);
        this.t.setClickable(false);
        Button button = (Button) this.s.findViewById(R.id.button_proceed);
        this.l = button;
        button.setBackgroundResource(R.drawable.background_button_grey_rounded);
        this.l.setClickable(false);
        this.l.setEnabled(false);
        this.o = (LinearLayout) this.s.findViewById(R.id.layout_contact);
        this.p = (CheckBox) this.s.findViewById(R.id.check_select);
        this.q = (ImageView) this.s.findViewById(R.id.calener_click);
    }

    public final void C() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 1);
        DatePickerDialog datePickerDialog = new DatePickerDialog(k(), new d(), calendar.get(1), calendar.get(2), calendar.get(5));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, 44);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.add(5, 1);
        calendar3.add(12, -1);
        datePickerDialog.getDatePicker().setMaxDate(calendar2.getTimeInMillis());
        datePickerDialog.getDatePicker().setMinDate(calendar3.getTimeInMillis());
        datePickerDialog.show();
    }

    public final void D(ArrayList<Account> arrayList) {
        la0 la0Var = this.w;
        if (la0Var == null) {
            this.w = new la0(k(), arrayList);
        } else {
            la0Var.c(arrayList);
        }
        this.v.setAdapter((SpinnerAdapter) this.w);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.button_proceed) {
            if (id == R.id.calener_click) {
                jg0.C(getView(), getContext());
                C();
                return;
            } else if (id != R.id.vpa_layout) {
                return;
            } else {
                this.v.performClick();
                return;
            }
        }
        jg0.C(getView(), getContext());
        Account account = this.r.getAccount();
        BeneVpa beneVpa = this.r.getBeneVpa();
        if (account == null) {
            eg0.A(k(), getString(R.string.select_account));
        } else if (beneVpa == null) {
        } else {
            if (account.getVpa().equals(beneVpa.getVpa())) {
                eg0.A(k(), getString(R.string.sender_receiver_same));
                return;
            }
            Double valueOf = Double.valueOf(0.0d);
            try {
                valueOf = Double.valueOf(Double.parseDouble(jg0.B(this.m.getText())));
                this.r.setAmount(valueOf);
            } catch (Exception unused) {
            }
            if (valueOf.doubleValue() < 1.0d) {
                eg0.A(k(), getString(R.string.enter_amount));
                return;
            }
            if (!TextUtils.isEmpty(this.n.getText())) {
                this.r.setRemarks(this.n.getText());
            } else {
                this.r.setRemarks(getString(R.string.default_remark));
            }
            if (this.p.isChecked()) {
                BeneVpa beneVpa2 = new BeneVpa();
                beneVpa2.setVpa(beneVpa.getVpa());
                beneVpa2.setName(beneVpa.getName());
                beneVpa2.setNickname(beneVpa.getName());
                beneVpa2.setFavorite(C0059ao.a(9755));
                ua0.d().q(new OliveRequest(50, 17, beneVpa2));
            }
            this.r.setTransactionMode(TransactionData.MODE_RECEIVE);
            this.r.setExpiry(A());
            eg0.i(k());
            ua0.d().q(new OliveRequest(50, 11, new CollectRequest(this.r.getAccount(), this.r.getBeneVpa(), this.r.getAmount(), this.r.getRemarks(), A())));
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.s = layoutInflater.inflate(R.layout.fragment_send_money, viewGroup, false);
        B();
        this.l.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.r = qa0.v().L();
        this.v = (Spinner) this.s.findViewById(R.id.spinner_select_account);
        LinearLayout linearLayout = (LinearLayout) this.s.findViewById(R.id.vpa_layout);
        this.u = linearLayout;
        linearLayout.setOnClickListener(this);
        D(qa0.v().h(qa0.c.WITH_VPA));
        this.v.setSelection(this.w.b(this.r.getAccount().getVpa()));
        this.v.setOnItemSelectedListener(new a());
        this.r.setDirection(3);
        BeneVpa beneVpa = this.r.getBeneVpa();
        if (beneVpa != null) {
            ((TextView) this.s.findViewById(R.id.text_receiver_title)).setText(jg0.g(beneVpa.getName()));
            ((TextView) this.s.findViewById(R.id.text_receiver_vpa)).setText(jg0.j(beneVpa.getVpa()));
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.add(5, 1);
        String x = jg0.x(calendar.getTime(), C0059ao.a(9756));
        this.t.setText(x);
        this.t.setVisibility(0);
        this.t.setOnFocusChangeListener(new b());
        this.r.setExpiry(x);
        this.m.getInputField().addTextChangedListener(new bg0(this.m.getInputField(), 1));
        this.m.getInputField().addTextChangedListener(new c());
        return this.s;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            if (oliveRequest.getRequestType() != 11) {
                eg0.B();
            } else {
                this.b.o(301, null);
                this.r.setTransactionId(OliveUpiManager.getInstance(k()).getLastTransactionId());
                this.r.setTransactionDate(A());
                if (result.getData() != null) {
                    this.r.setRefid(result.getData().toString());
                } else {
                    this.r.setRefid(OliveUpiManager.getInstance(k()).getLastTransactionId());
                }
                eg0.B();
                eg0.A(k(), result.getResult());
                this.r.setTransactionStatus(1);
                this.r.setTransactionNote(result.toString());
                TransactionData transactionData = this.r;
                transactionData.setRemitterName(transactionData.getAccount().getName());
                TransactionData transactionData2 = this.r;
                transactionData2.setBeneficiaryName(transactionData2.getBeneVpa().getName());
                qa0.v().u0(this.r);
                if (this.b == null) {
                    this.b = (MainActivity) k();
                }
                this.b.t(24, null);
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(50, getString(R.string.request_money_upi_id));
        super.onResume();
        ua0.e(k()).u(this);
        this.r.getBeneVpa();
        this.r.setDirection(3);
        if (TransactionData.isSelectedFromList()) {
            this.o.setVisibility(8);
            this.p.setChecked(false);
            return;
        }
        this.o.setVisibility(0);
        this.p.setChecked(true);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType != 11) {
            if (requestType != 17) {
                return;
            }
            ah0.c(k(), C0059ao.a(9757), new HashMap());
            ua0.d().j(true, new OliveRequest(50, 18, null));
            return;
        }
        if (result.getData() != null) {
            this.r.setTransactionId(result.getData().toString());
            this.r.setRefid(result.getData().toString());
        } else {
            this.r.setTransactionId(OliveUpiManager.getInstance(k()).getLastTransactionId());
        }
        this.r.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(9758)));
        this.r.setExpiry(A());
        this.r.setTransactionStatus(2);
        qa0.v().u0(this.r);
        this.b.o(301, null);
        if (this.b == null) {
            this.b = (MainActivity) k();
        }
        n70.a aVar = n70.f;
        n70 a2 = aVar.a();
        n70 a3 = aVar.a();
        String a4 = C0059ao.a(9759);
        a2.v(a4, a3.j(a4) + 1);
        aVar.a().A(C0059ao.a(9760), false);
        eg0.B();
        this.b.t(24, null);
        this.m.getInputField().getText().clear();
        boolean Q = qa0.v().Q();
        String a5 = C0059ao.a(9761);
        String a6 = C0059ao.a(9762);
        String a7 = C0059ao.a(9763);
        if (Q) {
            HashMap hashMap = new HashMap();
            hashMap.put(a7, getString(R.string.request_money_upi_id));
            hashMap.put(a6, jg0.l(this.r.getAmount()));
            hashMap.put(a5, jg0.n(this.r.getAccount().getBankName()));
            z k = k();
            String a8 = C0059ao.a(9764);
            ah0.d(k, a8, hashMap, true);
            String obj = result.getData().toString();
            Product product = new Product();
            product.setPrice(this.r.getAmount().doubleValue());
            product.setId(obj);
            ah0.e(k(), a8, product, hashMap);
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(a7, getString(R.string.request_money_upi_id));
        hashMap2.put(a6, jg0.l(this.r.getAmount()));
        hashMap2.put(a5, jg0.n(this.r.getAccount().getBankName()));
        z k2 = k();
        String a9 = C0059ao.a(9765);
        ah0.c(k2, a9, hashMap2);
        String obj2 = result.getData().toString();
        Product product2 = new Product();
        product2.setPrice(this.r.getAmount().doubleValue());
        product2.setId(obj2);
        ah0.e(k(), a9, product2, hashMap2);
    }
}
