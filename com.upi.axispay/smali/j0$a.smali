.class public Lj0$a;
.super Lgc;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj0;


# direct methods
.method public constructor <init>(Lj0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj0$a;->a:Lj0;

    invoke-direct {p0}, Lgc;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lj0$a;->a:Lj0;

    iget-boolean v0, p1, Lj0;->q:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lj0;->g:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 3
    iget-object p1, p0, Lj0$a;->a:Lj0;

    iget-object p1, p1, Lj0;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    .line 4
    :cond_0
    iget-object p1, p0, Lj0$a;->a:Lj0;

    iget-object p1, p1, Lj0;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lj0$a;->a:Lj0;

    iget-object p1, p1, Lj0;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    .line 6
    iget-object p1, p0, Lj0$a;->a:Lj0;

    const/4 v0, 0x0

    iput-object v0, p1, Lj0;->v:La1;

    .line 7
    invoke-virtual {p1}, Lj0;->B()V

    .line 8
    iget-object p1, p0, Lj0$a;->a:Lj0;

    iget-object p1, p1, Lj0;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_1

    .line 9
    invoke-static {p1}, Lac;->n0(Landroid/view/View;)V

    :cond_1
    return-void
.end method