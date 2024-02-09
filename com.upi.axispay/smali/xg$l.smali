.class public Lxg$l;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxg;->h(Ljava/util/Map;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lxg;


# direct methods
.method public constructor <init>(Lxg;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxg$l;->a:Lxg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lxg$l;->a:Lxg;

    iget-object p1, p1, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {p1}, Landroidx/mediarouter/app/OverlayListView;->b()V

    .line 2
    iget-object p1, p0, Lxg$l;->a:Lxg;

    iget-object v0, p1, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    iget-object v1, p1, Lxg;->p0:Ljava/lang/Runnable;

    iget p1, p1, Lxg;->h0:I

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ListView;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
