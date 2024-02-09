.class public Lcom/upi/axispay/activity/SplashActivity;
.super Lc90;
.source "AxisPay"

# interfaces
.implements Lm70;
.implements Lfh0;


# instance fields
.field public D:Landroid/widget/LinearLayout;

.field public E:Landroid/widget/LinearLayout;

.field public F:Z

.field public G:Z

.field public H:Landroid/view/animation/Animation;

.field public I:Ln70;

.field public J:Lgh0;

.field public K:Ljava/lang/String;

.field public L:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lc90;-><init>()V

    const v0, 0x2374

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/upi/axispay/activity/SplashActivity;->K:Ljava/lang/String;

    const v0, 0x2375

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x2376

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x2377

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x2378

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x2379

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 3
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/upi/axispay/activity/SplashActivity;->L:Ljava/util/List;

    return-void
.end method

.method public static synthetic d0(Lcom/upi/axispay/activity/SplashActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/activity/SplashActivity;->f0()V

    return-void
.end method

.method public static synthetic e0(Lcom/upi/axispay/activity/SplashActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/activity/SplashActivity;->g0()V

    return-void
.end method


# virtual methods
.method public d(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/activity/SplashActivity;->L:Ljava/util/List;

    const v0, 0x237a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/activity/SplashActivity;->K:Ljava/lang/String;

    .line 2
    new-instance v0, Lcom/upi/axispay/activity/SplashActivity$b;

    invoke-direct {v0, p0}, Lcom/upi/axispay/activity/SplashActivity$b;-><init>(Lcom/upi/axispay/activity/SplashActivity;)V

    const v1, 0x237b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, p1, v0}, Leg0;->l(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 3
    :cond_0
    sget-object p1, Lhh0;->a:Lhh0;

    iget-object v0, p0, Lcom/upi/axispay/activity/SplashActivity;->J:Lgh0;

    invoke-virtual {p1, v0}, Lhh0;->b(Lgh0;)V

    .line 4
    invoke-virtual {p0}, Lcom/upi/axispay/activity/SplashActivity;->h0()V

    :goto_0
    return-void
.end method

.method public final f0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/upi/axispay/activity/SplashActivity;->G:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x237c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 5
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/upi/axispay/activity/LanguageActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 7
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final g0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/activity/SplashActivity;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/upi/axispay/activity/SplashActivity;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getRight()I

    move-result v1

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    .line 2
    iget-object v1, p0, Lcom/upi/axispay/activity/SplashActivity;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getTop()I

    move-result v1

    iget-object v2, p0, Lcom/upi/axispay/activity/SplashActivity;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getBottom()I

    move-result v2

    add-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    .line 3
    iget-object v2, p0, Lcom/upi/axispay/activity/SplashActivity;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/upi/axispay/activity/SplashActivity;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 4
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_0

    .line 5
    iget-object v3, p0, Lcom/upi/axispay/activity/SplashActivity;->D:Landroid/widget/LinearLayout;

    const/4 v4, 0x0

    int-to-float v4, v4

    int-to-float v2, v2

    invoke-static {v3, v0, v1, v4, v2}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    move-result-object v0

    const-wide/16 v1, 0x2bc

    .line 6
    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 8
    new-instance v1, Lcom/upi/axispay/activity/SplashActivity$a;

    invoke-direct {v1, p0}, Lcom/upi/axispay/activity/SplashActivity$a;-><init>(Lcom/upi/axispay/activity/SplashActivity;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 9
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/upi/axispay/activity/SplashActivity;->f0()V

    :goto_0
    return-void
.end method

.method public h(Z)V
    .locals 0

    return-void
.end method

.method public final h0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/activity/SplashActivity;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/upi/axispay/activity/SplashActivity$c;

    invoke-direct {v1, p0}, Lcom/upi/axispay/activity/SplashActivity$c;-><init>(Lcom/upi/axispay/activity/SplashActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 2
    sget-object v0, Lch0;->e:Lch0$a;

    invoke-virtual {v0}, Lch0$a;->a()Lch0;

    move-result-object v0

    .line 3
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    iput-object v1, p0, Lcom/upi/axispay/activity/SplashActivity;->I:Ln70;

    .line 4
    invoke-virtual {v1, p0}, Ln70;->C(Lm70;)V

    .line 5
    iget-object v1, p0, Lcom/upi/axispay/activity/SplashActivity;->I:Ln70;

    invoke-virtual {v0}, Lch0;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ln70;->r(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/upi/axispay/activity/SplashActivity;->I:Ln70;

    invoke-virtual {v0, p0}, Ln70;->p(Landroid/content/Context;)V

    .line 7
    invoke-static {p0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v3, 0x56

    const/16 v4, 0x50

    const/4 v5, 0x1

    invoke-direct {v1, v3, v4, v2, v5}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method

.method public k(Z)V
    .locals 0

    return-void
.end method

.method public n(I)V
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 1
    invoke-static {p0}, Ld70;->e(Landroid/content/Context;)Ld70;

    move-result-object p1

    invoke-virtual {p1}, Ld70;->a()V

    .line 2
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v0, 0x237d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln70;->c(Ljava/lang/String;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/upi/axispay/activity/SplashActivity;->f0()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lc90;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d002b

    .line 2
    invoke-virtual {p0, p1}, Lz;->setContentView(I)V

    const p1, 0x7f0a042c

    .line 3
    invoke-virtual {p0, p1}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const p1, 0x7f0a02b3

    .line 4
    invoke-virtual {p0, p1}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/upi/axispay/activity/SplashActivity;->D:Landroid/widget/LinearLayout;

    const p1, 0x7f0a035f

    .line 5
    invoke-virtual {p0, p1}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/upi/axispay/activity/SplashActivity;->E:Landroid/widget/LinearLayout;

    .line 6
    new-instance p1, Lgh0;

    invoke-direct {p1, p0}, Lgh0;-><init>(Lfh0;)V

    iput-object p1, p0, Lcom/upi/axispay/activity/SplashActivity;->J:Lgh0;

    .line 7
    sget-object v0, Lhh0;->a:Lhh0;

    invoke-virtual {v0, p0, p1}, Lhh0;->a(Landroid/content/Context;Lgh0;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc90;->onDestroy()V

    .line 2
    iget-boolean v0, p0, Lcom/upi/axispay/activity/SplashActivity;->F:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/upi/axispay/activity/SplashActivity;->H:Landroid/view/animation/Animation;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    :cond_0
    return-void
.end method

.method public q(Z)V
    .locals 0

    return-void
.end method

.method public v(Z)V
    .locals 0

    return-void
.end method
