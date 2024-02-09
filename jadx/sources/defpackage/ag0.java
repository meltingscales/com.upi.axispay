package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.MasterUpdate;
import com.upi.axispay.R;
import defpackage.ua0;
import java.util.Enumeration;
import java.util.Hashtable;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ag0  reason: default package */
/* loaded from: classes.dex */
public class ag0 extends xc0 implements ua0.e {
    public static ag0 o;
    public WebView l;
    public na0 m;
    public int n;

    /* compiled from: AxisPay */
    /* renamed from: ag0$a */
    /* loaded from: classes.dex */
    public class a extends WebViewClient {
        public ProgressDialog a;

        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (this.a != null || ag0.this.k() == null) {
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog(ag0.this.k());
            this.a = progressDialog;
            progressDialog.setMessage(ag0.this.getString(R.string.please_wait));
            this.a.show();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            try {
                ProgressDialog progressDialog = this.a;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.a.dismiss();
                }
            } catch (Exception unused) {
            }
            eg0.B();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.a != null || ag0.this.k() == null) {
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog(ag0.this.k());
            this.a = progressDialog;
            progressDialog.setMessage(ag0.this.getString(R.string.please_wait));
            this.a.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            try {
                ProgressDialog progressDialog = this.a;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.a.dismiss();
                }
            } catch (Exception unused) {
            }
            eg0.B();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            try {
                ProgressDialog progressDialog = this.a;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.a.dismiss();
                }
            } catch (Exception unused) {
            }
            eg0.B();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ag0$b */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (ag0.this.k() == null) {
                ag0.this.r();
            }
            ag0.this.k().onBackPressed();
            eg0.c();
        }
    }

    public static ag0 y() {
        ag0 ag0Var = new ag0();
        o = ag0Var;
        return ag0Var;
    }

    public final void A(na0 na0Var) {
        if (na0Var == null) {
            k().onBackPressed();
        } else if (TextUtils.isEmpty(na0Var.d())) {
            String b2 = na0Var.b(C0059ao.a(7688));
            if (!TextUtils.isEmpty(b2)) {
                try {
                    this.n = Integer.parseInt(b2);
                } catch (Exception unused) {
                }
            }
            MasterUpdate B = qa0.v().B();
            String encryptionFlag = B == null ? null : B.getEncryptionFlag();
            String b3 = na0Var.b(C0059ao.a(7689));
            if (!TextUtils.isEmpty(encryptionFlag) && encryptionFlag.equalsIgnoreCase(C0059ao.a(7690))) {
                eg0.i(k());
                ua0.d().q(new OliveRequest(69, 173, b3));
                return;
            }
            B(b3);
            return;
        }
        this.l.setWebViewClient(new a());
        this.l.getSettings().setJavaScriptEnabled(true);
        this.l.getSettings().setAllowFileAccess(false);
        this.l.getSettings().setAllowFileAccessFromFileURLs(false);
        this.l.getSettings().setAllowUniversalAccessFromFileURLs(false);
        this.l.getSettings().setDomStorageEnabled(true);
        k().getWindow().setSoftInputMode(16);
        na0 na0Var2 = this.m;
        if (na0Var2 == null) {
            return;
        }
        Hashtable<String, String> c = na0Var2.c();
        if (c != null) {
            Enumeration<String> keys = c.keys();
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                boolean hasMoreElements = keys.hasMoreElements();
                String a2 = C0059ao.a(7691);
                if (hasMoreElements) {
                    String nextElement = keys.nextElement();
                    stringBuffer.append(nextElement);
                    stringBuffer.append(C0059ao.a(7692));
                    stringBuffer.append(c.get(nextElement));
                    stringBuffer.append(a2);
                } else {
                    this.l.postUrl(this.m.d(), stringBuffer.toString().substring(0, stringBuffer.toString().lastIndexOf(a2)).getBytes());
                    return;
                }
            }
        } else {
            String d = this.m.d();
            if (d.endsWith(C0059ao.a(7693))) {
                d = C0059ao.a(7694) + d;
            }
            this.l.loadUrl(d);
        }
    }

    public final void B(String str) {
        int i = this.n;
        if (i == 134) {
            na0 na0Var = new na0();
            this.m = na0Var;
            na0Var.e(C0059ao.a(7695));
        } else {
            this.m = x(i == 127 ? C0059ao.a(7696) : i == 126 ? C0059ao.a(7697) : C0059ao.a(7698), str);
        }
        na0 na0Var2 = this.m;
        if (na0Var2 == null) {
            eg0.f(k(), getString(R.string.alert), getString(R.string.unable_to_process_your_request), getString(R.string.ok_text), new b());
        } else {
            A(na0Var2);
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_faqs, viewGroup, false);
        this.l = (WebView) inflate.findViewById(R.id.web_view);
        A(this.m);
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.b.o(90, new tg0(getString(R.string.transaction_status), true, true, true, false));
        ua0.e(k()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        if (oliveRequest.getRequestType() != 173) {
            oliveRequest.getInitiator();
            eg0.B();
            return;
        }
        B((String) result.getData());
    }

    public na0 x(String str, String str2) {
        if (str2 != null) {
            String m = n70.f.a().m(C0059ao.a(7699));
            try {
                String e = gg0.e(str2);
                String a2 = C0059ao.a(7700);
                na0 na0Var = new na0();
                try {
                    na0Var.e(str);
                    na0Var.a(C0059ao.a(7701), gg0.b(str2));
                    na0Var.a(C0059ao.a(7702), gg0.b(e));
                    na0Var.a(C0059ao.a(7703), gg0.b(m));
                    na0Var.a(C0059ao.a(7704), gg0.b(a2));
                } catch (Exception unused) {
                }
                return na0Var;
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    public void z(na0 na0Var) {
        this.m = na0Var;
    }
}
