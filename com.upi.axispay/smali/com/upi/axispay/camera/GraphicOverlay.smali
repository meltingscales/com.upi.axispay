.class public Lcom/upi/axispay/camera/GraphicOverlay;
.super Landroid/view/View;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/upi/axispay/camera/GraphicOverlay$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/upi/axispay/camera/GraphicOverlay$a;",
        ">",
        "Landroid/view/View;"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/Object;

.field public c:I

.field public d:F

.field public e:I

.field public f:F

.field public g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/upi/axispay/camera/GraphicOverlay;->b:Ljava/lang/Object;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 3
    iput p1, p0, Lcom/upi/axispay/camera/GraphicOverlay;->d:F

    .line 4
    iput p1, p0, Lcom/upi/axispay/camera/GraphicOverlay;->f:F

    .line 5
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/upi/axispay/camera/GraphicOverlay;->g:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public getGraphics()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/camera/GraphicOverlay;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    new-instance v1, Ljava/util/Vector;

    iget-object v2, p0, Lcom/upi/axispay/camera/GraphicOverlay;->g:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/Vector;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getHeightScaleFactor()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/upi/axispay/camera/GraphicOverlay;->f:F

    return v0
.end method

.method public getWidthScaleFactor()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/upi/axispay/camera/GraphicOverlay;->d:F

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/camera/GraphicOverlay;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget v1, p0, Lcom/upi/axispay/camera/GraphicOverlay;->c:I

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/upi/axispay/camera/GraphicOverlay;->e:I

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/upi/axispay/camera/GraphicOverlay;->c:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    iput v1, p0, Lcom/upi/axispay/camera/GraphicOverlay;->d:F

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/upi/axispay/camera/GraphicOverlay;->e:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    iput v1, p0, Lcom/upi/axispay/camera/GraphicOverlay;->f:F

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/upi/axispay/camera/GraphicOverlay;->g:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/upi/axispay/camera/GraphicOverlay$a;

    .line 7
    invoke-virtual {v2, p1}, Lcom/upi/axispay/camera/GraphicOverlay$a;->a(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 8
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
