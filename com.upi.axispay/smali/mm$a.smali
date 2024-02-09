.class public Lmm$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


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
    iput-object p1, p0, Lmm$a;->b:Lmm;

    iput-object p2, p0, Lmm$a;->a:Lmm$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 2
    iget-object v0, p0, Lmm$a;->b:Lmm;

    iget-object v1, p0, Lmm$a;->a:Lmm$c;

    invoke-virtual {v0, p1, v1}, Lmm;->n(FLmm$c;)V

    .line 3
    iget-object v0, p0, Lmm$a;->b:Lmm;

    iget-object v1, p0, Lmm$a;->a:Lmm$c;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lmm;->b(FLmm$c;Z)V

    .line 4
    iget-object p1, p0, Lmm$a;->b:Lmm;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
