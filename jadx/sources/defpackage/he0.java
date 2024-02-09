package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.CustomerBankAccounts;
import com.olive.upi.transport.model.HealthCheck;
import com.olive.upi.transport.model.Registration;
import com.upi.axispay.R;
import com.upi.axispay.activity.MainActivity;
import defpackage.n70;
import defpackage.ua0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: he0  reason: default package */
/* loaded from: classes.dex */
public class he0 extends xc0 implements ua0.e, View.OnClickListener {
    public static int U;
    public boolean C;
    public Button D;
    public TextView E;
    public ImageView F;
    public boolean G;
    public AlertDialog H;
    public Activity Q;
    public List<String> R;
    public int T;
    public LinearLayout l;
    public int s;
    public CountDownTimer t;
    public boolean u;
    public RadioGroup v;
    public RadioButton w;
    public ImageView x;
    public List<SubscriptionInfo> y;
    public String z;
    public int m = 101;
    public int n = 102;
    public int o = 103;
    public int p = 104;
    public int q = 105;
    public int r = 0;
    public String A = null;
    public String B = null;
    public Boolean I = Boolean.FALSE;
    public int J = 1;
    public int K = 2;
    public String L = C0059ao.a(1235);
    public String M = C0059ao.a(1236);
    public BroadcastReceiver N = new b();
    public BroadcastReceiver O = new c();
    public BroadcastReceiver P = new d();
    public int S = 0;

