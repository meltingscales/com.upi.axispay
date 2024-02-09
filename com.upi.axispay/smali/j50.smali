.class public final enum Lj50;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj50;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lj50;

.field public static final enum d:Lj50;

.field public static final enum e:Lj50;

.field public static final enum f:Lj50;

.field public static final synthetic g:[Lj50;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lj50;

    const-string v1, "L"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lj50;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lj50;->c:Lj50;

    .line 2
    new-instance v1, Lj50;

    const-string v4, "M"

    invoke-direct {v1, v4, v3, v2}, Lj50;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lj50;->d:Lj50;

    .line 3
    new-instance v4, Lj50;

    const-string v5, "Q"

    const/4 v6, 0x2

    const/4 v7, 0x3

    invoke-direct {v4, v5, v6, v7}, Lj50;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lj50;->e:Lj50;

    .line 4
    new-instance v5, Lj50;

    const-string v8, "H"

    invoke-direct {v5, v8, v7, v6}, Lj50;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lj50;->f:Lj50;

    const/4 v8, 0x4

    new-array v8, v8, [Lj50;

    aput-object v0, v8, v2

    aput-object v1, v8, v3

    aput-object v4, v8, v6

    aput-object v5, v8, v7

    .line 5
    sput-object v8, Lj50;->g:[Lj50;

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
    iput p3, p0, Lj50;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj50;
    .locals 1

    .line 1
    const-class v0, Lj50;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj50;

    return-object p0
.end method

.method public static values()[Lj50;
    .locals 1

    .line 1
    sget-object v0, Lj50;->g:[Lj50;

    invoke-virtual {v0}, [Lj50;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj50;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lj50;->b:I

    return v0
.end method
