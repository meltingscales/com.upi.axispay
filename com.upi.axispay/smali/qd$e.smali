.class public Lqd$e;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


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

.field public final synthetic c:Lqd$k;


# direct methods
.method public constructor <init>(Lqd;Landroid/view/ViewGroup;Landroid/view/View;Lqd$k;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqd$e;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lqd$e;->b:Landroid/view/View;

    iput-object p4, p0, Lqd$e;->c:Lqd$k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lqd$e;->a:Landroid/view/ViewGroup;

    new-instance v0, Lqd$e$a;

    invoke-direct {v0, p0}, Lqd$e$a;-><init>(Lqd$e;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
