.class public Lcom/upi/axispay/custom/FloatingInputLayout;
.super Landroid/widget/FrameLayout;
.source "AxisPay"


# static fields
.field public static final INPUT_TYPE_AMOUNT:I

.field public static final INPUT_TYPE_NAME:I

.field public static final INPUT_TYPE_NEMERIC:I

.field public static final INPUT_TYPE_PASSWORD:I

.field public static final INPUT_TYPE_REMARKS:I

.field public static final INPUT_TYPE_VPA_WITHOUT_HANDLER:I

.field public static final INPUT_TYPE_VPA_WITH_HANDLER:I


# instance fields
.field private errText:Landroid/widget/TextView;

.field private inputField:Landroid/widget/EditText;

.field private inputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private leftIcon:Landroid/widget/ImageView;

.field private rightIcon:Landroid/widget/ImageView;

.field private rightText:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    const v1, 0xe7

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->initView(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->initView(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public addFilter(Landroid/text/InputFilter;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getFilters()[Landroid/text/InputFilter;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2
    array-length v3, v0

    add-int/2addr v3, v1

    new-array v1, v3, [Landroid/text/InputFilter;

    .line 3
    array-length v3, v0

    invoke-static {v0, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 4
    array-length v0, v0

    aput-object p1, v1, v0

    goto :goto_0

    :cond_0
    new-array v1, v1, [Landroid/text/InputFilter;

    aput-object p1, v1, v2

    .line 5
    :goto_0
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public boldEditText(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;I)V

    return-void
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    return-object v0
.end method

.method public getErrorView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->errText:Landroid/widget/TextView;

    return-object v0
.end method

.method public getInputField()Landroid/widget/EditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    return-object v0
.end method

.method public getRightIcon()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightIcon:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getRightText()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightText:Landroid/widget/TextView;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public hideError()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->errText:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public hideRightText()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightText:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public initView(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f0d00ba

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/FrameLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    const v0, 0x7f0a0247

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const v0, 0x7f0a024b

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const v0, 0x7f0a03d1

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightText:Landroid/widget/TextView;

    const v0, 0x7f0a03cf

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightIcon:Landroid/widget/ImageView;

    const v0, 0x7f0a029b

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->leftIcon:Landroid/widget/ImageView;

    const v0, 0x7f0a01c9

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->errText:Landroid/widget/TextView;

    .line 9
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Lz80;->FloatingInputLayout:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x6

    .line 10
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 11
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightText:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const/4 p2, 0x2

    .line 12
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 13
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :cond_1
    const/4 p2, 0x3

    const/4 v0, -0x1

    .line 14
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eq p2, v0, :cond_2

    .line 15
    iget-object v3, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->leftIcon:Landroid/widget/ImageView;

    invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 16
    iget-object p2, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->leftIcon:Landroid/widget/ImageView;

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 17
    :cond_2
    iget-object p2, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->leftIcon:Landroid/widget/ImageView;

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    const/4 p2, 0x5

    .line 18
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eq p2, v0, :cond_3

    .line 19
    iget-object v3, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightIcon:Landroid/widget/ImageView;

    invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setId(I)V

    :cond_3
    const/4 p2, 0x7

    .line 20
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eq p2, v0, :cond_4

    .line 21
    iget-object v3, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightText:Landroid/widget/TextView;

    invoke-virtual {v3, p2}, Landroid/widget/TextView;->setId(I)V

    .line 22
    iget-object p2, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightText:Landroid/widget/TextView;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 23
    :cond_4
    iget-object p2, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightText:Landroid/widget/TextView;

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 24
    :goto_1
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eq p2, v0, :cond_5

    .line 25
    iget-object v3, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {v3, p2}, Landroid/widget/EditText;->setId(I)V

    goto :goto_2

    .line 26
    :cond_5
    iget-object p2, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v3

    invoke-virtual {p2, v3}, Landroid/widget/EditText;->setId(I)V

    :goto_2
    const/4 p2, 0x4

    .line 27
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eq p2, v0, :cond_6

    .line 28
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 29
    iget-object p2, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightIcon:Landroid/widget/ImageView;

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 30
    invoke-virtual {p0}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideRightText()V

    goto :goto_3

    .line 31
    :cond_6
    iget-object p2, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightIcon:Landroid/widget/ImageView;

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 32
    :goto_3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public setActive(Z)V
    .locals 1

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setClickable(Z)V

    :cond_0
    return-void
.end method

.method public setEditTextImeOptions(Ljava/lang/String;)V
    .locals 2

    const v0, 0x34e3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    :cond_0
    const v0, 0x34e4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    :cond_1
    const v0, 0x34e5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    :cond_2
    const v0, 0x34e6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setImeOptions(I)V

    :cond_3
    const v0, 0x34e7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 10
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setImeOptions(I)V

    :cond_4
    return-void
.end method

.method public setEditableText(Z)V
    .locals 1

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public setInputTextHint(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setInputType(I)V
    .locals 3

    const v0, 0x34e8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1
    :pswitch_0
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setInputType(I)V

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const v2, 0x34e9

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/method/DigitsKeyListener;->getInstance(Ljava/lang/String;)Landroid/text/method/DigitsKeyListener;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/EditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 3
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setRawInputType(I)V

    .line 4
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_0

    .line 5
    :pswitch_1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 6
    invoke-static {p1}, Lfg0;->b(I)Landroid/text/InputFilter;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->addFilter(Landroid/text/InputFilter;)V

    goto :goto_0

    .line 7
    :pswitch_2
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/16 v1, 0x12

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 8
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-static {v0}, Landroid/text/method/DigitsKeyListener;->getInstance(Ljava/lang/String;)Landroid/text/method/DigitsKeyListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 9
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setRawInputType(I)V

    goto :goto_0

    .line 10
    :pswitch_3
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 11
    invoke-static {p1}, Lfg0;->b(I)Landroid/text/InputFilter;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->addFilter(Landroid/text/InputFilter;)V

    goto :goto_0

    .line 12
    :pswitch_4
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 13
    invoke-static {p1}, Lfg0;->b(I)Landroid/text/InputFilter;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->addFilter(Landroid/text/InputFilter;)V

    goto :goto_0

    .line 14
    :pswitch_5
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 15
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-static {v0}, Landroid/text/method/DigitsKeyListener;->getInstance(Ljava/lang/String;)Landroid/text/method/DigitsKeyListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 16
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setRawInputType(I)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public setInputTypeData()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Lcom/upi/axispay/custom/FloatingInputLayout$1;

    invoke-direct {v2, p0}, Lcom/upi/axispay/custom/FloatingInputLayout$1;-><init>(Lcom/upi/axispay/custom/FloatingInputLayout;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setLeftIcon(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->leftIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->leftIcon:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public setLeftImageSize(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->leftIcon:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->leftIcon:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 3
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->leftIcon:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->requestLayout()V

    return-void
.end method

.method public setMaxLength(I)V
    .locals 1

    .line 1
    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v0, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/upi/axispay/custom/FloatingInputLayout;->addFilter(Landroid/text/InputFilter;)V

    return-void
.end method

.method public setMultiLine()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setMaxLines(I)V

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSingleLine(Z)V

    return-void
.end method

.method public setRightText(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setRightText(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setSingleLine()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setMaxLines(I)V

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSingleLine(Z)V

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->inputField:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public showError(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->errText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 2
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->errText:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public showError(Ljava/lang/String;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->errText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->errText:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060162

    invoke-static {v0, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 5
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->errText:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public showError(Ljava/lang/String;I)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->errText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->errText:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Lt8;->d(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    iget-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->errText:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public showRightText()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/FloatingInputLayout;->rightText:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method
