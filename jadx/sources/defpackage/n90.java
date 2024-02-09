package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Bank;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: n90  reason: default package */
/* loaded from: classes.dex */
public class n90 extends no {
    public int c = -1;
    public ng0 d;
    public ArrayList<Account> e;
    public LayoutInflater f;
    public Context g;

    /* compiled from: AxisPay */
    /* renamed from: n90$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<Account> {
        public a(n90 n90Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Account account, Account account2) {
            return account.getBankName().compareTo(account2.getBankName());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: n90$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ Account b;

        public b(Account account) {
            this.b = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n90.this.d.s(R.id.button_request, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: n90$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ Account b;

        public c(Account account) {
            this.b = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n90.this.d.s(R.id.button_send, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: n90$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ Account c;
        public final /* synthetic */ ImageView d;

        public d(int i, Account account, ImageView imageView) {
            this.b = i;
            this.c = account;
            this.d = imageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n90 n90Var = n90.this;
            int i = this.b;
            n90Var.c = i;
            n90Var.d.e(R.id.text_refresh, i, this.c);
            this.d.startAnimation(n90.this.t());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: n90$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ Account c;
        public final /* synthetic */ ImageView d;

        public e(int i, Account account, ImageView imageView) {
            this.b = i;
            this.c = account;
            this.d = imageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n90 n90Var = n90.this;
            int i = this.b;
            n90Var.c = i;
            n90Var.d.e(R.id.text_refresh, i, this.c);
            this.d.startAnimation(n90.this.t());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: n90$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ Account b;

        public f(Account account) {
            this.b = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n90.this.d.s(R.id.layout_acc, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: n90$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n90.this.d.s(R.id.add_account, null);
        }
    }

    public n90(Context context, ArrayList<Account> arrayList) {
        this.g = context;
        this.e = arrayList;
        v(arrayList);
        this.f = LayoutInflater.from(context);
        if (this.e != null) {
            this.e.add(new Account());
        }
    }

    @Override // defpackage.no
    public void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // defpackage.no
    public int d() {
        ArrayList<Account> arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // defpackage.no
    public Object h(ViewGroup viewGroup, int i) {
        int i2;
        ViewGroup viewGroup2;
        View view;
        String str;
        View inflate = this.f.inflate(R.layout.home_account_row, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layout_acc);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.add_account);
        RelativeLayout relativeLayout2 = (RelativeLayout) inflate.findViewById(R.id.layout);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.button_request);
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(R.id.button_send);
        LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(R.id.amount_layout);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.image_bank);
        TextView textView = (TextView) inflate.findViewById(R.id.text_bank_name);
        TextView textView2 = (TextView) inflate.findViewById(R.id.account_vpa);
        TextView textView3 = (TextView) inflate.findViewById(R.id.text_acc_no);
        TextView textView4 = (TextView) inflate.findViewById(R.id.text_refresh);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.text_refresh_amount);
        TextView textView5 = (TextView) inflate.findViewById(R.id.balance_as_on);
        TextView textView6 = (TextView) inflate.findViewById(R.id.balance_amount);
        ((TextView) inflate.findViewById(R.id.send)).setTypeface(null, 1);
        ((TextView) inflate.findViewById(R.id.request)).setTypeface(null, 1);
        textView3.setTypeface(null, 1);
        textView6.setTypeface(null, 1);
        Account account = this.e.get(i);
        if (account.getAccRefNumber() != null) {
            relativeLayout2.setVisibility(0);
            relativeLayout.setVisibility(8);
            textView.setText(account.getBankName());
            textView3.setText(account.getMaskedAccnumber());
            textView2.setText(account.getVpa());
            Bank e2 = qa0.v().e(account.getIin());
            if (e2 == null) {
                imageView.setImageDrawable(t8.f(this.g, 2131230832));
            } else if (TextUtils.isEmpty(e2.getLogo())) {
                imageView.setImageDrawable(t8.f(this.g, 2131230832));
            } else {
                jg0.K(imageView, e2.getLogo(), 2131230832);
            }
            if (e2 != null && !TextUtils.isEmpty(e2.getColorcode())) {
                if (e2.getColorcode().length() == 6) {
                    str = C0059ao.a(4633) + e2.getColorcode();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    Drawable a2 = ah0.a(this.g, str);
                    linearLayout2.setBackground(a2);
                    linearLayout3.setBackground(a2);
                    textView.setTextColor(Color.parseColor(str));
                    textView3.setTextColor(Color.parseColor(str));
                    textView6.setTextColor(Color.parseColor(str));
                    imageView2.setColorFilter(Color.parseColor(str));
                }
            } else {
                textView.setTextColor(t8.d(this.g, R.color.colorPrimaryDark));
                textView3.setTextColor(t8.d(this.g, R.color.colorPrimaryDark));
                textView6.setTextColor(t8.d(this.g, R.color.colorPrimaryDark));
                imageView2.setColorFilter(t8.d(this.g, R.color.colorPrimaryDark));
            }
            linearLayout4.setVisibility(0);
            if (account.getCheckBalance() == 1) {
                account.setCheckBalance(0);
                linearLayout4.setVisibility(0);
                textView6.setVisibility(0);
                if (!TextUtils.isEmpty(account.getBalance())) {
                    linearLayout4.setVisibility(0);
                    textView6.setText(jg0.b(account.getBalance()));
                    textView5.setText(R.string.balance_as_on + account.getBalTime());
                    textView5.setVisibility(8);
                    imageView2.setVisibility(0);
                }
            }
            linearLayout2.setOnClickListener(new b(account));
            linearLayout3.setOnClickListener(new c(account));
            linearLayout4.setOnClickListener(new d(i, account, imageView2));
            imageView2.setOnClickListener(new e(i, account, imageView2));
            linearLayout.setOnClickListener(new f(account));
            viewGroup2 = viewGroup;
            view = inflate;
            i2 = 0;
        } else {
            relativeLayout2.setVisibility(8);
            i2 = 0;
            relativeLayout.setVisibility(0);
            relativeLayout.setOnClickListener(new g());
            viewGroup2 = viewGroup;
            view = inflate;
        }
        viewGroup2.addView(view, i2);
        return view;
    }

    @Override // defpackage.no
    public boolean i(View view, Object obj) {
        return view.equals(obj);
    }

    public RotateAnimation t() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 15.0f, 15.0f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setDuration(700L);
        return rotateAnimation;
    }

    public void u(ng0 ng0Var) {
        this.d = ng0Var;
    }

    public void v(ArrayList<Account> arrayList) {
        if (arrayList != null) {
            Collections.sort(arrayList, new a(this));
        }
    }

    public void w(String str, int i, int i2) {
        this.c = i2;
        if (i2 == -1 || i2 >= this.e.size()) {
            return;
        }
        Account account = this.e.get(i2);
        account.setCheckBalance(i);
        account.setBalance(str);
        account.setBalTime(jg0.x(new Date(), C0059ao.a(4634)));
        this.e.set(i2, account);
        j();
    }
}
