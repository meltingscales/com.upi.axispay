.class public Lhe0$b;
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
    iput-object p1, p0, Lhe0$b;->a:Lhe0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->getResultCode()I

    move-result p1

    const/4 p2, -0x1

    const/4 v0, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-eq p1, v0, :cond_0

    if-eq p1, p2, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 3
    iget-object p1, p0, Lhe0$b;->a:Lhe0;

    invoke-static {p1, p2}, Lhe0;->y(Lhe0;I)I

    .line 4
    iget-object p1, p0, Lhe0$b;->a:Lhe0;

    invoke-static {p1}, Lhe0;->G(Lhe0;)Landroid/os/CountDownTimer;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 5
    iget-object p1, p0, Lhe0$b;->a:Lhe0;

    invoke-static {p1}, Lhe0;->G(Lhe0;)Landroid/os/CountDownTimer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->cancel()V

    .line 6
    iget-object p1, p0, Lhe0$b;->a:Lhe0;

    invoke-static {p1}, Lhe0;->G(Lhe0;)Landroid/os/CountDownTimer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->onFinish()V

    .line 7
    iget-object p1, p0, Lhe0$b;->a:Lhe0;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lhe0;->H(Lhe0;Landroid/os/CountDownTimer;)Landroid/os/CountDownTimer;

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lhe0$b;->a:Lhe0;

    invoke-static {p1, v0}, Lhe0;->y(Lhe0;I)I

    .line 9
    iget-object p1, p0, Lhe0$b;->a:Lhe0;

    invoke-static {p1}, Lhe0;->z(Lhe0;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lhe0$b;->a:Lhe0;

    invoke-static {v1}, Lhe0;->D(Lhe0;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x2a67

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhe0$b;->a:Lhe0;

    invoke-static {v1}, Lhe0;->E(Lhe0;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lhe0;->F(Lhe0;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    iput-boolean p2, p1, Lhe0;->C:Z

    :cond_2
    :goto_0
    return-void
.end method
