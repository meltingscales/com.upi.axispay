package com.olive.upi.transport.model;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class TransactionData {
    public static final int DIRECTION_COLLECT_PAY = 0;
    public static final int DIRECTION_COLLECT_REQUEST = 0;
    public static final int DIRECTION_RECEIVED = 0;
    public static final int DIRECTION_SEND = 0;
    public static int MODE_APPROVE_MANDATE;
    public static int MODE_BHARAT_QR_PAY;
    public static int MODE_COLLECT_NOTIFICATION;
    public static int MODE_CREATE_MANDATE;
    public static int MODE_LIST_VPA;
    public static int MODE_MANDATE_DECLINE;
    public static int MODE_MANDATE_EXECUTE;
    public static int MODE_MERCHANT_PAY;
    public static int MODE_NONE;
    public static int MODE_PAYEE_PAUSE;
    public static int MODE_PAYEE_REVOKE;
    public static int MODE_PAYEE_UNPAUSE;
    public static int MODE_PAYEE_UPDATE_MANDATE;
    public static int MODE_PAYER_PAUSE;
    public static int MODE_PAYER_REVOKE;
    public static int MODE_PAYER_UNPAUSE;
    public static int MODE_PAYER_UPDATE_MANDATE;
    public static int MODE_QR_MANDATE;
    public static int MODE_QR_PAY;
    public static int MODE_RECEIVE;
    public static int MODE_RESET;
    public static int MODE_REVOKE_MANDATE;
    public static int MODE_SEND;
    public static int MODE_SEND_VIA_IFSC;
    public static final int STATUS_ACCEPTED = 0;
    public static final int STATUS_BLOCK = 0;
    public static final int STATUS_DEEMED = 0;
    public static final int STATUS_EXPIRED = 0;
    public static final int STATUS_FAILURE = 0;
    public static final int STATUS_PENDING = 0;
    public static final int STATUS_REJECT = 0;
    public static final int STATUS_SUCCESS = 0;
    public static boolean isSelectedFromList;
    private static TransactionData transactionData;
    private String CESS;
    private String CGST;
    private String GST;
    private String IGST;
    public String QRexpire;
    private String QRts;
    private String SGST;
    public Account account;
    private Double amount;
    private String approvalRefNo;
    public String bankName;
    public BeneVpa beneVpa;
    public String beneficiaryName;
    public String billpayInfoString;
    public String billpayKey;
    public String consentName;
    public String consentType;
    public String creditBankName;
    private String cu;
    private String cuurentTime;
    public String debitBankName;
    private String description;
    private String destAccount;
    private String destBankName;
    private int direction;
    private Double editedAmount;
    private String editedRemarks;
    private String edittipamount;
    public String enTips;
    private String expiry;
    private String expirydateTime;
    private String gstBrkUp;
    private String gstIn;
    private String intentData;
    private String intentVerifiedData;
    public String invoiceDate;
    public String invoiceName;
    private String invoiceNo;
    public String invoiceUrl;
    private String isGSTEnabled;
    private boolean isSignVerified;
    private boolean isThroughNotification;
    private boolean isThroughNotificationCrossSell;
    private String isVerified;
    private String mcc;
    public String merchantflag;
    public String mid;
    private Double minimumAmount;
    public String mode;
    public String msid;
    public String mtid;
    private String orderId;
    private String orgId;
    public String orgid;
    private String pa;
    private String payAppId;
    private String payCurrency;
    public int payType;
    private String payeeAcNo;
    private String payeeAppName;
    private String payeeIfsc;
    private String payeeName;
    private String payeeVpa;
    private String payerVpa;
    private String pinCode;
    private String pn;
    public String purpose;
    private String qrMedium;
    public String query;
    private String queryCloserComment;
    private String queryComment;
    private String queryStatus;
    private String querydate;
    private String queryid;
    private String refCategory;
    private String refUrl;
    private String refid;
    private String remarks;
    public String remitterName;
    private String remitterVpa;
    private String responseCode;
    private String result;
    public String sign;
    private int source;
    private String sourceAccount;
    private String sourceBankName;
    private Double tipAmount;
    private String tn;
    private String transactionDate;
    private String transactionId;
    public int transactionMode;
    private String transactionNote;
    public int transactionSource;
    private int transactionStatus;
    private String transactionType;
    public Udir udir;
    private String umnId;
    private String updateType;
    private String upiTransactionMode;
    private String ver;
    public boolean isFromIntent = false;
    private boolean isfromSendMoney = false;
    public String isConsentEnabled = C0059ao.a(14440);
    private Boolean isP2P = Boolean.FALSE;

    static {
        C0059ao.a(TransactionData.class, 61);
    }

    public static TransactionData getInstance() {
        if (transactionData == null) {
            transactionData = new TransactionData();
        }
        return transactionData;
    }

    public static boolean isSelectedFromList() {
        return isSelectedFromList;
    }

    public static void setIsSelectedFromList(boolean z) {
        isSelectedFromList = z;
    }

    public Account getAccount() {
        return this.account;
    }

    public Double getAmount() {
        return this.amount;
    }

    public String getApprovalRefNo() {
        return this.approvalRefNo;
    }

    public String getBankName() {
        return this.bankName;
    }

    public BeneVpa getBeneVpa() {
        return this.beneVpa;
    }

    public String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public String getBillpayInfoString() {
        return this.billpayInfoString;
    }

    public String getBillpayKey() {
        return this.billpayKey;
    }

    public String getCESS() {
        return this.CESS;
    }

    public String getCGST() {
        return this.CGST;
    }

    public String getConsentName() {
        return this.consentName;
    }

    public String getConsentType() {
        return this.consentType;
    }

    public String getCreditBankName() {
        return this.creditBankName;
    }

    public String getCu() {
        return this.cu;
    }

    public String getCuurentTime() {
        return this.cuurentTime;
    }

    public String getDebitBankName() {
        return this.debitBankName;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDestAccount() {
        return this.destAccount;
    }

    public String getDestBankName() {
        return this.destBankName;
    }

    public int getDirection() {
        return this.direction;
    }

    public Double getEditedAmount() {
        return this.editedAmount;
    }

    public String getEditedRemarks() {
        return this.editedRemarks;
    }

    public String getEdittipamount() {
        return this.edittipamount;
    }

    public String getEnTips() {
        return this.enTips;
    }

    public String getExpiry() {
        return this.expiry;
    }

    public String getExpirydateTime() {
        return this.expirydateTime;
    }

    public String getGST() {
        return this.GST;
    }

    public String getGstBrkUp() {
        return this.gstBrkUp;
    }

    public String getGstIn() {
        return this.gstIn;
    }

    public String getIGST() {
        return this.IGST;
    }

    public String getIntentData() {
        return this.intentData;
    }

    public String getIntentVerifiedData() {
        return this.intentVerifiedData;
    }

    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public String getInvoiceName() {
        return this.invoiceName;
    }

    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public String getInvoiceUrl() {
        return this.invoiceUrl;
    }

    public String getIsConsentEnabled() {
        return this.isConsentEnabled;
    }

    public String getIsGSTEnabled() {
        return this.isGSTEnabled;
    }

    public String getIsVerified() {
        return this.isVerified;
    }

    public String getMcc() {
        return this.mcc;
    }

    public String getMerchantflag() {
        return this.merchantflag;
    }

    public String getMid() {
        return this.mid;
    }

    public Double getMinimumAmount() {
        return this.minimumAmount;
    }

    public String getMode() {
        return this.mode;
    }

    public String getMsid() {
        return this.msid;
    }

    public String getMtid() {
        return this.mtid;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOrgid() {
        return this.orgid;
    }

    public String getPa() {
        return this.pa;
    }

    public String getPayAppId() {
        return this.payAppId;
    }

    public String getPayCurrency() {
        return this.payCurrency;
    }

    public int getPayType() {
        return this.payType;
    }

    public String getPayeeAcNo() {
        return this.payeeAcNo;
    }

    public String getPayeeAppName() {
        return this.payeeAppName;
    }

    public String getPayeeIfsc() {
        return this.payeeIfsc;
    }

    public String getPayeeName() {
        return this.payeeName;
    }

    public String getPayeeVpa() {
        return this.payeeVpa;
    }

    public String getPayerVpa() {
        return this.payerVpa;
    }

    public String getPinCode() {
        return this.pinCode;
    }

    public String getPn() {
        return this.pn;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public String getQRexpire() {
        return this.QRexpire;
    }

    public String getQRts() {
        return this.QRts;
    }

    public String getQrMedium() {
        return this.qrMedium;
    }

    public String getQuery() {
        return this.query;
    }

    public String getQueryCloserComment() {
        return this.queryCloserComment;
    }

    public String getQueryComment() {
        return this.queryComment;
    }

    public String getQueryStatus() {
        return this.queryStatus;
    }

    public String getQuerydate() {
        return this.querydate;
    }

    public String getQueryid() {
        return this.queryid;
    }

    public String getRefCategory() {
        return this.refCategory;
    }

    public String getRefUrl() {
        return this.refUrl;
    }

    public String getRefid() {
        return this.refid;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getRemitterName() {
        return this.remitterName;
    }

    public String getRemitterVpa() {
        return this.remitterVpa;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public String getResult() {
        return this.result;
    }

    public String getSGST() {
        return this.SGST;
    }

    public String getSign() {
        return this.sign;
    }

    public int getSource() {
        return this.source;
    }

    public String getSourceAccount() {
        return this.sourceAccount;
    }

    public String getSourceBankName() {
        return this.sourceBankName;
    }

    public Double getTipAmount() {
        return this.tipAmount;
    }

    public String getTn() {
        return this.tn;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public int getTransactionMode() {
        return this.transactionMode;
    }

    public String getTransactionNote() {
        return this.transactionNote;
    }

    public int getTransactionSource() {
        return this.transactionSource;
    }

    public int getTransactionStatus() {
        return this.transactionStatus;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public Udir getUdir() {
        return this.udir;
    }

    public String getUmn() {
        return this.umnId;
    }

    public String getUpdateType() {
        return this.updateType;
    }

    public String getUpiTransactionMode() {
        return this.upiTransactionMode;
    }

    public String getVer() {
        return this.ver;
    }

    public boolean isFromIntent() {
        return this.isFromIntent;
    }

    public boolean isIsfromSendMoney() {
        return this.isfromSendMoney;
    }

    public boolean isP2P() {
        return this.isP2P.booleanValue();
    }

    public boolean isSignVerified() {
        return this.isSignVerified;
    }

    public boolean isThroughNotification() {
        return this.isThroughNotification;
    }

    public boolean isThroughNotificationCrossSell() {
        return this.isThroughNotificationCrossSell;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setAmount(Double d) {
        this.amount = d;
    }

    public void setApprovalRefNo(String str) {
        this.approvalRefNo = str;
    }

    public void setBankName(String str) {
        this.bankName = str;
    }

    public void setBeneVpa(BeneVpa beneVpa) {
        this.beneVpa = beneVpa;
    }

    public void setBeneficiaryName(String str) {
        this.beneficiaryName = str;
    }

    public void setBillInfoString(String str) {
        this.billpayInfoString = str;
    }

    public void setBillpayKey(String str) {
        this.billpayKey = str;
    }

    public void setCESS(String str) {
        this.CESS = str;
    }

    public void setCGST(String str) {
        this.CGST = str;
    }

    public void setConsentName(String str) {
        this.consentName = str;
    }

    public void setConsentType(String str) {
        this.consentType = str;
    }

    public void setCreditBankName(String str) {
        this.creditBankName = str;
    }

    public void setCu(String str) {
        this.cu = str;
    }

    public void setCuurentTime(String str) {
        this.cuurentTime = str;
    }

    public void setDebitBankName(String str) {
        this.debitBankName = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDestAccount(String str) {
        this.destAccount = str;
    }

    public void setDestBankName(String str) {
        this.destBankName = str;
    }

    public void setDirection(int i) {
        this.direction = i;
    }

    public void setEditedAmount(Double d) {
        this.editedAmount = d;
    }

    public void setEditedRemarks(String str) {
        this.editedRemarks = str;
    }

    public void setEdittipamount(String str) {
        this.edittipamount = str;
    }

    public void setEnTips(String str) {
        this.enTips = str;
    }

    public void setExpiry(String str) {
        this.expiry = str;
    }

    public void setExpirydateTime(String str) {
        this.expirydateTime = str;
    }

    public void setFromIntent(boolean z) {
        this.isFromIntent = z;
    }

    public void setGST(String str) {
        this.GST = str;
    }

    public void setGstBrkUp(String str) {
        this.gstBrkUp = str;
    }

    public void setGstIn(String str) {
        this.gstIn = str;
    }

    public void setIGST(String str) {
        this.IGST = str;
    }

    public void setIntentData(String str) {
        this.intentData = str;
    }

    public void setIntentVerifiedData(String str) {
        this.intentVerifiedData = str;
    }

    public void setInvoiceDate(String str) {
        this.invoiceDate = str;
    }

    public void setInvoiceName(String str) {
        this.invoiceName = str;
    }

    public void setInvoiceNo(String str) {
        this.invoiceNo = str;
    }

    public void setInvoiceUrl(String str) {
        this.invoiceUrl = str;
    }

    public void setIsConsentEnabled(String str) {
        this.isConsentEnabled = str;
    }

    public void setIsGSTEnabled(String str) {
        this.isGSTEnabled = str;
    }

    public void setIsThroughNotification(boolean z) {
        this.isThroughNotification = z;
    }

    public void setIsVerified(String str) {
        this.isVerified = str;
    }

    public void setIsfromSendMoney(boolean z) {
        this.isfromSendMoney = z;
    }

    public void setMcc(String str) {
        this.mcc = str;
    }

    public void setMerchantflag(String str) {
        this.merchantflag = str;
    }

    public void setMid(String str) {
        this.mid = str;
    }

    public void setMinimumAmount(Double d) {
        this.minimumAmount = d;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setMsid(String str) {
        this.msid = str;
    }

    public void setMtid(String str) {
        this.mtid = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setOrgId(String str) {
        this.orgId = str;
    }

    public void setOrgid(String str) {
        this.orgid = str;
    }

    public void setPa(String str) {
        this.pa = str;
    }

    public void setPayAppId(String str) {
        this.payAppId = str;
    }

    public void setPayCurrency(String str) {
        this.payCurrency = str;
    }

    public void setPayType(int i) {
        this.payType = i;
    }

    public void setPayeeAcNo(String str) {
        this.payeeAcNo = str;
    }

    public void setPayeeAppName(String str) {
        this.payeeAppName = str;
    }

    public void setPayeeIfsc(String str) {
        this.payeeIfsc = str;
    }

    public void setPayeeName(String str) {
        this.payeeName = str;
    }

    public void setPayeeVpa(String str) {
        this.payeeVpa = str;
    }

    public void setPayerVpa(String str) {
        this.payerVpa = str;
    }

    public void setPinCode(String str) {
        this.pinCode = str;
    }

    public void setPn(String str) {
        this.pn = str;
    }

    public void setPurpose(String str) {
        this.purpose = str;
    }

    public void setQRexpire(String str) {
        this.QRexpire = str;
    }

    public void setQRts(String str) {
        this.QRts = str;
    }

    public void setQrMedium(String str) {
        this.qrMedium = str;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setQueryCloserComment(String str) {
        this.queryCloserComment = str;
    }

    public void setQueryComment(String str) {
        this.queryComment = str;
    }

    public void setQueryStatus(String str) {
        this.queryStatus = str;
    }

    public void setQuerydate(String str) {
        this.querydate = str;
    }

    public void setQueryid(String str) {
        this.queryid = str;
    }

    public void setRefCategory(String str) {
        this.refCategory = str;
    }

    public void setRefUrl(String str) {
        this.refUrl = str;
    }

    public void setRefid(String str) {
        this.refid = str;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setRemitterName(String str) {
        this.remitterName = str;
    }

    public void setRemitterVpa(String str) {
        this.remitterVpa = str;
    }

    public void setResponseCode(String str) {
        this.responseCode = str;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public void setSGST(String str) {
        this.SGST = str;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setSignVerified(boolean z) {
        this.isSignVerified = z;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setSourceAccount(String str) {
        this.sourceAccount = str;
    }

    public void setSourceBankName(String str) {
        this.sourceBankName = str;
    }

    public void setTipAmount(Double d) {
        this.tipAmount = d;
    }

    public void setTn(String str) {
        this.tn = str;
    }

    public void setTransactionDate(String str) {
        this.transactionDate = str;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }

    public void setTransactionMode(int i) {
        this.transactionMode = i;
    }

    public void setTransactionNote(String str) {
        this.transactionNote = str;
    }

    public void setTransactionSource(int i) {
        this.transactionSource = i;
    }

    public void setTransactionStatus(int i) {
        this.transactionStatus = i;
    }

    public void setTransactionType(String str) {
        this.transactionType = str;
    }

    public void setUdir(Udir udir) {
        this.udir = udir;
    }

    public void setUmn(String str) {
        this.umnId = str;
    }

    public void setUpdateType(String str) {
        this.updateType = str;
    }

    public void setUpiTransactionMode(String str) {
        this.upiTransactionMode = str;
    }

    public void setVer(String str) {
        this.ver = str;
    }

    public void isP2P(boolean z) {
        this.isP2P = Boolean.valueOf(z);
    }

    public void isThroughNotificationCrossSell(boolean z) {
        this.isThroughNotificationCrossSell = z;
    }
}
