package com.upi.axispay.activity;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.StrictMode;
import android.support.v4.media.session.IMediaSession;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.material.navigation.NavigationView;
import com.google.gson.Gson;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.BillerCategory;
import com.olive.upi.transport.model.BillerChargeRes;
import com.olive.upi.transport.model.BillerRegEnqResponse;
import com.olive.upi.transport.model.Billers;
import com.olive.upi.transport.model.GCMMessage;
import com.olive.upi.transport.model.MasterUpdate;
import com.olive.upi.transport.model.TransactionData;
import com.pkmmte.view.CircularImageView;
import com.upi.axispay.AxisPayApplication;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import defpackage.n70;
import defpackage.qa0;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MainActivity extends c90 implements mg0, NavigationView.c, View.OnClickListener, ng0 {
    public Toolbar D;
    public ImageView E;
    public ImageView F;
    public ImageView G;
    public TextView H;
    public TextView I;
    public ImageView J;
    public LinearLayout K;
    public LinearLayout L;
    public TextView M;
    public Context N;
    public RelativeLayout O;
    public NavigationView P;
    public DrawerLayout Q;
    public w R;
    public RecyclerView S;
    public int T;
    public Spinner U;
    public int V;
    public LinearLayout W;
    public LinearLayout X;
    public l90 Y;
    public TextView a0;
    public TextView b0;
    public kg0 c0;
    public boolean d0;
    public WifiManager i0;
    public ArrayList<String> j0;
    public ArrayList<ScanResult> k0;
    public CircularImageView o0;
    public final String[] Z = {C0059ao.a(13547), C0059ao.a(13548), C0059ao.a(13549)};
    public Fragment e0 = null;
    public Fragment f0 = null;
    public boolean g0 = true;
    public String h0 = null;
    public final BroadcastReceiver l0 = new a();
    public final Handler m0 = new k(this);
    public final Runnable n0 = new l();

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {

        /* compiled from: AxisPay */
        /* renamed from: com.upi.axispay.activity.MainActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class View$OnClickListenerC0021a implements View.OnClickListener {
            public View$OnClickListenerC0021a(a aVar) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                eg0.c();
                eg0.d();
            }
        }

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            if (action.equals(C0059ao.a(816))) {
                c90.z = System.currentTimeMillis();
            } else if (action.equals(C0059ao.a(817))) {
                MainActivity.this.t0();
                c90.z = System.currentTimeMillis();
            } else {
                if (action.equals(MainActivity.this.getPackageName() + C0059ao.a(818))) {
                    MainActivity.this.O0(true);
                    return;
                }
                if (action.equals(MainActivity.this.getPackageName() + C0059ao.a(819))) {
                    Calendar calendar = Calendar.getInstance();
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.add(5, -30);
                    Date time = calendar2.getTime();
                    String a = C0059ao.a(820);
                    String x = jg0.x(time, a);
                    String a2 = C0059ao.a(821);
                    String a3 = C0059ao.a(822);
                    ua0.d().c(x.replace(a2, a3), jg0.x(calendar.getTime(), a).replace(a2, a3), null, false, false);
                    return;
                }
                if (action.equals(MainActivity.this.getPackageName() + C0059ao.a(823))) {
                    MainActivity.this.t(31, null);
                    return;
                }
                if (action.equals(MainActivity.this.getPackageName() + C0059ao.a(824))) {
                    String string = intent.getExtras().getString(C0059ao.a(825));
                    String string2 = intent.getExtras().getString(C0059ao.a(826));
                    if (string.equals(C0059ao.a(827))) {
                        MainActivity.this.n0();
                        return;
                    }
                    eg0.B();
                    MainActivity mainActivity = MainActivity.this;
                    eg0.o(mainActivity, mainActivity.getString(R.string.alert), string2, MainActivity.this.getString(R.string.okay), new View$OnClickListenerC0021a(this));
                } else if (action.equals(C0059ao.a(828))) {
                    MainActivity.this.k0.clear();
                    MainActivity.this.k0.addAll(MainActivity.this.i0.getScanResults());
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class b implements FragmentManager.n {
        public b() {
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public void a() {
            MainActivity.this.N0();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.this.onBackPressed();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.this.Q.K(8388611);
            jg0.C(MainActivity.this.getCurrentFocus(), MainActivity.this.getApplicationContext());
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            if (n70.f.a().j(C0059ao.a(906)) == vg0.e) {
                MainActivity.this.k0();
                return;
            }
            MainActivity mainActivity = MainActivity.this;
            eg0.v(mainActivity, 30, mainActivity.getString(R.string.please_login_deregister));
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f(MainActivity mainActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ua0.e(MainActivity.this).x();
            n70.a aVar = n70.f;
            aVar.a().A(C0059ao.a(842), false);
            n70 a = aVar.a();
            String a2 = C0059ao.a(843);
            int j = a.j(a2);
            TransactionData L = qa0.v().L();
            if (j >= 2 && L != null && L.getTransactionMode() == TransactionData.MODE_MERCHANT_PAY) {
                Intent intent = new Intent();
                intent.putExtra(C0059ao.a(844), jg0.r(L));
                MainActivity.this.setResult(0, intent);
                aVar.a().y(a2, String.valueOf(0));
            } else {
                qa0.v().c();
                qa0.d0(null);
                if (aVar.a().j(C0059ao.a(845)) != vg0.e) {
                    Intent intent2 = new Intent(MainActivity.this, LoginActivity.class);
                    intent2.setFlags(67108864);
                    MainActivity.this.startActivity(intent2);
                }
            }
            ua0.e(MainActivity.this).v(null);
            MainActivity.this.finish();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h(MainActivity mainActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ua0.e(MainActivity.this).v(null);
            qa0.v().c();
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            intent.setFlags(67108864);
            MainActivity.this.startActivity(intent);
            MainActivity.this.finish();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ua0.e(MainActivity.this).v(null);
            qa0.v().c();
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            intent.setFlags(67108864);
            MainActivity.this.startActivity(intent);
            MainActivity.this.finish();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class k extends Handler {
        public k(MainActivity mainActivity) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.t0();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n70.f.a().c(C0059ao.a(1068));
            eg0.c();
            MainActivity.this.finish();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n70.f.a().c(C0059ao.a(1085));
            eg0.c();
            MainActivity.this.finish();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.this.J0();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.this.s0();
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.this.U.performClick();
            MainActivity.this.U.setVisibility(0);
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class r implements AdapterView.OnItemSelectedListener {
        public r() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.V = i;
            String f = d70.e(mainActivity).f();
            int i2 = MainActivity.this.V;
            if (i2 == 1) {
                String a = C0059ao.a(1198);
                if (f.equalsIgnoreCase(a)) {
                    return;
                }
                MainActivity.this.D0(a);
                MainActivity.this.U.setSelection(i, true);
                MainActivity.this.i0(a);
            } else if (i2 != 2) {
            } else {
                String a2 = C0059ao.a(1197);
                if (f.equalsIgnoreCase(a2)) {
                    return;
                }
                MainActivity.this.D0(a2);
                MainActivity mainActivity2 = MainActivity.this;
                mainActivity2.U.setSelection(mainActivity2.V, true);
                MainActivity.this.i0(a2);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public /* synthetic */ void x0(View view) {
        this.g0 = true;
        eg0.b();
        qa0.v().c();
        qa0.d0(null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ void z0(View view) {
        this.g0 = false;
        eg0.b();
    }

    public final void A0(String str, Fragment fragment) {
        B0(str, fragment, true);
    }

    public final void B0(String str, Fragment fragment, boolean z) {
        this.f0 = fragment;
        FragmentManager D = D();
        a0(this.e0, this.f0);
        je n2 = D.n();
        if (z) {
            n2.h(str);
        }
        n2.s(R.id.fragment, this.f0, str);
        n2.k();
        this.e0 = this.f0;
    }

    public void C0() {
        this.m0.removeCallbacks(this.n0);
        this.m0.postDelayed(this.n0, 120000L);
        c90.z = System.currentTimeMillis();
    }

    public void D0(String str) {
        xg0.c(this, str);
        n70.f.a().y(C0059ao.a(13550), str);
    }

    public final void E0() {
        this.i0.startScan();
        r0();
    }

    public boolean F0() {
        TransactionData L = qa0.v().L();
        if (L == null || L.getTransactionMode() != TransactionData.MODE_MERCHANT_PAY) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra(C0059ao.a(13551), jg0.r(L));
        setResult(-1, intent);
        n70.f.a().v(C0059ao.a(13552), 0);
        return true;
    }

    public final void G0() {
        TransactionData L = qa0.v().L();
        Intent intent = new Intent();
        intent.putExtra(C0059ao.a(13553), jg0.r(L));
        setResult(-1, intent);
        n70.f.a().v(C0059ao.a(13554), 0);
        finish();
    }

    public final void H0() {
        this.E = (ImageView) findViewById(R.id.toolbar_logo_image);
        U(this.D);
        if (M() != null) {
            M().t(false);
        }
        this.P = (NavigationView) findViewById(R.id.nav_view);
        this.S = (RecyclerView) findViewById(R.id.menuId);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.S.setHasFixedSize(true);
        this.S.setLayoutManager(linearLayoutManager);
        this.S.setItemAnimator(new xi());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pg0(21, getString(R.string.my_accoun), 2131231269, false, false));
        arrayList.add(new pg0(44, getString(R.string.menu_my_transactions), 2131231272, false, false));
        arrayList.add(new pg0(102, getString(R.string.menu_send_via_ifsc), 2131231341, false, false));
        arrayList.add(new pg0(17, getString(R.string.my_connections), 2131230816, false, false));
        arrayList.add(new pg0(33, getString(R.string.my_query_status), 2131231271, false, false));
        arrayList.add(new pg0(65, getString(R.string.qr_code), 2131230960, false, false));
        arrayList.add(new pg0(42, getString(R.string.menu_change_security), 2131230875, false));
        pg0 pg0Var = new pg0(125, getString(R.string.insta_card), R.drawable.credit_card, false, true);
        pg0 pg0Var2 = new pg0(127, getString(R.string.menu_apply));
        pg0 pg0Var3 = new pg0(126, getString(R.string.menu_view));
        pg0Var.a(pg0Var2);
        pg0Var.a(pg0Var3);
        arrayList.add(pg0Var);
        arrayList.add(new pg0(123, getString(R.string.refer_n_earn), 2131231313, false, false));
        arrayList.add(new pg0(69, getString(R.string.menu_asap), 2131231298, false, false));
        pg0 pg0Var4 = new pg0(130, getString(R.string.menu_loan), R.drawable.icon_loan, false, true);
        pg0Var4.a(new pg0(134, getString(R.string.personal_loan)));
        arrayList.add(pg0Var4);
        arrayList.add(new pg0(106, getString(R.string.mandate), R.drawable.icon_mandate, true, false));
        arrayList.add(new pg0(105, getString(R.string.terms_conditions), R.drawable.note_grey, false));
        arrayList.add(new pg0(155, getString(R.string.menu_privacy_policy), R.drawable.note_grey, false, false));
        arrayList.add(new pg0(30, getString(R.string.deregister), 2131230923, false, false));
        arrayList.add(new pg0(154, getString(R.string.checksum), 2131231313, false));
        l90 l90Var = new l90(this, arrayList);
        this.Y = l90Var;
        l90Var.A(this);
        this.S.setAdapter(this.Y);
        this.Y.j();
        this.P.setNavigationItemSelectedListener(this);
        this.P.setItemIconTintList(null);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.Q = drawerLayout;
        Toolbar toolbar = this.D;
        if (toolbar != null) {
            w wVar = new w(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            this.R = wVar;
            wVar.j();
            this.Q.a(this.R);
            this.D.setNavigationIcon(n70.f.a().e(C0059ao.a(13555)) ? R.drawable.toolbar_icon : R.drawable.toolbar_new);
            D().i(new b());
        }
    }

    public final void I0() {
        new Date();
        View rootView = getWindow().getDecorView().getRootView();
        rootView.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
        rootView.setDrawingCacheEnabled(false);
        yg0.c(this.N, createBitmap);
    }

    public void J0() {
        I0();
    }

    public void K0(String str, String str2) {
        eg0.p(this, str, str2, getString(R.string.login), new i(), new j());
    }

    public void L0() {
        new ch0(this).h(C0059ao.a(13557), c70.g(this, C0059ao.a(13556)), false);
        eg0.r(this, getString(R.string.confirmation), getString(R.string.logout_message), getString(R.string.okay), new g(), getString(R.string.cancel), new h(this));
    }

    public void M0() {
        this.D.setVisibility(0);
    }

    public final void N0() {
        if (D().o0() > 0) {
            M().s(true);
            this.D.setNavigationOnClickListener(new c());
            return;
        }
        int i2 = this.T;
        if (i2 == 56) {
            M().s(true);
        } else if (i2 == 4 || i2 == 67 || i2 == 68) {
        } else {
            M().s(false);
            this.R.h(false);
            this.D.setNavigationIcon(n70.f.a().e(C0059ao.a(13558)) ? R.drawable.toolbar_icon : R.drawable.toolbar_new);
            this.R.j();
            this.D.setNavigationOnClickListener(new d());
        }
    }

    public void O0(boolean z) {
        int j2 = n70.f.a().j(C0059ao.a(13559));
        this.I.setText(String.valueOf(j2));
        PrintStream printStream = System.out;
        printStream.println(C0059ao.a(13560) + String.valueOf(j2));
    }

    public final void P0() {
        Bundle extras = getIntent().getExtras();
        D().b1(null, 1);
        String q0 = q0();
        boolean isEmpty = TextUtils.isEmpty(q0);
        String a2 = C0059ao.a(13561);
        if (!isEmpty) {
            if (new ig0().d(q0, TransactionData.MODE_MERCHANT_PAY).d()) {
                n70.f.a().v(a2, 2);
                D().b1(null, 1);
                t(4, 56);
                return;
            }
            return;
        }
        String a3 = C0059ao.a(13562);
        String a4 = C0059ao.a(13563);
        if (extras != null) {
            int i2 = extras.getInt(C0059ao.a(13564));
            if (i2 == 54) {
                t(5, Boolean.FALSE);
                t(6, null);
                return;
            } else if (i2 == 132 || i2 == 131) {
                t(5, Boolean.FALSE);
                t(i2, null);
                return;
            } else if (i2 == 58) {
                t(5, Boolean.FALSE);
                t(58, null);
                return;
            } else {
                String a5 = C0059ao.a(13565);
                if (i2 == 71) {
                    String token = OliveUpiManager.getInstance(this).getToken();
                    if (n70.f.a().e(a5) && !TextUtils.isEmpty(token)) {
                        D().b1(null, 1);
                        t(5, Boolean.FALSE);
                        TransactionData transactionData = new TransactionData();
                        transactionData.isThroughNotificationCrossSell(true);
                        qa0.v().u0(transactionData);
                        t(31, null);
                    } else {
                        TransactionData transactionData2 = new TransactionData();
                        transactionData2.isThroughNotificationCrossSell(true);
                        qa0.v().u0(transactionData2);
                        t(4, 31);
                    }
                    qa0.v().Y(null);
                    return;
                } else if (i2 == 31) {
                    qa0.v().p(extras.getString(C0059ao.a(13566)));
                    GCMMessage r2 = qa0.v().r();
                    if (r2 != null) {
                        TransactionData transactionData3 = new TransactionData();
                        transactionData3.setIsThroughNotification(true);
                        transactionData3.setRemarks(r2.getRemarks());
                        BeneVpa beneVpa = new BeneVpa();
                        beneVpa.setVpa(r2.getBenevpa());
                        beneVpa.setName(r2.getBene_name());
                        beneVpa.setNickname(r2.getBene_name());
                        transactionData3.setBeneVpa(beneVpa);
                        transactionData3.setTransactionMode(TransactionData.MODE_COLLECT_NOTIFICATION);
                        transactionData3.setAmount(Double.valueOf(r2.getAmount()));
                        transactionData3.setRemitterVpa(r2.getRemittervpa());
                        transactionData3.setTransactionId(r2.getTxnid());
                        transactionData3.setExpiry(r2.getExpiry());
                        transactionData3.setRefid(r2.getRefid());
                        qa0.v().u0(transactionData3);
                        String token2 = OliveUpiManager.getInstance(this).getToken();
                        if (n70.f.a().e(a5) && !TextUtils.isEmpty(token2)) {
                            D().b1(null, 1);
                            t(5, Boolean.FALSE);
                            t(31, null);
                        } else {
                            t(4, 31);
                        }
                    } else if (!n70.f.a().e(a5)) {
                        t(4, null);
                    } else {
                        t(5, null);
                    }
                    qa0.v().Y(null);
                    return;
                } else if (i2 == 9) {
                    return;
                } else {
                    if (i2 == 36) {
                        TransactionData transactionData4 = new TransactionData();
                        transactionData4.setIsThroughNotification(true);
                        transactionData4.setTransactionMode(TransactionData.MODE_MERCHANT_PAY);
                        BeneVpa beneVpa2 = new BeneVpa();
                        String a6 = C0059ao.a(13567);
                        beneVpa2.setVpa(extras.getString(a6));
                        beneVpa2.setName(extras.getString(C0059ao.a(13568)));
                        transactionData4.setBeneVpa(beneVpa2);
                        transactionData4.setRemarks(extras.getString(C0059ao.a(13569)));
                        transactionData4.setAmount(Double.valueOf(jg0.B(extras.getString(C0059ao.a(13570)))));
                        transactionData4.setRemitterVpa(extras.getString(a6));
                        transactionData4.setTransactionId(extras.getString(C0059ao.a(13571)));
                        String a7 = C0059ao.a(13572);
                        transactionData4.setRefid(extras.getString(a7));
                        transactionData4.setOrderId(extras.getString(a7));
                        transactionData4.setMcc(extras.getString(C0059ao.a(13573)));
                        qa0.v().u0(transactionData4);
                        String token3 = OliveUpiManager.getInstance(this).getToken();
                        if (n70.f.a().e(a5) && !TextUtils.isEmpty(token3)) {
                            D().b1(null, 1);
                            t(5, Boolean.FALSE);
                            t(6, Integer.valueOf(TransactionData.MODE_MERCHANT_PAY));
                            return;
                        }
                        t(4, 36);
                        return;
                    }
                    n70.a aVar = n70.f;
                    aVar.a().y(a2, String.valueOf(0));
                    aVar.a().y(a4, a3);
                }
            }
        } else {
            n70.a aVar2 = n70.f;
            aVar2.a().y(a2, String.valueOf(0));
            aVar2.a().y(a4, a3);
        }
        t(5, null);
        n70.f.a().y(a2, String.valueOf(0));
    }

    public void Q0(tg0 tg0Var) {
        this.M.setVisibility(0);
        this.M.setText(tg0Var.a());
        if (tg0Var.e()) {
            this.K.setVisibility(0);
        } else {
            this.K.setVisibility(8);
        }
        if (tg0Var.b()) {
            this.J.setVisibility(0);
        } else {
            this.J.setVisibility(8);
        }
        if (tg0Var.d()) {
            this.O.setVisibility(0);
            this.F.setVisibility(0);
            this.I.setVisibility(0);
        } else {
            this.O.setVisibility(8);
            this.F.setVisibility(8);
            this.I.setVisibility(8);
        }
        if (tg0Var.c()) {
            this.M.setVisibility(8);
            this.E.setVisibility(0);
        } else {
            this.E.setVisibility(8);
            this.M.setVisibility(0);
        }
        if (tg0Var.c()) {
            this.M.setVisibility(8);
            this.E.setVisibility(0);
            this.H.setVisibility(8);
            this.G.setImageResource(R.drawable.bhim_upi_footer);
            return;
        }
        this.E.setVisibility(8);
        this.M.setVisibility(0);
        this.H.setVisibility(0);
        this.G.setImageResource(R.drawable.upi_footer);
    }

    @Override // defpackage.ng0
    public void a(int i2, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i2, int i3, Object obj) {
    }

    @Override // com.google.android.material.navigation.NavigationView.c
    public boolean f(MenuItem menuItem) {
        return false;
    }

    public void i0(String str) {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
    }

    public final boolean j0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(C0059ao.a(13574)) || str.contains(C0059ao.a(13575)) || str.contains(C0059ao.a(13576)) || str.contains(C0059ao.a(13577)) || str.contains(C0059ao.a(13578)) || str.contains(C0059ao.a(13579));
    }

    public final void k0() {
        Intent createConfirmDeviceCredentialIntent = ((KeyguardManager) getSystemService(C0059ao.a(13580))).createConfirmDeviceCredentialIntent(getString(R.string.app_name), getString(R.string.unlock_to_deregister));
        if (createConfirmDeviceCredentialIntent != null) {
            startActivityForResult(createConfirmDeviceCredentialIntent, 102);
        }
    }

    public void l0() {
        Context applicationContext = getApplicationContext();
        String a2 = C0059ao.a(13581);
        if (t8.a(applicationContext, a2) != 0) {
            String a3 = C0059ao.a(13582);
            if (t8.a(this, a3) != 0) {
                d8.o(this, new String[]{a2, a3}, 1017);
                return;
            }
        }
        E0();
    }

    @Override // defpackage.mg0
    public void m(int i2, String str) {
        this.T = i2;
        switch (i2) {
            case 0:
            case 4:
            case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
            case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
            case 56:
            case 67:
            case 68:
                return;
            case 5:
                M0();
                Q0(new tg0(null, true, false, true, false));
                return;
            case 6:
            case 9:
            case 11:
            case 12:
            case 17:
            case 21:
            case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
            case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
            case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
            case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
            case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
            case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
            case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
            case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
            case 54:
            case 55:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 69:
            case 70:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 92:
            case 93:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 106:
            case 107:
            case 108:
            case 109:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 123:
            case 154:
                M0();
                Q0(new tg0(str, false, true, true, false));
                return;
            case 13:
            case 22:
            case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                u0();
                return;
            case 20:
            case 24:
                M0();
                Q0(new tg0(str, false, false, false, true));
                return;
            case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
            case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
            case 71:
                M0();
                Q0(new tg0(str, false, true, false, false));
                return;
            case 110:
                M0();
                Q0(new tg0(str, false, false, false, true));
                return;
            case 155:
                M0();
                Q0(new tg0(null, true, true, true, false));
                return;
            default:
                M0();
                Q0(new tg0(str, false, true, true, false));
                return;
        }
    }

    public void m0(String str) {
        try {
            List<Fragment> v0 = D().v0();
            if (D().j0(String.valueOf(str)) == null) {
                D().b1(v0.get(1).getTag(), 1);
                t(Integer.parseInt(str), null);
                return;
            }
            FragmentManager D = D();
            for (int o0 = D.o0() - 1; o0 > 0 && !D.n0(o0).a().equals(str); o0--) {
                D.Z0();
            }
        } catch (Exception unused) {
        }
    }

    public void n0() {
        qa0.v().c();
        eg0.B();
        eg0.p(this, getString(R.string.alert), getString(R.string.successfully_deregistered), getString(R.string.okay), new m(), new n());
    }

    @Override // defpackage.mg0
    public void o(int i2, Object obj) {
        if (i2 == 90) {
            Q0((tg0) obj);
        } else if (i2 == 151) {
            super.onBackPressed();
            xf0 xf0Var = (xf0) D().j0(String.valueOf(151));
            if (xf0Var == null || !xf0Var.isVisible()) {
                return;
            }
            xf0Var.p(obj);
        } else if (i2 == 221) {
            this.o0 = (CircularImageView) obj;
            if (this.c0 == null) {
                this.c0 = new kg0();
            }
            this.c0.e();
            this.c0.h(this, this.o0);
            this.d0 = true;
        } else if (i2 == 301) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(5, -30);
            Date time = calendar2.getTime();
            String a2 = C0059ao.a(13583);
            String x = jg0.x(time, a2);
            String a3 = C0059ao.a(13584);
            String a4 = C0059ao.a(13585);
            ua0.d().c(x.replace(a3, a4), jg0.x(calendar.getTime(), a2).replace(a3, a4), null, true, false);
        } else if (i2 == 303) {
            this.M.setVisibility(8);
            this.E.setVisibility(0);
            this.J.setVisibility(8);
            this.F.setVisibility(8);
            this.I.setVisibility(8);
        } else if (i2 == 306) {
            this.T = ((Integer) obj).intValue();
        } else if (i2 != 307) {
            switch (i2) {
                case 10:
                    O0(true);
                    return;
                case 11:
                    s0();
                    return;
                case 12:
                    m0((String) obj);
                    return;
                default:
                    return;
            }
        } else {
            s(202, new pg0(((Integer) obj).intValue()));
        }
    }

    public void o0() {
        eg0.r(this, getString(R.string.deregister_title), getString(R.string.deregister_message), getString(R.string.okay), new e(), getString(R.string.cancel), new f(this));
    }

    @Override // defpackage.sd, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        kg0 kg0Var;
        if (this.d0 && (kg0Var = this.c0) != null) {
            kg0Var.d(i2, i3, intent);
        } else if (i2 == 100) {
            if (i3 == -1) {
                startActivityForResult(new Intent(C0059ao.a(13586)), 101);
            }
        } else if (i2 == 101) {
            if (i3 == -1) {
                n70.f.a().v(C0059ao.a(13587), vg0.e);
            }
        } else if (i2 != 102) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            eg0.i(this);
            HashMap hashMap = new HashMap();
            hashMap.put(C0059ao.a(13588), getString(R.string.deregister));
            ah0.c(this, C0059ao.a(13589), hashMap);
            ua0.e(this).w();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i2;
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        jg0.C(getCurrentFocus(), this);
        if (drawerLayout.C(8388611)) {
            drawerLayout.d(8388611);
            return;
        }
        int o0 = D().o0();
        if (o0 < 1 && (i2 = this.T) != 4 && i2 != 68 && i2 != 67) {
            L0();
        } else if (o0 == 2 && this.T == 24) {
            super.onBackPressed();
        } else {
            int i3 = this.T;
            if (i3 == 20 || i3 == 24 || i3 == 31 || i3 == 1 || i3 == 110) {
                s0();
                if (qa0.v().L().getTransactionMode() == TransactionData.MODE_MERCHANT_PAY) {
                    G0();
                }
            } else if (i3 == 9 || i3 == 50) {
                int transactionMode = qa0.v().L().getTransactionMode();
                if (transactionMode != TransactionData.MODE_COLLECT_NOTIFICATION && transactionMode != TransactionData.MODE_QR_PAY && transactionMode != TransactionData.MODE_BHARAT_QR_PAY && transactionMode != TransactionData.MODE_MERCHANT_PAY) {
                    qa0.v().L().setBeneVpa(null);
                }
                super.onBackPressed();
            } else if (i3 == 107 || i3 == 106) {
                super.onBackPressed();
            } else if (i3 == 6) {
                TransactionData L = qa0.v().L();
                L.setTransactionStatus(1);
                if (L.getTransactionMode() == TransactionData.MODE_MERCHANT_PAY) {
                    G0();
                } else {
                    super.onBackPressed();
                }
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.actionitem_img_icon_bell /* 2131361900 */:
                t(71, null);
                return;
            case R.id.layout_help /* 2131362422 */:
                t(48, null);
                this.Q.d(8388611);
                return;
            case R.id.layout_logout /* 2131362426 */:
                L0();
                return;
            case R.id.name_layout /* 2131362617 */:
                t(49, null);
                if (this.Q.C(8388611)) {
                    this.Q.d(8388611);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.c90, defpackage.sd, androidx.activity.ComponentActivity, defpackage.j8, android.app.Activity
    public void onCreate(Bundle bundle) {
        String a2 = C0059ao.a(13590);
        super.onCreate(bundle);
        ((AxisPayApplication) getApplication()).a(this);
        requestWindowFeature(1);
        try {
            setContentView(R.layout.activity_main);
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
            this.D = (Toolbar) findViewById(R.id.toolbar);
            this.N = this;
            String m2 = n70.f.a().m(C0059ao.a(13591));
            this.i0 = (WifiManager) getApplicationContext().getSystemService(a2);
            qa0.v().i0((MasterUpdate) new Gson().fromJson(m2, (Class<Object>) MasterUpdate.class));
            OliveUpiManager.init(this);
            H0();
            v0();
            P0();
            this.i0 = (WifiManager) getApplicationContext().getSystemService(a2);
            this.j0 = new ArrayList<>();
            this.k0 = new ArrayList<>();
            this.j0.clear();
            l0();
        } catch (Exception unused) {
            t(4, null);
        }
        if (ua0.e(this).k()) {
            return;
        }
        ua0.e(this).q(new OliveRequest(86, 80, Boolean.TRUE, true));
    }

    @Override // defpackage.sd, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // defpackage.sd, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 == 100) {
            if (this.c0 == null) {
                this.c0 = new kg0();
            }
            this.c0.h(this, this.o0);
            this.d0 = true;
        } else if (i2 == 109) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                return;
            }
            I0();
        } else if (i2 != 1017) {
            List<Fragment> v0 = D().v0();
            if (v0 == null || v0.size() <= 0) {
                return;
            }
            v0.get(0).onRequestPermissionsResult(i2, strArr, iArr);
        } else if (iArr.length <= 0 || iArr[0] != 0) {
        } else {
            E0();
        }
    }

    @Override // defpackage.c90, defpackage.sd, android.app.Activity
    public void onResume() {
        super.onResume();
        n70.a aVar = n70.f;
        int j2 = aVar.a().j(C0059ao.a(13592));
        int j3 = aVar.a().j(C0059ao.a(13593));
        ch0 ch0Var = new ch0(getApplication());
        if (j3 != 0 && !ch0Var.d()) {
            qa0.v().c();
            aVar.a().c(C0059ao.a(13594));
            aVar.a().d();
            finish();
        } else if (j2 == vg0.e && this.T != 4) {
            X();
        }
        int i2 = 1;
        O0(true);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(getPackageName() + C0059ao.a(13595));
        intentFilter.addAction(getPackageName() + C0059ao.a(13596));
        intentFilter.addAction(getPackageName() + C0059ao.a(13597));
        registerReceiver(this.l0, intentFilter);
        String f2 = d70.e(getApplicationContext()).f();
        Spinner spinner = this.U;
        if (f2 != null && !f2.equals(C0059ao.a(13598))) {
            i2 = 2;
        }
        spinner.setSelection(i2);
        n70 a2 = aVar.a();
        String a3 = C0059ao.a(13599);
        int j4 = a2.j(a3);
        if (TextUtils.isEmpty(q0())) {
            if (j4 > 2) {
                if (F0()) {
                    finish();
                } else {
                    aVar.a().y(a3, String.valueOf(0));
                    aVar.a().y(C0059ao.a(13600), C0059ao.a(13601));
                    finish();
                }
            } else {
                t0();
            }
        }
        if (t8.a(getApplicationContext(), C0059ao.a(13602)) == 0 && t8.a(this, C0059ao.a(13603)) == 0) {
            E0();
        }
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        t0();
        C0();
    }

    public String p0() {
        WifiInfo connectionInfo;
        if (((ConnectivityManager) getApplicationContext().getSystemService(C0059ao.a(13604))).getNetworkInfo(1).isConnected() && (connectionInfo = ((WifiManager) getApplicationContext().getSystemService(C0059ao.a(13605))).getConnectionInfo()) != null && !TextUtils.isEmpty(connectionInfo.getSSID())) {
            this.h0 = connectionInfo.getSSID();
        }
        return this.h0;
    }

    public String q0() {
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        String dataString = intent.getDataString();
        TransactionData L = qa0.v().L();
        String e2 = ig0.e(dataString);
        if (e2 != null) {
            L.setIntentData(dataString);
            if (e2.startsWith(C0059ao.a(13606)) || e2.startsWith(C0059ao.a(13607)) || e2.startsWith(C0059ao.a(13608))) {
                return e2;
            }
            return null;
        }
        return n70.f.a().m(C0059ao.a(13609));
    }

    public final void r0() {
        if (this.k0.size() > 0) {
            this.k0.clear();
        }
        this.k0.addAll(this.i0.getScanResults());
        WifiInfo connectionInfo = this.i0.getConnectionInfo();
        String p0 = p0();
        if (TextUtils.isEmpty(p0)) {
            return;
        }
        String replace = p0.replace(C0059ao.a(13610), C0059ao.a(13611));
        connectionInfo.getHiddenSSID();
        if (this.k0.size() > 0) {
            Iterator<ScanResult> it = this.k0.iterator();
            while (it.hasNext()) {
                ScanResult next = it.next();
                if (replace.equalsIgnoreCase(next.SSID) && !j0(next.capabilities) && this.g0) {
                    this.g0 = false;
                    eg0.a();
                    eg0.k(this, getString(R.string.exit), new View.OnClickListener() { // from class: b90
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MainActivity.this.x0(view);
                        }
                    }, getString(R.string.continue_str), new View.OnClickListener() { // from class: a90
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MainActivity.this.z0(view);
                        }
                    });
                }
            }
        }
    }

    @Override // defpackage.ng0
    public void s(int i2, Object obj) {
        if (i2 == 202) {
            int d2 = ((pg0) obj).d();
            String a2 = C0059ao.a(13612);
            String a3 = C0059ao.a(13613);
            String a4 = C0059ao.a(13614);
            String a5 = C0059ao.a(13615);
            String a6 = C0059ao.a(13616);
            switch (d2) {
                case 17:
                    qa0.v().v0(qa0.e.ALL);
                    t(17, new ma0(5, TransactionData.MODE_NONE));
                    break;
                case 21:
                    t(21, null);
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    o0();
                    break;
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    t(33, null);
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    t(74, 5);
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    t(43, null);
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    t(44, null);
                    break;
                case 65:
                    t(65, 5);
                    break;
                case 69:
                    na0 na0Var = new na0();
                    na0Var.e(n70.f.a().m(C0059ao.a(13620)));
                    t(69, na0Var);
                    break;
                case 102:
                    ArrayList<Account> h2 = qa0.v().h(qa0.c.ACTIVE_VPA);
                    qa0.v().u0(null);
                    qa0.v().U(null);
                    if (h2 != null) {
                        if (h2.size() > 1) {
                            t(102, null);
                            break;
                        } else if (h2.size() == 1) {
                            TransactionData L = qa0.v().L();
                            L.setAccount(h2.get(0));
                            L.setTransactionMode(TransactionData.MODE_SEND_VIA_IFSC);
                            qa0.v().u0(L);
                            t(84, null);
                            break;
                        } else {
                            eg0.m(this, getString(R.string.no_active_account));
                            break;
                        }
                    } else {
                        eg0.m(this, getString(R.string.no_active_account));
                        break;
                    }
                case 105:
                    startActivity(new Intent(this, TnCActivity.class));
                    break;
                case 106:
                    n70.a aVar = n70.f;
                    n70 a7 = aVar.a();
                    String a8 = C0059ao.a(13618);
                    if (!a7.e(a8)) {
                        Intent intent = new Intent(this, TutorialActivity.class);
                        intent.putExtra(C0059ao.a(13619), 106);
                        startActivity(intent);
                    }
                    aVar.a().A(a8, true);
                    t(119, null);
                    break;
                case 113:
                    t(113, null);
                    break;
                case 114:
                    t(114, null);
                    break;
                case 123:
                    t(123, null);
                    break;
                case 126:
                    String i3 = qa0.v().i();
                    if (i3 == null) {
                        eg0.h(this, getString(R.string.alert), getString(R.string.instacard_message));
                        break;
                    } else {
                        na0 na0Var2 = new na0();
                        na0Var2.a(a6, i3);
                        na0Var2.a(a5, String.valueOf(126));
                        t(126, na0Var2);
                        HashMap hashMap = new HashMap();
                        hashMap.put(a4, getString(R.string.insta_card));
                        hashMap.put(a3, getString(R.string.menu_view));
                        ah0.c(this, a2, hashMap);
                        break;
                    }
                case 127:
                    String i4 = qa0.v().i();
                    if (i4 == null) {
                        eg0.h(this, getString(R.string.alert), getString(R.string.instacard_message));
                        break;
                    } else {
                        na0 na0Var3 = new na0();
                        na0Var3.a(a6, i4);
                        na0Var3.a(a5, String.valueOf(127));
                        t(127, na0Var3);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(a4, getString(R.string.insta_card));
                        hashMap2.put(a3, getString(R.string.menu_apply));
                        ah0.c(this, a2, hashMap2);
                        break;
                    }
                case 129:
                    t(129, null);
                    break;
                case 134:
                    if (qa0.v().i() == null) {
                        eg0.h(this, getString(R.string.alert), getString(R.string.instacard_message));
                        break;
                    } else {
                        na0 na0Var4 = new na0();
                        na0Var4.a(a6, qa0.v().i());
                        na0Var4.a(a5, String.valueOf(134));
                        t(134, na0Var4);
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put(a4, getString(R.string.personal_loan));
                        hashMap3.put(a3, getString(R.string.menu_view));
                        ah0.c(this, a2, hashMap3);
                        break;
                    }
                case 137:
                    t(137, null);
                    break;
                case 154:
                    t(154, null);
                    break;
                case 155:
                    na0 na0Var5 = new na0();
                    na0Var5.e(C0059ao.a(13617));
                    t(155, na0Var5);
                    break;
            }
            DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            this.Q = drawerLayout;
            drawerLayout.d(8388611);
        }
    }

    public void s0() {
        try {
            if (F0()) {
                finish();
            } else {
                Q0(new tg0(getString(R.string.axis_pay_upi), false, true, true, false));
                qa0.v().u0(null);
                qa0.v().U(null);
                D().b1(null, 1);
                t(5, Boolean.FALSE);
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.mg0
    public void t(int i2, Object obj) {
        int intValue;
        if (i2 == 86 || this.T == i2) {
            return;
        }
        this.T = i2;
        String valueOf = String.valueOf(i2);
        M0();
        if (this.T == 5) {
            this.J.setVisibility(8);
            this.M.setVisibility(8);
            this.E.setVisibility(0);
            this.D.setBackgroundColor(t8.d(this.N, R.color.colorPrimary));
        } else {
            this.J.setVisibility(0);
            this.E.setVisibility(8);
            this.M.setVisibility(0);
        }
        if (qa0.v().L().getTransactionMode() == TransactionData.MODE_MERCHANT_PAY) {
            this.J.setEnabled(false);
            this.F.setEnabled(false);
        } else {
            this.J.setEnabled(true);
            this.F.setEnabled(true);
        }
        this.r = 0;
        eg0.c();
        String a2 = C0059ao.a(13621);
        switch (i2) {
            case 4:
                this.Q.setDrawerLockMode(1);
                intValue = obj != null ? ((Integer) obj).intValue() : 0;
                u0();
                rd0 H = rd0.H();
                H.L(intValue);
                A0(valueOf, H);
                break;
            case 5:
                B0(valueOf, od0.Q(obj == null), false);
                break;
            case 6:
                this.Q.setDrawerLockMode(1);
                intValue = obj != null ? ((Integer) obj).intValue() : 0;
                if (intValue == TransactionData.MODE_COLLECT_NOTIFICATION) {
                    t(31, null);
                    break;
                } else {
                    tf0 A = tf0.A();
                    A.E(intValue);
                    A0(valueOf, A);
                    break;
                }
            case 9:
                A0(valueOf, of0.G((Account) obj));
                break;
            case 11:
                A0(valueOf, new sc0());
                break;
            case 12:
                A0(valueOf, new rc0());
                break;
            case 13:
                this.Q.setDrawerLockMode(1);
                u0();
                A0(valueOf, new mf0());
                break;
            case 15:
                A0(valueOf, new id0());
                break;
            case 17:
                A0(valueOf, yc0.B((ma0) obj));
                break;
            case 20:
                A0(valueOf, new yf0());
                break;
            case 21:
                A0(valueOf, pc0.F());
                break;
            case 22:
                this.r = 22;
                this.Q.setDrawerLockMode(1);
                u0();
                A0(valueOf, he0.S(obj != null ? ((Integer) obj).intValue() : 0));
                break;
            case 24:
                A0(valueOf, new yf0());
                break;
            case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                A0(valueOf, new we0());
                break;
            case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
            case 71:
                this.F.setVisibility(8);
                this.I.setVisibility(8);
                xe0 A2 = xe0.A();
                A2.B((ArrayList) obj);
                A0(valueOf, A2);
                break;
            case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                A0(valueOf, new ef0());
                break;
            case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                A0(valueOf, of0.G(new Account()));
                break;
            case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                this.Q.setDrawerLockMode(1);
                u0();
                A0(valueOf, new jf0());
                break;
            case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                A0(valueOf, new sf0());
                break;
            case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                A0(valueOf, ed0.B());
                break;
            case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                A0(valueOf, re0.F());
                break;
            case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                this.F.setVisibility(8);
                this.I.setVisibility(8);
                A0(valueOf, af0.B((ArrayList) obj));
                break;
            case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                A0(valueOf, new hd0());
                break;
            case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                A0(valueOf, new md0());
                break;
            case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                A0(valueOf, new pe0());
                break;
            case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                A0(valueOf, kf0.z((Account) obj));
                break;
            case 52:
                A0(valueOf, new qc0());
                break;
            case 54:
                cf0 G = cf0.G();
                G.M(obj);
                this.Q.setDrawerLockMode(1);
                A0(valueOf, G);
                break;
            case 55:
                this.Q.setDrawerLockMode(1);
                A0(valueOf, df0.C((hg0) obj));
                break;
            case 56:
                this.Q.setDrawerLockMode(1);
                A0(valueOf, fe0.x());
                break;
            case 58:
                A0(valueOf, vc0.B());
                break;
            case 60:
                wf0 I = wf0.I();
                I.K((Account) obj);
                A0(valueOf, I);
                break;
            case 61:
                A0(valueOf, vf0.y((Account) obj));
                break;
            case 62:
                A0(valueOf, lf0.y((Account) obj));
                break;
            case 63:
                A0(valueOf, ve0.y());
                break;
            case 64:
                this.Q.setDrawerLockMode(1);
                A0(valueOf, rf0.D());
                break;
            case 65:
                this.Q.setDrawerLockMode(1);
                intValue = obj != null ? ((Integer) obj).intValue() : 0;
                qe0 z = qe0.z();
                z.C(intValue);
                A0(valueOf, z);
                break;
            case 66:
                this.Q.setDrawerLockMode(1);
                A0(valueOf, se0.x((ArrayList) obj));
                break;
            case 67:
            case 68:
                this.J.setVisibility(8);
                this.M.setVisibility(8);
                this.E.setVisibility(0);
                this.J.setEnabled(true);
                this.F.setEnabled(true);
                this.Q.setDrawerLockMode(1);
                eg0.v(this, obj != null ? ((Integer) obj).intValue() : 0, getString(R.string.please_login_continue));
                break;
            case 69:
            case 125:
            case 126:
            case 127:
            case 134:
            case 155:
                ag0 y = ag0.y();
                y.z((na0) obj);
                A0(valueOf, y);
                break;
            case 70:
                ff0 ff0Var = new ff0();
                ff0Var.x((TransactionData) obj);
                A0(valueOf, ff0Var);
                break;
            case 74:
                A0(valueOf, nf0.A(((Integer) obj).intValue()));
                break;
            case 75:
                A0(valueOf, uf0.B(((Integer) obj).intValue()));
                break;
            case 80:
                A0(valueOf, bd0.C((String) obj));
                break;
            case 81:
                ue0 C = ue0.C();
                C.H((BillerCategory) obj);
                A0(valueOf, C);
                break;
            case 82:
                A0(valueOf, dd0.z());
                break;
            case 83:
                A0(valueOf, hf0.z((dg0) obj));
                break;
            case 84:
                A0(valueOf, pf0.z());
                break;
            case 85:
                te0 B = te0.B();
                B.F((BillerCategory) obj);
                A0(valueOf, B);
                break;
            case 92:
                vf0 y2 = vf0.y((Account) obj);
                y2.B(true);
                A0(valueOf, y2);
                break;
            case 93:
                this.Q.setDrawerLockMode(1);
                A0(valueOf, kd0.y());
                break;
            case 100:
            case 121:
                ie0 A3 = ie0.A();
                A3.B((BillerCategory) obj);
                A0(valueOf, A3);
                break;
            case 101:
                ge0 A4 = ge0.A();
                A4.B((Billers) obj);
                A0(valueOf, A4);
                break;
            case 102:
                this.Q.setDrawerLockMode(1);
                A0(valueOf, qf0.z());
                break;
            case 103:
                A0(valueOf, ld0.A());
                break;
            case 104:
                A0(valueOf, pd0.B());
                break;
            case 105:
                ad0 ad0Var = new ad0();
                ad0Var.A((BillerChargeRes) obj);
                A0(valueOf, ad0Var);
                break;
            case 106:
                A0(valueOf, sd0.z(((Integer) obj).intValue()));
                break;
            case 107:
                A0(valueOf, td0.A(((Integer) obj).intValue()));
                break;
            case 108:
                A0(valueOf, vd0.x());
                break;
            case 109:
                A0(valueOf, wd0.x());
                break;
            case 110:
                A0(valueOf, ee0.y());
                break;
            case 111:
                A0(valueOf, ae0.x());
                break;
            case 113:
                A0(valueOf, ne0.A());
                break;
            case 114:
                A0(valueOf, be0.y());
                break;
            case 115:
                A0(valueOf, yd0.x());
                break;
            case 116:
                A0(valueOf, zd0.x());
                break;
            case 117:
                A0(valueOf, xd0.x());
                break;
            case 118:
                A0(valueOf, je0.x((Account) obj));
                break;
            case 119:
                A0(valueOf, ud0.y());
                break;
            case 120:
                cd0 z2 = cd0.z();
                z2.A((Billers) obj);
                A0(valueOf, z2);
                break;
            case 123:
                A0(valueOf, if0.x());
                n70.f.a().y(a2, String.valueOf(true));
                break;
            case 124:
                zc0 zc0Var = new zc0();
                zc0Var.x((BillerRegEnqResponse) obj);
                A0(valueOf, zc0Var);
                break;
            case Barcode.ITF /* 128 */:
                A0(valueOf, ee0.y());
                break;
            case 129:
                A0(valueOf, ze0.D());
                break;
            case 131:
                A0(valueOf, de0.y());
                break;
            case 132:
                A0(valueOf, ce0.G());
                break;
            case 137:
                this.F.setVisibility(8);
                this.I.setVisibility(8);
                xe0 A5 = xe0.A();
                A5.C(2);
                A0(valueOf, A5);
                break;
            case 151:
                A0(valueOf, new xf0());
                break;
            case 154:
                A0(valueOf, fd0.B());
                n70.f.a().y(a2, String.valueOf(true));
                break;
        }
        jg0.C(getCurrentFocus(), this);
        C0();
        eg0.B();
    }

    public final boolean t0() {
        if (c90.z == 0 || System.currentTimeMillis() - c90.z <= 120000 || this.T == 4) {
            return false;
        }
        n70.f.a().y(C0059ao.a(13622), String.valueOf(false));
        qa0.v().R(null);
        qa0.v().n0(null);
        c90.z = System.currentTimeMillis();
        qa0.v().u0(null);
        eg0.e();
        if (this.T != 4) {
            K0(getString(R.string.session_timeout), getString(R.string.session_expired_login_continue));
            return true;
        }
        return true;
    }

    public void u0() {
        this.D.setVisibility(8);
    }

    public final void v0() {
        this.F = (ImageView) findViewById(R.id.actionitem_img_icon_bell);
        this.G = (ImageView) findViewById(R.id.network_logo);
        this.H = (TextView) findViewById(R.id.powerd_by);
        this.F.setOnClickListener(this);
        this.I = (TextView) findViewById(R.id.text_counter);
        this.M = (TextView) findViewById(R.id.toolbar_title);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_share);
        this.K = linearLayout;
        linearLayout.setOnClickListener(new o());
        ImageView imageView = (ImageView) findViewById(R.id.home_icon);
        this.J = imageView;
        imageView.setVisibility(8);
        this.J.setOnClickListener(new p());
        this.O = (RelativeLayout) findViewById(R.id.bell_icon);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.layout_help);
        this.X = linearLayout2;
        linearLayout2.setOnClickListener(this);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.name_layout);
        this.L = linearLayout3;
        linearLayout3.setOnClickListener(this);
        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.layout_logout);
        this.W = linearLayout4;
        linearLayout4.setOnClickListener(this);
        this.U = (Spinner) findViewById(R.id.spinner_select_language);
        this.a0 = (TextView) findViewById(R.id.drawer_listitem_tv_profile_name);
        this.b0 = (TextView) findViewById(R.id.drawer_listitem_tv_phone_number);
        ((TextView) findViewById(R.id.version)).setText(getString(R.string.version_string, new Object[]{C0059ao.a(13623)}));
        ((RelativeLayout) findViewById(R.id.layout_select_language)).setOnClickListener(new q());
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, this.Z);
        arrayAdapter.setDropDownViewResource(17367049);
        this.U.setAdapter((SpinnerAdapter) arrayAdapter);
        this.U.setOnItemSelectedListener(new r());
        TextView textView = this.a0;
        n70.a aVar = n70.f;
        textView.setText(aVar.a().m(C0059ao.a(13624)));
        TextView textView2 = this.b0;
        textView2.setText(C0059ao.a(13625) + aVar.a().m(C0059ao.a(13626)).substring(2, 12));
    }
}
