package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.PendingReqVo;
import com.pkmmte.view.CircularImageView;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: da0  reason: default package */
/* loaded from: classes.dex */
public class da0 extends RecyclerView.h<f> {
    public Context d;
    public ng0 e;
    public ArrayList<PendingReqVo> f;

    /* compiled from: AxisPay */
    /* renamed from: da0$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<PendingReqVo> {
        public a(da0 da0Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(PendingReqVo pendingReqVo, PendingReqVo pendingReqVo2) {
            String expdate = pendingReqVo.getExpdate();
            String a = C0059ao.a(9752);
            Date h = jg0.h(expdate, a);
            Date h2 = jg0.h(pendingReqVo2.getExpdate(), a);
            if (h == null || h2 == null) {
                return 0;
            }
            h.compareTo(h2);
            if (h.getTime() > h2.getTime()) {
                return 1;
            }
            return h.getTime() == h2.getTime() ? 0 : -1;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: da0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ PendingReqVo b;

        public b(PendingReqVo pendingReqVo) {
            this.b = pendingReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            da0.this.e.s(R.id.button_approve, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: da0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ PendingReqVo b;

        public c(PendingReqVo pendingReqVo) {
            this.b = pendingReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            da0.this.e.s(R.id.button_decline, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: da0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ PendingReqVo b;

        public d(PendingReqVo pendingReqVo) {
            this.b = pendingReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            da0.this.e.s(R.id.button_block, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: da0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ PendingReqVo b;

        public e(PendingReqVo pendingReqVo) {
            this.b = pendingReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            da0.this.e.s(R.id.invoice, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: da0$f */
    /* loaded from: classes.dex */
    public class f extends RecyclerView.d0 {
        public TextView A;
        public LinearLayout B;
        public LinearLayout C;
        public LinearLayout D;
        public CircularImageView E;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public f(da0 da0Var, View view) {
            super(view);
            this.y = (TextView) view.findViewById(R.id.text_days);
            this.z = (TextView) view.findViewById(R.id.text_tran_name);
            this.E = (CircularImageView) view.findViewById(R.id.tran_icon);
            this.v = (TextView) view.findViewById(R.id.text_tran_amount);
            this.x = (TextView) view.findViewById(R.id.text_tran_connection);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.button_block);
            this.A = (TextView) view.findViewById(R.id.tvDNUser);
            this.C = (LinearLayout) view.findViewById(R.id.button_approve);
            this.B = (LinearLayout) view.findViewById(R.id.button_decline);
            this.D = (LinearLayout) view.findViewById(R.id.layout_verified);
            this.w = (TextView) view.findViewById(R.id.invoice);
        }
    }

    public da0(Context context, ArrayList<PendingReqVo> arrayList) {
        this.d = context;
        A(arrayList);
    }

    public void A(ArrayList<PendingReqVo> arrayList) {
        this.f = arrayList;
        if (arrayList != null) {
            Collections.sort(arrayList, new a(this));
        }
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<PendingReqVo> arrayList = this.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(f fVar, int i) {
        PendingReqVo pendingReqVo = this.f.get(i);
        TextView textView = fVar.x;
        textView.setText(R.string.From + pendingReqVo.getPayerVpa());
        TextView textView2 = fVar.v;
        textView2.setText(C0059ao.a(9695) + String.valueOf(pendingReqVo.getAmount()));
        fVar.z.setText(pendingReqVo.getBeneName());
        fVar.x.setText(pendingReqVo.getPayeeVpa());
        fVar.E.setImageDrawable(jg0.y(pendingReqVo.getBeneName(), t8.d(this.d, R.color.debit)));
        fVar.y.setText(pendingReqVo.getExpdate());
        String merchantflag = pendingReqVo.getMerchantflag();
        if (TextUtils.isEmpty(merchantflag) || !merchantflag.equalsIgnoreCase(C0059ao.a(9696))) {
            fVar.D.setVisibility(8);
            fVar.w.setVisibility(8);
        } else {
            fVar.D.setVisibility(0);
            if (TextUtils.isEmpty(pendingReqVo.getInvoiceurl())) {
                fVar.w.setVisibility(8);
            } else {
                fVar.w.setVisibility(0);
            }
        }
        fVar.C.setOnClickListener(new b(pendingReqVo));
        fVar.B.setOnClickListener(new c(pendingReqVo));
        fVar.A.setOnClickListener(new d(pendingReqVo));
        fVar.w.setOnClickListener(new e(pendingReqVo));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public f n(ViewGroup viewGroup, int i) {
        return new f(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_pending_list_item, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.e = ng0Var;
    }

    public void z(ArrayList<PendingReqVo> arrayList) {
        A(arrayList);
        j();
    }
}
