.class public Lcom/upi/axispay/custom/PinEntryEditText;
.super Ld2;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;
    }
.end annotation


# static fields
.field private static final XML_NAMESPACE_ANDROID:Ljava/lang/String;


# instance fields
.field public mAnimate:Z

.field public mAnimatedType:I

.field public mCharBottom:[F

.field public mCharPaint:Landroid/graphics/Paint;

.field public mCharSize:F

.field public mClickListener:Landroid/view/View$OnClickListener;

.field public mColorStates:Landroid/content/res/ColorStateList;

.field public mColors:[I

.field public mHasError:Z

.field public mIsDigitSquare:Z

.field public mLastCharPaint:Landroid/graphics/Paint;

.field public mLineCoords:[Landroid/graphics/RectF;

.field public mLineStroke:F

.field public mLineStrokeSelected:F

.field public mLinesPaint:Landroid/graphics/Paint;

.field public mMask:Ljava/lang/String;

.field public mMaskChars:Ljava/lang/StringBuilder;

.field public mMaxLength:I

.field public mNumChars:F

.field public mOnPinEnteredListener:Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;

.field public mOriginalTextColors:Landroid/content/res/ColorStateList;

.field public mPinBackground:Landroid/graphics/drawable/Drawable;

.field public mSingleCharHint:Ljava/lang/String;

.field public mSingleCharPaint:Landroid/graphics/Paint;

.field public mSpace:F

.field public mStates:[[I

.field public mTextBottomPadding:F

.field public mTextHeight:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/upi/axispay/custom/PinEntryEditText;

    const v1, 0x186

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Ld2;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMask:Ljava/lang/String;

    .line 3
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaskChars:Ljava/lang/StringBuilder;

    .line 4
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSingleCharHint:Ljava/lang/String;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimatedType:I

    const/high16 v1, 0x41c00000    # 24.0f

    .line 6
    iput v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSpace:F

    const/high16 v1, 0x40800000    # 4.0f

    .line 7
    iput v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mNumChars:F

    const/high16 v1, 0x41000000    # 8.0f

    .line 8
    iput v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextBottomPadding:F

    const/4 v1, 0x4

    .line 9
    iput v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaxLength:I

    .line 10
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextHeight:Landroid/graphics/Rect;

    .line 11
    iput-boolean v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mIsDigitSquare:Z

    .line 12
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mOnPinEnteredListener:Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 13
    iput p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStroke:F

    const/high16 p1, 0x40000000    # 2.0f

    .line 14
    iput p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStrokeSelected:F

    .line 15
    iput-boolean v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimate:Z

    .line 16
    iput-boolean v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mHasError:Z

    new-array p1, v1, [[I

    const/4 v2, 0x1

    new-array v3, v2, [I

    const v4, 0x10100a1

    aput v4, v3, v0

    aput-object v3, p1, v0

    new-array v3, v2, [I

    const v4, 0x10100a2

    aput v4, v3, v0

    aput-object v3, p1, v2

    new-array v3, v2, [I

    const v4, 0x101009c

    aput v4, v3, v0

    const/4 v4, 0x2

    aput-object v3, p1, v4

    new-array v2, v2, [I

    const v3, -0x101009c

    aput v3, v2, v0

    const/4 v0, 0x3

    aput-object v2, p1, v0

    .line 17
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mStates:[[I

    new-array p1, v1, [I

    .line 18
    fill-array-data p1, :array_0

    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColors:[I

    .line 19
    new-instance p1, Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mStates:[[I

    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColors:[I

    invoke-direct {p1, v0, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColorStates:Landroid/content/res/ColorStateList;

    return-void

    nop

    :array_0
    .array-data 4
        -0xff0100
        -0x10000
        -0x1000000
        -0x777778
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 20
    invoke-direct {p0, p1, p2}, Ld2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMask:Ljava/lang/String;

    .line 22
    iput-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaskChars:Ljava/lang/StringBuilder;

    .line 23
    iput-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSingleCharHint:Ljava/lang/String;

    const/4 v1, 0x0

    .line 24
    iput v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimatedType:I

    const/high16 v2, 0x41c00000    # 24.0f

    .line 25
    iput v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSpace:F

    const/high16 v2, 0x40800000    # 4.0f

    .line 26
    iput v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mNumChars:F

    const/high16 v2, 0x41000000    # 8.0f

    .line 27
    iput v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextBottomPadding:F

    const/4 v2, 0x4

    .line 28
    iput v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaxLength:I

    .line 29
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextHeight:Landroid/graphics/Rect;

    .line 30
    iput-boolean v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mIsDigitSquare:Z

    .line 31
    iput-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mOnPinEnteredListener:Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 32
    iput v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStroke:F

    const/high16 v0, 0x40000000    # 2.0f

    .line 33
    iput v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStrokeSelected:F

    .line 34
    iput-boolean v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimate:Z

    .line 35
    iput-boolean v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mHasError:Z

    new-array v0, v2, [[I

    const/4 v3, 0x1

    new-array v4, v3, [I

    const v5, 0x10100a1

    aput v5, v4, v1

    aput-object v4, v0, v1

    new-array v4, v3, [I

    const v5, 0x10100a2

    aput v5, v4, v1

    aput-object v4, v0, v3

    new-array v4, v3, [I

    const v5, 0x101009c

    aput v5, v4, v1

    const/4 v5, 0x2

    aput-object v4, v0, v5

    new-array v3, v3, [I

    const v4, -0x101009c

    aput v4, v3, v1

    const/4 v1, 0x3

    aput-object v3, v0, v1

    .line 36
    iput-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mStates:[[I

    new-array v0, v2, [I

    .line 37
    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColors:[I

    .line 38
    new-instance v0, Landroid/content/res/ColorStateList;

    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mStates:[[I

    iget-object v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColors:[I

    invoke-direct {v0, v1, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColorStates:Landroid/content/res/ColorStateList;

    .line 39
    invoke-direct {p0, p1, p2}, Lcom/upi/axispay/custom/PinEntryEditText;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void

    :array_0
    .array-data 4
        -0xff0100
        -0x10000
        -0x1000000
        -0x777778
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 40
    invoke-direct {p0, p1, p2, p3}, Ld2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 41
    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMask:Ljava/lang/String;

    .line 42
    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaskChars:Ljava/lang/StringBuilder;

    .line 43
    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSingleCharHint:Ljava/lang/String;

    const/4 v0, 0x0

    .line 44
    iput v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimatedType:I

    const/high16 v1, 0x41c00000    # 24.0f

    .line 45
    iput v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSpace:F

    const/high16 v1, 0x40800000    # 4.0f

    .line 46
    iput v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mNumChars:F

    const/high16 v1, 0x41000000    # 8.0f

    .line 47
    iput v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextBottomPadding:F

    const/4 v1, 0x4

    .line 48
    iput v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaxLength:I

    .line 49
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextHeight:Landroid/graphics/Rect;

    .line 50
    iput-boolean v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mIsDigitSquare:Z

    .line 51
    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mOnPinEnteredListener:Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;

    const/high16 p3, 0x3f800000    # 1.0f

    .line 52
    iput p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStroke:F

    const/high16 p3, 0x40000000    # 2.0f

    .line 53
    iput p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStrokeSelected:F

    .line 54
    iput-boolean v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimate:Z

    .line 55
    iput-boolean v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mHasError:Z

    new-array p3, v1, [[I

    const/4 v2, 0x1

    new-array v3, v2, [I

    const v4, 0x10100a1

    aput v4, v3, v0

    aput-object v3, p3, v0

    new-array v3, v2, [I

    const v4, 0x10100a2

    aput v4, v3, v0

    aput-object v3, p3, v2

    new-array v3, v2, [I

    const v4, 0x101009c

    aput v4, v3, v0

    const/4 v4, 0x2

    aput-object v3, p3, v4

    new-array v2, v2, [I

    const v3, -0x101009c

    aput v3, v2, v0

    const/4 v0, 0x3

    aput-object v2, p3, v0

    .line 56
    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mStates:[[I

    new-array p3, v1, [I

    .line 57
    fill-array-data p3, :array_0

    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColors:[I

    .line 58
    new-instance p3, Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mStates:[[I

    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColors:[I

    invoke-direct {p3, v0, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColorStates:Landroid/content/res/ColorStateList;

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/upi/axispay/custom/PinEntryEditText;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void

    :array_0
    .array-data 4
        -0xff0100
        -0x10000
        -0x1000000
        -0x777778
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 60
    invoke-direct {p0, p1, p2, p3}, Ld2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 61
    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMask:Ljava/lang/String;

    .line 62
    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaskChars:Ljava/lang/StringBuilder;

    .line 63
    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSingleCharHint:Ljava/lang/String;

    const/4 p4, 0x0

    .line 64
    iput p4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimatedType:I

    const/high16 v0, 0x41c00000    # 24.0f

    .line 65
    iput v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSpace:F

    const/high16 v0, 0x40800000    # 4.0f

    .line 66
    iput v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mNumChars:F

    const/high16 v0, 0x41000000    # 8.0f

    .line 67
    iput v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextBottomPadding:F

    const/4 v0, 0x4

    .line 68
    iput v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaxLength:I

    .line 69
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextHeight:Landroid/graphics/Rect;

    .line 70
    iput-boolean p4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mIsDigitSquare:Z

    .line 71
    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mOnPinEnteredListener:Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;

    const/high16 p3, 0x3f800000    # 1.0f

    .line 72
    iput p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStroke:F

    const/high16 p3, 0x40000000    # 2.0f

    .line 73
    iput p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStrokeSelected:F

    .line 74
    iput-boolean p4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimate:Z

    .line 75
    iput-boolean p4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mHasError:Z

    new-array p3, v0, [[I

    const/4 v1, 0x1

    new-array v2, v1, [I

    const v3, 0x10100a1

    aput v3, v2, p4

    aput-object v2, p3, p4

    new-array v2, v1, [I

    const v3, 0x10100a2

    aput v3, v2, p4

    aput-object v2, p3, v1

    new-array v2, v1, [I

    const v3, 0x101009c

    aput v3, v2, p4

    const/4 v3, 0x2

    aput-object v2, p3, v3

    new-array v1, v1, [I

    const v2, -0x101009c

    aput v2, v1, p4

    const/4 p4, 0x3

    aput-object v1, p3, p4

    .line 76
    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mStates:[[I

    new-array p3, v0, [I

    .line 77
    fill-array-data p3, :array_0

    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColors:[I

    .line 78
    new-instance p3, Landroid/content/res/ColorStateList;

    iget-object p4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mStates:[[I

    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColors:[I

    invoke-direct {p3, p4, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColorStates:Landroid/content/res/ColorStateList;

    .line 79
    invoke-direct {p0, p1, p2}, Lcom/upi/axispay/custom/PinEntryEditText;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void

    :array_0
    .array-data 4
        -0xff0100
        -0x10000
        -0x1000000
        -0x777778
    .end array-data
.end method

.method private animateBottomUp(Ljava/lang/CharSequence;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharBottom:[F

    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineCoords:[Landroid/graphics/RectF;

    aget-object v1, v1, p2

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    iget v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextBottomPadding:F

    sub-float/2addr v1, v2

    aput v1, v0, p2

    const/4 v1, 0x2

    new-array v2, v1, [F

    .line 2
    aget v0, v0, p2

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-virtual {v3}, Landroid/text/TextPaint;->getTextSize()F

    move-result v3

    add-float/2addr v0, v3

    const/4 v3, 0x0

    aput v0, v2, v3

    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharBottom:[F

    aget v0, v0, p2

    const/4 v4, 0x1

    aput v0, v2, v4

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v5, 0x12c

    .line 3
    invoke-virtual {v0, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 4
    new-instance v2, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v2}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 5
    new-instance v2, Lcom/upi/axispay/custom/PinEntryEditText$6;

    invoke-direct {v2, p0, p2}, Lcom/upi/axispay/custom/PinEntryEditText$6;-><init>(Lcom/upi/axispay/custom/PinEntryEditText;I)V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 6
    iget-object p2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLastCharPaint:Landroid/graphics/Paint;

    const/16 v2, 0xff

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    new-array p2, v1, [I

    .line 7
    fill-array-data p2, :array_0

    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object p2

    .line 8
    invoke-virtual {p2, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 9
    new-instance v2, Lcom/upi/axispay/custom/PinEntryEditText$7;

    invoke-direct {v2, p0}, Lcom/upi/axispay/custom/PinEntryEditText$7;-><init>(Lcom/upi/axispay/custom/PinEntryEditText;)V

    invoke-virtual {p2, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 10
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iget v5, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaxLength:I

    if-ne p1, v5, :cond_0

    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mOnPinEnteredListener:Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;

    if-eqz p1, :cond_0

    .line 12
    new-instance p1, Lcom/upi/axispay/custom/PinEntryEditText$8;

    invoke-direct {p1, p0}, Lcom/upi/axispay/custom/PinEntryEditText$8;-><init>(Lcom/upi/axispay/custom/PinEntryEditText;)V

    invoke-virtual {v2, p1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_0
    new-array p1, v1, [Landroid/animation/Animator;

    aput-object v0, p1, v3

    aput-object p2, p1, v4

    .line 13
    invoke-virtual {v2, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 14
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0xff
    .end array-data
.end method

.method private animatePopIn()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSize()F

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0xc8

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 3
    new-instance v1, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v1}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 4
    new-instance v1, Lcom/upi/axispay/custom/PinEntryEditText$4;

    invoke-direct {v1, p0}, Lcom/upi/axispay/custom/PinEntryEditText$4;-><init>(Lcom/upi/axispay/custom/PinEntryEditText;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 5
    invoke-virtual {p0}, Ld2;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    iget v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaxLength:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mOnPinEnteredListener:Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;

    if-eqz v1, :cond_0

    .line 6
    new-instance v1, Lcom/upi/axispay/custom/PinEntryEditText$5;

    invoke-direct {v1, p0}, Lcom/upi/axispay/custom/PinEntryEditText$5;-><init>(Lcom/upi/axispay/custom/PinEntryEditText;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private varargs getColorForState([I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColorStates:Landroid/content/res/ColorStateList;

    const v1, -0x777778

    invoke-virtual {v0, p1, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    return p1
.end method

.method private getFullText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMask:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Ld2;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/upi/axispay/custom/PinEntryEditText;->getMaskChars()Ljava/lang/StringBuilder;

    move-result-object v0

    return-object v0
.end method

.method private getMaskChars()Ljava/lang/StringBuilder;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaskChars:Ljava/lang/StringBuilder;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaskChars:Ljava/lang/StringBuilder;

    .line 3
    :cond_0
    invoke-virtual {p0}, Ld2;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    .line 4
    :goto_0
    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaskChars:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-eq v1, v0, :cond_2

    .line 5
    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaskChars:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-ge v1, v0, :cond_1

    .line 6
    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaskChars:Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMask:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaskChars:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaskChars:Ljava/lang/StringBuilder;

    return-object v0
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 2
    iget v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStroke:F

    mul-float/2addr v2, v1

    iput v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStroke:F

    .line 3
    iget v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStrokeSelected:F

    mul-float/2addr v2, v1

    iput v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStrokeSelected:F

    .line 4
    iget v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSpace:F

    mul-float/2addr v2, v1

    iput v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSpace:F

    .line 5
    iget v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextBottomPadding:F

    mul-float/2addr v1, v2

    iput v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextBottomPadding:F

    .line 6
    sget-object v1, Lz80;->PinEntryEditText:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 7
    :try_start_0
    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    const/4 v4, 0x4

    .line 8
    invoke-virtual {v1, v4, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 9
    iget v3, v3, Landroid/util/TypedValue;->data:I

    iput v3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimatedType:I

    const/4 v3, 0x2

    .line 10
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMask:Ljava/lang/String;

    const/16 v4, 0x8

    .line 11
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSingleCharHint:Ljava/lang/String;

    .line 12
    iget v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStroke:F

    const/4 v5, 0x6

    invoke-virtual {v1, v5, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStroke:F

    const/4 v4, 0x7

    .line 13
    iget v6, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStrokeSelected:F

    invoke-virtual {v1, v4, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStrokeSelected:F

    const/4 v4, 0x3

    .line 14
    iget v6, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSpace:F

    invoke-virtual {v1, v4, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSpace:F

    const/16 v4, 0x9

    .line 15
    iget v6, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextBottomPadding:F

    invoke-virtual {v1, v4, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextBottomPadding:F

    .line 16
    iget-boolean v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mIsDigitSquare:Z

    const/4 v6, 0x1

    invoke-virtual {v1, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mIsDigitSquare:Z

    .line 17
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mPinBackground:Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x5

    .line 18
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 19
    iput-object v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColorStates:Landroid/content/res/ColorStateList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 21
    new-instance v1, Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharPaint:Landroid/graphics/Paint;

    .line 22
    new-instance v1, Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLastCharPaint:Landroid/graphics/Paint;

    .line 23
    new-instance v1, Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSingleCharPaint:Landroid/graphics/Paint;

    .line 24
    new-instance v1, Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLinesPaint:Landroid/graphics/Paint;

    .line 25
    iget v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStroke:F

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 26
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    const v7, 0x7f0400db

    invoke-virtual {v4, v7, v1, v6}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 28
    iget v1, v1, Landroid/util/TypedValue;->data:I

    .line 29
    iget-object v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColors:[I

    aput v1, v4, v2

    .line 30
    invoke-virtual {p0}, Landroid/widget/EditText;->isInEditMode()Z

    move-result v1

    const v4, -0x777778

    const v7, 0x7f060044

    if-eqz v1, :cond_1

    move v1, v4

    goto :goto_0

    :cond_1
    invoke-static {p1, v7}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    .line 31
    :goto_0
    iget-object v8, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColors:[I

    aput v1, v8, v6

    .line 32
    invoke-virtual {p0}, Landroid/widget/EditText;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1, v7}, Lt8;->d(Landroid/content/Context;I)I

    move-result v4

    .line 33
    :goto_1
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mColors:[I

    aput v4, p1, v3

    .line 34
    invoke-virtual {p0, v2}, Ld2;->setBackgroundResource(I)V

    const v0, 0x2f82

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x2f83

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 35
    invoke-interface {p2, p1, v1, v5}, Landroid/util/AttributeSet;->getAttributeIntValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaxLength:I

    int-to-float p1, p1

    .line 36
    iput p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mNumChars:F

    .line 37
    new-instance p1, Lcom/upi/axispay/custom/PinEntryEditText$1;

    invoke-direct {p1, p0}, Lcom/upi/axispay/custom/PinEntryEditText$1;-><init>(Lcom/upi/axispay/custom/PinEntryEditText;)V

    invoke-super {p0, p1}, Ld2;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 38
    new-instance p1, Lcom/upi/axispay/custom/PinEntryEditText$2;

    invoke-direct {p1, p0}, Lcom/upi/axispay/custom/PinEntryEditText$2;-><init>(Lcom/upi/axispay/custom/PinEntryEditText;)V

    invoke-super {p0, p1}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    new-instance p1, Lcom/upi/axispay/custom/PinEntryEditText$3;

    invoke-direct {p1, p0}, Lcom/upi/axispay/custom/PinEntryEditText$3;-><init>(Lcom/upi/axispay/custom/PinEntryEditText;)V

    invoke-super {p0, p1}, Landroid/widget/EditText;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 40
    invoke-virtual {p0}, Landroid/widget/EditText;->getInputType()I

    move-result p1

    const/16 p2, 0x80

    and-int/2addr p1, p2

    const v0, 0x2f84

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-ne p1, p2, :cond_3

    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMask:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 41
    iput-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMask:Ljava/lang/String;

    goto :goto_2

    .line 42
    :cond_3
    invoke-virtual {p0}, Landroid/widget/EditText;->getInputType()I

    move-result p1

    const/16 p2, 0x10

    and-int/2addr p1, p2

    if-ne p1, p2, :cond_4

    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMask:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 43
    iput-object v1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMask:Ljava/lang/String;

    .line 44
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMask:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 45
    invoke-direct {p0}, Lcom/upi/axispay/custom/PinEntryEditText;->getMaskChars()Ljava/lang/StringBuilder;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaskChars:Ljava/lang/StringBuilder;

    .line 46
    :cond_5
    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object p1

    iget-object p2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextHeight:Landroid/graphics/Rect;

    const v0, 0x2f85

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v2, v6, p2}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 47
    iget p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimatedType:I

    const/4 p2, -0x1

    if-le p1, p2, :cond_6

    move v2, v6

    :cond_6
    iput-boolean v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimate:Z

    return-void

    :catchall_0
    move-exception p1

    .line 48
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 49
    throw p1
.end method


# virtual methods
.method public focus()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->requestFocus()Z

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x2f86

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :cond_0
    return-void
.end method

.method public isError()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mHasError:Z

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    .line 1
    invoke-direct/range {p0 .. p0}, Lcom/upi/axispay/custom/PinEntryEditText;->getFullText()Ljava/lang/CharSequence;

    move-result-object v9

    .line 2
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v10

    .line 3
    new-array v11, v10, [F

    .line 4
    invoke-virtual/range {p0 .. p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    const/4 v12, 0x0

    invoke-virtual {v1, v9, v12, v10, v11}, Landroid/text/TextPaint;->getTextWidths(Ljava/lang/CharSequence;II[F)I

    .line 5
    iget-object v1, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mSingleCharHint:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    new-array v3, v1, [F

    .line 7
    invoke-virtual/range {p0 .. p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v4

    iget-object v5, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mSingleCharHint:Ljava/lang/String;

    invoke-virtual {v4, v5, v3}, Landroid/text/TextPaint;->getTextWidths(Ljava/lang/String;[F)I

    move v4, v12

    :goto_0
    if-ge v4, v1, :cond_0

    .line 8
    aget v5, v3, v4

    add-float/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    move v13, v2

    move v14, v12

    :goto_1
    int-to-float v1, v14

    .line 9
    iget v2, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mNumChars:F

    cmpg-float v1, v1, v2

    if-gez v1, :cond_a

    .line 10
    iget-object v1, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mPinBackground:Landroid/graphics/drawable/Drawable;

    const/4 v15, 0x1

    if-eqz v1, :cond_3

    if-ge v14, v10, :cond_1

    move v1, v15

    goto :goto_2

    :cond_1
    move v1, v12

    :goto_2
    if-ne v14, v10, :cond_2

    move v2, v15

    goto :goto_3

    :cond_2
    move v2, v12

    .line 11
    :goto_3
    invoke-virtual {v0, v1, v2}, Lcom/upi/axispay/custom/PinEntryEditText;->updateDrawableState(ZZ)V

    .line 12
    iget-object v1, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mPinBackground:Landroid/graphics/drawable/Drawable;

    iget-object v2, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineCoords:[Landroid/graphics/RectF;

    aget-object v3, v2, v14

    iget v3, v3, Landroid/graphics/RectF;->left:F

    float-to-int v3, v3

    aget-object v4, v2, v14

    iget v4, v4, Landroid/graphics/RectF;->top:F

    float-to-int v4, v4

    aget-object v5, v2, v14

    iget v5, v5, Landroid/graphics/RectF;->right:F

    float-to-int v5, v5

    aget-object v2, v2, v14

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    float-to-int v2, v2

    invoke-virtual {v1, v3, v4, v5, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 13
    iget-object v1, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mPinBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v8}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 14
    :cond_3
    iget-object v1, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineCoords:[Landroid/graphics/RectF;

    aget-object v1, v1, v14

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget v2, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharSize:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    if-le v10, v14, :cond_6

    .line 15
    iget-boolean v2, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimate:Z

    if-eqz v2, :cond_5

    add-int/lit8 v2, v10, -0x1

    if-eq v14, v2, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v4, v14, 0x1

    .line 16
    aget v2, v11, v14

    div-float/2addr v2, v3

    sub-float v5, v1, v2

    iget-object v1, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharBottom:[F

    aget v6, v1, v14

    iget-object v7, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mLastCharPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object v2, v9

    move v3, v14

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    goto :goto_5

    :cond_5
    :goto_4
    add-int/lit8 v4, v14, 0x1

    .line 17
    aget v2, v11, v14

    div-float/2addr v2, v3

    sub-float v5, v1, v2

    iget-object v1, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharBottom:[F

    aget v6, v1, v14

    iget-object v7, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object v2, v9

    move v3, v14

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    goto :goto_5

    .line 18
    :cond_6
    iget-object v2, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mSingleCharHint:Ljava/lang/String;

    if-eqz v2, :cond_7

    div-float v3, v13, v3

    sub-float/2addr v1, v3

    .line 19
    iget-object v3, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharBottom:[F

    aget v3, v3, v14

    iget-object v4, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mSingleCharPaint:Landroid/graphics/Paint;

    invoke-virtual {v8, v2, v1, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 20
    :cond_7
    :goto_5
    iget-object v1, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mPinBackground:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_9

    if-gt v14, v10, :cond_8

    goto :goto_6

    :cond_8
    move v15, v12

    .line 21
    :goto_6
    invoke-virtual {v0, v15}, Lcom/upi/axispay/custom/PinEntryEditText;->updateColorForLines(Z)V

    .line 22
    iget-object v1, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineCoords:[Landroid/graphics/RectF;

    aget-object v2, v1, v14

    iget v2, v2, Landroid/graphics/RectF;->left:F

    aget-object v3, v1, v14

    iget v3, v3, Landroid/graphics/RectF;->top:F

    aget-object v4, v1, v14

    iget v4, v4, Landroid/graphics/RectF;->right:F

    aget-object v1, v1, v14

    iget v5, v1, Landroid/graphics/RectF;->bottom:F

    iget-object v6, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mLinesPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_9
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_1

    :cond_a
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/EditText;->onSizeChanged(IIII)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mOriginalTextColors:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_0

    .line 3
    iget-object p2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLastCharPaint:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharPaint:Landroid/graphics/Paint;

    iget-object p2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mOriginalTextColors:Landroid/content/res/ColorStateList;

    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 5
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSingleCharPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/EditText;->getCurrentHintTextColor()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result p1

    invoke-static {p0}, Lac;->H(Landroid/view/View;)I

    move-result p2

    sub-int/2addr p1, p2

    invoke-static {p0}, Lac;->I(Landroid/view/View;)I

    move-result p2

    sub-int/2addr p1, p2

    .line 7
    iget p2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSpace:F

    const/4 p3, 0x0

    cmpg-float p4, p2, p3

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, 0x40000000    # 2.0f

    if-gez p4, :cond_1

    int-to-float p1, p1

    .line 8
    iget p2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mNumChars:F

    mul-float/2addr p2, v1

    sub-float/2addr p2, v0

    div-float/2addr p1, p2

    iput p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharSize:F

    goto :goto_0

    :cond_1
    int-to-float p1, p1

    .line 9
    iget p4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mNumChars:F

    sub-float v0, p4, v0

    mul-float/2addr p2, v0

    sub-float/2addr p1, p2

    div-float/2addr p1, p4

    iput p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharSize:F

    .line 10
    :goto_0
    iget p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mNumChars:F

    float-to-int p2, p1

    new-array p2, p2, [Landroid/graphics/RectF;

    iput-object p2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineCoords:[Landroid/graphics/RectF;

    float-to-int p1, p1

    .line 11
    new-array p1, p1, [F

    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharBottom:[F

    .line 12
    invoke-virtual {p0}, Landroid/widget/EditText;->getHeight()I

    move-result p1

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingBottom()I

    move-result p2

    sub-int/2addr p1, p2

    .line 13
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    invoke-static {p2}, Lva;->b(Ljava/util/Locale;)I

    move-result p2

    const/4 p4, 0x0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    move p2, v0

    goto :goto_1

    :cond_2
    move p2, p4

    :goto_1
    if-eqz p2, :cond_3

    const/4 v0, -0x1

    .line 14
    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result p2

    invoke-static {p0}, Lac;->I(Landroid/view/View;)I

    move-result v2

    sub-int/2addr p2, v2

    int-to-float p2, p2

    iget v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharSize:F

    sub-float/2addr p2, v2

    float-to-int p2, p2

    goto :goto_2

    .line 15
    :cond_3
    invoke-static {p0}, Lac;->I(Landroid/view/View;)I

    move-result p2

    :goto_2
    int-to-float v2, p4

    .line 16
    iget v3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mNumChars:F

    cmpg-float v2, v2, v3

    if-gez v2, :cond_7

    .line 17
    iget-object v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineCoords:[Landroid/graphics/RectF;

    new-instance v3, Landroid/graphics/RectF;

    int-to-float p2, p2

    int-to-float v4, p1

    iget v5, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharSize:F

    add-float/2addr v5, p2

    invoke-direct {v3, p2, v4, v5, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    aput-object v3, v2, p4

    .line 18
    iget-object v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mPinBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_5

    .line 19
    iget-boolean v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mIsDigitSquare:Z

    if-eqz v2, :cond_4

    .line 20
    iget-object v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineCoords:[Landroid/graphics/RectF;

    aget-object v2, v2, p4

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    iput v3, v2, Landroid/graphics/RectF;->top:F

    .line 21
    iget-object v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineCoords:[Landroid/graphics/RectF;

    aget-object v3, v2, p4

    aget-object v2, v2, p4

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    add-float/2addr v2, p2

    iput v2, v3, Landroid/graphics/RectF;->right:F

    goto :goto_3

    .line 22
    :cond_4
    iget-object v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineCoords:[Landroid/graphics/RectF;

    aget-object v2, v2, p4

    iget v3, v2, Landroid/graphics/RectF;->top:F

    iget-object v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextHeight:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    iget v5, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextBottomPadding:F

    mul-float/2addr v5, v1

    add-float/2addr v4, v5

    sub-float/2addr v3, v4

    iput v3, v2, Landroid/graphics/RectF;->top:F

    .line 23
    :cond_5
    :goto_3
    iget v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mSpace:F

    cmpg-float v3, v2, p3

    if-gez v3, :cond_6

    int-to-float v2, v0

    .line 24
    iget v3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharSize:F

    mul-float/2addr v2, v3

    mul-float/2addr v2, v1

    add-float/2addr p2, v2

    goto :goto_4

    :cond_6
    int-to-float v3, v0

    .line 25
    iget v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharSize:F

    add-float/2addr v4, v2

    mul-float/2addr v3, v4

    add-float/2addr p2, v3

    :goto_4
    float-to-int p2, p2

    .line 26
    iget-object v2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharBottom:[F

    iget-object v3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineCoords:[Landroid/graphics/RectF;

    aget-object v3, v3, p4

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    iget v4, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mTextBottomPadding:F

    sub-float/2addr v3, v4

    aput v3, v2, p4

    add-int/lit8 p4, p4, 0x1

    goto :goto_2

    :cond_7
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/upi/axispay/custom/PinEntryEditText;->setError(Z)V

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineCoords:[Landroid/graphics/RectF;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimate:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimatedType:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 4
    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-void

    :cond_1
    if-le p4, p3, :cond_3

    if-nez v0, :cond_2

    .line 5
    invoke-direct {p0}, Lcom/upi/axispay/custom/PinEntryEditText;->animatePopIn()V

    goto :goto_0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/upi/axispay/custom/PinEntryEditText;->animateBottomUp(Ljava/lang/CharSequence;I)V

    :cond_3
    :goto_0
    return-void

    .line 7
    :cond_4
    :goto_1
    iget-object p2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mOnPinEnteredListener:Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    iget p3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaxLength:I

    if-ne p2, p3, :cond_5

    .line 8
    iget-object p2, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mOnPinEnteredListener:Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;

    invoke-interface {p2, p1}, Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;->onPinEntered(Ljava/lang/CharSequence;)V

    :cond_5
    return-void
.end method

.method public setAnimateText(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mAnimate:Z

    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/RuntimeException;

    const v0, 0x2f87

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setError(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mHasError:Z

    return-void
.end method

.method public setMaxLength(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mMaxLength:I

    int-to-float v0, p1

    .line 2
    iput v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mNumChars:F

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    .line 3
    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v1, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 5
    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setOnPinEnteredListener(Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mOnPinEnteredListener:Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;

    return-void
.end method

.method public updateColorForLines(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mHasError:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLinesPaint:Landroid/graphics/Paint;

    new-array v0, v2, [I

    const v2, 0x10100a2

    aput v2, v0, v1

    invoke-direct {p0, v0}, Lcom/upi/axispay/custom/PinEntryEditText;->getColorForState([I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLinesPaint:Landroid/graphics/Paint;

    iget v3, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStrokeSelected:F

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 5
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLinesPaint:Landroid/graphics/Paint;

    new-array v3, v2, [I

    const v4, 0x101009c

    aput v4, v3, v1

    invoke-direct {p0, v3}, Lcom/upi/axispay/custom/PinEntryEditText;->getColorForState([I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    if-eqz p1, :cond_2

    .line 6
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLinesPaint:Landroid/graphics/Paint;

    new-array v0, v2, [I

    const v2, 0x10100a1

    aput v2, v0, v1

    invoke-direct {p0, v0}, Lcom/upi/axispay/custom/PinEntryEditText;->getColorForState([I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLinesPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLineStroke:F

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 8
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mLinesPaint:Landroid/graphics/Paint;

    new-array v0, v2, [I

    const v2, -0x101009c

    aput v2, v0, v1

    invoke-direct {p0, v0}, Lcom/upi/axispay/custom/PinEntryEditText;->getColorForState([I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public updateDrawableState(ZZ)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mHasError:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mPinBackground:Landroid/graphics/drawable/Drawable;

    new-array p2, v2, [I

    const v0, 0x10100a2

    aput v0, p2, v1

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mPinBackground:Landroid/graphics/drawable/Drawable;

    new-array v2, v2, [I

    const v3, 0x101009c

    aput v3, v2, v1

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    const/4 v0, 0x2

    if-eqz p2, :cond_1

    .line 5
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mPinBackground:Landroid/graphics/drawable/Drawable;

    new-array p2, v0, [I

    fill-array-data p2, :array_0

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_3

    .line 6
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mPinBackground:Landroid/graphics/drawable/Drawable;

    new-array p2, v0, [I

    fill-array-data p2, :array_1

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_0

    .line 7
    :cond_2
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText;->mPinBackground:Landroid/graphics/drawable/Drawable;

    new-array p2, v2, [I

    const v0, -0x101009c

    aput v0, p2, v1

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3
    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x101009c
        0x10100a1
    .end array-data

    :array_1
    .array-data 4
        0x101009c
        0x10100a0
    .end array-data
.end method
