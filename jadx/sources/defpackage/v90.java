package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.MandatesVo;
import com.upi.axispay.R;
import defpackage.n70;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: v90  reason: default package */
/* loaded from: classes.dex */
public class v90 extends RecyclerView.h<j> {
    public Context d;
    public List<MandatesVo> e;
    public ng0 f;
    public int g = 0;
    public int h = -1;

    /* compiled from: AxisPay */
    /* renamed from: v90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ MandatesVo b;

        public a(MandatesVo mandatesVo) {
            this.b = mandatesVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v90.this.f.s(R.id.invoice, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: v90$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ng0 ng0Var = v90.this.f;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: v90$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ MandatesVo b;

        public c(MandatesVo mandatesVo) {
            this.b = mandatesVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v90.this.f.s(R.id.button_modify, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: v90$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ MandatesVo b;

        public d(MandatesVo mandatesVo) {
            this.b = mandatesVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v90.this.f.s(R.id.button_pause, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: v90$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ MandatesVo b;

        public e(MandatesVo mandatesVo) {
            this.b = mandatesVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v90.this.f.s(R.id.button_unpause, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: v90$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ MandatesVo b;

        public f(MandatesVo mandatesVo) {
            this.b = mandatesVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v90.this.f.s(R.id.share_qr, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: v90$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public final /* synthetic */ MandatesVo b;

