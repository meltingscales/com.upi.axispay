.class public final enum Lrk;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrk;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lrk;

.field public static final enum c:Lrk;

.field public static final synthetic d:[Lrk;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lrk;

    const-string v1, "ASC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrk;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrk;->b:Lrk;

    .line 2
    new-instance v1, Lrk;

    const-string v3, "DESC"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lrk;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lrk;->c:Lrk;

    const/4 v3, 0x2

    new-array v3, v3, [Lrk;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lrk;->d:[Lrk;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
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

.method public static valueOf(Ljava/lang/String;)Lrk;
    .locals 1

    .line 1
    const-class v0, Lrk;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrk;

    return-object p0
.end method

.method public static values()[Lrk;
    .locals 1

    .line 1
    sget-object v0, Lrk;->d:[Lrk;

    invoke-virtual {v0}, [Lrk;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrk;

    return-object v0
.end method
