.class public Lmm$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmm;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lmm$c;

.field public final synthetic b:Lmm;


# direct methods
.method public constructor <init>(Lmm;Lmm$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmm$b;->b:Lmm;

    iput-object p2, p0, Lmm$b;->a:Lmm$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lmm$b;->b:Lmm;

    iget-object v1, p0, Lmm$b;->a:Lmm$c;

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Lmm;->b(FLmm$c;Z)V

    .line 2
    iget-object v0, p0, Lmm$b;->a:Lmm$c;

    invoke-virtual {v0}, Lmm$c;->A()V

    .line 3
    iget-object v0, p0, Lmm$b;->a:Lmm$c;

    invoke-virtual {v0}, Lmm$c;->l()V

    .line 4
    iget-object v0, p0, Lmm$b;->b:Lmm;

    iget-boolean v1, v0, Lmm;->g:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, v0, Lmm;->g:Z

    .line 6
    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    const-wide/16 v2, 0x534

    .line 7
    invoke-virtual {p1, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 8
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    .line 9
    iget-object p1, p0, Lmm$b;->a:Lmm$c;

    invoke-virtual {p1, v1}, Lmm$c;->x(Z)V

    goto :goto_0

    .line 10
    :cond_0
    iget p1, v0, Lmm;->f:F

    add-float/2addr p1, v2

    iput p1, v0, Lmm;->f:F

    :goto_0
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lmm$b;->b:Lmm;

    const/4 v0, 0x0

    iput v0, p1, Lmm;->f:F

    return-void
.end method
