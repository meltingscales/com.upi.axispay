package com.olive.upi.transport.api;

import com.olive.upi.transport.model.AcRequest;
import com.olive.upi.transport.model.Account;
import com.olive.upi.transport.model.AccountOTPRequest;
import com.olive.upi.transport.model.AcctUpdateReq;
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
import com.olive.upi.transport.model.CustomerVpa;
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
import com.olive.upi.transport.model.Rechargeplan;
import com.olive.upi.transport.model.RecurrenceAuthorization;
import com.olive.upi.transport.model.RecurrenceResVo;
import com.olive.upi.transport.model.RegRequest;
import com.olive.upi.transport.model.RegisterBiller;
import com.olive.upi.transport.model.Registration;
import com.olive.upi.transport.model.ReqComplientVo;
import com.olive.upi.transport.model.ReqMandateTxn;
import com.olive.upi.transport.model.RewardHistoryVO;
import com.olive.upi.transport.model.RewardsVO;
import com.olive.upi.transport.model.SafetynetSignedAttestation;
import com.olive.upi.transport.model.SaveAppPin;
import com.olive.upi.transport.model.SetuResponse;
import com.olive.upi.transport.model.TokenResponse;
import com.olive.upi.transport.model.TranHistory;
import com.olive.upi.transport.model.UpdateMandate;
import com.olive.upi.transport.model.UrlConfig;
import com.olive.upi.transport.model.VerifyMarchantResponse;
import com.olive.upi.transport.model.VerifyVPA;
import com.olive.upi.transport.model.VpaVerify;
import java.util.ArrayList;
import java.util.List;
import myunmn.C0059ao;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface UpiService {
    public static final String API_V1 = null;
    public static final String API_V2 = null;
    public static final int BENE_BLOCK = 0;
    public static final int BILLER_CHARGE_CALCULATE = 0;
    public static final int BILLER_PAY = 0;
    public static final int BILLER_REG_ENQ = 0;
    public static final int COMMON_LIB_PROCESSED = 0;
    public static final int GET_BILLER_CATEGORY = 0;
    public static final int GET_BILLER_FORM = 0;
    public static final int GET_BILLER_LOCATION = 0;
    public static final int GET_BILLER_NAME = 0;
    public static final int INITIATE_ACCOUNT_BALANCE = 0;
    public static final int INITIATE_CHANGE_MPIN = 0;
    public static final int INITIATE_COLLECT_PAY = 0;
    public static final int INITIATE_PAY = 0;
    public static final int INITIATE_RECURRENCE_AUTHORIZATION = 0;
    public static final int INITIATE_UPDATE_MANDATE = 0;
    public static final int LIST_BENE_BLOCK = 0;
    public static final int MANDATE_CREATE_REQUEST = 0;
    public static final int MANDATE_REQUEST = 0;
    public static final int NO_INTERNET = 0;
    public static final int PENDING_REQUEST_MANDATE = 0;
    public static final int RECENT_DTH_RECHARGE = 0;
    public static final int RECENT_MOBILE_RECHARGE = 0;
    public static final int RECHARGE_PLANS = 0;
    public static final int REQUEST_ACCOUNT_BALANCE = 0;
    public static final int REQUEST_ACCOUNT_MOBILE_REG = 0;
    public static final int REQUEST_ACCOUNT_NUMBER = 0;
    public static final int REQUEST_ACCOUNT_OTP = 0;
    public static final int REQUEST_ALL_ACCOUNTS = 0;
    public static final int REQUEST_ALL_VPA_ACCOUNTS = 0;
    public static final int REQUEST_ANALYSE_REWARDS = 0;
    public static final int REQUEST_AUTHENTICATE = 0;
    public static final int REQUEST_BANNER = 0;
    public static final int REQUEST_BBPS_BILL_ENQUIRY = 0;
    public static final int REQUEST_BILL_PAY = 0;
    public static final int REQUEST_BIND_MOBILE = 0;
    public static final int REQUEST_CHANGE_MPIN = 0;
    public static final int REQUEST_CHANGE_PASSWORD = 0;
    public static final int REQUEST_CHECK_SAFETY_NET = 0;
    public static final int REQUEST_CHECK_STATUS = 0;
    public static final int REQUEST_CL_SSO_TOKEN = 0;
    public static final int REQUEST_COLLECT = 0;
    public static final int REQUEST_COLLECT_PAY = 0;
    public static final int REQUEST_CUSTOMER_DEREGISTER = 0;
    public static final int REQUEST_CUSTOMER_REGISTRATION = 0;
    public static final int REQUEST_CUSTOMER_SIGNOFF = 0;
    public static final int REQUEST_CUSTOMER_VPALIST = 0;
    public static final int REQUEST_DECLINE_BLOCK_MANDATE = 0;
    public static final int REQUEST_DELETE_CUSTOMER_VPA = 0;
    public static final int REQUEST_DTH_OPERATORS = 0;
    public static final int REQUEST_FETCH_ACCOUNT = 0;
    public static final int REQUEST_GENERATE_INTENT_SIGN = 0;
    public static final int REQUEST_GENERATE_INTENT_SIGN_DOWNLOAD = 0;
    public static final int REQUEST_GET_REWARDS = 0;
    public static final int REQUEST_GET_TOKEN = 0;
    public static final int REQUEST_GET_WEB_URL = 0;
    public static final int REQUEST_INBOX = 0;
    public static final int REQUEST_INFO = 0;
    public static final int REQUEST_LIMIT_CHECK = 0;
    public static final int REQUEST_LIST_BANKS = 0;
    public static final int REQUEST_LIST_KEYS = 0;
    public static final int REQUEST_LIST_QUERIES = 0;
    public static final int REQUEST_LIST_VPA = 0;
    public static final int REQUEST_LOGIN = 0;
    public static final int REQUEST_MANDATE_EXECUTE = 0;
    public static final int REQUEST_MANDATE_HISTORY = 0;
    public static final int REQUEST_MANDATE_RECURRENCE_AUTHORIZATION = 0;
    public static final int REQUEST_MANDATE_RECURRENCE_AUTHORIZATION_WITHOUT_PIN = 0;
    public static final int REQUEST_MANDATE_RECURRENCE_PENDING = 0;
    public static final int REQUEST_MAX_AMOUNTS = 0;
    public static final int REQUEST_MOBILE_CIRCLES = 0;
    public static final int REQUEST_MOBILE_OPERATORS = 0;
    public static final int REQUEST_OD_ACCOUNT_BLC_ENQ = 0;
    public static final int REQUEST_PAY = 0;
    public static final int REQUEST_PENDING_TRANSACTION = 0;
    public static final int REQUEST_PERSONAL_LOAN = 0;
    public static final int REQUEST_PROMOTIONAL_OFFERS = 0;
    public static final int REQUEST_RAISE_COMPLAIN = 0;
    public static final int REQUEST_RAISE_QUERY = 0;
    public static final int REQUEST_RECHARGE_PREFIX = 0;
    public static final int REQUEST_REGISTER = 0;
    public static final int REQUEST_REJECT_NOTIFICATION = 0;
    public static final int REQUEST_REMOVE_ACCOUNT = 0;
    public static final int REQUEST_REMOVE_VPA = 0;
    public static final int REQUEST_RESEND_OTP = 0;
    public static final int REQUEST_SAVE_ACCOUNT = 0;
    public static final int REQUEST_SAVE_APIN = 0;
    public static final int REQUEST_SAVE_VPA = 0;
    public static final int REQUEST_SERVER_HEALTH_CHECK = 0;
    public static final int REQUEST_SETU = 0;
    public static final int REQUEST_SET_CUSTOMER_VPA = 0;
    public static final int REQUEST_SKIP_BIND_MOBILE = 0;
    public static final int REQUEST_TRANSACTION_ACCOUNT_HISTORY = 0;
    public static final int REQUEST_TRANSACTION_FILTER_HISTORY = 0;
    public static final int REQUEST_TRANSACTION_HISTORY = 0;
    public static final int REQUEST_UPDATE_MANDATE = 0;
    public static final int REQUEST_VALIDATE_APIN = 0;
    public static final int REQUEST_VERIFY_INTENT_SIGN = 0;
    public static final int REQUEST_VERIFY_MERCHANT = 0;
    public static final int REQUEST_VERIFY_REGISTRATION = 0;
    public static final int REQUEST_VERIFY_VPA2 = 0;
    public static final int REQUEST_VPA_AVAILABILITY = 0;
    public static final int UPDATE_INBOX = 0;
    public static final int VERIFY_PROMOCODE = 0;
    public static final int VERIFY_PROMO_CODE = 0;
    public static final int VERIFY_REFERRAL_CODE = 0;

    static {
        C0059ao.a(UpiService.class, 8);
    }

    @POST("/v1/bank/transactions/pay")
    Call<Result<String>> PayReq(@Body PayRequest payRequest);

    @POST("/v1/customer/accounts")
    Call<Result<List<Account>>> accountFetch(@Body AcRequest acRequest);

    @POST("/v1/customer/accounts/mobreg")
    Call<Result<String>> accountMobileReg(@Body RegRequest regRequest);

    @POST("/v1/customer/otp")
    Call<Result<String>> accountOtp(@Body AccountOTPRequest accountOTPRequest);

    @POST("/v1/customer/accounts/remove")
    Call<Result<List<CustomerBankAccounts>>> accountRemove(@Body AcctUpdateReq acctUpdateReq);

    @POST("/v1/customer/accounts/update")
    Call<Result<List<CustomerBankAccounts>>> accountSave(@Body AcctUpdateReq acctUpdateReq);

    @POST("/v1/authenticate")
    Call<Result<TokenResponse>> authenticate(@Header("X-Auth-Username") String str, @Header("X-Auth-Password") String str2, @Header("X-Auth-Device") String str3);

    @POST("/v1/bank/transactions/balanceinquiry/creditline")
    Call<Result<String>> balanceEnqForCreditLine(@Body CreditLineBalReqest creditLineBalReqest);

    @POST("/v1/txn/billpay")
    Call<Result<String>> billPay(@Body BillPay billPay);

    @POST("/v1/billpay/billpayenquiry")
    Call<Result<List<BbpsHistory>>> billpayEnquiry(@Body BillPaymentEnqRequst billPaymentEnqRequst);

    @POST("/v1/txn/listbene/block")
    Call<Result<String>> blockedVpa(@Query("customerid") String str, @Body ArrayList<BeneVpaBlock> arrayList);

    @POST("/v1/billpay/chargecalc")
    Call<Result<BillerChargeRes>> calculateCharge(@Body BillerChargeReq billerChargeReq);

    @POST("/v1/customer/changepassword")
    Call<Result<String>> changePassword(@Body ChangeAppPin changeAppPin);

    @POST("/v1/bank/transactions/collectpay")
    Call<Result<String>> collectNotification(@Body CollectPayRequest collectPayRequest);

    @POST("/v1/bank/transactions/collect")
    Call<Result<String>> collectReq(@Body Collect collect);

    @POST("/v1/bank/transactions/payerinitiatedmandate")
    Call<Result<String>> createMandate(@Query("customerid") String str, @Query("appid") String str2, @Body PayerInitiatedMandate payerInitiatedMandate);

    @POST("/v1/customer/vpa/list")
    Call<Result<List<CustomerVpa>>> customerListVPA(@Query("customerid") String str);

    @FormUrlEncoded
    @POST("/v1/customer/register")
    Call<Result<String>> customerReg(@Field("data") String str, @Field("refid") String str2);

    @POST("/v1/customer/deregister")
    Call<Result<String>> deRegister(@Query("customerid") String str);

    @POST("/v1/bank/transactions/authorizemandate ")
    Call<Result<String>> declineMandate(@Query("customerid") String str, @Query("appid") String str2, @Body AuthorizeMandateRequest authorizeMandateRequest);

    @FormUrlEncoded
    @POST("/v2/deletecustomer/vpa")
    Call<Result<String>> deleteCustomerVpa(@Field("customerid") String str, @Field("accountNumber") String str2, @Field("vpa") String str3, @Field("defaultvpa") String str4, @Field("ifsc") String str5);

    @POST("/v1/bank/transactions/mandateexecute")
    Call<Result<String>> executeMandate(@Query("appid") String str, @Query("customerid") String str2, @Body MandateExecute mandateExecute);

    @POST("/v1/generate/signedqr")
    Call<Result<String>> generateSignedQR(@Body IntentData intentData);

    @POST("/v1/customer/allaccounts")
    Call<Result<List<CustomerBankAccounts>>> getAllAccounts(@Body CustomerAcRequest customerAcRequest);

    @POST("/api/upi/rewards/analyseReward")
    Call<Result<String>> getAnalyseRewards(@Body RewardsVO rewardsVO);

    @POST("/v1/bank/transactions/balanceinquiry")
    Call<Result<String>> getBal(@Body BRequest bRequest);

    @FormUrlEncoded
    @POST("/v1/banner")
    Call<Result<List<Banner>>> getBanner(@Field("deviceos") String str);

    @POST("/v1/getbilpaymaxamounts")
    Call<Result<BillPayDataMaxAmount>> getBillPayMaxAmounts();

    @POST("/v1/billpay/getbillerctgry")
    Call<Result<List<BillerCategory>>> getBillerCategory();

    @FormUrlEncoded
    @POST("/v1/billpay/billerregform")
    Call<Result<List<BillerField>>> getBillerForm(@Field("BILL_CTGRY") String str, @Field("CORP_CODE") String str2, @Field("LVL_CODE_ACTL") String str3, @Field("MASTR_TYPE") String str4, @Field("CIF_ID") String str5);

    @FormUrlEncoded
    @POST("/v1/billpay/getbillerloc")
    Call<Result<List<BillerCircle>>> getBillerLocation(@Field("BILL_CTGRY") String str, @Field("CORP_CODE") String str2, @Field("MASTR_TYPE") String str3, @Field("CIF_ID") String str4);

    @FormUrlEncoded
    @POST("/v1/billpay/getbillername")
    Call<Result<List<Billers>>> getBillerName(@Field("BILL_CTGRY") String str);

    @POST("/v1/txn/listbeneblock")
    Call<Result<List<Collectbeneblock>>> getBlockedBeneVpa();

    @POST("/v1/customer/accounts/cred")
    Call<Result<Void>> getChangeMpin(@Body ChangeCredReq changeCredReq);

    @POST("/v1/cl/token")
    Call<Result<String>> getClToken(@Body ClTokenReq clTokenReq);

    @POST("/v1/getDTH")
    Call<Result<List<DTHOperator>>> getDTH();

    @POST("/v1/getinbox")
    Call<Result<List<Inbox>>> getInbox();

    @GET("/v1/info")
    Call<Result<String>> getInfo();

    @POST("/v1/bind")
    Call<Result<Registration>> getMobile(@Query("data") String str);

    @FormUrlEncoded
    @POST("/v1/getcircle")
    Call<Result<List<String>>> getMobileCircle(@Field("operator") String str);

    @FormUrlEncoded
    @POST("/v1/rechargeprefix")
    Call<Result<PrefixMobile>> getMobileOperator(@Field("mobilenumber") String str);

    @POST("/v1/customer/vpalistaccounts")
    Call<Result<List<CustomerVpaAccounts>>> getMyVpaAccounts();

    @POST("/v1/txn/pending")
    Call<Result<List<PendingReqVo>>> getPendingTransactions();

    @FormUrlEncoded
    @POST("/v1/customer/persionalloan")
    Call<Result<InstacardView>> getPersonalLoan(@Field("accountno") String str);

    @FormUrlEncoded
    @POST("/v1/customer/plainaccount2")
    Call<Result<InstacardView>> getPlainAccount(@Field("accountno") String str);

    @POST("/v1/udir/raisecomplaint")
    Call<Result<ComplaintResponse>> getRaiseComplain(@Query("appid") String str, @Body ReqComplientVo reqComplientVo);

    @FormUrlEncoded
    @POST("/v1/customer/recharge/recent")
    Call<Result<List<RecentBPTHistory>>> getRechargeHistory(@Field("type") String str);

    @FormUrlEncoded
    @POST("/v1/rechargeplans")
    Call<Result<Rechargeplan>> getRechargePlans(@Field("servicecode") String str, @Field("consumerno") String str2, @Field("operator") String str3, @Field("circle") String str4);

    @GET("/api/upi/rewards/getRewardsHistory")
    Call<Result<List<RewardHistoryVO>>> getRewardHistory(@Query("mobilenumber") String str);

    @POST("/v1/txn/list")
    Call<Result<List<TranHistory>>> getTransactionHistory(@Query("fromDate") String str, @Query("toDate") String str2, @Query("accountno") String str3);

    @POST("/v1/vpa/verifyMerchant")
    Call<Result<VerifyMarchantResponse>> getVerifiedMerchant(@Body VerifyVPA verifyVPA);

    @POST("/v1/geturlconfig")
    Call<Result<List<UrlConfig>>> getWebUrls();

    @POST("/v1/txn/chkstatus")
    Call<Result<TranHistory>> getcheckStatus(@Query("appid") String str, @Query("txnid") String str2, @Body CheckStatus checkStatus);

    @POST("/v1/getoperatorlogo")
    Call<Result<List<OperatorsLogos>>> getoperator();

    @GET("/v1/listbanks")
    Call<Result<List<Bank>>> listBanks();

    @GET("/v1/listkeys")
    Call<Result<String>> listKeys();

    @POST("/v1/txn/query/list")
    Call<Result<List<TranHistory>>> listQueries(@Query("customerid") String str);

    @POST("/v1/vpa/list")
    Call<Result<List<BeneVpa>>> listVPA(@Query("customerid") String str);

    @POST("/user/regtoken")
    Call<Result<Void>> login(@Query("IMEI") String str, @Query("GCMREGID") String str2);

    @POST("/v1/bank/transactions/getmandatetxn")
    Call<Result<List<MandatesVo>>> mandateHistory(@Query("customerid") String str, @Query("appid") String str2, @Body ReqMandateTxn reqMandateTxn);

    @POST("/v1/bank/transactions/payeeinitiatedmandate")
    Call<Result<String>> mandateRequest(@Query("customerid") String str, @Query("appid") String str2, @Body PayeeInitiatedMandate payeeInitiatedMandate);

    @POST("/v1/billpay/billerpayment")
    Call<Result<String>> payBBPSBill(@Body BbpsPay bbpsPay);

    @POST("/v1/bank/transactions/getmandate")
    Call<Result<List<PendingMandateReqVo>>> pendingSI(@Query("customerid") String str, @Query("appid") String str2, @Body GetMandate getMandate);

    @POST("/v1/offerstext")
    Call<Result<List<BannerOffersVo>>> promotionalOffers(@Query("customerid") String str);

    @POST("/v1/txn/query")
    Call<Result<String>> raiseQuery(@Body TranHistory tranHistory);

    @POST("/v1//mandate/recurrence/authorization")
    Call<Result<String>> recurrenceAuthorization(@Query("customerid") String str, @Query("appid") String str2, @Body RecurrenceAuthorization recurrenceAuthorization);

    @POST("/v1/mandate/recurrence/pending")
    Call<Result<List<RecurrenceResVo>>> recurrencePending(@Query("customerid") String str, @Query("appid") String str2);

    @POST("/v1/register")
    Call<Result<Registration>> register(@Body Registration registration);

    @POST("/v1/billpay/billerregenq")
    Call<Result<List<BillerRegEnqResponse>>> registerEnqBiller(@Body RegisterBiller registerBiller);

    @POST("/v1/txn/notification/reject")
    Call<Result<List<PendingReqVo>>> rejectPending(@Body PendingReqVo pendingReqVo);

    @POST("/v1/reotp/resend")
    Call<Result<Void>> resendOTP(@Query("customerid") String str);

    @POST("v1/attestations/verify")
    Call<String> safetynetCheck(@Query("key") String str, @Body SafetynetSignedAttestation safetynetSignedAttestation);

    @POST("/v1/aPIN/save")
    Call<Result<String>> saveApin(@Body SaveAppPin saveAppPin);

    @POST("/v1/vpa/update")
    Call<Result<String>> saveVPA(@Query("customerid") String str, @Query("vpa") String str2, @Query("name") String str3, @Query("nickname") String str4, @Query("favorite") String str5);

    @POST("/v1/healthcheck")
    Call<Result<HealthCheck>> serverCheck(@Query("version") String str);

    @POST("/v2/customer/setvpa")
    Call<Result<String>> setCustomerVpa(@Query("customerId") String str, @Query("account") String str2, @Query("ifsc") String str3, @Query("vpa") String str4, @Query("defaultvpa") String str5);

    @GET("cou/get-home-link")
    Call<SetuResponse> setuCheck(@Query("user_id") String str, @Query("api_key") String str2, @Query("mobile_number") String str3, @Query("os") String str4);

    @POST("/v1/customer/signoff")
    Call<Result<String>> signOff(@Query("customerid") String str);

    @POST("/v1/bind2")
    Call<Result<Registration>> skipBindCall(@Query("data") String str);

    @GET("/json")
    Call<Result<Void>> test();

    @FormUrlEncoded
    @POST("/v1/token")
    Call<Result<String>> token(@Field("type") String str, @Field("challenge") String str2);

    @POST("/v1/updateinbox")
    Call<Result<Inbox>> updateInbox(@Body Inbox inbox);

    @POST("/v1/bank/transactions/updatemandate")
    Call<Result<String>> updateMandate(@Query("customerid") String str, @Query("appid") String str2, @Body UpdateMandate updateMandate);

    @POST("/v1/bank/txn/limitcheck")
    Call<Result<String>> verifyLimits(@Body LimitCheckReq limitCheckReq);

    @POST("/v1/aPIN/verify")
    Call<Result<String>> verifyPin(@Body SaveAppPin saveAppPin);

    @FormUrlEncoded
    @POST("/v1/verifyPromo")
    Call<Result<String>> verifyPromoCode(@Field("promocode") String str);

    @FormUrlEncoded
    @POST("/v1/promocode/verify")
    Call<Result<Rechargeplan>> verifyPromocode(@Field("servicecode") String str, @Field("consumerno") String str2, @Field("spcode") String str3, @Field("sspcode") String str4, @Field("promocode") String str5);

    @POST("/v1/otp/verify")
    Call<Result<Void>> verifyReg(@Query("customerid") String str, @Query("otp") String str2);

    @FormUrlEncoded
    @POST("/v1/referral/vpa")
    Call<Result<String>> verifyRereralCode(@Field("referralcred") String str, @Field("refid") String str2);

    @POST("/v1/verifyIntentData")
    Call<Result<String>> verifySignedQR(@Body IntentData intentData, @Query("appId") String str);

    @POST("/v1/vpa/verify2")
    Call<Result<String>> verifyVpa2(@Body VpaVerify vpaVerify);

    @POST("/v1/vpa/remove")
    Call<Result<List<BeneVpa>>> vpaRemove(@Query("vpa") String str);

    @POST("/v1/customer/vpa/check/suggestion")
    Call<Result<List<String>>> vpaSuggestion(@Query("vpa") String str, @Query("accountno") String str2);
}
