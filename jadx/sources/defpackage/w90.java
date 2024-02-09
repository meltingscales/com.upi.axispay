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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: w90  reason: default package */
/* loaded from: classes.dex */
public class w90 extends RecyclerView.h<g> {
    public List<MandatesVo> e;
    public ng0 f;
    public int g = 0;
    public int h = -1;
    public Context d = this.d;
    public Context d = this.d;

    /* compiled from: AxisPay */
    /* renamed from: w90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ng0 ng0Var = w90.this.f;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w90$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ MandatesVo b;

        public b(MandatesVo mandatesVo) {
            this.b = mandatesVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w90.this.f.s(R.id.share_qr, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w90$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ MandatesVo b;

        public c(MandatesVo mandatesVo) {
            this.b = mandatesVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w90.this.f.s(R.id.button_execute, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w90$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ MandatesVo b;

        public d(MandatesVo mandatesVo) {
            this.b = mandatesVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w90.this.f.s(R.id.button_decline, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w90$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ g b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ int d;

        public e(g gVar, boolean z, int i) {
            this.b = gVar;
            this.c = z;
            this.d = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.G.setVisibility(8);
            w90 w90Var = w90.this;
            w90Var.h = this.c ? -1 : this.d;
            w90Var.j();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w90$f */
    /* loaded from: classes.dex */
    public class f implements View.OnLongClickListener {
        public f(w90 w90Var) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: w90$g */
    /* loaded from: classes.dex */
    public class g extends RecyclerView.d0 {
        public TextView A;
        public TextView B;
        public TextView C;
        public TextView D;
        public TextView E;
        public TextView F;
        public Button G;
        public LinearLayout H;
        public LinearLayout I;
        public LinearLayout J;
        public RelativeLayout K;
        public View L;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public g(w90 w90Var, View view) {
            super(view);
            this.L = view;
            this.F = (TextView) view.findViewById(R.id.image_items);
            this.x = (TextView) view.findViewById(R.id.text_id);
            this.w = (TextView) view.findViewById(R.id.text_name);
            this.v = (TextView) view.findViewById(R.id.share_qr);
            this.y = (TextView) view.findViewById(R.id.text_date);
            TextView textView = (TextView) view.findViewById(R.id.text_state);
            this.z = (TextView) view.findViewById(R.id.text_amount);
            this.C = (TextView) view.findViewById(R.id.start_date);
            this.D = (TextView) view.findViewById(R.id.end_date);
            this.E = (TextView) view.findViewById(R.id.text_frequency);
            this.A = (TextView) view.findViewById(R.id.text_payment_id);
            this.B = (TextView) view.findViewById(R.id.text_umn_id);
            this.G = (Button) view.findViewById(R.id.button_manage);
            this.J = (LinearLayout) view.findViewById(R.id.text_state_layout);
            this.H = (LinearLayout) view.findViewById(R.id.button_execute);
            this.I = (LinearLayout) view.findViewById(R.id.button_decline);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.layout_mandate);
            this.K = relativeLayout;
            relativeLayout.setVisibility(8);
        }
    }

    public w90(List<MandatesVo> list) {
        this.e = list;
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
    public int g(int i) {
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(g gVar, int i) {
        MandatesVo mandatesVo = this.e.get(i);
        boolean z = i == this.h;
        gVar.b.setActivated(z);
        gVar.x.setText(mandatesVo.getPayerVpa());
        gVar.z.setText(jg0.b(mandatesVo.getAmount()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0059ao.a(10898));
        try {
            gVar.y.setText(new SimpleDateFormat(C0059ao.a(10899)).format(simpleDateFormat.parse(mandatesVo.getCreatedDate())));
        } catch (ParseException unused) {
        }
        gVar.w.setText(jg0.g(mandatesVo.getPayerAccountName()));
        TextView textView = gVar.A;
        boolean isEmpty = TextUtils.isEmpty(mandatesVo.getRrn());
        String a2 = C0059ao.a(10900);
        textView.setText(isEmpty ? a2 : mandatesVo.getRrn());
        TextView textView2 = gVar.B;
        if (!TextUtils.isEmpty(mandatesVo.getUmn())) {
            a2 = mandatesVo.getUmn();
        }
        textView2.setText(a2);
        gVar.C.setText(jg0.N(mandatesVo.getValidity_start()));
        gVar.D.setText(jg0.N(mandatesVo.getValidity_end()));
        gVar.E.setText(mandatesVo.getRecurrencePattern());
        gVar.F.setText(jg0.t(mandatesVo.getPayerAccountName(), mandatesVo.getPayerVpa()));
        gVar.F.setTypeface(null, 1);
        gVar.K.setVisibility(8);
        gVar.G.setVisibility(0);
        String merchantflag = mandatesVo.getMerchantflag();
        if (!TextUtils.isEmpty(merchantflag) && merchantflag.equalsIgnoreCase(C0059ao.a(10901))) {
            gVar.J.setVisibility(0);
        } else {
            gVar.J.setVisibility(4);
        }
        if (!TextUtils.isEmpty(mandatesVo.getPayeeStatus()) && (mandatesVo.getPayeeStatus().equals(C0059ao.a(10902)) || mandatesVo.getPayeeStatus().equals(C0059ao.a(10903)))) {
            gVar.G.setVisibility(0);
        } else {
            gVar.G.setVisibility(8);
        }
        gVar.L.setOnClickListener(new a());
        gVar.v.setOnClickListener(new b(mandatesVo));
        gVar.H.setOnClickListener(new c(mandatesVo));
        gVar.I.setOnClickListener(new d(mandatesVo));
        gVar.G.setOnClickListener(new e(gVar, z, i));
        gVar.L.setOnLongClickListener(new f(this));
        gVar.K.setVisibility(z ? 0 : 8);
        gVar.G.setVisibility(z ? 8 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public g n(ViewGroup viewGroup, int i) {
        return new g(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pending_mandate_list_row, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.f = ng0Var;
    }

    public void z(ArrayList<MandatesVo> arrayList) {
        this.e = arrayList;
        j();
    }
}
