.class public Lyh$e$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Luh$b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyh$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lyh$e;


# direct methods
.method public constructor <init>(Lyh$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyh$e$a;->a:Lyh$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Luh$b;Lsh;Ljava/util/Collection;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luh$b;",
            "Lsh;",
            "Ljava/util/Collection<",
            "Luh$b$c;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lyh$e$a;->a:Lyh$e;

    iget-object v1, v0, Lyh$e;->u:Luh$e;

    if-ne p1, v1, :cond_1

    if-eqz p2, :cond_1

    .line 2
    iget-object p1, v0, Lyh$e;->t:Lyh$i;

    invoke-virtual {p1}, Lyh$i;->p()Lyh$h;

    move-result-object p1

    .line 3
    invoke-virtual {p2}, Lsh;->l()Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lyh$e$a;->a:Lyh$e;

    invoke-virtual {v1, p1, v0}, Lyh$e;->g(Lyh$h;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5
    new-instance v4, Lyh$i;

    invoke-direct {v4, p1, v0, v1}, Lyh$i;-><init>(Lyh$h;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v4, p2}, Lyh$i;->E(Lsh;)I

    .line 7
    iget-object v3, p0, Lyh$e$a;->a:Lyh$e;

    iget-object p1, v3, Lyh$e;->r:Lyh$i;

    if-ne p1, v4, :cond_0

    return-void

    .line 8
    :cond_0
    iget-object v5, v3, Lyh$e;->u:Luh$e;

    const/4 v6, 0x3

    iget-object v7, v3, Lyh$e;->t:Lyh$i;

    move-object v2, v3

    move-object v8, p3

    invoke-virtual/range {v2 .. v8}, Lyh$e;->B(Lyh$e;Lyh$i;Luh$e;ILyh$i;Ljava/util/Collection;)V

    .line 9
    iget-object p1, p0, Lyh$e$a;->a:Lyh$e;

    const/4 p2, 0x0

    iput-object p2, p1, Lyh$e;->t:Lyh$i;

    .line 10
    iput-object p2, p1, Lyh$e;->u:Luh$e;

    goto :goto_0

    .line 11
    :cond_1
    iget-object v1, v0, Lyh$e;->s:Luh$e;

    if-ne p1, v1, :cond_3

    if-eqz p2, :cond_2

    .line 12
    iget-object p1, v0, Lyh$e;->r:Lyh$i;

    invoke-virtual {v0, p1, p2}, Lyh$e;->O(Lyh$i;Lsh;)I

    .line 13
    :cond_2
    iget-object p1, p0, Lyh$e$a;->a:Lyh$e;

    iget-object p1, p1, Lyh$e;->r:Lyh$i;

    invoke-virtual {p1, p3}, Lyh$i;->K(Ljava/util/Collection;)V

    :cond_3
    :goto_0
    return-void
.end method
