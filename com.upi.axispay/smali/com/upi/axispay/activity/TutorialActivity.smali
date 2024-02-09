.class public Lcom/upi/axispay/activity/TutorialActivity;
.super Lz;
.source "AxisPay"

# interfaces
.implements Lmg0;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/upi/axispay/activity/TutorialActivity$f;
    }
.end annotation


# static fields
.field public static z:I


# instance fields
.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/TextView;

.field public t:Lcom/viewpagerindicator/CirclePageIndicator;

.field public u:I

.field public v:Lcom/upi/axispay/custom/CustomViewPagerr;

.field public w:Ljava/util/Timer;

.field public x:Landroid/os/Handler;

.field public y:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lz;-><init>()V

    return-void
.end method

.method public static synthetic X()I
    .locals 1

    .line 1
    sget v0, Lcom/upi/axispay/activity/TutorialActivity;->z:I

    return v0
.end method

.method public static synthetic Y(I)I
    .locals 0

    .line 1
    sput p0, Lcom/upi/axispay/activity/TutorialActivity;->z:I

    return p0
.end method

.method public static synthetic Z()I
    .locals 2

    .line 1
    sget v0, Lcom/upi/axispay/activity/TutorialActivity;->z:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/upi/axispay/activity/TutorialActivity;->z:I

    return v0
.end method

