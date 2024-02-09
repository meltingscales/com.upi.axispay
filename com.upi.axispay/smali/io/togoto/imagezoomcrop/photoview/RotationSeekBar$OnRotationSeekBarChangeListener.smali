.class public abstract Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "OnRotationSeekBarChangeListener"
.end annotation


# instance fields
.field private mPreviousProgress:F


# direct methods
.method public constructor <init>(Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;->mPreviousProgress:F

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 3

    .line 1
    invoke-static {p2}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->access$000(I)F

    move-result v0

    int-to-float p2, p2

    .line 2
    iget v1, p0, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;->mPreviousProgress:F

    sub-float v1, p2, v1

    const/high16 v2, 0x41200000    # 10.0f

    div-float/2addr v1, v2

    .line 3
    check-cast p1, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;

    invoke-virtual {p0, p1, v0, v1, p3}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;->onRotationProgressChanged(Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;FFZ)V

    .line 4
    iput p2, p0, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;->mPreviousProgress:F

    return-void
.end method

.method public abstract onRotationProgressChanged(Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;FFZ)V
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public resetPreviousProgress()V
    .locals 1

    const/high16 v0, 0x44e10000    # 1800.0f

    .line 1
    iput v0, p0, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;->mPreviousProgress:F

    return-void
.end method
