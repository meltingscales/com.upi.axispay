.class public Lfn;
.super Lbn;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfn$b;
    }
.end annotation


# instance fields
.field public K:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lbn;",
            ">;"
        }
    .end annotation
.end field

.field public L:Z

.field public M:I

.field public N:Z

.field public O:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lbn;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lfn;->L:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lfn;->N:Z

    .line 5
    iput v0, p0, Lfn;->O:I

    return-void
.end method


# virtual methods
.method public M(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lbn;->M(Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    iget-object v2, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbn;

    invoke-virtual {v2, p1}, Lbn;->M(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic O(Lbn$f;)Lbn;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfn;->h0(Lbn$f;)Lfn;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic P(Landroid/view/View;)Lbn;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfn;->i0(Landroid/view/View;)Lfn;

    move-result-object p1

    return-object p1
.end method

.method public Q(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lbn;->Q(Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    iget-object v2, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbn;

    invoke-virtual {v2, p1}, Lbn;->Q(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public S()V
    .locals 4

    .line 1
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lbn;->Z()V

    .line 3
    invoke-virtual {p0}, Lbn;->o()V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lfn;->n0()V

    .line 5
    iget-boolean v0, p0, Lfn;->L:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 6
    :goto_0
    iget-object v1, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 7
    iget-object v1, p0, Lfn;->K:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbn;

    .line 8
    iget-object v2, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbn;

    .line 9
    new-instance v3, Lfn$a;

    invoke-direct {v3, p0, v2}, Lfn$a;-><init>(Lfn;Lbn;)V

    invoke-virtual {v1, v3}, Lbn;->a(Lbn$f;)Lbn;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 10
    :cond_1
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbn;

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {v0}, Lbn;->S()V

    goto :goto_2

    .line 12
    :cond_2
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbn;

    .line 13
    invoke-virtual {v1}, Lbn;->S()V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public bridge synthetic T(J)Lbn;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lfn;->j0(J)Lfn;

    return-object p0
.end method

.method public U(Lbn$e;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lbn;->U(Lbn$e;)V

    .line 2
    iget v0, p0, Lfn;->O:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lfn;->O:I

    .line 3
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    iget-object v2, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbn;

    invoke-virtual {v2, p1}, Lbn;->U(Lbn$e;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic V(Landroid/animation/TimeInterpolator;)Lbn;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfn;->k0(Landroid/animation/TimeInterpolator;)Lfn;

    move-result-object p1

    return-object p1
.end method

.method public W(Lvm;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lbn;->W(Lvm;)V

    .line 2
    iget v0, p0, Lfn;->O:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lfn;->O:I

    .line 3
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 5
    iget-object v1, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbn;

    invoke-virtual {v1, p1}, Lbn;->W(Lvm;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public X(Len;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lbn;->X(Len;)V

    .line 2
    iget v0, p0, Lfn;->O:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lfn;->O:I

    .line 3
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    iget-object v2, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbn;

    invoke-virtual {v2, p1}, Lbn;->X(Len;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic Y(J)Lbn;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lfn;->m0(J)Lfn;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lbn$f;)Lbn;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfn;->b0(Lbn$f;)Lfn;

    move-result-object p1

    return-object p1
.end method

.method public a0(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-super {p0, p1}, Lbn;->a0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    :goto_0
    iget-object v2, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x175c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbn;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v4, 0x175d

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lbn;->a0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic b(Landroid/view/View;)Lbn;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfn;->c0(Landroid/view/View;)Lfn;

    move-result-object p1

    return-object p1
.end method

.method public b0(Lbn$f;)Lfn;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbn;->a(Lbn$f;)Lbn;

    move-object p1, p0

    check-cast p1, Lfn;

    return-object p1
.end method

.method public c0(Landroid/view/View;)Lfn;
    .locals 2

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbn;

    invoke-virtual {v1, p1}, Lbn;->b(Landroid/view/View;)Lbn;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0, p1}, Lbn;->b(Landroid/view/View;)Lbn;

    move-object p1, p0

    check-cast p1, Lfn;

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lfn;->l()Lbn;

    move-result-object v0

    return-object v0
.end method

.method public d0(Lbn;)Lfn;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lfn;->e0(Lbn;)V

    .line 2
    iget-wide v0, p0, Lbn;->d:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    .line 3
    invoke-virtual {p1, v0, v1}, Lbn;->T(J)Lbn;

    .line 4
    :cond_0
    iget v0, p0, Lfn;->O:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lbn;->r()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbn;->V(Landroid/animation/TimeInterpolator;)Lbn;

    .line 6
    :cond_1
    iget v0, p0, Lfn;->O:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {p0}, Lbn;->v()Len;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbn;->X(Len;)V

    .line 8
    :cond_2
    iget v0, p0, Lfn;->O:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {p0}, Lbn;->u()Lvm;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbn;->W(Lvm;)V

    .line 10
    :cond_3
    iget v0, p0, Lfn;->O:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    .line 11
    invoke-virtual {p0}, Lbn;->q()Lbn$e;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbn;->U(Lbn$e;)V

    :cond_4
    return-object p0
.end method

.method public final e0(Lbn;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    iput-object p0, p1, Lbn;->s:Lfn;

    return-void
.end method

.method public f(Lhn;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lhn;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lbn;->F(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbn;

    .line 3
    iget-object v2, p1, Lhn;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Lbn;->F(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v1, p1}, Lbn;->f(Lhn;)V

    .line 5
    iget-object v2, p1, Lhn;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public f0(I)Lbn;
    .locals 1

    if-ltz p1, :cond_1

    .line 1
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbn;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public g0()I
    .locals 1

    .line 1
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public h(Lhn;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lbn;->h(Lhn;)V

    .line 2
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    iget-object v2, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbn;

    invoke-virtual {v2, p1}, Lbn;->h(Lhn;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h0(Lbn$f;)Lfn;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbn;->O(Lbn$f;)Lbn;

    move-object p1, p0

    check-cast p1, Lfn;

    return-object p1
.end method

.method public i(Lhn;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lhn;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lbn;->F(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbn;

    .line 3
    iget-object v2, p1, Lhn;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Lbn;->F(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v1, p1}, Lbn;->i(Lhn;)V

    .line 5
    iget-object v2, p1, Lhn;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i0(Landroid/view/View;)Lfn;
    .locals 2

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbn;

    invoke-virtual {v1, p1}, Lbn;->P(Landroid/view/View;)Lbn;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0, p1}, Lbn;->P(Landroid/view/View;)Lbn;

    move-object p1, p0

    check-cast p1, Lfn;

    return-object p1
.end method

.method public j0(J)Lfn;
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Lbn;->T(J)Lbn;

    .line 2
    iget-wide v0, p0, Lbn;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    iget-object v2, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbn;

    invoke-virtual {v2, p1, p2}, Lbn;->T(J)Lbn;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public k0(Landroid/animation/TimeInterpolator;)Lfn;
    .locals 3

    .line 1
    iget v0, p0, Lfn;->O:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lfn;->O:I

    .line 2
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    iget-object v2, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbn;

    invoke-virtual {v2, p1}, Lbn;->V(Landroid/animation/TimeInterpolator;)Lbn;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 5
    :cond_0
    invoke-super {p0, p1}, Lbn;->V(Landroid/animation/TimeInterpolator;)Lbn;

    move-object p1, p0

    check-cast p1, Lfn;

    return-object p1
.end method

.method public l()Lbn;
    .locals 4

    .line 1
    invoke-super {p0}, Lbn;->l()Lbn;

    move-result-object v0

    check-cast v0, Lfn;

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lfn;->K:Ljava/util/ArrayList;

    .line 3
    iget-object v1, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 4
    iget-object v3, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbn;

    invoke-virtual {v3}, Lbn;->l()Lbn;

    move-result-object v3

    invoke-virtual {v0, v3}, Lfn;->e0(Lbn;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public l0(I)Lfn;
    .locals 3

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lfn;->L:Z

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x175e

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_1
    iput-boolean v0, p0, Lfn;->L:Z

    :goto_0
    return-object p0
.end method

.method public m0(J)Lfn;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lbn;->Y(J)Lbn;

    move-object p1, p0

    check-cast p1, Lfn;

    return-object p1
.end method

.method public n(Landroid/view/ViewGroup;Lin;Lin;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lin;",
            "Lin;",
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 1
    invoke-virtual {p0}, Lbn;->x()J

    move-result-wide v1

    .line 2
    iget-object v3, v0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    .line 3
    iget-object v5, v0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lbn;

    const-wide/16 v7, 0x0

    cmp-long v5, v1, v7

    if-lez v5, :cond_2

    .line 4
    iget-boolean v5, v0, Lfn;->L:Z

    if-nez v5, :cond_0

    if-nez v4, :cond_2

    .line 5
    :cond_0
    invoke-virtual {v6}, Lbn;->x()J

    move-result-wide v9

    cmp-long v5, v9, v7

    if-lez v5, :cond_1

    add-long/2addr v9, v1

    .line 6
    invoke-virtual {v6, v9, v10}, Lbn;->Y(J)Lbn;

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {v6, v1, v2}, Lbn;->Y(J)Lbn;

    :cond_2
    :goto_1
    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    .line 8
    invoke-virtual/range {v6 .. v11}, Lbn;->n(Landroid/view/ViewGroup;Lin;Lin;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final n0()V
    .locals 3

    .line 1
    new-instance v0, Lfn$b;

    invoke-direct {v0, p0}, Lfn$b;-><init>(Lfn;)V

    .line 2
    iget-object v1, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbn;

    .line 3
    invoke-virtual {v2, v0}, Lbn;->a(Lbn$f;)Lbn;

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lfn;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lfn;->M:I

    return-void
.end method
