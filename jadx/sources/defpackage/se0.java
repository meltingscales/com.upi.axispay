package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.upi.axispay.R;
import com.upi.axispay.custom.SpacesItemDecoration;
import defpackage.ua0;
import java.util.ArrayList;

/* compiled from: AxisPay */
/* renamed from: se0  reason: default package */
/* loaded from: classes.dex */
public class se0 extends xc0 implements ng0, ua0.e {
    public static se0 o;
    public static ArrayList<Account> p;
    public RecyclerView l;
    public y90 m;
    public String[] n;

    public static se0 x(ArrayList<Account> arrayList) {
        if (o == null) {
            o = new se0();
        }
        p = arrayList;
        return o;
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
        View inflate = layoutInflater.inflate(R.layout.fragment_new_add_account, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.account_list);
        this.l = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(k()));
        this.l.addItemDecoration(new SpacesItemDecoration(20));
        this.n = getResources().getStringArray(R.array.state_list);
        ((StateProgressBar) inflate.findViewById(R.id.stepper_indicator)).setStateDescriptionData(this.n);
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            eg0.B();
            eg0.A(k(), result.getResult());
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(66, getString(R.string.link_bank_account));
        super.onResume();
        if (p.size() > 0) {
            y(p);
        }
        ua0.e(k()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 6) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
                return;
            }
            return;
        }
        eg0.B();
        y((ArrayList) result.getData());
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        Account account = (Account) obj;
        if (i != R.id.account_link) {
            return;
        }
        this.b.t(60, account);
    }

    public final void y(ArrayList<Account> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        y90 y90Var = this.m;
        if (y90Var == null) {
            this.m = new y90(k(), arrayList);
        } else {
            y90Var.z(arrayList);
        }
        this.m.y(this);
        this.l.setAdapter(this.m);
    }
}
