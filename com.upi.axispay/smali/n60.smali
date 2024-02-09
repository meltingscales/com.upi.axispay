.class public final enum Ln60;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln60;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ln60;

.field public static final enum c:Ln60;

.field public static final synthetic d:[Ln60;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ln60;

    const-string v1, "FIFO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln60;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln60;->b:Ln60;

    new-instance v1, Ln60;

    const-string v3, "LIFO"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ln60;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ln60;->c:Ln60;

    const/4 v3, 0x2

    new-array v3, v3, [Ln60;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 2
    sput-object v3, Ln60;->d:[Ln60;

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

.method public static valueOf(Ljava/lang/String;)Ln60;
    .locals 1

    .line 1
    const-class v0, Ln60;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln60;

    return-object p0
.end method

.method public static values()[Ln60;
    .locals 1

    .line 1
    sget-object v0, Ln60;->d:[Ln60;

    invoke-virtual {v0}, [Ln60;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln60;

    return-object v0
.end method
