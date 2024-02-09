.class public Lcom/pkmmte/view/CircularImageView;
.super Landroid/widget/ImageView;
.source "AxisPay"


# instance fields
.field public b:Z

.field public c:Z

.field public d:Z

.field public e:I

.field public f:I

.field public g:I

.field public h:Landroid/graphics/BitmapShader;

.field public i:Landroid/graphics/Bitmap;

.field public j:Landroid/graphics/Paint;

.field public k:Landroid/graphics/Paint;

.field public l:Landroid/graphics/Paint;

.field public m:Landroid/graphics/ColorFilter;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget v0, Ls70;->circularImageViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/pkmmte/view/CircularImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/pkmmte/view/CircularImageView;->c(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/pkmmte/view/CircularImageView;->k:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Landroid/widget/ImageView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 2
    iget-object v0, p0, Lcom/pkmmte/view/CircularImageView;->k:Landroid/graphics/Paint;

    const/high16 v1, 0x40800000    # 4.0f

    const/4 v2, 0x0

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v4, -0x1000000

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    return-void
.end method

.method public b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 5

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    .line 3
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 4
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 5
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 6
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-object v0
.end method

.method public final c(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/pkmmte/view/CircularImageView;->j:Landroid/graphics/Paint;

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 3
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/pkmmte/view/CircularImageView;->k:Landroid/graphics/Paint;

    .line 4
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 5
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/pkmmte/view/CircularImageView;->l:Landroid/graphics/Paint;

    .line 6
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 7
    sget-object v0, Lt70;->CircularImageView:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v0, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 8
    invoke-virtual {p2, v2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/pkmmte/view/CircularImageView;->b:Z

    const/4 p3, 0x3

    .line 9
    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/pkmmte/view/CircularImageView;->c:Z

    .line 10
    iget-boolean p3, p0, Lcom/pkmmte/view/CircularImageView;->b:Z

    const/high16 v0, 0x3f000000    # 0.5f

    const/high16 v3, 0x40000000    # 2.0f

    if-eqz p3, :cond_0

    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p3, v3

    add-float/2addr p3, v0

    float-to-int p3, p3

    const/4 v4, 0x2

    .line 12
    invoke-virtual {p2, v4, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p3

    invoke-virtual {p0, p3}, Lcom/pkmmte/view/CircularImageView;->setBorderWidth(I)V

    const/4 p3, -0x1

    .line 13
    invoke-virtual {p2, v1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    invoke-virtual {p0, p3}, Lcom/pkmmte/view/CircularImageView;->setBorderColor(I)V

    .line 14
    :cond_0
    iget-boolean p3, p0, Lcom/pkmmte/view/CircularImageView;->c:Z

    if-eqz p3, :cond_1

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, v3

    add-float/2addr p1, v0

    float-to-int p1, p1

    const/4 p3, 0x4

    .line 16
    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    invoke-virtual {p0, p3}, Lcom/pkmmte/view/CircularImageView;->setSelectorColor(I)V

    const/4 p3, 0x6

    .line 17
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/pkmmte/view/CircularImageView;->setSelectorStrokeWidth(I)V

    const/4 p1, 0x5

    const p3, -0xffff01

    .line 18
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/pkmmte/view/CircularImageView;->setSelectorStrokeColor(I)V

    :cond_1
    const/4 p1, 0x7

    .line 19
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 20
    invoke-virtual {p0}, Lcom/pkmmte/view/CircularImageView;->a()V

    .line 21
    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final d(I)I
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget p1, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    :goto_0
    add-int/lit8 p1, p1, 0x2

    return p1
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->isClickable()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    iput-boolean v1, p0, Lcom/pkmmte/view/CircularImageView;->d:Z

    .line 3
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/16 v2, 0x8

    if-eq v0, v2, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iput-boolean v1, p0, Lcom/pkmmte/view/CircularImageView;->d:Z

    goto :goto_0

    .line 6
    :cond_2
    iput-boolean v2, p0, Lcom/pkmmte/view/CircularImageView;->d:Z

    .line 7
    :goto_0
    invoke-virtual {p0}, Lcom/pkmmte/view/CircularImageView;->invalidate()V

    .line 8
    invoke-super {p0, p1}, Landroid/widget/ImageView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final e(I)I
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget p1, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    :goto_0
    return p1
.end method

.method public f()V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/BitmapShader;

    iget-object v1, p0, Lcom/pkmmte/view/CircularImageView;->i:Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    const/4 v3, 0x0

    invoke-static {v1, v2, v2, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, v1, v2, v2}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lcom/pkmmte/view/CircularImageView;->h:Landroid/graphics/BitmapShader;

    return-void
.end method

.method public invalidate()V
    .locals 1

    .line 9
    invoke-super {p0}, Landroid/widget/ImageView;->invalidate()V

    .line 10
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pkmmte/view/CircularImageView;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/pkmmte/view/CircularImageView;->i:Landroid/graphics/Bitmap;

    .line 11
    iget-object v0, p0, Lcom/pkmmte/view/CircularImageView;->h:Landroid/graphics/BitmapShader;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    if-lez v0, :cond_1

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/pkmmte/view/CircularImageView;->f()V

    :cond_1
    return-void
.end method

.method public invalidate(IIII)V
    .locals 0

    .line 5
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->invalidate(IIII)V

    .line 6
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/pkmmte/view/CircularImageView;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/pkmmte/view/CircularImageView;->i:Landroid/graphics/Bitmap;

    .line 7
    iget-object p1, p0, Lcom/pkmmte/view/CircularImageView;->h:Landroid/graphics/BitmapShader;

    if-nez p1, :cond_0

    iget p1, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    if-lez p1, :cond_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/pkmmte/view/CircularImageView;->f()V

    :cond_1
    return-void
.end method

.method public invalidate(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->invalidate(Landroid/graphics/Rect;)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/pkmmte/view/CircularImageView;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/pkmmte/view/CircularImageView;->i:Landroid/graphics/Bitmap;

    .line 3
    iget-object p1, p0, Lcom/pkmmte/view/CircularImageView;->h:Landroid/graphics/BitmapShader;

    if-nez p1, :cond_0

    iget p1, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    if-lez p1, :cond_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/pkmmte/view/CircularImageView;->f()V

    :cond_1
    return-void
.end method

.method public isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/pkmmte/view/CircularImageView;->d:Z

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/pkmmte/view/CircularImageView;->i:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/pkmmte/view/CircularImageView;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    .line 3
    :cond_1
    iget v0, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    .line 4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    iget v2, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    if-ge v1, v2, :cond_2

    .line 6
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    iput v1, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    .line 7
    :cond_2
    iget v1, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    if-eq v0, v1, :cond_3

    .line 8
    invoke-virtual {p0}, Lcom/pkmmte/view/CircularImageView;->f()V

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/pkmmte/view/CircularImageView;->j:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/pkmmte/view/CircularImageView;->h:Landroid/graphics/BitmapShader;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    const/4 v0, 0x0

    .line 10
    iget v1, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    div-int/lit8 v2, v1, 0x2

    .line 11
    iget-boolean v3, p0, Lcom/pkmmte/view/CircularImageView;->c:Z

    const/high16 v4, 0x40800000    # 4.0f

    if-eqz v3, :cond_4

    iget-boolean v3, p0, Lcom/pkmmte/view/CircularImageView;->d:Z

    if-eqz v3, :cond_4

    .line 12
    iget v0, p0, Lcom/pkmmte/view/CircularImageView;->g:I

    mul-int/lit8 v2, v0, 0x2

    sub-int/2addr v1, v2

    .line 13
    div-int/lit8 v1, v1, 0x2

    .line 14
    iget-object v3, p0, Lcom/pkmmte/view/CircularImageView;->j:Landroid/graphics/Paint;

    iget-object v5, p0, Lcom/pkmmte/view/CircularImageView;->m:Landroid/graphics/ColorFilter;

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    add-int v3, v1, v0

    int-to-float v3, v3

    .line 15
    iget v5, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    sub-int/2addr v5, v2

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v0

    int-to-float v2, v5

    sub-float/2addr v2, v4

    iget-object v5, p0, Lcom/pkmmte/view/CircularImageView;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v3, v2, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 16
    :cond_4
    iget-boolean v3, p0, Lcom/pkmmte/view/CircularImageView;->b:Z

    const/4 v5, 0x0

    if-eqz v3, :cond_5

    .line 17
    iget v0, p0, Lcom/pkmmte/view/CircularImageView;->e:I

    mul-int/lit8 v2, v0, 0x2

    sub-int/2addr v1, v2

    .line 18
    div-int/lit8 v1, v1, 0x2

    .line 19
    iget-object v3, p0, Lcom/pkmmte/view/CircularImageView;->j:Landroid/graphics/Paint;

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    add-int v3, v1, v0

    int-to-float v3, v3

    .line 20
    iget v5, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    sub-int/2addr v5, v2

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v0

    int-to-float v2, v5

    sub-float/2addr v2, v4

    iget-object v5, p0, Lcom/pkmmte/view/CircularImageView;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v3, v2, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :goto_0
    move v2, v1

    goto :goto_1

    .line 21
    :cond_5
    iget-object v1, p0, Lcom/pkmmte/view/CircularImageView;->j:Landroid/graphics/Paint;

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :goto_1
    add-int/2addr v2, v0

    int-to-float v1, v2

    .line 22
    iget v2, p0, Lcom/pkmmte/view/CircularImageView;->f:I

    mul-int/lit8 v0, v0, 0x2

    sub-int/2addr v2, v0

    div-int/lit8 v2, v2, 0x2

    int-to-float v0, v2

    sub-float/2addr v0, v4

    iget-object v2, p0, Lcom/pkmmte/view/CircularImageView;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v1, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/pkmmte/view/CircularImageView;->e(I)I

    move-result p1

    .line 2
    invoke-virtual {p0, p2}, Lcom/pkmmte/view/CircularImageView;->d(I)I

    move-result p2

    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/widget/ImageView;->setMeasuredDimension(II)V

    return-void
.end method

.method public setBorderColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/pkmmte/view/CircularImageView;->k:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/pkmmte/view/CircularImageView;->invalidate()V

    return-void
.end method

.method public setBorderWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/pkmmte/view/CircularImageView;->e:I

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->requestLayout()V

    .line 3
    invoke-virtual {p0}, Lcom/pkmmte/view/CircularImageView;->invalidate()V

    return-void
.end method

.method public setSelectorColor(I)V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, p1, v1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lcom/pkmmte/view/CircularImageView;->m:Landroid/graphics/ColorFilter;

    .line 2
    invoke-virtual {p0}, Lcom/pkmmte/view/CircularImageView;->invalidate()V

    return-void
.end method

.method public setSelectorStrokeColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/pkmmte/view/CircularImageView;->l:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/pkmmte/view/CircularImageView;->invalidate()V

    return-void
.end method

.method public setSelectorStrokeWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/pkmmte/view/CircularImageView;->g:I

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->requestLayout()V

    .line 3
    invoke-virtual {p0}, Lcom/pkmmte/view/CircularImageView;->invalidate()V

    return-void
.end method
