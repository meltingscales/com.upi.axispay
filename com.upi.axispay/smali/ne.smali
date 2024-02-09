.class public Lne;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ltl;
.implements Lsf;


# instance fields
.field public final b:Lrf;

.field public c:Lff;

.field public d:Lsl;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Lrf;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lne;->c:Lff;

    .line 3
    iput-object p1, p0, Lne;->d:Lsl;

    .line 4
    iput-object p2, p0, Lne;->b:Lrf;

    return-void
.end method


# virtual methods
.method public a(Lbf$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lne;->c:Lff;

    invoke-virtual {v0, p1}, Lff;->h(Lbf$b;)V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lne;->c:Lff;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lff;

    invoke-direct {v0, p0}, Lff;-><init>(Lef;)V

    iput-object v0, p0, Lne;->c:Lff;

    .line 3
    invoke-static {p0}, Lsl;->a(Ltl;)Lsl;

    move-result-object v0

    iput-object v0, p0, Lne;->d:Lsl;

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lne;->c:Lff;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lne;->d:Lsl;

    invoke-virtual {v0, p1}, Lsl;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method public f(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lne;->d:Lsl;

    invoke-virtual {v0, p1}, Lsl;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method public g(Lbf$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lne;->c:Lff;

    invoke-virtual {v0, p1}, Lff;->o(Lbf$c;)V

    return-void
.end method

.method public getLifecycle()Lbf;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lne;->b()V

    .line 2
    iget-object v0, p0, Lne;->c:Lff;

    return-object v0
.end method

.method public getSavedStateRegistry()Landroidx/savedstate/SavedStateRegistry;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lne;->b()V

    .line 2
    iget-object v0, p0, Lne;->d:Lsl;

    invoke-virtual {v0}, Lsl;->b()Landroidx/savedstate/SavedStateRegistry;

    move-result-object v0

    return-object v0
.end method

.method public getViewModelStore()Lrf;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lne;->b()V

    .line 2
    iget-object v0, p0, Lne;->b:Lrf;

    return-object v0
.end method
