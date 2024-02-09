.class public final Lwk;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcm;
.implements Lmk;


# instance fields
.field public final b:Lcm;

.field public final c:Lbl$f;

.field public final d:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcm;Lbl$f;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwk;->b:Lcm;

    .line 3
    iput-object p2, p0, Lwk;->c:Lbl$f;

    .line 4
    iput-object p3, p0, Lwk;->d:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public G()Lbm;
    .locals 4

    .line 1
    new-instance v0, Lvk;

    iget-object v1, p0, Lwk;->b:Lcm;

    invoke-interface {v1}, Lcm;->G()Lbm;

    move-result-object v1

    iget-object v2, p0, Lwk;->c:Lbl$f;

    iget-object v3, p0, Lwk;->d:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, v3}, Lvk;-><init>(Lbm;Lbl$f;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public K()Lbm;
    .locals 4

    .line 1
    new-instance v0, Lvk;

    iget-object v1, p0, Lwk;->b:Lcm;

    invoke-interface {v1}, Lcm;->K()Lbm;

    move-result-object v1

    iget-object v2, p0, Lwk;->c:Lbl$f;

    iget-object v3, p0, Lwk;->d:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, v3}, Lvk;-><init>(Lbm;Lbl$f;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lwk;->b:Lcm;

    invoke-interface {v0}, Lcm;->close()V

    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lwk;->b:Lcm;

    invoke-interface {v0}, Lcm;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDelegate()Lcm;
    .locals 1

    .line 1
    iget-object v0, p0, Lwk;->b:Lcm;

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lwk;->b:Lcm;

    invoke-interface {v0, p1}, Lcm;->setWriteAheadLoggingEnabled(Z)V

    return-void
.end method
