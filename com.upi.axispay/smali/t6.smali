.class public abstract Lt6;
.super Ll5;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt6$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ll5;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FJLandroid/view/View;Li5;)F
    .locals 7

    .line 1
    iget-object v0, p0, Ll5;->a:Lg5;

    float-to-double v1, p1

    iget-object p1, p0, Ll5;->g:[F

    invoke-virtual {v0, v1, v2, p1}, Lg5;->c(D[F)V

    .line 2
    iget-object p1, p0, Ll5;->g:[F

    const/4 v0, 0x1

    aget v0, p1, v0

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 3
    iput-boolean v2, p0, Ll5;->h:Z

    const/4 p2, 0x2

    .line 4
    aget p1, p1, p2

    return p1

    .line 5
    :cond_0
    iget p1, p0, Ll5;->j:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Ll5;->f:Ljava/lang/String;

    invoke-virtual {p5, p4, p1, v2}, Li5;->a(Ljava/lang/Object;Ljava/lang/String;I)F

    throw v1

    .line 7
    :cond_1
    iget-wide v3, p0, Ll5;->i:J

    sub-long/2addr p2, v3

    .line 8
    iget p1, p0, Ll5;->j:F

    float-to-double v3, p1

    long-to-double p1, p2

    const-wide v5, 0x3e112e0be826d695L    # 1.0E-9

    mul-double/2addr p1, v5

    float-to-double v5, v0

    mul-double/2addr p1, v5

    add-double/2addr v3, p1

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    rem-double/2addr v3, p1

    double-to-float p1, v3

    iput p1, p0, Ll5;->j:F

    .line 9
    iget-object p2, p0, Ll5;->f:Ljava/lang/String;

    invoke-virtual {p5, p4, p2, v2, p1}, Li5;->b(Ljava/lang/Object;Ljava/lang/String;IF)V

    throw v1
.end method

.method public abstract b(Landroid/view/View;FJLi5;)Z
.end method
