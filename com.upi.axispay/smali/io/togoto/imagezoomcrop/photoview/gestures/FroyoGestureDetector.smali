.class public Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector;
.super Lio/togoto/imagezoomcrop/photoview/gestures/EclairGestureDetector;
.source "AxisPay"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x8
.end annotation


# instance fields
.field public final mDetector:Landroid/view/ScaleGestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lio/togoto/imagezoomcrop/photoview/gestures/EclairGestureDetector;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector$1;

    invoke-direct {v0, p0}, Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector$1;-><init>(Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector;)V

    .line 3
    new-instance v1, Landroid/view/ScaleGestureDetector;

    invoke-direct {v1, p1, v0}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector;->mDetector:Landroid/view/ScaleGestureDetector;

    return-void
.end method


# virtual methods
.method public isScaling()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector;->mDetector:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector;->mDetector:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    invoke-super {p0, p1}, Lio/togoto/imagezoomcrop/photoview/gestures/EclairGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
