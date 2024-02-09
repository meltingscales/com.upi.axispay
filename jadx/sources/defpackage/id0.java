package defpackage;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.upi.axispay.R;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: id0  reason: default package */
/* loaded from: classes.dex */
public class id0 extends xc0 {
    public WebView l;

    /* compiled from: AxisPay */
    /* renamed from: id0$a */
    /* loaded from: classes.dex */
    public class a extends WebViewClient {
        public ProgressDialog a;

        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (this.a != null || id0.this.k() == null) {
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog(id0.this.k());
            this.a = progressDialog;
            progressDialog.setMessage(id0.this.getString(R.string.please_wait));
            this.a.show();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            try {
                ProgressDialog progressDialog = this.a;
                if (progressDialog == null || !progressDialog.isShowing()) {
                    return;
                }
                this.a.dismiss();
            } catch (Exception unused) {
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_faqs, viewGroup, false);
        this.l = (WebView) inflate.findViewById(R.id.web_view);
        x(C0059ao.a(14092));
        return inflate;
    }

    public final void x(String str) {
        this.l.setWebViewClient(new a());
        this.l.getSettings().setJavaScriptEnabled(true);
        this.l.getSettings().setAllowFileAccess(false);
        this.l.getSettings().setAllowFileAccessFromFileURLs(false);
        this.l.getSettings().setAllowUniversalAccessFromFileURLs(false);
        this.l.loadUrl(str);
    }
}
