package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.BillerCircle;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: AxisPay */
/* renamed from: i90  reason: default package */
/* loaded from: classes.dex */
public class i90 extends RecyclerView.h<c> {
    public ArrayList<BillerCircle> d;
    public ng0 e;

    /* compiled from: AxisPay */
    /* renamed from: i90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ BillerCircle b;

        public a(BillerCircle billerCircle) {
            this.b = billerCircle;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ng0 ng0Var = i90.this.e;
            if (ng0Var != null) {
                ng0Var.s(R.id.bank_item, this.b);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: i90$b */
    /* loaded from: classes.dex */
    public class b implements View.OnLongClickListener {
        public b(i90 i90Var) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: i90$c */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.d0 {
        public ImageView v;
        public TextView w;
        public View x;

        public c(i90 i90Var, View view) {
            super(view);
            this.x = view;
            this.v = (ImageView) view.findViewById(R.id.bank_logo);
            this.w = (TextView) view.findViewById(R.id.text_bankname);
        }
    }

    public i90(Activity activity, ArrayList<BillerCircle> arrayList) {
        this.d = arrayList;
        Collections.sort(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<BillerCircle> arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(c cVar, int i) {
        BillerCircle billerCircle = this.d.get(i);
        cVar.w.setText(billerCircle.getDESCRPTN());
        cVar.v.setVisibility(4);
        cVar.x.setOnClickListener(new a(billerCircle));
        cVar.x.setOnLongClickListener(new b(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public c n(ViewGroup viewGroup, int i) {
        return new c(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bank_list_item, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.e = ng0Var;
    }

    public void z(ArrayList<BillerCircle> arrayList) {
        this.d = arrayList;
        Collections.sort(arrayList);
        j();
    }
}
