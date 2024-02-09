.class public Lji$d;
.super Lji$c;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lji$f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lji$c;-><init>(Landroid/content/Context;Lji$f;)V

    return-void
.end method


# virtual methods
.method public M()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lji$b;->j:Ljava/lang/Object;

    invoke-static {v0}, Ldi;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public P(Lji$b$b;Lsh$a;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lji$c;->P(Lji$b$b;Lsh$a;)V

    .line 2
    iget-object p1, p1, Lji$b$b;->a:Ljava/lang/Object;

    .line 3
    invoke-static {p1}, Ldi$a;->a(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lsh$a;->h(Ljava/lang/String;)Lsh$a;

    :cond_0
    return-void
.end method

.method public R(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lji$b;->j:Ljava/lang/Object;

    const v1, 0x800003

    invoke-static {v0, v1, p1}, Lbi;->l(Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public S()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lji$b;->p:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lji$b;->j:Ljava/lang/Object;

    iget-object v1, p0, Lji$b;->k:Ljava/lang/Object;

    invoke-static {v0, v1}, Lbi;->j(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lji$b;->p:Z

    .line 4
    iget-object v0, p0, Lji$b;->j:Ljava/lang/Object;

    iget v1, p0, Lji$b;->n:I

    iget-object v2, p0, Lji$b;->k:Ljava/lang/Object;

    .line 5
    iget-boolean v3, p0, Lji$b;->o:Z

    or-int/lit8 v3, v3, 0x2

    .line 6
    invoke-static {v0, v1, v2, v3}, Ldi;->a(Ljava/lang/Object;ILjava/lang/Object;I)V

    return-void
.end method

.method public V(Lji$b$c;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lji$b;->V(Lji$b$c;)V

    .line 2
    iget-object v0, p1, Lji$b$c;->b:Ljava/lang/Object;

    iget-object p1, p1, Lji$b$c;->a:Lyh$i;

    .line 3
    invoke-virtual {p1}, Lyh$i;->d()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {v0, p1}, Ldi$b;->a(Ljava/lang/Object;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public W(Lji$b$b;)Z
    .locals 0

    .line 1
    iget-object p1, p1, Lji$b$b;->a:Ljava/lang/Object;

    invoke-static {p1}, Ldi$a;->b(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
