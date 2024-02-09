.class public Ln6$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Ln6;Lr5;Lz4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 3
    iget-object p1, p2, Lr5;->L:Lq5;

    invoke-virtual {p3, p1}, Lz4;->x(Ljava/lang/Object;)I

    .line 4
    iget-object p1, p2, Lr5;->M:Lq5;

    invoke-virtual {p3, p1}, Lz4;->x(Ljava/lang/Object;)I

    .line 5
    iget-object p1, p2, Lr5;->N:Lq5;

    invoke-virtual {p3, p1}, Lz4;->x(Ljava/lang/Object;)I

    .line 6
    iget-object p1, p2, Lr5;->O:Lq5;

    invoke-virtual {p3, p1}, Lz4;->x(Ljava/lang/Object;)I

    .line 7
    iget-object p1, p2, Lr5;->P:Lq5;

    invoke-virtual {p3, p1}, Lz4;->x(Ljava/lang/Object;)I

    return-void
.end method
