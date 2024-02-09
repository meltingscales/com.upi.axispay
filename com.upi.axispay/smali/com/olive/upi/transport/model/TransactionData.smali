.class public Lcom/olive/upi/transport/model/TransactionData;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final DIRECTION_COLLECT_PAY:I

.field public static final DIRECTION_COLLECT_REQUEST:I

.field public static final DIRECTION_RECEIVED:I

.field public static final DIRECTION_SEND:I

.field public static MODE_APPROVE_MANDATE:I

.field public static MODE_BHARAT_QR_PAY:I

.field public static MODE_COLLECT_NOTIFICATION:I

.field public static MODE_CREATE_MANDATE:I

.field public static MODE_LIST_VPA:I

.field public static MODE_MANDATE_DECLINE:I

.field public static MODE_MANDATE_EXECUTE:I

.field public static MODE_MERCHANT_PAY:I

.field public static MODE_NONE:I

.field public static MODE_PAYEE_PAUSE:I

.field public static MODE_PAYEE_REVOKE:I

.field public static MODE_PAYEE_UNPAUSE:I

.field public static MODE_PAYEE_UPDATE_MANDATE:I

.field public static MODE_PAYER_PAUSE:I

.field public static MODE_PAYER_REVOKE:I

.field public static MODE_PAYER_UNPAUSE:I

.field public static MODE_PAYER_UPDATE_MANDATE:I

.field public static MODE_QR_MANDATE:I

.field public static MODE_QR_PAY:I

.field public static MODE_RECEIVE:I

.field public static MODE_RESET:I

.field public static MODE_REVOKE_MANDATE:I

.field public static MODE_SEND:I

.field public static MODE_SEND_VIA_IFSC:I

.field public static final STATUS_ACCEPTED:I

.field public static final STATUS_BLOCK:I

.field public static final STATUS_DEEMED:I

.field public static final STATUS_EXPIRED:I

.field public static final STATUS_FAILURE:I

.field public static final STATUS_PENDING:I

.field public static final STATUS_REJECT:I

.field public static final STATUS_SUCCESS:I

.field public static isSelectedFromList:Z

.field private static transactionData:Lcom/olive/upi/transport/model/TransactionData;


# instance fields
.field private CESS:Ljava/lang/String;

.field private CGST:Ljava/lang/String;

.field private GST:Ljava/lang/String;

.field private IGST:Ljava/lang/String;

.field public QRexpire:Ljava/lang/String;

.field private QRts:Ljava/lang/String;

.field private SGST:Ljava/lang/String;

.field public account:Lcom/olive/upi/transport/model/Account;

.field private amount:Ljava/lang/Double;

.field private approvalRefNo:Ljava/lang/String;

.field public bankName:Ljava/lang/String;

.field public beneVpa:Lcom/olive/upi/transport/model/BeneVpa;

.field public beneficiaryName:Ljava/lang/String;

.field public billpayInfoString:Ljava/lang/String;

.field public billpayKey:Ljava/lang/String;

.field public consentName:Ljava/lang/String;

.field public consentType:Ljava/lang/String;

.field public creditBankName:Ljava/lang/String;

.field private cu:Ljava/lang/String;

.field private cuurentTime:Ljava/lang/String;

.field public debitBankName:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private destAccount:Ljava/lang/String;

.field private destBankName:Ljava/lang/String;

.field private direction:I

.field private editedAmount:Ljava/lang/Double;

.field private editedRemarks:Ljava/lang/String;

.field private edittipamount:Ljava/lang/String;

.field public enTips:Ljava/lang/String;

.field private expiry:Ljava/lang/String;

.field private expirydateTime:Ljava/lang/String;

.field private gstBrkUp:Ljava/lang/String;

.field private gstIn:Ljava/lang/String;

.field private intentData:Ljava/lang/String;

.field private intentVerifiedData:Ljava/lang/String;

.field public invoiceDate:Ljava/lang/String;

.field public invoiceName:Ljava/lang/String;

.field private invoiceNo:Ljava/lang/String;

.field public invoiceUrl:Ljava/lang/String;

.field public isConsentEnabled:Ljava/lang/String;

.field public isFromIntent:Z

.field private isGSTEnabled:Ljava/lang/String;

.field private isP2P:Ljava/lang/Boolean;

.field private isSignVerified:Z

.field private isThroughNotification:Z

.field private isThroughNotificationCrossSell:Z

