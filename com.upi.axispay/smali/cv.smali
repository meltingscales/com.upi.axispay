.class public final Lcv;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcv$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhr<",
        "Lzu;",
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

.method public static a()Lcv;
    .locals 1

    .line 1
    invoke-static {}, Lcv$a;->a()Lcv;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lzu;
    .locals 2

    .line 1
    invoke-static {}, Lav;->b()Lzu;

    move-result-object v0

    const v1, 0xdf3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljr;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lzu;

    return-object v0
.end method


# virtual methods
.method public b()Lzu;
    .locals 1

    .line 1
    invoke-static {}, Lcv;->c()Lzu;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcv;->b()Lzu;

    move-result-object v0

    return-object v0
.end method
