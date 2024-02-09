package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
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
import com.olive.upi.transport.model.IntentData;
import com.upi.axispay.R;
import defpackage.n70;
import defpackage.ua0;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: df0  reason: default package */
/* loaded from: classes.dex */
public class df0 extends xc0 implements ua0.e {
    public static hg0 B;
    public ImageView l;
    public Bitmap m;
    public Bitmap n;
    public ImageView o;
    public ImageView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public Button w;
    public LinearLayout x;
    public ImageView y;
    public int z = 105;
    public int A = 106;

    /* compiled from: AxisPay */
    /* renamed from: df0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ LayoutInflater b;
        public final /* synthetic */ ViewGroup c;

        public a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            this.b = layoutInflater;
            this.c = viewGroup;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            df0.this.D(this.b, this.c);
            yg0.b(df0.this.k(), df0.this.n);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: df0$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ LayoutInflater b;
        public final /* synthetic */ ViewGroup c;

        public b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            this.b = layoutInflater;
            this.c = viewGroup;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            df0.this.D(this.b, this.c);
            yg0.c(df0.this.k(), df0.this.n);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: df0$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            df0.this.k().onBackPressed();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: df0$d */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (df0.B.d() == 5) {
                df0.this.b.o(11, null);
                return;
            }
            df0.this.k().D().b1(null, 1);
            df0.this.b.t(4, null);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: df0$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ ImageView c;

