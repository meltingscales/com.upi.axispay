.class public Lt6$a;
.super Lt6;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lt6;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;FJLi5;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Ll5;->h:Z

    return p1
.end method

.method public c(Landroid/view/View;Li5;FJDD)Z
    .locals 6

    move-object v0, p0

    move v1, p3

    move-wide v2, p4

    move-object v4, p1

    move-object v5, p2

    .line 1
    invoke-virtual/range {v0 .. v5}, Lt6;->a(FJLandroid/view/View;Li5;)F

    move-result p2

    invoke-static {p8, p9, p6, p7}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p3

    double-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p2}, Landroid/view/View;->setRotation(F)V

    .line 2
    iget-boolean p1, p0, Ll5;->h:Z

    return p1
.end method