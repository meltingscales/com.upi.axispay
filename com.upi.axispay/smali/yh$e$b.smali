.class public final Lyh$e$b;
.super Landroid/os/Handler;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyh$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lyh$c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lyh$i;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Lyh$e;


# direct methods
.method public constructor <init>(Lyh$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyh$e$b;->c:Lyh$e;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lyh$e$b;->a:Ljava/util/ArrayList;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lyh$e$b;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lyh$c;ILjava/lang/Object;I)V
    .locals 5

    .line 1
    iget-object v0, p1, Lyh$c;->a:Lyh;

    .line 2
    iget-object v1, p1, Lyh$c;->b:Lyh$b;

    const v2, 0xff00

    and-int/2addr v2, p2

    const/16 v3, 0x100

    if-eq v2, v3, :cond_1

    const/16 p1, 0x200

    if-eq v2, p1, :cond_0

    goto/16 :goto_4

    .line 3
    :cond_0
    check-cast p3, Lyh$h;

    packed-switch p2, :pswitch_data_0

    goto/16 :goto_4

    .line 4
    :pswitch_0
    invoke-virtual {v1, v0, p3}, Lyh$b;->b(Lyh;Lyh$h;)V

    goto :goto_4

    .line 5
    :pswitch_1
    invoke-virtual {v1, v0, p3}, Lyh$b;->c(Lyh;Lyh$h;)V

    goto :goto_4

    .line 6
    :pswitch_2
    invoke-virtual {v1, v0, p3}, Lyh$b;->a(Lyh;Lyh$h;)V

    goto :goto_4

    :cond_1
    const/16 v2, 0x106

    const/16 v3, 0x108

    if-eq p2, v3, :cond_3

    if-ne p2, v2, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    move-object v4, p3

    check-cast v4, Lyh$i;

    goto :goto_1

    :cond_3
    :goto_0
    move-object v4, p3

    check-cast v4, Lza;

    iget-object v4, v4, Lza;->b:Ljava/lang/Object;

    check-cast v4, Lyh$i;

    :goto_1
    if-eq p2, v3, :cond_5

    if-ne p2, v2, :cond_4

    goto :goto_2

    :cond_4
    const/4 p3, 0x0

    goto :goto_3

    .line 8
    :cond_5
    :goto_2
    check-cast p3, Lza;

    iget-object p3, p3, Lza;->a:Ljava/lang/Object;

    check-cast p3, Lyh$i;

    :goto_3
    if-eqz v4, :cond_7

    .line 9
    invoke-virtual {p1, v4, p2, p3, p4}, Lyh$c;->a(Lyh$i;ILyh$i;I)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    packed-switch p2, :pswitch_data_1

    goto :goto_4

    .line 10
    :pswitch_3
    invoke-virtual {v1, v0, v4, p4, p3}, Lyh$b;->j(Lyh;Lyh$i;ILyh$i;)V

    goto :goto_4

    .line 11
    :pswitch_4
    invoke-virtual {v1, v0, v4, p4}, Lyh$b;->l(Lyh;Lyh$i;I)V

    goto :goto_4

    .line 12
    :pswitch_5
    invoke-virtual {v1, v0, v4, p4, v4}, Lyh$b;->j(Lyh;Lyh$i;ILyh$i;)V

    goto :goto_4

    .line 13
    :pswitch_6
    invoke-virtual {v1, v0, v4}, Lyh$b;->f(Lyh;Lyh$i;)V

    goto :goto_4

    .line 14
    :pswitch_7
    invoke-virtual {v1, v0, v4}, Lyh$b;->m(Lyh;Lyh$i;)V

    goto :goto_4

    .line 15
    :pswitch_8
    invoke-virtual {v1, v0, v4}, Lyh$b;->e(Lyh;Lyh$i;)V

    goto :goto_4

    .line 16
    :pswitch_9
    invoke-virtual {v1, v0, v4}, Lyh$b;->g(Lyh;Lyh$i;)V

    goto :goto_4

    .line 17
    :pswitch_a
    invoke-virtual {v1, v0, v4}, Lyh$b;->d(Lyh;Lyh$i;)V

    :cond_7
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x201
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x101
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public b(ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public c(ILjava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 2
    iput p3, p1, Landroid/os/Message;->arg1:I

    .line 3
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final d(ILjava/lang/Object;)V
    .locals 1

    const/16 v0, 0x106

    if-eq p1, v0, :cond_1

    const/16 v0, 0x108

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 1
    :pswitch_0
    iget-object p1, p0, Lyh$e$b;->c:Lyh$e;

    iget-object p1, p1, Lyh$e;->l:Lji;

    check-cast p2, Lyh$i;

    invoke-virtual {p1, p2}, Lji;->C(Lyh$i;)V

    goto :goto_1

    .line 2
    :pswitch_1
    iget-object p1, p0, Lyh$e$b;->c:Lyh$e;

    iget-object p1, p1, Lyh$e;->l:Lji;

    check-cast p2, Lyh$i;

    invoke-virtual {p1, p2}, Lji;->D(Lyh$i;)V

    goto :goto_1

    .line 3
    :pswitch_2
    iget-object p1, p0, Lyh$e$b;->c:Lyh$e;

    iget-object p1, p1, Lyh$e;->l:Lji;

    check-cast p2, Lyh$i;

    invoke-virtual {p1, p2}, Lji;->B(Lyh$i;)V

    goto :goto_1

    .line 4
    :cond_0
    check-cast p2, Lza;

    iget-object p1, p2, Lza;->b:Ljava/lang/Object;

    check-cast p1, Lyh$i;

    .line 5
    iget-object p2, p0, Lyh$e$b;->b:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object p2, p0, Lyh$e$b;->c:Lyh$e;

    iget-object p2, p2, Lyh$e;->l:Lji;

    invoke-virtual {p2, p1}, Lji;->B(Lyh$i;)V

    .line 7
    iget-object p2, p0, Lyh$e$b;->c:Lyh$e;

    iget-object p2, p2, Lyh$e;->l:Lji;

    invoke-virtual {p2, p1}, Lji;->E(Lyh$i;)V

    goto :goto_1

    .line 8
    :cond_1
    check-cast p2, Lza;

    iget-object p1, p2, Lza;->b:Ljava/lang/Object;

    check-cast p1, Lyh$i;

    .line 9
    iget-object p2, p0, Lyh$e$b;->c:Lyh$e;

    iget-object p2, p2, Lyh$e;->l:Lji;

    invoke-virtual {p2, p1}, Lji;->E(Lyh$i;)V

    .line 10
    iget-object p2, p0, Lyh$e$b;->c:Lyh$e;

    invoke-static {p2}, Lyh$e;->e(Lyh$e;)Lyh$i;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lyh$i;->v()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 11
    iget-object p1, p0, Lyh$e$b;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lyh$i;

    .line 12
    iget-object v0, p0, Lyh$e$b;->c:Lyh$e;

    iget-object v0, v0, Lyh$e;->l:Lji;

    invoke-virtual {v0, p2}, Lji;->D(Lyh$i;)V

    goto :goto_0

    .line 13
    :cond_2
    iget-object p1, p0, Lyh$e$b;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_3
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 3
    iget p1, p1, Landroid/os/Message;->arg1:I

    const/16 v2, 0x103

    if-ne v0, v2, :cond_0

    .line 4
    iget-object v2, p0, Lyh$e$b;->c:Lyh$e;

    .line 5
    invoke-virtual {v2}, Lyh$e;->t()Lyh$i;

    move-result-object v2

    invoke-virtual {v2}, Lyh$i;->j()Ljava/lang/String;

    move-result-object v2

    move-object v3, v1

    check-cast v3, Lyh$i;

    invoke-virtual {v3}, Lyh$i;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    iget-object v2, p0, Lyh$e$b;->c:Lyh$e;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lyh$e;->P(Z)V

    .line 7
    :cond_0
    invoke-virtual {p0, v0, v1}, Lyh$e$b;->d(ILjava/lang/Object;)V

    .line 8
    :try_start_0
    iget-object v2, p0, Lyh$e$b;->c:Lyh$e;

    iget-object v2, v2, Lyh$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_0
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_2

    .line 9
    iget-object v3, p0, Lyh$e$b;->c:Lyh$e;

    iget-object v3, v3, Lyh$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyh;

    if-nez v3, :cond_1

    .line 10
    iget-object v3, p0, Lyh$e$b;->c:Lyh$e;

    iget-object v3, v3, Lyh$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 11
    :cond_1
    iget-object v4, p0, Lyh$e$b;->a:Ljava/util/ArrayList;

    iget-object v3, v3, Lyh;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 12
    :cond_2
    iget-object v2, p0, Lyh$e$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_3

    .line 13
    iget-object v4, p0, Lyh$e$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lyh$c;

    invoke-virtual {p0, v4, v0, v1, p1}, Lyh$e$b;->a(Lyh$c;ILjava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 14
    :cond_3
    iget-object p1, p0, Lyh$e$b;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lyh$e$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 15
    throw p1
.end method