        /* compiled from: AxisPay */
        /* renamed from: df0$e$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                eg0.j(df0.this.k(), df0.this.getString(R.string.generating_qr_code_text));
                try {
                    String encodeToString = Base64.encodeToString(e.this.b.getBytes(C0059ao.a(15772)), 2);
                    IntentData intentData = new IntentData();
                    n70.a aVar = n70.f;
                    intentData.setAppId(aVar.a().m(C0059ao.a(15773)));
                    intentData.setCustomerId(aVar.a().m(C0059ao.a(15774)));
                    intentData.setData(encodeToString);
                    intentData.setIntentData(encodeToString);
                    ua0.d().q(new OliveRequest(55, 83, intentData));
                } catch (Exception unused) {
                }
                try {
                    e eVar = e.this;
                    Bitmap e = jg0.e(eVar.b, df0.this.k(), 250);
                    e.this.c.setImageBitmap(e);
                    df0.this.m = e;
                    eg0.B();
                } catch (d30 unused2) {
                    eg0.B();
                }
            }
        }

        public e(String str, ImageView imageView) {
            this.b = str;
            this.c = imageView;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (this) {
                    wait(500L);
                    df0.this.k().runOnUiThread(new a());
                }
            } catch (InterruptedException unused) {
                eg0.B();
            }
        }
    }

    public static df0 C(hg0 hg0Var) {
        B = hg0Var;
        return new df0();
    }

    public final String A(String str, String str2, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer(C0059ao.a(12614));
        if (str != null && !TextUtils.isEmpty(str)) {
            stringBuffer.append(C0059ao.a(12615));
            stringBuffer.append(str);
            stringBuffer.append(C0059ao.a(12616));
        }
        if (!TextUtils.isEmpty(str2)) {
            stringBuffer.append(C0059ao.a(12617));
            stringBuffer.append(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            stringBuffer.append(C0059ao.a(12618));
            stringBuffer.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            stringBuffer.append(C0059ao.a(12619));
            stringBuffer.append(str4);
        }
        stringBuffer.append(C0059ao.a(12620));
        stringBuffer.append(C0059ao.a(12621));
        stringBuffer.append(C0059ao.a(12622));
        stringBuffer.append(C0059ao.a(12623));
        stringBuffer.append(C0059ao.a(12624));
        stringBuffer.append(C0059ao.a(12625));
        stringBuffer.append(C0059ao.a(12626));
        stringBuffer.append(C0059ao.a(12627));
        return stringBuffer.toString();
    }

    public final String B() {
        return Environment.getExternalStorageDirectory().toString();
    }

    public final void D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout_qr_share, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.outer_layout);
        TextView textView = (TextView) inflate.findViewById(R.id.amount_text);
        TextView textView2 = (TextView) inflate.findViewById(R.id.remarks_text);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.img_qr_code);
        ((TextView) inflate.findViewById(R.id.vpa_text)).setText(B.e());
        if (B.a() != null) {
            textView.setText(C0059ao.a(12628) + B.a());
        } else {
            textView.setText(C0059ao.a(12629));
        }
        if (B.c() != null) {
            textView2.setText(B.c());
        } else {
            textView2.setText(getString(R.string.default_remark));
        }
        imageView.setImageBitmap(this.m);
        inflate.setDrawingCacheEnabled(true);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        k().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        inflate.buildDrawingCache(true);
        this.n = Bitmap.createBitmap(inflate.getDrawingCache());
        inflate.setDrawingCacheEnabled(false);
    }

    @Override // defpackage.xc0
    public void m(int i) {
        super.m(i);
        if (i == this.z) {
            yg0.b(k(), this.n);
            this.u.setVisibility(8);
        } else if (i == this.A) {
            yg0.c(k(), this.n);
            this.u.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = B() + C0059ao.a(12630);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_qr_details, viewGroup, false);
        this.o = (ImageView) inflate.findViewById(R.id.download_qr_text);
        this.p = (ImageView) inflate.findViewById(R.id.share_qr_text);
        TextView textView = (TextView) inflate.findViewById(R.id.text_generate_qr);
        this.v = textView;
        textView.setTypeface(null, 1);
        this.q = (TextView) inflate.findViewById(R.id.vpa_text);
        this.r = (TextView) inflate.findViewById(R.id.amount_text);
        this.s = (TextView) inflate.findViewById(R.id.date_text);
        this.t = (TextView) inflate.findViewById(R.id.remarks_text);
        this.w = (Button) inflate.findViewById(R.id.btn_done);
        this.l = (ImageView) inflate.findViewById(R.id.img_qr_code);
        this.u = (TextView) inflate.findViewById(R.id.permission_warning_text);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layoutDownloadShareQR);
        this.x = (LinearLayout) inflate.findViewById(R.id.outer_layout);
        this.y = (ImageView) inflate.findViewById(R.id.back_arrow);
        this.o.setOnClickListener(new a(layoutInflater, viewGroup));
        this.p.setOnClickListener(new b(layoutInflater, viewGroup));
        this.y.setOnClickListener(new c());
        this.w.setOnClickListener(new d());
        if (B.d() == 5) {
            this.x.setVisibility(8);
        } else {
            this.x.setVisibility(0);
        }
        eg0.j(k(), getString(R.string.generating_qr_code_text));
        y();
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(55, getString(R.string.my_qr_code));
        super.onResume();
        ua0.e(k()).u(this);
        if (B.d() == 5) {
            this.b.o(90, new tg0(getString(R.string.my_qr_code), false, true, true, false));
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 83) {
            return;
        }
        eg0.B();
        try {
            Bitmap e2 = jg0.e(new String(Base64.decode(result.getData().toString(), 2), C0059ao.a(12631)), k(), 250);
            this.l.setImageBitmap(e2);
            this.m = e2;
            eg0.B();
        } catch (d30 unused) {
            eg0.B();
        } catch (UnsupportedEncodingException e3) {
            e3.printStackTrace();
        }
    }

    public void y() {
        eg0.j(k(), getString(R.string.generating_qr_code_text));
        String e2 = B.e();
        z(this.l, A(e2, B.a(), B.c(), B.b()));
        HashMap hashMap = new HashMap();
        hashMap.put(C0059ao.a(12632), getString(R.string.generate_qr_code));
        ah0.c(k(), C0059ao.a(12633), hashMap);
        this.q.setText(e2);
        if (B.a() != null) {
            this.r.setText(jg0.b(B.a()));
        } else {
            this.r.setText(C0059ao.a(12634));
        }
        if (B.c() != null) {
            this.t.setText(B.c());
        } else {
            this.t.setText(getString(R.string.default_remark));
        }
        this.s.setText(jg0.x(Calendar.getInstance().getTime(), C0059ao.a(12635)));
    }

    public void z(ImageView imageView, String str) {
        new Thread(new e(str, imageView)).start();
    }
}
