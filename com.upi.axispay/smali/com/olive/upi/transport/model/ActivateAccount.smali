.class public Lcom/olive/upi/transport/model/ActivateAccount;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public account:Lcom/olive/upi/transport/model/Account;

.field public bankId:Ljava/lang/String;

.field public cardNo:Ljava/lang/String;

.field public exp:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccount()Lcom/olive/upi/transport/model/Account;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ActivateAccount;->account:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public getBankId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ActivateAccount;->bankId:Ljava/lang/String;

    return-object v0
.end method

.method public getCardNo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ActivateAccount;->cardNo:Ljava/lang/String;

    return-object v0
.end method

.method public getExp()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ActivateAccount;->exp:Ljava/lang/String;

    return-object v0
.end method

.method public setAccount(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ActivateAccount;->account:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public setBankId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ActivateAccount;->bankId:Ljava/lang/String;

    return-void
.end method

.method public setCardNo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ActivateAccount;->cardNo:Ljava/lang/String;

    return-void
.end method

.method public setExp(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ActivateAccount;->exp:Ljava/lang/String;

    return-void
.end method
