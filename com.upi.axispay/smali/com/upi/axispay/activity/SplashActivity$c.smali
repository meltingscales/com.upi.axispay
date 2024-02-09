.class public Lcom/upi/axispay/activity/SplashActivity$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/activity/SplashActivity;->h0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/upi/axispay/activity/SplashActivity;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/activity/SplashActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/activity/SplashActivity$c;->b:Lcom/upi/axispay/activity/SplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/activity/SplashActivity$c;->b:Lcom/upi/axispay/activity/SplashActivity;

    iget-object v0, v0, Lcom/upi/axispay/activity/SplashActivity;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/upi/axispay/activity/SplashActivity$c;->b:Lcom/upi/axispay/activity/SplashActivity;

    iget-object v0, v0, Lcom/upi/axispay/activity/SplashActivity;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/upi/axispay/activity/SplashActivity$c;->b:Lcom/upi/axispay/activity/SplashActivity;

    invoke-static {v0}, Lcom/upi/axispay/activity/SplashActivity;->e0(Lcom/upi/axispay/activity/SplashActivity;)V

    return-void
.end method
