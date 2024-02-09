.class public final enum Lmr$b;
.super Ljava/lang/Enum;
.source "AxisPay"

# interfaces
.implements Lcom/google/firebase/encoders/proto/ProtoEnum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmr$b;",
        ">;",
        "Lcom/google/firebase/encoders/proto/ProtoEnum;"
    }
.end annotation


# static fields
.field public static final enum c:Lmr$b;

.field public static final enum d:Lmr$b;

.field public static final enum e:Lmr$b;

.field public static final enum f:Lmr$b;

.field public static final enum g:Lmr$b;

.field public static final enum h:Lmr$b;

.field public static final enum i:Lmr$b;

.field public static final synthetic j:[Lmr$b;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lmr$b;

    const-string v1, "REASON_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lmr$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lmr$b;->c:Lmr$b;

    .line 2
    new-instance v1, Lmr$b;

    const-string v3, "MESSAGE_TOO_OLD"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lmr$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lmr$b;->d:Lmr$b;

    .line 3
    new-instance v3, Lmr$b;

    const-string v5, "CACHE_FULL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lmr$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lmr$b;->e:Lmr$b;

    .line 4
    new-instance v5, Lmr$b;

    const-string v7, "PAYLOAD_TOO_BIG"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lmr$b;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lmr$b;->f:Lmr$b;

    .line 5
    new-instance v7, Lmr$b;

    const-string v9, "MAX_RETRIES_REACHED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lmr$b;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lmr$b;->g:Lmr$b;

    .line 6
    new-instance v9, Lmr$b;

    const-string v11, "INVALID_PAYLOD"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lmr$b;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lmr$b;->h:Lmr$b;

    .line 7
    new-instance v11, Lmr$b;

    const-string v13, "SERVER_ERROR"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, Lmr$b;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lmr$b;->i:Lmr$b;

    const/4 v13, 0x7

    new-array v13, v13, [Lmr$b;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    .line 8
    sput-object v13, Lmr$b;->j:[Lmr$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lmr$b;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lmr$b;
    .locals 1

    .line 1
    const-class v0, Lmr$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmr$b;

    return-object p0
.end method

.method public static values()[Lmr$b;
    .locals 1

    .line 1
    sget-object v0, Lmr$b;->j:[Lmr$b;

    invoke-virtual {v0}, [Lmr$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmr$b;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    .line 1
    iget v0, p0, Lmr$b;->b:I

    return v0
.end method
