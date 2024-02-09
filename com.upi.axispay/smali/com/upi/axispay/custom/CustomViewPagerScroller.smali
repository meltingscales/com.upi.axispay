.class public Lcom/upi/axispay/custom/CustomViewPagerScroller;
.super Landroid/widget/Scroller;
.source "AxisPay"


# instance fields
.field private mScrollDuration:I

.field private mScrollFactor:D


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 2
    iput-wide v0, p0, Lcom/upi/axispay/custom/CustomViewPagerScroller;->mScrollFactor:D

    const/16 p1, 0x3e8

    .line 3
    iput p1, p0, Lcom/upi/axispay/custom/CustomViewPagerScroller;->mScrollDuration:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    .line 5
    iput-wide p1, p0, Lcom/upi/axispay/custom/CustomViewPagerScroller;->mScrollFactor:D

    const/16 p1, 0x3e8

    .line 6
    iput p1, p0, Lcom/upi/axispay/custom/CustomViewPagerScroller;->mScrollDuration:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/animation/Interpolator;Z)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;Z)V

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    .line 8
    iput-wide p1, p0, Lcom/upi/axispay/custom/CustomViewPagerScroller;->mScrollFactor:D

    const/16 p1, 0x3e8

    .line 9
    iput p1, p0, Lcom/upi/axispay/custom/CustomViewPagerScroller;->mScrollDuration:I

    return-void
.end method


# virtual methods
.method public setScrollDurationFactor(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/upi/axispay/custom/CustomViewPagerScroller;->mScrollFactor:D

    return-void
.end method

.method public startScroll(IIII)V
    .locals 6

    .line 2
    iget v5, p0, Lcom/upi/axispay/custom/CustomViewPagerScroller;->mScrollDuration:I

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-super/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    return-void
.end method

.method public startScroll(IIIII)V
    .locals 6

    .line 1
    iget v5, p0, Lcom/upi/axispay/custom/CustomViewPagerScroller;->mScrollDuration:I

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-super/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    return-void
.end method
