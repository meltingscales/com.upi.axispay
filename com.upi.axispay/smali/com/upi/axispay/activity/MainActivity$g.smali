.class public Lcom/upi/axispay/activity/MainActivity$g;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/activity/MainActivity;->L0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/upi/axispay/activity/MainActivity;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/activity/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/activity/MainActivity$g;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$g;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    invoke-virtual {p1}, Lua0;->x()V

    .line 2
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x34a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ln70;->A(Ljava/lang/String;Z)V

    .line 3
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x34b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->j(Ljava/lang/String;)I

    move-result v0

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v3

    invoke-virtual {v3}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-lt v0, v5, :cond_0

    if-eqz v3, :cond_0

    .line 5
    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    sget v5, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne v0, v5, :cond_0

    .line 6
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 7
    invoke-static {v3}, Ljg0;->r(Lcom/olive/upi/transport/model/TransactionData;)Ljava/lang/String;

    move-result-object v3

    const v5, 0x34c

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    iget-object v3, p0, Lcom/upi/axispay/activity/MainActivity$g;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-virtual {v3, v2, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 9
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->c()V

    .line 11
    invoke-static {v4}, Lqa0;->d0(Lqa0;)V

    .line 12
    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v0, 0x34d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln70;->j(Ljava/lang/String;)I

    move-result p1

    .line 13
    sget v0, Lvg0;->e:I

    if-eq p1, v0, :cond_1

    .line 14
    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity$g;->b:Lcom/upi/axispay/activity/MainActivity;

    const-class v1, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x4000000

    .line 15
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 16
    iget-object v0, p0, Lcom/upi/axispay/activity/MainActivity$g;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 17
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$g;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    invoke-virtual {p1, v4}, Lua0;->v(Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$g;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
