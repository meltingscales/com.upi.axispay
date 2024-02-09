.class public Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FlingRunnable"
.end annotation


# instance fields
.field private mCurrentX:I

.field private mCurrentY:I

.field private final mScroller:Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;

.field public final synthetic this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;


# direct methods
.method public constructor <init>(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p2}, Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;->getScroller(Landroid/content/Context;)Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;

    move-result-object p1

    iput-object p1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mScroller:Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;

    return-void
.end method


# virtual methods
.method public cancelFling()V
    .locals 2

    .line 1
    invoke-static {}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->access$300()Z

    move-result v0

    .line 2
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mScroller:Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;->forceFinished(Z)V

    return-void
.end method

.method public fling(IIII)V
    .locals 11

    .line 1
    iget-object p1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getDisplayRect()Landroid/graphics/RectF;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget p2, p1, Landroid/graphics/RectF;->left:F

    neg-float p2, p2

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result v6

    .line 3
    iget p1, p1, Landroid/graphics/RectF;->top:F

    neg-float p1, p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v8

    .line 4
    iput v6, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mCurrentX:I

    .line 5
    iput v8, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mCurrentY:I

    .line 6
    invoke-static {}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->access$300()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const p2, 0x60f

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const p2, 0x610

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const p2, 0x611

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const p2, 0x612

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :cond_1
    if-ne v6, v6, :cond_2

    if-eq v8, v8, :cond_3

    .line 8
    :cond_2
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mScroller:Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v1, v6

    move v2, v8

    move v3, p3

    move v4, p4

    move v5, v6

    move v7, v8

    invoke-virtual/range {v0 .. v10}, Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;->fling(IIIIIIIIII)V

    :cond_3
    return-void
.end method

.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mScroller:Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getImageView()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mScroller:Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;

    invoke-virtual {v1}, Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;->computeScrollOffset()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    iget-object v1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mScroller:Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;

    invoke-virtual {v1}, Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;->getCurrX()I

    move-result v1

    .line 5
    iget-object v2, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mScroller:Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;

    invoke-virtual {v2}, Lio/togoto/imagezoomcrop/photoview/scrollerproxy/ScrollerProxy;->getCurrY()I

    move-result v2

    .line 6
    invoke-static {}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->access$300()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x613

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mCurrentX:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v4, 0x614

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mCurrentY:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v4, 0x615

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v4, 0x616

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 8
    :cond_1
    iget-object v3, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-static {v3}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->access$100(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;)Landroid/graphics/Matrix;

    move-result-object v3

    iget v4, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mCurrentX:I

    sub-int/2addr v4, v1

    int-to-float v4, v4

    iget v5, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mCurrentY:I

    sub-int/2addr v5, v2

    int-to-float v5, v5

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 9
    iget-object v3, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v3}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getDrawMatrix()Landroid/graphics/Matrix;

    move-result-object v4

    invoke-static {v3, v4}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->access$400(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;Landroid/graphics/Matrix;)V

    .line 10
    iput v1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mCurrentX:I

    .line 11
    iput v2, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$FlingRunnable;->mCurrentY:I

    .line 12
    invoke-static {v0, p0}, Lio/togoto/imagezoomcrop/photoview/Compat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    :cond_2
    return-void
.end method