    /* compiled from: AxisPay */
    /* renamed from: he0$a */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            he0 he0Var;
            int i2;
            List<String> list = he0.this.R;
            if (list != null && list.size() > 0) {
                do {
                    he0 he0Var2 = he0.this;
                    he0Var2.S = he0Var2.N();
                    he0Var = he0.this;
                    i2 = he0Var.S;
                } while (i2 == he0Var.T);
                he0Var.T = i2;
                he0Var.B = he0Var.R.get(i2);
            }
            he0.this.P();
            dialogInterface.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: he0$b */
    /* loaded from: classes.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int resultCode = getResultCode();
            if (resultCode == -1) {
                he0.this.s = 1;
                he0 he0Var = he0.this;
                String str = he0Var.B;
                he0Var.C = he0Var.W(str, he0.this.A + C0059ao.a(10855) + he0.this.z);
            } else if (resultCode == 1 || resultCode == 2 || resultCode == 3 || resultCode == 4) {
                eg0.B();
                he0.this.s = 2;
                if (he0.this.t != null) {
                    he0.this.t.cancel();
                    he0.this.t.onFinish();
                    he0.this.t = null;
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: he0$c */
    /* loaded from: classes.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getBooleanExtra(C0059ao.a(10851), false)) {
                he0.this.X(R.string.resend_sms);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: he0$d */
    /* loaded from: classes.dex */
    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int resultCode = getResultCode();
            if (resultCode == -1) {
                he0.this.s = 3;
                if (he0.this.t != null) {
                    he0.this.t.cancel();
                    he0.this.t.onFinish();
                    he0.this.t = null;
                }
            } else if (resultCode != 0) {
            } else {
                he0.this.s = 4;
                if (he0.this.t != null) {
                    he0.this.t.cancel();
                    he0.this.t.onFinish();
                    he0.this.t = null;
                }
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: he0$e */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            he0.this.k().onBackPressed();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: he0$f */
    /* loaded from: classes.dex */
    public class f implements RadioGroup.OnCheckedChangeListener {
        public f() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            View findViewById = radioGroup.findViewById(i);
            he0.this.r = radioGroup.indexOfChild(findViewById);
            n70.f.a().v(C0059ao.a(10056), ((SubscriptionInfo) he0.this.y.get(he0.this.r)).getSubscriptionId());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: he0$g */
    /* loaded from: classes.dex */
    public class g extends CountDownTimer {
        public g(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (he0.this.s != 3) {
                he0.this.X(R.string.resend_sms_alert);
            } else {
                if (c70.m(he0.this.getContext())) {
                    he0 he0Var = he0.this;
                    if (he0Var.C) {
                        eg0.C(he0Var.k(), null);
                        ua0.e(he0.this.k()).q(new OliveRequest(22, 25, he0.this.z));
                    }
                }
                he0.this.X(R.string.enable_mobile_network);
            }
            he0.this.u = false;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            he0.this.u = true;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: he0$h */
    /* loaded from: classes.dex */
    public class h extends TypeToken<List<CustomerBankAccounts>> {
        public h(he0 he0Var) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: he0$i */
    /* loaded from: classes.dex */
    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            he0.this.k().finish();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: he0$j */
    /* loaded from: classes.dex */
    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            he0 he0Var = he0.this;
            he0Var.S = 0;
            he0Var.k().finish();
        }
    }

    public static he0 S(int i2) {
        U = i2;
        return new he0();
    }

    public final int N() {
        Random random = new Random();
        if (this.R.size() == 1) {
            return random.nextInt(this.R.size());
        }
        return random.nextInt(this.R.size() - 1);
    }

    public final void O() {
        AlertDialog alertDialog = this.H;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.H.dismiss();
    }

    public final void P() {
        if (this.A != null && this.B != null) {
            n70.f.a().y(C0059ao.a(1237), c70.e(k()));
            String str = C0059ao.a(1238) + c70.h();
            this.z = str;
            TransportConstants.regRandom = str;
            eg0.i(k());
            U();
            return;
        }
        eg0.i(k());
        ua0.e(k()).q(new OliveRequest(22, 40, C0059ao.a(1239)));
    }

    public void Q() {
        if (R()) {
            if (Build.VERSION.SDK_INT >= 22) {
                SubscriptionManager from = SubscriptionManager.from(getContext());
                if (from.getActiveSubscriptionInfoCount() >= 1) {
                    List<SubscriptionInfo> activeSubscriptionInfoList = from.getActiveSubscriptionInfoList();
                    this.y = activeSubscriptionInfoList;
                    if (activeSubscriptionInfoList != null) {
                        int size = activeSubscriptionInfoList.size();
                        String[] strArr = new String[size];
                        int i2 = 0;
                        int i3 = 0;
                        for (SubscriptionInfo subscriptionInfo : this.y) {
                            int i4 = i3 + 1;
                            strArr[i3] = subscriptionInfo.getCarrierName() != null ? subscriptionInfo.getCarrierName().toString() : C0059ao.a(1240);
                            i3 = i4;
                        }
                        this.v.removeAllViews();
                        while (i2 < size) {
                            RadioButton radioButton = (RadioButton) LayoutInflater.from(k()).inflate(R.layout.radio_btn, (ViewGroup) null);
                            this.w = radioButton;
                            StringBuilder sb = new StringBuilder();
                            sb.append(strArr[i2]);
                            sb.append(C0059ao.a(1241));
                            int i5 = i2 + 1;
                            sb.append(i5);
                            sb.append(C0059ao.a(1242));
                            radioButton.setText(sb.toString());
                            this.w.setId(View.generateViewId());
                            this.v.addView(this.w);
                            if (i2 == this.r) {
                                this.w.setChecked(true);
                                this.r = this.v.indexOfChild(this.w);
                            }
                            if (this.y.size() == 1) {
                                this.v.setVisibility(8);
                            }
                            i2 = i5;
                        }
                    }
                    this.v.setOnCheckedChangeListener(new f());
                }
            }
            this.D.setTag(Integer.valueOf(this.J));
            this.D.setText(R.string.proceed);
            this.D.setEnabled(true);
            this.D.setBackgroundColor(t8.d(k(), R.color.colorPrimary));
            this.l.setVisibility(8);
        }
    }

    public final boolean R() {
        if (j(C0059ao.a(1243), this.m)) {
            int i2 = this.o;
            String a2 = C0059ao.a(1244);
            if (j(a2, i2)) {
                if (j(C0059ao.a(1245), this.o)) {
                    if (j(C0059ao.a(1246), this.p)) {
                        if (j(C0059ao.a(1247), this.q)) {
                            if (j(C0059ao.a(1248), this.q)) {
                                return j(a2, this.n);
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void T() {
        k().registerReceiver(this.N, new IntentFilter(this.L));
        k().registerReceiver(this.P, new IntentFilter(this.M));
        k().registerReceiver(this.O, new IntentFilter(C0059ao.a(1249)));
    }

    public final void U() {
        if (c70.m(getContext())) {
            eg0.C(k(), getString(R.string.sending_sms));
            String str = this.B;
            V(str, this.A + C0059ao.a(1250) + this.z);
            return;
        }
        X(R.string.enable_mobile_network);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r11.I = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Ld
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lf
        Ld:
            r1 = 1073741824(0x40000000, float:2.0)
        Lf:
            z r2 = r11.k()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = r11.L
            r3.<init>(r4)
            r4 = 0
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r2, r4, r3, r1)
            z r2 = r11.k()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r5 = r11.M
            r3.<init>(r5)
            android.app.PendingIntent r10 = android.app.PendingIntent.getBroadcast(r2, r4, r3, r1)
            r1 = 0
            java.util.List<android.telephony.SubscriptionInfo> r2 = r11.y
            if (r2 == 0) goto L52
            int r2 = r2.size()
            int r3 = r11.r
            if (r2 <= r3) goto L52
            r2 = 22
            if (r0 < r2) goto L50
            java.util.List<android.telephony.SubscriptionInfo> r0 = r11.y
            java.lang.Object r0 = r0.get(r3)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            int r0 = r0.getSubscriptionId()
            android.telephony.SmsManager r0 = android.telephony.SmsManager.getSmsManagerForSubscriptionId(r0)
            goto L56
        L50:
            r5 = r1
            goto L57
        L52:
            android.telephony.SmsManager r0 = android.telephony.SmsManager.getDefault()
        L56:
            r5 = r0
        L57:
            if (r5 == 0) goto L63
            r7 = 0
            r6 = r12
            r8 = r13
            r5.sendTextMessage(r6, r7, r8, r9, r10)
            r11.Y()
            goto L69
        L63:
            r12 = 2131887048(0x7f1203c8, float:1.9408692E38)
            r11.X(r12)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he0.V(java.lang.String, java.lang.String):void");
    }

    public final boolean W(String str, String str2) {
        Uri parse = Uri.parse(C0059ao.a(1251));
        ContentResolver contentResolver = this.Q.getContentResolver();
        String a2 = C0059ao.a(1252);
        String a3 = C0059ao.a(1253);
        String a4 = C0059ao.a(1254);
        String a5 = C0059ao.a(1255);
        Cursor query = contentResolver.query(parse, new String[]{a2, a3, a4, a5}, null, null, null);
        boolean z = false;
        if (query != null) {
            int min = Math.min(query.getCount(), 5);
            if (query.moveToFirst()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= min) {
                        break;
                    }
                    String string = query.getString(query.getColumnIndexOrThrow(a3));
                    String string2 = query.getString(query.getColumnIndexOrThrow(a5));
                    String substring = string.length() > 10 ? string.substring(string.length() - 10, string.length()) : str;
                    if (str.length() > 10) {
                        str = str.substring(str.length() - 10, str.length());
                    }
                    if (substring.equalsIgnoreCase(str) && string2.equalsIgnoreCase(str2)) {
                        query.close();
                        z = true;
                        break;
                    }
                    query.moveToNext();
                    i2++;
                }
            }
            query.close();
        }
        return z;
    }

    public final void X(int i2) {
        this.I = Boolean.FALSE;
        eg0.B();
        if (isDetached() || k() == null) {
            return;
        }
        O();
        AlertDialog.Builder builder = new AlertDialog.Builder(k());
        builder.setMessage(i2);
        builder.setNegativeButton(R.string.cancel_text, new j());
        builder.setPositiveButton(R.string.retry, new a());
        builder.show();
    }

    public void Y() {
        g gVar = new g(30000L, 1000L);
        this.t = gVar;
        gVar.start();
    }

    @Override // defpackage.xc0
    public void l(int i2) {
        super.l(i2);
        this.l.setVisibility(0);
        this.D.setTag(Integer.valueOf(this.K));
        this.D.setText(R.string.set_permissions);
        this.D.setEnabled(true);
        this.D.setBackgroundColor(t8.d(this.Q, R.color.colorPrimary));
    }

    @Override // defpackage.xc0
    public void m(int i2) {
        super.m(i2);
        this.l.setVisibility(8);
        Q();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue == this.K) {
            Intent intent = new Intent();
            intent.setAction(C0059ao.a(1256));
            intent.setData(Uri.fromParts(C0059ao.a(1257), k().getPackageName(), null));
            startActivity(intent);
        } else if (intValue == this.J) {
            P();
        }
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i2, Object obj) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mobile_number_verification, viewGroup, false);
        this.Q = getActivity();
        this.v = (RadioGroup) inflate.findViewById(R.id.myRadioGroup);
        this.F = (ImageView) inflate.findViewById(R.id.back_arrow);
        this.l = (LinearLayout) inflate.findViewById(R.id.permision_layout);
        Button button = (Button) inflate.findViewById(R.id.button_proceed);
        this.D = button;
        button.setOnClickListener(this);
        this.E = (TextView) inflate.findViewById(R.id.msg);
        EditText editText = (EditText) inflate.findViewById(R.id.input_mobile);
        this.D.setEnabled(false);
        this.D.setBackgroundColor(t8.d(k(), R.color.colorDivider));
        this.x = (ImageView) inflate.findViewById(R.id.image);
        this.F.setOnClickListener(new e());
        Q();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        CountDownTimer countDownTimer = this.t;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroy();
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        String string = result.getResult() == null ? getString(R.string.Miscellaneous_App_Error) : result.getResult();
        if (!n(oliveRequest, result)) {
            if (oliveRequest.getRequestType() == 40) {
                if (result.getCode().equals(C0059ao.a(1258))) {
                    jg0.W(k());
                } else {
                    eg0.m(k(), string);
                }
            } else if (oliveRequest.getRequestType() != 5 && oliveRequest.getRequestType() != 25) {
                eg0.h(k(), null, getString(R.string.Miscellaneous_App_Error));
            } else {
                eg0.B();
                if (oliveRequest.getRequestType() == 25) {
                    if (!this.I.booleanValue()) {
                        return;
                    }
                    if (result.code.equals(C0059ao.a(1259))) {
                        eg0.f(k(), C0059ao.a(1260), getString(R.string.customer_block), getString(R.string.exit), new i());
                    } else {
                        eg0.A(k(), result.getResult());
                        X(R.string.resend_sms_alert);
                    }
                }
            }
        }
        eg0.B();
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        CountDownTimer countDownTimer = this.t;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.t.onFinish();
            this.t = null;
        }
    }

    @Override // defpackage.xc0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ua0.e(k()).u(this);
        ua0.e(k()).v(null);
        if (U == 13) {
            this.E.setVisibility(0);
        } else {
            this.E.setVisibility(8);
        }
        T();
        v(22, getString(R.string.mobile_number));
        if (this.I.booleanValue()) {
            if (this.s != 3) {
                X(R.string.resend_sms);
                return;
            }
            return;
        }
        if (this.G) {
            Q();
        }
        this.G = true;
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        String code = result.getCode();
        int requestType = oliveRequest.getRequestType();
        if (requestType == 4) {
            eg0.B();
            startActivity(new Intent(k(), MainActivity.class));
            k().finish();
            return;
        }
        String a2 = C0059ao.a(1261);
        if (requestType != 5) {
            if (requestType != 25) {
                if (requestType == 40) {
                    eg0.B();
                    if (!result.getCode().equals(a2) || result.getData() == null) {
                        return;
                    }
                    HealthCheck healthCheck = (HealthCheck) result.getData();
                    this.A = healthCheck.getKeyword_msg();
                    String aggregators = healthCheck.getAggregators();
                    if (!TextUtils.isEmpty(aggregators)) {
                        this.R = Arrays.asList(aggregators.split(C0059ao.a(1262)));
                        int N = N();
                        this.S = N;
                        this.T = N;
                        this.B = this.R.get(N);
                    } else {
                        this.B = healthCheck.getService_provider_num();
                    }
                    P();
                    return;
                } else if (requestType != 89) {
                    if (this.g == oliveRequest.getInitiator()) {
                        eg0.B();
                        return;
                    }
                    return;
                }
            }
            if (this.I.booleanValue()) {
                if (code.equals(a2)) {
                    eg0.B();
                    this.x.setImageDrawable(t8.f(k(), R.drawable.smart_phone_icon_success));
                    n70.a aVar = n70.f;
                    aVar.a().y(C0059ao.a(1263), C0059ao.a(1264));
                    aVar.a().y(C0059ao.a(1265), C0059ao.a(1266));
                    Registration registration = (Registration) result.getData();
                    if (registration.getType() != null && registration.getType().equalsIgnoreCase(C0059ao.a(1267))) {
                        aVar.a().A(C0059ao.a(1268), true);
                    }
                    if (!TextUtils.isEmpty(registration.getNotification()) && registration.getType() != null && registration.getType().equalsIgnoreCase(C0059ao.a(1269))) {
                        aVar.a().y(C0059ao.a(1270), registration.getNotification());
                    }
                    String customerBankAccountsenc = registration.getCustomerBankAccountsenc();
                    if (!TextUtils.isEmpty(customerBankAccountsenc)) {
                        registration.setCustomerBankAccountses((ArrayList) new Gson().fromJson(new String(OliveUpiManager.getInstance(k()).getDecryptedData(customerBankAccountsenc)), new h(this).getType()));
                    }
                    if (U == 13) {
                        qa0.v().m0(registration.getCustomerBankAccountses(), k());
                        this.b.t(72, null);
                    } else {
                        pa0.a().f(registration);
                        this.b.t(74, 22);
                    }
                }
                eg0.B();
                return;
            }
            return;
        }
        if (!code.equals(a2)) {
            eg0.A(k(), result.getResult());
        }
        eg0.B();
    }
}
