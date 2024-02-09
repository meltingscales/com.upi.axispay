.class public final Lbv;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbv$a;
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

.method public static a()Lbv;
    .locals 1

    .line 1
    invoke-static {}, Lbv$a;->a()Lbv;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lzu;
    .locals 2

    .line 1
    invoke-static {}, Lav;->a()Lzu;

    move-result-object v0

    const v1, 0xa58

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljr;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lzu;

    return-object v0
.end method


# virtual methods
.method public c()Lzu;
    .locals 1

    .line 1
    invoke-static {}, Lbv;->b()Lzu;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbv;->c()Lzu;

    move-result-object v0

    return-object v0
.end method
