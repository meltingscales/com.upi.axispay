.class public La4;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La4$c;,
        La4$f;,
        La4$d;,
        La4$b;,
        La4$a;,
        La4$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public b:La4$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La4$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public c:La4$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La4$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public d:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "La4$f<",
            "TK;TV;>;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, La4;->d:Ljava/util/WeakHashMap;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, La4;->e:I

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, La4$b;

    iget-object v1, p0, La4;->c:La4$c;

    iget-object v2, p0, La4;->b:La4$c;

    invoke-direct {v0, v1, v2}, La4$b;-><init>(La4$c;La4$c;)V

    .line 2
    iget-object v1, p0, La4;->d:Ljava/util/WeakHashMap;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public b()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, La4;->b:La4$c;

    return-object v0
.end method

.method public c(Ljava/lang/Object;)La4$c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "La4$c<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, La4;->b:La4$c;

    :goto_0
    if-eqz v0, :cond_1

    .line 2
    iget-object v1, v0, La4$c;->b:Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v0, v0, La4$c;->d:La4$c;

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method

.method public d()La4$d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La4<",
            "TK;TV;>.d;"
        }
    .end annotation

    .line 1
    new-instance v0, La4$d;

    invoke-direct {v0, p0}, La4$d;-><init>(La4;)V

    .line 2
    iget-object v1, p0, La4;->d:Ljava/util/WeakHashMap;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public e()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, La4;->c:La4$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, La4;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, La4;

    .line 3
    invoke-virtual {p0}, La4;->size()I

    move-result v1

    invoke-virtual {p1}, La4;->size()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    .line 4
    :cond_2
    invoke-virtual {p0}, La4;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 5
    invoke-virtual {p1}, La4;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 6
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 8
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_4

    if-nez v4, :cond_5

    :cond_4
    if-eqz v3, :cond_3

    .line 9
    invoke-interface {v3, v4}, Ljava/util/Map$Entry;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_5
    return v2

    .line 10
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    move v0, v2

    :goto_0
    return v0
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;)La4$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "La4$c<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, La4$c;

    invoke-direct {v0, p1, p2}, La4$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    iget p1, p0, La4;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, La4;->e:I

    .line 3
    iget-object p1, p0, La4;->c:La4$c;

    if-nez p1, :cond_0

    .line 4
    iput-object v0, p0, La4;->b:La4$c;

    .line 5
    iput-object v0, p0, La4;->c:La4$c;

    return-object v0

    .line 6
    :cond_0
    iput-object v0, p1, La4$c;->d:La4$c;

    .line 7
    iput-object p1, v0, La4$c;->e:La4$c;

    .line 8
    iput-object v0, p0, La4;->c:La4$c;

    return-object v0
.end method

.method public g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, La4;->c(Ljava/lang/Object;)La4$c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, v0, La4$c;->c:Ljava/lang/Object;

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p0, p1, p2}, La4;->f(Ljava/lang/Object;Ljava/lang/Object;)La4$c;

    const/4 p1, 0x0

    return-object p1
.end method

.method public h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, La4;->c(Ljava/lang/Object;)La4$c;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget v1, p0, La4;->e:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, La4;->e:I

    .line 3
    iget-object v1, p0, La4;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v1}, Ljava/util/WeakHashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 4
    iget-object v1, p0, La4;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La4$f;

    .line 5
    invoke-interface {v2, p1}, La4$f;->a(La4$c;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v1, p1, La4$c;->e:La4$c;

    if-eqz v1, :cond_2

    .line 7
    iget-object v2, p1, La4$c;->d:La4$c;

    iput-object v2, v1, La4$c;->d:La4$c;

    goto :goto_1

    .line 8
    :cond_2
    iget-object v2, p1, La4$c;->d:La4$c;

    iput-object v2, p0, La4;->b:La4$c;

    .line 9
    :goto_1
    iget-object v2, p1, La4$c;->d:La4$c;

    if-eqz v2, :cond_3

    .line 10
    iput-object v1, v2, La4$c;->e:La4$c;

    goto :goto_2

    .line 11
    :cond_3
    iput-object v1, p0, La4;->c:La4$c;

    .line 12
    :goto_2
    iput-object v0, p1, La4$c;->d:La4$c;

    .line 13
    iput-object v0, p1, La4$c;->e:La4$c;

    .line 14
    iget-object p1, p1, La4$c;->c:Ljava/lang/Object;

    return-object p1
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, La4;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, La4$a;

    iget-object v1, p0, La4;->b:La4$c;

    iget-object v2, p0, La4;->c:La4$c;

    invoke-direct {v0, v1, v2}, La4$a;-><init>(La4$c;La4$c;)V

    .line 2
    iget-object v1, p0, La4;->d:Ljava/util/WeakHashMap;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, La4;->e:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x3d2e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p0}, La4;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 4
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x3d2f

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const v1, 0x3d30

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method