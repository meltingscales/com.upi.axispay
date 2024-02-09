.class public Lch;
.super Lc0;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lch$i;,
        Lch$d;,
        Lch$e;,
        Lch$g;,
        Lch$h;,
        Lch$f;,
        Lch$j;
    }
.end annotation


# static fields
.field public static final R:Z


# instance fields
.field public A:Landroid/widget/ImageButton;

.field public B:Landroid/widget/Button;

.field public C:Landroid/widget/ImageView;

.field public D:Landroid/view/View;

.field public E:Landroid/widget/ImageView;

.field public F:Landroid/widget/TextView;

.field public G:Landroid/widget/TextView;

.field public H:Ljava/lang/String;

.field public I:Landroid/support/v4/media/session/MediaControllerCompat;

.field public J:Lch$e;

.field public K:Landroid/support/v4/media/MediaDescriptionCompat;

.field public L:Lch$d;

.field public M:Landroid/graphics/Bitmap;

.field public N:Landroid/net/Uri;

.field public O:Z

.field public P:Landroid/graphics/Bitmap;

.field public Q:I

.field public final d:Lyh;

.field public final e:Lch$g;

.field public f:Lxh;

.field public g:Lyh$i;

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lyh$i;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lyh$i;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lyh$i;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lyh$i;",
            ">;"
        }
    .end annotation
.end field

.field public l:Landroid/content/Context;

.field public m:Z

.field public n:Z

.field public o:J

.field public final p:Landroid/os/Handler;

.field public q:Landroidx/recyclerview/widget/RecyclerView;

.field public r:Lch$h;

.field public s:Lch$j;

.field public t:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lch$f;",
            ">;"
        }
    .end annotation
.end field

.field public u:Lyh$i;

