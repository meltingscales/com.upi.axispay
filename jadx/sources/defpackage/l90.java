package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AxisPay */
/* renamed from: l90  reason: default package */
/* loaded from: classes.dex */
public class l90 extends RecyclerView.h<d> {
    public Activity d;
    public ng0 e;
    public List<pg0> f;
    public boolean g;

    /* compiled from: AxisPay */
    /* renamed from: l90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ pg0 b;

        public a(pg0 pg0Var) {
            this.b = pg0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l90.this.e.s(202, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l90$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ pg0 b;
        public final /* synthetic */ d c;

        public b(pg0 pg0Var, d dVar) {
            this.b = pg0Var;
            this.c = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.b.f()) {
                if (l90.this.g) {
                    l90.this.g = false;
                    this.c.z.setVisibility(8);
                    return;
                }
                this.c.z.setVisibility(0);
                l90.this.g = true;
                return;
            }
            l90.this.e.s(202, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l90$c */
    /* loaded from: classes.dex */
    public class c implements View.OnLongClickListener {
        public c(l90 l90Var) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l90$d */
    /* loaded from: classes.dex */
    public class d extends RecyclerView.d0 {
        public View A;
        public TextView v;
        public TextView w;
        public ImageView x;
        public ImageView y;
        public LinearLayout z;

        public d(l90 l90Var, View view) {
            super(view);
            this.A = view;
            this.v = (TextView) view.findViewById(R.id.text_name);
            this.w = (TextView) view.findViewById(R.id.text_new);
            this.x = (ImageView) view.findViewById(R.id.image_item);
            this.y = (ImageView) view.findViewById(R.id.image_dropdown);
            this.z = (LinearLayout) view.findViewById(R.id.layout_options);
        }
    }

    public l90(Activity activity, List<pg0> list) {
        this.f = list;
        this.d = activity;
        if (activity instanceof ng0) {
            this.e = (ng0) activity;
        }
    }

    public void A(ng0 ng0Var) {
        this.e = ng0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: y */
    public void l(d dVar, int i) {
        pg0 pg0Var = this.f.get(i);
        dVar.x.setImageDrawable(dVar.A.getResources().getDrawable(pg0Var.c()));
        dVar.v.setText(pg0Var.e());
        dVar.w.setVisibility(pg0Var.g() ? 0 : 8);
        this.g = false;
        if (pg0Var.f()) {
            dVar.y.setVisibility(0);
            dVar.z.removeAllViews();
            ArrayList<pg0> b2 = pg0Var.b();
            if (b2 != null) {
                Iterator<pg0> it = b2.iterator();
                while (it.hasNext()) {
                    pg0 next = it.next();
                    TextView textView = (TextView) LayoutInflater.from(this.d).inflate(R.layout.menu_subitem, (ViewGroup) null, false);
                    textView.setText(next.e());
                    textView.setOnClickListener(new a(next));
                    dVar.z.addView(textView);
                }
            }
        } else {
            dVar.y.setVisibility(8);
        }
        dVar.A.setOnClickListener(new b(pg0Var, dVar));
        dVar.A.setOnLongClickListener(new c(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: z */
    public d n(ViewGroup viewGroup, int i) {
        return new d(this, LayoutInflater.from(this.d).inflate(R.layout.menuitem_row, viewGroup, false));
    }
}
