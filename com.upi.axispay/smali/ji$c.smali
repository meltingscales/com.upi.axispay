.class public Lji$c;
.super Lji$b;
.source "AxisPay"

# interfaces
.implements Lci$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public w:Lci$a;

.field public x:Lci$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lji$f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lji$b;-><init>(Landroid/content/Context;Lji$f;)V

    return-void
.end method


# virtual methods
.method public H()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lci;->a(Lci$b;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public P(Lji$b$b;Lsh$a;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lji$b;->P(Lji$b$b;Lsh$a;)V

    .line 2
    iget-object v0, p1, Lji$b$b;->a:Ljava/lang/Object;

    invoke-static {v0}, Lci$e;->b(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p2, v0}, Lsh$a;->j(Z)Lsh$a;

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lji$c;->W(Lji$b$b;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 5
    invoke-virtual {p2, v0}, Lsh$a;->g(I)Lsh$a;

    .line 6
    :cond_1
    iget-object p1, p1, Lji$b$b;->a:Ljava/lang/Object;

    .line 7
    invoke-static {p1}, Lci$e;->a(Ljava/lang/Object;)Landroid/view/Display;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 8
    invoke-virtual {p1}, Landroid/view/Display;->getDisplayId()I

    move-result p1

    invoke-virtual {p2, p1}, Lsh$a;->q(I)Lsh$a;

    :cond_2
    return-void
.end method

.method public S()V
    .locals 3

    .line 1
    invoke-super {p0}, Lji$b;->S()V

    .line 2
    iget-object v0, p0, Lji$c;->w:Lci$a;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lci$a;

    .line 4
    invoke-virtual {p0}, Luh;->n()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Luh;->q()Landroid/os/Handler;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lci$a;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lji$c;->w:Lci$a;

    .line 5
    :cond_0
    iget-object v0, p0, Lji$c;->w:Lci$a;

    iget-boolean v1, p0, Lji$b;->o:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lji$b;->n:I

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lci$a;->a(I)V

    return-void
.end method

.method public W(Lji$b$b;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lji$c;->x:Lci$d;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lci$d;

    invoke-direct {v0}, Lci$d;-><init>()V

    iput-object v0, p0, Lji$c;->x:Lci$d;

    .line 3
    :cond_0
    iget-object v0, p0, Lji$c;->x:Lci$d;

    iget-object p1, p1, Lji$b$b;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Lci$d;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lji$b;->J(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_1

    .line 2
    iget-object v1, p0, Lji$b;->q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lji$b$b;

    .line 3
    invoke-static {p1}, Lci$e;->a(Ljava/lang/Object;)Landroid/view/Display;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Landroid/view/Display;->getDisplayId()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    .line 5
    :goto_0
    iget-object v1, v0, Lji$b$b;->c:Lsh;

    .line 6
    invoke-virtual {v1}, Lsh;->r()I

    move-result v1

    if-eq p1, v1, :cond_1

    .line 7
    new-instance v1, Lsh$a;

    iget-object v2, v0, Lji$b$b;->c:Lsh;

    invoke-direct {v1, v2}, Lsh$a;-><init>(Lsh;)V

    .line 8
    invoke-virtual {v1, p1}, Lsh$a;->q(I)Lsh$a;

    .line 9
    invoke-virtual {v1}, Lsh$a;->e()Lsh;

    move-result-object p1

    iput-object p1, v0, Lji$b$b;->c:Lsh;

    .line 10
    invoke-virtual {p0}, Lji$b;->Q()V

    :cond_1
    return-void
.end method
