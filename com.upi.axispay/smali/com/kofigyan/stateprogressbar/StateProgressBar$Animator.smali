.class public Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kofigyan/stateprogressbar/StateProgressBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Animator"
.end annotation


# instance fields
.field private mRestartAnimation:Z

.field private mScroller:Landroid/widget/Scroller;

.field public final synthetic this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;


# direct methods
.method public constructor <init>(Lcom/kofigyan/stateprogressbar/StateProgressBar;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->mRestartAnimation:Z

    .line 3
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-direct {v0, p1, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->mScroller:Landroid/widget/Scroller;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    invoke-static {v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->access$000(Lcom/kofigyan/stateprogressbar/StateProgressBar;)Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->mRestartAnimation:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 3
    iget-object v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->mScroller:Landroid/widget/Scroller;

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    invoke-static {v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->access$100(Lcom/kofigyan/stateprogressbar/StateProgressBar;)F

    move-result v0

    float-to-int v4, v0

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    invoke-static {v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->access$200(Lcom/kofigyan/stateprogressbar/StateProgressBar;)F

    move-result v0

    float-to-int v6, v0

    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    invoke-static {v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->access$300(Lcom/kofigyan/stateprogressbar/StateProgressBar;)I

    move-result v7

    invoke-virtual/range {v2 .. v7}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 4
    iput-boolean v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->mRestartAnimation:Z

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    .line 6
    iget-object v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    invoke-static {v2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->access$500(Lcom/kofigyan/stateprogressbar/StateProgressBar;)F

    move-result v3

    invoke-static {v2, v3}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->access$402(Lcom/kofigyan/stateprogressbar/StateProgressBar;F)F

    .line 7
    iget-object v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    iget-object v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v3}, Landroid/widget/Scroller;->getCurrY()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v2, v3}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->access$502(Lcom/kofigyan/stateprogressbar/StateProgressBar;F)F

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 9
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->stop()V

    .line 11
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    invoke-virtual {v0, v1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->enableAnimationToCurrentState(Z)V

    :goto_0
    return-void
.end method

.method public start()V
    .locals 3

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->mRestartAnimation:Z

    .line 2
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    invoke-static {v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->access$600(Lcom/kofigyan/stateprogressbar/StateProgressBar;)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public stop()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->this$0:Lcom/kofigyan/stateprogressbar/StateProgressBar;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->access$002(Lcom/kofigyan/stateprogressbar/StateProgressBar;Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;)Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;

    return-void
.end method
