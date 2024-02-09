.class public final Lyh;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyh$g;,
        Lyh$e;,
        Lyh$c;,
        Lyh$d;,
        Lyh$f;,
        Lyh$b;,
        Lyh$h;,
        Lyh$i;
    }
.end annotation


# static fields
.field public static final c:Z

.field public static d:Lyh$e;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lyh$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const v0, 0x1ecc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lyh;->c:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lyh;->b:Ljava/util/ArrayList;

    .line 3
    iput-object p1, p0, Lyh;->a:Landroid/content/Context;

    return-void
.end method

.method public static d()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const v1, 0x1ecd

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static f()I
    .locals 1

    .line 1
    sget-object v0, Lyh;->d:Lyh$e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lyh$e;->l()I

    move-result v0

    return v0
.end method

.method public static g(Landroid/content/Context;)Lyh;
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lyh$e;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lyh$e;-><init>(Landroid/content/Context;)V

    sput-object v0, Lyh;->d:Lyh$e;

    .line 4
    invoke-virtual {v0}, Lyh$e;->H()V

    .line 5
    :cond_0
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0, p0}, Lyh$e;->q(Landroid/content/Context;)Lyh;

    move-result-object p0

    return-object p0

    .line 6
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const v0, 0x1ece

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static l()Z
    .locals 1

    .line 1
    sget-object v0, Lyh;->d:Lyh$e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lyh$e;->v()Z

    move-result v0

    return v0
.end method

.method public static n()Z
    .locals 1

    .line 1
    sget-object v0, Lyh;->d:Lyh$e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lyh$e;->z()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Lxh;Lyh$b;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lyh;->b(Lxh;Lyh$b;I)V

    return-void
.end method

.method public b(Lxh;Lyh$b;I)V
    .locals 3

    if-eqz p1, :cond_6

    if-eqz p2, :cond_5

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-boolean v0, Lyh;->c:Z

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x1ecf

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v1, 0x1ed0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v1, 0x1ed1

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 5
    :cond_0
    invoke-virtual {p0, p2}, Lyh;->e(Lyh$b;)I

    move-result v0

    if-gez v0, :cond_1

    .line 6
    new-instance v0, Lyh$c;

    invoke-direct {v0, p0, p2}, Lyh$c;-><init>(Lyh;Lyh$b;)V

    .line 7
    iget-object p2, p0, Lyh;->b:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_1
    iget-object p2, p0, Lyh;->b:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lyh$c;

    :goto_0
    const/4 p2, 0x0

    .line 9
    iget v1, v0, Lyh$c;->d:I

    const/4 v2, 0x1

    if-eq p3, v1, :cond_2

    .line 10
    iput p3, v0, Lyh$c;->d:I

    move p2, v2

    .line 11
    :cond_2
    iget-object p3, v0, Lyh$c;->c:Lxh;

    invoke-virtual {p3, p1}, Lxh;->b(Lxh;)Z

    move-result p3

    if-nez p3, :cond_3

    .line 12
    new-instance p2, Lxh$a;

    iget-object p3, v0, Lyh$c;->c:Lxh;

    invoke-direct {p2, p3}, Lxh$a;-><init>(Lxh;)V

    .line 13
    invoke-virtual {p2, p1}, Lxh$a;->c(Lxh;)Lxh$a;

    .line 14
    invoke-virtual {p2}, Lxh$a;->d()Lxh;

    move-result-object p1

    iput-object p1, v0, Lyh$c;->c:Lxh;

    goto :goto_1

    :cond_3
    move v2, p2

    :goto_1
    if-eqz v2, :cond_4

    .line 15
    sget-object p1, Lyh;->d:Lyh$e;

    invoke-virtual {p1}, Lyh$e;->J()V

    :cond_4
    return-void

    .line 16
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const p2, 0x1ed2

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const p2, 0x1ed3

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Lyh$i;)V
    .locals 1

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0, p1}, Lyh$e;->f(Lyh$i;)V

    return-void
.end method

.method public final e(Lyh$b;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lyh;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    iget-object v2, p0, Lyh;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyh$c;

    iget-object v2, v2, Lyh$c;->b:Lyh$b;

    if-ne v2, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public h()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .locals 1

    .line 1
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0}, Lyh$e;->o()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    return-object v0
.end method

.method public i()Lei;
    .locals 1

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0}, Lyh$e;->r()Lei;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/util/List;
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
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0}, Lyh$e;->s()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public k()Lyh$i;
    .locals 1

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0}, Lyh$e;->t()Lyh$i;

    move-result-object v0

    return-object v0
.end method

.method public m(Lxh;I)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0, p1, p2}, Lyh$e;->w(Lxh;I)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const p2, 0x1ed4

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public o(Lyh$b;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-boolean v0, Lyh;->c:Z

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x1ed5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lyh;->e(Lyh$b;)I

    move-result p1

    if-ltz p1, :cond_1

    .line 5
    iget-object v0, p0, Lyh;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 6
    sget-object p1, Lyh;->d:Lyh$e;

    invoke-virtual {p1}, Lyh$e;->J()V

    :cond_1
    return-void

    .line 7
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x1ed6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public p(Lyh$i;)V
    .locals 1

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0, p1}, Lyh$e;->C(Lyh$i;)V

    return-void
.end method

.method public q(Lyh$i;)V
    .locals 1

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0, p1}, Lyh$e;->I(Lyh$i;)V

    return-void
.end method

.method public r(I)V
    .locals 2

    if-ltz p1, :cond_1

    const/4 v0, 0x3

    if-gt p1, v0, :cond_1

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    sget-object v0, Lyh;->d:Lyh$e;

    invoke-virtual {v0}, Lyh$e;->h()Lyh$i;

    move-result-object v0

    .line 3
    sget-object v1, Lyh;->d:Lyh$e;

    invoke-virtual {v1}, Lyh$e;->t()Lyh$i;

    move-result-object v1

    if-eq v1, v0, :cond_0

    .line 4
    sget-object v1, Lyh;->d:Lyh$e;

    invoke-virtual {v1, v0, p1}, Lyh$e;->F(Lyh$i;I)V

    :cond_0
    return-void

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x1ed7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
