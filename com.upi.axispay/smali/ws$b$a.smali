.class public abstract Lws$b$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lws$b;
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
.method public abstract a()Lws$b;
.end method

.method public abstract b(J)Lws$b$a;
.end method

.method public abstract c(Ljava/util/Set;)Lws$b$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lws$c;",
            ">;)",
            "Lws$b$a;"
        }
    .end annotation
.end method

.method public abstract d(J)Lws$b$a;
.end method
