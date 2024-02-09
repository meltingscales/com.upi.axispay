.class public Lji$b;
.super Lji;
.source "AxisPay"

# interfaces
.implements Lbi$a;
.implements Lbi$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lji$b$a;,
        Lji$b$c;,
        Lji$b$b;
    }
.end annotation


# static fields
.field public static final u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/content/IntentFilter;",
            ">;"
        }
    .end annotation
.end field

.field public static final v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/content/IntentFilter;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final i:Lji$f;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;

.field public n:I

.field public o:Z

.field public p:Z

.field public final q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lji$b$b;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lji$b$c;",
            ">;"
        }
    .end annotation
.end field

.field public s:Lbi$e;

.field public t:Lbi$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const v1, 0x1ec4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Lji$b;->u:Ljava/util/ArrayList;

    .line 4
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const v1, 0x1ec5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Lji$b;->v:Ljava/util/ArrayList;

    .line 8
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lji$f;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lji;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lji$b;->q:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lji$b;->r:Ljava/util/ArrayList;

    .line 4
    iput-object p2, p0, Lji$b;->i:Lji$f;

    .line 5
    invoke-static {p1}, Lbi;->g(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Lji$b;->j:Ljava/lang/Object;

    .line 6
    invoke-virtual {p0}, Lji$b;->H()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lji$b;->k:Ljava/lang/Object;

    .line 7
    invoke-virtual {p0}, Lji$b;->I()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lji$b;->l:Ljava/lang/Object;

    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 9
    sget v0, Lrg;->mr_user_route_category_name:I

    .line 10
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 11
    invoke-static {p2, p1, v0}, Lbi;->d(Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lji$b;->m:Ljava/lang/Object;

    .line 12
    invoke-virtual {p0}, Lji$b;->U()V

    return-void
.end method


# virtual methods
.method public B(Lyh$i;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lyh$i;->q()Luh;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 2
    iget-object v0, p0, Lji$b;->j:Ljava/lang/Object;

    iget-object v1, p0, Lji$b;->m:Ljava/lang/Object;

    invoke-static {v0, v1}, Lbi;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    new-instance v1, Lji$b$c;

    invoke-direct {v1, p1, v0}, Lji$b$c;-><init>(Lyh$i;Ljava/lang/Object;)V

    .line 4
    invoke-static {v0, v1}, Lbi$d;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 5
    iget-object p1, p0, Lji$b;->l:Ljava/lang/Object;

    invoke-static {v0, p1}, Lbi$f;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p0, v1}, Lji$b;->V(Lji$b$c;)V

    .line 7
    iget-object p1, p0, Lji$b;->r:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object p1, p0, Lji$b;->j:Ljava/lang/Object;

    invoke-static {p1, v0}, Lbi;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lji$b;->j:Ljava/lang/Object;

    const v1, 0x800003

    invoke-static {v0, v1}, Lbi;->i(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 10
    invoke-virtual {p0, v0}, Lji$b;->J(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_1

    .line 11
    iget-object v1, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lji$b$b;

    .line 12
    iget-object v0, v0, Lji$b$b;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lyh$i;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13
    invoke-virtual {p1}, Lyh$i;->H()V

    :cond_1
    :goto_0
    return-void
.end method

.method public C(Lyh$i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lyh$i;->q()Luh;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lji$b;->L(Lyh$i;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 3
    iget-object v0, p0, Lji$b;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lji$b$c;

    .line 4
    invoke-virtual {p0, p1}, Lji$b;->V(Lji$b$c;)V

    :cond_0
    return-void
.end method

.method public D(Lyh$i;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lyh$i;->q()Luh;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lji$b;->L(Lyh$i;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 3
    iget-object v0, p0, Lji$b;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lji$b$c;

    .line 4
    iget-object v0, p1, Lji$b$c;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbi$d;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 5
    iget-object v0, p1, Lji$b$c;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, Lbi$f;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    iget-object v0, p0, Lji$b;->j:Ljava/lang/Object;

    iget-object p1, p1, Lji$b$c;->b:Ljava/lang/Object;

    invoke-static {v0, p1}, Lbi;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public E(Lyh$i;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lyh$i;->B()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lyh$i;->q()Luh;

    move-result-object v0

    if-eq v0, p0, :cond_1

    .line 3
    invoke-virtual {p0, p1}, Lji$b;->L(Lyh$i;)I

    move-result p1

    if-ltz p1, :cond_2

    .line 4
    iget-object v0, p0, Lji$b;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lji$b$c;

    .line 5
    iget-object p1, p1, Lji$b$c;->b:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lji$b;->R(Ljava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p1}, Lyh$i;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lji$b;->K(Ljava/lang/String;)I

    move-result p1

    if-ltz p1, :cond_2

    .line 7
    iget-object v0, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lji$b$b;

    .line 8
    iget-object p1, p1, Lji$b$b;->a:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lji$b;->R(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final F(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lji$b;->O(Ljava/lang/Object;)Lji$b$c;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lji$b;->J(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Lji$b;->G(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Lji$b$b;

    invoke-direct {v1, p1, v0}, Lji$b$b;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0, v1}, Lji$b;->T(Lji$b$b;)V

    .line 6
    iget-object p1, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final G(Ljava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lji$b;->M()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, p1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    const p1, 0x1ec6

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 2
    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lji$b;->N(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v1

    const p1, 0x1ec7

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 3
    :goto_1
    invoke-virtual {p0, p1}, Lji$b;->K(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_2

    return-object p1

    :cond_2
    const/4 v0, 0x2

    move v3, v0

    .line 4
    :goto_2
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v5, v0, [Ljava/lang/Object;

    aput-object p1, v5, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v2

    const v6, 0x1ec8

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-virtual {p0, v4}, Lji$b;->K(Ljava/lang/String;)I

    move-result v5

    if-gez v5, :cond_3

    return-object v4

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2
.end method

.method public H()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lbi;->c(Lbi$a;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public I()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lbi;->f(Lbi$g;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public J(Ljava/lang/Object;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    iget-object v2, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lji$b$b;

    iget-object v2, v2, Lji$b$b;->a:Ljava/lang/Object;

    if-ne v2, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public K(Ljava/lang/String;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    iget-object v2, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lji$b$b;

    iget-object v2, v2, Lji$b$b;->b:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public L(Lyh$i;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lji$b;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    iget-object v2, p0, Lji$b;->r:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lji$b$c;

    iget-object v2, v2, Lji$b$c;->a:Lyh$i;

    if-ne v2, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public M()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lji$b;->t:Lbi$c;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lbi$c;

    invoke-direct {v0}, Lbi$c;-><init>()V

    iput-object v0, p0, Lji$b;->t:Lbi$c;

    .line 3
    :cond_0
    iget-object v0, p0, Lji$b;->t:Lbi$c;

    iget-object v1, p0, Lji$b;->j:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lbi$c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public N(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Luh;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Lbi$d;->a(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const p1, 0x1ec9

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public O(Ljava/lang/Object;)Lji$b$c;
    .locals 1

    .line 1
    invoke-static {p1}, Lbi$d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    instance-of v0, p1, Lji$b$c;

    if-eqz v0, :cond_0

    check-cast p1, Lji$b$c;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public P(Lji$b$b;Lsh$a;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lji$b$b;->a:Ljava/lang/Object;

    invoke-static {v0}, Lbi$d;->d(Ljava/lang/Object;)I

    move-result v0

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 2
    sget-object v1, Lji$b;->u:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Lsh$a;->b(Ljava/util/Collection;)Lsh$a;

    :cond_0
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 3
    sget-object v0, Lji$b;->v:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Lsh$a;->b(Ljava/util/Collection;)Lsh$a;

    .line 4
    :cond_1
    iget-object v0, p1, Lji$b$b;->a:Ljava/lang/Object;

    .line 5
    invoke-static {v0}, Lbi$d;->c(Ljava/lang/Object;)I

    move-result v0

    .line 6
    invoke-virtual {p2, v0}, Lsh$a;->p(I)Lsh$a;

    .line 7
    iget-object v0, p1, Lji$b$b;->a:Ljava/lang/Object;

    .line 8
    invoke-static {v0}, Lbi$d;->b(Ljava/lang/Object;)I

    move-result v0

    .line 9
    invoke-virtual {p2, v0}, Lsh$a;->o(I)Lsh$a;

    .line 10
    iget-object v0, p1, Lji$b$b;->a:Ljava/lang/Object;

    .line 11
    invoke-static {v0}, Lbi$d;->f(Ljava/lang/Object;)I

    move-result v0

    .line 12
    invoke-virtual {p2, v0}, Lsh$a;->r(I)Lsh$a;

    .line 13
    iget-object v0, p1, Lji$b$b;->a:Ljava/lang/Object;

    .line 14
    invoke-static {v0}, Lbi$d;->h(Ljava/lang/Object;)I

    move-result v0

    .line 15
    invoke-virtual {p2, v0}, Lsh$a;->t(I)Lsh$a;

    .line 16
    iget-object p1, p1, Lji$b$b;->a:Ljava/lang/Object;

    .line 17
    invoke-static {p1}, Lbi$d;->g(Ljava/lang/Object;)I

    move-result p1

    .line 18
    invoke-virtual {p2, p1}, Lsh$a;->s(I)Lsh$a;

    return-void
.end method

.method public Q()V
    .locals 4

    .line 1
    new-instance v0, Lvh$a;

    invoke-direct {v0}, Lvh$a;-><init>()V

    .line 2
    iget-object v1, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 3
    iget-object v3, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lji$b$b;

    iget-object v3, v3, Lji$b$b;->c:Lsh;

    invoke-virtual {v0, v3}, Lvh$a;->a(Lsh;)Lvh$a;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Lvh$a;->c()Lvh;

    move-result-object v0

    invoke-virtual {p0, v0}, Luh;->x(Lvh;)V

    return-void
.end method

.method public R(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lji$b;->s:Lbi$e;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lbi$e;

    invoke-direct {v0}, Lbi$e;-><init>()V

    iput-object v0, p0, Lji$b;->s:Lbi$e;

    .line 3
    :cond_0
    iget-object v0, p0, Lji$b;->s:Lbi$e;

    iget-object v1, p0, Lji$b;->j:Ljava/lang/Object;

    const v2, 0x800003

    invoke-virtual {v0, v1, v2, p1}, Lbi$e;->a(Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public S()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lji$b;->p:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lji$b;->p:Z

    .line 3
    iget-object v0, p0, Lji$b;->j:Ljava/lang/Object;

    iget-object v1, p0, Lji$b;->k:Ljava/lang/Object;

    invoke-static {v0, v1}, Lbi;->j(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    :cond_0
    iget v0, p0, Lji$b;->n:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 5
    iput-boolean v1, p0, Lji$b;->p:Z

    .line 6
    iget-object v1, p0, Lji$b;->j:Ljava/lang/Object;

    iget-object v2, p0, Lji$b;->k:Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lbi;->a(Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public T(Lji$b$b;)V
    .locals 3

    .line 1
    new-instance v0, Lsh$a;

    iget-object v1, p1, Lji$b$b;->b:Ljava/lang/String;

    iget-object v2, p1, Lji$b$b;->a:Ljava/lang/Object;

    .line 2
    invoke-virtual {p0, v2}, Lji$b;->N(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lsh$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1, v0}, Lji$b;->P(Lji$b$b;Lsh$a;)V

    .line 4
    invoke-virtual {v0}, Lsh$a;->e()Lsh;

    move-result-object v0

    iput-object v0, p1, Lji$b$b;->c:Lsh;

    return-void
.end method

.method public final U()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lji$b;->S()V

    .line 2
    iget-object v0, p0, Lji$b;->j:Ljava/lang/Object;

    invoke-static {v0}, Lbi;->h(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 3
    invoke-virtual {p0, v2}, Lji$b;->F(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {p0}, Lji$b;->Q()V

    :cond_1
    return-void
.end method

.method public V(Lji$b$c;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lji$b$c;->b:Ljava/lang/Object;

    iget-object v1, p1, Lji$b$c;->a:Lyh$i;

    .line 2
    invoke-virtual {v1}, Lyh$i;->l()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v0, v1}, Lbi$f;->a(Ljava/lang/Object;Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p1, Lji$b$c;->b:Ljava/lang/Object;

    iget-object v1, p1, Lji$b$c;->a:Lyh$i;

    .line 5
    invoke-virtual {v1}, Lyh$i;->n()I

    move-result v1

    .line 6
    invoke-static {v0, v1}, Lbi$f;->c(Ljava/lang/Object;I)V

    .line 7
    iget-object v0, p1, Lji$b$c;->b:Ljava/lang/Object;

    iget-object v1, p1, Lji$b$c;->a:Lyh$i;

    .line 8
    invoke-virtual {v1}, Lyh$i;->m()I

    move-result v1

    .line 9
    invoke-static {v0, v1}, Lbi$f;->b(Ljava/lang/Object;I)V

    .line 10
    iget-object v0, p1, Lji$b$c;->b:Ljava/lang/Object;

    iget-object v1, p1, Lji$b$c;->a:Lyh$i;

    .line 11
    invoke-virtual {v1}, Lyh$i;->r()I

    move-result v1

    .line 12
    invoke-static {v0, v1}, Lbi$f;->d(Ljava/lang/Object;I)V

    .line 13
    iget-object v0, p1, Lji$b$c;->b:Ljava/lang/Object;

    iget-object v1, p1, Lji$b$c;->a:Lyh$i;

    .line 14
    invoke-virtual {v1}, Lyh$i;->t()I

    move-result v1

    .line 15
    invoke-static {v0, v1}, Lbi$f;->g(Ljava/lang/Object;I)V

    .line 16
    iget-object v0, p1, Lji$b$c;->b:Ljava/lang/Object;

    iget-object p1, p1, Lji$b$c;->a:Lyh$i;

    .line 17
    invoke-virtual {p1}, Lyh$i;->s()I

    move-result p1

    .line 18
    invoke-static {v0, p1}, Lbi$f;->f(Ljava/lang/Object;I)V

    return-void
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lji$b;->O(Ljava/lang/Object;)Lji$b$c;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lji$b;->J(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 3
    iget-object v0, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lji$b$b;

    .line 4
    invoke-virtual {p0, p1}, Lji$b;->T(Lji$b$b;)V

    .line 5
    invoke-virtual {p0}, Lji$b;->Q()V

    :cond_0
    return-void
.end method

.method public d(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public e(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lji$b;->O(Ljava/lang/Object;)Lji$b$c;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p1, Lji$b$c;->a:Lyh$i;

    invoke-virtual {p1, p2}, Lyh$i;->G(I)V

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    return-void
.end method

.method public g(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lji$b;->O(Ljava/lang/Object;)Lji$b$c;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lji$b;->J(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 3
    iget-object v0, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4
    invoke-virtual {p0}, Lji$b;->Q()V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lji$b;->F(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lji$b;->Q()V

    :cond_0
    return-void
.end method

.method public i(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lji$b;->O(Ljava/lang/Object;)Lji$b$c;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p1, Lji$b$c;->a:Lyh$i;

    invoke-virtual {p1, p2}, Lyh$i;->F(I)V

    :cond_0
    return-void
.end method

.method public j(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lji$b;->O(Ljava/lang/Object;)Lji$b$c;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lji$b;->J(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 3
    iget-object v1, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lji$b$b;

    .line 4
    invoke-static {p1}, Lbi$d;->f(Ljava/lang/Object;)I

    move-result p1

    .line 5
    iget-object v1, v0, Lji$b$b;->c:Lsh;

    invoke-virtual {v1}, Lsh;->t()I

    move-result v1

    if-eq p1, v1, :cond_0

    .line 6
    new-instance v1, Lsh$a;

    iget-object v2, v0, Lji$b$b;->c:Lsh;

    invoke-direct {v1, v2}, Lsh$a;-><init>(Lsh;)V

    .line 7
    invoke-virtual {v1, p1}, Lsh$a;->r(I)Lsh$a;

    .line 8
    invoke-virtual {v1}, Lsh$a;->e()Lsh;

    move-result-object p1

    iput-object p1, v0, Lji$b$b;->c:Lsh;

    .line 9
    invoke-virtual {p0}, Lji$b;->Q()V

    :cond_0
    return-void
.end method

.method public k(ILjava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lji$b;->j:Ljava/lang/Object;

    const v0, 0x800003

    invoke-static {p1, v0}, Lbi;->i(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    if-eq p2, p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0, p2}, Lji$b;->O(Ljava/lang/Object;)Lji$b$c;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p1, Lji$b$c;->a:Lyh$i;

    invoke-virtual {p1}, Lyh$i;->H()V

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0, p2}, Lji$b;->J(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_2

    .line 5
    iget-object p2, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lji$b$b;

    .line 6
    iget-object p2, p0, Lji$b;->i:Lji$f;

    iget-object p1, p1, Lji$b$b;->b:Ljava/lang/String;

    invoke-interface {p2, p1}, Lji$f;->b(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public t(Ljava/lang/String;)Luh$e;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lji$b;->K(Ljava/lang/String;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 2
    iget-object v0, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lji$b$b;

    .line 3
    new-instance v0, Lji$b$a;

    iget-object p1, p1, Lji$b$b;->a:Ljava/lang/Object;

    invoke-direct {v0, p1}, Lji$b$a;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public v(Lth;)V
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 1
    invoke-virtual {p1}, Lth;->c()Lxh;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Lxh;->e()Ljava/util/List;

    move-result-object v1

    .line 3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v3, v0

    :goto_0
    if-ge v0, v2, :cond_2

    .line 4
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const v5, 0x1eca

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 5
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    or-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    const v5, 0x1ecb

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 6
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    goto :goto_1

    :cond_1
    const/high16 v4, 0x800000

    or-int/2addr v3, v4

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {p1}, Lth;->d()Z

    move-result v0

    move p1, v0

    move v0, v3

    goto :goto_2

    :cond_3
    move p1, v0

    .line 8
    :goto_2
    iget v1, p0, Lji$b;->n:I

    if-ne v1, v0, :cond_4

    iget-boolean v1, p0, Lji$b;->o:Z

    if-eq v1, p1, :cond_5

    .line 9
    :cond_4
    iput v0, p0, Lji$b;->n:I

    .line 10
    iput-boolean p1, p0, Lji$b;->o:Z

    .line 11
    invoke-virtual {p0}, Lji$b;->U()V

    :cond_5
    return-void
.end method
