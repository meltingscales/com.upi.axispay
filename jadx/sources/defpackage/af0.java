package defpackage;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.BeneVpaBlock;
import com.olive.upi.transport.model.PendingReqVo;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: af0  reason: default package */
/* loaded from: classes.dex */
public class af0 extends xc0 implements ng0, DatePickerDialog.OnDateSetListener, View.OnClickListener {
    public static ArrayList<PendingReqVo> t;
    public RecyclerView l;
    public TextView m;
    public ProgressBar n;
    public da0 o;
    public TransactionData p;
    public ArrayList<PendingReqVo> q = new ArrayList<>();
    public og0 r;
    public int s;

    /* compiled from: AxisPay */
    /* renamed from: af0$a */
    /* loaded from: classes.dex */
    public class a implements SwipeRefreshLayout.j {
        public final /* synthetic */ SwipeRefreshLayout a;

        public a(SwipeRefreshLayout swipeRefreshLayout) {
            this.a = swipeRefreshLayout;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            af0 af0Var = af0.this;
            af0Var.r.i(af0Var.s);
            this.a.setRefreshing(false);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: af0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ PendingReqVo b;

        public b(PendingReqVo pendingReqVo) {
            this.b = pendingReqVo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            af0.this.C(this.b);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: af0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c(af0 af0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: af0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ Dialog b;
        public final /* synthetic */ RadioGroup c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public d(Dialog dialog, RadioGroup radioGroup, String str, String str2) {
            this.b = dialog;
            this.c = radioGroup;
            this.d = str;
            this.e = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            this.b.dismiss();
            String charSequence = ((RadioButton) this.b.findViewById(this.c.getCheckedRadioButtonId())).getText().toString();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BeneVpaBlock(this.d, C0059ao.a(12879), this.e, charSequence));
            eg0.i(af0.this.k());
            ua0.e(af0.this.k()).q(new OliveRequest(71, 52, arrayList));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: af0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ Dialog b;
        public final /* synthetic */ RadioGroup c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public e(Dialog dialog, RadioGroup radioGroup, String str, String str2) {
            this.b = dialog;
            this.c = radioGroup;
            this.d = str;
            this.e = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            eg0.c();
            this.b.dismiss();
            String charSequence = ((RadioButton) this.b.findViewById(this.c.getCheckedRadioButtonId())).getText().toString();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BeneVpaBlock(this.d, C0059ao.a(12882), this.e, charSequence));
            eg0.i(af0.this.k());
            ua0.e(af0.this.k()).q(new OliveRequest(71, 52, arrayList));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: af0$f */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ Dialog b;

        public f(af0 af0Var, Dialog dialog) {
            this.b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.b.hide();
        }
    }

    public static af0 B(ArrayList<PendingReqVo> arrayList) {
        t = arrayList;
        return new af0();
    }

    public void A(String str, String str2) {
        Dialog dialog = new Dialog(k(), R.style.Theme_Dialog);
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(R.layout.dialog_decline_block);
        dialog.getWindow().setLayout(-1, -2);
        RadioGroup radioGroup = (RadioGroup) dialog.findViewById(R.id.radiogroupblock);
        radioGroup.check(R.id.first);
        Button button = (Button) dialog.findViewById(R.id.button_block);
        Button button2 = (Button) dialog.findViewById(R.id.button_block1);
        button.setOnClickListener(new d(dialog, radioGroup, str, str2));
        button2.setOnClickListener(new e(dialog, radioGroup, str, str2));
        ((ImageView) dialog.findViewById(R.id.cancel)).setOnClickListener(new f(this, dialog));
        dialog.setCancelable(false);
        dialog.show();
    }

    public final void C(PendingReqVo pendingReqVo) {
        BeneVpa beneVpa = new BeneVpa();
        beneVpa.setVpa(pendingReqVo.getPayeeVpa());
        beneVpa.setNickname(pendingReqVo.getBeneName());
        beneVpa.setName(pendingReqVo.getBeneName());
        this.p.setBeneVpa(beneVpa);
        this.p.setAmount(Double.valueOf(pendingReqVo.getAmount()));
        this.p.setExpiry(pendingReqVo.getExpdate());
        this.p.setRemarks(pendingReqVo.getNotes());
        this.p.setRefid(pendingReqVo.getRefid());
        this.p.setTransactionId(pendingReqVo.getTxnid());
        this.p.setDirection(1);
        this.p.setTransactionMode(TransactionData.MODE_COLLECT_NOTIFICATION);
        qa0.v().u0(this.p);
        this.p.setAccount(qa0.v().d(pendingReqVo.getPayerVpa()));
        this.p.setRemitterVpa(pendingReqVo.getPayerVpa());
        eg0.i(k());
        ua0.e(k()).q(new OliveRequest(71, 29, pendingReqVo));
    }

    public void D(int i) {
        this.s = i;
    }

    public void E(og0 og0Var) {
        this.r = og0Var;
    }

    public void F() {
        if (this.l != null) {
            ArrayList<PendingReqVo> arrayList = t;
            if (arrayList != null && arrayList.size() > 0) {
                this.l.setVisibility(0);
                this.m.setVisibility(8);
            } else {
                this.l.setVisibility(8);
                this.m.setVisibility(0);
            }
            this.n.setVisibility(8);
        }
    }

    public void G(boolean z) {
        ProgressBar progressBar = this.n;
        if (progressBar != null) {
            progressBar.setVisibility(z ? 0 : 8);
        }
    }

    public void H(ArrayList<PendingReqVo> arrayList) {
        if (this.i && this.l != null) {
            this.q.clear();
            if (arrayList != null && arrayList.size() > 0) {
                this.q = arrayList;
                da0 da0Var = this.o;
                if (da0Var == null) {
                    this.o = new da0(k(), this.q);
                } else {
                    da0Var.z(arrayList);
                }
                this.o.y(this);
                this.l.setAdapter(this.o);
                this.l.setVisibility(0);
                this.m.setVisibility(8);
            } else {
                this.l.setVisibility(8);
                this.m.setVisibility(0);
            }
            this.n.setVisibility(8);
        }
    }

    @Override // defpackage.ng0
    public void a(int i, Object obj, View view) {
    }

    @Override // defpackage.ng0
    public void e(int i, int i2, Object obj) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_pending_requests, viewGroup, false);
        this.p = qa0.v().L();
        this.l = (RecyclerView) inflate.findViewById(R.id.pending_transaction_list);
        this.n = (ProgressBar) inflate.findViewById(R.id.progress);
        this.l.setLayoutManager(new LinearLayoutManager(k()));
        this.n.setVisibility(8);
        this.m = (TextView) inflate.findViewById(R.id.empty_view);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new a(swipeRefreshLayout));
        return inflate;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.i) {
            ua0.d().b(false, new OliveRequest(71, 15, null));
        }
    }

    @Override // defpackage.ng0
    public void s(int i, Object obj) {
        PendingReqVo pendingReqVo = (PendingReqVo) obj;
        switch (i) {
            case R.id.button_approve /* 2131362002 */:
                z(pendingReqVo);
                return;
            case R.id.button_block /* 2131362004 */:
                A(pendingReqVo.getTxnid(), pendingReqVo.getPayeeVpa());
                return;
            case R.id.button_decline /* 2131362014 */:
                eg0.r(k(), getString(R.string.decline), getString(R.string.transaction_decline_confirmation), getString(R.string.yes_test), new b(pendingReqVo), getString(R.string.no_text), new c(this));
                return;
            case R.id.invoice /* 2131362381 */:
                if (pendingReqVo.getInvoiceurl() != null) {
                    na0 na0Var = new na0();
                    na0Var.e(pendingReqVo.getInvoiceurl());
                    this.b.t(69, na0Var);
                    return;
                }
                Toast.makeText(k(), C0059ao.a(4657), 0).show();
                return;
            default:
                return;
        }
    }

    public final void z(PendingReqVo pendingReqVo) {
        BeneVpa beneVpa = new BeneVpa();
        beneVpa.setVpa(pendingReqVo.getPayeeVpa());
        beneVpa.setNickname(pendingReqVo.getBeneName());
        beneVpa.setName(pendingReqVo.getBeneName());
        this.p.setBeneVpa(beneVpa);
        this.p.setDirection(1);
        this.p.setEditedAmount(Double.valueOf(pendingReqVo.getAmount()));
        this.p.setAmount(Double.valueOf(pendingReqVo.getAmount()));
        this.p.setExpiry(pendingReqVo.getExpdate());
        this.p.setRemarks(pendingReqVo.getNotes());
        this.p.setRefid(pendingReqVo.getRefid());
        this.p.setTransactionId(pendingReqVo.getTxnid());
        this.p.setMerchantflag(pendingReqVo.getMerchantflag());
        this.p.setTransactionMode(TransactionData.MODE_COLLECT_NOTIFICATION);
        qa0.v().u0(this.p);
        Account d2 = qa0.v().d(pendingReqVo.getPayerVpa());
        this.p.setAccount(d2);
        this.p.setRemitterVpa(pendingReqVo.getPayerVpa());
        qa0.v().u0(this.p);
        if (d2 != null) {
            d2.setVpa(pendingReqVo.getPayerVpa());
            this.b.t(9, d2);
            return;
        }
        eg0.h(k(), getString(R.string.alert), String.format(getString(R.string.requested_id_doesnt_exist), this.p.getRemitterVpa()));
    }
}
