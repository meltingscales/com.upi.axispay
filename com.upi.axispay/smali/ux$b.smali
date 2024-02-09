.class public Lux$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lux;->c0(Lux$j;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lux$j;

.field public final synthetic c:Lux;


# direct methods
.method public constructor <init>(Lux;ZLux$j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lux$b;->c:Lux;

    iput-boolean p2, p0, Lux$b;->a:Z

    iput-object p3, p0, Lux$b;->b:Lux$j;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lux$b;->c:Lux;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lux;->a(Lux;I)I

    .line 2
    iget-object p1, p0, Lux$b;->c:Lux;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lux;->b(Lux;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 3
    iget-object p1, p0, Lux$b;->b:Lux$j;

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1}, Lux$j;->a()V

    :cond_0
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lux$b;->c:Lux;

    iget-object v0, v0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iget-boolean v1, p0, Lux$b;->a:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Loy;->b(IZ)V

    .line 2
    iget-object v0, p0, Lux$b;->c:Lux;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lux;->a(Lux;I)I

    .line 3
    iget-object v0, p0, Lux$b;->c:Lux;

    invoke-static {v0, p1}, Lux;->b(Lux;Landroid/animation/Animator;)Landroid/animation/Animator;

    return-void
.end method
