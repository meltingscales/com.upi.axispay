.class public Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
.super Lcom/nineoldandroids/animation/Keyframe;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/animation/Keyframe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "IntKeyframe"
.end annotation


# instance fields
.field public mValue:I


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/nineoldandroids/animation/Keyframe;-><init>()V

    .line 7
    iput p1, p0, Lcom/nineoldandroids/animation/Keyframe;->mFraction:F

    .line 8
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    iput-object p1, p0, Lcom/nineoldandroids/animation/Keyframe;->mValueType:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(FI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/nineoldandroids/animation/Keyframe;-><init>()V

    .line 2
    iput p1, p0, Lcom/nineoldandroids/animation/Keyframe;->mFraction:F

    .line 3
    iput p2, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mValue:I

    .line 4
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    iput-object p1, p0, Lcom/nineoldandroids/animation/Keyframe;->mValueType:Ljava/lang/Class;

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/nineoldandroids/animation/Keyframe;->mHasValue:Z

    return-void
.end method


# virtual methods
.method public clone()Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
    .locals 3

    .line 3
    new-instance v0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;

    invoke-virtual {p0}, Lcom/nineoldandroids/animation/Keyframe;->getFraction()F

    move-result v1

    iget v2, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mValue:I

    invoke-direct {v0, v1, v2}, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;-><init>(FI)V

    .line 4
    invoke-virtual {p0}, Lcom/nineoldandroids/animation/Keyframe;->getInterpolator()Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/Keyframe;->setInterpolator(Landroid/view/animation/Interpolator;)V

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/nineoldandroids/animation/Keyframe;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->clone()Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->clone()Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;

    move-result-object v0

    return-object v0
.end method

.method public getIntValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mValue:I

    return v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mValue:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Integer;

    if-ne v0, v1, :cond_0

    .line 2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mValue:I

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/nineoldandroids/animation/Keyframe;->mHasValue:Z

    :cond_0
    return-void
.end method
