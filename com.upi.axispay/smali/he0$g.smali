.class public Lhe0$g;
.super Landroid/os/CountDownTimer;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhe0;->Y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhe0;


# direct methods
.method public constructor <init>(Lhe0;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhe0$g;->a:Lhe0;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 5

    .line 1
    iget-object v0, p0, Lhe0$g;->a:Lhe0;

    invoke-static {v0}, Lhe0;->x(Lhe0;)I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lhe0$g;->a:Lhe0;

    const v1, 0x7f1203c9

    invoke-static {v0, v1}, Lhe0;->I(Lhe0;I)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lhe0$g;->a:Lhe0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lc70;->m(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhe0$g;->a:Lhe0;

    iget-boolean v1, v0, Lhe0;->C:Z

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v0}, Lxc0;->k()Lz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Leg0;->C(Landroid/app/Activity;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lhe0$g;->a:Lhe0;

    invoke-virtual {v0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x16

    const/16 v3, 0x19

    iget-object v4, p0, Lhe0$g;->a:Lhe0;

    invoke-static {v4}, Lhe0;->E(Lhe0;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lhe0$g;->a:Lhe0;

    const v1, 0x7f120175

    invoke-static {v0, v1}, Lhe0;->I(Lhe0;I)V

    .line 7
    :goto_0
    iget-object v0, p0, Lhe0$g;->a:Lhe0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lhe0;->M(Lhe0;Z)Z

    return-void
.end method

.method public onTick(J)V
    .locals 0

    .line 1
    iget-object p1, p0, Lhe0$g;->a:Lhe0;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lhe0;->M(Lhe0;Z)Z

    return-void
.end method
