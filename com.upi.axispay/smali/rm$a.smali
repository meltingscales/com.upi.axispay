.class public Lrm$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrm;->m(Landroid/view/ViewGroup;Lhn;Lhn;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/graphics/drawable/BitmapDrawable;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:F


# direct methods
.method public constructor <init>(Lrm;Landroid/view/ViewGroup;Landroid/graphics/drawable/BitmapDrawable;Landroid/view/View;F)V
    .locals 0

    .line 1
    iput-object p2, p0, Lrm$a;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lrm$a;->b:Landroid/graphics/drawable/BitmapDrawable;

    iput-object p4, p0, Lrm$a;->c:Landroid/view/View;

    iput p5, p0, Lrm$a;->d:F

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lrm$a;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, Lrn;->b(Landroid/view/View;)Lqn;

    move-result-object p1

    iget-object v0, p0, Lrm$a;->b:Landroid/graphics/drawable/BitmapDrawable;

    invoke-interface {p1, v0}, Lqn;->d(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lrm$a;->c:Landroid/view/View;

    iget v0, p0, Lrm$a;->d:F

    invoke-static {p1, v0}, Lrn;->g(Landroid/view/View;F)V

    return-void
.end method
