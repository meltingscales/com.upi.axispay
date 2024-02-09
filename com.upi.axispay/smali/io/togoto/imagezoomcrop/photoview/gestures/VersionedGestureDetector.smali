.class public final Lio/togoto/imagezoomcrop/photoview/gestures/VersionedGestureDetector;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static newInstance(Landroid/content/Context;Lio/togoto/imagezoomcrop/photoview/gestures/OnGestureListener;)Lio/togoto/imagezoomcrop/photoview/gestures/GestureDetector;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    .line 2
    new-instance v0, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;

    invoke-direct {v0, p0}, Lio/togoto/imagezoomcrop/photoview/gestures/CupcakeGestureDetector;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_1

    .line 3
    new-instance v0, Lio/togoto/imagezoomcrop/photoview/gestures/EclairGestureDetector;

    invoke-direct {v0, p0}, Lio/togoto/imagezoomcrop/photoview/gestures/EclairGestureDetector;-><init>(Landroid/content/Context;)V

    goto :goto_0

    .line 4
    :cond_1
    new-instance v0, Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector;

    invoke-direct {v0, p0}, Lio/togoto/imagezoomcrop/photoview/gestures/FroyoGestureDetector;-><init>(Landroid/content/Context;)V

    .line 5
    :goto_0
    invoke-interface {v0, p1}, Lio/togoto/imagezoomcrop/photoview/gestures/GestureDetector;->setOnGestureListener(Lio/togoto/imagezoomcrop/photoview/gestures/OnGestureListener;)V

    return-object v0
.end method
