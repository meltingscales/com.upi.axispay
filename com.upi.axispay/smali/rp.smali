.class public abstract Lrp;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrp$a;,
        Lrp$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lrp$a;
    .locals 1

    .line 1
    new-instance v0, Llp$b;

    invoke-direct {v0}, Llp$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lhp;
.end method

.method public abstract c()Lrp$b;
.end method
