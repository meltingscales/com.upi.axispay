.class public final enum Lk80;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk80;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lk80;

.field public static final enum d:Lk80;

.field public static final enum e:Lk80;

.field public static final synthetic f:[Lk80;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lk80;

    const-string v1, "NO_CACHE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lk80;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk80;->c:Lk80;

    .line 2
    new-instance v1, Lk80;

    const-string v4, "NO_STORE"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lk80;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lk80;->d:Lk80;

    .line 3
    new-instance v4, Lk80;

    const-string v6, "OFFLINE"

    const/4 v7, 0x4

    invoke-direct {v4, v6, v5, v7}, Lk80;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lk80;->e:Lk80;

    const/4 v6, 0x3

    new-array v6, v6, [Lk80;

    aput-object v0, v6, v2

    aput-object v1, v6, v3

    aput-object v4, v6, v5

    .line 4
    sput-object v6, Lk80;->f:[Lk80;

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
    iput p3, p0, Lk80;->b:I

    return-void
.end method

.method public static a(I)Z
    .locals 1

    .line 1
    sget-object v0, Lk80;->e:Lk80;

    iget v0, v0, Lk80;->b:I

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

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
    sget-object v0, Lk80;->c:Lk80;

    iget v0, v0, Lk80;->b:I

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static c(I)Z
    .locals 1

    .line 1
    sget-object v0, Lk80;->d:Lk80;

    iget v0, v0, Lk80;->b:I

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lk80;
    .locals 1

    .line 1
    const-class v0, Lk80;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk80;

    return-object p0
.end method

.method public static values()[Lk80;
    .locals 1

    .line 1
    sget-object v0, Lk80;->f:[Lk80;

    invoke-virtual {v0}, [Lk80;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk80;

    return-object v0
.end method
