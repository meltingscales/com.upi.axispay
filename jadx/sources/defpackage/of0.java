package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.material.textfield.TextInputLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.BeneVpaBlock;
import com.olive.upi.transport.model.Collectbeneblock;
import com.olive.upi.transport.model.LimitCheckReq;
import com.olive.upi.transport.model.Payee;
import com.olive.upi.transport.model.PendingReqVo;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import com.upi.axispay.custom.FloatingInputLayout;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: of0  reason: default package */
/* loaded from: classes.dex */
public class of0 extends xc0 implements View.OnClickListener, ua0.e {
    public static Account G;
    public TextView A;
    public String B;
    public LinearLayout C;
    public Spinner D;
    public la0 E;
    public Account F;
    public TransactionData l;
    public String m;
    public String n;
    public String o;
    public int p;
    public BeneVpa q;
    public CheckBox r;
    public View s;
    public LinearLayout t;
    public FloatingInputLayout u;
    public FloatingInputLayout v;
    public EditText w;
    public TextInputLayout x;
    public Button y;
    public Button z;

    /* compiled from: AxisPay */
    /* renamed from: of0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            of0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            of0.this.J();
            of0.this.I();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            of0.this.b.o(11, null);
            of0.this.J();
            of0 of0Var = of0.this;
            of0Var.b.t(118, of0Var.l.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            of0.this.H();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            of0.this.b.o(11, null);
            of0 of0Var = of0.this;
            of0Var.b.t(118, of0Var.l.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            of0.this.b.o(11, null);
            of0.this.b.t(21, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            TransactionData transactionData = of0.this.l;
            transactionData.setAmount(transactionData.getEditedAmount());
            TransactionData transactionData2 = of0.this.l;
            transactionData2.setRemarks(transactionData2.getEditedRemarks());
            of0.this.l.setIsfromSendMoney(true);
            qa0.v().u0(of0.this.l);
            of0.this.b.t(24, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$h */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            of0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$i */
    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public i(Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            of0.this.b.o(11, null);
            this.b.hide();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$j */
    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public j(Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            of0.this.b.o(11, null);
            this.b.hide();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$k */
    /* loaded from: classes.dex */
    public class k implements TextWatcher {
        public k() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (of0.this.u.getText().toString().isEmpty()) {
                of0.this.u.getInputField().setTypeface(null, 1);
                of0.this.y.setBackgroundResource(R.drawable.background_button_grey_rounded);
                of0.this.y.setClickable(false);
                of0.this.y.setEnabled(false);
                return;
            }
            of0.this.y.setBackgroundResource(R.drawable.background_button_dark_rounded);
            of0.this.y.setClickable(true);
            of0.this.y.setEnabled(true);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$l */
    /* loaded from: classes.dex */
    public class l implements AdapterView.OnItemSelectedListener {
        public l() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            of0 of0Var = of0.this;
            of0Var.F = of0Var.E.getItem(i);
            of0.this.l.setAccount(qa0.v().d(of0.this.F.getVpa()));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$m */
    /* loaded from: classes.dex */
    public class m implements View.OnClickListener {
        public final /* synthetic */ PendingReqVo b;

        /* compiled from: AxisPay */
        /* renamed from: of0$m$a */
        /* loaded from: classes.dex */
        public class a implements View.OnClickListener {
            public a(m mVar) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                eg0.c();
            }
        }

        public m(PendingReqVo pendingReqVo) {
            this.b = pendingReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ua0.e(of0.this.k()).q(new OliveRequest(9, 29, this.b));
            eg0.n(of0.this.k(), of0.this.getString(R.string.request_successfully_decline), new a(this));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$n */
    /* loaded from: classes.dex */
    public class n implements View.OnClickListener {
        public final /* synthetic */ PendingReqVo b;

        public n(PendingReqVo pendingReqVo) {
            this.b = pendingReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            of0.this.C(this.b.getTxnid(), this.b.getPayeeVpa());
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$o */
    /* loaded from: classes.dex */
    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            of0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$p */
    /* loaded from: classes.dex */
    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            of0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$q */
    /* loaded from: classes.dex */
    public class q implements View.OnClickListener {
        public final /* synthetic */ Dialog b;
        public final /* synthetic */ RadioGroup c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* compiled from: AxisPay */
        /* renamed from: of0$q$a */
        /* loaded from: classes.dex */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                eg0.c();
                String charSequence = ((RadioButton) q.this.b.findViewById(q.this.c.getCheckedRadioButtonId())).getText().toString();
                ArrayList arrayList = new ArrayList();
                q qVar = q.this;
                arrayList.add(new BeneVpaBlock(qVar.d, C0059ao.a(5663), qVar.e, charSequence));
                ua0.e(of0.this.k()).q(new OliveRequest(9, 52, arrayList));
            }
        }

        public q(Dialog dialog, RadioGroup radioGroup, String str, String str2) {
            this.b = dialog;
            this.c = radioGroup;
            this.d = str;
            this.e = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            this.b.dismiss();
            eg0.n(of0.this.k(), of0.this.getString(R.string.decline_and_block), new a());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$r */
    /* loaded from: classes.dex */
    public class r implements View.OnClickListener {
        public final /* synthetic */ Dialog b;
        public final /* synthetic */ RadioGroup c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* compiled from: AxisPay */
        /* renamed from: of0$r$a */
        /* loaded from: classes.dex */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                eg0.c();
                String charSequence = ((RadioButton) r.this.b.findViewById(r.this.c.getCheckedRadioButtonId())).getText().toString();
                ArrayList arrayList = new ArrayList();
                r rVar = r.this;
                arrayList.add(new BeneVpaBlock(rVar.d, C0059ao.a(8137), rVar.e, charSequence));
                ua0.e(of0.this.k()).q(new OliveRequest(9, 52, arrayList));
            }
        }

        public r(Dialog dialog, RadioGroup radioGroup, String str, String str2) {
            this.b = dialog;
            this.c = radioGroup;
            this.d = str;
            this.e = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            this.b.dismiss();
            eg0.n(of0.this.k(), of0.this.getString(R.string.decline_and_block), new a());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: of0$s */
    /* loaded from: classes.dex */
    public class s implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public s(of0 of0Var, Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.hide();
        }
    }

    public of0() {
        String a2 = C0059ao.a(12636);
        this.m = a2;
        this.n = a2;
        this.o = a2;
        new ArrayList();
        this.F = new Account();
    }

    public static of0 G(Account account) {
        G = account;
        return new of0();
    }

    public void C(String str, String str2) {
        Dialog dialog = new Dialog(k(), R.style.Theme_Dialog);
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(R.layout.dialog_decline_block);
        dialog.getWindow().setLayout(-1, -2);
        RadioGroup radioGroup = (RadioGroup) dialog.findViewById(R.id.radiogroupblock);
        Button button = (Button) dialog.findViewById(R.id.button_block);
        Button button2 = (Button) dialog.findViewById(R.id.button_block1);
        button.setOnClickListener(new q(dialog, radioGroup, str, str2));
        button2.setOnClickListener(new r(dialog, radioGroup, str, str2));
        ((ImageView) dialog.findViewById(R.id.cancel)).setOnClickListener(new s(this, dialog));
        dialog.setCancelable(false);
        dialog.show();
    }

    public void D() {
        Double editedAmount = this.l.getEditedAmount();
        if (editedAmount == null) {
            editedAmount = Double.valueOf(0.0d);
        }
        if (this.l.getAmount() != null && this.l.getAmount().doubleValue() != 0.0d && this.l.getAmount().doubleValue() != 0.0d) {
            if (editedAmount.doubleValue() == 0.0d) {
                this.u.setText(String.valueOf(this.l.getAmount()));
            } else {
                this.u.setText(String.valueOf(editedAmount));
            }
            if (this.l.getAmount() != null && this.l.getAmount().doubleValue() >= 0.0d && this.l.getMinimumAmount().doubleValue() == 0.0d) {
                this.u.getEditText().setEnabled(false);
            } else if (Double.compare(this.l.getAmount().doubleValue(), this.l.getMinimumAmount().doubleValue()) == 0) {
                this.u.getEditText().setEnabled(false);
            } else {
                this.u.getEditText().setEnabled(true);
            }
        } else {
            this.u.getEditText().setEnabled(true);
            if (this.l.getMinimumAmount().doubleValue() != 0.0d) {
                if (editedAmount.doubleValue() == 0.0d) {
                    this.u.setText(String.valueOf(this.l.getMinimumAmount()));
                } else {
                    this.u.setText(String.valueOf(editedAmount));
                }
            }
        }
        if (TextUtils.isEmpty(this.l.getRemarks())) {
            this.w.setEnabled(true);
            return;
        }
        if (this.l.getTransactionMode() == TransactionData.MODE_BHARAT_QR_PAY) {
            String remarks = this.l.getRemarks();
            String a2 = C0059ao.a(12637);
            if (remarks.startsWith(a2)) {
                this.w.setEnabled(true);
                String replace = this.l.getRemarks().replace(a2, C0059ao.a(12638));
                if (!TextUtils.isEmpty(this.l.getEditedRemarks())) {
                    this.w.setText(this.l.getEditedRemarks());
                    return;
                } else {
                    this.w.setText(replace);
                    return;
                }
            }
        }
        this.w.setEnabled(false);
        if (TextUtils.isEmpty(this.l.getEditedRemarks())) {
            this.w.setText(this.l.getRemarks());
        } else {
            this.w.setText(this.l.getEditedRemarks());
        }
    }

    public final void E() {
        if (this.l.getAccount() == null) {
            eg0.n(k(), String.format(getString(R.string.requested_id_doesnt_exist), this.l.getRemitterVpa()), new h());
            return;
        }
        OliveRequest oliveRequest = new OliveRequest(9, 510, this.l);
        oliveRequest.setClMode(6);
        ua0.d().q(oliveRequest);
    }

    public final void F() {
        if (this.l.getTransactionMode() == TransactionData.MODE_COLLECT_NOTIFICATION) {
            E();
            eg0.i(k());
        } else if (this.v.getVisibility() == 8) {
            eg0.i(k());
            OliveRequest oliveRequest = new OliveRequest(9, 510, this.l);
            oliveRequest.setClMode(5);
            ua0.d().q(oliveRequest);
        } else {
            boolean isEmpty = this.v.getText().toString().isEmpty();
            String a2 = C0059ao.a(12639);
            if (isEmpty) {
                this.l.setEnTips(a2);
                this.l.setTipAmount(Double.valueOf(0.0d));
                eg0.i(k());
                TransactionData transactionData = this.l;
                transactionData.setAmount(Double.valueOf(transactionData.getAmount().doubleValue() + this.l.getTipAmount().doubleValue()));
                OliveRequest oliveRequest2 = new OliveRequest(9, 510, this.l);
                oliveRequest2.setClMode(5);
                ua0.d().q(oliveRequest2);
                return;
            }
            double parseDouble = Double.parseDouble(this.v.getText());
            String.format(C0059ao.a(12640), Double.valueOf(parseDouble));
            if (parseDouble >= 0.0d && parseDouble < 100000.0d) {
                this.l.setEnTips(a2);
                this.l.setTipAmount(Double.valueOf(this.v.getText()));
                TransactionData transactionData2 = this.l;
                transactionData2.setAmount(Double.valueOf(transactionData2.getAmount().doubleValue() + this.l.getTipAmount().doubleValue()));
                eg0.i(k());
                OliveRequest oliveRequest3 = new OliveRequest(9, 510, this.l);
                oliveRequest3.setClMode(5);
                ua0.d().q(oliveRequest3);
                return;
            }
            eg0.m((Activity) requireContext(), C0059ao.a(12641));
        }
    }

    public final void H() {
        jg0.C(this.u, getContext());
        if (this.l.getBeneVpa() != null) {
            if (this.l.getAccount() == null) {
                if (M()) {
                    Toast.makeText(this.c, C0059ao.a(12642), 0).show();
                    return;
                }
                return;
            }
            String vpa = this.l.getAccount().getVpa();
            String vpa2 = this.l.getBeneVpa().getVpa();
            if (vpa.equals(vpa2)) {
                eg0.m(k(), getString(R.string.sender_receiver_same));
                return;
            } else if (qa0.v().P(vpa2)) {
                eg0.m(k(), getString(R.string.vpa_blocked));
                return;
            } else if (M()) {
                if (this.r.isChecked()) {
                    BeneVpa beneVpa = new BeneVpa();
                    beneVpa.setVpa(this.q.getVpa());
                    beneVpa.setName(this.q.getName());
                    beneVpa.setNickname(this.q.getName());
                    beneVpa.setFavorite(C0059ao.a(12643));
                    ua0.d().q(new OliveRequest(9, 17, beneVpa));
                }
                this.z.setVisibility(0);
                this.u.getEditText().setEnabled(false);
                this.w.setEnabled(false);
                this.D.setEnabled(false);
                this.C.setEnabled(false);
                this.r.setEnabled(false);
                return;
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public final void I() {
        if (this.l.getTransactionMode() == TransactionData.MODE_MERCHANT_PAY) {
            Intent intent = new Intent();
            intent.putExtra(C0059ao.a(12644), jg0.r(this.l));
            k().setResult(-1, intent);
            n70.f.a().v(C0059ao.a(12645), 0);
            k().finish();
        }
    }

    public final void J() {
        if (TextUtils.isEmpty(this.l.getRemitterVpa())) {
            return;
        }
        Account account = this.l.getAccount();
        account.setVpa(account.getVpa().toLowerCase());
    }

    public void K(String str) {
        eg0.B();
        Dialog dialog = new Dialog(k(), R.style.Theme_Dialog);
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(R.layout.dialog_fl_fp);
        dialog.getWindow().setLayout(-1, -2);
        TextView textView = (TextView) dialog.findViewById(R.id.dialog_message);
        ((TextView) dialog.findViewById(R.id.dialog_server_message)).setText(str);
        dialog.setCancelable(true);
        dialog.show();
        ((Button) dialog.findViewById(R.id.button_ok)).setOnClickListener(new i(dialog));
        ((ImageView) dialog.findViewById(R.id.dialog_close)).setOnClickListener(new j(dialog));
    }

    public final void L(ArrayList<Account> arrayList) {
        la0 la0Var = this.E;
        if (la0Var == null) {
            this.E = new la0(k(), arrayList);
        } else {
            la0Var.c(arrayList);
        }
        this.D.setAdapter((SpinnerAdapter) this.E);
    }

    public final boolean M() {
        Double d2;
        Double minimumAmount = this.l.getMinimumAmount();
        Double valueOf = Double.valueOf(0.0d);
        try {
            d2 = Double.valueOf(Double.parseDouble(jg0.B(this.u.getText())));
        } catch (Exception unused) {
            d2 = valueOf;
        }
        try {
            valueOf = Double.valueOf(Double.parseDouble(jg0.B(this.v.getText())));
        } catch (Exception unused2) {
        }
        if (!TextUtils.isEmpty(this.v.getText())) {
            if (valueOf.doubleValue() == 0.0d) {
                eg0.m(k(), getString(R.string.enter_amount));
                return false;
            } else if (valueOf.doubleValue() < 1.0d) {
                eg0.m(k(), getString(R.string.amount_validation_text));
                return false;
            }
        }
        if (d2.doubleValue() == 0.0d) {
            eg0.m(k(), getString(R.string.enter_amount));
            return false;
        } else if (d2.doubleValue() < 1.0d) {
            eg0.m(k(), getString(R.string.amount_validation_text));
            return false;
        } else {
            if ((this.l.getTransactionMode() == TransactionData.MODE_QR_PAY || this.l.getTransactionMode() == TransactionData.MODE_COLLECT_NOTIFICATION || this.l.getTransactionMode() == TransactionData.MODE_BHARAT_QR_PAY || this.l.getTransactionMode() == TransactionData.MODE_SEND || this.l.getTransactionMode() == TransactionData.MODE_MERCHANT_PAY) && this.l.getMinimumAmount() != null && this.l.getAmount() != null) {
                if (this.l.getAmount().doubleValue() > 0.0d && this.l.getMinimumAmount().doubleValue() > 0.0d) {
                    int compare = Double.compare(d2.doubleValue(), minimumAmount.doubleValue());
                    String a2 = C0059ao.a(12646);
                    if (compare < 0) {
                        z k2 = k();
                        eg0.m(k2, a2 + minimumAmount + C0059ao.a(12647) + this.l.getAmount() + C0059ao.a(12648));
                        return false;
                    } else if (Double.compare(d2.doubleValue(), this.l.getAmount().doubleValue()) > 0) {
                        z k3 = k();
                        eg0.m(k3, a2 + minimumAmount + C0059ao.a(12649) + this.l.getAmount());
                        return false;
                    }
                }
                if (this.l.getAmount().doubleValue() == 0.0d && this.l.getMinimumAmount().doubleValue() > 0.0d && Double.compare(d2.doubleValue(), minimumAmount.doubleValue()) < 0) {
                    z k4 = k();
                    eg0.m(k4, C0059ao.a(12650) + this.l.getMinimumAmount());
                    return false;
                }
            }
            if (!TextUtils.isEmpty(this.w.getText())) {
                String obj = this.w.getText().toString();
                this.B = obj;
                this.l.setEditedRemarks(obj);
            } else {
                this.l.setEditedRemarks(getString(R.string.default_remark));
            }
            try {
                Double valueOf2 = Double.valueOf(Double.parseDouble(this.u.getText()));
                if (this.l.isFromIntent()) {
                    String mcc = this.l.getMcc();
                    String a3 = C0059ao.a(12651);
                    if (mcc != null && this.l.getMcc().equals(C0059ao.a(12652))) {
                        if (this.l.getQrMedium() != null && valueOf2.doubleValue() > TransportConstants.MAX_AMOUNT_ALLOWED.doubleValue()) {
                            z zVar = this.c;
                            eg0.n(zVar, a3 + TransportConstants.MAX_AMOUNT_ALLOWED + C0059ao.a(12653), new o());
                            return false;
                        }
                    } else if (((!TextUtils.isEmpty(this.l.getIsVerified()) && !this.l.getIsVerified().equalsIgnoreCase(C0059ao.a(12654))) || this.l.getIsVerified() == null) && this.l.getQrMedium() != null && valueOf2.doubleValue() > TransportConstants.MAX_AMOUNT_ALLOWED.doubleValue()) {
                        z zVar2 = this.c;
                        eg0.n(zVar2, a3 + TransportConstants.MAX_AMOUNT_ALLOWED + C0059ao.a(12655), new p());
                        return false;
                    }
                }
                this.l.setEditedAmount(valueOf2);
            } catch (Exception unused3) {
            }
            this.l.setCuurentTime(new SimpleDateFormat(C0059ao.a(12656), Locale.getDefault()).format(new Date()));
            qa0.v().u0(this.l);
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_appr /* 2131362001 */:
                if (qa0.v().P(this.l.getBeneVpa().getVpa())) {
                    eg0.m(k(), getString(R.string.upiid_blocked));
                    return;
                } else {
                    H();
                    return;
                }
            case R.id.button_conf /* 2131362010 */:
                LimitCheckReq limitCheckReq = new LimitCheckReq();
                limitCheckReq.setAc(G);
                limitCheckReq.setDevice(c70.d(k()));
                Payee payee = new Payee();
                payee.setBeneVpa(this.q.getVpa());
                payee.setBamount(jg0.B(this.u.getText().toString()));
                ArrayList arrayList = new ArrayList();
                arrayList.add(payee);
                limitCheckReq.setPayees(arrayList);
                limitCheckReq.setAmount(jg0.B(this.u.getText().toString()));
                OliveUpiManager.getInstance(k()).verifyLimit(new OliveRequest(9, 98, limitCheckReq));
                return;
            case R.id.button_decl /* 2131362013 */:
                PendingReqVo pendingReqVo = new PendingReqVo();
                pendingReqVo.setAmount(String.valueOf(this.l.getAmount()));
                pendingReqVo.setPayeevpa(this.l.getBeneVpa().getVpa());
                pendingReqVo.setTxnid(this.l.getTransactionId());
                pendingReqVo.setPayerVpa(this.l.getRemitterVpa());
                pendingReqVo.setRefid(this.l.getRefid());
                pendingReqVo.setNotes(this.l.getRemarks());
                eg0.r(k(), getString(R.string.decline), getString(R.string.transaction_decline_confirmation), getString(R.string.decline), new m(pendingReqVo), getString(R.string.decline_block), new n(pendingReqVo));
                return;
            case R.id.button_proceed /* 2131362031 */:
                break;
            case R.id.invoice /* 2131362381 */:
                this.b.t(69, this.l.getInvoiceUrl());
                break;
            case R.id.vpa_layout /* 2131363168 */:
                this.D.performClick();
                return;
            default:
                return;
        }
        H();
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i2, Object obj) {
        if (i2 == 10) {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(9, 10, obj));
        } else if (i2 != 24) {
        } else {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(9, 24, obj));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.new_send_money_fragment, viewGroup, false);
        this.s = inflate;
        this.t = (LinearLayout) inflate.findViewById(R.id.layout_contact);
        LinearLayout linearLayout = (LinearLayout) this.s.findViewById(R.id.layout_collect);
        this.v = (FloatingInputLayout) this.s.findViewById(R.id.edit_tip_input);
        TextView textView = (TextView) this.s.findViewById(R.id.err_view);
        FloatingInputLayout floatingInputLayout = (FloatingInputLayout) this.s.findViewById(R.id.edit_amount_input);
        this.u = floatingInputLayout;
        floatingInputLayout.setInputType(6);
        this.v.setInputType(6);
        this.u.setLeftImageSize(getResources().getInteger(R.integer.rupee_height), getResources().getInteger(R.integer.rupee_height));
        this.u.getInputField().setTextSize(22.0f);
        this.w = (EditText) this.s.findViewById(R.id.edit_remark);
        this.x = (TextInputLayout) this.s.findViewById(R.id.remarks_layout);
        this.y = (Button) this.s.findViewById(R.id.button_proceed);
        this.z = (Button) this.s.findViewById(R.id.button_conf);
        this.y.setBackgroundResource(R.drawable.background_button_grey_rounded);
        this.y.setClickable(false);
        this.y.setEnabled(false);
        this.A = (TextView) this.s.findViewById(R.id.invoice);
        TextView textView2 = (TextView) this.s.findViewById(R.id.pay_title);
        Button button = (Button) this.s.findViewById(R.id.button_decl);
        Button button2 = (Button) this.s.findViewById(R.id.button_appr);
        this.r = (CheckBox) this.s.findViewById(R.id.check_select);
        this.D = (Spinner) this.s.findViewById(R.id.spinner_select_account);
        this.C = (LinearLayout) this.s.findViewById(R.id.vpa_layout);
        TransactionData L = qa0.v().L();
        this.l = L;
        String enTips = L.getEnTips();
        String a2 = C0059ao.a(12657);
        if (enTips != null) {
            this.v.setVisibility(0);
            if (this.v.getText().toString().isEmpty()) {
                this.v.getInputField().setTypeface(null, 1);
                this.y.setBackgroundResource(R.drawable.background_button_grey_rounded);
                this.y.setClickable(false);
                this.y.setEnabled(false);
            } else {
                this.y.setBackgroundResource(R.drawable.background_button_dark_rounded);
                this.y.setClickable(true);
                this.y.setEnabled(true);
                this.l.setEnTips(a2);
                this.l.setEdittipamount(this.v.getText().toString());
            }
        } else {
            this.v.setVisibility(8);
        }
        this.C.setOnClickListener(this);
        this.y.setOnClickListener(this);
        this.z.setOnClickListener(this);
        button2.setOnClickListener(this);
        button.setOnClickListener(this);
        if (this.l.getTransactionMode() != TransactionData.MODE_QR_PAY && this.l.getTransactionMode() != TransactionData.MODE_SEND_VIA_IFSC && this.l.getTransactionMode() != TransactionData.MODE_BHARAT_QR_PAY && this.l.getTransactionMode() != TransactionData.MODE_MERCHANT_PAY) {
            if (this.l.getTransactionMode() == TransactionData.MODE_COLLECT_NOTIFICATION) {
                linearLayout.setVisibility(0);
                if (!TextUtils.isEmpty(this.l.getMerchantflag()) && this.l.getMerchantflag().equalsIgnoreCase(a2)) {
                    this.x.setVisibility(0);
                } else {
                    this.x.setVisibility(8);
                }
                this.y.setVisibility(8);
            } else {
                this.l.setTransactionMode(TransactionData.MODE_SEND);
                linearLayout.setVisibility(8);
                this.y.setVisibility(0);
            }
        }
        this.u.getInputField().addTextChangedListener(new bg0(this.u.getEditText(), 1));
        this.u.getInputField().setTypeface(null, 1);
        this.u.getInputField().addTextChangedListener(new k());
        this.v.getInputField().addTextChangedListener(new bg0(this.v.getEditText(), 1));
        this.v.getInputField().setTypeface(null, 1);
        String merchantflag = this.l.getMerchantflag();
        if (!TextUtils.isEmpty(merchantflag) && merchantflag.equalsIgnoreCase(C0059ao.a(12658))) {
            this.A.setVisibility(0);
        } else {
            this.A.setVisibility(8);
        }
        this.A.setOnClickListener(this);
        L(qa0.v().h(qa0.c.ACTIVE_VPA));
        Account account = this.l.getAccount();
        if (this.l.getAccount() != null && !TextUtils.isEmpty(account.getVpa())) {
            this.D.setSelection(this.E.b(this.l.getAccount().getVpa()));
        }
        this.D.setOnItemSelectedListener(new l());
        return this.s;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            String code = result != null ? result.getCode() : C0059ao.a(12659);
            if (this.b == null) {
                this.b = (MainActivity) k();
            }
            int requestType = oliveRequest.getRequestType();
            if (requestType != 10) {
                if (requestType == 17) {
                    eg0.B();
                    ah0.c(k(), C0059ao.a(12660), new HashMap());
                } else if (requestType != 24) {
                    if (requestType == 29) {
                        eg0.B();
                        eg0.m(k(), result.getResult());
                        this.b.o(11, null);
                    } else if (requestType == 52) {
                        eg0.B();
                        eg0.m(k(), result.getResult());
                        this.b.o(11, null);
                    } else if (requestType != 98) {
                        eg0.B();
                    } else {
                        Toast.makeText(this.c, result.getResult().toString(), 0).show();
                    }
                }
            }
            this.b.o(301, null);
            String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
            this.l.setTransactionId(lastTransactionId);
            if (result.getData() != null) {
                String obj = result.getData().toString();
                this.l.setRefid(obj);
                this.l.setApprovalRefNo(obj);
            } else {
                this.l.setRefid(lastTransactionId);
            }
            this.l.setResponseCode(code);
            this.l.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(12661)));
            this.l.setTransactionStatus(1);
            this.l.setDescription(result.getResult());
            qa0.v().u0(this.l);
            if (code.equals(C0059ao.a(12662))) {
                eg0.B();
                if (this.l.getTransactionMode() == TransactionData.MODE_MERCHANT_PAY) {
                    eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_wrong_pin), getString(R.string.okay), new b());
                    return;
                }
                this.l.setTransactionId(null);
                eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.fail_text), getString(R.string.reset_upi_pin).toUpperCase(), new c(), getString(R.string.retry).toUpperCase(), new d(), true);
                return;
            } else if (code.equals(C0059ao.a(12663))) {
                J();
                eg0.B();
                eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_max_retry), getString(R.string.okay), new e());
                return;
            } else if (code.equalsIgnoreCase(C0059ao.a(12664))) {
                K(TransportConstants.FLRESPDESC);
                return;
            } else if (code.equalsIgnoreCase(C0059ao.a(12665))) {
                K(TransportConstants.FPRESPDESC);
                return;
            } else if (code.equals(C0059ao.a(12666))) {
                TransactionData transactionData = this.l;
                transactionData.setAmount(transactionData.getEditedAmount());
                TransactionData transactionData2 = this.l;
                transactionData2.setRemarks(transactionData2.getEditedRemarks());
                eg0.B();
                J();
                eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.insufficient_text), getString(R.string.check_balance).toUpperCase(), new f(), getString(R.string.ok_text), new g(), true);
                return;
            } else {
                J();
                TransactionData transactionData3 = this.l;
                transactionData3.setAmount(transactionData3.getEditedAmount());
                TransactionData transactionData4 = this.l;
                transactionData4.setRemarks(transactionData4.getEditedRemarks());
                this.l.setIsfromSendMoney(true);
                qa0.v().u0(this.l);
                this.b.t(24, null);
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ua0.e(k()).u(this);
        ArrayList<Collectbeneblock> q2 = qa0.v().q();
        this.q = this.l.getBeneVpa();
        if (q2 == null || (q2.size() == 0 && this.h)) {
            ua0.d().a(false, new OliveRequest(9, 53, null, true));
        }
        TransactionData L = qa0.v().L();
        this.l = L;
        this.p = L.getTransactionMode();
        if (this.l.getMinimumAmount() == null) {
            this.l.setMinimumAmount(Double.valueOf(0.0d));
        }
        int i2 = this.p;
        int i3 = TransactionData.MODE_SEND;
        String a2 = C0059ao.a(12667);
        if (i2 == i3) {
            this.b.o(90, new tg0(getString(R.string.send_money_via_upi), false, true, true, false));
            this.m = getString(R.string.send_money_via_upi);
            this.n = getString(R.string.send_money_amount);
            if (qa0.v().f(this.q.getVpa()) != null) {
                this.r.setChecked(false);
                this.t.setVisibility(8);
            } else {
                this.r.setChecked(true);
                this.t.setVisibility(0);
            }
            this.o = a2;
        } else if (i2 == TransactionData.MODE_SEND_VIA_IFSC) {
            this.b.o(90, new tg0(getString(R.string.send_money_via_ifsc), false, true, true, false));
            this.m = getString(R.string.send_money_via_ifsc);
            this.n = getString(R.string.send_money_ifsc_amount);
            this.o = C0059ao.a(12668);
        } else if (i2 != TransactionData.MODE_QR_PAY && i2 != TransactionData.MODE_BHARAT_QR_PAY) {
            if (i2 == TransactionData.MODE_MERCHANT_PAY) {
                this.b.o(90, new tg0(getString(R.string.send_money_merchant), false, true, true, false));
                this.m = getString(R.string.send_money_merchant);
                this.n = getString(R.string.intent_amount);
                this.o = a2;
                this.r.setChecked(false);
                this.t.setVisibility(8);
            } else {
                int i4 = TransactionData.MODE_COLLECT_NOTIFICATION;
                String a3 = C0059ao.a(12669);
                if (i2 == i4) {
                    this.b.o(90, new tg0(getString(R.string.send_money_via_upi), false, true, false, false));
                    this.m = getString(R.string.pending_request);
                    if (qa0.v().f(this.q.getVpa()) != null) {
                        this.r.setChecked(false);
                        this.t.setVisibility(8);
                    } else {
                        this.r.setChecked(true);
                        this.t.setVisibility(0);
                    }
                    this.o = a3;
                    this.n = getString(R.string.pending_enter_amount);
                } else {
                    this.b.o(90, new tg0(getString(R.string.pending_requests), false, true, false, false));
                    this.m = getString(R.string.pending_request);
                    this.o = a3;
                    this.n = getString(R.string.pending_enter_amount);
                }
            }
        } else {
            this.b.o(90, new tg0(getString(R.string.scan_pay), false, true, true, false));
            this.n = getString(R.string.qrpay_amount);
            this.m = getString(R.string.scan_pay);
            this.o = C0059ao.a(12670);
            this.r.setChecked(false);
            this.t.setVisibility(8);
        }
        if (this.q != null) {
            ((TextView) this.s.findViewById(R.id.text_receiver_title)).setText(jg0.g(this.q.getName()));
            ((TextView) this.s.findViewById(R.id.text_receiver_vpa)).setText(jg0.j(this.q.getVpa()));
            if (TextUtils.isEmpty(this.q.getName())) {
                this.q.getVpa();
            }
        }
        this.l.setDirection(1);
        if (this.l.getTransactionMode() == TransactionData.MODE_QR_PAY || this.l.getTransactionMode() == TransactionData.MODE_COLLECT_NOTIFICATION || this.l.getTransactionMode() == TransactionData.MODE_BHARAT_QR_PAY || this.l.getTransactionMode() == TransactionData.MODE_MERCHANT_PAY) {
            D();
        }
        v(9, this.m);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType != -100) {
            String a2 = C0059ao.a(12671);
            String a3 = C0059ao.a(12672);
            String a4 = C0059ao.a(12673);
            if (requestType != 10) {
                if (requestType == 15) {
                    eg0.B();
                    Account d2 = qa0.v().d(this.l.getRemitterVpa());
                    this.l.setAccount(d2);
                    if (d2 != null) {
                        ((TextView) this.s.findViewById(R.id.text_sender_vpa)).setText(d2.getVpa());
                        return;
                    } else {
                        eg0.n(k(), String.format(getString(R.string.requested_id_doesnt_exist), this.l.getRemitterVpa()), new a());
                        return;
                    }
                } else if (requestType == 17) {
                    eg0.B();
                    eg0.A(k(), getString(R.string.contacts_saved));
                    ah0.c(k(), C0059ao.a(12676), new HashMap());
                    ua0.d().j(true, new OliveRequest(9, 18, null));
                    return;
                } else if (requestType != 24) {
                    String a5 = C0059ao.a(12674);
                    if (requestType != 29) {
                        if (requestType == 52) {
                            eg0.B();
                            eg0.m(k(), result.getResult());
                            this.b.o(11, null);
                            return;
                        } else if (requestType != 98) {
                            if (oliveRequest.getInitiator() == 9) {
                                eg0.B();
                                return;
                            }
                            return;
                        } else if (result.code.equalsIgnoreCase(a5)) {
                            F();
                            return;
                        } else {
                            Toast.makeText(this.c, result.getResult().toString(), 0).show();
                            return;
                        }
                    }
                    eg0.B();
                    eg0.m(k(), getString(R.string.notification_reject_success));
                    this.b.o(301, null);
                    if (result.getCode().equals(a5)) {
                        qa0.v().u0(null);
                        qa0.v().q0((ArrayList) result.getData(), k());
                        this.b.o(11, null);
                        HashMap hashMap = new HashMap();
                        hashMap.put(a4, this.n);
                        hashMap.put(a3, jg0.l(this.l.getAmount()));
                        hashMap.put(a2, jg0.n(this.l.getAccount().getBankName()));
                        z k2 = k();
                        String a6 = C0059ao.a(12675);
                        ah0.d(k2, a6, hashMap, true);
                        String obj = result.getData().toString();
                        Product product = new Product();
                        product.setId(obj);
                        product.setName(a6);
                        product.setPrice(this.l.getAmount().doubleValue());
                        product.setId(this.l.getRefid());
                        ah0.e(k(), a6, product, hashMap);
                        return;
                    }
                    return;
                }
            }
            this.b.o(301, null);
            String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
            this.l.setResponseCode(result.getCode());
            TransactionData transactionData = this.l;
            transactionData.setAmount(transactionData.getEditedAmount());
            TransactionData transactionData2 = this.l;
            transactionData2.setRemarks(transactionData2.getEditedRemarks());
            String str = (String) result.getData();
            this.l.setTransactionId(lastTransactionId);
            if (result.getData() != null && !TextUtils.isEmpty(str)) {
                this.l.setRefid(str);
                this.l.setApprovalRefNo(str);
            }
            this.l.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(12677)));
            this.l.setTransactionStatus(10);
            this.l.setDescription(result.getResult());
            this.l.setIsfromSendMoney(true);
            qa0.v().u0(this.l);
            n70.a aVar = n70.f;
            n70 a7 = aVar.a();
            n70 a8 = aVar.a();
            String a9 = C0059ao.a(12678);
            a7.v(a9, a8.j(a9) + 1);
            aVar.a().A(C0059ao.a(12679), false);
            eg0.B();
            J();
            this.b.t(24, G);
            if (qa0.v().Q()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(a4, this.n);
                hashMap2.put(a3, jg0.l(this.l.getAmount()));
                hashMap2.put(a2, jg0.n(this.l.getAccount().getBankName()));
                z k3 = k();
                String a10 = C0059ao.a(12680);
                ah0.d(k3, a10, hashMap2, true);
                Product product2 = new Product();
                product2.setName(this.n);
                product2.setPrice(this.l.getAmount().doubleValue());
                product2.setId(this.l.getRefid());
                product2.setBrand(jg0.n(this.l.getAccount().getBankName()));
                ah0.e(k(), a10, product2, hashMap2);
            } else {
                HashMap hashMap3 = new HashMap();
                hashMap3.put(a4, this.n);
                hashMap3.put(a3, jg0.l(this.l.getAmount()));
                hashMap3.put(a2, jg0.n(this.l.getAccount().getBankName()));
                ah0.d(k(), this.o, hashMap3, true);
                Product product3 = new Product();
                product3.setName(this.o);
                product3.setPrice(this.l.getAmount().doubleValue());
                product3.setId(this.l.getRefid());
                product3.setBrand(jg0.n(this.l.getAccount().getBankName()));
                ah0.e(k(), this.o, product3, hashMap3);
            }
            this.u.setText(C0059ao.a(12681));
            this.w.getText().clear();
            return;
        }
        eg0.B();
        if (TextUtils.isEmpty(((MainActivity) k()).q0())) {
            return;
        }
        n70.f.a().v(C0059ao.a(12682), 3);
    }
}
