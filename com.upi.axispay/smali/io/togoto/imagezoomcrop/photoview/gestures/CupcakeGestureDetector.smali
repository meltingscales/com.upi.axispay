.class public Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lio/togoto/imagezoomcrop/photoview/gestures/GestureDetector;


# static fields
.field private static final LOG_TAG:Ljava/lang/String;


# instance fields
.field private mIsDragging:Z

.field public mLastTouchX:F

.field public mLastTouchY:F

.field public mListener:Lio/togoto/imagezoomcrop/photoview/gestures/OnGestureListener;

.field public final mMinimumVelocity:F

.field public final mTouchSlop:F

.field private mVelocityTracker:Landroid/view/VelocityTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;

    const v1, 0x149

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mMinimumVelocity:F

    .line 4
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mTouchSlop:F

    return-void
.end method


# virtual methods
.method public getActiveX(Landroid/view/MotionEvent;)F
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    return p1
.end method

.method public getActiveY(Landroid/view/MotionEvent;)F
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    return p1
.end method

.method public isScaling()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    const/4 v3, 0x0

    if-eq v0, v2, :cond_4

    const/4 v4, 0x2

    if-eq v0, v4, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_8

    .line 3
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    .line 4
    iput-object v3, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mVelocityTracker:Landroid/view/VelocityTracker;

    goto/16 :goto_0

    .line 5
    :cond_1
    invoke-virtual {p0, p1}, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->getActiveX(Landroid/view/MotionEvent;)F

    move-result v0

    .line 6
    invoke-virtual {p0, p1}, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->getActiveY(Landroid/view/MotionEvent;)F

    move-result v3

    .line 7
    iget v4, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mLastTouchX:F

    sub-float v4, v0, v4

    iget v5, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mLastTouchY:F

    sub-float v5, v3, v5

    .line 8
    iget-boolean v6, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mIsDragging:Z

    if-nez v6, :cond_3

    mul-float v6, v4, v4

    mul-float v7, v5, v5

    add-float/2addr v6, v7

    float-to-double v6, v6

    .line 9
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    iget v8, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mTouchSlop:F

    float-to-double v8, v8

    cmpl-double v6, v6, v8

    if-ltz v6, :cond_2

    move v1, v2

    :cond_2
    iput-boolean v1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mIsDragging:Z

    .line 10
    :cond_3
    iget-boolean v1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mIsDragging:Z

    if-eqz v1, :cond_8

    .line 11
    iget-object v1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mListener:Lio/togoto/imagezoomcrop/photoview/gestures/OnGestureListener;

    invoke-interface {v1, v4, v5}, Lio/togoto/imagezoomcrop/photoview/gestures/OnGestureListener;->onDrag(FF)V

    .line 12
    iput v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mLastTouchX:F

    .line 13
    iput v3, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mLastTouchY:F

    .line 14
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_8

    .line 15
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 16
    :cond_4
    iget-boolean v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mIsDragging:Z

    if-eqz v0, :cond_5

    .line 17
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_5

    .line 18
    invoke-virtual {p0, p1}, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->getActiveX(Landroid/view/MotionEvent;)F

    move-result v0

    iput v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mLastTouchX:F

    .line 19
    invoke-virtual {p0, p1}, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->getActiveY(Landroid/view/MotionEvent;)F

    move-result v0

    iput v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mLastTouchY:F

    .line 20
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 21
    iget-object p1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mVelocityTracker:Landroid/view/VelocityTracker;

    const/16 v0, 0x3e8

    invoke-virtual {p1, v0}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 22
    iget-object p1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p1

    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 23
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    .line 24
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iget v4, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mMinimumVelocity:F

    cmpl-float v1, v1, v4

    if-ltz v1, :cond_5

    .line 25
    iget-object v1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mListener:Lio/togoto/imagezoomcrop/photoview/gestures/OnGestureListener;

    iget v4, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mLastTouchX:F

    iget v5, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mLastTouchY:F

    neg-float p1, p1

    neg-float v0, v0

    invoke-interface {v1, v4, v5, p1, v0}, Lio/togoto/imagezoomcrop/photoview/gestures/OnGestureListener;->onFling(FFFF)V

    .line 26
    :cond_5
    iget-object p1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_8

    .line 27
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    .line 28
    iput-object v3, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mVelocityTracker:Landroid/view/VelocityTracker;

    goto :goto_0

    .line 29
    :cond_6
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_7

    .line 30
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 31
    :cond_7
    invoke-virtual {p0, p1}, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->getActiveX(Landroid/view/MotionEvent;)F

    move-result v0

    iput v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mLastTouchX:F

    .line 32
    invoke-virtual {p0, p1}, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->getActiveY(Landroid/view/MotionEvent;)F

    move-result p1

    iput p1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mLastTouchY:F

    .line 33
    iput-boolean v1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mIsDragging:Z

    :cond_8
    :goto_0
    return v2
.end method

.method public setOnGestureListener(Lio/togoto/imagezoomcrop/photoview/gestures/OnGestureListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mListener:Lio/togoto/imagezoomcrop/photoview/gestures/OnGestureListener;

    return-void
.end method
