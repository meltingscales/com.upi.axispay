package com.olive.upi.transport.service;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.Gson;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.OliveUpiException;
import com.olive.upi.transport.OliveUpiManager;
import com.olive.upi.transport.TransportConstants;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.AccountTransportData;
import com.olive.upi.transport.model.CredAllowed;
import com.olive.upi.transport.model.CredAllowedWrapper;
import com.olive.upi.transport.model.DeviceDetails;
import com.olive.upi.transport.model.MandateUpdateData;
import com.olive.upi.transport.model.PayRequest;
import com.olive.upi.transport.model.PayTransportData;
import com.olive.upi.transport.model.Payee;
import com.olive.upi.transport.model.UpdateMandate;
import com.olive.upi.transport.model.lib.Configuration;
import com.olive.upi.transport.model.lib.NameValuePair;
import com.olive.upi.transport.model.lib.PaymentSalt;
import com.olive.upi.transport.model.lib.Salt;
import java.util.ArrayList;
import myunmn.C0059ao;
import org.json.JSONException;
import org.json.JSONObject;
import org.npci.upi.security.services.CLRemoteResultReceiver;
import org.npci.upi.security.services.CLServices;
import org.npci.upi.security.services.ServiceConnectionStatusNotifier;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CommonLibService {
    public static final int MODE_BAL_ENQ = 0;
    public static final int MODE_BBPS_TXN = 0;
    public static final int MODE_BILL_PAY_TXN = 0;
    public static final int MODE_CHANGE_MPIN = 0;
    public static final int MODE_COLLECT_PAY_TXN = 0;
    public static final int MODE_CREATE_CHALLENGE = 0;
    public static final int MODE_INITIALIZE_LIB = 0;
    public static final int MODE_INITIATE_TXN = 0;
    public static final int MODE_MANDATE_APPROVE = 0;
    public static final int MODE_MANDATE_PAY = 0;
    public static final int MODE_MANDATE_UPDATE = 0;
    public static final int MODE_MANDATE_UPDATE_REVOKE_SUSPEND_PAUSE = 0;
    public static final int MODE_PAYER_EXECUTE = 0;
    public static final int MODE_SET_MPIN = 0;
    private static final String TAG = null;
    private OliveCommonLibListener commonLibListener;
    private Context context;
    public OliveRequest oliveRequest;
    private int mode = 4;
    private CLRemoteResultReceiver remoteResultReceiver = new CLRemoteResultReceiver(new ResultReceiver(new Handler()) { // from class: com.olive.upi.transport.service.CommonLibService.1
        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            super.onReceiveResult(i, bundle);
            try {
                CommonLibService commonLibService = CommonLibService.this;
                commonLibService.parseResult(i, bundle, commonLibService.oliveRequest);
            } catch (OliveUpiException e) {
                e.printStackTrace();
                CommonLibService.this.commonLibListener.onServiceError(CommonLibService.this.mode, e, CommonLibService.this.oliveRequest);
            }
        }
    });

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface OliveCommonLibListener {
        void onReceiveResult(int i, int i2, Object obj, OliveRequest oliveRequest) throws OliveUpiException;

        void onServiceConnected(int i, OliveRequest oliveRequest) throws OliveUpiException;

        void onServiceError(int i, OliveUpiException oliveUpiException, OliveRequest oliveRequest);
    }

    static {
        C0059ao.a(CommonLibService.class, 29);
    }

    public CommonLibService(Context context, OliveCommonLibListener oliveCommonLibListener) {
        this.context = context;
        this.commonLibListener = oliveCommonLibListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseResult(int i, Bundle bundle, OliveRequest oliveRequest) throws OliveUpiException {
        String str = C0059ao.a(3943) + bundle;
        String string = bundle == null ? null : bundle.getString(C0059ao.a(3944));
        if (string != null && !string.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                jSONObject.getString(C0059ao.a(3945));
                jSONObject.getString(C0059ao.a(3946));
            } catch (JSONException unused) {
            }
            this.oliveRequest.setClTransportData(null);
            this.oliveRequest.setClInitData(null);
            this.commonLibListener.onReceiveResult(i, this.mode, null, this.oliveRequest);
            return;
        }
        this.commonLibListener.onReceiveResult(i, this.mode, bundle, this.oliveRequest);
    }

    public static String populateHMAC(String str, String str2, String str3, String str4) {
        String a = C0059ao.a(3947);
        try {
            CryptLibOne cryptLibOne = new CryptLibOne();
            return Base64.encodeToString(cryptLibOne.encrypt(cryptLibOne.SHA256(str + a + str2 + a + str4), Base64.decode(str3, 2)), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String trustCred(String str, String str2) {
        try {
            CryptLibOne cryptLibOne = new CryptLibOne();
            return Base64.encodeToString(cryptLibOne.encrypt(cryptLibOne.SHA256(str), Base64.decode(str2, 2)), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public void getCredentials(OliveRequest oliveRequest) throws OliveUpiException {
        Gson gson = new Gson();
        int i = this.mode;
        String a = C0059ao.a(3948);
        String a2 = C0059ao.a(3949);
        String a3 = C0059ao.a(3950);
        String a4 = C0059ao.a(3951);
        String a5 = C0059ao.a(3952);
        switch (i) {
            case 1:
            case 2:
            case 3:
                AccountTransportData accountTransportData = (AccountTransportData) oliveRequest.getClTransportData();
                String json = gson.toJson(accountTransportData.getCredAllowedWrapper());
                String json2 = gson.toJson(accountTransportData.getConfiguration());
                String json3 = gson.toJson(accountTransportData.getSalt());
                String json4 = gson.toJson(accountTransportData.getPayInfo());
                String str = a5 + json;
                String str2 = a4 + json2;
                String str3 = a3 + json3;
                String str4 = a2 + json4;
                String str5 = a + accountTransportData.getTrustStr() + C0059ao.a(3956) + accountTransportData.getTrustStr().length();
                String str6 = C0059ao.a(3957) + accountTransportData.getXmlPayLoadString();
                TransportConstants.mClservices.e(TransportConstants.KEY_CODE, accountTransportData.getXmlPayLoadString(), json, json2, json3, json4, accountTransportData.getTrustStr(), accountTransportData.getLanguage(), this.remoteResultReceiver);
                return;
            case 4:
                OliveUpiManager.InitLib initLib = (OliveUpiManager.InitLib) oliveRequest.getClInitData();
                String str7 = C0059ao.a(3953) + initLib.getDeviceId();
                String d = TransportConstants.mClservices.d(C0059ao.a(3954), initLib.getDeviceId());
                initLib.setChallenge(d);
                String str8 = C0059ao.a(3955) + d;
                oliveRequest.setClInitData(initLib);
                this.commonLibListener.onReceiveResult(0, this.mode, new Bundle(), oliveRequest);
                return;
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
                PayTransportData payTransportData = (PayTransportData) oliveRequest.getClTransportData();
                String json5 = gson.toJson(payTransportData.getCredAllowedWrapper());
                String json6 = gson.toJson(payTransportData.getConfiguration());
                String json7 = gson.toJson(payTransportData.getSalt());
                String json8 = gson.toJson(payTransportData.getPayInfo());
                String str9 = a5 + json5;
                String str10 = a4 + json6;
                String str11 = a3 + json7;
                String str12 = a2 + json8;
                String str13 = a + payTransportData.getTrustStr();
                TransportConstants.mClservices.e(TransportConstants.KEY_CODE, payTransportData.getXmlPayLoadString().trim(), json5.trim(), json6.trim(), json7.trim(), json8.trim(), payTransportData.getTrustStr().toString().trim(), payTransportData.getLanguage(), this.remoteResultReceiver);
                return;
            case 8:
            default:
                return;
            case 13:
                MandateUpdateData mandateUpdateData = (MandateUpdateData) oliveRequest.getClTransportData();
                TransportConstants.mClservices.e(TransportConstants.KEY_CODE, mandateUpdateData.getXmlPayLoadString().trim(), gson.toJson(mandateUpdateData.getCredAllowedWrapper()).trim(), gson.toJson(mandateUpdateData.getConfiguration()).trim(), gson.toJson(mandateUpdateData.getSalt()).trim(), gson.toJson(mandateUpdateData.getPayInfo()).trim(), mandateUpdateData.getTrustStr().toString().trim(), mandateUpdateData.getLanguage(), this.remoteResultReceiver);
                return;
        }
    }

    public void initService(int i, OliveRequest oliveRequest) throws OliveUpiException {
        this.mode = i;
        this.oliveRequest = oliveRequest;
        if (TransportConstants.mClservices == null) {
            CLServices.f(this.context, new OliveCommonLibNotifier(i, oliveRequest));
        } else {
            getCredentials(oliveRequest);
        }
    }

    public void initiatePay(OliveRequest oliveRequest) throws OliveUpiException {
        String vpa;
        PayTransportData payTransportData = (PayTransportData) oliveRequest.getClTransportData();
        if (payTransportData.getCommonLibToken() != null) {
            if (payTransportData.getXmlPayLoadString() != null) {
                this.mode = payTransportData.getMode();
                PayRequest payrequest = payTransportData.getPayrequest();
                DeviceDetails deviceDetails = payTransportData.getDeviceDetails();
                Account ac = payrequest.getAc();
                CredAllowed credAllowed = new CredAllowed();
                credAllowed.setdLength(ac.getdLength());
                credAllowed.setType(C0059ao.a(3958));
                credAllowed.setSubtype(C0059ao.a(3959));
                credAllowed.setdType(C0059ao.a(3960));
                ArrayList arrayList = new ArrayList();
                arrayList.add(credAllowed);
                CredAllowedWrapper credAllowedWrapper = new CredAllowedWrapper();
                credAllowedWrapper.setCredAllowed(arrayList);
                payTransportData.setCredAllowed(credAllowedWrapper);
                Configuration configuration = new Configuration();
                configuration.setPayerBankName(ac.getBankName());
                configuration.setBackgroundColor(C0059ao.a(3961));
                payTransportData.setConfiguration(configuration);
                if (this.mode == 14) {
                    String str = C0059ao.a(3962) + payTransportData.getUmnId();
                    vpa = payTransportData.getUmnId();
                } else {
                    vpa = payrequest.getAc().getVpa();
                }
                Payee payee = payrequest.getPayees().get(0);
                PaymentSalt paymentSalt = new PaymentSalt();
                paymentSalt.setTxnId(payrequest.getTxnId());
                paymentSalt.setTxnAmount(payee.getBamount());
                paymentSalt.setDeviceId(deviceDetails.getId());
                paymentSalt.setAppId(deviceDetails.getApp());
                paymentSalt.setMobileNumber(deviceDetails.getMobile());
                paymentSalt.setPayerAddr(vpa);
                paymentSalt.setPayeeAddr(payee.beneVpa);
                payTransportData.setSalt(paymentSalt);
                try {
                    StringBuilder sb = new StringBuilder(100);
                    sb.append(payee.getBamount());
                    sb.append(TransportConstants.SALT_DELIMETER);
                    sb.append(payrequest.getTxnId());
                    sb.append(TransportConstants.SALT_DELIMETER);
                    sb.append(vpa);
                    sb.append(TransportConstants.SALT_DELIMETER);
                    sb.append(payee.getBeneVpa());
                    sb.append(TransportConstants.SALT_DELIMETER);
                    sb.append(deviceDetails.getApp());
                    sb.append(TransportConstants.SALT_DELIMETER);
                    sb.append(deviceDetails.getMobile());
                    sb.append(TransportConstants.SALT_DELIMETER);
                    sb.append(deviceDetails.getId());
                    payTransportData.setTrustStr(trustCred(sb.toString(), payTransportData.getCommonLibToken()));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new NameValuePair(C0059ao.a(3963), payTransportData.getPayeeName()));
                    arrayList2.add(new NameValuePair(C0059ao.a(3964), payrequest.getAmount()));
                    arrayList2.add(new NameValuePair(C0059ao.a(3965), payrequest.getRemarks()));
                    arrayList2.add(new NameValuePair(C0059ao.a(3966), payrequest.getTxnId()));
                    arrayList2.add(new NameValuePair(C0059ao.a(3967), payrequest.getAc().getMaskedAccnumber()));
                    if (!TextUtils.isEmpty(payTransportData.getRefUrl())) {
                        arrayList2.add(new NameValuePair(C0059ao.a(3968), payTransportData.getRefUrl()));
                    }
                    payTransportData.setPayInfo(arrayList2);
                    oliveRequest.setClTransportData(payTransportData);
                    initService(this.mode, oliveRequest);
                    return;
                } catch (Exception unused) {
                    throw new OliveUpiException(C0059ao.a(3969));
                }
            }
            throw new OliveUpiException(C0059ao.a(3970));
        }
        throw new OliveUpiException(C0059ao.a(3971));
    }

    public void manageAccount(int i, OliveRequest oliveRequest) throws OliveUpiException {
        AccountTransportData accountTransportData = (AccountTransportData) oliveRequest.getClTransportData();
        this.mode = i;
        if (!TextUtils.isEmpty(accountTransportData.getXmlPayLoadString())) {
            Configuration configuration = new Configuration();
            ArrayList arrayList = new ArrayList();
            Account account = accountTransportData.getAccount();
            boolean isEmpty = TextUtils.isEmpty(account.getOtpFormat());
            String a = C0059ao.a(3972);
            if (isEmpty) {
                account.setOtpFormat(a);
            }
            if (account.getOtpLength() == 0) {
                account.setOtpLength(6);
            }
            String str = account.getdType() != null ? account.getdType() : a;
            String a2 = C0059ao.a(3973);
            String a3 = C0059ao.a(3974);
            if (i == 1) {
                CredAllowed credAllowed = new CredAllowed();
                credAllowed.setdLength(accountTransportData.getAccount().getdLength());
                credAllowed.setType(a3);
                credAllowed.setSubtype(a2);
                credAllowed.setdType(a);
                arrayList.add(credAllowed);
                CredAllowedWrapper credAllowedWrapper = new CredAllowedWrapper();
                credAllowedWrapper.setCredAllowed(arrayList);
                accountTransportData.setCredAllowed(credAllowedWrapper);
            } else if (i == 2) {
                CredAllowed credAllowed2 = new CredAllowed();
                credAllowed2.setdLength(account.getOtpLength());
                String a4 = C0059ao.a(3975);
                credAllowed2.setType(a4);
                credAllowed2.setSubtype(a4);
                credAllowed2.setdType(account.getOtpFormat());
                CredAllowed credAllowed3 = new CredAllowed();
                credAllowed3.setdLength(account.getdLength());
                credAllowed3.setType(a3);
                credAllowed3.setSubtype(a2);
                credAllowed3.setdType(a);
                arrayList.add(credAllowed2);
                arrayList.add(credAllowed3);
                String atmpinFormat = account.getAtmpinFormat();
                if (atmpinFormat != null && (atmpinFormat.equals(C0059ao.a(3976)) || atmpinFormat.equals(C0059ao.a(3977)))) {
                    int atmpinlength = account.getAtmpinlength();
                    CredAllowed credAllowed4 = new CredAllowed();
                    credAllowed4.setdLength(atmpinlength);
                    credAllowed4.setType(a3);
                    credAllowed4.setSubtype(C0059ao.a(3978));
                    credAllowed4.setdType(str);
                    arrayList.add(credAllowed4);
                }
                CredAllowedWrapper credAllowedWrapper2 = new CredAllowedWrapper();
                credAllowedWrapper2.setCredAllowed(arrayList);
                accountTransportData.setCredAllowed(credAllowedWrapper2);
                configuration.setResendOTPFeature(C0059ao.a(3979));
            } else {
                CredAllowed credAllowed5 = new CredAllowed();
                credAllowed5.setdLength(accountTransportData.getAccount().getdLength());
                credAllowed5.setType(a3);
                credAllowed5.setSubtype(a2);
                credAllowed5.setdType(a);
                CredAllowed credAllowed6 = new CredAllowed();
                credAllowed6.setdLength(accountTransportData.getAccount().getdLength());
                credAllowed6.setType(a3);
                credAllowed6.setSubtype(C0059ao.a(3980));
                credAllowed6.setdType(a);
                arrayList.add(credAllowed5);
                arrayList.add(credAllowed6);
                CredAllowedWrapper credAllowedWrapper3 = new CredAllowedWrapper();
                credAllowedWrapper3.setCredAllowed(arrayList);
                accountTransportData.setCredAllowed(credAllowedWrapper3);
            }
            if (accountTransportData.getCredAllowedWrapper() != null) {
                configuration.setPayerBankName(accountTransportData.getAccount().getBankName());
                configuration.setBackgroundColor(C0059ao.a(3981));
                accountTransportData.setConfiguration(configuration);
                String valueOf = String.valueOf(accountTransportData.getTxnId());
                DeviceDetails deviceDetails = accountTransportData.getDeviceDetails();
                if (deviceDetails != null) {
                    Salt salt = new Salt();
                    salt.setAppId(deviceDetails.getApp());
                    salt.setDeviceId(deviceDetails.getId());
                    salt.setMobileNumber(deviceDetails.getMobile());
                    salt.setTxnId(valueOf);
                    accountTransportData.setSalt(salt);
                    try {
                        StringBuilder sb = new StringBuilder(100);
                        sb.append(valueOf);
                        sb.append(TransportConstants.SALT_DELIMETER);
                        sb.append(deviceDetails.getApp());
                        sb.append(TransportConstants.SALT_DELIMETER);
                        sb.append(deviceDetails.getMobile());
                        sb.append(TransportConstants.SALT_DELIMETER);
                        sb.append(deviceDetails.getId());
                        if (!TextUtils.isEmpty(accountTransportData.getCommonLibToken())) {
                            accountTransportData.setTrustStr(trustCred(sb.toString(), accountTransportData.getCommonLibToken()));
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new NameValuePair(C0059ao.a(3982), deviceDetails.getMobile()));
                            arrayList2.add(new NameValuePair(C0059ao.a(3983), accountTransportData.getAccount().getName()));
                            arrayList2.add(new NameValuePair(C0059ao.a(3984), accountTransportData.getAccount().getMaskedAccnumber()));
                            accountTransportData.setPayInfo(arrayList2);
                            initService(i, oliveRequest);
                            return;
                        }
                        throw new OliveUpiException(C0059ao.a(3985));
                    } catch (Exception unused) {
                        throw new OliveUpiException(C0059ao.a(3986));
                    }
                }
                throw new OliveUpiException(C0059ao.a(3987));
            }
            throw new OliveUpiException(C0059ao.a(3988));
        }
        throw new OliveUpiException(C0059ao.a(3989));
    }

    public void mandateUpdate(OliveRequest oliveRequest) throws OliveUpiException {
        MandateUpdateData mandateUpdateData = (MandateUpdateData) oliveRequest.getClTransportData();
        if (mandateUpdateData.getCommonLibToken() != null) {
            if (mandateUpdateData.getXmlPayLoadString() != null) {
                this.mode = mandateUpdateData.getMode();
                UpdateMandate updateMandate = mandateUpdateData.getUpdateMandate();
                DeviceDetails deviceDetails = mandateUpdateData.getDeviceDetails();
                Account sourceAccount = mandateUpdateData.getSourceAccount();
                CredAllowed credAllowed = new CredAllowed();
                credAllowed.setdLength(sourceAccount.getdLength());
                credAllowed.setType(C0059ao.a(3990));
                credAllowed.setSubtype(C0059ao.a(3991));
                credAllowed.setdType(C0059ao.a(3992));
                ArrayList arrayList = new ArrayList();
                arrayList.add(credAllowed);
                CredAllowedWrapper credAllowedWrapper = new CredAllowedWrapper();
                credAllowedWrapper.setCredAllowed(arrayList);
                mandateUpdateData.setCredAllowed(credAllowedWrapper);
                Configuration configuration = new Configuration();
                configuration.setPayerBankName(sourceAccount.getBankName());
                configuration.setBackgroundColor(C0059ao.a(3993));
                mandateUpdateData.setConfiguration(configuration);
                PaymentSalt paymentSalt = new PaymentSalt();
                paymentSalt.setTxnId(updateMandate.getTxnid());
                paymentSalt.setTxnAmount(mandateUpdateData.getAmount());
                paymentSalt.setDeviceId(deviceDetails.getId());
                paymentSalt.setAppId(deviceDetails.getApp());
                paymentSalt.setMobileNumber(deviceDetails.getMobile());
                paymentSalt.setPayerAddr(mandateUpdateData.getPayerVpa());
                paymentSalt.setPayeeAddr(mandateUpdateData.getPayeeVpa());
                mandateUpdateData.setSalt(paymentSalt);
                try {
                    StringBuilder sb = new StringBuilder(100);
                    sb.append(mandateUpdateData.getAmount());
                    sb.append(TransportConstants.SALT_DELIMETER);
                    sb.append(updateMandate.getTxnid());
                    sb.append(TransportConstants.SALT_DELIMETER);
                    sb.append(mandateUpdateData.getPayerVpa());
                    sb.append(TransportConstants.SALT_DELIMETER);
                    sb.append(mandateUpdateData.getPayeeVpa());
                    sb.append(TransportConstants.SALT_DELIMETER);
                    sb.append(deviceDetails.getApp());
                    sb.append(TransportConstants.SALT_DELIMETER);
                    sb.append(deviceDetails.getMobile());
                    sb.append(TransportConstants.SALT_DELIMETER);
                    sb.append(deviceDetails.getId());
                    mandateUpdateData.setTrustStr(trustCred(sb.toString(), mandateUpdateData.getCommonLibToken()));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new NameValuePair(C0059ao.a(3994), mandateUpdateData.getPayeeName()));
                    arrayList2.add(new NameValuePair(C0059ao.a(3995), mandateUpdateData.getAmount()));
                    arrayList2.add(new NameValuePair(C0059ao.a(3996), mandateUpdateData.getRemark()));
                    arrayList2.add(new NameValuePair(C0059ao.a(3997), mandateUpdateData.getTxnId()));
                    arrayList2.add(new NameValuePair(C0059ao.a(3998), sourceAccount.getMaskedAccnumber()));
                    if (!TextUtils.isEmpty(mandateUpdateData.getRefUrl())) {
                        arrayList2.add(new NameValuePair(C0059ao.a(3999), mandateUpdateData.getRefUrl()));
                    }
                    mandateUpdateData.setPayInfo(arrayList2);
                    initService(this.mode, oliveRequest);
                    return;
                } catch (Exception unused) {
                    throw new OliveUpiException(C0059ao.a(4000));
                }
            }
            throw new OliveUpiException(C0059ao.a(4001));
        }
        throw new OliveUpiException(C0059ao.a(4002));
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class OliveCommonLibNotifier implements ServiceConnectionStatusNotifier {
        public int mode;
        public OliveRequest oliveRequest;

        public OliveCommonLibNotifier(int i) {
            this.mode = i;
        }

        @Override // org.npci.upi.security.services.ServiceConnectionStatusNotifier
        public void serviceConnected(CLServices cLServices) {
            TransportConstants.mClservices = cLServices;
            try {
                int i = this.mode;
                if (i == 8) {
                    CommonLibService.this.commonLibListener.onServiceConnected(this.mode, this.oliveRequest);
                } else if (i == 4) {
                    OliveUpiManager.InitLib initLib = (OliveUpiManager.InitLib) this.oliveRequest.getClInitData();
                    String str = C0059ao.a(2451) + initLib.getDeviceId() + C0059ao.a(2452) + initLib.getChallenge();
                    String d = cLServices.d(C0059ao.a(2453), initLib.getDeviceId());
                    initLib.setChallenge(d);
                    String str2 = C0059ao.a(2454) + d;
                    this.oliveRequest.setClInitData(initLib);
                    CommonLibService.this.commonLibListener.onServiceConnected(this.mode, this.oliveRequest);
                } else {
                    CommonLibService.this.getCredentials(this.oliveRequest);
                }
            } catch (OliveUpiException e) {
                CommonLibService.this.commonLibListener.onServiceError(this.mode, e, this.oliveRequest);
            }
        }

        @Override // org.npci.upi.security.services.ServiceConnectionStatusNotifier
        public void serviceDisconnected() {
            CommonLibService.this.commonLibListener.onServiceError(this.mode, null, this.oliveRequest);
        }

        public OliveCommonLibNotifier(int i, OliveRequest oliveRequest) {
            this.mode = i;
            this.oliveRequest = oliveRequest;
        }
    }
}
