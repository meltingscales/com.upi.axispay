package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import defpackage.qa0;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: wd0  reason: default package */
/* loaded from: classes.dex */
public class wd0 extends xc0 implements View.OnClickListener {
    public Spinner A;
    public int C;
    public TextView D;
    public View l;
    public Button m;
    public EditText n;
    public String[] o;
    public Spinner p;
    public Spinner q;
    public StateProgressBar t;
    public MandateTransactionData u;
    public LinearLayout v;
    public LinearLayout w;
    public CheckBox x;
    public SwitchCompat y;
    public e90 z;
    public String[] r = {C0059ao.a(2777), C0059ao.a(2778), C0059ao.a(2779)};
    public String[] s = {C0059ao.a(2780), C0059ao.a(2781), C0059ao.a(2782), C0059ao.a(2783), C0059ao.a(2784), C0059ao.a(2785), C0059ao.a(2786), C0059ao.a(2787), C0059ao.a(2788), C0059ao.a(2789)};
    public Account B = new Account();

    /* compiled from: AxisPay */
    /* renamed from: wd0$a */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                wd0.this.u.setBlockFund(C0059ao.a(6221));
            } else {
                wd0.this.u.setBlockFund(C0059ao.a(6222));
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wd0$b */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                wd0.this.q.setSelection(0);
            }
            if (i == 1) {
                wd0.this.q.setSelection(0);
            }
            if (i == 2) {
                wd0.this.q.setSelection(0);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wd0$c */
    /* loaded from: classes.dex */
    public class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            boolean equalsIgnoreCase = wd0.this.p.getSelectedItem().toString().equalsIgnoreCase(C0059ao.a(6252));
            String a = C0059ao.a(6253);
            if (!equalsIgnoreCase && !wd0.this.p.getSelectedItem().toString().equalsIgnoreCase(a) && !wd0.this.p.getSelectedItem().toString().equalsIgnoreCase(C0059ao.a(6254))) {
                wd0.this.q.setClickable(true);
                wd0.this.q.setEnabled(true);
            } else {
                wd0.this.q.setClickable(false);
                wd0.this.q.setEnabled(false);
            }
            if (wd0.this.p.getSelectedItem().toString().equalsIgnoreCase(a)) {
                wd0.this.w.setVisibility(0);
            } else {
                wd0.this.w.setVisibility(8);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            wd0.this.w.setVisibility(8);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wd0$d */
    /* loaded from: classes.dex */
    public class d implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ ArrayList b;

        public d(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                return;
            }
            Account account = (Account) this.b.get(i);
            wd0 wd0Var = wd0.this;
            wd0Var.C = i;
            if (account != null) {
                wd0Var.B = account;
                wd0Var.u.setAccount(account);
                wd0.this.u.setDebitAccountNo(account.getMaskedAccnumber());
                qa0.v().e(account.getIin());
            }
            qa0.v().u0(wd0.this.u);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static wd0 x() {
        return new wd0();
    }

    public final void A(ArrayList<Account> arrayList) {
        e90 e90Var = this.z;
        if (e90Var == null) {
            this.z = new e90(k(), arrayList);
        } else {
            e90Var.c(arrayList);
        }
        this.A.setAdapter((SpinnerAdapter) this.z);
        Account account = this.B;
        if (account != null) {
            this.A.setSelection(this.z.b(account.getVpa()));
        } else if (this.C < this.z.getCount()) {
            this.A.setSelection(this.C);
        } else {
            this.A.setSelection(0);
        }
        this.A.setOnItemSelectedListener(new d(arrayList));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.button_confirm) {
            return;
        }
        if (this.A.getSelectedItemPosition() == 0) {
            eg0.m(k(), getString(R.string.select_account));
            return;
        }
        MandateTransactionData z = qa0.v().z();
        z.setOccurence(this.p.getSelectedItem().toString());
        z.setTransactionOn(this.q.getSelectedItem().toString());
        String trim = this.n.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            trim = C0059ao.a(2790);
        }
        z.setRemarks(trim);
        z.setTransactionNote(trim);
        if (this.x.isChecked()) {
            z.setSharetoPayee(C0059ao.a(2791));
        } else {
            z.setSharetoPayee(C0059ao.a(2792));
        }
        qa0.v().h0(z);
        this.b.t(107, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mandate_frequency_remark, viewGroup, false);
        this.l = inflate;
        this.A = (Spinner) inflate.findViewById(R.id.spinner_select_account);
        A(qa0.v().h(qa0.c.ACTIVE_VPA));
        this.o = getResources().getStringArray(R.array.mandate_state_list);
        MandateTransactionData z = qa0.v().z();
        this.u = z;
        if (z.getMandateType() == 2) {
            v(109, getString(R.string.request_mandate));
        } else if (this.u.getMandateType() == 3) {
            v(109, getString(R.string.modify_mandate));
        } else {
            v(109, getString(R.string.create_auto_debit_mandate));
        }
        z();
        y();
        this.t.setStateDescriptionData(this.o);
        this.m.setBackgroundResource(R.drawable.button_shape);
        ArrayAdapter arrayAdapter = new ArrayAdapter(k(), 17367048, this.r);
        arrayAdapter.setDropDownViewResource(17367049);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(k(), 17367048, this.s);
        arrayAdapter2.setDropDownViewResource(17367049);
        this.p.setAdapter((SpinnerAdapter) arrayAdapter2);
        this.q.setAdapter((SpinnerAdapter) arrayAdapter);
        StringBuilder sb = new StringBuilder();
        String a2 = C0059ao.a(2793);
        sb.append(a2);
        sb.append(this.u.isP2P());
        sb.toString();
        boolean isP2P = this.u.isP2P();
        String a3 = C0059ao.a(2794);
        if (isP2P) {
            String str = a2 + this.u.isP2P();
            this.p.setEnabled(false);
            this.p.setSelection(1);
            this.y.setChecked(true);
            this.y.setEnabled(false);
            this.u.setBlockFund(a3);
        }
        this.y.setOnCheckedChangeListener(new a());
        this.D.setText(this.u.getStartMandate());
        this.q.setOnItemSelectedListener(new b());
        int transactionMode = this.u.getTransactionMode();
        int i = TransactionData.MODE_PAYER_UPDATE_MANDATE;
        String a4 = C0059ao.a(2795);
        String a5 = C0059ao.a(2796);
        String a6 = C0059ao.a(2797);
        String a7 = C0059ao.a(2798);
        if (transactionMode != i && this.u.getTransactionMode() != TransactionData.MODE_PAYEE_UPDATE_MANDATE) {
            if (this.u.getTransactionMode() == TransactionData.MODE_CREATE_MANDATE) {
                this.n.setText(this.u.getRemarks());
                this.n.setEnabled(true);
                this.x.setEnabled(true);
                if (this.u.getSharetoPayee() != null && this.u.getSharetoPayee().equalsIgnoreCase(a3)) {
                    this.x.setChecked(true);
                } else {
                    this.x.setChecked(false);
                }
                this.y.setClickable(false);
                this.y.setEnabled(false);
                if (this.u.getBlockFund().equalsIgnoreCase(a3)) {
                    this.y.setChecked(true);
                    this.u.setBlockFund(a3);
                } else {
                    this.u.setBlockFund(a6);
                }
                this.p.setEnabled(false);
                this.q.setClickable(false);
                this.q.setEnabled(true);
                this.A.setEnabled(true);
                this.A.setSelection(this.z.b(this.u.getPayerVpa()));
                System.out.println(a5 + this.u.getRecurrence() + a4 + this.u.getTransactionOn());
                if (!TextUtils.isEmpty(this.u.getOccurence())) {
                    System.out.println(a7 + this.s.length);
                    for (int i2 = 0; i2 < this.s.length; i2++) {
                        if (this.u.getOccurence().equalsIgnoreCase(this.s[i2])) {
                            System.out.println(a7 + i2);
                            this.p.setSelection(i2);
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.u.getTransactionOn())) {
                    for (int i3 = 0; this.r.length > i3; i3++) {
                        if (this.u.getTransactionOn().equalsIgnoreCase(this.r[i3])) {
                            this.q.setClickable(false);
                            this.q.setEnabled(false);
                            this.q.setSelection(i3);
                        }
                    }
                }
            } else {
                this.p.setOnItemSelectedListener(new c());
            }
        } else {
            this.n.setText(this.u.getRemarks());
            this.n.setEnabled(false);
            this.x.setEnabled(false);
            if (this.u.getSharetoPayee() != null && this.u.getSharetoPayee().equalsIgnoreCase(a3)) {
                this.x.setChecked(true);
            } else {
                this.x.setChecked(false);
            }
            this.y.setClickable(false);
            this.y.setEnabled(false);
            if (this.u.getBlockFund().equalsIgnoreCase(a3)) {
                this.y.setChecked(true);
                this.u.setBlockFund(a3);
            } else {
                this.u.setBlockFund(a6);
            }
            this.p.setEnabled(false);
            this.q.setClickable(false);
            this.q.setEnabled(false);
            this.A.setEnabled(false);
            this.A.setSelection(this.z.b(this.u.getPayerVpa()));
            System.out.println(a5 + this.u.getRecurrence() + a4 + this.u.getTransactionOn());
            if (!TextUtils.isEmpty(this.u.getRecurrence())) {
                System.out.println(a7 + this.s.length);
                for (int i4 = 0; i4 < this.s.length; i4++) {
                    if (this.u.getRecurrence().equalsIgnoreCase(this.s[i4])) {
                        System.out.println(a7 + i4);
                        this.p.setSelection(i4);
                    }
                }
            }
            if (!TextUtils.isEmpty(this.u.getTransactionOn())) {
                for (int i5 = 0; this.r.length > i5; i5++) {
                    if (this.u.getTransactionOn().equalsIgnoreCase(this.r[i5])) {
                        this.q.setClickable(false);
                        this.q.setEnabled(false);
                        this.q.setSelection(i5);
                    }
                }
            }
        }
        return this.l;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.u.getMandateType() == 2) {
            v(109, getString(R.string.request_mandate));
        } else if (this.u.getMandateType() == 3) {
            v(109, getString(R.string.modify_mandate));
        } else {
            v(109, getString(R.string.create_auto_debit_mandate));
        }
    }

    public final void y() {
        this.m.setOnClickListener(this);
        this.v.setOnClickListener(this);
    }

    public final void z() {
        this.t = (StateProgressBar) this.l.findViewById(R.id.stepper_indicator);
        this.m = (Button) this.l.findViewById(R.id.button_confirm);
        Spinner spinner = (Spinner) this.l.findViewById(R.id.spinner_select_bank1);
        this.p = (Spinner) this.l.findViewById(R.id.spinner_frequency);
        this.q = (Spinner) this.l.findViewById(R.id.spinner_frequency_date_on);
        this.n = (EditText) this.l.findViewById(R.id.edit_description);
        this.v = (LinearLayout) this.l.findViewById(R.id.layout_notify);
        this.w = (LinearLayout) this.l.findViewById(R.id.layout_toggle);
        this.x = (CheckBox) this.l.findViewById(R.id.check_select);
        this.D = (TextView) this.l.findViewById(R.id.date_on_start);
        this.y = (SwitchCompat) this.l.findViewById(R.id.switchButton);
        this.u = qa0.v().z();
    }
}
