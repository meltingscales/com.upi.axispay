.class public final enum Le40;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le40;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le40;

.field public static final enum c:Le40;

.field public static final enum d:Le40;

.field public static final synthetic e:[Le40;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Le40;

    const-string v1, "FORCE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le40;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le40;->b:Le40;

    .line 2
    new-instance v1, Le40;

    const-string v3, "FORCE_SQUARE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Le40;-><init>(Ljava/lang/String;I)V

    sput-object v1, Le40;->c:Le40;

    .line 3
    new-instance v3, Le40;

    const-string v5, "FORCE_RECTANGLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Le40;-><init>(Ljava/lang/String;I)V

    sput-object v3, Le40;->d:Le40;

    const/4 v5, 0x3

    new-array v5, v5, [Le40;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Le40;->e:[Le40;

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

.method public static valueOf(Ljava/lang/String;)Le40;
    .locals 1

    .line 1
    const-class v0, Le40;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le40;

    return-object p0
.end method

.method public static values()[Le40;
    .locals 1

    .line 1
    sget-object v0, Le40;->e:[Le40;

    invoke-virtual {v0}, [Le40;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le40;

    return-object v0
.end method
