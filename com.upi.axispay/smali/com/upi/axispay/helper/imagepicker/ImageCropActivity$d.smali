.class public Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$d;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$d;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    iget-object p1, p1, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->x:Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;

    invoke-virtual {p1}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->reset()V

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$d;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    iget-object p1, p1, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->q:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    invoke-virtual {p1}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->reset()V

    return-void
.end method
