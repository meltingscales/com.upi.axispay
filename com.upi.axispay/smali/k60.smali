.class public final Lk60;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk60$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lw60;


# direct methods
.method public constructor <init>(Lk60$b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lk60$b;->a(Lk60$b;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    invoke-static {p1}, Lk60$b;->b(Lk60$b;)I

    .line 5
    invoke-static {p1}, Lk60$b;->l(Lk60$b;)I

    .line 6
    invoke-static {p1}, Lk60$b;->m(Lk60$b;)I

    .line 7
    invoke-static {p1}, Lk60$b;->n(Lk60$b;)I

    .line 8
    invoke-static {p1}, Lk60$b;->o(Lk60$b;)Lx60;

    .line 9
    invoke-static {p1}, Lk60$b;->p(Lk60$b;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lk60;->a:Ljava/util/concurrent/Executor;

    .line 10
    invoke-static {p1}, Lk60$b;->q(Lk60$b;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lk60;->b:Ljava/util/concurrent/Executor;

    .line 11
    invoke-static {p1}, Lk60$b;->r(Lk60$b;)I

    .line 12
    invoke-static {p1}, Lk60$b;->s(Lk60$b;)I

    .line 13
    invoke-static {p1}, Lk60$b;->c(Lk60$b;)Ln60;

    .line 14
    invoke-static {p1}, Lk60$b;->d(Lk60$b;)Lt50;

    .line 15
    invoke-static {p1}, Lk60$b;->e(Lk60$b;)Ld60;

    .line 16
    invoke-static {p1}, Lk60$b;->f(Lk60$b;)Li60;

    .line 17
    invoke-static {p1}, Lk60$b;->g(Lk60$b;)Lw60;

    move-result-object v0

    iput-object v0, p0, Lk60;->c:Lw60;

    .line 18
    invoke-static {p1}, Lk60$b;->h(Lk60$b;)Lr60;

    .line 19
    invoke-static {p1}, Lk60$b;->i(Lk60$b;)Z

    .line 20
    invoke-static {p1}, Lk60$b;->j(Lk60$b;)Z

    .line 21
    invoke-static {p1}, Lk60$b;->k(Lk60$b;)Z

    move-result p1

    invoke-static {p1}, Ly60;->f(Z)V

    return-void
.end method

.method public synthetic constructor <init>(Lk60$b;Lk60$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lk60;-><init>(Lk60$b;)V

    return-void
.end method
