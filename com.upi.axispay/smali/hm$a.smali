.class public Lhm$a;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final b:[Lgm;

.field public final c:Lcm$a;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;[Lgm;Lcm$a;)V
    .locals 6

    .line 1
    iget v4, p4, Lcm$a;->a:I

    new-instance v5, Lhm$a$a;

    invoke-direct {v5, p4, p3}, Lhm$a$a;-><init>(Lcm$a;[Lgm;)V

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    .line 2
    iput-object p4, p0, Lhm$a;->c:Lcm$a;

    .line 3
    iput-object p3, p0, Lhm$a;->b:[Lgm;

    return-void
.end method

.method public static k([Lgm;Landroid/database/sqlite/SQLiteDatabase;)Lgm;
    .locals 2

    const/4 v0, 0x0

    .line 1
    aget-object v1, p0, v0

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1, p1}, Lgm;->b(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    :cond_0
    new-instance v1, Lgm;

    invoke-direct {v1, p1}, Lgm;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    aput-object v1, p0, v0

    .line 4
    :cond_1
    aget-object p0, p0, v0

    return-object p0
.end method


# virtual methods
.method public declared-synchronized b()Lbm;
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iput-boolean v0, p0, Lhm$a;->d:Z

    .line 2
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 3
    iget-boolean v1, p0, Lhm$a;->d:Z

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p0}, Lhm$a;->close()V

    .line 5
    invoke-virtual {p0}, Lhm$a;->b()Lbm;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 6
    :cond_0
    :try_start_1
    invoke-virtual {p0, v0}, Lhm$a;->j(Landroid/database/sqlite/SQLiteDatabase;)Lgm;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized close()V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 2
    iget-object v0, p0, Lhm$a;->b:[Lgm;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v2, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public j(Landroid/database/sqlite/SQLiteDatabase;)Lgm;
    .locals 1

    .line 1
    iget-object v0, p0, Lhm$a;->b:[Lgm;

    invoke-static {v0, p1}, Lhm$a;->k([Lgm;Landroid/database/sqlite/SQLiteDatabase;)Lgm;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized m()Lbm;
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iput-boolean v0, p0, Lhm$a;->d:Z

    .line 2
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 3
    iget-boolean v1, p0, Lhm$a;->d:Z

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p0}, Lhm$a;->close()V

    .line 5
    invoke-virtual {p0}, Lhm$a;->m()Lbm;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 6
    :cond_0
    :try_start_1
    invoke-virtual {p0, v0}, Lhm$a;->j(Landroid/database/sqlite/SQLiteDatabase;)Lgm;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onConfigure(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lhm$a;->c:Lcm$a;

    invoke-virtual {p0, p1}, Lhm$a;->j(Landroid/database/sqlite/SQLiteDatabase;)Lgm;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcm$a;->b(Lbm;)V

    return-void
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lhm$a;->c:Lcm$a;

    invoke-virtual {p0, p1}, Lhm$a;->j(Landroid/database/sqlite/SQLiteDatabase;)Lgm;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcm$a;->d(Lbm;)V

    return-void
.end method

.method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lhm$a;->d:Z

    .line 2
    iget-object v0, p0, Lhm$a;->c:Lcm$a;

    invoke-virtual {p0, p1}, Lhm$a;->j(Landroid/database/sqlite/SQLiteDatabase;)Lgm;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lcm$a;->e(Lbm;II)V

    return-void
.end method

.method public onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lhm$a;->d:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lhm$a;->c:Lcm$a;

    invoke-virtual {p0, p1}, Lhm$a;->j(Landroid/database/sqlite/SQLiteDatabase;)Lgm;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcm$a;->f(Lbm;)V

    :cond_0
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lhm$a;->d:Z

    .line 2
    iget-object v0, p0, Lhm$a;->c:Lcm$a;

    invoke-virtual {p0, p1}, Lhm$a;->j(Landroid/database/sqlite/SQLiteDatabase;)Lgm;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lcm$a;->g(Lbm;II)V

    return-void
.end method
