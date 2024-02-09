package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.Inbox;
import com.upi.axispay.R;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: q90  reason: default package */
/* loaded from: classes.dex */
public class q90 extends RecyclerView.h<d> {
    public ng0 d;
    public Context e;
    public ArrayList<Inbox> f;

    /* compiled from: AxisPay */
    /* renamed from: q90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ d b;
        public final /* synthetic */ Inbox c;

        public a(d dVar, Inbox inbox) {
            this.b = dVar;
            this.c = inbox;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.x.setVisibility(8);
            this.b.y.setVisibility(0);
            this.b.z.setVisibility(8);
            q90.this.d.s(R.id.list_item, this.c);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: q90$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ Inbox b;

        public b(Inbox inbox) {
            this.b = inbox;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q90.this.d.s(R.id.list_item, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: q90$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ Inbox b;

        public c(Inbox inbox) {
            this.b = inbox;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q90.this.d.s(R.id.delete, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: q90$d */
    /* loaded from: classes.dex */
    public class d extends RecyclerView.d0 {
        public TextView A;
        public ImageView B;
        public ImageView C;
        public View v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public d(q90 q90Var, View view) {
            super(view);
            this.v = view;
            this.w = (TextView) view.findViewById(R.id.inbox_title);
            this.x = (TextView) view.findViewById(R.id.inbox_short_descrption);
            this.y = (TextView) view.findViewById(R.id.inbox_long_descrption);
            this.z = (TextView) view.findViewById(R.id.inbox_know_more);
            this.B = (ImageView) view.findViewById(R.id.message);
            this.C = (ImageView) view.findViewById(R.id.delete);
            this.A = (TextView) view.findViewById(R.id.text_date);
        }
    }

    public q90(Context context, ArrayList<Inbox> arrayList) {
        this.e = context;
        this.f = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<Inbox> arrayList = this.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(d dVar, int i) {
        Inbox inbox = this.f.get(i);
        dVar.b.setVisibility(0);
        dVar.w.setTypeface(null, 1);
        dVar.A.setText(jg0.i(inbox.getCreatedDate(), C0059ao.a(12689)));
        dVar.x.setText(inbox.getShortdiscription());
        dVar.y.setText(inbox.getLongdiscription());
        dVar.w.setText(inbox.getTitle());
        inbox.setSelectPosition(i);
        dVar.z.setOnClickListener(new a(dVar, inbox));
        if (inbox.getIsRead() != null && inbox.getIsRead().equalsIgnoreCase(C0059ao.a(12690))) {
            dVar.x.setVisibility(8);
            dVar.y.setVisibility(0);
            dVar.z.setVisibility(8);
            dVar.v.setBackgroundColor(this.e.getResources().getColor(R.color.grey));
            dVar.B.setImageResource(R.drawable.mail_open);
        } else {
            dVar.x.setVisibility(0);
            dVar.y.setVisibility(8);
            dVar.z.setVisibility(0);
            dVar.v.setBackgroundColor(this.e.getResources().getColor(R.color.white));
            dVar.B.setImageResource(R.drawable.mail_close);
        }
        dVar.v.setOnClickListener(new b(inbox));
        dVar.C.setOnClickListener(new c(inbox));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public d n(ViewGroup viewGroup, int i) {
        return new d(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_inbox_list_item, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.d = ng0Var;
    }

    public void z(ArrayList<Inbox> arrayList) {
        this.f = arrayList;
        j();
    }
}
