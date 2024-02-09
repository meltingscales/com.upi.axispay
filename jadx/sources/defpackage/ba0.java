package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.Billers;
import com.upi.axispay.R;
import java.util.List;

/* compiled from: AxisPay */
/* renamed from: ba0  reason: default package */
/* loaded from: classes.dex */
public class ba0 extends RecyclerView.h<b> {
    public List<Billers> d;
    public ng0 e;

    /* compiled from: AxisPay */
    /* renamed from: ba0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ Billers c;

        public a(int i, Billers billers) {
            this.b = i;
            this.c = billers;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ng0 ng0Var = ba0.this.e;
            if (ng0Var != null) {
                ng0Var.s(this.b, this.c);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ba0$b */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.d0 {
        public TextView v;
        public ImageView w;
        public View x;

        public b(ba0 ba0Var, View view) {
            super(view);
            this.x = this.b.findViewById(R.id.grid_item);
            this.v = (TextView) view.findViewById(R.id.title);
            this.w = (ImageView) view.findViewById(R.id.thumbnail);
        }
    }

    public ba0(Context context, List<Billers> list) {
        this.d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(b bVar, int i) {
        Billers billers = this.d.get(i);
        bVar.v.setText(billers.getNAME());
        jg0.M(bVar.w, billers.getIconUrl(), billers.getNAME());
        bVar.x.setOnClickListener(new a(i, billers));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public b n(ViewGroup viewGroup, int i) {
        return new b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_single, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.e = ng0Var;
    }

    public void z(List<Billers> list) {
        this.d = list;
        j();
    }
}
