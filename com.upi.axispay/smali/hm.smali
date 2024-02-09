.class public Lhm;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcm;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhm$a;
    }
.end annotation


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Lcm$a;

.field public final e:Z

.field public final f:Ljava/lang/Object;

.field public g:Lhm$a;

.field public h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcm$a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhm;->b:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lhm;->c:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lhm;->d:Lcm$a;

    .line 5
    iput-boolean p4, p0, Lhm;->e:Z

    .line 6
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhm;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public G()Lbm;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhm;->b()Lhm$a;

    move-result-object v0

    invoke-virtual {v0}, Lhm$a;->b()Lbm;

    move-result-object v0

    return-object v0
.end method

.method public K()Lbm;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhm;->b()Lhm$a;

    move-result-object v0

    invoke-virtual {v0}, Lhm$a;->m()Lbm;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lhm$a;
    .locals 7

    .line 1
    iget-object v0, p0, Lhm;->f:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lhm;->g:Lhm$a;

    if-nez v1, :cond_1

    const/4 v1, 0x1

    new-array v1, v1, [Lgm;

    .line 3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_0

    iget-object v3, p0, Lhm;->c:Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-boolean v3, p0, Lhm;->e:Z

    if-eqz v3, :cond_0

    .line 4
    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lhm;->b:Landroid/content/Context;

    .line 5
    invoke-static {v4}, Lyl;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v4

    iget-object v5, p0, Lhm;->c:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    new-instance v4, Lhm$a;

    iget-object v5, p0, Lhm;->b:Landroid/content/Context;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    iget-object v6, p0, Lhm;->d:Lcm$a;

    invoke-direct {v4, v5, v3, v1, v6}, Lhm$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lgm;Lcm$a;)V

    iput-object v4, p0, Lhm;->g:Lhm$a;

    goto :goto_0

    .line 7
    :cond_0
    new-instance v3, Lhm$a;

    iget-object v4, p0, Lhm;->b:Landroid/content/Context;

    iget-object v5, p0, Lhm;->c:Ljava/lang/String;

    iget-object v6, p0, Lhm;->d:Lcm$a;

    invoke-direct {v3, v4, v5, v1, v6}, Lhm$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lgm;Lcm$a;)V

    iput-object v3, p0, Lhm;->g:Lhm$a;

    :goto_0
    const/16 v1, 0x10

    if-lt v2, v1, :cond_1

    .line 8
    iget-object v1, p0, Lhm;->g:Lhm$a;

    iget-boolean v2, p0, Lhm;->h:Z

    invoke-static {v1, v2}, Lwl;->d(Landroid/database/sqlite/SQLiteOpenHelper;Z)V

    .line 9
    :cond_1
    iget-object v1, p0, Lhm;->g:Lhm$a;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public close()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhm;->b()Lhm$a;

    move-result-object v0

    invoke-virtual {v0}, Lhm$a;->close()V

    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lhm;->c:Ljava/lang/String;

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lhm;->f:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lhm;->g:Lhm$a;

    if-eqz v1, :cond_0

    .line 3
    invoke-static {v1, p1}, Lwl;->d(Landroid/database/sqlite/SQLiteOpenHelper;Z)V

    .line 4
    :cond_0
    iput-boolean p1, p0, Lhm;->h:Z

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
