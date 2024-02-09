.class public Lch$h$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch$h;->w(Landroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lch$h;


# direct methods
.method public constructor <init>(Lch$h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lch$h$b;->a:Lch$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lch$h$b;->a:Lch$h;

    iget-object p1, p1, Lch$h;->m:Lch;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lch;->x:Z

    .line 2
    invoke-virtual {p1}, Lch;->w()V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lch$h$b;->a:Lch$h;

    iget-object p1, p1, Lch$h;->m:Lch;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lch;->x:Z

    return-void
.end method
