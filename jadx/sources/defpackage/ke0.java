package defpackage;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.DeviceDetails;
import com.olive.upi.transport.model.IntentData;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.MandatesVo;
import com.olive.upi.transport.model.TransactionData;
import com.olive.upi.transport.model.UpdateMandate;
import com.olive.upi.transport.model.UpdateMandateRequest;
import com.upi.axispay.R;
import defpackage.n70;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ke0  reason: default package */
/* loaded from: classes.dex */
public class ke0 extends xc0 implements ng0 {
    public View l;
    public RecyclerView m;
    public TextView n;
    public MandateTransactionData p;
    public DeviceDetails q;
    public v90 r;
    public Bitmap t;
    public Bitmap u;
    public LayoutInflater v;
    public ViewGroup w;
    public ArrayList<MandatesVo> o = new ArrayList<>();
    public ArrayList<MandatesVo> s = new ArrayList<>();
    public int x = 106;

    /* compiled from: AxisPay */
    /* renamed from: ke0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ MandatesVo b;
        public final /* synthetic */ Dialog c;

        public a(MandatesVo mandatesVo, Dialog dialog) {
            this.b = mandatesVo;
            this.c = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            ke0.this.p.setTransactionMode(TransactionData.MODE_REVOKE_MANDATE);
            UpdateMandate updateMandate = new UpdateMandate();
            n70.a aVar = n70.f;
            n70 a = aVar.a();
            String a2 = C0059ao.a(14947);
            updateMandate.setCustomerid(a.m(a2));
            if (this.b.getUmn() != null) {
                updateMandate.setUmn(this.b.getUmn());
                ke0.this.p.setStartMandate(jg0.N(this.b.getValidity_start()));
                ke0.this.p.setEndmandate(jg0.N(this.b.getValidity_end()));
                ke0.this.p.setAmount(Double.valueOf(this.b.getAmount()));
                ke0.this.p.setRecurrence(this.b.getRecurrencePattern());
                ke0.this.p.setAccount(qa0.v().d(this.b.getPayerVpa()));
                ke0.this.p.setRemarks(this.b.getRemarks() != null ? this.b.getRemarks() : C0059ao.a(14948));
                updateMandate.setTxnid(c70.j());
                updateMandate.setDevice(ke0.this.q);
                String a3 = C0059ao.a(14949);
                updateMandate.setNewstate(a3);
                ke0.this.p.setPayerVpa(this.b.getPayeeVpa());
                ke0.this.p.setPayeeVpa(this.b.getPayerVpa());
                ke0.this.p.setAmount(Double.valueOf(this.b.getAmount()));
                ke0.this.p.setUmnID(this.b.getUmn());
                String payerMobile = this.b.getPayerMobile();
                String payeeMobile = this.b.getPayeeMobile();
                ke0.this.p.setPayeeName(this.b.getPayeeAccountName());
                this.c.hide();
                if (!TextUtils.isEmpty(payerMobile) && payerMobile.equals(aVar.a().m(a2)) && this.b.getInitiatedBy().equals(C0059ao.a(14950))) {
                    UpdateMandateRequest updateMandateRequest = new UpdateMandateRequest();
                    ke0.this.p.setPayerVpa(this.b.getPayerVpa());
                    ke0.this.p.setPayeeVpa(this.b.getPayeeVpa());
                    ke0.this.p.setAmount(Double.valueOf(this.b.getAmount()));
                    ke0.this.p.setPayeeName(this.b.getPayeeAccountName());
                    ke0.this.p.setTransactionId(c70.j());
                    ke0.this.p.setTransactionMode(13);
                    updateMandate.setNewstate(a3);
                    updateMandateRequest.setUpdateMandate(updateMandate);
                    OliveRequest oliveRequest = new OliveRequest(113, 576, ke0.this.p);
                    oliveRequest.setClMode(13);
                    ua0.d().q(oliveRequest);
                    return;
                } else if (!TextUtils.isEmpty(payeeMobile) && payeeMobile.equals(aVar.a().m(a2)) && this.b.getInitiatedBy().equals(C0059ao.a(14951))) {
                    ke0.this.p.setPayerVpa(this.b.getPayeeVpa());
                    ke0.this.p.setPayeeVpa(this.b.getPayerVpa());
                    ke0.this.p.setAmount(Double.valueOf(this.b.getAmount()));
                    ke0.this.p.setPayeeName(this.b.getPayerAccountName());
                    eg0.i(ke0.this.k());
                    UpdateMandateRequest updateMandateRequest2 = new UpdateMandateRequest();
                    updateMandateRequest2.setAppId(aVar.a().m(C0059ao.a(14952)));
                    updateMandateRequest2.setCustomerId(aVar.a().m(a2));
                    updateMandateRequest2.setUpdateMandate(updateMandate);
                    ua0.d().q(new OliveRequest(113, 76, updateMandateRequest2));
                    return;
                } else {
                    this.c.hide();
                    eg0.m(ke0.this.k(), C0059ao.a(14953));
                    return;
                }
            }
            this.c.hide();
            eg0.m(ke0.this.k(), C0059ao.a(14954));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ke0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public b(ke0 ke0Var, Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.hide();
        }
    }

