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
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BillerCategory;
import com.olive.upi.transport.model.BillerCircle;
import com.olive.upi.transport.model.BillerLocation;
import com.olive.upi.transport.model.Billers;
import com.upi.axispay.R;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: cd0  reason: default package */
/* loaded from: classes.dex */
public class cd0 extends xc0 implements ng0, ua0.e {
    public View l;
    public RecyclerView m;
    public i90 n;
    public EditText o;
    public Billers p;
    public ArrayList<BillerCircle> q;

    /* compiled from: AxisPay */
    /* renamed from: cd0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            cd0.this.C(editable.toString().toLowerCase());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: cd0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            cd0.this.b.t(21, null);
        }
    }

    public static cd0 z() {
        return new cd0();
    }

    public void A(Billers billers) {
        this.p = billers;
    }

    public final void B(ArrayList<BillerCircle> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            i90 i90Var = this.n;
            if (i90Var == null) {
                this.n = new i90(k(), arrayList);
            } else {
                i90Var.z(arrayList);
            }
            this.n.y(this);
            this.m.setAdapter(this.n);
            return;
        }
        eg0.m(k(), getString(R.string.no_circle_found));
    }

    public final void C(String str) {
        if (this.q != null) {
            if (TextUtils.isEmpty(str)) {
                B(this.q);
                return;
            }
            ArrayList<BillerCircle> arrayList = new ArrayList<>();
            Iterator<BillerCircle> it = this.q.iterator();
            while (it.hasNext()) {
                BillerCircle next = it.next();
                if (next.getDESCRPTN().toLowerCase().contains(str)) {
                    arrayList.add(next);
                }
            }
            B(arrayList);
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
        this.l = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.bankNameList);
        this.m = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(k()));
        ((StateProgressBar) this.l.findViewById(R.id.stepper_indicator)).setVisibility(8);
        EditText editText = (EditText) this.l.findViewById(R.id.search_vpa);
        this.o = editText;
        editText.setHint(R.string.search);
        this.o.addTextChangedListener(new a());
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            if (result.getCode().equalsIgnoreCase(C0059ao.a(14993))) {
                eg0.B();
                eg0.o(k(), getString(R.string.alert), C0059ao.a(14994), getString(R.string.okay), new View.OnClickListener() { // from class: ib0
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
        v(120, getString(R.string.select_circle));
        super.onResume();
        eg0.B();
        ua0.e(k()).u(this);
        BillerCategory i = oa0.f().i();
        if (this.h) {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(120, 65, new BillerLocation(i.getCODE_VAL(), this.p)));
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType != 6) {
            if (requestType != 65) {
                if (this.g == oliveRequest.getInitiator()) {
                    eg0.B();
                    return;
                }
                return;
            }
            eg0.B();
            ArrayList<BillerCircle> arrayList = (ArrayList) result.getData();
            this.q = arrayList;
            if (arrayList != null) {
                B(arrayList);
                if (this.q.size() == 1) {
                    oa0.f().t(0);
                    this.b.t(103, null);
                    return;
                }
                return;
            }
            return;
        }
        eg0.B();
        if (result.getCode().equals(C0059ao.a(14995))) {
            ArrayList<Account> arrayList2 = (ArrayList) result.getData();
            if (arrayList2 != null && (arrayList2 == null || arrayList2.size() != 0)) {
                HashMap hashMap = new HashMap();
                hashMap.put(C0059ao.a(14996), getString(R.string.select_your_bank));
                hashMap.put(C0059ao.a(14997), String.valueOf(arrayList2.size()));
                ah0.c(k(), C0059ao.a(14998), hashMap);
                qa0.v().y0(arrayList2, k());
                return;
            }
            eg0.o(k(), getString(R.string.alert), getString(R.string.account_already_added), getString(R.string.okay), new b());
            return;
        }
        eg0.m(k(), result.getResult());
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        if (i != R.id.bank_item) {
            return;
        }
        jg0.C(getView(), getContext());
        oa0.f().t(i);
        this.b.t(103, null);
    }
}
