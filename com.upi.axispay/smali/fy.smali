.class public Lfy;
.super Lt1;
.source "AxisPay"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldy;Lk1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lt1;-><init>(Landroid/content/Context;Li1;Lk1;)V

    return-void
.end method


# virtual methods
.method public M(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Li1;->M(Z)V

    .line 2
    invoke-virtual {p0}, Lt1;->i0()Landroid/view/Menu;

    move-result-object v0

    check-cast v0, Li1;

    invoke-virtual {v0, p1}, Li1;->M(Z)V

    return-void
.end method
