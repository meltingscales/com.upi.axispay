.class public final Las;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhr<",
        "Lws;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lzu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwh0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Lzu;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Las;->a:Lwh0;

    return-void
.end method

.method public static a(Lzu;)Lws;
    .locals 1

    .line 1
    invoke-static {p0}, Lzr;->a(Lzu;)Lws;

    move-result-object p0

    const v0, 0x4fd

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ljr;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Lws;

    return-object p0
.end method

.method public static b(Lwh0;)Las;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Lzu;",
            ">;)",
            "Las;"
        }
    .end annotation

    .line 1
    new-instance v0, Las;

    invoke-direct {v0, p0}, Las;-><init>(Lwh0;)V

    return-object v0
.end method


# virtual methods
.method public c()Lws;
    .locals 1

    .line 1
    iget-object v0, p0, Las;->a:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzu;

    invoke-static {v0}, Las;->a(Lzu;)Lws;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Las;->c()Lws;

    move-result-object v0

    return-object v0
.end method
