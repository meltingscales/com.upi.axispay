.class public interface abstract Lcom/olive/upi/transport/api/UpiService;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final API_V1:Ljava/lang/String;

.field public static final API_V2:Ljava/lang/String;

.field public static final BENE_BLOCK:I

.field public static final BILLER_CHARGE_CALCULATE:I

.field public static final BILLER_PAY:I

.field public static final BILLER_REG_ENQ:I

.field public static final COMMON_LIB_PROCESSED:I

.field public static final GET_BILLER_CATEGORY:I

.field public static final GET_BILLER_FORM:I

.field public static final GET_BILLER_LOCATION:I

.field public static final GET_BILLER_NAME:I

.field public static final INITIATE_ACCOUNT_BALANCE:I

.field public static final INITIATE_CHANGE_MPIN:I

.field public static final INITIATE_COLLECT_PAY:I

.field public static final INITIATE_PAY:I

.field public static final INITIATE_RECURRENCE_AUTHORIZATION:I

.field public static final INITIATE_UPDATE_MANDATE:I

.field public static final LIST_BENE_BLOCK:I

.field public static final MANDATE_CREATE_REQUEST:I

.field public static final MANDATE_REQUEST:I

.field public static final NO_INTERNET:I

.field public static final PENDING_REQUEST_MANDATE:I

.field public static final RECENT_DTH_RECHARGE:I

.field public static final RECENT_MOBILE_RECHARGE:I

.field public static final RECHARGE_PLANS:I

.field public static final REQUEST_ACCOUNT_BALANCE:I

.field public static final REQUEST_ACCOUNT_MOBILE_REG:I

.field public static final REQUEST_ACCOUNT_NUMBER:I

.field public static final REQUEST_ACCOUNT_OTP:I

.field public static final REQUEST_ALL_ACCOUNTS:I

.field public static final REQUEST_ALL_VPA_ACCOUNTS:I

.field public static final REQUEST_ANALYSE_REWARDS:I

.field public static final REQUEST_AUTHENTICATE:I

.field public static final REQUEST_BANNER:I

.field public static final REQUEST_BBPS_BILL_ENQUIRY:I

.field public static final REQUEST_BILL_PAY:I

.field public static final REQUEST_BIND_MOBILE:I

.field public static final REQUEST_CHANGE_MPIN:I

.field public static final REQUEST_CHANGE_PASSWORD:I

.field public static final REQUEST_CHECK_SAFETY_NET:I

.field public static final REQUEST_CHECK_STATUS:I

.field public static final REQUEST_CL_SSO_TOKEN:I

.field public static final REQUEST_COLLECT:I

.field public static final REQUEST_COLLECT_PAY:I

.field public static final REQUEST_CUSTOMER_DEREGISTER:I

.field public static final REQUEST_CUSTOMER_REGISTRATION:I

.field public static final REQUEST_CUSTOMER_SIGNOFF:I

.field public static final REQUEST_CUSTOMER_VPALIST:I

.field public static final REQUEST_DECLINE_BLOCK_MANDATE:I

.field public static final REQUEST_DELETE_CUSTOMER_VPA:I

.field public static final REQUEST_DTH_OPERATORS:I

.field public static final REQUEST_FETCH_ACCOUNT:I

.field public static final REQUEST_GENERATE_INTENT_SIGN:I

.field public static final REQUEST_GENERATE_INTENT_SIGN_DOWNLOAD:I

.field public static final REQUEST_GET_REWARDS:I

.field public static final REQUEST_GET_TOKEN:I

.field public static final REQUEST_GET_WEB_URL:I

.field public static final REQUEST_INBOX:I

.field public static final REQUEST_INFO:I

.field public static final REQUEST_LIMIT_CHECK:I

.field public static final REQUEST_LIST_BANKS:I

.field public static final REQUEST_LIST_KEYS:I

.field public static final REQUEST_LIST_QUERIES:I

