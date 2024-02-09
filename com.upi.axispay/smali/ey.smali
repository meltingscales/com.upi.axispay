.class public Ley;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lo1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ley$h;,
        Ley$d;,
        Ley$f;,
        Ley$g;,
        Ley$e;,
        Ley$c;,
        Ley$b;,
        Ley$j;,
        Ley$k;,
        Ley$i;,
        Ley$l;
    }
.end annotation


# instance fields
.field public b:Lcom/google/android/material/internal/NavigationMenuView;

.field public c:Landroid/widget/LinearLayout;

.field public d:Lo1$a;

.field public e:Li1;

.field public f:I

.field public g:Ley$c;

.field public h:Landroid/view/LayoutInflater;

.field public i:I

.field public j:Z

.field public k:Landroid/content/res/ColorStateList;

.field public l:Landroid/content/res/ColorStateList;

.field public m:Landroid/graphics/drawable/Drawable;

.field public n:I

.field public o:I

.field public p:I

.field public q:Z

.field public r:Z

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public final w:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ley;->r:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Ley;->v:I

    .line 4
    new-instance v0, Ley$a;

    invoke-direct {v0, p0}, Ley$a;-><init>(Ley;)V

    iput-object v0, p0, Ley;->w:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public static synthetic a(Ley;)I
    .locals 0

    .line 1
    iget p0, p0, Ley;->s:I

    return p0
.end method


