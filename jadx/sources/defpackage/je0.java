package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Bank;
import com.olive.upi.transport.model.TranHistory;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.custom.NonScrollListView;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: je0  reason: default package */
/* loaded from: classes.dex */
public class je0 extends xc0 implements ng0, ua0.e {
    public static Account H;
    public static je0 I;
    public Button A;
    public ImageView B;
    public ImageView C;
    public TransactionData D;
    public d90 E;
    public String F;
    public String G;
    public View l;
    public Activity m;
    public NonScrollListView n;
    public LinearLayout o;
    public ProgressBar p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public Button y;
    public Button z;

    /* compiled from: AxisPay */
    /* renamed from: je0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a(je0 je0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ua0.d().q(new OliveRequest(118, 528, je0.H));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: je0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n70.f.a().y(C0059ao.a(6440), C0059ao.a(6441));
            je0.this.D.setTransactionMode(TransactionData.MODE_RESET);
            qa0.v().r0(92);
            je0.this.b.t(92, je0.H);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: je0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            je0.this.b.t(60, je0.H);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: je0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n70.f.a().y(C0059ao.a(6393), C0059ao.a(6394));
            qa0.v().r0(61);
            je0.this.b.t(61, je0.H);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: je0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e(je0 je0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    public static je0 x(Account account) {
        if (I == null) {
            I = new je0();
        }
        H = account;
        return I;
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        if (i == 19) {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(118, 19, obj));
        } else if (i != 28) {
        } else {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(118, 28, obj));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l = layoutInflater.inflate(R.layout.account_details_history, viewGroup, false);
        this.m = getActivity();
        this.D = qa0.v().L();
        y();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, -30);
        Date time = calendar2.getTime();
        String a2 = C0059ao.a(12369);
        String x = jg0.x(time, a2);
        String a3 = C0059ao.a(12370);
        String a4 = C0059ao.a(12371);
        this.F = x.replace(a3, a4);
        this.G = jg0.x(calendar.getTime(), a2).replace(a3, a4);
        Account account = H;
        if (account != null) {
            this.q.setText(account.getBankName());
            Bank e2 = qa0.v().e(H.getIin());
            if (e2 != null) {
                if (TextUtils.isEmpty(e2.getLogo())) {
                    this.C.setImageDrawable(t8.f(this.m, 2131230832));
                } else {
                    jg0.K(this.C, e2.getLogo(), 2131230832);
                }
            }
            this.s.setText(H.getMaskedAccnumber());
            this.u.setText(H.getIfsc());
            this.v.setText(H.getType());
            this.r.setText(H.getVpa());
            this.y.setOnClickListener(new a(this));
            this.A.setOnClickListener(new b());
            boolean isEmpty = TextUtils.isEmpty(H.getVpa());
            String a5 = C0059ao.a(12372);
            if (isEmpty) {
                this.y.setVisibility(8);
                this.A.setVisibility(8);
                this.o.setVisibility(8);
                this.z.setText(R.string.set_upi_id);
                this.z.setVisibility(0);
                this.z.setOnClickListener(new c());
            } else if (!H.getStatus().equalsIgnoreCase(a5)) {
                this.z.setText(R.string.set_upi_pin);
                this.z.setVisibility(0);
                this.y.setVisibility(8);
                this.A.setVisibility(8);
                this.o.setVisibility(8);
                this.z.setOnClickListener(new d());
            } else if (!TextUtils.isEmpty(H.getVpa()) && H.getStatus().equalsIgnoreCase(a5)) {
                this.z.setVisibility(8);
                TextView textView = this.w;
                textView.setText(H.getdLength() + this.m.getString(R.string.pin_exists));
                this.w.setTextColor(t8.d(this.m, R.color.pin_exist));
                this.y.setVisibility(0);
                this.o.setVisibility(0);
                this.A.setVisibility(0);
            }
            if (H.getStatus().equalsIgnoreCase(a5)) {
                TextView textView2 = this.w;
                textView2.setText(H.getdLength() + this.m.getString(R.string.pin_exists));
                this.w.setTextColor(t8.d(this.m, R.color.pin_exist));
                this.B.setImageDrawable(t8.f(this.m, 2131231303));
            } else {
                TextView textView3 = this.w;
                textView3.setText(H.getdLength() + this.m.getString(R.string.pin_required));
                this.w.setTextColor(t8.d(this.m, R.color.radio_orange));
                this.B.setImageDrawable(t8.f(this.m, R.drawable.notsetmpin));
            }
            this.p.setVisibility(0);
            this.x.setVisibility(8);
        }
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            int requestType = oliveRequest.getRequestType();
            if (requestType == 19) {
                String code = result != null ? result.getCode() : C0059ao.a(12373);
                eg0.B();
                if (code.equals(C0059ao.a(12374))) {
                    eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_max_retry), getString(R.string.okay), new e(this));
                } else {
                    eg0.m(k(), result.getResult());
                }
            } else if (requestType == 26) {
                eg0.B();
                z(null);
            } else if (requestType != 526) {
                eg0.m(k(), result.getResult());
            } else {
                ua0.d().c(this.F, this.G, null, false, false);
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(118, getString(R.string.account_details));
        super.onResume();
        ua0.e(k()).u(this);
        this.E = new d90(this.m);
        this.n.setLayoutManager(new LinearLayoutManager(k()));
        this.p.setVisibility(0);
        this.x.setVisibility(8);
        Account account = H;
        ua0.d().c(this.F, this.G, account != null ? account.getAccRefNumber() : C0059ao.a(12375), false, false);
        this.n.setAdapter(this.E);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 26) {
            eg0.B();
            z(qa0.v().u(H.getMaskedAccnumber()));
        } else if (requestType != 28) {
            if (requestType != 526) {
                if (this.g == oliveRequest.getInitiator()) {
                    eg0.B();
                    return;
                }
                return;
            }
            eg0.B();
            z((ArrayList) result.getData());
        } else {
            eg0.B();
            if (result.getCode().equals(C0059ao.a(12376))) {
                eg0.m(k(), getString(R.string.upi_pin_changed_successfully));
            } else if (result.getCode().equals(C0059ao.a(12377))) {
                eg0.m(k(), C0059ao.a(12378));
            } else {
                eg0.m(k(), result.getResult());
            }
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
    }

    public final void y() {
        this.n = (NonScrollListView) this.l.findViewById(R.id.recycler_view);
        this.q = (TextView) this.l.findViewById(R.id.bank_name);
        this.r = (TextView) this.l.findViewById(R.id.account_vpa);
        TextView textView = (TextView) this.l.findViewById(R.id.account_no);
        this.s = textView;
        textView.setTypeface(null, 1);
        TextView textView2 = (TextView) this.l.findViewById(R.id.text_recent_transactions);
        this.t = textView2;
        textView2.setTypeface(null, 1);
        TextView textView3 = (TextView) this.l.findViewById(R.id.text_ifsc);
        this.u = textView3;
        textView3.setTypeface(null, 1);
        TextView textView4 = (TextView) this.l.findViewById(R.id.account_type);
        this.v = textView4;
        textView4.setTypeface(null, 1);
        this.B = (ImageView) this.l.findViewById(R.id.favourite_icon_set_upi);
        this.w = (TextView) this.l.findViewById(R.id.text_pin_availability);
        this.p = (ProgressBar) this.l.findViewById(R.id.progress);
        this.x = (TextView) this.l.findViewById(R.id.empty_view);
        this.y = (Button) this.l.findViewById(R.id.button_change_upi_pin);
        this.z = (Button) this.l.findViewById(R.id.button_set_upi_pin);
        this.y = (Button) this.l.findViewById(R.id.button_change_upi_pin);
        this.A = (Button) this.l.findViewById(R.id.button_reset_upi_pin);
        this.C = (ImageView) this.l.findViewById(R.id.image_bank);
        this.o = (LinearLayout) this.l.findViewById(R.id.refresh_layout);
    }

    public final void z(ArrayList<TranHistory> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            d90 d90Var = this.E;
            if (d90Var == null) {
                this.E = new d90(k(), arrayList);
            } else {
                d90Var.A(arrayList);
            }
            this.n.setLayoutManager(new LinearLayoutManager(k()));
            this.E.z(this);
            this.n.setAdapter(this.E);
            this.n.setVisibility(0);
            this.x.setVisibility(8);
            this.p.setVisibility(8);
            return;
        }
        this.n.setVisibility(8);
        this.x.setVisibility(0);
        this.x.setText(R.string.no_transaction_found);
        this.p.setVisibility(8);
    }
}
