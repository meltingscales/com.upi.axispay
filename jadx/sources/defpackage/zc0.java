package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.BillerChargeReq;
import com.olive.upi.transport.model.BillerChargeRes;
import com.olive.upi.transport.model.BillerRegEnqResponse;
import com.olive.upi.transport.model.Billers;
import com.olive.upi.transport.model.NameVal;
import com.olive.upi.transport.model.TagList;
import com.upi.axispay.R;
import com.upi.axispay.custom.SpacesItemDecoration;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: zc0  reason: default package */
/* loaded from: classes.dex */
public class zc0 extends xc0 implements View.OnClickListener, ua0.e {
    public View l;
    public LinearLayout m;
    public Button n;
    public ImageView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public BillerRegEnqResponse s;
    public Hashtable<String, String> t;
    public Billers u;
    public RecyclerView v;

    /* compiled from: AxisPay */
    /* renamed from: zc0$a */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ CheckBox b;

        public a(TextView textView, CheckBox checkBox) {
            this.a = textView;
            this.b = checkBox;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                zc0.this.t.put(C0059ao.a(1038), this.a.getText().toString());
                return;
            }
            zc0.this.t.remove(this.b.getText().toString());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: zc0$b */
    /* loaded from: classes.dex */
    public class b implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ CheckBox a;
        public final /* synthetic */ TextView b;

        public b(CheckBox checkBox, TextView textView) {
            this.a = checkBox;
            this.b = textView;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                zc0.this.t.put(this.a.getText().toString(), this.b.getText().toString());
            } else {
                zc0.this.t.remove(this.a.getText().toString());
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.button_pay) {
            return;
        }
        BillerChargeReq billerChargeReq = new BillerChargeReq();
        billerChargeReq.setOU_ID(this.s.getOU_ID());
        billerChargeReq.setCORP_CODE(this.s.getCORP_CODE());
        ArrayList<NameVal> arrayList = new ArrayList<>();
        Enumeration<String> keys = this.t.keys();
        Double valueOf = Double.valueOf(0.0d);
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            String str = this.t.get(nextElement);
            try {
                valueOf = Double.valueOf(valueOf.doubleValue() + Double.parseDouble(str));
            } catch (Exception unused) {
            }
            arrayList.add(new NameVal(nextElement, str));
        }
        billerChargeReq.setAMT(String.valueOf(valueOf));
        TagList tagList = new TagList();
        tagList.setTag(arrayList);
        billerChargeReq.setAMOUNT(tagList);
        qa0.v().W(billerChargeReq);
        eg0.i(k());
        ua0.e(k()).q(new OliveRequest(124, 68, billerChargeReq));
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.l = layoutInflater.inflate(R.layout.fragment_generic_amount_selection, viewGroup, false);
        y();
        z();
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        if (!n(oliveRequest, result)) {
            eg0.B();
            eg0.A(k(), result.getResult());
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        Billers h = oa0.f().h();
        this.u = h;
        v(124, h.getNAME());
        super.onResume();
        z();
        ua0.e(k()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 68) {
            if (oliveRequest.getInitiator() == this.g) {
                eg0.B();
                return;
            }
            return;
        }
        eg0.B();
        BillerChargeRes billerChargeRes = (BillerChargeRes) result.getData();
        if (billerChargeRes != null) {
            this.b.t(105, billerChargeRes);
        }
    }

    public void x(BillerRegEnqResponse billerRegEnqResponse) {
        this.s = billerRegEnqResponse;
    }

    public void y() {
        this.q = (TextView) this.l.findViewById(R.id.text_name);
        this.p = (TextView) this.l.findViewById(R.id.biller_name);
        this.o = (ImageView) this.l.findViewById(R.id.biller_icon);
        RecyclerView recyclerView = (RecyclerView) this.l.findViewById(R.id.keyval_list);
        this.v = recyclerView;
        recyclerView.addItemDecoration(new SpacesItemDecoration(20));
        Button button = (Button) this.l.findViewById(R.id.button_pay);
        this.n = button;
        button.setOnClickListener(this);
        this.m = (LinearLayout) this.l.findViewById(R.id.amount_group_lauout);
        TextView textView = (TextView) this.l.findViewById(R.id.text_offer);
        this.r = textView;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
    }

    public final void z() {
        this.q.setText(this.s.getNM());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameVal(getString(R.string.bill_number), this.s.getINVOICE_NO()));
        arrayList.add(new NameVal(getString(R.string.bill_period), this.s.getBILL_PERIOD()));
        arrayList.add(new NameVal(getString(R.string.bill_date), this.s.getVLD_FRM()));
        arrayList.add(new NameVal(getString(R.string.due_date), this.s.getEXPR_DT()));
        arrayList.add(new NameVal(getString(R.string.consumer_number), this.s.getCUST_CIF()));
        Iterator<NameVal> it = this.s.getADDTNL_INFO().getTag().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        f90 f90Var = new f90(getContext(), arrayList);
        this.v.setLayoutManager(new GridLayoutManager(k(), 2));
        this.v.setAdapter(f90Var);
        this.p.setText(oa0.f().h().getNAME());
        jg0.K(this.o, oa0.f().h().getIconUrl(), R.drawable.def);
        this.p.setText(oa0.f().h().getNAME());
        jg0.K(this.o, oa0.f().h().getIconUrl(), R.drawable.blank);
        this.m.removeAllViews();
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.layout_amount_checkbox, (ViewGroup) null);
        CheckBox checkBox = (CheckBox) linearLayout.findViewById(R.id.amount_name);
        TextView textView = (TextView) linearLayout.findViewById(R.id.amount_value);
        checkBox.setChecked(false);
        checkBox.setText(R.string.bill_amount);
        textView.setText(this.s.getAMT());
        this.m.addView(linearLayout);
        checkBox.setOnCheckedChangeListener(new a(textView, checkBox));
        TagList amount = this.s.getAMOUNT();
        if (amount != null) {
            ArrayList<NameVal> tag = amount.getTag();
            this.t = new Hashtable<>();
            if (tag != null) {
                Iterator<NameVal> it2 = tag.iterator();
                while (it2.hasNext()) {
                    NameVal next = it2.next();
                    LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.layout_amount_checkbox, (ViewGroup) null);
                    CheckBox checkBox2 = (CheckBox) linearLayout2.findViewById(R.id.amount_name);
                    TextView textView2 = (TextView) linearLayout2.findViewById(R.id.amount_value);
                    checkBox2.setText(next.getName());
                    textView2.setText(next.getValue());
                    checkBox2.setOnCheckedChangeListener(new b(checkBox2, textView2));
                    this.m.addView(linearLayout2);
                }
            }
        }
    }
}
