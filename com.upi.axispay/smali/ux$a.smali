.class public Lux$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lux;->w(Lux$j;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Z

.field public final synthetic c:Lux$j;

.field public final synthetic d:Lux;


# direct methods
.method public constructor <init>(Lux;ZLux$j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lux$a;->d:Lux;

    iput-boolean p2, p0, Lux$a;->b:Z

    iput-object p3, p0, Lux$a;->c:Lux$j;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lux$a;->a:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lux$a;->d:Lux;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lux;->a(Lux;I)I

    .line 2
    iget-object p1, p0, Lux$a;->d:Lux;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lux;->b(Lux;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 3
    iget-boolean p1, p0, Lux$a;->a:Z

    if-nez p1, :cond_1

    .line 4
    iget-object p1, p0, Lux$a;->d:Lux;

    iget-object p1, p1, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iget-boolean v0, p0, Lux$a;->b:Z

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    :goto_0
    invoke-virtual {p1, v1, v0}, Loy;->b(IZ)V

    .line 5
    iget-object p1, p0, Lux$a;->c:Lux$j;

    if-eqz p1, :cond_1

    .line 6
    invoke-interface {p1}, Lux$j;->b()V

    :cond_1
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lux$a;->d:Lux;

    iget-object v0, v0, Lux;->y:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iget-boolean v1, p0, Lux$a;->b:Z

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Loy;->b(IZ)V

    .line 2
    iget-object v0, p0, Lux$a;->d:Lux;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lux;->a(Lux;I)I

    .line 3
    iget-object v0, p0, Lux$a;->d:Lux;

    invoke-static {v0, p1}, Lux;->b(Lux;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 4
    iput-boolean v2, p0, Lux$a;->a:Z

    return-void
.end method
