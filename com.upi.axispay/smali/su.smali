.class public abstract Lsu;
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

.method public static a(JLlq;Lfq;)Lsu;
    .locals 1

    .line 1
    new-instance v0, Lju;

    invoke-direct {v0, p0, p1, p2, p3}, Lju;-><init>(JLlq;Lfq;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lfq;
.end method

.method public abstract c()J
.end method

.method public abstract d()Llq;
.end method
