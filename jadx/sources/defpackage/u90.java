package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
/* renamed from: u90  reason: default package */
/* loaded from: classes.dex */
public class u90 extends RecyclerView.h<h> {
    public ng0 d;
    public int e = -1;
    public ArrayList<Account> f;
    public Activity g;

    /* compiled from: AxisPay */
    /* renamed from: u90$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<Account> {
        public a(u90 u90Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Account account, Account account2) {
            return account.getBankName().compareTo(account2.getBankName());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: u90$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ Account b;

        public b(Account account) {
            this.b = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u90.this.d.s(R.id.account_delete, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: u90$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ Account c;

        public c(int i, Account account) {
            this.b = i;
            this.c = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u90 u90Var = u90.this;
            u90Var.e = this.b;
            u90Var.d.s(R.id.account_refresh_balance, this.c);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: u90$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ Account b;

        public d(Account account) {
            this.b = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u90.this.d.s(R.id.button_change_upi_pin, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: u90$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ Account b;

        public e(Account account) {
            this.b = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u90.this.d.s(R.id.button_reset_upi_pin, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: u90$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ Account b;

        public f(Account account) {
            this.b = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u90.this.d.s(R.id.button_set_upi_id, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: u90$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public final /* synthetic */ Account b;

        public g(Account account) {
            this.b = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u90.this.d.s(R.id.button_set_upi_pin, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: u90$h */
    /* loaded from: classes.dex */
    public class h extends RecyclerView.d0 {
        public TextView A;
        public TextView B;
        public TextView C;
        public TextView D;
        public Button E;
        public Button F;
        public Button G;
        public ImageView H;
        public ImageView I;
        public ImageView J;
        public LinearLayout K;
        public TextView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public TextView z;

        public h(u90 u90Var, View view) {
            super(view);
            this.v = (TextView) view.findViewById(R.id.bank_name);
            this.D = (TextView) view.findViewById(R.id.text_last_refreshed);
            this.w = (TextView) view.findViewById(R.id.account_no);
            this.A = (TextView) view.findViewById(R.id.account_refresh_balance);
            this.B = (TextView) view.findViewById(R.id.account_balance);
            this.x = (TextView) view.findViewById(R.id.text_ifsc);
            this.C = (TextView) view.findViewById(R.id.account_type);
            this.z = (TextView) view.findViewById(R.id.text_pin_availability);
            this.y = (TextView) view.findViewById(R.id.account_vpa);
            this.E = (Button) view.findViewById(R.id.button_set_upi_pin);
            this.F = (Button) view.findViewById(R.id.button_change_upi_pin);
            this.G = (Button) view.findViewById(R.id.button_reset_upi_pin);
            this.I = (ImageView) view.findViewById(R.id.account_delete);
            this.J = (ImageView) view.findViewById(R.id.favourite_icon_set_upi);
            this.H = (ImageView) view.findViewById(R.id.image_bank);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_buttons);
            this.K = (LinearLayout) view.findViewById(R.id.refresh_layout);
        }
    }

    public u90(Activity activity, ArrayList<Account> arrayList) {
        this.f = arrayList;
        z(arrayList);
        this.g = activity;
    }

    public void A(ArrayList<Account> arrayList) {
        this.f = arrayList;
        z(arrayList);
        j();
    }

    public void B(String str) {
        int i = this.e;
        if (i == -1 || i >= this.f.size()) {
            return;
        }
        Account account = this.f.get(this.e);
        account.setBalance(str);
        account.setBalTime(jg0.x(new Date(), C0059ao.a(324)));
        account.setCheckBalance(1);
        this.f.set(this.e, account);
        qa0.v().x0(account);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<Account> arrayList = this.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(h hVar, int i) {
        Account account = this.f.get(i);
        hVar.v.setText(account.getBankName());
        Bank e2 = qa0.v().e(account.getIin());
        if (e2 != null) {
            if (TextUtils.isEmpty(e2.getLogo())) {
                hVar.H.setImageDrawable(t8.f(this.g, 2131230832));
            } else {
                jg0.K(hVar.H, e2.getLogo(), 2131230832);
            }
        }
        account.getVpa();
        hVar.w.setText(account.getMaskedAccnumber());
        hVar.x.setText(account.getIfsc());
        hVar.C.setText(account.getType());
        hVar.y.setText(account.getVpa());
        hVar.y.setText(account.getVpa());
        hVar.I.setOnClickListener(new b(account));
        hVar.A.setOnClickListener(new c(i, account));
        hVar.F.setOnClickListener(new d(account));
        hVar.G.setOnClickListener(new e(account));
        hVar.B.setVisibility(4);
        hVar.D.setVisibility(4);
        boolean isEmpty = TextUtils.isEmpty(account.getVpa());
        String a2 = C0059ao.a(325);
        if (isEmpty) {
            hVar.B.setVisibility(8);
            hVar.D.setVisibility(8);
            hVar.A.setVisibility(8);
            hVar.F.setVisibility(8);
            hVar.G.setVisibility(8);
            hVar.K.setVisibility(8);
            hVar.E.setText(R.string.set_upi_id);
            hVar.E.setVisibility(0);
            hVar.E.setOnClickListener(new f(account));
        } else if (!account.getStatus().equalsIgnoreCase(a2)) {
            hVar.B.setVisibility(8);
            hVar.D.setVisibility(8);
            hVar.A.setVisibility(8);
            hVar.E.setText(R.string.set_upi_pin);
            hVar.E.setVisibility(0);
            hVar.F.setVisibility(8);
            hVar.G.setVisibility(8);
            hVar.K.setVisibility(8);
            hVar.E.setOnClickListener(new g(account));
        } else if (!TextUtils.isEmpty(account.getVpa()) && account.getStatus().equalsIgnoreCase(a2)) {
            hVar.E.setVisibility(8);
            hVar.A.setVisibility(0);
            TextView textView = hVar.z;
            textView.setText(account.getdLength() + this.g.getString(R.string.pin_exists));
            hVar.z.setTextColor(t8.d(this.g, R.color.pin_exist));
            hVar.B.setVisibility(0);
            hVar.F.setVisibility(0);
            hVar.K.setVisibility(0);
            hVar.G.setVisibility(0);
            hVar.D.setVisibility(8);
            TextView textView2 = hVar.B;
            textView2.setText(this.g.getString(R.string.balance_ac) + jg0.b(account.getBalance()));
            hVar.D.setText(account.getBalTime());
        }
        if (account.getCheckBalance() == 1) {
            account.setCheckBalance(0);
            hVar.B.setVisibility(0);
            hVar.D.setVisibility(8);
        } else {
            hVar.B.setVisibility(8);
            hVar.D.setVisibility(8);
        }
        if (account.getStatus().equalsIgnoreCase(a2)) {
            TextView textView3 = hVar.z;
            textView3.setText(account.getdLength() + this.g.getString(R.string.pin_exists));
            hVar.z.setTextColor(t8.d(this.g, R.color.pin_exist));
            hVar.J.setImageDrawable(t8.f(this.g, 2131231303));
            return;
        }
        TextView textView4 = hVar.z;
        textView4.setText(account.getdLength() + this.g.getString(R.string.pin_required));
        hVar.z.setTextColor(t8.d(this.g, R.color.radio_orange));
        hVar.J.setImageDrawable(t8.f(this.g, R.drawable.notsetmpin));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public h n(ViewGroup viewGroup, int i) {
        return new h(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.new_my_accounnt_list_rom, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.d = ng0Var;
    }

    public void z(ArrayList<Account> arrayList) {
        if (arrayList != null) {
            Collections.sort(arrayList, new a(this));
        }
    }
}
