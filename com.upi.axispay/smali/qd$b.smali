.class public Lqd$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd;->f(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lpe$e;

.field public final synthetic d:Lqd;


# direct methods
.method public constructor <init>(Lqd;Ljava/util/List;Lpe$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqd$b;->d:Lqd;

    iput-object p2, p0, Lqd$b;->b:Ljava/util/List;

    iput-object p3, p0, Lqd$b;->c:Lpe$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqd$b;->b:Ljava/util/List;

    iget-object v1, p0, Lqd$b;->c:Lpe$e;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lqd$b;->b:Ljava/util/List;

    iget-object v1, p0, Lqd$b;->c:Lpe$e;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lqd$b;->d:Lqd;

    iget-object v1, p0, Lqd$b;->c:Lpe$e;

    invoke-virtual {v0, v1}, Lqd;->s(Lpe$e;)V

    :cond_0
    return-void
.end method
