.class public final Lni;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lni$b;
    }
.end annotation


# static fields
.field public static final f:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lni$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:[I

.field public final b:[I

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Loi$d;",
            ">;"
        }
    .end annotation
.end field

.field public final d:[Loi$c;

.field public final e:[F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lni$a;

    invoke-direct {v0}, Lni$a;-><init>()V

    sput-object v0, Lni;->f:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>([II[Loi$c;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 2
    iput-object v0, p0, Lni;->e:[F

    .line 3
    iput-object p3, p0, Lni;->d:[Loi$c;

    const p3, 0x8000

    new-array v0, p3, [I

    .line 4
    iput-object v0, p0, Lni;->b:[I

    const/4 v1, 0x0

    move v2, v1

    .line 5
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_0

    .line 6
    aget v3, p1, v2

    invoke-static {v3}, Lni;->g(I)I

    move-result v3

    .line 7
    aput v3, p1, v2

    .line 8
    aget v4, v0, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    move v2, p1

    :goto_1
    if-ge p1, p3, :cond_3

    .line 9
    aget v3, v0, p1

    if-lez v3, :cond_1

    invoke-virtual {p0, p1}, Lni;->l(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 10
    aput v1, v0, p1

    .line 11
    :cond_1
    aget v3, v0, p1

    if-lez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 12
    :cond_3
    new-array p1, v2, [I

    iput-object p1, p0, Lni;->a:[I

    move v3, v1

    move v4, v3

    :goto_2
    if-ge v3, p3, :cond_5

    .line 13
    aget v5, v0, v3

    if-lez v5, :cond_4

    add-int/lit8 v5, v4, 0x1

    .line 14
    aput v3, p1, v4

    move v4, v5

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    if-gt v2, p2, :cond_6

    .line 15
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lni;->c:Ljava/util/List;

    :goto_3
    if-ge v1, v2, :cond_7

    .line 16
    aget p2, p1, v1

    .line 17
    iget-object p3, p0, Lni;->c:Ljava/util/List;

    new-instance v3, Loi$d;

    invoke-static {p2}, Lni;->a(I)I

    move-result v4

    aget p2, v0, p2

    invoke-direct {v3, v4, p2}, Loi$d;-><init>(II)V

    invoke-interface {p3, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 18
    :cond_6
    invoke-virtual {p0, p2}, Lni;->h(I)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lni;->c:Ljava/util/List;

    :cond_7
    return-void
.end method

.method public static a(I)I
    .locals 2

    .line 1
    invoke-static {p0}, Lni;->k(I)I

    move-result v0

    invoke-static {p0}, Lni;->j(I)I

    move-result v1

    invoke-static {p0}, Lni;->i(I)I

    move-result p0

    invoke-static {v0, v1, p0}, Lni;->b(III)I

    move-result p0

    return p0
.end method

.method public static b(III)I
    .locals 2

    const/4 v0, 0x5

    const/16 v1, 0x8

    .line 1
    invoke-static {p0, v0, v1}, Lni;->f(III)I

    move-result p0

    .line 2
    invoke-static {p1, v0, v1}, Lni;->f(III)I

    move-result p1

    .line 3
    invoke-static {p2, v0, v1}, Lni;->f(III)I

    move-result p2

    .line 4
    invoke-static {p0, p1, p2}, Landroid/graphics/Color;->rgb(III)I

    move-result p0

    return p0
.end method

.method public static e([IIII)V
    .locals 2

    const/4 v0, -0x2

    if-eq p1, v0, :cond_1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    goto :goto_2

    :cond_0
    :goto_0
    if-gt p2, p3, :cond_2

    .line 1
    aget p1, p0, p2

    .line 2
    invoke-static {p1}, Lni;->i(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0xa

    .line 3
    invoke-static {p1}, Lni;->j(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x5

    or-int/2addr v0, v1

    .line 4
    invoke-static {p1}, Lni;->k(I)I

    move-result p1

    or-int/2addr p1, v0

    aput p1, p0, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-gt p2, p3, :cond_2

    .line 5
    aget p1, p0, p2

    .line 6
    invoke-static {p1}, Lni;->j(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0xa

    .line 7
    invoke-static {p1}, Lni;->k(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x5

    or-int/2addr v0, v1

    .line 8
    invoke-static {p1}, Lni;->i(I)I

    move-result p1

    or-int/2addr p1, v0

    aput p1, p0, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public static f(III)I
    .locals 0

    if-le p2, p1, :cond_0

    sub-int p1, p2, p1

    shl-int/2addr p0, p1

    goto :goto_0

    :cond_0
    sub-int/2addr p1, p2

    shr-int/2addr p0, p1

    :goto_0
    const/4 p1, 0x1

    shl-int p2, p1, p2

    sub-int/2addr p2, p1

    and-int/2addr p0, p2

    return p0
.end method

.method public static g(I)I
    .locals 4

    .line 1
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x5

    invoke-static {v0, v1, v2}, Lni;->f(III)I

    move-result v0

    .line 2
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {v3, v1, v2}, Lni;->f(III)I

    move-result v3

    .line 3
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    invoke-static {p0, v1, v2}, Lni;->f(III)I

    move-result p0

    shl-int/lit8 v0, v0, 0xa

    shl-int/lit8 v1, v3, 0x5

    or-int/2addr v0, v1

    or-int/2addr p0, v0

    return p0
.end method

.method public static i(I)I
    .locals 0

    and-int/lit8 p0, p0, 0x1f

    return p0
.end method

.method public static j(I)I
    .locals 0

    shr-int/lit8 p0, p0, 0x5

    and-int/lit8 p0, p0, 0x1f

    return p0
.end method

.method public static k(I)I
    .locals 0

    shr-int/lit8 p0, p0, 0xa

    and-int/lit8 p0, p0, 0x1f

    return p0
.end method


# virtual methods
.method public final c(Ljava/util/Collection;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lni$b;",
            ">;)",
            "Ljava/util/List<",
            "Loi$d;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lni$b;

    .line 3
    invoke-virtual {v1}, Lni$b;->d()Loi$d;

    move-result-object v1

    .line 4
    invoke-virtual {p0, v1}, Lni;->n(Loi$d;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Loi$d;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lni;->c:Ljava/util/List;

    return-object v0
.end method

.method public final h(I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Loi$d;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/PriorityQueue;

    sget-object v1, Lni;->f:Ljava/util/Comparator;

    invoke-direct {v0, p1, v1}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 2
    new-instance v1, Lni$b;

    iget-object v2, p0, Lni;->a:[I

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, Lni$b;-><init>(Lni;II)V

    invoke-virtual {v0, v1}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    .line 3
    invoke-virtual {p0, v0, p1}, Lni;->o(Ljava/util/PriorityQueue;I)V

    .line 4
    invoke-virtual {p0, v0}, Lni;->c(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final l(I)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lni;->a(I)I

    move-result p1

    .line 2
    iget-object v0, p0, Lni;->e:[F

    invoke-static {p1, v0}, Ld9;->f(I[F)V

    .line 3
    iget-object v0, p0, Lni;->e:[F

    invoke-virtual {p0, p1, v0}, Lni;->m(I[F)Z

    move-result p1

    return p1
.end method

.method public final m(I[F)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lni;->d:[Loi$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    array-length v2, v0

    if-lez v2, :cond_1

    .line 2
    array-length v0, v0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    .line 3
    iget-object v3, p0, Lni;->d:[Loi$c;

    aget-object v3, v3, v2

    invoke-interface {v3, p1, p2}, Loi$c;->a(I[F)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final n(Loi$d;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Loi$d;->e()I

    move-result v0

    invoke-virtual {p1}, Loi$d;->c()[F

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lni;->m(I[F)Z

    move-result p1

    return p1
.end method

.method public final o(Ljava/util/PriorityQueue;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/PriorityQueue<",
            "Lni$b;",
            ">;I)V"
        }
    .end annotation

    .line 1
    :goto_0
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->size()I

    move-result v0

    if-ge v0, p2, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lni$b;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lni$b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0}, Lni$b;->h()Lni$b;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    .line 5
    invoke-virtual {p1, v0}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method
