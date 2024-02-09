package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.SetuResponse;
import com.olive.upi.transport.model.TransactionData;
import com.upi.axispay.R;
import defpackage.qa0;
import defpackage.ua0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xf0  reason: default package */
/* loaded from: classes.dex */
public class xf0 extends xc0 implements ua0.e {
    public WebView l;
    public String m;
    public String n;
    public String o;
    public String p;
    public TransactionData q;

    /* compiled from: AxisPay */
    /* renamed from: xf0$a */
    /* loaded from: classes.dex */
    public class a implements DownloadListener {
        public a() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            Intent intent = new Intent(C0059ao.a(8990));
            intent.setData(Uri.parse(str));
            xf0.this.startActivity(intent);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xf0$b */
    /* loaded from: classes.dex */
    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith(C0059ao.a(8907))) {
                return false;
            }
            xf0.this.startActivity(new Intent(C0059ao.a(8908), Uri.parse(str)));
            return true;
        }

        public /* synthetic */ b(xf0 xf0Var, a aVar) {
            this();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xf0$c */
    /* loaded from: classes.dex */
    public class c {
        public Context a;

        public c(Context context) {
            this.a = context;
        }

        @JavascriptInterface
        public void initiatePayment(String str, String str2, String str3, String str4, String str5) {
            Toast.makeText(this.a, C0059ao.a(8939), 0).show();
            xf0 xf0Var = xf0.this;
            xf0Var.m = str4;
            xf0Var.q = qa0.v().L();
            xf0.this.q.setOrderId(str);
            xf0.this.q.setRemarks(str5);
            xf0.this.q.setAmount(Double.valueOf(Double.parseDouble(str3)));
            BeneVpa beneVpa = new BeneVpa();
            beneVpa.setVpa(TransportConstants.BILLPAY_UPIID);
            String a = C0059ao.a(8940);
            beneVpa.setName(a);
            beneVpa.setNickname(C0059ao.a(8941));
            xf0.this.q.setBeneVpa(beneVpa);
            ArrayList<Account> h = qa0.v().h(qa0.c.ACTIVE_VPA);
            if (h != null) {
                if (h.size() > 1) {
                    xf0.this.b.t(80, a);
                    return;
                } else if (h.size() == 1) {
                    xf0.this.y(h.get(0));
                    return;
                } else {
                    return;
                }
            }
            eg0.m(xf0.this.k(), xf0.this.getString(R.string.no_active_account));
        }

        @JavascriptInterface
        public void showToast(String str) {
            Toast.makeText(this.a, str, 0).show();
        }

        @JavascriptInterface
        public void unload() {
            Toast.makeText(this.a, C0059ao.a(8942), 0).show();
            xf0.this.b.o(11, null);
        }
    }

    public xf0() {
        String a2 = C0059ao.a(3796);
        this.m = a2;
        this.n = a2;
        this.o = a2;
        this.p = a2;
    }

    public final void A(Result result) {
        this.p = (String) result.getData();
        if (result.getData() == null || TextUtils.isEmpty(this.p)) {
            return;
        }
        this.q.setRefid(this.p);
        this.q.setApprovalRefNo(this.p);
        B(String.format(C0059ao.a(3801), this.m, result.code.equals(C0059ao.a(3798)) ? C0059ao.a(3799) : String.format(C0059ao.a(3800), result.code, result.result), this.n, this.p, new SimpleDateFormat(C0059ao.a(3797), Locale.US).format(new Date()), this.q.getAccount().getVpa(), this.o));
    }

    public void B(String str) {
        this.l.getSettings().setJavaScriptEnabled(true);
        this.l.setWebViewClient(new b(this, null));
        this.l.setWebChromeClient(new WebChromeClient());
        this.l.addJavascriptInterface(new c(getContext()), C0059ao.a(3802));
        this.l.loadUrl(str);
        this.l.setDownloadListener(new a());
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
        if (i == 10) {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(151, 10, obj));
        } else if (i != 45) {
        } else {
            eg0.i(k());
            ua0.e(k()).q(new OliveRequest(151, 45, obj));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_faqs, viewGroup, false);
        this.l = (WebView) inflate.findViewById(R.id.web_view);
        z();
        return inflate;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (n(oliveRequest, result) || oliveRequest.getRequestType() != 10) {
            return;
        }
        A(result);
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        v(151, C0059ao.a(3803));
        super.onResume();
        ua0.e(k()).u(this);
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        if (oliveRequest.getRequestType() == 102) {
            B(((SetuResponse) result.data).getLink());
        } else if (oliveRequest.getRequestType() == 10) {
            A(result);
        }
    }

    @Override // defpackage.xc0
    public void p(Object obj) {
        super.p(obj);
        Account account = (Account) obj;
        if (account != null) {
            y(account);
        }
    }

    public final void y(Account account) {
        this.q.setAccount(account);
        this.q.setTransactionMode(TransactionData.MODE_SEND);
        this.q.setDirection(1);
        OliveRequest oliveRequest = new OliveRequest(151, 510, this.q);
        oliveRequest.setClMode(5);
        ua0.d().q(oliveRequest);
    }

    public void z() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0059ao.a(3804));
        arrayList.add(C0059ao.a(3805));
        arrayList.add(n70.f.a().m(C0059ao.a(3806)));
        arrayList.add(C0059ao.a(3807));
        ua0.d().q(new OliveRequest(69, 102, arrayList));
    }
}
