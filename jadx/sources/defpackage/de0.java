package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.DeviceDetails;
import com.olive.upi.transport.model.MandateExecute;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.PayerInfo;
import com.olive.upi.transport.model.TransactionData;
import com.olive.upi.transport.model.UpdateMandate;
import com.olive.upi.transport.model.UpdateMandateRequest;
import com.olive.upi.transport.model.VpaVerify;
import com.upi.axispay.R;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: de0  reason: default package */
/* loaded from: classes.dex */
public class de0 extends xc0 implements View.OnClickListener, ua0.e {
    public static de0 A;
    public View l;
    public MandateTransactionData m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public LinearLayout w;
    public LinearLayout x;
    public LinearLayout y;
    public DeviceDetails z;

    /* compiled from: AxisPay */
    /* renamed from: de0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ Dialog i;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Dialog dialog) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            int transactionMode = de0.this.m.getTransactionMode();
            int i = TransactionData.MODE_MANDATE_DECLINE;
            String a = C0059ao.a(972);
            if (transactionMode == i) {
                UpdateMandate updateMandate = new UpdateMandate();
                n70.a aVar = n70.f;
                updateMandate.setCustomerid(aVar.a().m(a));
                updateMandate.setTxnid(c70.j());
                updateMandate.setDevice(de0.this.z);
                updateMandate.setNewstate(C0059ao.a(973));
                updateMandate.setUmn(this.b);
                eg0.c();
                eg0.i(de0.this.getActivity());
                UpdateMandateRequest updateMandateRequest = new UpdateMandateRequest();
                updateMandateRequest.setAppId(aVar.a().m(C0059ao.a(974)));
                updateMandateRequest.setCustomerId(aVar.a().m(a));
                updateMandateRequest.setUpdateMandate(updateMandate);
                ua0.d().q(new OliveRequest(131, 76, updateMandateRequest));
            } else {
                MandateExecute mandateExecute = new MandateExecute();
                mandateExecute.setCustomerid(n70.f.a().m(a));
                mandateExecute.setUmn(this.b);
                mandateExecute.setExecute(this.c);
                mandateExecute.setAmount(jg0.B(this.d));
                mandateExecute.setAmountrule(this.e);
                mandateExecute.setValiditystart(this.f);
                mandateExecute.setValidityend(this.g);
                String str = this.h;
                if (str == null) {
                    str = C0059ao.a(975);
                }
                mandateExecute.setRemarks(str);
                eg0.i(de0.this.getActivity());
                ua0.d().q(new OliveRequest(131, 82, mandateExecute));
            }
            this.i.hide();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: de0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public b(de0 de0Var, Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.hide();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: de0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            de0.this.b.o(11, null);
            de0 de0Var = de0.this;
            de0Var.b.t(118, de0Var.m.getAccount());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: de0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            de0.this.m.setTransactionId(null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: de0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            de0.this.b.o(306, 1);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: de0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            de0.this.b.o(11, null);
            de0.this.b.t(21, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: de0$g */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            de0.this.b.o(306, 1);
        }
    }

    public static de0 y() {
        if (A == null) {
            A = new de0();
        }
        return A;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        String a2 = C0059ao.a(13470);
        if (id == R.id.button_decline) {
            this.m.setTransactionMode(TransactionData.MODE_MANDATE_DECLINE);
            MandateTransactionData mandateTransactionData = this.m;
            mandateTransactionData.setStartMandate(jg0.N(mandateTransactionData.getStartMandate()));
            MandateTransactionData mandateTransactionData2 = this.m;
            mandateTransactionData2.setEndmandate(jg0.N(mandateTransactionData2.getEndmandate()));
            MandateTransactionData mandateTransactionData3 = this.m;
            mandateTransactionData3.setAmount(Double.valueOf(mandateTransactionData3.getAmount().doubleValue()));
            MandateTransactionData mandateTransactionData4 = this.m;
            mandateTransactionData4.setRecurrence(mandateTransactionData4.getOccurence());
            MandateTransactionData mandateTransactionData5 = this.m;
            if (mandateTransactionData5.getRemarks() != null) {
                a2 = this.m.getRemarks();
            }
            mandateTransactionData5.setRemarks(a2);
            MandateTransactionData mandateTransactionData6 = this.m;
            mandateTransactionData6.setPayeeVpa(mandateTransactionData6.getBeneVpa().getVpa());
            MandateTransactionData mandateTransactionData7 = this.m;
            mandateTransactionData7.setPayeeName(mandateTransactionData7.getBeneVpa().getName());
            x(R.drawable.error_icon_grey, getString(R.string.decline_execute_alert_msg), C0059ao.a(13472), this.m.getUmnID(), String.valueOf(this.m.getAmount()), this.m.getAmountRule(), this.m.getStartMandate(), this.m.getEndmandate(), this.m.getRemarks());
        } else if (id != R.id.button_execute) {
        } else {
            this.m.setTransactionMode(TransactionData.MODE_MANDATE_EXECUTE);
            MandateTransactionData mandateTransactionData8 = this.m;
            mandateTransactionData8.setStartMandate(jg0.N(mandateTransactionData8.getStartMandate()));
            MandateTransactionData mandateTransactionData9 = this.m;
            mandateTransactionData9.setEndmandate(jg0.N(mandateTransactionData9.getEndmandate()));
            MandateTransactionData mandateTransactionData10 = this.m;
            mandateTransactionData10.setAmount(Double.valueOf(mandateTransactionData10.getAmount().doubleValue()));
            MandateTransactionData mandateTransactionData11 = this.m;
            mandateTransactionData11.setRecurrence(mandateTransactionData11.getOccurence());
            MandateTransactionData mandateTransactionData12 = this.m;
            if (mandateTransactionData12.getRemarks() != null) {
                a2 = this.m.getRemarks();
            }
            mandateTransactionData12.setRemarks(a2);
            MandateTransactionData mandateTransactionData13 = this.m;
            mandateTransactionData13.setPayeeVpa(mandateTransactionData13.getBeneVpa().getVpa());
            MandateTransactionData mandateTransactionData14 = this.m;
            mandateTransactionData14.setPayeeName(mandateTransactionData14.getBeneVpa().getName());
            x(R.drawable.error_icon_grey, getString(R.string.execute_alert_msg), C0059ao.a(13471), this.m.getUmnID(), String.valueOf(this.m.getAmount()), this.m.getAmountRule(), this.m.getStartMandate(), this.m.getEndmandate(), this.m.getRemarks());
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l = layoutInflater.inflate(R.layout.mandate_scan_execute, viewGroup, false);
        ua0.e(k()).u(this);
        this.z = c70.d(getContext());
        z();
        this.w.setOnClickListener(this);
        this.x.setOnClickListener(this);
        MandateTransactionData z = qa0.v().z();
        this.m = z;
        if (z != null) {
            BeneVpa beneVpa = z.getBeneVpa();
            if (beneVpa != null) {
                String vpa = beneVpa.getVpa();
                if (!TextUtils.isEmpty(vpa) && !vpa.endsWith(C0059ao.a(13473)) && !vpa.endsWith(C0059ao.a(13474))) {
                    VpaVerify vpaVerify = new VpaVerify();
                    vpaVerify.setCustomerid(n70.f.a().m(C0059ao.a(13475)));
                    vpaVerify.setVpa(vpa);
                    vpaVerify.setDevice(c70.d(k()));
                    PayerInfo payerInfo = new PayerInfo();
                    ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
                    if (h != null) {
                        payerInfo.setPayervpa(h.get(0).getVpa());
                        payerInfo.setAccountnumber(h.get(0).getAccRefNumber());
                        payerInfo.setName(h.get(0).getName());
                        payerInfo.setMcc(C0059ao.a(13476));
                    }
                    vpaVerify.setPayerInfo(payerInfo);
                    eg0.i(k());
                    ua0.d().q(new OliveRequest(131, 79, vpaVerify));
                    this.n.setText(this.m.getBeneVpa().getVpa().substring(0, 2));
                    this.o.setText(this.m.getBeneVpa().getVpa());
                }
            }
            this.y.setVisibility(0);
            this.p.setText(this.m.getBeneVpa().getName());
            this.r.setText(jg0.b(String.valueOf(this.m.getAmount())));
            this.s.setText(this.m.getUmnID());
            this.t.setText(jg0.N(this.m.getStartMandate()));
            this.u.setText(jg0.N(this.m.getEndmandate()));
            this.v.setText(this.m.getOccurence() != null ? this.m.getOccurence() : C0059ao.a(13477));
            new SimpleDateFormat(C0059ao.a(13478));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0059ao.a(13479));
            try {
                this.q.setText(new SimpleDateFormat(C0059ao.a(13480)).format(simpleDateFormat.parse(this.m.getStartMandate())));
            } catch (Exception unused) {
            }
        }
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (n(oliveRequest, result)) {
            return;
        }
        int requestType = oliveRequest.getRequestType();
        String a2 = C0059ao.a(13481);
        if (requestType != 76) {
            if (requestType == 79) {
                eg0.B();
                eg0.m(getActivity(), C0059ao.a(13482));
                k().onBackPressed();
                return;
            } else if (requestType != 82) {
                return;
            } else {
                this.m.setTransactionStatus(1);
                this.m.setRefid((String) result.getData());
                MandateTransactionData mandateTransactionData = this.m;
                if (!TextUtils.isEmpty(mandateTransactionData.getUmnID())) {
                    a2 = this.m.getUmnID();
                }
                mandateTransactionData.setUmnID(a2);
                this.m.setResult(result.getResult());
                qa0.v().h0(this.m);
                this.b.t(110, null);
                return;
            }
        }
        this.m.setTransactionStatus(1);
        this.m.setRefid((String) result.getData());
        MandateTransactionData mandateTransactionData2 = this.m;
        if (!TextUtils.isEmpty(mandateTransactionData2.getUmnID())) {
            a2 = this.m.getUmnID();
        }
        mandateTransactionData2.setUmnID(a2);
        this.m.setResult(result.getResult());
        qa0.v().h0(this.m);
        if (result.getCode().equals(C0059ao.a(13483))) {
            eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.fail_text), C0059ao.a(13484).toUpperCase(), new c(), C0059ao.a(13485).toUpperCase(), new d(), true);
        } else if (result.getCode().equals(C0059ao.a(13486))) {
            eg0.B();
            eg0.o(k(), C0059ao.a(13487), C0059ao.a(13488), C0059ao.a(13489), new e());
        } else if (result.getCode().equals(C0059ao.a(13490))) {
            eg0.B();
            eg0.s(k(), getString(R.string.transaction_fail), getString(R.string.insufficient_text), C0059ao.a(13491).toUpperCase(), new f(), C0059ao.a(13492), new g(), true);
        } else {
            this.b.t(110, null);
        }
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(131, C0059ao.a(13493));
        super.onResume();
        ua0.e(k()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        int requestType = oliveRequest.getRequestType();
        String a2 = C0059ao.a(13494);
        String a3 = C0059ao.a(13495);
        if (requestType == 76) {
            if (result.getCode().equals(a3)) {
                this.m.setTransactionStatus(10);
                this.m.setRefid((String) result.getData());
                MandateTransactionData mandateTransactionData = this.m;
                if (!TextUtils.isEmpty(mandateTransactionData.getUmnID())) {
                    a2 = this.m.getUmnID();
                }
                mandateTransactionData.setUmnID(a2);
                qa0.v().h0(this.m);
                this.b.t(110, null);
            }
        } else if (requestType != 79) {
            if (requestType == 82 && result.getCode().equals(a3)) {
                this.m.setTransactionStatus(10);
                this.m.setRefid((String) result.getData());
                MandateTransactionData mandateTransactionData2 = this.m;
                if (!TextUtils.isEmpty(mandateTransactionData2.getUmnID())) {
                    a2 = this.m.getUmnID();
                }
                mandateTransactionData2.setUmnID(a2);
                qa0.v().h0(this.m);
                this.b.t(110, null);
            }
        } else {
            eg0.B();
            String str = (String) result.getData();
            this.m.getBeneVpa().setName(str);
            this.n.setText(jg0.t(str, this.m.getBeneVpa().getVpa()));
            this.p.setText(str);
        }
    }

    public void x(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Dialog dialog = new Dialog(k(), R.style.Theme_Dialog);
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(R.layout.dialog_mandate_reuest_success);
        dialog.getWindow().setLayout(-1, -2);
        Button button = (Button) dialog.findViewById(R.id.button_ok);
        ImageView imageView = (ImageView) dialog.findViewById(R.id.dialog_close);
        ((TextView) dialog.findViewById(R.id.dialog_message)).setText(str);
        ImageView imageView2 = (ImageView) dialog.findViewById(R.id.dialog_icon);
        imageView2.setImageResource(i);
        imageView2.setColorFilter(t8.d(k(), R.color.colorPrimaryDark));
        dialog.setCancelable(true);
        dialog.show();
        button.setText(C0059ao.a(13496));
        button.setOnClickListener(new a(str3, str2, str4, str5, str6, str7, str8, dialog));
        imageView.setOnClickListener(new b(this, dialog));
    }

    public void z() {
        this.n = (TextView) this.l.findViewById(R.id.image_items);
        this.o = (TextView) this.l.findViewById(R.id.text_id);
        this.p = (TextView) this.l.findViewById(R.id.text_name);
        this.q = (TextView) this.l.findViewById(R.id.text_date);
        this.r = (TextView) this.l.findViewById(R.id.text_amount);
        this.s = (TextView) this.l.findViewById(R.id.text_umn_id);
        this.t = (TextView) this.l.findViewById(R.id.start_date);
        this.u = (TextView) this.l.findViewById(R.id.end_date);
        this.v = (TextView) this.l.findViewById(R.id.text_frequency);
        this.w = (LinearLayout) this.l.findViewById(R.id.button_decline);
        this.x = (LinearLayout) this.l.findViewById(R.id.button_execute);
        this.y = (LinearLayout) this.l.findViewById(R.id.layout_buttons);
    }
}
