.class public final enum Lj80;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj80;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lj80;

.field public static final enum d:Lj80;

.field public static final synthetic e:[Lj80;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lj80;

    const-string v1, "NO_CACHE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lj80;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lj80;->c:Lj80;

    .line 2
    new-instance v1, Lj80;

    const-string v4, "NO_STORE"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lj80;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lj80;->d:Lj80;

    new-array v4, v5, [Lj80;

    aput-object v0, v4, v2

    aput-object v1, v4, v3

    .line 3
    sput-object v4, Lj80;->e:[Lj80;

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
    iput p3, p0, Lj80;->b:I

    return-void
.end method

.method public static a(I)Z
    .locals 1

    .line 1
    sget-object v0, Lj80;->c:Lj80;

    iget v0, v0, Lj80;->b:I

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static b(I)Z
    .locals 1

    .line 1
    sget-object v0, Lj80;->d:Lj80;

    iget v0, v0, Lj80;->b:I

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lj80;
    .locals 1

    .line 1
    const-class v0, Lj80;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj80;

    return-object p0
.end method

.method public static values()[Lj80;
    .locals 1

    .line 1
    sget-object v0, Lj80;->e:[Lj80;

    invoke-virtual {v0}, [Lj80;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj80;

    return-object v0
.end method