        public g(MandatesVo mandatesVo) {
            this.b = mandatesVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v90.this.f.s(R.id.button_cancel, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: v90$h */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public final /* synthetic */ String b;
        public final /* synthetic */ MandatesVo c;
        public final /* synthetic */ j d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ int f;

        public h(String str, MandatesVo mandatesVo, j jVar, boolean z, int i) {
            this.b = str;
            this.c = mandatesVo;
            this.d = jVar;
            this.e = z;
            this.f = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.b) && this.b.equals(n70.f.a().m(C0059ao.a(4551)))) {
                String payerStatus = this.c.getPayerStatus();
                String a = C0059ao.a(4552);
                if ((!payerStatus.equalsIgnoreCase(a) || (!TextUtils.isEmpty(this.c.getPayeeStatus()) && !this.c.getPayeeStatus().equalsIgnoreCase(a))) && !this.c.getInitiatedBy().equalsIgnoreCase(C0059ao.a(4553))) {
                    this.d.w.setVisibility(0);
                }
            }
            v90 v90Var = v90.this;
            v90Var.h = this.e ? -1 : this.f;
            v90Var.j();
            this.d.I.setVisibility(8);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: v90$i */
    /* loaded from: classes.dex */
    public class i implements View.OnLongClickListener {
        public i(v90 v90Var) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: v90$j */
    /* loaded from: classes.dex */
    public class j extends RecyclerView.d0 {
        public TextView A;
        public TextView B;
        public TextView C;
        public TextView D;
        public TextView E;
        public TextView F;
        public TextView G;
        public TextView H;
        public Button I;
        public LinearLayout J;
        public LinearLayout K;
        public LinearLayout L;
        public LinearLayout M;
        public LinearLayout N;
        public LinearLayout O;
        public LinearLayout P;
        public LinearLayout Q;
        public LinearLayout R;
        public RelativeLayout S;
        public View T;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public j(v90 v90Var, View view) {
            super(view);
            this.T = view;
            this.G = (TextView) view.findViewById(R.id.image_items);
            this.y = (TextView) view.findViewById(R.id.text_id);
            this.w = (TextView) view.findViewById(R.id.share_qr);
            this.x = (TextView) view.findViewById(R.id.text_name);
            this.z = (TextView) view.findViewById(R.id.text_date);
            TextView textView = (TextView) view.findViewById(R.id.text_state);
            this.A = (TextView) view.findViewById(R.id.text_amount);
            this.D = (TextView) view.findViewById(R.id.start_date);
            this.E = (TextView) view.findViewById(R.id.end_date);
            this.F = (TextView) view.findViewById(R.id.text_frequency);
            this.B = (TextView) view.findViewById(R.id.text_payment_id);
            this.C = (TextView) view.findViewById(R.id.text_umn_id);
            TextView textView2 = (TextView) view.findViewById(R.id.send_text);
            this.H = (TextView) view.findViewById(R.id.text_view_amount_tag);
            this.I = (Button) view.findViewById(R.id.button_manage);
            this.O = (LinearLayout) view.findViewById(R.id.received_tag);
            this.P = (LinearLayout) view.findViewById(R.id.sent_tag);
            this.L = (LinearLayout) view.findViewById(R.id.button_modify);
            this.M = (LinearLayout) view.findViewById(R.id.button_cancel);
            this.J = (LinearLayout) view.findViewById(R.id.button_pause);
            this.K = (LinearLayout) view.findViewById(R.id.button_unpause);
            this.Q = (LinearLayout) view.findViewById(R.id.layout_row1);
            this.S = (RelativeLayout) view.findViewById(R.id.layout_mandate);
            this.N = (LinearLayout) view.findViewById(R.id.text_state_layout);
            this.R = (LinearLayout) view.findViewById(R.id.layout_buttons);
            this.v = (TextView) view.findViewById(R.id.invoice);
            this.S.setVisibility(8);
        }
    }

    public v90(List<MandatesVo> list, Context context) {
        this.e = list;
        this.d = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        List<MandatesVo> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int i2) {
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(j jVar, int i2) {
        MandatesVo mandatesVo = this.e.get(i2);
        jVar.A.setText(jg0.b(mandatesVo.getAmount()));
        boolean z = i2 == this.h;
        jVar.b.setActivated(z);
        try {
            jVar.z.setText(new SimpleDateFormat(C0059ao.a(15499)).format(new SimpleDateFormat(C0059ao.a(15498)).parse(mandatesVo.getCreatedDate())));
        } catch (ParseException unused) {
        }
        TextView textView = jVar.B;
        boolean isEmpty = TextUtils.isEmpty(mandatesVo.getRrn());
        String a2 = C0059ao.a(15500);
        textView.setText(isEmpty ? a2 : mandatesVo.getRrn());
        TextView textView2 = jVar.C;
        if (!TextUtils.isEmpty(mandatesVo.getUmn())) {
            a2 = mandatesVo.getUmn();
        }
        textView2.setText(a2);
        jVar.D.setText(jg0.N(mandatesVo.getValidity_start()));
        jVar.E.setText(jg0.N(mandatesVo.getValidity_end()));
        jVar.F.setText(mandatesVo.getRecurrencePattern());
        jVar.G.setTypeface(null, 1);
        jVar.S.setVisibility(8);
        jVar.I.setVisibility(0);
        if (mandatesVo.getRefUrl() != null) {
            jVar.v.setVisibility(0);
        } else {
            jVar.v.setVisibility(8);
        }
        if (mandatesVo.getRecurrencePattern().equalsIgnoreCase(C0059ao.a(15501))) {
            jVar.J.setVisibility(8);
            jVar.K.setVisibility(8);
        } else if (mandatesVo.mandateType.equalsIgnoreCase(C0059ao.a(15502))) {
            jVar.J.setVisibility(8);
            jVar.K.setVisibility(0);
        } else {
            jVar.K.setVisibility(8);
            jVar.J.setVisibility(0);
        }
        String merchantflag = mandatesVo.getMerchantflag();
        if (!TextUtils.isEmpty(merchantflag) && merchantflag.equalsIgnoreCase(C0059ao.a(15503))) {
            jVar.N.setVisibility(0);
        } else {
            jVar.N.setVisibility(4);
        }
        String payerMobile = mandatesVo.getPayerMobile();
        String payeeMobile = mandatesVo.getPayeeMobile();
        n70.a aVar = n70.f;
        n70 a3 = aVar.a();
        String a4 = C0059ao.a(15504);
        String m = a3.m(a4);
        if ((!TextUtils.isEmpty(payerMobile) && payerMobile.equals(m) && mandatesVo.getInitiatedBy().equals(C0059ao.a(15505))) || (!TextUtils.isEmpty(payerMobile) && payerMobile.equals(m))) {
            jVar.x.setText(jg0.g(mandatesVo.getPayeeAccountName()));
            jVar.y.setText(mandatesVo.getPayeeVpa());
            jVar.G.setText(jg0.t(mandatesVo.getPayeeAccountName(), mandatesVo.getPayeeVpa()));
        } else if ((!TextUtils.isEmpty(payeeMobile) && payeeMobile.equals(m) && mandatesVo.getInitiatedBy().equals(C0059ao.a(15506))) || (!TextUtils.isEmpty(mandatesVo.getPayerMobile()) && !mandatesVo.getPayerMobile().equals(m))) {
            jVar.x.setText(jg0.g(mandatesVo.getPayerAccountName()));
            jVar.y.setText(mandatesVo.getPayerVpa());
            jVar.G.setText(jg0.t(mandatesVo.getPayerAccountName(), mandatesVo.getPayerVpa()));
        } else {
            jVar.x.setText(jg0.g(mandatesVo.getPayeeAccountName()));
            jVar.y.setText(mandatesVo.getPayeeVpa());
            jVar.G.setText(jg0.t(mandatesVo.getPayeeAccountName(), mandatesVo.getPayeeVpa()));
            jVar.R.setVisibility(8);
        }
        if (!TextUtils.isEmpty(payerMobile) && payerMobile.equals(aVar.a().m(a4))) {
            jVar.P.setVisibility(0);
            jVar.O.setVisibility(8);
        } else if (!TextUtils.isEmpty(payeeMobile) && payeeMobile.equals(aVar.a().m(a4))) {
            jVar.P.setVisibility(8);
            jVar.O.setVisibility(0);
            jVar.w.setVisibility(8);
        }
        String payeeStatus = mandatesVo.getPayeeStatus();
        String payerStatus = mandatesVo.getPayerStatus();
        boolean isEmpty2 = TextUtils.isEmpty(payeeStatus);
        String a5 = C0059ao.a(15507);
        String a6 = C0059ao.a(15508);
        String a7 = C0059ao.a(15509);
        if ((!isEmpty2 && (payeeStatus.equalsIgnoreCase(a7) || payeeStatus.equalsIgnoreCase(a6) || payeeStatus.equalsIgnoreCase(a5))) || (!TextUtils.isEmpty(payerStatus) && (payerStatus.equalsIgnoreCase(a7) || payerStatus.equalsIgnoreCase(a6) || payerStatus.equalsIgnoreCase(a5)))) {
            jVar.I.setVisibility(8);
            jVar.w.setVisibility(8);
            jVar.S.setVisibility(0);
            jVar.R.setVisibility(8);
            jVar.Q.setBackgroundColor(this.d.getResources().getColor(R.color.grey_light));
            jVar.S.setBackgroundColor(this.d.getResources().getColor(R.color.grey_light));
            jVar.v.setVisibility(8);
        } else {
            if (!TextUtils.isEmpty(payeeStatus)) {
                String a8 = C0059ao.a(15510);
                if (payeeStatus.equalsIgnoreCase(a8) || (!TextUtils.isEmpty(payerStatus) && payerStatus.equalsIgnoreCase(a8))) {
                    jVar.I.setVisibility(0);
                    jVar.R.setVisibility(8);
                    jVar.w.setVisibility(8);
                    jVar.S.setVisibility(z ? 0 : 8);
                    jVar.I.setVisibility(z ? 8 : 0);
                }
            }
            jVar.I.setVisibility(0);
            jVar.w.setVisibility(z ? 0 : 8);
            jVar.S.setVisibility(z ? 0 : 8);
            jVar.I.setVisibility(z ? 8 : 0);
        }
        if (mandatesVo.amountRule.equalsIgnoreCase(C0059ao.a(15511))) {
            jVar.H.setVisibility(8);
        } else {
            jVar.H.setVisibility(8);
        }
        jVar.v.setOnClickListener(new a(mandatesVo));
        jVar.T.setOnClickListener(new b());
        jVar.L.setOnClickListener(new c(mandatesVo));
        jVar.J.setOnClickListener(new d(mandatesVo));
        jVar.K.setOnClickListener(new e(mandatesVo));
        jVar.w.setOnClickListener(new f(mandatesVo));
        jVar.M.setOnClickListener(new g(mandatesVo));
        jVar.I.setOnClickListener(new h(payerMobile, mandatesVo, jVar, z, i2));
        jVar.T.setOnLongClickListener(new i(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public j n(ViewGroup viewGroup, int i2) {
        return new j(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.active_mandate_list_row, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.f = ng0Var;
    }

    public void z(ArrayList<MandatesVo> arrayList) {
        this.e = arrayList;
        j();
    }
}