    public final void A(ArrayList<MandatesVo> arrayList) {
        v90 v90Var = this.r;
        if (v90Var == null) {
            this.r = new v90(arrayList, getContext());
        } else {
            v90Var.z(arrayList);
        }
        this.r.y(this);
        RecyclerView recyclerView = this.m;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.r);
            this.r.j();
        }
    }

    public void B(ArrayList<MandatesVo> arrayList) {
        ArrayList<MandatesVo> arrayList2 = this.o;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList<MandatesVo> arrayList3 = new ArrayList<>(arrayList);
            this.s = arrayList3;
            if (arrayList3.size() > 0) {
                A(this.s);
                this.m.setVisibility(0);
                this.n.setVisibility(8);
                return;
            }
            this.m.setVisibility(8);
            this.n.setVisibility(0);
            return;
        }
        this.m.setVisibility(8);
        this.n.setVisibility(0);
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // defpackage.xc0
    public void m(int i) {
        super.m(i);
        if (i == this.x) {
            yg0.c(k(), this.u);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.v = layoutInflater;
        this.w = viewGroup;
        this.l = layoutInflater.inflate(R.layout.fragment_my_mandates_active, viewGroup, false);
        this.p = qa0.v().z();
        this.q = c70.d(getContext());
        TextView textView = (TextView) this.l.findViewById(R.id.empty_view);
        this.n = textView;
        textView.setText(C0059ao.a(6495));
        RecyclerView recyclerView = (RecyclerView) this.l.findViewById(R.id.active_mandate_list);
        this.m = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(k()));
        return this.l;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        MandatesVo mandatesVo = (MandatesVo) obj;
        BeneVpa beneVpa = new BeneVpa();
        this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
        this.p.setStartMandate(mandatesVo.getValidity_start());
        this.p.setEndmandate(mandatesVo.getValidity_end());
        this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
        MandateTransactionData mandateTransactionData = this.p;
        String remarks = mandatesVo.getRemarks();
        String a2 = C0059ao.a(6496);
        mandateTransactionData.setRemarks(remarks != null ? mandatesVo.getRemarks() : a2);
        this.p.setOccurence(mandatesVo.getRecurrencePattern());
        this.p.setUmnID(mandatesVo.getUmn());
        this.p.setTransactionId(mandatesVo.getTxnid());
        beneVpa.setVpa(mandatesVo.getPayeeVpa());
        beneVpa.setName(mandatesVo.getPayeeAccountName());
        this.p.setPayeeName(mandatesVo.getPayeeVpa());
        this.p.setBeneVpa(beneVpa);
        this.p.setAmountRule(mandatesVo.getAmountRule());
        qa0.v().h0(this.p);
        new UpdateMandate();
        if (i == R.id.button_cancel) {
            Dialog dialog = new Dialog(k(), R.style.Theme_Dialog);
            dialog.getWindow().requestFeature(1);
            dialog.setContentView(R.layout.dialog_mandate_reuest_success);
            dialog.getWindow().setLayout(-1, -2);
            Button button = (Button) dialog.findViewById(R.id.button_ok);
            ((TextView) dialog.findViewById(R.id.dialog_message)).setText(getString(R.string.my_mandate_cancel_dialog_text));
            ImageView imageView = (ImageView) dialog.findViewById(R.id.dialog_icon);
            imageView.setImageResource(R.drawable.error_icon_grey);
            imageView.setColorFilter(t8.d(k(), R.color.colorPrimaryDark));
            dialog.setCancelable(true);
            dialog.show();
            button.setText(C0059ao.a(6504));
            button.setAllCaps(false);
            button.setOnClickListener(new a(mandatesVo, dialog));
            ((ImageView) dialog.findViewById(R.id.dialog_close)).setOnClickListener(new b(this, dialog));
            return;
        }
        String a3 = C0059ao.a(6497);
        if (i != R.id.button_modify) {
            if (i != R.id.share_qr) {
                return;
            }
            try {
                String encodeToString = Base64.encodeToString(ig0.a(qa0.v().z()).getBytes(C0059ao.a(6498)), 2);
                IntentData intentData = new IntentData();
                n70.a aVar = n70.f;
                intentData.setAppId(aVar.a().m(C0059ao.a(6499)));
                intentData.setCustomerId(aVar.a().m(a3));
                intentData.setData(encodeToString);
                intentData.setIntentData(encodeToString);
                eg0.i(getActivity());
                ua0.d().q(new OliveRequest(113, 83, intentData));
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        this.p.setStartMandate(jg0.N(mandatesVo.getValidity_start()));
        this.p.setEndmandate(jg0.N(mandatesVo.getValidity_end()));
        this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
        MandateTransactionData mandateTransactionData2 = this.p;
        if (mandatesVo.getRemarks() != null) {
            a2 = mandatesVo.getRemarks();
        }
        mandateTransactionData2.setRemarks(a2);
        this.p.setRecurrence(mandatesVo.getRecurrencePattern());
        this.p.setSharetoPayee(mandatesVo.getShareToPayee());
        this.p.setPayerVpa(mandatesVo.getPayerVpa());
        String payerMobile = mandatesVo.getPayerMobile();
        String payeeMobile = mandatesVo.getPayeeMobile();
        if (!TextUtils.isEmpty(payerMobile) && payerMobile.equals(n70.f.a().m(a3)) && mandatesVo.getInitiatedBy().equals(C0059ao.a(6500))) {
            this.p.setTransactionMode(TransactionData.MODE_PAYER_UPDATE_MANDATE);
            this.p.setTransactionId(c70.j());
            this.p.setPayeeName(mandatesVo.getPayeeAccountName());
            this.p.setPayeeVpa(mandatesVo.getPayeeVpa());
            this.p.setUmnID(mandatesVo.getUmn());
            this.b.t(106, 3);
        } else if (!TextUtils.isEmpty(payeeMobile) && payeeMobile.equals(n70.f.a().m(a3)) && mandatesVo.getInitiatedBy().equals(C0059ao.a(6501))) {
            this.p.setTransactionMode(TransactionData.MODE_PAYEE_UPDATE_MANDATE);
            this.p.setTransactionId(c70.j());
            this.p.setUmnID(mandatesVo.getUmn());
            this.p.setPayeeName(mandatesVo.getPayerAccountName());
            this.p.setPayeeVpa(mandatesVo.getPayerVpa());
            if (mandatesVo.getUmn() != null) {
                this.p.setUmnID(mandatesVo.getUmn());
                this.b.t(106, 3);
                return;
            }
            eg0.m(k(), C0059ao.a(6502));
        } else {
            eg0.m(k(), C0059ao.a(6503));
        }
    }

    public final void x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout_mandate_share, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.outer_layout);
        ((ImageView) inflate.findViewById(R.id.img_qr_code)).setImageBitmap(this.t);
        inflate.setDrawingCacheEnabled(true);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        k().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        inflate.buildDrawingCache(true);
        this.u = Bitmap.createBitmap(inflate.getDrawingCache());
        inflate.setDrawingCacheEnabled(false);
    }

    public void y(ArrayList<MandatesVo> arrayList) {
        this.o = arrayList;
    }

    public void z(String str) {
        try {
            this.t = jg0.e(str, k(), 250);
            x(this.v, this.w);
            yg0.c(k(), this.u);
        } catch (Exception unused) {
        }
    }
}
