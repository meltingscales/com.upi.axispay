.class public Lyh$i;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyh$i$a;
    }
.end annotation


# instance fields
.field public final a:Lyh$h;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Landroid/net/Uri;

.field public g:Z

.field public h:I

.field public i:Z

.field public final j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/content/IntentFilter;",
            ">;"
        }
    .end annotation
.end field

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:Landroid/os/Bundle;

.field public s:Landroid/content/IntentSender;

.field public t:Lsh;

.field public u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lyh$i;",
            ">;"
        }
    .end annotation
.end field

.field public v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Luh$b$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lyh$h;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lyh$i;->j:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lyh$i;->q:I

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lyh$i;->u:Ljava/util/List;

    .line 5
    iput-object p1, p0, Lyh$i;->a:Lyh$h;

    .line 6
    iput-object p2, p0, Lyh$i;->b:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lyh$i;->c:Ljava/lang/String;

    return-void
.end method

.method public static C(Lyh$i;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyh$i;->q()Luh;

    move-result-object p0

    invoke-virtual {p0}, Luh;->r()Luh$d;

    move-result-object p0

    invoke-virtual {p0}, Luh$d;->b()Ljava/lang/String;

    move-result-object p0

    const v0, 0xc3a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lyh$i;->t:Lsh;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lyh$i;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public B()Z
    .locals 1

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0}, Lyh$e;->t()Lyh$i;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public D(Lxh;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    iget-object v0, p0, Lyh$i;->j:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Lxh;->h(Ljava/util/List;)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0xc3b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public E(Lsh;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lyh$i;->t:Lsh;

    if-eq v0, p1, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lyh$i;->J(Lsh;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public F(I)V
    .locals 3

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    iget v1, p0, Lyh$i;->p:I

    const/4 v2, 0x0

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {v0, p0, p1}, Lyh$e;->D(Lyh$i;I)V

    return-void
.end method

.method public G(I)V
    .locals 1

    .line 1
    invoke-static {}, Lyh;->d()V

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0, p0, p1}, Lyh$e;->E(Lyh$i;I)V

    :cond_0
    return-void
.end method

.method public H()V
    .locals 2

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    const/4 v1, 0x3

    invoke-virtual {v0, p0, v1}, Lyh$e;->F(Lyh$i;I)V

    return-void
.end method

.method public I(Ljava/lang/String;)Z
    .locals 4

    if-eqz p1, :cond_2

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    iget-object v0, p0, Lyh$i;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    .line 3
    iget-object v3, p0, Lyh$i;->j:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/IntentFilter;

    invoke-virtual {v3, p1}, Landroid/content/IntentFilter;->hasCategory(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1

    .line 4
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0xc3c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public J(Lsh;)I
    .locals 7

    .line 1
    iput-object p1, p0, Lyh$i;->t:Lsh;

    const/4 v0, 0x0

    if-eqz p1, :cond_14

    .line 2
    iget-object v1, p0, Lyh$i;->d:Ljava/lang/String;

    invoke-virtual {p1}, Lsh;->o()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lya;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lsh;->o()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lyh$i;->d:Ljava/lang/String;

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v0

    .line 4
    :goto_0
    iget-object v3, p0, Lyh$i;->e:Ljava/lang/String;

    invoke-virtual {p1}, Lsh;->g()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lya;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 5
    invoke-virtual {p1}, Lsh;->g()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lyh$i;->e:Ljava/lang/String;

    or-int/lit8 v1, v1, 0x1

    .line 6
    :cond_1
    iget-object v3, p0, Lyh$i;->f:Landroid/net/Uri;

    invoke-virtual {p1}, Lsh;->k()Landroid/net/Uri;

    move-result-object v4

    invoke-static {v3, v4}, Lya;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 7
    invoke-virtual {p1}, Lsh;->k()Landroid/net/Uri;

    move-result-object v3

    iput-object v3, p0, Lyh$i;->f:Landroid/net/Uri;

    or-int/lit8 v1, v1, 0x1

    .line 8
    :cond_2
    iget-boolean v3, p0, Lyh$i;->g:Z

    invoke-virtual {p1}, Lsh;->w()Z

    move-result v4

    if-eq v3, v4, :cond_3

    .line 9
    invoke-virtual {p1}, Lsh;->w()Z

    move-result v3

    iput-boolean v3, p0, Lyh$i;->g:Z

    or-int/lit8 v1, v1, 0x1

    .line 10
    :cond_3
    iget v3, p0, Lyh$i;->h:I

    invoke-virtual {p1}, Lsh;->e()I

    move-result v4

    if-eq v3, v4, :cond_4

    .line 11
    invoke-virtual {p1}, Lsh;->e()I

    move-result v3

    iput v3, p0, Lyh$i;->h:I

    or-int/lit8 v1, v1, 0x1

    .line 12
    :cond_4
    iget-object v3, p0, Lyh$i;->j:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lsh;->f()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0, v3, v4}, Lyh$i;->z(Ljava/util/List;Ljava/util/List;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 13
    iget-object v3, p0, Lyh$i;->j:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 14
    iget-object v3, p0, Lyh$i;->j:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lsh;->f()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    or-int/lit8 v1, v1, 0x1

    .line 15
    :cond_5
    iget v3, p0, Lyh$i;->k:I

    invoke-virtual {p1}, Lsh;->q()I

    move-result v4

    if-eq v3, v4, :cond_6

    .line 16
    invoke-virtual {p1}, Lsh;->q()I

    move-result v3

    iput v3, p0, Lyh$i;->k:I

    or-int/lit8 v1, v1, 0x1

    .line 17
    :cond_6
    iget v3, p0, Lyh$i;->l:I

    invoke-virtual {p1}, Lsh;->p()I

    move-result v4

    if-eq v3, v4, :cond_7

    .line 18
    invoke-virtual {p1}, Lsh;->p()I

    move-result v3

    iput v3, p0, Lyh$i;->l:I

    or-int/lit8 v1, v1, 0x1

    .line 19
    :cond_7
    iget v3, p0, Lyh$i;->m:I

    invoke-virtual {p1}, Lsh;->h()I

    move-result v4

    if-eq v3, v4, :cond_8

    .line 20
    invoke-virtual {p1}, Lsh;->h()I

    move-result v3

    iput v3, p0, Lyh$i;->m:I

    or-int/lit8 v1, v1, 0x1

    .line 21
    :cond_8
    iget v3, p0, Lyh$i;->n:I

    invoke-virtual {p1}, Lsh;->u()I

    move-result v4

    if-eq v3, v4, :cond_9

    .line 22
    invoke-virtual {p1}, Lsh;->u()I

    move-result v3

    iput v3, p0, Lyh$i;->n:I

    or-int/lit8 v1, v1, 0x3

    .line 23
    :cond_9
    iget v3, p0, Lyh$i;->o:I

    invoke-virtual {p1}, Lsh;->t()I

    move-result v4

    if-eq v3, v4, :cond_a

    .line 24
    invoke-virtual {p1}, Lsh;->t()I

    move-result v3

    iput v3, p0, Lyh$i;->o:I

    or-int/lit8 v1, v1, 0x3

    .line 25
    :cond_a
    iget v3, p0, Lyh$i;->p:I

    invoke-virtual {p1}, Lsh;->v()I

    move-result v4

    if-eq v3, v4, :cond_b

    .line 26
    invoke-virtual {p1}, Lsh;->v()I

    move-result v3

    iput v3, p0, Lyh$i;->p:I

    or-int/lit8 v1, v1, 0x3

    .line 27
    :cond_b
    iget v3, p0, Lyh$i;->q:I

    invoke-virtual {p1}, Lsh;->r()I

    move-result v4

    if-eq v3, v4, :cond_c

    .line 28
    invoke-virtual {p1}, Lsh;->r()I

    move-result v3

    iput v3, p0, Lyh$i;->q:I

    or-int/lit8 v1, v1, 0x5

    .line 29
    :cond_c
    iget-object v3, p0, Lyh$i;->r:Landroid/os/Bundle;

    invoke-virtual {p1}, Lsh;->i()Landroid/os/Bundle;

    move-result-object v4

    invoke-static {v3, v4}, Lya;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    .line 30
    invoke-virtual {p1}, Lsh;->i()Landroid/os/Bundle;

    move-result-object v3

    iput-object v3, p0, Lyh$i;->r:Landroid/os/Bundle;

    or-int/lit8 v1, v1, 0x1

    .line 31
    :cond_d
    iget-object v3, p0, Lyh$i;->s:Landroid/content/IntentSender;

    invoke-virtual {p1}, Lsh;->s()Landroid/content/IntentSender;

    move-result-object v4

    invoke-static {v3, v4}, Lya;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    .line 32
    invoke-virtual {p1}, Lsh;->s()Landroid/content/IntentSender;

    move-result-object v3

    iput-object v3, p0, Lyh$i;->s:Landroid/content/IntentSender;

    or-int/lit8 v1, v1, 0x1

    .line 33
    :cond_e
    iget-boolean v3, p0, Lyh$i;->i:Z

    invoke-virtual {p1}, Lsh;->a()Z

    move-result v4

    if-eq v3, v4, :cond_f

    .line 34
    invoke-virtual {p1}, Lsh;->a()Z

    move-result v3

    iput-boolean v3, p0, Lyh$i;->i:Z

    or-int/lit8 v1, v1, 0x5

    .line 35
    :cond_f
    invoke-virtual {p1}, Lsh;->j()Ljava/util/List;

    move-result-object p1

    .line 36
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 37
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    iget-object v5, p0, Lyh$i;->u:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-eq v4, v5, :cond_10

    move v0, v2

    .line 38
    :cond_10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_11
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 39
    sget-object v5, Lyh;->d:Lyh$e;

    invoke-virtual {p0}, Lyh$i;->p()Lyh$h;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Lyh$e;->u(Lyh$h;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 40
    sget-object v5, Lyh;->d:Lyh$e;

    invoke-virtual {v5, v4}, Lyh$e;->p(Ljava/lang/String;)Lyh$i;

    move-result-object v4

    if-eqz v4, :cond_11

    .line 41
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v0, :cond_11

    .line 42
    iget-object v5, p0, Lyh$i;->u:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    move v0, v2

    goto :goto_1

    :cond_12
    if-eqz v0, :cond_13

    .line 43
    iput-object v3, p0, Lyh$i;->u:Ljava/util/List;

    or-int/lit8 v0, v1, 0x1

    goto :goto_2

    :cond_13
    move v0, v1

    :cond_14
    :goto_2
    return v0
.end method

.method public K(Ljava/util/Collection;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Luh$b$c;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lyh$i;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    iget-object v0, p0, Lyh$i;->v:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lo4;

    invoke-direct {v0}, Lo4;-><init>()V

    iput-object v0, p0, Lyh$i;->v:Ljava/util/Map;

    .line 4
    :cond_0
    iget-object v0, p0, Lyh$i;->v:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 5
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh$b$c;

    .line 6
    invoke-virtual {p0, v0}, Lyh$i;->b(Luh$b$c;)Lyh$i;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    iget-object v2, p0, Lyh$i;->v:Ljava/util/Map;

    iget-object v3, v1, Lyh$i;->c:Ljava/lang/String;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-virtual {v0}, Luh$b$c;->c()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    .line 9
    invoke-virtual {v0}, Luh$b$c;->c()I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    .line 10
    :cond_3
    iget-object v0, p0, Lyh$i;->u:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 11
    :cond_4
    sget-object p1, Lyh;->d:Lyh$e;

    iget-object p1, p1, Lyh$e;->k:Lyh$e$b;

    const/16 v0, 0x103

    invoke-virtual {p1, v0, p0}, Lyh$e$b;->b(ILjava/lang/Object;)V

    return-void
.end method

.method public a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyh$i;->i:Z

    return v0
.end method

.method public b(Luh$b$c;)Lyh$i;
    .locals 1

    .line 1
    invoke-virtual {p1}, Luh$b$c;->b()Lsh;

    move-result-object p1

    invoke-virtual {p1}, Lsh;->l()Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Lyh$i;->p()Lyh$h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lyh$h;->a(Ljava/lang/String;)Lyh$i;

    move-result-object p1

    return-object p1
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lyh$i;->h:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lyh$i;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lyh$i;->b:Ljava/lang/String;

    return-object v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lyh$i;->m:I

    return v0
.end method

.method public g()Luh$b;
    .locals 2

    .line 1
    sget-object v0, Lyh;->d:Lyh$e;

    iget-object v0, v0, Lyh$e;->s:Luh$e;

    .line 2
    instance-of v1, v0, Luh$b;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Luh$b;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public h(Lyh$i;)Lyh$i$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lyh$i;->v:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v1, p1, Lyh$i;->c:Ljava/lang/String;

    .line 2
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lyh$i$a;

    iget-object v1, p0, Lyh$i;->v:Ljava/util/Map;

    iget-object p1, p1, Lyh$i;->c:Ljava/lang/String;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Luh$b$c;

    invoke-direct {v0, p1}, Lyh$i$a;-><init>(Luh$b$c;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public i()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lyh$i;->f:Landroid/net/Uri;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lyh$i;->c:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lyh$i;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lyh$i;->u:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lyh$i;->d:Ljava/lang/String;

    return-object v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget v0, p0, Lyh$i;->l:I

    return v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lyh$i;->k:I

    return v0
.end method

.method public o()I
    .locals 1

    .line 1
    iget v0, p0, Lyh$i;->q:I

    return v0
.end method

.method public p()Lyh$h;
    .locals 1

    .line 1
    iget-object v0, p0, Lyh$i;->a:Lyh$h;

    return-object v0
.end method

.method public q()Luh;
    .locals 1

    .line 1
    iget-object v0, p0, Lyh$i;->a:Lyh$h;

    invoke-virtual {v0}, Lyh$h;->e()Luh;

    move-result-object v0

    return-object v0
.end method

.method public r()I
    .locals 1

    .line 1
    iget v0, p0, Lyh$i;->o:I

    return v0
.end method

.method public s()I
    .locals 1

    .line 1
    iget v0, p0, Lyh$i;->n:I

    return v0
.end method

.method public t()I
    .locals 1

    .line 1
    iget v0, p0, Lyh$i;->p:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0xc3d

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lyh$i;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0xc3e

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lyh$i;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0xc3f

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lyh$i;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0xc40

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lyh$i;->f:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v2, 0xc41

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lyh$i;->g:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const v2, 0xc42

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lyh$i;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v2, 0xc43

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lyh$i;->i:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const v2, 0xc44

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lyh$i;->k:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v2, 0xc45

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lyh$i;->l:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v2, 0xc46

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lyh$i;->m:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v2, 0xc47

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lyh$i;->n:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v2, 0xc48

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lyh$i;->o:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v2, 0xc49

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lyh$i;->p:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v2, 0xc4a

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lyh$i;->q:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v2, 0xc4b

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lyh$i;->r:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v2, 0xc4c

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lyh$i;->s:Landroid/content/IntentSender;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v2, 0xc4d

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lyh$i;->a:Lyh$h;

    .line 3
    invoke-virtual {v2}, Lyh$h;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {p0}, Lyh$i;->x()Z

    move-result v1

    if-eqz v1, :cond_3

    const v1, 0xc4e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    iget-object v1, p0, Lyh$i;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    if-lez v2, :cond_0

    const v3, 0xc4f

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 8
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    :cond_0
    iget-object v3, p0, Lyh$i;->u:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p0, :cond_1

    .line 10
    iget-object v3, p0, Lyh$i;->u:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyh$i;

    invoke-virtual {v3}, Lyh$i;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/16 v1, 0x5d

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    const v1, 0xc50

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0}, Lyh$e;->m()Lyh$i;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public v()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lyh$i;->u()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    iget v0, p0, Lyh$i;->m:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p0}, Lyh$i;->C(Lyh$i;)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0xc51

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p0, v0}, Lyh$i;->I(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0xc52

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p0, v0}, Lyh$i;->I(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public w()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyh$i;->g:Z

    return v0
.end method

.method public x()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyh$i;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final y(Landroid/content/IntentFilter;Landroid/content/IntentFilter;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p1, p2, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_8

    if-nez p2, :cond_1

    goto :goto_2

    .line 1
    :cond_1
    invoke-virtual {p1}, Landroid/content/IntentFilter;->countActions()I

    move-result v2

    .line 2
    invoke-virtual {p2}, Landroid/content/IntentFilter;->countActions()I

    move-result v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_4

    .line 3
    invoke-virtual {p1, v3}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v3}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    return v1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 4
    :cond_4
    invoke-virtual {p1}, Landroid/content/IntentFilter;->countCategories()I

    move-result v2

    .line 5
    invoke-virtual {p2}, Landroid/content/IntentFilter;->countCategories()I

    move-result v3

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    move v3, v1

    :goto_1
    if-ge v3, v2, :cond_7

    .line 6
    invoke-virtual {p1, v3}, Landroid/content/IntentFilter;->getCategory(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v3}, Landroid/content/IntentFilter;->getCategory(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    return v1

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    return v0

    :cond_8
    :goto_2
    return v1
.end method

.method public final z(Ljava/util/List;Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/content/IntentFilter;",
            ">;",
            "Ljava/util/List<",
            "Landroid/content/IntentFilter;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p1, p2, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_1

    goto :goto_1

    .line 1
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object p1

    .line 2
    invoke-interface {p2}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object p2

    .line 3
    :cond_2
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p2}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 4
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/IntentFilter;

    invoke-interface {p2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/IntentFilter;

    invoke-virtual {p0, v2, v3}, Lyh$i;->y(Landroid/content/IntentFilter;Landroid/content/IntentFilter;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    .line 5
    :cond_3
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {p2}, Ljava/util/ListIterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    move v0, v1

    :goto_0
    return v0

    :cond_5
    :goto_1
    return v1
.end method
