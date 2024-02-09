package defpackage;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.olive.upi.transport.model.MandateExecute;
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
/* renamed from: oe0  reason: default package */
/* loaded from: classes.dex */
public class oe0 extends xc0 implements ng0 {
    public View l;
    public RecyclerView m;
    public TextView n;
    public MandateTransactionData p;
    public DeviceDetails q;
    public w90 r;
    public Bitmap t;
    public Bitmap u;
    public LayoutInflater v;
    public ViewGroup w;
    public ArrayList<MandatesVo> o = new ArrayList<>();
    public ArrayList<MandatesVo> s = new ArrayList<>();
    public BeneVpa x = new BeneVpa();

    /* compiled from: AxisPay */
    /* renamed from: oe0$a */
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
            int transactionMode = oe0.this.p.getTransactionMode();
            int i = TransactionData.MODE_MANDATE_DECLINE;
            String a = C0059ao.a(5964);
            if (transactionMode == i) {
                UpdateMandate updateMandate = new UpdateMandate();
                n70.a aVar = n70.f;
                updateMandate.setCustomerid(aVar.a().m(a));
                updateMandate.setTxnid(c70.j());
                updateMandate.setDevice(oe0.this.q);
                updateMandate.setNewstate(C0059ao.a(5965));
                updateMandate.setUmn(this.b);
                eg0.i(oe0.this.k());
                UpdateMandateRequest updateMandateRequest = new UpdateMandateRequest();
                updateMandateRequest.setAppId(aVar.a().m(C0059ao.a(5966)));
                updateMandateRequest.setCustomerId(aVar.a().m(a));
                updateMandateRequest.setUpdateMandate(updateMandate);
                ua0.d().q(new OliveRequest(113, 76, updateMandateRequest));
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
                    str = C0059ao.a(5967);
                }
                mandateExecute.setRemarks(str);
                eg0.i(oe0.this.k());
                ua0.d().q(new OliveRequest(113, 82, mandateExecute));
            }
            this.i.hide();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: oe0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public b(oe0 oe0Var, Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.hide();
        }
    }

    public void A() {
        if (this.s.size() > 0) {
            this.m.setVisibility(0);
            this.n.setVisibility(8);
            return;
        }
        this.m.setVisibility(8);
        this.n.setVisibility(0);
    }

    public final void B(ArrayList<MandatesVo> arrayList) {
        w90 w90Var = this.r;
        if (w90Var == null) {
            this.r = new w90(arrayList);
        } else {
            w90Var.z(arrayList);
        }
        this.r.y(this);
        this.m.setAdapter(this.r);
        this.r.j();
    }

    public void C(ArrayList<MandatesVo> arrayList) {
        ArrayList<MandatesVo> arrayList2 = this.o;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList<MandatesVo> arrayList3 = new ArrayList<>(arrayList);
            this.s = arrayList3;
            if (arrayList3.size() > 0) {
                B(this.s);
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

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.v = layoutInflater;
        this.w = viewGroup;
        this.l = layoutInflater.inflate(R.layout.fragment_my_mandates_active, viewGroup, false);
        this.p = qa0.v().z();
        this.q = c70.d(getContext());
        TextView textView = (TextView) this.l.findViewById(R.id.empty_view);
        this.n = textView;
        textView.setText(C0059ao.a(13497));
        RecyclerView recyclerView = (RecyclerView) this.l.findViewById(R.id.active_mandate_list);
        this.m = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(k()));
        return this.l;
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        A();
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        MandatesVo mandatesVo = (MandatesVo) obj;
        this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
        this.p.setStartMandate(jg0.N(mandatesVo.getValidity_start()));
        this.p.setEndmandate(jg0.N(mandatesVo.getValidity_end()));
        this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
        MandateTransactionData mandateTransactionData = this.p;
        String remarks = mandatesVo.getRemarks();
        String a2 = C0059ao.a(13498);
        mandateTransactionData.setRemarks(remarks != null ? mandatesVo.getRemarks() : a2);
        this.p.setOccurence(mandatesVo.getRecurrencePattern());
        this.p.setUmnID(mandatesVo.getUmn());
        this.p.setTransactionId(mandatesVo.getTxnid());
        this.x.setVpa(mandatesVo.getPayeeVpa());
        this.x.setName(mandatesVo.getPayeeAccountName());
        this.p.setPayeeName(mandatesVo.getPayeeVpa());
        this.p.setBeneVpa(this.x);
        this.p.setAmountRule(mandatesVo.getAmountRule());
        qa0.v().h0(this.p);
        new UpdateMandate();
        String a3 = C0059ao.a(13499);
        String a4 = C0059ao.a(13500);
        String a5 = C0059ao.a(13501);
        if (i == R.id.button_decline) {
            x(R.drawable.error_icon_grey, getString(R.string.decline_execute_alert_msg), C0059ao.a(13503), mandatesVo.getUmn(), mandatesVo.getAmount(), mandatesVo.getAmountRule(), mandatesVo.validity_start, mandatesVo.getValidity_end(), mandatesVo.getRemarks());
            this.p.setTransactionMode(TransactionData.MODE_MANDATE_DECLINE);
            this.p.setStartMandate(jg0.N(mandatesVo.getValidity_start()));
            this.p.setEndmandate(jg0.N(mandatesVo.getValidity_end()));
            this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
            this.p.setRecurrence(mandatesVo.getRecurrencePattern());
            MandateTransactionData mandateTransactionData2 = this.p;
            if (mandatesVo.getRemarks() != null) {
                a2 = mandatesVo.getRemarks();
            }
            mandateTransactionData2.setRemarks(a2);
            this.p.setPayerVpa(mandatesVo.getPayeeVpa());
            this.p.setPayeeVpa(mandatesVo.getPayerVpa());
            this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
            this.p.setUmnID(mandatesVo.getUmn());
            String payerMobile = mandatesVo.getPayerMobile();
            String payeeMobile = mandatesVo.getPayeeMobile();
            this.p.setPayeeName(mandatesVo.getPayeeAccountName());
            if (!TextUtils.isEmpty(payerMobile) && payerMobile.equals(n70.f.a().m(a5)) && mandatesVo.getInitiatedBy().equals(a4)) {
                this.p.setPayerVpa(mandatesVo.getPayerVpa());
                this.p.setPayeeVpa(mandatesVo.getPayeeVpa());
                this.p.setPayeeName(mandatesVo.getPayeeAccountName());
                this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
            } else if (!TextUtils.isEmpty(payeeMobile) && payeeMobile.equals(n70.f.a().m(a5)) && mandatesVo.getInitiatedBy().equals(a3)) {
                this.p.setPayerVpa(mandatesVo.getPayeeVpa());
                this.p.setPayeeVpa(mandatesVo.getPayerVpa());
                this.p.setPayeeName(mandatesVo.getPayerAccountName());
                this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
            }
            this.p.setPayeeName(mandatesVo.getPayerAccountName());
        } else if (i != R.id.button_execute) {
            if (i != R.id.share_qr) {
                return;
            }
            try {
                this.t = jg0.e(ig0.a(qa0.v().z()), k(), 250);
                y(this.v, this.w);
                yg0.c(k(), this.u);
            } catch (d30 unused) {
            }
        } else {
            x(R.drawable.error_icon_grey, getString(R.string.execute_alert_msg), C0059ao.a(13502), mandatesVo.getUmn(), mandatesVo.getAmount(), mandatesVo.getAmountRule(), mandatesVo.validity_start, mandatesVo.getValidity_end(), mandatesVo.getRemarks());
            this.p.setTransactionMode(TransactionData.MODE_MANDATE_EXECUTE);
            this.p.setStartMandate(jg0.N(mandatesVo.getValidity_start()));
            this.p.setEndmandate(jg0.N(mandatesVo.getValidity_end()));
            this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
            this.p.setRecurrence(mandatesVo.getRecurrencePattern());
            MandateTransactionData mandateTransactionData3 = this.p;
            if (mandatesVo.getRemarks() != null) {
                a2 = mandatesVo.getRemarks();
            }
            mandateTransactionData3.setRemarks(a2);
            this.p.setPayerVpa(mandatesVo.getPayeeVpa());
            this.p.setPayeeVpa(mandatesVo.getPayerVpa());
            this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
            this.p.setUmnID(mandatesVo.getUmn());
            String payerMobile2 = mandatesVo.getPayerMobile();
            String payeeMobile2 = mandatesVo.getPayeeMobile();
            if (!TextUtils.isEmpty(payerMobile2) && payerMobile2.equals(n70.f.a().m(a5)) && mandatesVo.getInitiatedBy().equals(a4)) {
                this.p.setPayerVpa(mandatesVo.getPayerVpa());
                this.p.setPayeeVpa(mandatesVo.getPayeeVpa());
                this.p.setPayeeName(mandatesVo.getPayeeAccountName());
                this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
            } else if (!TextUtils.isEmpty(payeeMobile2) && payeeMobile2.equals(n70.f.a().m(a5)) && mandatesVo.getInitiatedBy().equals(a3)) {
                this.p.setPayerVpa(mandatesVo.getPayeeVpa());
                this.p.setPayeeVpa(mandatesVo.getPayerVpa());
                this.p.setPayeeName(mandatesVo.getPayerAccountName());
                this.p.setAmount(Double.valueOf(mandatesVo.getAmount()));
            }
            this.p.setPayeeName(mandatesVo.getPayerAccountName());
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
        button.setText(C0059ao.a(13504));
        button.setAllCaps(false);
        button.setOnClickListener(new a(str3, str2, str4, str5, str6, str7, str8, dialog));
        imageView.setOnClickListener(new b(this, dialog));
    }

    public final void y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
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

    public void z(ArrayList<MandatesVo> arrayList) {
        this.o = arrayList;
    }
}
