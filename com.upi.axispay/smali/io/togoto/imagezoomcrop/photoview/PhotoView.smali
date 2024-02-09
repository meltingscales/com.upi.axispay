.class public Lio/togoto/imagezoomcrop/photoview/PhotoView;
.super Landroid/widget/ImageView;
.source "AxisPay"

# interfaces
.implements Lio/togoto/imagezoomcrop/photoview/IPhotoView;


# instance fields
.field private final mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

.field private mPendingScaleType:Landroid/widget/ImageView$ScaleType;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/togoto/imagezoomcrop/photoview/PhotoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/togoto/imagezoomcrop/photoview/PhotoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    sget-object p1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 5
    new-instance p1, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-direct {p1, p0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;-><init>(Landroid/widget/ImageView;)V

    iput-object p1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    .line 6
    iget-object p1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mPendingScaleType:Landroid/widget/ImageView$ScaleType;

    if-eqz p1, :cond_0

    .line 7
    invoke-virtual {p0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mPendingScaleType:Landroid/widget/ImageView$ScaleType;

    :cond_0
    return-void
.end method

.method public static synthetic access$000(Lio/togoto/imagezoomcrop/photoview/PhotoView;)Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    return-object p0
.end method

.method private postUpdate()V
    .locals 1

    .line 1
    new-instance v0, Lio/togoto/imagezoomcrop/photoview/PhotoView$1;

    invoke-direct {v0, p0}, Lio/togoto/imagezoomcrop/photoview/PhotoView$1;-><init>(Lio/togoto/imagezoomcrop/photoview/PhotoView;)V

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public canZoom()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->canZoom()Z

    move-result v0

    return v0
.end method

.method public getCroppedImage()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getCroppedImage()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public getDisplayMatrix()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getDrawMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0
.end method

.method public getDisplayRect()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getDisplayRect()Landroid/graphics/RectF;

    move-result-object v0

    return-object v0
.end method

.method public getIPhotoViewImplementation()Lio/togoto/imagezoomcrop/photoview/IPhotoView;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    return-object v0
.end method

.method public getMaxScale()F
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->getMaximumScale()F

    move-result v0

    return v0
.end method

.method public getMaximumScale()F
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getMaximumScale()F

    move-result v0

    return v0
.end method

.method public getMediumScale()F
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getMediumScale()F

    move-result v0

    return v0
.end method

.method public getMidScale()F
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->getMediumScale()F

    move-result v0

    return v0
.end method

.method public getMinScale()F
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->getMinimumScale()F

    move-result v0

    return v0
.end method

.method public getMinimumScale()F
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getMinimumScale()F

    move-result v0

    return v0
.end method

.method public getOnPhotoTapListener()Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnPhotoTapListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getOnPhotoTapListener()Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnPhotoTapListener;

    move-result-object v0

    return-object v0
.end method

.method public getOnViewTapListener()Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnViewTapListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getOnViewTapListener()Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnViewTapListener;

    move-result-object v0

    return-object v0
.end method

.method public getScale()F
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getScale()F

    move-result v0

    return v0
.end method

.method public getScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    return-object v0
.end method

.method public getVisibleRectangleBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getVisibleRectangleBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->cleanup()V

    .line 2
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->reset()V

    return-void
.end method

.method public setAllowParentInterceptOnEdge(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setAllowParentInterceptOnEdge(Z)V

    return-void
.end method

.method public setDisplayMatrix(Landroid/graphics/Matrix;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setDisplayMatrix(Landroid/graphics/Matrix;)Z

    move-result p1

    return p1
.end method

.method public setImageBoundsListener(Lio/togoto/imagezoomcrop/photoview/IGetImageBounds;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setImageBoundsListener(Lio/togoto/imagezoomcrop/photoview/IGetImageBounds;)V

    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    invoke-direct {p0}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->postUpdate()V

    return-void
.end method

.method public setImageResource(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2
    invoke-direct {p0}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->postUpdate()V

    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    .line 2
    invoke-direct {p0}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->postUpdate()V

    return-void
.end method

.method public setMaxScale(F)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->setMaximumScale(F)V

    return-void
.end method

.method public setMaximumScale(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setMaximumScale(F)V

    return-void
.end method

.method public setMediumScale(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setMediumScale(F)V

    return-void
.end method

.method public setMidScale(F)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->setMediumScale(F)V

    return-void
.end method

.method public setMinScale(F)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->setMinimumScale(F)V

    return-void
.end method

.method public setMinimumScale(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setMinimumScale(F)V

    return-void
.end method

.method public setMinimumScaleToFit(Landroid/graphics/drawable/Drawable;)F
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setMinimumScaleToFit(Landroid/graphics/drawable/Drawable;)F

    move-result p1

    return p1
.end method

.method public setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    return-void
.end method

.method public setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setOnMatrixChangeListener(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnMatrixChangedListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setOnMatrixChangeListener(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnMatrixChangedListener;)V

    return-void
.end method

.method public setOnPhotoTapListener(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnPhotoTapListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setOnPhotoTapListener(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnPhotoTapListener;)V

    return-void
.end method

.method public setOnViewTapListener(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnViewTapListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setOnViewTapListener(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnViewTapListener;)V

    return-void
.end method

.method public setPhotoViewRotation(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setRotationTo(F)V

    return-void
.end method

.method public setRotationBy(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setRotationBy(F)V

    return-void
.end method

.method public setRotationBy(FZ)V
    .locals 1

    .line 2
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1, p2}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setRotationBy(FZ)V

    return-void
.end method

.method public setRotationTo(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setRotationTo(F)V

    return-void
.end method

.method public setScale(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setScale(F)V

    return-void
.end method

.method public setScale(FFFZ)V
    .locals 1

    .line 3
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setScale(FFFZ)V

    return-void
.end method

.method public setScale(FZ)V
    .locals 1

    .line 2
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1, p2}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setScale(FZ)V

    return-void
.end method

.method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto :goto_0

    .line 3
    :cond_0
    iput-object p1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mPendingScaleType:Landroid/widget/ImageView$ScaleType;

    :goto_0
    return-void
.end method

.method public setZoomTransitionDuration(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setZoomTransitionDuration(I)V

    return-void
.end method

.method public setZoomable(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0, p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->setZoomable(Z)V

    return-void
.end method

.method public update()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView;->mAttacher:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->update()V

    return-void
.end method
