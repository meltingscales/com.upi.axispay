.class public Lf6;
.super Le6;
.source "AxisPay"


# instance fields
.field public m:I


# direct methods
.method public constructor <init>(Lo6;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le6;-><init>(Lo6;)V

    .line 2
    instance-of p1, p1, Lk6;

    if-eqz p1, :cond_0

    .line 3
    sget-object p1, Le6$a;->c:Le6$a;

    iput-object p1, p0, Le6;->e:Le6$a;

    goto :goto_0

    .line 4
    :cond_0
    sget-object p1, Le6$a;->d:Le6$a;

    iput-object p1, p0, Le6;->e:Le6$a;

    :goto_0
    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Le6;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le6;->j:Z

    .line 3
    iput p1, p0, Le6;->g:I

    .line 4
    iget-object p1, p0, Le6;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc6;

    .line 5
    invoke-interface {v0, v0}, Lc6;->a(Lc6;)V

    goto :goto_0

    :cond_1
    return-void
.end method
