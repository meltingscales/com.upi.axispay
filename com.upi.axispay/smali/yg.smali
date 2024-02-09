.class public Lyg;
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
    iput-boolean v0, p0, Lyg;->b:Z

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lrd;->setCancelable(Z)V

    return-void
.end method


# virtual methods
.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyg;->d:Lxh;

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const v1, 0x1e51

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lxh;->d(Landroid/os/Bundle;)Lxh;

    move-result-object v0

    iput-object v0, p0, Lyg;->d:Lxh;

    .line 4
    :cond_0
    iget-object v0, p0, Lyg;->d:Lxh;

    if-nez v0, :cond_1

    .line 5
    sget-object v0, Lxh;->c:Lxh;

    iput-object v0, p0, Lyg;->d:Lxh;

    :cond_1
    return-void
.end method

.method public k(Landroid/content/Context;Landroid/os/Bundle;)Lxg;
    .locals 0

    .line 1
    new-instance p2, Lxg;

    invoke-direct {p2, p1}, Lxg;-><init>(Landroid/content/Context;)V

    return-object p2
.end method

.method public l(Landroid/content/Context;)Lch;
    .locals 1

    .line 1
    new-instance v0, Lch;

    invoke-direct {v0, p1}, Lch;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public m(Lxh;)V
    .locals 3

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p0}, Lyg;->j()V

    .line 2
    iget-object v0, p0, Lyg;->d:Lxh;

    invoke-virtual {v0, p1}, Lxh;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iput-object p1, p0, Lyg;->d:Lxh;

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

    const v2, 0x1e52

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 7
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 8
    iget-object v0, p0, Lyg;->c:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    .line 9
    iget-boolean v1, p0, Lyg;->b:Z

    if-eqz v1, :cond_1

    .line 10
    check-cast v0, Lch;

    invoke-virtual {v0, p1}, Lch;->p(Lxh;)V

    :cond_1
    return-void

    .line 11
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x1e53

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyg;->c:Landroid/app/Dialog;

    if-nez v0, :cond_0

    .line 2
    iput-boolean p1, p0, Lyg;->b:Z

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const v0, 0x1e54

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
    iget-object p1, p0, Lyg;->c:Landroid/app/Dialog;

    if-eqz p1, :cond_1

    .line 3
    iget-boolean v0, p0, Lyg;->b:Z

    if-eqz v0, :cond_0

    .line 4
    check-cast p1, Lch;

    invoke-virtual {p1}, Lch;->r()V

    goto :goto_0

    .line 5
    :cond_0
    check-cast p1, Lxg;

    invoke-virtual {p1}, Lxg;->J()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyg;->b:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lyg;->l(Landroid/content/Context;)Lch;

    move-result-object p1

    iput-object p1, p0, Lyg;->c:Landroid/app/Dialog;

    .line 3
    check-cast p1, Lch;

    iget-object v0, p0, Lyg;->d:Lxh;

    invoke-virtual {p1, v0}, Lch;->p(Lxh;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lyg;->k(Landroid/content/Context;Landroid/os/Bundle;)Lxg;

    move-result-object p1

    iput-object p1, p0, Lyg;->c:Landroid/app/Dialog;

    .line 5
    :goto_0
    iget-object p1, p0, Lyg;->c:Landroid/app/Dialog;

    return-object p1
.end method

.method public onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Lrd;->onStop()V

    .line 2
    iget-object v0, p0, Lyg;->c:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lyg;->b:Z

    if-nez v1, :cond_0

    .line 3
    check-cast v0, Lxg;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lxg;->m(Z)V

    :cond_0
    return-void
.end method
