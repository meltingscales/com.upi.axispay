.class public Lvg$a;
.super Landroid/os/Handler;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvg;


# direct methods
.method public constructor <init>(Lvg;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvg$a;->a:Lvg;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lvg$a;->a:Lvg;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Lvg;->k(Ljava/util/List;)V

    :goto_0
    return-void
.end method