.field public static final REQUEST_LIST_VPA:I

.field public static final REQUEST_LOGIN:I

.field public static final REQUEST_MANDATE_EXECUTE:I

.field public static final REQUEST_MANDATE_HISTORY:I

.field public static final REQUEST_MANDATE_RECURRENCE_AUTHORIZATION:I

.field public static final REQUEST_MANDATE_RECURRENCE_AUTHORIZATION_WITHOUT_PIN:I

.field public static final REQUEST_MANDATE_RECURRENCE_PENDING:I

.field public static final REQUEST_MAX_AMOUNTS:I

.field public static final REQUEST_MOBILE_CIRCLES:I

.field public static final REQUEST_MOBILE_OPERATORS:I

.field public static final REQUEST_OD_ACCOUNT_BLC_ENQ:I

.field public static final REQUEST_PAY:I

.field public static final REQUEST_PENDING_TRANSACTION:I

.field public static final REQUEST_PERSONAL_LOAN:I

.field public static final REQUEST_PROMOTIONAL_OFFERS:I

.field public static final REQUEST_RAISE_COMPLAIN:I

.field public static final REQUEST_RAISE_QUERY:I

.field public static final REQUEST_RECHARGE_PREFIX:I

.field public static final REQUEST_REGISTER:I

.field public static final REQUEST_REJECT_NOTIFICATION:I

.field public static final REQUEST_REMOVE_ACCOUNT:I

.field public static final REQUEST_REMOVE_VPA:I

.field public static final REQUEST_RESEND_OTP:I

.field public static final REQUEST_SAVE_ACCOUNT:I

.field public static final REQUEST_SAVE_APIN:I

.field public static final REQUEST_SAVE_VPA:I

.field public static final REQUEST_SERVER_HEALTH_CHECK:I

.field public static final REQUEST_SETU:I

.field public static final REQUEST_SET_CUSTOMER_VPA:I

.field public static final REQUEST_SKIP_BIND_MOBILE:I

.field public static final REQUEST_TRANSACTION_ACCOUNT_HISTORY:I

.field public static final REQUEST_TRANSACTION_FILTER_HISTORY:I

.field public static final REQUEST_TRANSACTION_HISTORY:I

.field public static final REQUEST_UPDATE_MANDATE:I

.field public static final REQUEST_VALIDATE_APIN:I

.field public static final REQUEST_VERIFY_INTENT_SIGN:I

.field public static final REQUEST_VERIFY_MERCHANT:I

.field public static final REQUEST_VERIFY_REGISTRATION:I

.field public static final REQUEST_VERIFY_VPA2:I

.field public static final REQUEST_VPA_AVAILABILITY:I

.field public static final UPDATE_INBOX:I

.field public static final VERIFY_PROMOCODE:I

.field public static final VERIFY_PROMO_CODE:I

.field public static final VERIFY_REFERRAL_CODE:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/olive/upi/transport/api/UpiService;

    const v1, 0x8

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method


