.class public final enum Lcom/appsflyer/internal/c$b;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/c$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ı:[Lcom/appsflyer/internal/c$b;

.field public static final enum ǃ:Lcom/appsflyer/internal/c$b;

.field public static final enum ɩ:Lcom/appsflyer/internal/c$b;


# instance fields
.field public ι:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/appsflyer/internal/c$b;

    const-string v1, "HOOKING"

    const/4 v2, 0x0

    const-string v3, "hk"

    invoke-direct {v0, v1, v2, v3}, Lcom/appsflyer/internal/c$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/c$b;->ǃ:Lcom/appsflyer/internal/c$b;

    new-instance v1, Lcom/appsflyer/internal/c$b;

    const-string v3, "DEBUGGABLE"

    const/4 v4, 0x1

    const-string v5, "dbg"

    invoke-direct {v1, v3, v4, v5}, Lcom/appsflyer/internal/c$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/appsflyer/internal/c$b;->ɩ:Lcom/appsflyer/internal/c$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/appsflyer/internal/c$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 2
    sput-object v3, Lcom/appsflyer/internal/c$b;->ı:[Lcom/appsflyer/internal/c$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/appsflyer/internal/c$b;->ι:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/c$b;
    .locals 1

    .line 1
    const-class v0, Lcom/appsflyer/internal/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/c$b;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/c$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/internal/c$b;->ı:[Lcom/appsflyer/internal/c$b;

    invoke-virtual {v0}, [Lcom/appsflyer/internal/c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/internal/c$b;

    return-object v0
.end method
