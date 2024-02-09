.class public Lxg;
.super Ly;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxg$n;,
        Lxg$r;,
        Lxg$q;,
        Lxg$m;,
        Lxg$o;,
        Lxg$p;
    }
.end annotation


# static fields
.field public static final q0:Z

.field public static final r0:I


# instance fields
.field public A:Landroid/widget/LinearLayout;

.field public B:Landroid/widget/RelativeLayout;

.field public C:Landroid/widget/LinearLayout;

.field public D:Landroid/view/View;

.field public E:Landroidx/mediarouter/app/OverlayListView;

.field public F:Lxg$r;

.field public G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lyh$i;",
            ">;"
        }
    .end annotation
.end field

.field public H:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lyh$i;",
            ">;"
        }
    .end annotation
.end field

.field public I:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lyh$i;",
            ">;"
        }
    .end annotation
.end field

.field public J:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lyh$i;",
            ">;"
        }
    .end annotation
.end field

.field public K:Landroid/widget/SeekBar;

.field public L:Lxg$q;

.field public M:Lyh$i;

.field public N:I

.field public O:I

.field public P:I

.field public final Q:I

.field public R:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lyh$i;",
            "Landroid/widget/SeekBar;",
            ">;"
        }
    .end annotation
.end field

.field public S:Landroid/support/v4/media/session/MediaControllerCompat;

.field public T:Lxg$o;

.field public U:Landroid/support/v4/media/session/PlaybackStateCompat;

.field public V:Landroid/support/v4/media/MediaDescriptionCompat;

.field public W:Lxg$n;

.field public X:Landroid/graphics/Bitmap;

.field public Y:Landroid/net/Uri;

.field public Z:Z

.field public a0:Landroid/graphics/Bitmap;

.field public b0:I

.field public c0:Z

.field public d0:Z

.field public final e:Lyh;

.field public e0:Z

.field public final f:Lxg$p;

.field public f0:Z

.field public final g:Lyh$i;

.field public g0:Z

.field public h:Landroid/content/Context;

.field public h0:I

.field public i:Z

.field public i0:I

.field public j:Z

.field public j0:I

.field public k:I

.field public k0:Landroid/view/animation/Interpolator;

.field public l:Landroid/view/View;

.field public l0:Landroid/view/animation/Interpolator;

.field public m:Landroid/widget/Button;

.field public m0:Landroid/view/animation/Interpolator;

.field public n:Landroid/widget/Button;

.field public n0:Landroid/view/animation/Interpolator;

.field public o:Landroid/widget/ImageButton;

.field public final o0:Landroid/view/accessibility/AccessibilityManager;

.field public p:Landroid/widget/ImageButton;

.field public p0:Ljava/lang/Runnable;

.field public q:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

.field public r:Landroid/widget/FrameLayout;

.field public s:Landroid/widget/LinearLayout;

.field public t:Landroid/widget/FrameLayout;

.field public u:Landroid/widget/FrameLayout;

.field public v:Landroid/widget/ImageView;

.field public w:Landroid/widget/TextView;

.field public x:Landroid/widget/TextView;

