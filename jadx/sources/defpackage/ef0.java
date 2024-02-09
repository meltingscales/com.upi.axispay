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
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.TranHistory;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.custom.SpacesItemDecoration;
import defpackage.ua0;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ef0  reason: default package */
/* loaded from: classes.dex */
public class ef0 extends xc0 implements ng0, ua0.e {
    public RecyclerView l;
    public TextView m;
    public ProgressBar n;
    public fa0 o;

    /* compiled from: AxisPay */
    /* renamed from: ef0$a */
    /* loaded from: classes.dex */
    public class a implements SwipeRefreshLayout.j {
        public final /* synthetic */ SwipeRefreshLayout a;

        public a(SwipeRefreshLayout swipeRefreshLayout) {
            this.a = swipeRefreshLayout;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            eg0.i(ef0.this.k());
            ua0.d().g(false, new OliveRequest(33, 34, null));
            this.a.setRefreshing(false);
        }
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_query_list, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.query_list);
        this.l = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(k()));
        this.l.addItemDecoration(new SpacesItemDecoration(10));
        this.m = (TextView) inflate.findViewById(R.id.empty_view);
        this.n = (ProgressBar) inflate.findViewById(R.id.progress);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new a(swipeRefreshLayout));
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            if (oliveRequest.getRequestType() != 34) {
                eg0.B();
            } else {
                eg0.B();
                x(null);
            }
        }
        eg0.B();
        eg0.A(k(), result.getResult());
        this.n.setVisibility(8);
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(33, getString(R.string.my_query_status));
        super.onResume();
        ua0.e(k()).u(this);
        qa0.v().G();
        this.n.setVisibility(0);
        ua0.d().g(false, new OliveRequest(33, 34, null));
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 34) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
                return;
            }
            return;
        }
        eg0.B();
        x(qa0.v().G());
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        TranHistory tranHistory = (TranHistory) obj;
        if (i != R.id.query_row) {
            return;
        }
        TransactionData transactionData = new TransactionData();
        if (tranHistory.getType() == null) {
            return;
        }
        transactionData.setTransactionMode(tranHistory.getType().equals(C0059ao.a(11405)) || tranHistory.getType().equals(C0059ao.a(11406)) || tranHistory.getType().equals(C0059ao.a(11407)) ? TransactionData.MODE_SEND : TransactionData.MODE_RECEIVE);
        transactionData.setRemarks(tranHistory.getRemarks());
        transactionData.setTransactionNote(tranHistory.getRemarks());
        transactionData.setTransactionType(tranHistory.getType());
        transactionData.setTransactionDate(tranHistory.getDateTime());
        transactionData.setAmount(Double.valueOf(tranHistory.getAmount()));
        transactionData.setQueryCloserComment(tranHistory.getQueryCloserComment());
        transactionData.setQueryComment(tranHistory.getQuery());
        transactionData.setQueryid(tranHistory.getQueryid());
        transactionData.setQueryStatus(tranHistory.getQueryStatus());
        transactionData.setQuerydate(tranHistory.getQuerydate());
        transactionData.setExpirydateTime(tranHistory.getExpirydateTime());
        transactionData.setDescription(tranHistory.getDescription());
        if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(11408))) {
            transactionData.setTransactionStatus(10);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(11409))) {
            transactionData.setTransactionStatus(3);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(11410))) {
            transactionData.setTransactionStatus(1);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(11411))) {
            transactionData.setTransactionStatus(5);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(11412))) {
            transactionData.setTransactionStatus(4);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(11413))) {
            transactionData.setTransactionStatus(6);
        } else if (tranHistory.getStatus().equalsIgnoreCase(C0059ao.a(11414))) {
            transactionData.setTransactionStatus(7);
        }
        transactionData.setTransactionId(tranHistory.getTranid());
        transactionData.setRefid(tranHistory.getRefid());
        Account account = new Account();
        account.setAccRefNumber(tranHistory.getDebitAccount());
        account.setVpa(tranHistory.getDebitVpa());
        transactionData.setAccount(account);
        transactionData.setDebitBankName(tranHistory.getDebitBankName());
        BeneVpa beneVpa = new BeneVpa();
        beneVpa.setVpa(tranHistory.getCreditVpa());
        transactionData.setBeneVpa(beneVpa);
        transactionData.setCreditBankName(tranHistory.getCreditBankName());
        transactionData.setSource(70);
        this.b.t(70, transactionData);
    }

    public final void x(ArrayList<TranHistory> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            fa0 fa0Var = this.o;
            if (fa0Var == null) {
                this.o = new fa0(k(), arrayList);
            } else {
                fa0Var.B(arrayList);
            }
            this.o.A(this);
            this.l.setAdapter(this.o);
            this.m.setVisibility(8);
            this.l.setVisibility(0);
        } else {
            this.m.setVisibility(0);
            this.l.setVisibility(8);
        }
        this.n.setVisibility(8);
    }
}
