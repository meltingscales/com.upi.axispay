.class public Lg0;
.super Lv;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0$d;,
        Lg0$c;,
        Lg0$e;
    }
.end annotation


# instance fields
.field public a:Lu2;

.field public b:Z

.field public c:Landroid/view/Window$Callback;

.field public d:Z

.field public e:Z

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lv$b;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/lang/Runnable;

.field public final h:Landroidx/appcompat/widget/Toolbar$f;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lv;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg0;->f:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Lg0$a;

    invoke-direct {v0, p0}, Lg0$a;-><init>(Lg0;)V

    iput-object v0, p0, Lg0;->g:Ljava/lang/Runnable;

    .line 4
    new-instance v0, Lg0$b;

    invoke-direct {v0, p0}, Lg0$b;-><init>(Lg0;)V

    iput-object v0, p0, Lg0;->h:Landroidx/appcompat/widget/Toolbar$f;

    .line 5
    new-instance v1, Lp3;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lp3;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V

    iput-object v1, p0, Lg0;->a:Lu2;

    .line 6
    new-instance v1, Lg0$e;

    invoke-direct {v1, p0, p3}, Lg0$e;-><init>(Lg0;Landroid/view/Window$Callback;)V

    iput-object v1, p0, Lg0;->c:Landroid/view/Window$Callback;

    .line 7
    iget-object p3, p0, Lg0;->a:Lu2;

    invoke-interface {p3, v1}, Lu2;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 8
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Landroidx/appcompat/widget/Toolbar$f;)V

    .line 9
    iget-object p1, p0, Lg0;->a:Lu2;

    invoke-interface {p1, p2}, Lu2;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public A()Landroid/view/Window$Callback;
    .locals 1

    .line 1
    iget-object v0, p0, Lg0;->c:Landroid/view/Window$Callback;

    return-object v0
.end method

.method public B()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lg0;->z()Landroid/view/Menu;

    move-result-object v0

    .line 2
    instance-of v1, v0, Li1;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Li1;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {v1}, Li1;->h0()V

    .line 4
    :cond_1
    :try_start_0
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 5
    iget-object v3, p0, Lg0;->c:Landroid/view/Window$Callback;

    const/4 v4, 0x0

    invoke-interface {v3, v4, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lg0;->c:Landroid/view/Window$Callback;

    .line 6
    invoke-interface {v3, v4, v2, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 7
    :cond_2
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    if-eqz v1, :cond_4

    .line 8
    invoke-virtual {v1}, Li1;->g0()V

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Li1;->g0()V

    .line 9
    :cond_5
    throw v0
.end method

.method public C(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0}, Lu2;->p()I

    move-result v0

    .line 2
    iget-object v1, p0, Lg0;->a:Lu2;

    and-int/2addr p1, p2

    not-int p2, p2

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    invoke-interface {v1, p1}, Lu2;->o(I)V

    return-void
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0}, Lu2;->e()Z

    move-result v0

    return v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0}, Lu2;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0}, Lu2;->collapseActionView()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lg0;->e:Z

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput-boolean p1, p0, Lg0;->e:Z

    .line 3
    iget-object v0, p0, Lg0;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    iget-object v2, p0, Lg0;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv$b;

    invoke-interface {v2, p1}, Lv$b;->a(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public j()I
    .locals 1

    .line 1
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0}, Lu2;->p()I

    move-result v0

    return v0
.end method

.method public k()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0}, Lu2;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public l()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0}, Lu2;->l()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lg0;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0}, Lu2;->l()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lg0;->g:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lac;->i0(Landroid/view/View;Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    return v0
.end method

.method public m(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lv;->m(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public n()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0}, Lu2;->l()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lg0;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public o(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lg0;->z()Landroid/view/Menu;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    .line 3
    :goto_0
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    .line 5
    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_2
    return v1
.end method

.method public p(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lg0;->q()Z

    :cond_0
    return v0
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0}, Lu2;->f()Z

    move-result v0

    return v0
.end method

.method public r(Z)V
    .locals 0

    return-void
.end method

.method public s(Z)V
    .locals 1

    const/4 v0, 0x4

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1
    :goto_0
    invoke-virtual {p0, p1, v0}, Lg0;->C(II)V

    return-void
.end method

.method public t(Z)V
    .locals 1

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1
    :goto_0
    invoke-virtual {p0, p1, v0}, Lg0;->C(II)V

    return-void
.end method

.method public u(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0, p1}, Lu2;->s(I)V

    return-void
.end method

.method public v(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0, p1}, Lu2;->x(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public w(Z)V
    .locals 0

    return-void
.end method

.method public x(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0, p1}, Lu2;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final z()Landroid/view/Menu;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lg0;->d:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lg0;->a:Lu2;

    new-instance v1, Lg0$c;

    invoke-direct {v1, p0}, Lg0$c;-><init>(Lg0;)V

    new-instance v2, Lg0$d;

    invoke-direct {v2, p0}, Lg0$d;-><init>(Lg0;)V

    invoke-interface {v0, v1, v2}, Lu2;->i(Lo1$a;Li1$a;)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lg0;->d:Z

    .line 4
    :cond_0
    iget-object v0, p0, Lg0;->a:Lu2;

    invoke-interface {v0}, Lu2;->q()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method
