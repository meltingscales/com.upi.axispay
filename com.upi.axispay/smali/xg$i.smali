.class public Lxg$i;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxg;->K(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Lxg;


# direct methods
.method public constructor <init>(Lxg;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxg$i;->c:Lxg;

    iput-boolean p2, p0, Lxg$i;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxg$i;->c:Lxg;

    iget-object v0, v0, Lxg;->t:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 2
    iget-object v0, p0, Lxg$i;->c:Lxg;

    iget-boolean v1, v0, Lxg;->f0:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, v0, Lxg;->g0:Z

    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v1, p0, Lxg$i;->b:Z

    invoke-virtual {v0, v1}, Lxg;->L(Z)V

    :goto_0
    return-void
.end method
