.class public Lch$f$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch$f;->O(Lyh$i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lch$f;


# direct methods
.method public constructor <init>(Lch$f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lch$f$a;->b:Lch$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lch$f$a;->b:Lch$f;

    iget-object v0, v0, Lch$f;->y:Lch;

    iget-object v1, v0, Lch;->u:Lyh$i;

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    .line 2
    iget-object v0, v0, Lch;->p:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lch$f$a;->b:Lch$f;

    iget-object v1, v0, Lch$f;->y:Lch;

    iget-object v0, v0, Lch$f;->v:Lyh$i;

    iput-object v0, v1, Lch;->u:Lyh$i;

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->isActivated()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lch$f$a;->b:Lch$f;

    invoke-virtual {v0}, Lch$f;->P()I

    move-result v0

    .line 6
    :goto_0
    iget-object v1, p0, Lch$f$a;->b:Lch$f;

    invoke-virtual {v1, p1}, Lch$f;->Q(Z)V

    .line 7
    iget-object p1, p0, Lch$f$a;->b:Lch$f;

    iget-object p1, p1, Lch$f;->x:Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 8
    iget-object p1, p0, Lch$f$a;->b:Lch$f;

    iget-object p1, p1, Lch$f;->v:Lyh$i;

    invoke-virtual {p1, v0}, Lyh$i;->F(I)V

    .line 9
    iget-object p1, p0, Lch$f$a;->b:Lch$f;

    iget-object p1, p1, Lch$f;->y:Lch;

    iget-object p1, p1, Lch;->p:Landroid/os/Handler;

    const-wide/16 v0, 0x1f4

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method
