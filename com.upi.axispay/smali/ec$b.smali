.class public Lec$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lec;->k(Lhc;)Lec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhc;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lec;Lhc;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lec$b;->a:Lhc;

    iput-object p3, p0, Lec$b;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lec$b;->a:Lhc;

    iget-object v0, p0, Lec$b;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lhc;->a(Landroid/view/View;)V

    return-void
.end method
