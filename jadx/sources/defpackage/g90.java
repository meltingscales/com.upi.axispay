package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.Bank;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: AxisPay */
/* renamed from: g90  reason: default package */
/* loaded from: classes.dex */
public class g90 extends RecyclerView.h<c> {
    public Context d;
    public ArrayList<Bank> e;
    public ng0 f;

    /* compiled from: AxisPay */
    /* renamed from: g90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ Bank b;

        public a(Bank bank) {
            this.b = bank;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ng0 ng0Var = g90.this.f;
            if (ng0Var != null) {
                ng0Var.s(R.id.bank_item, this.b);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: g90$b */
    /* loaded from: classes.dex */
    public class b implements View.OnLongClickListener {
        public b(g90 g90Var) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: g90$c */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.d0 {
        public ImageView v;
        public TextView w;
        public View x;

        public c(g90 g90Var, View view) {
            super(view);
            this.x = view;
            this.v = (ImageView) view.findViewById(R.id.bank_logo);
            this.w = (TextView) view.findViewById(R.id.text_bankname);
        }
    }

    public g90(Activity activity, ArrayList<Bank> arrayList) {
        this.e = arrayList;
        Collections.sort(arrayList);
        this.d = activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<Bank> arrayList = this.e;
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
        Bank bank = this.e.get(i);
        cVar.w.setText(bank.getName());
        if (TextUtils.isEmpty(bank.getLogo())) {
            cVar.v.setImageDrawable(t8.f(this.d, 2131230832));
        } else {
            jg0.K(cVar.v, bank.getLogo(), 2131230832);
        }
        cVar.x.setOnClickListener(new a(bank));
        cVar.x.setOnLongClickListener(new b(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public c n(ViewGroup viewGroup, int i) {
        return new c(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bank_list_item, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.f = ng0Var;
    }

    public void z(ArrayList<Bank> arrayList) {
        this.e = arrayList;
        Collections.sort(arrayList);
        j();
    }
}
