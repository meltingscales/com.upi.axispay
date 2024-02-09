.class public Lcom/upi/axispay/camera/CameraSourcePreview;
.super Landroid/view/ViewGroup;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/upi/axispay/camera/CameraSourcePreview$b;
    }
.end annotation


# instance fields
.field public b:Landroid/content/Context;

.field public c:Landroid/view/SurfaceView;

.field public d:Z

.field public e:Z

.field public f:Lra0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    iput-object p1, p0, Lcom/upi/axispay/camera/CameraSourcePreview;->b:Landroid/content/Context;

    const/4 p2, 0x0

    .line 3
    iput-boolean p2, p0, Lcom/upi/axispay/camera/CameraSourcePreview;->d:Z

    .line 4
    iput-boolean p2, p0, Lcom/upi/axispay/camera/CameraSourcePreview;->e:Z

    .line 5
    new-instance p2, Landroid/view/SurfaceView;

    invoke-direct {p2, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/upi/axispay/camera/CameraSourcePreview;->c:Landroid/view/SurfaceView;

    .line 6
    invoke-virtual {p2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    new-instance p2, Lcom/upi/axispay/camera/CameraSourcePreview$b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lcom/upi/axispay/camera/CameraSourcePreview$b;-><init>(Lcom/upi/axispay/camera/CameraSourcePreview;Lcom/upi/axispay/camera/CameraSourcePreview$a;)V

    invoke-interface {p1, p2}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 7
    iget-object p1, p0, Lcom/upi/axispay/camera/CameraSourcePreview;->c:Landroid/view/SurfaceView;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic a(Lcom/upi/axispay/camera/CameraSourcePreview;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/upi/axispay/camera/CameraSourcePreview;->e:Z

    return p1
.end method

.method public static synthetic b(Lcom/upi/axispay/camera/CameraSourcePreview;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/SecurityException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/camera/CameraSourcePreview;->d()V

    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/camera/CameraSourcePreview;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    return v2

    :cond_1
    return v1
.end method

.method public final d()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/SecurityException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/upi/axispay/camera/CameraSourcePreview;->d:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/upi/axispay/camera/CameraSourcePreview;->e:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/upi/axispay/camera/CameraSourcePreview;->f:Lra0;

    iget-object v1, p0, Lcom/upi/axispay/camera/CameraSourcePreview;->c:Landroid/view/SurfaceView;

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v0, v1}, Lra0;->b(Landroid/view/SurfaceHolder;)Lra0;

    const/4 v0, 0x0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result p1

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/upi/axispay/camera/CameraSourcePreview;->f:Lra0;

    if-nez v1, :cond_3

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 4
    invoke-virtual {p0}, Lcom/upi/axispay/camera/CameraSourcePreview;->c()Z

    move-result p2

    if-eqz p2, :cond_0

    move v2, v0

    move v0, p1

    move p1, v2

    :cond_0
    int-to-float p2, p4

    int-to-float p1, p1

    div-float/2addr p2, p1

    int-to-float p3, v0

    mul-float/2addr p2, p3

    float-to-int p2, p2

    .line 5
    invoke-virtual {p0}, Lcom/upi/axispay/camera/CameraSourcePreview;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    int-to-float p2, p5

    div-float/2addr p2, p3

    mul-float/2addr p2, p1

    float-to-int p4, p2

    goto :goto_0

    :cond_1
    move p5, p2

    :goto_0
    const/4 p1, 0x0

    move p2, p1

    .line 6
    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    if-ge p2, p3, :cond_2

    .line 7
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3, p1, p1, p4, p5}, Landroid/view/View;->layout(IIII)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 8
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Lcom/upi/axispay/camera/CameraSourcePreview;->d()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    .line 9
    :cond_3
    invoke-virtual {v1}, Lra0;->a()Lcom/google/android/gms/common/images/Size;

    const/4 p1, 0x0

    throw p1
.end method
