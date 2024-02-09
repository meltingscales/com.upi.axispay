.class public Lcom/upi/axispay/activity/TutorialActivity$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/activity/TutorialActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/upi/axispay/activity/TutorialActivity;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/activity/TutorialActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity$b;->b:Lcom/upi/axispay/activity/TutorialActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/upi/axispay/activity/TutorialActivity;->X()I

    move-result v0

    iget-object v1, p0, Lcom/upi/axispay/activity/TutorialActivity$b;->b:Lcom/upi/axispay/activity/TutorialActivity;

    invoke-static {v1}, Lcom/upi/axispay/activity/TutorialActivity;->b0(Lcom/upi/axispay/activity/TutorialActivity;)Lcom/upi/axispay/custom/CustomViewPagerr;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/upi/axispay/activity/TutorialActivity;->Y(I)I

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity$b;->b:Lcom/upi/axispay/activity/TutorialActivity;

    invoke-static {v0}, Lcom/upi/axispay/activity/TutorialActivity;->b0(Lcom/upi/axispay/activity/TutorialActivity;)Lcom/upi/axispay/custom/CustomViewPagerr;

    move-result-object v0

    invoke-static {}, Lcom/upi/axispay/activity/TutorialActivity;->X()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 4
    invoke-static {}, Lcom/upi/axispay/activity/TutorialActivity;->Z()I

    return-void
.end method
