.class public Lcom/olive/upi/transport/model/TransactionModel;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/olive/upi/transport/model/TransactionModel$TransactionType;
    }
.end annotation


# instance fields
.field private amount:I

.field private date:I

.field private day:I

.field private month:I

.field private personID:Ljava/lang/String;

.field public transactionType:Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

.field private year:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILcom/olive/upi/transport/model/TransactionModel$TransactionType;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p2, p0, Lcom/olive/upi/transport/model/TransactionModel;->amount:I

    .line 4
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionModel;->personID:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/olive/upi/transport/model/TransactionModel;->transactionType:Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    return-void
.end method


# virtual methods
.method public getAmount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TransactionModel;->amount:I

    return v0
.end method

.method public getDate()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TransactionModel;->date:I

    return v0
.end method

.method public getDay()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TransactionModel;->day:I

    return v0
.end method

.method public getMonth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TransactionModel;->month:I

    return v0
.end method

.method public getPersonID()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionModel;->personID:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionType()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TransactionModel;->transactionType:Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    sget-object v1, Lcom/olive/upi/transport/model/TransactionModel$TransactionType;->Received:Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    if-ne v0, v1, :cond_0

    const v0, 0x10ca

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const v0, 0x10cb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getYear()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/olive/upi/transport/model/TransactionModel;->year:I

    return v0
.end method

.method public setAmount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TransactionModel;->amount:I

    return-void
.end method

.method public setDate(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TransactionModel;->date:I

    return-void
.end method

.method public setDay(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TransactionModel;->day:I

    return-void
.end method

.method public setMonth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TransactionModel;->month:I

    return-void
.end method

.method public setPersonID(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionModel;->personID:Ljava/lang/String;

    return-void
.end method

.method public setTransactionType(Lcom/olive/upi/transport/model/TransactionModel$TransactionType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TransactionModel;->transactionType:Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    return-void
.end method

.method public setYear(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/olive/upi/transport/model/TransactionModel;->year:I

    return-void
.end method
