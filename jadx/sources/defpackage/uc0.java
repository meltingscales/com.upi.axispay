package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.TranHistory;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: uc0  reason: default package */
/* loaded from: classes.dex */
public class uc0 extends xc0 implements ng0 {
    public static ArrayList<TranHistory> q;
    public TextView l;
    public ka0 m;
    public RecyclerView n;
    public ProgressBar o;
    public og0 p;

    /* compiled from: AxisPay */
    /* renamed from: uc0$a */
    /* loaded from: classes.dex */
    public class a implements SwipeRefreshLayout.j {
        public final /* synthetic */ SwipeRefreshLayout a;

        public a(SwipeRefreshLayout swipeRefreshLayout) {
            this.a = swipeRefreshLayout;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            uc0.this.p.i(0);
            this.a.setRefreshing(false);
        }
    }

    public static uc0 x(ArrayList<TranHistory> arrayList) {
        q = arrayList;
        return new uc0();
    }

    public void A(ArrayList<TranHistory> arrayList) {
        q = arrayList;
        if (this.n == null) {
            return;
        }
        this.o.setVisibility(8);
        if (arrayList != null && arrayList.size() > 0) {
            this.n.setVisibility(0);
            this.l.setVisibility(8);
            ka0 ka0Var = this.m;
            if (ka0Var == null) {
                this.m = new ka0(getContext(), arrayList);
            } else {
                ka0Var.B(arrayList);
            }
            this.m.z(this);
            this.n.setAdapter(this.m);
            this.m.j();
            return;
        }
        this.n.setVisibility(8);
        this.l.setVisibility(0);
        this.l.setText(R.string.no_transaction_found);
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_all_transaction, viewGroup, false);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, -30);
        TextView textView = (TextView) inflate.findViewById(R.id.empty_view);
        this.l = textView;
        textView.setText(C0059ao.a(9802));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.transaction_list);
        this.n = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(k()));
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progress);
        this.o = progressBar;
        progressBar.setVisibility(8);
        Date time = calendar2.getTime();
        String a2 = C0059ao.a(9803);
        String x = jg0.x(time, a2);
        String a3 = C0059ao.a(9804);
        String a4 = C0059ao.a(9805);
        x.replace(a3, a4);
        jg0.x(calendar.getTime(), a2).replace(a3, a4);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new a(swipeRefreshLayout));
        return inflate;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        A(q);
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        TranHistory tranHistory = (TranHistory) obj;
        TransactionData transactionData = new TransactionData();
        transactionData.setRemarks(tranHistory.getRemarks());
        transactionData.setTransactionNote(tranHistory.getRemarks());
        transactionData.setTransactionType(tranHistory.getType());
        transactionData.setTransactionDate(tranHistory.getDateTime());
        transactionData.setExpiry(tranHistory.getExpirydateTime());
        transactionData.setUmn(tranHistory.getUmn());
        transactionData.setAmount(Double.valueOf(tranHistory.getAmount()));
        transactionData.setDirection(tranHistory.getDirection());
        transactionData.setUdir(tranHistory.getUdir());
        transactionData.setMcc(tranHistory.getMcc());
        transactionData.setCuurentTime(tranHistory.getDateTime());
        if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(9806))) {
            transactionData.setTransactionStatus(10);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(9807))) {
            transactionData.setTransactionStatus(3);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(9808))) {
            transactionData.setTransactionStatus(1);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(9809))) {
            transactionData.setTransactionStatus(5);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(9810))) {
            transactionData.setTransactionStatus(4);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(9811))) {
            transactionData.setTransactionStatus(6);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(9812))) {
            transactionData.setTransactionStatus(7);
        }
        transactionData.setRemitterName(tranHistory.getRemitterName());
        transactionData.setBeneficiaryName(tranHistory.getBeneficiaryName());
        transactionData.setTransactionId(tranHistory.getTranid());
        transactionData.setRefid(tranHistory.getRefid());
        transactionData.setRefUrl(tranHistory.getRefUrl());
        transactionData.setDescription(tranHistory.getDescription());
        Account account = new Account();
        account.setAccRefNumber(tranHistory.getDebitAccount());
        BeneVpa beneVpa = new BeneVpa();
        int direction = tranHistory.getDirection();
        if (direction == 1) {
            transactionData.setDebitBankName(tranHistory.getDebitBankName());
            transactionData.setDestAccount(tranHistory.getDebitAccount());
            account.setVpa(tranHistory.getDebitVpa());
            beneVpa.setVpa(tranHistory.getCreditVpa());
        } else if (direction == 2) {
            transactionData.setDebitBankName(tranHistory.getCreditBankName());
            transactionData.setDestAccount(tranHistory.getCreditAccount());
            account.setVpa(tranHistory.getDebitVpa());
            beneVpa.setVpa(tranHistory.getCreditVpa());
        } else if (direction == 3) {
            transactionData.setDebitBankName(tranHistory.getCreditBankName());
            transactionData.setDestAccount(tranHistory.getCreditAccount());
            account.setVpa(tranHistory.getCreditVpa());
            beneVpa.setVpa(tranHistory.getDebitVpa());
        } else if (direction == 4) {
            transactionData.setDebitBankName(tranHistory.getDebitBankName());
            transactionData.setDestAccount(tranHistory.getDebitAccount());
            account.setVpa(tranHistory.getDebitVpa());
            beneVpa.setVpa(tranHistory.getCreditVpa());
        }
        transactionData.setAccount(account);
        transactionData.setBeneVpa(beneVpa);
        transactionData.setCreditBankName(tranHistory.getCreditBankName());
        transactionData.setTransactionDate(tranHistory.getDateTime());
        transactionData.setSource(45);
        qa0.v().u0(transactionData);
        this.b.t(24, transactionData);
    }

    public void y(og0 og0Var) {
        this.p = og0Var;
    }

    public void z(boolean z) {
        ProgressBar progressBar = this.o;
        if (progressBar != null) {
            progressBar.setVisibility(z ? 0 : 8);
        }
    }
}
