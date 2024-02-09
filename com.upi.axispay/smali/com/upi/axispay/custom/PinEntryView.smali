.class public Lcom/upi/axispay/custom/PinEntryView;
.super Landroid/view/ViewGroup;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/upi/axispay/custom/PinEntryView$DigitView;,
        Lcom/upi/axispay/custom/PinEntryView$SavedState;
    }
.end annotation


# static fields
.field public static final ACCENT_ALL:I

.field public static final ACCENT_CHARACTER:I

.field public static final ACCENT_NONE:I


# instance fields
.field private accentColor:I

.field private accentType:I

.field private accentWidth:I

.field public counter:I

.field private digitBackground:I

.field private digitElevation:I

.field private digitHeight:I

.field private digitSpacing:I

.field private digitTextColor:I

.field private digitTextSize:I

.field private digitWidth:I

.field private digits:I

.field private editText:Landroid/widget/EditText;

.field private inputType:I

.field private mask:Ljava/lang/String;

.field private onFocusChangeListener:Landroid/view/View$OnFocusChangeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/upi/axispay/custom/PinEntryView;

    const v1, 0x11d

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/upi/axispay/custom/PinEntryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/upi/axispay/custom/PinEntryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lcom/upi/axispay/custom/PinEntryView;->counter:I

    const p3, 0x41c

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    .line 5
    iput-object p3, p0, Lcom/upi/axispay/custom/PinEntryView;->mask:Ljava/lang/String;

    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    sget-object v0, Lz80;->PinEntryView:[I

    invoke-virtual {p3, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/16 p3, 0xb

    const/4 v0, 0x4

    .line 7
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/upi/axispay/custom/PinEntryView;->digits:I

    const/16 p3, 0xd

    const/4 v1, 0x2

    .line 8
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/upi/axispay/custom/PinEntryView;->inputType:I

    const/4 p3, 0x1

    .line 9
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/upi/axispay/custom/PinEntryView;->accentType:I

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    const/high16 v3, 0x42480000    # 50.0f

    .line 11
    invoke-static {p3, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v4

    float-to-int v4, v4

    const/16 v5, 0x9

    .line 12
    invoke-virtual {p2, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/upi/axispay/custom/PinEntryView;->digitWidth:I

    .line 13
    invoke-static {p3, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    const/4 v4, 0x5

    .line 14
    invoke-virtual {p2, v4, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, p0, Lcom/upi/axispay/custom/PinEntryView;->digitHeight:I

    const/high16 v3, 0x41a00000    # 20.0f

    .line 15
    invoke-static {p3, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    const/4 v4, 0x6

    .line 16
    invoke-virtual {p2, v4, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, p0, Lcom/upi/axispay/custom/PinEntryView;->digitSpacing:I

    const/high16 v3, 0x41700000    # 15.0f

    .line 17
    invoke-static {p1, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    const/16 v4, 0x8

    .line 18
    invoke-virtual {p2, v4, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, p0, Lcom/upi/axispay/custom/PinEntryView;->digitTextSize:I

    const/high16 v3, 0x40400000    # 3.0f

    .line 19
    invoke-static {p3, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    .line 20
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/upi/axispay/custom/PinEntryView;->accentWidth:I

    .line 21
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    .line 22
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/upi/axispay/custom/PinEntryView;->digitElevation:I

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    .line 24
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    const v1, 0x1010054

    .line 25
    invoke-virtual {p1, v1, v0, p3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    const/4 v1, 0x3

    .line 26
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/upi/axispay/custom/PinEntryView;->digitBackground:I

    .line 27
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    const v1, 0x1010036

    .line 28
    invoke-virtual {p1, v1, v0, p3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    const/4 v1, 0x7

    .line 29
    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    if-lez v2, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-static {v2, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    goto :goto_0

    .line 30
    :cond_1
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 31
    :goto_0
    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/upi/axispay/custom/PinEntryView;->digitTextColor:I

    .line 32
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    const v1, 0x7f0400d8

    .line 33
    invoke-virtual {p1, v1, v0, p3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    const/16 p1, 0xc

    .line 34
    iget p3, v0, Landroid/util/TypedValue;->resourceId:I

    if-lez p3, :cond_2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-static {p3, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result p3

    goto :goto_1

    .line 35
    :cond_2
    iget p3, v0, Landroid/util/TypedValue;->data:I

    .line 36
    :goto_1
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/upi/axispay/custom/PinEntryView;->accentColor:I

    const/16 p1, 0xa

    .line 37
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 38
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryView;->mask:Ljava/lang/String;

    .line 39
    :cond_3
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 40
    invoke-direct {p0}, Lcom/upi/axispay/custom/PinEntryView;->addViews()V

    return-void
.end method

.method public static synthetic access$000(Lcom/upi/axispay/custom/PinEntryView;)Landroid/widget/EditText;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    return-object p0
.end method

.method public static synthetic access$100(Lcom/upi/axispay/custom/PinEntryView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/upi/axispay/custom/PinEntryView;->digits:I

    return p0
.end method

.method public static synthetic access$200(Lcom/upi/axispay/custom/PinEntryView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/upi/axispay/custom/PinEntryView;->accentType:I

    return p0
.end method

.method public static synthetic access$300(Lcom/upi/axispay/custom/PinEntryView;)Landroid/view/View$OnFocusChangeListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/upi/axispay/custom/PinEntryView;->onFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    return-object p0
.end method

.method public static synthetic access$400(Lcom/upi/axispay/custom/PinEntryView;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/upi/axispay/custom/PinEntryView;->mask:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$600(Lcom/upi/axispay/custom/PinEntryView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/upi/axispay/custom/PinEntryView;->accentColor:I

    return p0
.end method

.method public static synthetic access$700(Lcom/upi/axispay/custom/PinEntryView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/upi/axispay/custom/PinEntryView;->accentWidth:I

    return p0
.end method

.method private addViews()V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    .line 1
    :goto_0
    iget v2, p0, Lcom/upi/axispay/custom/PinEntryView;->digits:I

    const v3, 0x7f1201cd

    const/4 v4, 0x1

    if-ge v1, v2, :cond_1

    .line 2
    new-instance v2, Lcom/upi/axispay/custom/PinEntryView$DigitView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v2, p0, v5}, Lcom/upi/axispay/custom/PinEntryView$DigitView;-><init>(Lcom/upi/axispay/custom/PinEntryView;Landroid/content/Context;)V

    .line 3
    iget v5, p0, Lcom/upi/axispay/custom/PinEntryView;->digitWidth:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setWidth(I)V

    .line 4
    iget v5, p0, Lcom/upi/axispay/custom/PinEntryView;->digitHeight:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setHeight(I)V

    .line 5
    iget v5, p0, Lcom/upi/axispay/custom/PinEntryView;->digitBackground:I

    invoke-virtual {v2, v5}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 6
    iget v5, p0, Lcom/upi/axispay/custom/PinEntryView;->digitTextColor:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 7
    iget v5, p0, Lcom/upi/axispay/custom/PinEntryView;->digitTextSize:I

    int-to-float v5, v5

    invoke-virtual {v2, v0, v5}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v5

    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 10
    invoke-static {v5, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    .line 11
    invoke-virtual {v2, v3, v4}, Landroidx/appcompat/widget/AppCompatTextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const/16 v3, 0x11

    .line 12
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 13
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_0

    .line 14
    iget v3, p0, Lcom/upi/axispay/custom/PinEntryView;->digitElevation:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setElevation(F)V

    .line 15
    :cond_0
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 16
    :cond_1
    new-instance v1, Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    .line 17
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    .line 18
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 19
    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    .line 20
    iget-object v2, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    invoke-virtual {v2, v1, v4}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 21
    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    iget v2, p0, Lcom/upi/axispay/custom/PinEntryView;->digitTextSize:I

    int-to-float v2, v2

    invoke-virtual {v1, v0, v2}, Landroid/widget/EditText;->setTextSize(IF)V

    .line 22
    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x106000d

    invoke-static {v2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setBackgroundColor(I)V

    .line 23
    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v3}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setTextColor(I)V

    .line 24
    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setCursorVisible(Z)V

    .line 25
    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    new-array v2, v4, [Landroid/text/InputFilter;

    new-instance v3, Landroid/text/InputFilter$LengthFilter;

    iget v4, p0, Lcom/upi/axispay/custom/PinEntryView;->digits:I

    invoke-direct {v3, v4}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v3, v2, v0

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 26
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    iget v1, p0, Lcom/upi/axispay/custom/PinEntryView;->inputType:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 27
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 28
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    new-instance v1, Lcom/upi/axispay/custom/PinEntryView$1;

    invoke-direct {v1, p0}, Lcom/upi/axispay/custom/PinEntryView$1;-><init>(Lcom/upi/axispay/custom/PinEntryView;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 29
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    new-instance v1, Lcom/upi/axispay/custom/PinEntryView$2;

    invoke-direct {v1, p0}, Lcom/upi/axispay/custom/PinEntryView$2;-><init>(Lcom/upi/axispay/custom/PinEntryView;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 30
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public addTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public clearText()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    const v1, 0x41d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    return-object v0
.end method

.method public getOnFocusChangeListener()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->onFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    return-object v0
.end method

.method public getText()Landroid/text/Editable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public onLayout(ZIIII)V
    .locals 3

    const/4 p1, 0x0

    move p2, p1

    .line 1
    :goto_0
    iget p3, p0, Lcom/upi/axispay/custom/PinEntryView;->digits:I

    if-ge p2, p3, :cond_1

    .line 2
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    .line 3
    iget p4, p0, Lcom/upi/axispay/custom/PinEntryView;->digitWidth:I

    mul-int/2addr p4, p2

    if-lez p2, :cond_0

    iget p5, p0, Lcom/upi/axispay/custom/PinEntryView;->digitSpacing:I

    mul-int/2addr p5, p2

    goto :goto_1

    :cond_0
    move p5, p1

    :goto_1
    add-int/2addr p4, p5

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p5

    add-int/2addr p5, p4

    iget v0, p0, Lcom/upi/axispay/custom/PinEntryView;->digitElevation:I

    add-int/2addr p5, v0

    .line 5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v0

    iget v1, p0, Lcom/upi/axispay/custom/PinEntryView;->digitElevation:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v1

    add-int/2addr p4, v1

    iget v1, p0, Lcom/upi/axispay/custom/PinEntryView;->digitElevation:I

    add-int/2addr p4, v1

    iget v1, p0, Lcom/upi/axispay/custom/PinEntryView;->digitWidth:I

    add-int/2addr p4, v1

    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    iget v2, p0, Lcom/upi/axispay/custom/PinEntryView;->digitElevation:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    iget v2, p0, Lcom/upi/axispay/custom/PinEntryView;->digitHeight:I

    add-int/2addr v1, v2

    .line 8
    invoke-virtual {p3, p5, v0, p4, v1}, Landroid/view/View;->layout(IIII)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p3

    const/4 p4, 0x1

    invoke-virtual {p2, p1, p1, p4, p3}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    .line 1
    iget p1, p0, Lcom/upi/axispay/custom/PinEntryView;->digitWidth:I

    iget p2, p0, Lcom/upi/axispay/custom/PinEntryView;->digits:I

    mul-int/2addr p1, p2

    iget v0, p0, Lcom/upi/axispay/custom/PinEntryView;->digitSpacing:I

    add-int/lit8 p2, p2, -0x1

    mul-int/2addr v0, p2

    add-int/2addr p1, v0

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p2

    add-int/2addr p2, p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v0

    add-int/2addr p2, v0

    iget v0, p0, Lcom/upi/axispay/custom/PinEntryView;->digitElevation:I

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr p2, v0

    iget v0, p0, Lcom/upi/axispay/custom/PinEntryView;->digitHeight:I

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/upi/axispay/custom/PinEntryView;->digitElevation:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 4
    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    .line 5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 7
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Landroid/view/View;->measure(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/upi/axispay/custom/PinEntryView$SavedState;

    .line 2
    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 3
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    iget-object v1, p1, Lcom/upi/axispay/custom/PinEntryView$SavedState;->editTextValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    iget-object p1, p1, Lcom/upi/axispay/custom/PinEntryView$SavedState;->editTextValue:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/upi/axispay/custom/PinEntryView$SavedState;

    invoke-direct {v1, v0}, Lcom/upi/axispay/custom/PinEntryView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 3
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/upi/axispay/custom/PinEntryView$SavedState;->editTextValue:Ljava/lang/String;

    return-object v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x41e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    if-eqz p1, :cond_0

    .line 5
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :cond_0
    const/4 p1, 0x1

    return p1

    .line 6
    :cond_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public removeTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryView;->onFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget v1, p0, Lcom/upi/axispay/custom/PinEntryView;->digits:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView;->editText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
