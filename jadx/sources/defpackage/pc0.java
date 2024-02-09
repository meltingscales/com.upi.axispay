package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.custom.SpacesItemDecoration;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pc0  reason: default package */
/* loaded from: classes.dex */
public class pc0 extends xc0 implements ng0, ua0.e {
    public static pc0 q;
    public RecyclerView l;
    public String m = C0059ao.a(6277);
    public TransactionData n;
    public u90 o;
    public TextView p;

    /* compiled from: AxisPay */
    /* renamed from: pc0$a */
    /* loaded from: classes.dex */
    public class a implements SwipeRefreshLayout.j {
        public final /* synthetic */ SwipeRefreshLayout a;

        public a(SwipeRefreshLayout swipeRefreshLayout) {
            this.a = swipeRefreshLayout;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            eg0.i(pc0.this.k());
            ua0.d().b(false, new OliveRequest(21, 15, null));
            this.a.setRefreshing(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void B(Account account, View view) {
        eg0.c();
        H(account);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void E(Account account, View view) {
        eg0.c();
        this.m = jg0.n(account.getBankName());
        eg0.i(k());
        ua0.d().q(new OliveRequest(21, 31, account));
    }

    public static pc0 F() {
        if (q == null) {
            q = new pc0();
        }
        return q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void y(View view) {
        this.b.t(58, null);
    }

    public final void G(final Account account) {
        eg0.r(k(), getString(R.string.delete_account), getString(R.string.conf_delete_account), getString(R.string.okay), new View.OnClickListener() { // from class: za0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pc0.this.B(account, view);
            }
        }, getString(R.string.cancel), new View.OnClickListener() { // from class: va0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eg0.c();
            }
        });
    }

    public final void H(final Account account) {
        eg0.o(k(), getString(R.string.confirmation), getString(R.string.delete_account_vpa), getString(R.string.fine), new View.OnClickListener() { // from class: xa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pc0.this.E(account, view);
            }
        });
    }

    public final void I(ArrayList<Account> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.l.setVisibility(0);
            this.p.setVisibility(8);
            u90 u90Var = this.o;
            if (u90Var == null) {
                this.o = new u90(k(), arrayList);
            } else {
                u90Var.A(arrayList);
            }
            this.o.y(this);
            this.l.setAdapter(this.o);
            return;
        }
        this.l.setVisibility(8);
        this.p.setVisibility(0);
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        if (i == 19) {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(21, 19, obj));
        } else if (i != 28) {
        } else {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(21, 28, obj));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_link_bank_account, viewGroup, false);
        getActivity();
        this.n = qa0.v().L();
        this.l = (RecyclerView) inflate.findViewById(R.id.account_list);
        this.p = (TextView) inflate.findViewById(R.id.empty_view);
        this.l.setLayoutManager(new LinearLayoutManager(k()));
        this.l.addItemDecoration(new SpacesItemDecoration(20));
        ((FloatingActionButton) inflate.findViewById(R.id.add_account)).setOnClickListener(new View.OnClickListener() { // from class: ya0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pc0.this.y(view);
            }
        });
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new a(swipeRefreshLayout));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            if (oliveRequest.getRequestType() != 19) {
                if (oliveRequest.getInitiator() == this.g) {
                    eg0.B();
                    eg0.m(k(), result.getResult());
                }
            } else {
                eg0.B();
                if ((result != null ? result.getCode() : C0059ao.a(6278)).equals(C0059ao.a(6279))) {
                    eg0.B();
                    eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_max_retry), getString(R.string.okay), new View.OnClickListener() { // from class: wa0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            eg0.c();
                        }
                    });
                } else {
                    eg0.m(k(), result.getResult());
                }
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(21, getString(R.string.my_accoun));
        super.onResume();
        this.b.o(90, new tg0(getString(R.string.my_accoun), false, true, true, false));
        ua0.e(k()).u(this);
        qa0 v = qa0.v();
        qa0.c cVar = qa0.c.ALL;
        ArrayList<Account> h = v.h(cVar);
        if (h != null && h.size() != 0) {
            I(qa0.v().h(cVar));
            return;
        }
        eg0.i(k());
        ua0.d().b(false, new OliveRequest(21, 15, null));
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 15) {
            I(qa0.v().h(qa0.c.ALL));
            eg0.B();
        } else if (requestType == 19) {
            Object data = result.getData();
            if (data != null) {
                this.o.B(data.toString());
            }
            eg0.B();
        } else if (requestType == 28) {
            eg0.B();
            if (result.getCode().equals(C0059ao.a(6283))) {
                eg0.m(k(), getString(R.string.upi_pin_changed_successfully));
            } else if (result.getCode().equals(C0059ao.a(6284))) {
                eg0.m(k(), getString(R.string.invid_upi_pin));
            } else {
                eg0.m(k(), result.getResult());
            }
        } else if (requestType != 31) {
            if (oliveRequest.getInitiator() == 21) {
                eg0.B();
            }
        } else {
            eg0.m(k(), getString(R.string.account_Remove_successfully));
            ArrayList arrayList = (ArrayList) result.getData();
            HashMap hashMap = new HashMap();
            hashMap.put(C0059ao.a(6280), getString(R.string.my_accoun));
            hashMap.put(C0059ao.a(6281), this.m);
            ah0.c(k(), C0059ao.a(6282), hashMap);
            if (arrayList != null) {
                I(qa0.v().h(qa0.c.ALL));
            } else {
                eg0.i(k());
                ua0.d().b(true, new OliveRequest(21, 15, null));
            }
            eg0.B();
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        Account account = (Account) obj;
        String a2 = C0059ao.a(6285);
        switch (i) {
            case R.id.account_delete /* 2131361858 */:
                G(account);
                return;
            case R.id.account_refresh_balance /* 2131361872 */:
                eg0.i(k());
                ua0.d().q(new OliveRequest(21, 519, account));
                HashMap hashMap = new HashMap();
                hashMap.put(C0059ao.a(6288), jg0.n(account.getBankName()));
                hashMap.put(C0059ao.a(6289), getString(R.string.my_accoun));
                ah0.c(k(), C0059ao.a(6290), hashMap);
                return;
            case R.id.button_change_upi_pin /* 2131362007 */:
                ua0.d().q(new OliveRequest(9, 528, account));
                return;
            case R.id.button_reset_upi_pin /* 2131362037 */:
                n70.f.a().y(a2, C0059ao.a(6287));
                this.n.setTransactionMode(TransactionData.MODE_RESET);
                qa0.v().r0(92);
                this.b.t(92, account);
                return;
            case R.id.button_set_upi_id /* 2131362041 */:
                this.b.t(60, account);
                return;
            case R.id.button_set_upi_pin /* 2131362042 */:
                n70.f.a().y(a2, C0059ao.a(6286));
                qa0.v().r0(61);
                this.b.t(61, account);
                return;
            default:
                return;
        }
    }
}
