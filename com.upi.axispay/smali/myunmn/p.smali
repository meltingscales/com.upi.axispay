.class public Lmyunmn/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmyunmn/b;


# direct methods
.method public constructor <init>(Lmyunmn/b;)V
    .locals 0

    iput-object p1, p0, Lmyunmn/p;->a:Lmyunmn/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lmyunmn/p;->a:Lmyunmn/b;

    invoke-virtual {v0}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lmyunmn/p;->a:Lmyunmn/b;

    invoke-static {v0}, Lmyunmn/b;->g(Lmyunmn/b;)V

    iget-object v0, p0, Lmyunmn/p;->a:Lmyunmn/b;

    invoke-static {v0}, Lmyunmn/b;->j(Lmyunmn/b;)V

    iget-object v0, p0, Lmyunmn/p;->a:Lmyunmn/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lmyunmn/b;->b(Lmyunmn/b;Z)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lmyunmn/p;->a:Lmyunmn/b;

    invoke-static {v0}, Lmyunmn/b;->a(Lmyunmn/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lmyunmn/p;->a:Lmyunmn/b;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lmyunmn/b;->b(Lmyunmn/b;Z)Z

    new-instance v0, Lmyunmn/a;

    invoke-direct {v0, p0}, Lmyunmn/a;-><init>(Lmyunmn/p;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :goto_0
    return-void
.end method
