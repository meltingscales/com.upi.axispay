.class public Lvg;
.super Lc0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvg$d;,
        Lvg$b;,
        Lvg$c;
    }
.end annotation


# instance fields
.field public final d:Lyh;

.field public final e:Lvg$b;

.field public f:Landroid/widget/TextView;

.field public g:Lxh;

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lyh$i;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lvg$c;

.field public j:Landroid/widget/ListView;

.field public k:Z

.field public l:J

.field public final m:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lvg;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {p1, p2, v0}, Ldh;->b(Landroid/content/Context;IZ)Landroid/content/Context;

    move-result-object p1

    .line 3
    invoke-static {p1}, Ldh;->c(Landroid/content/Context;)I

    move-result p2

    .line 4
    invoke-direct {p0, p1, p2}, Lc0;-><init>(Landroid/content/Context;I)V

    .line 5
    sget-object p1, Lxh;->c:Lxh;

    iput-object p1, p0, Lvg;->g:Lxh;

    .line 6
    new-instance p1, Lvg$a;

    invoke-direct {p1, p0}, Lvg$a;-><init>(Lvg;)V

    iput-object p1, p0, Lvg;->m:Landroid/os/Handler;

    .line 7
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 8
    invoke-static {p1}, Lyh;->g(Landroid/content/Context;)Lyh;

    move-result-object p1

    iput-object p1, p0, Lvg;->d:Lyh;

    .line 9
    new-instance p1, Lvg$b;

    invoke-direct {p1, p0}, Lvg$b;-><init>(Lvg;)V

    iput-object p1, p0, Lvg;->e:Lvg$b;

    return-void
.end method


# virtual methods
.method public e(Lyh$i;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lyh$i;->v()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lyh$i;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvg;->g:Lxh;

    .line 2
    invoke-virtual {p1, v0}, Lyh$i;->D(Lxh;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lyh$i;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_1

    .line 2
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyh$i;

    invoke-virtual {p0, v0}, Lvg;->e(Lyh$i;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public g()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lvg;->k:Z

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lvg;->d:Lyh;

    invoke-virtual {v1}, Lyh;->j()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 3
    invoke-virtual {p0, v0}, Lvg;->f(Ljava/util/List;)V

    .line 4
    sget-object v1, Lvg$d;->b:Lvg$d;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lvg;->l:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x12c

    cmp-long v1, v1, v3

    if-ltz v1, :cond_0

    .line 6
    invoke-virtual {p0, v0}, Lvg;->k(Ljava/util/List;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, p0, Lvg;->m:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 8
    iget-object v1, p0, Lvg;->m:Landroid/os/Handler;

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-wide v5, p0, Lvg;->l:J

    add-long/2addr v5, v3

    invoke-virtual {v1, v0, v5, v6}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public h(Lxh;)V
    .locals 3

    if-eqz p1, :cond_2

    .line 1
    iget-object v0, p0, Lvg;->g:Lxh;

    invoke-virtual {v0, p1}, Lxh;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iput-object p1, p0, Lvg;->g:Lxh;

    .line 3
    iget-boolean v0, p0, Lvg;->k:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lvg;->d:Lyh;

    iget-object v1, p0, Lvg;->e:Lvg$b;

    invoke-virtual {v0, v1}, Lyh;->o(Lyh$b;)V

    .line 5
    iget-object v0, p0, Lvg;->d:Lyh;

    iget-object v1, p0, Lvg;->e:Lvg$b;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Lyh;->b(Lxh;Lyh$b;I)V

    .line 6
    :cond_0
    invoke-virtual {p0}, Lvg;->g()V

    :cond_1
    return-void

    .line 7
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x12aa

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lah;->b(Landroid/content/Context;)I

    move-result v1

    const/4 v2, -0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    return-void
.end method

.method public k(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lyh$i;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lvg;->l:J

    .line 2
    iget-object v0, p0, Lvg;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3
    iget-object v0, p0, Lvg;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 4
    iget-object p1, p0, Lvg;->i:Lvg$c;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lvg;->k:Z

    .line 3
    iget-object v1, p0, Lvg;->d:Lyh;

    iget-object v2, p0, Lvg;->g:Lxh;

    iget-object v3, p0, Lvg;->e:Lvg$b;

    invoke-virtual {v1, v2, v3, v0}, Lyh;->b(Lxh;Lyh$b;I)V

    .line 4
    invoke-virtual {p0}, Lvg;->g()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lc0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    sget p1, Lqg;->mr_chooser_dialog:I

    invoke-virtual {p0, p1}, Lc0;->setContentView(I)V

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lvg;->h:Ljava/util/ArrayList;

    .line 4
    new-instance p1, Lvg$c;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lvg;->h:Ljava/util/ArrayList;

    invoke-direct {p1, v0, v1}, Lvg$c;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object p1, p0, Lvg;->i:Lvg$c;

    .line 5
    sget p1, Lng;->mr_chooser_list:I

    invoke-virtual {p0, p1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    iput-object p1, p0, Lvg;->j:Landroid/widget/ListView;

    .line 6
    iget-object v0, p0, Lvg;->i:Lvg$c;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 7
    iget-object p1, p0, Lvg;->j:Landroid/widget/ListView;

    iget-object v0, p0, Lvg;->i:Lvg$c;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 8
    iget-object p1, p0, Lvg;->j:Landroid/widget/ListView;

    const v0, 0x1020004

    invoke-virtual {p0, v0}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 9
    sget p1, Lng;->mr_chooser_title:I

    invoke-virtual {p0, p1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lvg;->f:Landroid/widget/TextView;

    .line 10
    invoke-virtual {p0}, Lvg;->j()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lvg;->k:Z

    .line 2
    iget-object v0, p0, Lvg;->d:Lyh;

    iget-object v1, p0, Lvg;->e:Lvg$b;

    invoke-virtual {v0, v1}, Lyh;->o(Lyh$b;)V

    .line 3
    iget-object v0, p0, Lvg;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 4
    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    return-void
.end method

.method public setTitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lvg;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvg;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
