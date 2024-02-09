package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.BbpsHistory;
import com.olive.upi.transport.model.BillPaymentEnqRequst;
import com.olive.upi.transport.model.BillerCategory;
import com.olive.upi.transport.model.BillerCircle;
import com.olive.upi.transport.model.BillerField;
import com.olive.upi.transport.model.BillerForm;
import com.olive.upi.transport.model.Billers;
import com.olive.upi.transport.model.RegisterBiller;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import com.upi.axispay.custom.FloatingInputLayout;
import com.upi.axispay.custom.NonScrollListView;
import defpackage.n70;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ld0  reason: default package */
/* loaded from: classes.dex */
public class ld0 extends xc0 implements ng0, View.OnClickListener, ua0.e {
    public View l;
    public ViewPager m;
    public TabLayout n;
    public TransactionData o;
    public Button p;
    public LinearLayout q;
    public Billers r;
    public ia0 s;
    public NonScrollListView t;
    public TextView u;
    public wc0 v;
    public ViewPager w;
    public BillerCategory x;
    public BillerCircle y;
    public ga0 z;

    /* compiled from: AxisPay */
    /* renamed from: ld0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a(ld0 ld0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static ld0 A() {
        return new ld0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void y(View view) {
        eg0.c();
        this.b.o(11, null);
        this.b.t(21, null);
    }

    public static /* synthetic */ void z(View view) {
    }

    public final void B() {
        this.m = (ViewPager) this.l.findViewById(R.id.pager_list);
        this.n = (TabLayout) this.l.findViewById(R.id.pager_tab);
        this.p = (Button) this.l.findViewById(R.id.button_proceed);
        this.t = (NonScrollListView) this.l.findViewById(R.id.recycler_view);
        this.u = (TextView) this.l.findViewById(R.id.empty_view);
    }

    public final void C() {
        this.p.setOnClickListener(this);
    }

