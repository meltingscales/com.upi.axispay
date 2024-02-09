.class public Lio/togoto/imagezoomcrop/cropoverlay/utils/ImageViewUtil;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getBitmapRectCenterInside(IIII)Landroid/graphics/Rect;
    .locals 0

    .line 6
    invoke-static {p0, p1, p2, p3}, Lio/togoto/imagezoomcrop/cropoverlay/utils/ImageViewUtil;->getBitmapRectCenterInsideHelper(IIII)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static getBitmapRectCenterInside(Landroid/graphics/Bitmap;Landroid/view/View;)Landroid/graphics/Rect;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p0

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    .line 5
    invoke-static {v0, p0, v1, p1}, Lio/togoto/imagezoomcrop/cropoverlay/utils/ImageViewUtil;->getBitmapRectCenterInsideHelper(IIII)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method private static getBitmapRectCenterInsideHelper(IIII)Landroid/graphics/Rect;
    .locals 10

    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    if-ge p2, p0, :cond_0

    int-to-double v2, p2

    int-to-double v4, p0

    div-double/2addr v2, v4

    goto :goto_0

    :cond_0
    move-wide v2, v0

    :goto_0
    if-ge p3, p1, :cond_1

    int-to-double v4, p3

    int-to-double v6, p1

    div-double/2addr v4, v6

    goto :goto_1

    :cond_1
    move-wide v4, v0

    :goto_1
    cmpl-double v6, v2, v0

    if-nez v6, :cond_3

    cmpl-double v0, v4, v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    int-to-double v0, p1

    int-to-double p0, p0

    goto :goto_3

    :cond_3
    :goto_2
    cmpg-double v0, v2, v4

    if-gtz v0, :cond_4

    int-to-double v0, p2

    int-to-double v2, p1

    mul-double/2addr v2, v0

    int-to-double p0, p0

    div-double p0, v2, p0

    move-wide v8, p0

    move-wide p0, v0

    move-wide v0, v8

    goto :goto_3

    :cond_4
    int-to-double v0, p3

    int-to-double v2, p0

    mul-double/2addr v2, v0

    int-to-double p0, p1

    div-double p0, v2, p0

    :goto_3
    int-to-double v2, p2

    cmpl-double p2, p0, v2

    const/4 v4, 0x0

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    if-nez p2, :cond_5

    int-to-double p2, p3

    sub-double/2addr p2, v0

    div-double/2addr p2, v5

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    move-result-wide p2

    :goto_4
    long-to-int p2, p2

    goto :goto_5

    :cond_5
    int-to-double p2, p3

    cmpl-double v7, v0, p2

    if-nez v7, :cond_6

    sub-double/2addr v2, p0

    div-double/2addr v2, v5

    .line 2
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide p2

    long-to-int p2, p2

    move v8, v4

    move v4, p2

    move p2, v8

    goto :goto_5

    :cond_6
    sub-double/2addr v2, p0

    div-double/2addr v2, v5

    .line 3
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v4, v2

    sub-double/2addr p2, v0

    div-double/2addr p2, v5

    .line 4
    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    move-result-wide p2

    goto :goto_4

    .line 5
    :goto_5
    new-instance p3, Landroid/graphics/Rect;

    .line 6
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p0

    double-to-int p0, p0

    add-int/2addr p0, v4

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p1, v0

    add-int/2addr p1, p2

    invoke-direct {p3, v4, p2, p0, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p3
.end method
