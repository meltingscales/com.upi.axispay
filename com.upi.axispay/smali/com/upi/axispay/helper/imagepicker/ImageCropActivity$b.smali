.class public Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$b;
.super Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:F

.field public final synthetic b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$b;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    invoke-direct {p0, p2}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;-><init>(Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;)V

    return-void
.end method


# virtual methods
.method public onRotationProgressChanged(Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;FFZ)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$b;->a:F

    if-eqz p4, :cond_0

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$b;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    iget-object p1, p1, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->q:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    const/4 p2, 0x0

    invoke-virtual {p1, p3, p2}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->setRotationBy(FZ)V

    :cond_0
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;->onStopTrackingTouch(Landroid/widget/SeekBar;)V

    .line 2
    iget p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$b;->a:F

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 v0, 0x41200000    # 10.0f

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$b;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    iget-object p1, p1, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->x:Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;

    invoke-virtual {p1}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->reset()V

    .line 4
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$b;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    iget-object p1, p1, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->q:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->setRotationBy(FZ)V

    :cond_0
    return-void
.end method
