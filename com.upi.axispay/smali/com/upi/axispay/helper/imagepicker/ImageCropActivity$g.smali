.class public Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$g;
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
    iput-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$g;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$g;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    invoke-static {p1}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->Y(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$g;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    invoke-static {p1}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->Z(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity$g;->b:Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;

    invoke-static {p1}, Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;->b0(Lcom/upi/axispay/helper/imagepicker/ImageCropActivity;)V

    return-void
.end method
