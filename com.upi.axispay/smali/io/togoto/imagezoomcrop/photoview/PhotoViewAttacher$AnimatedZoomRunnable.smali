.class public Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AnimatedZoomRunnable"
.end annotation


# instance fields
.field private final mFocalX:F

.field private final mFocalY:F

.field private final mStartTime:J

.field private final mZoomEnd:F

.field private final mZoomStart:F

.field public final synthetic this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;


# direct methods
.method public constructor <init>(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;FFFF)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p4, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->mFocalX:F

    .line 3
    iput p5, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->mFocalY:F

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    iput-wide p4, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->mStartTime:J

    .line 5
    iput p2, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->mZoomStart:F

    .line 6
    iput p3, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->mZoomEnd:F

    return-void
.end method

.method private interpolate()F
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->mStartTime:J

    sub-long/2addr v0, v2

    long-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v2, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    iget v2, v2, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->ZOOM_DURATION:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 2
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 3
    sget-object v1, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->sInterpolator:Landroid/view/animation/Interpolator;

    invoke-interface {v1, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    return v0
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getImageView()Landroid/widget/ImageView;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->interpolate()F

    move-result v1

    .line 3
    iget v2, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->mZoomStart:F

    iget v3, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->mZoomEnd:F

    sub-float/2addr v3, v2

    mul-float/2addr v3, v1

    add-float/2addr v2, v3

    .line 4
    iget-object v3, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v3}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getScale()F

    move-result v3

    div-float/2addr v2, v3

    .line 5
    iget-object v3, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-static {v3}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->access$100(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;)Landroid/graphics/Matrix;

    move-result-object v3

    iget v4, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->mFocalX:F

    iget v5, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->mFocalY:F

    invoke-virtual {v3, v2, v2, v4, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 6
    iget-object v2, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$AnimatedZoomRunnable;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-static {v2}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->access$200(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;)V

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    .line 7
    invoke-static {v0, p0}, Lio/togoto/imagezoomcrop/photoview/Compat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
