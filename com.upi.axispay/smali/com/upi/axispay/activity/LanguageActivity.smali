.class public Lcom/upi/axispay/activity/LanguageActivity;
.super Lc90;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public D:Landroid/widget/Button;

.field public E:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc90;-><init>()V

    return-void
.end method


# virtual methods
.method public final d0()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/upi/axispay/activity/TutorialActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v1, 0xda7

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final e0()V
    .locals 1

    const v0, 0x7f0a00e1

    .line 1
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/upi/axispay/activity/LanguageActivity;->D:Landroid/widget/Button;

    const v0, 0x7f0a00e3

    .line 2
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/upi/axispay/activity/LanguageActivity;->E:Landroid/widget/Button;

    return-void
.end method

.method public final f0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/activity/LanguageActivity;->D:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/activity/LanguageActivity;->E:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00e1

    const v1, 0xda8

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a00e3

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ld70;->e(Landroid/content/Context;)Ld70;

    move-result-object p1

    const v0, 0xda9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ld70;->i(Ljava/lang/String;)V

    .line 3
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-virtual {p1, v1, v0}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/upi/axispay/activity/LanguageActivity;->d0()V

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ld70;->e(Landroid/content/Context;)Ld70;

    move-result-object p1

    const v0, 0xdaa

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ld70;->i(Ljava/lang/String;)V

    .line 6
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-virtual {p1, v1, v0}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lcom/upi/axispay/activity/LanguageActivity;->d0()V

    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc90;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-static {p0}, Lxg0;->b(Landroid/content/Context;)Landroid/content/Context;

    const p1, 0x7f0d0025

    .line 3
    invoke-virtual {p0, p1}, Lz;->setContentView(I)V

    .line 4
    invoke-virtual {p0}, Lcom/upi/axispay/activity/LanguageActivity;->e0()V

    .line 5
    invoke-virtual {p0}, Lcom/upi/axispay/activity/LanguageActivity;->f0()V

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    return-void
.end method
