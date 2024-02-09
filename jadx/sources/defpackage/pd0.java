package defpackage;

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
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Bank;
import com.upi.axispay.R;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pd0  reason: default package */
/* loaded from: classes.dex */
public class pd0 extends xc0 implements ng0, ua0.e {
    public RecyclerView l;
    public g90 m;
    public EditText n;
    public Bank o;

    /* compiled from: AxisPay */
    /* renamed from: pd0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            pd0.this.E(editable.toString().toLowerCase());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static pd0 B() {
        return new pd0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void A(View view) {
        eg0.c();
        this.b.t(21, null);
    }

    public final void C(ArrayList<Account> arrayList) {
        Iterator<Account> it = arrayList.iterator();
        while (it.hasNext()) {
            Account next = it.next();
            next.setName(this.o.getName());
            next.setIin(this.o.getIin());
        }
        this.b.t(66, arrayList);
    }

    public final void D(ArrayList<Bank> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            g90 g90Var = this.m;
            if (g90Var == null) {
                this.m = new g90(k(), arrayList);
            } else {
                g90Var.z(arrayList);
            }
            this.m.y(this);
            this.l.setAdapter(this.m);
            return;
        }
        eg0.m(k(), C0059ao.a(9537));
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
        View inflate = layoutInflater.inflate(R.layout.fragment_ifsc_bank, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.bankNameList);
        this.l = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(k()));
        EditText editText = (EditText) inflate.findViewById(R.id.search_vpa);
        this.n = editText;
        editText.addTextChangedListener(new a());
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            if (result.getCode().equalsIgnoreCase(C0059ao.a(9538))) {
                String format = String.format(getString(R.string.bank_not_registered), this.o.getName(), n70.f.a().m(C0059ao.a(9539)));
                eg0.B();
                eg0.o(k(), getString(R.string.alert), format, getString(R.string.okay), new View.OnClickListener() { // from class: zb0
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
        v(104, getString(R.string.select_bank));
        super.onResume();
        ua0.e(k()).u(this);
        ua0.d().h(false, new OliveRequest(104, 21, null));
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType != 6) {
            if (requestType != 21) {
                if (this.g == oliveRequest.getInitiator()) {
                    eg0.B();
                    return;
                }
                return;
            }
            eg0.B();
            D(qa0.v().j());
        } else if (result.getCode().equals(C0059ao.a(9540))) {
            ArrayList<Account> arrayList = (ArrayList) result.getData();
            if (arrayList != null && arrayList.size() != 0) {
                Iterator<Account> it = arrayList.iterator();
                while (it.hasNext()) {
                    Account next = it.next();
                    next.setIin(this.o.getIin());
                    next.setBankName(this.o.getName());
                }
                eg0.B();
                HashMap hashMap = new HashMap();
                hashMap.put(C0059ao.a(9541), getString(R.string.select_your_bank));
                hashMap.put(C0059ao.a(9542), String.valueOf(arrayList.size()));
                ah0.c(k(), C0059ao.a(9543), hashMap);
                qa0.v().y0(arrayList, k());
                C(arrayList);
                return;
            }
            eg0.B();
            eg0.o(k(), getString(R.string.alert), getString(R.string.account_already_added), getString(R.string.okay), new View.OnClickListener() { // from class: yb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pd0.this.A(view);
                }
            });
        } else {
            eg0.m(k(), result.getResult());
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        if (i != R.id.bank_item) {
            return;
        }
        jg0.C(getView(), getContext());
        this.o = (Bank) obj;
        qa0.v().s0(this.o);
        k().onBackPressed();
    }
}
