package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.custom.NonScrollListView;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AxisPay */
/* renamed from: ve0  reason: default package */
/* loaded from: classes.dex */
public class ve0 extends xc0 implements View.OnClickListener, ng0, ua0.e {
    public int l;
    public TextView m;
    public NonScrollListView n;
    public LinearLayout o;
    public ImageView p;
    public ArrayList<BeneVpa> q = new ArrayList<>();
    public k90 r;
    public TransactionData s;

    /* compiled from: AxisPay */
    /* renamed from: ve0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ve0.this.B(editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static ve0 y() {
        return new ve0();
    }

    public void A(ArrayList<BeneVpa> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.q = arrayList;
            z(arrayList);
            this.o.setVisibility(0);
            this.m.setVisibility(8);
            return;
        }
        this.o.setVisibility(8);
        this.m.setVisibility(0);
    }

    public final void B(String str) {
        if (this.q != null) {
            ArrayList<BeneVpa> arrayList = new ArrayList<>();
            Iterator<BeneVpa> it = this.q.iterator();
            while (it.hasNext()) {
                BeneVpa next = it.next();
                if (next.filterString().contains(str.toLowerCase())) {
                    arrayList.add(next);
                }
            }
            z(arrayList);
        }
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.add_icon || id == R.id.button_add_bene) {
            this.s.setBeneVpa(null);
            ma0 ma0Var = new ma0();
            ma0Var.c(63);
            this.b.t(64, ma0Var);
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_new_send_money_via_ifsc, viewGroup, false);
        TransactionData L = qa0.v().L();
        this.s = L;
        L.getTransactionMode();
        this.m = (TextView) inflate.findViewById(R.id.text_intro);
        this.p = (ImageView) inflate.findViewById(R.id.add_icon);
        EditText editText = (EditText) inflate.findViewById(R.id.edit_vpa);
        ((Button) inflate.findViewById(R.id.button_add_bene)).setOnClickListener(this);
        this.p.setOnClickListener(this);
        this.n = (NonScrollListView) inflate.findViewById(R.id.vpa_list);
        this.o = (LinearLayout) inflate.findViewById(R.id.layout_list);
        new LinearLayoutManager(getContext()).z1(true);
        this.n.setLayoutManager(new LinearLayoutManager(k()));
        this.n.setNestedScrollingEnabled(false);
        ((EditText) inflate.findViewById(R.id.search_vpa)).addTextChangedListener(new a());
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            if (oliveRequest.getRequestType() != 18) {
                eg0.B();
            } else {
                eg0.B();
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(63, getString(R.string.send_money_via_ifsc));
        super.onResume();
        ua0.e(k()).u(this);
        ArrayList<BeneVpa> N = qa0.v().N(qa0.e.IFSC);
        if (N != null && N.size() > 0) {
            A(N);
            return;
        }
        this.o.setVisibility(8);
        this.m.setVisibility(0);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 18) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
                return;
            }
            return;
        }
        eg0.B();
        A(qa0.v().N(qa0.e.IFSC));
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        if (i == R.id.bene_item && this.l != 5) {
            TransactionData L = qa0.v().L();
            TransactionData.setIsSelectedFromList(true);
            L.setBeneVpa((BeneVpa) obj);
            qa0.v().u0(L);
            if (qa0.v().M() != qa0.e.ALL) {
                ma0 ma0Var = new ma0();
                ma0Var.c(63);
                this.b.t(64, ma0Var);
            }
        }
    }

    public final void z(ArrayList<BeneVpa> arrayList) {
        k90 k90Var = this.r;
        if (k90Var == null) {
            this.r = new k90(k(), arrayList, this.l);
        } else {
            k90Var.z(arrayList, this.l);
        }
        this.r.y(this);
        this.n.setAdapter(this.r);
    }
}