# virtual methods
.method public A(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ley;->m:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Ley;->g(Z)V

    return-void
.end method

.method public B(I)V
    .locals 0

    .line 1
    iput p1, p0, Ley;->n:I

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Ley;->g(Z)V

    return-void
.end method

.method public C(I)V
    .locals 0

    .line 1
    iput p1, p0, Ley;->o:I

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Ley;->g(Z)V

    return-void
.end method

.method public D(I)V
    .locals 1

    .line 1
    iget v0, p0, Ley;->p:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Ley;->p:I

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Ley;->q:Z

    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Ley;->g(Z)V

    :cond_0
    return-void
.end method

.method public E(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ley;->l:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Ley;->g(Z)V

    return-void
.end method

.method public F(I)V
    .locals 0

    .line 1
    iput p1, p0, Ley;->s:I

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Ley;->g(Z)V

    return-void
.end method

.method public G(I)V
    .locals 0

    .line 1
    iput p1, p0, Ley;->i:I

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Ley;->j:Z

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Ley;->g(Z)V

    return-void
.end method

.method public H(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ley;->k:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Ley;->g(Z)V

    return-void
.end method

.method public I(I)V
    .locals 1

    .line 1
    iput p1, p0, Ley;->v:I

    .line 2
    iget-object v0, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setOverScrollMode(I)V

    :cond_0
    return-void
.end method

.method public J(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ley;->g:Ley$c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ley$c;->G(Z)V

    :cond_0
    return-void
.end method

.method public final K()V
    .locals 4

    .line 1
    iget-object v0, p0, Ley;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ley;->r:Z

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Ley;->t:I

    goto :goto_0

    :cond_0
    move v0, v1

    .line 3
    :goto_0
    iget-object v2, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    invoke-virtual {v2, v1, v0, v1, v3}, Landroid/view/ViewGroup;->setPadding(IIII)V

    return-void
.end method

.method public b(Li1;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ley;->d:Lo1$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lo1$a;->b(Li1;Z)V

    :cond_0
    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ley;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 2
    iget-object p1, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v1, v1, v0}, Landroid/view/ViewGroup;->setPadding(IIII)V

    return-void
.end method

.method public d(Landroid/content/Context;Li1;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Ley;->h:Landroid/view/LayoutInflater;

    .line 2
    iput-object p2, p0, Ley;->e:Li1;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 4
    sget p2, Lkv;->design_navigation_separator_vertical_padding:I

    .line 5
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    iput p1, p0, Ley;->u:I

    return-void
.end method

.method public e(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_2

    .line 2
    check-cast p1, Landroid/os/Bundle;

    const v0, 0x14e2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->restoreHierarchyState(Landroid/util/SparseArray;)V

    :cond_0
    const v0, 0x14e3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v1, p0, Ley;->g:Ley$c;

    invoke-virtual {v1, v0}, Ley$c;->E(Landroid/os/Bundle;)V

    :cond_1
    const v0, 0x14e4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 8
    iget-object v0, p0, Ley;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->restoreHierarchyState(Landroid/util/SparseArray;)V

    :cond_2
    return-void
.end method

.method public f(Lt1;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public g(Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Ley;->g:Ley$c;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Ley$c;->H()V

    :cond_0
    return-void
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, Ley;->f:I

    return v0
.end method

.method public h(Lic;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lic;->l()I

    move-result v0

    .line 2
    iget v1, p0, Ley;->t:I

    if-eq v1, v0, :cond_0

    .line 3
    iput v0, p0, Ley;->t:I

    .line 4
    invoke-virtual {p0}, Ley;->K()V

    .line 5
    :cond_0
    iget-object v0, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    invoke-virtual {p1}, Lic;->i()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v3, v2}, Landroid/view/ViewGroup;->setPadding(IIII)V

    .line 6
    iget-object v0, p0, Ley;->c:Landroid/widget/LinearLayout;

    invoke-static {v0, p1}, Lac;->h(Landroid/view/View;Lic;)Lic;

    return-void
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    iget-object v1, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    if-eqz v1, :cond_0

    .line 3
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 4
    iget-object v2, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->saveHierarchyState(Landroid/util/SparseArray;)V

    const v2, 0x14e5

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 6
    :cond_0
    iget-object v1, p0, Ley;->g:Ley$c;

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {v1}, Ley$c;->x()Landroid/os/Bundle;

    move-result-object v1

    const v2, 0x14e6

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 8
    :cond_1
    iget-object v1, p0, Ley;->c:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_2

    .line 9
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 10
    iget-object v2, p0, Ley;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->saveHierarchyState(Landroid/util/SparseArray;)V

    const v2, 0x14e7

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_2
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

.method public n()Lk1;
    .locals 1

    .line 1
    iget-object v0, p0, Ley;->g:Ley$c;

    invoke-virtual {v0}, Ley$c;->y()Lk1;

    move-result-object v0

    return-object v0
.end method

.method public o()I
    .locals 1

    .line 1
    iget-object v0, p0, Ley;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    return v0
.end method

.method public p()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Ley;->m:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public q()I
    .locals 1

    .line 1
    iget v0, p0, Ley;->n:I

    return v0
.end method

.method public r()I
    .locals 1

    .line 1
    iget v0, p0, Ley;->o:I

    return v0
.end method

.method public s()I
    .locals 1

    .line 1
    iget v0, p0, Ley;->s:I

    return v0
.end method

.method public t()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ley;->k:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public u()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ley;->l:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public v(Landroid/view/ViewGroup;)Lp1;
    .locals 3

    .line 1
    iget-object v0, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    if-nez v0, :cond_2

    .line 2
    iget-object v0, p0, Ley;->h:Landroid/view/LayoutInflater;

    sget v1, Lov;->design_navigation_menu:I

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/internal/NavigationMenuView;

    iput-object p1, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    .line 4
    new-instance v0, Ley$h;

    iget-object v1, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-direct {v0, p0, v1}, Ley$h;-><init>(Ley;Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Lfj;)V

    .line 5
    iget-object p1, p0, Ley;->g:Ley$c;

    if-nez p1, :cond_0

    .line 6
    new-instance p1, Ley$c;

    invoke-direct {p1, p0}, Ley$c;-><init>(Ley;)V

    iput-object p1, p0, Ley;->g:Ley$c;

    .line 7
    :cond_0
    iget p1, p0, Ley;->v:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    .line 8
    iget-object v0, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setOverScrollMode(I)V

    .line 9
    :cond_1
    iget-object p1, p0, Ley;->h:Landroid/view/LayoutInflater;

    sget v0, Lov;->design_navigation_item_header:I

    iget-object v1, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    .line 10
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Ley;->c:Landroid/widget/LinearLayout;

    .line 11
    iget-object p1, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    iget-object v0, p0, Ley;->g:Ley$c;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 12
    :cond_2
    iget-object p1, p0, Ley;->b:Lcom/google/android/material/internal/NavigationMenuView;

    return-object p1
.end method

.method public w(I)Landroid/view/View;
    .locals 3

    .line 1
    iget-object v0, p0, Ley;->h:Landroid/view/LayoutInflater;

    iget-object v1, p0, Ley;->c:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Ley;->c(Landroid/view/View;)V

    return-object p1
.end method

.method public x(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ley;->r:Z

    if-eq v0, p1, :cond_0

    .line 2
    iput-boolean p1, p0, Ley;->r:Z

    .line 3
    invoke-virtual {p0}, Ley;->K()V

    :cond_0
    return-void
.end method

.method public y(Lk1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ley;->g:Ley$c;

    invoke-virtual {v0, p1}, Ley$c;->F(Lk1;)V

    return-void
.end method

.method public z(I)V
    .locals 0

    .line 1
    iput p1, p0, Ley;->f:I

    return-void
.end method
