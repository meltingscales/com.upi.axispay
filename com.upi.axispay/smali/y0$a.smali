.class public Ly0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lu0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/view/ActionMode$Callback;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ly0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lu4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu4<",
            "Landroid/view/Menu;",
            "Landroid/view/Menu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly0$a;->b:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Ly0$a;->a:Landroid/view/ActionMode$Callback;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ly0$a;->c:Ljava/util/ArrayList;

    .line 5
    new-instance p1, Lu4;

    invoke-direct {p1}, Lu4;-><init>()V

    iput-object p1, p0, Ly0$a;->d:Lu4;

    return-void
.end method


# virtual methods
.method public a(Lu0;Landroid/view/Menu;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly0$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Ly0$a;->e(Lu0;)Landroid/view/ActionMode;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p2}, Ly0$a;->f(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Lu0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly0$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Ly0$a;->e(Lu0;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    return-void
.end method

.method public c(Lu0;Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ly0$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Ly0$a;->e(Lu0;)Landroid/view/ActionMode;

    move-result-object p1

    new-instance v1, Ll1;

    iget-object v2, p0, Ly0$a;->b:Landroid/content/Context;

    check-cast p2, Lw9;

    invoke-direct {v1, v2, p2}, Ll1;-><init>(Landroid/content/Context;Lw9;)V

    invoke-interface {v0, p1, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public d(Lu0;Landroid/view/Menu;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly0$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Ly0$a;->e(Lu0;)Landroid/view/ActionMode;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p2}, Ly0$a;->f(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public e(Lu0;)Landroid/view/ActionMode;
    .locals 4

    .line 1
    iget-object v0, p0, Ly0$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    iget-object v2, p0, Ly0$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly0;

    if-eqz v2, :cond_0

    .line 3
    iget-object v3, v2, Ly0;->b:Lu0;

    if-ne v3, p1, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_1
    new-instance v0, Ly0;

    iget-object v1, p0, Ly0$a;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Ly0;-><init>(Landroid/content/Context;Lu0;)V

    .line 5
    iget-object p1, p0, Ly0$a;->c:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final f(Landroid/view/Menu;)Landroid/view/Menu;
    .locals 3

    .line 1
    iget-object v0, p0, Ly0$a;->d:Lu4;

    invoke-virtual {v0, p1}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Menu;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lq1;

    iget-object v1, p0, Ly0$a;->b:Landroid/content/Context;

    move-object v2, p1

    check-cast v2, Lv9;

    invoke-direct {v0, v1, v2}, Lq1;-><init>(Landroid/content/Context;Lv9;)V

    .line 3
    iget-object v1, p0, Ly0$a;->d:Lu4;

    invoke-virtual {v1, p1, v0}, Lu4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method
