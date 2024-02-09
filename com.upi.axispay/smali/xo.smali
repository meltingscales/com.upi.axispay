.class public final enum Lxo;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxo;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lxo;

.field public static final enum c:Lxo;

.field public static final enum d:Lxo;

.field public static final synthetic e:[Lxo;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lxo;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxo;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxo;->b:Lxo;

    .line 2
    new-instance v1, Lxo;

    const-string v3, "VERY_LOW"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lxo;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lxo;->c:Lxo;

    .line 3
    new-instance v3, Lxo;

    const-string v5, "HIGHEST"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lxo;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lxo;->d:Lxo;

    const/4 v5, 0x3

    new-array v5, v5, [Lxo;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lxo;->e:[Lxo;

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

.method public static valueOf(Ljava/lang/String;)Lxo;
    .locals 1

    .line 1
    const-class v0, Lxo;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxo;

    return-object p0
.end method

.method public static values()[Lxo;
    .locals 1

    .line 1
    sget-object v0, Lxo;->e:[Lxo;

    invoke-virtual {v0}, [Lxo;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxo;

    return-object v0
.end method
