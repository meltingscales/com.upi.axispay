.class public Luk$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Luk;


# direct methods
.method public constructor <init>(Luk;)V
    .locals 0

    .line 1
    iput-object p1, p0, Luk$c;->b:Luk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v1, p0, Luk$c;->b:Luk;

    iget-object v2, v1, Luk;->f:Lqk;

    if-eqz v2, :cond_0

    .line 2
    iget-object v3, v1, Luk;->h:Lpk;

    iget-object v4, v1, Luk;->b:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lqk;->e(Lpk;Ljava/lang/String;)I

    move-result v2

    iput v2, v1, Luk;->c:I

    .line 3
    iget-object v1, p0, Luk$c;->b:Luk;

    iget-object v2, v1, Luk;->d:Ltk;

    iget-object v1, v1, Luk;->e:Ltk$c;

    invoke-virtual {v2, v1}, Ltk;->a(Ltk$c;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const v0, 0xbc8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0xbc9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method
