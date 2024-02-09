.class public final enum Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/olive/upi/transport/model/PayerInitiatedMandate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Revocable"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;

.field public static final enum N:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;

.field public static final enum Y:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;

    const-string v1, "Y"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;->Y:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;

    new-instance v1, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;

    const-string v3, "N"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;->N:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 2
    sput-object v3, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;->$VALUES:[Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;

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

.method public static valueOf(Ljava/lang/String;)Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;
    .locals 1

    .line 1
    const-class v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;

    return-object p0
.end method

.method public static values()[Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;
    .locals 1

    .line 1
    sget-object v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;->$VALUES:[Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;

    invoke-virtual {v0}, [Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/olive/upi/transport/model/PayerInitiatedMandate$Revocable;

    return-object v0
.end method