.method public static synthetic a0(Lcom/upi/axispay/activity/TutorialActivity;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/upi/axispay/activity/TutorialActivity;->f0(I)V

    return-void
.end method

.method public static synthetic b0(Lcom/upi/axispay/activity/TutorialActivity;)Lcom/upi/axispay/custom/CustomViewPagerr;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/upi/axispay/activity/TutorialActivity;->v:Lcom/upi/axispay/custom/CustomViewPagerr;

    return-object p0
.end method

.method public static synthetic c0(Lcom/upi/axispay/activity/TutorialActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/upi/axispay/activity/TutorialActivity;->d0()V

    return-void
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lqh0;->b(Landroid/content/Context;)Landroid/content/ContextWrapper;

    move-result-object p1

    invoke-super {p0, p1}, Lz;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public final d0()V
    .locals 7

    .line 1
    new-instance v0, Ly$a;

    invoke-direct {v0, p0}, Ly$a;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lz;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f03000b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {p0}, Ld70;->e(Landroid/content/Context;)Ld70;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Ld70;->c()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    move v5, v4

    .line 5
    :goto_0
    array-length v6, v1

    if-ge v5, v6, :cond_1

    .line 6
    aget-object v6, v1, v5

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v4, v5

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 7
    :cond_1
    :goto_1
    new-instance v3, Lcom/upi/axispay/activity/TutorialActivity$e;

    invoke-direct {v3, p0, v2, v1}, Lcom/upi/axispay/activity/TutorialActivity$e;-><init>(Lcom/upi/axispay/activity/TutorialActivity;Ld70;[Ljava/lang/String;)V

    invoke-virtual {v0, v1, v4, v3}, Ly$a;->i([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Ly$a;

    .line 8
    invoke-virtual {v0}, Ly$a;->a()Ly;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public e0(I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0, v0, v1}, Lcom/upi/axispay/activity/TutorialActivity;->t(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x3

    .line 2
    invoke-virtual {p0, p1, v1}, Lcom/upi/axispay/activity/TutorialActivity;->t(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final f0(I)V
    .locals 5

    const v0, 0x30b7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x30b8

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x6a

    const v3, 0x7f060193

    if-eqz p1, :cond_2

    const/4 v4, 0x1

    if-eq p1, v4, :cond_0

    goto/16 :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->q:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->r:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3
    iget p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->u:I

    if-ne p1, v2, :cond_1

    const p1, 0x7f120252

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    .line 5
    iget-object v2, p0, Lcom/upi/axispay/activity/TutorialActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->q:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->r:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->s:Landroid/widget/TextView;

    const v0, 0x7f1204af

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->q:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->r:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 11
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 12
    iget p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->u:I

    if-ne p1, v2, :cond_3

    .line 13
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->s:Landroid/widget/TextView;

    const v2, 0x7f120251

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 14
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->q:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->r:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 16
    :cond_3
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->s:Landroid/widget/TextView;

    const v0, 0x7f1204ae

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-void
.end method

.method public m(ILjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public o(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0345

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a0413

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lcom/upi/axispay/activity/TutorialActivity;->e0(I)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    .line 3
    invoke-virtual {p0, p1}, Lcom/upi/axispay/activity/TutorialActivity;->e0(I)V

    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Lsd;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-static {p0}, Lxg0;->b(Landroid/content/Context;)Landroid/content/Context;

    const p1, 0x7f0d002c

    .line 3
    invoke-virtual {p0, p1}, Lz;->setContentView(I)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const v0, 0x30b9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->u:I

    .line 6
    new-instance p1, Lcom/upi/axispay/activity/TutorialActivity$f;

    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-direct {p1, p0, v0, p0}, Lcom/upi/axispay/activity/TutorialActivity$f;-><init>(Lcom/upi/axispay/activity/TutorialActivity;Landroidx/fragment/app/FragmentManager;Lmg0;)V

    const v0, 0x7f0a0413

    .line 7
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity;->q:Landroid/widget/TextView;

    const v0, 0x7f0a0345

    .line 8
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity;->r:Landroid/widget/TextView;

    const v0, 0x7f0a0531

    .line 9
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity;->s:Landroid/widget/TextView;

    const v0, 0x7f0a017e

    .line 10
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/viewpagerindicator/CirclePageIndicator;

    iput-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity;->t:Lcom/viewpagerindicator/CirclePageIndicator;

    const v0, 0x7f0a0141

    .line 11
    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/CustomViewPagerr;

    iput-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity;->v:Lcom/upi/axispay/custom/CustomViewPagerr;

    .line 12
    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lno;)V

    .line 13
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->v:Lcom/upi/axispay/custom/CustomViewPagerr;

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-virtual {p1, v0, v1}, Lcom/upi/axispay/custom/CustomViewPagerr;->setScrollDurationFactor(D)V

    .line 14
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->v:Lcom/upi/axispay/custom/CustomViewPagerr;

    new-instance v0, Lcom/upi/axispay/activity/TutorialActivity$a;

    invoke-direct {v0, p0}, Lcom/upi/axispay/activity/TutorialActivity$a;-><init>(Lcom/upi/axispay/activity/TutorialActivity;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$j;)V

    .line 15
    new-instance p1, Ljava/util/Timer;

    invoke-direct {p1}, Ljava/util/Timer;-><init>()V

    iput-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->w:Ljava/util/Timer;

    .line 16
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->x:Landroid/os/Handler;

    .line 17
    new-instance p1, Lcom/upi/axispay/activity/TutorialActivity$b;

    invoke-direct {p1, p0}, Lcom/upi/axispay/activity/TutorialActivity$b;-><init>(Lcom/upi/axispay/activity/TutorialActivity;)V

    iput-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->y:Ljava/lang/Runnable;

    .line 18
    iget-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity;->w:Ljava/util/Timer;

    new-instance v1, Lcom/upi/axispay/activity/TutorialActivity$c;

    invoke-direct {v1, p0}, Lcom/upi/axispay/activity/TutorialActivity$c;-><init>(Lcom/upi/axispay/activity/TutorialActivity;)V

    const-wide/16 v2, 0xbb8

    const-wide/16 v4, 0xbb8

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 19
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->t:Lcom/viewpagerindicator/CirclePageIndicator;

    iget-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity;->v:Lcom/upi/axispay/custom/CustomViewPagerr;

    invoke-virtual {p1, v0}, Lcom/viewpagerindicator/CirclePageIndicator;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 20
    sget p1, Lcom/upi/axispay/activity/TutorialActivity;->z:I

    invoke-virtual {p0, p1}, Lcom/upi/axispay/activity/TutorialActivity;->f0(I)V

    .line 21
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->q:Landroid/widget/TextView;

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->r:Landroid/widget/TextView;

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a0132

    .line 23
    invoke-virtual {p0, p1}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    .line 24
    new-instance v0, Lcom/upi/axispay/activity/TutorialActivity$d;

    invoke-direct {v0, p0}, Lcom/upi/axispay/activity/TutorialActivity$d;-><init>(Lcom/upi/axispay/activity/TutorialActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity;->w:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity;->x:Landroid/os/Handler;

    iget-object v1, p0, Lcom/upi/axispay/activity/TutorialActivity;->y:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity;->w:Ljava/util/Timer;

    .line 4
    iput-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity;->x:Landroid/os/Handler;

    .line 5
    iput-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity;->y:Ljava/lang/Runnable;

    .line 6
    invoke-super {p0}, Lz;->onDestroy()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public t(ILjava/lang/Object;)V
    .locals 2

    const/4 p2, 0x3

    if-ne p1, p2, :cond_2

    .line 1
    iget p1, p0, Lcom/upi/axispay/activity/TutorialActivity;->u:I

    const/16 p2, 0x6a

    if-ne p1, p2, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 3
    :cond_0
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const p2, 0x30ba

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln70;->e(Ljava/lang/String;)Z

    move-result p1

    const p2, 0x10008000

    if-eqz p1, :cond_1

    .line 4
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 5
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 7
    :cond_1
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v0, 0x16

    const v1, 0x30bb

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 9
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 10
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 11
    :cond_2
    sget v0, Lcom/upi/axispay/activity/TutorialActivity;->z:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_3

    .line 12
    iget-object p2, p0, Lcom/upi/axispay/activity/TutorialActivity;->v:Lcom/upi/axispay/custom/CustomViewPagerr;

    add-int/2addr p1, v1

    invoke-virtual {p2, p1, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p2, p1}, Lcom/upi/axispay/activity/TutorialActivity;->t(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
