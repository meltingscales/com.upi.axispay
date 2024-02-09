.class public abstract Luh;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luh$c;,
        Luh$a;,
        Luh$b;,
        Luh$e;,
        Luh$d;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Luh$d;

.field public final c:Luh$c;

.field public d:Luh$a;

.field public e:Lth;

.field public f:Z

.field public g:Lvh;

.field public h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Luh;-><init>(Landroid/content/Context;Luh$d;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Luh$d;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Luh$c;

    invoke-direct {v0, p0}, Luh$c;-><init>(Luh;)V

    iput-object v0, p0, Luh;->c:Luh$c;

    if-eqz p1, :cond_1

    .line 4
    iput-object p1, p0, Luh;->a:Landroid/content/Context;

    if-nez p2, :cond_0

    .line 5
    new-instance p2, Luh$d;

    new-instance v0, Landroid/content/ComponentName;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-direct {p2, v0}, Luh$d;-><init>(Landroid/content/ComponentName;)V

    iput-object p2, p0, Luh;->b:Luh$d;

    goto :goto_0

    .line 6
    :cond_0
    iput-object p2, p0, Luh;->b:Luh$d;

    :goto_0
    return-void

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const p2, 0xf17

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public l()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Luh;->h:Z

    .line 2
    iget-object v0, p0, Luh;->d:Luh$a;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Luh;->g:Lvh;

    invoke-virtual {v0, p0, v1}, Luh$a;->a(Luh;Lvh;)V

    :cond_0
    return-void
.end method

.method public m()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Luh;->f:Z

    .line 2
    iget-object v0, p0, Luh;->e:Lth;

    invoke-virtual {p0, v0}, Luh;->v(Lth;)V

    return-void
.end method

.method public final n()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Luh;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final o()Lvh;
    .locals 1

    .line 1
    iget-object v0, p0, Luh;->g:Lvh;

    return-object v0
.end method

.method public final p()Lth;
    .locals 1

    .line 1
    iget-object v0, p0, Luh;->e:Lth;

    return-object v0
.end method

.method public final q()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, Luh;->c:Luh$c;

    return-object v0
.end method

.method public final r()Luh$d;
    .locals 1

    .line 1
    iget-object v0, p0, Luh;->b:Luh$d;

    return-object v0
.end method

.method public s(Ljava/lang/String;)Luh$b;
    .locals 1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0xf18

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t(Ljava/lang/String;)Luh$e;
    .locals 1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0xf19

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public u(Ljava/lang/String;Ljava/lang/String;)Luh$e;
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Luh;->t(Ljava/lang/String;)Luh$e;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const p2, 0xf1a

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const p2, 0xf1b

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public v(Lth;)V
    .locals 0

    return-void
.end method

.method public final w(Luh$a;)V
    .locals 0

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    iput-object p1, p0, Luh;->d:Luh$a;

    return-void
.end method

.method public final x(Lvh;)V
    .locals 1

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    iget-object v0, p0, Luh;->g:Lvh;

    if-eq v0, p1, :cond_0

    .line 3
    iput-object p1, p0, Luh;->g:Lvh;

    .line 4
    iget-boolean p1, p0, Luh;->h:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Luh;->h:Z

    .line 6
    iget-object v0, p0, Luh;->c:Luh$c;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method

.method public final y(Lth;)V
    .locals 1

    .line 1
    invoke-static {}, Lyh;->d()V

    .line 2
    iget-object v0, p0, Luh;->e:Lth;

    invoke-static {v0, p1}, Lya;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Luh;->z(Lth;)V

    return-void
.end method

.method public final z(Lth;)V
    .locals 1

    .line 1
    iput-object p1, p0, Luh;->e:Lth;

    .line 2
    iget-boolean p1, p0, Luh;->f:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Luh;->f:Z

    .line 4
    iget-object p1, p0, Luh;->c:Luh$c;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method
