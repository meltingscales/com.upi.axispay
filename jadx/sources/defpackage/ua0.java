package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiEventListener;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Bank;
import com.olive.upi.transport.model.Banner;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.BillPayDataMaxAmount;
import com.olive.upi.transport.model.BillerCategory;
import com.olive.upi.transport.model.BillerCircle;
import com.olive.upi.transport.model.BillerRegEnqResponse;
import com.olive.upi.transport.model.Collectbeneblock;
import com.olive.upi.transport.model.CustomerBankAccounts;
import com.olive.upi.transport.model.DTHOperator;
import com.olive.upi.transport.model.MasterUpdate;
import com.olive.upi.transport.model.OperatorsLogos;
import com.olive.upi.transport.model.PendingReqVo;
import com.olive.upi.transport.model.TranHistory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ua0  reason: default package */
/* loaded from: classes.dex */
public class ua0 implements OliveUpiEventListener {
    public static ua0 e;
    public Activity b;
    public OliveUpiManager c;
    public e d;

    /* compiled from: AxisPay */
    /* renamed from: ua0$a */
    /* loaded from: classes.dex */
    public class a extends TypeToken<List<Banner>> {
        public a(ua0 ua0Var) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ua0$b */
    /* loaded from: classes.dex */
    public class b extends TypeToken<BillPayDataMaxAmount> {
        public b(ua0 ua0Var) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ua0$c */
    /* loaded from: classes.dex */
    public class c extends TypeToken<ArrayList<OperatorsLogos>> {
        public c(ua0 ua0Var) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ua0$d */
    /* loaded from: classes.dex */
    public class d extends TypeToken<List<DTHOperator>> {
        public d(ua0 ua0Var) {
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ua0$e */
    /* loaded from: classes.dex */
    public interface e {
        void onCommonLibResponse(int i, Object obj);

        void onFailureResponse(OliveRequest oliveRequest, Result result);

        void onSuccessResponse(OliveRequest oliveRequest, Result result);
    }

    public static ua0 d() {
        if (e == null) {
            e = new ua0();
        }
        return e;
    }

    public static ua0 e(Activity activity) {
        if (e == null) {
            e = new ua0();
        }
        e.t(activity);
        return e;
    }

    public void a(boolean z, OliveRequest oliveRequest) {
        ArrayList<Collectbeneblock> q = qa0.v().q();
        if (q != null && q.size() != 0 && !z) {
            Result result = new Result();
            result.setCode(C0059ao.a(7926));
            result.setData(q);
            this.d.onSuccessResponse(new OliveRequest(53), result);
            return;
        }
        i().sendRequest(oliveRequest);
    }

    public void b(boolean z, OliveRequest oliveRequest) {
        ArrayList<CustomerBankAccounts> E = qa0.v().E();
        if (E != null && E.size() != 0 && !z) {
            Result result = new Result();
            result.setCode(C0059ao.a(7927));
            result.setData(E);
            this.d.onSuccessResponse(new OliveRequest(15), result);
            return;
        }
        i().sendRequest(oliveRequest);
    }

    public void c(String str, String str2, String str3, boolean z, boolean z2) {
        ArrayList<TranHistory> K = qa0.v().K();
        if (K != null && K.size() != 0 && !z) {
            Result result = new Result();
            result.setCode(C0059ao.a(7928));
            result.setData(K);
            this.d.onSuccessResponse(new OliveRequest(26), result);
            return;
        }
        i().getAllTransactionHistory(str, str2, str3, z2);
    }

    public String f() {
        return i().getLastTransactionId();
    }

    public void g(boolean z, OliveRequest oliveRequest) {
        ArrayList<TranHistory> G = qa0.v().G();
        if (G != null && G.size() != 0 && !z) {
            Result result = new Result();
            result.setCode(C0059ao.a(7929));
            result.setData(G);
            this.d.onSuccessResponse(oliveRequest, result);
            return;
        }
        i().sendRequest(oliveRequest);
    }

    public void h(boolean z, OliveRequest oliveRequest) {
        ArrayList<Bank> j = qa0.v().j();
        if (j != null && j.size() != 0 && !z) {
            Result result = new Result();
            result.setCode(C0059ao.a(7930));
            result.setData(j);
            this.d.onSuccessResponse(new OliveRequest(21), result);
            return;
        }
        i().sendRequest(oliveRequest);
    }

    public final OliveUpiManager i() {
        OliveUpiManager oliveUpiManager = OliveUpiManager.getInstance(this.b);
        this.c = oliveUpiManager;
        return oliveUpiManager;
    }

    public void j(boolean z, OliveRequest oliveRequest) {
        ArrayList<BeneVpa> F = qa0.v().F();
        if (F != null && F.size() != 0 && !z) {
            Result result = new Result();
            result.setCode(C0059ao.a(7931));
            result.setData(F);
            this.d.onSuccessResponse(new OliveRequest(18), result);
            return;
        }
        i().sendRequest(oliveRequest);
    }

    public boolean k() {
        return i().isPaymentServiceInitialised();
    }

    public final boolean l(int i, int i2) {
        return i > i2;
    }

    public void m(OliveRequest oliveRequest) {
        MasterUpdate B = qa0.v().B();
        if (B != null && !l(B.getBanner(), n70.f.a().j(C0059ao.a(7932)))) {
            ArrayList<Banner> arrayList = (ArrayList) new Gson().fromJson(r(46), new a(this).getType());
            if (arrayList != null && arrayList.size() != 0) {
                Result result = new Result();
                result.setCode(C0059ao.a(7933));
                result.setData(arrayList);
                qa0.v().T(arrayList);
                this.d.onSuccessResponse(oliveRequest, result);
                return;
            }
            i().sendRequest(oliveRequest);
            return;
        }
        i().sendRequest(oliveRequest);
    }

    public void n(OliveRequest oliveRequest) {
        MasterUpdate B = qa0.v().B();
        if (B != null && !l(B.getBill_pay_max(), n70.f.a().j(C0059ao.a(7934)))) {
            BillPayDataMaxAmount billPayDataMaxAmount = (BillPayDataMaxAmount) new Gson().fromJson(r(oliveRequest.getRequestType()), new b(this).getType());
            if (billPayDataMaxAmount != null) {
                Result result = new Result();
                result.setCode(C0059ao.a(7935));
                result.setData(billPayDataMaxAmount);
                qa0.v().V(billPayDataMaxAmount);
                this.d.onSuccessResponse(oliveRequest, result);
                return;
            }
            i().sendRequest(oliveRequest);
            return;
        }
        i().sendRequest(oliveRequest);
    }

    public void o(OliveRequest oliveRequest) {
        MasterUpdate B = qa0.v().B();
        if (B != null && !l(B.getDthOperator(), n70.f.a().j(C0059ao.a(7936)))) {
            ArrayList<DTHOperator> arrayList = (ArrayList) new Gson().fromJson(r(oliveRequest.getRequestType()), new d(this).getType());
            if (arrayList != null && arrayList.size() != 0) {
                Result result = new Result();
                result.setCode(C0059ao.a(7937));
                result.setData(arrayList);
                qa0.v().a0(arrayList);
                this.d.onSuccessResponse(oliveRequest, result);
                return;
            }
            i().sendRequest(oliveRequest);
            return;
        }
        i().sendRequest(oliveRequest);
    }

    @Override // com.olive.upi.transport.OliveUpiEventListener
    public void onCommonLibResponse(int i, Object obj) {
        this.d.onCommonLibResponse(i, obj);
    }

    @Override // com.olive.upi.transport.OliveUpiEventListener
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        int requestType = oliveRequest.getRequestType();
        if (requestType != 39) {
            if (requestType != 51) {
                if (requestType != 61) {
                    this.d.onFailureResponse(oliveRequest, result);
                    return;
                } else {
                    this.d.onFailureResponse(oliveRequest, null);
                    return;
                }
            }
            this.d.onFailureResponse(oliveRequest, null);
        }
        Intent intent = new Intent(this.b.getPackageName() + C0059ao.a(7938));
        intent.putExtra(C0059ao.a(7939), result.code);
        intent.putExtra(C0059ao.a(7940), result.result);
        this.b.sendBroadcast(intent);
    }

