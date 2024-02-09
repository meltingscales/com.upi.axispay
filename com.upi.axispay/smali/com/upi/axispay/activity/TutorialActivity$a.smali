.class public Lcom/upi/axispay/activity/TutorialActivity$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$j;


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
    iput-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity$a;->b:Lcom/upi/axispay/activity/TutorialActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/upi/axispay/activity/TutorialActivity;->Y(I)I

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity$a;->b:Lcom/upi/axispay/activity/TutorialActivity;

    invoke-static {}, Lcom/upi/axispay/activity/TutorialActivity;->X()I

    move-result v0

    invoke-static {p1, v0}, Lcom/upi/axispay/activity/TutorialActivity;->a0(Lcom/upi/axispay/activity/TutorialActivity;I)V

    .line 3
    invoke-static {}, Lcom/upi/axispay/activity/TutorialActivity;->X()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity$a;->b:Lcom/upi/axispay/activity/TutorialActivity;

    invoke-static {p1}, Lcom/upi/axispay/activity/TutorialActivity;->b0(Lcom/upi/axispay/activity/TutorialActivity;)Lcom/upi/axispay/custom/CustomViewPagerr;

    move-result-object p1

    invoke-static {}, Lcom/upi/axispay/activity/TutorialActivity;->X()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1, v1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 5
    invoke-static {}, Lcom/upi/axispay/activity/TutorialActivity;->Z()I

    :cond_0
    return-void
.end method
