.class public Lec$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lec;->i(Landroid/view/View;Lfc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfc;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lec;Lfc;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lec$a;->a:Lfc;

    iput-object p3, p0, Lec$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lec$a;->a:Lfc;

    iget-object v0, p0, Lec$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lfc;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lec$a;->a:Lfc;

    iget-object v0, p0, Lec$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lfc;->b(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lec$a;->a:Lfc;

    iget-object v0, p0, Lec$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lfc;->c(Landroid/view/View;)V

    return-void
.end method
