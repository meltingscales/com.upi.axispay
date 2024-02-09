package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Bank;
import com.upi.axispay.R;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: y90  reason: default package */
/* loaded from: classes.dex */
public class y90 extends RecyclerView.h<b> {
    public ng0 d;
    public ArrayList<Account> e;

    /* compiled from: AxisPay */
    /* renamed from: y90$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ Account b;

        public a(Account account) {
            this.b = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y90.this.d.s(R.id.account_link, this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: y90$b */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.d0 {
        public ImageView v;
        public TextView w;
        public TextView x;
        public TextView y;
        public Button z;

        public b(y90 y90Var, View view) {
            super(view);
            this.v = (ImageView) view.findViewById(R.id.image_bank);
            this.x = (TextView) view.findViewById(R.id.account_no);
            this.y = (TextView) view.findViewById(R.id.text_ifsc);
            this.w = (TextView) view.findViewById(R.id.text_type);
            this.z = (Button) view.findViewById(R.id.account_link);
        }
    }

    public y90(Activity activity, ArrayList<Account> arrayList) {
        this.e = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList<Account> arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w */
    public void l(b bVar, int i) {
        Account account = this.e.get(i);
        bVar.x.setText(account.getMaskedAccnumber());
        TextView textView = bVar.y;
        textView.setText(C0059ao.a(4651) + account.getIfsc());
        bVar.w.setText(account.getType());
        account.getStatus().equalsIgnoreCase(C0059ao.a(4652));
        Bank e = qa0.v().e(account.getIin());
        if (e != null) {
            jg0.K(bVar.v, e.getLogo(), 2131230832);
        } else {
            bVar.v.setImageResource(2131230832);
        }
        bVar.z.setOnClickListener(new a(account));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: x */
    public b n(ViewGroup viewGroup, int i) {
        return new b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.new_account_list_row, viewGroup, false));
    }

    public void y(ng0 ng0Var) {
        this.d = ng0Var;
    }

    public void z(ArrayList<Account> arrayList) {
        this.e = arrayList;
        j();
    }
}
