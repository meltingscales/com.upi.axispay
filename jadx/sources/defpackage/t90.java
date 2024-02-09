package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: AxisPay */
/* renamed from: t90  reason: default package */
/* loaded from: classes.dex */
public class t90 extends RecyclerView.h<c> {
    public ArrayList<String> d;
    public ng0 e;

    /* compiled from: AxisPay */
    /* renamed from: t90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ng0 ng0Var = t90.this.e;
            if (ng0Var != null) {
                ng0Var.s(R.id.circle_item, this.b);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: t90$b */
    /* loaded from: classes.dex */
    public class b implements View.OnLongClickListener {
        public b(t90 t90Var) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: t90$c */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.d0 {
        public TextView v;
        public View w;

        public c(t90 t90Var, View view) {
            super(view);
            this.w = view;
            ImageView imageView = (ImageView) view.findViewById(R.id.bank_logo);
            this.v = (TextView) view.findViewById(R.id.text_bankname);
        }
    }

    public t90(Activity activity, ArrayList<String> arrayList) {
        this.d = arrayList;
        Collections.sort(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<String> arrayList = this.d;
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
        String str = this.d.get(i);
        cVar.v.setText(str);
        cVar.w.setOnClickListener(new a(str));
        cVar.w.setOnLongClickListener(new b(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public c n(ViewGroup viewGroup, int i) {
        return new c(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mobile_circle_list, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.e = ng0Var;
    }

    public void z(ArrayList<String> arrayList) {
        this.d = arrayList;
        Collections.sort(arrayList);
        j();
    }
}
