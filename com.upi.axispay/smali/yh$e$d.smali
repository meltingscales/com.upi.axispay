.class public final Lyh$e$d;
.super Lrh$a;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyh$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Lyh$e;


# direct methods
.method public constructor <init>(Lyh$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyh$e$d;->a:Lyh$e;

    invoke-direct {p0}, Lrh$a;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lyh$e;Lyh$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lyh$e$d;-><init>(Lyh$e;)V

    return-void
.end method


# virtual methods
.method public a(Luh$e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyh$e$d;->a:Lyh$e;

    iget-object v0, v0, Lyh$e;->s:Luh$e;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x2

    .line 2
    invoke-virtual {p0, p1}, Lyh$e$d;->d(I)V

    goto :goto_0

    .line 3
    :cond_0
    sget-boolean v0, Lyh;->c:Z

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x135c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :cond_1
    :goto_0
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyh$e$d;->d(I)V

    return-void
.end method

.method public c(Ljava/lang/String;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyh$e$d;->a:Lyh$e;

    invoke-virtual {v0}, Lyh$e;->s()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyh$i;

    .line 2
    invoke-virtual {v1}, Lyh$i;->q()Luh;

    move-result-object v2

    iget-object v3, p0, Lyh$e$d;->a:Lyh$e;

    iget-object v3, v3, Lyh$e;->c:Lrh;

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {v1}, Lyh$i;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_3

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x135d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const p2, 0x135e

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_3
    iget-object p1, p0, Lyh$e$d;->a:Lyh$e;

    invoke-virtual {p1, v1, p2}, Lyh$e;->G(Lyh$i;I)V

    return-void
.end method

.method public d(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyh$e$d;->a:Lyh$e;

    invoke-virtual {v0}, Lyh$e;->h()Lyh$i;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lyh$e$d;->a:Lyh$e;

    invoke-virtual {v1}, Lyh$e;->t()Lyh$i;

    move-result-object v1

    if-eq v1, v0, :cond_0

    .line 3
    iget-object v1, p0, Lyh$e$d;->a:Lyh$e;

    invoke-virtual {v1, v0, p1}, Lyh$e;->G(Lyh$i;I)V

    :cond_0
    return-void
.end method
