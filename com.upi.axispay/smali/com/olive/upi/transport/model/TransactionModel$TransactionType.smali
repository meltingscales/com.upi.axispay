.class public final enum Lcom/olive/upi/transport/model/TransactionModel$TransactionType;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/olive/upi/transport/model/TransactionModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TransactionType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/olive/upi/transport/model/TransactionModel$TransactionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

.field public static final enum Payed:Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

.field public static final enum Received:Lcom/olive/upi/transport/model/TransactionModel$TransactionType;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    const-string v1, "Received"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/olive/upi/transport/model/TransactionModel$TransactionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/olive/upi/transport/model/TransactionModel$TransactionType;->Received:Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    .line 2
    new-instance v1, Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    const-string v3, "Payed"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/olive/upi/transport/model/TransactionModel$TransactionType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/olive/upi/transport/model/TransactionModel$TransactionType;->Payed:Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/olive/upi/transport/model/TransactionModel$TransactionType;->$VALUES:[Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/olive/upi/transport/model/TransactionModel$TransactionType;
    .locals 1

    .line 1
    const-class v0, Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    return-object p0
.end method

.method public static values()[Lcom/olive/upi/transport/model/TransactionModel$TransactionType;
    .locals 1

    .line 1
    sget-object v0, Lcom/olive/upi/transport/model/TransactionModel$TransactionType;->$VALUES:[Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    invoke-virtual {v0}, [Lcom/olive/upi/transport/model/TransactionModel$TransactionType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/olive/upi/transport/model/TransactionModel$TransactionType;

    return-object v0
.end method
