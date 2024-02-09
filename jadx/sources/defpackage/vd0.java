package defpackage;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.SwitchCompat;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.custom.FloatingInputLayout;
import java.util.Calendar;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vd0  reason: default package */
/* loaded from: classes.dex */
public class vd0 extends xc0 implements View.OnClickListener {
    public View l;
    public String[] m;
    public String[] n = {C0059ao.a(8032), C0059ao.a(8033), C0059ao.a(8034)};
    public Button o;
    public SwitchCompat p;
    public Spinner q;
    public MandateTransactionData r;
    public FloatingInputLayout s;
    public FloatingInputLayout t;
    public FloatingInputLayout u;
    public LinearLayout v;
    public LinearLayout w;

    /* compiled from: AxisPay */
    /* renamed from: vd0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            vd0.this.v.setVisibility(0);
            vd0.this.w.setVisibility(0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vd0$b */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        public b(vd0 vd0Var) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vd0$c */
    /* loaded from: classes.dex */
    public class c implements CompoundButton.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                vd0.this.r.setAmountRule(C0059ao.a(1590));
            } else {
                vd0.this.r.setAmountRule(C0059ao.a(1591));
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vd0$d */
    /* loaded from: classes.dex */
    public class d implements DatePickerDialog.OnDateSetListener {
        public final /* synthetic */ int b;

        public d(int i) {
            this.b = i;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            Calendar.getInstance().set(i, i2, i3);
            int i4 = this.b;
            String a = C0059ao.a(1445);
            String a2 = C0059ao.a(1446);
            if (i4 == 1) {
                FloatingInputLayout floatingInputLayout = vd0.this.s;
                floatingInputLayout.setText(i3 + a2 + String.format(a, Integer.valueOf(i2 + 1)) + a2 + i);
                vd0.this.s.hideError();
                vd0.this.t.setText(C0059ao.a(1447));
                return;
            }
            FloatingInputLayout floatingInputLayout2 = vd0.this.t;
            floatingInputLayout2.setText(i3 + a2 + String.format(a, Integer.valueOf(i2 + 1)) + a2 + i);
            vd0.this.t.hideError();
        }
    }

    public static vd0 x() {
        return new vd0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(int r15) {
        /*
            r14 = this;
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 5
            r2 = 0
            r0.add(r1, r2)
            r3 = 1
            int r4 = r0.get(r3)
            r5 = 2
            int r6 = r0.get(r5)
            int r7 = r0.get(r1)
            r8 = 4
            if (r15 != r3) goto L59
            com.upi.axispay.custom.FloatingInputLayout r9 = r14.s
            java.lang.String r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L59
            com.upi.axispay.custom.FloatingInputLayout r4 = r14.s
            java.lang.String r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = defpackage.jg0.O(r4)
            int r6 = r4.length()
            java.lang.String r6 = r4.substring(r8, r6)
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.String r7 = r4.substring(r5, r8)
            int r7 = java.lang.Integer.parseInt(r7)
            int r7 = r7 - r3
            java.lang.String r2 = r4.substring(r2, r5)
            int r2 = java.lang.Integer.parseInt(r2)
        L55:
            r13 = r2
            r11 = r6
            r12 = r7
            goto L9a
        L59:
            if (r15 != r5) goto L97
            com.upi.axispay.custom.FloatingInputLayout r9 = r14.t
            java.lang.String r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L97
            com.upi.axispay.custom.FloatingInputLayout r4 = r14.t
            java.lang.String r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = defpackage.jg0.O(r4)
            int r6 = r4.length()
            java.lang.String r6 = r4.substring(r8, r6)
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.String r7 = r4.substring(r5, r8)
            int r7 = java.lang.Integer.parseInt(r7)
            int r7 = r7 - r3
            java.lang.String r2 = r4.substring(r2, r5)
            int r2 = java.lang.Integer.parseInt(r2)
            goto L55
        L97:
            r11 = r4
            r12 = r6
            r13 = r7
        L9a:
            android.app.DatePickerDialog r2 = new android.app.DatePickerDialog
            z r9 = r14.k()
            vd0$d r10 = new vd0$d
            r10.<init>(r15)
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            if (r15 != r3) goto Lb7
            android.widget.DatePicker r15 = r2.getDatePicker()
            long r0 = r0.getTimeInMillis()
            r15.setMinDate(r0)
            goto Le7
        Lb7:
            com.upi.axispay.custom.FloatingInputLayout r15 = r14.s
            java.lang.String r15 = r15.getText()
            java.lang.String r15 = r15.toString()
            r0 = 8035(0x1f63, float:1.126E-41)
            java.lang.String r0 = myunmn.C0059ao.a(r0)
            java.util.Date r15 = defpackage.jg0.h(r15, r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r15)
            r0.add(r1, r3)
            r15 = 12
            r1 = -1
            r0.add(r15, r1)
            android.widget.DatePicker r15 = r2.getDatePicker()
            long r0 = r0.getTimeInMillis()
            r15.setMinDate(r0)
        Le7:
            r2.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd0.A(int):void");
    }

    public final boolean B() {
        if (TextUtils.isEmpty(this.s.getText().toString().trim())) {
            this.s.showError(getString(R.string.enter_start_date));
            return false;
        } else if (TextUtils.isEmpty(this.t.getText().toString().trim())) {
            this.s.hideError();
            this.t.showError(getString(R.string.enter_end_date));
            return false;
        } else if (TextUtils.isEmpty(this.u.getText().toString().trim())) {
            this.t.hideError();
            this.u.showError(getString(R.string.enter_amount));
            return false;
        } else {
            Double valueOf = Double.valueOf(0.0d);
            try {
                valueOf = Double.valueOf(Double.parseDouble(jg0.B(this.u.getText())));
            } catch (Exception unused) {
            }
            if (valueOf.doubleValue() == 0.0d) {
                eg0.m(k(), getString(R.string.enter_amount));
                return false;
            } else if (valueOf.doubleValue() < 1.0d) {
                eg0.m(k(), getString(R.string.amount_validation_text));
                return false;
            } else {
                this.s.hideError();
                this.t.hideError();
                this.u.hideError();
                return true;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.button_confirm) {
            if (id != R.id.contact_end_pick) {
                if (id != R.id.contact_start_pick) {
                    return;
                }
                A(1);
            } else if (!TextUtils.isEmpty(this.s.getText().toString())) {
                A(2);
            } else {
                this.s.showError(getString(R.string.enter_start_date));
            }
        } else if (B()) {
            MandateTransactionData z = qa0.v().z();
            z.setStartMandate(this.s.getText().toString().trim());
            z.setEndmandate(this.t.getText().toString().trim());
            z.setAmount(Double.valueOf(Double.parseDouble(this.u.getText().toString().trim())));
            z.setLimitTranx(this.q.getSelectedItem().toString());
            qa0.v().h0(z);
            this.b.t(109, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l = layoutInflater.inflate(R.layout.fragment_mandate_duration_amount, viewGroup, false);
        this.r = qa0.v().z();
        this.m = getResources().getStringArray(R.array.mandate_state_list);
        if (this.r.getMandateType() == 2) {
            v(108, getString(R.string.request_mandate));
        } else if (this.r.getMandateType() == 3) {
            v(108, getString(R.string.modify_mandate));
        } else {
            v(108, getString(R.string.create_auto_debit_mandate));
        }
        ((StateProgressBar) this.l.findViewById(R.id.stepper_indicator)).setStateDescriptionData(this.m);
        y();
        z();
        this.u.getEditText().addTextChangedListener(new bg0(this.u.getEditText(), 2));
        this.u.setInputType(6);
        this.u.getInputField().setTypeface(null, 1);
        this.u.getEditText().addTextChangedListener(new a());
        ArrayAdapter arrayAdapter = new ArrayAdapter(k(), 17367048, this.n);
        arrayAdapter.setDropDownViewResource(17367049);
        this.q.setAdapter((SpinnerAdapter) arrayAdapter);
        this.q.setOnItemSelectedListener(new b(this));
        return this.l;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MandateTransactionData z = qa0.v().z();
        this.r = z;
        if (z.getMandateType() == 2) {
            v(108, getString(R.string.request_mandate));
        } else if (this.r.getMandateType() == 3) {
            v(108, getString(R.string.modify_mandate));
        } else {
            v(108, getString(R.string.create_auto_debit_mandate));
        }
    }

    public final void y() {
        this.q = (Spinner) this.l.findViewById(R.id.sp1);
        this.s = (FloatingInputLayout) this.l.findViewById(R.id.start_mandate);
        this.p = (SwitchCompat) this.l.findViewById(R.id.switchButton);
        this.s.getEditText().setFocusable(false);
        this.s.getEditText().setClickable(false);
        this.v = (LinearLayout) this.l.findViewById(R.id.amount_hint);
        this.w = (LinearLayout) this.l.findViewById(R.id.layout_toggle);
        FloatingInputLayout floatingInputLayout = (FloatingInputLayout) this.l.findViewById(R.id.end_mandate);
        this.t = floatingInputLayout;
        floatingInputLayout.getEditText().setFocusable(false);
        this.t.getEditText().setClickable(false);
        FloatingInputLayout floatingInputLayout2 = (FloatingInputLayout) this.l.findViewById(R.id.enter_amount);
        this.u = floatingInputLayout2;
        floatingInputLayout2.getEditText().setInputType(2);
        this.u.getEditText().setKeyListener(DigitsKeyListener.getInstance(C0059ao.a(8036)));
        this.u.getEditText().setRawInputType(2);
        this.o = (Button) this.l.findViewById(R.id.button_confirm);
        int transactionMode = this.r.getTransactionMode();
        int i = TransactionData.MODE_PAYER_UPDATE_MANDATE;
        String a2 = C0059ao.a(8037);
        String a3 = C0059ao.a(8038);
        if (transactionMode != i && this.r.getTransactionMode() != TransactionData.MODE_PAYEE_UPDATE_MANDATE) {
            if (this.r.getTransactionMode() == TransactionData.MODE_CREATE_MANDATE) {
                this.s.setText(this.r.getStartMandate());
                this.s.getRightIcon().setVisibility(4);
                this.t.setText(this.r.getEndmandate());
                this.u.setText(String.valueOf(this.r.getAmount()));
                this.p.setClickable(false);
                this.p.setEnabled(false);
                if (this.r.getAmountRule().equalsIgnoreCase(a3)) {
                    this.p.setChecked(true);
                    MandateTransactionData mandateTransactionData = this.r;
                    mandateTransactionData.setAmountRule(mandateTransactionData.getAmountRule());
                } else {
                    this.r.setAmountRule(a2);
                }
            }
        } else {
            this.s.setText(this.r.getStartMandate());
            this.s.getRightIcon().setVisibility(4);
            this.t.setText(this.r.getEndmandate());
            this.u.setText(String.valueOf(this.r.getAmount()));
            this.p.setClickable(false);
            this.p.setEnabled(false);
            if (this.r.getAmountRule().equalsIgnoreCase(a3)) {
                this.p.setChecked(true);
                MandateTransactionData mandateTransactionData2 = this.r;
                mandateTransactionData2.setAmountRule(mandateTransactionData2.getAmountRule());
            } else {
                this.r.setAmountRule(a2);
            }
        }
        this.p.setOnCheckedChangeListener(new c());
    }

    public final void z() {
        this.s.getRightIcon().setOnClickListener(this);
        this.t.getRightIcon().setOnClickListener(this);
        this.o.setOnClickListener(this);
    }
}
