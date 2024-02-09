.class public Lic;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lic$a;,
        Lic$n;,
        Lic$m;,
        Lic$e;,
        Lic$d;,
        Lic$c;,
        Lic$f;,
        Lic$b;,
        Lic$k;,
        Lic$j;,
        Lic$i;,
        Lic$h;,
        Lic$g;,
        Lic$l;
    }
.end annotation


# static fields
.field public static final b:Lic;


# instance fields
.field public final a:Lic$l;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 2
    sget-object v0, Lic$k;->r:Lic;

    sput-object v0, Lic;->b:Lic;

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Lic$l;->b:Lic;

    sput-object v0, Lic;->b:Lic;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Lic$k;

    invoke-direct {v0, p0, p1}, Lic$k;-><init>(Lic;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lic;->a:Lic$l;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Lic$j;

    invoke-direct {v0, p0, p1}, Lic$j;-><init>(Lic;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lic;->a:Lic$l;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, Lic$i;

    invoke-direct {v0, p0, p1}, Lic$i;-><init>(Lic;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lic;->a:Lic$l;

    goto :goto_0

    :cond_2
    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    .line 6
    new-instance v0, Lic$h;

    invoke-direct {v0, p0, p1}, Lic$h;-><init>(Lic;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lic;->a:Lic$l;

    goto :goto_0

    :cond_3
    const/16 v1, 0x14

    if-lt v0, v1, :cond_4

    .line 7
    new-instance v0, Lic$g;

    invoke-direct {v0, p0, p1}, Lic$g;-><init>(Lic;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lic;->a:Lic$l;

    goto :goto_0

    .line 8
    :cond_4
    new-instance p1, Lic$l;

    invoke-direct {p1, p0}, Lic$l;-><init>(Lic;)V

    iput-object p1, p0, Lic;->a:Lic$l;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lic;)V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    .line 10
    iget-object p1, p1, Lic;->a:Lic$l;

    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    instance-of v1, p1, Lic$k;

    if-eqz v1, :cond_0

    .line 12
    new-instance v0, Lic$k;

    move-object v1, p1

    check-cast v1, Lic$k;

    invoke-direct {v0, p0, v1}, Lic$k;-><init>(Lic;Lic$k;)V

    iput-object v0, p0, Lic;->a:Lic$l;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 13
    instance-of v1, p1, Lic$j;

    if-eqz v1, :cond_1

    .line 14
    new-instance v0, Lic$j;

    move-object v1, p1

    check-cast v1, Lic$j;

    invoke-direct {v0, p0, v1}, Lic$j;-><init>(Lic;Lic$j;)V

    iput-object v0, p0, Lic;->a:Lic$l;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 15
    instance-of v1, p1, Lic$i;

    if-eqz v1, :cond_2

    .line 16
    new-instance v0, Lic$i;

    move-object v1, p1

    check-cast v1, Lic$i;

    invoke-direct {v0, p0, v1}, Lic$i;-><init>(Lic;Lic$i;)V

    iput-object v0, p0, Lic;->a:Lic$l;

    goto :goto_0

    :cond_2
    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    .line 17
    instance-of v1, p1, Lic$h;

    if-eqz v1, :cond_3

    .line 18
    new-instance v0, Lic$h;

    move-object v1, p1

    check-cast v1, Lic$h;

    invoke-direct {v0, p0, v1}, Lic$h;-><init>(Lic;Lic$h;)V

    iput-object v0, p0, Lic;->a:Lic$l;

    goto :goto_0

    :cond_3
    const/16 v1, 0x14

    if-lt v0, v1, :cond_4

    .line 19
    instance-of v0, p1, Lic$g;

    if-eqz v0, :cond_4

    .line 20
    new-instance v0, Lic$g;

    move-object v1, p1

    check-cast v1, Lic$g;

    invoke-direct {v0, p0, v1}, Lic$g;-><init>(Lic;Lic$g;)V

    iput-object v0, p0, Lic;->a:Lic$l;

    goto :goto_0

    .line 21
    :cond_4
    new-instance v0, Lic$l;

    invoke-direct {v0, p0}, Lic$l;-><init>(Lic;)V

    iput-object v0, p0, Lic;->a:Lic$l;

    .line 22
    :goto_0
    invoke-virtual {p1, p0}, Lic$l;->e(Lic;)V

    goto :goto_1

    .line 23
    :cond_5
    new-instance p1, Lic$l;

    invoke-direct {p1, p0}, Lic$l;-><init>(Lic;)V

    iput-object p1, p0, Lic;->a:Lic$l;

    :goto_1
    return-void
.end method

.method public static o(Le9;IIII)Le9;
    .locals 5

    .line 1
    iget v0, p0, Le9;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 2
    iget v2, p0, Le9;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 3
    iget v3, p0, Le9;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 4
    iget v4, p0, Le9;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    .line 5
    :cond_0
    invoke-static {v0, v2, v3, v1}, Le9;->b(IIII)Le9;

    move-result-object p0

    return-object p0
.end method

.method public static w(Landroid/view/WindowInsets;)Lic;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lic;->x(Landroid/view/WindowInsets;Landroid/view/View;)Lic;

    move-result-object p0

    return-object p0
.end method

.method public static x(Landroid/view/WindowInsets;Landroid/view/View;)Lic;
    .locals 1

    .line 1
    new-instance v0, Lic;

    invoke-static {p0}, Ldb;->e(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Landroid/view/WindowInsets;

    invoke-direct {v0, p0}, Lic;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 3
    invoke-static {p1}, Lac;->K(Landroid/view/View;)Lic;

    move-result-object p0

    invoke-virtual {v0, p0}, Lic;->t(Lic;)V

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Lic;->d(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Lic;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0}, Lic$l;->a()Lic;

    move-result-object v0

    return-object v0
.end method

.method public b()Lic;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0}, Lic$l;->b()Lic;

    move-result-object v0

    return-object v0
.end method

.method public c()Lic;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0}, Lic$l;->c()Lic;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0, p1}, Lic$l;->d(Landroid/view/View;)V

    return-void
.end method

.method public e()Lhb;
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0}, Lic$l;->f()Lhb;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1
    :cond_0
    instance-of v0, p1, Lic;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_1
    check-cast p1, Lic;

    .line 3
    iget-object v0, p0, Lic;->a:Lic$l;

    iget-object p1, p1, Lic;->a:Lic$l;

    invoke-static {v0, p1}, Lya;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(I)Le9;
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0, p1}, Lic$l;->g(I)Le9;

    move-result-object p1

    return-object p1
