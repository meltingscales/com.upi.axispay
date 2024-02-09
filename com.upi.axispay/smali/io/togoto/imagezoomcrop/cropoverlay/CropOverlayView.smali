.class public Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;
.super Landroid/view/View;
.source "AxisPay"

# interfaces
.implements Lio/togoto/imagezoomcrop/photoview/IGetImageBounds;


# static fields
.field private static final DEFAULT_CORNER_RADIUS:I

.field private static final DEFAULT_OVERLAY_COLOR:I


# instance fields
.field private DEFAULT_CROPWIDTH:I

.field private DEFAULT_GUIDELINES:Z

.field private DEFAULT_MARGINSIDE:I

.field private DEFAULT_MARGINTOP:I

.field private DEFAULT_MAX_WIDTH:I

.field private DEFAULT_MIN_WIDTH:I

.field private cropHeight:I

.field private cropWidth:I

.field private mBackgroundPaint:Landroid/graphics/Paint;

.field private mBitmapRect:Landroid/graphics/RectF;

.field private mBorderPaint:Landroid/graphics/Paint;

.field private mClipPath:Landroid/graphics/Path;

.field private mContext:Landroid/content/Context;

.field private mCornerRadius:I

.field private mGuidelinePaint:Landroid/graphics/Paint;

.field private mGuidelines:Z

.field private mMarginSide:I

.field private mMarginTop:I

.field private mMaxWidth:I

.field private mMinWidth:I

