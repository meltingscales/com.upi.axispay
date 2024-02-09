.class public Lj1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;
.implements Lo1$a;


# instance fields
.field public b:Li1;

.field public c:Ly;

.field public d:Lg1;

.field public e:Lo1$a;


# direct methods
.method public constructor <init>(Li1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj1;->b:Li1;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj1;->c:Ly;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc0;->dismiss()V

    :cond_0
    return-void
.end method

.method public b(Li1;Z)V
    .locals 1

    if-nez p2, :cond_0

    .line 1
    iget-object v0, p0, Lj1;->b:Li1;

    if-ne p1, v0, :cond_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lj1;->a()V

    .line 3
    :cond_1
    iget-object v0, p0, Lj1;->e:Lo1$a;

    if-eqz v0, :cond_2

    .line 4
    invoke-interface {v0, p1, p2}, Lo1$a;->b(Li1;Z)V

    :cond_2
    return-void
.end method

.method public c(Li1;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lj1;->e:Lo1$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lo1$a;->c(Li1;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(Landroid/os/IBinder;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lj1;->b:Li1;

    .line 2
    new-instance v1, Ly$a;

    invoke-virtual {v0}, Li1;->w()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Ly$a;-><init>(Landroid/content/Context;)V

    .line 3
    new-instance v2, Lg1;

    invoke-virtual {v1}, Ly$a;->b()Landroid/content/Context;

    move-result-object v3

    sget v4, Lr;->abc_list_menu_item_layout:I

    invoke-direct {v2, v3, v4}, Lg1;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lj1;->d:Lg1;

    .line 4
    invoke-virtual {v2, p0}, Lg1;->m(Lo1$a;)V

    .line 5
    iget-object v2, p0, Lj1;->b:Li1;

    iget-object v3, p0, Lj1;->d:Lg1;

    invoke-virtual {v2, v3}, Li1;->b(Lo1;)V

    .line 6
    iget-object v2, p0, Lj1;->d:Lg1;

    invoke-virtual {v2}, Lg1;->a()Landroid/widget/ListAdapter;

    move-result-object v2

    invoke-virtual {v1, v2, p0}, Ly$a;->c(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Ly$a;

    .line 7
    invoke-virtual {v0}, Li1;->A()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 8
    invoke-virtual {v1, v2}, Ly$a;->e(Landroid/view/View;)Ly$a;

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v0}, Li1;->y()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly$a;->f(Landroid/graphics/drawable/Drawable;)Ly$a;

    invoke-virtual {v0}, Li1;->z()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v1, v0}, Ly$a;->j(Ljava/lang/CharSequence;)Ly$a;

    .line 10
    :goto_0
    invoke-virtual {v1, p0}, Ly$a;->g(Landroid/content/DialogInterface$OnKeyListener;)Ly$a;

    .line 11
    invoke-virtual {v1}, Ly$a;->a()Ly;

    move-result-object v0

    iput-object v0, p0, Lj1;->c:Ly;

    .line 12
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 13
    iget-object v0, p0, Lj1;->c:Ly;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/16 v1, 0x3eb

    .line 14
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    if-eqz p1, :cond_1

    .line 15
    iput-object p1, v0, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 16
    :cond_1
    iget p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v1, 0x20000

    or-int/2addr p1, v1

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 17
    iget-object p1, p0, Lj1;->c:Ly;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lj1;->b:Li1;

    iget-object v0, p0, Lj1;->d:Lg1;

    invoke-virtual {v0}, Lg1;->a()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0, p2}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lk1;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Li1;->N(Landroid/view/MenuItem;I)Z

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lj1;->d:Lg1;

    iget-object v0, p0, Lj1;->b:Li1;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lg1;->b(Li1;Z)V

    return-void
.end method

.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    const/16 v0, 0x52

    if-eq p2, v0, :cond_0

    const/4 v0, 0x4

    if-ne p2, v0, :cond_2

    .line 1
    :cond_0
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object p1, p0, Lj1;->c:Ly;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p1, p3, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    return v1

    .line 7
    :cond_1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 8
    iget-object v0, p0, Lj1;->c:Ly;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {v0, p3}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 12
    iget-object p2, p0, Lj1;->b:Li1;

    invoke-virtual {p2, v1}, Li1;->e(Z)V

    .line 13
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return v1

    .line 14
    :cond_2
    iget-object p1, p0, Lj1;->b:Li1;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Li1;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1
.end method
