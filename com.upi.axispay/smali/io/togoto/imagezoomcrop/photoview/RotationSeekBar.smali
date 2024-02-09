.class public Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;
.super Landroid/widget/SeekBar;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;
    }
.end annotation


# static fields
.field private static final DEFAULT_MAX:I

.field private static final DEFAULT_PROGRESS:I


# instance fields
.field private mRotationListener:Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;

    const v1, 0xc2

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-direct {p0}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 8
    invoke-direct {p0}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->init()V

    return-void
.end method

.method public static synthetic access$000(I)F
    .locals 0

    .line 1
    invoke-static {p0}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->fromProgressToDegrees(I)F

    move-result p0

    return p0
.end method

.method private static fromDegreesToProgress(F)I
    .locals 1

    const/high16 v0, 0x43340000    # 180.0f

    add-float/2addr p0, v0

    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr p0, v0

    float-to-int p0, p0

    return p0
.end method

.method private static fromProgressToDegrees(I)F
    .locals 1

    add-int/lit16 p0, p0, -0x708

    int-to-float p0, p0

    const/high16 v0, 0x41200000    # 10.0f

    div-float/2addr p0, v0

    return p0
.end method

.method private init()V
    .locals 1

    const/16 v0, 0xe10

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/SeekBar;->setMax(I)V

    const/16 v0, 0x708

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    return-void
.end method


# virtual methods
.method public getRotationProgress()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    invoke-static {v0}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->fromProgressToDegrees(I)F

    move-result v0

    return v0
.end method

.method public reset()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->init()V

    .line 2
    iget-object v0, p0, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->mRotationListener:Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;

    invoke-virtual {v0}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;->resetPreviousProgress()V

    return-void
.end method

.method public setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    instance-of v0, p1, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x6f0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    :goto_0
    move-object v0, p1

    check-cast v0, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;

    iput-object v0, p0, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->mRotationListener:Lio/togoto/imagezoomcrop/photoview/RotationSeekBar$OnRotationSeekBarChangeListener;

    .line 4
    invoke-super {p0, p1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    return-void
.end method

.method public setRotationProgress(F)V
    .locals 1

    const/high16 v0, -0x3ccc0000    # -180.0f

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_1

    const/high16 v0, 0x43340000    # 180.0f

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    .line 1
    invoke-virtual {p0}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->reset()V

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p1}, Lio/togoto/imagezoomcrop/photoview/RotationSeekBar;->fromDegreesToProgress(F)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/SeekBar;->setProgress(I)V

    :goto_0
    return-void

    .line 3
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0x6f1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
