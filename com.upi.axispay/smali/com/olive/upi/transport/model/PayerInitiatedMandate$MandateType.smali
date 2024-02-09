.class public final enum Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/olive/upi/transport/model/PayerInitiatedMandate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MandateType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

.field public static final enum CREATE:Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

.field public static final enum REVOKE:Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

.field public static final enum UPDATE:Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

    const-string v1, "CREATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;->CREATE:Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

    new-instance v1, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

    const-string v3, "UPDATE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;->UPDATE:Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

    new-instance v3, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

    const-string v5, "REVOKE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;->REVOKE:Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 2
    sput-object v5, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;->$VALUES:[Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;
    .locals 1

    .line 1
    const-class v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

    return-object p0
.end method

.method public static values()[Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;
    .locals 1

    .line 1
    sget-object v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;->$VALUES:[Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

    invoke-virtual {v0}, [Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/olive/upi/transport/model/PayerInitiatedMandate$MandateType;

    return-object v0
.end method
