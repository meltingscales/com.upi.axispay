package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: zd0  reason: default package */
/* loaded from: classes.dex */
public class zd0 extends xc0 {
    public View l;
    public Button m;
    public String[] n;
    public Spinner o;
    public Spinner p;
    public String[] q = {C0059ao.a(10832), C0059ao.a(10833), C0059ao.a(10834)};
    public String[] r = {C0059ao.a(10835), C0059ao.a(10836), C0059ao.a(10837), C0059ao.a(10838), C0059ao.a(10839)};

    /* compiled from: AxisPay */
    /* renamed from: zd0$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public a(zd0 zd0Var) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zd0$b */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        public b(zd0 zd0Var) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zd0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            sg0 sg0Var = new sg0();
            sg0Var.b(zd0.this.p.getSelectedItem().toString());
            sg0Var.c(zd0.this.o.getSelectedItem().toString());
            qa0.v().f0(sg0Var);
            zd0.this.b.t(117, null);
        }
    }

    public static zd0 x() {
        return new zd0();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l = layoutInflater.inflate(R.layout.fragment_mandate_frequency_remark, viewGroup, false);
        this.n = getResources().getStringArray(R.array.mandate_state_list);
        ((StateProgressBar) this.l.findViewById(R.id.stepper_indicator)).setStateDescriptionData(this.n);
        this.m = (Button) this.l.findViewById(R.id.button_confirm);
        CheckBox checkBox = (CheckBox) this.l.findViewById(R.id.check_select);
        this.m.setBackgroundResource(R.drawable.button_shape);
        this.o = (Spinner) this.l.findViewById(R.id.spinner_select_bank1);
        this.p = (Spinner) this.l.findViewById(R.id.spinner_frequency);
        ArrayAdapter arrayAdapter = new ArrayAdapter(k(), 17367048, this.q);
        arrayAdapter.setDropDownViewResource(17367049);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(k(), 17367048, this.r);
        arrayAdapter2.setDropDownViewResource(17367049);
        this.o.setAdapter((SpinnerAdapter) arrayAdapter);
        this.p.setAdapter((SpinnerAdapter) arrayAdapter2);
        this.o.setOnItemSelectedListener(new a(this));
        this.p.setOnItemSelectedListener(new b(this));
        this.m.setOnClickListener(new c());
        return this.l;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(116, getString(R.string.request_mandate));
        super.onResume();
    }
}
