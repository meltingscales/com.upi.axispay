.class public Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$1;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;-><init>(Landroid/widget/ImageView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;


# direct methods
.method public constructor <init>(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$1;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$1;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-static {p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->access$000(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;)Landroid/view/View$OnLongClickListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$1;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-static {p1}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->access$000(Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;)Landroid/view/View$OnLongClickListener;

    move-result-object p1

    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher$1;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->getImageView()Landroid/widget/ImageView;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/view/View$OnLongClickListener;->onLongClick(Landroid/view/View;)Z

    :cond_0
    return-void
.end method
