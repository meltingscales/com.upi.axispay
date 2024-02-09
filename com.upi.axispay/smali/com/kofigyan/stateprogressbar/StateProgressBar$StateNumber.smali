.class public final enum Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kofigyan/stateprogressbar/StateProgressBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "StateNumber"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

.field public static final enum FIVE:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

.field public static final enum FOUR:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

.field public static final enum ONE:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

.field public static final enum THREE:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

.field public static final enum TWO:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;


# instance fields
.field private value:I


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    const-string v1, "ONE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->ONE:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    new-instance v1, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    const-string v4, "TWO"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->TWO:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    new-instance v4, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    const-string v6, "THREE"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7}, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->THREE:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    new-instance v6, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    const-string v8, "FOUR"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v7, v9}, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->FOUR:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    new-instance v8, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    const-string v10, "FIVE"

    const/4 v11, 0x5

    invoke-direct {v8, v10, v9, v11}, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->FIVE:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    new-array v10, v11, [Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    aput-object v0, v10, v2

    aput-object v1, v10, v3

    aput-object v4, v10, v5

    aput-object v6, v10, v7

    aput-object v8, v10, v9

    .line 2
    sput-object v10, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->$VALUES:[Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;
    .locals 1

    .line 1
    const-class v0, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    return-object p0
.end method

.method public static values()[Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;
    .locals 1

    .line 1
    sget-object v0, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->$VALUES:[Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    invoke-virtual {v0}, [Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->value:I

    return v0
.end method
