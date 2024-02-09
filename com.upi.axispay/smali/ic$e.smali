.class public Lic$e;
.super Lic$d;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lic$d;-><init>()V

    return-void
.end method

.method public constructor <init>(Lic;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lic$d;-><init>(Lic;)V

    return-void
.end method
