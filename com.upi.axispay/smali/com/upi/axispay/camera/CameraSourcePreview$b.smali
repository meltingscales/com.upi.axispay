.class public Lcom/upi/axispay/camera/CameraSourcePreview$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/upi/axispay/camera/CameraSourcePreview;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/upi/axispay/camera/CameraSourcePreview;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/camera/CameraSourcePreview;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/camera/CameraSourcePreview$b;->a:Lcom/upi/axispay/camera/CameraSourcePreview;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/upi/axispay/camera/CameraSourcePreview;Lcom/upi/axispay/camera/CameraSourcePreview$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/upi/axispay/camera/CameraSourcePreview$b;-><init>(Lcom/upi/axispay/camera/CameraSourcePreview;)V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/camera/CameraSourcePreview$b;->a:Lcom/upi/axispay/camera/CameraSourcePreview;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/upi/axispay/camera/CameraSourcePreview;->a(Lcom/upi/axispay/camera/CameraSourcePreview;Z)Z

    .line 2
    :try_start_0
    iget-object p1, p0, Lcom/upi/axispay/camera/CameraSourcePreview$b;->a:Lcom/upi/axispay/camera/CameraSourcePreview;

    invoke-static {p1}, Lcom/upi/axispay/camera/CameraSourcePreview;->b(Lcom/upi/axispay/camera/CameraSourcePreview;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/camera/CameraSourcePreview$b;->a:Lcom/upi/axispay/camera/CameraSourcePreview;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/upi/axispay/camera/CameraSourcePreview;->a(Lcom/upi/axispay/camera/CameraSourcePreview;Z)Z

    return-void
.end method
