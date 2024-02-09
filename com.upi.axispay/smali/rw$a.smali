.class public final Lrw$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrw;->b(Luw;)Landroid/animation/Animator$AnimatorListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:Luw;


# direct methods
.method public constructor <init>(Luw;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrw$a;->a:Luw;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lrw$a;->a:Luw;

    invoke-interface {p1}, Luw;->a()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lrw$a;->a:Luw;

    invoke-interface {p1}, Luw;->b()V

    return-void
.end method
