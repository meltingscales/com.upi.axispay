package com.olive.upi.transport;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.media.session.IMediaSession;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.google.gson.Gson;
import com.olive.upi.transport.TransportManager;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.AcRequest;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.AccountOTPRequest;
import com.olive.upi.transport.model.AccountTransportData;
import com.olive.upi.transport.model.AcctUpdateReq;
import com.olive.upi.transport.model.ActivateAccount;
import com.olive.upi.transport.model.Authenticate;
import com.olive.upi.transport.model.BRequest;
import com.olive.upi.transport.model.BeneVpa;
import com.olive.upi.transport.model.BillPay;
import com.olive.upi.transport.model.ChangeAppPin;
import com.olive.upi.transport.model.ChangeCredReq;
import com.olive.upi.transport.model.CheckStatus;
import com.olive.upi.transport.model.Collect;
import com.olive.upi.transport.model.CollectPayRequest;
import com.olive.upi.transport.model.CollectRequest;
import com.olive.upi.transport.model.Cred;
import com.olive.upi.transport.model.CustomerAcRequest;
import com.olive.upi.transport.model.CustomerReg;
import com.olive.upi.transport.model.Data;
import com.olive.upi.transport.model.DeviceDetails;
import com.olive.upi.transport.model.ExecuteData;
import com.olive.upi.transport.model.Invoice;
import com.olive.upi.transport.model.LimitCheckReq;
import com.olive.upi.transport.model.MandateTransactionData;
import com.olive.upi.transport.model.MandateUpdateData;
import com.olive.upi.transport.model.MasterUpdate;
import com.olive.upi.transport.model.PayRequest;
import com.olive.upi.transport.model.PayTransportData;
import com.olive.upi.transport.model.Payee;
import com.olive.upi.transport.model.QR;
import com.olive.upi.transport.model.RecurrenceAuthorization;
import com.olive.upi.transport.model.RegCustomer;
import com.olive.upi.transport.model.RegRequest;
import com.olive.upi.transport.model.Registration;
import com.olive.upi.transport.model.ReqComplientVo;
import com.olive.upi.transport.model.SaveAccount;
import com.olive.upi.transport.model.Split;
import com.olive.upi.transport.model.TokenResponse;
import com.olive.upi.transport.model.TransactionData;
import com.olive.upi.transport.model.UdirReasons;
import com.olive.upi.transport.model.UpdateMandate;
import com.olive.upi.transport.model.UserRegister;
import com.olive.upi.transport.model.VerifyVPA;
import com.olive.upi.transport.service.CommonLibService;
import com.olive.upi.transport.service.CryptLibOne;
import com.olive.upi.transport.service.RegHelper;
import defpackage.n70;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import myunmn.C0059ao;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class OliveUpiManager implements TransportManager.UPIConnectionListener, CommonLibService.OliveCommonLibListener {
    private static final String TAG = null;
    private static Activity activity;
    private static OliveUpiManager manager;
    private BillPay billPayRequest;
    public ChangeCredReq changeCredReq;
    private CommonLibService commonLibManager;
    private int currentRetry;
    public String custName;
    private DeviceDetails deviceDetails;
    private String deviceId;
    private String key;
    public String lastTransactionId;
    private OliveUpiEventListener listener;
    private String password;
    private PayRequest payRequest;
    private RecurrenceAuthorization recurrenceAuthorization;
    private RegRequest regRequest;
    public Registration registration;
    public OliveRequest request;
    private int smsSentStatus;
    private CountDownTimer timer;
    private boolean timerStarted;
    private UpdateMandate updateMandate;
    private final int STATE_SMS_SENT = 1;
    private final int STATE_SMS_SENT_FAILED = 2;
    private final int STATE_SMS_DELEVERED = 3;
    private final int STATE_SMS_DELEVERED_FAILED = 4;
    private String SENT = C0059ao.a(9238);
    private String DELIVERED = C0059ao.a(9239);

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class InitLib {
        public String challenge;
        public Object data;
        public String deviceId;
        public int expDayCount;
        public int reqType;

        public InitLib(int i, String str) {
            this.expDayCount = i;
            this.deviceId = str;
        }

        public String getChallenge() {
            return this.challenge;
        }

        public Object getData() {
            return this.data;
        }

        public String getDeviceId() {
            return this.deviceId;
        }

        public int getExpDayCount() {
            return this.expDayCount;
        }

        public int getReqType() {
            return this.reqType;
        }

        public void setChallenge(String str) {
            this.challenge = str;
        }

        public void setData(Object obj) {
            this.data = obj;
        }

        public void setDeviceId(String str) {
            this.deviceId = str;
        }

        public void setExpDayCount(int i) {
            this.expDayCount = i;
        }

        public void setReqType(int i) {
            this.reqType = i;
        }
    }

    static {
        C0059ao.a(OliveUpiManager.class, 288);
    }

    private void generateToken(OliveRequest oliveRequest) {
        c70.q();
        TransportManager.getInstance(this).generateToken(activity, oliveRequest);
    }

    private void getInfo(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getInfo(activity, oliveRequest);
    }

    public static OliveUpiManager getInstance(Activity activity2) {
        if (manager == null) {
            manager = new OliveUpiManager();
        }
        init(activity2);
        return manager;
    }

    private void getMobileNumber(OliveRequest oliveRequest) {
        String a;
        if (oliveRequest.getRequestData() instanceof String) {
            this.key = CryptLibOne.createAesKey();
            TransportConstants.regRandom = (String) oliveRequest.getRequestData();
            StringBuilder sb = new StringBuilder();
            sb.append(TransportConstants.regRandom);
            String a2 = C0059ao.a(9240);
            sb.append(a2);
            sb.append(n70.f.a().m(C0059ao.a(9241)));
            sb.append(a2);
            sb.append(this.key);
            try {
                a = new RegHelper().encryptData(sb.toString());
            } catch (Exception unused) {
                a = C0059ao.a(9242);
            }
            oliveRequest.setRequestData(a);
        }
        TransportManager.getInstance(this).getMobileNumber(activity, oliveRequest);
    }

    public static void init(Activity activity2) {
        activity = activity2;
    }

    private void initCommonLib(int i, OliveRequest oliveRequest) throws OliveUpiException {
        n70.a aVar = n70.f;
        String m = aVar.a().m(C0059ao.a(9243));
        int j = aVar.a().j(C0059ao.a(9244));
        String str = C0059ao.a(9245) + m + C0059ao.a(9246) + j;
        boolean isEmpty = TextUtils.isEmpty(m);
        String a = C0059ao.a(9247);
        if (!isEmpty && j < TransportConstants.MAX_TOKEN_DAYS) {
            if (TransportConstants.mClservices == null) {
                this.commonLibManager = new CommonLibService(activity, this);
                InitLib initLib = new InitLib(j, aVar.a().m(a));
                initLib.setReqType(i);
                oliveRequest.setClInitData(initLib);
                this.commonLibManager.initService(8, oliveRequest);
                return;
            }
            if (this.commonLibManager == null) {
                this.commonLibManager = new CommonLibService(activity, this);
            }
            initCommonLibAction(i, oliveRequest);
            return;
        }
        this.commonLibManager = new CommonLibService(activity, this);
        InitLib initLib2 = new InitLib(j, aVar.a().m(a));
        initLib2.setReqType(i);
        oliveRequest.setClInitData(initLib2);
        this.commonLibManager.initService(4, oliveRequest);
    }

    private void initCommonLibAction(int i, OliveRequest oliveRequest) throws OliveUpiException {
        String str = C0059ao.a(9248) + i + C0059ao.a(9249);
        String a = C0059ao.a(9250);
        switch (i) {
            case 1:
            case 2:
            case 3:
                ((AccountTransportData) oliveRequest.getClTransportData()).setCommonLibToken(n70.f.a().m(a));
                this.commonLibManager.manageAccount(i, oliveRequest);
                return;
            case 4:
            case 8:
            default:
                return;
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
                ((PayTransportData) oliveRequest.getClTransportData()).setCommonLibToken(n70.f.a().m(a));
                this.commonLibManager.initiatePay(oliveRequest);
                return;
            case 13:
                ((MandateUpdateData) oliveRequest.getClTransportData()).setCommonLibToken(n70.f.a().m(a));
                this.commonLibManager.mandateUpdate(oliveRequest);
                return;
        }
    }

    private boolean isValidVpa(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(C0059ao.a(9251));
    }

    private void skipBindCall(OliveRequest oliveRequest) {
        String a;
        if (oliveRequest.getRequestData() instanceof String) {
            this.key = CryptLibOne.createAesKey();
            TransportConstants.regRandom = (String) oliveRequest.getRequestData();
            StringBuilder sb = new StringBuilder();
            sb.append(TransportConstants.regRandom);
            String a2 = C0059ao.a(9252);
            sb.append(a2);
            sb.append(n70.f.a().m(C0059ao.a(9253)));
            sb.append(a2);
            sb.append(this.key);
            String sb2 = sb.toString();
            String str = C0059ao.a(9254) + sb2;
            try {
                a = new RegHelper().encryptData(sb2);
            } catch (Exception unused) {
                a = C0059ao.a(9255);
            }
            oliveRequest.setRequestData(a);
        }
        TransportManager.getInstance(this).skipBindCall(activity, oliveRequest);
    }

    private void updateInbox(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).updateInbox(activity, oliveRequest);
    }

    public void FetchAccountonIIN(String str) {
        new AcRequest().setBankId(str);
    }

    public void VerifyMerchant(OliveRequest oliveRequest) {
        VerifyVPA verifyVPA = new VerifyVPA();
        verifyVPA.setVpa((String) oliveRequest.getRequestData());
        oliveRequest.setRequestData(verifyVPA);
        TransportManager.getInstance(this).getVerifiedMerchant(activity, oliveRequest);
    }

    public void acceptMandate(OliveRequest oliveRequest) {
        TransportManager transportManager = TransportManager.getInstance(this);
        Activity activity2 = activity;
        n70.a aVar = n70.f;
        transportManager.declineApproveMandate(activity2, aVar.a().m(C0059ao.a(9256)), aVar.a().m(C0059ao.a(9257)), oliveRequest);
    }

    public void accountMobReg(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).accountMobReg(activity, oliveRequest);
    }

    public void activateAccount(OliveRequest oliveRequest) {
        if (oliveRequest.getRequestData() instanceof ActivateAccount) {
            ActivateAccount activateAccount = (ActivateAccount) oliveRequest.getRequestData();
            AccountOTPRequest accountOTPRequest = new AccountOTPRequest();
            accountOTPRequest.setCustomerId(n70.f.a().m(C0059ao.a(9258)));
            RegRequest regRequest = new RegRequest();
            this.regRequest = regRequest;
            regRequest.setAc(activateAccount.getAccount());
            this.regRequest.setExpiry(activateAccount.getExp());
            this.regRequest.setCard(activateAccount.getCardNo());
            this.regRequest.setBank(activateAccount.getBankId());
            accountOTPRequest.setAc(activateAccount.getAccount());
            accountOTPRequest.setBankId(activateAccount.getBankId());
            this.deviceDetails = c70.d(activity);
            String j = c70.j();
            this.lastTransactionId = j;
            accountOTPRequest.setTxnId(j);
            accountOTPRequest.setDevice(this.deviceDetails);
            accountOTPRequest.setCard(activateAccount.getCardNo());
            accountOTPRequest.setExpiry(activateAccount.getExp());
            oliveRequest.setRequestData(accountOTPRequest);
        }
        TransportManager.getInstance(this).sendAccountOTPRequest(activity, oliveRequest);
    }

    public void balanceEnqForCreditLine(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).balanceEnqForCreditLine(activity, oliveRequest);
    }

    public void beneVpaBlock(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).beneBlock(activity, n70.f.a().m(C0059ao.a(9259)), oliveRequest);
    }

    public void billPayment(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).billPay(activity, oliveRequest);
    }

    public void calculateCharges(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).calculateCharges(activity, oliveRequest);
    }

    public void changeMPin(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getChangeMpin(activity, oliveRequest);
    }

    public void checkBalance(OliveRequest oliveRequest) {
        try {
            AccountTransportData accountTransportData = new AccountTransportData();
            if (oliveRequest.getRequestData() instanceof Account) {
                Account account = (Account) oliveRequest.getRequestData();
                accountTransportData.setAccount(account);
                accountTransportData.setDeviceDetails(c70.d(activity));
                String j = c70.j();
                accountTransportData.setTxnId(j);
                n70.a aVar = n70.f;
                aVar.a().y(C0059ao.a(9260), j);
                accountTransportData.setXmlPayLoadString(aVar.a().m(C0059ao.a(9261)));
                accountTransportData.setCommonLibToken(aVar.a().m(C0059ao.a(9262)));
                accountTransportData.setLanguage(aVar.a().m(C0059ao.a(9263)));
                accountTransportData.setMaskedAccNo(account.getMaskedAccnumber());
            }
            oliveRequest.setClTransportData(accountTransportData);
            initCommonLib(1, oliveRequest);
        } catch (OliveUpiException e) {
            Result result = new Result();
            result.code = e.getErrorCode();
            result.result = e.getMessage();
            this.listener.onFailureResponse(oliveRequest, result);
        }
    }

    public void checkStatus(OliveRequest oliveRequest) {
        CheckStatus checkStatus = new CheckStatus();
        TransactionData transactionData = (TransactionData) oliveRequest.getRequestData();
        n70.a aVar = n70.f;
        checkStatus.setMobilenumber(aVar.a().m(C0059ao.a(9264)));
        checkStatus.setInitiatedby(C0059ao.a(9265));
        checkStatus.setSubtype(C0059ao.a(9266));
        checkStatus.setOrderid(transactionData.getOrderId());
        checkStatus.setTranid(transactionData.getTransactionId());
        checkStatus.setRrn(transactionData.getRefid());
        oliveRequest.setRequestData(checkStatus);
        TransportManager.getInstance(this).getCheckStatus(activity, aVar.a().m(C0059ao.a(9267)), transactionData.getTransactionId(), oliveRequest);
    }

    public void collect(OliveRequest oliveRequest) {
        if (oliveRequest.getRequestData() instanceof CollectRequest) {
            CollectRequest collectRequest = (CollectRequest) oliveRequest.getRequestData();
            Collect collect = new Collect();
            collect.setAc(collectRequest.getAccount());
            DeviceDetails d = c70.d(activity);
            collect.setAmount(c70.l(String.valueOf(collectRequest.getAmount())));
            collect.setCustomerId(d.getMobile());
            if (collectRequest.getRemarks().toString().equals(C0059ao.a(9268))) {
                collect.setRemarks(C0059ao.a(9269));
            } else {
                collect.setRemarks(collectRequest.getRemarks());
            }
            String j = c70.j();
            this.lastTransactionId = j;
            collect.setTxnId(j);
            collect.setPayerVpa(collectRequest.getBeneVpa().getVpa());
            collect.setDevice(d);
            collect.setExpiry(collectRequest.getDate());
            String a = C0059ao.a(9270);
            collect.setInitmode(a);
            collect.setPurpose(a);
            collect.setRefCategory(a);
            oliveRequest.setRequestData(collect);
        }
        TransportManager.getInstance(this).collect(activity, oliveRequest);
    }

    public void collectBlockedVpaList(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getBlockBeneVpa(activity, oliveRequest);
    }

    public void collectPay(OliveRequest oliveRequest) {
        if (oliveRequest.getRequestData() instanceof PayRequest) {
            PayRequest payRequest = (PayRequest) oliveRequest.getRequestData();
            CollectPayRequest collectPayRequest = new CollectPayRequest();
            collectPayRequest.setAc(payRequest.getAc());
            collectPayRequest.setTxnId(payRequest.getTxnId());
            collectPayRequest.setCred(payRequest.getCred());
            collectPayRequest.setDevice(payRequest.getDevice());
            oliveRequest.setRequestData(collectPayRequest);
        }
        TransportManager.getInstance(this).collectNotification(activity, oliveRequest);
    }

    public void deleteAccount(OliveRequest oliveRequest) {
        if (oliveRequest.getRequestData() instanceof Account) {
            AcctUpdateReq acctUpdateReq = new AcctUpdateReq();
            acctUpdateReq.setAccount((Account) oliveRequest.getRequestData());
            acctUpdateReq.setDevice(c70.d(activity));
            oliveRequest.setRequestData(acctUpdateReq);
        }
        TransportManager.getInstance(this).accountRemove(activity, oliveRequest);
    }

    public void deleteCustomerVpa(Account account, String str) {
        TransportManager.getInstance(this).deleteCustomerVpa(activity, n70.f.a().m(C0059ao.a(9271)), account.getAccRefNumber(), account.getVpa(), str, account.getIfsc());
    }

    public void deleteVpa(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).vpaRemove(activity, oliveRequest);
    }

    public String encPass(String str) {
        RegHelper regHelper = new RegHelper();
        try {
            return regHelper.encryptData(TransportConstants.regToken + C0059ao.a(9272) + str);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public void executeMandate(OliveRequest oliveRequest) {
        try {
            AccountTransportData accountTransportData = new AccountTransportData();
            if (oliveRequest.getRequestData() instanceof ExecuteData) {
                ExecuteData executeData = (ExecuteData) oliveRequest.getRequestData();
                accountTransportData.setAccount(executeData.account);
                accountTransportData.setDeviceDetails(c70.d(activity));
                accountTransportData.setTxnId(executeData.getTxnid());
                n70.a aVar = n70.f;
                aVar.a().y(C0059ao.a(9273), executeData.getTxnid());
                accountTransportData.setXmlPayLoadString(aVar.a().m(C0059ao.a(9274)));
                accountTransportData.setCommonLibToken(aVar.a().m(C0059ao.a(9275)));
                accountTransportData.setLanguage(aVar.a().m(C0059ao.a(9276)));
                RecurrenceAuthorization recurrenceAuthorization = new RecurrenceAuthorization();
                this.recurrenceAuthorization = recurrenceAuthorization;
                recurrenceAuthorization.setTxnid(executeData.getTxnid());
                this.recurrenceAuthorization.setAction(executeData.getAction());
                this.recurrenceAuthorization.setPayervpa(executeData.getPayervpa());
                this.recurrenceAuthorization.setPayeevpa(executeData.getPayeevpa());
                this.recurrenceAuthorization.setUmn(executeData.getUmnid());
            }
            oliveRequest.setClTransportData(accountTransportData);
            initCommonLib(14, oliveRequest);
        } catch (OliveUpiException e) {
            Result result = new Result();
            result.code = e.getErrorCode();
            result.result = e.getMessage();
            this.listener.onFailureResponse(oliveRequest, result);
        }
    }

    public void fetchMobileNumber(Registration registration) {
        this.registration = registration;
        n70.f.a().y(C0059ao.a(9277), registration.getDeviceInfo().getId());
        this.custName = registration.getName();
    }

    public void fetchMyAccounts(OliveRequest oliveRequest) {
        DeviceDetails d = c70.d(activity);
        CustomerAcRequest customerAcRequest = new CustomerAcRequest();
        customerAcRequest.setCustomerId(n70.f.a().m(C0059ao.a(9278)));
        customerAcRequest.setDeviceDetails(d);
        oliveRequest.setRequestData(customerAcRequest);
        TransportManager.getInstance(this).fetchAllAccounts(activity, oliveRequest);
    }

    public void fetchPayloadKey(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).listKeys(activity, n70.f.a().m(C0059ao.a(9279)), oliveRequest);
    }

    public void getAccountsFromBank(OliveRequest oliveRequest) {
        this.deviceDetails = c70.d(activity);
        AcRequest acRequest = new AcRequest();
        acRequest.setDevice(this.deviceDetails);
        acRequest.setCustomerId(this.deviceDetails.getMobile());
        acRequest.setTxnId(c70.j());
        if (oliveRequest.getRequestData() instanceof String) {
            acRequest.setBankId((String) oliveRequest.getRequestData());
        }
        oliveRequest.setRequestData(acRequest);
        TransportManager.getInstance(this).fetchAccounts(activity, n70.f.a().m(C0059ao.a(9280)), oliveRequest);
    }

    public void getAllTransactionHistory(String str, String str2, String str3, boolean z) {
        TransportManager.getInstance(this).getTransactionHistory(activity, str, str2, str3, z);
    }

    public void getBalance(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getBalance(activity, oliveRequest);
    }

    public void getBanner(OliveRequest oliveRequest) {
        oliveRequest.setRequestData(C0059ao.a(9281));
        TransportManager.getInstance(this).getBanner(activity, oliveRequest);
    }

    public void getBillPayMaxAmounts(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getBillPayMaxAmounts(activity, oliveRequest);
    }

    public void getBillerCategories(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getBillerCategories(activity, oliveRequest);
    }

    public void getBillerForm(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getBillerRegForm(activity, oliveRequest);
    }

    public void getBillerLocations(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getBillerLocation(activity, oliveRequest);
    }

    public void getBillerNames(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getBillers(activity, oliveRequest);
    }

    public void getClToken(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getClToken(activity, oliveRequest);
    }

    public byte[] getDecryptedData(String str) {
        CryptLibOne cryptLibOne = new CryptLibOne();
        try {
            return cryptLibOne.decrypt(cryptLibOne.hexStringToByteArray(str), cryptLibOne.hexStringToByteArray(this.key));
        } catch (Exception unused) {
            return null;
        }
    }

    public void getDthOperator(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getDthOperator(activity, oliveRequest);
    }

    public void getInboxDate(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getInboxContent(activity, oliveRequest);
    }

    public String getLastTransactionId() {
        return this.lastTransactionId;
    }

    public void getLongcode(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).serverHealth(activity, oliveRequest);
    }

    public void getMobileCircles(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getMobileCircle(activity, oliveRequest);
    }

    public void getMobileOperator(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getMobileOperator(activity, oliveRequest);
    }

    public void getMobileOperators(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getOperator(activity, oliveRequest);
    }

    public void getMyVpaAccounts() {
        TransportManager.getInstance(this).getMyVpaAccounts(activity);
    }

    public void getPendingRequest(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getPendingTransactions(activity, n70.f.a().m(C0059ao.a(9282)), oliveRequest);
    }

    public void getPersonalLoan(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getPersonalLoan(activity, oliveRequest);
    }

    public void getPlainAccountNumber(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getPlainAccountNumber(activity, oliveRequest);
    }

    public void getPromotionalOffers(OliveRequest oliveRequest) {
        oliveRequest.setRequestData(n70.f.a().m(C0059ao.a(9283)));
        TransportManager.getInstance(this).getPromotionalOffers(activity, oliveRequest);
    }

    public void getQueryList(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getRaisedQueries(activity, n70.f.a().m(C0059ao.a(9284)), oliveRequest);
    }

    public void getRecentBBPSHistory(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getBBPSHistory(activity, oliveRequest);
    }

    public void getRechargeHistory(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getRechargeHistory(activity, oliveRequest);
    }

    public void getRechargePlan(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getRechargePlans(activity, oliveRequest);
    }

    public String getToken() {
        return TransportManager.getInstance(this).getToken();
    }

    public void getUPIBankList(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).listBanks(activity, oliveRequest);
    }

    public void getVerifyVpa2(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).verifyVpa2(activity, oliveRequest);
    }

    public void getVpaList(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).listVpa(activity, n70.f.a().m(C0059ao.a(9285)), oliveRequest);
    }

    public void getWebUrls(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).getWebUrls(activity, oliveRequest);
    }

    public void initiateChangeMpin(OliveRequest oliveRequest) {
        String a = C0059ao.a(9286);
        Account account = (Account) oliveRequest.getRequestData();
        String iin = account.getIin();
        try {
            AccountTransportData accountTransportData = new AccountTransportData();
            n70.a aVar = n70.f;
            accountTransportData.setXmlPayLoadString(aVar.a().m(C0059ao.a(9287)));
            accountTransportData.setMobileNumber(aVar.a().m(a));
            DeviceDetails deviceDetails = new DeviceDetails();
            this.deviceDetails = deviceDetails;
            deviceDetails.setApp(aVar.a().m(C0059ao.a(9288)));
            this.deviceDetails.setMobile(aVar.a().m(a));
            this.deviceDetails.setId(aVar.a().m(C0059ao.a(9289)));
            accountTransportData.setDeviceDetails(this.deviceDetails);
            accountTransportData.setCommonLibToken(aVar.a().m(C0059ao.a(9290)));
            accountTransportData.setAccount(account);
            accountTransportData.setTxnId(c70.j());
            aVar.a().y(C0059ao.a(9291), accountTransportData.getTxnId());
            accountTransportData.setLanguage(aVar.a().m(C0059ao.a(9292)));
            ChangeCredReq changeCredReq = new ChangeCredReq();
            this.changeCredReq = changeCredReq;
            changeCredReq.setAc(account);
            this.changeCredReq.setCustomerid(aVar.a().m(a));
            this.changeCredReq.setDevice(this.deviceDetails);
            this.changeCredReq.setTxnid(accountTransportData.getTxnId());
            this.changeCredReq.setBank(iin);
            oliveRequest.setClTransportData(accountTransportData);
            initCommonLib(3, oliveRequest);
        } catch (OliveUpiException e) {
            Result result = new Result();
            result.code = e.getErrorCode();
            result.result = e.getMessage();
            this.listener.onFailureResponse(oliveRequest, result);
        }
    }

    public void initiatePay(OliveRequest oliveRequest) {
        TransactionData transactionData = (TransactionData) oliveRequest.getRequestData();
        int clMode = oliveRequest.getClMode();
        Account account = transactionData.getAccount();
        BeneVpa beneVpa = transactionData.getBeneVpa();
        Double tipAmount = transactionData.getTipAmount();
        double doubleValue = ((transactionData.getEditedAmount() == null || transactionData.getEditedAmount().doubleValue() == 0.0d) ? transactionData.getAmount() : transactionData.getEditedAmount()).doubleValue();
        String editedRemarks = transactionData.getEditedRemarks() != null ? transactionData.getEditedRemarks() : transactionData.getRemarks();
        String transactionId = transactionData.getTransactionId();
        String refUrl = transactionData.getRefUrl();
        transactionData.getMcc();
        String orderId = transactionData.getOrderId();
        String billpayKey = transactionData.getBillpayKey();
        String billpayInfoString = transactionData.getBillpayInfoString();
        String mode = transactionData.getMode();
        String a = C0059ao.a(9293);
        String mode2 = (mode == null || TextUtils.isEmpty(transactionData.getMode())) ? a : transactionData.getMode();
        String purpose = (transactionData.getPurpose() == null || TextUtils.isEmpty(transactionData.getPurpose())) ? a : transactionData.getPurpose();
        if (transactionData.getRefCategory() != null && !TextUtils.isEmpty(transactionData.getRefCategory())) {
            a = transactionData.getRefCategory();
        }
        String str = a;
        if (account == null || beneVpa == null || doubleValue == 0.0d || editedRemarks == null) {
            return;
        }
        String str2 = purpose;
        PayTransportData payTransportData = new PayTransportData();
        payTransportData.setMode(clMode);
        n70.a aVar = n70.f;
        String str3 = mode2;
        String str4 = editedRemarks;
        payTransportData.setCommonLibToken(aVar.a().m(C0059ao.a(9294)));
        payTransportData.setXmlPayLoadString(aVar.a().m(C0059ao.a(9295)));
        payTransportData.setMobileNumber(aVar.a().m(C0059ao.a(9296)));
        DeviceDetails d = c70.d(activity);
        payTransportData.setDeviceDetails(d);
        n70 a2 = aVar.a();
        String a3 = C0059ao.a(9297);
        payTransportData.setLanguage(a2.m(a3));
        String a4 = C0059ao.a(9298);
        if (clMode == 7 || clMode == 10) {
            BillPay billPay = new BillPay();
            this.billPayRequest = billPay;
            billPay.setBillinfo(billpayInfoString);
            this.billPayRequest.setBillid(billpayKey);
            String j = c70.j();
            this.lastTransactionId = j;
            payTransportData.setTxnId(j);
            aVar.a().y(a4, payTransportData.getTxnId());
        } else if (clMode == 5 || clMode == 9 || clMode == 12 || clMode == 14) {
            if (TextUtils.isEmpty(transactionId)) {
                this.lastTransactionId = c70.j();
            } else {
                this.lastTransactionId = transactionId;
            }
            payTransportData.setTxnId(this.lastTransactionId);
            aVar.a().y(a4, payTransportData.getTxnId());
        } else if (clMode == 6) {
            this.lastTransactionId = transactionId;
            payTransportData.setTxnId(transactionId);
            aVar.a().y(a4, payTransportData.getTxnId());
        } else if (clMode == 11) {
            if (TextUtils.isEmpty(transactionId)) {
                this.lastTransactionId = c70.j();
            } else {
                this.lastTransactionId = transactionId;
            }
            this.lastTransactionId = transactionId;
            payTransportData.setTxnId(transactionId);
            aVar.a().y(a4, payTransportData.getTxnId());
        }
        if (clMode == 14) {
            String str5 = C0059ao.a(9299) + transactionData.getUmn();
            payTransportData.setUmnId(transactionData.getUmn());
        }
        PayRequest payRequest = new PayRequest();
        this.payRequest = payRequest;
        payRequest.setDevice(d);
        this.payRequest.setAc(account);
        Payee payee = new Payee();
        payee.setBeneVpa(beneVpa.getVpa());
        payee.setBeneName(beneVpa.getName());
        String a5 = C0059ao.a(9300);
        if (tipAmount != null) {
            double doubleValue2 = doubleValue + tipAmount.doubleValue();
            payee.setBamount(c70.l(doubleValue2 + a5));
            this.payRequest.setAmount(c70.l(String.valueOf(doubleValue2)));
        } else {
            payee.setBamount(c70.l(doubleValue + a5));
            this.payRequest.setAmount(c70.l(String.valueOf(doubleValue)));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(payee);
        this.payRequest.setPayees(arrayList);
        this.payRequest.setRefUrl(refUrl);
        this.payRequest.setOrderId(orderId);
        this.payRequest.setRemarks(c70.p(str4));
        this.payRequest.setTxnId(payTransportData.getTxnId());
        this.payRequest.setInitmode(str3);
        this.payRequest.setMcc(transactionData.getMcc());
        this.payRequest.setPurpose(str2);
        this.payRequest.setRefCategory(str);
        this.payRequest.setIsConsentEnabled(transactionData.getIsConsentEnabled());
        if (transactionData.getInvoiceName() != null) {
            Invoice invoice = new Invoice();
            invoice.setNum(transactionData.getInvoiceNo());
            invoice.setName(transactionData.getInvoiceName());
            invoice.setDate(transactionData.getInvoiceDate());
            this.payRequest.setInvoice(invoice);
            QR qr = new QR();
            qr.setTs(transactionData.getQRts());
            qr.setqVer(transactionData.getVer());
            qr.setQrMedium(transactionData.getQrMedium());
            qr.setExpireTs(transactionData.getQRexpire());
            this.payRequest.setQr(qr);
            this.payRequest.setIsGSTEnabled(transactionData.getIsGSTEnabled());
            this.payRequest.setGstIn(transactionData.getGstIn());
            this.payRequest.setTipAmount(String.valueOf(transactionData.getTipAmount()));
            this.payRequest.setConsentName(transactionData.getConsentName());
            this.payRequest.setConsentType(transactionData.getConsentType());
            this.payRequest.setIsConsentEnabled(transactionData.getIsConsentEnabled());
            this.payRequest.setMid(transactionData.getMid());
            this.payRequest.setMsid(transactionData.getMsid());
            this.payRequest.setPinCode(transactionData.getPinCode());
            this.payRequest.setMid(transactionData.getMtid());
            this.payRequest.setTier(C0059ao.a(9301));
            Split split = new Split();
            split.setAmountSplitCESS(transactionData.getCESS());
            split.setAmountSplitCGST(transactionData.getCGST());
            split.setAmountSplitGST(transactionData.getGST());
            split.setAmountSplitIGST(transactionData.getIGST());
            split.setAmountSplitSGST(transactionData.getSGST());
            this.payRequest.setSplit(split);
        } else {
            this.payRequest.setIsConsentEnabled(transactionData.getIsConsentEnabled());
            this.payRequest.setConsentType(null);
            this.payRequest.setConsentName(null);
            this.payRequest.setTipAmount(null);
            this.payRequest.setGstIn(null);
            this.payRequest.setSplit(null);
            this.payRequest.setInvoice(null);
            this.payRequest.setQr(null);
            this.payRequest.setIsGSTEnabled(null);
            this.payRequest.setMid(null);
            this.payRequest.setMsid(null);
            this.payRequest.setPinCode(null);
            this.payRequest.setMtid(null);
            this.payRequest.setTier(null);
        }
        payTransportData.setPayrequest(this.payRequest);
        payTransportData.setPayeeName(beneVpa.getName());
        payTransportData.setRefUrl(refUrl);
        payTransportData.setLanguage(aVar.a().m(a3));
        oliveRequest.setClTransportData(payTransportData);
        try {
            initCommonLib(clMode, oliveRequest);
        } catch (OliveUpiException e) {
            Result result = new Result();
            result.code = e.getErrorCode();
            result.result = e.getMessage();
            this.listener.onFailureResponse(oliveRequest, result);
        }
    }

    public boolean isConnectionAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService(C0059ao.a(9302))).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
    }

    public boolean isPaymentServiceInitialised() {
        return TransportManager.getInstance(this).isPaymentServiceInitialised();
    }

    public void login(OliveRequest oliveRequest) {
        n70.a aVar;
        String a;
        String str;
        Authenticate authenticate = (Authenticate) oliveRequest.getRequestData();
        String pin = authenticate.getPin();
        if (TextUtils.isEmpty(pin)) {
            return;
        }
        String m = n70.f.a().m(C0059ao.a(9303));
        if (TextUtils.isEmpty(m)) {
            Toast.makeText(activity, C0059ao.a(9304), 0).show();
            return;
        }
        this.deviceDetails = c70.d(activity);
        String str2 = null;
        TransportManager.getInstance(this).setToken(null);
        CryptLibOne cryptLibOne = new CryptLibOne();
        if (authenticate.getType() == 1) {
            a = C0059ao.a(9305);
        } else {
            pin = c70.g(activity, pin);
            a = C0059ao.a(9306);
        }
        TransportConstants.sk = CryptLibOne.createAesKey();
        StringBuilder sb = new StringBuilder();
        sb.append(m);
        String a2 = C0059ao.a(9307);
        sb.append(a2);
        sb.append(pin);
        sb.append(a2);
        sb.append(TransportConstants.sk);
        String str3 = aVar.a().m(C0059ao.a(9308)) + a2 + aVar.a().m(C0059ao.a(9309)) + a2 + aVar.a().m(C0059ao.a(9310)) + a2 + C0059ao.a(9311) + a2 + aVar.a().m(C0059ao.a(9312)) + a2 + aVar.a().m(C0059ao.a(9313)) + a2 + authenticate.getAppVersion() + a2 + System.currentTimeMillis() + a2 + a;
        try {
            str = new RegHelper().encryptData(sb.toString());
            try {
                str2 = Base64.encodeToString(cryptLibOne.encrypt(str3.getBytes(), cryptLibOne.hexStringToByteArray(TransportConstants.sk)), 2);
            } catch (Exception e) {
                e = e;
                e.getMessage();
                authenticate.setDevice(str2);
                authenticate.setPassword(str);
                authenticate.setUsername(m);
                oliveRequest.setRequestData(authenticate);
                TransportManager.getInstance(this).authenticate(activity, oliveRequest);
            }
        } catch (Exception e2) {
            e = e2;
            str = null;
        }
        authenticate.setDevice(str2);
        authenticate.setPassword(str);
        authenticate.setUsername(m);
        oliveRequest.setRequestData(authenticate);
        TransportManager.getInstance(this).authenticate(activity, oliveRequest);
    }

    public void mandateCreateRequest(OliveRequest oliveRequest) {
        TransportManager transportManager = TransportManager.getInstance(this);
        Activity activity2 = activity;
        n70.a aVar = n70.f;
        transportManager.createMandateRequest(activity2, aVar.a().m(C0059ao.a(9314)), aVar.a().m(C0059ao.a(9315)), oliveRequest);
    }

    public void mandateExecute(OliveRequest oliveRequest) {
        TransportManager transportManager = TransportManager.getInstance(this);
        Activity activity2 = activity;
        n70.a aVar = n70.f;
        transportManager.mandateExecute(activity2, aVar.a().m(C0059ao.a(9316)), aVar.a().m(C0059ao.a(9317)), oliveRequest);
    }

    public void mandateHistory(OliveRequest oliveRequest) {
        TransportManager transportManager = TransportManager.getInstance(this);
        Activity activity2 = activity;
        n70.a aVar = n70.f;
        transportManager.mandatehistory(activity2, aVar.a().m(C0059ao.a(9318)), aVar.a().m(C0059ao.a(9319)), oliveRequest);
    }

    public void mandateRequest(OliveRequest oliveRequest) {
        TransportManager transportManager = TransportManager.getInstance(this);
        Activity activity2 = activity;
        n70.a aVar = n70.f;
        transportManager.mandateRequest(activity2, aVar.a().m(C0059ao.a(9320)), aVar.a().m(C0059ao.a(9321)), oliveRequest);
    }

    public void mandateUpdate(OliveRequest oliveRequest) {
        OliveRequest oliveRequest2;
        String a = C0059ao.a(9322);
        String a2 = C0059ao.a(9323);
        MandateTransactionData mandateTransactionData = (MandateTransactionData) oliveRequest.getRequestData();
        int transactionMode = mandateTransactionData.getTransactionMode();
        String str = C0059ao.a(9324) + transactionMode;
        Account account = mandateTransactionData.getAccount();
        double doubleValue = mandateTransactionData.getAmount().doubleValue();
        String payerVpa = mandateTransactionData.getPayerVpa();
        String payeeVpa = mandateTransactionData.getPayeeVpa();
        String payeeName = mandateTransactionData.getPayeeName();
        String umnID = mandateTransactionData.getUmnID();
        String transactionId = mandateTransactionData.getTransactionId();
        String updateType = mandateTransactionData.getUpdateType();
        String refUrl = mandateTransactionData.getRefUrl();
        String remarks = mandateTransactionData.getRemarks();
        try {
            MandateUpdateData mandateUpdateData = new MandateUpdateData();
            mandateUpdateData.setMode(transactionMode);
            n70.a aVar = n70.f;
            mandateUpdateData.setCommonLibToken(aVar.a().m(C0059ao.a(9325)));
            mandateUpdateData.setXmlPayLoadString(aVar.a().m(C0059ao.a(9326)));
            mandateUpdateData.setMobileNumber(aVar.a().m(a2));
            mandateUpdateData.setAmount(c70.l(String.valueOf(doubleValue)));
            mandateUpdateData.setPayerVpa(payerVpa);
            mandateUpdateData.setPayeeVpa(payeeVpa);
            mandateUpdateData.setPayeeName(payeeName);
            mandateUpdateData.setRemark(remarks);
            mandateUpdateData.setRefUrl(refUrl);
            mandateUpdateData.setSourceAccount(account);
            DeviceDetails d = c70.d(activity);
            mandateUpdateData.setDeviceDetails(d);
            mandateUpdateData.setLanguage(aVar.a().m(a));
            if (transactionMode == 13) {
                this.lastTransactionId = transactionId;
                mandateUpdateData.setTxnId(transactionId);
                aVar.a().y(C0059ao.a(9327), mandateUpdateData.getTxnId());
            }
            UpdateMandate updateMandate = new UpdateMandate();
            this.updateMandate = updateMandate;
            updateMandate.setDevice(d);
            this.updateMandate.setNewstate(updateType);
            this.updateMandate.setUmn(umnID);
            this.updateMandate.setCustomerid(aVar.a().m(a2));
            this.updateMandate.setTxnid(mandateUpdateData.getTxnId());
            mandateUpdateData.setRefUrl(refUrl);
            mandateUpdateData.setLanguage(aVar.a().m(a));
            mandateUpdateData.setUpdateMandate(this.updateMandate);
            oliveRequest2 = oliveRequest;
            try {
                oliveRequest2.setClTransportData(mandateUpdateData);
                initCommonLib(transactionMode, oliveRequest2);
            } catch (OliveUpiException e) {
                e = e;
                Result result = new Result();
                result.code = e.getErrorCode();
                result.result = e.getMessage();
                this.listener.onFailureResponse(oliveRequest2, result);
            }
        } catch (OliveUpiException e2) {
            e = e2;
            oliveRequest2 = oliveRequest;
        }
    }

    @Override // com.olive.upi.transport.TransportManager.UPIConnectionListener
    public void onFailureResponse(OliveRequest oliveRequest, Object obj) {
        Result result = new Result();
        result.code = C0059ao.a(9328);
        String str = (String) obj;
        boolean isEmpty = TextUtils.isEmpty(str);
        String a = C0059ao.a(9329);
        String a2 = C0059ao.a(9330);
        if (isEmpty) {
            str = activity.getString(g70.unable_to_process_your_request);
            result.code = a;
        } else if (!str.startsWith(C0059ao.a(9331)) && !str.startsWith(C0059ao.a(9332)) && !str.equals(a2)) {
            if (str.equalsIgnoreCase(C0059ao.a(9333))) {
                str = activity.getString(g70.unable_to_process_your_request);
                result.code = C0059ao.a(9334);
            } else if (!str.equalsIgnoreCase(a2)) {
                str = activity.getString(g70.unable_to_process_your_request);
                result.code = a;
            }
        } else {
            result.code = C0059ao.a(9335);
            str = a2;
        }
        result.result = str;
        OliveUpiEventListener oliveUpiEventListener = this.listener;
        if (oliveUpiEventListener != null) {
            oliveUpiEventListener.onFailureResponse(oliveRequest, result);
        }
    }

    @Override // com.olive.upi.transport.service.CommonLibService.OliveCommonLibListener
    public void onReceiveResult(int i, int i2, Object obj, OliveRequest oliveRequest) throws OliveUpiException {
        String str = C0059ao.a(9336) + i + C0059ao.a(9337) + i2 + C0059ao.a(9338) + obj + C0059ao.a(9339) + this.listener;
        if (i == 2) {
            Result result = new Result();
            result.setCode(C0059ao.a(9340));
            this.listener.onFailureResponse(new OliveRequest(7), result);
        } else if (obj == null) {
            Result result2 = new Result();
            result2.setCode(C0059ao.a(9341));
            this.listener.onFailureResponse(new OliveRequest(i2), result2);
        } else {
            String a = C0059ao.a(9342);
            String a2 = C0059ao.a(9343);
            String a3 = C0059ao.a(9344);
            if (i2 == 2) {
                HashMap hashMap = (HashMap) ((Bundle) obj).getSerializable(a3);
                for (String str2 : hashMap.keySet()) {
                    Cred cred = (Cred) new Gson().fromJson((String) hashMap.get(str2), (Class<Object>) Cred.class);
                    if (cred.getSubType().equals(a2)) {
                        this.regRequest.setMpincred(cred);
                    } else if (cred.getSubType().equals(C0059ao.a(9345))) {
                        this.regRequest.setAtmpincred(cred);
                    } else {
                        cred.setSubType(C0059ao.a(9346));
                        this.regRequest.setOtpcred(cred);
                    }
                }
                this.regRequest.setDevice(this.deviceDetails);
                RegRequest regRequest = this.regRequest;
                n70.a aVar = n70.f;
                regRequest.setRegtype(aVar.a().m(C0059ao.a(9347)));
                this.regRequest.setCustomerid(this.deviceDetails.getMobile());
                this.regRequest.setTxnId(aVar.a().m(a));
                new Gson();
                this.listener.onCommonLibResponse(8, this.regRequest);
                return;
            }
            String a4 = C0059ao.a(9348);
            if (i2 == 3) {
                HashMap hashMap2 = (HashMap) ((Bundle) obj).getSerializable(a3);
                ArrayList arrayList = new ArrayList();
                for (String str3 : hashMap2.keySet()) {
                    try {
                        new JSONObject((String) hashMap2.get(str3));
                        arrayList.add((Cred) new Gson().fromJson((String) hashMap2.get(str3), (Class<Object>) Cred.class));
                    } catch (JSONException unused) {
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Cred cred2 = (Cred) it.next();
                    if (cred2.getSubType().equals(C0059ao.a(9349))) {
                        this.changeCredReq.setNewcred(cred2);
                    } else {
                        this.changeCredReq.setCred(cred2);
                    }
                }
                ChangeCredReq changeCredReq = this.changeCredReq;
                n70.a aVar2 = n70.f;
                changeCredReq.setTxnid(aVar2.a().m(a));
                this.changeCredReq.setDevice(this.deviceDetails);
                this.changeCredReq.setCustomerid(aVar2.a().m(a4));
                this.listener.onCommonLibResponse(28, this.changeCredReq);
                return;
            }
            String a5 = C0059ao.a(9350);
            String a6 = C0059ao.a(9351);
            String a7 = C0059ao.a(9352);
            String a8 = C0059ao.a(9353);
            String a9 = C0059ao.a(9354);
            if (i2 == 5 || i2 == 6 || i2 == 7 || i2 == 10 || i2 == 9 || i2 == 14 || i2 == 11 || i2 == 12) {
                HashMap hashMap3 = (HashMap) ((Bundle) obj).getSerializable(a3);
                for (String str4 : hashMap3.keySet()) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) hashMap3.get(str4));
                        Data data = new Data();
                        data.setCode(a8);
                        data.setEncryptedBase64String(jSONObject.getJSONObject(a9).getString(a7));
                        data.setKi(jSONObject.getJSONObject(a9).getString(a6));
                        this.payRequest.setDevice(this.deviceDetails);
                        Cred cred3 = new Cred();
                        cred3.setData(data);
                        cred3.setType(a5);
                        cred3.setSubType(a2);
                        this.payRequest.setCustomerId(this.deviceDetails.getMobile());
                        this.payRequest.setCred(cred3);
                    } catch (JSONException unused2) {
                    }
                }
                this.listener.onSuccessResponse(new OliveRequest(-100), null);
                if (i2 == 6) {
                    this.listener.onCommonLibResponse(24, this.payRequest);
                } else if (i2 == 7) {
                    this.billPayRequest.setPayRequest(this.payRequest);
                    this.listener.onCommonLibResponse(45, this.billPayRequest);
                } else if (i2 == 10) {
                    this.billPayRequest.setPayRequest(this.payRequest);
                    this.listener.onCommonLibResponse(69, this.billPayRequest);
                } else if (i2 == 14) {
                    String str5 = C0059ao.a(9359) + i2;
                    this.listener.onCommonLibResponse(92, this.payRequest);
                } else if (i2 == 9) {
                    this.listener.onCommonLibResponse(i2, this.payRequest);
                } else if (i2 == 12) {
                    this.listener.onCommonLibResponse(i2, this.payRequest);
                } else if (i2 == 11) {
                    this.listener.onCommonLibResponse(77, this.payRequest);
                } else {
                    this.listener.onCommonLibResponse(10, this.payRequest);
                }
            } else if (i2 == 13) {
                HashMap hashMap4 = (HashMap) ((Bundle) obj).getSerializable(a3);
                for (String str6 : hashMap4.keySet()) {
                    try {
                        JSONObject jSONObject2 = new JSONObject((String) hashMap4.get(str6));
                        Data data2 = new Data();
                        data2.setCode(a8);
                        data2.setEncryptedBase64String(jSONObject2.getJSONObject(a9).getString(a7));
                        data2.setKi(jSONObject2.getJSONObject(a9).getString(a6));
                        this.updateMandate.setDevice(this.deviceDetails);
                        Cred cred4 = new Cred();
                        cred4.setData(data2);
                        cred4.setType(a5);
                        cred4.setSubType(a2);
                        this.updateMandate.setCustomerid(this.deviceDetails.getMobile());
                        this.updateMandate.setCred(cred4);
                    } catch (JSONException unused3) {
                    }
                }
                this.listener.onCommonLibResponse(76, this.updateMandate);
            } else if (i2 == 1) {
                HashMap hashMap5 = (HashMap) ((Bundle) obj).getSerializable(a3);
                ArrayList arrayList2 = new ArrayList();
                for (String str7 : hashMap5.keySet()) {
                    try {
                        new JSONObject((String) hashMap5.get(str7));
                        arrayList2.add((Cred) new Gson().fromJson((String) hashMap5.get(str7), (Class<Object>) Cred.class));
                    } catch (JSONException unused4) {
                    }
                }
                AccountTransportData accountTransportData = (AccountTransportData) oliveRequest.getClTransportData();
                BRequest bRequest = new BRequest();
                bRequest.setAc(accountTransportData.getAccount());
                bRequest.setTxnid(accountTransportData.getTxnId());
                if (arrayList2.size() > 0) {
                    bRequest.setCred((Cred) arrayList2.get(0));
                }
                bRequest.setCustomerId(n70.f.a().m(a4));
                bRequest.setDevice(this.deviceDetails);
                this.listener.onCommonLibResponse(19, bRequest);
            } else if (i2 == 4) {
                InitLib initLib = (InitLib) oliveRequest.getClInitData();
                n70.a aVar3 = n70.f;
                String m = aVar3.a().m(C0059ao.a(9355));
                if (initLib.getExpDayCount() < TransportConstants.MAX_TOKEN_DAYS && !TextUtils.isEmpty(m)) {
                    initCommonLibAction(initLib.getReqType(), oliveRequest);
                    return;
                }
                String challenge = initLib.getChallenge();
                StringBuilder sb = new StringBuilder();
                sb.append(aVar3.a().m(C0059ao.a(9356)));
                String a10 = C0059ao.a(9357);
                sb.append(a10);
                sb.append(aVar3.a().m(C0059ao.a(9358)));
                sb.append(a10);
                sb.append(aVar3.a().m(a4));
                sb.append(a10);
                sb.append(challenge);
                oliveRequest.setRequestData(sb.toString());
                oliveRequest.setRequestType(4);
                sendRequest(oliveRequest);
            }
        }
    }

    @Override // com.olive.upi.transport.service.CommonLibService.OliveCommonLibListener
    public void onServiceConnected(int i, OliveRequest oliveRequest) throws OliveUpiException {
        InitLib initLib = (InitLib) oliveRequest.getClInitData();
        n70.a aVar = n70.f;
        if (!TextUtils.isEmpty(aVar.a().m(C0059ao.a(9360))) && initLib.getExpDayCount() < TransportConstants.MAX_TOKEN_DAYS) {
            initCommonLibAction(initLib.reqType, oliveRequest);
            return;
        }
        String challenge = initLib.getChallenge();
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.a().m(C0059ao.a(9361)));
        String a = C0059ao.a(9362);
        sb.append(a);
        sb.append(aVar.a().m(C0059ao.a(9363)));
        sb.append(a);
        sb.append(aVar.a().m(C0059ao.a(9364)));
        sb.append(a);
        sb.append(challenge);
        oliveRequest.setRequestData(sb.toString());
        oliveRequest.setRequestType(4);
        sendRequest(oliveRequest);
    }

    @Override // com.olive.upi.transport.service.CommonLibService.OliveCommonLibListener
    public void onServiceError(int i, OliveUpiException oliveUpiException, OliveRequest oliveRequest) {
        Result result = new Result();
        result.setCode(C0059ao.a(9365));
        this.listener.onFailureResponse(oliveRequest, result);
    }

    @Override // com.olive.upi.transport.TransportManager.UPIConnectionListener
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        String code = (result == null || result.getCode() == null) ? null : result.getCode();
        if (this.listener == null) {
            return;
        }
        if (code == null) {
            Result result2 = new Result();
            String string = activity.getString(g70.unable_to_process_your_request);
            result2.code = C0059ao.a(9366);
            result2.result = string;
            this.listener.onFailureResponse(oliveRequest, result2);
            return;
        }
        String a = C0059ao.a(9367);
        if (code.equalsIgnoreCase(a)) {
            Result result3 = new Result();
            result3.code = a;
            this.listener.onFailureResponse(oliveRequest, result3);
            return;
        }
        int requestType = oliveRequest.getRequestType();
        String a2 = C0059ao.a(9368);
        String a3 = C0059ao.a(9369);
        if (requestType == 4) {
            if (code.equals(a3)) {
                String str = (String) result.getData();
                n70.a aVar = n70.f;
                String m = aVar.a().m(C0059ao.a(9397));
                String m2 = aVar.a().m(C0059ao.a(9398));
                boolean booleanValue = Boolean.valueOf(TransportConstants.mClservices.g(m, this.deviceDetails.getMobile(), m2, CommonLibService.populateHMAC(m, this.deviceDetails.getMobile(), str, m2))).booleanValue();
                String a4 = C0059ao.a(9399);
                if (booleanValue) {
                    try {
                        aVar.a().y(a2, str);
                        aVar.a().A(C0059ao.a(9400), true);
                        Result result4 = new Result();
                        result4.setCode(result.getCode());
                        result4.setResult(result.getResult());
                        initCommonLibAction(((InitLib) oliveRequest.getClInitData()).reqType, oliveRequest);
                        return;
                    } catch (OliveUpiException unused) {
                        Result result5 = new Result();
                        result5.setCode(a4);
                        this.listener.onFailureResponse(new OliveRequest(4), result5);
                        return;
                    }
                }
                Result result6 = new Result();
                result6.setCode(a4);
                this.listener.onFailureResponse(new OliveRequest(4), result6);
                return;
            }
            this.listener.onFailureResponse(new OliveRequest(4), result);
            return;
        }
        String a5 = C0059ao.a(9370);
        String a6 = C0059ao.a(9371);
        if (requestType == 7) {
            if (code.equals(a3)) {
                try {
                    AccountTransportData accountTransportData = new AccountTransportData();
                    n70.a aVar2 = n70.f;
                    accountTransportData.setXmlPayLoadString(aVar2.a().m(a5));
                    accountTransportData.setMobileNumber(aVar2.a().m(a6));
                    accountTransportData.setDeviceDetails(c70.d(activity));
                    accountTransportData.setCommonLibToken(aVar2.a().m(a2));
                    accountTransportData.setAccount(this.regRequest.getAc());
                    String j = c70.j();
                    this.lastTransactionId = j;
                    accountTransportData.setTxnId(j);
                    aVar2.a().y(C0059ao.a(9395), this.lastTransactionId);
                    accountTransportData.setLanguage(aVar2.a().m(C0059ao.a(9396)));
                    oliveRequest.setClTransportData(accountTransportData);
                    initCommonLib(2, oliveRequest);
                    return;
                } catch (OliveUpiException unused2) {
                    this.listener.onFailureResponse(oliveRequest, result);
                    return;
                }
            }
            this.listener.onFailureResponse(oliveRequest, result);
        } else if (requestType != 12) {
            if (requestType != 15) {
                if (requestType == 21) {
                    if (code.equals(a3)) {
                        this.listener.onSuccessResponse(oliveRequest, result);
                        return;
                    }
                    Result result7 = new Result();
                    result7.setCode(C0059ao.a(9392));
                    result7.setResult(C0059ao.a(9393));
                    this.listener.onFailureResponse(oliveRequest, result7);
                    return;
                } else if (requestType == 23) {
                    if (code.equals(a3)) {
                        TokenResponse tokenResponse = (TokenResponse) result.getData();
                        if (tokenResponse != null) {
                            MasterUpdate masterUpdate = new MasterUpdate();
                            masterUpdate.setBanner(tokenResponse.getBannerVersion());
                            masterUpdate.setEncryptionFlag(tokenResponse.getEncryptionFlag());
                            masterUpdate.setDthOperator(tokenResponse.getDthOperatorVersion());
                            masterUpdate.setMobileOperator(tokenResponse.getMobOperatorVersion());
                            masterUpdate.setBill_pay_max(tokenResponse.getBillpayMaxAmtVersion());
                            n70.a aVar3 = n70.f;
                            aVar3.a().y(C0059ao.a(9377), new Gson().toJson(masterUpdate));
                            aVar3.a().v(C0059ao.a(9378), tokenResponse.getRateitnow());
                            aVar3.a().v(C0059ao.a(9379), tokenResponse.getRemindmelater());
                            aVar3.a().v(C0059ao.a(9380), tokenResponse.getNothanks());
                            aVar3.a().y(C0059ao.a(9381), tokenResponse.getAsap());
                            aVar3.a().y(C0059ao.a(9382), tokenResponse.getVpa());
                            aVar3.a().y(C0059ao.a(9383), tokenResponse.getChecksumWebUrl());
                            aVar3.a().v(C0059ao.a(9384), tokenResponse.getBannerVersion());
                            aVar3.a().v(C0059ao.a(9385), tokenResponse.getDthOperatorVersion());
                            aVar3.a().v(C0059ao.a(9386), tokenResponse.getMobOperatorVersion());
                            aVar3.a().v(C0059ao.a(9387), tokenResponse.getBillpayMaxAmtVersion());
                            TransportManager.getInstance(this).setToken(tokenResponse.getToken());
                            TransportConstants.MAX_AMOUNT_ALLOWED = tokenResponse.getAmount();
                            aVar3.a().y(C0059ao.a(9388), C0059ao.a(9389));
                            tokenResponse.getVpa();
                            int notification = tokenResponse.getNotification();
                            int tokenexpirydays = tokenResponse.getTokenexpirydays();
                            TransportConstants.MAX_TOKEN_DAYS = tokenResponse.getTokenValidDays();
                            aVar3.a().v(C0059ao.a(9390), tokenexpirydays);
                            TransportConstants.BILLPAY_UPIID = tokenResponse.getBillpayvpa();
                            TransportConstants.FLRESPDESC = tokenResponse.getFlrespdesc();
                            TransportConstants.FPRESPDESC = tokenResponse.getFprespdesc();
                            TransportConstants.BILLERPAY_UPIID = tokenResponse.getBillervpa();
                            aVar3.a().v(C0059ao.a(9391), notification);
                        }
                        this.listener.onSuccessResponse(oliveRequest, result);
                        return;
                    }
                    this.listener.onFailureResponse(oliveRequest, result);
                    return;
                } else if (requestType == 29) {
                    if (code.equals(a3)) {
                        if (((ArrayList) result.getData()) != null) {
                            this.listener.onSuccessResponse(oliveRequest, result);
                            return;
                        } else {
                            this.listener.onFailureResponse(oliveRequest, result);
                            return;
                        }
                    }
                    this.listener.onFailureResponse(oliveRequest, result);
                    return;
                } else if (requestType != 43 && requestType != 81) {
                    if (requestType != 89) {
                        if (requestType != 9 && requestType != 10) {
                            if (requestType == 18) {
                                if (((ArrayList) result.getData()) != null) {
                                    this.listener.onSuccessResponse(oliveRequest, result);
                                    return;
                                } else {
                                    this.listener.onFailureResponse(oliveRequest, result);
                                    return;
                                }
                            } else if (requestType != 19 && requestType != 34 && requestType != 35) {
                                switch (requestType) {
                                    case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                                        break;
                                    case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                                        if (((ArrayList) result.getData()) != null) {
                                            this.listener.onSuccessResponse(oliveRequest, result);
                                            return;
                                        } else {
                                            this.listener.onFailureResponse(oliveRequest, result);
                                            return;
                                        }
                                    case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                                        if (((ArrayList) result.getData()) != null) {
                                            this.listener.onSuccessResponse(oliveRequest, result);
                                            return;
                                        } else {
                                            this.listener.onFailureResponse(oliveRequest, result);
                                            return;
                                        }
                                    default:
                                        switch (requestType) {
                                            case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                                                if (!result.getCode().equals(C0059ao.a(9374)) && !code.equals(a3)) {
                                                    this.listener.onFailureResponse(oliveRequest, result);
                                                    return;
                                                } else {
                                                    this.listener.onSuccessResponse(oliveRequest, result);
                                                    return;
                                                }
                                            case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                                                if (code.equals(a3)) {
                                                    TransportManager.getInstance(this).setToken(null);
                                                    n70.f.a().A(C0059ao.a(9373), false);
                                                    this.listener.onSuccessResponse(oliveRequest, result);
                                                    return;
                                                }
                                                this.listener.onFailureResponse(oliveRequest, result);
                                                return;
                                            case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                                                if (code.equals(a3)) {
                                                    n70.f.a().c(C0059ao.a(9372));
                                                    this.listener.onSuccessResponse(oliveRequest, result);
                                                    return;
                                                }
                                                this.listener.onFailureResponse(oliveRequest, result);
                                                return;
                                            case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                                                if (code.equals(a3)) {
                                                    this.listener.onSuccessResponse(oliveRequest, result);
                                                    return;
                                                } else {
                                                    this.listener.onFailureResponse(oliveRequest, result);
                                                    return;
                                                }
                                            case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                                                break;
                                            default:
                                                if (code.equals(a3)) {
                                                    this.listener.onSuccessResponse(oliveRequest, result);
                                                    return;
                                                } else {
                                                    this.listener.onFailureResponse(oliveRequest, result);
                                                    return;
                                                }
                                        }
                                }
                            }
                        }
                    }
                    if (code.equals(a3)) {
                        Registration registration = (Registration) result.getData();
                        String mobilenumber = registration.getMobilenumber();
                        if (getDecryptedData(mobilenumber) != null && getDecryptedData(registration.getAction()) != null) {
                            String str2 = new String(getDecryptedData(mobilenumber));
                            byte[] decryptedData = getDecryptedData(registration.getAction());
                            n70.f.a().y(a6, str2);
                            registration.getName();
                            TransportConstants.regToken = CryptLibOne.bytesToHex(decryptedData);
                            this.listener.onSuccessResponse(oliveRequest, result);
                            return;
                        }
                        Result result8 = new Result();
                        result8.setCode(C0059ao.a(9375));
                        result8.setResult(C0059ao.a(9376));
                        this.listener.onFailureResponse(oliveRequest, result);
                        return;
                    }
                    this.listener.onFailureResponse(oliveRequest, result);
                    return;
                }
            }
            if (code.equals(a3)) {
                this.listener.onSuccessResponse(oliveRequest, result);
            } else {
                this.listener.onFailureResponse(oliveRequest, result);
            }
        } else if (code.equals(a3)) {
            try {
                n70.f.a().y(a5, new String(Base64.decode((String) result.getData(), 0), C0059ao.a(9394)));
            } catch (UnsupportedEncodingException unused3) {
            }
            this.listener.onSuccessResponse(oliveRequest, result);
        } else {
            this.listener.onFailureResponse(oliveRequest, result);
        }
    }

    public void pay(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).pay(activity, oliveRequest);
    }

    public void payBBPSBill(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).payBBPSBill(activity, oliveRequest);
    }

    public void pendingMandateRequest(OliveRequest oliveRequest) {
        TransportManager transportManager = TransportManager.getInstance(this);
        Activity activity2 = activity;
        n70.a aVar = n70.f;
        transportManager.getPendingMandateReq(activity2, aVar.a().m(C0059ao.a(9401)), aVar.a().m(C0059ao.a(9402)), oliveRequest);
    }

    public void raiseComplain(OliveRequest oliveRequest) {
        ReqComplientVo reqComplientVo = new ReqComplientVo();
        UdirReasons udirReasons = (UdirReasons) oliveRequest.getRequestData();
        reqComplientVo.setInitiationMode(C0059ao.a(9403));
        reqComplientVo.setOrgTxnId(udirReasons.getTransactionID());
        if (udirReasons != null) {
            reqComplientVo.setReqAdjCode(udirReasons.adjcode);
            reqComplientVo.setReqAdjFlag(udirReasons.adjflag);
        }
        reqComplientVo.setSubType(C0059ao.a(9404));
        reqComplientVo.setType(C0059ao.a(9405));
        oliveRequest.setRequestData(reqComplientVo);
        TransportManager.getInstance(this).getraiseComplain(activity, n70.f.a().m(C0059ao.a(9406)), oliveRequest);
    }

    public void raiseQuery(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).raiseQuery(activity, oliveRequest);
    }

    public void recurrenceAuthorization(OliveRequest oliveRequest) {
        RecurrenceAuthorization recurrenceAuthorization = (RecurrenceAuthorization) oliveRequest.getRequestData();
        recurrenceAuthorization.setDevice(c70.d(activity));
        oliveRequest.setRequestData(recurrenceAuthorization);
        TransportManager transportManager = TransportManager.getInstance(this);
        Activity activity2 = activity;
        n70.a aVar = n70.f;
        transportManager.recurrenceAuthorization(activity2, aVar.a().m(C0059ao.a(9407)), aVar.a().m(C0059ao.a(9408)), oliveRequest);
    }

    public void recurrencePending(OliveRequest oliveRequest) {
        TransportManager transportManager = TransportManager.getInstance(this);
        Activity activity2 = activity;
        n70.a aVar = n70.f;
        transportManager.recurrencePending(activity2, aVar.a().m(C0059ao.a(9409)), aVar.a().m(C0059ao.a(9410)), oliveRequest);
    }

    public void regBillerEnq(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).regBillerEnq(activity, oliveRequest);
    }

    public void registerUser(OliveRequest oliveRequest) {
        String a;
        if (oliveRequest.getRequestData() instanceof UserRegister) {
            UserRegister userRegister = (UserRegister) oliveRequest.getRequestData();
            userRegister.getConfirmPassword();
            n70.a aVar = n70.f;
            n70 a2 = aVar.a();
            String a3 = C0059ao.a(9411);
            if (TextUtils.isEmpty(a2.m(a3))) {
                Toast.makeText(activity, C0059ao.a(9412), 0).show();
                Result result = new Result();
                result.setCode(C0059ao.a(9413));
                result.setResult(C0059ao.a(9414));
                this.listener.onFailureResponse(new OliveRequest(37), result);
                return;
            }
            TransportManager.getInstance(this).setToken(null);
            this.deviceDetails = c70.d(activity);
            RegCustomer regCustomer = new RegCustomer();
            regCustomer.setCustomerName(userRegister.getCustName());
            regCustomer.setDeviceDetails(this.deviceDetails);
            regCustomer.setRefereevpa(userRegister.getReferralVpa());
            regCustomer.setAppPin(userRegister.getConfirmPassword());
            regCustomer.setEmail(userRegister.getCustEmail());
            regCustomer.setRegtype(userRegister.getRegType());
            aVar.a().y(C0059ao.a(9415), userRegister.getCustEmail());
            regCustomer.setVpa(aVar.a().m(a3) + C0059ao.a(9416));
            byte[] bytes = new Gson().toJson(regCustomer).getBytes();
            CryptLibOne cryptLibOne = new CryptLibOne();
            try {
                a = CryptLibOne.bytesToHex(cryptLibOne.encrypt(bytes, cryptLibOne.hexStringToByteArray(TransportConstants.regToken)));
            } catch (Exception unused) {
                a = C0059ao.a(9417);
            }
            CustomerReg customerReg = new CustomerReg();
            customerReg.setData(a);
            customerReg.setRefid(TransportConstants.regRandom);
            oliveRequest.setRequestData(customerReg);
        }
        TransportManager.getInstance(this).customerReg(activity, oliveRequest);
    }

    public void rejectPendingRequest(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).rejectpending(activity, oliveRequest);
    }

    public void retryLastRequest() {
        this.request.incrementRequestCount();
        sendRequest(this.request);
    }

    public void safetyNetCheck(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).safetyNetChecker(activity, oliveRequest);
    }

    public void saveVpaContact(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).saveVpa(activity, n70.f.a().m(C0059ao.a(9418)), oliveRequest);
    }

    public void sendAccountOTP(Account account) {
        AccountOTPRequest accountOTPRequest = new AccountOTPRequest();
        accountOTPRequest.setCustomerId(n70.f.a().m(C0059ao.a(9419)));
        accountOTPRequest.setAc(account);
        accountOTPRequest.setBankId(account.getIin());
        this.deviceDetails = c70.d(activity);
        String j = c70.j();
        this.lastTransactionId = j;
        accountOTPRequest.setTxnId(j);
        accountOTPRequest.setDevice(this.deviceDetails);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void sendRequest(OliveRequest oliveRequest) {
        if (oliveRequest == null) {
            onFailureResponse(oliveRequest, Integer.valueOf(g70.unable_to_process_your_request));
            return;
        }
        this.request = oliveRequest;
        if (!isConnectionAvailable(activity)) {
            onFailureResponse(oliveRequest, C0059ao.a(9420));
            return;
        }
        int requestType = oliveRequest.getRequestType();
        switch (requestType) {
            case 4:
                generateToken(oliveRequest);
                return;
            case 15:
                fetchMyAccounts(oliveRequest);
                return;
            case 21:
                getUPIBankList(oliveRequest);
                return;
            case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                registerUser(oliveRequest);
                return;
            case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                getLongcode(oliveRequest);
                return;
            case 72:
                getInboxDate(oliveRequest);
                return;
            case 75:
                pendingMandateRequest(oliveRequest);
                return;
            case 76:
                updateMandate(oliveRequest);
                return;
            case 77:
                acceptMandate(oliveRequest);
                return;
            case 78:
                mandateHistory(oliveRequest);
                return;
            case 79:
                getVerifyVpa2(oliveRequest);
                return;
            case 80:
                getInfo(oliveRequest);
                return;
            case 81:
                updateInbox(oliveRequest);
                return;
            case 82:
                mandateExecute(oliveRequest);
                return;
            case 83:
            case 583:
                signedQR(oliveRequest);
                return;
            case 84:
                verifyQR(oliveRequest);
                return;
            case 85:
                getPromotionalOffers(oliveRequest);
                return;
            case 86:
                getWebUrls(oliveRequest);
                return;
            case 87:
                getPersonalLoan(oliveRequest);
                return;
            case 88:
                getClToken(oliveRequest);
                return;
            case 89:
                skipBindCall(oliveRequest);
                return;
            case 90:
                balanceEnqForCreditLine(oliveRequest);
                return;
            case 91:
                recurrencePending(oliveRequest);
                return;
            case 92:
                recurrenceAuthorization(oliveRequest);
                return;
            case 93:
                recurrenceAuthorization(oliveRequest);
                return;
            case 101:
                safetyNetCheck(oliveRequest);
                return;
            case 102:
                setuCheck(oliveRequest);
                return;
            case 173:
                getPlainAccountNumber(oliveRequest);
                return;
            case 510:
                initiatePay(oliveRequest);
                return;
            case 519:
                checkBalance(oliveRequest);
                return;
            case 528:
                initiateChangeMpin(oliveRequest);
                return;
            case 560:
                break;
            case 576:
                mandateUpdate(oliveRequest);
                return;
            case 592:
                initiatePay(oliveRequest);
                return;
            default:
                switch (requestType) {
                    case 6:
                        getAccountsFromBank(oliveRequest);
                        return;
                    case 7:
                        activateAccount(oliveRequest);
                        return;
                    case 8:
                        accountMobReg(oliveRequest);
                        return;
                    case 9:
                        updateVPA(oliveRequest);
                        return;
                    case 10:
                        pay(oliveRequest);
                        return;
                    case 11:
                        collect(oliveRequest);
                        return;
                    case 12:
                        fetchPayloadKey(oliveRequest);
                        return;
                    default:
                        switch (requestType) {
                            case 17:
                                saveVpaContact(oliveRequest);
                                return;
                            case 18:
                                getVpaList(oliveRequest);
                                return;
                            case 19:
                                getBalance(oliveRequest);
                                return;
                            default:
                                switch (requestType) {
                                    case 23:
                                        login(oliveRequest);
                                        return;
                                    case 24:
                                        collectPay(oliveRequest);
                                        return;
                                    case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                                        getMobileNumber(oliveRequest);
                                        return;
                                    default:
                                        switch (requestType) {
                                            case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                                                getPendingRequest(oliveRequest);
                                                return;
                                            case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                                                changeMPin(oliveRequest);
                                                return;
                                            case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                                                rejectPendingRequest(oliveRequest);
                                                return;
                                            case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                                                vpaSuggestion(oliveRequest);
                                                return;
                                            case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                                                deleteAccount(oliveRequest);
                                                return;
                                            case 32:
                                                deleteVpa(oliveRequest);
                                                return;
                                            case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                                                raiseQuery(oliveRequest);
                                                return;
                                            case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                                                getQueryList(oliveRequest);
                                                return;
                                            case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                                                userPasscodeChange(oliveRequest);
                                                return;
                                            default:
                                                switch (requestType) {
                                                    case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                                                        billPayment(oliveRequest);
                                                        return;
                                                    case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                                                        getBanner(oliveRequest);
                                                        return;
                                                    case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                                                        getMobileOperator(oliveRequest);
                                                        return;
                                                    case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                                                        getMobileCircles(oliveRequest);
                                                        return;
                                                    default:
                                                        switch (requestType) {
                                                            case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                                                                getBillPayMaxAmounts(oliveRequest);
                                                                return;
                                                            case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                                                                getDthOperator(oliveRequest);
                                                                return;
                                                            case 52:
                                                                beneVpaBlock(oliveRequest);
                                                                return;
                                                            case 53:
                                                                collectBlockedVpaList(oliveRequest);
                                                                return;
                                                            default:
                                                                switch (requestType) {
                                                                    case 55:
                                                                        getRechargePlan(oliveRequest);
                                                                        return;
                                                                    case 56:
                                                                        verifyPromoCode(oliveRequest);
                                                                        return;
                                                                    case 57:
                                                                        verifyReferalCode(oliveRequest);
                                                                        return;
                                                                    case 58:
                                                                        mandateCreateRequest(oliveRequest);
                                                                        return;
                                                                    case 59:
                                                                        mandateRequest(oliveRequest);
                                                                        return;
                                                                    case 60:
                                                                        break;
                                                                    case 61:
                                                                        getMobileOperators(oliveRequest);
                                                                        return;
                                                                    default:
                                                                        switch (requestType) {
                                                                            case 63:
                                                                                getBillerCategories(oliveRequest);
                                                                                return;
                                                                            case 64:
                                                                                getBillerNames(oliveRequest);
                                                                                return;
                                                                            case 65:
                                                                                getBillerLocations(oliveRequest);
                                                                                return;
                                                                            case 66:
                                                                                getBillerForm(oliveRequest);
                                                                                return;
                                                                            case 67:
                                                                                regBillerEnq(oliveRequest);
                                                                                return;
                                                                            case 68:
                                                                                calculateCharges(oliveRequest);
                                                                                return;
                                                                            case 69:
                                                                                payBBPSBill(oliveRequest);
                                                                                return;
                                                                            case 70:
                                                                                getRecentBBPSHistory(oliveRequest);
                                                                                return;
                                                                            default:
                                                                                switch (requestType) {
                                                                                    case 95:
                                                                                        checkStatus(oliveRequest);
                                                                                        return;
                                                                                    case 96:
                                                                                        raiseComplain(oliveRequest);
                                                                                        return;
                                                                                    case 97:
                                                                                        VerifyMerchant(oliveRequest);
                                                                                        return;
                                                                                    case 98:
                                                                                        verifyLimit(oliveRequest);
                                                                                        return;
                                                                                    default:
                                                                                        return;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
        getRechargeHistory(oliveRequest);
    }

    public void setCustomerVpa(Account account, String str) {
        TransportManager.getInstance(this).setCustomerVpa(activity, n70.f.a().m(C0059ao.a(9421)), account.getAccRefNumber(), account.getIfsc(), account.getVpa(), str);
    }

    public void setListener(OliveUpiEventListener oliveUpiEventListener) {
        this.listener = oliveUpiEventListener;
    }

    public void setToken(String str) {
        TransportManager.getInstance(this).setToken(str);
    }

    public void setuCheck(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).setuCheck(activity, oliveRequest);
    }

    public void signedQR(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).signedQR(activity, oliveRequest);
    }

    public void updateMandate(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).updateMandate(activity, oliveRequest);
    }

    public void updateVPA(OliveRequest oliveRequest) {
        this.deviceDetails = c70.d(activity);
        if (oliveRequest.getRequestData() instanceof SaveAccount) {
            SaveAccount saveAccount = (SaveAccount) oliveRequest.getRequestData();
            if (isValidVpa(saveAccount.getVpa())) {
                Account account = saveAccount.getAccount();
                account.setVpa(saveAccount.getVpa());
                AcctUpdateReq acctUpdateReq = new AcctUpdateReq();
                acctUpdateReq.setDevice(this.deviceDetails);
                acctUpdateReq.setTxnId(c70.j());
                acctUpdateReq.setAccount(account);
                oliveRequest.setRequestData(acctUpdateReq);
                TransportManager.getInstance(this).updateAccounts(activity, oliveRequest);
                return;
            }
            Toast.makeText(activity, C0059ao.a(9422), 0).show();
            return;
        }
        TransportManager.getInstance(this).updateAccounts(activity, oliveRequest);
    }

    public void userDeRegister() {
        TransportManager.getInstance(this).deRegister(activity, n70.f.a().m(C0059ao.a(9423)));
    }

    public void userLogout() {
        TransportManager.getInstance(this).customerSignOff(activity, n70.f.a().m(C0059ao.a(9424)));
    }

    public void userPasscodeChange(OliveRequest oliveRequest) {
        if (oliveRequest.getRequestCount() == 0) {
            ChangeAppPin changeAppPin = (ChangeAppPin) oliveRequest.getRequestData();
            ChangeAppPin changeAppPin2 = new ChangeAppPin();
            changeAppPin2.setOldPin(encPass(changeAppPin.getOldPin()));
            changeAppPin2.setNewPin(encPass(changeAppPin.getNewPin()));
            changeAppPin2.setDeviceDetails(c70.d(activity));
            changeAppPin2.setType(changeAppPin.getType());
            oliveRequest.setRequestData(changeAppPin2);
        }
        TransportManager.getInstance(this).changePassword(activity, oliveRequest);
    }

    public void verifyLimit(OliveRequest oliveRequest) {
        oliveRequest.setRequestData((LimitCheckReq) oliveRequest.getRequestData());
        TransportManager.getInstance(this).verifyLimitChecks(activity, oliveRequest);
    }

    public void verifyPromoCode(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).verifyPromocode(activity, oliveRequest);
    }

    public void verifyQR(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).verifyQR(activity, oliveRequest);
    }

    public void verifyReferalCode(OliveRequest oliveRequest) {
        String a;
        StringBuilder sb = new StringBuilder();
        sb.append(oliveRequest.getRequestData());
        String a2 = C0059ao.a(9425);
        sb.append(a2);
        n70.a aVar = n70.f;
        sb.append(aVar.a().m(C0059ao.a(9426)));
        sb.append(a2);
        sb.append(aVar.a().m(C0059ao.a(9427)));
        sb.append(a2);
        sb.append(aVar.a().m(C0059ao.a(9428)));
        byte[] bytes = sb.toString().getBytes();
        CryptLibOne cryptLibOne = new CryptLibOne();
        try {
            a = CryptLibOne.bytesToHex(cryptLibOne.encrypt(bytes, cryptLibOne.hexStringToByteArray(TransportConstants.regToken)));
        } catch (Exception unused) {
            a = C0059ao.a(9429);
        }
        TransportManager.getInstance(this).verifyReferalCode(activity, a, TransportConstants.regRandom, oliveRequest);
    }

    public void vpaSuggestion(OliveRequest oliveRequest) {
        TransportManager.getInstance(this).vpaSuggestion(activity, oliveRequest);
    }
}
