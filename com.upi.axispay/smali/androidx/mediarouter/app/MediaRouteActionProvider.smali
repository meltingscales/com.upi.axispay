.class public Landroidx/mediarouter/app/MediaRouteActionProvider;
.super Lfb;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/mediarouter/app/MediaRouteActionProvider$a;
    }
.end annotation


# instance fields
.field public final c:Lyh;

.field public d:Lxh;

.field public e:Lzg;

.field public f:Lug;

.field public g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lfb;-><init>(Landroid/content/Context;)V

    .line 2
    sget-object v0, Lxh;->c:Lxh;

    iput-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->d:Lxh;

    .line 3
    invoke-static {}, Lzg;->a()Lzg;

    move-result-object v0

    iput-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->e:Lzg;

    .line 4
    invoke-static {p1}, Lyh;->g(Landroid/content/Context;)Lyh;

    move-result-object p1

    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->c:Lyh;

    .line 5
    new-instance p1, Landroidx/mediarouter/app/MediaRouteActionProvider$a;

    invoke-direct {p1, p0}, Landroidx/mediarouter/app/MediaRouteActionProvider$a;-><init>(Landroidx/mediarouter/app/MediaRouteActionProvider;)V

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->g:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->c:Lyh;

    iget-object v2, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->d:Lxh;

    invoke-virtual {v0, v2, v1}, Lyh;->m(Lxh;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public d()Landroid/view/View;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->f:Lug;

    if-eqz v0, :cond_0

    const-string v0, "MRActionProvider"

    const-string v1, "onCreateActionView: this ActionProvider is already associated with a menu item. Don\'t reuse MediaRouteActionProvider instances! Abandoning the old menu item..."

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroidx/mediarouter/app/MediaRouteActionProvider;->m()Lug;

    move-result-object v0

    iput-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->f:Lug;

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lug;->setCheatSheetEnabled(Z)V

    .line 5
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->f:Lug;

    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->d:Lxh;

    invoke-virtual {v0, v1}, Lug;->setRouteSelector(Lxh;)V

    .line 6
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->f:Lug;

    iget-boolean v1, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->g:Z

    invoke-virtual {v0, v1}, Lug;->setAlwaysVisible(Z)V

    .line 7
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->f:Lug;

    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->e:Lzg;

    invoke-virtual {v0, v1}, Lug;->setDialogFactory(Lzg;)V

    .line 8
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->f:Lug;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->f:Lug;

    return-object v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;->f:Lug;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lug;->d()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public m()Lug;
    .locals 2

    .line 1
    new-instance v0, Lug;

    invoke-virtual {p0}, Lfb;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lug;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public n()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lfb;->i()V

    return-void
.end method
