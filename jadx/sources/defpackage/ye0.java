package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.olive.upi.transport.model.BannerOffersVo;
import com.upi.axispay.R;
import java.util.ArrayList;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ye0  reason: default package */
/* loaded from: classes.dex */
public class ye0 extends xc0 implements ng0 {
    public RelativeLayout l;
    public RecyclerView m;
    public TextView n;
    public aa0 o;
    public ProgressBar p;
    public ArrayList<BannerOffersVo> q;
    public og0 r;

    /* compiled from: AxisPay */
    /* renamed from: ye0$a */
    /* loaded from: classes.dex */
    public class a implements SwipeRefreshLayout.j {
        public final /* synthetic */ SwipeRefreshLayout a;

        public a(SwipeRefreshLayout swipeRefreshLayout) {
            this.a = swipeRefreshLayout;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            ye0.this.r.i(2);
            this.a.setRefreshing(false);
            ye0.this.p.setVisibility(0);
            ye0.this.n.setVisibility(8);
        }
    }

    public static ye0 y() {
        return new ye0();
    }

    public void A(ArrayList<BannerOffersVo> arrayList) {
        if (this.i) {
            this.q = arrayList;
            aa0 aa0Var = this.o;
            if (aa0Var == null) {
                this.o = new aa0(k(), this.q);
            } else {
                aa0Var.z(arrayList);
            }
            this.o.y(this);
            this.m.setAdapter(this.o);
            ArrayList<BannerOffersVo> arrayList2 = this.q;
            if (arrayList2 != null && arrayList2.size() > 0) {
                this.p.setVisibility(8);
                this.n.setVisibility(8);
                return;
            }
            this.p.setVisibility(8);
            this.n.setVisibility(0);
        }
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(R.layout.fragment_offer_list, viewGroup, false);
        this.l = relativeLayout;
        this.m = (RecyclerView) relativeLayout.findViewById(R.id.offer_list);
        this.n = (TextView) this.l.findViewById(R.id.empty_view);
        this.p = (ProgressBar) this.l.findViewById(R.id.progress);
        this.n.setVisibility(8);
        this.p.setVisibility(0);
        this.m.setLayoutManager(new LinearLayoutManager(k()));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.l.findViewById(R.id.swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new a(swipeRefreshLayout));
        return this.l;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        if (i != R.id.image_banner) {
            return;
        }
        BannerOffersVo bannerOffersVo = (BannerOffersVo) obj;
        jg0.P(bannerOffersVo.getActionType(), bannerOffersVo.getClickUrl(), this.b);
        HashMap hashMap = new HashMap();
        hashMap.put(C0059ao.a(14216), this.d);
        hashMap.put(C0059ao.a(14217), bannerOffersVo.getClickUrl());
        ah0.c(k(), C0059ao.a(14218), hashMap);
    }

    public void z(og0 og0Var) {
        this.r = og0Var;
    }
}