.field private isVerified:Ljava/lang/String;

.field private isfromSendMoney:Z

.field private mcc:Ljava/lang/String;

.field public merchantflag:Ljava/lang/String;

.field public mid:Ljava/lang/String;

.field private minimumAmount:Ljava/lang/Double;

.field public mode:Ljava/lang/String;

.field public msid:Ljava/lang/String;

.field public mtid:Ljava/lang/String;

.field private orderId:Ljava/lang/String;

.field private orgId:Ljava/lang/String;

.field public orgid:Ljava/lang/String;

.field private pa:Ljava/lang/String;

.field private payAppId:Ljava/lang/String;

.field private payCurrency:Ljava/lang/String;

.field public payType:I

.field private payeeAcNo:Ljava/lang/String;

.field private payeeAppName:Ljava/lang/String;

.field private payeeIfsc:Ljava/lang/String;

.field private payeeName:Ljava/lang/String;

.field private payeeVpa:Ljava/lang/String;

.field private payerVpa:Ljava/lang/String;

.field private pinCode:Ljava/lang/String;

.field private pn:Ljava/lang/String;

.field public purpose:Ljava/lang/String;

.field private qrMedium:Ljava/lang/String;

.field public query:Ljava/lang/String;

.field private queryCloserComment:Ljava/lang/String;

.field private queryComment:Ljava/lang/String;

.field private queryStatus:Ljava/lang/String;

.field private querydate:Ljava/lang/String;

.field private queryid:Ljava/lang/String;

.field private refCategory:Ljava/lang/String;

.field private refUrl:Ljava/lang/String;

.field private refid:Ljava/lang/String;

.field private remarks:Ljava/lang/String;

.field public remitterName:Ljava/lang/String;

.field private remitterVpa:Ljava/lang/String;

.field private responseCode:Ljava/lang/String;

.field private result:Ljava/lang/String;

.field public sign:Ljava/lang/String;

.field private source:I

.field private sourceAccount:Ljava/lang/String;

.field private sourceBankName:Ljava/lang/String;

.field private tipAmount:Ljava/lang/Double;

.field private tn:Ljava/lang/String;

.field private transactionDate:Ljava/lang/String;

.field private transactionId:Ljava/lang/String;

.field public transactionMode:I

.field private transactionNote:Ljava/lang/String;

.field public transactionSource:I

.field private transactionStatus:I

.field private transactionType:Ljava/lang/String;

.field public udir:Lcom/olive/upi/transport/model/Udir;

.field private umnId:Ljava/lang/String;

.field private updateType:Ljava/lang/String;

.field private upiTransactionMode:Ljava/lang/String;

.field private ver:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/olive/upi/transport/model/TransactionData;

    const v1, 0x3d

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isFromIntent:Z

    .line 3
    iput-boolean v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isfromSendMoney:Z

    const v0, 0x3868

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    iput-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isConsentEnabled:Ljava/lang/String;

    .line 5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isP2P:Ljava/lang/Boolean;

    return-void
.end method

.method public static getInstance()Lcom/olive/upi/transport/model/TransactionData;
    .locals 1

    .line 1
    sget-object v0, Lcom/olive/upi/transport/model/TransactionData;->transactionData:Lcom/olive/upi/transport/model/TransactionData;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/TransactionData;-><init>()V

    sput-object v0, Lcom/olive/upi/transport/model/TransactionData;->transactionData:Lcom/olive/upi/transport/model/TransactionData;

    .line 3
    :cond_0
    sget-object v0, Lcom/olive/upi/transport/model/TransactionData;->transactionData:Lcom/olive/upi/transport/model/TransactionData;

    return-object v0
.end method

.method public static isSelectedFromList()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/olive/upi/transport/model/TransactionData;->isSelectedFromList:Z

    return v0
.end method