    @Override // com.olive.upi.transport.OliveUpiEventListener
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        MasterUpdate B = qa0.v().B();
        int requestType = oliveRequest.getRequestType();
        if (requestType == 15) {
            ArrayList<CustomerBankAccounts> arrayList = (ArrayList) result.getData();
            if (arrayList != null) {
                qa0.v().m0(arrayList, this.b);
            }
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 18) {
            ArrayList<BeneVpa> arrayList2 = (ArrayList) result.getData();
            if (arrayList2 != null) {
                qa0.v().n0(arrayList2);
            }
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 21) {
            ArrayList<Bank> arrayList3 = (ArrayList) result.getData();
            Collections.sort(arrayList3, Bank.bankNameComparator);
            qa0.v().R(arrayList3);
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 31) {
            ArrayList<CustomerBankAccounts> arrayList4 = (ArrayList) result.getData();
            qa0.v().m0(arrayList4, this.b);
            jg0.S(this.b, arrayList4);
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 34) {
            qa0.v().o0((ArrayList) result.getData());
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 39) {
            Intent intent = new Intent(this.b.getPackageName() + C0059ao.a(7945));
            intent.putExtra(C0059ao.a(7946), C0059ao.a(7947));
            this.b.sendBroadcast(intent);
        } else if (requestType == 46) {
            ArrayList<Banner> arrayList5 = (ArrayList) result.getData();
            qa0.v().T(arrayList5);
            s(new Gson().toJson(arrayList5), oliveRequest.getRequestType());
            if (B != null) {
                n70.f.a().v(C0059ao.a(7944), B.getBanner());
            }
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 53) {
            qa0.v().X((ArrayList) result.getData());
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 72) {
            qa0.v().c0((ArrayList) result.getData());
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 560) {
            qa0.v().Z((ArrayList) result.getData());
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 26) {
            qa0.v().t0((ArrayList) result.getData());
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 27) {
            ArrayList<PendingReqVo> arrayList6 = (ArrayList) result.getData();
            if (arrayList6 != null && arrayList6.size() > 0) {
                Collections.sort(arrayList6);
                qa0.v().q0(arrayList6, this.b);
            }
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 50) {
            BillPayDataMaxAmount billPayDataMaxAmount = (BillPayDataMaxAmount) result.getData();
            qa0.v().j0(billPayDataMaxAmount);
            s(new Gson().toJson(billPayDataMaxAmount), oliveRequest.getRequestType());
            if (B != null) {
                n70.f.a().v(C0059ao.a(7943), B.getBill_pay_max());
            }
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 51) {
            ArrayList<DTHOperator> arrayList7 = (ArrayList) result.getData();
            qa0.v().a0(arrayList7);
            s(new Gson().toJson(arrayList7), oliveRequest.getRequestType());
            if (B != null) {
                n70.f.a().v(C0059ao.a(7942), B.getDthOperator());
            }
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType == 60) {
            qa0.v().k0((ArrayList) result.getData());
            this.d.onSuccessResponse(oliveRequest, result);
        } else if (requestType != 61) {
            switch (requestType) {
                case 63:
                    ArrayList<BillerCategory> arrayList8 = (ArrayList) result.getData();
                    oa0.f().k(arrayList8);
                    s(new Gson().toJson(arrayList8), oliveRequest.getRequestType());
                    this.d.onSuccessResponse(oliveRequest, result);
                    return;
                case 64:
                    oa0.f().o((ArrayList) result.getData());
                    this.d.onSuccessResponse(oliveRequest, result);
                    return;
                case 65:
                    ArrayList<BillerCircle> arrayList9 = (ArrayList) result.getData();
                    if (arrayList9 != null) {
                        Collections.sort(arrayList9);
                        oa0.f().m(arrayList9);
                    }
                    this.d.onSuccessResponse(oliveRequest, result);
                    return;
                case 66:
                    oa0.f().l((ArrayList) result.getData());
                    this.d.onSuccessResponse(oliveRequest, result);
                    return;
                case 67:
                    ArrayList arrayList10 = (ArrayList) result.getData();
                    if (arrayList10 != null && arrayList10.size() > 0) {
                        oa0.f().n((BillerRegEnqResponse) arrayList10.get(0));
                    }
                    this.d.onSuccessResponse(oliveRequest, result);
                    return;
                default:
                    this.d.onSuccessResponse(oliveRequest, result);
                    return;
            }
        } else {
            ArrayList<OperatorsLogos> arrayList11 = (ArrayList) result.getData();
            qa0.v().l0(arrayList11);
            s(new Gson().toJson(arrayList11), oliveRequest.getRequestType());
            if (B != null) {
                n70.f.a().v(C0059ao.a(7941), B.getMobileOperator());
            }
            this.d.onSuccessResponse(oliveRequest, result);
        }
    }

