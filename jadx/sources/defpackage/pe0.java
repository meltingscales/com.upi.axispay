package defpackage;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.IntentData;
import com.pkmmte.view.CircularImageView;
import com.upi.axispay.R;
import com.upi.axispay.activity.SendLogActivity;
import defpackage.n70;
import defpackage.qa0;
import defpackage.ua0;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: pe0  reason: default package */
/* loaded from: classes.dex */
public class pe0 extends xc0 implements View.OnClickListener, ua0.e {
    public View l;
    public TextView m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public CircularImageView s;
    public RelativeLayout t;
    public String u;
    public ImageView v;
    public int w = 200;

    /* compiled from: AxisPay */
    /* renamed from: pe0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ ImageView c;

        /* compiled from: AxisPay */
        /* renamed from: pe0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0034a implements Runnable {
            public RunnableC0034a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                eg0.j(pe0.this.k(), pe0.this.getString(R.string.generating_qr_code_text));
                try {
                    String encodeToString = Base64.encodeToString(a.this.b.getBytes(C0059ao.a(9133)), 2);
                    a aVar = a.this;
                    a.this.c.setImageBitmap(jg0.e(aVar.b, pe0.this.k(), pe0.this.w));
                    IntentData intentData = new IntentData();
                    n70.a aVar2 = n70.f;
                    intentData.setAppId(aVar2.a().m(C0059ao.a(9134)));
                    intentData.setCustomerId(aVar2.a().m(C0059ao.a(9135)));
                    intentData.setData(encodeToString);
                    intentData.setIntentData(encodeToString);
                    ua0.d().q(new OliveRequest(55, 83, intentData));
                } catch (d30 unused) {
                    eg0.B();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }

        public a(String str, ImageView imageView) {
            this.b = str;
            this.c = imageView;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (this) {
                    wait(500L);
                    pe0.this.k().runOnUiThread(new RunnableC0034a());
                }
            } catch (InterruptedException unused) {
                eg0.B();
            }
        }
    }

    public final void A() {
        this.t.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.o.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.change_passcode) {
            this.b.t(74, 5);
        } else if (id == R.id.layout_profile) {
            this.b.o(221, this.s);
        } else if (id != R.id.logs_view) {
        } else {
            jg0.c(k(), true, false);
            startActivity(new Intent(k(), SendLogActivity.class));
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String a2;
        this.l = layoutInflater.inflate(R.layout.fragment_my_profile, viewGroup, false);
        z();
        A();
        n70.a aVar = n70.f;
        n70 a3 = aVar.a();
        String a4 = C0059ao.a(8502);
        this.u = a3.m(a4);
        if (!TextUtils.isEmpty(aVar.a().m(C0059ao.a(8503)))) {
            this.u += aVar.a().m(a2);
        }
        this.m.setText(this.u);
        this.p.setText(aVar.a().m(C0059ao.a(8504)));
        ArrayList<Account> h = qa0.v().h(qa0.c.WITH_VPA);
        if (h != null && h.size() > 0) {
            String vpa = h.get(0).getVpa();
            this.n.setText(vpa);
            x(vpa);
        } else {
            this.n.setText(C0059ao.a(8505));
            this.v.setVisibility(8);
            this.r.setVisibility(8);
        }
        String m = aVar.a().m(C0059ao.a(8506));
        if (TextUtils.isEmpty(m)) {
            this.s.setImageDrawable(jg0.y(aVar.a().m(a4), t8.d(getContext(), R.color.grey)));
        } else {
            File file = new File(m);
            if (file.exists()) {
                this.s.setImageBitmap(BitmapFactory.decodeFile(file.getAbsolutePath()));
            } else {
                this.s.setImageDrawable(jg0.y(aVar.a().m(a4), R.color.grey));
            }
        }
        return this.l;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(49, getString(R.string.title_my_profile));
        super.onResume();
        ua0.e(k()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 83) {
            return;
        }
        eg0.B();
        try {
            this.v.setImageBitmap(jg0.e(new String(Base64.decode(result.getData().toString(), 2), C0059ao.a(8507)), k(), this.w));
            eg0.B();
        } catch (d30 unused) {
            eg0.B();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public void x(String str) {
        eg0.j(k(), getString(R.string.generating_qr_code_text));
        StringBuffer stringBuffer = new StringBuffer(C0059ao.a(8508));
        if (!TextUtils.isEmpty(str)) {
            stringBuffer.append(C0059ao.a(8509));
            stringBuffer.append(str);
        }
        stringBuffer.append(C0059ao.a(8510));
        stringBuffer.append(C0059ao.a(8511));
        if (!TextUtils.isEmpty(this.u)) {
            stringBuffer.append(C0059ao.a(8512));
            stringBuffer.append(this.u);
        }
        stringBuffer.append(C0059ao.a(8513));
        stringBuffer.append(C0059ao.a(8514));
        y(this.v, stringBuffer.toString());
    }

    public void y(ImageView imageView, String str) {
        new Thread(new a(str, imageView)).start();
    }

    public final void z() {
        this.m = (TextView) this.l.findViewById(R.id.drawer_listitem_tv_profile_name);
        this.p = (TextView) this.l.findViewById(R.id.text_phone_number);
        this.t = (RelativeLayout) this.l.findViewById(R.id.layout_profile);
        this.n = (TextView) this.l.findViewById(R.id.upiId);
        TextView textView = (TextView) this.l.findViewById(R.id.change_passcode);
        this.q = textView;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        this.s = (CircularImageView) this.l.findViewById(R.id.profile_pic);
        TextView textView2 = (TextView) this.l.findViewById(R.id.logs_view);
        this.o = textView2;
        textView2.setVisibility(8);
        this.r = (TextView) this.l.findViewById(R.id.qr_message);
        this.v = (ImageView) this.l.findViewById(R.id.qr_image);
    }
}
