.class public Lcom/olive/upi/transport/model/Registration;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final TYPE_EXISTING_USER:Ljava/lang/String;


# instance fields
.field public action:Ljava/lang/String;

.field public customerBankAccounts:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/CustomerBankAccounts;",
            ">;"
        }
    .end annotation
.end field

.field public customerBankAccountsenc:Ljava/lang/String;

.field public customerid:Ljava/lang/String;

.field public deviceInfo:Lcom/olive/upi/transport/model/DeviceDetails;

.field public mobilenumber:Ljava/lang/String;

.field public name:Ljava/lang/String;

.field public notification:Ljava/lang/String;

.field public type:Ljava/lang/String;

.field public vpa:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/olive/upi/transport/model/Registration;

    const v1, 0x195

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/olive/upi/transport/model/Registration;->customerBankAccounts:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public getAction()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Registration;->action:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerBankAccountsenc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Registration;->customerBankAccountsenc:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerBankAccountses()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/CustomerBankAccounts;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Registration;->customerBankAccounts:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getCustomerid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Registration;->customerid:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceInfo()Lcom/olive/upi/transport/model/DeviceDetails;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Registration;->deviceInfo:Lcom/olive/upi/transport/model/DeviceDetails;

    return-object v0
.end method

.method public getMobilenumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Registration;->mobilenumber:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Registration;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNotification()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Registration;->notification:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Registration;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Registration;->vpa:Ljava/lang/String;

    return-object v0
.end method

.method public setAction(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Registration;->action:Ljava/lang/String;

    return-void
.end method

.method public setCustomerBankAccountsenc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Registration;->customerBankAccountsenc:Ljava/lang/String;

    return-void
.end method

.method public setCustomerBankAccountses(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/CustomerBankAccounts;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Registration;->customerBankAccounts:Ljava/util/ArrayList;

    return-void
.end method

.method public setCustomerid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Registration;->customerid:Ljava/lang/String;

    return-void
.end method

.method public setDeviceInfo(Lcom/olive/upi/transport/model/DeviceDetails;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Registration;->deviceInfo:Lcom/olive/upi/transport/model/DeviceDetails;

    return-void
.end method

.method public setMobilenumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Registration;->mobilenumber:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Registration;->name:Ljava/lang/String;

    return-void
.end method

.method public setNotification(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Registration;->notification:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Registration;->type:Ljava/lang/String;

    return-void
.end method

.method public setVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Registration;->vpa:Ljava/lang/String;

    return-void
.end method
