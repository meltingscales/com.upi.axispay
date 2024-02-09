package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.AuthorizeMandateRequest;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.PayRequest;
import com.olive.upi.transport.model.Payee;
import com.olive.upi.transport.model.PayerInfo;
import com.olive.upi.transport.model.VpaVerify;
import com.upi.axispay.R;
import defpackage.qa0;
import defpackage.ua0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ce0  reason: default package */
/* loaded from: classes.dex */
public class ce0 extends xc0 implements View.OnClickListener, ua0.e {
    public static ce0 z;
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
    public LinearLayout v;
    public LinearLayout w;
    public LinearLayout x;
    public AuthorizeMandateRequest y;

    /* compiled from: AxisPay */
    /* renamed from: ce0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public a(Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArrayList<Account> h = qa0.v().h(qa0.c.ALL);
            if (h != null && h.size() > 0) {
                ce0.this.m.setAccount(h.get(0));
                Payee payee = new Payee();
                payee.setBeneVpa(ce0.this.m.getBeneVpa().getVpa());
                payee.setBamount(String.valueOf(ce0.this.m.getAmount()));
                ce0.this.m.setPayeeData(payee);
                BeneVpa beneVpa = new BeneVpa();
                beneVpa.setVpa(ce0.this.m.getBeneVpa().getVpa());
                ce0.this.m.setBeneVpa(beneVpa);
                MandateTransactionData mandateTransactionData = ce0.this.m;
                mandateTransactionData.setAmount(Double.valueOf(mandateTransactionData.getAmount().doubleValue()));
                ce0.this.m.setRemarks(TextUtils.isEmpty(ce0.this.m.getRemarks()) ? C0059ao.a(9606) : ce0.this.m.getRemarks());
                this.b.hide();
                eg0.i(ce0.this.k());
                OliveRequest oliveRequest = new OliveRequest(132, 510, ce0.this.m);
                oliveRequest.setClMode(11);
                ua0.d().q(oliveRequest);
                return;
            }
            this.b.hide();
            eg0.m(ce0.this.k(), C0059ao.a(9607));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ce0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public b(ce0 ce0Var, Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.hide();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ce0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public c(ce0 ce0Var, Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void C(Dialog dialog, View view) {
        dialog.hide();
        k().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void F(Dialog dialog, AuthorizeMandateRequest authorizeMandateRequest, View view) {
        dialog.dismiss();
        eg0.i(k());
        ua0.d().q(new OliveRequest(132, 77, authorizeMandateRequest));
    }

    public static ce0 G() {
        if (z == null) {
            z = new ce0();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void A(Dialog dialog, View view) {
        eg0.c();
        dialog.hide();
        k().onBackPressed();
    }

    public void H() {
        this.n = (TextView) this.l.findViewById(R.id.image_items);
        this.o = (TextView) this.l.findViewById(R.id.text_id);
        this.p = (TextView) this.l.findViewById(R.id.text_name);
        this.q = (TextView) this.l.findViewById(R.id.text_date);
        this.r = (TextView) this.l.findViewById(R.id.text_amount);
        TextView textView = (TextView) this.l.findViewById(R.id.text_umn_id);
        this.s = (TextView) this.l.findViewById(R.id.start_date);
        this.t = (TextView) this.l.findViewById(R.id.end_date);
        this.u = (TextView) this.l.findViewById(R.id.text_frequency);
        this.x = (LinearLayout) this.l.findViewById(R.id.button_approve1);
        this.v = (LinearLayout) this.l.findViewById(R.id.button_block1);
        this.w = (LinearLayout) this.l.findViewById(R.id.button_decline1);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.button_approve1) {
            if (id == R.id.button_block1) {
                this.y.setAction(C0059ao.a(14362));
                eg0.i(k());
                ua0.d().q(new OliveRequest(132, 77, this.y));
                return;
            } else if (id != R.id.button_decline1) {
                return;
            } else {
                this.y.setAction(C0059ao.a(14361));
                y(this.y);
                return;
            }
        }
        Dialog dialog = new Dialog(k(), R.style.Theme_Dialog);
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(R.layout.dialog_mandate_reuest_success);
        dialog.getWindow().setLayout(-1, -2);
        Button button = (Button) dialog.findViewById(R.id.button_ok);
        ((TextView) dialog.findViewById(R.id.dialog_message)).setText(getString(R.string.accept_alert_msg));
        ((ImageView) dialog.findViewById(R.id.dialog_icon)).setImageResource(R.drawable.information_symble);
        dialog.setCancelable(true);
        dialog.show();
        button.setText(getString(R.string.proceed));
        button.setAllCaps(false);
        button.setOnClickListener(new a(dialog));
        ((ImageView) dialog.findViewById(R.id.dialog_close)).setOnClickListener(new b(this, dialog));
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        PayRequest payRequest = (PayRequest) obj;
        if (i != 11) {
            return;
        }
        this.y = new AuthorizeMandateRequest();
        eg0.i(k());
        this.y.setCustomerid(payRequest.getCustomerId());
        this.y.setTxnid(payRequest.getTxnId());
        this.y.setUmn(c70.k());
        this.y.setDevice(payRequest.getDevice());
        this.y.setAction(C0059ao.a(14363));
        this.y.setAccount(payRequest.getAc());
        this.y.setCreds(payRequest.getCred());
        ua0.d().q(new OliveRequest(132, 77, this.y));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Date date;
        this.l = layoutInflater.inflate(R.layout.mandate_scan_create, viewGroup, false);
        H();
        ua0.e(k()).u(this);
        this.v.setOnClickListener(this);
        this.w.setOnClickListener(this);
        this.x.setOnClickListener(this);
        MandateTransactionData z2 = qa0.v().z();
        this.m = z2;
        String a2 = C0059ao.a(14364);
        if (z2 != null) {
            BeneVpa beneVpa = z2.getBeneVpa();
            if (beneVpa != null) {
                String vpa = beneVpa.getVpa();
                if (!TextUtils.isEmpty(vpa) && !vpa.endsWith(C0059ao.a(14365)) && !vpa.endsWith(C0059ao.a(14366))) {
                    VpaVerify vpaVerify = new VpaVerify();
                    vpaVerify.setCustomerid(n70.f.a().m(a2));
                    vpaVerify.setVpa(vpa);
                    vpaVerify.setDevice(c70.d(k()));
                    PayerInfo payerInfo = new PayerInfo();
                    ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
                    if (h != null) {
                        payerInfo.setPayervpa(h.get(0).getVpa());
                        payerInfo.setAccountnumber(h.get(0).getAccRefNumber());
                        payerInfo.setName(h.get(0).getName());
                        payerInfo.setMcc(C0059ao.a(14367));
                    }
                    vpaVerify.setPayerInfo(payerInfo);
                    eg0.i(k());
                    ua0.d().q(new OliveRequest(132, 79, vpaVerify));
                    this.n.setText(this.m.getBeneVpa().getVpa().substring(0, 2));
                    this.o.setText(this.m.getBeneVpa().getVpa());
                }
            }
            this.p.setText(this.m.getRemarks());
            this.r.setText(jg0.b(String.valueOf(this.m.getAmount())));
            this.s.setText(this.m.getStartMandate());
            this.t.setText(this.m.getEndmandate());
            this.u.setText(this.m.getOccurence());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0059ao.a(14368));
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(C0059ao.a(14369));
            try {
                date = simpleDateFormat.parse(this.m.getStartMandate());
            } catch (ParseException unused) {
                date = null;
            }
            this.q.setText(simpleDateFormat2.format(date));
        }
        ArrayList<Account> h2 = qa0.v().h(qa0.c.ALL);
        this.y = new AuthorizeMandateRequest();
        if (h2 != null && h2.size() > 0) {
            this.y.setAccount(h2.get(0));
            this.y.setCustomerid(n70.f.a().m(a2));
            this.y.setTxnid(this.m.getTransactionId());
            this.y.setUmn(c70.k());
            this.y.setDevice(c70.d(k()));
        } else {
            ua0.d().b(false, new OliveRequest(21, 15, null));
            eg0.m(k(), C0059ao.a(14370));
        }
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (n(oliveRequest, result) || oliveRequest.getRequestType() != 79) {
            return;
        }
        eg0.B();
        eg0.m(getActivity(), getString(R.string.invalid_upi_id));
        k().onBackPressed();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(132, C0059ao.a(14371));
        super.onResume();
        ua0.e(k()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        int requestType = oliveRequest.getRequestType();
        if (requestType == 15) {
            eg0.B();
            if (((ArrayList) result.getData()) != null) {
                this.y.setAccount(qa0.v().h(qa0.c.WITH_VPA).get(0));
                this.y.setCustomerid(n70.f.a().m(C0059ao.a(14374)));
                this.y.setTxnid(this.m.getTransactionId());
                this.y.setUmn(c70.k());
                this.y.setDevice(c70.d(k()));
            }
        } else if (requestType != 77) {
            if (requestType != 79) {
                return;
            }
            eg0.B();
            this.m.getBeneVpa().setName((String) result.getData());
        } else {
            eg0.B();
            if (result.getResult().equals(C0059ao.a(14372))) {
                x(R.drawable.cancelled, getString(R.string.the_mandate_request_has_been_n_declined));
            } else if (result.getResult().equals(C0059ao.a(14373))) {
                x(R.drawable.cancelled, getString(R.string.the_mandate_request_has_been_n_blocked));
            } else {
                x(R.drawable.mandate_success, getString(R.string.you_have_accepted_the_mandate_request_successfully));
            }
        }
    }

    public void x(int i, String str) {
        final Dialog dialog = new Dialog(k(), R.style.Theme_Dialog);
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(R.layout.dialog_mandate_reuest_success);
        dialog.getWindow().setLayout(-1, -2);
        ((TextView) dialog.findViewById(R.id.dialog_message)).setText(str);
        ((ImageView) dialog.findViewById(R.id.dialog_icon)).setImageResource(i);
        dialog.setCancelable(true);
        dialog.show();
        ((Button) dialog.findViewById(R.id.button_ok)).setOnClickListener(new View.OnClickListener() { // from class: fc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ce0.this.A(dialog, view);
            }
        });
        ((ImageView) dialog.findViewById(R.id.dialog_close)).setOnClickListener(new View.OnClickListener() { // from class: hc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ce0.this.C(dialog, view);
            }
        });
    }

    public void y(final AuthorizeMandateRequest authorizeMandateRequest) {
        final Dialog dialog = new Dialog(k(), R.style.Theme_Dialog);
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(R.layout.dialog_man_decline);
        dialog.getWindow().setLayout(-1, -2);
        EditText editText = (EditText) dialog.findViewById(R.id.edit_description);
        dialog.setCancelable(true);
        dialog.show();
        ((Button) dialog.findViewById(R.id.button_no)).setOnClickListener(new View.OnClickListener() { // from class: ic0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.cancel();
            }
        });
        ((Button) dialog.findViewById(R.id.button_yes)).setOnClickListener(new View.OnClickListener() { // from class: gc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ce0.this.F(dialog, authorizeMandateRequest, view);
            }
        });
        ((ImageView) dialog.findViewById(R.id.dialog_close)).setOnClickListener(new c(this, dialog));
    }
}
