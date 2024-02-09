.class public Ln80;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln80$e;,
        Ln80$b;,
        Ln80$c;,
        Ln80$f;,
        Ln80$g;,
        Ln80$d;
    }
.end annotation


# static fields
.field public static final p:Landroid/os/Handler;

.field public static volatile q:Ln80;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ln80$d;

.field public final b:Ln80$g;

.field public final c:Ln80$c;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls80;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Landroid/content/Context;

.field public final f:Lc80;

.field public final g:Lx70;

.field public final h:Lu80;

.field public final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lu70;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/widget/ImageView;",
            "Lb80;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Landroid/graphics/Bitmap$Config;

.field public m:Z

.field public volatile n:Z

.field public o:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln80$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Ln80$a;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ln80;->p:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 2
    sput-object v0, Ln80;->q:Ln80;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc80;Lx70;Ln80$d;Ln80$g;Ljava/util/List;Lu80;Landroid/graphics/Bitmap$Config;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lc80;",
            "Lx70;",
            "Ln80$d;",
            "Ln80$g;",
            "Ljava/util/List<",
            "Ls80;",
            ">;",
            "Lu80;",
            "Landroid/graphics/Bitmap$Config;",
            "ZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln80;->e:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Ln80;->f:Lc80;

    .line 4
    iput-object p3, p0, Ln80;->g:Lx70;

    .line 5
    iput-object p4, p0, Ln80;->a:Ln80$d;

    .line 6
    iput-object p5, p0, Ln80;->b:Ln80$g;

    .line 7
    iput-object p8, p0, Ln80;->l:Landroid/graphics/Bitmap$Config;

    if-eqz p6, :cond_0

    .line 8
    invoke-interface {p6}, Ljava/util/List;->size()I

    move-result p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 9
    :goto_0
    new-instance p4, Ljava/util/ArrayList;

    add-int/lit8 p3, p3, 0x7

    invoke-direct {p4, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    new-instance p3, Lt80;

    invoke-direct {p3, p1}, Lt80;-><init>(Landroid/content/Context;)V

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p6, :cond_1

    .line 11
    invoke-interface {p4, p6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 12
    :cond_1
    new-instance p3, Lz70;

    invoke-direct {p3, p1}, Lz70;-><init>(Landroid/content/Context;)V

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    new-instance p3, Li80;

    invoke-direct {p3, p1}, Li80;-><init>(Landroid/content/Context;)V

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    new-instance p3, La80;

    invoke-direct {p3, p1}, La80;-><init>(Landroid/content/Context;)V

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    new-instance p3, Lv70;

    invoke-direct {p3, p1}, Lv70;-><init>(Landroid/content/Context;)V

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    new-instance p3, Le80;

    invoke-direct {p3, p1}, Le80;-><init>(Landroid/content/Context;)V

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    new-instance p1, Ll80;

    iget-object p2, p2, Lc80;->d:Ld80;

    invoke-direct {p1, p2, p7}, Ll80;-><init>(Ld80;Lu80;)V

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ln80;->d:Ljava/util/List;

    .line 19
    iput-object p7, p0, Ln80;->h:Lu80;

    .line 20
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Ln80;->i:Ljava/util/Map;

    .line 21
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Ln80;->j:Ljava/util/Map;

    .line 22
    iput-boolean p9, p0, Ln80;->m:Z

    .line 23
    iput-boolean p10, p0, Ln80;->n:Z

    .line 24
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, Ln80;->k:Ljava/lang/ref/ReferenceQueue;

    .line 25
    new-instance p2, Ln80$c;

    sget-object p3, Ln80;->p:Landroid/os/Handler;

    invoke-direct {p2, p1, p3}, Ln80$c;-><init>(Ljava/lang/ref/ReferenceQueue;Landroid/os/Handler;)V

    iput-object p2, p0, Ln80;->c:Ln80$c;

    .line 26
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static g()Ln80;
    .locals 4

    .line 1
    sget-object v0, Ln80;->q:Ln80;

    if-nez v0, :cond_2

    .line 2
    const-class v0, Ln80;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Ln80;->q:Ln80;

    if-nez v1, :cond_1

    .line 4
    sget-object v1, Lcom/squareup/picasso/PicassoProvider;->b:Landroid/content/Context;

    if-eqz v1, :cond_0

    .line 5
    new-instance v2, Ln80$b;

    invoke-direct {v2, v1}, Ln80$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Ln80$b;->a()Ln80;

    move-result-object v1

    sput-object v1, Ln80;->q:Ln80;

    goto :goto_0

    .line 6
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const v3, 0x156c

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 7
    :cond_1
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 8
    :cond_2
    :goto_1
    sget-object v0, Ln80;->q:Ln80;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {}, Lx80;->c()V

    .line 2
    iget-object v0, p0, Ln80;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu70;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lu70;->a()V

    .line 4
    iget-object v1, p0, Ln80;->f:Lc80;

    invoke-virtual {v1, v0}, Lc80;->c(Lu70;)V

    .line 5
    :cond_0
    instance-of v0, p1, Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 6
    check-cast p1, Landroid/widget/ImageView;

    .line 7
    iget-object v0, p0, Ln80;->j:Ljava/util/Map;

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb80;

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p1}, Lb80;->a()V

    :cond_1
    return-void
.end method

.method public b(Landroid/widget/ImageView;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Ln80;->a(Ljava/lang/Object;)V

    return-void

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x156d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Lw70;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lw70;->h()Lu70;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lw70;->i()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    if-nez v0, :cond_2

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :cond_2
    :goto_1
    if-nez v2, :cond_3

    return-void

    .line 4
    :cond_3
    invoke-virtual {p1}, Lw70;->j()Lq80;

    move-result-object v2

    iget-object v2, v2, Lq80;->d:Landroid/net/Uri;

    .line 5
    invoke-virtual {p1}, Lw70;->k()Ljava/lang/Exception;

    move-result-object v5

    .line 6
    invoke-virtual {p1}, Lw70;->s()Landroid/graphics/Bitmap;

    move-result-object v6

    .line 7
    invoke-virtual {p1}, Lw70;->o()Ln80$e;

    move-result-object p1

    if-eqz v0, :cond_4

    .line 8
    invoke-virtual {p0, v6, p1, v0, v5}, Ln80;->e(Landroid/graphics/Bitmap;Ln80$e;Lu70;Ljava/lang/Exception;)V

    :cond_4
    if-eqz v4, :cond_5

    .line 9
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    :goto_2
    if-ge v3, v0, :cond_5

    .line 10
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu70;

    .line 11
    invoke-virtual {p0, v6, p1, v4, v5}, Ln80;->e(Landroid/graphics/Bitmap;Ln80$e;Lu70;Ljava/lang/Exception;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 12
    :cond_5
    iget-object p1, p0, Ln80;->a:Ln80$d;

    if-eqz p1, :cond_6

    if-eqz v5, :cond_6

    .line 13
    invoke-interface {p1, p0, v2, v5}, Ln80$d;->a(Ln80;Landroid/net/Uri;Ljava/lang/Exception;)V

    :cond_6
    return-void
.end method

.method public d(Landroid/widget/ImageView;Lb80;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln80;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Ln80;->a(Ljava/lang/Object;)V

    .line 3
    :cond_0
    iget-object v0, p0, Ln80;->j:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final e(Landroid/graphics/Bitmap;Ln80$e;Lu70;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Lu70;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p3}, Lu70;->m()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Ln80;->i:Ljava/util/Map;

    invoke-virtual {p3}, Lu70;->k()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const v0, 0x156e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    .line 4
    invoke-virtual {p3, p1, p2}, Lu70;->b(Landroid/graphics/Bitmap;Ln80$e;)V

    .line 5
    iget-boolean p1, p0, Ln80;->n:Z

    if-eqz p1, :cond_4

    .line 6
    iget-object p1, p3, Lu70;->b:Lq80;

    invoke-virtual {p1}, Lq80;->d()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const p4, 0x156f

    invoke-static {p4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const p3, 0x1570

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {v0, p3, p1, p2}, Lx80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const p2, 0x1571

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 8
    :cond_3
    invoke-virtual {p3, p4}, Lu70;->c(Ljava/lang/Exception;)V

    .line 9
    iget-boolean p1, p0, Ln80;->n:Z

    if-eqz p1, :cond_4

    .line 10
    iget-object p1, p3, Lu70;->b:Lq80;

    invoke-virtual {p1}, Lq80;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    const p3, 0x1572

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {v0, p3, p1, p2}, Lx80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public f(Lu70;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lu70;->k()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Ln80;->i:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Ln80;->a(Ljava/lang/Object;)V

    .line 4
    iget-object v1, p0, Ln80;->i:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Ln80;->m(Lu70;)V

    return-void
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls80;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ln80;->d:Ljava/util/List;

    return-object v0
.end method

.method public i(Landroid/net/Uri;)Lr80;
    .locals 2

    .line 1
    new-instance v0, Lr80;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lr80;-><init>(Ln80;Landroid/net/Uri;I)V

    return-object v0
.end method

.method public j(Ljava/lang/String;)Lr80;
    .locals 2

    if-nez p1, :cond_0

    .line 1
    new-instance p1, Lr80;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p1, p0, v0, v1}, Lr80;-><init>(Ln80;Landroid/net/Uri;I)V

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Ln80;->i(Landroid/net/Uri;)Lr80;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x1573

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Ln80;->g:Lx70;

    invoke-interface {v0, p1}, Lx70;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Ln80;->h:Lu80;

    invoke-virtual {v0}, Lu80;->d()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Ln80;->h:Lu80;

    invoke-virtual {v0}, Lu80;->e()V

    :goto_0
    return-object p1
.end method

.method public l(Lu70;)V
    .locals 4

    .line 1
    iget v0, p1, Lu70;->e:I

    invoke-static {v0}, Lj80;->a(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lu70;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ln80;->k(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const v2, 0x1574

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_1

    .line 3
    sget-object v3, Ln80$e;->c:Ln80$e;

    invoke-virtual {p0, v0, v3, p1, v1}, Ln80;->e(Landroid/graphics/Bitmap;Ln80$e;Lu70;Ljava/lang/Exception;)V

    .line 4
    iget-boolean v0, p0, Ln80;->n:Z

    if-eqz v0, :cond_2

    .line 5
    iget-object p1, p1, Lu70;->b:Lq80;

    invoke-virtual {p1}, Lq80;->d()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x1575

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x1576

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1, p1, v0}, Lx80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {p0, p1}, Ln80;->f(Lu70;)V

    .line 7
    iget-boolean v0, p0, Ln80;->n:Z

    if-eqz v0, :cond_2

    .line 8
    iget-object p1, p1, Lu70;->b:Lq80;

    invoke-virtual {p1}, Lq80;->d()Ljava/lang/String;

    move-result-object p1

    const v0, 0x1577

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, p1}, Lx80;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public m(Lu70;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln80;->f:Lc80;

    invoke-virtual {v0, p1}, Lc80;->h(Lu70;)V

    return-void
.end method

.method public n(Lq80;)Lq80;
    .locals 3

    .line 1
    iget-object v0, p0, Ln80;->b:Ln80$g;

    invoke-interface {v0, p1}, Ln80$g;->a(Lq80;)Lq80;

    if-eqz p1, :cond_0

    return-object p1

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x1578

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ln80;->b:Ln80$g;

    .line 3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0x1579

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
