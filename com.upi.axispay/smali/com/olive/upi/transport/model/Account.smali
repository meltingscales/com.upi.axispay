.class public Lcom/olive/upi/transport/model/Account;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/olive/upi/transport/model/CheckSum;


# static fields
.field public static final ACCOUNT_FORMAT02:Ljava/lang/String;

.field public static final ACCOUNT_FORMAT1:Ljava/lang/String;

.field public static final ACCOUNT_FORMAT2:Ljava/lang/String;

.field public static final STATUS_ACTIVE:Ljava/lang/String;

.field public static final STATUS_INACTIVE:Ljava/lang/String;


# instance fields
.field public accRefNumber:Ljava/lang/String;

.field public aeba:Ljava/lang/String;

.field public atmpinFormat:Ljava/lang/String;

.field public atmpinlength:I

.field public balTime:Ljava/lang/String;

.field public balance:Ljava/lang/String;

.field public bankName:Ljava/lang/String;

.field public checkBalance:I

.field public dLength:I

.field public dType:Ljava/lang/String;

.field public defaultAccount:Ljava/lang/String;

.field public ifsc:Ljava/lang/String;

.field public iin:Ljava/lang/String;

.field public isClAcc:Ljava/lang/String;

.field public maskedAccnumber:Ljava/lang/String;

.field public mmid:Ljava/lang/String;

.field public name:Ljava/lang/String;

.field public otpFormat:Ljava/lang/String;

.field public otpLength:I

.field public status:Ljava/lang/String;

.field public type:Ljava/lang/String;

.field public vpa:Ljava/lang/String;

.field public vpas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Vpas;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/olive/upi/transport/model/Account;

    const v1, 0xcb

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x3812

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/olive/upi/transport/model/Account;->otpFormat:Ljava/lang/String;

    const/4 v0, 0x6

    .line 3
    iput v0, p0, Lcom/olive/upi/transport/model/Account;->otpLength:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x3813

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/olive/upi/transport/model/Account;->otpFormat:Ljava/lang/String;

    const/4 v0, 0x6

    .line 6
    iput v0, p0, Lcom/olive/upi/transport/model/Account;->otpLength:I

    .line 7
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->vpa:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAccRefNumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->accRefNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getAeba()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->aeba:Ljava/lang/String;

    return-object v0
.end method

.method public getAtmpinFormat()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->atmpinFormat:Ljava/lang/String;

    return-object v0
.end method

.method public getAtmpinlength()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/Account;->atmpinlength:I

    return v0
.end method

.method public getBalTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->balTime:Ljava/lang/String;

    return-object v0
.end method

.method public getBalance()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->balance:Ljava/lang/String;

    return-object v0
.end method

.method public getBankName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->bankName:Ljava/lang/String;

    return-object v0
.end method

.method public getCheckBalance()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/Account;->checkBalance:I

    return v0
.end method

.method public getDefaultAccount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->defaultAccount:Ljava/lang/String;

    return-object v0
.end method

.method public getIfsc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->ifsc:Ljava/lang/String;

    return-object v0
.end method

.method public getIin()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->iin:Ljava/lang/String;

    return-object v0
.end method

.method public getInput()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->mmid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->aeba:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->accRefNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->ifsc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->maskedAccnumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->vpa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/olive/upi/transport/model/Account;->dLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->dType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->balance:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->balTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIsClAcc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->isClAcc:Ljava/lang/String;

    return-object v0
.end method

.method public getMaskedAccnumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->maskedAccnumber:Ljava/lang/String;

    return-object v0
.end method

.method public getMmid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->mmid:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOtpFormat()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->otpFormat:Ljava/lang/String;

    return-object v0
.end method

.method public getOtpLength()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/Account;->otpLength:I

    return v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getVpa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->vpa:Ljava/lang/String;

    return-object v0
.end method

.method public getVpas()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Vpas;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->vpas:Ljava/util/List;

    return-object v0
.end method

.method public getdLength()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/Account;->dLength:I

    return v0
.end method

.method public getdType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/Account;->dType:Ljava/lang/String;

    return-object v0
.end method

.method public setAccRefNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->accRefNumber:Ljava/lang/String;

    return-void
.end method

.method public setAeba(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->aeba:Ljava/lang/String;

    return-void
.end method

.method public setAtmpinFormat(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->atmpinFormat:Ljava/lang/String;

    return-void
.end method

.method public setAtmpinlength(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/Account;->atmpinlength:I

    return-void
.end method

.method public setBalTime(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->balTime:Ljava/lang/String;

    return-void
.end method

.method public setBalance(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->balance:Ljava/lang/String;

    return-void
.end method

.method public setBankName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->bankName:Ljava/lang/String;

    return-void
.end method

.method public setCheckBalance(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/Account;->checkBalance:I

    return-void
.end method

.method public setDefaultAccount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->defaultAccount:Ljava/lang/String;

    return-void
.end method

.method public setIfsc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->ifsc:Ljava/lang/String;

    return-void
.end method

.method public setIin(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->iin:Ljava/lang/String;

    return-void
.end method

.method public setIsClAcc(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->isClAcc:Ljava/lang/String;

    return-void
.end method

.method public setMaskedAccnumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->maskedAccnumber:Ljava/lang/String;

    return-void
.end method

.method public setMmid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->mmid:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->name:Ljava/lang/String;

    return-void
.end method

.method public setOtpFormat(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->otpFormat:Ljava/lang/String;

    return-void
.end method

.method public setOtpLength(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/Account;->otpLength:I

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->status:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->type:Ljava/lang/String;

    return-void
.end method

.method public setVpa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->vpa:Ljava/lang/String;

    return-void
.end method

.method public setVpas(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/Vpas;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->vpas:Ljava/util/List;

    return-void
.end method

.method public setdLength(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/Account;->dLength:I

    return-void
.end method

.method public setdType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/Account;->dType:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->mmid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->aeba:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->accRefNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->ifsc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->maskedAccnumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->vpa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/olive/upi/transport/model/Account;->dLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->dType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->balance:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/olive/upi/transport/model/Account;->balTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
