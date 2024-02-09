package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Bank;
import com.upi.axispay.R;
import com.upi.axispay.activity.LoginActivity;
import defpackage.n70;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vc0  reason: default package */
/* loaded from: classes.dex */
public class vc0 extends xc0 implements ng0, ua0.e {
    public RecyclerView l;
    public g90 m;
    public EditText n;
    public String[] o;
    public Bank p;

    /* compiled from: AxisPay */
    /* renamed from: vc0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            vc0.this.E(editable.toString().toLowerCase());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vc0$b */
    /* loaded from: classes.dex */
    public class b implements SwipeRefreshLayout.j {
        public final /* synthetic */ SwipeRefreshLayout a;

        public b(SwipeRefreshLayout swipeRefreshLayout) {
            this.a = swipeRefreshLayout;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            eg0.i(vc0.this.k());
            ua0.d().h(false, new OliveRequest(58, 21, null));
            this.a.setRefreshing(false);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vc0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            vc0.this.b.t(21, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vc0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n70.a aVar = n70.f;
            aVar.a().c(C0059ao.a(12560));
            aVar.a().d();
            Intent intent = new Intent(vc0.this.getActivity(), LoginActivity.class);
            intent.putExtra(C0059ao.a(12561), 22);
            vc0.this.startActivity(intent);
            vc0.this.getActivity().finish();
        }
    }

    public static vc0 B() {
        return new vc0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void z(View view) {
        qa0.v().c();
        n70.a aVar = n70.f;
        aVar.a().c(C0059ao.a(4708));
        aVar.a().d();
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        intent.putExtra(C0059ao.a(4709), 22);
        startActivity(intent);
        getActivity().finish();
    }

    public final void C(ArrayList<Account> arrayList) {
        Iterator<Account> it = arrayList.iterator();
        while (it.hasNext()) {
            Account next = it.next();
            next.setName(this.p.getName());
            next.setIin(this.p.getIin());
        }
        this.b.t(66, arrayList);
    }

    public final void D(ArrayList<Bank> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        g90 g90Var = this.m;
        if (g90Var == null) {
            this.m = new g90(k(), arrayList);
        } else {
            g90Var.z(arrayList);
        }
        this.m.y(this);
        this.l.setAdapter(this.m);
    }

    public final void E(String str) {
        ArrayList<Bank> j = qa0.v().j();
        if (j != null) {
            if (TextUtils.isEmpty(str)) {
                D(j);
                return;
            }
            ArrayList<Bank> arrayList = new ArrayList<>();
            Iterator<Bank> it = j.iterator();
            while (it.hasNext()) {
                Bank next = it.next();
                if (next.getName().toLowerCase().contains(str)) {
                    arrayList.add(next);
                }
            }
            D(arrayList);
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
        View inflate = layoutInflater.inflate(R.layout.fragment_bank_list, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.bankNameList);
        this.l = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(k()));
        this.o = getResources().getStringArray(R.array.state_list);
        ((StateProgressBar) inflate.findViewById(R.id.stepper_indicator)).setStateDescriptionData(this.o);
        EditText editText = (EditText) inflate.findViewById(R.id.search_vpa);
        this.n = editText;
        editText.addTextChangedListener(new a());
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new b(swipeRefreshLayout));
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            if (result.getCode().equalsIgnoreCase(C0059ao.a(4710))) {
                eg0.B();
                eg0.q(k(), getString(R.string.alert), getString(R.string.exceed_account_fetch_max_retry), getString(R.string.okay), new View.OnClickListener() { // from class: fb0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        vc0.this.z(view);
                    }
                }, true);
            } else if (result.getCode().equalsIgnoreCase(C0059ao.a(4711))) {
                String format = String.format(getString(R.string.bank_not_registered), this.p.getName(), n70.f.a().m(C0059ao.a(4712)));
                eg0.B();
                eg0.o(k(), getString(R.string.alert), format, getString(R.string.okay), new View.OnClickListener() { // from class: gb0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        eg0.c();
                    }
                });
            } else {
                eg0.m(k(), result.getResult());
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(58, getString(R.string.select_your_bank));
        super.onResume();
        eg0.B();
        ua0.e(k()).u(this);
        eg0.i(k());
        ua0.d().h(false, new OliveRequest(58, 21, null));
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType != 6) {
            if (requestType != 21) {
                if (oliveRequest.getInitiator() == this.g) {
                    eg0.B();
                    return;
                }
                return;
            }
            eg0.B();
            D((ArrayList) result.getData());
            return;
        }
        eg0.B();
        if (result.getCode().equals(C0059ao.a(4713))) {
            ArrayList<Account> arrayList = (ArrayList) result.getData();
            if (arrayList != null && arrayList.size() != 0) {
                Iterator<Account> it = arrayList.iterator();
                while (it.hasNext()) {
                    Account next = it.next();
                    next.setIin(this.p.getIin());
                    next.setBankName(this.p.getName());
                }
                HashMap hashMap = new HashMap();
                hashMap.put(C0059ao.a(4714), getString(R.string.select_your_bank));
                hashMap.put(C0059ao.a(4715), String.valueOf(arrayList.size()));
                ah0.c(k(), C0059ao.a(4716), hashMap);
                qa0.v().y0(arrayList, k());
                C(arrayList);
                return;
            }
            eg0.o(k(), getString(R.string.alert), getString(R.string.account_already_added), getString(R.string.okay), new c());
        } else if (result.code.equals(C0059ao.a(4717))) {
            eg0.q(getActivity(), getString(R.string.alert), result.getResult(), getString(R.string.okay), new d(), true);
        } else {
            eg0.m(k(), result.getResult());
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        jg0.C(getView(), getContext());
        this.p = (Bank) obj;
        eg0.i(k());
        ua0.d().q(new OliveRequest(58, 6, this.p.getIin()));
    }
}
