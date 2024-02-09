package defpackage;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.Banner;
import com.olive.upi.transport.model.BillerCategory;
import com.olive.upi.transport.model.GetMandate;
import com.olive.upi.transport.model.PendingReqVo;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.activity.IntentRegistrationActivity;
import com.upi.axispay.activity.LoginActivity;
import com.upi.axispay.activity.MainActivity;
import com.upi.axispay.custom.SimpleDividerItemDecoration;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: od0  reason: default package */
/* loaded from: classes.dex */
public class od0 extends xc0 implements View.OnClickListener, ng0, ua0.e {
    public static boolean K;
    public RecyclerView A;
    public o90 B;
    public wc0 C;
    public n90 D;
    public ViewPager E;
    public ProgressBar F;
    public TransactionData G;
    public Dialog J;
    public View l;
    public TextView m;
    public TextView n;
    public TextView o;
    public LinearLayout p;
    public RelativeLayout q;
    public Context r;
    public kg0 s;
    public boolean t;
    public LinearLayout u;
    public LinearLayout v;
    public LinearLayout w;
    public LinearLayout x;
    public ArrayList<PendingReqVo> y;
    public int z = -1;
    public int H = 0;
    public int I = 0;

    /* compiled from: AxisPay */
    /* renamed from: od0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n70.f.a().y(C0059ao.a(8187), String.valueOf(false));
            od0.this.J.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: od0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n70.f.a().y(C0059ao.a(8267), String.valueOf(false));
            od0.this.J.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void C(View view) {
        ua0.e(k()).v(null);
        qa0.v().c();
        Intent intent = new Intent(k(), LoginActivity.class);
        intent.setFlags(67108864);
        startActivity(intent);
        k().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void E(View view) {
        ua0.e(k()).v(null);
        qa0.v().c();
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        intent.setFlags(67108864);
        startActivity(intent);
        k().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void G(View view) {
        eg0.c();
        this.b.o(11, null);
        this.b.t(21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void I(View view) {
        String a2 = C0059ao.a(10513);
        n70.f.a().v(C0059ao.a(10514), 1);
        String packageName = this.r.getPackageName();
        try {
            Context context = this.r;
            context.startActivity(new Intent(a2, Uri.parse(C0059ao.a(10515) + packageName)));
        } catch (ActivityNotFoundException unused) {
            Context context2 = this.r;
            context2.startActivity(new Intent(a2, Uri.parse(C0059ao.a(10516) + packageName)));
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(C0059ao.a(10517), String.valueOf((int) R.string.rating_title));
            hashMap.put(C0059ao.a(10518), String.valueOf((int) R.string.rate));
            ah0.c(k(), C0059ao.a(10519), hashMap);
        } catch (Exception unused2) {
        }
        eg0.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void K(View view) {
        n70.a aVar = n70.f;
        aVar.a().v(C0059ao.a(10520), 2);
        aVar.a().A(C0059ao.a(10521), true);
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(C0059ao.a(10522), String.valueOf((int) R.string.rating_title));
            hashMap.put(C0059ao.a(10523), String.valueOf((int) R.string.maybe_later));
            ah0.c(k(), C0059ao.a(10524), hashMap);
        } catch (Exception unused) {
        }
        qa0.v().p0(true);
        n70.a aVar2 = n70.f;
        n70 a2 = aVar2.a();
        String a3 = C0059ao.a(10525);
        if (a2.j(a3) != 0) {
            aVar2.a().v(a3, aVar2.a().j(a3) % aVar2.a().j(C0059ao.a(10526)));
        }
        eg0.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void M(Account account, View view) {
        eg0.c();
        this.b.t(61, account);
    }

    public static od0 Q(boolean z) {
        K = z;
        return new od0();
    }

    public final void A() {
        this.p = (LinearLayout) this.l.findViewById(R.id.pending_layout);
        this.n = (TextView) this.l.findViewById(R.id.text_pending_request);
        this.o = (TextView) this.l.findViewById(R.id.text_pending_amount);
        this.u = (LinearLayout) this.l.findViewById(R.id.layout_add_account);
        RelativeLayout relativeLayout = (RelativeLayout) this.l.findViewById(R.id.empty_view);
        this.q = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.m = (TextView) this.l.findViewById(R.id.text_counter);
        this.v = (LinearLayout) this.l.findViewById(R.id.layout_transaction);
        this.w = (LinearLayout) this.l.findViewById(R.id.layout_scan_pay);
        this.x = (LinearLayout) this.l.findViewById(R.id.layout_bill_payment);
        this.F = (ProgressBar) this.l.findViewById(R.id.account_loader);
        this.E = (ViewPager) this.l.findViewById(R.id.pager_acc_list);
        this.A = (RecyclerView) this.l.findViewById(R.id.billpay_list);
        this.A.setLayoutManager(new LinearLayoutManager(k(), 0, false));
    }

    public final void O() {
        GetMandate getMandate = new GetMandate();
        n70.a aVar = n70.f;
        getMandate.setCustomerid(aVar.a().m(C0059ao.a(10527)));
        getMandate.setUmn(c70.k());
        getMandate.setTxnid(c70.j());
        getMandate.setAppid(aVar.a().m(C0059ao.a(10528)));
        ua0.d().q(new OliveRequest(5, 75, getMandate));
    }

    public final void P() {
        ArrayList<PendingReqVo> H = qa0.v().H();
        String a2 = C0059ao.a(10529);
        if (H != null && H.size() > 0) {
            PendingReqVo pendingReqVo = H.get(0);
            this.n.setText(String.format(getString(R.string.pending_prequest_string), pendingReqVo.getPayeeVpa()));
            TextView textView = this.o;
            textView.setText(C0059ao.a(10530) + pendingReqVo.getAmount());
            this.m.setText(String.valueOf(n70.f.a().j(a2)));
            this.p.setVisibility(0);
            V();
            return;
        }
        n70.a aVar = n70.f;
        if (aVar.a().j(a2) > 0) {
            ua0.d().q(new OliveRequest(5, 27, null));
        }
        this.m.setText(String.valueOf(aVar.a().j(a2)));
        this.n.setText(R.string.no_pending_request_to_approve);
        this.o.setText(C0059ao.a(10531));
        this.p.setVisibility(0);
        V();
    }

    public final void R() {
        this.n.setOnClickListener(this);
        this.u.setOnClickListener(this);
        this.v.setOnClickListener(this);
        this.w.setOnClickListener(this);
        this.x.setOnClickListener(this);
        this.p.setOnClickListener(this);
    }

    public void S() {
        Dialog dialog = new Dialog(getActivity(), R.style.Theme_Dialog);
        this.J = dialog;
        dialog.getWindow().requestFeature(1);
        this.J.setContentView(R.layout.alert_note_to_customer);
        this.J.getWindow().setLayout(-1, -2);
        this.J.setCancelable(true);
        this.J.show();
        ((Button) this.J.findViewById(R.id.button_yes)).setOnClickListener(new a());
        ((ImageView) this.J.findViewById(R.id.dialog_close)).setOnClickListener(new b());
    }

    public void T() {
        eg0.w(k(), new View.OnClickListener() { // from class: sb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                od0.this.I(view);
            }
        }, new View.OnClickListener() { // from class: xb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                od0.this.K(view);
            }
        });
    }

    public final void U(final Account account) {
        eg0.r(k(), this.r.getString(R.string.set_upi_pin), this.r.getString(R.string.upi_pin_to_continue), this.r.getString(R.string.yes), new View.OnClickListener() { // from class: ub0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                od0.this.M(account, view);
            }
        }, this.r.getString(R.string.no), new View.OnClickListener() { // from class: wb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eg0.c();
            }
        });
    }

    public void V() {
        n70.f.a().j(C0059ao.a(10532));
        if (getActivity() != null) {
            ((MainActivity) getActivity()).O0(false);
        }
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
        if (i != R.id.text_refresh) {
            return;
        }
        Account account = (Account) obj;
        this.z = i2;
        if (account.getStatus().equalsIgnoreCase(C0059ao.a(10533))) {
            OliveRequest oliveRequest = new OliveRequest(5, 519, account);
            oliveRequest.setTag(Integer.valueOf(i2));
            ua0.d().q(oliveRequest);
            HashMap hashMap = new HashMap();
            hashMap.put(C0059ao.a(10534), getString(R.string.home));
            hashMap.put(C0059ao.a(10535), jg0.n(account.getBankName()));
            ah0.c(k(), C0059ao.a(10536), hashMap);
            return;
        }
        U(account);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        kg0 kg0Var;
        if (this.t && (kg0Var = this.s) != null) {
            kg0Var.d(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.actionitem_img_icon_bell /* 2131361900 */:
                ah0.f(requireContext(), getString(R.string.post_login), getString(R.string.notification));
                this.b.t(71, this.y);
                return;
            case R.id.empty_view /* 2131362235 */:
                this.b.t(58, null);
                return;
            case R.id.layout_add_account /* 2131362404 */:
                ah0.f(requireContext(), getString(R.string.post_login), getString(R.string.add_account_action));
                this.b.t(58, null);
                return;
            case R.id.layout_bill_payment /* 2131362407 */:
                qa0.v().v0(qa0.e.ALL);
                ma0 ma0Var = new ma0(5, TransactionData.MODE_NONE);
                ah0.f(requireContext(), getString(R.string.post_login), getString(R.string.manage_beneficiary_action));
                this.b.t(17, ma0Var);
                return;
            case R.id.layout_scan_pay /* 2131362441 */:
                ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
                if (h != null && h.size() > 0) {
                    ah0.f(requireContext(), getString(R.string.post_login), getString(R.string.scanPay));
                    this.b.t(54, 5);
                    return;
                }
                eg0.m(k(), getString(R.string.no_active_account));
                return;
            case R.id.layout_transaction /* 2131362450 */:
                ah0.f(requireContext(), getString(R.string.post_login), getString(R.string.view_transaction));
                this.b.t(44, null);
                return;
            case R.id.pending_layout /* 2131362689 */:
            case R.id.text_pending_request /* 2131363013 */:
                ArrayList<PendingReqVo> H = qa0.v().H();
                this.y = H;
                if (H == null || H.size() <= 0) {
                    return;
                }
                this.b.t(71, this.y);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        if (i != 19) {
            return;
        }
        this.D.w(C0059ao.a(10537), 1, this.z);
        this.E.setAdapter(this.D);
        this.E.setCurrentItem(this.z, true);
        OliveRequest oliveRequest = new OliveRequest(5, 19, obj);
        oliveRequest.setTag(Integer.valueOf(this.z));
        ua0.e(k()).q(oliveRequest);
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        this.r = getActivity();
        getContext().setTheme(R.style.AppTheme);
        A();
        R();
        wc0 C = wc0.C();
        this.C = C;
        C.w(getString(R.string.home));
        Bundle bundle2 = new Bundle();
        bundle2.putInt(C0059ao.a(10538), 5);
        this.C.setArguments(bundle2);
        je n = getChildFragmentManager().n();
        n.r(R.id.fragment_connection, this.C);
        t(this.C);
        n.j();
        this.p.setVisibility(0);
        this.q.setVisibility(8);
        o90 o90Var = new o90(k(), this);
        this.B = o90Var;
        this.A.setAdapter(o90Var);
        this.A.addItemDecoration(new SimpleDividerItemDecoration(t8.f(this.r, R.drawable.line_divider)));
        this.B.z(this);
        this.B.j();
        if (vg0.b && n70.f.a().e(C0059ao.a(10539))) {
            S();
            vg0.b = false;
        }
        return this.l;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
        if (r3 != 519) goto L12;
     */
    @Override // defpackage.ua0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFailureResponse(com.olive.upi.transport.OliveRequest r16, com.olive.upi.transport.api.Result r17) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od0.onFailureResponse(com.olive.upi.transport.OliveRequest, com.olive.upi.transport.api.Result):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0101, code lost:
        if ((r3 % r0.a().j(r5)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0115, code lost:
        if (r3 == r0.a().j(myunmn.C0059ao.a(10550))) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0124, code lost:
        if ((r3 % r0.a().j(r5)) == 0) goto L23;
     */
    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od0.onResume():void");
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 15) {
            eg0.B();
            this.H = 0;
            ArrayList arrayList = (ArrayList) result.getData();
            if (arrayList != null) {
                if (arrayList.size() > 0 && !n70.f.a().e(C0059ao.a(10555))) {
                    y();
                }
                z();
            }
            z();
            this.q.setVisibility(0);
            x(qa0.v().h(qa0.c.WITH_VPA));
            if (vg0.a && !n70.f.a().e(C0059ao.a(10556))) {
                zg0.b(k());
            }
            ua0.d().j(false, new OliveRequest(5, 18, null));
        } else if (requestType == 21) {
            eg0.B();
            ua0.d().b(true, new OliveRequest(5, 15, null));
        } else {
            String a2 = C0059ao.a(10553);
            if (requestType == 27) {
                eg0.B();
                ArrayList<PendingReqVo> arrayList2 = (ArrayList) result.getData();
                this.y = arrayList2;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    n70.f.a().v(a2, this.y.size());
                    Collections.sort(this.y);
                    P();
                } else {
                    n70.f.a().v(a2, 0);
                    V();
                }
                ua0.d().q(new OliveRequest(5, 86, null));
            } else if (requestType == 46) {
                wc0 wc0Var = this.C;
                if (wc0Var != null) {
                    wc0Var.H();
                }
            } else if (requestType == 63) {
                this.B.B(oa0.f().a());
            } else if (requestType == 75) {
                this.I = ((ArrayList) result.getData()).size();
                n70.a aVar = n70.f;
                aVar.a().v(a2, aVar.a().j(a2) + this.I);
            } else if (requestType == 86) {
                eg0.B();
                qa0.v().w0((ArrayList) result.getData());
            } else if (requestType == 98) {
                if (result.getCode().equalsIgnoreCase(C0059ao.a(10554))) {
                    TransactionData L = qa0.v().L();
                    this.G = L;
                    OliveRequest oliveRequest2 = new OliveRequest(5, 510, L);
                    oliveRequest2.setClMode(6);
                    ua0.d().q(oliveRequest2);
                } else {
                    Toast.makeText(this.c, result.getResult().toString(), 0).show();
                }
                eg0.B();
            } else if (requestType == 18) {
                eg0.B();
                ua0.d().q(new OliveRequest(5, 12, null));
            } else if (requestType != 19) {
                oliveRequest.getInitiator();
                eg0.B();
            } else {
                Object data = result.getData();
                if (data != null) {
                    int intValue = oliveRequest.getTag() != null ? ((Integer) oliveRequest.getTag()).intValue() : 0;
                    this.D.w(data.toString(), 1, intValue);
                    this.E.setAdapter(this.D);
                    this.E.setCurrentItem(intValue, true);
                }
                eg0.B();
            }
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        qa0.v().U(null);
        String a2 = C0059ao.a(10557);
        String a3 = C0059ao.a(10558);
        switch (i) {
            case R.id.add_account /* 2131361905 */:
                this.b.t(58, null);
                return;
            case R.id.billpay_grid /* 2131361970 */:
                BillerCategory billerCategory = (BillerCategory) obj;
                if (!TextUtils.isEmpty(billerCategory.getCODE_VAL())) {
                    qa0.v().u0(null);
                    this.b.t(121, billerCategory);
                    return;
                }
                qa0.v().u0(null);
                this.b.t(billerCategory.getFixedCategory(), billerCategory);
                return;
            case R.id.button_request /* 2131362035 */:
                Account account = (Account) obj;
                qa0.v().u0(null);
                TransactionData L = qa0.v().L();
                L.setTransactionMode(TransactionData.MODE_RECEIVE);
                L.setAccount(account);
                qa0.v().v0(qa0.e.VPA);
                this.b.t(62, account);
                return;
            case R.id.button_send /* 2131362039 */:
                Account account2 = (Account) obj;
                qa0.v().u0(null);
                if (account2.getStatus().equalsIgnoreCase(a3)) {
                    TransactionData L2 = qa0.v().L();
                    L2.setTransactionMode(TransactionData.MODE_SEND);
                    L2.setAccount(account2);
                    qa0.v().v0(qa0.e.VPA);
                    this.b.t(84, account2);
                    return;
                }
                U(account2);
                return;
            case R.id.id_balance_enq /* 2131362335 */:
                this.z = ((Integer) obj).intValue();
                return;
            case R.id.image /* 2131362342 */:
                Banner banner = (Banner) obj;
                if (banner == null || TextUtils.isEmpty(banner.getClickUrl())) {
                    return;
                }
                na0 na0Var = new na0();
                na0Var.e(banner.getClickUrl());
                this.b.t(69, na0Var);
                HashMap hashMap = new HashMap();
                hashMap.put(a2, getString(R.string.home));
                hashMap.put(C0059ao.a(10561), banner.getClickUrl());
                ah0.c(k(), C0059ao.a(10562), hashMap);
                return;
            case R.id.layout_acc /* 2131362401 */:
                this.b.t(118, (Account) obj);
                return;
            case R.id.text_refresh /* 2131363027 */:
                Account account3 = (Account) obj;
                if (account3.getStatus().equalsIgnoreCase(a3)) {
                    ua0.d().q(new OliveRequest(5, 519, account3));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(a2, getString(R.string.home));
                    hashMap2.put(C0059ao.a(10559), jg0.n(account3.getBankName()));
                    ah0.c(k(), C0059ao.a(10560), hashMap2);
                    return;
                }
                U(account3);
                return;
            default:
                return;
        }
    }

    public final void x(ArrayList<Account> arrayList) {
        this.q.setVisibility(8);
        this.E.setClipToPadding(false);
        this.E.setPadding(90, 28, 120, 28);
        this.E.setPageMargin(40);
        n90 n90Var = new n90(k(), arrayList);
        this.D = n90Var;
        this.E.setAdapter(n90Var);
        this.D.u(this);
        if ((arrayList == null ? 0 : arrayList.size()) == 0) {
            this.q.setVisibility(0);
            this.E.setVisibility(8);
        } else {
            this.q.setVisibility(8);
            this.E.setVisibility(0);
        }
        this.F.setVisibility(8);
    }

    public final void y() {
        if (k() != null) {
            nd0 l = nd0.l();
            je n = k().D().n();
            n.f(l, C0059ao.a(10563));
            n.k();
        }
        n70.f.a().A(C0059ao.a(10564), true);
    }

    public final void z() {
        getActivity().getPackageManager().setComponentEnabledSetting(new ComponentName(getActivity(), IntentRegistrationActivity.class), 1, 1);
    }
}
