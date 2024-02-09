.class public Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/ScaleGestureDetector$OnScaleGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector;


# direct methods
.method public constructor <init>(Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector$1;->this$0:Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result v0

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector$1;->this$0:Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector;

    iget-object v1, v1, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;->mListener:Lio/togoto/imagezoomcrop/photoview/gestures/OnGestureListener;

    .line 4
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result p1

    .line 5
    invoke-interface {v1, v0, v2, p1}, Lio/togoto/imagezoomcrop/photoview/gestures/OnGestureListener;->onScale(FFF)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 0

    return-void
.end method
