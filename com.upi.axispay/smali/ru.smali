.class public final Lru;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lru$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhr<",
        "Lmu;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lru;
    .locals 1

    .line 1
    invoke-static {}, Lru$a;->a()Lru;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lmu;
    .locals 2

    .line 1
    invoke-static {}, Lnu;->d()Lmu;

    move-result-object v0

    const v1, 0x55a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljr;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lmu;

    return-object v0
.end method


# virtual methods
.method public b()Lmu;
    .locals 1

    .line 1
    invoke-static {}, Lru;->c()Lmu;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lru;->b()Lmu;

    move-result-object v0

    return-object v0
.end method
