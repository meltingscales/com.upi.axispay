.class public Lwg;
.super Lrd;
.source "AxisPay"


# instance fields
.field public b:Z

.field public c:Landroid/app/Dialog;

.field public d:Lxh;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lrd;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lwg;->b:Z

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lrd;->setCancelable(Z)V

    return-void
.end method


# virtual methods
.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lwg;->d:Lxh;

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const v1, 0x16b5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lxh;->d(Landroid/os/Bundle;)Lxh;

    move-result-object v0

    iput-object v0, p0, Lwg;->d:Lxh;

    .line 4
    :cond_0
    iget-object v0, p0, Lwg;->d:Lxh;

    if-nez v0, :cond_1

    .line 5
    sget-object v0, Lxh;->c:Lxh;

    iput-object v0, p0, Lwg;->d:Lxh;

    :cond_1
    return-void
.end method

.method public k()Lxh;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwg;->j()V

    .line 2
    iget-object v0, p0, Lwg;->d:Lxh;

    return-object v0
.end method

.method public l(Landroid/content/Context;Landroid/os/Bundle;)Lvg;
    .locals 0

    .line 1
    new-instance p2, Lvg;

    invoke-direct {p2, p1}, Lvg;-><init>(Landroid/content/Context;)V

    return-object p2
.end method

.method public m(Landroid/content/Context;)Lbh;
    .locals 1

    .line 1
    new-instance v0, Lbh;

    invoke-direct {v0, p1}, Lbh;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public n(Lxh;)V
    .locals 3

    if-eqz p1, :cond_3

    .line 1
    invoke-virtual {p0}, Lwg;->j()V

    .line 2
    iget-object v0, p0, Lwg;->d:Lxh;

    invoke-virtual {v0, p1}, Lxh;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    iput-object p1, p0, Lwg;->d:Lxh;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 6
    :cond_0
    invoke-virtual {p1}, Lxh;->a()Landroid/os/Bundle;

    move-result-object v1

    const v2, 0x16b6

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 7
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 8
    iget-object v0, p0, Lwg;->c:Landroid/app/Dialog;

    if-eqz v0, :cond_2

    .line 9
    iget-boolean v1, p0, Lwg;->b:Z

    if-eqz v1, :cond_1

    .line 10
    check-cast v0, Lbh;

    invoke-virtual {v0, p1}, Lbh;->h(Lxh;)V

    goto :goto_0

    .line 11
    :cond_1
    check-cast v0, Lvg;

    invoke-virtual {v0, p1}, Lvg;->h(Lxh;)V

    :cond_2
    :goto_0
    return-void

    .line 12
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x16b7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public o(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lwg;->c:Landroid/app/Dialog;

    if-nez v0, :cond_0

    .line 2
    iput-boolean p1, p0, Lwg;->b:Z

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const v0, 0x16b8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    iget-object p1, p0, Lwg;->c:Landroid/app/Dialog;

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-boolean v0, p0, Lwg;->b:Z

    if-eqz v0, :cond_1

    .line 4
    check-cast p1, Lbh;

    invoke-virtual {p1}, Lbh;->j()V

    goto :goto_0

    .line 5
    :cond_1
    check-cast p1, Lvg;

    invoke-virtual {p1}, Lvg;->j()V

    :goto_0
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwg;->b:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lwg;->m(Landroid/content/Context;)Lbh;

    move-result-object p1

    iput-object p1, p0, Lwg;->c:Landroid/app/Dialog;

    .line 3
    check-cast p1, Lbh;

    invoke-virtual {p0}, Lwg;->k()Lxh;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbh;->h(Lxh;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lwg;->l(Landroid/content/Context;Landroid/os/Bundle;)Lvg;

    move-result-object p1

    iput-object p1, p0, Lwg;->c:Landroid/app/Dialog;

    .line 5
    check-cast p1, Lvg;

    invoke-virtual {p0}, Lwg;->k()Lxh;

    move-result-object v0

    invoke-virtual {p1, v0}, Lvg;->h(Lxh;)V

    .line 6
    :goto_0
    iget-object p1, p0, Lwg;->c:Landroid/app/Dialog;

    return-object p1
.end method
