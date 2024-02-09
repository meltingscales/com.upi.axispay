.class public Lz4$b;
.super Lx4;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Lz4;Ly4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx4;-><init>()V

    .line 2
    new-instance p1, Lf5;

    invoke-direct {p1, p0, p2}, Lf5;-><init>(Lx4;Ly4;)V

    iput-object p1, p0, Lx4;->e:Lx4$a;

    return-void
.end method
