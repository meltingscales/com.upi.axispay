.class public Lx5;
.super Lv5;
.source "AxisPay"


# instance fields
.field public x0:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lv5;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lx5;->x0:Z

    .line 3
    new-instance v0, La6$a;

    return-void
.end method


# virtual methods
.method public a(Ls5;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lx5;->q1()V

    return-void
.end method

.method public q1()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget v1, p0, Lv5;->w0:I

    if-ge v0, v1, :cond_1

    .line 2
    iget-object v1, p0, Lv5;->v0:[Lr5;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v1, v2}, Lr5;->R0(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public r1(Ljava/util/HashSet;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Lr5;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    .line 1
    :goto_0
    iget v2, p0, Lv5;->w0:I

    if-ge v1, v2, :cond_1

    .line 2
    iget-object v2, p0, Lv5;->v0:[Lr5;

    aget-object v2, v2, v1

    .line 3
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public s1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx5;->x0:Z

    return v0
.end method
