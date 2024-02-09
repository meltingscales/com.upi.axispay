package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.olive.upi.transport.model.Account;
import com.upi.axispay.R;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: la0  reason: default package */
/* loaded from: classes.dex */
public class la0 extends BaseAdapter {
    public Context b;
    public ArrayList<Account> c;
    public LayoutInflater d;

    /* compiled from: AxisPay */
    /* renamed from: la0$a */
    /* loaded from: classes.dex */
    public static class a {
        public TextView a;

        public a(View view) {
            this.a = (TextView) view.findViewById(R.id.text_vpa);
        }
    }

    public la0(Activity activity, ArrayList<Account> arrayList) {
        this.b = activity;
        c(arrayList);
        this.d = LayoutInflater.from(activity);
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Account getItem(int i) {
        ArrayList<Account> arrayList = this.c;
        if (arrayList == null) {
            return null;
        }
        return arrayList.get(i);
    }

    public int b(String str) {
        if (this.c != null) {
            for (int i = 0; i < this.c.size(); i++) {
                if (this.c.get(i).getVpa().equals(str)) {
                    return i;
                }
            }
        }
        return 0;
    }

    public void c(ArrayList<Account> arrayList) {
        this.c = arrayList;
        if (arrayList == null) {
            notifyDataSetChanged();
            return;
        }
        Account account = new Account();
        account.setVpa(this.b.getResources().getString(R.string.select_account));
        this.c.add(0, account);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<Account> arrayList = this.c;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = this.d.inflate(R.layout.vpa_id_list_row, (ViewGroup) null);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.a.setText(this.c.get(i).getVpa());
        return view;
    }
}
