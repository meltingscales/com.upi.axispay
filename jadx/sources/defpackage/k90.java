package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.BeneVpa;
import com.pkmmte.view.CircularImageView;
import com.upi.axispay.R;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: k90  reason: default package */
/* loaded from: classes.dex */
public class k90 extends RecyclerView.h<e> {
    public int d;
    public ng0 e;
    public ArrayList<BeneVpa> f;
    public Context g;

    /* compiled from: AxisPay */
    /* renamed from: k90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ BeneVpa b;

        public a(BeneVpa beneVpa) {
            this.b = beneVpa;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ng0 ng0Var = k90.this.e;
            if (ng0Var != null) {
                ng0Var.s(R.id.bene_item, this.b);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: k90$b */
    /* loaded from: classes.dex */
    public class b implements View.OnLongClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ BeneVpa c;

        public b(int i, BeneVpa beneVpa) {
            this.b = i;
            this.c = beneVpa;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ng0 ng0Var = k90.this.e;
            if (ng0Var != null) {
                ng0Var.a(this.b, this.c, view);
                return true;
            }
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: k90$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ BeneVpa b;

        public c(BeneVpa beneVpa) {
            this.b = beneVpa;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ng0 ng0Var = k90.this.e;
            if (ng0Var != null) {
                ng0Var.s(R.id.contact_delete, this.b);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: k90$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ BeneVpa b;

        public d(BeneVpa beneVpa) {
            this.b = beneVpa;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k90.this.e.s(R.id.favourite_icon, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: k90$e */
    /* loaded from: classes.dex */
    public class e extends RecyclerView.d0 {
        public ImageView A;
        public CircularImageView B;
        public ImageView C;
        public final View v;
        public View w;
        public TextView x;
        public TextView y;
        public TextView z;

        public e(k90 k90Var, View view) {
            super(view);
            this.v = view;
            this.w = view.findViewById(R.id.bene_item);
            this.x = (TextView) view.findViewById(R.id.contact_name);
            this.z = (TextView) view.findViewById(R.id.contact_nickname);
            this.y = (TextView) view.findViewById(R.id.contact_vpa);
            this.C = (ImageView) view.findViewById(R.id.contact_delete);
            this.A = (ImageView) view.findViewById(R.id.favourite_icon);
            this.B = (CircularImageView) view.findViewById(R.id.contact_profile_pic);
        }
    }

    public k90(Context context, ArrayList<BeneVpa> arrayList, int i) {
        this.f = arrayList;
        this.g = context;
        this.d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<BeneVpa> arrayList = this.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(e eVar, int i) {
        BeneVpa beneVpa = this.f.get(i);
        String nickname = beneVpa.getNickname();
        String name = beneVpa.getName();
        if (nickname != null && name != null && nickname.equalsIgnoreCase(name)) {
            eVar.z.setVisibility(8);
        } else {
            eVar.z.setVisibility(0);
        }
        eVar.x.setText(jg0.g(name));
        eVar.z.setText(nickname);
        eVar.y.setText(jg0.j(beneVpa.getVpa()));
        eVar.w.setOnClickListener(new a(beneVpa));
        eVar.v.setOnLongClickListener(new b(i, beneVpa));
        eVar.C.setOnClickListener(new c(beneVpa));
        if (this.g != null) {
            eVar.B.setImageDrawable(jg0.y(beneVpa.getName(), t8.d(this.g, R.color.credit)));
        }
        if (this.d == 5) {
            eVar.A.setVisibility(0);
            if ((TextUtils.isEmpty(beneVpa.getFavorite()) ? C0059ao.a(15491) : beneVpa.getFavorite()).equals(C0059ao.a(15492))) {
                eVar.A.setImageResource(2131230946);
            } else {
                eVar.A.setImageResource(2131230945);
            }
            eVar.A.setOnClickListener(new d(beneVpa));
            eVar.C.setVisibility(0);
            if (beneVpa.isBlocked()) {
                eVar.A.setVisibility(8);
                eVar.v.setEnabled(false);
                eVar.v.setClickable(false);
                eVar.v.setBackgroundColor(t8.d(this.g, R.color.grey));
                return;
            }
            Context context = this.g;
            if (context != null) {
                eVar.v.setBackgroundColor(t8.d(context, R.color.white));
            }
            eVar.A.setVisibility(0);
            return;
        }
        eVar.A.setVisibility(8);
        eVar.C.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public e n(ViewGroup viewGroup, int i) {
        return new e(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.beneficiary_item, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.e = ng0Var;
    }

    public void z(ArrayList<BeneVpa> arrayList, int i) {
        this.f = arrayList;
        this.d = i;
        j();
    }
}