.method public static setIsSelectedFromList(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/olive/upi/transport/model/TransactionData;->isSelectedFromList:Z

    return-void
.end method


# virtual methods
.method public getAccount()Lcom/olive/upi/transport/model/Account;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->account:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public getAmount()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->amount:Ljava/lang/Double;

    return-object v0
.end method

.method public getApprovalRefNo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->approvalRefNo:Ljava/lang/String;

    return-object v0
.end method

.method public getBankName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->bankName:Ljava/lang/String;

    return-object v0
.end method

.method public getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->beneVpa:Lcom/olive/upi/transport/model/BeneVpa;

    return-object v0
.end method

.method public getBeneficiaryName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->beneficiaryName:Ljava/lang/String;

    return-object v0
.end method

.method public getBillpayInfoString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->billpayInfoString:Ljava/lang/String;

    return-object v0
.end method

.method public getBillpayKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->billpayKey:Ljava/lang/String;

    return-object v0
.end method

.method public getCESS()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->CESS:Ljava/lang/String;

    return-object v0
.end method

.method public getCGST()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->CGST:Ljava/lang/String;

    return-object v0
.end method

.method public getConsentName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->consentName:Ljava/lang/String;

    return-object v0
.end method

.method public getConsentType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->consentType:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditBankName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->creditBankName:Ljava/lang/String;

    return-object v0
.end method

.method public getCu()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->cu:Ljava/lang/String;

    return-object v0
.end method

.method public getCuurentTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->cuurentTime:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitBankName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->debitBankName:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getDestAccount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->destAccount:Ljava/lang/String;

    return-object v0
.end method

.method public getDestBankName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->destBankName:Ljava/lang/String;

    return-object v0
.end method

.method public getDirection()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TransactionData;->direction:I

    return v0
.end method

.method public getEditedAmount()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->editedAmount:Ljava/lang/Double;

    return-object v0
.end method

.method public getEditedRemarks()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->editedRemarks:Ljava/lang/String;

    return-object v0
.end method

.method public getEdittipamount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->edittipamount:Ljava/lang/String;

    return-object v0
.end method

.method public getEnTips()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->enTips:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiry()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->expiry:Ljava/lang/String;

    return-object v0
.end method

.method public getExpirydateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->expirydateTime:Ljava/lang/String;

    return-object v0
.end method

.method public getGST()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->GST:Ljava/lang/String;

    return-object v0
.end method

.method public getGstBrkUp()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->gstBrkUp:Ljava/lang/String;

    return-object v0
.end method

.method public getGstIn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->gstIn:Ljava/lang/String;

    return-object v0
.end method

.method public getIGST()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->IGST:Ljava/lang/String;

    return-object v0
.end method

.method public getIntentData()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->intentData:Ljava/lang/String;

    return-object v0
.end method

.method public getIntentVerifiedData()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->intentVerifiedData:Ljava/lang/String;

    return-object v0
.end method

.method public getInvoiceDate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->invoiceDate:Ljava/lang/String;

    return-object v0
.end method

.method public getInvoiceName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->invoiceName:Ljava/lang/String;

    return-object v0
.end method

.method public getInvoiceNo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->invoiceNo:Ljava/lang/String;

    return-object v0
.end method

.method public getInvoiceUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->invoiceUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getIsConsentEnabled()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isConsentEnabled:Ljava/lang/String;

    return-object v0
.end method

.method public getIsGSTEnabled()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isGSTEnabled:Ljava/lang/String;

    return-object v0
.end method

.method public getIsVerified()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isVerified:Ljava/lang/String;

    return-object v0
.end method

.method public getMcc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->mcc:Ljava/lang/String;

    return-object v0
.end method

.method public getMerchantflag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->merchantflag:Ljava/lang/String;

    return-object v0
.end method

.method public getMid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->mid:Ljava/lang/String;

    return-object v0
.end method

.method public getMinimumAmount()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->minimumAmount:Ljava/lang/Double;

    return-object v0
.end method

.method public getMode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->mode:Ljava/lang/String;

    return-object v0
.end method

.method public getMsid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->msid:Ljava/lang/String;

    return-object v0
.end method

.method public getMtid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->mtid:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->orderId:Ljava/lang/String;

    return-object v0
.end method

.method public getOrgId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->orgId:Ljava/lang/String;

    return-object v0
.end method

.method public getOrgid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->orgid:Ljava/lang/String;

    return-object v0
.end method

.method public getPa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->pa:Ljava/lang/String;

    return-object v0
.end method

.method public getPayAppId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->payAppId:Ljava/lang/String;

    return-object v0
.end method

.method public getPayCurrency()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->payCurrency:Ljava/lang/String;

    return-object v0
.end method

.method public getPayType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TransactionData;->payType:I

    return v0
.end method

.method public getPayeeAcNo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->payeeAcNo:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeAppName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->payeeAppName:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeIfsc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->payeeIfsc:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->payeeName:Ljava/lang/String;

    return-object v0
.end method

.method public getPayeeVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->payeeVpa:Ljava/lang/String;

    return-object v0
.end method

.method public getPayerVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->payerVpa:Ljava/lang/String;

    return-object v0
.end method

.method public getPinCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->pinCode:Ljava/lang/String;

    return-object v0
.end method

.method public getPn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->pn:Ljava/lang/String;

    return-object v0
.end method

.method public getPurpose()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->purpose:Ljava/lang/String;

    return-object v0
.end method

.method public getQRexpire()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->QRexpire:Ljava/lang/String;

    return-object v0
.end method

.method public getQRts()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->QRts:Ljava/lang/String;

    return-object v0
.end method

.method public getQrMedium()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->qrMedium:Ljava/lang/String;

    return-object v0
.end method

.method public getQuery()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->query:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryCloserComment()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->queryCloserComment:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryComment()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->queryComment:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryStatus()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->queryStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getQuerydate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->querydate:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->queryid:Ljava/lang/String;

    return-object v0
.end method

.method public getRefCategory()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->refCategory:Ljava/lang/String;

    return-object v0
.end method

.method public getRefUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->refUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getRefid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->refid:Ljava/lang/String;

    return-object v0
.end method

.method public getRemarks()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->remarks:Ljava/lang/String;

    return-object v0
.end method

.method public getRemitterName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->remitterName:Ljava/lang/String;

    return-object v0
.end method

.method public getRemitterVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->remitterVpa:Ljava/lang/String;

    return-object v0
.end method

.method public getResponseCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->responseCode:Ljava/lang/String;

    return-object v0
.end method

.method public getResult()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->result:Ljava/lang/String;

    return-object v0
.end method

.method public getSGST()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->SGST:Ljava/lang/String;

    return-object v0
.end method

.method public getSign()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->sign:Ljava/lang/String;

    return-object v0
.end method

.method public getSource()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TransactionData;->source:I

    return v0
.end method

.method public getSourceAccount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->sourceAccount:Ljava/lang/String;

    return-object v0
.end method

.method public getSourceBankName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->sourceBankName:Ljava/lang/String;

    return-object v0
.end method

.method public getTipAmount()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->tipAmount:Ljava/lang/Double;

    return-object v0
.end method

.method public getTn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->tn:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionDate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionDate:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionId:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionMode:I

    return v0
.end method

.method public getTransactionNote()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionNote:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionSource()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionSource:I

    return v0
.end method

.method public getTransactionStatus()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionStatus:I

    return v0
.end method

.method public getTransactionType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionType:Ljava/lang/String;

    return-object v0
.end method

.method public getUdir()Lcom/olive/upi/transport/model/Udir;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->udir:Lcom/olive/upi/transport/model/Udir;

    return-object v0
.end method

.method public getUmn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->umnId:Ljava/lang/String;

    return-object v0
.end method

.method public getUpdateType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->updateType:Ljava/lang/String;

    return-object v0
.end method

.method public getUpiTransactionMode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->upiTransactionMode:Ljava/lang/String;

    return-object v0
.end method

.method public getVer()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->ver:Ljava/lang/String;

    return-object v0
.end method

.method public isFromIntent()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isFromIntent:Z

    return v0
.end method

.method public isIsfromSendMoney()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isfromSendMoney:Z

    return v0
.end method

.method public isP2P(Z)V
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->isP2P:Ljava/lang/Boolean;

    return-void
.end method

.method public isP2P()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isP2P:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSignVerified()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isSignVerified:Z

    return v0
.end method

.method public isThroughNotification()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isThroughNotification:Z

    return v0
.end method

.method public isThroughNotificationCrossSell(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/olive/upi/transport/model/TransactionData;->isThroughNotificationCrossSell:Z

    return-void
.end method

.method public isThroughNotificationCrossSell()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/olive/upi/transport/model/TransactionData;->isThroughNotificationCrossSell:Z

    return v0
.end method

.method public setAccount(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->account:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public setAmount(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->amount:Ljava/lang/Double;

    return-void
.end method

.method public setApprovalRefNo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->approvalRefNo:Ljava/lang/String;

    return-void
.end method

.method public setBankName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->bankName:Ljava/lang/String;

    return-void
.end method

.method public setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->beneVpa:Lcom/olive/upi/transport/model/BeneVpa;

    return-void
.end method

.method public setBeneficiaryName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->beneficiaryName:Ljava/lang/String;

    return-void
.end method

.method public setBillInfoString(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->billpayInfoString:Ljava/lang/String;

    return-void
.end method

.method public setBillpayKey(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->billpayKey:Ljava/lang/String;

    return-void
.end method

.method public setCESS(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->CESS:Ljava/lang/String;

    return-void
.end method

.method public setCGST(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->CGST:Ljava/lang/String;

    return-void
.end method

.method public setConsentName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->consentName:Ljava/lang/String;

    return-void
.end method

.method public setConsentType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->consentType:Ljava/lang/String;

    return-void
.end method

.method public setCreditBankName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->creditBankName:Ljava/lang/String;

    return-void
.end method

.method public setCu(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->cu:Ljava/lang/String;

    return-void
.end method

.method public setCuurentTime(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->cuurentTime:Ljava/lang/String;

    return-void
.end method

.method public setDebitBankName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->debitBankName:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->description:Ljava/lang/String;

    return-void
.end method

.method public setDestAccount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->destAccount:Ljava/lang/String;

    return-void
.end method

.method public setDestBankName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->destBankName:Ljava/lang/String;

    return-void
.end method

.method public setDirection(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TransactionData;->direction:I

    return-void
.end method

.method public setEditedAmount(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->editedAmount:Ljava/lang/Double;

    return-void
.end method

.method public setEditedRemarks(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->editedRemarks:Ljava/lang/String;

    return-void
.end method

.method public setEdittipamount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->edittipamount:Ljava/lang/String;

    return-void
.end method

.method public setEnTips(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->enTips:Ljava/lang/String;

    return-void
.end method

.method public setExpiry(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->expiry:Ljava/lang/String;

    return-void
.end method

.method public setExpirydateTime(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->expirydateTime:Ljava/lang/String;

    return-void
.end method

.method public setFromIntent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/olive/upi/transport/model/TransactionData;->isFromIntent:Z

    return-void
.end method

.method public setGST(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->GST:Ljava/lang/String;

    return-void
.end method

.method public setGstBrkUp(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->gstBrkUp:Ljava/lang/String;

    return-void
.end method

.method public setGstIn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->gstIn:Ljava/lang/String;

    return-void
.end method

.method public setIGST(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->IGST:Ljava/lang/String;

    return-void
.end method

.method public setIntentData(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->intentData:Ljava/lang/String;

    return-void
.end method

.method public setIntentVerifiedData(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->intentVerifiedData:Ljava/lang/String;

    return-void
.end method

.method public setInvoiceDate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->invoiceDate:Ljava/lang/String;

    return-void
.end method

.method public setInvoiceName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->invoiceName:Ljava/lang/String;

    return-void
.end method

.method public setInvoiceNo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->invoiceNo:Ljava/lang/String;

    return-void
.end method

.method public setInvoiceUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->invoiceUrl:Ljava/lang/String;

    return-void
.end method

.method public setIsConsentEnabled(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->isConsentEnabled:Ljava/lang/String;

    return-void
.end method

.method public setIsGSTEnabled(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->isGSTEnabled:Ljava/lang/String;

    return-void
.end method

.method public setIsThroughNotification(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/olive/upi/transport/model/TransactionData;->isThroughNotification:Z

    return-void
.end method

.method public setIsVerified(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->isVerified:Ljava/lang/String;

    return-void
.end method

.method public setIsfromSendMoney(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/olive/upi/transport/model/TransactionData;->isfromSendMoney:Z

    return-void
.end method

.method public setMcc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->mcc:Ljava/lang/String;

    return-void
.end method

.method public setMerchantflag(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->merchantflag:Ljava/lang/String;

    return-void
.end method

.method public setMid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->mid:Ljava/lang/String;

    return-void
.end method

.method public setMinimumAmount(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->minimumAmount:Ljava/lang/Double;

    return-void
.end method

.method public setMode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->mode:Ljava/lang/String;

    return-void
.end method

.method public setMsid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->msid:Ljava/lang/String;

    return-void
.end method

.method public setMtid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->mtid:Ljava/lang/String;

    return-void
.end method

.method public setOrderId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->orderId:Ljava/lang/String;

    return-void
.end method

.method public setOrgId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->orgId:Ljava/lang/String;

    return-void
.end method

.method public setOrgid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->orgid:Ljava/lang/String;

    return-void
.end method

.method public setPa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->pa:Ljava/lang/String;

    return-void
.end method

.method public setPayAppId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->payAppId:Ljava/lang/String;

    return-void
.end method

.method public setPayCurrency(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->payCurrency:Ljava/lang/String;

    return-void
.end method

.method public setPayType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TransactionData;->payType:I

    return-void
.end method

.method public setPayeeAcNo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->payeeAcNo:Ljava/lang/String;

    return-void
.end method

.method public setPayeeAppName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->payeeAppName:Ljava/lang/String;

    return-void
.end method

.method public setPayeeIfsc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->payeeIfsc:Ljava/lang/String;

    return-void
.end method

.method public setPayeeName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->payeeName:Ljava/lang/String;

    return-void
.end method

.method public setPayeeVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->payeeVpa:Ljava/lang/String;

    return-void
.end method

.method public setPayerVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->payerVpa:Ljava/lang/String;

    return-void
.end method

.method public setPinCode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->pinCode:Ljava/lang/String;

    return-void
.end method

.method public setPn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->pn:Ljava/lang/String;

    return-void
.end method

.method public setPurpose(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->purpose:Ljava/lang/String;

    return-void
.end method

.method public setQRexpire(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->QRexpire:Ljava/lang/String;

    return-void
.end method

.method public setQRts(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->QRts:Ljava/lang/String;

    return-void
.end method

.method public setQrMedium(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->qrMedium:Ljava/lang/String;

    return-void
.end method

.method public setQuery(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->query:Ljava/lang/String;

    return-void
.end method

.method public setQueryCloserComment(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->queryCloserComment:Ljava/lang/String;

    return-void
.end method

.method public setQueryComment(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->queryComment:Ljava/lang/String;

    return-void
.end method

.method public setQueryStatus(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->queryStatus:Ljava/lang/String;

    return-void
.end method

.method public setQuerydate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->querydate:Ljava/lang/String;

    return-void
.end method

.method public setQueryid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->queryid:Ljava/lang/String;

    return-void
.end method

.method public setRefCategory(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->refCategory:Ljava/lang/String;

    return-void
.end method

.method public setRefUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->refUrl:Ljava/lang/String;

    return-void
.end method

.method public setRefid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->refid:Ljava/lang/String;

    return-void
.end method

.method public setRemarks(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->remarks:Ljava/lang/String;

    return-void
.end method

.method public setRemitterName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->remitterName:Ljava/lang/String;

    return-void
.end method

.method public setRemitterVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->remitterVpa:Ljava/lang/String;

    return-void
.end method

.method public setResponseCode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->responseCode:Ljava/lang/String;

    return-void
.end method

.method public setResult(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->result:Ljava/lang/String;

    return-void
.end method

.method public setSGST(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->SGST:Ljava/lang/String;

    return-void
.end method

.method public setSign(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->sign:Ljava/lang/String;

    return-void
.end method

.method public setSignVerified(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/olive/upi/transport/model/TransactionData;->isSignVerified:Z

    return-void
.end method

.method public setSource(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TransactionData;->source:I

    return-void
.end method

.method public setSourceAccount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->sourceAccount:Ljava/lang/String;

    return-void
.end method

.method public setSourceBankName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->sourceBankName:Ljava/lang/String;

    return-void
.end method

.method public setTipAmount(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->tipAmount:Ljava/lang/Double;

    return-void
.end method

.method public setTn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->tn:Ljava/lang/String;

    return-void
.end method

.method public setTransactionDate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionDate:Ljava/lang/String;

    return-void
.end method

.method public setTransactionId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionId:Ljava/lang/String;

    return-void
.end method

.method public setTransactionMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionMode:I

    return-void
.end method

.method public setTransactionNote(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionNote:Ljava/lang/String;

    return-void
.end method

.method public setTransactionSource(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionSource:I

    return-void
.end method

.method public setTransactionStatus(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionStatus:I

    return-void
.end method

.method public setTransactionType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->transactionType:Ljava/lang/String;

    return-void
.end method

.method public setUdir(Lcom/olive/upi/transport/model/Udir;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->udir:Lcom/olive/upi/transport/model/Udir;

    return-void
.end method

.method public setUmn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->umnId:Ljava/lang/String;

    return-void
.end method

.method public setUpdateType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->updateType:Ljava/lang/String;

    return-void
.end method

.method public setUpiTransactionMode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->upiTransactionMode:Ljava/lang/String;

    return-void
.end method

.method public setVer(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionData;->ver:Ljava/lang/String;

    return-void
.end method
