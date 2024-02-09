.class public final enum Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/olive/upi/transport/model/PayerInitiatedMandate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Recurrences"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

.field public static final enum ASPRESENTED:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

.field public static final enum BIMONTHLY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

.field public static final enum DAILY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

.field public static final enum HALFYEARLY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

.field public static final enum MONTHLY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

.field public static final enum ONETIME:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

.field public static final enum QUARTERLY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

.field public static final enum WEEKLY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

.field public static final enum YEARLY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    const-string v1, "ONETIME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;->ONETIME:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    new-instance v1, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    const-string v3, "DAILY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;->DAILY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    new-instance v3, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    const-string v5, "WEEKLY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;->WEEKLY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    new-instance v5, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    const-string v7, "MONTHLY"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;->MONTHLY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    new-instance v7, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    const-string v9, "BIMONTHLY"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;->BIMONTHLY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    new-instance v9, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    const-string v11, "QUARTERLY"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;->QUARTERLY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    new-instance v11, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    const-string v13, "HALFYEARLY"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;->HALFYEARLY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    new-instance v13, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    const-string v15, "YEARLY"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;->YEARLY:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    new-instance v15, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    const-string v14, "ASPRESENTED"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;->ASPRESENTED:Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    const/16 v14, 0x9

    new-array v14, v14, [Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    aput-object v0, v14, v2

    aput-object v1, v14, v4

    aput-object v3, v14, v6

    aput-object v5, v14, v8

    aput-object v7, v14, v10

    const/4 v0, 0x5

    aput-object v9, v14, v0

    const/4 v0, 0x6

    aput-object v11, v14, v0

    const/4 v0, 0x7

    aput-object v13, v14, v0

    aput-object v15, v14, v12

    .line 2
    sput-object v14, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;->$VALUES:[Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

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

.method public static valueOf(Ljava/lang/String;)Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;
    .locals 1

    .line 1
    const-class v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    return-object p0
.end method

.method public static values()[Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;
    .locals 1

    .line 1
    sget-object v0, Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;->$VALUES:[Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    invoke-virtual {v0}, [Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/olive/upi/transport/model/PayerInitiatedMandate$Recurrences;

    return-object v0
.end method
