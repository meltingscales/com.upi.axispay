.class public final Lcom/olive/upi/database/AppDatabase_Impl;
.super Lcom/olive/upi/database/AppDatabase;
.source "AxisPay"


# instance fields
.field public volatile o:Lk70;

.field public volatile p:Lp70;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/olive/upi/database/AppDatabase;-><init>()V

    return-void
.end method

.method public static synthetic H(Lcom/olive/upi/database/AppDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lbl;->f:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic I(Lcom/olive/upi/database/AppDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lbl;->f:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic J(Lcom/olive/upi/database/AppDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lbl;->f:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic K(Lcom/olive/upi/database/AppDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lbl;->f:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic L(Lcom/olive/upi/database/AppDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lbl;->f:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic M(Lcom/olive/upi/database/AppDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lbl;->f:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic N(Lcom/olive/upi/database/AppDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lbl;->f:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic O(Lcom/olive/upi/database/AppDatabase_Impl;Lbm;)Lbm;
    .locals 0

    .line 1
    iput-object p1, p0, Lbl;->a:Lbm;

    return-object p1
.end method

.method public static synthetic P(Lcom/olive/upi/database/AppDatabase_Impl;Lbm;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbl;->r(Lbm;)V

    return-void
.end method

.method public static synthetic Q(Lcom/olive/upi/database/AppDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lbl;->f:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic R(Lcom/olive/upi/database/AppDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lbl;->f:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public F()Lk70;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/database/AppDatabase_Impl;->o:Lk70;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/olive/upi/database/AppDatabase_Impl;->o:Lk70;

    return-object v0

    .line 3
    :cond_0
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/olive/upi/database/AppDatabase_Impl;->o:Lk70;

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Ll70;

    invoke-direct {v0, p0}, Ll70;-><init>(Lbl;)V

    iput-object v0, p0, Lcom/olive/upi/database/AppDatabase_Impl;->o:Lk70;

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/olive/upi/database/AppDatabase_Impl;->o:Lk70;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 7
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public G()Lp70;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/database/AppDatabase_Impl;->p:Lp70;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/olive/upi/database/AppDatabase_Impl;->p:Lp70;

    return-object v0

    .line 3
    :cond_0
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/olive/upi/database/AppDatabase_Impl;->p:Lp70;

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Lq70;

    invoke-direct {v0, p0}, Lq70;-><init>(Lbl;)V

    iput-object v0, p0, Lcom/olive/upi/database/AppDatabase_Impl;->p:Lp70;

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/olive/upi/database/AppDatabase_Impl;->p:Lp70;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 7
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public e()Ltk;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 2
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 3
    new-instance v1, Ltk;

    const v3, 0x231f

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x2320

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Ltk;-><init>(Lbl;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method public f(Llk;)Lcm;
    .locals 4

    .line 1
    new-instance v0, Ldl;

    new-instance v1, Lcom/olive/upi/database/AppDatabase_Impl$a;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lcom/olive/upi/database/AppDatabase_Impl$a;-><init>(Lcom/olive/upi/database/AppDatabase_Impl;I)V

    const v2, 0x2321

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x2322

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, p1, v1, v2, v3}, Ldl;-><init>(Llk;Ldl$a;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v1, p1, Llk;->b:Landroid/content/Context;

    invoke-static {v1}, Lcm$b;->a(Landroid/content/Context;)Lcm$b$a;

    move-result-object v1

    iget-object v2, p1, Llk;->c:Ljava/lang/String;

    .line 3
    invoke-virtual {v1, v2}, Lcm$b$a;->c(Ljava/lang/String;)Lcm$b$a;

    .line 4
    invoke-virtual {v1, v0}, Lcm$b$a;->b(Lcm$a;)Lcm$b$a;

    .line 5
    invoke-virtual {v1}, Lcm$b$a;->a()Lcm$b;

    move-result-object v0

    .line 6
    iget-object p1, p1, Llk;->a:Lcm$c;

    invoke-interface {p1, v0}, Lcm$c;->a(Lcm$b;)Lcm;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/util/Map;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Ljl;",
            ">;",
            "Ljl;",
            ">;)",
            "Ljava/util/List<",
            "Lkl;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    new-array p1, p1, [Lkl;

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public l()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Ljl;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public m()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    const-class v1, Lk70;

    invoke-static {}, Ll70;->e()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    const-class v1, Lp70;

    invoke-static {}, Lq70;->d()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
