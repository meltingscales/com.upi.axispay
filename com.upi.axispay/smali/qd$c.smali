.class public Lqd$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd;->w(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:Lpe$e;

.field public final synthetic e:Lqd$k;


# direct methods
.method public constructor <init>(Lqd;Landroid/view/ViewGroup;Landroid/view/View;ZLpe$e;Lqd$k;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqd$c;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lqd$c;->b:Landroid/view/View;

    iput-boolean p4, p0, Lqd$c;->c:Z

    iput-object p5, p0, Lqd$c;->d:Lpe$e;

    iput-object p6, p0, Lqd$c;->e:Lqd$k;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lqd$c;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Lqd$c;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 2
    iget-boolean p1, p0, Lqd$c;->c:Z

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lqd$c;->d:Lpe$e;

    invoke-virtual {p1}, Lpe$e;->e()Lpe$e$c;

    move-result-object p1

    iget-object v0, p0, Lqd$c;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Lpe$e$c;->a(Landroid/view/View;)V

    .line 4
    :cond_0
    iget-object p1, p0, Lqd$c;->e:Lqd$k;

    invoke-virtual {p1}, Lqd$l;->a()V

    return-void
.end method
