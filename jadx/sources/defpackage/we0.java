package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.PendingReqVo;
import com.upi.axispay.R;
import defpackage.ua0;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: we0  reason: default package */
/* loaded from: classes.dex */
public class we0 extends xc0 implements ng0, ua0.e {
    public z90 l;
    public RecyclerView m;
    public TextView n;
    public ArrayList<PendingReqVo> o = new ArrayList<>();
    public ImageView p;

    public we0() {
        w(C0059ao.a(5817));
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        if (i != 24) {
            return;
        }
        eg0.i(k());
        ua0.e(k()).q(new OliveRequest(29, 24, obj));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_notification, viewGroup, false);
        Context context = inflate.getContext();
        this.m = (RecyclerView) inflate.findViewById(R.id.list);
        this.n = (TextView) inflate.findViewById(R.id.empty_view);
        this.p = (ImageView) inflate.findViewById(R.id.bell_icon);
        this.m.setLayoutManager(new LinearLayoutManager(context));
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (n(oliveRequest, result)) {
            return;
        }
        eg0.B();
        eg0.A(k(), result.getResult());
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(29, getString(R.string.notifications));
        super.onResume();
        ua0.e(k()).u(this);
        NotificationManager notificationManager = (NotificationManager) k().getSystemService(C0059ao.a(5818));
        if (notificationManager != null) {
            notificationManager.cancel(0);
        }
        z90 z90Var = this.l;
        if (z90Var != null) {
            x(z90Var.w());
            return;
        }
        eg0.i(k());
        ua0.d().q(new OliveRequest(29, 27, null));
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 27) {
            eg0.B();
            return;
        }
        eg0.B();
        if (result.getCode().equals(C0059ao.a(5819))) {
            ArrayList<PendingReqVo> arrayList = (ArrayList) result.getData();
            this.o = arrayList;
            x(arrayList);
            return;
        }
        this.n.setVisibility(0);
        this.p.setVisibility(0);
        k().sendBroadcast(new Intent(k().getPackageName() + C0059ao.a(5820)));
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
    }

    public final void x(ArrayList<PendingReqVo> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            z90 z90Var = this.l;
            if (z90Var == null) {
                this.l = new z90(arrayList, this);
            } else {
                z90Var.A(arrayList);
            }
            this.m.setAdapter(this.l);
            this.l.z(this);
            this.m.setLayoutManager(new LinearLayoutManager(k()));
            this.n.setVisibility(8);
            this.p.setVisibility(8);
            return;
        }
        this.n.setVisibility(0);
        this.p.setVisibility(0);
        k().sendBroadcast(new Intent(k().getPackageName() + C0059ao.a(5821)));
    }
}
