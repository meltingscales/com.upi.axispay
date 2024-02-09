.class public Lug;
.super Landroid/view/View;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug$a;,
        Lug$c;,
        Lug$b;
    }
.end annotation


# static fields
.field public static r:Lug$a;

.field public static final s:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;"
        }
    .end annotation
.end field

.field public static final t:[I

.field public static final u:[I


# instance fields
.field public final b:Lyh;

.field public final c:Lug$b;

.field public d:Lxh;

.field public e:Lzg;

.field public f:Z

.field public g:I

.field public h:Lug$c;

.field public i:Landroid/graphics/drawable/Drawable;

.field public j:I

.field public k:I

.field public l:I

.field public m:Landroid/content/res/ColorStateList;

.field public n:I

.field public o:I

.field public p:Z

.field public q:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroid/util/SparseArray;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    sput-object v0, Lug;->s:Landroid/util/SparseArray;

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, 0x10100a0

    const/4 v3, 0x0

    aput v2, v1, v3

    .line 2
    sput-object v1, Lug;->t:[I

    new-array v0, v0, [I

    const v1, 0x101009f

    aput v1, v0, v3

    .line 3
    sput-object v0, Lug;->u:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lug;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lig;->mediaRouteButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Lug;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .line 3
    invoke-static {p1}, Ldh;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    sget-object p1, Lxh;->c:Lxh;

    iput-object p1, p0, Lug;->d:Lxh;

    .line 5
    invoke-static {}, Lzg;->a()Lzg;

    move-result-object p1

    iput-object p1, p0, Lug;->e:Lzg;

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lug;->g:I

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    .line 8
    sget-object v2, Ltg;->MediaRouteButton:[I

    invoke-virtual {v7, p2, v2, p3, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v8

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, v7

    move-object v3, p2

    move-object v4, v8

    move v5, p3

    .line 9
    invoke-static/range {v0 .. v6}, Lac;->o0(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 11
    iput-object p2, p0, Lug;->b:Lyh;

    .line 12
    iput-object p2, p0, Lug;->c:Lug$b;

    .line 13
    sget p2, Ltg;->MediaRouteButton_externalRouteEnabledDrawableStatic:I

    invoke-virtual {v8, p2, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    return-void

    .line 15
    :cond_0
    invoke-static {v7}, Lyh;->g(Landroid/content/Context;)Lyh;

    move-result-object p2

    iput-object p2, p0, Lug;->b:Lyh;

    .line 16
    new-instance p3, Lug$b;

    invoke-direct {p3, p0}, Lug$b;-><init>(Lug;)V

    iput-object p3, p0, Lug;->c:Lug$b;

    .line 17
    invoke-virtual {p2}, Lyh;->k()Lyh$i;

    move-result-object p2

    .line 18
    invoke-virtual {p2}, Lyh$i;->v()Z

    move-result p3

    const/4 v0, 0x1

    xor-int/2addr p3, v0

    if-eqz p3, :cond_1

    .line 19
    invoke-virtual {p2}, Lyh$i;->c()I

    move-result p2

    goto :goto_0

    :cond_1
    move p2, p1

    :goto_0
    iput p2, p0, Lug;->l:I

    iput p2, p0, Lug;->k:I

    .line 20
    sget-object p2, Lug;->r:Lug$a;

    if-nez p2, :cond_2

    .line 21
    new-instance p2, Lug$a;

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Lug$a;-><init>(Landroid/content/Context;)V

    sput-object p2, Lug;->r:Lug$a;

    .line 22
    :cond_2
    sget p2, Ltg;->MediaRouteButton_mediaRouteButtonTint:I

    invoke-virtual {v8, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    iput-object p2, p0, Lug;->m:Landroid/content/res/ColorStateList;

    .line 23
    sget p2, Ltg;->MediaRouteButton_android_minWidth:I

    invoke-virtual {v8, p2, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lug;->n:I

    .line 24
    sget p2, Ltg;->MediaRouteButton_android_minHeight:I

    invoke-virtual {v8, p2, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lug;->o:I

    .line 25
    sget p2, Ltg;->MediaRouteButton_externalRouteEnabledDrawableStatic:I

    invoke-virtual {v8, p2, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 26
    sget p3, Ltg;->MediaRouteButton_externalRouteEnabledDrawable:I

    invoke-virtual {v8, p3, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    iput p3, p0, Lug;->j:I

    .line 27
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    .line 28
    iget p3, p0, Lug;->j:I

    if-eqz p3, :cond_3

    .line 29
    sget-object v1, Lug;->s:Landroid/util/SparseArray;

    .line 30
    invoke-virtual {v1, p3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz p3, :cond_3

    .line 31
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p0, p3}, Lug;->setRemoteIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 32
    :cond_3
    iget-object p3, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    if-nez p3, :cond_6

    if-eqz p2, :cond_5

    .line 33
    sget-object p3, Lug;->s:Landroid/util/SparseArray;

    .line 34
    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz p3, :cond_4

    .line 35
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lug;->setRemoteIndicatorDrawableInternal(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 36
    :cond_4
    new-instance p3, Lug$c;

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p3, p0, p2, v1}, Lug$c;-><init>(Lug;ILandroid/content/Context;)V

    iput-object p3, p0, Lug;->h:Lug$c;

    .line 38
    sget-object p2, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array p1, p1, [Ljava/lang/Void;

    invoke-virtual {p3, p2, p1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    .line 39
    :cond_5
    invoke-virtual {p0}, Lug;->a()V

    .line 40
    :cond_6
    :goto_1
    invoke-virtual {p0}, Lug;->f()V

    .line 41
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method

.method private getActivity()Landroid/app/Activity;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    .line 3
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    .line 4
    check-cast v0, Landroid/app/Activity;

    return-object v0

    .line 5
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private getFragmentManager()Landroidx/fragment/app/FragmentManager;
    .locals 2

    .line 1
    invoke-direct {p0}, Lug;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lsd;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lsd;

    invoke-virtual {v0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget v0, p0, Lug;->j:I

    if-lez v0, :cond_1

    .line 2
    iget-object v0, p0, Lug;->h:Lug$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 4
    :cond_0
    new-instance v0, Lug$c;

    iget v2, p0, Lug;->j:I

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, p0, v2, v3}, Lug$c;-><init>(Lug;ILandroid/content/Context;)V

    iput-object v0, p0, Lug;->h:Lug$c;

    .line 6
    iput v1, p0, Lug;->j:I

    .line 7
    sget-object v2, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v2, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_1
    return-void
.end method

.method public b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lug;->b:Lyh;

    invoke-virtual {v0}, Lyh;->k()Lyh$i;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lyh$i;->v()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lyh$i;->c()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v3

    .line 4
    :goto_0
    iget v4, p0, Lug;->l:I

    if-eq v4, v0, :cond_1

    .line 5
    iput v0, p0, Lug;->l:I

    .line 6
    invoke-virtual {p0}, Lug;->f()V

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    :cond_1
    if-ne v0, v2, :cond_2

    .line 8
    invoke-virtual {p0}, Lug;->a()V

    .line 9
    :cond_2
    iget-boolean v0, p0, Lug;->f:Z

    if-eqz v0, :cond_5

    .line 10
    iget-boolean v0, p0, Lug;->p:Z

    if-nez v0, :cond_4

    if-nez v1, :cond_4

    iget-object v0, p0, Lug;->b:Lyh;

    iget-object v1, p0, Lug;->d:Lxh;

    invoke-virtual {v0, v1, v2}, Lyh;->m(Lxh;I)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    move v2, v3

    :cond_4
    :goto_1
    invoke-virtual {p0, v2}, Landroid/view/View;->setEnabled(Z)V

    :cond_5
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    iget v0, p0, Lug;->g:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lug;->p:Z

    if-nez v0, :cond_0

    sget-object v0, Lug;->r:Lug$a;

    invoke-virtual {v0}, Lug$a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    .line 2
    :cond_0
    iget v0, p0, Lug;->g:I

    .line 3
    :goto_0
    invoke-super {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_2
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lug;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, Lug;->b:Lyh;

    invoke-virtual {v0}, Lyh;->i()Lei;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lug;->e(I)Z

    move-result v0

    return v0

    .line 4
    :cond_1
    invoke-virtual {v0}, Lei;->b()Z

    const/4 v0, 0x0

    throw v0
.end method

.method public drawableStateChanged()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    iget-object v0, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    .line 4
    iget-object v1, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 5
    iget-object v0, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    .line 7
    iget v1, p0, Lug;->l:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    iget v3, p0, Lug;->k:I

    if-eq v3, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    if-ne v1, v3, :cond_2

    .line 8
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v1

    if-nez v1, :cond_2

    .line 9
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/AnimationDrawable;->selectDrawable(I)Z

    goto :goto_1

    .line 10
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v1

    if-nez v1, :cond_2

    .line 11
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 12
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    :cond_3
    iget v0, p0, Lug;->l:I

    iput v0, p0, Lug;->k:I

    return-void
.end method

.method public final e(I)Z
    .locals 7

    .line 1
    invoke-direct {p0}, Lug;->getFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 2
    iget-object v1, p0, Lug;->b:Lyh;

    invoke-virtual {v1}, Lyh;->k()Lyh$i;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lyh$i;->v()Z

    move-result v1

    const/4 v2, 0x0

    const v3, 0xf24

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    const v1, 0xf25

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v6

    if-eqz v6, :cond_0

    const p1, 0xf26

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    .line 6
    :cond_0
    iget-object v2, p0, Lug;->e:Lzg;

    .line 7
    invoke-virtual {v2}, Lzg;->b()Lwg;

    move-result-object v2

    .line 8
    iget-object v3, p0, Lug;->d:Lxh;

    invoke-virtual {v2, v3}, Lwg;->n(Lxh;)V

    if-ne p1, v4, :cond_1

    .line 9
    invoke-virtual {v2, v5}, Lwg;->o(Z)V

    .line 10
    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object p1

    .line 11
    invoke-virtual {p1, v2, v1}, Lje;->f(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lje;

    .line 12
    invoke-virtual {p1}, Lje;->k()I

    goto :goto_0

    :cond_2
    const v1, 0xf27

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v6

    if-eqz v6, :cond_3

    const p1, 0xf28

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    .line 15
    :cond_3
    iget-object v2, p0, Lug;->e:Lzg;

    .line 16
    invoke-virtual {v2}, Lzg;->c()Lyg;

    move-result-object v2

    .line 17
    iget-object v3, p0, Lug;->d:Lxh;

    invoke-virtual {v2, v3}, Lyg;->m(Lxh;)V

    if-ne p1, v4, :cond_4

    .line 18
    invoke-virtual {v2, v5}, Lyg;->n(Z)V

    .line 19
    :cond_4
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object p1

    .line 20
    invoke-virtual {p1, v2, v1}, Lje;->f(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lje;

    .line 21
    invoke-virtual {p1}, Lje;->k()I

    :goto_0
    return v5

    .line 22
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const v0, 0xf29

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()V
    .locals 2

    .line 1
    iget v0, p0, Lug;->l:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    sget v0, Lrg;->mr_cast_button_disconnected:I

    goto :goto_0

    .line 3
    :cond_0
    sget v0, Lrg;->mr_cast_button_connected:I

    goto :goto_0

    .line 4
    :cond_1
    sget v0, Lrg;->mr_cast_button_connecting:I

    .line 5
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 7
    iget-boolean v1, p0, Lug;->q:Z

    if-eqz v1, :cond_2

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 8
    :goto_1
    invoke-static {p0, v0}, Lq3;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public getDialogFactory()Lzg;
    .locals 1

    .line 1
    iget-object v0, p0, Lug;->e:Lzg;

    return-object v0
.end method

.method public getRouteSelector()Lxh;
    .locals 1

    .line 1
    iget-object v0, p0, Lug;->d:Lxh;

    return-object v0
.end method

.method public jumpDrawablesToCurrentState()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 2
    iget-object v0, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_0
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lug;->f:Z

    .line 4
    iget-object v0, p0, Lug;->d:Lxh;

    invoke-virtual {v0}, Lxh;->f()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lug;->b:Lyh;

    iget-object v1, p0, Lug;->d:Lxh;

    iget-object v2, p0, Lug;->c:Lug$b;

    invoke-virtual {v0, v1, v2}, Lyh;->a(Lxh;Lyh$b;)V

    .line 6
    :cond_1
    invoke-virtual {p0}, Lug;->b()V

    .line 7
    sget-object v0, Lug;->r:Lug$a;

    invoke-virtual {v0, p0}, Lug$a;->b(Lug;)V

    return-void
.end method

.method public onCreateDrawableState(I)[I
    .locals 2

    const/4 v0, 0x1

    add-int/2addr p1, v0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    move-result-object p1

    .line 2
    iget-object v1, p0, Lug;->b:Lyh;

    if-nez v1, :cond_0

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {v1}, Lyh;->i()Lei;

    move-result-object v1

    if-nez v1, :cond_3

    .line 4
    iget v1, p0, Lug;->l:I

    if-eq v1, v0, :cond_2

    const/4 v0, 0x2

    if-eq v1, v0, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    sget-object v0, Lug;->t:[I

    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    goto :goto_0

    .line 6
    :cond_2
    sget-object v0, Lug;->u:[I

    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    :goto_0
    return-object p1

    .line 7
    :cond_3
    invoke-virtual {v1}, Lei;->a()Landroid/os/Bundle;

    const/4 p1, 0x0

    throw p1
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lug;->f:Z

    .line 3
    iget-object v0, p0, Lug;->d:Lxh;

    invoke-virtual {v0}, Lxh;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lug;->b:Lyh;

    iget-object v1, p0, Lug;->c:Lug$b;

    invoke-virtual {v0, v1}, Lyh;->o(Lyh$b;)V

    .line 5
    :cond_0
    sget-object v0, Lug;->r:Lug$a;

    invoke-virtual {v0, p0}, Lug$a;->c(Lug;)V

    .line 6
    :cond_1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    .line 7
    iget-object v4, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    .line 8
    iget-object v5, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    sub-int/2addr v1, v0

    sub-int/2addr v1, v4

    .line 9
    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    sub-int/2addr v3, v2

    sub-int/2addr v3, v5

    .line 10
    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 11
    iget-object v1, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    add-int/2addr v4, v0

    add-int/2addr v5, v2

    invoke-virtual {v1, v0, v2, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 12
    iget-object v0, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 6

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 2
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    .line 4
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    .line 5
    iget v2, p0, Lug;->n:I

    iget-object v3, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 6
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    add-int/2addr v3, v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    add-int/2addr v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    .line 7
    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 8
    iget v3, p0, Lug;->o:I

    iget-object v5, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    if-eqz v5, :cond_1

    .line 9
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    add-int/2addr v4, v5

    .line 10
    :cond_1
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    const/high16 v5, -0x80000000

    if-eq p1, v5, :cond_2

    if-eq p1, v4, :cond_3

    move v0, v2

    goto :goto_1

    .line 11
    :cond_2
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_3
    :goto_1
    if-eq p2, v5, :cond_4

    if-eq p2, v4, :cond_5

    move v1, v3

    goto :goto_2

    .line 12
    :cond_4
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 13
    :cond_5
    :goto_2
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public performClick()Z
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, v1}, Landroid/view/View;->playSoundEffect(I)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lug;->a()V

    .line 4
    invoke-virtual {p0}, Lug;->d()Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public setAlwaysVisible(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lug;->p:Z

    if-eq p1, v0, :cond_0

    .line 2
    iput-boolean p1, p0, Lug;->p:Z

    .line 3
    invoke-virtual {p0}, Lug;->c()V

    .line 4
    invoke-virtual {p0}, Lug;->b()V

    :cond_0
    return-void
.end method

.method public setCheatSheetEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lug;->q:Z

    if-eq p1, v0, :cond_0

    .line 2
    iput-boolean p1, p0, Lug;->q:Z

    .line 3
    invoke-virtual {p0}, Lug;->f()V

    :cond_0
    return-void
.end method

.method public setDialogFactory(Lzg;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Lug;->e:Lzg;

    return-void

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0xf2a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setRemoteIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lug;->j:I

    .line 2
    invoke-virtual {p0, p1}, Lug;->setRemoteIndicatorDrawableInternal(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setRemoteIndicatorDrawableInternal(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lug;->h:Lug$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 3
    :cond_0
    iget-object v0, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 5
    iget-object v0, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Landroid/view/View;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    if-eqz p1, :cond_4

    .line 6
    iget-object v0, p0, Lug;->m:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Lo9;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 8
    iget-object v0, p0, Lug;->m:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, Lo9;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 9
    :cond_2
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 12
    :cond_4
    iput-object p1, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    return-void
.end method

.method public setRouteSelector(Lxh;)V
    .locals 2

    if-eqz p1, :cond_3

    .line 1
    iget-object v0, p0, Lug;->d:Lxh;

    invoke-virtual {v0, p1}, Lxh;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    iget-boolean v0, p0, Lug;->f:Z

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lug;->d:Lxh;

    invoke-virtual {v0}, Lxh;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lug;->b:Lyh;

    iget-object v1, p0, Lug;->c:Lug$b;

    invoke-virtual {v0, v1}, Lyh;->o(Lyh$b;)V

    .line 5
    :cond_0
    invoke-virtual {p1}, Lxh;->f()Z

    move-result v0

    if-nez v0, :cond_1

    .line 6
    iget-object v0, p0, Lug;->b:Lyh;

    iget-object v1, p0, Lug;->c:Lug$b;

    invoke-virtual {v0, p1, v1}, Lyh;->a(Lxh;Lyh$b;)V

    .line 7
    :cond_1
    iput-object p1, p0, Lug;->d:Lxh;

    .line 8
    invoke-virtual {p0}, Lug;->b()V

    :cond_2
    return-void

    .line 9
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0xf2b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setVisibility(I)V
    .locals 0

    .line 1
    iput p1, p0, Lug;->g:I

    .line 2
    invoke-virtual {p0}, Lug;->c()V

    return-void
.end method

.method public verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lug;->i:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
