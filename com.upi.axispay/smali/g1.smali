.class public Lg1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lo1;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1$a;
    }
.end annotation


# instance fields
.field public b:Landroid/content/Context;

.field public c:Landroid/view/LayoutInflater;

.field public d:Li1;

.field public e:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field public f:I

.field public g:I

.field public h:I

.field public i:Lo1$a;

.field public j:Lg1$a;

.field public k:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Lg1;->h:I

    .line 6
    iput p2, p0, Lg1;->g:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p2, v0}, Lg1;-><init>(II)V

    .line 2
    iput-object p1, p0, Lg1;->b:Landroid/content/Context;

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lg1;->c:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public a()Landroid/widget/ListAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lg1;->j:Lg1$a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lg1$a;

    invoke-direct {v0, p0}, Lg1$a;-><init>(Lg1;)V

    iput-object v0, p0, Lg1;->j:Lg1$a;

    .line 3
    :cond_0
    iget-object v0, p0, Lg1;->j:Lg1$a;

    return-object v0
.end method

.method public b(Li1;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg1;->i:Lo1$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lo1$a;->b(Li1;Z)V

    :cond_0
    return-void
.end method

.method public c(Landroid/view/ViewGroup;)Lp1;
    .locals 3

    .line 1
    iget-object v0, p0, Lg1;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lg1;->c:Landroid/view/LayoutInflater;

    sget v1, Lr;->abc_expanded_menu_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/view/menu/ExpandedMenuView;

    iput-object p1, p0, Lg1;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 3
    iget-object p1, p0, Lg1;->j:Lg1$a;

    if-nez p1, :cond_0

    .line 4
    new-instance p1, Lg1$a;

    invoke-direct {p1, p0}, Lg1$a;-><init>(Lg1;)V

    iput-object p1, p0, Lg1;->j:Lg1$a;

    .line 5
    :cond_0
    iget-object p1, p0, Lg1;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v0, p0, Lg1;->j:Lg1$a;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6
    iget-object p1, p0, Lg1;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    invoke-virtual {p1, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 7
    :cond_1
    iget-object p1, p0, Lg1;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    return-object p1
.end method

.method public d(Landroid/content/Context;Li1;)V
    .locals 2

    .line 1
    iget v0, p0, Lg1;->g:I

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/view/ContextThemeWrapper;

    iget v1, p0, Lg1;->g:I

    invoke-direct {v0, p1, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lg1;->b:Landroid/content/Context;

    .line 3
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lg1;->c:Landroid/view/LayoutInflater;

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lg1;->b:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 5
    iput-object p1, p0, Lg1;->b:Landroid/content/Context;

    .line 6
    iget-object v0, p0, Lg1;->c:Landroid/view/LayoutInflater;

    if-nez v0, :cond_1

    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lg1;->c:Landroid/view/LayoutInflater;

    .line 8
    :cond_1
    :goto_0
    iput-object p2, p0, Lg1;->d:Li1;

    .line 9
    iget-object p1, p0, Lg1;->j:Lg1$a;

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {p1}, Lg1$a;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method

.method public e(Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Lg1;->h(Landroid/os/Bundle;)V

    return-void
.end method

.method public f(Lt1;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Li1;->hasVisibleItems()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    new-instance v0, Lj1;

    invoke-direct {v0, p1}, Lj1;-><init>(Li1;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj1;->d(Landroid/os/IBinder;)V

    .line 3
    iget-object v0, p0, Lg1;->i:Lo1$a;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0, p1}, Lo1$a;->c(Li1;)Z

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public g(Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lg1;->j:Lg1$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg1$a;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, Lg1;->k:I

    return v0
.end method

.method public h(Landroid/os/Bundle;)V
    .locals 1

    const v0, 0x1411

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lg1;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    invoke-virtual {v0, p1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    :cond_0
    return-void
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j()Landroid/os/Parcelable;
    .locals 1

    .line 1
    iget-object v0, p0, Lg1;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 3
    invoke-virtual {p0, v0}, Lg1;->n(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public k(Li1;Lk1;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public l(Li1;Lk1;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public m(Lo1$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg1;->i:Lo1$a;

    return-void
.end method

.method public n(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 2
    iget-object v1, p0, Lg1;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1, v0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    :cond_0
    const v1, 0x1412

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lg1;->d:Li1;

    iget-object p2, p0, Lg1;->j:Lg1$a;

    invoke-virtual {p2, p3}, Lg1$a;->b(I)Lk1;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, Li1;->O(Landroid/view/MenuItem;Lo1;I)Z

    return-void
.end method
