package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.PendingMandateReqVo;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ca0  reason: default package */
/* loaded from: classes.dex */
public class ca0 extends RecyclerView.h<k> {
    public List<PendingMandateReqVo> d;
    public Context e;
    public ng0 f;

    /* compiled from: AxisPay */
    /* renamed from: ca0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ PendingMandateReqVo b;

        public a(PendingMandateReqVo pendingMandateReqVo) {
            this.b = pendingMandateReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ca0.this.f.s(R.id.invoice, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ca0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ PendingMandateReqVo b;

        public b(PendingMandateReqVo pendingMandateReqVo) {
            this.b = pendingMandateReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ca0.this.f.s(R.id.button_block, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ca0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ PendingMandateReqVo b;

        public c(PendingMandateReqVo pendingMandateReqVo) {
            this.b = pendingMandateReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ca0.this.f.s(R.id.button_block1, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ca0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ PendingMandateReqVo b;

        public d(PendingMandateReqVo pendingMandateReqVo) {
            this.b = pendingMandateReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ca0.this.f.s(R.id.button_decline1, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ca0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ PendingMandateReqVo b;

        public e(PendingMandateReqVo pendingMandateReqVo) {
            this.b = pendingMandateReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ca0.this.f.s(R.id.button_decline, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ca0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ PendingMandateReqVo b;

        public f(PendingMandateReqVo pendingMandateReqVo) {
            this.b = pendingMandateReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ca0.this.f.s(R.id.button_approve, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ca0$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public final /* synthetic */ PendingMandateReqVo b;

        public g(PendingMandateReqVo pendingMandateReqVo) {
            this.b = pendingMandateReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ca0.this.f.s(R.id.button_approve1, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ca0$h */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public final /* synthetic */ PendingMandateReqVo b;

        public h(PendingMandateReqVo pendingMandateReqVo) {
            this.b = pendingMandateReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ca0.this.f.s(R.id.button_execute, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ca0$i */
    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {
        public final /* synthetic */ PendingMandateReqVo b;

        public i(PendingMandateReqVo pendingMandateReqVo) {
            this.b = pendingMandateReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ca0.this.f.s(R.id.button_revoke, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ca0$j */
    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {
        public final /* synthetic */ PendingMandateReqVo b;
        public final /* synthetic */ k c;

        public j(ca0 ca0Var, PendingMandateReqVo pendingMandateReqVo, k kVar) {
            this.b = pendingMandateReqVo;
            this.c = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.b.getPurposecode() != null) {
                if (C0059ao.a(1740).equalsIgnoreCase(this.b.getPurposecode())) {
                    this.c.I.setVisibility(8);
                    return;
                }
            }
            RelativeLayout relativeLayout = this.c.T;
            relativeLayout.setVisibility(relativeLayout.getVisibility() == 0 ? 8 : 0);
            LinearLayout linearLayout = this.c.H;
            linearLayout.setVisibility(linearLayout.getVisibility() == 0 ? 8 : 0);
            LinearLayout linearLayout2 = this.c.I;
            linearLayout2.setVisibility(linearLayout2.getVisibility() != 0 ? 0 : 8);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ca0$k */
    /* loaded from: classes.dex */
    public class k extends RecyclerView.d0 {
        public TextView A;
        public TextView B;
        public TextView C;
        public TextView D;
        public TextView E;
        public TextView F;
        public TextView G;
        public LinearLayout H;
        public LinearLayout I;
        public LinearLayout J;
        public LinearLayout K;
        public LinearLayout L;
        public LinearLayout M;
        public LinearLayout N;
        public LinearLayout O;
        public LinearLayout P;
        public LinearLayout Q;
        public LinearLayout R;
        public LinearLayout S;
        public RelativeLayout T;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public k(ca0 ca0Var, View view) {
            super(view);
            view.findViewById(R.id.layout_row);
            this.F = (TextView) view.findViewById(R.id.image_item);
            this.y = (TextView) view.findViewById(R.id.text_id);
            this.x = (TextView) view.findViewById(R.id.text_name);
            this.z = (TextView) view.findViewById(R.id.text_date);
            TextView textView = (TextView) view.findViewById(R.id.text_state);
            this.A = (TextView) view.findViewById(R.id.text_amount);
            this.B = (TextView) view.findViewById(R.id.start_date);
            this.C = (TextView) view.findViewById(R.id.end_date);
            this.D = (TextView) view.findViewById(R.id.text_frequency);
            this.E = (TextView) view.findViewById(R.id.remarks);
            this.v = (TextView) view.findViewById(R.id.text_view_amount_tag);
            this.Q = (LinearLayout) view.findViewById(R.id.text_state_layout);
            this.R = (LinearLayout) view.findViewById(R.id.button_execute);
            this.S = (LinearLayout) view.findViewById(R.id.button_revoke);
            this.J = (LinearLayout) view.findViewById(R.id.button_block);
            this.K = (LinearLayout) view.findViewById(R.id.button_decline);
            this.L = (LinearLayout) view.findViewById(R.id.button_approve);
            this.N = (LinearLayout) view.findViewById(R.id.button_block1);
            this.O = (LinearLayout) view.findViewById(R.id.button_decline1);
            this.P = (LinearLayout) view.findViewById(R.id.button_approve1);
            this.M = (LinearLayout) view.findViewById(R.id.layout_row);
            this.H = (LinearLayout) view.findViewById(R.id.layout_bottons);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_bottons2);
            this.I = linearLayout;
            linearLayout.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.layout_mandate);
            this.T = relativeLayout;
            relativeLayout.setVisibility(8);
            this.G = (TextView) view.findViewById(R.id.text_invoice);
            this.w = (TextView) view.findViewById(R.id.text_refid);
        }
    }

    public ca0(Context context) {
        this.e = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        List<PendingMandateReqVo> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int i2) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(defpackage.ca0.k r7, int r8) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca0.l(ca0$k, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public k n(ViewGroup viewGroup, int i2) {
        return new k(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_pending_mandate, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.f = ng0Var;
    }

    public void z(ArrayList<PendingMandateReqVo> arrayList) {
        this.d = arrayList;
        j();
    }

    public ca0(List<PendingMandateReqVo> list) {
        this.d = list;
        this.e = this.e;
    }
}
