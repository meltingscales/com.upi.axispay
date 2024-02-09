.class public Lrh;
.super Luh;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrh$c;,
        Lrh$d;,
        Lrh$b;,
        Lrh$f;,
        Lrh$e;,
        Lrh$a;
    }
.end annotation


# instance fields
.field public final i:Landroid/media/MediaRouter2;

.field public final j:Lrh$a;

.field public final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/media/MediaRouter2$RoutingController;",
            "Lrh$c;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Landroid/media/MediaRouter2$RouteCallback;

.field public final m:Landroid/media/MediaRouter2$TransferCallback;

.field public final n:Landroid/media/MediaRouter2$ControllerCallback;

.field public final o:Landroid/os/Handler;

.field public final p:Ljava/util/concurrent/Executor;

.field public q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/media/MediaRoute2Info;",
            ">;"
        }
    .end annotation
.end field

.field public r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const v0, 0x3de

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lrh$a;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Luh;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    iput-object v0, p0, Lrh;->k:Ljava/util/Map;

    .line 3
    new-instance v0, Lrh$e;

    invoke-direct {v0, p0}, Lrh$e;-><init>(Lrh;)V

    iput-object v0, p0, Lrh;->l:Landroid/media/MediaRouter2$RouteCallback;

    .line 4
    new-instance v0, Lrh$f;

    invoke-direct {v0, p0}, Lrh$f;-><init>(Lrh;)V

    iput-object v0, p0, Lrh;->m:Landroid/media/MediaRouter2$TransferCallback;

    .line 5
    new-instance v0, Lrh$b;

    invoke-direct {v0, p0}, Lrh$b;-><init>(Lrh;)V

    iput-object v0, p0, Lrh;->n:Landroid/media/MediaRouter2$ControllerCallback;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lrh;->q:Ljava/util/List;

    .line 7
    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    iput-object v0, p0, Lrh;->r:Ljava/util/Map;

    .line 8
    invoke-static {p1}, Landroid/media/MediaRouter2;->getInstance(Landroid/content/Context;)Landroid/media/MediaRouter2;

    move-result-object p1

    iput-object p1, p0, Lrh;->i:Landroid/media/MediaRouter2;

    .line 9
    iput-object p2, p0, Lrh;->j:Lrh$a;

    .line 10
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lrh;->o:Landroid/os/Handler;

    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lqh;

    invoke-direct {p2, p1}, Lqh;-><init>(Landroid/os/Handler;)V

    iput-object p2, p0, Lrh;->p:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static A(Landroid/media/MediaRouter2$RoutingController;)Landroid/os/Messenger;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/media/MediaRouter2$RoutingController;->getControlHints()Landroid/os/Bundle;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const v0, 0x3df

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroid/os/Messenger;

    :goto_0
    return-object v0
.end method

