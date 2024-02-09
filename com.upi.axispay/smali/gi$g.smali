.class public final Lgi$g;
.super Luh$e;
.source "AxisPay"

# interfaces
.implements Lgi$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "g"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public c:Z

.field public d:I

.field public e:I

.field public f:Lgi$a;

.field public g:I

.field public final synthetic h:Lgi;


# direct methods
.method public constructor <init>(Lgi;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgi$g;->h:Lgi;

    invoke-direct {p0}, Luh$e;-><init>()V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lgi$g;->d:I

    .line 3
    iput-object p2, p0, Lgi$g;->a:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lgi$g;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lgi$g;->g:I

    return v0
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lgi$g;->f:Lgi$a;

    if-eqz v0, :cond_0

    .line 2
    iget v1, p0, Lgi$g;->g:I

    invoke-virtual {v0, v1}, Lgi$a;->p(I)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lgi$g;->f:Lgi$a;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lgi$g;->g:I

    :cond_0
    return-void
.end method

.method public c(Lgi$a;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lgi$g;->f:Lgi$a;

    .line 2
    iget-object v0, p0, Lgi$g;->a:Ljava/lang/String;

    iget-object v1, p0, Lgi$g;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lgi$a;->c(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lgi$g;->g:I

    .line 3
    iget-boolean v1, p0, Lgi$g;->c:Z

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {p1, v0}, Lgi$a;->r(I)V

    .line 5
    iget v0, p0, Lgi$g;->d:I

    if-ltz v0, :cond_0

    .line 6
    iget v1, p0, Lgi$g;->g:I

    invoke-virtual {p1, v1, v0}, Lgi$a;->u(II)V

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lgi$g;->d:I

    .line 8
    :cond_0
    iget v0, p0, Lgi$g;->e:I

    if-eqz v0, :cond_1

    .line 9
    iget v1, p0, Lgi$g;->g:I

    invoke-virtual {p1, v1, v0}, Lgi$a;->x(II)V

    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lgi$g;->e:I

    :cond_1
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lgi$g;->h:Lgi;

    invoke-virtual {v0, p0}, Lgi;->N(Lgi$c;)V

    return-void
.end method

.method public e()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lgi$g;->c:Z

    .line 2
    iget-object v0, p0, Lgi$g;->f:Lgi$a;

    if-eqz v0, :cond_0

    .line 3
    iget v1, p0, Lgi$g;->g:I

    invoke-virtual {v0, v1}, Lgi$a;->r(I)V

    :cond_0
    return-void
.end method

.method public f(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgi$g;->f:Lgi$a;

    if-eqz v0, :cond_0

    .line 2
    iget v1, p0, Lgi$g;->g:I

    invoke-virtual {v0, v1, p1}, Lgi$a;->u(II)V

    goto :goto_0

    .line 3
    :cond_0
    iput p1, p0, Lgi$g;->d:I

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lgi$g;->e:I

    :goto_0
    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lgi$g;->h(I)V

    return-void
.end method

.method public h(I)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lgi$g;->c:Z

    .line 2
    iget-object v0, p0, Lgi$g;->f:Lgi$a;

    if-eqz v0, :cond_0

    .line 3
    iget v1, p0, Lgi$g;->g:I

    invoke-virtual {v0, v1, p1}, Lgi$a;->v(II)V

    :cond_0
    return-void
.end method

.method public i(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgi$g;->f:Lgi$a;

    if-eqz v0, :cond_0

    .line 2
    iget v1, p0, Lgi$g;->g:I

    invoke-virtual {v0, v1, p1}, Lgi$a;->x(II)V

    goto :goto_0

    .line 3
    :cond_0
    iget v0, p0, Lgi$g;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Lgi$g;->e:I

    :goto_0
    return-void
.end method
