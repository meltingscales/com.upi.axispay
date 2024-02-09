.class public Lmyunmn/a;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lmyunmn/p;


# direct methods
.method public constructor <init>(Lmyunmn/p;)V
    .locals 0

    iput-object p1, p0, Lmyunmn/a;->a:Lmyunmn/p;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :goto_0
    iget-object v0, p0, Lmyunmn/a;->a:Lmyunmn/p;

    iget-object v0, v0, Lmyunmn/p;->a:Lmyunmn/b;

    invoke-static {v0}, Lmyunmn/b;->a(Lmyunmn/b;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lmyunmn/a;->a:Lmyunmn/p;

    iget-object v0, v0, Lmyunmn/p;->a:Lmyunmn/b;

    invoke-virtual {v0}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmyunmn/a;->a:Lmyunmn/p;

    iget-object v0, v0, Lmyunmn/p;->a:Lmyunmn/b;

    invoke-virtual {v0}, Lmyunmn/b;->w()V

    goto :goto_1

    :cond_1
    const-wide/16 v0, 0x3e8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :goto_1
    iget-object v0, p0, Lmyunmn/a;->a:Lmyunmn/p;

    iget-object v0, v0, Lmyunmn/p;->a:Lmyunmn/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lmyunmn/b;->b(Lmyunmn/b;Z)Z

    return-void
.end method
