package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.model.Banner;
import com.upi.axispay.R;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: wc0  reason: default package */
/* loaded from: classes.dex */
public class wc0 extends xc0 implements ng0 {
    public ViewPager l;
    public CirclePageIndicator p;
    public View r;
    public int s;
    public int m = 0;
    public int n = 0;
    public final Handler o = new Handler();
    public ArrayList<Banner> q = new ArrayList<>();
    public long t = System.currentTimeMillis();
    public Runnable u = new a();

    /* compiled from: AxisPay */
    /* renamed from: wc0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wc0.this.l.setCurrentItem(wc0.this.m, true);
            if (wc0.this.m >= wc0.this.n) {
                wc0.this.m = 0;
            } else {
                wc0.z(wc0.this);
            }
            String str = wc0.this.k;
            String str2 = C0059ao.a(335) + wc0.this.m + C0059ao.a(336) + (wc0.this.t - System.currentTimeMillis());
            wc0.this.t = System.currentTimeMillis();
            wc0 wc0Var = wc0.this;
            wc0Var.o.postDelayed(wc0Var.u, 5000L);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: wc0$b */
    /* loaded from: classes.dex */
    public class b implements ViewPager.j {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            wc0.this.m = i;
        }
    }

    public static wc0 C() {
        return new wc0();
    }

    public static /* synthetic */ int z(wc0 wc0Var) {
        int i = wc0Var.m;
        wc0Var.m = i + 1;
        return i;
    }

    public final void D() {
        if (getActivity() == null || isDetached()) {
            return;
        }
        Handler handler = this.o;
        if (handler != null) {
            handler.removeCallbacks(this.u);
        }
        this.q.clear();
        ArrayList<Banner> k = qa0.v().k();
        if (k != null && k.size() != 0) {
            for (int i = 0; i < k.size(); i++) {
                Banner banner = k.get(i);
                banner.setDefaultImg(R.drawable.banner1);
                this.q.add(banner);
            }
        } else {
            Banner banner2 = new Banner();
            banner2.setDefaultImg(R.drawable.banner1);
            this.q.add(banner2);
        }
        G();
        p90 p90Var = new p90(k(), this.q);
        p90Var.t(this);
        this.l.setAdapter(p90Var);
        this.p.setViewPager(this.l);
        this.p.setOnPageChangeListener(new b());
    }

    public final void E() {
    }

    public final void F() {
        this.l = (ViewPager) this.r.findViewById(R.id.pager);
        this.p = (CirclePageIndicator) this.r.findViewById(R.id.dots);
    }

    public final void G() {
        this.n = this.q.size();
        this.o.post(this.u);
    }

    public void H() {
        D();
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.r = layoutInflater.inflate(R.layout.fragment_banner, viewGroup, false);
        getActivity();
        E();
        F();
        Bundle arguments = getArguments();
        if (arguments != null) {
            String a2 = C0059ao.a(1792);
            if (arguments.containsKey(a2)) {
                this.s = ((Integer) arguments.getSerializable(a2)).intValue();
            }
        }
        return this.r;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Handler handler = this.o;
        if (handler != null) {
            handler.removeCallbacks(this.u);
        }
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ArrayList<Banner> k = qa0.v().k();
        if (k != null && k.size() != 0) {
            D();
        } else {
            ua0.d().m(new OliveRequest(this.s, 46, null));
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        if (i != R.id.image) {
            return;
        }
        Banner banner = (Banner) obj;
        jg0.P(banner.getActionType(), banner.getClickUrl(), this.b);
        HashMap hashMap = new HashMap();
        hashMap.put(C0059ao.a(1793), this.d);
        hashMap.put(C0059ao.a(1794), banner.getClickUrl());
        ah0.c(k(), C0059ao.a(1795), hashMap);
    }
}
