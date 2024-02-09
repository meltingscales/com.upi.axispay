.class public Lcom/upi/axispay/activity/CloseActivity$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/activity/CloseActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/upi/axispay/activity/CloseActivity;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/activity/CloseActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/activity/CloseActivity$a;->b:Lcom/upi/axispay/activity/CloseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/high16 v0, 0x4000000

    const/16 v1, 0x16

    const v2, 0x2a80

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    if-ne p1, v3, :cond_1

    .line 2
    new-instance p1, Landroid/content/Intent;

    iget-object v3, p0, Lcom/upi/axispay/activity/CloseActivity$a;->b:Lcom/upi/axispay/activity/CloseActivity;

    const-class v4, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {p1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3
    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x2a81

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->e(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 4
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 5
    :cond_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 6
    iget-object v0, p0, Lcom/upi/axispay/activity/CloseActivity$a;->b:Lcom/upi/axispay/activity/CloseActivity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 7
    iget-object p1, p0, Lcom/upi/axispay/activity/CloseActivity$a;->b:Lcom/upi/axispay/activity/CloseActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 8
    :cond_1
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v3, 0x2a82

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ln70;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, Lqa0;->d0(Lqa0;)V

    .line 10
    new-instance p1, Landroid/content/Intent;

    iget-object v3, p0, Lcom/upi/axispay/activity/CloseActivity$a;->b:Lcom/upi/axispay/activity/CloseActivity;

    const-class v4, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {p1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 11
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 12
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 13
    iget-object v0, p0, Lcom/upi/axispay/activity/CloseActivity$a;->b:Lcom/upi/axispay/activity/CloseActivity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 14
    iget-object p1, p0, Lcom/upi/axispay/activity/CloseActivity$a;->b:Lcom/upi/axispay/activity/CloseActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method
