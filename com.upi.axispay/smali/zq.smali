.class public abstract Lzq;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lzu;Lzu;Ljava/lang/String;)Lzq;
    .locals 1

    .line 1
    new-instance v0, Luq;

    invoke-direct {v0, p0, p1, p2, p3}, Luq;-><init>(Landroid/content/Context;Lzu;Lzu;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Landroid/content/Context;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Lzu;
.end method

.method public abstract e()Lzu;
.end method