.end method

.method public g()Le9;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0}, Lic$l;->h()Le9;

    move-result-object v0

    return-object v0
.end method

.method public h()Le9;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0}, Lic$l;->i()Le9;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lic$l;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public i()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0}, Lic$l;->k()Le9;

    move-result-object v0

    iget v0, v0, Le9;->d:I

    return v0
.end method

.method public j()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0}, Lic$l;->k()Le9;

    move-result-object v0

    iget v0, v0, Le9;->a:I

    return v0
.end method

.method public k()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0}, Lic$l;->k()Le9;

    move-result-object v0

    iget v0, v0, Le9;->c:I

    return v0
.end method

.method public l()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0}, Lic$l;->k()Le9;

    move-result-object v0

    iget v0, v0, Le9;->b:I

    return v0
.end method

.method public m()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0}, Lic$l;->k()Le9;

    move-result-object v0

    sget-object v1, Le9;->e:Le9;

    invoke-virtual {v0, v1}, Le9;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public n(IIII)Lic;
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0, p1, p2, p3, p4}, Lic$l;->m(IIII)Lic;

    move-result-object p1

    return-object p1
.end method

.method public p()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0}, Lic$l;->n()Z

    move-result v0

    return v0
.end method

.method public q(IIII)Lic;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lic$b;

    invoke-direct {v0, p0}, Lic$b;-><init>(Lic;)V

    .line 2
    invoke-static {p1, p2, p3, p4}, Le9;->b(IIII)Le9;

    move-result-object p1

    invoke-virtual {v0, p1}, Lic$b;->c(Le9;)Lic$b;

    .line 3
    invoke-virtual {v0}, Lic$b;->a()Lic;

    move-result-object p1

    return-object p1
.end method

.method public r([Le9;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0, p1}, Lic$l;->p([Le9;)V

    return-void
.end method

.method public s(Le9;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0, p1}, Lic$l;->q(Le9;)V

    return-void
.end method

.method public t(Lic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0, p1}, Lic$l;->r(Lic;)V

    return-void
.end method

.method public u(Le9;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    invoke-virtual {v0, p1}, Lic$l;->s(Le9;)V

    return-void
.end method

.method public v()Landroid/view/WindowInsets;
    .locals 2

    .line 1
    iget-object v0, p0, Lic;->a:Lic$l;

    instance-of v1, v0, Lic$g;

    if-eqz v1, :cond_0

    check-cast v0, Lic$g;

    iget-object v0, v0, Lic$g;->c:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
