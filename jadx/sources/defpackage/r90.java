package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.upi.axispay.R;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: r90  reason: default package */
/* loaded from: classes.dex */
public class r90 extends RecyclerView.h<b> {
    public Context d;
    public ArrayList<rg0> e;
    public ng0 f;
    public int g;

    /* compiled from: AxisPay */
    /* renamed from: r90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ rg0 b;

        public a(rg0 rg0Var) {
            this.b = rg0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ng0 ng0Var = r90.this.f;
            if (ng0Var != null) {
                ng0Var.s(R.id.grid_item, this.b);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: r90$b */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.d0 {
        public TextView v;
        public TextView w;
        public ImageView x;
        public ImageView y;
        public final View z;

        public b(r90 r90Var, View view) {
            super(view);
            View view2 = this.b;
            this.z = view2;
            this.y = (ImageView) view2.findViewById(R.id.image_dash);
            this.x = (ImageView) view2.findViewById(R.id.icon);
            this.v = (TextView) view2.findViewById(R.id.text_date);
            this.w = (TextView) view2.findViewById(R.id.text_counter);
        }
    }

    public r90() {
    }

    public void A(ArrayList<rg0> arrayList) {
        this.e = arrayList;
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(b bVar, int i) {
        rg0 rg0Var = this.e.get(i);
        bVar.x.setImageResource(rg0Var.c());
        bVar.y.setImageResource(rg0Var.d());
        bVar.v.setText(rg0Var.f());
        bVar.v.setTextColor(rg0Var.g());
        bVar.w.setText(String.valueOf(this.g));
        if (rg0Var.h()) {
            bVar.z.setBackgroundResource(rg0Var.a());
        } else {
            bVar.z.setBackgroundColor(t8.d(this.d, R.color.white));
        }
        bVar.w.setVisibility(rg0Var.i() ? 0 : 8);
        bVar.z.setOnClickListener(new a(rg0Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public b n(ViewGroup viewGroup, int i) {
        return new b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mandate_grid_view, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.f = ng0Var;
    }

    public void z(int i) {
        this.g = i;
        j();
    }

    public r90(Context context, ArrayList<rg0> arrayList) {
        this.d = context;
        this.e = arrayList;
    }
}
