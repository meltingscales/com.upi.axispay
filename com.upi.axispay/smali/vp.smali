.class public abstract Lvp;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvp$a;,
        Lvp$b;,
        Lvp$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lvp$a;
    .locals 1

    .line 1
    new-instance v0, Lpp$b;

    invoke-direct {v0}, Lpp$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lvp$b;
.end method

.method public abstract c()Lvp$c;
.end method
