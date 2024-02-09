.class public final Ljk$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lbm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final b:Lik;


# direct methods
.method public constructor <init>(Lik;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ljk$a;->b:Lik;

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;Lbm;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lbm;->i(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic j(Lbm;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 2
    invoke-interface {p0}, Lbm;->B()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic k(Lbm;)Ljava/lang/Object;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic m(ILbm;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lbm;->h(I)V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public B()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ljk$a;->b:Lik;

    sget-object v1, Lnj;->a:Lnj;

    invoke-virtual {v0, v1}, Lik;->c(Lb4;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public D()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljk$a;->b:Lik;

    invoke-virtual {v0}, Lik;->d()Lbm;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lbm;->D()V

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const v1, 0x561

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public F()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljk$a;->b:Lik;

    invoke-virtual {v0}, Lik;->e()Lbm;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-interface {v0}, Lbm;->F()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 3
    iget-object v1, p0, Ljk$a;->b:Lik;

    invoke-virtual {v1}, Lik;->b()V

    .line 4
    throw v0
.end method

.method public N(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Ljk$a;->b:Lik;

    invoke-virtual {v0}, Lik;->e()Lbm;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1}, Lbm;->N(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    new-instance v0, Ljk$c;

    iget-object v1, p0, Ljk$a;->b:Lik;

    invoke-direct {v0, p1, v1}, Ljk$c;-><init>(Landroid/database/Cursor;Lik;)V

    return-object v0

    :catchall_0
    move-exception p1

    .line 4
    iget-object v0, p0, Ljk$a;->b:Lik;

    invoke-virtual {v0}, Lik;->b()V

    .line 5
    throw p1
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v1, p0, Ljk$a;->b:Lik;

    invoke-virtual {v1}, Lik;->d()Lbm;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2
    :try_start_0
    iget-object v1, p0, Ljk$a;->b:Lik;

    invoke-virtual {v1}, Lik;->d()Lbm;

    move-result-object v1

    invoke-interface {v1}, Lbm;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    iget-object v1, p0, Ljk$a;->b:Lik;

    invoke-virtual {v1}, Lik;->b()V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Ljk$a;->b:Lik;

    invoke-virtual {v2}, Lik;->b()V

    .line 4
    throw v1

    .line 5
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const v0, 0x562

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ljk$a;->b:Lik;

    invoke-virtual {v0}, Lik;->a()V

    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljk$a;->b:Lik;

    invoke-virtual {v0}, Lik;->e()Lbm;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-interface {v0}, Lbm;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 3
    iget-object v1, p0, Ljk$a;->b:Lik;

    invoke-virtual {v1}, Lik;->b()V

    .line 4
    throw v0
.end method

.method public g()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ljk$a;->b:Lik;

    sget-object v1, Lfk;->a:Lfk;

    invoke-virtual {v0, v1}, Lik;->c(Lb4;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Ljk$a;->b:Lik;

    sget-object v1, Llj;->a:Llj;

    invoke-virtual {v0, v1}, Lik;->c(Lb4;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public h(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ljk$a;->b:Lik;

    new-instance v1, Lpj;

    invoke-direct {v1, p1}, Lpj;-><init>(I)V

    invoke-virtual {v0, v1}, Lik;->c(Lb4;)Ljava/lang/Object;

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ljk$a;->b:Lik;

    new-instance v1, Lmj;

    invoke-direct {v1, p1}, Lmj;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lik;->c(Lb4;)Ljava/lang/Object;

    return-void
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljk$a;->b:Lik;

    invoke-virtual {v0}, Lik;->d()Lbm;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-interface {v0}, Lbm;->isOpen()Z

    move-result v0

    return v0
.end method

.method public n(Ljava/lang/String;)Lfm;
    .locals 2

    .line 1
    new-instance v0, Ljk$b;

    iget-object v1, p0, Ljk$a;->b:Lik;

    invoke-direct {v0, p1, v1}, Ljk$b;-><init>(Ljava/lang/String;Lik;)V

    return-object v0
.end method

.method public p(Lem;)Landroid/database/Cursor;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Ljk$a;->b:Lik;

    invoke-virtual {v0}, Lik;->e()Lbm;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1}, Lbm;->p(Lem;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    new-instance v0, Ljk$c;

    iget-object v1, p0, Ljk$a;->b:Lik;

    invoke-direct {v0, p1, v1}, Ljk$c;-><init>(Landroid/database/Cursor;Lik;)V

    return-object v0

    :catchall_0
    move-exception p1

    .line 4
    iget-object v0, p0, Ljk$a;->b:Lik;

    invoke-virtual {v0}, Lik;->b()V

    .line 5
    throw p1
.end method

.method public r()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljk$a;->b:Lik;

    sget-object v1, Loj;->a:Loj;

    invoke-virtual {v0, v1}, Lik;->c(Lb4;)Ljava/lang/Object;

    return-void
.end method

.method public u(Lem;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ljk$a;->b:Lik;

    invoke-virtual {v0}, Lik;->e()Lbm;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1, p2}, Lbm;->u(Lem;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    new-instance p2, Ljk$c;

    iget-object v0, p0, Ljk$a;->b:Lik;

    invoke-direct {p2, p1, v0}, Ljk$c;-><init>(Landroid/database/Cursor;Lik;)V

    return-object p2

    :catchall_0
    move-exception p1

    .line 4
    iget-object p2, p0, Ljk$a;->b:Lik;

    invoke-virtual {p2}, Lik;->b()V

    .line 5
    throw p1
.end method

.method public v()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ljk$a;->b:Lik;

    invoke-virtual {v0}, Lik;->d()Lbm;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, Ljk$a;->b:Lik;

    sget-object v1, Lrj;->a:Lrj;

    invoke-virtual {v0, v1}, Lik;->c(Lb4;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
