.class public Lcom/kofigyan/stateprogressbar/StateProgressBar;
.super Landroid/view/View;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;,
        Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;
    }
.end annotation


# static fields
.field private static final ANIMATE_TO_CURRENT_PROGRESS_STATE_KEY:Ljava/lang/String;

.field private static final ANIM_END_X_POS_KEY:Ljava/lang/String;

.field private static final ANIM_START_X_POS_KEY:Ljava/lang/String;

.field private static final DEFAULT_STATE_SIZE:F

.field private static final DEFAULT_TEXT_SIZE:F

.field private static final END_CENTER_X_KEY:Ljava/lang/String;

.field private static final IS_CURRENT_ANIM_STARTED_KEY:Ljava/lang/String;

.field private static final MAX_STATE_NUMBER:I

.field private static final MIN_STATE_NUMBER:I

.field private static final START_CENTER_X_KEY:Ljava/lang/String;

.field private static final SUPER_STATE_KEY:Ljava/lang/String;


# instance fields
.field private mAnimDuration:I

.field private mAnimEndXPos:F

.field private mAnimStartDelay:I

.field private mAnimStartXPos:F

.field private mAnimateToCurrentProgressState:Z

.field private mAnimator:Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;

.field private mBackgroundColor:I

.field private mBackgroundPaint:Landroid/graphics/Paint;

.field private mCellHeight:F

.field private mCellWidth:F

.field private mCheckFont:Landroid/graphics/Typeface;

.field private mCheckStateCompleted:Z

.field private mCurrentStateDescriptionColor:I

.field private mCurrentStateDescriptionPaint:Landroid/graphics/Paint;

.field private mCurrentStateNumber:I

.field private mDescTopSpaceDecrementer:F

.field private mDescTopSpaceIncrementer:F

.field private mEnableAllStatesCompleted:Z

.field private mEndCenterX:F

.field private mForegroundColor:I

.field private mForegroundPaint:Landroid/graphics/Paint;

.field private mIsCurrentAnimStarted:Z

.field private mMaxStateNumber:I

.field private mNextCellWidth:F

.field private mSpacing:F

.field private mStartCenterX:F

.field private mStateCheckedForegroundPaint:Landroid/graphics/Paint;

.field private mStateDescriptionColor:I

.field private mStateDescriptionData:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mStateDescriptionPaint:Landroid/graphics/Paint;

.field private mStateDescriptionSize:F

.field private mStateLineThickness:F

.field private mStateNumberBackgroundColor:I

.field private mStateNumberBackgroundPaint:Landroid/graphics/Paint;

.field private mStateNumberForegroundColor:I

.field private mStateNumberForegroundPaint:Landroid/graphics/Paint;

.field private mStateNumberTextSize:F

.field private mStateRadius:F

.field private mStateSize:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/kofigyan/stateprogressbar/StateProgressBar;

    const v1, 0xef

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionData:Ljava/util/ArrayList;

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->initializePainters()V

    .line 7
    iget-boolean p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEnableAllStatesCompleted:Z

    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->updateCheckAllStatesValues(Z)V

    return-void
.end method

.method public static synthetic access$000(Lcom/kofigyan/stateprogressbar/StateProgressBar;)Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimator:Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;

    return-object p0
.end method

.method public static synthetic access$002(Lcom/kofigyan/stateprogressbar/StateProgressBar;Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;)Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimator:Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;

    return-object p1
.end method

