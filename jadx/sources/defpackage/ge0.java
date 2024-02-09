package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Billers;
import com.upi.axispay.R;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ge0  reason: default package */
/* loaded from: classes.dex */
public class ge0 extends xc0 implements ng0, ua0.e {
    public View l;
    public RecyclerView m;
    public t90 n;
    public EditText o;
    public ArrayList<String> p;
    public Billers q;
    public TextView r;

    /* compiled from: AxisPay */
    /* renamed from: ge0$a */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ge0.this.C(editable.toString().toLowerCase());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static ge0 A() {
        return new ge0();
    }

    public void B(Billers billers) {
        this.q = billers;
    }

    public final void C(String str) {
        if (this.p != null) {
            if (TextUtils.isEmpty(str)) {
                z(this.p);
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it = this.p.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.toLowerCase().startsWith(str)) {
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

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mobile_circle, viewGroup, false);
        this.l = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.localityList);
        this.m = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(k()));
        this.r = (TextView) this.l.findViewById(R.id.empty_view);
        this.o = (EditText) this.l.findViewById(R.id.search_locality);
        ua0.e(k()).u(this);
        if (this.q != null) {
            ua0.d().q(new OliveRequest(101, 48, this.q.getNAME()));
        }
        this.o.addTextChangedListener(new a());
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            if (oliveRequest.getRequestType() != 48) {
                eg0.B();
            } else {
                eg0.B();
                this.p = null;
                z(null);
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.b.o(90, new tg0(getString(R.string.locality_circle), false, false, true, false));
        v(101, getString(R.string.select_operator));
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 48) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
                return;
            }
            return;
        }
        eg0.B();
        ArrayList<String> y = y((ArrayList) result.getData());
        this.p = y;
        z(y);
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        if (i != R.id.circle_item) {
            return;
        }
        String str = (String) obj;
        dg0 m = qa0.v().m();
        if (m != null) {
            m.h(str);
        }
        this.b.o(12, String.valueOf(81));
    }

    public final ArrayList<String> y(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                int indexOf = next.indexOf(C0059ao.a(2455));
                if (indexOf != -1) {
                    arrayList2.add(next.substring(indexOf + 1).trim());
                }
            }
        }
        return arrayList2;
    }

    public void z(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            this.r.setVisibility(8);
            this.m.setVisibility(0);
            eg0.c();
            t90 t90Var = this.n;
            if (t90Var == null) {
                this.n = new t90(k(), arrayList);
            } else {
                t90Var.z(arrayList);
            }
            this.m.setAdapter(this.n);
            this.n.y(this);
            return;
        }
        this.r.setVisibility(8);
        this.m.setVisibility(8);
    }
}
