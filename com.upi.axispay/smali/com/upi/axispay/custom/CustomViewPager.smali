.class public Lcom/upi/axispay/custom/CustomViewPager;
.super Landroidx/viewpager/widget/ViewPager;
.source "AxisPay"


# instance fields
.field private mScroller:Lcom/upi/axispay/custom/CustomViewPagerScroller;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/upi/axispay/custom/CustomViewPager;->mScroller:Lcom/upi/axispay/custom/CustomViewPagerScroller;

    .line 3
    invoke-direct {p0}, Lcom/upi/axispay/custom/CustomViewPager;->postInitViewPager()V

    .line 4
    invoke-direct {p0}, Lcom/upi/axispay/custom/CustomViewPager;->initPageChangeListener()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/upi/axispay/custom/CustomViewPager;->mScroller:Lcom/upi/axispay/custom/CustomViewPagerScroller;

    .line 7
    invoke-direct {p0}, Lcom/upi/axispay/custom/CustomViewPager;->postInitViewPager()V

    .line 8
    invoke-direct {p0}, Lcom/upi/axispay/custom/CustomViewPager;->initPageChangeListener()V

    return-void
.end method

.method private initPageChangeListener()V
    .locals 1

    .line 1
    new-instance v0, Lcom/upi/axispay/custom/CustomViewPager$1;

    invoke-direct {v0, p0}, Lcom/upi/axispay/custom/CustomViewPager$1;-><init>(Lcom/upi/axispay/custom/CustomViewPager;)V

    invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$j;)V

    return-void
.end method

.method private postInitViewPager()V
    .locals 6

    .line 1
    :try_start_0
    const-class v1, Landroidx/viewpager/widget/ViewPager;

    const v0, 0x3a30

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v3, 0x1

    .line 3
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    const v0, 0x3a31

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 5
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 6
    new-instance v3, Lcom/upi/axispay/custom/CustomViewPagerScroller;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    const/4 v5, 0x0

    .line 7
    invoke-virtual {v1, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/animation/Interpolator;

    invoke-direct {v3, v4, v1}, Lcom/upi/axispay/custom/CustomViewPagerScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v3, p0, Lcom/upi/axispay/custom/CustomViewPager;->mScroller:Lcom/upi/axispay/custom/CustomViewPagerScroller;

    .line 8
    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public onMeasure(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    .line 2
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    .line 4
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 5
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;->onMeasure(II)V

    return-void
.end method

.method public setScrollDurationFactor(D)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/CustomViewPager;->mScroller:Lcom/upi/axispay/custom/CustomViewPagerScroller;

    invoke-virtual {v0, p1, p2}, Lcom/upi/axispay/custom/CustomViewPagerScroller;->setScrollDurationFactor(D)V

    return-void
.end method
