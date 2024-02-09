.class public Lcf0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcf0;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcf0;


# direct methods
.method public constructor <init>(Lcf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcf0$c;->a:Lcf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcf0$c;->a:Lcf0;

    invoke-static {p1}, Lcf0;->y(Lcf0;)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcf0$c;->a:Lcf0;

    invoke-static {p1}, Lcf0;->z(Lcf0;)Lcom/google/android/gms/vision/CameraSource;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcf0$c;->a:Lcf0;

    invoke-static {p1}, Lcf0;->z(Lcf0;)Lcom/google/android/gms/vision/CameraSource;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/vision/CameraSource;->stop()V

    :cond_0
    return-void
.end method