    public void p(OliveRequest oliveRequest) {
        MasterUpdate B = qa0.v().B();
        if (B != null && !l(B.getMobileOperator(), n70.f.a().j(C0059ao.a(7948)))) {
            ArrayList<OperatorsLogos> arrayList = null;
            try {
                arrayList = (ArrayList) new Gson().fromJson(r(oliveRequest.getRequestType()), new c(this).getType());
            } catch (Exception unused) {
            }
            if (arrayList != null && arrayList.size() != 0) {
                Result result = new Result();
                result.setCode(C0059ao.a(7949));
                result.setData(arrayList);
                qa0.v().l0(arrayList);
                this.d.onSuccessResponse(oliveRequest, result);
                return;
            }
            i().sendRequest(oliveRequest);
            return;
        }
        i().sendRequest(oliveRequest);
    }

    public void q(OliveRequest oliveRequest) {
        i().sendRequest(oliveRequest);
    }

    public String r(int i) {
        File file;
        new File(this.b.getCacheDir().getAbsolutePath() + C0059ao.a(7950)).mkdirs();
        String str = file.getAbsolutePath() + C0059ao.a(7951) + i;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine + C0059ao.a(7952));
            }
        } catch (FileNotFoundException | IOException unused) {
        }
        return stringBuffer.toString();
    }

    public final void s(String str, int i) {
        File file = new File(this.b.getCacheDir().getAbsolutePath() + C0059ao.a(7953));
        file.mkdirs();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getAbsolutePath() + C0059ao.a(7954) + i));
            bufferedWriter.write(str);
            bufferedWriter.close();
        } catch (Exception unused) {
        }
    }

    public void t(Activity activity) {
        this.b = activity;
    }

    public void u(e eVar) {
        this.d = eVar;
        i().setListener(this);
    }

    public void v(String str) {
        i().setToken(str);
    }

    public void w() {
        i().userDeRegister();
    }

    public void x() {
        i().userLogout();
    }
}
