package com.olive.upi.transport;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.api.UpiService;
import com.olive.upi.transport.model.AcRequest;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.AccountOTPRequest;
import com.olive.upi.transport.model.AcctUpdateReq;
import com.olive.upi.transport.model.Authenticate;
import com.olive.upi.transport.model.AuthorizeMandateRequest;
import com.olive.upi.transport.model.BRequest;
import com.olive.upi.transport.model.Bank;
import com.olive.upi.transport.model.Banner;
import com.olive.upi.transport.model.BannerOffersVo;
import com.olive.upi.transport.model.BbpsHistory;
import com.olive.upi.transport.model.BbpsPay;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.BeneVpaBlock;
import com.olive.upi.transport.model.BillPay;
import com.olive.upi.transport.model.BillPayDataMaxAmount;
import com.olive.upi.transport.model.BillPaymentEnqRequst;
import com.olive.upi.transport.model.BillerCategory;
import com.olive.upi.transport.model.BillerChargeReq;
import com.olive.upi.transport.model.BillerChargeRes;
import com.olive.upi.transport.model.BillerCircle;
import com.olive.upi.transport.model.BillerField;
import com.olive.upi.transport.model.BillerForm;
import com.olive.upi.transport.model.BillerLocation;
import com.olive.upi.transport.model.BillerRegEnqResponse;
import com.olive.upi.transport.model.Billers;
import com.olive.upi.transport.model.ChangeAppPin;
import com.olive.upi.transport.model.ChangeCredReq;
import com.olive.upi.transport.model.CheckStatus;
import com.olive.upi.transport.model.ClTokenReq;
import com.olive.upi.transport.model.Collect;
import com.olive.upi.transport.model.CollectPayRequest;
import com.olive.upi.transport.model.Collectbeneblock;
import com.olive.upi.transport.model.ComplaintResponse;
import com.olive.upi.transport.model.CreditLineBalReqest;
import com.olive.upi.transport.model.CustomerAcRequest;
import com.olive.upi.transport.model.CustomerBankAccounts;
import com.olive.upi.transport.model.CustomerReg;
import com.olive.upi.transport.model.CustomerVpaAccounts;
import com.olive.upi.transport.model.DTHOperator;
import com.olive.upi.transport.model.GetMandate;
import com.olive.upi.transport.model.HealthCheck;
import com.olive.upi.transport.model.Inbox;
import com.olive.upi.transport.model.InstacardView;
import com.olive.upi.transport.model.IntentData;
import com.olive.upi.transport.model.LimitCheckReq;
import com.olive.upi.transport.model.MandateExecute;
import com.olive.upi.transport.model.MandatesVo;
import com.olive.upi.transport.model.OperatorsLogos;
import com.olive.upi.transport.model.PayRequest;
import com.olive.upi.transport.model.PayeeInitiatedMandate;
import com.olive.upi.transport.model.PayerInitiatedMandate;
import com.olive.upi.transport.model.PendingMandateReqVo;
import com.olive.upi.transport.model.PendingReqVo;
import com.olive.upi.transport.model.PrefixMobile;
import com.olive.upi.transport.model.RecentBPTHistory;
import com.olive.upi.transport.model.RechargePlanParam;
import com.olive.upi.transport.model.Rechargeplan;
import com.olive.upi.transport.model.RecurrenceAuthorization;
import com.olive.upi.transport.model.RecurrenceResVo;
import com.olive.upi.transport.model.RegRequest;
import com.olive.upi.transport.model.RegisterBiller;
import com.olive.upi.transport.model.Registration;
import com.olive.upi.transport.model.ReqComplientVo;
import com.olive.upi.transport.model.ReqMandateTxn;
import com.olive.upi.transport.model.SafetynetSignedAttestation;
import com.olive.upi.transport.model.SetProfile;
import com.olive.upi.transport.model.SetuResponse;
import com.olive.upi.transport.model.TokenResponse;
import com.olive.upi.transport.model.TranHistory;
import com.olive.upi.transport.model.UpdateMandateRequest;
import com.olive.upi.transport.model.UrlConfig;
import com.olive.upi.transport.model.VerifyMarchantResponse;
import com.olive.upi.transport.model.VerifyVPA;
import com.olive.upi.transport.model.VpaVerify;
import com.olive.upi.transport.service.CryptLibOne;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import myunmn.C0059ao;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionSpec;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TransportManager {
    private static final int CODE_UNAUTHORIZED = 0;
    private static TransportManager manager;
    private static UpiService safetyNetService;
    private static UpiService setuService;
    private static UpiService upiPaymentService;
    private static UpiService upiService;
    public String checkSum;
    public UPIConnectionListener listener;
    public String token;
    public String TAG = C0059ao.a(4122);
    public Interceptor interceptor = new Interceptor() { // from class: com.olive.upi.transport.TransportManager.1
        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            Request.Builder newBuilder = request.newBuilder();
            TransportManager transportManager = TransportManager.this;
            if (transportManager.token != null) {
                newBuilder.header(C0059ao.a(15260), transportManager.getToken());
            }
            if (TransportConstants.sk != null && TransportManager.this.getCheckSum() != null) {
                newBuilder.header(C0059ao.a(15261), TransportManager.this.getCheckSum());
            }
            newBuilder.header(C0059ao.a(15262), c70.j());
            newBuilder.header(C0059ao.a(15263), String.valueOf(System.currentTimeMillis()));
            newBuilder.header(C0059ao.a(15265), n70.f.a().m(C0059ao.a(15264)));
            newBuilder.method(request.method(), request.body());
            TransportManager.this.setCheckSum(null);
            return chain.proceed(newBuilder.build());
        }
    };

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface UPIConnectionListener {
        void onFailureResponse(OliveRequest oliveRequest, Object obj);

        void onSuccessResponse(OliveRequest oliveRequest, Result result);
    }

    static {
        C0059ao.a(TransportManager.class, 125);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String a = C0059ao.a(4123);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                a = a + readLine;
            } else {
                inputStream.close();
                return a;
            }
        }
    }

    private OkHttpClient getHttpClient(boolean z) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.interceptors().add(this.interceptor);
        if (!z) {
            builder.retryOnConnectionFailure(false);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder.connectTimeout(10L, timeUnit);
            builder.readTimeout(90L, timeUnit);
        } else {
            builder.retryOnConnectionFailure(true);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            builder.connectTimeout(10L, timeUnit2);
            builder.readTimeout(90L, timeUnit2);
        }
        builder.connectionSpecs(Arrays.asList(ConnectionSpec.MODERN_TLS, ConnectionSpec.COMPATIBLE_TLS));
        String m = n70.f.a().m(C0059ao.a(4124));
        if (TextUtils.isEmpty(m)) {
            m = C0059ao.a(4125);
        }
        String a = C0059ao.a(4127);
        builder.certificatePinner(new CertificatePinner.Builder().add(a, C0059ao.a(4126)).add(a, C0059ao.a(4128)).add(a, C0059ao.a(4129)).add(a, C0059ao.a(4130)).add(a, C0059ao.a(4131)).add(a, m).build());
        return builder.build();
    }

    public static TransportManager getInstance(UPIConnectionListener uPIConnectionListener) {
        if (manager == null) {
            manager = new TransportManager();
        }
        manager.setListener(uPIConnectionListener);
        return manager;
    }

    public static boolean validateCheksum(String str, String str2) {
        CryptLibOne cryptLibOne = new CryptLibOne();
        try {
            return Arrays.equals(cryptLibOne.SHA256(str2), cryptLibOne.decrypt(Base64.decode(str, 2), cryptLibOne.hexStringToByteArray(TransportConstants.sk)));
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public void accountMobReg(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIPaymentService().accountMobileReg((RegRequest) oliveRequest.getRequestData()).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.13
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4132));
        }
    }

    public void accountRemove(Context context, final OliveRequest oliveRequest) {
        AcctUpdateReq acctUpdateReq = (AcctUpdateReq) oliveRequest.getRequestData();
        if (c70.n(context)) {
            caluclateCheckSum(acctUpdateReq.getInput());
            getUPIService().accountRemove(acctUpdateReq).enqueue(new Callback<Result<List<CustomerBankAccounts>>>() { // from class: com.olive.upi.transport.TransportManager.25
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<CustomerBankAccounts>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<CustomerBankAccounts>>> call, retrofit2.Response<Result<List<CustomerBankAccounts>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4133));
    }

    public void authenticate(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            Authenticate authenticate = (Authenticate) oliveRequest.getRequestData();
            getUPIService().authenticate(authenticate.getUsername(), authenticate.getPassword(), authenticate.getDevice()).enqueue(new Callback<Result<TokenResponse>>() { // from class: com.olive.upi.transport.TransportManager.19
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<TokenResponse>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<TokenResponse>> call, retrofit2.Response<Result<TokenResponse>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4134));
    }

    public void balanceEnqForCreditLine(Context context, final OliveRequest oliveRequest) {
        CreditLineBalReqest creditLineBalReqest = (CreditLineBalReqest) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().balanceEnqForCreditLine(creditLineBalReqest).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.78
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4135));
        }
    }

    public void beneBlock(Context context, String str, final OliveRequest oliveRequest) {
        ArrayList<BeneVpaBlock> arrayList = (ArrayList) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().blockedVpa(str, arrayList).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.51
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4136));
        }
    }

    public void billPay(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIPaymentService().billPay((BillPay) oliveRequest.getRequestData()).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.44
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4137));
        }
    }

    public void calculateCharges(Context context, final OliveRequest oliveRequest) {
        BillerChargeReq billerChargeReq = (BillerChargeReq) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().calculateCharge(billerChargeReq).enqueue(new Callback<Result<BillerChargeRes>>() { // from class: com.olive.upi.transport.TransportManager.39
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<BillerChargeRes>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<BillerChargeRes>> call, retrofit2.Response<Result<BillerChargeRes>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4138));
        }
    }

    public void caluclateCheckSum(String str) {
        CryptLibOne cryptLibOne = new CryptLibOne();
        try {
            setCheckSum(Base64.encodeToString(cryptLibOne.encrypt(cryptLibOne.SHA256(str), cryptLibOne.hexStringToByteArray(TransportConstants.sk)), 2));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void changePassword(Context context, final OliveRequest oliveRequest) {
        ChangeAppPin changeAppPin = (ChangeAppPin) oliveRequest.getRequestData();
        if (c70.n(context)) {
            caluclateCheckSum(changeAppPin.getInput());
            getUPIService().changePassword(changeAppPin).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.30
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4139));
    }

    public void collect(Context context, final OliveRequest oliveRequest) {
        Collect collect = (Collect) oliveRequest.getRequestData();
        if (c70.n(context)) {
            caluclateCheckSum(collect.getInput());
            getUPIService().collectReq(collect).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.18
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4140));
    }

    public void collectNotification(Context context, final OliveRequest oliveRequest) {
        CollectPayRequest collectPayRequest = (CollectPayRequest) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIPaymentService().collectNotification(collectPayRequest).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.12
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4141));
        }
    }

    public void connectServer(final String str, final String str2, int i) {
        new Thread() { // from class: com.olive.upi.transport.TransportManager.69
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                HttpURLConnection httpURLConnection;
                Throwable th;
                super.run();
                HttpURLConnection httpURLConnection2 = null;
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                } catch (MalformedURLException | IOException unused) {
                } catch (Throwable th2) {
                    httpURLConnection = null;
                    th = th2;
                }
                try {
                    httpURLConnection.setDoOutput(true);
                    new BufferedOutputStream(httpURLConnection.getOutputStream()).write(str2.getBytes());
                    Result result = (Result) new Gson().fromJson(TransportManager.convertInputStreamToString(new BufferedInputStream(httpURLConnection.getInputStream())), (Class<Object>) Result.class);
                    httpURLConnection.disconnect();
                } catch (MalformedURLException | IOException unused2) {
                    httpURLConnection2 = httpURLConnection;
                    httpURLConnection2.disconnect();
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection.disconnect();
                    throw th;
                }
            }
        }.start();
    }

    public void createMandateRequest(Context context, String str, String str2, final OliveRequest oliveRequest) {
        PayerInitiatedMandate payerInitiatedMandate = (PayerInitiatedMandate) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().createMandate(str, str2, payerInitiatedMandate).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.55
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        }
    }

    public void customerReg(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            CustomerReg customerReg = (CustomerReg) oliveRequest.getRequestData();
            getUPIService().customerReg(customerReg.getData(), customerReg.getRefid()).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.9
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4142));
    }

    public void customerSignOff(Context context, String str) {
        final OliveRequest oliveRequest = new OliveRequest(38);
        if (c70.n(context)) {
            caluclateCheckSum(str);
            getUPIService().signOff(str).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.8
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4143));
    }

    public void deRegister(Context context, String str) {
        final OliveRequest oliveRequest = new OliveRequest(39);
        if (c70.n(context)) {
            caluclateCheckSum(str);
            getUPIService().deRegister(str).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.31
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4144));
    }

    public void declineApproveMandate(Context context, String str, String str2, final OliveRequest oliveRequest) {
        AuthorizeMandateRequest authorizeMandateRequest = (AuthorizeMandateRequest) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().declineMandate(str, str2, authorizeMandateRequest).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.59
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.listener.onFailureResponse(oliveRequest, response.message());
                    }
                }
            });
        }
    }

    public void deleteCustomerVpa(Context context, String str, String str2, String str3, String str4, String str5) {
        final OliveRequest oliveRequest = new OliveRequest(44);
        if (c70.n(context)) {
            caluclateCheckSum(str + str2 + str3 + str4 + str5);
            getUPIService().deleteCustomerVpa(str, str2, str3, str4, str5).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.26
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4145));
    }

    public void fetchAccounts(Context context, String str, final OliveRequest oliveRequest) {
        AcRequest acRequest = (AcRequest) oliveRequest.getRequestData();
        if (c70.n(context)) {
            caluclateCheckSum(acRequest.getInput());
            getUPIService().accountFetch(acRequest).enqueue(new Callback<Result<List<Account>>>() { // from class: com.olive.upi.transport.TransportManager.3
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<Account>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<Account>>> call, retrofit2.Response<Result<List<Account>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4146));
    }

    public void fetchAllAccounts(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            CustomerAcRequest customerAcRequest = (CustomerAcRequest) oliveRequest.getRequestData();
            caluclateCheckSum(customerAcRequest.getInput());
            getUPIService().getAllAccounts(customerAcRequest).enqueue(new Callback<Result<List<CustomerBankAccounts>>>() { // from class: com.olive.upi.transport.TransportManager.4
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<CustomerBankAccounts>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<CustomerBankAccounts>>> call, retrofit2.Response<Result<List<CustomerBankAccounts>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4147));
    }

    public void generateToken(Context context, final OliveRequest oliveRequest) {
        String str = (String) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().token(C0059ao.a(4148), str).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.6
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4149));
        }
    }

    public void getBBPSHistory(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().billpayEnquiry((BillPaymentEnqRequst) oliveRequest.getRequestData()).enqueue(new Callback<Result<List<BbpsHistory>>>() { // from class: com.olive.upi.transport.TransportManager.41
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<BbpsHistory>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<BbpsHistory>>> call, retrofit2.Response<Result<List<BbpsHistory>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4150));
        }
    }

    public void getBalance(Context context, final OliveRequest oliveRequest) {
        BRequest bRequest = (BRequest) oliveRequest.getRequestData();
        if (c70.n(context)) {
            caluclateCheckSum(bRequest.getInput());
            getUPIPaymentService().getBal(bRequest).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.15
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4151));
    }

    public void getBanner(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getBanner((String) oliveRequest.getRequestData()).enqueue(new Callback<Result<List<Banner>>>() { // from class: com.olive.upi.transport.TransportManager.45
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<Banner>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<Banner>>> call, retrofit2.Response<Result<List<Banner>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4152));
    }

    public void getBillPayMaxAmounts(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getBillPayMaxAmounts().enqueue(new Callback<Result<BillPayDataMaxAmount>>() { // from class: com.olive.upi.transport.TransportManager.48
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<BillPayDataMaxAmount>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<BillPayDataMaxAmount>> call, retrofit2.Response<Result<BillPayDataMaxAmount>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        }
    }

    public void getBillerCategories(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getBillerCategory().enqueue(new Callback<Result<List<BillerCategory>>>() { // from class: com.olive.upi.transport.TransportManager.61
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<BillerCategory>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<BillerCategory>>> call, retrofit2.Response<Result<List<BillerCategory>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        }
    }

    public void getBillerLocation(Context context, final OliveRequest oliveRequest) {
        BillerLocation billerLocation = (BillerLocation) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().getBillerLocation(billerLocation.getBillerCategory(), billerLocation.getBiller().getCORP_CODE(), billerLocation.getBiller().getMASTR_TYPE(), billerLocation.getBiller().getCIF_ID()).enqueue(new Callback<Result<List<BillerCircle>>>() { // from class: com.olive.upi.transport.TransportManager.64
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<BillerCircle>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<BillerCircle>>> call, retrofit2.Response<Result<List<BillerCircle>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4153));
        }
    }

    public void getBillerRegForm(Context context, final OliveRequest oliveRequest) {
        BillerForm billerForm = (BillerForm) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().getBillerForm(billerForm.getBillerCategory(), billerForm.getBiller().getCORP_CODE(), billerForm.getLocCode(), billerForm.getBiller().getMASTR_TYPE(), billerForm.getBiller().getCIF_ID()).enqueue(new Callback<Result<List<BillerField>>>() { // from class: com.olive.upi.transport.TransportManager.65
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<BillerField>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<BillerField>>> call, retrofit2.Response<Result<List<BillerField>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4154));
        }
    }

    public void getBillers(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getBillerName((String) oliveRequest.getRequestData()).enqueue(new Callback<Result<List<Billers>>>() { // from class: com.olive.upi.transport.TransportManager.63
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<Billers>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<Billers>>> call, retrofit2.Response<Result<List<Billers>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4155));
        }
    }

    public void getBlockBeneVpa(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getBlockedBeneVpa().enqueue(new Callback<Result<List<Collectbeneblock>>>() { // from class: com.olive.upi.transport.TransportManager.50
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<Collectbeneblock>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<Collectbeneblock>>> call, retrofit2.Response<Result<List<Collectbeneblock>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4156));
        }
    }

    public void getChangeMpin(Context context, final OliveRequest oliveRequest) {
        ChangeCredReq changeCredReq = (ChangeCredReq) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIPaymentService().getChangeMpin(changeCredReq).enqueue(new Callback<Result<Void>>() { // from class: com.olive.upi.transport.TransportManager.7
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<Void>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<Void>> call, retrofit2.Response<Result<Void>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4157));
        }
    }

    public void getCheckStatus(Context context, String str, String str2, final OliveRequest oliveRequest) {
        CheckStatus checkStatus = (CheckStatus) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().getcheckStatus(str, str2, checkStatus).enqueue(new Callback<Result<TranHistory>>() { // from class: com.olive.upi.transport.TransportManager.81
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<TranHistory>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<TranHistory>> call, retrofit2.Response<Result<TranHistory>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4158));
        }
    }

    public String getCheckSum() {
        return this.checkSum;
    }

    public void getClToken(Context context, final OliveRequest oliveRequest) {
        ClTokenReq clTokenReq = (ClTokenReq) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().getClToken(clTokenReq).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.77
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4159));
        }
    }

    public void getDthOperator(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getDTH().enqueue(new Callback<Result<List<DTHOperator>>>() { // from class: com.olive.upi.transport.TransportManager.49
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<DTHOperator>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<DTHOperator>>> call, retrofit2.Response<Result<List<DTHOperator>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4160));
        }
    }

    public void getInboxContent(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getInbox().enqueue(new Callback<Result<List<Inbox>>>() { // from class: com.olive.upi.transport.TransportManager.62
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<Inbox>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<Inbox>>> call, retrofit2.Response<Result<List<Inbox>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4161));
        }
    }

    public void getInfo(Activity activity, OliveRequest oliveRequest) {
        if (c70.n(activity)) {
            (oliveRequest.getRequestData() != null ? ((Boolean) oliveRequest.getRequestData()).booleanValue() : false ? getUPIPaymentService() : getUPIService()).getInfo().enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.37
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    response.isSuccessful();
                }
            });
        }
    }

    public void getMobileCircle(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getMobileCircle((String) oliveRequest.getRequestData()).enqueue(new Callback<Result<List<String>>>() { // from class: com.olive.upi.transport.TransportManager.47
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<String>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<String>>> call, retrofit2.Response<Result<List<String>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4162));
        }
    }

    public void getMobileNumber(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getMobile((String) oliveRequest.getRequestData()).enqueue(new Callback<Result<Registration>>() { // from class: com.olive.upi.transport.TransportManager.20
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<Registration>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<Registration>> call, retrofit2.Response<Result<Registration>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4163));
        }
    }

    public void getMobileOperator(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getMobileOperator((String) oliveRequest.getRequestData()).enqueue(new Callback<Result<PrefixMobile>>() { // from class: com.olive.upi.transport.TransportManager.46
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<PrefixMobile>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<PrefixMobile>> call, retrofit2.Response<Result<PrefixMobile>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4164));
        }
    }

    public void getMyVpaAccounts(Context context) {
        final OliveRequest oliveRequest = new OliveRequest(43);
        if (c70.n(context)) {
            getUPIService().getMyVpaAccounts().enqueue(new Callback<Result<List<CustomerVpaAccounts>>>() { // from class: com.olive.upi.transport.TransportManager.5
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<CustomerVpaAccounts>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<CustomerVpaAccounts>>> call, retrofit2.Response<Result<List<CustomerVpaAccounts>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4165));
        }
    }

    public void getOperator(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getoperator().enqueue(new Callback<Result<List<OperatorsLogos>>>() { // from class: com.olive.upi.transport.TransportManager.70
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<OperatorsLogos>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<OperatorsLogos>>> call, retrofit2.Response<Result<List<OperatorsLogos>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4166));
        }
    }

    public void getPendingMandateReq(Context context, String str, String str2, final OliveRequest oliveRequest) {
        GetMandate getMandate = (GetMandate) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().pendingSI(str, str2, getMandate).enqueue(new Callback<Result<List<PendingMandateReqVo>>>() { // from class: com.olive.upi.transport.TransportManager.57
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<PendingMandateReqVo>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<PendingMandateReqVo>>> call, retrofit2.Response<Result<List<PendingMandateReqVo>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.listener.onFailureResponse(oliveRequest, response.message());
                    }
                }
            });
        }
    }

    public void getPendingTransactions(Context context, String str, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            caluclateCheckSum(str);
            getUPIService().getPendingTransactions().enqueue(new Callback<Result<List<PendingReqVo>>>() { // from class: com.olive.upi.transport.TransportManager.23
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<PendingReqVo>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<PendingReqVo>>> call, retrofit2.Response<Result<List<PendingReqVo>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4167));
    }

    public void getPersonalLoan(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getPersonalLoan((String) oliveRequest.getRequestData()).enqueue(new Callback<Result<InstacardView>>() { // from class: com.olive.upi.transport.TransportManager.43
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<InstacardView>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<InstacardView>> call, retrofit2.Response<Result<InstacardView>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4168));
        }
    }

    public void getPlainAccountNumber(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getPlainAccount((String) oliveRequest.getRequestData()).enqueue(new Callback<Result<InstacardView>>() { // from class: com.olive.upi.transport.TransportManager.42
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<InstacardView>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<InstacardView>> call, retrofit2.Response<Result<InstacardView>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4169));
        }
    }

    public void getPromotionalOffers(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().promotionalOffers((String) oliveRequest.getRequestData()).enqueue(new Callback<Result<List<BannerOffersVo>>>() { // from class: com.olive.upi.transport.TransportManager.75
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<BannerOffersVo>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<BannerOffersVo>>> call, retrofit2.Response<Result<List<BannerOffersVo>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4170));
    }

    public void getRaisedQueries(Context context, String str, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            caluclateCheckSum(str);
            getUPIService().listQueries(str).enqueue(new Callback<Result<List<TranHistory>>>() { // from class: com.olive.upi.transport.TransportManager.29
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<TranHistory>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<TranHistory>>> call, retrofit2.Response<Result<List<TranHistory>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4171));
    }

    public void getRechargeHistory(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().getRechargeHistory((String) oliveRequest.getRequestData()).enqueue(new Callback<Result<List<RecentBPTHistory>>>() { // from class: com.olive.upi.transport.TransportManager.36
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<RecentBPTHistory>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<RecentBPTHistory>>> call, retrofit2.Response<Result<List<RecentBPTHistory>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4172));
        }
    }

    public void getRechargePlans(Context context, final OliveRequest oliveRequest) {
        RechargePlanParam rechargePlanParam = (RechargePlanParam) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().getRechargePlans(rechargePlanParam.getServicecode(), rechargePlanParam.getConsumerno(), rechargePlanParam.getSpcode(), rechargePlanParam.getSspcode()).enqueue(new Callback<Result<Rechargeplan>>() { // from class: com.olive.upi.transport.TransportManager.52
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<Rechargeplan>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<Rechargeplan>> call, retrofit2.Response<Result<Rechargeplan>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4173));
        }
    }

    public UpiService getSafetyCheckerService() {
        if (safetyNetService == null) {
            safetyNetService = (UpiService) new Retrofit.Builder().baseUrl(C0059ao.a(4174)).addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create())).build().create(UpiService.class);
        }
        return safetyNetService;
    }

    public UpiService getSetuService() {
        if (setuService == null) {
            setuService = (UpiService) new Retrofit.Builder().baseUrl(C0059ao.a(4175)).addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create())).client(getHttpClient(true)).build().create(UpiService.class);
        }
        return setuService;
    }

    public String getToken() {
        return this.token;
    }

    public void getTransactionHistory(Context context, String str, String str2, String str3, boolean z) {
        int i;
        if (z) {
            i = 626;
        } else {
            i = (TextUtils.isEmpty(str3) || str3 == null) ? 26 : 526;
        }
        final OliveRequest oliveRequest = new OliveRequest(i);
        if (c70.n(context)) {
            caluclateCheckSum(str + str2);
            getUPIService().getTransactionHistory(str, str2, str3).enqueue(new Callback<Result<List<TranHistory>>>() { // from class: com.olive.upi.transport.TransportManager.22
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<TranHistory>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<TranHistory>>> call, retrofit2.Response<Result<List<TranHistory>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4176));
    }

    public UpiService getUPIPaymentService() {
        if (upiPaymentService == null) {
            upiPaymentService = (UpiService) new Retrofit.Builder().baseUrl(TransportConstants.API_BASE_URL).addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create())).client(getHttpClient(false)).build().create(UpiService.class);
        }
        return upiPaymentService;
    }

    public UpiService getUPIService() {
        if (upiService == null) {
            upiService = (UpiService) new Retrofit.Builder().baseUrl(TransportConstants.API_BASE_URL).addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create())).client(getHttpClient(true)).build().create(UpiService.class);
        }
        return upiService;
    }

    public void getVerifiedMerchant(Context context, final OliveRequest oliveRequest) {
        VerifyVPA verifyVPA = (VerifyVPA) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().getVerifiedMerchant(verifyVPA).enqueue(new Callback<Result<VerifyMarchantResponse>>() { // from class: com.olive.upi.transport.TransportManager.83
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<VerifyMarchantResponse>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<VerifyMarchantResponse>> call, retrofit2.Response<Result<VerifyMarchantResponse>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4177));
        }
    }

    public void getWebUrls(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            String str = (String) oliveRequest.getRequestData();
            getUPIService().getWebUrls().enqueue(new Callback<Result<List<UrlConfig>>>() { // from class: com.olive.upi.transport.TransportManager.76
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<UrlConfig>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<UrlConfig>>> call, retrofit2.Response<Result<List<UrlConfig>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4178));
    }

    public void getraiseComplain(Context context, String str, final OliveRequest oliveRequest) {
        ReqComplientVo reqComplientVo = (ReqComplientVo) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().getRaiseComplain(str, reqComplientVo).enqueue(new Callback<Result<ComplaintResponse>>() { // from class: com.olive.upi.transport.TransportManager.82
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<ComplaintResponse>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<ComplaintResponse>> call, retrofit2.Response<Result<ComplaintResponse>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4179));
        }
    }

    public boolean isPaymentServiceInitialised() {
        return upiPaymentService != null;
    }

    public void listBanks(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().listBanks().enqueue(new Callback<Result<List<Bank>>>() { // from class: com.olive.upi.transport.TransportManager.17
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<Bank>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<Bank>>> call, retrofit2.Response<Result<List<Bank>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4180));
        }
    }

    public void listKeys(Context context, String str, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            caluclateCheckSum(str);
            getUPIService().listKeys().enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.33
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4181));
    }

    public void listVpa(Context context, String str, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            caluclateCheckSum(str);
            getUPIService().listVPA(str).enqueue(new Callback<Result<List<BeneVpa>>>() { // from class: com.olive.upi.transport.TransportManager.16
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<BeneVpa>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<BeneVpa>>> call, retrofit2.Response<Result<List<BeneVpa>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4182));
    }

    public void mandateExecute(Context context, String str, String str2, final OliveRequest oliveRequest) {
        MandateExecute mandateExecute = (MandateExecute) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().executeMandate(str, str2, mandateExecute).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.72
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.listener.onFailureResponse(oliveRequest, response.message());
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4183));
        }
    }

    public void mandateRequest(Context context, String str, String str2, final OliveRequest oliveRequest) {
        PayeeInitiatedMandate payeeInitiatedMandate = (PayeeInitiatedMandate) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().mandateRequest(str, str2, payeeInitiatedMandate).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.56
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        }
    }

    public void mandatehistory(Context context, String str, String str2, final OliveRequest oliveRequest) {
        ReqMandateTxn reqMandateTxn = (ReqMandateTxn) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().mandateHistory(str, str2, reqMandateTxn).enqueue(new Callback<Result<List<MandatesVo>>>() { // from class: com.olive.upi.transport.TransportManager.60
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<MandatesVo>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<MandatesVo>>> call, retrofit2.Response<Result<List<MandatesVo>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.listener.onFailureResponse(oliveRequest, response.message());
                    }
                }
            });
        }
    }

    public void pay(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIPaymentService().PayReq((PayRequest) oliveRequest.getRequestData()).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.11
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4184));
        }
    }

    public void payBBPSBill(Context context, final OliveRequest oliveRequest) {
        BbpsPay bbpsPay = (BbpsPay) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().payBBPSBill(bbpsPay).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.40
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4185));
        }
    }

    public void processResponse(retrofit2.Response response, OliveRequest oliveRequest) {
        if (response.code() == 401) {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4186));
        } else {
            this.listener.onFailureResponse(oliveRequest, response.message());
        }
    }

    public void raiseQuery(Context context, final OliveRequest oliveRequest) {
        TranHistory tranHistory = (TranHistory) oliveRequest.getRequestData();
        if (c70.n(context)) {
            caluclateCheckSum(tranHistory.getInput());
            getUPIService().raiseQuery(tranHistory).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.28
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4187));
    }

    public void recurrenceAuthorization(Context context, String str, String str2, final OliveRequest oliveRequest) {
        RecurrenceAuthorization recurrenceAuthorization = (RecurrenceAuthorization) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().recurrenceAuthorization(str2, str, recurrenceAuthorization).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.80
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4188));
        }
    }

    public void recurrencePending(Context context, String str, String str2, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().recurrencePending(str2, str).enqueue(new Callback<Result<List<RecurrenceResVo>>>() { // from class: com.olive.upi.transport.TransportManager.79
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<RecurrenceResVo>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<RecurrenceResVo>>> call, retrofit2.Response<Result<List<RecurrenceResVo>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4189));
        }
    }

    public void regBillerEnq(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().registerEnqBiller((RegisterBiller) oliveRequest.getRequestData()).enqueue(new Callback<Result<List<BillerRegEnqResponse>>>() { // from class: com.olive.upi.transport.TransportManager.68
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<BillerRegEnqResponse>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<BillerRegEnqResponse>>> call, retrofit2.Response<Result<List<BillerRegEnqResponse>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4190));
        }
    }

    public void rejectpending(Context context, final OliveRequest oliveRequest) {
        PendingReqVo pendingReqVo = (PendingReqVo) oliveRequest.getRequestData();
        if (c70.n(context)) {
            caluclateCheckSum(pendingReqVo.getInput());
            getUPIService().rejectPending(pendingReqVo).enqueue(new Callback<Result<List<PendingReqVo>>>() { // from class: com.olive.upi.transport.TransportManager.24
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<PendingReqVo>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<PendingReqVo>>> call, retrofit2.Response<Result<List<PendingReqVo>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4191));
    }

    public void resetUpiService() {
        upiService = null;
        upiPaymentService = null;
    }

    public void safetyNetChecker(Context context, final OliveRequest oliveRequest) {
        SafetynetSignedAttestation safetynetSignedAttestation = (SafetynetSignedAttestation) oliveRequest.getRequestData();
        String apiKey = safetynetSignedAttestation.getApiKey();
        safetynetSignedAttestation.setApiKey(null);
        if (c70.n(context)) {
            getSafetyCheckerService().safetynetCheck(apiKey, safetynetSignedAttestation).enqueue(new Callback<String>() { // from class: com.olive.upi.transport.TransportManager.66
                @Override // retrofit2.Callback
                public void onFailure(Call<String> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<String> call, retrofit2.Response<String> response) {
                    if (response.isSuccessful()) {
                        Result result = new Result();
                        result.setData(response);
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, result);
                        return;
                    }
                    TransportManager.this.processResponse(response, oliveRequest);
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4192));
        }
    }

    public void saveVpa(Context context, String str, final OliveRequest oliveRequest) {
        BeneVpa beneVpa = (BeneVpa) oliveRequest.getRequestData();
        if (c70.n(context)) {
            caluclateCheckSum(str + beneVpa.getVpa() + beneVpa.getName() + beneVpa.getNickname());
            getUPIService().saveVPA(str, beneVpa.getVpa(), beneVpa.getName(), beneVpa.getNickname(), beneVpa.getFavorite()).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.14
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4193));
    }

    public void sendAccountOTPRequest(Context context, final OliveRequest oliveRequest) {
        AccountOTPRequest accountOTPRequest = (AccountOTPRequest) oliveRequest.getRequestData();
        if (c70.n(context)) {
            caluclateCheckSum(accountOTPRequest.getInput());
            getUPIService().accountOtp(accountOTPRequest).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.2
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4194));
    }

    public void serverHealth(Context context, final OliveRequest oliveRequest) {
        String str = (String) oliveRequest.getRequestData();
        if (c70.n(context)) {
            caluclateCheckSum(str);
            getUPIService().serverCheck(str).enqueue(new Callback<Result<HealthCheck>>() { // from class: com.olive.upi.transport.TransportManager.32
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<HealthCheck>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<HealthCheck>> call, retrofit2.Response<Result<HealthCheck>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4195));
    }

    public void setCheckSum(String str) {
        this.checkSum = str;
    }

    public void setCustomerVpa(Context context, String str, String str2, String str3, String str4, String str5) {
        final OliveRequest oliveRequest = new OliveRequest(42);
        if (c70.n(context)) {
            getUPIService().setCustomerVpa(str, str2, str3, str4, str5).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.35
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4196));
        }
    }

    public void setListener(UPIConnectionListener uPIConnectionListener) {
        this.listener = uPIConnectionListener;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setuCheck(Context context, final OliveRequest oliveRequest) {
        ArrayList arrayList = (ArrayList) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getSetuService().setuCheck((String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), (String) arrayList.get(3)).enqueue(new Callback<SetuResponse>() { // from class: com.olive.upi.transport.TransportManager.67
                @Override // retrofit2.Callback
                public void onFailure(Call<SetuResponse> call, Throwable th) {
                    th.printStackTrace();
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<SetuResponse> call, retrofit2.Response<SetuResponse> response) {
                    if (response.isSuccessful()) {
                        Result result = new Result();
                        result.code = C0059ao.a(4063);
                        result.result = C0059ao.a(4064);
                        result.setData(response.body());
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, result);
                        return;
                    }
                    TransportManager.this.processResponse(response, oliveRequest);
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4197));
        }
    }

    public void signedQR(Context context, final OliveRequest oliveRequest) {
        IntentData intentData = (IntentData) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().generateSignedQR(intentData).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.73
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4198));
        }
    }

    public void skipBindCall(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().skipBindCall((String) oliveRequest.getRequestData()).enqueue(new Callback<Result<Registration>>() { // from class: com.olive.upi.transport.TransportManager.21
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<Registration>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<Registration>> call, retrofit2.Response<Result<Registration>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4199));
        }
    }

    public void updateAccounts(Context context, final OliveRequest oliveRequest) {
        AcctUpdateReq acctUpdateReq = (AcctUpdateReq) oliveRequest.getRequestData();
        if (c70.n(context)) {
            caluclateCheckSum(acctUpdateReq.getInput());
            getUPIService().accountSave(acctUpdateReq).enqueue(new Callback<Result<List<CustomerBankAccounts>>>() { // from class: com.olive.upi.transport.TransportManager.10
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<CustomerBankAccounts>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<CustomerBankAccounts>>> call, retrofit2.Response<Result<List<CustomerBankAccounts>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4200));
    }

    public void updateInbox(Activity activity, final OliveRequest oliveRequest) {
        if (c70.n(activity)) {
            getUPIService().updateInbox((Inbox) oliveRequest.getRequestData()).enqueue(new Callback<Result<Inbox>>() { // from class: com.olive.upi.transport.TransportManager.38
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<Inbox>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<Inbox>> call, retrofit2.Response<Result<Inbox>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4201));
        }
    }

    public void updateMandate(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            UpdateMandateRequest updateMandateRequest = (UpdateMandateRequest) oliveRequest.getRequestData();
            getUPIService().updateMandate(updateMandateRequest.getCustomerId(), updateMandateRequest.getAppId(), updateMandateRequest.getUpdateMandate()).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.58
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.listener.onFailureResponse(oliveRequest, response.message());
                    }
                }
            });
        }
    }

    public void verifyLimitChecks(Context context, final OliveRequest oliveRequest) {
        LimitCheckReq limitCheckReq = (LimitCheckReq) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().verifyLimits(limitCheckReq).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.84
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4202));
        }
    }

    public void verifyPromocode(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().verifyPromoCode((String) oliveRequest.getRequestData()).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.54
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4203));
        }
    }

    public void verifyQR(Context context, final OliveRequest oliveRequest) {
        IntentData intentData = (IntentData) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().verifySignedQR(intentData, intentData.getAppId()).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.74
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4204));
        }
    }

    public void verifyReferalCode(Context context, String str, String str2, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            getUPIService().verifyRereralCode(str, str2).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.53
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4205));
        }
    }

    public void verifyVpa2(Context context, final OliveRequest oliveRequest) {
        VpaVerify vpaVerify = (VpaVerify) oliveRequest.getRequestData();
        if (c70.n(context)) {
            caluclateCheckSum(vpaVerify.getCustomerid() + vpaVerify.getVpa());
            getUPIService().verifyVpa2(vpaVerify).enqueue(new Callback<Result<String>>() { // from class: com.olive.upi.transport.TransportManager.71
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<String>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<String>> call, retrofit2.Response<Result<String>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.listener.onFailureResponse(oliveRequest, response.message());
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4206));
    }

    public void vpaRemove(Context context, final OliveRequest oliveRequest) {
        if (c70.n(context)) {
            caluclateCheckSum((String) oliveRequest.getRequestData());
            getUPIService().vpaRemove((String) oliveRequest.getRequestData()).enqueue(new Callback<Result<List<BeneVpa>>>() { // from class: com.olive.upi.transport.TransportManager.27
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<BeneVpa>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<BeneVpa>>> call, retrofit2.Response<Result<List<BeneVpa>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
            return;
        }
        this.listener.onFailureResponse(oliveRequest, C0059ao.a(4207));
    }

    public void vpaSuggestion(Context context, final OliveRequest oliveRequest) {
        SetProfile setProfile = (SetProfile) oliveRequest.getRequestData();
        if (c70.n(context)) {
            getUPIService().vpaSuggestion(setProfile.getVpa(), setProfile.getAccountNo()).enqueue(new Callback<Result<List<String>>>() { // from class: com.olive.upi.transport.TransportManager.34
                @Override // retrofit2.Callback
                public void onFailure(Call<Result<List<String>>> call, Throwable th) {
                    TransportManager.this.listener.onFailureResponse(oliveRequest, th.getLocalizedMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<Result<List<String>>> call, retrofit2.Response<Result<List<String>>> response) {
                    if (response.isSuccessful()) {
                        TransportManager.this.listener.onSuccessResponse(oliveRequest, response.body());
                    } else {
                        TransportManager.this.processResponse(response, oliveRequest);
                    }
                }
            });
        } else {
            this.listener.onFailureResponse(oliveRequest, C0059ao.a(4208));
        }
    }

    public static TransportManager getInstance() {
        if (manager == null) {
            manager = new TransportManager();
        }
        return manager;
    }
}
