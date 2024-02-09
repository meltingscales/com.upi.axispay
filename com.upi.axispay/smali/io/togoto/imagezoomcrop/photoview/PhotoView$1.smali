.class public Lio/togoto/imagezoomcrop/photoview/PhotoView$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/togoto/imagezoomcrop/photoview/PhotoView;->postUpdate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/togoto/imagezoomcrop/photoview/PhotoView;


# direct methods
.method public constructor <init>(Lio/togoto/imagezoomcrop/photoview/PhotoView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView$1;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView$1;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    invoke-static {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->access$000(Lio/togoto/imagezoomcrop/photoview/PhotoView;)Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/PhotoView$1;->this$0:Lio/togoto/imagezoomcrop/photoview/PhotoView;

    invoke-static {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoView;->access$000(Lio/togoto/imagezoomcrop/photoview/PhotoView;)Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;

    move-result-object v0

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/PhotoViewAttacher;->update()V

    :cond_0
    return-void
.end method
