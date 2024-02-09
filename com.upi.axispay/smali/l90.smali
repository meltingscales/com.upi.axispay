.class public Ll90;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll90$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Ll90$d;",
        ">;"
    }
.end annotation


# instance fields
.field public d:Landroid/app/Activity;

.field public e:Lng0;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpg0;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Lpg0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p2, p0, Ll90;->f:Ljava/util/List;

    .line 3
    iput-object p1, p0, Ll90;->d:Landroid/app/Activity;

    .line 4
    instance-of p2, p1, Lng0;

    if-eqz p2, :cond_0

    .line 5
    check-cast p1, Lng0;

    iput-object p1, p0, Ll90;->e:Lng0;

    :cond_0
    return-void
.end method

.method public static synthetic w(Ll90;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ll90;->g:Z

    return p0
.end method

.method public static synthetic x(Ll90;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Ll90;->g:Z

    return p1
.end method


# virtual methods
.method public A(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll90;->e:Lng0;

    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Ll90;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Ll90$d;

    invoke-virtual {p0, p1, p2}, Ll90;->y(Ll90$d;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ll90;->z(Landroid/view/ViewGroup;I)Ll90$d;

    move-result-object p1

    return-object p1
.end method

.method public y(Ll90$d;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Ll90;->f:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpg0;

    .line 2
    iget-object v0, p1, Ll90$d;->x:Landroid/widget/ImageView;

    invoke-static {p1}, Ll90$d;->O(Ll90$d;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p2}, Lpg0;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3
    iget-object v0, p1, Ll90$d;->v:Landroid/widget/TextView;

    invoke-virtual {p2}, Lpg0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p1, Ll90$d;->w:Landroid/widget/TextView;

    invoke-virtual {p2}, Lpg0;->g()Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iput-boolean v3, p0, Ll90;->g:Z

    .line 6
    invoke-virtual {p2}, Lpg0;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p1, Ll90$d;->y:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8
    iget-object v0, p1, Ll90$d;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 9
    invoke-virtual {p2}, Lpg0;->b()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpg0;

    .line 11
    iget-object v2, p0, Ll90;->d:Landroid/app/Activity;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v4, 0x7f0d00db

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 12
    invoke-virtual {v1}, Lpg0;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    new-instance v4, Ll90$a;

    invoke-direct {v4, p0, v1}, Ll90$a;-><init>(Ll90;Lpg0;)V

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object v1, p1, Ll90$d;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 15
    :cond_1
    iget-object v0, p1, Ll90$d;->y:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 16
    :cond_2
    invoke-static {p1}, Ll90$d;->O(Ll90$d;)Landroid/view/View;

    move-result-object v0

    new-instance v1, Ll90$b;

    invoke-direct {v1, p0, p2, p1}, Ll90$b;-><init>(Ll90;Lpg0;Ll90$d;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    invoke-static {p1}, Ll90$d;->O(Ll90$d;)Landroid/view/View;

    move-result-object p1

    new-instance p2, Ll90$c;

    invoke-direct {p2, p0}, Ll90$c;-><init>(Ll90;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public z(Landroid/view/ViewGroup;I)Ll90$d;
    .locals 2

    .line 1
    iget-object p2, p0, Ll90;->d:Landroid/app/Activity;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d00dc

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Ll90$d;

    invoke-direct {p2, p0, p1}, Ll90$d;-><init>(Ll90;Landroid/view/View;)V

    return-object p2
.end method
