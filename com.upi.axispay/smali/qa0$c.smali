.class public final enum Lqa0$c;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqa0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqa0$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lqa0$c;

.field public static final enum c:Lqa0$c;

.field public static final enum d:Lqa0$c;

.field public static final enum e:Lqa0$c;

.field public static final synthetic f:[Lqa0$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lqa0$c;

    const-string v1, "ALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqa0$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqa0$c;->b:Lqa0$c;

    .line 2
    new-instance v1, Lqa0$c;

    const-string v3, "ACTIVE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lqa0$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lqa0$c;->c:Lqa0$c;

    .line 3
    new-instance v3, Lqa0$c;

    const-string v5, "WITH_VPA"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lqa0$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lqa0$c;->d:Lqa0$c;

    .line 4
    new-instance v5, Lqa0$c;

    const-string v7, "ACTIVE_VPA"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lqa0$c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lqa0$c;->e:Lqa0$c;

    const/4 v7, 0x4

    new-array v7, v7, [Lqa0$c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lqa0$c;->f:[Lqa0$c;

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

.method public static valueOf(Ljava/lang/String;)Lqa0$c;
    .locals 1

    .line 1
    const-class v0, Lqa0$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa0$c;

    return-object p0
.end method

.method public static values()[Lqa0$c;
    .locals 1

    .line 1
    sget-object v0, Lqa0$c;->f:[Lqa0$c;

    invoke-virtual {v0}, [Lqa0$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa0$c;

    return-object v0
.end method
