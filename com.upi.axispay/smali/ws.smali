.class public abstract Lws;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lws$a;,
        Lws$b;,
        Lws$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lws$a;
    .locals 1

    .line 1
    new-instance v0, Lws$a;

    invoke-direct {v0}, Lws$a;-><init>()V

    return-object v0
.end method

.method public static d(Lzu;Ljava/util/Map;)Lws;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzu;",
            "Ljava/util/Map<",
            "Lxo;",
            "Lws$b;",
            ">;)",
            "Lws;"
        }
    .end annotation

    .line 1
    new-instance v0, Lts;

    invoke-direct {v0, p0, p1}, Lts;-><init>(Lzu;Ljava/util/Map;)V

    return-object v0
.end method

.method public static f(Lzu;)Lws;
    .locals 7

    .line 1
    invoke-static {}, Lws;->b()Lws$a;

    move-result-object v0

    sget-object v1, Lxo;->b:Lxo;

    .line 2
    invoke-static {}, Lws$b;->a()Lws$b$a;

    move-result-object v2

    const-wide/16 v3, 0x7530

    .line 3
    invoke-virtual {v2, v3, v4}, Lws$b$a;->b(J)Lws$b$a;

    const-wide/32 v3, 0x5265c00

    .line 4
    invoke-virtual {v2, v3, v4}, Lws$b$a;->d(J)Lws$b$a;

    .line 5
    invoke-virtual {v2}, Lws$b$a;->a()Lws$b;

    move-result-object v2

    .line 6
    invoke-virtual {v0, v1, v2}, Lws$a;->a(Lxo;Lws$b;)Lws$a;

    sget-object v1, Lxo;->d:Lxo;

    .line 7
    invoke-static {}, Lws$b;->a()Lws$b$a;

    move-result-object v2

    const-wide/16 v5, 0x3e8

    .line 8
    invoke-virtual {v2, v5, v6}, Lws$b$a;->b(J)Lws$b$a;

    .line 9
    invoke-virtual {v2, v3, v4}, Lws$b$a;->d(J)Lws$b$a;

    .line 10
    invoke-virtual {v2}, Lws$b$a;->a()Lws$b;

    move-result-object v2

    .line 11
    invoke-virtual {v0, v1, v2}, Lws$a;->a(Lxo;Lws$b;)Lws$a;

    sget-object v1, Lxo;->c:Lxo;

    .line 12
    invoke-static {}, Lws$b;->a()Lws$b$a;

    move-result-object v2

    .line 13
    invoke-virtual {v2, v3, v4}, Lws$b$a;->b(J)Lws$b$a;

    .line 14
    invoke-virtual {v2, v3, v4}, Lws$b$a;->d(J)Lws$b$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lws$c;

    sget-object v4, Lws$c;->b:Lws$c;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    sget-object v4, Lws$c;->c:Lws$c;

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 15
    invoke-static {v3}, Lws;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v2, v3}, Lws$b$a;->c(Ljava/util/Set;)Lws$b$a;

    .line 16
    invoke-virtual {v2}, Lws$b$a;->a()Lws$b;

    move-result-object v2

    .line 17
    invoke-virtual {v0, v1, v2}, Lws$a;->a(Lxo;Lws$b;)Lws$a;

    .line 18
    invoke-virtual {v0, p0}, Lws$a;->c(Lzu;)Lws$a;

    .line 19
    invoke-virtual {v0}, Lws$a;->b()Lws;

    move-result-object p0

    return-object p0
.end method

.method public static varargs i([Ljava/lang/Object;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(IJ)J
    .locals 6

    add-int/lit8 p1, p1, -0x1

    const-wide/16 v0, 0x1

    cmp-long v0, p2, v0

    if-lez v0, :cond_0

    move-wide v0, p2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x2

    :goto_0
    const-wide v2, 0x40c3880000000000L    # 10000.0

    .line 1
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    int-to-long v4, p1

    mul-long/2addr v0, v4

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    div-double/2addr v2, v0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 2
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    int-to-double v4, p1

    .line 3
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    long-to-double p1, p2

    mul-double/2addr v2, p1

    mul-double/2addr v2, v0

    double-to-long p1, v2

    return-wide p1
.end method

.method public c(Landroid/app/job/JobInfo$Builder;Lxo;JI)Landroid/app/job/JobInfo$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p2, p3, p4, p5}, Lws;->g(Lxo;JI)J

    move-result-wide p3

    .line 2
    invoke-virtual {p1, p3, p4}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 3
    invoke-virtual {p0}, Lws;->h()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lws$b;

    invoke-virtual {p2}, Lws$b;->c()Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lws;->j(Landroid/app/job/JobInfo$Builder;Ljava/util/Set;)V

    return-object p1
.end method

.method public abstract e()Lzu;
.end method

.method public g(Lxo;JI)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lws;->e()Lzu;

    move-result-object v0

    invoke-interface {v0}, Lzu;->a()J

    move-result-wide v0

    sub-long/2addr p2, v0

    .line 2
    invoke-virtual {p0}, Lws;->h()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lws$b;

    .line 3
    invoke-virtual {p1}, Lws$b;->b()J

    move-result-wide v0

    invoke-virtual {p0, p4, v0, v1}, Lws;->a(IJ)J

    move-result-wide v0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    .line 4
    invoke-virtual {p1}, Lws$b;->d()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public abstract h()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lxo;",
            "Lws$b;",
            ">;"
        }
    .end annotation
.end method

.method public final j(Landroid/app/job/JobInfo$Builder;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/job/JobInfo$Builder;",
            "Ljava/util/Set<",
            "Lws$c;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lws$c;->b:Lws$c;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    .line 2
    invoke-virtual {p1, v0}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1, v1}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 4
    :goto_0
    sget-object v0, Lws$c;->d:Lws$c;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p1, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 6
    :cond_1
    sget-object v0, Lws$c;->c:Lws$c;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 7
    invoke-virtual {p1, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    :cond_2
    return-void
.end method
