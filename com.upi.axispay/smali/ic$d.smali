.class public Lic$d;
.super Lic$f;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lic$f;-><init>()V

    .line 2
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, Lic$d;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Lic;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lic$f;-><init>(Lic;)V

    .line 4
    invoke-virtual {p1}, Lic;->v()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    :goto_0
    iput-object v0, p0, Lic$d;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()Lic;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lic$f;->a()V

    .line 2
    iget-object v0, p0, Lic$d;->c:Landroid/view/WindowInsets$Builder;

    .line 3
    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lic;->w(Landroid/view/WindowInsets;)Lic;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lic$f;->b:[Le9;

    invoke-virtual {v0, v1}, Lic;->r([Le9;)V

    return-object v0
.end method

.method public c(Le9;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Le9;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setMandatorySystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public d(Le9;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Le9;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public e(Le9;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Le9;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public f(Le9;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Le9;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public g(Le9;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Le9;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setTappableElementInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
