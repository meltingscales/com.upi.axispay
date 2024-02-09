.class public Lcom/upi/axispay/custom/CustomViewPager$1;
.super Landroidx/viewpager/widget/ViewPager$m;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/custom/CustomViewPager;->initPageChangeListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/upi/axispay/custom/CustomViewPager;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/custom/CustomViewPager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/CustomViewPager$1;->this$0:Lcom/upi/axispay/custom/CustomViewPager;

    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager$m;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/custom/CustomViewPager$1;->this$0:Lcom/upi/axispay/custom/CustomViewPager;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method
