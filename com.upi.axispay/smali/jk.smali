.class public final Ljk;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcm;
.implements Lmk;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljk$b;,
        Ljk$c;,
        Ljk$a;
    }
.end annotation


# instance fields
.field public final b:Lcm;

.field public final c:Ljk$a;

.field public final d:Lik;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lmyunmn/z;->a()V

    return-void
.end method

.method public constructor <init>(Lcm;Lik;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ljk;->b:Lcm;

    .line 3
    iput-object p2, p0, Ljk;->d:Lik;

    .line 4
    invoke-virtual {p2, p1}, Lik;->f(Lcm;)V

    .line 5
    new-instance p1, Ljk$a;

    invoke-direct {p1, p2}, Ljk$a;-><init>(Lik;)V

    iput-object p1, p0, Ljk;->c:Ljk$a;

    return-void
.end method


# virtual methods
.method public G()Lbm;
    .locals 1

    .line 1
    iget-object v0, p0, Ljk;->c:Ljk$a;

    invoke-virtual {v0}, Ljk$a;->r()V

    .line 2
    iget-object v0, p0, Ljk;->c:Ljk$a;

    return-object v0
.end method

.method public K()Lbm;
    .locals 1

    .line 1
    iget-object v0, p0, Ljk;->c:Ljk$a;

    invoke-virtual {v0}, Ljk$a;->r()V

    .line 2
    iget-object v0, p0, Ljk;->c:Ljk$a;

    return-object v0
.end method

.method public b()Lik;
    .locals 1

    .line 1
    iget-object v0, p0, Ljk;->d:Lik;

    return-object v0
.end method

.method public close()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ljk;->c:Ljk$a;

    invoke-virtual {v0}, Ljk$a;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lpl;->a(Ljava/lang/Exception;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ljk;->b:Lcm;

    invoke-interface {v0}, Lcm;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDelegate()Lcm;
    .locals 1

    .line 1
    iget-object v0, p0, Ljk;->b:Lcm;

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljk;->b:Lcm;

    invoke-interface {v0, p1}, Lcm;->setWriteAheadLoggingEnabled(Z)V

    return-void
.end method
