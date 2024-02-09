package defpackage;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.olive.upi.transport.model.Mandate;
import com.upi.axispay.R;
import java.util.Calendar;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: yd0  reason: default package */
/* loaded from: classes.dex */
public class yd0 extends xc0 implements View.OnClickListener {
    public View l;
    public String[] m;
    public String[] n = {C0059ao.a(15050), C0059ao.a(15051), C0059ao.a(15052)};
    public Button o;
    public EditText p;
    public EditText q;
    public EditText r;
    public ImageView s;
    public ImageView t;
    public Spinner u;

    /* compiled from: AxisPay */
    /* renamed from: yd0$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public a(yd0 yd0Var) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yd0$b */
    /* loaded from: classes.dex */
    public class b implements DatePickerDialog.OnDateSetListener {
        public b() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            Calendar.getInstance().set(i, i2, i3);
            EditText editText = yd0.this.p;
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            String a = C0059ao.a(1092);
            sb.append(a);
            sb.append(String.format(C0059ao.a(1093), Integer.valueOf(i2 + 1)));
            sb.append(a);
            sb.append(i);
            editText.setText(sb.toString());
            yd0.this.p.setVisibility(0);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: yd0$c */
    /* loaded from: classes.dex */
    public class c implements DatePickerDialog.OnDateSetListener {
        public c() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            Calendar.getInstance().set(i, i2, i3);
            EditText editText = yd0.this.q;
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            String a = C0059ao.a(1293);
            sb.append(a);
            sb.append(String.format(C0059ao.a(1294), Integer.valueOf(i2 + 1)));
            sb.append(a);
            sb.append(i);
            editText.setText(sb.toString());
            yd0.this.q.setVisibility(0);
        }
    }

    public static yd0 x() {
        return new yd0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.button_confirm) {
            if (id == R.id.contact_end_pick) {
                y();
                return;
            } else if (id != R.id.contact_start_pick) {
                return;
            } else {
                z();
                return;
            }
        }
        Mandate mandate = new Mandate();
        mandate.setValiditystart(this.p.getText().toString().trim());
        mandate.setValidityend(this.q.getText().toString().trim());
        mandate.setAmount(this.r.getText().toString().trim());
        qa0.v().e0(mandate);
        this.b.t(116, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l = layoutInflater.inflate(R.layout.fragment_mandate_duration_amount, viewGroup, false);
        this.m = getResources().getStringArray(R.array.mandate_state_list);
        ((StateProgressBar) this.l.findViewById(R.id.stepper_indicator)).setStateDescriptionData(this.m);
        this.p = (EditText) this.l.findViewById(R.id.edit_start_date);
        this.q = (EditText) this.l.findViewById(R.id.edit_end_date);
        this.p.setFocusable(false);
        this.p.setClickable(false);
        this.q.setFocusable(false);
        this.q.setClickable(false);
        this.o = (Button) this.l.findViewById(R.id.button_confirm);
        this.s = (ImageView) this.l.findViewById(R.id.contact_start_pick);
        this.t = (ImageView) this.l.findViewById(R.id.contact_end_pick);
        this.o.setBackgroundResource(R.drawable.button_shape);
        EditText editText = (EditText) this.l.findViewById(R.id.edit_amount);
        this.r = editText;
        editText.setInputType(2);
        this.s.setOnClickListener(this);
        this.t.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.u = (Spinner) this.l.findViewById(R.id.sp1);
        ArrayAdapter arrayAdapter = new ArrayAdapter(k(), 17367048, this.n);
        arrayAdapter.setDropDownViewResource(17367049);
        this.u.setAdapter((SpinnerAdapter) arrayAdapter);
        this.u.setOnItemSelectedListener(new a(this));
        return this.l;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(115, getString(R.string.request_mandate));
        super.onResume();
    }

    public final void y() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 0);
        new DatePickerDialog(k(), new c(), calendar.get(1), calendar.get(2), calendar.get(5)).show();
    }

    public final void z() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 0);
        new DatePickerDialog(k(), new b(), calendar.get(1), calendar.get(2), calendar.get(5)).show();
    }
}