    public final void D() {
        ArrayList<BillerField> b = oa0.f().b();
        if (b == null) {
            return;
        }
        this.q.removeAllViews();
        Iterator<BillerField> it = b.iterator();
        while (it.hasNext()) {
            BillerField next = it.next();
            FloatingInputLayout floatingInputLayout = (FloatingInputLayout) LayoutInflater.from(getContext()).inflate(R.layout.floating_input, (ViewGroup) null);
            floatingInputLayout.getTextInputLayout().setHint(next.getFIELD_DESC());
            if (next.getFieldType() == 1) {
                floatingInputLayout.setRightText(R.string.change);
                floatingInputLayout.getRightText().setOnClickListener(new a(this));
                floatingInputLayout.setEnabled(false);
                floatingInputLayout.showRightText();
            } else if (next.getFieldType() == 5) {
                floatingInputLayout.setRightText(R.string.verify);
                floatingInputLayout.getRightText().setOnClickListener(new View.OnClickListener() { // from class: pb0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ld0.z(view);
                    }
                });
                floatingInputLayout.setEnabled(false);
                floatingInputLayout.showRightText();
            } else if (next.getFieldFormat() == 3) {
                floatingInputLayout.setInputType(5);
            } else if (next.getFieldFormat() != 1 && next.getFieldFormat() == 2) {
                floatingInputLayout.setInputType(1);
            }
            this.q.addView(floatingInputLayout);
        }
    }

    public final void E(ArrayList<BbpsHistory> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            ga0 ga0Var = this.z;
            if (ga0Var == null) {
                this.z = new ga0(k(), arrayList);
            } else {
                ga0Var.z(arrayList);
            }
            this.z.y(this);
            this.t.setAdapter(this.z);
            this.z.j();
            this.u.setVisibility(8);
            this.t.setVisibility(0);
            return;
        }
        this.t.setVisibility(8);
        this.u.setText(R.string.no_transaction_found);
        this.u.setVisibility(0);
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.button_proceed) {
            return;
        }
        RegisterBiller registerBiller = new RegisterBiller();
        registerBiller.setBILLER_CODE(this.r.getCORP_CODE());
        registerBiller.setCIF_ID(this.r.getCIF_ID());
        registerBiller.setMASTR_TYPE(this.r.getMASTR_TYPE());
        n70.a aVar = n70.f;
        registerBiller.setEMAIL(aVar.a().m(C0059ao.a(2808)));
        registerBiller.setMOB_NUM(aVar.a().m(C0059ao.a(2809)).substring(2));
        registerBiller.setIMEI(aVar.a().m(C0059ao.a(2810)));
        registerBiller.setIP(jg0.p(true));
        registerBiller.setLVL_CODE_ACTL(this.y.getCode());
        ArrayList<BillerField> b = oa0.f().b();
        Hashtable<String, String> fieldMapping = BillerField.getFieldMapping();
        Hashtable<String, String> fieldMapping2 = BillerField.getFieldMapping();
        if (b != null) {
            for (int i = 0; i < b.size(); i++) {
                BillerField billerField = b.get(i);
                if (!TextUtils.isEmpty(billerField.getFieldIdentifier())) {
                    String str = fieldMapping.get(billerField.getFieldIdentifier());
                    String text = ((FloatingInputLayout) this.q.getChildAt(i)).getText();
                    if (billerField.isMandatory() && TextUtils.isEmpty(text)) {
                        ((FloatingInputLayout) this.q.getChildAt(i)).showError(C0059ao.a(2811));
                        return;
                    } else {
                        registerBiller.setField(str, text);
                        fieldMapping2.put(str, text);
                    }
                }
            }
            String a2 = C0059ao.a(2812);
            registerBiller.setCUST_CIF(a2);
            registerBiller.setMOB_NUM(a2);
            registerBiller.setIMEI(C0059ao.a(2813));
            oa0.f().q(fieldMapping2);
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(103, 67, registerBiller));
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.r = oa0.f().h();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l = layoutInflater.inflate(R.layout.fragment_billpay_generic, viewGroup, false);
        getActivity();
        this.q = (LinearLayout) this.l.findViewById(R.id.billpay_input);
        B();
        C();
        wc0 C = wc0.C();
        this.v = C;
        C.w(getString(R.string.bill_pay_and_recharge));
        Bundle bundle2 = new Bundle();
        bundle2.putInt(C0059ao.a(2814), 103);
        this.v.setArguments(bundle2);
        je n = getChildFragmentManager().n();
        n.r(R.id.fragment_connection, this.v);
        t(this.v);
        n.j();
        ia0 ia0Var = new ia0(getChildFragmentManager());
        this.s = ia0Var;
        this.m.setAdapter(ia0Var);
        this.n.setupWithViewPager(this.m);
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            String code = result != null ? result.getCode() : C0059ao.a(2815);
            int requestType = oliveRequest.getRequestType();
            if (requestType != 45) {
                if (requestType != 67) {
                    eg0.B();
                } else {
                    eg0.m(k(), result.getResult());
                }
            } else if (code.equals(C0059ao.a(2816))) {
                eg0.m(k(), getString(R.string.transaction_failed_wrong_pin));
                return;
            } else if (code.equals(C0059ao.a(2817))) {
                eg0.B();
                eg0.o(k(), getString(R.string.alert), getString(R.string.transaction_failed_max_retry), getString(R.string.okay), new View.OnClickListener() { // from class: ob0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ld0.this.y(view);
                    }
                });
                return;
            } else {
                String lastTransactionId = OliveUpiManager.getInstance(k()).getLastTransactionId();
                this.o.setTransactionId(lastTransactionId);
                if (result.getData() != null) {
                    String obj = result.getData().toString();
                    this.o.setRefid(obj);
                    this.o.setApprovalRefNo(obj);
                } else {
                    this.o.setRefid(lastTransactionId);
                    this.o.setApprovalRefNo(lastTransactionId);
                }
                this.o.setTransactionId(lastTransactionId);
                this.o.setResponseCode(code);
                this.o.setTransactionDate(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(2818)));
                this.o.setTransactionStatus(1);
                qa0.v().u0(this.o);
                if (this.b == null) {
                    this.b = (MainActivity) getActivity();
                }
                eg0.B();
                this.b.t(24, null);
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(103, this.r.getNAME());
        super.onResume();
        ua0.e(k()).u(this);
        ViewPager viewPager = this.w;
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.w.getAdapter().j();
        }
        this.x = oa0.f().i();
        this.y = oa0.f().j();
        ua0.e(k()).q(new OliveRequest(103, 66, new BillerForm(this.x.getCODE_VAL(), this.r, this.y.getCode())));
        if (this.h) {
            BillPaymentEnqRequst billPaymentEnqRequst = new BillPaymentEnqRequst();
            billPaymentEnqRequst.CUST_CIF = this.r.getCIF_ID();
            billPaymentEnqRequst.MOB_NO = n70.f.a().m(C0059ao.a(2819)).substring(2);
            ua0.e(k()).q(new OliveRequest(103, 70, billPaymentEnqRequst));
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 46) {
            eg0.B();
            wc0 wc0Var = this.v;
            if (wc0Var != null) {
                wc0Var.H();
            }
        } else if (requestType == 70) {
            eg0.B();
            E((ArrayList) result.getData());
        } else if (requestType == 50) {
            eg0.B();
        } else if (requestType == 51) {
            eg0.B();
        } else if (requestType == 66) {
            eg0.B();
            D();
        } else if (requestType != 67) {
            if (this.g == oliveRequest.getInitiator()) {
                eg0.B();
            }
        } else {
            eg0.B();
            ArrayList arrayList = (ArrayList) result.getData();
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            this.b.t(124, arrayList.get(0));
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
    }
}
