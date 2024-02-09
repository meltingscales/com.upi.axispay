.class public final Lch$g;
.super Lyh$b;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "g"
.end annotation


# instance fields
.field public final synthetic a:Lch;


# direct methods
.method public constructor <init>(Lch;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lch$g;->a:Lch;

    invoke-direct {p0}, Lyh$b;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lyh;Lyh$i;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lch$g;->a:Lch;

    invoke-virtual {p1}, Lch;->v()V

    return-void
.end method

.method public e(Lyh;Lyh$i;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lch$g;->a:Lch;

    iget-object p1, p1, Lch;->g:Lyh$i;

    if-ne p2, p1, :cond_2

    invoke-virtual {p2}, Lyh$i;->g()Luh$b;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 2
    invoke-virtual {p2}, Lyh$i;->p()Lyh$h;

    move-result-object p1

    invoke-virtual {p1}, Lyh$h;->f()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lyh$i;

    .line 3
    iget-object v0, p0, Lch$g;->a:Lch;

    iget-object v0, v0, Lch;->g:Lyh$i;

    invoke-virtual {v0}, Lyh$i;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lch$g;->a:Lch;

    iget-object v0, v0, Lch;->g:Lyh$i;

    .line 5
    invoke-virtual {v0, p2}, Lyh$i;->h(Lyh$i;)Lyh$i$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lyh$i$a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lch$g;->a:Lch;

    iget-object v0, v0, Lch;->i:Ljava/util/List;

    .line 7
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_3

    .line 8
    iget-object p1, p0, Lch$g;->a:Lch;

    invoke-virtual {p1}, Lch;->w()V

    .line 9
    iget-object p1, p0, Lch$g;->a:Lch;

    invoke-virtual {p1}, Lch;->t()V

    goto :goto_2

    .line 10
    :cond_3
    iget-object p1, p0, Lch$g;->a:Lch;

    invoke-virtual {p1}, Lch;->v()V

    :goto_2
    return-void
.end method

.method public g(Lyh;Lyh$i;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lch$g;->a:Lch;

    invoke-virtual {p1}, Lch;->v()V

    return-void
.end method

.method public h(Lyh;Lyh$i;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lch$g;->a:Lch;

    iput-object p2, p1, Lch;->g:Lyh$i;

    const/4 p2, 0x0

    .line 2
    iput-boolean p2, p1, Lch;->w:Z

    .line 3
    invoke-virtual {p1}, Lch;->w()V

    .line 4
    iget-object p1, p0, Lch$g;->a:Lch;

    invoke-virtual {p1}, Lch;->t()V

    return-void
.end method

.method public k(Lyh;Lyh$i;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lch$g;->a:Lch;

    invoke-virtual {p1}, Lch;->v()V

    return-void
.end method

.method public m(Lyh;Lyh$i;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lyh$i;->r()I

    move-result p1

    .line 2
    sget-boolean v0, Lch;->R:Z

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x6a3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4
    :cond_0
    iget-object p1, p0, Lch$g;->a:Lch;

    iget-object v0, p1, Lch;->u:Lyh$i;

    if-eq v0, p2, :cond_1

    .line 5
    iget-object p1, p1, Lch;->t:Ljava/util/Map;

    invoke-virtual {p2}, Lyh$i;->j()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lch$f;

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1}, Lch$f;->R()V

    :cond_1
    return-void
.end method
