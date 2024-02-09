package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.Collectbeneblock;
import com.pkmmte.view.CircularImageView;
import com.upi.axispay.R;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: j90  reason: default package */
/* loaded from: classes.dex */
public class j90 extends RecyclerView.h<c> {
    public ArrayList<Collectbeneblock> d;
    public Context e;
    public ng0 f;

    /* compiled from: AxisPay */
    /* renamed from: j90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ Collectbeneblock b;

        public a(Collectbeneblock collectbeneblock) {
            this.b = collectbeneblock;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j90.this.f.s(R.id.button_unblockk, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: j90$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ Collectbeneblock b;

        public b(Collectbeneblock collectbeneblock) {
            this.b = collectbeneblock;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j90.this.f.s(R.id.contact_delete, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: j90$c */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.d0 {
        public TextView v;
        public TextView w;
        public Button x;
        public ImageView y;
        public CircularImageView z;

        public c(j90 j90Var, View view) {
            super(view);
            this.v = (TextView) view.findViewById(R.id.text_vpa);
            this.w = (TextView) view.findViewById(R.id.text_name);
            this.y = (ImageView) view.findViewById(R.id.contact_delete);
            this.x = (Button) view.findViewById(R.id.button_unblockk);
            this.z = (CircularImageView) view.findViewById(R.id.contact_profile_pic);
        }
    }

    public j90(Context context, ArrayList<Collectbeneblock> arrayList, int i) {
        this.d = arrayList;
        this.e = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(c cVar, int i) {
        Collectbeneblock collectbeneblock = this.d.get(i);
        cVar.v.setText(String.valueOf(collectbeneblock.getVpa()));
        BeneVpa f = qa0.v().f(collectbeneblock.getVpa());
        if (f != null) {
            cVar.w.setText(f.getName());
        } else {
            cVar.w.setText(collectbeneblock.getVpa());
            cVar.v.setText(C0059ao.a(323));
        }
        cVar.z.setImageDrawable(jg0.y(collectbeneblock.getVpa(), t8.d(this.e, R.color.debit)));
        cVar.x.setOnClickListener(new a(collectbeneblock));
        cVar.y.setOnClickListener(new b(collectbeneblock));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public c n(ViewGroup viewGroup, int i) {
        return new c(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.blocked_item_row, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.f = ng0Var;
    }

    public void z(ArrayList<Collectbeneblock> arrayList, int i) {
        this.d = arrayList;
        j();
    }
}
