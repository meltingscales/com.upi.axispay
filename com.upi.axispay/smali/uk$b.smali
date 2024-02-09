.class public Luk$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Luk;


# direct methods
.method public constructor <init>(Luk;)V
    .locals 0

    .line 1
    iput-object p1, p0, Luk$b;->a:Luk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    iget-object p1, p0, Luk$b;->a:Luk;

    invoke-static {p2}, Lqk$a;->j(Landroid/os/IBinder;)Lqk;

    move-result-object p2

    iput-object p2, p1, Luk;->f:Lqk;

    .line 2
    iget-object p1, p0, Luk$b;->a:Luk;

    iget-object p2, p1, Luk;->g:Ljava/util/concurrent/Executor;

    iget-object p1, p1, Luk;->k:Ljava/lang/Runnable;

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Luk$b;->a:Luk;

    iget-object v0, p1, Luk;->g:Ljava/util/concurrent/Executor;

    iget-object p1, p1, Luk;->l:Ljava/lang/Runnable;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object p1, p0, Luk$b;->a:Luk;

    const/4 v0, 0x0

    iput-object v0, p1, Luk;->f:Lqk;

    return-void
.end method
