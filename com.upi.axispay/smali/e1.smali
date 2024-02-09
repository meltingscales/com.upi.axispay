.class public abstract Le1;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lu4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu4<",
            "Lw9;",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lu4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu4<",
            "Lx9;",
            "Landroid/view/SubMenu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le1;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    .line 1
    instance-of v0, p1, Lw9;

    if-eqz v0, :cond_1

    .line 2
    move-object v0, p1

    check-cast v0, Lw9;

    .line 3
    iget-object v1, p0, Le1;->b:Lu4;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lu4;

    invoke-direct {v1}, Lu4;-><init>()V

    iput-object v1, p0, Le1;->b:Lu4;

    .line 5
    :cond_0
    iget-object v1, p0, Le1;->b:Lu4;

    invoke-virtual {v1, p1}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/MenuItem;

    if-nez p1, :cond_1

    .line 6
    new-instance p1, Ll1;

    iget-object v1, p0, Le1;->a:Landroid/content/Context;

    invoke-direct {p1, v1, v0}, Ll1;-><init>(Landroid/content/Context;Lw9;)V

    .line 7
    iget-object v1, p0, Le1;->b:Lu4;

    invoke-virtual {v1, v0, p1}, Lu4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object p1
.end method

.method public final d(Landroid/view/SubMenu;)Landroid/view/SubMenu;
    .locals 2

    .line 1
    instance-of v0, p1, Lx9;

    if-eqz v0, :cond_2

    .line 2
    check-cast p1, Lx9;

    .line 3
    iget-object v0, p0, Le1;->c:Lu4;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lu4;

    invoke-direct {v0}, Lu4;-><init>()V

    iput-object v0, p0, Le1;->c:Lu4;

    .line 5
    :cond_0
    iget-object v0, p0, Le1;->c:Lu4;

    invoke-virtual {v0, p1}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SubMenu;

    if-nez v0, :cond_1

    .line 6
    new-instance v0, Lu1;

    iget-object v1, p0, Le1;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lu1;-><init>(Landroid/content/Context;Lx9;)V

    .line 7
    iget-object v1, p0, Le1;->c:Lu4;

    invoke-virtual {v1, p1, v0}, Lu4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Le1;->b:Lu4;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lu4;->clear()V

    .line 3
    :cond_0
    iget-object v0, p0, Le1;->c:Lu4;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lu4;->clear()V

    :cond_1
    return-void
.end method

.method public final f(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Le1;->b:Lu4;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Le1;->b:Lu4;

    invoke-virtual {v1}, Lu4;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 3
    iget-object v1, p0, Le1;->b:Lu4;

    invoke-virtual {v1, v0}, Lu4;->i(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw9;

    invoke-interface {v1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v1

    if-ne v1, p1, :cond_1

    .line 4
    iget-object v1, p0, Le1;->b:Lu4;

    invoke-virtual {v1, v0}, Lu4;->k(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final g(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Le1;->b:Lu4;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Le1;->b:Lu4;

    invoke-virtual {v1}, Lu4;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 3
    iget-object v1, p0, Le1;->b:Lu4;

    invoke-virtual {v1, v0}, Lu4;->i(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw9;

    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    if-ne v1, p1, :cond_1

    .line 4
    iget-object p1, p0, Le1;->b:Lu4;

    invoke-virtual {p1, v0}, Lu4;->k(I)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
