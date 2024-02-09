.class public Lcom/upi/axispay/activity/SplashActivity$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/activity/SplashActivity;->g0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/upi/axispay/activity/SplashActivity;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/activity/SplashActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/activity/SplashActivity$a;->a:Lcom/upi/axispay/activity/SplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/activity/SplashActivity$a;->a:Lcom/upi/axispay/activity/SplashActivity;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/upi/axispay/activity/SplashActivity;->F:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/activity/SplashActivity$a;->a:Lcom/upi/axispay/activity/SplashActivity;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/upi/axispay/activity/SplashActivity;->F:Z

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p1, Lcom/upi/axispay/activity/SplashActivity;->G:Z

    .line 3
    invoke-static {p1}, Lcom/upi/axispay/activity/SplashActivity;->d0(Lcom/upi/axispay/activity/SplashActivity;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/activity/SplashActivity$a;->a:Lcom/upi/axispay/activity/SplashActivity;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/upi/axispay/activity/SplashActivity;->F:Z

    .line 2
    iget-object p1, p1, Lcom/upi/axispay/activity/SplashActivity;->D:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method
