.class public Lmf;
.super Landroid/app/Fragment;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmf$b;,
        Lmf$a;
    }
.end annotation


# instance fields
.field public b:Lmf$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;Lbf$b;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lgf;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Lgf;

    invoke-interface {p0}, Lgf;->getLifecycle()Lff;

    move-result-object p0

    invoke-virtual {p0, p1}, Lff;->h(Lbf$b;)V

    return-void

    .line 3
    :cond_0
    instance-of v0, p0, Lef;

    if-eqz v0, :cond_1

    .line 4
    check-cast p0, Lef;

    invoke-interface {p0}, Lef;->getLifecycle()Lbf;

    move-result-object p0

    .line 5
    instance-of v0, p0, Lff;

    if-eqz v0, :cond_1

    .line 6
    check-cast p0, Lff;

    invoke-virtual {p0, p1}, Lff;->h(Lbf$b;)V

    :cond_1
    return-void
.end method

.method public static f(Landroid/app/Activity;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 2
    invoke-static {p0}, Lmf$b;->registerIn(Landroid/app/Activity;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const v0, 0x3253

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    if-nez v1, :cond_1

    .line 5
    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    new-instance v2, Lmf;

    invoke-direct {v2}, Lmf;-><init>()V

    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 6
    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final b(Lbf$b;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, p1}, Lmf;->a(Landroid/app/Activity;Lbf$b;)V

    :cond_0
    return-void
.end method

.method public final c(Lmf$a;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1}, Lmf$a;->a()V

    :cond_0
    return-void
.end method

.method public final d(Lmf$a;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1}, Lmf$a;->onResume()V

    :cond_0
    return-void
.end method

.method public final e(Lmf$a;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1}, Lmf$a;->onStart()V

    :cond_0
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lmf;->b:Lmf$a;

    invoke-virtual {p0, p1}, Lmf;->c(Lmf$a;)V

    .line 3
    sget-object p1, Lbf$b;->ON_CREATE:Lbf$b;

    invoke-virtual {p0, p1}, Lmf;->b(Lbf$b;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    .line 2
    sget-object v0, Lbf$b;->ON_DESTROY:Lbf$b;

    invoke-virtual {p0, v0}, Lmf;->b(Lbf$b;)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lmf;->b:Lmf$a;

    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    .line 2
    sget-object v0, Lbf$b;->ON_PAUSE:Lbf$b;

    invoke-virtual {p0, v0}, Lmf;->b(Lbf$b;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 2
    iget-object v0, p0, Lmf;->b:Lmf$a;

    invoke-virtual {p0, v0}, Lmf;->d(Lmf$a;)V

    .line 3
    sget-object v0, Lbf$b;->ON_RESUME:Lbf$b;

    invoke-virtual {p0, v0}, Lmf;->b(Lbf$b;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    .line 2
    iget-object v0, p0, Lmf;->b:Lmf$a;

    invoke-virtual {p0, v0}, Lmf;->e(Lmf$a;)V

    .line 3
    sget-object v0, Lbf$b;->ON_START:Lbf$b;

    invoke-virtual {p0, v0}, Lmf;->b(Lbf$b;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    .line 2
    sget-object v0, Lbf$b;->ON_STOP:Lbf$b;

    invoke-virtual {p0, v0}, Lmf;->b(Lbf$b;)V

    return-void
.end method
