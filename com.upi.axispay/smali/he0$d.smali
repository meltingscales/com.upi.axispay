.class public Lhe0$d;
.super Landroid/content/BroadcastReceiver;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhe0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhe0;


# direct methods
.method public constructor <init>(Lhe0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhe0$d;->a:Lhe0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->getResultCode()I

    move-result p1

    const/4 p2, -0x1

    const/4 v0, 0x0

    if-eq p1, p2, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lhe0$d;->a:Lhe0;

    const/4 p2, 0x4

    invoke-static {p1, p2}, Lhe0;->y(Lhe0;I)I

    .line 3
    iget-object p1, p0, Lhe0$d;->a:Lhe0;

    invoke-static {p1}, Lhe0;->G(Lhe0;)Landroid/os/CountDownTimer;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 4
    iget-object p1, p0, Lhe0$d;->a:Lhe0;

    invoke-static {p1}, Lhe0;->G(Lhe0;)Landroid/os/CountDownTimer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->cancel()V

    .line 5
    iget-object p1, p0, Lhe0$d;->a:Lhe0;

    invoke-static {p1}, Lhe0;->G(Lhe0;)Landroid/os/CountDownTimer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->onFinish()V

    .line 6
    iget-object p1, p0, Lhe0$d;->a:Lhe0;

    invoke-static {p1, v0}, Lhe0;->H(Lhe0;Landroid/os/CountDownTimer;)Landroid/os/CountDownTimer;

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lhe0$d;->a:Lhe0;

    const/4 p2, 0x3

    invoke-static {p1, p2}, Lhe0;->y(Lhe0;I)I

    .line 8
    iget-object p1, p0, Lhe0$d;->a:Lhe0;

    invoke-static {p1}, Lhe0;->G(Lhe0;)Landroid/os/CountDownTimer;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 9
    iget-object p1, p0, Lhe0$d;->a:Lhe0;

    invoke-static {p1}, Lhe0;->G(Lhe0;)Landroid/os/CountDownTimer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->cancel()V

    .line 10
    iget-object p1, p0, Lhe0$d;->a:Lhe0;

    invoke-static {p1}, Lhe0;->G(Lhe0;)Landroid/os/CountDownTimer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->onFinish()V

    .line 11
    iget-object p1, p0, Lhe0$d;->a:Lhe0;

    invoke-static {p1, v0}, Lhe0;->H(Lhe0;Landroid/os/CountDownTimer;)Landroid/os/CountDownTimer;

    :cond_2
    :goto_0
    return-void
.end method
