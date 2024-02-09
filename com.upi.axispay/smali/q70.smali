.class public final Lq70;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lp70;


# instance fields
.field public final a:Lbl;

.field public final b:Lok;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok<",
            "Lo70;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lhl;


# direct methods
.method public constructor <init>(Lbl;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq70;->a:Lbl;

    .line 3
    new-instance v0, Lq70$a;

    invoke-direct {v0, p0, p1}, Lq70$a;-><init>(Lq70;Lbl;)V

    iput-object v0, p0, Lq70;->b:Lok;

    .line 4
    new-instance v0, Lq70$b;

    invoke-direct {v0, p0, p1}, Lq70$b;-><init>(Lq70;Lbl;)V

    .line 5
    new-instance v0, Lq70$c;

    invoke-direct {v0, p0, p1}, Lq70$c;-><init>(Lq70;Lbl;)V

    .line 6
    new-instance v0, Lq70$d;

    invoke-direct {v0, p0, p1}, Lq70$d;-><init>(Lq70;Lbl;)V

    iput-object v0, p0, Lq70;->c:Lhl;

    return-void
.end method

.method public static d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lo70;)J
    .locals 2

    .line 1
    iget-object v0, p0, Lq70;->a:Lbl;

    invoke-virtual {v0}, Lbl;->b()V

    .line 2
    iget-object v0, p0, Lq70;->a:Lbl;

    invoke-virtual {v0}, Lbl;->c()V

    .line 3
    :try_start_0
    iget-object v0, p0, Lq70;->b:Lok;

    invoke-virtual {v0, p1}, Lok;->h(Ljava/lang/Object;)J

    move-result-wide v0

    .line 4
    iget-object p1, p0, Lq70;->a:Lbl;

    invoke-virtual {p1}, Lbl;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object p1, p0, Lq70;->a:Lbl;

    invoke-virtual {p1}, Lbl;->g()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lq70;->a:Lbl;

    invoke-virtual {v0}, Lbl;->g()V

    .line 6
    throw p1
.end method

.method public b()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lo70;",
            ">;"
        }
    .end annotation

    const v0, 0x29e3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 1
    invoke-static {v1, v2}, Lel;->k(Ljava/lang/String;I)Lel;

    move-result-object v1

    .line 2
    iget-object v3, p0, Lq70;->a:Lbl;

    invoke-virtual {v3}, Lbl;->b()V

    .line 3
    iget-object v3, p0, Lq70;->a:Lbl;

    const/4 v4, 0x0

    invoke-static {v3, v1, v2, v4}, Lnl;->b(Lbl;Lem;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const v0, 0x29e4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-static {v2, v3}, Lml;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const v0, 0x29e5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 5
    invoke-static {v2, v5}, Lml;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const v0, 0x29e6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 6
    invoke-static {v2, v6}, Lml;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    .line 7
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 9
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_0

    move-object v8, v4

    goto :goto_1

    .line 10
    :cond_0
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 11
    :goto_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1

    move-object v9, v4

    goto :goto_2

    .line 12
    :cond_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 13
    :goto_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-eqz v10, :cond_2

    move-object v10, v4

    goto :goto_3

    .line 14
    :cond_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 15
    :goto_3
    new-instance v11, Lo70;

    invoke-direct {v11, v8, v9, v10}, Lo70;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 17
    :cond_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 18
    invoke-virtual {v1}, Lel;->release()V

    return-object v7

    :catchall_0
    move-exception v3

    .line 19
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 20
    invoke-virtual {v1}, Lel;->release()V

    .line 21
    throw v3
.end method

.method public c()I
    .locals 3

    .line 1
    iget-object v0, p0, Lq70;->a:Lbl;

    invoke-virtual {v0}, Lbl;->b()V

    .line 2
    iget-object v0, p0, Lq70;->c:Lhl;

    invoke-virtual {v0}, Lhl;->a()Lfm;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lq70;->a:Lbl;

    invoke-virtual {v1}, Lbl;->c()V

    .line 4
    :try_start_0
    invoke-interface {v0}, Lfm;->l()I

    move-result v1

    .line 5
    iget-object v2, p0, Lq70;->a:Lbl;

    invoke-virtual {v2}, Lbl;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iget-object v2, p0, Lq70;->a:Lbl;

    invoke-virtual {v2}, Lbl;->g()V

    .line 7
    iget-object v2, p0, Lq70;->c:Lhl;

    invoke-virtual {v2, v0}, Lhl;->f(Lfm;)V

    return v1

    :catchall_0
    move-exception v1

    .line 8
    iget-object v2, p0, Lq70;->a:Lbl;

    invoke-virtual {v2}, Lbl;->g()V

    .line 9
    iget-object v2, p0, Lq70;->c:Lhl;

    invoke-virtual {v2, v0}, Lhl;->f(Lfm;)V

    .line 10
    throw v1
.end method