.field private mOverlayColor:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-class v0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;

    const v1, 0x177

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    const/16 v0, 0xcc

    const/16 v1, 0x29

    const/16 v2, 0x30

    const/16 v3, 0x3f

    .line 1
    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_OVERLAY_COLOR:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_GUIDELINES:Z

    const/16 v0, 0x64

    .line 3
    iput v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_MARGINTOP:I

    const/16 v0, 0x32

    .line 4
    iput v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_MARGINSIDE:I

    const/16 v0, 0x1f4

    .line 5
    iput v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_MIN_WIDTH:I

    const/16 v0, 0x2bc

    .line 6
    iput v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_MAX_WIDTH:I

    const/16 v0, 0x258

    .line 7
    iput v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_CROPWIDTH:I

    .line 8
    iput v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->cropHeight:I

    .line 9
    iput v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->cropWidth:I

    .line 10
    invoke-direct {p0, p1}, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->init(Landroid/content/Context;)V

    .line 11
    iput-object p1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mContext:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 12
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_GUIDELINES:Z

    const/16 v1, 0x64

    .line 14
    iput v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_MARGINTOP:I

    const/16 v1, 0x32

    .line 15
    iput v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_MARGINSIDE:I

    const/16 v1, 0x1f4

    .line 16
    iput v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_MIN_WIDTH:I

    const/16 v1, 0x2bc

    .line 17
    iput v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_MAX_WIDTH:I

    const/16 v1, 0x258

    .line 18
    iput v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_CROPWIDTH:I

    .line 19
    iput v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->cropHeight:I

    .line 20
    iput v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->cropWidth:I

    .line 21
    iput-object p1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mContext:Landroid/content/Context;

    .line 22
    sget-object v1, Lio/togoto/imagezoomcrop/R$styleable;->CropOverlayView:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 23
    :try_start_0
    sget v1, Lio/togoto/imagezoomcrop/R$styleable;->CropOverlayView_guideLines:I

    iget-boolean v2, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_GUIDELINES:Z

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mGuidelines:Z

    .line 24
    sget v1, Lio/togoto/imagezoomcrop/R$styleable;->CropOverlayView_marginTop:I

    iget v2, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_MARGINTOP:I

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mMarginTop:I

    .line 25
    sget v1, Lio/togoto/imagezoomcrop/R$styleable;->CropOverlayView_marginSide:I

    iget v2, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_MARGINSIDE:I

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mMarginSide:I

    .line 26
    sget v1, Lio/togoto/imagezoomcrop/R$styleable;->CropOverlayView_minWidth:I

    iget v2, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_MIN_WIDTH:I

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mMinWidth:I

    .line 27
    sget v1, Lio/togoto/imagezoomcrop/R$styleable;->CropOverlayView_maxWidth:I

    iget v2, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_MAX_WIDTH:I

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mMaxWidth:I

    const/high16 v1, 0x40c00000    # 6.0f

    .line 28
    iget-object v2, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mContext:Landroid/content/Context;

    .line 29
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 30
    invoke-static {v0, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    .line 31
    sget v1, Lio/togoto/imagezoomcrop/R$styleable;->CropOverlayView_cornerRadius:I

    float-to-int v0, v0

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mCornerRadius:I

    .line 32
    sget v0, Lio/togoto/imagezoomcrop/R$styleable;->CropOverlayView_overlayColor:I

    sget v1, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->DEFAULT_OVERLAY_COLOR:I

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mOverlayColor:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 34
    invoke-direct {p0, p1}, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->init(Landroid/content/Context;)V

    return-void

    :catchall_0
    move-exception p1

    .line 35
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 36
    throw p1
.end method

.method private drawRuleOfThirdsGuidelines(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    sget-object v0, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->LEFT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v0

    .line 2
    sget-object v1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->TOP:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v1}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v1

    .line 3
    sget-object v2, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->RIGHT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v2}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v8

    .line 4
    sget-object v2, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->BOTTOM:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v2}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v9

    .line 5
    invoke-static {}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getWidth()F

    move-result v2

    const/high16 v10, 0x40400000    # 3.0f

    div-float v11, v2, v10

    add-float v5, v0, v11

    .line 6
    iget-object v7, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    move-object v2, p1

    move v3, v5

    move v4, v1

    move v6, v9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sub-float v5, v8, v11

    .line 7
    iget-object v7, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    move v3, v5

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 8
    invoke-static {}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getHeight()F

    move-result v2

    div-float v7, v2, v10

    add-float v5, v1, v7

    .line 9
    iget-object v6, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    move-object v1, p1

    move v2, v0

    move v3, v5

    move v4, v8

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sub-float v5, v9, v7

    .line 10
    iget-object v6, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private init(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 2
    iget v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mMarginSide:I

    mul-int/lit8 v2, v1, 0x2

    sub-int/2addr v0, v2

    iput v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->cropWidth:I

    .line 3
    iput v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->cropHeight:I

    .line 4
    iget v2, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mMarginTop:I

    add-int v3, v2, v0

    add-int/2addr v0, v1

    .line 5
    invoke-static {p1}, Lio/togoto/imagezoomcrop/cropoverlay/utils/PaintUtil;->newBackgroundPaint(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object v4

    iput-object v4, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mBackgroundPaint:Landroid/graphics/Paint;

    .line 6
    invoke-static {p1}, Lio/togoto/imagezoomcrop/cropoverlay/utils/PaintUtil;->newBorderPaint(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    .line 7
    invoke-static {}, Lio/togoto/imagezoomcrop/cropoverlay/utils/PaintUtil;->newGuidelinePaint()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mGuidelinePaint:Landroid/graphics/Paint;

    .line 8
    sget-object p1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->TOP:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    int-to-float v2, v2

    invoke-virtual {p1, v2}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->setCoordinate(F)V

    .line 9
    sget-object p1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->BOTTOM:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    int-to-float v3, v3

    invoke-virtual {p1, v3}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->setCoordinate(F)V

    .line 10
    sget-object p1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->LEFT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    int-to-float v1, v1

    invoke-virtual {p1, v1}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->setCoordinate(F)V

    .line 11
    sget-object p1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->RIGHT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->setCoordinate(F)V

    .line 12
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1, v1, v2, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mBitmapRect:Landroid/graphics/RectF;

    .line 13
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mClipPath:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method public getImageBounds()Landroid/graphics/Rect;
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    sget-object v1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->LEFT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    .line 2
    invoke-virtual {v1}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v1

    float-to-int v1, v1

    sget-object v2, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->TOP:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v2}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v2

    float-to-int v2, v2

    sget-object v3, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->RIGHT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    .line 3
    invoke-virtual {v3}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v3

    float-to-int v3, v3

    sget-object v4, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->BOTTOM:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v4}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v4

    float-to-int v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 4
    iget-object v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mBitmapRect:Landroid/graphics/RectF;

    sget-object v1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->LEFT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v1}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 5
    iget-object v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mBitmapRect:Landroid/graphics/RectF;

    sget-object v1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->TOP:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v1}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 6
    iget-object v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mBitmapRect:Landroid/graphics/RectF;

    sget-object v1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->RIGHT:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v1}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 7
    iget-object v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mBitmapRect:Landroid/graphics/RectF;

    sget-object v1, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->BOTTOM:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    invoke-virtual {v1}, Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;->getCoordinate()F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 8
    iget-object v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mClipPath:Landroid/graphics/Path;

    iget-object v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mBitmapRect:Landroid/graphics/RectF;

    iget v2, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mCornerRadius:I

    int-to-float v3, v2

    int-to-float v2, v2

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 9
    iget-object v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mClipPath:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 10
    iget v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mOverlayColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 11
    iget-object v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mClipPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 12
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 13
    iget-object v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mBitmapRect:Landroid/graphics/RectF;

    iget v1, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mCornerRadius:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 14
    iget-boolean v0, p0, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->mGuidelines:Z

    if-eqz v0, :cond_0

    .line 15
    invoke-direct {p0, p1}, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->drawRuleOfThirdsGuidelines(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method
