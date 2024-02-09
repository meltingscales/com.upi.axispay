.class public Lcom/olive/upi/transport/model/ChangeMpin;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public account:Lcom/olive/upi/transport/model/Account;

.field public bankId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/olive/upi/transport/model/ChangeMpin;->bankId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/olive/upi/transport/model/ChangeMpin;->account:Lcom/olive/upi/transport/model/Account;

    return-void
.end method


# virtual methods
.method public getAccount()Lcom/olive/upi/transport/model/Account;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ChangeMpin;->account:Lcom/olive/upi/transport/model/Account;

    return-object v0
.end method

.method public getBankId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/ChangeMpin;->bankId:Ljava/lang/String;

    return-object v0
.end method

.method public setAccount(Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ChangeMpin;->account:Lcom/olive/upi/transport/model/Account;

    return-void
.end method

.method public setBankId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/ChangeMpin;->bankId:Ljava/lang/String;

    return-void
.end method
