.class public interface abstract Lio/togoto/imagezoomcrop/photoview/IPhotoView;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final DEFAULT_MAX_SCALE:F

.field public static final DEFAULT_MID_SCALE:F

.field public static final DEFAULT_MIN_SCALE:F

.field public static final DEFAULT_ROTATE_DURATION:I

.field public static final DEFAULT_ZOOM_DURATION:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lio/togoto/imagezoomcrop/photoview/IPhotoView;

    const v1, 0x42

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method


# virtual methods
.method public abstract canZoom()Z
.end method

.method public abstract getCroppedImage()Landroid/graphics/Bitmap;
.end method

.method public abstract getDisplayMatrix()Landroid/graphics/Matrix;
.end method

.method public abstract getDisplayRect()Landroid/graphics/RectF;
.end method

.method public abstract getIPhotoViewImplementation()Lio/togoto/imagezoomcrop/photoview/IPhotoView;
.end method

.method public abstract getMaxScale()F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getMaximumScale()F
.end method

.method public abstract getMediumScale()F
.end method

.method public abstract getMidScale()F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getMinScale()F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getMinimumScale()F
.end method

.method public abstract getOnPhotoTapListener()Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnPhotoTapListener;
.end method

.method public abstract getOnViewTapListener()Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnViewTapListener;
.end method

.method public abstract getScale()F
.end method

.method public abstract getScaleType()Landroid/widget/ImageView$ScaleType;
.end method

.method public abstract getVisibleRectangleBitmap()Landroid/graphics/Bitmap;
.end method

.method public abstract reset()V
.end method

.method public abstract setAllowParentInterceptOnEdge(Z)V
.end method

.method public abstract setDisplayMatrix(Landroid/graphics/Matrix;)Z
.end method

.method public abstract setImageBoundsListener(Lio/togoto/imagezoomcrop/photoview/IGetImageBounds;)V
.end method

.method public abstract setMaxScale(F)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract setMaximumScale(F)V
.end method

.method public abstract setMediumScale(F)V
.end method

.method public abstract setMidScale(F)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract setMinScale(F)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract setMinimumScale(F)V
.end method

.method public abstract setMinimumScaleToFit(Landroid/graphics/drawable/Drawable;)F
.end method

.method public abstract setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
.end method

.method public abstract setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
.end method

.method public abstract setOnMatrixChangeListener(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnMatrixChangedListener;)V
.end method

.method public abstract setOnPhotoTapListener(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnPhotoTapListener;)V
.end method

.method public abstract setOnViewTapListener(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$OnViewTapListener;)V
.end method

.method public abstract setPhotoViewRotation(F)V
.end method

.method public abstract setRotationBy(F)V
.end method

.method public abstract setRotationBy(FZ)V
.end method

.method public abstract setRotationTo(F)V
.end method

.method public abstract setScale(F)V
.end method

.method public abstract setScale(FFFZ)V
.end method

.method public abstract setScale(FZ)V
.end method

.method public abstract setScaleType(Landroid/widget/ImageView$ScaleType;)V
.end method

.method public abstract setZoomTransitionDuration(I)V
.end method

.method public abstract setZoomable(Z)V
.end method

.method public abstract update()V
.end method
