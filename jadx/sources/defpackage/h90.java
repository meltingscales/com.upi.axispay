package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Bank;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: h90  reason: default package */
/* loaded from: classes.dex */
public class h90 extends RecyclerView.h<d> {
    public ArrayList<Account> d;
    public Activity e;
    public ng0 f;
    public int g = -1;

    /* compiled from: AxisPay */
    /* renamed from: h90$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<Account> {
        public a(h90 h90Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Account account, Account account2) {
            return account.getBankName().compareTo(account2.getBankName());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: h90$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ Account c;

        public b(int i, Account account) {
            this.b = i;
            this.c = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h90 h90Var = h90.this;
            h90Var.g = this.b;
            h90Var.f.s(R.id.account_refresh_balance, this.c);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: h90$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ Account b;

        public c(Account account) {
            this.b = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h90.this.f.s(R.id.layout_details, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: h90$d */
    /* loaded from: classes.dex */
    public class d extends RecyclerView.d0 {
        public TextView A;
        public TextView B;
        public TextView C;
        public TextView D;
        public ImageView E;
        public ImageView F;
        public RelativeLayout G;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public d(h90 h90Var, View view) {
            super(view);
            this.y = (TextView) view.findViewById(R.id.account_vpa);
            this.E = (ImageView) view.findViewById(R.id.image_bank);
            this.v = (TextView) view.findViewById(R.id.bank_name);
            this.w = (TextView) view.findViewById(R.id.account_no);
            this.C = (TextView) view.findViewById(R.id.account_type);
            this.x = (TextView) view.findViewById(R.id.text_ifsc);
            this.B = (TextView) view.findViewById(R.id.account_balance);
            this.D = (TextView) view.findViewById(R.id.text_last_refreshed);
            this.F = (ImageView) view.findViewById(R.id.favourite_icon_set_upi);
            this.z = (TextView) view.findViewById(R.id.text_pin_availability);
            this.A = (TextView) view.findViewById(R.id.account_refresh_balance);
            this.G = (RelativeLayout) view.findViewById(R.id.layout_details);
            this.w.setTypeface(null, 1);
            this.x.setTypeface(null, 1);
            this.C.setTypeface(null, 1);
        }
    }

    public h90(Activity activity, ArrayList<Account> arrayList) {
        this.d = arrayList;
        z(arrayList);
        this.e = activity;
    }

    public void A(ArrayList<Account> arrayList) {
        this.d = arrayList;
        z(arrayList);
        j();
    }

    public void B(String str) {
        int i = this.g;
        if (i == -1 || i >= this.d.size()) {
            return;
        }
        Account account = this.d.get(this.g);
        account.setBalance(str);
        account.setBalTime(jg0.x(new Date(), C0059ao.a(6012)));
        account.setCheckBalance(1);
        this.d.set(this.g, account);
        qa0.v().x0(account);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<Account> arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(d dVar, int i) {
        Account account = this.d.get(i);
        dVar.v.setText(account.getBankName());
        Bank e = qa0.v().e(account.getIin());
        if (e != null) {
            jg0.K(dVar.E, e.getLogo(), 2131230832);
        } else {
            dVar.E.setImageResource(2131230832);
        }
        account.getVpa();
        dVar.w.setText(account.getMaskedAccnumber());
        dVar.x.setText(account.getIfsc());
        dVar.C.setText(account.getType());
        dVar.y.setText(account.getVpa());
        dVar.A.setOnClickListener(new b(i, account));
        dVar.B.setVisibility(8);
        dVar.D.setVisibility(8);
        dVar.G.setOnClickListener(new c(account));
        boolean isEmpty = TextUtils.isEmpty(account.getVpa());
        String a2 = C0059ao.a(6013);
        if (isEmpty) {
            dVar.B.setVisibility(8);
            dVar.D.setVisibility(8);
            dVar.A.setVisibility(8);
        } else if (!account.getStatus().equalsIgnoreCase(a2)) {
            dVar.B.setVisibility(8);
            dVar.D.setVisibility(8);
            dVar.A.setVisibility(8);
        } else if (!TextUtils.isEmpty(account.getVpa()) && account.getStatus().equalsIgnoreCase(a2)) {
            dVar.A.setVisibility(0);
            dVar.B.setVisibility(0);
            dVar.D.setVisibility(0);
            dVar.B.setText(jg0.b(account.getBalance()));
            dVar.D.setText(account.getBalTime());
        }
        if (account.getCheckBalance() == 1) {
            account.setCheckBalance(0);
            dVar.B.setVisibility(0);
            dVar.D.setVisibility(0);
        } else {
            dVar.B.setVisibility(8);
            dVar.D.setVisibility(8);
        }
        if (!account.getStatus().equalsIgnoreCase(a2)) {
            TextView textView = dVar.z;
            textView.setText(account.getdLength() + this.e.getString(R.string.pin_required));
            dVar.z.setTextColor(t8.d(this.e, R.color.radio_orange));
            dVar.F.setImageDrawable(t8.f(this.e, R.drawable.notsetmpin));
            return;
        }
        TextView textView2 = dVar.z;
        textView2.setText(account.getdLength() + this.e.getString(R.string.pin_exists));
        dVar.z.setTextColor(t8.d(this.e, R.color.pin_exist));
        dVar.F.setImageDrawable(t8.f(this.e, 2131231303));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public d n(ViewGroup viewGroup, int i) {
        return new d(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bill_pay_myaccounts_row_item, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.f = ng0Var;
    }

    public void z(ArrayList<Account> arrayList) {
        if (arrayList != null) {
            Collections.sort(arrayList, new a(this));
        }
    }
}
