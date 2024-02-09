.class public Lcom/upi/axispay/custom/VpaFieldLayout;
.super Landroid/widget/FrameLayout;
.source "AxisPay"


# instance fields
.field public errorView:Landroid/widget/TextView;

.field public indicator:Landroid/widget/ImageView;

.field public linearLayout:Landroid/widget/LinearLayout;

.field public pinField:Lcom/upi/axispay/custom/CustomAutoComplete;


# direct methods
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
    invoke-virtual {p0, p1, p2}, Lcom/upi/axispay/custom/VpaFieldLayout;->initView(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/upi/axispay/custom/VpaFieldLayout;->initView(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public getPinText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->pinField:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTextField()Landroid/widget/EditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->pinField:Lcom/upi/axispay/custom/CustomAutoComplete;

    return-object v0
.end method

.method public initView(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f0d014c

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/widget/FrameLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    const p2, 0x7f0a02a5

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->linearLayout:Landroid/widget/LinearLayout;

    const p2, 0x7f0a01b5

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/upi/axispay/custom/CustomAutoComplete;

    iput-object p2, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->pinField:Lcom/upi/axispay/custom/CustomAutoComplete;

    const p2, 0x7f0a0243

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->indicator:Landroid/widget/ImageView;

    const p2, 0x7f0a01ca

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->errorView:Landroid/widget/TextView;

    return-void
.end method

.method public setEditTextImeOptions(Ljava/lang/String;)V
    .locals 2

    const v0, 0x1255

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->pinField:Lcom/upi/axispay/custom/CustomAutoComplete;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    :cond_0
    const v0, 0x1256

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->pinField:Lcom/upi/axispay/custom/CustomAutoComplete;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    :cond_1
    const v0, 0x1257

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->pinField:Lcom/upi/axispay/custom/CustomAutoComplete;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    :cond_2
    const v0, 0x1258

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->pinField:Lcom/upi/axispay/custom/CustomAutoComplete;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    :cond_3
    const v0, 0x1259

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 10
    iget-object p1, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->pinField:Lcom/upi/axispay/custom/CustomAutoComplete;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    :cond_4
    return-void
.end method

.method public setPinText(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->pinField:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setPinTextHint(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->pinField:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public seterrorText()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->errorView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f120329

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/custom/VpaFieldLayout;->errorView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f060024

    invoke-static {v1, v2}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method
