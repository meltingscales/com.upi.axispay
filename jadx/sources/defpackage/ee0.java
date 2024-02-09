package defpackage;

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
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.IntentData;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import defpackage.n70;
import defpackage.ua0;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ee0  reason: default package */
/* loaded from: classes.dex */
public class ee0 extends xc0 implements ua0.e {
    public TextView A;
    public TextView B;
    public MandateTransactionData C;
    public ImageView D;
    public ImageView E;
    public LinearLayout F;
    public Bitmap G;
    public Bitmap H;
    public View l;
    public LayoutInflater m;
    public ViewGroup n;
    public Button o;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;

    /* compiled from: AxisPay */
    /* renamed from: ee0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ee0.this.A(83);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ee0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qa0.v().h0(null);
            ee0.this.b.o(11, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ee0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ee0.this.A(583);
        }
    }

    public static ee0 y() {
        return new ee0();
    }

    public final void A(int i) {
        try {
            String encodeToString = Base64.encodeToString(ig0.a(qa0.v().z()).getBytes(C0059ao.a(8147)), 2);
            IntentData intentData = new IntentData();
            n70.a aVar = n70.f;
            intentData.setAppId(aVar.a().m(C0059ao.a(8148)));
            intentData.setCustomerId(aVar.a().m(C0059ao.a(8149)));
            intentData.setData(encodeToString);
            intentData.setIntentData(encodeToString);
            eg0.i(getActivity());
            ua0.d().q(new OliveRequest(110, i, intentData));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m = layoutInflater;
        this.n = viewGroup;
        this.l = layoutInflater.inflate(R.layout.mandate_success_layout, viewGroup, false);
        v(110, getString(R.string.success_screen_header_text));
        this.C = qa0.v().z();
        String str = jg0.v() + C0059ao.a(8150);
        Button button = (Button) this.l.findViewById(R.id.button_confirm);
        this.o = button;
        button.setBackgroundResource(R.drawable.button_shape);
        this.r = (TextView) this.l.findViewById(R.id.fromdate);
        this.p = (TextView) this.l.findViewById(R.id.debit_date);
        this.q = (TextView) this.l.findViewById(R.id.debit_acc_no);
        this.s = (TextView) this.l.findViewById(R.id.todate);
        this.t = (TextView) this.l.findViewById(R.id.amount);
        this.w = (TextView) this.l.findViewById(R.id.payee_name);
        this.u = (TextView) this.l.findViewById(R.id.tv_frequency);
        this.v = (TextView) this.l.findViewById(R.id.payee_id);
        this.y = (TextView) this.l.findViewById(R.id.trans_status);
        this.x = (TextView) this.l.findViewById(R.id.description);
        this.z = (TextView) this.l.findViewById(R.id.trans_details);
        this.D = (ImageView) this.l.findViewById(R.id.image_success);
        this.E = (ImageView) this.l.findViewById(R.id.share_qr);
        this.F = (LinearLayout) this.l.findViewById(R.id.download_qr);
        this.D.setVisibility(0);
        this.y.setTypeface(null, 1);
        this.A = (TextView) this.l.findViewById(R.id.umn);
        TextView textView = (TextView) this.l.findViewById(R.id.payment_id);
        this.B = textView;
        boolean isEmpty = TextUtils.isEmpty(this.C.getRefid());
        String a2 = C0059ao.a(8151);
        textView.setText(isEmpty ? a2 : this.C.getRefid());
        TextView textView2 = this.A;
        if (!TextUtils.isEmpty(this.C.getUmnID())) {
            a2 = this.C.getUmnID();
        }
        textView2.setText(a2);
        MandateTransactionData z = qa0.v().z();
        this.C = z;
        BeneVpa beneVpa = z.getBeneVpa();
        TextView textView3 = this.u;
        String recurrence = this.C.getRecurrence();
        String a3 = C0059ao.a(8152);
        textView3.setText(recurrence != null ? this.C.getRecurrence() : a3);
        this.p.setText(this.C.getTransactionOn() + C0059ao.a(8153) + this.C.getStartMandate());
        this.q.setText(this.C.getDebitAccountNo());
        int transactionMode = this.C.getTransactionMode();
        int i = TransactionData.MODE_REVOKE_MANDATE;
        String a4 = C0059ao.a(8154);
        if (transactionMode == i) {
            this.t.setText(jg0.b(String.valueOf(this.C.getAmount())));
            this.r.setText(this.C.getStartMandate());
            this.s.setText(this.C.getEndmandate());
            this.u.setText(this.C.getRecurrence());
            this.w.setText(jg0.g(this.C.getPayeeName()));
            this.v.setText(this.C.getPayeeVpa());
            this.x.setText(this.C.getRemarks());
            this.C.getQueryStatus();
            if (this.C.getTransactionStatus() != 10) {
                this.D.setImageResource(R.drawable.tra_failed);
                this.y.setText(a4);
                this.z.setText(this.C.getResult());
                this.y.setTextColor(t8.d(k(), R.color.block));
            } else {
                this.y.setText(getString(R.string.success_q));
                this.z.setText(getString(R.string.mandate_cancelled_successfully));
                this.D.setImageResource(2131231358);
            }
        } else if (this.C.getTransactionMode() == TransactionData.MODE_MANDATE_EXECUTE) {
            this.t.setText(jg0.b(String.valueOf(this.C.getAmount())));
            this.r.setText(this.C.getStartMandate());
            this.s.setText(this.C.getEndmandate());
            TextView textView4 = this.u;
            if (this.C.getRecurrence() != null && !TextUtils.isEmpty(this.C.getRecurrence())) {
                a3 = this.C.getRecurrence();
            }
            textView4.setText(a3);
            this.v.setText(this.C.getPayeeVpa());
            this.w.setText(jg0.g(this.C.getPayeeName()));
            this.x.setText(this.C.getRemarks());
            this.C.getQueryStatus();
            if (this.C.getTransactionStatus() != 10) {
                this.D.setImageResource(R.drawable.tra_failed);
                this.y.setText(a4);
                this.z.setText(this.C.getResult());
                this.y.setTextColor(t8.d(k(), R.color.block));
            } else {
                this.y.setText(getString(R.string.success_q));
                this.z.setText(getString(R.string.execute_success));
                this.D.setImageResource(2131231358);
            }
        } else if (this.C.getTransactionMode() == TransactionData.MODE_MANDATE_DECLINE) {
            this.t.setText(jg0.b(String.valueOf(this.C.getAmount())));
            this.r.setText(this.C.getStartMandate());
            this.s.setText(this.C.getEndmandate());
            this.w.setText(jg0.g(this.C.getPayeeName()));
            TextView textView5 = this.u;
            if (this.C.getRecurrence() != null && !TextUtils.isEmpty(this.C.getRecurrence())) {
                a3 = this.C.getRecurrence();
            }
            textView5.setText(a3);
            this.v.setText(this.C.getPayeeVpa());
            this.x.setText(this.C.getRemarks());
            this.C.getQueryStatus();
            if (this.C.getTransactionStatus() != 10) {
                this.D.setImageResource(R.drawable.tra_failed);
                this.y.setText(a4);
                this.z.setText(this.C.getResult());
                this.y.setTextColor(t8.d(k(), R.color.block));
            } else {
                this.y.setText(getString(R.string.success_q));
                this.z.setText(getString(R.string.declined_success));
                this.D.setImageResource(2131231358);
            }
        } else if (this.C.getMandateType() != 1 && this.C.getMandateType() != 4) {
            if (this.C.getMandateType() == 3) {
                this.t.setText(jg0.b(String.valueOf(this.C.getAmount())));
                this.r.setText(this.C.getStartMandate());
                this.s.setText(this.C.getEndmandate());
                this.w.setText(jg0.g(beneVpa.getName()));
                this.u.setText(this.C.getRecurrence());
                this.v.setText(this.C.getPayeeVpa());
                this.x.setText(this.C.getRemarks());
                this.C.getQueryStatus();
                if (this.C.getTransactionStatus() != 10) {
                    this.D.setImageResource(R.drawable.tra_failed);
                    this.y.setText(a4);
                    this.z.setText(this.C.getResult());
                    this.y.setTextColor(t8.d(k(), R.color.block));
                } else {
                    this.y.setText(getString(R.string.success_q));
                    this.z.setText(getString(R.string.success_mandate_update_msg));
                    this.D.setImageResource(2131231358);
                    this.E.setVisibility(0);
                    this.F.setVisibility(0);
                }
            } else if (this.C.getTransactionMode() == TransactionData.MODE_APPROVE_MANDATE) {
                this.t.setText(jg0.b(String.valueOf(this.C.getAmount())));
                this.r.setText(this.C.getStartMandate());
                this.s.setText(this.C.getEndmandate());
                this.w.setText(jg0.g(this.C.getPayeeName()));
                this.u.setText(this.C.getRecurrence());
                this.v.setText(this.C.getPayeeVpa());
                this.x.setText(this.C.getRemarks());
                if (this.C.getTransactionStatus() != 10) {
                    this.D.setImageResource(R.drawable.tra_failed);
                    this.y.setText(a4);
                    this.z.setText(this.C.getResult());
                    this.y.setTextColor(t8.d(k(), R.color.block));
                } else {
                    this.y.setText(getString(R.string.success_q));
                    this.z.setText(getString(R.string.you_have_accepted_the_mandate_request_successfully));
                    this.D.setImageResource(2131231358);
                }
            }
        } else {
            this.t.setText(jg0.b(String.valueOf(this.C.getAmount())));
            this.r.setText(this.C.getStartMandate());
            this.s.setText(this.C.getEndmandate());
            this.w.setText(jg0.g(beneVpa.getName()));
            this.u.setText(this.C.getOccurence());
            this.v.setText(beneVpa.getVpa());
            this.x.setText(this.C.getRemarks());
            this.C.getQueryStatus();
            if (this.C.getTransactionStatus() != 10) {
                this.D.setImageResource(R.drawable.tra_failed);
                this.y.setText(a4);
                this.z.setText(this.C.getResult());
                this.y.setTextColor(t8.d(k(), R.color.block));
            } else {
                this.y.setText(getString(R.string.success_q));
                this.z.setText(getString(R.string.success_mandate_msg));
                this.D.setImageResource(2131231358);
                this.E.setVisibility(0);
                this.F.setVisibility(0);
            }
        }
        MandateTransactionData mandateTransactionData = this.C;
        mandateTransactionData.setStartMandate(jg0.O(mandateTransactionData.getStartMandate()));
        MandateTransactionData mandateTransactionData2 = this.C;
        mandateTransactionData2.setEndmandate(jg0.O(mandateTransactionData2.getEndmandate()));
        qa0.v().h0(this.C);
        this.E.setOnClickListener(new a());
        this.o.setOnClickListener(new b());
        this.F.setOnClickListener(new c());
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ua0.e(k()).u(this);
        v(110, getString(R.string.success_screen_header_text));
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType == 83 || requestType == 583) {
            eg0.B();
            try {
                this.G = jg0.e(new String(Base64.decode(result.getData().toString(), 2), C0059ao.a(8155)), k(), 250);
                z(this.m, this.n);
                if (oliveRequest.getRequestType() == 83) {
                    yg0.c(k(), this.H);
                } else {
                    yg0.b(k(), this.H);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout_mandate_share, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.outer_layout);
        ((ImageView) inflate.findViewById(R.id.img_qr_code)).setImageBitmap(this.G);
        inflate.setDrawingCacheEnabled(true);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        k().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        inflate.buildDrawingCache(true);
        this.H = Bitmap.createBitmap(inflate.getDrawingCache());
        inflate.setDrawingCacheEnabled(false);
    }
}
