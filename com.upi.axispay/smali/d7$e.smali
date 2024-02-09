.class public Ld7$e;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public a:F

.field public b:F

.field public c:I

.field public d:I

.field public final synthetic e:Ld7;


# direct methods
.method public constructor <init>(Ld7;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld7$e;->e:Ld7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 2
    iput p1, p0, Ld7$e;->a:F

    .line 3
    iput p1, p0, Ld7$e;->b:F

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Ld7$e;->c:I

    .line 5
    iput p1, p0, Ld7$e;->d:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget v0, p0, Ld7$e;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, Ld7$e;->d:I

    if-eq v2, v1, :cond_3

    :cond_0
    if-ne v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Ld7$e;->e:Ld7;

    iget v2, p0, Ld7$e;->d:I

    invoke-virtual {v0, v2}, Ld7;->Q(I)V

    goto :goto_0

    .line 3
    :cond_1
    iget v2, p0, Ld7$e;->d:I

    if-ne v2, v1, :cond_2

    .line 4
    iget-object v2, p0, Ld7$e;->e:Ld7;

    invoke-virtual {v2, v0, v1, v1}, Ld7;->N(III)V

    goto :goto_0

    .line 5
    :cond_2
    iget-object v3, p0, Ld7$e;->e:Ld7;

    invoke-virtual {v3, v0, v2}, Ld7;->O(II)V

    .line 6
    :goto_0
    iget-object v0, p0, Ld7$e;->e:Ld7;

    sget-object v2, Ld7$g;->c:Ld7$g;

    invoke-virtual {v0, v2}, Ld7;->setState(Ld7$g;)V

    .line 7
    :cond_3
    iget v0, p0, Ld7$e;->b:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 8
    iget v0, p0, Ld7$e;->a:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    .line 9
    :cond_4
    iget-object v0, p0, Ld7$e;->e:Ld7;

    iget v1, p0, Ld7$e;->a:F

    invoke-virtual {v0, v1}, Ld7;->setProgress(F)V

    return-void

    .line 10
    :cond_5
    iget-object v0, p0, Ld7$e;->e:Ld7;

    iget v2, p0, Ld7$e;->a:F

    iget v3, p0, Ld7$e;->b:F

    invoke-virtual {v0, v2, v3}, Ld7;->M(FF)V

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 11
    iput v0, p0, Ld7$e;->a:F

    .line 12
    iput v0, p0, Ld7$e;->b:F

    .line 13
    iput v1, p0, Ld7$e;->c:I

    .line 14
    iput v1, p0, Ld7$e;->d:I

    return-void
.end method

.method public b()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    iget v1, p0, Ld7$e;->a:F

    const v2, 0x1527

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 3
    iget v1, p0, Ld7$e;->b:F

    const v2, 0x1528

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 4
    iget v1, p0, Ld7$e;->c:I

    const v2, 0x1529

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 5
    iget v1, p0, Ld7$e;->d:I

    const v2, 0x152a

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7$e;->e:Ld7;

    invoke-static {v0}, Ld7;->C(Ld7;)I

    move-result v0

    iput v0, p0, Ld7$e;->d:I

    .line 2
    iget-object v0, p0, Ld7$e;->e:Ld7;

    invoke-static {v0}, Ld7;->D(Ld7;)I

    move-result v0

    iput v0, p0, Ld7$e;->c:I

    .line 3
    iget-object v0, p0, Ld7$e;->e:Ld7;

    invoke-virtual {v0}, Ld7;->getVelocity()F

    move-result v0

    iput v0, p0, Ld7$e;->b:F

    .line 4
    iget-object v0, p0, Ld7$e;->e:Ld7;

    invoke-virtual {v0}, Ld7;->getProgress()F

    move-result v0

    iput v0, p0, Ld7$e;->a:F

    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld7$e;->d:I

    return-void
.end method

.method public e(F)V
    .locals 0

    .line 1
    iput p1, p0, Ld7$e;->a:F

    return-void
.end method

.method public f(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld7$e;->c:I

    return-void
.end method

.method public g(Landroid/os/Bundle;)V
    .locals 1

    const v0, 0x152b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Ld7$e;->a:F

    const v0, 0x152c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Ld7$e;->b:F

    const v0, 0x152d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ld7$e;->c:I

    const v0, 0x152e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ld7$e;->d:I

    return-void
.end method

.method public h(F)V
    .locals 0

    .line 1
    iput p1, p0, Ld7$e;->b:F

    return-void
.end method
