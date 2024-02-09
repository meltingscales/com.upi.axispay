.class public Ltf0$a;
.super Landroid/os/CountDownTimer;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltf0;->G()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ltf0;


# direct methods
.method public constructor <init>(Ltf0;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltf0$a;->a:Ltf0;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 3

    .line 1
    iget-object v0, p0, Ltf0$a;->a:Ltf0;

    iget-boolean v1, v0, Ltf0;->q:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 2
    iput-boolean v1, v0, Ltf0;->q:Z

    .line 3
    iget-object v0, v0, Lxc0;->c:Lz;

    new-instance v1, Ltf0$a$a;

    invoke-direct {v1, p0}, Ltf0$a$a;-><init>(Ltf0$a;)V

    const v2, 0x3c4d

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public onTick(J)V
    .locals 0

    return-void
.end method