.method public static C(Luh$e;)Ljava/lang/String;
    .locals 2

    .line 1
    instance-of v0, p0, Lrh$c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    check-cast p0, Lrh$c;

    iget-object p0, p0, Lrh$c;->g:Landroid/media/MediaRouter2$RoutingController;

    if-nez p0, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p0}, Landroid/media/MediaRouter2$RoutingController;->getId()Ljava/lang/String;

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public static synthetic D(Landroid/media/MediaRoute2Info;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaRoute2Info;->isSystemRoute()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public B(Ljava/lang/String;)Landroid/media/MediaRoute2Info;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    iget-object v1, p0, Lrh;->q:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/MediaRoute2Info;

    .line 2
    invoke-virtual {v2}, Landroid/media/MediaRoute2Info;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    :cond_2
    return-object v0
.end method

.method public E()V
    .locals 5

    .line 1
    iget-object v0, p0, Lrh;->i:Landroid/media/MediaRouter2;

    invoke-virtual {v0}, Landroid/media/MediaRouter2;->getRoutes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->stream()Ljava/util/stream/Stream;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/stream/Stream;->distinct()Ljava/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lgh;->a:Lgh;

    .line 2
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    move-result-object v0

    .line 3
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 4
    iget-object v1, p0, Lrh;->q:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 5
    :cond_0
    iput-object v0, p0, Lrh;->q:Ljava/util/List;

    .line 6
    iget-object v0, p0, Lrh;->r:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 7
    iget-object v0, p0, Lrh;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/MediaRoute2Info;

    .line 8
    invoke-virtual {v1}, Landroid/media/MediaRoute2Info;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_2

    const v3, 0x3e0

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_1

    .line 10
    :cond_1
    iget-object v4, p0, Lrh;->r:Ljava/util/Map;

    invoke-virtual {v1}, Landroid/media/MediaRoute2Info;->getId()Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 12
    invoke-interface {v4, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 13
    :cond_2
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x3e1

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v2, 0x3e2

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 14
    :cond_3
    iget-object v0, p0, Lrh;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->stream()Ljava/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lnh;->a:Lnh;

    .line 15
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v0

    sget-object v1, Loh;->a:Loh;

    .line 16
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    move-result-object v0

    .line 17
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 18
    new-instance v1, Lvh$a;

    invoke-direct {v1}, Lvh$a;-><init>()V

    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v2}, Lvh$a;->d(Z)Lvh$a;

    .line 20
    invoke-virtual {v1, v0}, Lvh$a;->b(Ljava/util/Collection;)Lvh$a;

    .line 21
    invoke-virtual {v1}, Lvh$a;->c()Lvh;

    move-result-object v0

    .line 22
    invoke-virtual {p0, v0}, Luh;->x(Lvh;)V

    return-void
.end method

.method public F(Landroid/media/MediaRouter2$RoutingController;)V
    .locals 11

    .line 1
    iget-object v1, p0, Lrh;->k:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrh$c;

    const v0, 0x3e3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x3e4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/media/MediaRouter2$RoutingController;->getSelectedRoutes()Ljava/util/List;

    move-result-object v3

    .line 4
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x3e5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 6
    :cond_1
    invoke-static {v3}, Lzh;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    .line 7
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/MediaRoute2Info;

    invoke-static {v3}, Lzh;->c(Landroid/media/MediaRoute2Info;)Lsh;

    move-result-object v3

    const/4 v5, 0x0

    .line 8
    invoke-virtual {p1}, Landroid/media/MediaRouter2$RoutingController;->getControlHints()Landroid/os/Bundle;

    move-result-object v6

    .line 9
    invoke-virtual {p0}, Luh;->n()Landroid/content/Context;

    move-result-object v7

    sget v8, Lrg;->mr_dialog_default_group_name:I

    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    if-eqz v6, :cond_3

    :try_start_0
    const v0, 0x3e6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 10
    invoke-virtual {v6, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 11
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_2

    move-object v7, v8

    :cond_2
    const v0, 0x3e7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 12
    invoke-virtual {v6, v8}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 13
    invoke-static {v6}, Lsh;->d(Landroid/os/Bundle;)Lsh;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    const v0, 0x3e8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 14
    invoke-static {v2, v8, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    :goto_0
    const/4 v6, 0x1

    if-nez v5, :cond_4

    .line 15
    new-instance v5, Lsh$a;

    .line 16
    invoke-virtual {p1}, Landroid/media/MediaRouter2$RoutingController;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v5, v8, v7}, Lsh$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x2

    .line 17
    invoke-virtual {v5, v7}, Lsh$a;->g(I)Lsh$a;

    .line 18
    invoke-virtual {v5, v6}, Lsh$a;->p(I)Lsh$a;

    .line 19
    invoke-virtual {p1}, Landroid/media/MediaRouter2$RoutingController;->getVolume()I

    move-result v7

    invoke-virtual {v5, v7}, Lsh$a;->r(I)Lsh$a;

    .line 20
    invoke-virtual {p1}, Landroid/media/MediaRouter2$RoutingController;->getVolumeMax()I

    move-result v7

    invoke-virtual {v5, v7}, Lsh$a;->t(I)Lsh$a;

    .line 21
    invoke-virtual {p1}, Landroid/media/MediaRouter2$RoutingController;->getVolumeHandling()I

    move-result v7

    invoke-virtual {v5, v7}, Lsh$a;->s(I)Lsh$a;

    .line 22
    invoke-virtual {v3}, Lsh;->f()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v5, v3}, Lsh$a;->b(Ljava/util/Collection;)Lsh$a;

    .line 23
    invoke-virtual {v5, v4}, Lsh$a;->d(Ljava/util/Collection;)Lsh$a;

    .line 24
    invoke-virtual {v5}, Lsh$a;->e()Lsh;

    move-result-object v5

    .line 25
    :cond_4
    invoke-virtual {p1}, Landroid/media/MediaRouter2$RoutingController;->getSelectableRoutes()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lzh;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 26
    invoke-virtual {p1}, Landroid/media/MediaRouter2$RoutingController;->getDeselectableRoutes()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lzh;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 27
    invoke-virtual {p0}, Luh;->o()Lvh;

    move-result-object v7

    if-nez v7, :cond_5

    const v0, 0x3e9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 28
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 29
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    invoke-virtual {v7}, Lvh;->b()Ljava/util/List;

    move-result-object v7

    .line 31
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_7

    .line 32
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lsh;

    .line 33
    invoke-virtual {v8}, Lsh;->l()Ljava/lang/String;

    move-result-object v9

    .line 34
    new-instance v10, Luh$b$c$a;

    invoke-direct {v10, v8}, Luh$b$c$a;-><init>(Lsh;)V

    .line 35
    invoke-interface {v4, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/4 v8, 0x3

    goto :goto_2

    :cond_6
    move v8, v6

    :goto_2
    invoke-virtual {v10, v8}, Luh$b$c$a;->e(I)Luh$b$c$a;

    .line 36
    invoke-interface {v3, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v10, v8}, Luh$b$c$a;->b(Z)Luh$b$c$a;

    .line 37
    invoke-interface {p1, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v10, v8}, Luh$b$c$a;->d(Z)Luh$b$c$a;

    .line 38
    invoke-virtual {v10, v6}, Luh$b$c$a;->c(Z)Luh$b$c$a;

    .line 39
    invoke-virtual {v10}, Luh$b$c$a;->a()Luh$b$c;

    move-result-object v8

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 40
    :cond_7
    invoke-virtual {v1, v5}, Lrh$c;->u(Lsh;)V

    .line 41
    invoke-virtual {v1, v5, v2}, Luh$b;->l(Lsh;Ljava/util/Collection;)V

    return-void
.end method

.method public G(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lrh;->B(Ljava/lang/String;)Landroid/media/MediaRoute2Info;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x3ea

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const v0, 0x3eb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lrh;->i:Landroid/media/MediaRouter2;

    invoke-virtual {p1, v0}, Landroid/media/MediaRouter2;->transferTo(Landroid/media/MediaRoute2Info;)V

    return-void
.end method

.method public final H(Lth;Z)Lth;
    .locals 2

    if-nez p1, :cond_0

    .line 1
    new-instance p1, Lth;

    sget-object v0, Lxh;->c:Lxh;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lth;-><init>(Lxh;Z)V

    .line 2
    :cond_0
    invoke-virtual {p1}, Lth;->c()Lxh;

    move-result-object v0

    invoke-virtual {v0}, Lxh;->e()Ljava/util/List;

    move-result-object v0

    const v1, 0x3ec

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_1

    .line 3
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 6
    :cond_2
    :goto_0
    new-instance p2, Lxh$a;

    invoke-direct {p2}, Lxh$a;-><init>()V

    .line 7
    invoke-virtual {p2, v0}, Lxh$a;->a(Ljava/util/Collection;)Lxh$a;

    .line 8
    invoke-virtual {p2}, Lxh$a;->d()Lxh;

    move-result-object p2

    .line 9
    new-instance v0, Lth;

    invoke-virtual {p1}, Lth;->d()Z

    move-result p1

    invoke-direct {v0, p2, p1}, Lth;-><init>(Lxh;Z)V

    return-object v0
.end method

.method public s(Ljava/lang/String;)Luh$b;
    .locals 3

    .line 1
    iget-object v0, p0, Lrh;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrh$c;

    .line 3
    iget-object v2, v1, Lrh$c;->f:Ljava/lang/String;

    invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public t(Ljava/lang/String;)Luh$e;
    .locals 2

    .line 1
    iget-object v0, p0, Lrh;->r:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 2
    new-instance v0, Lrh$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lrh$d;-><init>(Lrh;Ljava/lang/String;Lrh$c;)V

    return-object v0
.end method

.method public u(Ljava/lang/String;Ljava/lang/String;)Luh$e;
    .locals 4

    .line 1
    iget-object v0, p0, Lrh;->r:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    iget-object v1, p0, Lrh;->k:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrh$c;

    .line 3
    invoke-virtual {v2}, Lrh$c;->q()Ljava/lang/String;

    move-result-object v3

    invoke-static {p2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    new-instance p1, Lrh$d;

    invoke-direct {p1, p0, v0, v2}, Lrh$d;-><init>(Lrh;Ljava/lang/String;Lrh$c;)V

    return-object p1

    .line 5
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x3ed

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p1, 0x3ee

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const p2, 0x3ef

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    new-instance p1, Lrh$d;

    const/4 p2, 0x0

    invoke-direct {p1, p0, v0, p2}, Lrh$d;-><init>(Lrh;Ljava/lang/String;Lrh$c;)V

    return-object p1
.end method

.method public v(Lth;)V
    .locals 3

    .line 1
    invoke-static {}, Lyh;->f()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    invoke-static {}, Lyh;->n()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lrh;->H(Lth;Z)Lth;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lrh;->i:Landroid/media/MediaRouter2;

    iget-object v1, p0, Lrh;->p:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lrh;->l:Landroid/media/MediaRouter2$RouteCallback;

    .line 4
    invoke-static {p1}, Lzh;->b(Lth;)Landroid/media/RouteDiscoveryPreference;

    move-result-object p1

    .line 5
    invoke-virtual {v0, v1, v2, p1}, Landroid/media/MediaRouter2;->registerRouteCallback(Ljava/util/concurrent/Executor;Landroid/media/MediaRouter2$RouteCallback;Landroid/media/RouteDiscoveryPreference;)V

    .line 6
    iget-object p1, p0, Lrh;->i:Landroid/media/MediaRouter2;

    iget-object v0, p0, Lrh;->p:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lrh;->m:Landroid/media/MediaRouter2$TransferCallback;

    invoke-virtual {p1, v0, v1}, Landroid/media/MediaRouter2;->registerTransferCallback(Ljava/util/concurrent/Executor;Landroid/media/MediaRouter2$TransferCallback;)V

    .line 7
    iget-object p1, p0, Lrh;->i:Landroid/media/MediaRouter2;

    iget-object v0, p0, Lrh;->p:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lrh;->n:Landroid/media/MediaRouter2$ControllerCallback;

    invoke-virtual {p1, v0, v1}, Landroid/media/MediaRouter2;->registerControllerCallback(Ljava/util/concurrent/Executor;Landroid/media/MediaRouter2$ControllerCallback;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Lrh;->i:Landroid/media/MediaRouter2;

    iget-object v0, p0, Lrh;->l:Landroid/media/MediaRouter2$RouteCallback;

    invoke-virtual {p1, v0}, Landroid/media/MediaRouter2;->unregisterRouteCallback(Landroid/media/MediaRouter2$RouteCallback;)V

    .line 9
    iget-object p1, p0, Lrh;->i:Landroid/media/MediaRouter2;

    iget-object v0, p0, Lrh;->m:Landroid/media/MediaRouter2$TransferCallback;

    invoke-virtual {p1, v0}, Landroid/media/MediaRouter2;->unregisterTransferCallback(Landroid/media/MediaRouter2$TransferCallback;)V

    .line 10
    iget-object p1, p0, Lrh;->i:Landroid/media/MediaRouter2;

    iget-object v0, p0, Lrh;->n:Landroid/media/MediaRouter2$ControllerCallback;

    invoke-virtual {p1, v0}, Landroid/media/MediaRouter2;->unregisterControllerCallback(Landroid/media/MediaRouter2$ControllerCallback;)V

    :goto_0
    return-void
.end method