.field public v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const v0, 0xbe1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lch;->R:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lch;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {p1, p2, v0}, Ldh;->b(Landroid/content/Context;IZ)Landroid/content/Context;

    move-result-object p1

    .line 3
    invoke-static {p1}, Ldh;->c(Landroid/content/Context;)I

    move-result p2

    .line 4
    invoke-direct {p0, p1, p2}, Lc0;-><init>(Landroid/content/Context;I)V

    .line 5
    sget-object p1, Lxh;->c:Lxh;

    iput-object p1, p0, Lch;->f:Lxh;

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lch;->h:Ljava/util/List;

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lch;->i:Ljava/util/List;

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lch;->j:Ljava/util/List;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lch;->k:Ljava/util/List;

    .line 10
    new-instance p1, Lch$a;

    invoke-direct {p1, p0}, Lch$a;-><init>(Lch;)V

    iput-object p1, p0, Lch;->p:Landroid/os/Handler;

    .line 11
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lch;->l:Landroid/content/Context;

    .line 12
    invoke-static {p1}, Lyh;->g(Landroid/content/Context;)Lyh;

    move-result-object p1

    iput-object p1, p0, Lch;->d:Lyh;

    .line 13
    new-instance p2, Lch$g;

    invoke-direct {p2, p0}, Lch$g;-><init>(Lch;)V

    iput-object p2, p0, Lch;->e:Lch$g;

    .line 14
    invoke-virtual {p1}, Lyh;->k()Lyh$i;

    move-result-object p2

    iput-object p2, p0, Lch;->g:Lyh$i;

    .line 15
    new-instance p2, Lch$e;

    invoke-direct {p2, p0}, Lch$e;-><init>(Lch;)V

    iput-object p2, p0, Lch;->J:Lch$e;

    .line 16
    invoke-virtual {p1}, Lyh;->h()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object p1

    invoke-virtual {p0, p1}, Lch;->o(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    return-void
.end method

.method public static e(Landroid/graphics/Bitmap;FLandroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    invoke-static {p2}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    move-result-object p2

    .line 2
    invoke-static {p2, p0}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object v1

    invoke-static {p2, v1}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    move-result-object v1

    .line 4
    invoke-static {p2}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v2

    invoke-static {p2, v2}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    move-result-object v2

    .line 5
    invoke-virtual {v2, p1}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 6
    invoke-virtual {v2, v0}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    .line 7
    invoke-virtual {v2, v1}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    .line 8
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p1

    const/4 v3, 0x1

    invoke-virtual {p0, p1, v3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 9
    invoke-virtual {v1, p0}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V

    .line 10
    invoke-virtual {v0}, Landroid/renderscript/Allocation;->destroy()V

    .line 11
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    .line 12
    invoke-virtual {v2}, Landroid/renderscript/ScriptIntrinsicBlur;->destroy()V

    .line 13
    invoke-virtual {p2}, Landroid/renderscript/RenderScript;->destroy()V

    return-object p0
.end method

.method public static h(Landroid/graphics/Bitmap;)Z
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

.method public static n(Landroid/view/View;I)V
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


# virtual methods
.method public f()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lch;->O:Z

    const/4 v1, 0x0

    .line 2
    iput-object v1, p0, Lch;->P:Landroid/graphics/Bitmap;

    .line 3
    iput v0, p0, Lch;->Q:I

    return-void
.end method

.method public g()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lyh$i;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v1, p0, Lch;->g:Lyh$i;

    invoke-virtual {v1}, Lyh$i;->p()Lyh$h;

    move-result-object v1

    invoke-virtual {v1}, Lyh$h;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyh$i;

    .line 3
    iget-object v3, p0, Lch;->g:Lyh$i;

    .line 4
    invoke-virtual {v3, v2}, Lyh$i;->h(Lyh$i;)Lyh$i$a;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 5
    invoke-virtual {v3}, Lyh$i$a;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 6
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public j(Lyh$i;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lyh$i;->v()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lyh$i;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lch;->f:Lxh;

    .line 2
    invoke-virtual {p1, v0}, Lyh$i;->D(Lxh;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lch;->g:Lyh$i;

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public k(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lyh$i;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 2
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyh$i;

    invoke-virtual {p0, v1}, Lch;->j(Lyh$i;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public m()V
    .locals 4

    .line 1
    iget-object v0, p0, Lch;->K:Landroid/support/v4/media/MediaDescriptionCompat;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->getIconBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2
    :goto_0
    iget-object v2, p0, Lch;->K:Landroid/support/v4/media/MediaDescriptionCompat;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroid/support/v4/media/MediaDescriptionCompat;->getIconUri()Landroid/net/Uri;

    move-result-object v1

    .line 3
    :goto_1
    iget-object v2, p0, Lch;->L:Lch$d;

    if-nez v2, :cond_2

    iget-object v2, p0, Lch;->M:Landroid/graphics/Bitmap;

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lch$d;->b()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 4
    :goto_2
    iget-object v3, p0, Lch;->L:Lch$d;

    if-nez v3, :cond_3

    iget-object v3, p0, Lch;->N:Landroid/net/Uri;

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lch$d;->c()Landroid/net/Uri;

    move-result-object v3

    :goto_3
    if-ne v2, v0, :cond_5

    if-nez v2, :cond_4

    .line 5
    invoke-static {v3, v1}, Lya;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    return-void

    .line 6
    :cond_5
    iget-object v0, p0, Lch;->L:Lch$d;

    if-eqz v0, :cond_6

    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 8
    :cond_6
    new-instance v0, Lch$d;

    invoke-direct {v0, p0}, Lch$d;-><init>(Lch;)V

    iput-object v0, p0, Lch;->L:Lch$d;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public final o(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lch;->I:Landroid/support/v4/media/session/MediaControllerCompat;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v2, p0, Lch;->J:Lch$e;

    invoke-virtual {v0, v2}, Landroid/support/v4/media/session/MediaControllerCompat;->unregisterCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V

    .line 3
    iput-object v1, p0, Lch;->I:Landroid/support/v4/media/session/MediaControllerCompat;

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 4
    :cond_1
    iget-boolean v0, p0, Lch;->n:Z

    if-nez v0, :cond_2

    return-void

    .line 5
    :cond_2
    new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat;

    iget-object v2, p0, Lch;->l:Landroid/content/Context;

    invoke-direct {v0, v2, p1}, Landroid/support/v4/media/session/MediaControllerCompat;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    iput-object v0, p0, Lch;->I:Landroid/support/v4/media/session/MediaControllerCompat;

    .line 6
    iget-object p1, p0, Lch;->J:Lch$e;

    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompat;->registerCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V

    .line 7
    iget-object p1, p0, Lch;->I:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getMetadata()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 8
    :cond_3
    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat;->getDescription()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v1

    :goto_0
    iput-object v1, p0, Lch;->K:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 9
    invoke-virtual {p0}, Lch;->m()V

    .line 10
    invoke-virtual {p0}, Lch;->s()V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lch;->n:Z

    .line 3
    iget-object v1, p0, Lch;->d:Lyh;

    iget-object v2, p0, Lch;->f:Lxh;

    iget-object v3, p0, Lch;->e:Lch$g;

    invoke-virtual {v1, v2, v3, v0}, Lyh;->b(Lxh;Lyh$b;I)V

    .line 4
    invoke-virtual {p0}, Lch;->t()V

    .line 5
    iget-object v0, p0, Lch;->d:Lyh;

    invoke-virtual {v0}, Lyh;->h()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    invoke-virtual {p0, v0}, Lch;->o(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lc0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    sget p1, Lqg;->mr_cast_dialog:I

    invoke-virtual {p0, p1}, Lc0;->setContentView(I)V

    .line 3
    iget-object p1, p0, Lch;->l:Landroid/content/Context;

    invoke-static {p1, p0}, Ldh;->s(Landroid/content/Context;Landroid/app/Dialog;)V

    .line 4
    sget p1, Lng;->mr_cast_close_button:I

    invoke-virtual {p0, p1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lch;->A:Landroid/widget/ImageButton;

    const/4 v0, -0x1

    .line 5
    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setColorFilter(I)V

    .line 6
    iget-object p1, p0, Lch;->A:Landroid/widget/ImageButton;

    new-instance v1, Lch$b;

    invoke-direct {v1, p0}, Lch$b;-><init>(Lch;)V

    invoke-virtual {p1, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    sget p1, Lng;->mr_cast_stop_button:I

    invoke-virtual {p0, p1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lch;->B:Landroid/widget/Button;

    .line 8
    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(I)V

    .line 9
    iget-object p1, p0, Lch;->B:Landroid/widget/Button;

    new-instance v1, Lch$c;

    invoke-direct {v1, p0}, Lch$c;-><init>(Lch;)V

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    new-instance p1, Lch$h;

    invoke-direct {p1, p0}, Lch$h;-><init>(Lch;)V

    iput-object p1, p0, Lch;->r:Lch$h;

    .line 11
    sget p1, Lng;->mr_cast_list:I

    invoke-virtual {p0, p1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lch;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    iget-object v1, p0, Lch;->r:Lch$h;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 13
    iget-object p1, p0, Lch;->q:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Lch;->l:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 14
    new-instance p1, Lch$j;

    invoke-direct {p1, p0}, Lch$j;-><init>(Lch;)V

    iput-object p1, p0, Lch;->s:Lch$j;

    .line 15
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lch;->t:Ljava/util/Map;

    .line 16
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lch;->v:Ljava/util/Map;

    .line 17
    sget p1, Lng;->mr_cast_meta_background:I

    invoke-virtual {p0, p1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lch;->C:Landroid/widget/ImageView;

    .line 18
    sget p1, Lng;->mr_cast_meta_black_scrim:I

    invoke-virtual {p0, p1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lch;->D:Landroid/view/View;

    .line 19
    sget p1, Lng;->mr_cast_meta_art:I

    invoke-virtual {p0, p1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lch;->E:Landroid/widget/ImageView;

    .line 20
    sget p1, Lng;->mr_cast_meta_title:I

    invoke-virtual {p0, p1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lch;->F:Landroid/widget/TextView;

    .line 21
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 22
    sget p1, Lng;->mr_cast_meta_subtitle:I

    invoke-virtual {p0, p1}, Lc0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lch;->G:Landroid/widget/TextView;

    .line 23
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 24
    iget-object p1, p0, Lch;->l:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 25
    sget v0, Lrg;->mr_cast_dialog_title_view_placeholder:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lch;->H:Ljava/lang/String;

    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Lch;->m:Z

    .line 27
    invoke-virtual {p0}, Lch;->r()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lch;->n:Z

    .line 3
    iget-object v0, p0, Lch;->d:Lyh;

    iget-object v1, p0, Lch;->e:Lch$g;

    invoke-virtual {v0, v1}, Lyh;->o(Lyh$b;)V

    .line 4
    iget-object v0, p0, Lch;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0, v1}, Lch;->o(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    return-void
.end method

.method public p(Lxh;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lch;->f:Lxh;

    invoke-virtual {v0, p1}, Lxh;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iput-object p1, p0, Lch;->f:Lxh;

    .line 3
    iget-boolean v0, p0, Lch;->n:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lch;->d:Lyh;

    iget-object v1, p0, Lch;->e:Lch$g;

    invoke-virtual {v0, v1}, Lyh;->o(Lyh$b;)V

    .line 5
    iget-object v0, p0, Lch;->d:Lyh;

    iget-object v1, p0, Lch;->e:Lch$g;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Lyh;->b(Lxh;Lyh$b;I)V

    .line 6
    invoke-virtual {p0}, Lch;->t()V

    :cond_0
    return-void

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0xbe2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lch;->u:Lyh$i;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lch;->w:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lch;->x:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-boolean v0, p0, Lch;->m:Z

    xor-int/2addr v0, v1

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public r()V
    .locals 3

    .line 1
    iget-object v0, p0, Lch;->l:Landroid/content/Context;

    invoke-static {v0}, Lah;->c(Landroid/content/Context;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lch;->l:Landroid/content/Context;

    invoke-static {v1}, Lah;->a(Landroid/content/Context;)I

    move-result v1

    .line 3
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Landroid/view/Window;->setLayout(II)V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lch;->M:Landroid/graphics/Bitmap;

    .line 5
    iput-object v0, p0, Lch;->N:Landroid/net/Uri;

    .line 6
    invoke-virtual {p0}, Lch;->m()V

    .line 7
    invoke-virtual {p0}, Lch;->s()V

    .line 8
    invoke-virtual {p0}, Lch;->v()V

    return-void
.end method

.method public s()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lch;->q()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    iput-boolean v1, p0, Lch;->z:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lch;->z:Z

    .line 4
    iget-object v2, p0, Lch;->g:Lyh$i;

    invoke-virtual {v2}, Lyh$i;->B()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lch;->g:Lyh$i;

    invoke-virtual {v2}, Lyh$i;->v()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 5
    :cond_1
    invoke-virtual {p0}, Lc0;->dismiss()V

    .line 6
    :cond_2
    iget-boolean v2, p0, Lch;->O:Z

    const/4 v3, 0x0

    const/16 v4, 0x8

    if-eqz v2, :cond_4

    iget-object v2, p0, Lch;->P:Landroid/graphics/Bitmap;

    invoke-static {v2}, Lch;->h(Landroid/graphics/Bitmap;)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lch;->P:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_4

    .line 7
    iget-object v2, p0, Lch;->E:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8
    iget-object v2, p0, Lch;->E:Landroid/widget/ImageView;

    iget-object v5, p0, Lch;->P:Landroid/graphics/Bitmap;

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 9
    iget-object v2, p0, Lch;->E:Landroid/widget/ImageView;

    iget v5, p0, Lch;->Q:I

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 10
    iget-object v2, p0, Lch;->D:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 11
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x11

    if-lt v2, v5, :cond_3

    .line 12
    iget-object v2, p0, Lch;->P:Landroid/graphics/Bitmap;

    const/high16 v5, 0x41200000    # 10.0f

    iget-object v6, p0, Lch;->l:Landroid/content/Context;

    invoke-static {v2, v5, v6}, Lch;->e(Landroid/graphics/Bitmap;FLandroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 13
    iget-object v5, p0, Lch;->C:Landroid/widget/ImageView;

    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 14
    :cond_3
    iget-object v2, p0, Lch;->C:Landroid/widget/ImageView;

    iget-object v5, p0, Lch;->P:Landroid/graphics/Bitmap;

    invoke-static {v5}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 15
    :cond_4
    iget-object v2, p0, Lch;->P:Landroid/graphics/Bitmap;

    invoke-static {v2}, Lch;->h(Landroid/graphics/Bitmap;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v5, 0xbe3

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lch;->P:Landroid/graphics/Bitmap;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const v5, 0xbe4

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    :cond_5
    iget-object v2, p0, Lch;->E:Landroid/widget/ImageView;

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 18
    iget-object v2, p0, Lch;->D:Landroid/view/View;

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 19
    iget-object v2, p0, Lch;->C:Landroid/widget/ImageView;

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 20
    :goto_0
    invoke-virtual {p0}, Lch;->f()V

    .line 21
    iget-object v2, p0, Lch;->K:Landroid/support/v4/media/MediaDescriptionCompat;

    if-nez v2, :cond_6

    move-object v2, v3

    goto :goto_1

    :cond_6
    invoke-virtual {v2}, Landroid/support/v4/media/MediaDescriptionCompat;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    .line 22
    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    xor-int/2addr v5, v1

    .line 23
    iget-object v6, p0, Lch;->K:Landroid/support/v4/media/MediaDescriptionCompat;

    if-nez v6, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {v6}, Landroid/support/v4/media/MediaDescriptionCompat;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v3

    .line 24
    :goto_2
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    xor-int/2addr v1, v6

    if-eqz v5, :cond_8

    .line 25
    iget-object v5, p0, Lch;->F:Landroid/widget/TextView;

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 26
    :cond_8
    iget-object v2, p0, Lch;->F:Landroid/widget/TextView;

    iget-object v5, p0, Lch;->H:Ljava/lang/String;

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    if-eqz v1, :cond_9

    .line 27
    iget-object v1, p0, Lch;->G:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    iget-object v1, p0, Lch;->G:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4

    .line 29
    :cond_9
    iget-object v0, p0, Lch;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_4
    return-void
.end method

.method public t()V
    .locals 4

    .line 1
    iget-object v0, p0, Lch;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    iget-object v0, p0, Lch;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    iget-object v0, p0, Lch;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    iget-object v0, p0, Lch;->h:Ljava/util/List;

    iget-object v1, p0, Lch;->g:Lyh$i;

    invoke-virtual {v1}, Lyh$i;->k()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    iget-object v0, p0, Lch;->g:Lyh$i;

    invoke-virtual {v0}, Lyh$i;->p()Lyh$h;

    move-result-object v0

    invoke-virtual {v0}, Lyh$h;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyh$i;

    .line 6
    iget-object v2, p0, Lch;->g:Lyh$i;

    .line 7
    invoke-virtual {v2, v1}, Lyh$i;->h(Lyh$i;)Lyh$i$a;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v2}, Lyh$i$a;->b()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 9
    iget-object v3, p0, Lch;->i:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    :cond_2
    invoke-virtual {v2}, Lyh$i$a;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 11
    iget-object v2, p0, Lch;->j:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_3
    iget-object v0, p0, Lch;->i:Ljava/util/List;

    invoke-virtual {p0, v0}, Lch;->k(Ljava/util/List;)V

    .line 13
    iget-object v0, p0, Lch;->j:Ljava/util/List;

    invoke-virtual {p0, v0}, Lch;->k(Ljava/util/List;)V

    .line 14
    iget-object v0, p0, Lch;->h:Ljava/util/List;

    sget-object v1, Lch$i;->b:Lch$i;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 15
    iget-object v0, p0, Lch;->i:Ljava/util/List;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 16
    iget-object v0, p0, Lch;->j:Ljava/util/List;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 17
    iget-object v0, p0, Lch;->r:Lch$h;

    invoke-virtual {v0}, Lch$h;->D()V

    return-void
.end method

.method public v()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lch;->n:Z

    if-eqz v0, :cond_4

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lch;->o:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-ltz v0, :cond_3

    .line 3
    invoke-virtual {p0}, Lch;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iput-boolean v1, p0, Lch;->y:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lch;->y:Z

    .line 6
    iget-object v0, p0, Lch;->g:Lyh$i;

    invoke-virtual {v0}, Lyh$i;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lch;->g:Lyh$i;

    invoke-virtual {v0}, Lyh$i;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    :cond_1
    invoke-virtual {p0}, Lc0;->dismiss()V

    .line 8
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lch;->o:J

    .line 9
    iget-object v0, p0, Lch;->r:Lch$h;

    invoke-virtual {v0}, Lch$h;->C()V

    goto :goto_0

    .line 10
    :cond_3
    iget-object v0, p0, Lch;->p:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 11
    iget-object v0, p0, Lch;->p:Landroid/os/Handler;

    iget-wide v4, p0, Lch;->o:J

    add-long/2addr v4, v2

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    :cond_4
    :goto_0
    return-void
.end method

.method public w()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lch;->y:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lch;->v()V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lch;->z:Z

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lch;->s()V

    :cond_1
    return-void
.end method
