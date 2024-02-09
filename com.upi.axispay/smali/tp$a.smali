.class public abstract Ltp$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ltp;
.end method

.method public abstract b(Lrp;)Ltp$a;
.end method

.method public abstract c(Ljava/util/List;)Ltp$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lsp;",
            ">;)",
            "Ltp$a;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/Integer;)Ltp$a;
.end method

.method public abstract e(Ljava/lang/String;)Ltp$a;
.end method

.method public abstract f(Lwp;)Ltp$a;
.end method

.method public abstract g(J)Ltp$a;
.end method

.method public abstract h(J)Ltp$a;
.end method

.method public i(I)Ltp$a;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Ltp$a;->d(Ljava/lang/Integer;)Ltp$a;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Ltp$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ltp$a;->e(Ljava/lang/String;)Ltp$a;

    return-object p0
.end method
