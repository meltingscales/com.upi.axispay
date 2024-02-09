.class public abstract Ltp;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltp$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ltp$a;
    .locals 1

    .line 1
    new-instance v0, Lnp$b;

    invoke-direct {v0}, Lnp$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lrp;
.end method

.method public abstract c()Ljava/util/List;
    .annotation runtime Lcom/google/firebase/encoders/annotations/Encodable$Field;
        name = "logEvent"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsp;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Ljava/lang/Integer;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Lwp;
.end method

.method public abstract g()J
.end method

.method public abstract h()J
.end method
