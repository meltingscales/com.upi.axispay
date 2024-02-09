.class public Lsd$c;
.super Lyd;
.source "AxisPay"

# interfaces
.implements Lsf;
.implements Lc;
.implements Lh;
.implements Lde;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lyd<",
        "Lsd;",
        ">;",
        "Lsf;",
        "Lc;",
        "Lh;",
        "Lde;"
    }
.end annotation


# instance fields
.field public final synthetic f:Lsd;


# direct methods
.method public constructor <init>(Lsd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsd$c;->f:Lsd;

    .line 2
    invoke-direct {p0, p1}, Lyd;-><init>(Lsd;)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lsd$c;->f:Lsd;

    invoke-virtual {p1, p2}, Lsd;->H(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public c()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    .line 1
    iget-object v0, p0, Lsd$c;->f:Lsd;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->c()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    return-object v0
.end method

.method public d(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lsd$c;->f:Lsd;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsd$c;->f:Lsd;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getLifecycle()Lbf;
    .locals 1

    .line 1
    iget-object v0, p0, Lsd$c;->f:Lsd;

    iget-object v0, v0, Lsd;->k:Lff;

    return-object v0
.end method

.method public getViewModelStore()Lrf;
    .locals 1

    .line 1
    iget-object v0, p0, Lsd$c;->f:Lsd;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getViewModelStore()Lrf;

    move-result-object v0

    return-object v0
.end method

.method public i(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsd$c;->f:Lsd;

    invoke-virtual {v0, p1, p2, p3, p4}, Lsd;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic j()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsd$c;->s()Lsd;

    move-result-object v0

    return-object v0
.end method

.method public k()Landroid/view/LayoutInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Lsd$c;->f:Lsd;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lsd$c;->f:Lsd;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public m(Landroidx/fragment/app/Fragment;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lsd$c;->f:Lsd;

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public n(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsd$c;->f:Lsd;

    invoke-static {v0, p1}, Ld8;->p(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public p()Landroidx/activity/result/ActivityResultRegistry;
    .locals 1

    .line 1
    iget-object v0, p0, Lsd$c;->f:Lsd;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->p()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object v0

    return-object v0
.end method

.method public r()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsd$c;->f:Lsd;

    invoke-virtual {v0}, Lsd;->K()V

    return-void
.end method

.method public s()Lsd;
    .locals 1

    .line 1
    iget-object v0, p0, Lsd$c;->f:Lsd;

    return-object v0
.end method
