.class public Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lio/togoto/imagezoomcrop/photoview/IGetImageBounds;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->onCreate(Landroid/os/Bundle;)V
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
    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$a;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getImageBounds()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$a;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    iget-object v0, v0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->r:Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/cropoverlay/CropOverlayView;->getImageBounds()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method
