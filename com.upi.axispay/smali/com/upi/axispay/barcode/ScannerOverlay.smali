.class public Lcom/upi/axispay/barcode/ScannerOverlay;
.super Landroid/view/SurfaceView;
.source "AxisPay"


# instance fields
.field public b:F

.field public c:F

.field public d:F

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:I

.field public j:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/upi/axispay/barcode/ScannerOverlay;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    sget-object v0, Lz80;->ScannerOverlay:[I

    const/4 v1, 0x0

    invoke-virtual {p3, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 4
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f0b0030

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p3

    const/4 v0, 0x4

    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    iput p3, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->e:I

    .line 5
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f0b002f

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p3

    const/4 v0, 0x3

    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p3

    iput p3, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->f:I

    const p3, 0x7f060165

    .line 6
    invoke-static {p1, p3}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p2, v1, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->i:I

    .line 7
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0b0010

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    const/4 v0, 0x2

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    iput p1, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->j:I

    .line 8
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    const/4 p3, 0x1

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    iput p1, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->g:I

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    int-to-float p1, p1

    .line 2
    iget v0, v0, Landroid/util/DisplayMetrics;->xdpi:F

    const/high16 v1, 0x43200000    # 160.0f

    div-float/2addr v0, v1

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 4
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 5
    new-instance v2, Landroid/graphics/RectF;

    iget v3, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->b:F

    iget v4, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->c:F

    iget v5, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->e:I

    invoke-virtual {p0, v5}, Lcom/upi/axispay/barcode/ScannerOverlay;->a(I)I

    move-result v5

    int-to-float v5, v5

    iget v6, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->b:F

    add-float/2addr v5, v6

    iget v6, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->f:I

    invoke-virtual {p0, v6}, Lcom/upi/axispay/barcode/ScannerOverlay;->a(I)I

    move-result v6

    int-to-float v6, v6

    iget v7, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->c:F

    add-float/2addr v6, v7

    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/4 v3, 0x0

    int-to-float v4, v3

    .line 6
    invoke-virtual {p1, v2, v4, v4, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 7
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 8
    iget v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->i:I

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    iget v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->j:I

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 10
    iget v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->d:F

    iget v2, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->c:F

    iget v4, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->f:I

    invoke-virtual {p0, v4}, Lcom/upi/axispay/barcode/ScannerOverlay;->a(I)I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v2, v4

    iget v4, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->g:I

    int-to-float v5, v4

    add-float/2addr v2, v5

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_0

    .line 11
    iput-boolean v1, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->h:Z

    goto :goto_0

    .line 12
    :cond_0
    iget v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->d:F

    iget v1, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->c:F

    int-to-float v2, v4

    add-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 13
    iput-boolean v3, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->h:Z

    .line 14
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->h:Z

    if-eqz v0, :cond_2

    .line 15
    iget v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->d:F

    int-to-float v1, v4

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->d:F

    goto :goto_1

    .line 16
    :cond_2
    iget v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->d:F

    int-to-float v1, v4

    add-float/2addr v0, v1

    iput v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->d:F

    .line 17
    :goto_1
    iget v6, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->b:F

    iget v7, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->d:F

    iget v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->e:I

    invoke-virtual {p0, v0}, Lcom/upi/axispay/barcode/ScannerOverlay;->a(I)I

    move-result v0

    int-to-float v0, v0

    add-float v8, v6, v0

    iget v9, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->d:F

    move-object v5, p1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 18
    invoke-virtual {p0}, Landroid/view/SurfaceView;->invalidate()V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/view/SurfaceView;->setMeasuredDimension(II)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->e:I

    invoke-virtual {p0, v0}, Lcom/upi/axispay/barcode/ScannerOverlay;->a(I)I

    move-result v0

    sub-int v0, p1, v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iput v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->b:F

    .line 2
    iget v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->f:I

    invoke-virtual {p0, v0}, Lcom/upi/axispay/barcode/ScannerOverlay;->a(I)I

    move-result v0

    sub-int v0, p2, v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iput v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->c:F

    .line 3
    iput v0, p0, Lcom/upi/axispay/barcode/ScannerOverlay;->d:F

    .line 4
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/SurfaceView;->onSizeChanged(IIII)V

    return-void
.end method