# virtual methods
.method public abstract PayReq(Lcom/olive/upi/transport/model/PayRequest;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/PayRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/PayRequest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/transactions/pay"
    .end annotation
.end method

.method public abstract accountFetch(Lcom/olive/upi/transport/model/AcRequest;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/AcRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/AcRequest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/accounts"
    .end annotation
.end method

.method public abstract accountMobileReg(Lcom/olive/upi/transport/model/RegRequest;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/RegRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/RegRequest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/accounts/mobreg"
    .end annotation
.end method

.method public abstract accountOtp(Lcom/olive/upi/transport/model/AccountOTPRequest;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/AccountOTPRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/AccountOTPRequest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/otp"
    .end annotation
.end method

.method public abstract accountRemove(Lcom/olive/upi/transport/model/AcctUpdateReq;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/AcctUpdateReq;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/AcctUpdateReq;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/CustomerBankAccounts;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/accounts/remove"
    .end annotation
.end method

.method public abstract accountSave(Lcom/olive/upi/transport/model/AcctUpdateReq;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/AcctUpdateReq;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/AcctUpdateReq;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/CustomerBankAccounts;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/accounts/update"
    .end annotation
.end method

.method public abstract authenticate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Header;
            value = "X-Auth-Username"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Header;
            value = "X-Auth-Password"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Header;
            value = "X-Auth-Device"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/TokenResponse;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/authenticate"
    .end annotation
.end method

.method public abstract balanceEnqForCreditLine(Lcom/olive/upi/transport/model/CreditLineBalReqest;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/CreditLineBalReqest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/CreditLineBalReqest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/transactions/balanceinquiry/creditline"
    .end annotation
.end method

.method public abstract billPay(Lcom/olive/upi/transport/model/BillPay;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/BillPay;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/BillPay;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/txn/billpay"
    .end annotation
.end method

.method public abstract billpayEnquiry(Lcom/olive/upi/transport/model/BillPaymentEnqRequst;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/BillPaymentEnqRequst;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/BillPaymentEnqRequst;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/BbpsHistory;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/billpay/billpayenquiry"
    .end annotation
.end method

.method public abstract blockedVpa(Ljava/lang/String;Ljava/util/ArrayList;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .param p2    # Ljava/util/ArrayList;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpaBlock;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/txn/listbene/block"
    .end annotation
.end method

.method public abstract calculateCharge(Lcom/olive/upi/transport/model/BillerChargeReq;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/BillerChargeReq;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/BillerChargeReq;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/BillerChargeRes;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/billpay/chargecalc"
    .end annotation
.end method

.method public abstract changePassword(Lcom/olive/upi/transport/model/ChangeAppPin;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/ChangeAppPin;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/ChangeAppPin;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/changepassword"
    .end annotation
.end method

.method public abstract collectNotification(Lcom/olive/upi/transport/model/CollectPayRequest;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/CollectPayRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/CollectPayRequest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/transactions/collectpay"
    .end annotation
.end method

.method public abstract collectReq(Lcom/olive/upi/transport/model/Collect;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/Collect;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/Collect;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/transactions/collect"
    .end annotation
.end method

.method public abstract createMandate(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/PayerInitiatedMandate;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "appid"
        .end annotation
    .end param
    .param p3    # Lcom/olive/upi/transport/model/PayerInitiatedMandate;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/olive/upi/transport/model/PayerInitiatedMandate;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/transactions/payerinitiatedmandate"
    .end annotation
.end method

.method public abstract customerListVPA(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/CustomerVpa;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/vpa/list"
    .end annotation
.end method

.method public abstract customerReg(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "data"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "refid"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/register"
    .end annotation
.end method

.method public abstract deRegister(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/deregister"
    .end annotation
.end method

.method public abstract declineMandate(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/AuthorizeMandateRequest;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "appid"
        .end annotation
    .end param
    .param p3    # Lcom/olive/upi/transport/model/AuthorizeMandateRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/olive/upi/transport/model/AuthorizeMandateRequest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/transactions/authorizemandate "
    .end annotation
.end method

.method public abstract deleteCustomerVpa(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "customerid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "accountNumber"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "vpa"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "defaultvpa"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "ifsc"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v2/deletecustomer/vpa"
    .end annotation
.end method

.method public abstract executeMandate(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/MandateExecute;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "appid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .param p3    # Lcom/olive/upi/transport/model/MandateExecute;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/olive/upi/transport/model/MandateExecute;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/transactions/mandateexecute"
    .end annotation
.end method

.method public abstract generateSignedQR(Lcom/olive/upi/transport/model/IntentData;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/IntentData;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/IntentData;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/generate/signedqr"
    .end annotation
.end method

.method public abstract getAllAccounts(Lcom/olive/upi/transport/model/CustomerAcRequest;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/CustomerAcRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/CustomerAcRequest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/CustomerBankAccounts;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/allaccounts"
    .end annotation
.end method

.method public abstract getAnalyseRewards(Lcom/olive/upi/transport/model/RewardsVO;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/RewardsVO;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/RewardsVO;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/upi/rewards/analyseReward"
    .end annotation
.end method

.method public abstract getBal(Lcom/olive/upi/transport/model/BRequest;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/BRequest;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/BRequest;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/transactions/balanceinquiry"
    .end annotation
.end method

.method public abstract getBanner(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "deviceos"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Banner;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/banner"
    .end annotation
.end method

.method public abstract getBillPayMaxAmounts()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/BillPayDataMaxAmount;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/getbilpaymaxamounts"
    .end annotation
.end method

.method public abstract getBillerCategory()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/BillerCategory;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/billpay/getbillerctgry"
    .end annotation
.end method

.method public abstract getBillerForm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "BILL_CTGRY"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "CORP_CODE"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "LVL_CODE_ACTL"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "MASTR_TYPE"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "CIF_ID"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/BillerField;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/billpay/billerregform"
    .end annotation
.end method

.method public abstract getBillerLocation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "BILL_CTGRY"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "CORP_CODE"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "MASTR_TYPE"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "CIF_ID"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/BillerCircle;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/billpay/getbillerloc"
    .end annotation
.end method

.method public abstract getBillerName(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "BILL_CTGRY"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Billers;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/billpay/getbillername"
    .end annotation
.end method

.method public abstract getBlockedBeneVpa()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Collectbeneblock;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/txn/listbeneblock"
    .end annotation
.end method

.method public abstract getChangeMpin(Lcom/olive/upi/transport/model/ChangeCredReq;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/ChangeCredReq;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/ChangeCredReq;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/accounts/cred"
    .end annotation
.end method

.method public abstract getClToken(Lcom/olive/upi/transport/model/ClTokenReq;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/ClTokenReq;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/ClTokenReq;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/cl/token"
    .end annotation
.end method

.method public abstract getDTH()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/DTHOperator;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/getDTH"
    .end annotation
.end method

.method public abstract getInbox()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Inbox;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/getinbox"
    .end annotation
.end method

.method public abstract getInfo()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/v1/info"
    .end annotation
.end method

.method public abstract getMobile(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "data"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/Registration;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bind"
    .end annotation
.end method

.method public abstract getMobileCircle(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "operator"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/getcircle"
    .end annotation
.end method

.method public abstract getMobileOperator(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "mobilenumber"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/PrefixMobile;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/rechargeprefix"
    .end annotation
.end method

.method public abstract getMyVpaAccounts()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/CustomerVpaAccounts;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/vpalistaccounts"
    .end annotation
.end method

.method public abstract getPendingTransactions()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/txn/pending"
    .end annotation
.end method

.method public abstract getPersonalLoan(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "accountno"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/InstacardView;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/persionalloan"
    .end annotation
.end method

.method public abstract getPlainAccount(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "accountno"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/InstacardView;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/plainaccount2"
    .end annotation
.end method

.method public abstract getRaiseComplain(Ljava/lang/String;Lcom/olive/upi/transport/model/ReqComplientVo;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "appid"
        .end annotation
    .end param
    .param p2    # Lcom/olive/upi/transport/model/ReqComplientVo;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/olive/upi/transport/model/ReqComplientVo;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/ComplaintResponse;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/udir/raisecomplaint"
    .end annotation
.end method

.method public abstract getRechargeHistory(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "type"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/RecentBPTHistory;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/recharge/recent"
    .end annotation
.end method

.method public abstract getRechargePlans(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "servicecode"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "consumerno"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "operator"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "circle"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/Rechargeplan;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/rechargeplans"
    .end annotation
.end method

.method public abstract getRewardHistory(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "mobilenumber"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/RewardHistoryVO;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/api/upi/rewards/getRewardsHistory"
    .end annotation
.end method

.method public abstract getTransactionHistory(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "fromDate"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "toDate"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "accountno"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/txn/list"
    .end annotation
.end method

.method public abstract getVerifiedMerchant(Lcom/olive/upi/transport/model/VerifyVPA;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/VerifyVPA;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/VerifyVPA;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/VerifyMarchantResponse;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/vpa/verifyMerchant"
    .end annotation
.end method

.method public abstract getWebUrls()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/UrlConfig;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/geturlconfig"
    .end annotation
.end method

.method public abstract getcheckStatus(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/CheckStatus;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "appid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "txnid"
        .end annotation
    .end param
    .param p3    # Lcom/olive/upi/transport/model/CheckStatus;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/olive/upi/transport/model/CheckStatus;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/txn/chkstatus"
    .end annotation
.end method

.method public abstract getoperator()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/OperatorsLogos;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/getoperatorlogo"
    .end annotation
.end method

.method public abstract listBanks()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Bank;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/v1/listbanks"
    .end annotation
.end method

.method public abstract listKeys()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/v1/listkeys"
    .end annotation
.end method

.method public abstract listQueries(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/txn/query/list"
    .end annotation
.end method

.method public abstract listVPA(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/vpa/list"
    .end annotation
.end method

.method public abstract login(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "IMEI"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "GCMREGID"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/user/regtoken"
    .end annotation
.end method

.method public abstract mandateHistory(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/ReqMandateTxn;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "appid"
        .end annotation
    .end param
    .param p3    # Lcom/olive/upi/transport/model/ReqMandateTxn;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/olive/upi/transport/model/ReqMandateTxn;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/MandatesVo;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/transactions/getmandatetxn"
    .end annotation
.end method

.method public abstract mandateRequest(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/PayeeInitiatedMandate;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "appid"
        .end annotation
    .end param
    .param p3    # Lcom/olive/upi/transport/model/PayeeInitiatedMandate;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/olive/upi/transport/model/PayeeInitiatedMandate;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/transactions/payeeinitiatedmandate"
    .end annotation
.end method

.method public abstract payBBPSBill(Lcom/olive/upi/transport/model/BbpsPay;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/BbpsPay;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/BbpsPay;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/billpay/billerpayment"
    .end annotation
.end method

.method public abstract pendingSI(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/GetMandate;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "appid"
        .end annotation
    .end param
    .param p3    # Lcom/olive/upi/transport/model/GetMandate;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/olive/upi/transport/model/GetMandate;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/PendingMandateReqVo;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/transactions/getmandate"
    .end annotation
.end method

.method public abstract promotionalOffers(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/BannerOffersVo;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/offerstext"
    .end annotation
.end method

.method public abstract raiseQuery(Lcom/olive/upi/transport/model/TranHistory;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/TranHistory;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/txn/query"
    .end annotation
.end method

.method public abstract recurrenceAuthorization(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/RecurrenceAuthorization;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "appid"
        .end annotation
    .end param
    .param p3    # Lcom/olive/upi/transport/model/RecurrenceAuthorization;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/olive/upi/transport/model/RecurrenceAuthorization;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1//mandate/recurrence/authorization"
    .end annotation
.end method

.method public abstract recurrencePending(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "appid"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/RecurrenceResVo;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/mandate/recurrence/pending"
    .end annotation
.end method

.method public abstract register(Lcom/olive/upi/transport/model/Registration;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/Registration;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/Registration;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/Registration;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/register"
    .end annotation
.end method

.method public abstract registerEnqBiller(Lcom/olive/upi/transport/model/RegisterBiller;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/RegisterBiller;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/RegisterBiller;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/BillerRegEnqResponse;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/billpay/billerregenq"
    .end annotation
.end method

.method public abstract rejectPending(Lcom/olive/upi/transport/model/PendingReqVo;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/PendingReqVo;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/txn/notification/reject"
    .end annotation
.end method

.method public abstract resendOTP(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/reotp/resend"
    .end annotation
.end method

.method public abstract safetynetCheck(Ljava/lang/String;Lcom/olive/upi/transport/model/SafetynetSignedAttestation;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "key"
        .end annotation
    .end param
    .param p2    # Lcom/olive/upi/transport/model/SafetynetSignedAttestation;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/olive/upi/transport/model/SafetynetSignedAttestation;",
            ")",
            "Lretrofit2/Call<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/attestations/verify"
    .end annotation
.end method

.method public abstract saveApin(Lcom/olive/upi/transport/model/SaveAppPin;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/SaveAppPin;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/SaveAppPin;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/aPIN/save"
    .end annotation
.end method

.method public abstract saveVPA(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "vpa"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "name"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "nickname"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "favorite"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/vpa/update"
    .end annotation
.end method

.method public abstract serverCheck(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "version"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/HealthCheck;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/healthcheck"
    .end annotation
.end method

.method public abstract setCustomerVpa(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "account"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "ifsc"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "vpa"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "defaultvpa"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v2/customer/setvpa"
    .end annotation
.end method

.method public abstract setuCheck(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "user_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "api_key"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "mobile_number"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "os"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/model/SetuResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "cou/get-home-link"
    .end annotation
.end method

.method public abstract signOff(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/signoff"
    .end annotation
.end method

.method public abstract skipBindCall(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "data"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/Registration;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bind2"
    .end annotation
.end method

.method public abstract test()Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/json"
    .end annotation
.end method

.method public abstract token(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "challenge"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/token"
    .end annotation
.end method

.method public abstract updateInbox(Lcom/olive/upi/transport/model/Inbox;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/Inbox;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/Inbox;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/Inbox;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/updateinbox"
    .end annotation
.end method

.method public abstract updateMandate(Ljava/lang/String;Ljava/lang/String;Lcom/olive/upi/transport/model/UpdateMandate;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "appid"
        .end annotation
    .end param
    .param p3    # Lcom/olive/upi/transport/model/UpdateMandate;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/olive/upi/transport/model/UpdateMandate;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/transactions/updatemandate"
    .end annotation
.end method

.method public abstract verifyLimits(Lcom/olive/upi/transport/model/LimitCheckReq;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/LimitCheckReq;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/LimitCheckReq;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/bank/txn/limitcheck"
    .end annotation
.end method

.method public abstract verifyPin(Lcom/olive/upi/transport/model/SaveAppPin;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/SaveAppPin;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/SaveAppPin;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/aPIN/verify"
    .end annotation
.end method

.method public abstract verifyPromoCode(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "promocode"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/verifyPromo"
    .end annotation
.end method

.method public abstract verifyPromocode(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "servicecode"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "consumerno"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "spcode"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "sspcode"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "promocode"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Lcom/olive/upi/transport/model/Rechargeplan;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/promocode/verify"
    .end annotation
.end method

.method public abstract verifyReg(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "customerid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "otp"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/otp/verify"
    .end annotation
.end method

.method public abstract verifyRereralCode(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "referralcred"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Field;
            value = "refid"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/referral/vpa"
    .end annotation
.end method

.method public abstract verifySignedQR(Lcom/olive/upi/transport/model/IntentData;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/IntentData;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "appId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/IntentData;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/verifyIntentData"
    .end annotation
.end method

.method public abstract verifyVpa2(Lcom/olive/upi/transport/model/VpaVerify;)Lretrofit2/Call;
    .param p1    # Lcom/olive/upi/transport/model/VpaVerify;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/olive/upi/transport/model/VpaVerify;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/vpa/verify2"
    .end annotation
.end method

.method public abstract vpaRemove(Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "vpa"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/vpa/remove"
    .end annotation
.end method

.method public abstract vpaSuggestion(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "vpa"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "accountno"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/olive/upi/transport/api/Result<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/customer/vpa/check/suggestion"
    .end annotation
.end method
