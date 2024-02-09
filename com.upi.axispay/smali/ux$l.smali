.class public abstract Lux$l;
.super Landroid/animation/AnimatorListenerAdapter;
.source "AxisPay"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lux;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "l"
.end annotation


# instance fields
.field public a:Z

.field public b:F

.field public c:F

.field public final synthetic d:Lux;


# direct methods
.method public constructor <init>(Lux;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lux$l;->d:Lux;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lux;Lux$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lux$l;-><init>(Lux;)V

    return-void
.end method


# virtual methods
.method public abstract a()F
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lux$l;->d:Lux;

    iget v0, p0, Lux$l;->c:F

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Lux;->g0(F)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lux$l;->a:Z

    return-void
.end method

.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lux$l;->a:Z

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lux$l;->d:Lux;

    iget-object v0, v0, Lux;->b:Lhz;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lhz;->w()F

    move-result v0

    :goto_0
    iput v0, p0, Lux$l;->b:F

    .line 3
    invoke-virtual {p0}, Lux$l;->a()F

    move-result v0

    iput v0, p0, Lux$l;->c:F

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lux$l;->a:Z

    .line 5
    :cond_1
    iget-object v0, p0, Lux$l;->d:Lux;

    iget v1, p0, Lux$l;->b:F

    iget v2, p0, Lux$l;->c:F

    sub-float/2addr v2, v1

    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    float-to-int p1, v1

    int-to-float p1, p1

    .line 7
    invoke-virtual {v0, p1}, Lux;->g0(F)V

    return-void
.end method