.field public y:Landroid/widget/TextView;

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const v0, 0x195b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lxg;->q0:Z

    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lxg;->r0:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lxg;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-static {p1, p2, v0}, Ldh;->b(Landroid/content/Context;IZ)Landroid/content/Context;

    move-result-object p1

    .line 3
    invoke-static {p1}, Ldh;->c(Landroid/content/Context;)I

    move-result p2

    .line 4
    invoke-direct {p0, p1, p2}, Ly;-><init>(Landroid/content/Context;I)V

    .line 5
    iput-boolean v0, p0, Lxg;->z:Z

    .line 6
    new-instance p2, Lxg$d;

    invoke-direct {p2, p0}, Lxg$d;-><init>(Lxg;)V

    iput-object p2, p0, Lxg;->p0:Ljava/lang/Runnable;

    .line 7
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lxg;->h:Landroid/content/Context;

    .line 8
    new-instance p2, Lxg$o;

    invoke-direct {p2, p0}, Lxg$o;-><init>(Lxg;)V

    iput-object p2, p0, Lxg;->T:Lxg$o;

    .line 9
    iget-object p2, p0, Lxg;->h:Landroid/content/Context;

    invoke-static {p2}, Lyh;->g(Landroid/content/Context;)Lyh;

    move-result-object p2

    iput-object p2, p0, Lxg;->e:Lyh;

    .line 10
    new-instance v0, Lxg$p;

    invoke-direct {v0, p0}, Lxg$p;-><init>(Lxg;)V

    iput-object v0, p0, Lxg;->f:Lxg$p;

    .line 11
    invoke-virtual {p2}, Lyh;->k()Lyh$i;

    move-result-object v0

    iput-object v0, p0, Lxg;->g:Lyh$i;

    .line 12
    invoke-virtual {p2}, Lyh;->h()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object p2

    invoke-virtual {p0, p2}, Lxg;->E(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 13
    iget-object p2, p0, Lxg;->h:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, Llg;->mr_controller_volume_group_list_padding_top:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lxg;->Q:I

    .line 14
    iget-object p2, p0, Lxg;->h:Landroid/content/Context;

    const v0, 0x195c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/accessibility/AccessibilityManager;

    iput-object p2, p0, Lxg;->o0:Landroid/view/accessibility/AccessibilityManager;

    .line 16
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-lt p2, v0, :cond_0

    .line 17
    sget p2, Lpg;->mr_linear_out_slow_in:I

    invoke-static {p1, p2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p2

    iput-object p2, p0, Lxg;->l0:Landroid/view/animation/Interpolator;

    .line 18
    sget p2, Lpg;->mr_fast_out_slow_in:I

    invoke-static {p1, p2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p1

    iput-object p1, p0, Lxg;->m0:Landroid/view/animation/Interpolator;

    .line 19
    :cond_0
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object p1, p0, Lxg;->n0:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public static D(Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 2
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static Q(Landroid/net/Uri;Landroid/net/Uri;)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    if-nez p0, :cond_1

    if-nez p1, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static r(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    iget p0, p0, Landroid/view/ViewGroup$LayoutParams;->height:I

    return p0
.end method

.method public static t(Landroid/graphics/Bitmap;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 2
    iget-boolean v0, p0, Lxg;->e0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxg;->l0:Landroid/view/animation/Interpolator;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lxg;->m0:Landroid/view/animation/Interpolator;

    :goto_0
    iput-object v0, p0, Lxg;->k0:Landroid/view/animation/Interpolator;

    goto :goto_1

    .line 4
    :cond_1
    iget-object v0, p0, Lxg;->n0:Landroid/view/animation/Interpolator;

    iput-object v0, p0, Lxg;->k0:Landroid/view/animation/Interpolator;

    :goto_1
    return-void
.end method

.method public B(Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final C(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lxg;->g:Lyh$i;

    invoke-virtual {v0}, Lyh$i;->k()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object p1, p0, Lxg;->G:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 4
    iget-object p1, p0, Lxg;->F:Lxg$r;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    goto :goto_2

    .line 5
    :cond_0
    iget-object v1, p0, Lxg;->G:Ljava/util/List;

    invoke-static {v1, v0}, Lah;->i(Ljava/util/List;Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    iget-object p1, p0, Lxg;->F:Lxg$r;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 7
    iget-object v2, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    iget-object v3, p0, Lxg;->F:Lxg$r;

    invoke-static {v2, v3}, Lah;->e(Landroid/widget/ListView;Landroid/widget/ArrayAdapter;)Ljava/util/HashMap;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v1

    :goto_0
    if-eqz p1, :cond_3

    .line 8
    iget-object v3, p0, Lxg;->h:Landroid/content/Context;

    iget-object v4, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    iget-object v5, p0, Lxg;->F:Lxg$r;

    invoke-static {v3, v4, v5}, Lah;->d(Landroid/content/Context;Landroid/widget/ListView;Landroid/widget/ArrayAdapter;)Ljava/util/HashMap;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v1

    .line 9
    :goto_1
    iget-object v4, p0, Lxg;->G:Ljava/util/List;

    .line 10
    invoke-static {v4, v0}, Lah;->f(Ljava/util/List;Ljava/util/List;)Ljava/util/Set;

    move-result-object v4

    iput-object v4, p0, Lxg;->H:Ljava/util/Set;

    .line 11
    iget-object v4, p0, Lxg;->G:Ljava/util/List;

    invoke-static {v4, v0}, Lah;->g(Ljava/util/List;Ljava/util/List;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lxg;->I:Ljava/util/Set;

    .line 12
    iget-object v0, p0, Lxg;->G:Ljava/util/List;

    const/4 v4, 0x0

    iget-object v5, p0, Lxg;->H:Ljava/util/Set;

    invoke-interface {v0, v4, v5}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 13
    iget-object v0, p0, Lxg;->G:Ljava/util/List;

    iget-object v4, p0, Lxg;->I:Ljava/util/Set;

    invoke-interface {v0, v4}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 14
    iget-object v0, p0, Lxg;->F:Lxg$r;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    if-eqz p1, :cond_4

    .line 15
    iget-boolean p1, p0, Lxg;->e0:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lxg;->H:Ljava/util/Set;

    .line 16
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    iget-object v0, p0, Lxg;->I:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    add-int/2addr p1, v0

    if-lez p1, :cond_4

    .line 17
    invoke-virtual {p0, v2, v3}, Lxg;->g(Ljava/util/Map;Ljava/util/Map;)V

    goto :goto_2

    .line 18
    :cond_4
    iput-object v1, p0, Lxg;->H:Ljava/util/Set;

    .line 19
    iput-object v1, p0, Lxg;->I:Ljava/util/Set;

    :goto_2
    return-void
.end method

.method public final E(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxg;->S:Landroid/support/v4/media/session/MediaControllerCompat;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v2, p0, Lxg;->T:Lxg$o;

    invoke-virtual {v0, v2}, Landroid/support/v4/media/session/MediaControllerCompat;->unregisterCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V

    .line 3
    iput-object v1, p0, Lxg;->S:Landroid/support/v4/media/session/MediaControllerCompat;

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 4
    :cond_1
    iget-boolean v0, p0, Lxg;->j:Z

    if-nez v0, :cond_2

    return-void

    .line 5
    :cond_2
    new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat;

    iget-object v2, p0, Lxg;->h:Landroid/content/Context;

    invoke-direct {v0, v2, p1}, Landroid/support/v4/media/session/MediaControllerCompat;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    iput-object v0, p0, Lxg;->S:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 6
    iget-object p1, p0, Lxg;->T:Lxg$o;

    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompat;->registerCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V

    .line 7
    iget-object p1, p0, Lxg;->S:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getMetadata()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 8
    :cond_3
    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat;->getDescription()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v1

    :goto_0
    iput-object v1, p0, Lxg;->V:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 9
    iget-object p1, p0, Lxg;->S:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getPlaybackState()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p1

    iput-object p1, p0, Lxg;->U:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 10
    invoke-virtual {p0}, Lxg;->I()V

    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Lxg;->H(Z)V

    return-void
.end method

.method public F()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lxg;->m(Z)V

    .line 2
    iget-object v0, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->requestLayout()V

    .line 3
    iget-object v0, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 4
    new-instance v1, Lxg$b;

    invoke-direct {v1, p0}, Lxg$b;-><init>(Lxg;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public G()V
    .locals 1

    .line 1
    iget-object v0, p0, Lxg;->H:Ljava/util/Set;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lxg;->o()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lxg;->p(Z)V

    :goto_0
    return-void
.end method

.method public H(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxg;->M:Lyh$i;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lxg;->c0:Z

    .line 3
    iget-boolean v0, p0, Lxg;->d0:Z

    or-int/2addr p1, v0

    iput-boolean p1, p0, Lxg;->d0:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lxg;->c0:Z

    .line 5
    iput-boolean v0, p0, Lxg;->d0:Z

    .line 6
    iget-object v1, p0, Lxg;->g:Lyh$i;

    invoke-virtual {v1}, Lyh$i;->B()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lxg;->g:Lyh$i;

    invoke-virtual {v1}, Lyh$i;->v()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    .line 7
    :cond_1
    iget-boolean v1, p0, Lxg;->i:Z

    if-nez v1, :cond_2

    return-void

    .line 8
    :cond_2
    iget-object v1, p0, Lxg;->y:Landroid/widget/TextView;

    iget-object v2, p0, Lxg;->g:Lyh$i;

    invoke-virtual {v2}, Lyh$i;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v1, p0, Lxg;->m:Landroid/widget/Button;

    iget-object v2, p0, Lxg;->g:Lyh$i;

    invoke-virtual {v2}, Lyh$i;->a()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 10
    iget-object v0, p0, Lxg;->l:Landroid/view/View;

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lxg;->Z:Z

    if-eqz v0, :cond_5

    .line 11
    iget-object v0, p0, Lxg;->a0:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lxg;->t(Landroid/graphics/Bitmap;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x195d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lxg;->a0:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x195e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 13
    :cond_4
    iget-object v0, p0, Lxg;->v:Landroid/widget/ImageView;

    iget-object v1, p0, Lxg;->a0:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 14
    iget-object v0, p0, Lxg;->v:Landroid/widget/ImageView;

    iget v1, p0, Lxg;->b0:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 15
    :goto_1
    invoke-virtual {p0}, Lxg;->n()V

    .line 16
    :cond_5
    invoke-virtual {p0}, Lxg;->O()V

    .line 17
    invoke-virtual {p0}, Lxg;->N()V

    .line 18
    invoke-virtual {p0, p1}, Lxg;->K(Z)V

    return-void

    .line 19
    :cond_6
    :goto_2
    invoke-virtual {p0}, Lc0;->dismiss()V

    return-void
.end method

.method public I()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxg;->l:Landroid/view/View;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lxg;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lxg;->W:Lxg$n;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 4
    :cond_1
    new-instance v0, Lxg$n;

    invoke-direct {v0, p0}, Lxg$n;-><init>(Lxg;)V

    iput-object v0, p0, Lxg;->W:Lxg$n;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_2
    :goto_0
    return-void
.end method

.method public J()V
    .locals 3

    .line 1
    iget-object v0, p0, Lxg;->h:Landroid/content/Context;

    invoke-static {v0}, Lah;->b(Landroid/content/Context;)I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, -0x2

    invoke-virtual {v1, v0, v2}, Landroid/view/Window;->setLayout(II)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lxg;->k:I

    .line 5
    iget-object v0, p0, Lxg;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 6
    sget v1, Llg;->mr_controller_volume_group_list_item_icon_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lxg;->N:I

    .line 7
    sget v1, Llg;->mr_controller_volume_group_list_item_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lxg;->O:I

    .line 8
    sget v1, Llg;->mr_controller_volume_group_list_max_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lxg;->P:I

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lxg;->X:Landroid/graphics/Bitmap;

    .line 10
    iput-object v0, p0, Lxg;->Y:Landroid/net/Uri;

    .line 11
    invoke-virtual {p0}, Lxg;->I()V

    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Lxg;->H(Z)V

    return-void
.end method

.method public K(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxg;->t:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->requestLayout()V

    .line 2
    iget-object v0, p0, Lxg;->t:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 3
    new-instance v1, Lxg$i;

    invoke-direct {v1, p0, p1}, Lxg$i;-><init>(Lxg;Z)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public L(Z)V
    .locals 9

    .line 1
    iget-object v0, p0, Lxg;->A:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lxg;->r(Landroid/view/View;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lxg;->A:Landroid/widget/LinearLayout;

    const/4 v2, -0x1

    invoke-static {v1, v2}, Lxg;->D(Landroid/view/View;I)V

    .line 3
    invoke-virtual {p0}, Lxg;->k()Z

    move-result v1

    invoke-virtual {p0, v1}, Lxg;->M(Z)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    .line 5
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    const/4 v3, 0x0

    .line 6
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->measure(II)V

    .line 7
    iget-object v2, p0, Lxg;->A:Landroid/widget/LinearLayout;

    invoke-static {v2, v0}, Lxg;->D(Landroid/view/View;I)V

    .line 8
    iget-object v0, p0, Lxg;->l:Landroid/view/View;

    if-nez v0, :cond_1

    iget-object v0, p0, Lxg;->v:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_1

    .line 9
    iget-object v0, p0, Lxg;->v:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-virtual {p0, v2, v4}, Lxg;->q(II)I

    move-result v2

    .line 11
    iget-object v4, p0, Lxg;->v:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-lt v5, v0, :cond_0

    .line 12
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 13
    :goto_0
    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto :goto_1

    :cond_1
    move v2, v3

    .line 14
    :goto_1
    invoke-virtual {p0}, Lxg;->k()Z

    move-result v0

    invoke-virtual {p0, v0}, Lxg;->s(Z)I

    move-result v0

    .line 15
    iget-object v4, p0, Lxg;->G:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    .line 16
    iget-object v5, p0, Lxg;->g:Lyh$i;

    invoke-virtual {v5}, Lyh$i;->x()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 17
    iget v5, p0, Lxg;->O:I

    iget-object v6, p0, Lxg;->g:Lyh$i;

    invoke-virtual {v6}, Lyh$i;->k()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    mul-int/2addr v5, v6

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    if-lez v4, :cond_3

    .line 18
    iget v4, p0, Lxg;->Q:I

    add-int/2addr v5, v4

    .line 19
    :cond_3
    iget v4, p0, Lxg;->P:I

    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 20
    iget-boolean v5, p0, Lxg;->e0:Z

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    move v4, v3

    .line 21
    :goto_3
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/2addr v5, v0

    .line 22
    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 23
    invoke-virtual {v1, v6}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 24
    iget-object v1, p0, Lxg;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v1

    iget-object v7, p0, Lxg;->t:Landroid/widget/FrameLayout;

    .line 25
    invoke-virtual {v7}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result v7

    sub-int/2addr v1, v7

    .line 26
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v7

    sub-int/2addr v7, v1

    .line 27
    iget-object v1, p0, Lxg;->l:Landroid/view/View;

    const/16 v8, 0x8

    if-nez v1, :cond_5

    if-lez v2, :cond_5

    if-gt v5, v7, :cond_5

    .line 28
    iget-object v0, p0, Lxg;->v:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 29
    iget-object v0, p0, Lxg;->v:Landroid/widget/ImageView;

    invoke-static {v0, v2}, Lxg;->D(Landroid/view/View;I)V

    goto :goto_4

    .line 30
    :cond_5
    iget-object v1, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-static {v1}, Lxg;->r(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Lxg;->A:Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lxg;->t:Landroid/widget/FrameLayout;

    .line 31
    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result v2

    if-lt v1, v2, :cond_6

    .line 32
    iget-object v1, p0, Lxg;->v:Landroid/widget/ImageView;

    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_6
    add-int v5, v4, v0

    move v2, v3

    .line 33
    :goto_4
    invoke-virtual {p0}, Lxg;->k()Z

    move-result v0

    if-eqz v0, :cond_7

    if-gt v5, v7, :cond_7

    .line 34
    iget-object v0, p0, Lxg;->B:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_5

    .line 35
    :cond_7
    iget-object v0, p0, Lxg;->B:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 36
    :goto_5
    iget-object v0, p0, Lxg;->B:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_8

    move v0, v1

    goto :goto_6

    :cond_8
    move v0, v3

    :goto_6
    invoke-virtual {p0, v0}, Lxg;->M(Z)V

    .line 37
    iget-object v0, p0, Lxg;->B:Landroid/widget/RelativeLayout;

    .line 38
    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_9

    move v3, v1

    .line 39
    :cond_9
    invoke-virtual {p0, v3}, Lxg;->s(Z)I

    move-result v0

    .line 40
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v0

    if-le v1, v7, :cond_a

    sub-int/2addr v1, v7

    sub-int/2addr v4, v1

    goto :goto_7

    :cond_a
    move v7, v1

    .line 41
    :goto_7
    iget-object v1, p0, Lxg;->A:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->clearAnimation()V

    .line 42
    iget-object v1, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->clearAnimation()V

    .line 43
    iget-object v1, p0, Lxg;->t:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->clearAnimation()V

    if-eqz p1, :cond_b

    .line 44
    iget-object v1, p0, Lxg;->A:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v1, v0}, Lxg;->j(Landroid/view/View;I)V

    .line 45
    iget-object v0, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {p0, v0, v4}, Lxg;->j(Landroid/view/View;I)V

    .line 46
    iget-object v0, p0, Lxg;->t:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0, v7}, Lxg;->j(Landroid/view/View;I)V

    goto :goto_8

    .line 47
    :cond_b
    iget-object v1, p0, Lxg;->A:Landroid/widget/LinearLayout;

    invoke-static {v1, v0}, Lxg;->D(Landroid/view/View;I)V

    .line 48
    iget-object v0, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-static {v0, v4}, Lxg;->D(Landroid/view/View;I)V

    .line 49
    iget-object v0, p0, Lxg;->t:Landroid/widget/FrameLayout;

    invoke-static {v0, v7}, Lxg;->D(Landroid/view/View;I)V

    .line 50
    :goto_8
    iget-object v0, p0, Lxg;->r:Landroid/widget/FrameLayout;

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-static {v0, v1}, Lxg;->D(Landroid/view/View;I)V

    .line 51
    invoke-virtual {p0, p1}, Lxg;->C(Z)V

    return-void
.end method

.method public final M(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lxg;->D:Landroid/view/View;

    iget-object v1, p0, Lxg;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-nez v1, :cond_0

    if-eqz p1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lxg;->A:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lxg;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    if-ne v1, v3, :cond_1

    if-nez p1, :cond_1

    move v2, v3

    :cond_1
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public final N()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lxg;->k()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 2
    iget-object v0, p0, Lxg;->V:Landroid/support/v4/media/MediaDescriptionCompat;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    .line 3
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    .line 4
    iget-object v4, p0, Lxg;->V:Landroid/support/v4/media/MediaDescriptionCompat;

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Landroid/support/v4/media/MediaDescriptionCompat;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v1

    .line 5
    :goto_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    xor-int/2addr v4, v3

    .line 6
    iget-object v5, p0, Lxg;->g:Lyh$i;

    invoke-virtual {v5}, Lyh$i;->o()I

    move-result v5

    const/4 v6, -0x1

    const/4 v7, 0x0

    if-eq v5, v6, :cond_3

    .line 7
    iget-object v0, p0, Lxg;->w:Landroid/widget/TextView;

    sget v1, Lrg;->mr_controller_casting_screen:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :goto_2
    move v0, v3

    :cond_2
    move v1, v7

    goto :goto_5

    .line 8
    :cond_3
    iget-object v5, p0, Lxg;->U:Landroid/support/v4/media/session/PlaybackStateCompat;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result v5

    if-nez v5, :cond_4

    goto :goto_4

    :cond_4
    if-nez v2, :cond_5

    if-nez v4, :cond_5

    .line 9
    iget-object v0, p0, Lxg;->w:Landroid/widget/TextView;

    sget v1, Lrg;->mr_controller_no_info_available:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_6

    .line 10
    iget-object v2, p0, Lxg;->w:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move v0, v3

    goto :goto_3

    :cond_6
    move v0, v7

    :goto_3
    if-eqz v4, :cond_2

    .line 11
    iget-object v2, p0, Lxg;->x:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move v1, v3

    goto :goto_5

    .line 12
    :cond_7
    :goto_4
    iget-object v0, p0, Lxg;->w:Landroid/widget/TextView;

    sget v1, Lrg;->mr_controller_no_media_selected:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    .line 13
    :goto_5
    iget-object v2, p0, Lxg;->w:Landroid/widget/TextView;

    const/16 v4, 0x8

    if-eqz v0, :cond_8

    move v0, v7

    goto :goto_6

    :cond_8
    move v0, v4

    :goto_6
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    iget-object v0, p0, Lxg;->x:Landroid/widget/TextView;

    if-eqz v1, :cond_9

    move v1, v7

    goto :goto_7

    :cond_9
    move v1, v4

    :goto_7
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    iget-object v0, p0, Lxg;->U:Landroid/support/v4/media/session/PlaybackStateCompat;

    if-eqz v0, :cond_10

    .line 16
    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result v0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_b

    iget-object v0, p0, Lxg;->U:Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 17
    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_a

    goto :goto_8

    :cond_a
    move v0, v7

    goto :goto_9

    :cond_b
    :goto_8
    move v0, v3

    .line 18
    :goto_9
    iget-object v1, p0, Lxg;->o:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v0, :cond_c

    .line 19
    invoke-virtual {p0}, Lxg;->w()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 20
    sget v0, Lig;->mediaRoutePauseDrawable:I

    .line 21
    sget v2, Lrg;->mr_controller_pause:I

    goto :goto_a

    :cond_c
    if-eqz v0, :cond_d

    .line 22
    invoke-virtual {p0}, Lxg;->y()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 23
    sget v0, Lig;->mediaRouteStopDrawable:I

    .line 24
    sget v2, Lrg;->mr_controller_stop:I

    goto :goto_a

    :cond_d
    if-nez v0, :cond_e

    .line 25
    invoke-virtual {p0}, Lxg;->x()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 26
    sget v0, Lig;->mediaRoutePlayDrawable:I

    .line 27
    sget v2, Lrg;->mr_controller_play:I

    goto :goto_a

    :cond_e
    move v0, v7

    move v2, v0

    move v3, v2

    .line 28
    :goto_a
    iget-object v5, p0, Lxg;->o:Landroid/widget/ImageButton;

    if-eqz v3, :cond_f

    goto :goto_b

    :cond_f
    move v7, v4

    :goto_b
    invoke-virtual {v5, v7}, Landroid/widget/ImageButton;->setVisibility(I)V

    if-eqz v3, :cond_10

    .line 29
    iget-object v3, p0, Lxg;->o:Landroid/widget/ImageButton;

    .line 30
    invoke-static {v1, v0}, Ldh;->p(Landroid/content/Context;I)I

    move-result v0

    .line 31
    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 32
    iget-object v0, p0, Lxg;->o:Landroid/widget/ImageButton;

    .line 33
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 34
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_10
    return-void
.end method

.method public final O()V
    .locals 4

    .line 1
    iget-object v0, p0, Lxg;->g:Lyh$i;

    invoke-virtual {p0, v0}, Lxg;->z(Lyh$i;)Z

    move-result v0

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lxg;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-ne v0, v1, :cond_2

    .line 3
    iget-object v0, p0, Lxg;->C:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lxg;->K:Landroid/widget/SeekBar;

    iget-object v3, p0, Lxg;->g:Lyh$i;

    invoke-virtual {v3}, Lyh$i;->t()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 5
    iget-object v0, p0, Lxg;->K:Landroid/widget/SeekBar;

    iget-object v3, p0, Lxg;->g:Lyh$i;

    invoke-virtual {v3}, Lyh$i;->r()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 6
    iget-object v0, p0, Lxg;->q:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    iget-object v3, p0, Lxg;->g:Lyh$i;

    invoke-virtual {v3}, Lyh$i;->x()Z

    move-result v3

    if-eqz v3, :cond_0

    move v1, v2

    :cond_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lxg;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public P(Landroid/view/View;)V
    .locals 2

    .line 1
    sget v0, Lng;->volume_item_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 2
    iget v1, p0, Lxg;->O:I

    invoke-static {v0, v1}, Lxg;->D(Landroid/view/View;I)V

    .line 3
    sget v0, Lng;->mr_volume_item_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 5
    iget v1, p0, Lxg;->N:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 6
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final g(Ljava/util/Map;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lyh$i;",
            "Landroid/graphics/Rect;",
            ">;",
            "Ljava/util/Map<",
            "Lyh$i;",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEnabled(Z)V

    .line 2
    iget-object v0, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->requestLayout()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lxg;->f0:Z

    .line 4
    iget-object v0, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 5
    new-instance v1, Lxg$k;

    invoke-direct {v1, p0, p1, p2}, Lxg$k;-><init>(Lxg;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public h(Ljava/util/Map;Ljava/util/Map;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lyh$i;",
            "Landroid/graphics/Rect;",
            ">;",
            "Ljava/util/Map<",
            "Lyh$i;",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-object v2, v0, Lxg;->H:Ljava/util/Set;

    if-eqz v2, :cond_6

    iget-object v3, v0, Lxg;->I:Ljava/util/Set;

    if-nez v3, :cond_0

    goto/16 :goto_4

    .line 2
    :cond_0
    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    iget-object v3, v0, Lxg;->I:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    sub-int/2addr v2, v3

    .line 3
    new-instance v3, Lxg$l;

    invoke-direct {v3, v0}, Lxg$l;-><init>(Lxg;)V

    .line 4
    iget-object v4, v0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v4}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    .line 5
    :goto_0
    iget-object v7, v0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v7}, Landroid/widget/ListView;->getChildCount()I

    move-result v7

    const/4 v8, 0x0

    if-ge v5, v7, :cond_4

    .line 6
    iget-object v7, v0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v7, v5}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    add-int v9, v4, v5

    .line 7
    iget-object v10, v0, Lxg;->F:Lxg$r;

    invoke-virtual {v10, v9}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lyh$i;

    .line 8
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/graphics/Rect;

    .line 9
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v11

    if-eqz v10, :cond_1

    .line 10
    iget v10, v10, Landroid/graphics/Rect;->top:I

    goto :goto_1

    .line 11
    :cond_1
    iget v10, v0, Lxg;->O:I

    mul-int/2addr v10, v2

    add-int/2addr v10, v11

    .line 12
    :goto_1
    new-instance v12, Landroid/view/animation/AnimationSet;

    const/4 v13, 0x1

    invoke-direct {v12, v13}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 13
    iget-object v14, v0, Lxg;->H:Ljava/util/Set;

    if-eqz v14, :cond_2

    invoke-interface {v14, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    .line 14
    new-instance v10, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v10, v8, v8}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 15
    iget v14, v0, Lxg;->i0:I

    int-to-long v14, v14

    invoke-virtual {v10, v14, v15}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 16
    invoke-virtual {v12, v10}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    move v10, v11

    .line 17
    :cond_2
    new-instance v14, Landroid/view/animation/TranslateAnimation;

    sub-int/2addr v10, v11

    int-to-float v10, v10

    invoke-direct {v14, v8, v8, v10, v8}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 18
    iget v8, v0, Lxg;->h0:I

    int-to-long v10, v8

    invoke-virtual {v14, v10, v11}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 19
    invoke-virtual {v12, v14}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 20
    invoke-virtual {v12, v13}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    .line 21
    invoke-virtual {v12, v13}, Landroid/view/animation/AnimationSet;->setFillEnabled(Z)V

    .line 22
    iget-object v8, v0, Lxg;->k0:Landroid/view/animation/Interpolator;

    invoke-virtual {v12, v8}, Landroid/view/animation/AnimationSet;->setInterpolator(Landroid/view/animation/Interpolator;)V

    if-nez v6, :cond_3

    .line 23
    invoke-virtual {v12, v3}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    move v6, v13

    .line 24
    :cond_3
    invoke-virtual {v7}, Landroid/view/View;->clearAnimation()V

    .line 25
    invoke-virtual {v7, v12}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 26
    invoke-interface {v1, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v7, p2

    .line 27
    invoke-interface {v7, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    move-object/from16 v7, p2

    .line 28
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 29
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lyh$i;

    .line 30
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 31
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Rect;

    .line 32
    iget-object v7, v0, Lxg;->I:Ljava/util/Set;

    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 33
    new-instance v5, Landroidx/mediarouter/app/OverlayListView$a;

    invoke-direct {v5, v4, v6}, Landroidx/mediarouter/app/OverlayListView$a;-><init>(Landroid/graphics/drawable/BitmapDrawable;Landroid/graphics/Rect;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v5, v4, v8}, Landroidx/mediarouter/app/OverlayListView$a;->c(FF)Landroidx/mediarouter/app/OverlayListView$a;

    iget v4, v0, Lxg;->j0:I

    int-to-long v6, v4

    .line 34
    invoke-virtual {v5, v6, v7}, Landroidx/mediarouter/app/OverlayListView$a;->e(J)Landroidx/mediarouter/app/OverlayListView$a;

    iget-object v4, v0, Lxg;->k0:Landroid/view/animation/Interpolator;

    .line 35
    invoke-virtual {v5, v4}, Landroidx/mediarouter/app/OverlayListView$a;->f(Landroid/view/animation/Interpolator;)Landroidx/mediarouter/app/OverlayListView$a;

    goto :goto_3

    .line 36
    :cond_5
    iget v7, v0, Lxg;->O:I

    mul-int/2addr v7, v2

    .line 37
    new-instance v9, Landroidx/mediarouter/app/OverlayListView$a;

    invoke-direct {v9, v4, v6}, Landroidx/mediarouter/app/OverlayListView$a;-><init>(Landroid/graphics/drawable/BitmapDrawable;Landroid/graphics/Rect;)V

    invoke-virtual {v9, v7}, Landroidx/mediarouter/app/OverlayListView$a;->g(I)Landroidx/mediarouter/app/OverlayListView$a;

    iget v4, v0, Lxg;->h0:I

    int-to-long v6, v4

    .line 38
    invoke-virtual {v9, v6, v7}, Landroidx/mediarouter/app/OverlayListView$a;->e(J)Landroidx/mediarouter/app/OverlayListView$a;

    iget-object v4, v0, Lxg;->k0:Landroid/view/animation/Interpolator;

    .line 39
    invoke-virtual {v9, v4}, Landroidx/mediarouter/app/OverlayListView$a;->f(Landroid/view/animation/Interpolator;)Landroidx/mediarouter/app/OverlayListView$a;

    new-instance v4, Lxg$a;

    invoke-direct {v4, v0, v5}, Lxg$a;-><init>(Lxg;Lyh$i;)V

    .line 40
    invoke-virtual {v9, v4}, Landroidx/mediarouter/app/OverlayListView$a;->d(Landroidx/mediarouter/app/OverlayListView$a$a;)Landroidx/mediarouter/app/OverlayListView$a;

    .line 41
    iget-object v4, v0, Lxg;->J:Ljava/util/Set;

    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object v5, v9

    .line 42
    :goto_3
    iget-object v4, v0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v4, v5}, Landroidx/mediarouter/app/OverlayListView;->a(Landroidx/mediarouter/app/OverlayListView$a;)V

    goto :goto_2

    :cond_6
    :goto_4
    return-void
.end method

.method public final j(Landroid/view/View;I)V
    .locals 4

    .line 1
    invoke-static {p1}, Lxg;->r(Landroid/view/View;)I

    move-result v0

    .line 2
    new-instance v1, Lxg$j;

    invoke-direct {v1, p0, v0, p2, p1}, Lxg$j;-><init>(Lxg;IILandroid/view/View;)V

    .line 3
    iget p2, p0, Lxg;->h0:I

    int-to-long v2, p2

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 4
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-lt p2, v0, :cond_0

    .line 5
    iget-object p2, p0, Lxg;->k0:Landroid/view/animation/Interpolator;

    invoke-virtual {v1, p2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 6
    :cond_0
    invoke-virtual {p1, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lxg;->l:Landroid/view/View;

    if-nez v0, :cond_1

    iget-object v0, p0, Lxg;->V:Landroid/support/v4/media/MediaDescriptionCompat;

    if-nez v0, :cond_0

    iget-object v0, p0, Lxg;->U:Landroid/support/v4/media/session/PlaybackStateCompat;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    .line 2
    :goto_0
    iget-object v3, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v3}, Landroid/widget/ListView;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 3
    iget-object v3, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v3, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    add-int v4, v0, v2

    .line 4
    iget-object v5, p0, Lxg;->F:Lxg$r;

    invoke-virtual {v5, v4}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lyh$i;

    if-eqz p1, :cond_0

    .line 5
    iget-object v5, p0, Lxg;->H:Ljava/util/Set;

    if-eqz v5, :cond_0

    .line 6
    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    .line 7
    :cond_0
    sget v4, Lng;->volume_item_container:I

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout;

    .line 8
    invoke-virtual {v4, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 9
    new-instance v4, Landroid/view/animation/AnimationSet;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 10
    new-instance v6, Landroid/view/animation/AlphaAnimation;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v6, v7, v7}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v7, 0x0

    .line 11
    invoke-virtual {v6, v7, v8}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 12
    invoke-virtual {v4, v6}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 13
    new-instance v6, Landroid/view/animation/TranslateAnimation;

    const/4 v9, 0x0

    invoke-direct {v6, v9, v9, v9, v9}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 14
    invoke-virtual {v6, v7, v8}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 15
    invoke-virtual {v4, v5}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    .line 16
    invoke-virtual {v4, v5}, Landroid/view/animation/AnimationSet;->setFillEnabled(Z)V

    .line 17
    invoke-virtual {v3}, Landroid/view/View;->clearAnimation()V

    .line 18
    invoke-virtual {v3, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 19
    :cond_1
    iget-object v0, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v0}, Landroidx/mediarouter/app/OverlayListView;->c()V

    if-nez p1, :cond_2

    .line 20
    invoke-virtual {p0, v1}, Lxg;->p(Z)V

    :cond_2
    return-void
.end method

.method public n()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lxg;->Z:Z

    const/4 v1, 0x0

    .line 2
    iput-object v1, p0, Lxg;->a0:Landroid/graphics/Bitmap;

    .line 3
    iput v0, p0, Lxg;->b0:I

    return-void
.end method

.method public final o()V
    .locals 8

    .line 1
    new-instance v0, Lxg$c;

    invoke-direct {v0, p0}, Lxg$c;-><init>(Lxg;)V

    .line 2
    iget-object v1, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    .line 3
    :goto_0
    iget-object v4, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v4}, Landroid/widget/ListView;->getChildCount()I

    move-result v4

    if-ge v2, v4, :cond_2

    .line 4
    iget-object v4, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v4, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    add-int v5, v1, v2

    .line 5
    iget-object v6, p0, Lxg;->F:Lxg$r;

    invoke-virtual {v6, v5}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lyh$i;

    .line 6
    iget-object v6, p0, Lxg;->H:Ljava/util/Set;

    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 7
    new-instance v5, Landroid/view/animation/AlphaAnimation;

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v5, v6, v7}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 8
    iget v6, p0, Lxg;->i0:I

    int-to-long v6, v6

    invoke-virtual {v5, v6, v7}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 v6, 0x1

    .line 9
    invoke-virtual {v5, v6}, Landroid/view/animation/Animation;->setFillEnabled(Z)V

    .line 10
    invoke-virtual {v5, v6}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    if-nez v3, :cond_0

    .line 11
    invoke-virtual {v5, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    move v3, v6

    .line 12
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->clearAnimation()V

    .line 13
    invoke-virtual {v4, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lxg;->j:Z

    .line 3
    iget-object v0, p0, Lxg;->e:Lyh;

    sget-object v1, Lxh;->c:Lxh;

    iget-object v2, p0, Lxg;->f:Lxg$p;

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Lyh;->b(Lxh;Lyh$b;I)V

    .line 4
    iget-object v0, p0, Lxg;->e:Lyh;

    invoke-virtual {v0}, Lyh;->h()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    invoke-virtual {p0, v0}, Lxg;->E(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Ly;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 3
    sget v0, Lqg;->mr_controller_material_dialog_b:I

    invoke-virtual {p0, v0}, Lc0;->setContentView(I)V

    const v0, 0x102001b

    .line 4
    invoke-virtual {p0, v0}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    new-instance v0, Lxg$m;

    invoke-direct {v0, p0}, Lxg$m;-><init>(Lxg;)V

    .line 6
    sget v2, Lng;->mr_expandable_area:I

    invoke-virtual {p0, v2}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    iput-object v2, p0, Lxg;->r:Landroid/widget/FrameLayout;

    .line 7
    new-instance v3, Lxg$e;

    invoke-direct {v3, p0}, Lxg$e;-><init>(Lxg;)V

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    sget v2, Lng;->mr_dialog_area:I

    invoke-virtual {p0, v2}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Lxg;->s:Landroid/widget/LinearLayout;

    .line 9
    new-instance v3, Lxg$f;

    invoke-direct {v3, p0}, Lxg$f;-><init>(Lxg;)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    iget-object v2, p0, Lxg;->h:Landroid/content/Context;

    invoke-static {v2}, Ldh;->d(Landroid/content/Context;)I

    move-result v2

    const v3, 0x102001a

    .line 11
    invoke-virtual {p0, v3}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lxg;->m:Landroid/widget/Button;

    .line 12
    sget v4, Lrg;->mr_controller_disconnect:I

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setText(I)V

    .line 13
    iget-object v3, p0, Lxg;->m:Landroid/widget/Button;

    invoke-virtual {v3, v2}, Landroid/widget/Button;->setTextColor(I)V

    .line 14
    iget-object v3, p0, Lxg;->m:Landroid/widget/Button;

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x1020019

    .line 15
    invoke-virtual {p0, v3}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lxg;->n:Landroid/widget/Button;

    .line 16
    sget v4, Lrg;->mr_controller_stop_casting:I

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setText(I)V

    .line 17
    iget-object v3, p0, Lxg;->n:Landroid/widget/Button;

    invoke-virtual {v3, v2}, Landroid/widget/Button;->setTextColor(I)V

    .line 18
    iget-object v2, p0, Lxg;->n:Landroid/widget/Button;

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    sget v2, Lng;->mr_name:I

    invoke-virtual {p0, v2}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lxg;->y:Landroid/widget/TextView;

    .line 20
    sget v2, Lng;->mr_close:I

    invoke-virtual {p0, v2}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageButton;

    iput-object v2, p0, Lxg;->p:Landroid/widget/ImageButton;

    .line 21
    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    sget v2, Lng;->mr_custom_control:I

    invoke-virtual {p0, v2}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    iput-object v2, p0, Lxg;->u:Landroid/widget/FrameLayout;

    .line 23
    sget v2, Lng;->mr_default_control:I

    invoke-virtual {p0, v2}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    iput-object v2, p0, Lxg;->t:Landroid/widget/FrameLayout;

    .line 24
    new-instance v2, Lxg$g;

    invoke-direct {v2, p0}, Lxg$g;-><init>(Lxg;)V

    .line 25
    sget v3, Lng;->mr_art:I

    invoke-virtual {p0, v3}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, p0, Lxg;->v:Landroid/widget/ImageView;

    .line 26
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    sget v3, Lng;->mr_control_title_container:I

    invoke-virtual {p0, v3}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    sget v2, Lng;->mr_media_main_control:I

    invoke-virtual {p0, v2}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Lxg;->A:Landroid/widget/LinearLayout;

    .line 29
    sget v2, Lng;->mr_control_divider:I

    invoke-virtual {p0, v2}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lxg;->D:Landroid/view/View;

    .line 30
    sget v2, Lng;->mr_playback_control:I

    invoke-virtual {p0, v2}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    iput-object v2, p0, Lxg;->B:Landroid/widget/RelativeLayout;

    .line 31
    sget v2, Lng;->mr_control_title:I

    invoke-virtual {p0, v2}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lxg;->w:Landroid/widget/TextView;

    .line 32
    sget v2, Lng;->mr_control_subtitle:I

    invoke-virtual {p0, v2}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lxg;->x:Landroid/widget/TextView;

    .line 33
    sget v2, Lng;->mr_control_playback_ctrl:I

    invoke-virtual {p0, v2}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageButton;

    iput-object v2, p0, Lxg;->o:Landroid/widget/ImageButton;

    .line 34
    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    sget v0, Lng;->mr_volume_control:I

    invoke-virtual {p0, v0}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lxg;->C:Landroid/widget/LinearLayout;

    .line 36
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 37
    sget v0, Lng;->mr_volume_slider:I

    invoke-virtual {p0, v0}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lxg;->K:Landroid/widget/SeekBar;

    .line 38
    iget-object v1, p0, Lxg;->g:Lyh$i;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setTag(Ljava/lang/Object;)V

    .line 39
    new-instance v0, Lxg$q;

    invoke-direct {v0, p0}, Lxg$q;-><init>(Lxg;)V

    iput-object v0, p0, Lxg;->L:Lxg$q;

    .line 40
    iget-object v1, p0, Lxg;->K:Landroid/widget/SeekBar;

    invoke-virtual {v1, v0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 41
    sget v0, Lng;->mr_volume_group_list:I

    invoke-virtual {p0, v0}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/mediarouter/app/OverlayListView;

    iput-object v0, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxg;->G:Ljava/util/List;

    .line 43
    new-instance v0, Lxg$r;

    iget-object v1, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lxg;->G:Ljava/util/List;

    invoke-direct {v0, p0, v1, v2}, Lxg$r;-><init>(Lxg;Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lxg;->F:Lxg$r;

    .line 44
    iget-object v1, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 45
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lxg;->J:Ljava/util/Set;

    .line 46
    iget-object v0, p0, Lxg;->h:Landroid/content/Context;

    iget-object v1, p0, Lxg;->A:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    iget-object v3, p0, Lxg;->g:Lyh$i;

    .line 47
    invoke-virtual {v3}, Lyh$i;->x()Z

    move-result v3

    .line 48
    invoke-static {v0, v1, v2, v3}, Ldh;->u(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Z)V

    .line 49
    iget-object v0, p0, Lxg;->h:Landroid/content/Context;

    iget-object v1, p0, Lxg;->K:Landroid/widget/SeekBar;

    check-cast v1, Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    iget-object v2, p0, Lxg;->A:Landroid/widget/LinearLayout;

    invoke-static {v0, v1, v2}, Ldh;->w(Landroid/content/Context;Landroidx/mediarouter/app/MediaRouteVolumeSlider;Landroid/view/View;)V

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxg;->R:Ljava/util/Map;

    .line 51
    iget-object v1, p0, Lxg;->g:Lyh$i;

    iget-object v2, p0, Lxg;->K:Landroid/widget/SeekBar;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget v0, Lng;->mr_group_expand_collapse:I

    .line 53
    invoke-virtual {p0, v0}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    iput-object v0, p0, Lxg;->q:Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    .line 54
    new-instance v1, Lxg$h;

    invoke-direct {v1, p0}, Lxg$h;-><init>(Lxg;)V

    invoke-virtual {v0, v1}, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    invoke-virtual {p0}, Lxg;->A()V

    .line 56
    iget-object v0, p0, Lxg;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Log;->mr_controller_volume_group_list_animation_duration_ms:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lxg;->h0:I

    .line 57
    iget-object v0, p0, Lxg;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Log;->mr_controller_volume_group_list_fade_in_duration_ms:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lxg;->i0:I

    .line 58
    iget-object v0, p0, Lxg;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Log;->mr_controller_volume_group_list_fade_out_duration_ms:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lxg;->j0:I

    .line 59
    invoke-virtual {p0, p1}, Lxg;->B(Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lxg;->l:Landroid/view/View;

    if-eqz p1, :cond_0

    .line 60
    iget-object v0, p0, Lxg;->u:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 61
    iget-object p1, p0, Lxg;->u:Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    :cond_0
    const/4 p1, 0x1

    .line 62
    iput-boolean p1, p0, Lxg;->i:Z

    .line 63
    invoke-virtual {p0}, Lxg;->J()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxg;->e:Lyh;

    iget-object v1, p0, Lxg;->f:Lxg$p;

    invoke-virtual {v0, v1}, Lyh;->o(Lyh$b;)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lxg;->E(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lxg;->j:Z

    .line 4
    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    const/16 v0, 0x19

    if-eq p1, v0, :cond_1

    const/16 v1, 0x18

    if-ne p1, v1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-super {p0, p1, p2}, Ly;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 2
    :cond_1
    :goto_0
    iget-object p2, p0, Lxg;->g:Lyh$i;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_2

    const/4 p1, -0x1

    goto :goto_1

    :cond_2
    move p1, v1

    :goto_1
    invoke-virtual {p2, p1}, Lyh$i;->G(I)V

    return v1
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/16 v0, 0x19

    if-eq p1, v0, :cond_1

    const/16 v0, 0x18

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-super {p0, p1, p2}, Ly;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public p(Z)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lxg;->H:Ljava/util/Set;

    .line 2
    iput-object v0, p0, Lxg;->I:Ljava/util/Set;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lxg;->f0:Z

    .line 4
    iget-boolean v1, p0, Lxg;->g0:Z

    if-eqz v1, :cond_0

    .line 5
    iput-boolean v0, p0, Lxg;->g0:Z

    .line 6
    invoke-virtual {p0, p1}, Lxg;->K(Z)V

    .line 7
    :cond_0
    iget-object p1, p0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setEnabled(Z)V

    return-void
.end method

.method public q(II)I
    .locals 2

    const/high16 v0, 0x3f000000    # 0.5f

    if-lt p1, p2, :cond_0

    .line 1
    iget v1, p0, Lxg;->k:I

    int-to-float v1, v1

    int-to-float p2, p2

    mul-float/2addr v1, p2

    int-to-float p1, p1

    div-float/2addr v1, p1

    add-float/2addr v1, v0

    float-to-int p1, v1

    return p1

    .line 2
    :cond_0
    iget p1, p0, Lxg;->k:I

    int-to-float p1, p1

    const/high16 p2, 0x41100000    # 9.0f

    mul-float/2addr p1, p2

    const/high16 p2, 0x41800000    # 16.0f

    div-float/2addr p1, p2

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public final s(Z)I
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 1
    iget-object v1, p0, Lxg;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    if-nez v1, :cond_3

    .line 2
    :cond_0
    iget-object v1, p0, Lxg;->A:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getPaddingTop()I

    move-result v1

    iget-object v2, p0, Lxg;->A:Landroid/widget/LinearLayout;

    .line 3
    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    if-eqz p1, :cond_1

    .line 4
    iget-object v1, p0, Lxg;->B:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v0, v1

    .line 5
    :cond_1
    iget-object v1, p0, Lxg;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    if-nez v1, :cond_2

    .line 6
    iget-object v1, p0, Lxg;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    if-eqz p1, :cond_3

    .line 7
    iget-object p1, p0, Lxg;->C:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result p1

    if-nez p1, :cond_3

    .line 8
    iget-object p1, p0, Lxg;->D:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    add-int/2addr v0, p1

    :cond_3
    return v0
.end method

.method public final v()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lxg;->V:Landroid/support/v4/media/MediaDescriptionCompat;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->getIconBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2
    :goto_0
    iget-object v2, p0, Lxg;->V:Landroid/support/v4/media/MediaDescriptionCompat;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroid/support/v4/media/MediaDescriptionCompat;->getIconUri()Landroid/net/Uri;

    move-result-object v1

    .line 3
    :goto_1
    iget-object v2, p0, Lxg;->W:Lxg$n;

    if-nez v2, :cond_2

    iget-object v2, p0, Lxg;->X:Landroid/graphics/Bitmap;

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lxg$n;->b()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 4
    :goto_2
    iget-object v3, p0, Lxg;->W:Lxg$n;

    if-nez v3, :cond_3

    iget-object v3, p0, Lxg;->Y:Landroid/net/Uri;

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lxg$n;->c()Landroid/net/Uri;

    move-result-object v3

    :goto_3
    const/4 v4, 0x1

    if-eq v2, v0, :cond_4

    return v4

    :cond_4
    if-nez v2, :cond_5

    .line 5
    invoke-static {v3, v1}, Lxg;->Q(Landroid/net/Uri;Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_5

    return v4

    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public w()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lxg;->U:Landroid/support/v4/media/session/PlaybackStateCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->getActions()J

    move-result-wide v0

    const-wide/16 v2, 0x202

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public x()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lxg;->U:Landroid/support/v4/media/session/PlaybackStateCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->getActions()J

    move-result-wide v0

    const-wide/16 v2, 0x204

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public y()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lxg;->U:Landroid/support/v4/media/session/PlaybackStateCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->getActions()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public z(Lyh$i;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxg;->z:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lyh$i;->s()I

    move-result p1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
