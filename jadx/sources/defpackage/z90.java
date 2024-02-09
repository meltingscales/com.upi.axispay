package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.PendingReqVo;
import com.pkmmte.view.CircularImageView;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.Collections;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: z90  reason: default package */
/* loaded from: classes.dex */
public class z90 extends RecyclerView.h<b> {
    public ng0 d;
    public Context e;
    public ArrayList<PendingReqVo> f;

    /* compiled from: AxisPay */
    /* renamed from: z90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ PendingReqVo c;

        public a(int i, PendingReqVo pendingReqVo) {
            this.b = i;
            this.c = pendingReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z90.this.d.s(this.b, this.c);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: z90$b */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.d0 {
        public TextView v;
        public TextView w;
        public TextView x;
        public CircularImageView y;
        public View z;

        public b(z90 z90Var, View view) {
            super(view);
            this.z = view;
            this.x = (TextView) view.findViewById(R.id.tran_name);
            this.y = (CircularImageView) view.findViewById(R.id.tran_icon);
            this.w = (TextView) view.findViewById(R.id.text_days);
            this.v = (TextView) view.findViewById(R.id.tran_amount);
        }
    }

    public z90(ArrayList<PendingReqVo> arrayList, ng0 ng0Var) {
        this.f = arrayList;
        Collections.sort(arrayList);
        this.d = ng0Var;
    }

    public void A(ArrayList<PendingReqVo> arrayList) {
        this.f = arrayList;
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f.size();
    }

    public ArrayList<PendingReqVo> w() {
        return this.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public void l(b bVar, int i) {
        PendingReqVo pendingReqVo = this.f.get(i);
        TextView textView = bVar.v;
        textView.setText(C0059ao.a(3817) + String.valueOf(pendingReqVo.getAmount()));
        bVar.w.setText(pendingReqVo.getExpdate());
        bVar.x.setText(pendingReqVo.getBeneName());
        bVar.y.setImageDrawable(jg0.y(pendingReqVo.getBeneName(), t8.d(this.e, R.color.sender)));
        bVar.z.setOnClickListener(new a(i, pendingReqVo));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: y */
    public b n(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.e = context;
        return new b(this, LayoutInflater.from(context).inflate(R.layout.notification_list_row, viewGroup, false));
    }

    public void z(ng0 ng0Var) {
        this.d = ng0Var;
    }
}
