package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Bank;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.custom.VpaFieldLayout;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qf0  reason: default package */
/* loaded from: classes.dex */
public class qf0 extends xc0 implements ua0.e {
    public int A;
    public Account B = new Account();
    public la0 C;
    public TransactionData D;
    public Context l;
    public View m;
    public Spinner n;
    public Button o;
    public Button p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public RelativeLayout y;
    public ImageView z;

    /* compiled from: AxisPay */
    /* renamed from: qf0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qf0.this.n.performClick();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qf0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qf0.this.n.getSelectedItemPosition() == 0) {
                eg0.m(qf0.this.k(), qf0.this.getString(R.string.select_account));
            } else {
                qf0.this.b.t(84, null);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qf0$c */
    /* loaded from: classes.dex */
    public class c implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ ArrayList b;

        /* compiled from: AxisPay */
        /* renamed from: qf0$c$a */
        /* loaded from: classes.dex */
        public class a implements View.OnClickListener {
            public final /* synthetic */ Account b;

            public a(Account account) {
                this.b = account;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!this.b.getStatus().equalsIgnoreCase(C0059ao.a(6140))) {
                    qf0.this.B(this.b);
                    return;
                }
                ua0.d().q(new OliveRequest(63, 519, this.b));
                HashMap hashMap = new HashMap();
                hashMap.put(C0059ao.a(6141), qf0.this.getString(R.string.send_money_via_ifsc));
                hashMap.put(C0059ao.a(6142), jg0.n(this.b.getBankName()));
                ah0.c(qf0.this.k(), C0059ao.a(6143), hashMap);
            }
        }

        public c(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                qf0.this.t.setVisibility(8);
                qf0.this.y.setVisibility(8);
                qf0.this.p.setVisibility(8);
                return;
            }
            Account account = (Account) this.b.get(i);
            qf0 qf0Var = qf0.this;
            qf0Var.A = i;
            if (account != null) {
                qf0Var.B = account;
                qf0Var.D.setAccount(account);
                qf0.this.D.setDirection(TransactionData.MODE_SEND_VIA_IFSC);
                qf0.this.q.setText(account.getMaskedAccnumber());
                qf0.this.r.setText(account.getBankName());
                qf0.this.v.setText(account.getIfsc());
                qf0.this.x.setText(account.getVpa());
                qf0.this.w.setText(account.getType());
                Bank e = qa0.v().e(account.getIin());
                if (e != null) {
                    if (TextUtils.isEmpty(e.getLogo())) {
                        qf0 qf0Var2 = qf0.this;
                        qf0Var2.z.setImageDrawable(t8.f(qf0Var2.l, 2131230832));
                    } else {
                        jg0.K(qf0.this.z, e.getLogo(), 2131230832);
                    }
                }
                qf0.this.p.setOnClickListener(new a(account));
            }
            qf0.this.t.setVisibility(0);
            qf0.this.y.setVisibility(0);
            qf0.this.p.setVisibility(0);
            qf0.this.u.setVisibility(4);
            qf0.this.s.setVisibility(4);
            qf0.this.D.setTransactionMode(TransactionData.MODE_SEND_VIA_IFSC);
            qa0.v().u0(qf0.this.D);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qf0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ Account b;

        public d(Account account) {
            this.b = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            qa0.v().r0(61);
            qf0.this.b.t(61, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: qf0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e(qf0 qf0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    public static qf0 z() {
        return new qf0();
    }

    public final void A() {
        this.u.setText(getString(R.string.last_check_on, jg0.x(Calendar.getInstance().getTime(), C0059ao.a(6187))));
        this.u.setVisibility(0);
        this.s.setVisibility(0);
    }

    public final void B(Account account) {
        eg0.r(k(), this.l.getString(R.string.set_upi_pin), this.l.getString(R.string.upi_pin_to_continue), this.l.getString(R.string.yes), new d(account), this.l.getString(R.string.no), new e(this));
    }

    public final void C(ArrayList<Account> arrayList) {
        la0 la0Var = this.C;
        if (la0Var == null) {
            this.C = new la0(k(), arrayList);
        } else {
            la0Var.c(arrayList);
        }
        this.n.setAdapter((SpinnerAdapter) this.C);
        Account account = this.B;
        if (account != null) {
            this.n.setSelection(this.C.b(account.getVpa()));
        } else if (this.A < this.C.getCount()) {
            this.n.setSelection(this.A);
        } else {
            this.n.setSelection(0);
        }
        this.n.setOnItemSelectedListener(new c(arrayList));
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        if (i != 19) {
            return;
        }
        eg0.i(k());
        ua0.e(k()).q(new OliveRequest(102, 19, obj));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m = layoutInflater.inflate(R.layout.fragment_send_via_ifsc, viewGroup, false);
        this.l = getActivity();
        this.n = (Spinner) this.m.findViewById(R.id.spinner_select_account);
        RelativeLayout relativeLayout = (RelativeLayout) this.m.findViewById(R.id.pager);
        this.y = relativeLayout;
        relativeLayout.setVisibility(8);
        this.v = (TextView) this.m.findViewById(R.id.text_ifsc);
        this.w = (TextView) this.m.findViewById(R.id.account_type);
        VpaFieldLayout vpaFieldLayout = (VpaFieldLayout) this.m.findViewById(R.id.edit_vpa);
        ImageView imageView = (ImageView) this.m.findViewById(R.id.spinner_icon);
        this.s = (TextView) this.m.findViewById(R.id.text_balance);
        TextView textView = (TextView) this.m.findViewById(R.id.text_name);
        this.q = (TextView) this.m.findViewById(R.id.text_acc_number);
        this.r = (TextView) this.m.findViewById(R.id.text_bank_name);
        this.u = (TextView) this.m.findViewById(R.id.text_time);
        this.z = (ImageView) this.m.findViewById(R.id.image_bank);
        this.o = (Button) this.m.findViewById(R.id.button_proceed);
        this.x = (TextView) this.m.findViewById(R.id.account_vpa);
        Button button = (Button) this.m.findViewById(R.id.button_set_upi);
        this.p = button;
        button.setVisibility(8);
        TextView textView2 = (TextView) this.m.findViewById(R.id.text_link);
        this.t = textView2;
        textView2.setVisibility(8);
        ((LinearLayout) this.m.findViewById(R.id.layout_select_account)).setOnClickListener(new a());
        this.o.setOnClickListener(new b());
        return this.m;
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
        v(102, getString(R.string.send_money_via_ifsc));
        super.onResume();
        qa0.v().v0(qa0.e.IFSC);
        this.D = qa0.v().L();
        ua0.e(k()).u(this);
        ua0.d().b(false, new OliveRequest(102, 15, null));
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 15) {
            C(qa0.v().h(qa0.c.ACTIVE_VPA));
        } else if (requestType != 19) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
            }
        } else {
            eg0.B();
            TextView textView = this.s;
            textView.setText(C0059ao.a(6188) + result.getData().toString());
            A();
        }
    }
}