.method public static synthetic access$100(Lcom/kofigyan/stateprogressbar/StateProgressBar;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStartCenterX:F

    return p0
.end method

.method public static synthetic access$200(Lcom/kofigyan/stateprogressbar/StateProgressBar;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEndCenterX:F

    return p0
.end method

.method public static synthetic access$300(Lcom/kofigyan/stateprogressbar/StateProgressBar;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimDuration:I

    return p0
.end method

.method public static synthetic access$402(Lcom/kofigyan/stateprogressbar/StateProgressBar;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimStartXPos:F

    return p1
.end method

.method public static synthetic access$500(Lcom/kofigyan/stateprogressbar/StateProgressBar;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimEndXPos:F

    return p0
.end method

.method public static synthetic access$502(Lcom/kofigyan/stateprogressbar/StateProgressBar;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimEndXPos:F

    return p1
.end method

.method public static synthetic access$600(Lcom/kofigyan/stateprogressbar/StateProgressBar;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimStartDelay:I

    return p0
.end method

.method private animateToCurrentState(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mIsCurrentAnimStarted:Z

    if-nez v0, :cond_0

    .line 2
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStartCenterX:F

    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimStartXPos:F

    .line 3
    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimEndXPos:F

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mIsCurrentAnimStarted:Z

    .line 5
    :cond_0
    iget v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimEndXPos:F

    iget v6, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStartCenterX:F

    cmpg-float v0, v4, v6

    if-ltz v0, :cond_3

    iget v8, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEndCenterX:F

    cmpl-float v0, v6, v8

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    cmpg-float v0, v4, v8

    const/high16 v7, 0x40000000    # 2.0f

    if-gtz v0, :cond_2

    .line 6
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellHeight:F

    div-float v3, v0, v7

    div-float v5, v0, v7

    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundPaint:Landroid/graphics/Paint;

    move-object v1, p1

    move v2, v6

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 7
    iget v9, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimEndXPos:F

    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellHeight:F

    div-float v10, v0, v7

    iget v11, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEndCenterX:F

    div-float v12, v0, v7

    iget-object v13, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundPaint:Landroid/graphics/Paint;

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 8
    iget p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimEndXPos:F

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimStartXPos:F

    goto :goto_1

    .line 9
    :cond_2
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellHeight:F

    div-float v1, v0, v7

    div-float v9, v0, v7

    iget-object v10, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundPaint:Landroid/graphics/Paint;

    move-object v5, p1

    move v7, v1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 10
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->stopAnimation()V

    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->enableAnimationToCurrentState(Z)V

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    :goto_1
    iget p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellWidth:F

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mNextCellWidth:F

    return-void
.end method

.method private convertDpToPixel(F)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, v0

    return p1
.end method

.method private convertSpToPixel(F)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    mul-float/2addr p1, v0

    return p1
.end method

.method private drawCircles(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
    .locals 4

    :goto_0
    if-ge p3, p4, :cond_1

    add-int/lit8 p3, p3, 0x1

    .line 1
    invoke-virtual {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->getCurrentStateNumber()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne p3, v0, :cond_0

    .line 2
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellWidth:F

    int-to-float v2, p3

    mul-float/2addr v2, v0

    div-float/2addr v0, v1

    sub-float/2addr v2, v0

    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellHeight:F

    div-float/2addr v0, v1

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateRadius:F

    invoke-virtual {p1, v2, v0, v1, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 3
    :cond_0
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellWidth:F

    int-to-float v2, p3

    mul-float/2addr v2, v0

    div-float/2addr v0, v1

    sub-float/2addr v2, v0

    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellHeight:F

    div-float/2addr v0, v1

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateRadius:F

    const/high16 v3, 0x40c00000    # 6.0f

    sub-float/2addr v1, v3

    invoke-virtual {p1, v2, v0, v1, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private drawCurrentStateJoiningLine(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimateToCurrentProgressState:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->animateToCurrentState(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->drawLineToCurrentState(Landroid/graphics/Canvas;)V

    :goto_0
    return-void
.end method

.method private drawLineToCurrentState(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStartCenterX:F

    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellHeight:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float v3, v0, v2

    iget v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEndCenterX:F

    div-float v5, v0, v2

    iget-object v6, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundPaint:Landroid/graphics/Paint;

    move-object v0, p1

    move v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 2
    iget p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellWidth:F

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mNextCellWidth:F

    .line 3
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->stopAnimation()V

    return-void
.end method

.method private drawLines(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
    .locals 10

    if-le p4, p3, :cond_0

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellWidth:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v2, v0, v1

    int-to-float p3, p3

    mul-float/2addr p3, v0

    add-float/2addr v2, p3

    int-to-float p3, p4

    mul-float/2addr p3, v0

    div-float/2addr v0, v1

    sub-float/2addr p3, v0

    .line 2
    iget p4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateRadius:F

    const/high16 v0, 0x3f400000    # 0.75f

    mul-float v3, p4, v0

    add-float v5, v2, v3

    mul-float/2addr p4, v0

    sub-float v7, p3, p4

    .line 3
    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellHeight:F

    div-float v6, p3, v1

    div-float v8, p3, v1

    move-object v4, p1

    move-object v9, p2

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method private drawState(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setAnimatorStartEndCenterX()V

    .line 2
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->drawCurrentStateJoiningLine(Landroid/graphics/Canvas;)V

    .line 3
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->drawLines(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    .line 4
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    iget v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->drawCircles(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    .line 5
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v2, v1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->drawCircles(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    .line 6
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p0, p1, v0, v2, v1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->drawLines(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    .line 7
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    invoke-direct {p0, p1, v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->drawStateNumberText(Landroid/graphics/Canvas;I)V

    .line 8
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->drawStateDescriptionText(Landroid/graphics/Canvas;)V

    return-void
.end method

.method private drawStateDescriptionText(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionData:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionData:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 3
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    if-ge v0, v1, :cond_1

    .line 4
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    invoke-direct {p0, v1, v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->selectDescriptionPaint(II)Landroid/graphics/Paint;

    move-result-object v1

    .line 5
    iget v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mNextCellWidth:F

    iget v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellWidth:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    float-to-int v2, v2

    .line 6
    iget v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellHeight:F

    iget v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionSize:F

    add-float/2addr v3, v4

    iget v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mSpacing:F

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceDecrementer:F

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceIncrementer:F

    add-float/2addr v3, v4

    float-to-int v3, v3

    .line 7
    invoke-virtual {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->getCurrentStateNumber()I

    move-result v4

    if-ge v0, v4, :cond_0

    .line 8
    iget v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateDescriptionColor:I

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    iget-object v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionData:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    int-to-float v2, v2

    int-to-float v3, v3

    invoke-virtual {p1, v4, v2, v3, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 10
    :cond_0
    iget v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionColor:I

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    iget-object v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionData:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    int-to-float v2, v2

    int-to-float v3, v3

    invoke-virtual {p1, v4, v2, v3, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 12
    :goto_1
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mNextCellWidth:F

    iget v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellWidth:F

    add-float/2addr v1, v2

    iput v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mNextCellWidth:F

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 13
    :cond_2
    iget p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellWidth:F

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mNextCellWidth:F

    return-void
.end method

.method private drawStateNumberText(Landroid/graphics/Canvas;I)V
    .locals 9

    .line 1
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_2

    .line 2
    iget v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    iget-boolean v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCheckStateCompleted:Z

    invoke-direct {p0, v2, v1, v3}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->selectPaintType(IIZ)Landroid/graphics/Paint;

    move-result-object v2

    .line 3
    iget v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellWidth:F

    add-int/lit8 v4, v1, 0x1

    int-to-float v5, v4

    mul-float/2addr v5, v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v3, v6

    sub-float/2addr v5, v3

    float-to-int v3, v5

    .line 4
    iget v5, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellHeight:F

    div-float/2addr v5, v6

    invoke-virtual {v2}, Landroid/graphics/Paint;->descent()F

    move-result v7

    invoke-virtual {v2}, Landroid/graphics/Paint;->ascent()F

    move-result v8

    add-float/2addr v7, v8

    div-float/2addr v7, v6

    sub-float/2addr v5, v7

    float-to-int v5, v5

    .line 5
    iget v7, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    invoke-direct {p0, v7, v1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->isCheckIconUsed(II)Z

    move-result v1

    .line 6
    iget-boolean v7, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCheckStateCompleted:Z

    if-eqz v7, :cond_0

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v6, Lcom/kofigyan/stateprogressbar/R$string;->check_icon:I

    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    int-to-float v3, v3

    int-to-float v5, v5

    invoke-virtual {p1, v1, v3, v5, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->getCurrentStateNumber()I

    move-result v1

    if-ne v4, v1, :cond_1

    .line 9
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 10
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 11
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    int-to-float v3, v3

    int-to-float v5, v5

    invoke-virtual {p1, v1, v3, v5, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 12
    :cond_1
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    sub-float/2addr v1, v6

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 13
    iget-object v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCheckFont:Landroid/graphics/Typeface;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 14
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    int-to-float v3, v3

    int-to-float v5, v5

    invoke-virtual {p1, v1, v3, v5, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :goto_1
    move v1, v4

    goto :goto_0

    :cond_2
    return-void
.end method

.method private getCellHeight()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateRadius:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mSpacing:F

    float-to-int v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method private getDesiredHeight()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionData:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateRadius:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mSpacing:F

    :goto_0
    float-to-int v1, v1

    add-int/2addr v0, v1

    return v0

    .line 3
    :cond_0
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateRadius:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    const-wide v1, 0x3ff4cccccccccccdL    # 1.3

    iget v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionSize:F

    float-to-double v3, v3

    mul-double/2addr v3, v1

    double-to-int v1, v3

    add-int/2addr v0, v1

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mSpacing:F

    float-to-int v1, v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceDecrementer:F

    float-to-int v1, v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceIncrementer:F

    goto :goto_0
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->initStateProgressBar(Landroid/content/Context;)V

    .line 2
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionSize:F

    invoke-direct {p0, v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->convertSpToPixel(F)F

    move-result v0

    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionSize:F

    .line 3
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    invoke-direct {p0, v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->convertDpToPixel(F)F

    move-result v0

    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    .line 4
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mSpacing:F

    invoke-direct {p0, v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->convertDpToPixel(F)F

    move-result v0

    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mSpacing:F

    .line 5
    invoke-static {p1}, Ls50;->a(Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCheckFont:Landroid/graphics/Typeface;

    if-eqz p2, :cond_1

    .line 6
    sget-object v0, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 7
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_stateBackgroundColor:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundColor:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundColor:I

    .line 8
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_stateForegroundColor:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundColor:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundColor:I

    .line 9
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_stateNumberBackgroundColor:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberBackgroundColor:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberBackgroundColor:I

    .line 10
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_stateNumberForegroundColor:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberForegroundColor:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberForegroundColor:I

    .line 11
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_currentStateDescriptionColor:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateDescriptionColor:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateDescriptionColor:I

    .line 12
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_stateDescriptionColor:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionColor:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionColor:I

    .line 13
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_currentStateNumber:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    .line 14
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_maxStateNumber:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    .line 15
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_stateSize:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    .line 16
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_stateTextSize:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    .line 17
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_stateDescriptionSize:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionSize:F

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionSize:F

    .line 18
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_stateLineThickness:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    .line 19
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_checkStateCompleted:I

    iget-boolean p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCheckStateCompleted:Z

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCheckStateCompleted:Z

    .line 20
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_animateToCurrentProgressState:I

    iget-boolean p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimateToCurrentProgressState:Z

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimateToCurrentProgressState:Z

    .line 21
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_enableAllStatesCompleted:I

    iget-boolean p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEnableAllStatesCompleted:Z

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEnableAllStatesCompleted:Z

    .line 22
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_descriptionTopSpaceDecrementer:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceDecrementer:F

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceDecrementer:F

    .line 23
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_descriptionTopSpaceIncrementer:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceIncrementer:F

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceIncrementer:F

    .line 24
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_animationDuration:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimDuration:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimDuration:I

    .line 25
    sget p2, Lcom/kofigyan/stateprogressbar/R$styleable;->StateProgressBar_spb_animationStartDelay:I

    iget p3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimStartDelay:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimStartDelay:I

    .line 26
    iget-boolean p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimateToCurrentProgressState:Z

    if-nez p2, :cond_0

    .line 27
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->stopAnimation()V

    .line 28
    :cond_0
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->resolveStateSize()V

    .line 29
    iget p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    invoke-direct {p0, p2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->validateLineThickness(F)V

    .line 30
    iget p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    invoke-direct {p0, p2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->validateStateNumber(I)V

    .line 31
    iget p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p2, p3

    iput p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateRadius:F

    .line 32
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1
    return-void
.end method

.method private initStateProgressBar(Landroid/content/Context;)V
    .locals 3

    .line 1
    sget v0, Lcom/kofigyan/stateprogressbar/R$color;->background_color:I

    invoke-static {p1, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundColor:I

    .line 2
    sget v0, Lcom/kofigyan/stateprogressbar/R$color;->foreground_color:I

    invoke-static {p1, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundColor:I

    .line 3
    sget v1, Lcom/kofigyan/stateprogressbar/R$color;->background_text_color:I

    invoke-static {p1, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    iput v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberBackgroundColor:I

    .line 4
    sget v2, Lcom/kofigyan/stateprogressbar/R$color;->foreground_text_color:I

    invoke-static {p1, v2}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    iput v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberForegroundColor:I

    .line 5
    invoke-static {p1, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateDescriptionColor:I

    .line 6
    invoke-static {p1, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionColor:I

    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    .line 9
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    const/high16 v1, 0x41700000    # 15.0f

    .line 10
    iput v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionSize:F

    .line 11
    sget-object v1, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->FIVE:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    invoke-virtual {v1}, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->getValue()I

    move-result v1

    iput v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    .line 12
    sget-object v1, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->ONE:Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;

    invoke-virtual {v1}, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->getValue()I

    move-result v1

    iput v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    .line 13
    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mSpacing:F

    .line 14
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceDecrementer:F

    .line 15
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceIncrementer:F

    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCheckStateCompleted:Z

    .line 17
    iput-boolean p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimateToCurrentProgressState:Z

    .line 18
    iput-boolean p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEnableAllStatesCompleted:Z

    const/16 p1, 0x64

    .line 19
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimStartDelay:I

    const/16 p1, 0xfa0

    .line 20
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimDuration:I

    return-void
.end method

.method private initializePainters()V
    .locals 4

    .line 1
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    .line 2
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    iget v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundColor:I

    invoke-direct {p0, v1, v2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setPaintAttributes(FI)Landroid/graphics/Paint;

    move-result-object v1

    iput-object v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundPaint:Landroid/graphics/Paint;

    .line 3
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    iget v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundColor:I

    invoke-direct {p0, v1, v2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setPaintAttributes(FI)Landroid/graphics/Paint;

    move-result-object v1

    iput-object v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundPaint:Landroid/graphics/Paint;

    .line 4
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    iget v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberForegroundColor:I

    invoke-direct {p0, v1, v2, v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setPaintAttributes(FILandroid/graphics/Typeface;)Landroid/graphics/Paint;

    move-result-object v1

    iput-object v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberForegroundPaint:Landroid/graphics/Paint;

    .line 5
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    iget v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberForegroundColor:I

    iget-object v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCheckFont:Landroid/graphics/Typeface;

    invoke-direct {p0, v1, v2, v3}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setPaintAttributes(FILandroid/graphics/Typeface;)Landroid/graphics/Paint;

    move-result-object v1

    iput-object v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateCheckedForegroundPaint:Landroid/graphics/Paint;

    .line 6
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    iget v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberBackgroundColor:I

    invoke-direct {p0, v1, v2, v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setPaintAttributes(FILandroid/graphics/Typeface;)Landroid/graphics/Paint;

    move-result-object v1

    iput-object v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberBackgroundPaint:Landroid/graphics/Paint;

    .line 7
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionSize:F

    iget v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateDescriptionColor:I

    invoke-direct {p0, v1, v2, v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setPaintAttributes(FILandroid/graphics/Typeface;)Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateDescriptionPaint:Landroid/graphics/Paint;

    .line 8
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionSize:F

    const/high16 v1, 0x40000000    # 2.0f

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionColor:I

    iget-object v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCheckFont:Landroid/graphics/Typeface;

    invoke-direct {p0, v0, v1, v2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setPaintAttributes(FILandroid/graphics/Typeface;)Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionPaint:Landroid/graphics/Paint;

    return-void
.end method

.method private isCheckIconUsed(II)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEnableAllStatesCompleted:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    add-int/2addr p2, v1

    if-ge p2, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method private resetStateAnimationData()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStartCenterX:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-gtz v2, :cond_0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    :cond_0
    iput v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStartCenterX:F

    .line 2
    :cond_1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEndCenterX:F

    cmpl-float v2, v0, v1

    if-gtz v2, :cond_2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    :cond_2
    iput v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEndCenterX:F

    .line 3
    :cond_3
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimEndXPos:F

    cmpl-float v2, v0, v1

    if-gtz v2, :cond_4

    cmpg-float v0, v0, v1

    if-gez v0, :cond_5

    :cond_4
    iput v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimEndXPos:F

    .line 4
    :cond_5
    iget-boolean v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mIsCurrentAnimStarted:Z

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mIsCurrentAnimStarted:Z

    :cond_6
    return-void
.end method

.method private resetStateSizeValues()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->resolveStateSize()V

    .line 2
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberForegroundPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 3
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberBackgroundPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 4
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateCheckedForegroundPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 5
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateRadius:F

    .line 6
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    invoke-direct {p0, v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->validateLineThickness(F)V

    .line 7
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 8
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method private resolveStateSize()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    iget v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    cmpl-float v1, v4, v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-direct {p0, v0, v2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->resolveStateSize(ZZ)V

    return-void
.end method

.method private resolveStateSize(ZZ)V
    .locals 0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    const/high16 p1, 0x41c80000    # 25.0f

    .line 2
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->convertDpToPixel(F)F

    move-result p1

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    const/high16 p1, 0x41700000    # 15.0f

    .line 3
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->convertSpToPixel(F)F

    move-result p1

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->validateStateSize()V

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    .line 5
    iget p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    const/high16 p2, 0x40000000    # 2.0f

    div-float p2, p1, p2

    add-float/2addr p1, p2

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    goto :goto_0

    .line 6
    :cond_2
    iget p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    const/high16 p2, 0x3ec00000    # 0.375f

    mul-float/2addr p2, p1

    sub-float/2addr p1, p2

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    :goto_0
    return-void
.end method

.method private selectDescriptionPaint(II)Landroid/graphics/Paint;
    .locals 0

    add-int/lit8 p2, p2, 0x1

    if-ne p2, p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateDescriptionPaint:Landroid/graphics/Paint;

    return-object p1

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionPaint:Landroid/graphics/Paint;

    return-object p1
.end method

.method private selectPaintType(IIZ)Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEnableAllStatesCompleted:Z

    if-eqz v0, :cond_0

    if-nez p3, :cond_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    if-ge p2, p1, :cond_2

    if-eqz p3, :cond_2

    .line 2
    :cond_1
    iget-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateCheckedForegroundPaint:Landroid/graphics/Paint;

    return-object p1

    :cond_2
    if-eq p2, p1, :cond_4

    if-ge p2, p1, :cond_3

    if-nez p3, :cond_3

    goto :goto_0

    .line 3
    :cond_3
    iget-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberBackgroundPaint:Landroid/graphics/Paint;

    return-object p1

    .line 4
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberForegroundPaint:Landroid/graphics/Paint;

    return-object p1
.end method

.method private setAnimatorStartEndCenterX()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    const/4 v2, 0x6

    if-ge v0, v2, :cond_1

    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    sub-int/2addr v2, v1

    if-ge v0, v2, :cond_2

    const/high16 v2, 0x40000000    # 2.0f

    if-nez v0, :cond_0

    .line 3
    iget v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mNextCellWidth:F

    iget v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellWidth:F

    div-float/2addr v4, v2

    sub-float/2addr v3, v4

    iput v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStartCenterX:F

    goto :goto_1

    .line 4
    :cond_0
    iget v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEndCenterX:F

    iput v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStartCenterX:F

    .line 5
    :goto_1
    iget v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mNextCellWidth:F

    iget v4, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellWidth:F

    add-float/2addr v3, v4

    iput v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mNextCellWidth:F

    div-float/2addr v4, v2

    sub-float/2addr v3, v4

    .line 6
    iput v3, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEndCenterX:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 7
    :cond_1
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->resetStateAnimationData()V

    :cond_2
    return-void
.end method

.method private setPaintAttributes(FI)Landroid/graphics/Paint;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 2
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 4
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    return-object v0
.end method

.method private setPaintAttributes(FILandroid/graphics/Typeface;)Landroid/graphics/Paint;
    .locals 2

    .line 5
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 6
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 7
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-object v0
.end method

.method private startAnimator()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;

    invoke-direct {v0, p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;-><init>(Lcom/kofigyan/stateprogressbar/StateProgressBar;)V

    iput-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimator:Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;

    .line 2
    invoke-virtual {v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->start()V

    return-void
.end method

.method private stopAnimation()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimator:Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;->stop()V

    :cond_0
    return-void
.end method

.method private updateCheckAllStatesValues(Z)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCheckStateCompleted:Z

    .line 2
    iget p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    .line 3
    iget-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionPaint:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateDescriptionPaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionPaint:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    :goto_0
    return-void
.end method

.method private validateLineThickness(F)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    .line 2
    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    :cond_0
    return-void
.end method

.method private validateStateNumber(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    if-gt p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0xeb2

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const p1, 0xeb3

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private validateStateSize()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v1, v0

    add-float/2addr v1, v0

    .line 2
    iput v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    :cond_0
    return-void
.end method


# virtual methods
.method public checkStateCompleted(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCheckStateCompleted:Z

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public enableAnimationToCurrentState(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimateToCurrentProgressState:Z

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimator:Lcom/kofigyan/stateprogressbar/StateProgressBar$Animator;

    if-nez p1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->startAnimator()V

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public getAnimationDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimDuration:I

    return v0
.end method

.method public getAnimationStartDelay()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimStartDelay:I

    return v0
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundColor:I

    return v0
.end method

.method public getCurrentStateDescriptionColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateDescriptionColor:I

    return v0
.end method

.method public getCurrentStateNumber()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    return v0
.end method

.method public getDescriptionTopSpaceDecrementer()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceDecrementer:F

    return v0
.end method

.method public getDescriptionTopSpaceIncrementer()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceIncrementer:F

    return v0
.end method

.method public getForegroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundColor:I

    return v0
.end method

.method public getMaxStateNumber()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    return v0
.end method

.method public getStateDescriptionColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionColor:I

    return v0
.end method

.method public getStateDescriptionData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionData:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getStateLineThickness()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    return v0
.end method

.method public getStateNumberBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberBackgroundColor:I

    return v0
.end method

.method public getStateNumberForegroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberForegroundColor:I

    return v0
.end method

.method public getStateNumberTextSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    return v0
.end method

.method public getStateSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->startAnimator()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->stopAnimation()V

    .line 2
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->drawState(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->getDesiredHeight()I

    move-result p2

    .line 3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 4
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 5
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->getCellHeight()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellHeight:F

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Landroid/os/Bundle;

    const v0, 0xeb4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEndCenterX:F

    const v0, 0xeb5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStartCenterX:F

    const v0, 0xeb6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimStartXPos:F

    const v0, 0xeb7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimEndXPos:F

    const v0, 0xeb8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mIsCurrentAnimStarted:Z

    const v0, 0xeb9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimateToCurrentProgressState:Z

    const v0, 0xeba

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    .line 10
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    const v2, 0xebb

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 3
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEndCenterX:F

    const v2, 0xebc

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 4
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStartCenterX:F

    const v2, 0xebd

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 5
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimStartXPos:F

    const v2, 0xebe

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 6
    iget v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimEndXPos:F

    const v2, 0xebf

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 7
    iget-boolean v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mIsCurrentAnimStarted:Z

    const v2, 0xec0

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 8
    iget-boolean v1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimateToCurrentProgressState:Z

    const v2, 0xec1

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    iget p2, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    div-int/2addr p1, p2

    int-to-float p1, p1

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCellWidth:F

    .line 3
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mNextCellWidth:F

    return-void
.end method

.method public setAllStatesCompleted(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEnableAllStatesCompleted:Z

    .line 2
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->updateCheckAllStatesValues(Z)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setAnimationDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimDuration:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setAnimationStartDelay(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mAnimStartDelay:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundColor:I

    .line 2
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setCurrentStateDescriptionColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateDescriptionColor:I

    .line 2
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateDescriptionPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setCurrentStateNumber(Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->getValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->validateStateNumber(I)V

    .line 2
    invoke-virtual {p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->getValue()I

    move-result p1

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    .line 3
    iget-boolean p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEnableAllStatesCompleted:Z

    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->updateCheckAllStatesValues(Z)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setDescriptionTopSpaceDecrementer(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceDecrementer:F

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setDescriptionTopSpaceIncrementer(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mDescTopSpaceIncrementer:F

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setForegroundColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundColor:I

    .line 2
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMaxStateNumber(Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar$StateNumber;->getValue()I

    move-result p1

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mMaxStateNumber:I

    .line 2
    iget p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateNumber:I

    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->validateStateNumber(I)V

    .line 3
    iget-boolean p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mEnableAllStatesCompleted:Z

    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->updateCheckAllStatesValues(Z)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setStateDescriptionColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionColor:I

    .line 2
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setStateDescriptionData(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3
    iput-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionData:Ljava/util/ArrayList;

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setStateDescriptionData([Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionData:Ljava/util/ArrayList;

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setStateDescriptionSize(F)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->convertSpToPixel(F)F

    move-result p1

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionSize:F

    .line 2
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mCurrentStateDescriptionPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 3
    iget-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateDescriptionSize:F

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setStateLineThickness(F)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->convertDpToPixel(F)F

    move-result p1

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    .line 2
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->validateLineThickness(F)V

    .line 3
    iget-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mBackgroundPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 4
    iget-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mForegroundPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateLineThickness:F

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setStateNumberBackgroundColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberBackgroundColor:I

    .line 2
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberBackgroundPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setStateNumberForegroundColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberForegroundColor:I

    .line 2
    iget-object v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberForegroundPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    iget-object p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateCheckedForegroundPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberForegroundColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setStateNumberTextSize(F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->convertSpToPixel(F)F

    move-result p1

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateNumberTextSize:F

    .line 2
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->resetStateSizeValues()V

    return-void
.end method

.method public setStateSize(F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->convertDpToPixel(F)F

    move-result p1

    iput p1, p0, Lcom/kofigyan/stateprogressbar/StateProgressBar;->mStateSize:F

    .line 2
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->resetStateSizeValues()V

    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    invoke-direct {p0}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->startAnimator()V

    return-void
.end method
